#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "CatalogsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


CatalogsManager::CatalogsManager()
{

}

CatalogsManager::~CatalogsManager()
{

}

static gboolean __CatalogsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __CatalogsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__CatalogsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool catalogsProductGroupsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
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

static bool catalogsProductGroupsCreateHelper(char * accessToken,
	std::shared_ptr<CatalogsProductGroupCreateRequest> catalogsProductGroupCreateRequest, 
	void(* handler)(std::string, Error, void* )
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

	if (isprimitive("CatalogsProductGroupCreateRequest")) {
		node = converttoJson(&catalogsProductGroupCreateRequest, "CatalogsProductGroupCreateRequest", "");
	}
	
	char *jsonStr =  catalogsProductGroupCreateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/catalogs/product_groups");
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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsProductGroupsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupsCreateAsync(char * accessToken,
	std::shared_ptr<CatalogsProductGroupCreateRequest> catalogsProductGroupCreateRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsCreateHelper(accessToken,
	catalogsProductGroupCreateRequest, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupsCreateSync(char * accessToken,
	std::shared_ptr<CatalogsProductGroupCreateRequest> catalogsProductGroupCreateRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsCreateHelper(accessToken,
	catalogsProductGroupCreateRequest, 
	handler, userData, false);
}

static bool catalogsProductGroupsDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool catalogsProductGroupsDeleteHelper(char * accessToken,
	std::string productGroupId, 
	
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

	string url("/catalogs/product_groups/{product_group_id}");
	int pos;

	string s_productGroupId("{");
	s_productGroupId.append("product_group_id");
	s_productGroupId.append("}");
	pos = url.find(s_productGroupId);
	url.erase(pos, s_productGroupId.length());
	url.insert(pos, stringify(&productGroupId, "std::string"));

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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsProductGroupsDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupsDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupsDeleteAsync(char * accessToken,
	std::string productGroupId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return catalogsProductGroupsDeleteHelper(accessToken,
	productGroupId, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupsDeleteSync(char * accessToken,
	std::string productGroupId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return catalogsProductGroupsDeleteHelper(accessToken,
	productGroupId, 
	handler, userData, false);
}

static bool catalogsProductGroupsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Paginated, Error, void* )
	= reinterpret_cast<void(*)(Paginated, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Paginated out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Paginated")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Paginated", "Paginated");
			json_node_free(pJson);

			if ("Paginated" == "std::string") {
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

static bool catalogsProductGroupsListHelper(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
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
	

	itemAtq = stringify(&feedId, "std::string");
	queryParams.insert(pair<string, string>("feed_id", itemAtq));


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

	string url("/catalogs/product_groups");
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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsProductGroupsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupsListAsync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsListHelper(accessToken,
	feedId, bookmark, pageSize, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupsListSync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsListHelper(accessToken,
	feedId, bookmark, pageSize, 
	handler, userData, false);
}

static bool catalogsProductGroupsUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsProductGroup, Error, void* )
	= reinterpret_cast<void(*)(CatalogsProductGroup, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsProductGroup out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsProductGroup")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsProductGroup", "CatalogsProductGroup");
			json_node_free(pJson);

			if ("CatalogsProductGroup" == "std::string") {
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

static bool catalogsProductGroupsUpdateHelper(char * accessToken,
	std::string productGroupId, std::shared_ptr<CatalogsProductGroupUpdateRequest> catalogsProductGroupUpdateRequest, 
	void(* handler)(CatalogsProductGroup, Error, void* )
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

	if (isprimitive("CatalogsProductGroupUpdateRequest")) {
		node = converttoJson(&catalogsProductGroupUpdateRequest, "CatalogsProductGroupUpdateRequest", "");
	}
	
	char *jsonStr =  catalogsProductGroupUpdateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/catalogs/product_groups/{product_group_id}");
	int pos;

	string s_productGroupId("{");
	s_productGroupId.append("product_group_id");
	s_productGroupId.append("}");
	pos = url.find(s_productGroupId);
	url.erase(pos, s_productGroupId.length());
	url.insert(pos, stringify(&productGroupId, "std::string"));

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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsProductGroupsUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupsUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupsUpdateAsync(char * accessToken,
	std::string productGroupId, std::shared_ptr<CatalogsProductGroupUpdateRequest> catalogsProductGroupUpdateRequest, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsUpdateHelper(accessToken,
	productGroupId, catalogsProductGroupUpdateRequest, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupsUpdateSync(char * accessToken,
	std::string productGroupId, std::shared_ptr<CatalogsProductGroupUpdateRequest> catalogsProductGroupUpdateRequest, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsUpdateHelper(accessToken,
	productGroupId, catalogsProductGroupUpdateRequest, 
	handler, userData, false);
}

static bool feedProcessingResultsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Paginated, Error, void* )
	= reinterpret_cast<void(*)(Paginated, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Paginated out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Paginated")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Paginated", "Paginated");
			json_node_free(pJson);

			if ("Paginated" == "std::string") {
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

static bool feedProcessingResultsListHelper(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
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

	string url("/catalogs/feeds/{feed_id}/processing_results");
	int pos;

	string s_feedId("{");
	s_feedId.append("feed_id");
	s_feedId.append("}");
	pos = url.find(s_feedId);
	url.erase(pos, s_feedId.length());
	url.insert(pos, stringify(&feedId, "std::string"));

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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = feedProcessingResultsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedProcessingResultsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedProcessingResultsListAsync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return feedProcessingResultsListHelper(accessToken,
	feedId, bookmark, pageSize, 
	handler, userData, true);
}

bool CatalogsManager::feedProcessingResultsListSync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return feedProcessingResultsListHelper(accessToken,
	feedId, bookmark, pageSize, 
	handler, userData, false);
}

static bool feedsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsFeed, Error, void* )
	= reinterpret_cast<void(*)(CatalogsFeed, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsFeed out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsFeed")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsFeed", "CatalogsFeed");
			json_node_free(pJson);

			if ("CatalogsFeed" == "std::string") {
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

static bool feedsCreateHelper(char * accessToken,
	std::shared_ptr<CatalogsFeedsCreateRequest> catalogsFeedsCreateRequest, 
	void(* handler)(CatalogsFeed, Error, void* )
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

	if (isprimitive("CatalogsFeedsCreateRequest")) {
		node = converttoJson(&catalogsFeedsCreateRequest, "CatalogsFeedsCreateRequest", "");
	}
	
	char *jsonStr =  catalogsFeedsCreateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/catalogs/feeds");
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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = feedsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedsCreateAsync(char * accessToken,
	std::shared_ptr<CatalogsFeedsCreateRequest> catalogsFeedsCreateRequest, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData)
{
	return feedsCreateHelper(accessToken,
	catalogsFeedsCreateRequest, 
	handler, userData, true);
}

bool CatalogsManager::feedsCreateSync(char * accessToken,
	std::shared_ptr<CatalogsFeedsCreateRequest> catalogsFeedsCreateRequest, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData)
{
	return feedsCreateHelper(accessToken,
	catalogsFeedsCreateRequest, 
	handler, userData, false);
}

static bool feedsDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool feedsDeleteHelper(char * accessToken,
	std::string feedId, 
	
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

	string url("/catalogs/feeds/{feed_id}");
	int pos;

	string s_feedId("{");
	s_feedId.append("feed_id");
	s_feedId.append("}");
	pos = url.find(s_feedId);
	url.erase(pos, s_feedId.length());
	url.insert(pos, stringify(&feedId, "std::string"));

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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = feedsDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedsDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedsDeleteAsync(char * accessToken,
	std::string feedId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return feedsDeleteHelper(accessToken,
	feedId, 
	handler, userData, true);
}

bool CatalogsManager::feedsDeleteSync(char * accessToken,
	std::string feedId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return feedsDeleteHelper(accessToken,
	feedId, 
	handler, userData, false);
}

static bool feedsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsFeed, Error, void* )
	= reinterpret_cast<void(*)(CatalogsFeed, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsFeed out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsFeed")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsFeed", "CatalogsFeed");
			json_node_free(pJson);

			if ("CatalogsFeed" == "std::string") {
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

static bool feedsGetHelper(char * accessToken,
	std::string feedId, 
	void(* handler)(CatalogsFeed, Error, void* )
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

	string url("/catalogs/feeds/{feed_id}");
	int pos;

	string s_feedId("{");
	s_feedId.append("feed_id");
	s_feedId.append("}");
	pos = url.find(s_feedId);
	url.erase(pos, s_feedId.length());
	url.insert(pos, stringify(&feedId, "std::string"));

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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = feedsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedsGetAsync(char * accessToken,
	std::string feedId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData)
{
	return feedsGetHelper(accessToken,
	feedId, 
	handler, userData, true);
}

bool CatalogsManager::feedsGetSync(char * accessToken,
	std::string feedId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData)
{
	return feedsGetHelper(accessToken,
	feedId, 
	handler, userData, false);
}

static bool feedsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Paginated, Error, void* )
	= reinterpret_cast<void(*)(Paginated, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Paginated out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Paginated")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Paginated", "Paginated");
			json_node_free(pJson);

			if ("Paginated" == "std::string") {
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

static bool feedsListHelper(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
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

	string url("/catalogs/feeds");
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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = feedsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedsListAsync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return feedsListHelper(accessToken,
	bookmark, pageSize, 
	handler, userData, true);
}

bool CatalogsManager::feedsListSync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return feedsListHelper(accessToken,
	bookmark, pageSize, 
	handler, userData, false);
}

static bool feedsUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsFeed, Error, void* )
	= reinterpret_cast<void(*)(CatalogsFeed, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsFeed out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsFeed")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsFeed", "CatalogsFeed");
			json_node_free(pJson);

			if ("CatalogsFeed" == "std::string") {
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

static bool feedsUpdateHelper(char * accessToken,
	std::string feedId, std::shared_ptr<CatalogsFeedsUpdateRequest> catalogsFeedsUpdateRequest, 
	void(* handler)(CatalogsFeed, Error, void* )
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

	if (isprimitive("CatalogsFeedsUpdateRequest")) {
		node = converttoJson(&catalogsFeedsUpdateRequest, "CatalogsFeedsUpdateRequest", "");
	}
	
	char *jsonStr =  catalogsFeedsUpdateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/catalogs/feeds/{feed_id}");
	int pos;

	string s_feedId("{");
	s_feedId.append("feed_id");
	s_feedId.append("}");
	pos = url.find(s_feedId);
	url.erase(pos, s_feedId.length());
	url.insert(pos, stringify(&feedId, "std::string"));

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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = feedsUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedsUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedsUpdateAsync(char * accessToken,
	std::string feedId, std::shared_ptr<CatalogsFeedsUpdateRequest> catalogsFeedsUpdateRequest, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData)
{
	return feedsUpdateHelper(accessToken,
	feedId, catalogsFeedsUpdateRequest, 
	handler, userData, true);
}

bool CatalogsManager::feedsUpdateSync(char * accessToken,
	std::string feedId, std::shared_ptr<CatalogsFeedsUpdateRequest> catalogsFeedsUpdateRequest, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData)
{
	return feedsUpdateHelper(accessToken,
	feedId, catalogsFeedsUpdateRequest, 
	handler, userData, false);
}

static bool itemsBatchGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsItemsBatch, Error, void* )
	= reinterpret_cast<void(*)(CatalogsItemsBatch, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsItemsBatch out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsItemsBatch")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsItemsBatch", "CatalogsItemsBatch");
			json_node_free(pJson);

			if ("CatalogsItemsBatch" == "std::string") {
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

static bool itemsBatchGetHelper(char * accessToken,
	std::string batchId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
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

	string url("/catalogs/items/batch/{batch_id}");
	int pos;

	string s_batchId("{");
	s_batchId.append("batch_id");
	s_batchId.append("}");
	pos = url.find(s_batchId);
	url.erase(pos, s_batchId.length());
	url.insert(pos, stringify(&batchId, "std::string"));

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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = itemsBatchGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), itemsBatchGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::itemsBatchGetAsync(char * accessToken,
	std::string batchId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData)
{
	return itemsBatchGetHelper(accessToken,
	batchId, 
	handler, userData, true);
}

bool CatalogsManager::itemsBatchGetSync(char * accessToken,
	std::string batchId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData)
{
	return itemsBatchGetHelper(accessToken,
	batchId, 
	handler, userData, false);
}

static bool itemsBatchPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsItemsBatch, Error, void* )
	= reinterpret_cast<void(*)(CatalogsItemsBatch, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsItemsBatch out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsItemsBatch")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsItemsBatch", "CatalogsItemsBatch");
			json_node_free(pJson);

			if ("CatalogsItemsBatch" == "std::string") {
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

static bool itemsBatchPostHelper(char * accessToken,
	std::shared_ptr<CatalogsItemsBatchRequest> catalogsItemsBatchRequest, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
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

	if (isprimitive("CatalogsItemsBatchRequest")) {
		node = converttoJson(&catalogsItemsBatchRequest, "CatalogsItemsBatchRequest", "");
	}
	
	char *jsonStr =  catalogsItemsBatchRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/catalogs/items/batch");
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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = itemsBatchPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), itemsBatchPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::itemsBatchPostAsync(char * accessToken,
	std::shared_ptr<CatalogsItemsBatchRequest> catalogsItemsBatchRequest, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData)
{
	return itemsBatchPostHelper(accessToken,
	catalogsItemsBatchRequest, 
	handler, userData, true);
}

bool CatalogsManager::itemsBatchPostSync(char * accessToken,
	std::shared_ptr<CatalogsItemsBatchRequest> catalogsItemsBatchRequest, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData)
{
	return itemsBatchPostHelper(accessToken,
	catalogsItemsBatchRequest, 
	handler, userData, false);
}

static bool itemsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsItems, Error, void* )
	= reinterpret_cast<void(*)(CatalogsItems, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsItems out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsItems")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsItems", "CatalogsItems");
			json_node_free(pJson);

			if ("CatalogsItems" == "std::string") {
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

static bool itemsGetHelper(char * accessToken,
	std::string country, std::list<std::string> itemIds, std::string language, 
	void(* handler)(CatalogsItems, Error, void* )
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
	

	itemAtq = stringify(&country, "std::string");
	queryParams.insert(pair<string, string>("country", itemAtq));

	for (std::list
	<std::string>::iterator queryIter = itemIds.begin(); queryIter != itemIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("itemIds", itemAt));
	}
	

	itemAtq = stringify(&language, "std::string");
	queryParams.insert(pair<string, string>("language", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/catalogs/items");
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
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = itemsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_freeList_all(headerList);
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), itemsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::itemsGetAsync(char * accessToken,
	std::string country, std::list<std::string> itemIds, std::string language, 
	void(* handler)(CatalogsItems, Error, void* )
	, void* userData)
{
	return itemsGetHelper(accessToken,
	country, itemIds, language, 
	handler, userData, true);
}

bool CatalogsManager::itemsGetSync(char * accessToken,
	std::string country, std::list<std::string> itemIds, std::string language, 
	void(* handler)(CatalogsItems, Error, void* )
	, void* userData)
{
	return itemsGetHelper(accessToken,
	country, itemIds, language, 
	handler, userData, false);
}

