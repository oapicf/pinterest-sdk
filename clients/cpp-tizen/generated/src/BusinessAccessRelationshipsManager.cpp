#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "BusinessAccessRelationshipsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


BusinessAccessRelationshipsManager::BusinessAccessRelationshipsManager()
{

}

BusinessAccessRelationshipsManager::~BusinessAccessRelationshipsManager()
{

}

static gboolean __BusinessAccessRelationshipsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __BusinessAccessRelationshipsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__BusinessAccessRelationshipsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool brandAccountsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Brand_accounts_create_200_response, Error, void* )
	= reinterpret_cast<void(*)(Brand_accounts_create_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Brand_accounts_create_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Brand_accounts_create_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Brand_accounts_create_200_response", "Brand_accounts_create_200_response");
			json_node_free(pJson);

			if ("Brand_accounts_create_200_response" == "std::string") {
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

static bool brandAccountsCreateHelper(char * accessToken,
	std::string businessHierarchyId, std::shared_ptr<Brand_accounts_create_request> brandAccountsCreateRequest, 
	void(* handler)(Brand_accounts_create_200_response, Error, void* )
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

	if (isprimitive("Brand_accounts_create_request")) {
		node = converttoJson(&brandAccountsCreateRequest, "Brand_accounts_create_request", "");
	}
	
	char *jsonStr =  brandAccountsCreateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts");
	int pos;

	string s_businessHierarchyId("{");
	s_businessHierarchyId.append("business_hierarchy_id");
	s_businessHierarchyId.append("}");
	pos = url.find(s_businessHierarchyId);
	url.erase(pos, s_businessHierarchyId.length());
	url.insert(pos, stringify(&businessHierarchyId, "std::string"));

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
		NetClient::easycurl(BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = brandAccountsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), brandAccountsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessRelationshipsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessRelationshipsManager::brandAccountsCreateAsync(char * accessToken,
	std::string businessHierarchyId, std::shared_ptr<Brand_accounts_create_request> brandAccountsCreateRequest, 
	void(* handler)(Brand_accounts_create_200_response, Error, void* )
	, void* userData)
{
	return brandAccountsCreateHelper(accessToken,
	businessHierarchyId, brandAccountsCreateRequest, 
	handler, userData, true);
}

bool BusinessAccessRelationshipsManager::brandAccountsCreateSync(char * accessToken,
	std::string businessHierarchyId, std::shared_ptr<Brand_accounts_create_request> brandAccountsCreateRequest, 
	void(* handler)(Brand_accounts_create_200_response, Error, void* )
	, void* userData)
{
	return brandAccountsCreateHelper(accessToken,
	businessHierarchyId, brandAccountsCreateRequest, 
	handler, userData, false);
}

static bool brandAccountsUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Brand_accounts_create_200_response, Error, void* )
	= reinterpret_cast<void(*)(Brand_accounts_create_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Brand_accounts_create_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Brand_accounts_create_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Brand_accounts_create_200_response", "Brand_accounts_create_200_response");
			json_node_free(pJson);

			if ("Brand_accounts_create_200_response" == "std::string") {
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

static bool brandAccountsUpdateHelper(char * accessToken,
	std::string businessHierarchyId, std::string brandAccountId, std::shared_ptr<Brand_accounts_update_request> brandAccountsUpdateRequest, 
	void(* handler)(Brand_accounts_create_200_response, Error, void* )
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

	if (isprimitive("Brand_accounts_update_request")) {
		node = converttoJson(&brandAccountsUpdateRequest, "Brand_accounts_update_request", "");
	}
	
	char *jsonStr =  brandAccountsUpdateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}");
	int pos;

	string s_businessHierarchyId("{");
	s_businessHierarchyId.append("business_hierarchy_id");
	s_businessHierarchyId.append("}");
	pos = url.find(s_businessHierarchyId);
	url.erase(pos, s_businessHierarchyId.length());
	url.insert(pos, stringify(&businessHierarchyId, "std::string"));
	string s_brandAccountId("{");
	s_brandAccountId.append("brand_account_id");
	s_brandAccountId.append("}");
	pos = url.find(s_brandAccountId);
	url.erase(pos, s_brandAccountId.length());
	url.insert(pos, stringify(&brandAccountId, "std::string"));

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
		NetClient::easycurl(BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = brandAccountsUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), brandAccountsUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessRelationshipsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessRelationshipsManager::brandAccountsUpdateAsync(char * accessToken,
	std::string businessHierarchyId, std::string brandAccountId, std::shared_ptr<Brand_accounts_update_request> brandAccountsUpdateRequest, 
	void(* handler)(Brand_accounts_create_200_response, Error, void* )
	, void* userData)
{
	return brandAccountsUpdateHelper(accessToken,
	businessHierarchyId, brandAccountId, brandAccountsUpdateRequest, 
	handler, userData, true);
}

bool BusinessAccessRelationshipsManager::brandAccountsUpdateSync(char * accessToken,
	std::string businessHierarchyId, std::string brandAccountId, std::shared_ptr<Brand_accounts_update_request> brandAccountsUpdateRequest, 
	void(* handler)(Brand_accounts_create_200_response, Error, void* )
	, void* userData)
{
	return brandAccountsUpdateHelper(accessToken,
	businessHierarchyId, brandAccountId, brandAccountsUpdateRequest, 
	handler, userData, false);
}

static bool deleteBusinessMembershipProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeletedMembersResponse, Error, void* )
	= reinterpret_cast<void(*)(DeletedMembersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeletedMembersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeletedMembersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeletedMembersResponse", "DeletedMembersResponse");
			json_node_free(pJson);

			if ("DeletedMembersResponse" == "std::string") {
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

static bool deleteBusinessMembershipHelper(char * accessToken,
	std::string businessId, std::shared_ptr<MembersToDeleteBody> membersToDeleteBody, 
	void(* handler)(DeletedMembersResponse, Error, void* )
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

	if (isprimitive("MembersToDeleteBody")) {
		node = converttoJson(&membersToDeleteBody, "MembersToDeleteBody", "");
	}
	
	char *jsonStr =  membersToDeleteBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/members");
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
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteBusinessMembershipProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteBusinessMembershipProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessRelationshipsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessRelationshipsManager::deleteBusinessMembershipAsync(char * accessToken,
	std::string businessId, std::shared_ptr<MembersToDeleteBody> membersToDeleteBody, 
	void(* handler)(DeletedMembersResponse, Error, void* )
	, void* userData)
{
	return deleteBusinessMembershipHelper(accessToken,
	businessId, membersToDeleteBody, 
	handler, userData, true);
}

bool BusinessAccessRelationshipsManager::deleteBusinessMembershipSync(char * accessToken,
	std::string businessId, std::shared_ptr<MembersToDeleteBody> membersToDeleteBody, 
	void(* handler)(DeletedMembersResponse, Error, void* )
	, void* userData)
{
	return deleteBusinessMembershipHelper(accessToken,
	businessId, membersToDeleteBody, 
	handler, userData, false);
}

static bool deleteBusinessPartnersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeletePartnersResponse, Error, void* )
	= reinterpret_cast<void(*)(DeletePartnersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeletePartnersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeletePartnersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeletePartnersResponse", "DeletePartnersResponse");
			json_node_free(pJson);

			if ("DeletePartnersResponse" == "std::string") {
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

static bool deleteBusinessPartnersHelper(char * accessToken,
	std::string businessId, std::shared_ptr<DeletePartnersRequest> deletePartnersRequest, 
	void(* handler)(DeletePartnersResponse, Error, void* )
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

	if (isprimitive("DeletePartnersRequest")) {
		node = converttoJson(&deletePartnersRequest, "DeletePartnersRequest", "");
	}
	
	char *jsonStr =  deletePartnersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/partners");
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
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteBusinessPartnersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteBusinessPartnersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessRelationshipsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessRelationshipsManager::deleteBusinessPartnersAsync(char * accessToken,
	std::string businessId, std::shared_ptr<DeletePartnersRequest> deletePartnersRequest, 
	void(* handler)(DeletePartnersResponse, Error, void* )
	, void* userData)
{
	return deleteBusinessPartnersHelper(accessToken,
	businessId, deletePartnersRequest, 
	handler, userData, true);
}

bool BusinessAccessRelationshipsManager::deleteBusinessPartnersSync(char * accessToken,
	std::string businessId, std::shared_ptr<DeletePartnersRequest> deletePartnersRequest, 
	void(* handler)(DeletePartnersResponse, Error, void* )
	, void* userData)
{
	return deleteBusinessPartnersHelper(accessToken,
	businessId, deletePartnersRequest, 
	handler, userData, false);
}

static bool getBusinessEmployersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Get_business_employers_200_response, Error, void* )
	= reinterpret_cast<void(*)(Get_business_employers_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Get_business_employers_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Get_business_employers_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Get_business_employers_200_response", "Get_business_employers_200_response");
			json_node_free(pJson);

			if ("Get_business_employers_200_response" == "std::string") {
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

static bool getBusinessEmployersHelper(char * accessToken,
	int pageSize, std::string bookmark, 
	void(* handler)(Get_business_employers_200_response, Error, void* )
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

	string url("/businesses/employers");
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
		NetClient::easycurl(BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getBusinessEmployersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getBusinessEmployersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessRelationshipsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessRelationshipsManager::getBusinessEmployersAsync(char * accessToken,
	int pageSize, std::string bookmark, 
	void(* handler)(Get_business_employers_200_response, Error, void* )
	, void* userData)
{
	return getBusinessEmployersHelper(accessToken,
	pageSize, bookmark, 
	handler, userData, true);
}

bool BusinessAccessRelationshipsManager::getBusinessEmployersSync(char * accessToken,
	int pageSize, std::string bookmark, 
	void(* handler)(Get_business_employers_200_response, Error, void* )
	, void* userData)
{
	return getBusinessEmployersHelper(accessToken,
	pageSize, bookmark, 
	handler, userData, false);
}

static bool getBusinessMembersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Get_business_members_200_response, Error, void* )
	= reinterpret_cast<void(*)(Get_business_members_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Get_business_members_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Get_business_members_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Get_business_members_200_response", "Get_business_members_200_response");
			json_node_free(pJson);

			if ("Get_business_members_200_response" == "std::string") {
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

static bool getBusinessMembersHelper(char * accessToken,
	std::string businessId, bool fetchSystemUsers, bool assetsSummary, std::list<MemberBusinessRole> businessRoles, std::string memberIds, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Get_business_members_200_response, Error, void* )
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
	

	itemAtq = stringify(&fetchSystemUsers, "bool");
	queryParams.insert(pair<string, string>("fetch_system_users", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("fetch_system_users");
	}


	itemAtq = stringify(&assetsSummary, "bool");
	queryParams.insert(pair<string, string>("assets_summary", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("assets_summary");
	}

	for (std::list
	<MemberBusinessRole>::iterator queryIter = businessRoles.begin(); queryIter != businessRoles.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "MemberBusinessRole");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("businessRoles", itemAt));
	}
	

	itemAtq = stringify(&memberIds, "std::string");
	queryParams.insert(pair<string, string>("member_ids", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("member_ids");
	}


	itemAtq = stringify(&startIndex, "int");
	queryParams.insert(pair<string, string>("start_index", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("start_index");
	}


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

	string url("/businesses/{business_id}/members");
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
		NetClient::easycurl(BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getBusinessMembersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getBusinessMembersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessRelationshipsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessRelationshipsManager::getBusinessMembersAsync(char * accessToken,
	std::string businessId, bool fetchSystemUsers, bool assetsSummary, std::list<MemberBusinessRole> businessRoles, std::string memberIds, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Get_business_members_200_response, Error, void* )
	, void* userData)
{
	return getBusinessMembersHelper(accessToken,
	businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize, 
	handler, userData, true);
}

bool BusinessAccessRelationshipsManager::getBusinessMembersSync(char * accessToken,
	std::string businessId, bool fetchSystemUsers, bool assetsSummary, std::list<MemberBusinessRole> businessRoles, std::string memberIds, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Get_business_members_200_response, Error, void* )
	, void* userData)
{
	return getBusinessMembersHelper(accessToken,
	businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize, 
	handler, userData, false);
}

static bool getBusinessPartnersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Get_business_partners_200_response, Error, void* )
	= reinterpret_cast<void(*)(Get_business_partners_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Get_business_partners_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Get_business_partners_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Get_business_partners_200_response", "Get_business_partners_200_response");
			json_node_free(pJson);

			if ("Get_business_partners_200_response" == "std::string") {
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

static bool getBusinessPartnersHelper(char * accessToken,
	std::string businessId, bool assetsSummary, PartnerType partnerType, std::string partnerIds, int startIndex, int pageSize, std::string bookmark, 
	void(* handler)(Get_business_partners_200_response, Error, void* )
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
	

	itemAtq = stringify(&assetsSummary, "bool");
	queryParams.insert(pair<string, string>("assets_summary", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("assets_summary");
	}


	itemAtq = stringify(&partnerType, "PartnerType");
	queryParams.insert(pair<string, string>("partner_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("partner_type");
	}


	itemAtq = stringify(&partnerIds, "std::string");
	queryParams.insert(pair<string, string>("partner_ids", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("partner_ids");
	}


	itemAtq = stringify(&startIndex, "int");
	queryParams.insert(pair<string, string>("start_index", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("start_index");
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

	string url("/businesses/{business_id}/partners");
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
		NetClient::easycurl(BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getBusinessPartnersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getBusinessPartnersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessRelationshipsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessRelationshipsManager::getBusinessPartnersAsync(char * accessToken,
	std::string businessId, bool assetsSummary, PartnerType partnerType, std::string partnerIds, int startIndex, int pageSize, std::string bookmark, 
	void(* handler)(Get_business_partners_200_response, Error, void* )
	, void* userData)
{
	return getBusinessPartnersHelper(accessToken,
	businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark, 
	handler, userData, true);
}

bool BusinessAccessRelationshipsManager::getBusinessPartnersSync(char * accessToken,
	std::string businessId, bool assetsSummary, PartnerType partnerType, std::string partnerIds, int startIndex, int pageSize, std::string bookmark, 
	void(* handler)(Get_business_partners_200_response, Error, void* )
	, void* userData)
{
	return getBusinessPartnersHelper(accessToken,
	businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark, 
	handler, userData, false);
}

static bool systemUserUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool systemUserUpdateHelper(char * accessToken,
	std::string businessId, std::string systemUserId, std::shared_ptr<System_user_update_request> systemUserUpdateRequest, 
	
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

	if (isprimitive("System_user_update_request")) {
		node = converttoJson(&systemUserUpdateRequest, "System_user_update_request", "");
	}
	
	char *jsonStr =  systemUserUpdateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/system_users/{system_user_id}");
	int pos;

	string s_businessId("{");
	s_businessId.append("business_id");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "std::string"));
	string s_systemUserId("{");
	s_systemUserId.append("system_user_id");
	s_systemUserId.append("}");
	pos = url.find(s_systemUserId);
	url.erase(pos, s_systemUserId.length());
	url.insert(pos, stringify(&systemUserId, "std::string"));

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
		NetClient::easycurl(BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = systemUserUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), systemUserUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessRelationshipsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessRelationshipsManager::systemUserUpdateAsync(char * accessToken,
	std::string businessId, std::string systemUserId, std::shared_ptr<System_user_update_request> systemUserUpdateRequest, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return systemUserUpdateHelper(accessToken,
	businessId, systemUserId, systemUserUpdateRequest, 
	handler, userData, true);
}

bool BusinessAccessRelationshipsManager::systemUserUpdateSync(char * accessToken,
	std::string businessId, std::string systemUserId, std::shared_ptr<System_user_update_request> systemUserUpdateRequest, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return systemUserUpdateHelper(accessToken,
	businessId, systemUserId, systemUserUpdateRequest, 
	handler, userData, false);
}

static bool updateBusinessMembershipsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdateMemberResultsResponseArray, Error, void* )
	= reinterpret_cast<void(*)(UpdateMemberResultsResponseArray, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdateMemberResultsResponseArray out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdateMemberResultsResponseArray")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdateMemberResultsResponseArray", "UpdateMemberResultsResponseArray");
			json_node_free(pJson);

			if ("UpdateMemberResultsResponseArray" == "std::string") {
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

static bool updateBusinessMembershipsHelper(char * accessToken,
	std::string businessId, std::list<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody, 
	void(* handler)(UpdateMemberResultsResponseArray, Error, void* )
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
	//TODO: Map Container
	if (isprimitive("UpdateMemberBusinessRoleBody")) {
		node = converttoJson(&updateMemberBusinessRoleBody, "UpdateMemberBusinessRoleBody", "array");
	} else {
		node = json_node_alloc();
		json_array = json_array_new();
		for (std::list
			<UpdateMemberBusinessRoleBody>::iterator bodyIter = updateMemberBusinessRoleBody.begin(); bodyIter != updateMemberBusinessRoleBody.end(); ++bodyIter) {
			UpdateMemberBusinessRoleBody itemAt = (*bodyIter);
			char *jsonStr =  itemAt.toJson();
			JsonNode *node_temp = json_from_string(jsonStr, NULL);
			g_free(static_cast<gpointer>(jsonStr));
			json_array_add_element(json_array, node_temp);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
	}
	




	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/members");
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
		NetClient::easycurl(BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateBusinessMembershipsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessRelationshipsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateBusinessMembershipsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessRelationshipsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessRelationshipsManager::updateBusinessMembershipsAsync(char * accessToken,
	std::string businessId, std::list<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody, 
	void(* handler)(UpdateMemberResultsResponseArray, Error, void* )
	, void* userData)
{
	return updateBusinessMembershipsHelper(accessToken,
	businessId, updateMemberBusinessRoleBody, 
	handler, userData, true);
}

bool BusinessAccessRelationshipsManager::updateBusinessMembershipsSync(char * accessToken,
	std::string businessId, std::list<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody, 
	void(* handler)(UpdateMemberResultsResponseArray, Error, void* )
	, void* userData)
{
	return updateBusinessMembershipsHelper(accessToken,
	businessId, updateMemberBusinessRoleBody, 
	handler, userData, false);
}

