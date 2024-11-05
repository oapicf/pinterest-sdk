#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "AdGroupsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


AdGroupsManager::AdGroupsManager()
{

}

AdGroupsManager::~AdGroupsManager()
{

}

static gboolean __AdGroupsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __AdGroupsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__AdGroupsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool adGroupsAnalyticsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<AdGroupsAnalyticsResponse_inner>, Error, void* )
	= reinterpret_cast<void(*)(std::list<AdGroupsAnalyticsResponse_inner>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<AdGroupsAnalyticsResponse_inner> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			AdGroupsAnalyticsResponse_inner singlemodel;
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
	void(* handler)(std::list<AdGroupsAnalyticsResponse_inner>, Error, void* )
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
		NetClient::easycurl(AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adGroupsAnalyticsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adGroupsAnalyticsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdGroupsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdGroupsManager::adGroupsAnalyticsAsync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> adGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<AdGroupsAnalyticsResponse_inner>, Error, void* )
	, void* userData)
{
	return adGroupsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, true);
}

bool AdGroupsManager::adGroupsAnalyticsSync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> adGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<AdGroupsAnalyticsResponse_inner>, Error, void* )
	, void* userData)
{
	return adGroupsAnalyticsHelper(accessToken,
	adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, 
	handler, userData, false);
}

static bool adGroupsAudienceSizingProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdGroupAudienceSizingResponse, Error, void* )
	= reinterpret_cast<void(*)(AdGroupAudienceSizingResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdGroupAudienceSizingResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdGroupAudienceSizingResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdGroupAudienceSizingResponse", "AdGroupAudienceSizingResponse");
			json_node_free(pJson);

			if ("AdGroupAudienceSizingResponse" == "std::string") {
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

static bool adGroupsAudienceSizingHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdGroupAudienceSizingRequest> adGroupAudienceSizingRequest, 
	void(* handler)(AdGroupAudienceSizingResponse, Error, void* )
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

	if (isprimitive("AdGroupAudienceSizingRequest")) {
		node = converttoJson(&adGroupAudienceSizingRequest, "AdGroupAudienceSizingRequest", "");
	}
	
	char *jsonStr =  adGroupAudienceSizingRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/ad_groups/audience_sizing");
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
		NetClient::easycurl(AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adGroupsAudienceSizingProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adGroupsAudienceSizingProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdGroupsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdGroupsManager::adGroupsAudienceSizingAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdGroupAudienceSizingRequest> adGroupAudienceSizingRequest, 
	void(* handler)(AdGroupAudienceSizingResponse, Error, void* )
	, void* userData)
{
	return adGroupsAudienceSizingHelper(accessToken,
	adAccountId, adGroupAudienceSizingRequest, 
	handler, userData, true);
}

bool AdGroupsManager::adGroupsAudienceSizingSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdGroupAudienceSizingRequest> adGroupAudienceSizingRequest, 
	void(* handler)(AdGroupAudienceSizingResponse, Error, void* )
	, void* userData)
{
	return adGroupsAudienceSizingHelper(accessToken,
	adAccountId, adGroupAudienceSizingRequest, 
	handler, userData, false);
}

static bool adGroupsBidFloorGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BidFloor, Error, void* )
	= reinterpret_cast<void(*)(BidFloor, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BidFloor out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BidFloor")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BidFloor", "BidFloor");
			json_node_free(pJson);

			if ("BidFloor" == "std::string") {
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

static bool adGroupsBidFloorGetHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<BidFloorRequest> bidFloorRequest, 
	void(* handler)(BidFloor, Error, void* )
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

	if (isprimitive("BidFloorRequest")) {
		node = converttoJson(&bidFloorRequest, "BidFloorRequest", "");
	}
	
	char *jsonStr =  bidFloorRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/bid_floor");
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
		NetClient::easycurl(AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adGroupsBidFloorGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adGroupsBidFloorGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdGroupsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdGroupsManager::adGroupsBidFloorGetAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BidFloorRequest> bidFloorRequest, 
	void(* handler)(BidFloor, Error, void* )
	, void* userData)
{
	return adGroupsBidFloorGetHelper(accessToken,
	adAccountId, bidFloorRequest, 
	handler, userData, true);
}

bool AdGroupsManager::adGroupsBidFloorGetSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BidFloorRequest> bidFloorRequest, 
	void(* handler)(BidFloor, Error, void* )
	, void* userData)
{
	return adGroupsBidFloorGetHelper(accessToken,
	adAccountId, bidFloorRequest, 
	handler, userData, false);
}

static bool adGroupsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdGroupArrayResponse, Error, void* )
	= reinterpret_cast<void(*)(AdGroupArrayResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdGroupArrayResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdGroupArrayResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdGroupArrayResponse", "AdGroupArrayResponse");
			json_node_free(pJson);

			if ("AdGroupArrayResponse" == "std::string") {
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

static bool adGroupsCreateHelper(char * accessToken,
	std::string adAccountId, std::list<AdGroupCreateRequest> adGroupCreateRequest, 
	void(* handler)(AdGroupArrayResponse, Error, void* )
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
	if (isprimitive("AdGroupCreateRequest")) {
		node = converttoJson(&adGroupCreateRequest, "AdGroupCreateRequest", "array");
	} else {
		node = json_node_alloc();
		json_array = json_array_new();
		for (std::list
			<AdGroupCreateRequest>::iterator bodyIter = adGroupCreateRequest.begin(); bodyIter != adGroupCreateRequest.end(); ++bodyIter) {
			AdGroupCreateRequest itemAt = (*bodyIter);
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
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adGroupsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adGroupsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdGroupsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdGroupsManager::adGroupsCreateAsync(char * accessToken,
	std::string adAccountId, std::list<AdGroupCreateRequest> adGroupCreateRequest, 
	void(* handler)(AdGroupArrayResponse, Error, void* )
	, void* userData)
{
	return adGroupsCreateHelper(accessToken,
	adAccountId, adGroupCreateRequest, 
	handler, userData, true);
}

bool AdGroupsManager::adGroupsCreateSync(char * accessToken,
	std::string adAccountId, std::list<AdGroupCreateRequest> adGroupCreateRequest, 
	void(* handler)(AdGroupArrayResponse, Error, void* )
	, void* userData)
{
	return adGroupsCreateHelper(accessToken,
	adAccountId, adGroupCreateRequest, 
	handler, userData, false);
}

static bool adGroupsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdGroupResponse, Error, void* )
	= reinterpret_cast<void(*)(AdGroupResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdGroupResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdGroupResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdGroupResponse", "AdGroupResponse");
			json_node_free(pJson);

			if ("AdGroupResponse" == "std::string") {
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

static bool adGroupsGetHelper(char * accessToken,
	std::string adAccountId, std::string adGroupId, 
	void(* handler)(AdGroupResponse, Error, void* )
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

	string url("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}");
	int pos;

	string s_adAccountId("{");
	s_adAccountId.append("ad_account_id");
	s_adAccountId.append("}");
	pos = url.find(s_adAccountId);
	url.erase(pos, s_adAccountId.length());
	url.insert(pos, stringify(&adAccountId, "std::string"));
	string s_adGroupId("{");
	s_adGroupId.append("ad_group_id");
	s_adGroupId.append("}");
	pos = url.find(s_adGroupId);
	url.erase(pos, s_adGroupId.length());
	url.insert(pos, stringify(&adGroupId, "std::string"));

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
		NetClient::easycurl(AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adGroupsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adGroupsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdGroupsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdGroupsManager::adGroupsGetAsync(char * accessToken,
	std::string adAccountId, std::string adGroupId, 
	void(* handler)(AdGroupResponse, Error, void* )
	, void* userData)
{
	return adGroupsGetHelper(accessToken,
	adAccountId, adGroupId, 
	handler, userData, true);
}

bool AdGroupsManager::adGroupsGetSync(char * accessToken,
	std::string adAccountId, std::string adGroupId, 
	void(* handler)(AdGroupResponse, Error, void* )
	, void* userData)
{
	return adGroupsGetHelper(accessToken,
	adAccountId, adGroupId, 
	handler, userData, false);
}

static bool adGroupsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Ad_groups_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Ad_groups_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Ad_groups_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Ad_groups_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Ad_groups_list_200_response", "Ad_groups_list_200_response");
			json_node_free(pJson);

			if ("Ad_groups_list_200_response" == "std::string") {
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
	void(* handler)(Ad_groups_list_200_response, Error, void* )
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
		NetClient::easycurl(AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adGroupsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adGroupsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdGroupsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdGroupsManager::adGroupsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, bool translateInterestsToNames, 
	void(* handler)(Ad_groups_list_200_response, Error, void* )
	, void* userData)
{
	return adGroupsListHelper(accessToken,
	adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames, 
	handler, userData, true);
}

bool AdGroupsManager::adGroupsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, bool translateInterestsToNames, 
	void(* handler)(Ad_groups_list_200_response, Error, void* )
	, void* userData)
{
	return adGroupsListHelper(accessToken,
	adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames, 
	handler, userData, false);
}

static bool adGroupsTargetingAnalyticsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool adGroupsTargetingAnalyticsGetHelper(char * accessToken,
	std::string adAccountId, std::list<std::string> adGroupIds, Date startDate, Date endDate, std::list<AdsAnalyticsTargetingType> targetingTypes, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, ConversionReportAttributionType attributionTypes, 
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
	<std::string>::iterator queryIter = adGroupIds.begin(); queryIter != adGroupIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		queryParams.insert(pair<string, string>("adGroupIds", itemAt));
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

	string url("/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics");
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
		NetClient::easycurl(AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adGroupsTargetingAnalyticsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adGroupsTargetingAnalyticsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdGroupsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdGroupsManager::adGroupsTargetingAnalyticsGetAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> adGroupIds, Date startDate, Date endDate, std::list<AdsAnalyticsTargetingType> targetingTypes, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, ConversionReportAttributionType attributionTypes, 
	void(* handler)(MetricsResponse, Error, void* )
	, void* userData)
{
	return adGroupsTargetingAnalyticsGetHelper(accessToken,
	adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, 
	handler, userData, true);
}

bool AdGroupsManager::adGroupsTargetingAnalyticsGetSync(char * accessToken,
	std::string adAccountId, std::list<std::string> adGroupIds, Date startDate, Date endDate, std::list<AdsAnalyticsTargetingType> targetingTypes, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, ConversionReportAttributionType attributionTypes, 
	void(* handler)(MetricsResponse, Error, void* )
	, void* userData)
{
	return adGroupsTargetingAnalyticsGetHelper(accessToken,
	adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, 
	handler, userData, false);
}

static bool adGroupsUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdGroupArrayResponse, Error, void* )
	= reinterpret_cast<void(*)(AdGroupArrayResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdGroupArrayResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdGroupArrayResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdGroupArrayResponse", "AdGroupArrayResponse");
			json_node_free(pJson);

			if ("AdGroupArrayResponse" == "std::string") {
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

static bool adGroupsUpdateHelper(char * accessToken,
	std::string adAccountId, std::list<AdGroupUpdateRequest> adGroupUpdateRequest, 
	void(* handler)(AdGroupArrayResponse, Error, void* )
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
	if (isprimitive("AdGroupUpdateRequest")) {
		node = converttoJson(&adGroupUpdateRequest, "AdGroupUpdateRequest", "array");
	} else {
		node = json_node_alloc();
		json_array = json_array_new();
		for (std::list
			<AdGroupUpdateRequest>::iterator bodyIter = adGroupUpdateRequest.begin(); bodyIter != adGroupUpdateRequest.end(); ++bodyIter) {
			AdGroupUpdateRequest itemAt = (*bodyIter);
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
	string myhttpmethod("PATCH");

	if(strcmp("PUT", "PATCH") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adGroupsUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AdGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adGroupsUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AdGroupsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AdGroupsManager::adGroupsUpdateAsync(char * accessToken,
	std::string adAccountId, std::list<AdGroupUpdateRequest> adGroupUpdateRequest, 
	void(* handler)(AdGroupArrayResponse, Error, void* )
	, void* userData)
{
	return adGroupsUpdateHelper(accessToken,
	adAccountId, adGroupUpdateRequest, 
	handler, userData, true);
}

bool AdGroupsManager::adGroupsUpdateSync(char * accessToken,
	std::string adAccountId, std::list<AdGroupUpdateRequest> adGroupUpdateRequest, 
	void(* handler)(AdGroupArrayResponse, Error, void* )
	, void* userData)
{
	return adGroupsUpdateHelper(accessToken,
	adAccountId, adGroupUpdateRequest, 
	handler, userData, false);
}

