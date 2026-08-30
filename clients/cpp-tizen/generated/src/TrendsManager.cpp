#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "TrendsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


TrendsManager::TrendsManager()
{

}

TrendsManager::~TrendsManager()
{

}

static gboolean __TrendsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __TrendsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__TrendsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool trendsEditorialArticlesListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<TrendsEditorial>, Error, void* )
	= reinterpret_cast<void(*)(std::list<TrendsEditorial>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<TrendsEditorial> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			TrendsEditorial singlemodel;
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

static bool trendsEditorialArticlesListHelper(char * accessToken,
	ProductCategoryRegion region, 
	void(* handler)(std::list<TrendsEditorial>, Error, void* )
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
	

	itemAtq = stringify(&region, "ProductCategoryRegion");
	queryParams.insert(pair<string, string>("region", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/trends/editorial_articles");
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
		NetClient::easycurl(TrendsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = trendsEditorialArticlesListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TrendsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), trendsEditorialArticlesListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TrendsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TrendsManager::trendsEditorialArticlesListAsync(char * accessToken,
	ProductCategoryRegion region, 
	void(* handler)(std::list<TrendsEditorial>, Error, void* )
	, void* userData)
{
	return trendsEditorialArticlesListHelper(accessToken,
	region, 
	handler, userData, true);
}

bool TrendsManager::trendsEditorialArticlesListSync(char * accessToken,
	ProductCategoryRegion region, 
	void(* handler)(std::list<TrendsEditorial>, Error, void* )
	, void* userData)
{
	return trendsEditorialArticlesListHelper(accessToken,
	region, 
	handler, userData, false);
}

static bool trendsFeaturedTopicsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<FeaturedTrend>, Error, void* )
	= reinterpret_cast<void(*)(std::list<FeaturedTrend>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<FeaturedTrend> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			FeaturedTrend singlemodel;
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

static bool trendsFeaturedTopicsListHelper(char * accessToken,
	ProductCategoryRegion region, InterestsEnum interest, 
	void(* handler)(std::list<FeaturedTrend>, Error, void* )
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
	

	itemAtq = stringify(&interest, "InterestsEnum");
	queryParams.insert(pair<string, string>("interest", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("interest");
	}


	itemAtq = stringify(&region, "ProductCategoryRegion");
	queryParams.insert(pair<string, string>("region", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/trends/topics/featured");
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
		NetClient::easycurl(TrendsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = trendsFeaturedTopicsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TrendsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), trendsFeaturedTopicsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TrendsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TrendsManager::trendsFeaturedTopicsListAsync(char * accessToken,
	ProductCategoryRegion region, InterestsEnum interest, 
	void(* handler)(std::list<FeaturedTrend>, Error, void* )
	, void* userData)
{
	return trendsFeaturedTopicsListHelper(accessToken,
	region, interest, 
	handler, userData, true);
}

bool TrendsManager::trendsFeaturedTopicsListSync(char * accessToken,
	ProductCategoryRegion region, InterestsEnum interest, 
	void(* handler)(std::list<FeaturedTrend>, Error, void* )
	, void* userData)
{
	return trendsFeaturedTopicsListHelper(accessToken,
	region, interest, 
	handler, userData, false);
}

static bool trendsProductCategoriesDetailsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<ProductCategoryDetails>, Error, void* )
	= reinterpret_cast<void(*)(std::list<ProductCategoryDetails>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<ProductCategoryDetails> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			ProductCategoryDetails singlemodel;
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

static bool trendsProductCategoriesDetailsListHelper(char * accessToken,
	std::list<ProductCategoryEnum> productCategories, ProductCategoryRegion region, ProductCategoryDetailLookbackWindow lookbackWindow, ProductCategoriesEngagementType engagementType, 
	void(* handler)(std::list<ProductCategoryDetails>, Error, void* )
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
	<ProductCategoryEnum>::iterator queryIter = productCategories.begin(); queryIter != productCategories.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "ProductCategoryEnum");
		queryParams.insert(pair<string, string>("productCategories", itemAt));
	}
	

	itemAtq = stringify(&region, "ProductCategoryRegion");
	queryParams.insert(pair<string, string>("region", itemAtq));


	itemAtq = stringify(&lookbackWindow, "ProductCategoryDetailLookbackWindow");
	queryParams.insert(pair<string, string>("lookback_window", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("lookback_window");
	}


	itemAtq = stringify(&engagementType, "ProductCategoriesEngagementType");
	queryParams.insert(pair<string, string>("engagement_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("engagement_type");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/trends/product_categories/details");
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
		NetClient::easycurl(TrendsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = trendsProductCategoriesDetailsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TrendsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), trendsProductCategoriesDetailsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TrendsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TrendsManager::trendsProductCategoriesDetailsListAsync(char * accessToken,
	std::list<ProductCategoryEnum> productCategories, ProductCategoryRegion region, ProductCategoryDetailLookbackWindow lookbackWindow, ProductCategoriesEngagementType engagementType, 
	void(* handler)(std::list<ProductCategoryDetails>, Error, void* )
	, void* userData)
{
	return trendsProductCategoriesDetailsListHelper(accessToken,
	productCategories, region, lookbackWindow, engagementType, 
	handler, userData, true);
}

bool TrendsManager::trendsProductCategoriesDetailsListSync(char * accessToken,
	std::list<ProductCategoryEnum> productCategories, ProductCategoryRegion region, ProductCategoryDetailLookbackWindow lookbackWindow, ProductCategoriesEngagementType engagementType, 
	void(* handler)(std::list<ProductCategoryDetails>, Error, void* )
	, void* userData)
{
	return trendsProductCategoriesDetailsListHelper(accessToken,
	productCategories, region, lookbackWindow, engagementType, 
	handler, userData, false);
}

static bool trendsProductCategoriesTrendingListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<TrendingProductCategory>, Error, void* )
	= reinterpret_cast<void(*)(std::list<TrendingProductCategory>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<TrendingProductCategory> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			TrendingProductCategory singlemodel;
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

static bool trendsProductCategoriesTrendingListHelper(char * accessToken,
	ProductCategoryRegion region, std::list<VerticalProductCategory> verticals, std::list<AgeTrendsBucket> ages, std::list<GenderBucket> genders, ProductCategoriesEngagementType engagementType, 
	void(* handler)(std::list<TrendingProductCategory>, Error, void* )
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
	

	itemAtq = stringify(&region, "ProductCategoryRegion");
	queryParams.insert(pair<string, string>("region", itemAtq));

	for (std::list
	<VerticalProductCategory>::iterator queryIter = verticals.begin(); queryIter != verticals.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "VerticalProductCategory");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("verticals", itemAt));
	}
	
	for (std::list
	<AgeTrendsBucket>::iterator queryIter = ages.begin(); queryIter != ages.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "AgeTrendsBucket");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("ages", itemAt));
	}
	
	for (std::list
	<GenderBucket>::iterator queryIter = genders.begin(); queryIter != genders.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "GenderBucket");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("genders", itemAt));
	}
	

	itemAtq = stringify(&engagementType, "ProductCategoriesEngagementType");
	queryParams.insert(pair<string, string>("engagement_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("engagement_type");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/trends/product_categories/trending");
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
		NetClient::easycurl(TrendsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = trendsProductCategoriesTrendingListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TrendsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), trendsProductCategoriesTrendingListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TrendsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TrendsManager::trendsProductCategoriesTrendingListAsync(char * accessToken,
	ProductCategoryRegion region, std::list<VerticalProductCategory> verticals, std::list<AgeTrendsBucket> ages, std::list<GenderBucket> genders, ProductCategoriesEngagementType engagementType, 
	void(* handler)(std::list<TrendingProductCategory>, Error, void* )
	, void* userData)
{
	return trendsProductCategoriesTrendingListHelper(accessToken,
	region, verticals, ages, genders, engagementType, 
	handler, userData, true);
}

bool TrendsManager::trendsProductCategoriesTrendingListSync(char * accessToken,
	ProductCategoryRegion region, std::list<VerticalProductCategory> verticals, std::list<AgeTrendsBucket> ages, std::list<GenderBucket> genders, ProductCategoriesEngagementType engagementType, 
	void(* handler)(std::list<TrendingProductCategory>, Error, void* )
	, void* userData)
{
	return trendsProductCategoriesTrendingListHelper(accessToken,
	region, verticals, ages, genders, engagementType, 
	handler, userData, false);
}

