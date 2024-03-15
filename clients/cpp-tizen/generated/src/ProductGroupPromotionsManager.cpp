#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ProductGroupPromotionsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ProductGroupPromotionsManager::ProductGroupPromotionsManager()
{

}

ProductGroupPromotionsManager::~ProductGroupPromotionsManager()
{

}

static gboolean __ProductGroupPromotionsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ProductGroupPromotionsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ProductGroupPromotionsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool productGroupPromotionsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	= reinterpret_cast<void(*)(ProductGroupPromotionResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProductGroupPromotionResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProductGroupPromotionResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProductGroupPromotionResponse", "ProductGroupPromotionResponse");
			json_node_free(pJson);

			if ("ProductGroupPromotionResponse" == "std::string") {
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

static bool productGroupPromotionsCreateHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionCreateRequest> productGroupPromotionCreateRequest, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
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

	if (isprimitive("ProductGroupPromotionCreateRequest")) {
		node = converttoJson(&productGroupPromotionCreateRequest, "ProductGroupPromotionCreateRequest", "");
	}
	
	char *jsonStr =  productGroupPromotionCreateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/product_group_promotions");
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
		NetClient::easycurl(ProductGroupPromotionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = productGroupPromotionsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProductGroupPromotionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), productGroupPromotionsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProductGroupPromotionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProductGroupPromotionsManager::productGroupPromotionsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionCreateRequest> productGroupPromotionCreateRequest, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	, void* userData)
{
	return productGroupPromotionsCreateHelper(accessToken,
	adAccountId, productGroupPromotionCreateRequest, 
	handler, userData, true);
}

bool ProductGroupPromotionsManager::productGroupPromotionsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionCreateRequest> productGroupPromotionCreateRequest, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	, void* userData)
{
	return productGroupPromotionsCreateHelper(accessToken,
	adAccountId, productGroupPromotionCreateRequest, 
	handler, userData, false);
}

static bool productGroupPromotionsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	= reinterpret_cast<void(*)(ProductGroupPromotionResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProductGroupPromotionResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProductGroupPromotionResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProductGroupPromotionResponse", "ProductGroupPromotionResponse");
			json_node_free(pJson);

			if ("ProductGroupPromotionResponse" == "std::string") {
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

static bool productGroupPromotionsGetHelper(char * accessToken,
	std::string adAccountId, std::string productGroupPromotionId, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
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

	string url("/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}");
	int pos;

	string s_adAccountId("{");
	s_adAccountId.append("ad_account_id");
	s_adAccountId.append("}");
	pos = url.find(s_adAccountId);
	url.erase(pos, s_adAccountId.length());
	url.insert(pos, stringify(&adAccountId, "std::string"));
	string s_productGroupPromotionId("{");
	s_productGroupPromotionId.append("product_group_promotion_id");
	s_productGroupPromotionId.append("}");
	pos = url.find(s_productGroupPromotionId);
	url.erase(pos, s_productGroupPromotionId.length());
	url.insert(pos, stringify(&productGroupPromotionId, "std::string"));

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
		NetClient::easycurl(ProductGroupPromotionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = productGroupPromotionsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProductGroupPromotionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), productGroupPromotionsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProductGroupPromotionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProductGroupPromotionsManager::productGroupPromotionsGetAsync(char * accessToken,
	std::string adAccountId, std::string productGroupPromotionId, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	, void* userData)
{
	return productGroupPromotionsGetHelper(accessToken,
	adAccountId, productGroupPromotionId, 
	handler, userData, true);
}

bool ProductGroupPromotionsManager::productGroupPromotionsGetSync(char * accessToken,
	std::string adAccountId, std::string productGroupPromotionId, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	, void* userData)
{
	return productGroupPromotionsGetHelper(accessToken,
	adAccountId, productGroupPromotionId, 
	handler, userData, false);
}

static bool productGroupPromotionsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Product_group_promotions_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Product_group_promotions_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Product_group_promotions_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Product_group_promotions_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Product_group_promotions_list_200_response", "Product_group_promotions_list_200_response");
			json_node_free(pJson);

			if ("Product_group_promotions_list_200_response" == "std::string") {
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

static bool productGroupPromotionsListHelper(char * accessToken,
	std::string adAccountId, std::list<std::string> productGroupPromotionIds, std::list<std::string> entityStatuses, std::string adGroupId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Product_group_promotions_list_200_response, Error, void* )
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
	<std::string>::iterator queryIter = productGroupPromotionIds.begin(); queryIter != productGroupPromotionIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("productGroupPromotionIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = entityStatuses.begin(); queryIter != entityStatuses.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("entityStatuses", itemAt));
	}
	

	itemAtq = stringify(&adGroupId, "std::string");
	queryParams.insert(pair<string, string>("ad_group_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_group_id");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("page_size", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page_size");
	}


	itemAtq = stringify(&order, "std::string");
	queryParams.insert(pair<string, string>("order", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("order");
	}


	itemAtq = stringify(&bookmark, "std::string");
	queryParams.insert(pair<string, string>("bookmark", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bookmark");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/product_group_promotions");
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
		NetClient::easycurl(ProductGroupPromotionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = productGroupPromotionsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProductGroupPromotionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), productGroupPromotionsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProductGroupPromotionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProductGroupPromotionsManager::productGroupPromotionsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> productGroupPromotionIds, std::list<std::string> entityStatuses, std::string adGroupId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Product_group_promotions_list_200_response, Error, void* )
	, void* userData)
{
	return productGroupPromotionsListHelper(accessToken,
	adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark, 
	handler, userData, true);
}

bool ProductGroupPromotionsManager::productGroupPromotionsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> productGroupPromotionIds, std::list<std::string> entityStatuses, std::string adGroupId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Product_group_promotions_list_200_response, Error, void* )
	, void* userData)
{
	return productGroupPromotionsListHelper(accessToken,
	adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark, 
	handler, userData, false);
}

static bool productGroupPromotionsUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	= reinterpret_cast<void(*)(ProductGroupPromotionResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProductGroupPromotionResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProductGroupPromotionResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProductGroupPromotionResponse", "ProductGroupPromotionResponse");
			json_node_free(pJson);

			if ("ProductGroupPromotionResponse" == "std::string") {
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

static bool productGroupPromotionsUpdateHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionUpdateRequest> productGroupPromotionUpdateRequest, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
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

	if (isprimitive("ProductGroupPromotionUpdateRequest")) {
		node = converttoJson(&productGroupPromotionUpdateRequest, "ProductGroupPromotionUpdateRequest", "");
	}
	
	char *jsonStr =  productGroupPromotionUpdateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/product_group_promotions");
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
		NetClient::easycurl(ProductGroupPromotionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = productGroupPromotionsUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProductGroupPromotionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), productGroupPromotionsUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProductGroupPromotionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProductGroupPromotionsManager::productGroupPromotionsUpdateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionUpdateRequest> productGroupPromotionUpdateRequest, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	, void* userData)
{
	return productGroupPromotionsUpdateHelper(accessToken,
	adAccountId, productGroupPromotionUpdateRequest, 
	handler, userData, true);
}

bool ProductGroupPromotionsManager::productGroupPromotionsUpdateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionUpdateRequest> productGroupPromotionUpdateRequest, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	, void* userData)
{
	return productGroupPromotionsUpdateHelper(accessToken,
	adAccountId, productGroupPromotionUpdateRequest, 
	handler, userData, false);
}

static bool productGroupsAnalyticsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<ProductGroupAnalyticsResponse_inner>, Error, void* )
	= reinterpret_cast<void(*)(std::list<ProductGroupAnalyticsResponse_inner>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<ProductGroupAnalyticsResponse_inner> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			ProductGroupAnalyticsResponse_inner singlemodel;
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

static bool productGroupsAnalyticsHelper(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> productGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<ProductGroupAnalyticsResponse_inner>, Error, void* )
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
	

	itemAtq = stringify(&startDate, "Date");
	queryParams.insert(pair<string, string>("start_date", itemAtq));


	itemAtq = stringify(&endDate, "Date");
	queryParams.insert(pair<string, string>("end_date", itemAtq));

	for (std::list
	<std::string>::iterator queryIter = productGroupIds.begin(); queryIter != productGroupIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("productGroupIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = columns.begin(); queryIter != columns.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("columns", itemAt));
	}
	

	itemAtq = stringify(&granularity, "Granularity");
	queryParams.insert(pair<string, string>("granularity", itemAtq));


	itemAtq = stringify(&clickWindowDays, "int");
	queryParams.insert(pair<string, string>("click_window_days", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("click_window_days");
	}


	itemAtq = stringify(&engagementWindowDays, "int");
	queryParams.insert(pair<string, string>("engagement_window_days", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("engagement_window_days");
	}


	itemAtq = stringify(&viewWindowDays, "int");
	queryParams.insert(pair<string, string>("view_window_days", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("view_window_days");
	}


	itemAtq = stringify(&conversionReportTime, "std::string");
	queryParams.insert(pair<string, string>("conversion_report_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("conversion_report_time");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/product_groups/analytics");
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
		NetClient::easycurl(ProductGroupPromotionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = productGroupsAnalyticsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProductGroupPromotionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), productGroupsAnalyticsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProductGroupPromotionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProductGroupPromotionsManager::productGroupsAnalyticsAsync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> productGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<ProductGroupAnalyticsResponse_inner>, Error, void* )
	, void* userData)
{
	return productGroupsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, true);
}

bool ProductGroupPromotionsManager::productGroupsAnalyticsSync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> productGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<ProductGroupAnalyticsResponse_inner>, Error, void* )
	, void* userData)
{
	return productGroupsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, false);
}

