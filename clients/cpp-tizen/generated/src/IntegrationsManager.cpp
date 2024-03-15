#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "IntegrationsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


IntegrationsManager::IntegrationsManager()
{

}

IntegrationsManager::~IntegrationsManager()
{

}

static gboolean __IntegrationsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __IntegrationsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__IntegrationsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool integrationsCommerceDelProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool integrationsCommerceDelHelper(char * accessToken,
	std::string externalBusinessId, 
	
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

	string url("/integrations/commerce/{external_business_id}");
	int pos;

	string s_externalBusinessId("{");
	s_externalBusinessId.append("external_business_id");
	s_externalBusinessId.append("}");
	pos = url.find(s_externalBusinessId);
	url.erase(pos, s_externalBusinessId.length());
	url.insert(pos, stringify(&externalBusinessId, "std::string"));

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
		NetClient::easycurl(IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = integrationsCommerceDelProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), integrationsCommerceDelProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __IntegrationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool IntegrationsManager::integrationsCommerceDelAsync(char * accessToken,
	std::string externalBusinessId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return integrationsCommerceDelHelper(accessToken,
	externalBusinessId, 
	handler, userData, true);
}

bool IntegrationsManager::integrationsCommerceDelSync(char * accessToken,
	std::string externalBusinessId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return integrationsCommerceDelHelper(accessToken,
	externalBusinessId, 
	handler, userData, false);
}

static bool integrationsCommerceGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(IntegrationMetadata, Error, void* )
	= reinterpret_cast<void(*)(IntegrationMetadata, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	IntegrationMetadata out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("IntegrationMetadata")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "IntegrationMetadata", "IntegrationMetadata");
			json_node_free(pJson);

			if ("IntegrationMetadata" == "std::string") {
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

static bool integrationsCommerceGetHelper(char * accessToken,
	std::string externalBusinessId, 
	void(* handler)(IntegrationMetadata, Error, void* )
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

	string url("/integrations/commerce/{external_business_id}");
	int pos;

	string s_externalBusinessId("{");
	s_externalBusinessId.append("external_business_id");
	s_externalBusinessId.append("}");
	pos = url.find(s_externalBusinessId);
	url.erase(pos, s_externalBusinessId.length());
	url.insert(pos, stringify(&externalBusinessId, "std::string"));

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
		NetClient::easycurl(IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = integrationsCommerceGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), integrationsCommerceGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __IntegrationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool IntegrationsManager::integrationsCommerceGetAsync(char * accessToken,
	std::string externalBusinessId, 
	void(* handler)(IntegrationMetadata, Error, void* )
	, void* userData)
{
	return integrationsCommerceGetHelper(accessToken,
	externalBusinessId, 
	handler, userData, true);
}

bool IntegrationsManager::integrationsCommerceGetSync(char * accessToken,
	std::string externalBusinessId, 
	void(* handler)(IntegrationMetadata, Error, void* )
	, void* userData)
{
	return integrationsCommerceGetHelper(accessToken,
	externalBusinessId, 
	handler, userData, false);
}

static bool integrationsCommercePatchProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(IntegrationMetadata, Error, void* )
	= reinterpret_cast<void(*)(IntegrationMetadata, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	IntegrationMetadata out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("IntegrationMetadata")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "IntegrationMetadata", "IntegrationMetadata");
			json_node_free(pJson);

			if ("IntegrationMetadata" == "std::string") {
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

static bool integrationsCommercePatchHelper(char * accessToken,
	std::string externalBusinessId, std::shared_ptr<IntegrationRequestPatch> integrationRequestPatch, 
	void(* handler)(IntegrationMetadata, Error, void* )
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

	if (isprimitive("IntegrationRequestPatch")) {
		node = converttoJson(&integrationRequestPatch, "IntegrationRequestPatch", "");
	}
	
	char *jsonStr =  integrationRequestPatch.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/integrations/commerce/{external_business_id}");
	int pos;

	string s_externalBusinessId("{");
	s_externalBusinessId.append("external_business_id");
	s_externalBusinessId.append("}");
	pos = url.find(s_externalBusinessId);
	url.erase(pos, s_externalBusinessId.length());
	url.insert(pos, stringify(&externalBusinessId, "std::string"));

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
		NetClient::easycurl(IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = integrationsCommercePatchProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), integrationsCommercePatchProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __IntegrationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool IntegrationsManager::integrationsCommercePatchAsync(char * accessToken,
	std::string externalBusinessId, std::shared_ptr<IntegrationRequestPatch> integrationRequestPatch, 
	void(* handler)(IntegrationMetadata, Error, void* )
	, void* userData)
{
	return integrationsCommercePatchHelper(accessToken,
	externalBusinessId, integrationRequestPatch, 
	handler, userData, true);
}

bool IntegrationsManager::integrationsCommercePatchSync(char * accessToken,
	std::string externalBusinessId, std::shared_ptr<IntegrationRequestPatch> integrationRequestPatch, 
	void(* handler)(IntegrationMetadata, Error, void* )
	, void* userData)
{
	return integrationsCommercePatchHelper(accessToken,
	externalBusinessId, integrationRequestPatch, 
	handler, userData, false);
}

static bool integrationsCommercePostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(IntegrationMetadata, Error, void* )
	= reinterpret_cast<void(*)(IntegrationMetadata, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	IntegrationMetadata out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("IntegrationMetadata")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "IntegrationMetadata", "IntegrationMetadata");
			json_node_free(pJson);

			if ("IntegrationMetadata" == "std::string") {
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

static bool integrationsCommercePostHelper(char * accessToken,
	std::shared_ptr<IntegrationRequest> integrationRequest, 
	void(* handler)(IntegrationMetadata, Error, void* )
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

	if (isprimitive("IntegrationRequest")) {
		node = converttoJson(&integrationRequest, "IntegrationRequest", "");
	}
	
	char *jsonStr =  integrationRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/integrations/commerce");
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
		NetClient::easycurl(IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = integrationsCommercePostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), integrationsCommercePostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __IntegrationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool IntegrationsManager::integrationsCommercePostAsync(char * accessToken,
	std::shared_ptr<IntegrationRequest> integrationRequest, 
	void(* handler)(IntegrationMetadata, Error, void* )
	, void* userData)
{
	return integrationsCommercePostHelper(accessToken,
	integrationRequest, 
	handler, userData, true);
}

bool IntegrationsManager::integrationsCommercePostSync(char * accessToken,
	std::shared_ptr<IntegrationRequest> integrationRequest, 
	void(* handler)(IntegrationMetadata, Error, void* )
	, void* userData)
{
	return integrationsCommercePostHelper(accessToken,
	integrationRequest, 
	handler, userData, false);
}

static bool integrationsGetByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(IntegrationRecord, Error, void* )
	= reinterpret_cast<void(*)(IntegrationRecord, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	IntegrationRecord out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("IntegrationRecord")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "IntegrationRecord", "IntegrationRecord");
			json_node_free(pJson);

			if ("IntegrationRecord" == "std::string") {
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

static bool integrationsGetByIdHelper(char * accessToken,
	std::string id, 
	void(* handler)(IntegrationRecord, Error, void* )
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

	string url("/integrations/{id}");
	int pos;

	string s_id("{");
	s_id.append("id");
	s_id.append("}");
	pos = url.find(s_id);
	url.erase(pos, s_id.length());
	url.insert(pos, stringify(&id, "std::string"));

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
		NetClient::easycurl(IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = integrationsGetByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), integrationsGetByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __IntegrationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool IntegrationsManager::integrationsGetByIdAsync(char * accessToken,
	std::string id, 
	void(* handler)(IntegrationRecord, Error, void* )
	, void* userData)
{
	return integrationsGetByIdHelper(accessToken,
	id, 
	handler, userData, true);
}

bool IntegrationsManager::integrationsGetByIdSync(char * accessToken,
	std::string id, 
	void(* handler)(IntegrationRecord, Error, void* )
	, void* userData)
{
	return integrationsGetByIdHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool integrationsGetListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Integrations_get_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Integrations_get_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Integrations_get_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Integrations_get_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Integrations_get_list_200_response", "Integrations_get_list_200_response");
			json_node_free(pJson);

			if ("Integrations_get_list_200_response" == "std::string") {
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

static bool integrationsGetListHelper(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Integrations_get_list_200_response, Error, void* )
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

	string url("/integrations");
	int pos;


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
		NetClient::easycurl(IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = integrationsGetListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), integrationsGetListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __IntegrationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool IntegrationsManager::integrationsGetListAsync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Integrations_get_list_200_response, Error, void* )
	, void* userData)
{
	return integrationsGetListHelper(accessToken,
	bookmark, pageSize, 
	handler, userData, true);
}

bool IntegrationsManager::integrationsGetListSync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Integrations_get_list_200_response, Error, void* )
	, void* userData)
{
	return integrationsGetListHelper(accessToken,
	bookmark, pageSize, 
	handler, userData, false);
}

static bool integrationsLogsPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(IntegrationLogsSuccessResponse, Error, void* )
	= reinterpret_cast<void(*)(IntegrationLogsSuccessResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	IntegrationLogsSuccessResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("IntegrationLogsSuccessResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "IntegrationLogsSuccessResponse", "IntegrationLogsSuccessResponse");
			json_node_free(pJson);

			if ("IntegrationLogsSuccessResponse" == "std::string") {
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

static bool integrationsLogsPostHelper(char * accessToken,
	std::shared_ptr<IntegrationLogsRequest> integrationLogsRequest, 
	void(* handler)(IntegrationLogsSuccessResponse, Error, void* )
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

	if (isprimitive("IntegrationLogsRequest")) {
		node = converttoJson(&integrationLogsRequest, "IntegrationLogsRequest", "");
	}
	
	char *jsonStr =  integrationLogsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/integrations/logs");
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
		NetClient::easycurl(IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = integrationsLogsPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (IntegrationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), integrationsLogsPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __IntegrationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool IntegrationsManager::integrationsLogsPostAsync(char * accessToken,
	std::shared_ptr<IntegrationLogsRequest> integrationLogsRequest, 
	void(* handler)(IntegrationLogsSuccessResponse, Error, void* )
	, void* userData)
{
	return integrationsLogsPostHelper(accessToken,
	integrationLogsRequest, 
	handler, userData, true);
}

bool IntegrationsManager::integrationsLogsPostSync(char * accessToken,
	std::shared_ptr<IntegrationLogsRequest> integrationLogsRequest, 
	void(* handler)(IntegrationLogsSuccessResponse, Error, void* )
	, void* userData)
{
	return integrationsLogsPostHelper(accessToken,
	integrationLogsRequest, 
	handler, userData, false);
}

