#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "AudienceSharingManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


AudienceSharingManager::AudienceSharingManager()
{

}

AudienceSharingManager::~AudienceSharingManager()
{

}

static gboolean __AudienceSharingManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __AudienceSharingManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__AudienceSharingManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool adAccountsAudiencesSharedAccountsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Ad_accounts_audiences_shared_accounts_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Ad_accounts_audiences_shared_accounts_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Ad_accounts_audiences_shared_accounts_list_200_response", "Ad_accounts_audiences_shared_accounts_list_200_response");
			json_node_free(pJson);

			if ("Ad_accounts_audiences_shared_accounts_list_200_response" == "std::string") {
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

static bool adAccountsAudiencesSharedAccountsListHelper(char * accessToken,
	std::string adAccountId, std::string audienceId, AudienceAccountType accountType, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )
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
	

	itemAtq = stringify(&audienceId, "std::string");
	queryParams.insert(pair<string, string>("audience_id", itemAtq));


	itemAtq = stringify(&accountType, "AudienceAccountType");
	queryParams.insert(pair<string, string>("account_type", itemAtq));


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

	string url("/ad_accounts/{ad_account_id}/audiences/shared/accounts");
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
		NetClient::easycurl(AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adAccountsAudiencesSharedAccountsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adAccountsAudiencesSharedAccountsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AudienceSharingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AudienceSharingManager::adAccountsAudiencesSharedAccountsListAsync(char * accessToken,
	std::string adAccountId, std::string audienceId, AudienceAccountType accountType, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )
	, void* userData)
{
	return adAccountsAudiencesSharedAccountsListHelper(accessToken,
	adAccountId, audienceId, accountType, pageSize, bookmark, 
	handler, userData, true);
}

bool AudienceSharingManager::adAccountsAudiencesSharedAccountsListSync(char * accessToken,
	std::string adAccountId, std::string audienceId, AudienceAccountType accountType, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )
	, void* userData)
{
	return adAccountsAudiencesSharedAccountsListHelper(accessToken,
	adAccountId, audienceId, accountType, pageSize, bookmark, 
	handler, userData, false);
}

static bool businessAccountAudiencesSharedAccountsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Ad_accounts_audiences_shared_accounts_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Ad_accounts_audiences_shared_accounts_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Ad_accounts_audiences_shared_accounts_list_200_response", "Ad_accounts_audiences_shared_accounts_list_200_response");
			json_node_free(pJson);

			if ("Ad_accounts_audiences_shared_accounts_list_200_response" == "std::string") {
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

static bool businessAccountAudiencesSharedAccountsListHelper(char * accessToken,
	std::string businessId, std::string audienceId, AudienceAccountType accountType, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )
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
	

	itemAtq = stringify(&audienceId, "std::string");
	queryParams.insert(pair<string, string>("audience_id", itemAtq));


	itemAtq = stringify(&accountType, "AudienceAccountType");
	queryParams.insert(pair<string, string>("account_type", itemAtq));


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

	string url("/businesses/{business_id}/audiences/shared/accounts");
	int pos;

	string s_businessId("{");
	s_businessId.append("business_id");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "std::string"));

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
		NetClient::easycurl(AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = businessAccountAudiencesSharedAccountsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), businessAccountAudiencesSharedAccountsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AudienceSharingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AudienceSharingManager::businessAccountAudiencesSharedAccountsListAsync(char * accessToken,
	std::string businessId, std::string audienceId, AudienceAccountType accountType, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )
	, void* userData)
{
	return businessAccountAudiencesSharedAccountsListHelper(accessToken,
	businessId, audienceId, accountType, pageSize, bookmark, 
	handler, userData, true);
}

bool AudienceSharingManager::businessAccountAudiencesSharedAccountsListSync(char * accessToken,
	std::string businessId, std::string audienceId, AudienceAccountType accountType, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )
	, void* userData)
{
	return businessAccountAudiencesSharedAccountsListHelper(accessToken,
	businessId, audienceId, accountType, pageSize, bookmark, 
	handler, userData, false);
}

static bool sharedAudiencesForBusinessListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Audiences_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Audiences_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Audiences_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Audiences_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Audiences_list_200_response", "Audiences_list_200_response");
			json_node_free(pJson);

			if ("Audiences_list_200_response" == "std::string") {
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

static bool sharedAudiencesForBusinessListHelper(char * accessToken,
	std::string businessId, std::string bookmark, std::string order, int pageSize, 
	void(* handler)(Audiences_list_200_response, Error, void* )
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


	itemAtq = stringify(&order, "std::string");
	queryParams.insert(pair<string, string>("order", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("order");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("page_size", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page_size");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/businesses/{business_id}/audiences");
	int pos;

	string s_businessId("{");
	s_businessId.append("business_id");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "std::string"));

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
		NetClient::easycurl(AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = sharedAudiencesForBusinessListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), sharedAudiencesForBusinessListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AudienceSharingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AudienceSharingManager::sharedAudiencesForBusinessListAsync(char * accessToken,
	std::string businessId, std::string bookmark, std::string order, int pageSize, 
	void(* handler)(Audiences_list_200_response, Error, void* )
	, void* userData)
{
	return sharedAudiencesForBusinessListHelper(accessToken,
	businessId, bookmark, order, pageSize, 
	handler, userData, true);
}

bool AudienceSharingManager::sharedAudiencesForBusinessListSync(char * accessToken,
	std::string businessId, std::string bookmark, std::string order, int pageSize, 
	void(* handler)(Audiences_list_200_response, Error, void* )
	, void* userData)
{
	return sharedAudiencesForBusinessListHelper(accessToken,
	businessId, bookmark, order, pageSize, 
	handler, userData, false);
}

static bool updateAdAccountToAdAccountSharedAudienceProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SharedAudienceResponse, Error, void* )
	= reinterpret_cast<void(*)(SharedAudienceResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SharedAudienceResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SharedAudienceResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SharedAudienceResponse", "SharedAudienceResponse");
			json_node_free(pJson);

			if ("SharedAudienceResponse" == "std::string") {
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

static bool updateAdAccountToAdAccountSharedAudienceHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<SharedAudience> sharedAudience, 
	void(* handler)(SharedAudienceResponse, Error, void* )
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

	if (isprimitive("SharedAudience")) {
		node = converttoJson(&sharedAudience, "SharedAudience", "");
	}
	
	char *jsonStr =  sharedAudience.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared");
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
		NetClient::easycurl(AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateAdAccountToAdAccountSharedAudienceProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateAdAccountToAdAccountSharedAudienceProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AudienceSharingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AudienceSharingManager::updateAdAccountToAdAccountSharedAudienceAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SharedAudience> sharedAudience, 
	void(* handler)(SharedAudienceResponse, Error, void* )
	, void* userData)
{
	return updateAdAccountToAdAccountSharedAudienceHelper(accessToken,
	adAccountId, sharedAudience, 
	handler, userData, true);
}

bool AudienceSharingManager::updateAdAccountToAdAccountSharedAudienceSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SharedAudience> sharedAudience, 
	void(* handler)(SharedAudienceResponse, Error, void* )
	, void* userData)
{
	return updateAdAccountToAdAccountSharedAudienceHelper(accessToken,
	adAccountId, sharedAudience, 
	handler, userData, false);
}

static bool updateAdAccountToBusinessSharedAudienceProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BusinessSharedAudienceResponse, Error, void* )
	= reinterpret_cast<void(*)(BusinessSharedAudienceResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BusinessSharedAudienceResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BusinessSharedAudienceResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BusinessSharedAudienceResponse", "BusinessSharedAudienceResponse");
			json_node_free(pJson);

			if ("BusinessSharedAudienceResponse" == "std::string") {
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

static bool updateAdAccountToBusinessSharedAudienceHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<BusinessSharedAudience> businessSharedAudience, 
	void(* handler)(BusinessSharedAudienceResponse, Error, void* )
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

	if (isprimitive("BusinessSharedAudience")) {
		node = converttoJson(&businessSharedAudience, "BusinessSharedAudience", "");
	}
	
	char *jsonStr =  businessSharedAudience.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/audiences/businesses/shared");
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
		NetClient::easycurl(AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateAdAccountToBusinessSharedAudienceProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateAdAccountToBusinessSharedAudienceProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AudienceSharingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AudienceSharingManager::updateAdAccountToBusinessSharedAudienceAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BusinessSharedAudience> businessSharedAudience, 
	void(* handler)(BusinessSharedAudienceResponse, Error, void* )
	, void* userData)
{
	return updateAdAccountToBusinessSharedAudienceHelper(accessToken,
	adAccountId, businessSharedAudience, 
	handler, userData, true);
}

bool AudienceSharingManager::updateAdAccountToBusinessSharedAudienceSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BusinessSharedAudience> businessSharedAudience, 
	void(* handler)(BusinessSharedAudienceResponse, Error, void* )
	, void* userData)
{
	return updateAdAccountToBusinessSharedAudienceHelper(accessToken,
	adAccountId, businessSharedAudience, 
	handler, userData, false);
}

static bool updateBusinessToAdAccountSharedAudienceProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SharedAudienceResponse, Error, void* )
	= reinterpret_cast<void(*)(SharedAudienceResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SharedAudienceResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SharedAudienceResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SharedAudienceResponse", "SharedAudienceResponse");
			json_node_free(pJson);

			if ("SharedAudienceResponse" == "std::string") {
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

static bool updateBusinessToAdAccountSharedAudienceHelper(char * accessToken,
	std::string businessId, std::shared_ptr<SharedAudience> sharedAudience, 
	void(* handler)(SharedAudienceResponse, Error, void* )
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

	if (isprimitive("SharedAudience")) {
		node = converttoJson(&sharedAudience, "SharedAudience", "");
	}
	
	char *jsonStr =  sharedAudience.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/audiences/ad_accounts/shared");
	int pos;

	string s_businessId("{");
	s_businessId.append("business_id");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "std::string"));

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
		NetClient::easycurl(AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateBusinessToAdAccountSharedAudienceProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateBusinessToAdAccountSharedAudienceProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AudienceSharingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AudienceSharingManager::updateBusinessToAdAccountSharedAudienceAsync(char * accessToken,
	std::string businessId, std::shared_ptr<SharedAudience> sharedAudience, 
	void(* handler)(SharedAudienceResponse, Error, void* )
	, void* userData)
{
	return updateBusinessToAdAccountSharedAudienceHelper(accessToken,
	businessId, sharedAudience, 
	handler, userData, true);
}

bool AudienceSharingManager::updateBusinessToAdAccountSharedAudienceSync(char * accessToken,
	std::string businessId, std::shared_ptr<SharedAudience> sharedAudience, 
	void(* handler)(SharedAudienceResponse, Error, void* )
	, void* userData)
{
	return updateBusinessToAdAccountSharedAudienceHelper(accessToken,
	businessId, sharedAudience, 
	handler, userData, false);
}

static bool updateBusinessToBusinessSharedAudienceProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BusinessSharedAudienceResponse, Error, void* )
	= reinterpret_cast<void(*)(BusinessSharedAudienceResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BusinessSharedAudienceResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BusinessSharedAudienceResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BusinessSharedAudienceResponse", "BusinessSharedAudienceResponse");
			json_node_free(pJson);

			if ("BusinessSharedAudienceResponse" == "std::string") {
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

static bool updateBusinessToBusinessSharedAudienceHelper(char * accessToken,
	std::string businessId, std::shared_ptr<BusinessSharedAudience> businessSharedAudience, 
	void(* handler)(BusinessSharedAudienceResponse, Error, void* )
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

	if (isprimitive("BusinessSharedAudience")) {
		node = converttoJson(&businessSharedAudience, "BusinessSharedAudience", "");
	}
	
	char *jsonStr =  businessSharedAudience.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/audiences/businesses/shared");
	int pos;

	string s_businessId("{");
	s_businessId.append("business_id");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "std::string"));

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
		NetClient::easycurl(AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateBusinessToBusinessSharedAudienceProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AudienceSharingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateBusinessToBusinessSharedAudienceProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AudienceSharingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AudienceSharingManager::updateBusinessToBusinessSharedAudienceAsync(char * accessToken,
	std::string businessId, std::shared_ptr<BusinessSharedAudience> businessSharedAudience, 
	void(* handler)(BusinessSharedAudienceResponse, Error, void* )
	, void* userData)
{
	return updateBusinessToBusinessSharedAudienceHelper(accessToken,
	businessId, businessSharedAudience, 
	handler, userData, true);
}

bool AudienceSharingManager::updateBusinessToBusinessSharedAudienceSync(char * accessToken,
	std::string businessId, std::shared_ptr<BusinessSharedAudience> businessSharedAudience, 
	void(* handler)(BusinessSharedAudienceResponse, Error, void* )
	, void* userData)
{
	return updateBusinessToBusinessSharedAudienceHelper(accessToken,
	businessId, businessSharedAudience, 
	handler, userData, false);
}

