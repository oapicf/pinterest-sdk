#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "TermsOfServiceManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


TermsOfServiceManager::TermsOfServiceManager()
{

}

TermsOfServiceManager::~TermsOfServiceManager()
{

}

static gboolean __TermsOfServiceManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __TermsOfServiceManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__TermsOfServiceManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool termsOfServiceGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(TermsOfService, Error, void* )
	= reinterpret_cast<void(*)(TermsOfService, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	TermsOfService out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("TermsOfService")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "TermsOfService", "TermsOfService");
			json_node_free(pJson);

			if ("TermsOfService" == "std::string") {
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

static bool termsOfServiceGetHelper(char * accessToken,
	std::string adAccountId, bool includeHtml, std::string tosType, 
	void(* handler)(TermsOfService, Error, void* )
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
	

	itemAtq = stringify(&includeHtml, "bool");
	queryParams.insert(pair<string, string>("include_html", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_html");
	}


	itemAtq = stringify(&tosType, "std::string");
	queryParams.insert(pair<string, string>("tos_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("tos_type");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/terms_of_service");
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
		NetClient::easycurl(TermsOfServiceManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = termsOfServiceGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TermsOfServiceManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), termsOfServiceGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TermsOfServiceManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TermsOfServiceManager::termsOfServiceGetAsync(char * accessToken,
	std::string adAccountId, bool includeHtml, std::string tosType, 
	void(* handler)(TermsOfService, Error, void* )
	, void* userData)
{
	return termsOfServiceGetHelper(accessToken,
	adAccountId, includeHtml, tosType, 
	handler, userData, true);
}

bool TermsOfServiceManager::termsOfServiceGetSync(char * accessToken,
	std::string adAccountId, bool includeHtml, std::string tosType, 
	void(* handler)(TermsOfService, Error, void* )
	, void* userData)
{
	return termsOfServiceGetHelper(accessToken,
	adAccountId, includeHtml, tosType, 
	handler, userData, false);
}

