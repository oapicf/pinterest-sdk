#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ProductTagsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ProductTagsManager::ProductTagsManager()
{

}

ProductTagsManager::~ProductTagsManager()
{

}

static gboolean __ProductTagsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ProductTagsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ProductTagsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool productTagsBulkAddProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProductTagsResponse, Error, void* )
	= reinterpret_cast<void(*)(ProductTagsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProductTagsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProductTagsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProductTagsResponse", "ProductTagsResponse");
			json_node_free(pJson);

			if ("ProductTagsResponse" == "std::string") {
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

static bool productTagsBulkAddHelper(char * accessToken,
	std::string pinId, std::shared_ptr<ProductTagsBulkAddRequest> productTagsBulkAddRequest, 
	void(* handler)(ProductTagsResponse, Error, void* )
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

	if (isprimitive("ProductTagsBulkAddRequest")) {
		node = converttoJson(&productTagsBulkAddRequest, "ProductTagsBulkAddRequest", "");
	}
	
	char *jsonStr =  productTagsBulkAddRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/pins/{pin_id}/product_tags");
	int pos;

	string s_pinId("{");
	s_pinId.append("pin_id");
	s_pinId.append("}");
	pos = url.find(s_pinId);
	url.erase(pos, s_pinId.length());
	url.insert(pos, stringify(&pinId, "std::string"));

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
		NetClient::easycurl(ProductTagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = productTagsBulkAddProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProductTagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), productTagsBulkAddProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProductTagsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProductTagsManager::productTagsBulkAddAsync(char * accessToken,
	std::string pinId, std::shared_ptr<ProductTagsBulkAddRequest> productTagsBulkAddRequest, 
	void(* handler)(ProductTagsResponse, Error, void* )
	, void* userData)
{
	return productTagsBulkAddHelper(accessToken,
	pinId, productTagsBulkAddRequest, 
	handler, userData, true);
}

bool ProductTagsManager::productTagsBulkAddSync(char * accessToken,
	std::string pinId, std::shared_ptr<ProductTagsBulkAddRequest> productTagsBulkAddRequest, 
	void(* handler)(ProductTagsResponse, Error, void* )
	, void* userData)
{
	return productTagsBulkAddHelper(accessToken,
	pinId, productTagsBulkAddRequest, 
	handler, userData, false);
}

static bool productTagsBulkDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool productTagsBulkDeleteHelper(char * accessToken,
	std::string pinId, std::shared_ptr<ProductTagsBulkDeleteRequest> productTagsBulkDeleteRequest, 
	
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

	if (isprimitive("ProductTagsBulkDeleteRequest")) {
		node = converttoJson(&productTagsBulkDeleteRequest, "ProductTagsBulkDeleteRequest", "");
	}
	
	char *jsonStr =  productTagsBulkDeleteRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/pins/{pin_id}/product_tags/bulk-delete");
	int pos;

	string s_pinId("{");
	s_pinId.append("pin_id");
	s_pinId.append("}");
	pos = url.find(s_pinId);
	url.erase(pos, s_pinId.length());
	url.insert(pos, stringify(&pinId, "std::string"));

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
		NetClient::easycurl(ProductTagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = productTagsBulkDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProductTagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), productTagsBulkDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProductTagsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProductTagsManager::productTagsBulkDeleteAsync(char * accessToken,
	std::string pinId, std::shared_ptr<ProductTagsBulkDeleteRequest> productTagsBulkDeleteRequest, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return productTagsBulkDeleteHelper(accessToken,
	pinId, productTagsBulkDeleteRequest, 
	handler, userData, true);
}

bool ProductTagsManager::productTagsBulkDeleteSync(char * accessToken,
	std::string pinId, std::shared_ptr<ProductTagsBulkDeleteRequest> productTagsBulkDeleteRequest, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return productTagsBulkDeleteHelper(accessToken,
	pinId, productTagsBulkDeleteRequest, 
	handler, userData, false);
}

static bool productTagsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProductTagsResponse, Error, void* )
	= reinterpret_cast<void(*)(ProductTagsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProductTagsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProductTagsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProductTagsResponse", "ProductTagsResponse");
			json_node_free(pJson);

			if ("ProductTagsResponse" == "std::string") {
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

static bool productTagsListHelper(char * accessToken,
	std::string pinId, 
	void(* handler)(ProductTagsResponse, Error, void* )
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

	string url("/pins/{pin_id}/product_tags");
	int pos;

	string s_pinId("{");
	s_pinId.append("pin_id");
	s_pinId.append("}");
	pos = url.find(s_pinId);
	url.erase(pos, s_pinId.length());
	url.insert(pos, stringify(&pinId, "std::string"));

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
		NetClient::easycurl(ProductTagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = productTagsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProductTagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), productTagsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProductTagsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProductTagsManager::productTagsListAsync(char * accessToken,
	std::string pinId, 
	void(* handler)(ProductTagsResponse, Error, void* )
	, void* userData)
{
	return productTagsListHelper(accessToken,
	pinId, 
	handler, userData, true);
}

bool ProductTagsManager::productTagsListSync(char * accessToken,
	std::string pinId, 
	void(* handler)(ProductTagsResponse, Error, void* )
	, void* userData)
{
	return productTagsListHelper(accessToken,
	pinId, 
	handler, userData, false);
}

