#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "TargetingTemplateManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


TargetingTemplateManager::TargetingTemplateManager()
{

}

TargetingTemplateManager::~TargetingTemplateManager()
{

}

static gboolean __TargetingTemplateManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __TargetingTemplateManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__TargetingTemplateManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool targetingTemplateCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(TargetingTemplateGetResponseData, Error, void* )
	= reinterpret_cast<void(*)(TargetingTemplateGetResponseData, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	TargetingTemplateGetResponseData out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("TargetingTemplateGetResponseData")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "TargetingTemplateGetResponseData", "TargetingTemplateGetResponseData");
			json_node_free(pJson);

			if ("TargetingTemplateGetResponseData" == "std::string") {
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

static bool targetingTemplateCreateHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<TargetingTemplateCreate> targetingTemplateCreate, 
	void(* handler)(TargetingTemplateGetResponseData, Error, void* )
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

	if (isprimitive("TargetingTemplateCreate")) {
		node = converttoJson(&targetingTemplateCreate, "TargetingTemplateCreate", "");
	}
	
	char *jsonStr =  targetingTemplateCreate.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/targeting_templates");
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
		NetClient::easycurl(TargetingTemplateManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = targetingTemplateCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TargetingTemplateManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), targetingTemplateCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TargetingTemplateManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TargetingTemplateManager::targetingTemplateCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<TargetingTemplateCreate> targetingTemplateCreate, 
	void(* handler)(TargetingTemplateGetResponseData, Error, void* )
	, void* userData)
{
	return targetingTemplateCreateHelper(accessToken,
	adAccountId, targetingTemplateCreate, 
	handler, userData, true);
}

bool TargetingTemplateManager::targetingTemplateCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<TargetingTemplateCreate> targetingTemplateCreate, 
	void(* handler)(TargetingTemplateGetResponseData, Error, void* )
	, void* userData)
{
	return targetingTemplateCreateHelper(accessToken,
	adAccountId, targetingTemplateCreate, 
	handler, userData, false);
}

static bool targetingTemplateListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Targeting_template_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Targeting_template_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Targeting_template_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Targeting_template_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Targeting_template_list_200_response", "Targeting_template_list_200_response");
			json_node_free(pJson);

			if ("Targeting_template_list_200_response" == "std::string") {
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

static bool targetingTemplateListHelper(char * accessToken,
	std::string adAccountId, std::string order, bool includeSizing, std::string searchQuery, int pageSize, std::string bookmark, 
	void(* handler)(Targeting_template_list_200_response, Error, void* )
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
	

	itemAtq = stringify(&order, "std::string");
	queryParams.insert(pair<string, string>("order", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("order");
	}


	itemAtq = stringify(&includeSizing, "bool");
	queryParams.insert(pair<string, string>("include_sizing", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_sizing");
	}


	itemAtq = stringify(&searchQuery, "std::string");
	queryParams.insert(pair<string, string>("search_query", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("search_query");
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

	string url("/ad_accounts/{ad_account_id}/targeting_templates");
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
		NetClient::easycurl(TargetingTemplateManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = targetingTemplateListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TargetingTemplateManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), targetingTemplateListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TargetingTemplateManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TargetingTemplateManager::targetingTemplateListAsync(char * accessToken,
	std::string adAccountId, std::string order, bool includeSizing, std::string searchQuery, int pageSize, std::string bookmark, 
	void(* handler)(Targeting_template_list_200_response, Error, void* )
	, void* userData)
{
	return targetingTemplateListHelper(accessToken,
	adAccountId, order, includeSizing, searchQuery, pageSize, bookmark, 
	handler, userData, true);
}

bool TargetingTemplateManager::targetingTemplateListSync(char * accessToken,
	std::string adAccountId, std::string order, bool includeSizing, std::string searchQuery, int pageSize, std::string bookmark, 
	void(* handler)(Targeting_template_list_200_response, Error, void* )
	, void* userData)
{
	return targetingTemplateListHelper(accessToken,
	adAccountId, order, includeSizing, searchQuery, pageSize, bookmark, 
	handler, userData, false);
}

static bool targetingTemplateUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool targetingTemplateUpdateHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<TargetingTemplateUpdateRequest> targetingTemplateUpdateRequest, 
	
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

	if (isprimitive("TargetingTemplateUpdateRequest")) {
		node = converttoJson(&targetingTemplateUpdateRequest, "TargetingTemplateUpdateRequest", "");
	}
	
	char *jsonStr =  targetingTemplateUpdateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/targeting_templates");
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
		NetClient::easycurl(TargetingTemplateManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = targetingTemplateUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TargetingTemplateManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), targetingTemplateUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TargetingTemplateManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TargetingTemplateManager::targetingTemplateUpdateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<TargetingTemplateUpdateRequest> targetingTemplateUpdateRequest, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return targetingTemplateUpdateHelper(accessToken,
	adAccountId, targetingTemplateUpdateRequest, 
	handler, userData, true);
}

bool TargetingTemplateManager::targetingTemplateUpdateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<TargetingTemplateUpdateRequest> targetingTemplateUpdateRequest, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return targetingTemplateUpdateHelper(accessToken,
	adAccountId, targetingTemplateUpdateRequest, 
	handler, userData, false);
}

