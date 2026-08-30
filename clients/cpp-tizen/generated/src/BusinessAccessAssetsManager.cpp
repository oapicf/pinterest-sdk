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
	void(* handler)(AssetGroupInput, Error, void* )
	= reinterpret_cast<void(*)(AssetGroupInput, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AssetGroupInput out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AssetGroupInput")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AssetGroupInput", "AssetGroupInput");
			json_node_free(pJson);

			if ("AssetGroupInput" == "std::string") {
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

static bool assetGroupCreateHelper(char * accessToken,
	std::string businessId, std::shared_ptr<AssetGroupInputCreate> assetGroupInputCreate, 
	void(* handler)(AssetGroupInput, Error, void* )
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

	if (isprimitive("AssetGroupInputCreate")) {
		node = converttoJson(&assetGroupInputCreate, "AssetGroupInputCreate", "");
	}
	
	char *jsonStr =  assetGroupInputCreate.toJson();
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
	std::string businessId, std::shared_ptr<AssetGroupInputCreate> assetGroupInputCreate, 
	void(* handler)(AssetGroupInput, Error, void* )
	, void* userData)
{
	return assetGroupCreateHelper(accessToken,
	businessId, assetGroupInputCreate, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::assetGroupCreateSync(char * accessToken,
	std::string businessId, std::shared_ptr<AssetGroupInputCreate> assetGroupInputCreate, 
	void(* handler)(AssetGroupInput, Error, void* )
	, void* userData)
{
	return assetGroupCreateHelper(accessToken,
	businessId, assetGroupInputCreate, 
	handler, userData, false);
}

static bool assetGroupDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AssetGroupDeletion, Error, void* )
	= reinterpret_cast<void(*)(AssetGroupDeletion, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AssetGroupDeletion out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AssetGroupDeletion")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AssetGroupDeletion", "AssetGroupDeletion");
			json_node_free(pJson);

			if ("AssetGroupDeletion" == "std::string") {
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

static bool assetGroupDeleteHelper(char * accessToken,
	std::string businessId, std::shared_ptr<AssetGroupDeletionDelete> assetGroupDeletionDelete, 
	void(* handler)(AssetGroupDeletion, Error, void* )
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

	if (isprimitive("AssetGroupDeletionDelete")) {
		node = converttoJson(&assetGroupDeletionDelete, "AssetGroupDeletionDelete", "");
	}
	
	char *jsonStr =  assetGroupDeletionDelete.toJson();
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
	std::string businessId, std::shared_ptr<AssetGroupDeletionDelete> assetGroupDeletionDelete, 
	void(* handler)(AssetGroupDeletion, Error, void* )
	, void* userData)
{
	return assetGroupDeleteHelper(accessToken,
	businessId, assetGroupDeletionDelete, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::assetGroupDeleteSync(char * accessToken,
	std::string businessId, std::shared_ptr<AssetGroupDeletionDelete> assetGroupDeletionDelete, 
	void(* handler)(AssetGroupDeletion, Error, void* )
	, void* userData)
{
	return assetGroupDeleteHelper(accessToken,
	businessId, assetGroupDeletionDelete, 
	handler, userData, false);
}

static bool assetGroupUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AssetGroupModification, Error, void* )
	= reinterpret_cast<void(*)(AssetGroupModification, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AssetGroupModification out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AssetGroupModification")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AssetGroupModification", "AssetGroupModification");
			json_node_free(pJson);

			if ("AssetGroupModification" == "std::string") {
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
	std::string businessId, std::shared_ptr<AssetGroupModificationReadOrUpdate> assetGroupModificationReadOrUpdate, 
	void(* handler)(AssetGroupModification, Error, void* )
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

	if (isprimitive("AssetGroupModificationReadOrUpdate")) {
		node = converttoJson(&assetGroupModificationReadOrUpdate, "AssetGroupModificationReadOrUpdate", "");
	}
	
	char *jsonStr =  assetGroupModificationReadOrUpdate.toJson();
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
	std::string businessId, std::shared_ptr<AssetGroupModificationReadOrUpdate> assetGroupModificationReadOrUpdate, 
	void(* handler)(AssetGroupModification, Error, void* )
	, void* userData)
{
	return assetGroupUpdateHelper(accessToken,
	businessId, assetGroupModificationReadOrUpdate, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::assetGroupUpdateSync(char * accessToken,
	std::string businessId, std::shared_ptr<AssetGroupModificationReadOrUpdate> assetGroupModificationReadOrUpdate, 
	void(* handler)(AssetGroupModification, Error, void* )
	, void* userData)
{
	return assetGroupUpdateHelper(accessToken,
	businessId, assetGroupModificationReadOrUpdate, 
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

static bool businessAssetMembersGetHelper(char * accessToken,
	std::string businessId, std::string assetId, int startIndex, bool fetchSystemUsers, std::string bookmark, int pageSize, 
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
	

	itemAtq = stringify(&startIndex, "int");
	queryParams.insert(pair<string, string>("start_index", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("start_index");
	}


	itemAtq = stringify(&fetchSystemUsers, "bool");
	queryParams.insert(pair<string, string>("fetch_system_users", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("fetch_system_users");
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
	std::string businessId, std::string assetId, int startIndex, bool fetchSystemUsers, std::string bookmark, int pageSize, 
	void(* handler)(Business_asset_members_get_200_response, Error, void* )
	, void* userData)
{
	return businessAssetMembersGetHelper(accessToken,
	businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::businessAssetMembersGetSync(char * accessToken,
	std::string businessId, std::string assetId, int startIndex, bool fetchSystemUsers, std::string bookmark, int pageSize, 
	void(* handler)(Business_asset_members_get_200_response, Error, void* )
	, void* userData)
{
	return businessAssetMembersGetHelper(accessToken,
	businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize, 
	handler, userData, false);
}

static bool businessAssetPartnersGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool businessAssetPartnersGetHelper(char * accessToken,
	std::string businessId, std::string assetId, int startIndex, std::string bookmark, int pageSize, 
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
	void(* handler)(Business_asset_members_get_200_response, Error, void* )
	, void* userData)
{
	return businessAssetPartnersGetHelper(accessToken,
	businessId, assetId, startIndex, bookmark, pageSize, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::businessAssetPartnersGetSync(char * accessToken,
	std::string businessId, std::string assetId, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_asset_members_get_200_response, Error, void* )
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
	void(* handler)(BusinessMemberAssetsGetResponse, Error, void* )
	= reinterpret_cast<void(*)(BusinessMemberAssetsGetResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BusinessMemberAssetsGetResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BusinessMemberAssetsGetResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BusinessMemberAssetsGetResponse", "BusinessMemberAssetsGetResponse");
			json_node_free(pJson);

			if ("BusinessMemberAssetsGetResponse" == "std::string") {
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
	std::string businessId, std::string memberId, std::string assetType, int startIndex, AssetSortBy sortBy, bool sortAscending, AssetSearchBy searchBy, std::string searchValue, AssetPermissionType assetPermissionType, std::list<NonDraftEntityStatus> adAccountStatuses, std::string bookmark, int pageSize, 
	void(* handler)(BusinessMemberAssetsGetResponse, Error, void* )
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


	itemAtq = stringify(&sortBy, "AssetSortBy");
	queryParams.insert(pair<string, string>("sort_by", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("sort_by");
	}


	itemAtq = stringify(&sortAscending, "bool");
	queryParams.insert(pair<string, string>("sort_ascending", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("sort_ascending");
	}


	itemAtq = stringify(&searchBy, "AssetSearchBy");
	queryParams.insert(pair<string, string>("search_by", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("search_by");
	}


	itemAtq = stringify(&searchValue, "std::string");
	queryParams.insert(pair<string, string>("search_value", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("search_value");
	}


	itemAtq = stringify(&assetPermissionType, "AssetPermissionType");
	queryParams.insert(pair<string, string>("asset_permission_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("asset_permission_type");
	}

	for (std::list
	<NonDraftEntityStatus>::iterator queryIter = adAccountStatuses.begin(); queryIter != adAccountStatuses.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "NonDraftEntityStatus");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("adAccountStatuses", itemAt));
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
	std::string businessId, std::string memberId, std::string assetType, int startIndex, AssetSortBy sortBy, bool sortAscending, AssetSearchBy searchBy, std::string searchValue, AssetPermissionType assetPermissionType, std::list<NonDraftEntityStatus> adAccountStatuses, std::string bookmark, int pageSize, 
	void(* handler)(BusinessMemberAssetsGetResponse, Error, void* )
	, void* userData)
{
	return businessMemberAssetsGetHelper(accessToken,
	businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::businessMemberAssetsGetSync(char * accessToken,
	std::string businessId, std::string memberId, std::string assetType, int startIndex, AssetSortBy sortBy, bool sortAscending, AssetSearchBy searchBy, std::string searchValue, AssetPermissionType assetPermissionType, std::list<NonDraftEntityStatus> adAccountStatuses, std::string bookmark, int pageSize, 
	void(* handler)(BusinessMemberAssetsGetResponse, Error, void* )
	, void* userData)
{
	return businessMemberAssetsGetHelper(accessToken,
	businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize, 
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
	std::string businessId, std::shared_ptr<BusinessMembersAssetAccessDeleteBody> businessMembersAssetAccessDeleteBody, 
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

	if (isprimitive("BusinessMembersAssetAccessDeleteBody")) {
		node = converttoJson(&businessMembersAssetAccessDeleteBody, "BusinessMembersAssetAccessDeleteBody", "");
	}
	
	char *jsonStr =  businessMembersAssetAccessDeleteBody.toJson();
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
	std::string businessId, std::shared_ptr<BusinessMembersAssetAccessDeleteBody> businessMembersAssetAccessDeleteBody, 
	void(* handler)(DeleteMemberAccessResultsResponseArray, Error, void* )
	, void* userData)
{
	return businessMembersAssetAccessDeleteHelper(accessToken,
	businessId, businessMembersAssetAccessDeleteBody, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::businessMembersAssetAccessDeleteSync(char * accessToken,
	std::string businessId, std::shared_ptr<BusinessMembersAssetAccessDeleteBody> businessMembersAssetAccessDeleteBody, 
	void(* handler)(DeleteMemberAccessResultsResponseArray, Error, void* )
	, void* userData)
{
	return businessMembersAssetAccessDeleteHelper(accessToken,
	businessId, businessMembersAssetAccessDeleteBody, 
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

static bool businessPartnerAssetAccessGetHelper(char * accessToken,
	std::string businessId, std::string partnerId, std::string partnerType, std::string assetType, int startIndex, AssetSortBy sortBy, bool sortAscending, AssetSearchBy searchBy, std::string searchValue, std::string bookmark, int pageSize, 
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
	

	itemAtq = stringify(&partnerType, "std::string");
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


	itemAtq = stringify(&sortBy, "AssetSortBy");
	queryParams.insert(pair<string, string>("sort_by", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("sort_by");
	}


	itemAtq = stringify(&sortAscending, "bool");
	queryParams.insert(pair<string, string>("sort_ascending", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("sort_ascending");
	}


	itemAtq = stringify(&searchBy, "AssetSearchBy");
	queryParams.insert(pair<string, string>("search_by", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("search_by");
	}


	itemAtq = stringify(&searchValue, "std::string");
	queryParams.insert(pair<string, string>("search_value", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("search_value");
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
	std::string businessId, std::string partnerId, std::string partnerType, std::string assetType, int startIndex, AssetSortBy sortBy, bool sortAscending, AssetSearchBy searchBy, std::string searchValue, std::string bookmark, int pageSize, 
	void(* handler)(Business_partner_asset_access_get_200_response, Error, void* )
	, void* userData)
{
	return businessPartnerAssetAccessGetHelper(accessToken,
	businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::businessPartnerAssetAccessGetSync(char * accessToken,
	std::string businessId, std::string partnerId, std::string partnerType, std::string assetType, int startIndex, AssetSortBy sortBy, bool sortAscending, AssetSearchBy searchBy, std::string searchValue, std::string bookmark, int pageSize, 
	void(* handler)(Business_partner_asset_access_get_200_response, Error, void* )
	, void* userData)
{
	return businessPartnerAssetAccessGetHelper(accessToken,
	businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize, 
	handler, userData, false);
}

static bool deletePartnerAssetAccessHandlerImplProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeletePartnerAssetAccessResultsResponseArray, Error, void* )
	= reinterpret_cast<void(*)(DeletePartnerAssetAccessResultsResponseArray, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeletePartnerAssetAccessResultsResponseArray out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeletePartnerAssetAccessResultsResponseArray")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeletePartnerAssetAccessResultsResponseArray", "DeletePartnerAssetAccessResultsResponseArray");
			json_node_free(pJson);

			if ("DeletePartnerAssetAccessResultsResponseArray" == "std::string") {
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
	void(* handler)(DeletePartnerAssetAccessResultsResponseArray, Error, void* )
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
	void(* handler)(DeletePartnerAssetAccessResultsResponseArray, Error, void* )
	, void* userData)
{
	return deletePartnerAssetAccessHandlerImplHelper(accessToken,
	businessId, deletePartnerAssetAccessBody, 
	handler, userData, true);
}

bool BusinessAccessAssetsManager::deletePartnerAssetAccessHandlerImplSync(char * accessToken,
	std::string businessId, std::shared_ptr<DeletePartnerAssetAccessBody> deletePartnerAssetAccessBody, 
	void(* handler)(DeletePartnerAssetAccessResultsResponseArray, Error, void* )
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

