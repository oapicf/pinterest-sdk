#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "LeadAdsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


LeadAdsManager::LeadAdsManager()
{

}

LeadAdsManager::~LeadAdsManager()
{

}

static gboolean __LeadAdsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __LeadAdsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__LeadAdsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool adAccountsSubscriptionsDelByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool adAccountsSubscriptionsDelByIdHelper(char * accessToken,
	std::string adAccountId, std::string subscriptionId, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
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

	string url("/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}");
	int pos;

	string s_adAccountId("{");
	s_adAccountId.append("ad_account_id");
	s_adAccountId.append("}");
	pos = url.find(s_adAccountId);
	url.erase(pos, s_adAccountId.length());
	url.insert(pos, stringify(&adAccountId, "std::string"));
	string s_subscriptionId("{");
	s_subscriptionId.append("subscription_id");
	s_subscriptionId.append("}");
	pos = url.find(s_subscriptionId);
	url.erase(pos, s_subscriptionId.length());
	url.insert(pos, stringify(&subscriptionId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(LeadAdsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adAccountsSubscriptionsDelByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LeadAdsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adAccountsSubscriptionsDelByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LeadAdsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LeadAdsManager::adAccountsSubscriptionsDelByIdAsync(char * accessToken,
	std::string adAccountId, std::string subscriptionId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return adAccountsSubscriptionsDelByIdHelper(accessToken,
	adAccountId, subscriptionId, 
	handler, userData, true);
}

bool LeadAdsManager::adAccountsSubscriptionsDelByIdSync(char * accessToken,
	std::string adAccountId, std::string subscriptionId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return adAccountsSubscriptionsDelByIdHelper(accessToken,
	adAccountId, subscriptionId, 
	handler, userData, false);
}

static bool adAccountsSubscriptionsGetByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdAccountGetSubscriptionResponse, Error, void* )
	= reinterpret_cast<void(*)(AdAccountGetSubscriptionResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdAccountGetSubscriptionResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdAccountGetSubscriptionResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdAccountGetSubscriptionResponse", "AdAccountGetSubscriptionResponse");
			json_node_free(pJson);

			if ("AdAccountGetSubscriptionResponse" == "std::string") {
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

static bool adAccountsSubscriptionsGetByIdHelper(char * accessToken,
	std::string adAccountId, std::string subscriptionId, 
	void(* handler)(AdAccountGetSubscriptionResponse, Error, void* )
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

	string url("/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}");
	int pos;

	string s_adAccountId("{");
	s_adAccountId.append("ad_account_id");
	s_adAccountId.append("}");
	pos = url.find(s_adAccountId);
	url.erase(pos, s_adAccountId.length());
	url.insert(pos, stringify(&adAccountId, "std::string"));
	string s_subscriptionId("{");
	s_subscriptionId.append("subscription_id");
	s_subscriptionId.append("}");
	pos = url.find(s_subscriptionId);
	url.erase(pos, s_subscriptionId.length());
	url.insert(pos, stringify(&subscriptionId, "std::string"));

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
		NetClient::easycurl(LeadAdsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adAccountsSubscriptionsGetByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LeadAdsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adAccountsSubscriptionsGetByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LeadAdsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LeadAdsManager::adAccountsSubscriptionsGetByIdAsync(char * accessToken,
	std::string adAccountId, std::string subscriptionId, 
	void(* handler)(AdAccountGetSubscriptionResponse, Error, void* )
	, void* userData)
{
	return adAccountsSubscriptionsGetByIdHelper(accessToken,
	adAccountId, subscriptionId, 
	handler, userData, true);
}

bool LeadAdsManager::adAccountsSubscriptionsGetByIdSync(char * accessToken,
	std::string adAccountId, std::string subscriptionId, 
	void(* handler)(AdAccountGetSubscriptionResponse, Error, void* )
	, void* userData)
{
	return adAccountsSubscriptionsGetByIdHelper(accessToken,
	adAccountId, subscriptionId, 
	handler, userData, false);
}

static bool adAccountsSubscriptionsGetListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Ad_accounts_subscriptions_get_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Ad_accounts_subscriptions_get_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Ad_accounts_subscriptions_get_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Ad_accounts_subscriptions_get_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Ad_accounts_subscriptions_get_list_200_response", "Ad_accounts_subscriptions_get_list_200_response");
			json_node_free(pJson);

			if ("Ad_accounts_subscriptions_get_list_200_response" == "std::string") {
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

static bool adAccountsSubscriptionsGetListHelper(char * accessToken,
	std::string adAccountId, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_subscriptions_get_list_200_response, Error, void* )
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
	

	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("page_size", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page_size");
	}


	itemAtq = stringify(&bookmark, "std::string");
	queryParams.insert(pair<string, string>("bookmark", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bookmark");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/leads/subscriptions");
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
		NetClient::easycurl(LeadAdsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adAccountsSubscriptionsGetListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LeadAdsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adAccountsSubscriptionsGetListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LeadAdsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LeadAdsManager::adAccountsSubscriptionsGetListAsync(char * accessToken,
	std::string adAccountId, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_subscriptions_get_list_200_response, Error, void* )
	, void* userData)
{
	return adAccountsSubscriptionsGetListHelper(accessToken,
	adAccountId, pageSize, bookmark, 
	handler, userData, true);
}

bool LeadAdsManager::adAccountsSubscriptionsGetListSync(char * accessToken,
	std::string adAccountId, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_subscriptions_get_list_200_response, Error, void* )
	, void* userData)
{
	return adAccountsSubscriptionsGetListHelper(accessToken,
	adAccountId, pageSize, bookmark, 
	handler, userData, false);
}

static bool adAccountsSubscriptionsPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdAccountCreateSubscriptionResponse, Error, void* )
	= reinterpret_cast<void(*)(AdAccountCreateSubscriptionResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdAccountCreateSubscriptionResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdAccountCreateSubscriptionResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdAccountCreateSubscriptionResponse", "AdAccountCreateSubscriptionResponse");
			json_node_free(pJson);

			if ("AdAccountCreateSubscriptionResponse" == "std::string") {
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

static bool adAccountsSubscriptionsPostHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdAccountCreateSubscriptionRequest> adAccountCreateSubscriptionRequest, 
	void(* handler)(AdAccountCreateSubscriptionResponse, Error, void* )
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

	if (isprimitive("AdAccountCreateSubscriptionRequest")) {
		node = converttoJson(&adAccountCreateSubscriptionRequest, "AdAccountCreateSubscriptionRequest", "");
	}
	
	char *jsonStr =  adAccountCreateSubscriptionRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/leads/subscriptions");
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
		NetClient::easycurl(LeadAdsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adAccountsSubscriptionsPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LeadAdsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adAccountsSubscriptionsPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LeadAdsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LeadAdsManager::adAccountsSubscriptionsPostAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdAccountCreateSubscriptionRequest> adAccountCreateSubscriptionRequest, 
	void(* handler)(AdAccountCreateSubscriptionResponse, Error, void* )
	, void* userData)
{
	return adAccountsSubscriptionsPostHelper(accessToken,
	adAccountId, adAccountCreateSubscriptionRequest, 
	handler, userData, true);
}

bool LeadAdsManager::adAccountsSubscriptionsPostSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdAccountCreateSubscriptionRequest> adAccountCreateSubscriptionRequest, 
	void(* handler)(AdAccountCreateSubscriptionResponse, Error, void* )
	, void* userData)
{
	return adAccountsSubscriptionsPostHelper(accessToken,
	adAccountId, adAccountCreateSubscriptionRequest, 
	handler, userData, false);
}

