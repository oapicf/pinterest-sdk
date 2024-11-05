#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "AdvancedAuctionManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


AdvancedAuctionManager::AdvancedAuctionManager()
{

}

AdvancedAuctionManager::~AdvancedAuctionManager()
{

}

static gboolean __AdvancedAuctionManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __AdvancedAuctionManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__AdvancedAuctionManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool advancedAuctionItemsGetPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdvancedAuctionItems, Error, void* )
	= reinterpret_cast<void(*)(AdvancedAuctionItems, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdvancedAuctionItems out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdvancedAuctionItems")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdvancedAuctionItems", "AdvancedAuctionItems");
			json_node_free(pJson);

			if ("AdvancedAuctionItems" == "std::string") {
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

static bool advancedAuctionItemsGetPostHelper(char * accessToken,
	std::shared_ptr<AdvancedAuctionItemsGetRequest> advancedAuctionItemsGetRequest, std::string adAccountId, 
	void(* handler)(AdvancedAuctionItems, Error, void* )
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("AdvancedAuctionItemsGetRequest")) {
		node = converttoJson(&advancedAuctionItemsGetRequest, "AdvancedAuctionItemsGetRequest", "");
	}
	
	char *jsonStr =  advancedAuctionItemsGetRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/advanced_auction/items/get");
	int pos;


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
		NetClient::easycurl(AdvancedAuctionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = advancedAuctionItemsGetPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdvancedAuctionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), advancedAuctionItemsGetPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdvancedAuctionManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdvancedAuctionManager::advancedAuctionItemsGetPostAsync(char * accessToken,
	std::shared_ptr<AdvancedAuctionItemsGetRequest> advancedAuctionItemsGetRequest, std::string adAccountId, 
	void(* handler)(AdvancedAuctionItems, Error, void* )
	, void* userData)
{
	return advancedAuctionItemsGetPostHelper(accessToken,
	advancedAuctionItemsGetRequest, adAccountId, 
	handler, userData, true);
}

bool AdvancedAuctionManager::advancedAuctionItemsGetPostSync(char * accessToken,
	std::shared_ptr<AdvancedAuctionItemsGetRequest> advancedAuctionItemsGetRequest, std::string adAccountId, 
	void(* handler)(AdvancedAuctionItems, Error, void* )
	, void* userData)
{
	return advancedAuctionItemsGetPostHelper(accessToken,
	advancedAuctionItemsGetRequest, adAccountId, 
	handler, userData, false);
}

static bool advancedAuctionItemsSubmitPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdvancedAuctionProcessedItems, Error, void* )
	= reinterpret_cast<void(*)(AdvancedAuctionProcessedItems, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdvancedAuctionProcessedItems out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdvancedAuctionProcessedItems")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdvancedAuctionProcessedItems", "AdvancedAuctionProcessedItems");
			json_node_free(pJson);

			if ("AdvancedAuctionProcessedItems" == "std::string") {
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

static bool advancedAuctionItemsSubmitPostHelper(char * accessToken,
	std::shared_ptr<AdvancedAuctionItemsSubmitRequest> advancedAuctionItemsSubmitRequest, std::string adAccountId, 
	void(* handler)(AdvancedAuctionProcessedItems, Error, void* )
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("AdvancedAuctionItemsSubmitRequest")) {
		node = converttoJson(&advancedAuctionItemsSubmitRequest, "AdvancedAuctionItemsSubmitRequest", "");
	}
	
	char *jsonStr =  advancedAuctionItemsSubmitRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/advanced_auction/items/submit");
	int pos;


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
		NetClient::easycurl(AdvancedAuctionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = advancedAuctionItemsSubmitPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdvancedAuctionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), advancedAuctionItemsSubmitPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdvancedAuctionManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdvancedAuctionManager::advancedAuctionItemsSubmitPostAsync(char * accessToken,
	std::shared_ptr<AdvancedAuctionItemsSubmitRequest> advancedAuctionItemsSubmitRequest, std::string adAccountId, 
	void(* handler)(AdvancedAuctionProcessedItems, Error, void* )
	, void* userData)
{
	return advancedAuctionItemsSubmitPostHelper(accessToken,
	advancedAuctionItemsSubmitRequest, adAccountId, 
	handler, userData, true);
}

bool AdvancedAuctionManager::advancedAuctionItemsSubmitPostSync(char * accessToken,
	std::shared_ptr<AdvancedAuctionItemsSubmitRequest> advancedAuctionItemsSubmitRequest, std::string adAccountId, 
	void(* handler)(AdvancedAuctionProcessedItems, Error, void* )
	, void* userData)
{
	return advancedAuctionItemsSubmitPostHelper(accessToken,
	advancedAuctionItemsSubmitRequest, adAccountId, 
	handler, userData, false);
}

