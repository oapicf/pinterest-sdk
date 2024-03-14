#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "KeywordsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


KeywordsManager::KeywordsManager()
{

}

KeywordsManager::~KeywordsManager()
{

}

static gboolean __KeywordsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __KeywordsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__KeywordsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool countryKeywordsMetricsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(KeywordsMetricsArrayResponse, Error, void* )
	= reinterpret_cast<void(*)(KeywordsMetricsArrayResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	KeywordsMetricsArrayResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("KeywordsMetricsArrayResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "KeywordsMetricsArrayResponse", "KeywordsMetricsArrayResponse");
			json_node_free(pJson);

			if ("KeywordsMetricsArrayResponse" == "std::string") {
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

static bool countryKeywordsMetricsGetHelper(char * accessToken,
	std::string adAccountId, std::string countryCode, std::list<std::string> keywords, 
	void(* handler)(KeywordsMetricsArrayResponse, Error, void* )
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
	

	itemAtq = stringify(&countryCode, "std::string");
	queryParams.insert(pair<string, string>("country_code", itemAtq));

	for (std::list
	<std::string>::iterator queryIter = keywords.begin(); queryIter != keywords.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("keywords", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/keywords/metrics");
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
		NetClient::easycurl(KeywordsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = countryKeywordsMetricsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (KeywordsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), countryKeywordsMetricsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __KeywordsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool KeywordsManager::countryKeywordsMetricsGetAsync(char * accessToken,
	std::string adAccountId, std::string countryCode, std::list<std::string> keywords, 
	void(* handler)(KeywordsMetricsArrayResponse, Error, void* )
	, void* userData)
{
	return countryKeywordsMetricsGetHelper(accessToken,
	adAccountId, countryCode, keywords, 
	handler, userData, true);
}

bool KeywordsManager::countryKeywordsMetricsGetSync(char * accessToken,
	std::string adAccountId, std::string countryCode, std::list<std::string> keywords, 
	void(* handler)(KeywordsMetricsArrayResponse, Error, void* )
	, void* userData)
{
	return countryKeywordsMetricsGetHelper(accessToken,
	adAccountId, countryCode, keywords, 
	handler, userData, false);
}

static bool keywordsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(KeywordsResponse, Error, void* )
	= reinterpret_cast<void(*)(KeywordsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	KeywordsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("KeywordsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "KeywordsResponse", "KeywordsResponse");
			json_node_free(pJson);

			if ("KeywordsResponse" == "std::string") {
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

static bool keywordsCreateHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordsRequest> keywordsRequest, 
	void(* handler)(KeywordsResponse, Error, void* )
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

	if (isprimitive("KeywordsRequest")) {
		node = converttoJson(&keywordsRequest, "KeywordsRequest", "");
	}
	
	char *jsonStr =  keywordsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/keywords");
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
		NetClient::easycurl(KeywordsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = keywordsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (KeywordsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), keywordsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __KeywordsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool KeywordsManager::keywordsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordsRequest> keywordsRequest, 
	void(* handler)(KeywordsResponse, Error, void* )
	, void* userData)
{
	return keywordsCreateHelper(accessToken,
	adAccountId, keywordsRequest, 
	handler, userData, true);
}

bool KeywordsManager::keywordsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordsRequest> keywordsRequest, 
	void(* handler)(KeywordsResponse, Error, void* )
	, void* userData)
{
	return keywordsCreateHelper(accessToken,
	adAccountId, keywordsRequest, 
	handler, userData, false);
}

static bool keywordsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Keywords_get_200_response, Error, void* )
	= reinterpret_cast<void(*)(Keywords_get_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Keywords_get_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Keywords_get_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Keywords_get_200_response", "Keywords_get_200_response");
			json_node_free(pJson);

			if ("Keywords_get_200_response" == "std::string") {
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

static bool keywordsGetHelper(char * accessToken,
	std::string adAccountId, std::string campaignId, std::string adGroupId, std::list<MatchType> matchTypes, int pageSize, std::string bookmark, 
	void(* handler)(Keywords_get_200_response, Error, void* )
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
	

	itemAtq = stringify(&campaignId, "std::string");
	queryParams.insert(pair<string, string>("campaign_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("campaign_id");
	}


	itemAtq = stringify(&adGroupId, "std::string");
	queryParams.insert(pair<string, string>("ad_group_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_group_id");
	}

	for (std::list
	<MatchType>::iterator queryIter = matchTypes.begin(); queryIter != matchTypes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "MatchType");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("matchTypes", itemAt));
	}
	

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

	string url("/ad_accounts/{ad_account_id}/keywords");
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
		NetClient::easycurl(KeywordsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = keywordsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (KeywordsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), keywordsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __KeywordsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool KeywordsManager::keywordsGetAsync(char * accessToken,
	std::string adAccountId, std::string campaignId, std::string adGroupId, std::list<MatchType> matchTypes, int pageSize, std::string bookmark, 
	void(* handler)(Keywords_get_200_response, Error, void* )
	, void* userData)
{
	return keywordsGetHelper(accessToken,
	adAccountId, campaignId, adGroupId, matchTypes, pageSize, bookmark, 
	handler, userData, true);
}

bool KeywordsManager::keywordsGetSync(char * accessToken,
	std::string adAccountId, std::string campaignId, std::string adGroupId, std::list<MatchType> matchTypes, int pageSize, std::string bookmark, 
	void(* handler)(Keywords_get_200_response, Error, void* )
	, void* userData)
{
	return keywordsGetHelper(accessToken,
	adAccountId, campaignId, adGroupId, matchTypes, pageSize, bookmark, 
	handler, userData, false);
}

static bool keywordsUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(KeywordsResponse, Error, void* )
	= reinterpret_cast<void(*)(KeywordsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	KeywordsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("KeywordsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "KeywordsResponse", "KeywordsResponse");
			json_node_free(pJson);

			if ("KeywordsResponse" == "std::string") {
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

static bool keywordsUpdateHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordUpdateBody> keywordUpdateBody, 
	void(* handler)(KeywordsResponse, Error, void* )
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

	if (isprimitive("KeywordUpdateBody")) {
		node = converttoJson(&keywordUpdateBody, "KeywordUpdateBody", "");
	}
	
	char *jsonStr =  keywordUpdateBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/keywords");
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
		NetClient::easycurl(KeywordsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = keywordsUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (KeywordsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), keywordsUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __KeywordsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool KeywordsManager::keywordsUpdateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordUpdateBody> keywordUpdateBody, 
	void(* handler)(KeywordsResponse, Error, void* )
	, void* userData)
{
	return keywordsUpdateHelper(accessToken,
	adAccountId, keywordUpdateBody, 
	handler, userData, true);
}

bool KeywordsManager::keywordsUpdateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordUpdateBody> keywordUpdateBody, 
	void(* handler)(KeywordsResponse, Error, void* )
	, void* userData)
{
	return keywordsUpdateHelper(accessToken,
	adAccountId, keywordUpdateBody, 
	handler, userData, false);
}

