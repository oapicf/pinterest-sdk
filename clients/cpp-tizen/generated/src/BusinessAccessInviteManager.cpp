#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "BusinessAccessInviteManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


BusinessAccessInviteManager::BusinessAccessInviteManager()
{

}

BusinessAccessInviteManager::~BusinessAccessInviteManager()
{

}

static gboolean __BusinessAccessInviteManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __BusinessAccessInviteManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__BusinessAccessInviteManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool assetAccessRequestsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateAssetAccessRequestResponse, Error, void* )
	= reinterpret_cast<void(*)(CreateAssetAccessRequestResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateAssetAccessRequestResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateAssetAccessRequestResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateAssetAccessRequestResponse", "CreateAssetAccessRequestResponse");
			json_node_free(pJson);

			if ("CreateAssetAccessRequestResponse" == "std::string") {
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

static bool assetAccessRequestsCreateHelper(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetAccessRequestBody> createAssetAccessRequestBody, 
	void(* handler)(CreateAssetAccessRequestResponse, Error, void* )
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

	if (isprimitive("CreateAssetAccessRequestBody")) {
		node = converttoJson(&createAssetAccessRequestBody, "CreateAssetAccessRequestBody", "");
	}
	
	char *jsonStr =  createAssetAccessRequestBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/requests/assets/access");
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
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(BusinessAccessInviteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = assetAccessRequestsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessInviteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), assetAccessRequestsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessInviteManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessInviteManager::assetAccessRequestsCreateAsync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetAccessRequestBody> createAssetAccessRequestBody, 
	void(* handler)(CreateAssetAccessRequestResponse, Error, void* )
	, void* userData)
{
	return assetAccessRequestsCreateHelper(accessToken,
	businessId, createAssetAccessRequestBody, 
	handler, userData, true);
}

bool BusinessAccessInviteManager::assetAccessRequestsCreateSync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetAccessRequestBody> createAssetAccessRequestBody, 
	void(* handler)(CreateAssetAccessRequestResponse, Error, void* )
	, void* userData)
{
	return assetAccessRequestsCreateHelper(accessToken,
	businessId, createAssetAccessRequestBody, 
	handler, userData, false);
}

static bool cancelInvitesOrRequestsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteInvitesResultsResponseArray, Error, void* )
	= reinterpret_cast<void(*)(DeleteInvitesResultsResponseArray, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteInvitesResultsResponseArray out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteInvitesResultsResponseArray")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteInvitesResultsResponseArray", "DeleteInvitesResultsResponseArray");
			json_node_free(pJson);

			if ("DeleteInvitesResultsResponseArray" == "std::string") {
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

static bool cancelInvitesOrRequestsHelper(char * accessToken,
	std::string businessId, std::shared_ptr<CancelInvitesBody> cancelInvitesBody, 
	void(* handler)(DeleteInvitesResultsResponseArray, Error, void* )
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

	if (isprimitive("CancelInvitesBody")) {
		node = converttoJson(&cancelInvitesBody, "CancelInvitesBody", "");
	}
	
	char *jsonStr =  cancelInvitesBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/invites");
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
		NetClient::easycurl(BusinessAccessInviteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = cancelInvitesOrRequestsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessInviteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), cancelInvitesOrRequestsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessInviteManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessInviteManager::cancelInvitesOrRequestsAsync(char * accessToken,
	std::string businessId, std::shared_ptr<CancelInvitesBody> cancelInvitesBody, 
	void(* handler)(DeleteInvitesResultsResponseArray, Error, void* )
	, void* userData)
{
	return cancelInvitesOrRequestsHelper(accessToken,
	businessId, cancelInvitesBody, 
	handler, userData, true);
}

bool BusinessAccessInviteManager::cancelInvitesOrRequestsSync(char * accessToken,
	std::string businessId, std::shared_ptr<CancelInvitesBody> cancelInvitesBody, 
	void(* handler)(DeleteInvitesResultsResponseArray, Error, void* )
	, void* userData)
{
	return cancelInvitesOrRequestsHelper(accessToken,
	businessId, cancelInvitesBody, 
	handler, userData, false);
}

static bool createAssetInvitesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdateInvitesResultsResponseArray, Error, void* )
	= reinterpret_cast<void(*)(UpdateInvitesResultsResponseArray, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdateInvitesResultsResponseArray out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdateInvitesResultsResponseArray")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdateInvitesResultsResponseArray", "UpdateInvitesResultsResponseArray");
			json_node_free(pJson);

			if ("UpdateInvitesResultsResponseArray" == "std::string") {
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

static bool createAssetInvitesHelper(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetInvitesRequest> createAssetInvitesRequest, 
	void(* handler)(UpdateInvitesResultsResponseArray, Error, void* )
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

	if (isprimitive("CreateAssetInvitesRequest")) {
		node = converttoJson(&createAssetInvitesRequest, "CreateAssetInvitesRequest", "");
	}
	
	char *jsonStr =  createAssetInvitesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/invites/assets/access");
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
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(BusinessAccessInviteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createAssetInvitesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessInviteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createAssetInvitesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessInviteManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessInviteManager::createAssetInvitesAsync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetInvitesRequest> createAssetInvitesRequest, 
	void(* handler)(UpdateInvitesResultsResponseArray, Error, void* )
	, void* userData)
{
	return createAssetInvitesHelper(accessToken,
	businessId, createAssetInvitesRequest, 
	handler, userData, true);
}

bool BusinessAccessInviteManager::createAssetInvitesSync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetInvitesRequest> createAssetInvitesRequest, 
	void(* handler)(UpdateInvitesResultsResponseArray, Error, void* )
	, void* userData)
{
	return createAssetInvitesHelper(accessToken,
	businessId, createAssetInvitesRequest, 
	handler, userData, false);
}

static bool createMembershipOrPartnershipInvitesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateInvitesResultsResponseArray, Error, void* )
	= reinterpret_cast<void(*)(CreateInvitesResultsResponseArray, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateInvitesResultsResponseArray out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateInvitesResultsResponseArray")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateInvitesResultsResponseArray", "CreateInvitesResultsResponseArray");
			json_node_free(pJson);

			if ("CreateInvitesResultsResponseArray" == "std::string") {
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

static bool createMembershipOrPartnershipInvitesHelper(char * accessToken,
	std::string businessId, std::shared_ptr<CreateMembershipOrPartnershipInvitesBody> createMembershipOrPartnershipInvitesBody, 
	void(* handler)(CreateInvitesResultsResponseArray, Error, void* )
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

	if (isprimitive("CreateMembershipOrPartnershipInvitesBody")) {
		node = converttoJson(&createMembershipOrPartnershipInvitesBody, "CreateMembershipOrPartnershipInvitesBody", "");
	}
	
	char *jsonStr =  createMembershipOrPartnershipInvitesBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/invites");
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
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(BusinessAccessInviteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createMembershipOrPartnershipInvitesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessInviteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createMembershipOrPartnershipInvitesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessInviteManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessInviteManager::createMembershipOrPartnershipInvitesAsync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateMembershipOrPartnershipInvitesBody> createMembershipOrPartnershipInvitesBody, 
	void(* handler)(CreateInvitesResultsResponseArray, Error, void* )
	, void* userData)
{
	return createMembershipOrPartnershipInvitesHelper(accessToken,
	businessId, createMembershipOrPartnershipInvitesBody, 
	handler, userData, true);
}

bool BusinessAccessInviteManager::createMembershipOrPartnershipInvitesSync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateMembershipOrPartnershipInvitesBody> createMembershipOrPartnershipInvitesBody, 
	void(* handler)(CreateInvitesResultsResponseArray, Error, void* )
	, void* userData)
{
	return createMembershipOrPartnershipInvitesHelper(accessToken,
	businessId, createMembershipOrPartnershipInvitesBody, 
	handler, userData, false);
}

static bool getInvitesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Get_invites_200_response, Error, void* )
	= reinterpret_cast<void(*)(Get_invites_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Get_invites_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Get_invites_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Get_invites_200_response", "Get_invites_200_response");
			json_node_free(pJson);

			if ("Get_invites_200_response" == "std::string") {
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

static bool getInvitesHelper(char * accessToken,
	std::string businessId, bool isMember, std::list<std::string> inviteStatus, InviteType inviteType, std::string bookmark, int pageSize, 
	void(* handler)(Get_invites_200_response, Error, void* )
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
	

	itemAtq = stringify(&isMember, "bool");
	queryParams.insert(pair<string, string>("is_member", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("is_member");
	}

	for (std::list
	<std::string>::iterator queryIter = inviteStatus.begin(); queryIter != inviteStatus.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("inviteStatus", itemAt));
	}
	

	itemAtq = stringify(&inviteType, "InviteType");
	queryParams.insert(pair<string, string>("invite_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("invite_type");
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

	string url("/businesses/{business_id}/invites");
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
		NetClient::easycurl(BusinessAccessInviteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getInvitesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessInviteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getInvitesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessInviteManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessInviteManager::getInvitesAsync(char * accessToken,
	std::string businessId, bool isMember, std::list<std::string> inviteStatus, InviteType inviteType, std::string bookmark, int pageSize, 
	void(* handler)(Get_invites_200_response, Error, void* )
	, void* userData)
{
	return getInvitesHelper(accessToken,
	businessId, isMember, inviteStatus, inviteType, bookmark, pageSize, 
	handler, userData, true);
}

bool BusinessAccessInviteManager::getInvitesSync(char * accessToken,
	std::string businessId, bool isMember, std::list<std::string> inviteStatus, InviteType inviteType, std::string bookmark, int pageSize, 
	void(* handler)(Get_invites_200_response, Error, void* )
	, void* userData)
{
	return getInvitesHelper(accessToken,
	businessId, isMember, inviteStatus, inviteType, bookmark, pageSize, 
	handler, userData, false);
}

static bool respondBusinessAccessInvitesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(RespondToInvitesResponseArray, Error, void* )
	= reinterpret_cast<void(*)(RespondToInvitesResponseArray, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	RespondToInvitesResponseArray out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("RespondToInvitesResponseArray")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "RespondToInvitesResponseArray", "RespondToInvitesResponseArray");
			json_node_free(pJson);

			if ("RespondToInvitesResponseArray" == "std::string") {
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

static bool respondBusinessAccessInvitesHelper(char * accessToken,
	std::shared_ptr<AuthRespondInvitesBody> authRespondInvitesBody, 
	void(* handler)(RespondToInvitesResponseArray, Error, void* )
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

	if (isprimitive("AuthRespondInvitesBody")) {
		node = converttoJson(&authRespondInvitesBody, "AuthRespondInvitesBody", "");
	}
	
	char *jsonStr =  authRespondInvitesBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/invites");
	int pos;


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
		NetClient::easycurl(BusinessAccessInviteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = respondBusinessAccessInvitesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessInviteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), respondBusinessAccessInvitesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessInviteManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessInviteManager::respondBusinessAccessInvitesAsync(char * accessToken,
	std::shared_ptr<AuthRespondInvitesBody> authRespondInvitesBody, 
	void(* handler)(RespondToInvitesResponseArray, Error, void* )
	, void* userData)
{
	return respondBusinessAccessInvitesHelper(accessToken,
	authRespondInvitesBody, 
	handler, userData, true);
}

bool BusinessAccessInviteManager::respondBusinessAccessInvitesSync(char * accessToken,
	std::shared_ptr<AuthRespondInvitesBody> authRespondInvitesBody, 
	void(* handler)(RespondToInvitesResponseArray, Error, void* )
	, void* userData)
{
	return respondBusinessAccessInvitesHelper(accessToken,
	authRespondInvitesBody, 
	handler, userData, false);
}

