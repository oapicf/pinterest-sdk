#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ConversionEqsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ConversionEqsManager::ConversionEqsManager()
{

}

ConversionEqsManager::~ConversionEqsManager()
{

}

static gboolean __ConversionEqsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ConversionEqsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ConversionEqsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool conversionEqsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<EventQualityScore>, Error, void* )
	= reinterpret_cast<void(*)(std::list<EventQualityScore>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<EventQualityScore> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			EventQualityScore singlemodel;
			singlemodel.fromJson(singlenodestr);
			out.push_front(singlemodel);
			g_free(static_cast<gpointer>(singlenodestr));
			json_node_free(myJson);
		}
		json_array_unref (jsonarray);
		json_node_free(pJson);


	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool conversionEqsListHelper(char * accessToken,
	LookbackPeriodOptions lookbackPeriod, std::string adAccountId, SourcePlatformOptions sourcePlatform, IngestionSourceOptions ingestionSource, 
	void(* handler)(std::list<EventQualityScore>, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&lookbackPeriod, "LookbackPeriodOptions");
	queryParams.insert(pair<string, string>("lookback_period", itemAtq));


	itemAtq = stringify(&sourcePlatform, "SourcePlatformOptions");
	queryParams.insert(pair<string, string>("source_platform", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("source_platform");
	}


	itemAtq = stringify(&ingestionSource, "IngestionSourceOptions");
	queryParams.insert(pair<string, string>("ingestion_source", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ingestion_source");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/conversion_eqs");
	int pos;

	string s_adAccountId("{");
	s_adAccountId.append("ad_account_id");
	s_adAccountId.append("}");
	pos = url.find(s_adAccountId);
	url.erase(pos, s_adAccountId.length());
	url.insert(pos, stringify(&adAccountId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ConversionEqsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = conversionEqsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (ConversionEqsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), conversionEqsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ConversionEqsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ConversionEqsManager::conversionEqsListAsync(char * accessToken,
	LookbackPeriodOptions lookbackPeriod, std::string adAccountId, SourcePlatformOptions sourcePlatform, IngestionSourceOptions ingestionSource, 
	void(* handler)(std::list<EventQualityScore>, Error, void* )
	, void* userData)
{
	return conversionEqsListHelper(accessToken,
	lookbackPeriod, adAccountId, sourcePlatform, ingestionSource, 
	handler, userData, true);
}

bool ConversionEqsManager::conversionEqsListSync(char * accessToken,
	LookbackPeriodOptions lookbackPeriod, std::string adAccountId, SourcePlatformOptions sourcePlatform, IngestionSourceOptions ingestionSource, 
	void(* handler)(std::list<EventQualityScore>, Error, void* )
	, void* userData)
{
	return conversionEqsListHelper(accessToken,
	lookbackPeriod, adAccountId, sourcePlatform, ingestionSource, 
	handler, userData, false);
}

