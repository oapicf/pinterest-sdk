#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "BillingManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


BillingManager::BillingManager()
{

}

BillingManager::~BillingManager()
{

}

static gboolean __BillingManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __BillingManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__BillingManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool adsCreditRedeemProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdsCreditRedeemResponse, Error, void* )
	= reinterpret_cast<void(*)(AdsCreditRedeemResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdsCreditRedeemResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdsCreditRedeemResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdsCreditRedeemResponse", "AdsCreditRedeemResponse");
			json_node_free(pJson);

			if ("AdsCreditRedeemResponse" == "std::string") {
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

static bool adsCreditRedeemHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdsCreditRedeemRequest> adsCreditRedeemRequest, 
	void(* handler)(AdsCreditRedeemResponse, Error, void* )
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

	if (isprimitive("AdsCreditRedeemRequest")) {
		node = converttoJson(&adsCreditRedeemRequest, "AdsCreditRedeemRequest", "");
	}
	
	char *jsonStr =  adsCreditRedeemRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/ads_credit/redeem");
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
		NetClient::easycurl(BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adsCreditRedeemProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adsCreditRedeemProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BillingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BillingManager::adsCreditRedeemAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdsCreditRedeemRequest> adsCreditRedeemRequest, 
	void(* handler)(AdsCreditRedeemResponse, Error, void* )
	, void* userData)
{
	return adsCreditRedeemHelper(accessToken,
	adAccountId, adsCreditRedeemRequest, 
	handler, userData, true);
}

bool BillingManager::adsCreditRedeemSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdsCreditRedeemRequest> adsCreditRedeemRequest, 
	void(* handler)(AdsCreditRedeemResponse, Error, void* )
	, void* userData)
{
	return adsCreditRedeemHelper(accessToken,
	adAccountId, adsCreditRedeemRequest, 
	handler, userData, false);
}

static bool adsCreditsDiscountsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Ads_credits_discounts_get_200_response, Error, void* )
	= reinterpret_cast<void(*)(Ads_credits_discounts_get_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Ads_credits_discounts_get_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Ads_credits_discounts_get_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Ads_credits_discounts_get_200_response", "Ads_credits_discounts_get_200_response");
			json_node_free(pJson);

			if ("Ads_credits_discounts_get_200_response" == "std::string") {
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

static bool adsCreditsDiscountsGetHelper(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Ads_credits_discounts_get_200_response, Error, void* )
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
	

	itemAtq = stringify(&bookmark, "std::string");
	queryParams.insert(pair<string, string>("bookmark", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bookmark");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("page_size", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page_size");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/ads_credit/discounts");
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
		NetClient::easycurl(BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adsCreditsDiscountsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adsCreditsDiscountsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BillingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BillingManager::adsCreditsDiscountsGetAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Ads_credits_discounts_get_200_response, Error, void* )
	, void* userData)
{
	return adsCreditsDiscountsGetHelper(accessToken,
	adAccountId, bookmark, pageSize, 
	handler, userData, true);
}

bool BillingManager::adsCreditsDiscountsGetSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Ads_credits_discounts_get_200_response, Error, void* )
	, void* userData)
{
	return adsCreditsDiscountsGetHelper(accessToken,
	adAccountId, bookmark, pageSize, 
	handler, userData, false);
}

static bool billingProfilesGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Billing_profiles_get_200_response, Error, void* )
	= reinterpret_cast<void(*)(Billing_profiles_get_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Billing_profiles_get_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Billing_profiles_get_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Billing_profiles_get_200_response", "Billing_profiles_get_200_response");
			json_node_free(pJson);

			if ("Billing_profiles_get_200_response" == "std::string") {
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

static bool billingProfilesGetHelper(char * accessToken,
	std::string adAccountId, bool isActive, std::string bookmark, int pageSize, 
	void(* handler)(Billing_profiles_get_200_response, Error, void* )
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
	

	itemAtq = stringify(&isActive, "bool");
	queryParams.insert(pair<string, string>("is_active", itemAtq));


	itemAtq = stringify(&bookmark, "std::string");
	queryParams.insert(pair<string, string>("bookmark", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bookmark");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("page_size", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page_size");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/billing_profiles");
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
		NetClient::easycurl(BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = billingProfilesGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), billingProfilesGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BillingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BillingManager::billingProfilesGetAsync(char * accessToken,
	std::string adAccountId, bool isActive, std::string bookmark, int pageSize, 
	void(* handler)(Billing_profiles_get_200_response, Error, void* )
	, void* userData)
{
	return billingProfilesGetHelper(accessToken,
	adAccountId, isActive, bookmark, pageSize, 
	handler, userData, true);
}

bool BillingManager::billingProfilesGetSync(char * accessToken,
	std::string adAccountId, bool isActive, std::string bookmark, int pageSize, 
	void(* handler)(Billing_profiles_get_200_response, Error, void* )
	, void* userData)
{
	return billingProfilesGetHelper(accessToken,
	adAccountId, isActive, bookmark, pageSize, 
	handler, userData, false);
}

static bool ssioAccountsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SSIOAccountResponse, Error, void* )
	= reinterpret_cast<void(*)(SSIOAccountResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SSIOAccountResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SSIOAccountResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SSIOAccountResponse", "SSIOAccountResponse");
			json_node_free(pJson);

			if ("SSIOAccountResponse" == "std::string") {
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

static bool ssioAccountsGetHelper(char * accessToken,
	std::string adAccountId, 
	void(* handler)(SSIOAccountResponse, Error, void* )
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

	string url("/ad_accounts/{ad_account_id}/ssio/accounts");
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
		NetClient::easycurl(BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = ssioAccountsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), ssioAccountsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BillingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BillingManager::ssioAccountsGetAsync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(SSIOAccountResponse, Error, void* )
	, void* userData)
{
	return ssioAccountsGetHelper(accessToken,
	adAccountId, 
	handler, userData, true);
}

bool BillingManager::ssioAccountsGetSync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(SSIOAccountResponse, Error, void* )
	, void* userData)
{
	return ssioAccountsGetHelper(accessToken,
	adAccountId, 
	handler, userData, false);
}

static bool ssioInsertionOrderCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SSIOCreateInsertionOrderResponse, Error, void* )
	= reinterpret_cast<void(*)(SSIOCreateInsertionOrderResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SSIOCreateInsertionOrderResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SSIOCreateInsertionOrderResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SSIOCreateInsertionOrderResponse", "SSIOCreateInsertionOrderResponse");
			json_node_free(pJson);

			if ("SSIOCreateInsertionOrderResponse" == "std::string") {
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

static bool ssioInsertionOrderCreateHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOCreateInsertionOrderRequest> sSIOCreateInsertionOrderRequest, 
	void(* handler)(SSIOCreateInsertionOrderResponse, Error, void* )
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

	if (isprimitive("SSIOCreateInsertionOrderRequest")) {
		node = converttoJson(&sSIOCreateInsertionOrderRequest, "SSIOCreateInsertionOrderRequest", "");
	}
	
	char *jsonStr =  sSIOCreateInsertionOrderRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/ssio/insertion_orders");
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
		NetClient::easycurl(BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = ssioInsertionOrderCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), ssioInsertionOrderCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BillingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BillingManager::ssioInsertionOrderCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOCreateInsertionOrderRequest> sSIOCreateInsertionOrderRequest, 
	void(* handler)(SSIOCreateInsertionOrderResponse, Error, void* )
	, void* userData)
{
	return ssioInsertionOrderCreateHelper(accessToken,
	adAccountId, sSIOCreateInsertionOrderRequest, 
	handler, userData, true);
}

bool BillingManager::ssioInsertionOrderCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOCreateInsertionOrderRequest> sSIOCreateInsertionOrderRequest, 
	void(* handler)(SSIOCreateInsertionOrderResponse, Error, void* )
	, void* userData)
{
	return ssioInsertionOrderCreateHelper(accessToken,
	adAccountId, sSIOCreateInsertionOrderRequest, 
	handler, userData, false);
}

static bool ssioInsertionOrderEditProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SSIOEditInsertionOrderResponse, Error, void* )
	= reinterpret_cast<void(*)(SSIOEditInsertionOrderResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SSIOEditInsertionOrderResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SSIOEditInsertionOrderResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SSIOEditInsertionOrderResponse", "SSIOEditInsertionOrderResponse");
			json_node_free(pJson);

			if ("SSIOEditInsertionOrderResponse" == "std::string") {
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

static bool ssioInsertionOrderEditHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOEditInsertionOrderRequest> sSIOEditInsertionOrderRequest, 
	void(* handler)(SSIOEditInsertionOrderResponse, Error, void* )
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

	if (isprimitive("SSIOEditInsertionOrderRequest")) {
		node = converttoJson(&sSIOEditInsertionOrderRequest, "SSIOEditInsertionOrderRequest", "");
	}
	
	char *jsonStr =  sSIOEditInsertionOrderRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/ssio/insertion_orders");
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
	string myhttpmethod("PATCH");

	if(strcmp("PUT", "PATCH") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = ssioInsertionOrderEditProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), ssioInsertionOrderEditProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BillingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BillingManager::ssioInsertionOrderEditAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOEditInsertionOrderRequest> sSIOEditInsertionOrderRequest, 
	void(* handler)(SSIOEditInsertionOrderResponse, Error, void* )
	, void* userData)
{
	return ssioInsertionOrderEditHelper(accessToken,
	adAccountId, sSIOEditInsertionOrderRequest, 
	handler, userData, true);
}

bool BillingManager::ssioInsertionOrderEditSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOEditInsertionOrderRequest> sSIOEditInsertionOrderRequest, 
	void(* handler)(SSIOEditInsertionOrderResponse, Error, void* )
	, void* userData)
{
	return ssioInsertionOrderEditHelper(accessToken,
	adAccountId, sSIOEditInsertionOrderRequest, 
	handler, userData, false);
}

static bool ssioInsertionOrdersStatusGetByAdAccountProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Ssio_insertion_orders_status_get_by_ad_account_200_response, Error, void* )
	= reinterpret_cast<void(*)(Ssio_insertion_orders_status_get_by_ad_account_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Ssio_insertion_orders_status_get_by_ad_account_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Ssio_insertion_orders_status_get_by_ad_account_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Ssio_insertion_orders_status_get_by_ad_account_200_response", "Ssio_insertion_orders_status_get_by_ad_account_200_response");
			json_node_free(pJson);

			if ("Ssio_insertion_orders_status_get_by_ad_account_200_response" == "std::string") {
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

static bool ssioInsertionOrdersStatusGetByAdAccountHelper(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Ssio_insertion_orders_status_get_by_ad_account_200_response, Error, void* )
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
	

	itemAtq = stringify(&bookmark, "std::string");
	queryParams.insert(pair<string, string>("bookmark", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bookmark");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("page_size", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page_size");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/ssio/insertion_orders/status");
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
		NetClient::easycurl(BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = ssioInsertionOrdersStatusGetByAdAccountProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), ssioInsertionOrdersStatusGetByAdAccountProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BillingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BillingManager::ssioInsertionOrdersStatusGetByAdAccountAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Ssio_insertion_orders_status_get_by_ad_account_200_response, Error, void* )
	, void* userData)
{
	return ssioInsertionOrdersStatusGetByAdAccountHelper(accessToken,
	adAccountId, bookmark, pageSize, 
	handler, userData, true);
}

bool BillingManager::ssioInsertionOrdersStatusGetByAdAccountSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Ssio_insertion_orders_status_get_by_ad_account_200_response, Error, void* )
	, void* userData)
{
	return ssioInsertionOrdersStatusGetByAdAccountHelper(accessToken,
	adAccountId, bookmark, pageSize, 
	handler, userData, false);
}

static bool ssioInsertionOrdersStatusGetByPinOrderIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SSIOInsertionOrderStatusResponse, Error, void* )
	= reinterpret_cast<void(*)(SSIOInsertionOrderStatusResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SSIOInsertionOrderStatusResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SSIOInsertionOrderStatusResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SSIOInsertionOrderStatusResponse", "SSIOInsertionOrderStatusResponse");
			json_node_free(pJson);

			if ("SSIOInsertionOrderStatusResponse" == "std::string") {
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

static bool ssioInsertionOrdersStatusGetByPinOrderIdHelper(char * accessToken,
	std::string adAccountId, std::string pinOrderId, 
	void(* handler)(SSIOInsertionOrderStatusResponse, Error, void* )
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

	string url("/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status");
	int pos;

	string s_adAccountId("{");
	s_adAccountId.append("ad_account_id");
	s_adAccountId.append("}");
	pos = url.find(s_adAccountId);
	url.erase(pos, s_adAccountId.length());
	url.insert(pos, stringify(&adAccountId, "std::string"));
	string s_pinOrderId("{");
	s_pinOrderId.append("pin_order_id");
	s_pinOrderId.append("}");
	pos = url.find(s_pinOrderId);
	url.erase(pos, s_pinOrderId.length());
	url.insert(pos, stringify(&pinOrderId, "std::string"));

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
		NetClient::easycurl(BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = ssioInsertionOrdersStatusGetByPinOrderIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), ssioInsertionOrdersStatusGetByPinOrderIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BillingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BillingManager::ssioInsertionOrdersStatusGetByPinOrderIdAsync(char * accessToken,
	std::string adAccountId, std::string pinOrderId, 
	void(* handler)(SSIOInsertionOrderStatusResponse, Error, void* )
	, void* userData)
{
	return ssioInsertionOrdersStatusGetByPinOrderIdHelper(accessToken,
	adAccountId, pinOrderId, 
	handler, userData, true);
}

bool BillingManager::ssioInsertionOrdersStatusGetByPinOrderIdSync(char * accessToken,
	std::string adAccountId, std::string pinOrderId, 
	void(* handler)(SSIOInsertionOrderStatusResponse, Error, void* )
	, void* userData)
{
	return ssioInsertionOrdersStatusGetByPinOrderIdHelper(accessToken,
	adAccountId, pinOrderId, 
	handler, userData, false);
}

static bool ssioOrderLinesGetByAdAccountProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Ssio_order_lines_get_by_ad_account_200_response, Error, void* )
	= reinterpret_cast<void(*)(Ssio_order_lines_get_by_ad_account_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Ssio_order_lines_get_by_ad_account_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Ssio_order_lines_get_by_ad_account_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Ssio_order_lines_get_by_ad_account_200_response", "Ssio_order_lines_get_by_ad_account_200_response");
			json_node_free(pJson);

			if ("Ssio_order_lines_get_by_ad_account_200_response" == "std::string") {
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

static bool ssioOrderLinesGetByAdAccountHelper(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string pinOrderId, 
	void(* handler)(Ssio_order_lines_get_by_ad_account_200_response, Error, void* )
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
	

	itemAtq = stringify(&bookmark, "std::string");
	queryParams.insert(pair<string, string>("bookmark", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bookmark");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("page_size", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page_size");
	}


	itemAtq = stringify(&pinOrderId, "std::string");
	queryParams.insert(pair<string, string>("pin_order_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pin_order_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/ssio/order_lines");
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
		NetClient::easycurl(BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = ssioOrderLinesGetByAdAccountProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BillingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), ssioOrderLinesGetByAdAccountProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BillingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BillingManager::ssioOrderLinesGetByAdAccountAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string pinOrderId, 
	void(* handler)(Ssio_order_lines_get_by_ad_account_200_response, Error, void* )
	, void* userData)
{
	return ssioOrderLinesGetByAdAccountHelper(accessToken,
	adAccountId, bookmark, pageSize, pinOrderId, 
	handler, userData, true);
}

bool BillingManager::ssioOrderLinesGetByAdAccountSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string pinOrderId, 
	void(* handler)(Ssio_order_lines_get_by_ad_account_200_response, Error, void* )
	, void* userData)
{
	return ssioOrderLinesGetByAdAccountHelper(accessToken,
	adAccountId, bookmark, pageSize, pinOrderId, 
	handler, userData, false);
}

