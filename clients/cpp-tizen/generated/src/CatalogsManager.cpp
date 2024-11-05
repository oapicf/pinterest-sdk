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


static bool catalogsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Catalog, Error, void* )
	= reinterpret_cast<void(*)(Catalog, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Catalog out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Catalog")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Catalog", "Catalog");
			json_node_free(pJson);

			if ("Catalog" == "std::string") {
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

static bool catalogsCreateHelper(char * accessToken,
	std::shared_ptr<CatalogsCreateRequest> catalogsCreateRequest, std::string adAccountId, 
	void(* handler)(Catalog, Error, void* )
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

	if (isprimitive("CatalogsCreateRequest")) {
		node = converttoJson(&catalogsCreateRequest, "CatalogsCreateRequest", "");
	}
	
	char *jsonStr =  catalogsCreateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/catalogs");
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
		bool retval = catalogsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsCreateAsync(char * accessToken,
	std::shared_ptr<CatalogsCreateRequest> catalogsCreateRequest, std::string adAccountId, 
	void(* handler)(Catalog, Error, void* )
	, void* userData)
{
	return catalogsCreateHelper(accessToken,
	catalogsCreateRequest, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::catalogsCreateSync(char * accessToken,
	std::shared_ptr<CatalogsCreateRequest> catalogsCreateRequest, std::string adAccountId, 
	void(* handler)(Catalog, Error, void* )
	, void* userData)
{
	return catalogsCreateHelper(accessToken,
	catalogsCreateRequest, adAccountId, 
	handler, userData, false);
}

static bool catalogsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Catalogs_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Catalogs_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Catalogs_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Catalogs_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Catalogs_list_200_response", "Catalogs_list_200_response");
			json_node_free(pJson);

			if ("Catalogs_list_200_response" == "std::string") {
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

static bool catalogsListHelper(char * accessToken,
	std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Catalogs_list_200_response, Error, void* )
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


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/catalogs");
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
		bool retval = catalogsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsListAsync(char * accessToken,
	std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Catalogs_list_200_response, Error, void* )
	, void* userData)
{
	return catalogsListHelper(accessToken,
	bookmark, pageSize, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::catalogsListSync(char * accessToken,
	std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Catalogs_list_200_response, Error, void* )
	, void* userData)
{
	return catalogsListHelper(accessToken,
	bookmark, pageSize, adAccountId, 
	handler, userData, false);
}

static bool catalogsProductGroupPinsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Catalogs_product_group_pins_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Catalogs_product_group_pins_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Catalogs_product_group_pins_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Catalogs_product_group_pins_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Catalogs_product_group_pins_list_200_response", "Catalogs_product_group_pins_list_200_response");
			json_node_free(pJson);

			if ("Catalogs_product_group_pins_list_200_response" == "std::string") {
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

static bool catalogsProductGroupPinsListHelper(char * accessToken,
	std::string productGroupId, std::string bookmark, int pageSize, std::string adAccountId, bool pinMetrics, 
	void(* handler)(Catalogs_product_group_pins_list_200_response, Error, void* )
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


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}


	itemAtq = stringify(&pinMetrics, "bool");
	queryParams.insert(pair<string, string>("pin_metrics", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pin_metrics");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/catalogs/product_groups/{product_group_id}/products");
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
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsProductGroupPinsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupPinsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupPinsListAsync(char * accessToken,
	std::string productGroupId, std::string bookmark, int pageSize, std::string adAccountId, bool pinMetrics, 
	void(* handler)(Catalogs_product_group_pins_list_200_response, Error, void* )
	, void* userData)
{
	return catalogsProductGroupPinsListHelper(accessToken,
	productGroupId, bookmark, pageSize, adAccountId, pinMetrics, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupPinsListSync(char * accessToken,
	std::string productGroupId, std::string bookmark, int pageSize, std::string adAccountId, bool pinMetrics, 
	void(* handler)(Catalogs_product_group_pins_list_200_response, Error, void* )
	, void* userData)
{
	return catalogsProductGroupPinsListHelper(accessToken,
	productGroupId, bookmark, pageSize, adAccountId, pinMetrics, 
	handler, userData, false);
}

static bool catalogsProductGroupsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsVerticalProductGroup, Error, void* )
	= reinterpret_cast<void(*)(CatalogsVerticalProductGroup, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsVerticalProductGroup out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsVerticalProductGroup")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsVerticalProductGroup", "CatalogsVerticalProductGroup");
			json_node_free(pJson);

			if ("CatalogsVerticalProductGroup" == "std::string") {
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

static bool catalogsProductGroupsCreateHelper(char * accessToken,
	std::shared_ptr<Multiple_product_groups_inner> multipleProductGroupsInner, std::string adAccountId, 
	void(* handler)(CatalogsVerticalProductGroup, Error, void* )
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

	if (isprimitive("Multiple_product_groups_inner")) {
		node = converttoJson(&multipleProductGroupsInner, "Multiple_product_groups_inner", "");
	}
	
	char *jsonStr =  multipleProductGroupsInner.toJson();
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupsCreateAsync(char * accessToken,
	std::shared_ptr<Multiple_product_groups_inner> multipleProductGroupsInner, std::string adAccountId, 
	void(* handler)(CatalogsVerticalProductGroup, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsCreateHelper(accessToken,
	multipleProductGroupsInner, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupsCreateSync(char * accessToken,
	std::shared_ptr<Multiple_product_groups_inner> multipleProductGroupsInner, std::string adAccountId, 
	void(* handler)(CatalogsVerticalProductGroup, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsCreateHelper(accessToken,
	multipleProductGroupsInner, adAccountId, 
	handler, userData, false);
}

static bool catalogsProductGroupsCreateManyProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<std::string>, Error, void* )
	= reinterpret_cast<void(*)(std::list<std::string>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<std::string> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			std::string singlemodel;
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

static bool catalogsProductGroupsCreateManyHelper(char * accessToken,
	std::list<Multiple_product_groups_inner> multipleProductGroupsInner, std::string adAccountId, 
	void(* handler)(std::list<std::string>, Error, void* )
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
	if (isprimitive("Multiple_product_groups_inner")) {
		node = converttoJson(&multipleProductGroupsInner, "Multiple_product_groups_inner", "array");
	} else {
		node = json_node_alloc();
		json_array = json_array_new();
		for (std::list
			<Multiple_product_groups_inner>::iterator bodyIter = multipleProductGroupsInner.begin(); bodyIter != multipleProductGroupsInner.end(); ++bodyIter) {
			Multiple_product_groups_inner itemAt = (*bodyIter);
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

	string url("/catalogs/product_groups/multiple");
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
		bool retval = catalogsProductGroupsCreateManyProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupsCreateManyProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupsCreateManyAsync(char * accessToken,
	std::list<Multiple_product_groups_inner> multipleProductGroupsInner, std::string adAccountId, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsCreateManyHelper(accessToken,
	multipleProductGroupsInner, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupsCreateManySync(char * accessToken,
	std::list<Multiple_product_groups_inner> multipleProductGroupsInner, std::string adAccountId, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsCreateManyHelper(accessToken,
	multipleProductGroupsInner, adAccountId, 
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
	std::string productGroupId, std::string adAccountId, 
	
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupsDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupsDeleteAsync(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return catalogsProductGroupsDeleteHelper(accessToken,
	productGroupId, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupsDeleteSync(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return catalogsProductGroupsDeleteHelper(accessToken,
	productGroupId, adAccountId, 
	handler, userData, false);
}

static bool catalogsProductGroupsDeleteManyProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool catalogsProductGroupsDeleteManyHelper(char * accessToken,
	std::list<int> id, std::string adAccountId, 
	
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
	
	for (std::list
	<int>::iterator queryIter = id.begin(); queryIter != id.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "int");
		queryParams.insert(pair<string, string>("id", itemAt));
	}
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/catalogs/product_groups/multiple");
	int pos;


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
		bool retval = catalogsProductGroupsDeleteManyProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupsDeleteManyProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupsDeleteManyAsync(char * accessToken,
	std::list<int> id, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return catalogsProductGroupsDeleteManyHelper(accessToken,
	id, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupsDeleteManySync(char * accessToken,
	std::list<int> id, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return catalogsProductGroupsDeleteManyHelper(accessToken,
	id, adAccountId, 
	handler, userData, false);
}

static bool catalogsProductGroupsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsVerticalProductGroup, Error, void* )
	= reinterpret_cast<void(*)(CatalogsVerticalProductGroup, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsVerticalProductGroup out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsVerticalProductGroup")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsVerticalProductGroup", "CatalogsVerticalProductGroup");
			json_node_free(pJson);

			if ("CatalogsVerticalProductGroup" == "std::string") {
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

static bool catalogsProductGroupsGetHelper(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	void(* handler)(CatalogsVerticalProductGroup, Error, void* )
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
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsProductGroupsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupsGetAsync(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	void(* handler)(CatalogsVerticalProductGroup, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsGetHelper(accessToken,
	productGroupId, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupsGetSync(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	void(* handler)(CatalogsVerticalProductGroup, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsGetHelper(accessToken,
	productGroupId, adAccountId, 
	handler, userData, false);
}

static bool catalogsProductGroupsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Catalogs_product_groups_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Catalogs_product_groups_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Catalogs_product_groups_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Catalogs_product_groups_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Catalogs_product_groups_list_200_response", "Catalogs_product_groups_list_200_response");
			json_node_free(pJson);

			if ("Catalogs_product_groups_list_200_response" == "std::string") {
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
	std::list<int> id, std::string feedId, std::string catalogId, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Catalogs_product_groups_list_200_response, Error, void* )
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
	<int>::iterator queryIter = id.begin(); queryIter != id.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "int");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("id", itemAt));
	}
	

	itemAtq = stringify(&feedId, "std::string");
	queryParams.insert(pair<string, string>("feed_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("feed_id");
	}


	itemAtq = stringify(&catalogId, "std::string");
	queryParams.insert(pair<string, string>("catalog_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("catalog_id");
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


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupsListAsync(char * accessToken,
	std::list<int> id, std::string feedId, std::string catalogId, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Catalogs_product_groups_list_200_response, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsListHelper(accessToken,
	id, feedId, catalogId, bookmark, pageSize, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupsListSync(char * accessToken,
	std::list<int> id, std::string feedId, std::string catalogId, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Catalogs_product_groups_list_200_response, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsListHelper(accessToken,
	id, feedId, catalogId, bookmark, pageSize, adAccountId, 
	handler, userData, false);
}

static bool catalogsProductGroupsProductCountsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsProductGroupProductCountsVertical, Error, void* )
	= reinterpret_cast<void(*)(CatalogsProductGroupProductCountsVertical, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsProductGroupProductCountsVertical out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsProductGroupProductCountsVertical")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsProductGroupProductCountsVertical", "CatalogsProductGroupProductCountsVertical");
			json_node_free(pJson);

			if ("CatalogsProductGroupProductCountsVertical" == "std::string") {
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

static bool catalogsProductGroupsProductCountsGetHelper(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	void(* handler)(CatalogsProductGroupProductCountsVertical, Error, void* )
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

	string url("/catalogs/product_groups/{product_group_id}/product_counts");
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
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = catalogsProductGroupsProductCountsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupsProductCountsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupsProductCountsGetAsync(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	void(* handler)(CatalogsProductGroupProductCountsVertical, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsProductCountsGetHelper(accessToken,
	productGroupId, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupsProductCountsGetSync(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	void(* handler)(CatalogsProductGroupProductCountsVertical, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsProductCountsGetHelper(accessToken,
	productGroupId, adAccountId, 
	handler, userData, false);
}

static bool catalogsProductGroupsUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsVerticalProductGroup, Error, void* )
	= reinterpret_cast<void(*)(CatalogsVerticalProductGroup, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsVerticalProductGroup out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsVerticalProductGroup")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsVerticalProductGroup", "CatalogsVerticalProductGroup");
			json_node_free(pJson);

			if ("CatalogsVerticalProductGroup" == "std::string") {
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

static bool catalogsProductGroupsUpdateHelper(char * accessToken,
	std::string productGroupId, std::shared_ptr<Catalogs_product_groups_update_request> catalogsProductGroupsUpdateRequest, std::string adAccountId, 
	void(* handler)(CatalogsVerticalProductGroup, Error, void* )
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

	if (isprimitive("Catalogs_product_groups_update_request")) {
		node = converttoJson(&catalogsProductGroupsUpdateRequest, "Catalogs_product_groups_update_request", "");
	}
	
	char *jsonStr =  catalogsProductGroupsUpdateRequest.toJson();
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), catalogsProductGroupsUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::catalogsProductGroupsUpdateAsync(char * accessToken,
	std::string productGroupId, std::shared_ptr<Catalogs_product_groups_update_request> catalogsProductGroupsUpdateRequest, std::string adAccountId, 
	void(* handler)(CatalogsVerticalProductGroup, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsUpdateHelper(accessToken,
	productGroupId, catalogsProductGroupsUpdateRequest, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::catalogsProductGroupsUpdateSync(char * accessToken,
	std::string productGroupId, std::shared_ptr<Catalogs_product_groups_update_request> catalogsProductGroupsUpdateRequest, std::string adAccountId, 
	void(* handler)(CatalogsVerticalProductGroup, Error, void* )
	, void* userData)
{
	return catalogsProductGroupsUpdateHelper(accessToken,
	productGroupId, catalogsProductGroupsUpdateRequest, adAccountId, 
	handler, userData, false);
}

static bool feedProcessingResultsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Feed_processing_results_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Feed_processing_results_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Feed_processing_results_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Feed_processing_results_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Feed_processing_results_list_200_response", "Feed_processing_results_list_200_response");
			json_node_free(pJson);

			if ("Feed_processing_results_list_200_response" == "std::string") {
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
	std::string feedId, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Feed_processing_results_list_200_response, Error, void* )
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


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedProcessingResultsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedProcessingResultsListAsync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Feed_processing_results_list_200_response, Error, void* )
	, void* userData)
{
	return feedProcessingResultsListHelper(accessToken,
	feedId, bookmark, pageSize, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::feedProcessingResultsListSync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Feed_processing_results_list_200_response, Error, void* )
	, void* userData)
{
	return feedProcessingResultsListHelper(accessToken,
	feedId, bookmark, pageSize, adAccountId, 
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
	std::shared_ptr<Feeds_create_request> feedsCreateRequest, std::string adAccountId, 
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("Feeds_create_request")) {
		node = converttoJson(&feedsCreateRequest, "Feeds_create_request", "");
	}
	
	char *jsonStr =  feedsCreateRequest.toJson();
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedsCreateAsync(char * accessToken,
	std::shared_ptr<Feeds_create_request> feedsCreateRequest, std::string adAccountId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData)
{
	return feedsCreateHelper(accessToken,
	feedsCreateRequest, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::feedsCreateSync(char * accessToken,
	std::shared_ptr<Feeds_create_request> feedsCreateRequest, std::string adAccountId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData)
{
	return feedsCreateHelper(accessToken,
	feedsCreateRequest, adAccountId, 
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
	std::string feedId, std::string adAccountId, 
	
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedsDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedsDeleteAsync(char * accessToken,
	std::string feedId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return feedsDeleteHelper(accessToken,
	feedId, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::feedsDeleteSync(char * accessToken,
	std::string feedId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return feedsDeleteHelper(accessToken,
	feedId, adAccountId, 
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
	std::string feedId, std::string adAccountId, 
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedsGetAsync(char * accessToken,
	std::string feedId, std::string adAccountId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData)
{
	return feedsGetHelper(accessToken,
	feedId, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::feedsGetSync(char * accessToken,
	std::string feedId, std::string adAccountId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData)
{
	return feedsGetHelper(accessToken,
	feedId, adAccountId, 
	handler, userData, false);
}

static bool feedsIngestProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsFeedIngestion, Error, void* )
	= reinterpret_cast<void(*)(CatalogsFeedIngestion, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsFeedIngestion out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsFeedIngestion")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsFeedIngestion", "CatalogsFeedIngestion");
			json_node_free(pJson);

			if ("CatalogsFeedIngestion" == "std::string") {
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

static bool feedsIngestHelper(char * accessToken,
	std::string feedId, std::string adAccountId, 
	void(* handler)(CatalogsFeedIngestion, Error, void* )
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

	string url("/catalogs/feeds/{feed_id}/ingest");
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
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = feedsIngestProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedsIngestProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedsIngestAsync(char * accessToken,
	std::string feedId, std::string adAccountId, 
	void(* handler)(CatalogsFeedIngestion, Error, void* )
	, void* userData)
{
	return feedsIngestHelper(accessToken,
	feedId, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::feedsIngestSync(char * accessToken,
	std::string feedId, std::string adAccountId, 
	void(* handler)(CatalogsFeedIngestion, Error, void* )
	, void* userData)
{
	return feedsIngestHelper(accessToken,
	feedId, adAccountId, 
	handler, userData, false);
}

static bool feedsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Feeds_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Feeds_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Feeds_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Feeds_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Feeds_list_200_response", "Feeds_list_200_response");
			json_node_free(pJson);

			if ("Feeds_list_200_response" == "std::string") {
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
	std::string bookmark, int pageSize, std::string catalogId, std::string adAccountId, 
	void(* handler)(Feeds_list_200_response, Error, void* )
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


	itemAtq = stringify(&catalogId, "std::string");
	queryParams.insert(pair<string, string>("catalog_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("catalog_id");
	}


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedsListAsync(char * accessToken,
	std::string bookmark, int pageSize, std::string catalogId, std::string adAccountId, 
	void(* handler)(Feeds_list_200_response, Error, void* )
	, void* userData)
{
	return feedsListHelper(accessToken,
	bookmark, pageSize, catalogId, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::feedsListSync(char * accessToken,
	std::string bookmark, int pageSize, std::string catalogId, std::string adAccountId, 
	void(* handler)(Feeds_list_200_response, Error, void* )
	, void* userData)
{
	return feedsListHelper(accessToken,
	bookmark, pageSize, catalogId, adAccountId, 
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
	std::string feedId, std::shared_ptr<Feeds_update_request> feedsUpdateRequest, std::string adAccountId, 
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("Feeds_update_request")) {
		node = converttoJson(&feedsUpdateRequest, "Feeds_update_request", "");
	}
	
	char *jsonStr =  feedsUpdateRequest.toJson();
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), feedsUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::feedsUpdateAsync(char * accessToken,
	std::string feedId, std::shared_ptr<Feeds_update_request> feedsUpdateRequest, std::string adAccountId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData)
{
	return feedsUpdateHelper(accessToken,
	feedId, feedsUpdateRequest, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::feedsUpdateSync(char * accessToken,
	std::string feedId, std::shared_ptr<Feeds_update_request> feedsUpdateRequest, std::string adAccountId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData)
{
	return feedsUpdateHelper(accessToken,
	feedId, feedsUpdateRequest, adAccountId, 
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
	std::string batchId, std::string adAccountId, 
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), itemsBatchGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::itemsBatchGetAsync(char * accessToken,
	std::string batchId, std::string adAccountId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData)
{
	return itemsBatchGetHelper(accessToken,
	batchId, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::itemsBatchGetSync(char * accessToken,
	std::string batchId, std::string adAccountId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData)
{
	return itemsBatchGetHelper(accessToken,
	batchId, adAccountId, 
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
	std::shared_ptr<Items_batch_post_request> itemsBatchPostRequest, std::string adAccountId, 
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("Items_batch_post_request")) {
		node = converttoJson(&itemsBatchPostRequest, "Items_batch_post_request", "");
	}
	
	char *jsonStr =  itemsBatchPostRequest.toJson();
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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), itemsBatchPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::itemsBatchPostAsync(char * accessToken,
	std::shared_ptr<Items_batch_post_request> itemsBatchPostRequest, std::string adAccountId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData)
{
	return itemsBatchPostHelper(accessToken,
	itemsBatchPostRequest, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::itemsBatchPostSync(char * accessToken,
	std::shared_ptr<Items_batch_post_request> itemsBatchPostRequest, std::string adAccountId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData)
{
	return itemsBatchPostHelper(accessToken,
	itemsBatchPostRequest, adAccountId, 
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
	std::string country, std::string language, std::string adAccountId, std::list<std::string> itemIds, CatalogsItemsFilters filters, 
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}


	itemAtq = stringify(&country, "std::string");
	queryParams.insert(pair<string, string>("country", itemAtq));


	itemAtq = stringify(&language, "std::string");
	queryParams.insert(pair<string, string>("language", itemAtq));

	for (std::list
	<std::string>::iterator queryIter = itemIds.begin(); queryIter != itemIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("itemIds", itemAt));
	}
	

	itemAtq = stringify(&filters, "CatalogsItemsFilters");
	queryParams.insert(pair<string, string>("filters", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("filters");
	}

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), itemsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::itemsGetAsync(char * accessToken,
	std::string country, std::string language, std::string adAccountId, std::list<std::string> itemIds, CatalogsItemsFilters filters, 
	void(* handler)(CatalogsItems, Error, void* )
	, void* userData)
{
	return itemsGetHelper(accessToken,
	country, language, adAccountId, itemIds, filters, 
	handler, userData, true);
}

bool CatalogsManager::itemsGetSync(char * accessToken,
	std::string country, std::string language, std::string adAccountId, std::list<std::string> itemIds, CatalogsItemsFilters filters, 
	void(* handler)(CatalogsItems, Error, void* )
	, void* userData)
{
	return itemsGetHelper(accessToken,
	country, language, adAccountId, itemIds, filters, 
	handler, userData, false);
}

static bool itemsIssuesListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Items_issues_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Items_issues_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Items_issues_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Items_issues_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Items_issues_list_200_response", "Items_issues_list_200_response");
			json_node_free(pJson);

			if ("Items_issues_list_200_response" == "std::string") {
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

static bool itemsIssuesListHelper(char * accessToken,
	std::string processingResultId, std::string bookmark, int pageSize, std::list<int> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, std::string adAccountId, 
	void(* handler)(Items_issues_list_200_response, Error, void* )
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

	for (std::list
	<int>::iterator queryIter = itemNumbers.begin(); queryIter != itemNumbers.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "int");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("itemNumbers", itemAt));
	}
	

	itemAtq = stringify(&itemValidationIssue, "CatalogsItemValidationIssue");
	queryParams.insert(pair<string, string>("item_validation_issue", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("item_validation_issue");
	}


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/catalogs/processing_results/{processing_result_id}/item_issues");
	int pos;

	string s_processingResultId("{");
	s_processingResultId.append("processing_result_id");
	s_processingResultId.append("}");
	pos = url.find(s_processingResultId);
	url.erase(pos, s_processingResultId.length());
	url.insert(pos, stringify(&processingResultId, "std::string"));

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
		bool retval = itemsIssuesListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), itemsIssuesListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::itemsIssuesListAsync(char * accessToken,
	std::string processingResultId, std::string bookmark, int pageSize, std::list<int> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, std::string adAccountId, 
	void(* handler)(Items_issues_list_200_response, Error, void* )
	, void* userData)
{
	return itemsIssuesListHelper(accessToken,
	processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::itemsIssuesListSync(char * accessToken,
	std::string processingResultId, std::string bookmark, int pageSize, std::list<int> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, std::string adAccountId, 
	void(* handler)(Items_issues_list_200_response, Error, void* )
	, void* userData)
{
	return itemsIssuesListHelper(accessToken,
	processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId, 
	handler, userData, false);
}

static bool itemsPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool itemsPostHelper(char * accessToken,
	std::shared_ptr<CatalogsItemsRequest> catalogsItemsRequest, std::string adAccountId, 
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("CatalogsItemsRequest")) {
		node = converttoJson(&catalogsItemsRequest, "CatalogsItemsRequest", "");
	}
	
	char *jsonStr =  catalogsItemsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/catalogs/items");
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
		bool retval = itemsPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), itemsPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::itemsPostAsync(char * accessToken,
	std::shared_ptr<CatalogsItemsRequest> catalogsItemsRequest, std::string adAccountId, 
	void(* handler)(CatalogsItems, Error, void* )
	, void* userData)
{
	return itemsPostHelper(accessToken,
	catalogsItemsRequest, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::itemsPostSync(char * accessToken,
	std::shared_ptr<CatalogsItemsRequest> catalogsItemsRequest, std::string adAccountId, 
	void(* handler)(CatalogsItems, Error, void* )
	, void* userData)
{
	return itemsPostHelper(accessToken,
	catalogsItemsRequest, adAccountId, 
	handler, userData, false);
}

static bool productsByProductGroupFilterListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Catalogs_product_group_pins_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Catalogs_product_group_pins_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Catalogs_product_group_pins_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Catalogs_product_group_pins_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Catalogs_product_group_pins_list_200_response", "Catalogs_product_group_pins_list_200_response");
			json_node_free(pJson);

			if ("Catalogs_product_group_pins_list_200_response" == "std::string") {
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

static bool productsByProductGroupFilterListHelper(char * accessToken,
	std::shared_ptr<CatalogsListProductsByFilterRequest> catalogsListProductsByFilterRequest, std::string bookmark, int pageSize, std::string adAccountId, bool pinMetrics, 
	void(* handler)(Catalogs_product_group_pins_list_200_response, Error, void* )
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


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}


	itemAtq = stringify(&pinMetrics, "bool");
	queryParams.insert(pair<string, string>("pin_metrics", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pin_metrics");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("CatalogsListProductsByFilterRequest")) {
		node = converttoJson(&catalogsListProductsByFilterRequest, "CatalogsListProductsByFilterRequest", "");
	}
	
	char *jsonStr =  catalogsListProductsByFilterRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/catalogs/products/get_by_product_group_filters");
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
		bool retval = productsByProductGroupFilterListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), productsByProductGroupFilterListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::productsByProductGroupFilterListAsync(char * accessToken,
	std::shared_ptr<CatalogsListProductsByFilterRequest> catalogsListProductsByFilterRequest, std::string bookmark, int pageSize, std::string adAccountId, bool pinMetrics, 
	void(* handler)(Catalogs_product_group_pins_list_200_response, Error, void* )
	, void* userData)
{
	return productsByProductGroupFilterListHelper(accessToken,
	catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics, 
	handler, userData, true);
}

bool CatalogsManager::productsByProductGroupFilterListSync(char * accessToken,
	std::shared_ptr<CatalogsListProductsByFilterRequest> catalogsListProductsByFilterRequest, std::string bookmark, int pageSize, std::string adAccountId, bool pinMetrics, 
	void(* handler)(Catalogs_product_group_pins_list_200_response, Error, void* )
	, void* userData)
{
	return productsByProductGroupFilterListHelper(accessToken,
	catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics, 
	handler, userData, false);
}

static bool reportsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsCreateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(CatalogsCreateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsCreateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsCreateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsCreateReportResponse", "CatalogsCreateReportResponse");
			json_node_free(pJson);

			if ("CatalogsCreateReportResponse" == "std::string") {
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

static bool reportsCreateHelper(char * accessToken,
	std::shared_ptr<CatalogsReportParameters> catalogsReportParameters, std::string adAccountId, 
	void(* handler)(CatalogsCreateReportResponse, Error, void* )
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

	if (isprimitive("CatalogsReportParameters")) {
		node = converttoJson(&catalogsReportParameters, "CatalogsReportParameters", "");
	}
	
	char *jsonStr =  catalogsReportParameters.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/catalogs/reports");
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
		bool retval = reportsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), reportsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::reportsCreateAsync(char * accessToken,
	std::shared_ptr<CatalogsReportParameters> catalogsReportParameters, std::string adAccountId, 
	void(* handler)(CatalogsCreateReportResponse, Error, void* )
	, void* userData)
{
	return reportsCreateHelper(accessToken,
	catalogsReportParameters, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::reportsCreateSync(char * accessToken,
	std::shared_ptr<CatalogsReportParameters> catalogsReportParameters, std::string adAccountId, 
	void(* handler)(CatalogsCreateReportResponse, Error, void* )
	, void* userData)
{
	return reportsCreateHelper(accessToken,
	catalogsReportParameters, adAccountId, 
	handler, userData, false);
}

static bool reportsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CatalogsReport, Error, void* )
	= reinterpret_cast<void(*)(CatalogsReport, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CatalogsReport out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CatalogsReport")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CatalogsReport", "CatalogsReport");
			json_node_free(pJson);

			if ("CatalogsReport" == "std::string") {
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

static bool reportsGetHelper(char * accessToken,
	std::string token, std::string adAccountId, 
	void(* handler)(CatalogsReport, Error, void* )
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


	itemAtq = stringify(&token, "std::string");
	queryParams.insert(pair<string, string>("token", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/catalogs/reports");
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
		bool retval = reportsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), reportsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::reportsGetAsync(char * accessToken,
	std::string token, std::string adAccountId, 
	void(* handler)(CatalogsReport, Error, void* )
	, void* userData)
{
	return reportsGetHelper(accessToken,
	token, adAccountId, 
	handler, userData, true);
}

bool CatalogsManager::reportsGetSync(char * accessToken,
	std::string token, std::string adAccountId, 
	void(* handler)(CatalogsReport, Error, void* )
	, void* userData)
{
	return reportsGetHelper(accessToken,
	token, adAccountId, 
	handler, userData, false);
}

static bool reportsStatsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Reports_stats_200_response, Error, void* )
	= reinterpret_cast<void(*)(Reports_stats_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Reports_stats_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Reports_stats_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Reports_stats_200_response", "Reports_stats_200_response");
			json_node_free(pJson);

			if ("Reports_stats_200_response" == "std::string") {
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

static bool reportsStatsHelper(char * accessToken,
	CatalogsReportParameters parameters, std::string adAccountId, int pageSize, std::string bookmark, 
	void(* handler)(Reports_stats_200_response, Error, void* )
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


	itemAtq = stringify(&parameters, "CatalogsReportParameters");
	queryParams.insert(pair<string, string>("parameters", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/catalogs/reports/stats");
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
		bool retval = reportsStatsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CatalogsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), reportsStatsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CatalogsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CatalogsManager::reportsStatsAsync(char * accessToken,
	CatalogsReportParameters parameters, std::string adAccountId, int pageSize, std::string bookmark, 
	void(* handler)(Reports_stats_200_response, Error, void* )
	, void* userData)
{
	return reportsStatsHelper(accessToken,
	parameters, adAccountId, pageSize, bookmark, 
	handler, userData, true);
}

bool CatalogsManager::reportsStatsSync(char * accessToken,
	CatalogsReportParameters parameters, std::string adAccountId, int pageSize, std::string bookmark, 
	void(* handler)(Reports_stats_200_response, Error, void* )
	, void* userData)
{
	return reportsStatsHelper(accessToken,
	parameters, adAccountId, pageSize, bookmark, 
	handler, userData, false);
}

