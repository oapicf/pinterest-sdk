#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "CampaignsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


CampaignsManager::CampaignsManager()
{

}

CampaignsManager::~CampaignsManager()
{

}

static gboolean __CampaignsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __CampaignsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__CampaignsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool campaignTargetingAnalyticsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(MetricsResponse, Error, void* )
	= reinterpret_cast<void(*)(MetricsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	MetricsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("MetricsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "MetricsResponse", "MetricsResponse");
			json_node_free(pJson);

			if ("MetricsResponse" == "std::string") {
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

static bool campaignTargetingAnalyticsGetHelper(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, Date startDate, Date endDate, std::list<AdsAnalyticsTargetingType> targetingTypes, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, ConversionReportAttributionType attributionTypes, 
	void(* handler)(MetricsResponse, Error, void* )
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
		queryParams.insert(pair<string, string>("campaignIds", itemAt));
	}
	

	itemAtq = stringify(&startDate, "Date");
	queryParams.insert(pair<string, string>("start_date", itemAtq));


	itemAtq = stringify(&endDate, "Date");
	queryParams.insert(pair<string, string>("end_date", itemAtq));

	for (std::list
	<AdsAnalyticsTargetingType>::iterator queryIter = targetingTypes.begin(); queryIter != targetingTypes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "AdsAnalyticsTargetingType");
		queryParams.insert(pair<string, string>("targetingTypes", itemAt));
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


	itemAtq = stringify(&attributionTypes, "ConversionReportAttributionType");
	queryParams.insert(pair<string, string>("attribution_types", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("attribution_types");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/campaigns/targeting_analytics");
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
		NetClient::easycurl(CampaignsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = campaignTargetingAnalyticsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CampaignsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), campaignTargetingAnalyticsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CampaignsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CampaignsManager::campaignTargetingAnalyticsGetAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, Date startDate, Date endDate, std::list<AdsAnalyticsTargetingType> targetingTypes, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, ConversionReportAttributionType attributionTypes, 
	void(* handler)(MetricsResponse, Error, void* )
	, void* userData)
{
	return campaignTargetingAnalyticsGetHelper(accessToken,
	adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, 
	handler, userData, true);
}

bool CampaignsManager::campaignTargetingAnalyticsGetSync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, Date startDate, Date endDate, std::list<AdsAnalyticsTargetingType> targetingTypes, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, ConversionReportAttributionType attributionTypes, 
	void(* handler)(MetricsResponse, Error, void* )
	, void* userData)
{
	return campaignTargetingAnalyticsGetHelper(accessToken,
	adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, 
	handler, userData, false);
}

static bool campaignsAnalyticsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<CampaignsAnalyticsResponse_inner>, Error, void* )
	= reinterpret_cast<void(*)(std::list<CampaignsAnalyticsResponse_inner>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<CampaignsAnalyticsResponse_inner> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			CampaignsAnalyticsResponse_inner singlemodel;
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
	void(* handler)(std::list<CampaignsAnalyticsResponse_inner>, Error, void* )
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
		NetClient::easycurl(CampaignsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = campaignsAnalyticsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CampaignsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), campaignsAnalyticsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CampaignsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CampaignsManager::campaignsAnalyticsAsync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> campaignIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<CampaignsAnalyticsResponse_inner>, Error, void* )
	, void* userData)
{
	return campaignsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, true);
}

bool CampaignsManager::campaignsAnalyticsSync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> campaignIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<CampaignsAnalyticsResponse_inner>, Error, void* )
	, void* userData)
{
	return campaignsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, false);
}

static bool campaignsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CampaignCreateResponse, Error, void* )
	= reinterpret_cast<void(*)(CampaignCreateResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CampaignCreateResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CampaignCreateResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CampaignCreateResponse", "CampaignCreateResponse");
			json_node_free(pJson);

			if ("CampaignCreateResponse" == "std::string") {
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

static bool campaignsCreateHelper(char * accessToken,
	std::string adAccountId, std::list<CampaignCreateRequest> campaignCreateRequest, 
	void(* handler)(CampaignCreateResponse, Error, void* )
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
	//TODO: Map Container
	if (isprimitive("CampaignCreateRequest")) {
		node = converttoJson(&campaignCreateRequest, "CampaignCreateRequest", "array");
	} else {
		node = json_node_alloc();
		json_array = json_array_new();
		for (std::list
			<CampaignCreateRequest>::iterator bodyIter = campaignCreateRequest.begin(); bodyIter != campaignCreateRequest.end(); ++bodyIter) {
			CampaignCreateRequest itemAt = (*bodyIter);
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
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CampaignsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = campaignsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CampaignsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), campaignsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CampaignsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CampaignsManager::campaignsCreateAsync(char * accessToken,
	std::string adAccountId, std::list<CampaignCreateRequest> campaignCreateRequest, 
	void(* handler)(CampaignCreateResponse, Error, void* )
	, void* userData)
{
	return campaignsCreateHelper(accessToken,
	adAccountId, campaignCreateRequest, 
	handler, userData, true);
}

bool CampaignsManager::campaignsCreateSync(char * accessToken,
	std::string adAccountId, std::list<CampaignCreateRequest> campaignCreateRequest, 
	void(* handler)(CampaignCreateResponse, Error, void* )
	, void* userData)
{
	return campaignsCreateHelper(accessToken,
	adAccountId, campaignCreateRequest, 
	handler, userData, false);
}

static bool campaignsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CampaignResponse, Error, void* )
	= reinterpret_cast<void(*)(CampaignResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CampaignResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CampaignResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CampaignResponse", "CampaignResponse");
			json_node_free(pJson);

			if ("CampaignResponse" == "std::string") {
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

static bool campaignsGetHelper(char * accessToken,
	std::string adAccountId, std::string campaignId, 
	void(* handler)(CampaignResponse, Error, void* )
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

	string url("/ad_accounts/{ad_account_id}/campaigns/{campaign_id}");
	int pos;

	string s_adAccountId("{");
	s_adAccountId.append("ad_account_id");
	s_adAccountId.append("}");
	pos = url.find(s_adAccountId);
	url.erase(pos, s_adAccountId.length());
	url.insert(pos, stringify(&adAccountId, "std::string"));
	string s_campaignId("{");
	s_campaignId.append("campaign_id");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "std::string"));

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
		NetClient::easycurl(CampaignsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = campaignsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CampaignsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), campaignsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CampaignsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CampaignsManager::campaignsGetAsync(char * accessToken,
	std::string adAccountId, std::string campaignId, 
	void(* handler)(CampaignResponse, Error, void* )
	, void* userData)
{
	return campaignsGetHelper(accessToken,
	adAccountId, campaignId, 
	handler, userData, true);
}

bool CampaignsManager::campaignsGetSync(char * accessToken,
	std::string adAccountId, std::string campaignId, 
	void(* handler)(CampaignResponse, Error, void* )
	, void* userData)
{
	return campaignsGetHelper(accessToken,
	adAccountId, campaignId, 
	handler, userData, false);
}

static bool campaignsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Campaigns_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Campaigns_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Campaigns_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Campaigns_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Campaigns_list_200_response", "Campaigns_list_200_response");
			json_node_free(pJson);

			if ("Campaigns_list_200_response" == "std::string") {
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
	void(* handler)(Campaigns_list_200_response, Error, void* )
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
		NetClient::easycurl(CampaignsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = campaignsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CampaignsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), campaignsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CampaignsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CampaignsManager::campaignsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Campaigns_list_200_response, Error, void* )
	, void* userData)
{
	return campaignsListHelper(accessToken,
	adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark, 
	handler, userData, true);
}

bool CampaignsManager::campaignsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Campaigns_list_200_response, Error, void* )
	, void* userData)
{
	return campaignsListHelper(accessToken,
	adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark, 
	handler, userData, false);
}

static bool campaignsUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CampaignUpdateResponse, Error, void* )
	= reinterpret_cast<void(*)(CampaignUpdateResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CampaignUpdateResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CampaignUpdateResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CampaignUpdateResponse", "CampaignUpdateResponse");
			json_node_free(pJson);

			if ("CampaignUpdateResponse" == "std::string") {
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

static bool campaignsUpdateHelper(char * accessToken,
	std::string adAccountId, std::list<CampaignUpdateRequest> campaignUpdateRequest, 
	void(* handler)(CampaignUpdateResponse, Error, void* )
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
	//TODO: Map Container
	if (isprimitive("CampaignUpdateRequest")) {
		node = converttoJson(&campaignUpdateRequest, "CampaignUpdateRequest", "array");
	} else {
		node = json_node_alloc();
		json_array = json_array_new();
		for (std::list
			<CampaignUpdateRequest>::iterator bodyIter = campaignUpdateRequest.begin(); bodyIter != campaignUpdateRequest.end(); ++bodyIter) {
			CampaignUpdateRequest itemAt = (*bodyIter);
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
	string myhttpmethod("PATCH");

	if(strcmp("PUT", "PATCH") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CampaignsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = campaignsUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CampaignsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), campaignsUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CampaignsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CampaignsManager::campaignsUpdateAsync(char * accessToken,
	std::string adAccountId, std::list<CampaignUpdateRequest> campaignUpdateRequest, 
	void(* handler)(CampaignUpdateResponse, Error, void* )
	, void* userData)
{
	return campaignsUpdateHelper(accessToken,
	adAccountId, campaignUpdateRequest, 
	handler, userData, true);
}

bool CampaignsManager::campaignsUpdateSync(char * accessToken,
	std::string adAccountId, std::list<CampaignUpdateRequest> campaignUpdateRequest, 
	void(* handler)(CampaignUpdateResponse, Error, void* )
	, void* userData)
{
	return campaignsUpdateHelper(accessToken,
	adAccountId, campaignUpdateRequest, 
	handler, userData, false);
}

