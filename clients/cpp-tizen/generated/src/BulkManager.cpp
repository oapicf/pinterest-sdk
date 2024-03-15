#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "BulkManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


BulkManager::BulkManager()
{

}

BulkManager::~BulkManager()
{

}

static gboolean __BulkManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __BulkManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__BulkManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool bulkDownloadCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BulkDownloadResponse, Error, void* )
	= reinterpret_cast<void(*)(BulkDownloadResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BulkDownloadResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BulkDownloadResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BulkDownloadResponse", "BulkDownloadResponse");
			json_node_free(pJson);

			if ("BulkDownloadResponse" == "std::string") {
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

static bool bulkDownloadCreateHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<BulkDownloadRequest> bulkDownloadRequest, 
	void(* handler)(BulkDownloadResponse, Error, void* )
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
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("BulkDownloadRequest")) {
		node = converttoJson(&bulkDownloadRequest, "BulkDownloadRequest", "");
	}
	
	char *jsonStr =  bulkDownloadRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/bulk/download");
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
		NetClient::easycurl(BulkManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = bulkDownloadCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BulkManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), bulkDownloadCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BulkManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BulkManager::bulkDownloadCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BulkDownloadRequest> bulkDownloadRequest, 
	void(* handler)(BulkDownloadResponse, Error, void* )
	, void* userData)
{
	return bulkDownloadCreateHelper(accessToken,
	adAccountId, bulkDownloadRequest, 
	handler, userData, true);
}

bool BulkManager::bulkDownloadCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BulkDownloadRequest> bulkDownloadRequest, 
	void(* handler)(BulkDownloadResponse, Error, void* )
	, void* userData)
{
	return bulkDownloadCreateHelper(accessToken,
	adAccountId, bulkDownloadRequest, 
	handler, userData, false);
}

static bool bulkRequestGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BulkUpsertStatusResponse, Error, void* )
	= reinterpret_cast<void(*)(BulkUpsertStatusResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BulkUpsertStatusResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BulkUpsertStatusResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BulkUpsertStatusResponse", "BulkUpsertStatusResponse");
			json_node_free(pJson);

			if ("BulkUpsertStatusResponse" == "std::string") {
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

static bool bulkRequestGetHelper(char * accessToken,
	std::string adAccountId, std::string bulkRequestId, bool includeDetails, 
	void(* handler)(BulkUpsertStatusResponse, Error, void* )
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
	

	itemAtq = stringify(&includeDetails, "bool");
	queryParams.insert(pair<string, string>("include_details", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_details");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}");
	int pos;

	string s_adAccountId("{");
	s_adAccountId.append("ad_account_id");
	s_adAccountId.append("}");
	pos = url.find(s_adAccountId);
	url.erase(pos, s_adAccountId.length());
	url.insert(pos, stringify(&adAccountId, "std::string"));
	string s_bulkRequestId("{");
	s_bulkRequestId.append("bulk_request_id");
	s_bulkRequestId.append("}");
	pos = url.find(s_bulkRequestId);
	url.erase(pos, s_bulkRequestId.length());
	url.insert(pos, stringify(&bulkRequestId, "std::string"));

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
		NetClient::easycurl(BulkManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = bulkRequestGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BulkManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), bulkRequestGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BulkManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BulkManager::bulkRequestGetAsync(char * accessToken,
	std::string adAccountId, std::string bulkRequestId, bool includeDetails, 
	void(* handler)(BulkUpsertStatusResponse, Error, void* )
	, void* userData)
{
	return bulkRequestGetHelper(accessToken,
	adAccountId, bulkRequestId, includeDetails, 
	handler, userData, true);
}

bool BulkManager::bulkRequestGetSync(char * accessToken,
	std::string adAccountId, std::string bulkRequestId, bool includeDetails, 
	void(* handler)(BulkUpsertStatusResponse, Error, void* )
	, void* userData)
{
	return bulkRequestGetHelper(accessToken,
	adAccountId, bulkRequestId, includeDetails, 
	handler, userData, false);
}

static bool bulkUpsertCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BulkUpsertResponse, Error, void* )
	= reinterpret_cast<void(*)(BulkUpsertResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BulkUpsertResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BulkUpsertResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BulkUpsertResponse", "BulkUpsertResponse");
			json_node_free(pJson);

			if ("BulkUpsertResponse" == "std::string") {
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

static bool bulkUpsertCreateHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<BulkUpsertRequest> bulkUpsertRequest, 
	void(* handler)(BulkUpsertResponse, Error, void* )
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
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("BulkUpsertRequest")) {
		node = converttoJson(&bulkUpsertRequest, "BulkUpsertRequest", "");
	}
	
	char *jsonStr =  bulkUpsertRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/bulk/upsert");
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
		NetClient::easycurl(BulkManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = bulkUpsertCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BulkManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), bulkUpsertCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BulkManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BulkManager::bulkUpsertCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BulkUpsertRequest> bulkUpsertRequest, 
	void(* handler)(BulkUpsertResponse, Error, void* )
	, void* userData)
{
	return bulkUpsertCreateHelper(accessToken,
	adAccountId, bulkUpsertRequest, 
	handler, userData, true);
}

bool BulkManager::bulkUpsertCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BulkUpsertRequest> bulkUpsertRequest, 
	void(* handler)(BulkUpsertResponse, Error, void* )
	, void* userData)
{
	return bulkUpsertCreateHelper(accessToken,
	adAccountId, bulkUpsertRequest, 
	handler, userData, false);
}

