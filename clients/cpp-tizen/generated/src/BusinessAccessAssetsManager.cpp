#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "BusinessAccessAssetsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


BusinessAccessAssetsManager::BusinessAccessAssetsManager()
{

}

BusinessAccessAssetsManager::~BusinessAccessAssetsManager()
{

}

static gboolean __BusinessAccessAssetsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __BusinessAccessAssetsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__BusinessAccessAssetsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool assetGroupCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateAssetGroupResponse, Error, void* )
	= reinterpret_cast<void(*)(CreateAssetGroupResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateAssetGroupResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateAssetGroupResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateAssetGroupResponse", "CreateAssetGroupResponse");
			json_node_free(pJson);

			if ("CreateAssetGroupResponse" == "std::string") {
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

static bool assetGroupCreateHelper(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetGroupBody> createAssetGroupBody, 
	void(* handler)(CreateAssetGroupResponse, Error, void* )
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

	if (isprimitive("CreateAssetGroupBody")) {
		node = converttoJson(&createAssetGroupBody, "CreateAssetGroupBody", "");
	}
	
	char *jsonStr =  createAssetGroupBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/asset_groups");
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
		NetClient::easycurl(BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = assetGroupCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), assetGroupCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessAssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessAssetsManager::assetGroupCreateAsync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetGroupBody> createAssetGroupBody, 
	void(* handler)(CreateAssetGroupResponse, Error, void* )
	, void* userData)
{
	return assetGroupCreateHelper(accessToken,
	businessId, createAssetGroupBody, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::assetGroupCreateSync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetGroupBody> createAssetGroupBody, 
	void(* handler)(CreateAssetGroupResponse, Error, void* )
	, void* userData)
{
	return assetGroupCreateHelper(accessToken,
	businessId, createAssetGroupBody, 
	handler, userData, false);
}

static bool assetGroupDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteAssetGroupResponse, Error, void* )
	= reinterpret_cast<void(*)(DeleteAssetGroupResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteAssetGroupResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteAssetGroupResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteAssetGroupResponse", "DeleteAssetGroupResponse");
			json_node_free(pJson);

			if ("DeleteAssetGroupResponse" == "std::string") {
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

static bool assetGroupDeleteHelper(char * accessToken,
	std::string businessId, std::shared_ptr<DeleteAssetGroupBody> deleteAssetGroupBody, 
	void(* handler)(DeleteAssetGroupResponse, Error, void* )
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

	if (isprimitive("DeleteAssetGroupBody")) {
		node = converttoJson(&deleteAssetGroupBody, "DeleteAssetGroupBody", "");
	}
	
	char *jsonStr =  deleteAssetGroupBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/asset_groups");
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
		NetClient::easycurl(BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = assetGroupDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), assetGroupDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessAssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessAssetsManager::assetGroupDeleteAsync(char * accessToken,
	std::string businessId, std::shared_ptr<DeleteAssetGroupBody> deleteAssetGroupBody, 
	void(* handler)(DeleteAssetGroupResponse, Error, void* )
	, void* userData)
{
	return assetGroupDeleteHelper(accessToken,
	businessId, deleteAssetGroupBody, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::assetGroupDeleteSync(char * accessToken,
	std::string businessId, std::shared_ptr<DeleteAssetGroupBody> deleteAssetGroupBody, 
	void(* handler)(DeleteAssetGroupResponse, Error, void* )
	, void* userData)
{
	return assetGroupDeleteHelper(accessToken,
	businessId, deleteAssetGroupBody, 
	handler, userData, false);
}

static bool assetGroupUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdateAssetGroupResponse, Error, void* )
	= reinterpret_cast<void(*)(UpdateAssetGroupResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdateAssetGroupResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdateAssetGroupResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdateAssetGroupResponse", "UpdateAssetGroupResponse");
			json_node_free(pJson);

			if ("UpdateAssetGroupResponse" == "std::string") {
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

static bool assetGroupUpdateHelper(char * accessToken,
	std::string businessId, std::shared_ptr<UpdateAssetGroupBody> updateAssetGroupBody, 
	void(* handler)(UpdateAssetGroupResponse, Error, void* )
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

	if (isprimitive("UpdateAssetGroupBody")) {
		node = converttoJson(&updateAssetGroupBody, "UpdateAssetGroupBody", "");
	}
	
	char *jsonStr =  updateAssetGroupBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/asset_groups");
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
		NetClient::easycurl(BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = assetGroupUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), assetGroupUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessAssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessAssetsManager::assetGroupUpdateAsync(char * accessToken,
	std::string businessId, std::shared_ptr<UpdateAssetGroupBody> updateAssetGroupBody, 
	void(* handler)(UpdateAssetGroupResponse, Error, void* )
	, void* userData)
{
	return assetGroupUpdateHelper(accessToken,
	businessId, updateAssetGroupBody, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::assetGroupUpdateSync(char * accessToken,
	std::string businessId, std::shared_ptr<UpdateAssetGroupBody> updateAssetGroupBody, 
	void(* handler)(UpdateAssetGroupResponse, Error, void* )
	, void* userData)
{
	return assetGroupUpdateHelper(accessToken,
	businessId, updateAssetGroupBody, 
	handler, userData, false);
}

static bool businessAssetMembersGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Business_asset_members_get_200_response, Error, void* )
	= reinterpret_cast<void(*)(Business_asset_members_get_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Business_asset_members_get_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Business_asset_members_get_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Business_asset_members_get_200_response", "Business_asset_members_get_200_response");
			json_node_free(pJson);

			if ("Business_asset_members_get_200_response" == "std::string") {
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

static bool businessAssetMembersGetHelper(char * accessToken,
	std::string businessId, std::string assetId, std::string bookmark, int pageSize, int startIndex, 
	void(* handler)(Business_asset_members_get_200_response, Error, void* )
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


	itemAtq = stringify(&startIndex, "int");
	queryParams.insert(pair<string, string>("start_index", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("start_index");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/businesses/{business_id}/assets/{asset_id}/members");
	int pos;

	string s_businessId("{");
	s_businessId.append("business_id");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "std::string"));
	string s_assetId("{");
	s_assetId.append("asset_id");
	s_assetId.append("}");
	pos = url.find(s_assetId);
	url.erase(pos, s_assetId.length());
	url.insert(pos, stringify(&assetId, "std::string"));

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
		NetClient::easycurl(BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = businessAssetMembersGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), businessAssetMembersGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessAssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessAssetsManager::businessAssetMembersGetAsync(char * accessToken,
	std::string businessId, std::string assetId, std::string bookmark, int pageSize, int startIndex, 
	void(* handler)(Business_asset_members_get_200_response, Error, void* )
	, void* userData)
{
	return businessAssetMembersGetHelper(accessToken,
	businessId, assetId, bookmark, pageSize, startIndex, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::businessAssetMembersGetSync(char * accessToken,
	std::string businessId, std::string assetId, std::string bookmark, int pageSize, int startIndex, 
	void(* handler)(Business_asset_members_get_200_response, Error, void* )
	, void* userData)
{
	return businessAssetMembersGetHelper(accessToken,
	businessId, assetId, bookmark, pageSize, startIndex, 
	handler, userData, false);
}

static bool businessAssetPartnersGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Business_asset_partners_get_200_response, Error, void* )
	= reinterpret_cast<void(*)(Business_asset_partners_get_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Business_asset_partners_get_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Business_asset_partners_get_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Business_asset_partners_get_200_response", "Business_asset_partners_get_200_response");
			json_node_free(pJson);

			if ("Business_asset_partners_get_200_response" == "std::string") {
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

static bool businessAssetPartnersGetHelper(char * accessToken,
	std::string businessId, std::string assetId, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_asset_partners_get_200_response, Error, void* )
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

	string url("/businesses/{business_id}/assets/{asset_id}/partners");
	int pos;

	string s_businessId("{");
	s_businessId.append("business_id");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "std::string"));
	string s_assetId("{");
	s_assetId.append("asset_id");
	s_assetId.append("}");
	pos = url.find(s_assetId);
	url.erase(pos, s_assetId.length());
	url.insert(pos, stringify(&assetId, "std::string"));

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
		NetClient::easycurl(BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = businessAssetPartnersGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), businessAssetPartnersGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessAssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessAssetsManager::businessAssetPartnersGetAsync(char * accessToken,
	std::string businessId, std::string assetId, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_asset_partners_get_200_response, Error, void* )
	, void* userData)
{
	return businessAssetPartnersGetHelper(accessToken,
	businessId, assetId, startIndex, bookmark, pageSize, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::businessAssetPartnersGetSync(char * accessToken,
	std::string businessId, std::string assetId, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_asset_partners_get_200_response, Error, void* )
	, void* userData)
{
	return businessAssetPartnersGetHelper(accessToken,
	businessId, assetId, startIndex, bookmark, pageSize, 
	handler, userData, false);
}

static bool businessAssetsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Business_assets_get_200_response, Error, void* )
	= reinterpret_cast<void(*)(Business_assets_get_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Business_assets_get_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Business_assets_get_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Business_assets_get_200_response", "Business_assets_get_200_response");
			json_node_free(pJson);

			if ("Business_assets_get_200_response" == "std::string") {
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

static bool businessAssetsGetHelper(char * accessToken,
	std::string businessId, std::list<PermissionsWithOwner> permissions, std::string childAssetId, std::string assetGroupId, std::string assetType, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_assets_get_200_response, Error, void* )
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
	
	for (std::list
	<PermissionsWithOwner>::iterator queryIter = permissions.begin(); queryIter != permissions.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "PermissionsWithOwner");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("permissions", itemAt));
	}
	

	itemAtq = stringify(&childAssetId, "std::string");
	queryParams.insert(pair<string, string>("child_asset_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("child_asset_id");
	}


	itemAtq = stringify(&assetGroupId, "std::string");
	queryParams.insert(pair<string, string>("asset_group_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("asset_group_id");
	}


	itemAtq = stringify(&assetType, "std::string");
	queryParams.insert(pair<string, string>("asset_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("asset_type");
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

	string url("/businesses/{business_id}/assets");
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
		NetClient::easycurl(BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = businessAssetsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), businessAssetsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessAssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessAssetsManager::businessAssetsGetAsync(char * accessToken,
	std::string businessId, std::list<PermissionsWithOwner> permissions, std::string childAssetId, std::string assetGroupId, std::string assetType, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_assets_get_200_response, Error, void* )
	, void* userData)
{
	return businessAssetsGetHelper(accessToken,
	businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::businessAssetsGetSync(char * accessToken,
	std::string businessId, std::list<PermissionsWithOwner> permissions, std::string childAssetId, std::string assetGroupId, std::string assetType, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_assets_get_200_response, Error, void* )
	, void* userData)
{
	return businessAssetsGetHelper(accessToken,
	businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize, 
	handler, userData, false);
}

static bool businessMemberAssetsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Business_member_assets_get_200_response, Error, void* )
	= reinterpret_cast<void(*)(Business_member_assets_get_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Business_member_assets_get_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Business_member_assets_get_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Business_member_assets_get_200_response", "Business_member_assets_get_200_response");
			json_node_free(pJson);

			if ("Business_member_assets_get_200_response" == "std::string") {
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

static bool businessMemberAssetsGetHelper(char * accessToken,
	std::string businessId, std::string memberId, std::string assetType, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_member_assets_get_200_response, Error, void* )
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
	

	itemAtq = stringify(&assetType, "std::string");
	queryParams.insert(pair<string, string>("asset_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("asset_type");
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

	string url("/businesses/{business_id}/members/{member_id}/assets");
	int pos;

	string s_businessId("{");
	s_businessId.append("business_id");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "std::string"));
	string s_memberId("{");
	s_memberId.append("member_id");
	s_memberId.append("}");
	pos = url.find(s_memberId);
	url.erase(pos, s_memberId.length());
	url.insert(pos, stringify(&memberId, "std::string"));

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
		NetClient::easycurl(BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = businessMemberAssetsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), businessMemberAssetsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessAssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessAssetsManager::businessMemberAssetsGetAsync(char * accessToken,
	std::string businessId, std::string memberId, std::string assetType, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_member_assets_get_200_response, Error, void* )
	, void* userData)
{
	return businessMemberAssetsGetHelper(accessToken,
	businessId, memberId, assetType, startIndex, bookmark, pageSize, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::businessMemberAssetsGetSync(char * accessToken,
	std::string businessId, std::string memberId, std::string assetType, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_member_assets_get_200_response, Error, void* )
	, void* userData)
{
	return businessMemberAssetsGetHelper(accessToken,
	businessId, memberId, assetType, startIndex, bookmark, pageSize, 
	handler, userData, false);
}

static bool businessMembersAssetAccessDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteMemberAccessResultsResponseArray, Error, void* )
	= reinterpret_cast<void(*)(DeleteMemberAccessResultsResponseArray, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteMemberAccessResultsResponseArray out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteMemberAccessResultsResponseArray")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteMemberAccessResultsResponseArray", "DeleteMemberAccessResultsResponseArray");
			json_node_free(pJson);

			if ("DeleteMemberAccessResultsResponseArray" == "std::string") {
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

static bool businessMembersAssetAccessDeleteHelper(char * accessToken,
	std::string businessId, std::shared_ptr<Business_members_asset_access_delete_request> businessMembersAssetAccessDeleteRequest, 
	void(* handler)(DeleteMemberAccessResultsResponseArray, Error, void* )
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

	if (isprimitive("Business_members_asset_access_delete_request")) {
		node = converttoJson(&businessMembersAssetAccessDeleteRequest, "Business_members_asset_access_delete_request", "");
	}
	
	char *jsonStr =  businessMembersAssetAccessDeleteRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/members/assets/access");
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
		NetClient::easycurl(BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = businessMembersAssetAccessDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), businessMembersAssetAccessDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessAssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessAssetsManager::businessMembersAssetAccessDeleteAsync(char * accessToken,
	std::string businessId, std::shared_ptr<Business_members_asset_access_delete_request> businessMembersAssetAccessDeleteRequest, 
	void(* handler)(DeleteMemberAccessResultsResponseArray, Error, void* )
	, void* userData)
{
	return businessMembersAssetAccessDeleteHelper(accessToken,
	businessId, businessMembersAssetAccessDeleteRequest, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::businessMembersAssetAccessDeleteSync(char * accessToken,
	std::string businessId, std::shared_ptr<Business_members_asset_access_delete_request> businessMembersAssetAccessDeleteRequest, 
	void(* handler)(DeleteMemberAccessResultsResponseArray, Error, void* )
	, void* userData)
{
	return businessMembersAssetAccessDeleteHelper(accessToken,
	businessId, businessMembersAssetAccessDeleteRequest, 
	handler, userData, false);
}

static bool businessMembersAssetAccessUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdateMemberAssetsResultsResponseArray, Error, void* )
	= reinterpret_cast<void(*)(UpdateMemberAssetsResultsResponseArray, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdateMemberAssetsResultsResponseArray out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdateMemberAssetsResultsResponseArray")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdateMemberAssetsResultsResponseArray", "UpdateMemberAssetsResultsResponseArray");
			json_node_free(pJson);

			if ("UpdateMemberAssetsResultsResponseArray" == "std::string") {
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

static bool businessMembersAssetAccessUpdateHelper(char * accessToken,
	std::string businessId, std::shared_ptr<UpdateMemberAssetAccessBody> updateMemberAssetAccessBody, 
	void(* handler)(UpdateMemberAssetsResultsResponseArray, Error, void* )
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

	if (isprimitive("UpdateMemberAssetAccessBody")) {
		node = converttoJson(&updateMemberAssetAccessBody, "UpdateMemberAssetAccessBody", "");
	}
	
	char *jsonStr =  updateMemberAssetAccessBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/members/assets/access");
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
		NetClient::easycurl(BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = businessMembersAssetAccessUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), businessMembersAssetAccessUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessAssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessAssetsManager::businessMembersAssetAccessUpdateAsync(char * accessToken,
	std::string businessId, std::shared_ptr<UpdateMemberAssetAccessBody> updateMemberAssetAccessBody, 
	void(* handler)(UpdateMemberAssetsResultsResponseArray, Error, void* )
	, void* userData)
{
	return businessMembersAssetAccessUpdateHelper(accessToken,
	businessId, updateMemberAssetAccessBody, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::businessMembersAssetAccessUpdateSync(char * accessToken,
	std::string businessId, std::shared_ptr<UpdateMemberAssetAccessBody> updateMemberAssetAccessBody, 
	void(* handler)(UpdateMemberAssetsResultsResponseArray, Error, void* )
	, void* userData)
{
	return businessMembersAssetAccessUpdateHelper(accessToken,
	businessId, updateMemberAssetAccessBody, 
	handler, userData, false);
}

static bool businessPartnerAssetAccessGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Business_partner_asset_access_get_200_response, Error, void* )
	= reinterpret_cast<void(*)(Business_partner_asset_access_get_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Business_partner_asset_access_get_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Business_partner_asset_access_get_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Business_partner_asset_access_get_200_response", "Business_partner_asset_access_get_200_response");
			json_node_free(pJson);

			if ("Business_partner_asset_access_get_200_response" == "std::string") {
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

static bool businessPartnerAssetAccessGetHelper(char * accessToken,
	std::string businessId, std::string partnerId, PartnerType partnerType, std::string assetType, int startIndex, int pageSize, std::string bookmark, 
	void(* handler)(Business_partner_asset_access_get_200_response, Error, void* )
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
	

	itemAtq = stringify(&partnerType, "PartnerType");
	queryParams.insert(pair<string, string>("partner_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("partner_type");
	}


	itemAtq = stringify(&assetType, "std::string");
	queryParams.insert(pair<string, string>("asset_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("asset_type");
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

	string url("/businesses/{business_id}/partners/{partner_id}/assets");
	int pos;

	string s_businessId("{");
	s_businessId.append("business_id");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "std::string"));
	string s_partnerId("{");
	s_partnerId.append("partner_id");
	s_partnerId.append("}");
	pos = url.find(s_partnerId);
	url.erase(pos, s_partnerId.length());
	url.insert(pos, stringify(&partnerId, "std::string"));

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
		NetClient::easycurl(BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = businessPartnerAssetAccessGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), businessPartnerAssetAccessGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessAssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessAssetsManager::businessPartnerAssetAccessGetAsync(char * accessToken,
	std::string businessId, std::string partnerId, PartnerType partnerType, std::string assetType, int startIndex, int pageSize, std::string bookmark, 
	void(* handler)(Business_partner_asset_access_get_200_response, Error, void* )
	, void* userData)
{
	return businessPartnerAssetAccessGetHelper(accessToken,
	businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::businessPartnerAssetAccessGetSync(char * accessToken,
	std::string businessId, std::string partnerId, PartnerType partnerType, std::string assetType, int startIndex, int pageSize, std::string bookmark, 
	void(* handler)(Business_partner_asset_access_get_200_response, Error, void* )
	, void* userData)
{
	return businessPartnerAssetAccessGetHelper(accessToken,
	businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark, 
	handler, userData, false);
}

static bool deletePartnerAssetAccessHandlerImplProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeletePartnerAssetsResultsResponseArray, Error, void* )
	= reinterpret_cast<void(*)(DeletePartnerAssetsResultsResponseArray, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeletePartnerAssetsResultsResponseArray out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeletePartnerAssetsResultsResponseArray")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeletePartnerAssetsResultsResponseArray", "DeletePartnerAssetsResultsResponseArray");
			json_node_free(pJson);

			if ("DeletePartnerAssetsResultsResponseArray" == "std::string") {
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

static bool deletePartnerAssetAccessHandlerImplHelper(char * accessToken,
	std::string businessId, std::shared_ptr<DeletePartnerAssetAccessBody> deletePartnerAssetAccessBody, 
	void(* handler)(DeletePartnerAssetsResultsResponseArray, Error, void* )
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

	if (isprimitive("DeletePartnerAssetAccessBody")) {
		node = converttoJson(&deletePartnerAssetAccessBody, "DeletePartnerAssetAccessBody", "");
	}
	
	char *jsonStr =  deletePartnerAssetAccessBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/partners/assets");
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
		NetClient::easycurl(BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deletePartnerAssetAccessHandlerImplProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deletePartnerAssetAccessHandlerImplProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessAssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessAssetsManager::deletePartnerAssetAccessHandlerImplAsync(char * accessToken,
	std::string businessId, std::shared_ptr<DeletePartnerAssetAccessBody> deletePartnerAssetAccessBody, 
	void(* handler)(DeletePartnerAssetsResultsResponseArray, Error, void* )
	, void* userData)
{
	return deletePartnerAssetAccessHandlerImplHelper(accessToken,
	businessId, deletePartnerAssetAccessBody, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::deletePartnerAssetAccessHandlerImplSync(char * accessToken,
	std::string businessId, std::shared_ptr<DeletePartnerAssetAccessBody> deletePartnerAssetAccessBody, 
	void(* handler)(DeletePartnerAssetsResultsResponseArray, Error, void* )
	, void* userData)
{
	return deletePartnerAssetAccessHandlerImplHelper(accessToken,
	businessId, deletePartnerAssetAccessBody, 
	handler, userData, false);
}

static bool updatePartnerAssetAccessHandlerImplProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdatePartnerAssetsResultsResponseArray, Error, void* )
	= reinterpret_cast<void(*)(UpdatePartnerAssetsResultsResponseArray, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdatePartnerAssetsResultsResponseArray out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdatePartnerAssetsResultsResponseArray")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdatePartnerAssetsResultsResponseArray", "UpdatePartnerAssetsResultsResponseArray");
			json_node_free(pJson);

			if ("UpdatePartnerAssetsResultsResponseArray" == "std::string") {
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

static bool updatePartnerAssetAccessHandlerImplHelper(char * accessToken,
	std::string businessId, std::shared_ptr<UpdatePartnerAssetAccessBody> updatePartnerAssetAccessBody, 
	void(* handler)(UpdatePartnerAssetsResultsResponseArray, Error, void* )
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

	if (isprimitive("UpdatePartnerAssetAccessBody")) {
		node = converttoJson(&updatePartnerAssetAccessBody, "UpdatePartnerAssetAccessBody", "");
	}
	
	char *jsonStr =  updatePartnerAssetAccessBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{business_id}/partners/assets");
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
		NetClient::easycurl(BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updatePartnerAssetAccessHandlerImplProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BusinessAccessAssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updatePartnerAssetAccessHandlerImplProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BusinessAccessAssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BusinessAccessAssetsManager::updatePartnerAssetAccessHandlerImplAsync(char * accessToken,
	std::string businessId, std::shared_ptr<UpdatePartnerAssetAccessBody> updatePartnerAssetAccessBody, 
	void(* handler)(UpdatePartnerAssetsResultsResponseArray, Error, void* )
	, void* userData)
{
	return updatePartnerAssetAccessHandlerImplHelper(accessToken,
	businessId, updatePartnerAssetAccessBody, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::updatePartnerAssetAccessHandlerImplSync(char * accessToken,
	std::string businessId, std::shared_ptr<UpdatePartnerAssetAccessBody> updatePartnerAssetAccessBody, 
	void(* handler)(UpdatePartnerAssetsResultsResponseArray, Error, void* )
	, void* userData)
{
	return updatePartnerAssetAccessHandlerImplHelper(accessToken,
	businessId, updatePartnerAssetAccessBody, 
	handler, userData, false);
}

