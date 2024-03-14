#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ConversionEventsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ConversionEventsManager::ConversionEventsManager()
{

}

ConversionEventsManager::~ConversionEventsManager()
{

}

static gboolean __ConversionEventsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ConversionEventsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ConversionEventsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool eventsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ConversionApiResponse, Error, void* )
	= reinterpret_cast<void(*)(ConversionApiResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ConversionApiResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ConversionApiResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ConversionApiResponse", "ConversionApiResponse");
			json_node_free(pJson);

			if ("ConversionApiResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

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

static bool eventsCreateHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionEvents> conversionEvents, bool test, 
	void(* handler)(ConversionApiResponse, Error, void* )
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
	

	itemAtq = stringify(&test, "bool");
	queryParams.insert(pair<string, string>("test", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("test");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("ConversionEvents")) {
		node = converttoJson(&conversionEvents, "ConversionEvents", "");
	}
	
	char *jsonStr =  conversionEvents.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/events");
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
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ConversionEventsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = eventsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ConversionEventsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), eventsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ConversionEventsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ConversionEventsManager::eventsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionEvents> conversionEvents, bool test, 
	void(* handler)(ConversionApiResponse, Error, void* )
	, void* userData)
{
	return eventsCreateHelper(accessToken,
	adAccountId, conversionEvents, test, 
	handler, userData, true);
}

bool ConversionEventsManager::eventsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionEvents> conversionEvents, bool test, 
	void(* handler)(ConversionApiResponse, Error, void* )
	, void* userData)
{
	return eventsCreateHelper(accessToken,
	adAccountId, conversionEvents, test, 
	handler, userData, false);
}

