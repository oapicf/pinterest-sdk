#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "CatalogSupplementalManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


CatalogSupplementalManager::CatalogSupplementalManager()
{

}

CatalogSupplementalManager::~CatalogSupplementalManager()
{

}

static gboolean __CatalogSupplementalManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __CatalogSupplementalManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__CatalogSupplementalManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool catalogsLocalInventoryItemsBatchOperateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SupplementalItemsBatchResponse, Error, void* )
	= reinterpret_cast<void(*)(SupplementalItemsBatchResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SupplementalItemsBatchResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SupplementalItemsBatchResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SupplementalItemsBatchResponse", "SupplementalItemsBatchResponse");
			json_node_free(pJson);

			if ("SupplementalItemsBatchResponse" == "std::string") {
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

static bool catalogsLocalInventoryItemsBatchOperateHelper(char * accessToken,
	std::string catalogId, std::shared_ptr<LocalInventoryItemsBatchCreate> localInventoryItemsBatchCreate, std::string adAccountId, 
	void(* handler)(SupplementalItemsBatchResponse, Error, void* )
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("LocalInventoryItemsBatchCreate")) {
		node = converttoJson(&localInventoryItemsBatchCreate, "LocalInventoryItemsBatchCreate", "");
	}
	
	char *jsonStr =  localInventoryItemsBatchCreate.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/catalogs/{catalog_id}/local_inventory_items/batch");
	int pos;

	string s_catalogId("{");
	s_catalogId.append("catalog_id");
	s_catalogId.append("}");
	pos = url.find(s_catalogId);
	url.erase(pos, s_catalogId.length());
	url.insert(pos, stringify(&catalogId, "std::string"));

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
		NetClient::easycurl(CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsLocalInventoryItemsBatchOperateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsLocalInventoryItemsBatchOperateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogSupplementalManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogSupplementalManager::catalogsLocalInventoryItemsBatchOperateAsync(char * accessToken,
	std::string catalogId, std::shared_ptr<LocalInventoryItemsBatchCreate> localInventoryItemsBatchCreate, std::string adAccountId, 
	void(* handler)(SupplementalItemsBatchResponse, Error, void* )
	, void* userData)
{
	return catalogsLocalInventoryItemsBatchOperateHelper(accessToken,
	catalogId, localInventoryItemsBatchCreate, adAccountId, 
	handler, userData, true);
}

bool CatalogSupplementalManager::catalogsLocalInventoryItemsBatchOperateSync(char * accessToken,
	std::string catalogId, std::shared_ptr<LocalInventoryItemsBatchCreate> localInventoryItemsBatchCreate, std::string adAccountId, 
	void(* handler)(SupplementalItemsBatchResponse, Error, void* )
	, void* userData)
{
	return catalogsLocalInventoryItemsBatchOperateHelper(accessToken,
	catalogId, localInventoryItemsBatchCreate, adAccountId, 
	handler, userData, false);
}

static bool catalogsLocalInventoryItemsPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(LocalInventoryItemsGet, Error, void* )
	= reinterpret_cast<void(*)(LocalInventoryItemsGet, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	LocalInventoryItemsGet out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("LocalInventoryItemsGet")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "LocalInventoryItemsGet", "LocalInventoryItemsGet");
			json_node_free(pJson);

			if ("LocalInventoryItemsGet" == "std::string") {
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

static bool catalogsLocalInventoryItemsPostHelper(char * accessToken,
	std::string catalogId, std::shared_ptr<LocalInventoryItemsGetCreate> localInventoryItemsGetCreate, std::string adAccountId, 
	void(* handler)(LocalInventoryItemsGet, Error, void* )
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("LocalInventoryItemsGetCreate")) {
		node = converttoJson(&localInventoryItemsGetCreate, "LocalInventoryItemsGetCreate", "");
	}
	
	char *jsonStr =  localInventoryItemsGetCreate.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/catalogs/{catalog_id}/local_inventory_items/query");
	int pos;

	string s_catalogId("{");
	s_catalogId.append("catalog_id");
	s_catalogId.append("}");
	pos = url.find(s_catalogId);
	url.erase(pos, s_catalogId.length());
	url.insert(pos, stringify(&catalogId, "std::string"));

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
		NetClient::easycurl(CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsLocalInventoryItemsPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsLocalInventoryItemsPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogSupplementalManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogSupplementalManager::catalogsLocalInventoryItemsPostAsync(char * accessToken,
	std::string catalogId, std::shared_ptr<LocalInventoryItemsGetCreate> localInventoryItemsGetCreate, std::string adAccountId, 
	void(* handler)(LocalInventoryItemsGet, Error, void* )
	, void* userData)
{
	return catalogsLocalInventoryItemsPostHelper(accessToken,
	catalogId, localInventoryItemsGetCreate, adAccountId, 
	handler, userData, true);
}

bool CatalogSupplementalManager::catalogsLocalInventoryItemsPostSync(char * accessToken,
	std::string catalogId, std::shared_ptr<LocalInventoryItemsGetCreate> localInventoryItemsGetCreate, std::string adAccountId, 
	void(* handler)(LocalInventoryItemsGet, Error, void* )
	, void* userData)
{
	return catalogsLocalInventoryItemsPostHelper(accessToken,
	catalogId, localInventoryItemsGetCreate, adAccountId, 
	handler, userData, false);
}

static bool catalogsLocalStoresCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )
	= reinterpret_cast<void(*)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<Catalogs_local_stores_create_200_response_inner> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			Catalogs_local_stores_create_200_response_inner singlemodel;
			singlemodel.fromJson(singlenodestr);
			out.push_front(singlemodel);
			g_free(static_cast<gpointer>(singlenodestr));
			json_node_free(myJson);
		}
		json_array_unref (jsonarray);
		json_node_free(pJson);


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

static bool catalogsLocalStoresCreateHelper(char * accessToken,
	std::string catalogId, std::list<LocalStoreCreate> localStoreCreate, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;
	//TODO: Map Container
	if (isprimitive("LocalStoreCreate")) {
		node = converttoJson(&localStoreCreate, "LocalStoreCreate", "array");
	} else {
		node = json_node_alloc();
		json_array = json_array_new();
		for (std::list
			<LocalStoreCreate>::iterator bodyIter = localStoreCreate.begin(); bodyIter != localStoreCreate.end(); ++bodyIter) {
			LocalStoreCreate itemAt = (*bodyIter);
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

	string url("/catalogs/{catalog_id}/local_stores");
	int pos;

	string s_catalogId("{");
	s_catalogId.append("catalog_id");
	s_catalogId.append("}");
	pos = url.find(s_catalogId);
	url.erase(pos, s_catalogId.length());
	url.insert(pos, stringify(&catalogId, "std::string"));

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
		NetClient::easycurl(CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsLocalStoresCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsLocalStoresCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogSupplementalManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogSupplementalManager::catalogsLocalStoresCreateAsync(char * accessToken,
	std::string catalogId, std::list<LocalStoreCreate> localStoreCreate, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )
	, void* userData)
{
	return catalogsLocalStoresCreateHelper(accessToken,
	catalogId, localStoreCreate, adAccountId, 
	handler, userData, true);
}

bool CatalogSupplementalManager::catalogsLocalStoresCreateSync(char * accessToken,
	std::string catalogId, std::list<LocalStoreCreate> localStoreCreate, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )
	, void* userData)
{
	return catalogsLocalStoresCreateHelper(accessToken,
	catalogId, localStoreCreate, adAccountId, 
	handler, userData, false);
}

static bool catalogsLocalStoresDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<Catalogs_local_stores_delete_200_response_inner>, Error, void* )
	= reinterpret_cast<void(*)(std::list<Catalogs_local_stores_delete_200_response_inner>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<Catalogs_local_stores_delete_200_response_inner> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			Catalogs_local_stores_delete_200_response_inner singlemodel;
			singlemodel.fromJson(singlenodestr);
			out.push_front(singlemodel);
			g_free(static_cast<gpointer>(singlenodestr));
			json_node_free(myJson);
		}
		json_array_unref (jsonarray);
		json_node_free(pJson);


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

static bool catalogsLocalStoresDeleteHelper(char * accessToken,
	std::string catalogId, std::list<std::string> ids, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_delete_200_response_inner>, Error, void* )
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
	<std::string>::iterator queryIter = ids.begin(); queryIter != ids.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("ids", itemAt));
	}
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/catalogs/{catalog_id}/local_stores");
	int pos;

	string s_catalogId("{");
	s_catalogId.append("catalog_id");
	s_catalogId.append("}");
	pos = url.find(s_catalogId);
	url.erase(pos, s_catalogId.length());
	url.insert(pos, stringify(&catalogId, "std::string"));

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
		NetClient::easycurl(CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsLocalStoresDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsLocalStoresDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogSupplementalManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogSupplementalManager::catalogsLocalStoresDeleteAsync(char * accessToken,
	std::string catalogId, std::list<std::string> ids, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_delete_200_response_inner>, Error, void* )
	, void* userData)
{
	return catalogsLocalStoresDeleteHelper(accessToken,
	catalogId, ids, adAccountId, 
	handler, userData, true);
}

bool CatalogSupplementalManager::catalogsLocalStoresDeleteSync(char * accessToken,
	std::string catalogId, std::list<std::string> ids, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_delete_200_response_inner>, Error, void* )
	, void* userData)
{
	return catalogsLocalStoresDeleteHelper(accessToken,
	catalogId, ids, adAccountId, 
	handler, userData, false);
}

static bool catalogsLocalStoresListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Catalogs_local_stores_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Catalogs_local_stores_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Catalogs_local_stores_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Catalogs_local_stores_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Catalogs_local_stores_list_200_response", "Catalogs_local_stores_list_200_response");
			json_node_free(pJson);

			if ("Catalogs_local_stores_list_200_response" == "std::string") {
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

static bool catalogsLocalStoresListHelper(char * accessToken,
	std::string catalogId, std::list<std::string> ids, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Catalogs_local_stores_list_200_response, Error, void* )
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
	<std::string>::iterator queryIter = ids.begin(); queryIter != ids.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("ids", itemAt));
	}
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
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

	string url("/catalogs/{catalog_id}/local_stores");
	int pos;

	string s_catalogId("{");
	s_catalogId.append("catalog_id");
	s_catalogId.append("}");
	pos = url.find(s_catalogId);
	url.erase(pos, s_catalogId.length());
	url.insert(pos, stringify(&catalogId, "std::string"));

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
		NetClient::easycurl(CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsLocalStoresListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsLocalStoresListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogSupplementalManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogSupplementalManager::catalogsLocalStoresListAsync(char * accessToken,
	std::string catalogId, std::list<std::string> ids, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Catalogs_local_stores_list_200_response, Error, void* )
	, void* userData)
{
	return catalogsLocalStoresListHelper(accessToken,
	catalogId, ids, adAccountId, bookmark, pageSize, 
	handler, userData, true);
}

bool CatalogSupplementalManager::catalogsLocalStoresListSync(char * accessToken,
	std::string catalogId, std::list<std::string> ids, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Catalogs_local_stores_list_200_response, Error, void* )
	, void* userData)
{
	return catalogsLocalStoresListHelper(accessToken,
	catalogId, ids, adAccountId, bookmark, pageSize, 
	handler, userData, false);
}

static bool catalogsLocalStoresUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )
	= reinterpret_cast<void(*)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<Catalogs_local_stores_create_200_response_inner> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			Catalogs_local_stores_create_200_response_inner singlemodel;
			singlemodel.fromJson(singlenodestr);
			out.push_front(singlemodel);
			g_free(static_cast<gpointer>(singlenodestr));
			json_node_free(myJson);
		}
		json_array_unref (jsonarray);
		json_node_free(pJson);


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

static bool catalogsLocalStoresUpdateHelper(char * accessToken,
	std::string catalogId, std::list<LocalStoreBatchUpdate> localStoreBatchUpdate, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;
	//TODO: Map Container
	if (isprimitive("LocalStoreBatchUpdate")) {
		node = converttoJson(&localStoreBatchUpdate, "LocalStoreBatchUpdate", "array");
	} else {
		node = json_node_alloc();
		json_array = json_array_new();
		for (std::list
			<LocalStoreBatchUpdate>::iterator bodyIter = localStoreBatchUpdate.begin(); bodyIter != localStoreBatchUpdate.end(); ++bodyIter) {
			LocalStoreBatchUpdate itemAt = (*bodyIter);
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

	string url("/catalogs/{catalog_id}/local_stores");
	int pos;

	string s_catalogId("{");
	s_catalogId.append("catalog_id");
	s_catalogId.append("}");
	pos = url.find(s_catalogId);
	url.erase(pos, s_catalogId.length());
	url.insert(pos, stringify(&catalogId, "std::string"));

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
		NetClient::easycurl(CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsLocalStoresUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsLocalStoresUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogSupplementalManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogSupplementalManager::catalogsLocalStoresUpdateAsync(char * accessToken,
	std::string catalogId, std::list<LocalStoreBatchUpdate> localStoreBatchUpdate, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )
	, void* userData)
{
	return catalogsLocalStoresUpdateHelper(accessToken,
	catalogId, localStoreBatchUpdate, adAccountId, 
	handler, userData, true);
}

bool CatalogSupplementalManager::catalogsLocalStoresUpdateSync(char * accessToken,
	std::string catalogId, std::list<LocalStoreBatchUpdate> localStoreBatchUpdate, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )
	, void* userData)
{
	return catalogsLocalStoresUpdateHelper(accessToken,
	catalogId, localStoreBatchUpdate, adAccountId, 
	handler, userData, false);
}

static bool catalogsSupplementalItemsBatchGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SupplementalItemsBatchResponse, Error, void* )
	= reinterpret_cast<void(*)(SupplementalItemsBatchResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SupplementalItemsBatchResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SupplementalItemsBatchResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SupplementalItemsBatchResponse", "SupplementalItemsBatchResponse");
			json_node_free(pJson);

			if ("SupplementalItemsBatchResponse" == "std::string") {
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

static bool catalogsSupplementalItemsBatchGetHelper(char * accessToken,
	std::string catalogId, std::string batchId, std::string adAccountId, 
	void(* handler)(SupplementalItemsBatchResponse, Error, void* )
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}");
	int pos;

	string s_catalogId("{");
	s_catalogId.append("catalog_id");
	s_catalogId.append("}");
	pos = url.find(s_catalogId);
	url.erase(pos, s_catalogId.length());
	url.insert(pos, stringify(&catalogId, "std::string"));
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
		NetClient::easycurl(CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsSupplementalItemsBatchGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogSupplementalManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsSupplementalItemsBatchGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogSupplementalManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogSupplementalManager::catalogsSupplementalItemsBatchGetAsync(char * accessToken,
	std::string catalogId, std::string batchId, std::string adAccountId, 
	void(* handler)(SupplementalItemsBatchResponse, Error, void* )
	, void* userData)
{
	return catalogsSupplementalItemsBatchGetHelper(accessToken,
	catalogId, batchId, adAccountId, 
	handler, userData, true);
}

bool CatalogSupplementalManager::catalogsSupplementalItemsBatchGetSync(char * accessToken,
	std::string catalogId, std::string batchId, std::string adAccountId, 
	void(* handler)(SupplementalItemsBatchResponse, Error, void* )
	, void* userData)
{
	return catalogsSupplementalItemsBatchGetHelper(accessToken,
	catalogId, batchId, adAccountId, 
	handler, userData, false);
}

