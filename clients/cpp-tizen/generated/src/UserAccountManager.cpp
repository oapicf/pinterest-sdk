#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "UserAccountManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


UserAccountManager::UserAccountManager()
{

}

UserAccountManager::~UserAccountManager()
{

}

static gboolean __UserAccountManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __UserAccountManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__UserAccountManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool userAccountAnalyticsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::map<string,string>, Error, void* )
	= reinterpret_cast<void(*)(std::map<string,string>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::map<string,string> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));





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

static bool userAccountAnalyticsHelper(char * accessToken,
	Date startDate, Date endDate, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<string,string>, Error, void* )
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


	itemAtq = stringify(&fromClaimedContent, "std::string");
	queryParams.insert(pair<string, string>("from_claimed_content", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("from_claimed_content");
	}


	itemAtq = stringify(&pinFormat, "std::string");
	queryParams.insert(pair<string, string>("pin_format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pin_format");
	}


	itemAtq = stringify(&appTypes, "std::string");
	queryParams.insert(pair<string, string>("app_types", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("app_types");
	}

	for (std::list
	<std::string>::iterator queryIter = metricTypes.begin(); queryIter != metricTypes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("metricTypes", itemAt));
	}
	

	itemAtq = stringify(&splitField, "std::string");
	queryParams.insert(pair<string, string>("split_field", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("split_field");
	}


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user_account/analytics");
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
		NetClient::easycurl(UserAccountManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = userAccountAnalyticsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UserAccountManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), userAccountAnalyticsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::userAccountAnalyticsAsync(char * accessToken,
	Date startDate, Date endDate, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<string,string>, Error, void* )
	, void* userData)
{
	return userAccountAnalyticsHelper(accessToken,
	startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId, 
	handler, userData, true);
}

bool UserAccountManager::userAccountAnalyticsSync(char * accessToken,
	Date startDate, Date endDate, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<string,string>, Error, void* )
	, void* userData)
{
	return userAccountAnalyticsHelper(accessToken,
	startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId, 
	handler, userData, false);
}

static bool userAccountAnalyticsTopPinsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(TopPinsAnalyticsResponse, Error, void* )
	= reinterpret_cast<void(*)(TopPinsAnalyticsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	TopPinsAnalyticsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("TopPinsAnalyticsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "TopPinsAnalyticsResponse", "TopPinsAnalyticsResponse");
			json_node_free(pJson);

			if ("TopPinsAnalyticsResponse" == "std::string") {
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

static bool userAccountAnalyticsTopPinsHelper(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopPinsAnalyticsResponse, Error, void* )
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


	itemAtq = stringify(&sortBy, "std::string");
	queryParams.insert(pair<string, string>("sort_by", itemAtq));


	itemAtq = stringify(&fromClaimedContent, "std::string");
	queryParams.insert(pair<string, string>("from_claimed_content", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("from_claimed_content");
	}


	itemAtq = stringify(&pinFormat, "std::string");
	queryParams.insert(pair<string, string>("pin_format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pin_format");
	}


	itemAtq = stringify(&appTypes, "std::string");
	queryParams.insert(pair<string, string>("app_types", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("app_types");
	}

	for (std::list
	<std::string>::iterator queryIter = metricTypes.begin(); queryIter != metricTypes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("metricTypes", itemAt));
	}
	

	itemAtq = stringify(&numOfPins, "int");
	queryParams.insert(pair<string, string>("num_of_pins", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("num_of_pins");
	}


	itemAtq = stringify(&createdInLastNDays, "int");
	queryParams.insert(pair<string, string>("created_in_last_n_days", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("created_in_last_n_days");
	}


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user_account/analytics/top_pins");
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
		NetClient::easycurl(UserAccountManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = userAccountAnalyticsTopPinsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UserAccountManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), userAccountAnalyticsTopPinsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::userAccountAnalyticsTopPinsAsync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopPinsAnalyticsResponse, Error, void* )
	, void* userData)
{
	return userAccountAnalyticsTopPinsHelper(accessToken,
	startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, metricTypes, numOfPins, createdInLastNDays, adAccountId, 
	handler, userData, true);
}

bool UserAccountManager::userAccountAnalyticsTopPinsSync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopPinsAnalyticsResponse, Error, void* )
	, void* userData)
{
	return userAccountAnalyticsTopPinsHelper(accessToken,
	startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, metricTypes, numOfPins, createdInLastNDays, adAccountId, 
	handler, userData, false);
}

static bool userAccountAnalyticsTopVideoPinsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(TopVideoPinsAnalyticsResponse, Error, void* )
	= reinterpret_cast<void(*)(TopVideoPinsAnalyticsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	TopVideoPinsAnalyticsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("TopVideoPinsAnalyticsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "TopVideoPinsAnalyticsResponse", "TopVideoPinsAnalyticsResponse");
			json_node_free(pJson);

			if ("TopVideoPinsAnalyticsResponse" == "std::string") {
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

static bool userAccountAnalyticsTopVideoPinsHelper(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopVideoPinsAnalyticsResponse, Error, void* )
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


	itemAtq = stringify(&sortBy, "std::string");
	queryParams.insert(pair<string, string>("sort_by", itemAtq));


	itemAtq = stringify(&fromClaimedContent, "std::string");
	queryParams.insert(pair<string, string>("from_claimed_content", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("from_claimed_content");
	}


	itemAtq = stringify(&pinFormat, "std::string");
	queryParams.insert(pair<string, string>("pin_format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pin_format");
	}


	itemAtq = stringify(&appTypes, "std::string");
	queryParams.insert(pair<string, string>("app_types", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("app_types");
	}

	for (std::list
	<std::string>::iterator queryIter = metricTypes.begin(); queryIter != metricTypes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("metricTypes", itemAt));
	}
	

	itemAtq = stringify(&numOfPins, "int");
	queryParams.insert(pair<string, string>("num_of_pins", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("num_of_pins");
	}


	itemAtq = stringify(&createdInLastNDays, "int");
	queryParams.insert(pair<string, string>("created_in_last_n_days", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("created_in_last_n_days");
	}


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user_account/analytics/top_video_pins");
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
		NetClient::easycurl(UserAccountManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = userAccountAnalyticsTopVideoPinsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UserAccountManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), userAccountAnalyticsTopVideoPinsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::userAccountAnalyticsTopVideoPinsAsync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopVideoPinsAnalyticsResponse, Error, void* )
	, void* userData)
{
	return userAccountAnalyticsTopVideoPinsHelper(accessToken,
	startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, metricTypes, numOfPins, createdInLastNDays, adAccountId, 
	handler, userData, true);
}

bool UserAccountManager::userAccountAnalyticsTopVideoPinsSync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopVideoPinsAnalyticsResponse, Error, void* )
	, void* userData)
{
	return userAccountAnalyticsTopVideoPinsHelper(accessToken,
	startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, metricTypes, numOfPins, createdInLastNDays, adAccountId, 
	handler, userData, false);
}

static bool userAccountGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Account, Error, void* )
	= reinterpret_cast<void(*)(Account, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Account out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Account")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Account", "Account");
			json_node_free(pJson);

			if ("Account" == "std::string") {
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

static bool userAccountGetHelper(char * accessToken,
	std::string adAccountId, 
	void(* handler)(Account, Error, void* )
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

	string url("/user_account");
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
		NetClient::easycurl(UserAccountManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = userAccountGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UserAccountManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), userAccountGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::userAccountGetAsync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(Account, Error, void* )
	, void* userData)
{
	return userAccountGetHelper(accessToken,
	adAccountId, 
	handler, userData, true);
}

bool UserAccountManager::userAccountGetSync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(Account, Error, void* )
	, void* userData)
{
	return userAccountGetHelper(accessToken,
	adAccountId, 
	handler, userData, false);
}

