#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "AdAccountsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


AdAccountsManager::AdAccountsManager()
{

}

AdAccountsManager::~AdAccountsManager()
{

}

static gboolean __AdAccountsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __AdAccountsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__AdAccountsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool adAccountAnalyticsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<std::map>, Error, void* )
	= reinterpret_cast<void(*)(std::list<std::map>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<std::map> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			std::map singlemodel;
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

static bool adAccountAnalyticsHelper(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
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

	string url("/ad_accounts/{ad_account_id}/analytics");
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
		NetClient::easycurl(AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adAccountAnalyticsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adAccountAnalyticsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdAccountsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdAccountsManager::adAccountAnalyticsAsync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
	, void* userData)
{
	return adAccountAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, true);
}

bool AdAccountsManager::adAccountAnalyticsSync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
	, void* userData)
{
	return adAccountAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, false);
}

static bool adAccountsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool adAccountsListHelper(char * accessToken,
	std::string bookmark, int pageSize, bool includeSharedAccounts, 
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


	itemAtq = stringify(&includeSharedAccounts, "bool");
	queryParams.insert(pair<string, string>("include_shared_accounts", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_shared_accounts");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts");
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
		NetClient::easycurl(AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adAccountsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adAccountsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdAccountsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdAccountsManager::adAccountsListAsync(char * accessToken,
	std::string bookmark, int pageSize, bool includeSharedAccounts, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return adAccountsListHelper(accessToken,
	bookmark, pageSize, includeSharedAccounts, 
	handler, userData, true);
}

bool AdAccountsManager::adAccountsListSync(char * accessToken,
	std::string bookmark, int pageSize, bool includeSharedAccounts, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return adAccountsListHelper(accessToken,
	bookmark, pageSize, includeSharedAccounts, 
	handler, userData, false);
}

static bool adGroupsAnalyticsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<std::map>, Error, void* )
	= reinterpret_cast<void(*)(std::list<std::map>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<std::map> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			std::map singlemodel;
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

static bool adGroupsAnalyticsHelper(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> adGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
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
	<std::string>::iterator queryIter = adGroupIds.begin(); queryIter != adGroupIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("adGroupIds", itemAt));
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

	string url("/ad_accounts/{ad_account_id}/ad_groups/analytics");
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
		NetClient::easycurl(AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adGroupsAnalyticsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adGroupsAnalyticsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdAccountsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdAccountsManager::adGroupsAnalyticsAsync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> adGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
	, void* userData)
{
	return adGroupsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, true);
}

bool AdAccountsManager::adGroupsAnalyticsSync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> adGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
	, void* userData)
{
	return adGroupsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, false);
}

static bool adGroupsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool adGroupsListHelper(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, bool translateInterestsToNames, 
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
	
	for (std::list
	<std::string>::iterator queryIter = campaignIds.begin(); queryIter != campaignIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("campaignIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = adGroupIds.begin(); queryIter != adGroupIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("adGroupIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = entityStatuses.begin(); queryIter != entityStatuses.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("entityStatuses", itemAt));
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


	itemAtq = stringify(&translateInterestsToNames, "bool");
	queryParams.insert(pair<string, string>("translate_interests_to_names", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("translate_interests_to_names");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/ad_groups");
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
		NetClient::easycurl(AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adGroupsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adGroupsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdAccountsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdAccountsManager::adGroupsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, bool translateInterestsToNames, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return adGroupsListHelper(accessToken,
	adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames, 
	handler, userData, true);
}

bool AdAccountsManager::adGroupsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, bool translateInterestsToNames, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return adGroupsListHelper(accessToken,
	adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames, 
	handler, userData, false);
}

static bool adsAnalyticsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<std::map>, Error, void* )
	= reinterpret_cast<void(*)(std::list<std::map>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<std::map> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			std::map singlemodel;
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

static bool adsAnalyticsHelper(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> adIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
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
	<std::string>::iterator queryIter = adIds.begin(); queryIter != adIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("adIds", itemAt));
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

	string url("/ad_accounts/{ad_account_id}/ads/analytics");
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
		NetClient::easycurl(AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adsAnalyticsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adsAnalyticsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdAccountsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdAccountsManager::adsAnalyticsAsync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> adIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
	, void* userData)
{
	return adsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, true);
}

bool AdAccountsManager::adsAnalyticsSync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> adIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
	, void* userData)
{
	return adsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, false);
}

static bool adsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool adsListHelper(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<std::string> adIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, 
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
	
	for (std::list
	<std::string>::iterator queryIter = campaignIds.begin(); queryIter != campaignIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("campaignIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = adGroupIds.begin(); queryIter != adGroupIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("adGroupIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = adIds.begin(); queryIter != adIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("adIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = entityStatuses.begin(); queryIter != entityStatuses.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("entityStatuses", itemAt));
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

	string url("/ad_accounts/{ad_account_id}/ads");
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
		NetClient::easycurl(AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdAccountsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdAccountsManager::adsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<std::string> adIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return adsListHelper(accessToken,
	adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark, 
	handler, userData, true);
}

bool AdAccountsManager::adsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<std::string> adIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return adsListHelper(accessToken,
	adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark, 
	handler, userData, false);
}

static bool analyticsCreateReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdsAnalyticsCreateAsyncResponse, Error, void* )
	= reinterpret_cast<void(*)(AdsAnalyticsCreateAsyncResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdsAnalyticsCreateAsyncResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdsAnalyticsCreateAsyncResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdsAnalyticsCreateAsyncResponse", "AdsAnalyticsCreateAsyncResponse");
			json_node_free(pJson);

			if ("AdsAnalyticsCreateAsyncResponse" == "std::string") {
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

static bool analyticsCreateReportHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdsAnalyticsCreateAsyncRequest> adsAnalyticsCreateAsyncRequest, 
	void(* handler)(AdsAnalyticsCreateAsyncResponse, Error, void* )
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

	if (isprimitive("AdsAnalyticsCreateAsyncRequest")) {
		node = converttoJson(&adsAnalyticsCreateAsyncRequest, "AdsAnalyticsCreateAsyncRequest", "");
	}
	
	char *jsonStr =  adsAnalyticsCreateAsyncRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/reports");
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
		NetClient::easycurl(AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = analyticsCreateReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), analyticsCreateReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdAccountsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdAccountsManager::analyticsCreateReportAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdsAnalyticsCreateAsyncRequest> adsAnalyticsCreateAsyncRequest, 
	void(* handler)(AdsAnalyticsCreateAsyncResponse, Error, void* )
	, void* userData)
{
	return analyticsCreateReportHelper(accessToken,
	adAccountId, adsAnalyticsCreateAsyncRequest, 
	handler, userData, true);
}

bool AdAccountsManager::analyticsCreateReportSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdsAnalyticsCreateAsyncRequest> adsAnalyticsCreateAsyncRequest, 
	void(* handler)(AdsAnalyticsCreateAsyncResponse, Error, void* )
	, void* userData)
{
	return analyticsCreateReportHelper(accessToken,
	adAccountId, adsAnalyticsCreateAsyncRequest, 
	handler, userData, false);
}

static bool analyticsGetReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdsAnalyticsGetAsyncResponse, Error, void* )
	= reinterpret_cast<void(*)(AdsAnalyticsGetAsyncResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdsAnalyticsGetAsyncResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdsAnalyticsGetAsyncResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdsAnalyticsGetAsyncResponse", "AdsAnalyticsGetAsyncResponse");
			json_node_free(pJson);

			if ("AdsAnalyticsGetAsyncResponse" == "std::string") {
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

static bool analyticsGetReportHelper(char * accessToken,
	std::string adAccountId, std::string token, 
	void(* handler)(AdsAnalyticsGetAsyncResponse, Error, void* )
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
	

	itemAtq = stringify(&token, "std::string");
	queryParams.insert(pair<string, string>("token", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/reports");
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
		NetClient::easycurl(AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = analyticsGetReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), analyticsGetReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdAccountsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdAccountsManager::analyticsGetReportAsync(char * accessToken,
	std::string adAccountId, std::string token, 
	void(* handler)(AdsAnalyticsGetAsyncResponse, Error, void* )
	, void* userData)
{
	return analyticsGetReportHelper(accessToken,
	adAccountId, token, 
	handler, userData, true);
}

bool AdAccountsManager::analyticsGetReportSync(char * accessToken,
	std::string adAccountId, std::string token, 
	void(* handler)(AdsAnalyticsGetAsyncResponse, Error, void* )
	, void* userData)
{
	return analyticsGetReportHelper(accessToken,
	adAccountId, token, 
	handler, userData, false);
}

static bool campaignsAnalyticsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<std::map>, Error, void* )
	= reinterpret_cast<void(*)(std::list<std::map>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<std::map> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			std::map singlemodel;
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

static bool campaignsAnalyticsHelper(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> campaignIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
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
	<std::string>::iterator queryIter = campaignIds.begin(); queryIter != campaignIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("campaignIds", itemAt));
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

	string url("/ad_accounts/{ad_account_id}/campaigns/analytics");
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
		NetClient::easycurl(AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = campaignsAnalyticsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), campaignsAnalyticsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdAccountsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdAccountsManager::campaignsAnalyticsAsync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> campaignIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
	, void* userData)
{
	return campaignsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, true);
}

bool AdAccountsManager::campaignsAnalyticsSync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> campaignIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
	, void* userData)
{
	return campaignsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, false);
}

static bool campaignsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool campaignsListHelper(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, 
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
	
	for (std::list
	<std::string>::iterator queryIter = campaignIds.begin(); queryIter != campaignIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("campaignIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = entityStatuses.begin(); queryIter != entityStatuses.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("entityStatuses", itemAt));
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

	string url("/ad_accounts/{ad_account_id}/campaigns");
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
		NetClient::easycurl(AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = campaignsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), campaignsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdAccountsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdAccountsManager::campaignsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return campaignsListHelper(accessToken,
	adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark, 
	handler, userData, true);
}

bool AdAccountsManager::campaignsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Paginated, Error, void* )
	, void* userData)
{
	return campaignsListHelper(accessToken,
	adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark, 
	handler, userData, false);
}

static bool productGroupsAnalyticsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<std::map>, Error, void* )
	= reinterpret_cast<void(*)(std::list<std::map>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<std::map> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			std::map singlemodel;
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
	void(* handler)(std::list<std::map>, Error, void* )
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
		NetClient::easycurl(AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = productGroupsAnalyticsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdAccountsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), productGroupsAnalyticsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdAccountsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdAccountsManager::productGroupsAnalyticsAsync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> productGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
	, void* userData)
{
	return productGroupsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, true);
}

bool AdAccountsManager::productGroupsAnalyticsSync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> productGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<std::map>, Error, void* )
	, void* userData)
{
	return productGroupsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, false);
}

