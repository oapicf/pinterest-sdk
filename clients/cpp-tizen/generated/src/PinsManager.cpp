#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "PinsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


PinsManager::PinsManager()
{

}

PinsManager::~PinsManager()
{

}

static gboolean __PinsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __PinsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__PinsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool pinsAnalyticsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool pinsAnalyticsHelper(char * accessToken,
	std::string pinId, Date startDate, Date endDate, std::list<Pins_analytics_metric_types_parameter_inner> metricTypes, std::string appTypes, std::string splitField, std::string adAccountId, 
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


	itemAtq = stringify(&appTypes, "std::string");
	queryParams.insert(pair<string, string>("app_types", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("app_types");
	}

	for (std::list
	<Pins_analytics_metric_types_parameter_inner>::iterator queryIter = metricTypes.begin(); queryIter != metricTypes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "Pins_analytics_metric_types_parameter_inner");
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

	string url("/pins/{pin_id}/analytics");
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
		NetClient::easycurl(PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pinsAnalyticsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pinsAnalyticsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PinsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PinsManager::pinsAnalyticsAsync(char * accessToken,
	std::string pinId, Date startDate, Date endDate, std::list<Pins_analytics_metric_types_parameter_inner> metricTypes, std::string appTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<string,string>, Error, void* )
	, void* userData)
{
	return pinsAnalyticsHelper(accessToken,
	pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId, 
	handler, userData, true);
}

bool PinsManager::pinsAnalyticsSync(char * accessToken,
	std::string pinId, Date startDate, Date endDate, std::list<Pins_analytics_metric_types_parameter_inner> metricTypes, std::string appTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<string,string>, Error, void* )
	, void* userData)
{
	return pinsAnalyticsHelper(accessToken,
	pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId, 
	handler, userData, false);
}

static bool pinsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Pin, Error, void* )
	= reinterpret_cast<void(*)(Pin, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Pin out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Pin")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Pin", "Pin");
			json_node_free(pJson);

			if ("Pin" == "std::string") {
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

static bool pinsCreateHelper(char * accessToken,
	std::shared_ptr<PinCreate> pinCreate, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
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

	if (isprimitive("PinCreate")) {
		node = converttoJson(&pinCreate, "PinCreate", "");
	}
	
	char *jsonStr =  pinCreate.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/pins");
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
		NetClient::easycurl(PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pinsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pinsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PinsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PinsManager::pinsCreateAsync(char * accessToken,
	std::shared_ptr<PinCreate> pinCreate, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsCreateHelper(accessToken,
	pinCreate, adAccountId, 
	handler, userData, true);
}

bool PinsManager::pinsCreateSync(char * accessToken,
	std::shared_ptr<PinCreate> pinCreate, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsCreateHelper(accessToken,
	pinCreate, adAccountId, 
	handler, userData, false);
}

static bool pinsDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool pinsDeleteHelper(char * accessToken,
	std::string pinId, std::string adAccountId, 
	
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

	string url("/pins/{pin_id}");
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
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pinsDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pinsDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PinsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PinsManager::pinsDeleteAsync(char * accessToken,
	std::string pinId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return pinsDeleteHelper(accessToken,
	pinId, adAccountId, 
	handler, userData, true);
}

bool PinsManager::pinsDeleteSync(char * accessToken,
	std::string pinId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return pinsDeleteHelper(accessToken,
	pinId, adAccountId, 
	handler, userData, false);
}

static bool pinsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Pin, Error, void* )
	= reinterpret_cast<void(*)(Pin, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Pin out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Pin")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Pin", "Pin");
			json_node_free(pJson);

			if ("Pin" == "std::string") {
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

static bool pinsGetHelper(char * accessToken,
	std::string pinId, bool pinMetrics, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
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
	

	itemAtq = stringify(&pinMetrics, "bool");
	queryParams.insert(pair<string, string>("pin_metrics", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pin_metrics");
	}


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/pins/{pin_id}");
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
		NetClient::easycurl(PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pinsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pinsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PinsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PinsManager::pinsGetAsync(char * accessToken,
	std::string pinId, bool pinMetrics, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsGetHelper(accessToken,
	pinId, pinMetrics, adAccountId, 
	handler, userData, true);
}

bool PinsManager::pinsGetSync(char * accessToken,
	std::string pinId, bool pinMetrics, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsGetHelper(accessToken,
	pinId, pinMetrics, adAccountId, 
	handler, userData, false);
}

static bool pinsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Pins_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Pins_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Pins_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Pins_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Pins_list_200_response", "Pins_list_200_response");
			json_node_free(pJson);

			if ("Pins_list_200_response" == "std::string") {
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

static bool pinsListHelper(char * accessToken,
	std::string bookmark, int pageSize, std::string pinFilter, bool includeProtectedPins, std::string pinType, std::list<std::string> creativeTypes, std::string adAccountId, bool pinMetrics, 
	void(* handler)(Pins_list_200_response, Error, void* )
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


	itemAtq = stringify(&pinFilter, "std::string");
	queryParams.insert(pair<string, string>("pin_filter", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pin_filter");
	}


	itemAtq = stringify(&includeProtectedPins, "bool");
	queryParams.insert(pair<string, string>("include_protected_pins", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_protected_pins");
	}


	itemAtq = stringify(&pinType, "std::string");
	queryParams.insert(pair<string, string>("pin_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pin_type");
	}

	for (std::list
	<std::string>::iterator queryIter = creativeTypes.begin(); queryIter != creativeTypes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("creativeTypes", itemAt));
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

	string url("/pins");
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
		NetClient::easycurl(PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pinsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pinsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PinsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PinsManager::pinsListAsync(char * accessToken,
	std::string bookmark, int pageSize, std::string pinFilter, bool includeProtectedPins, std::string pinType, std::list<std::string> creativeTypes, std::string adAccountId, bool pinMetrics, 
	void(* handler)(Pins_list_200_response, Error, void* )
	, void* userData)
{
	return pinsListHelper(accessToken,
	bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics, 
	handler, userData, true);
}

bool PinsManager::pinsListSync(char * accessToken,
	std::string bookmark, int pageSize, std::string pinFilter, bool includeProtectedPins, std::string pinType, std::list<std::string> creativeTypes, std::string adAccountId, bool pinMetrics, 
	void(* handler)(Pins_list_200_response, Error, void* )
	, void* userData)
{
	return pinsListHelper(accessToken,
	bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics, 
	handler, userData, false);
}

static bool pinsSaveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Pin, Error, void* )
	= reinterpret_cast<void(*)(Pin, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Pin out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Pin")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Pin", "Pin");
			json_node_free(pJson);

			if ("Pin" == "std::string") {
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

static bool pinsSaveHelper(char * accessToken,
	std::string pinId, std::shared_ptr<Pins_save_request> pinsSaveRequest, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
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

	if (isprimitive("Pins_save_request")) {
		node = converttoJson(&pinsSaveRequest, "Pins_save_request", "");
	}
	
	char *jsonStr =  pinsSaveRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/pins/{pin_id}/save");
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
		NetClient::easycurl(PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pinsSaveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pinsSaveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PinsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PinsManager::pinsSaveAsync(char * accessToken,
	std::string pinId, std::shared_ptr<Pins_save_request> pinsSaveRequest, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsSaveHelper(accessToken,
	pinId, pinsSaveRequest, adAccountId, 
	handler, userData, true);
}

bool PinsManager::pinsSaveSync(char * accessToken,
	std::string pinId, std::shared_ptr<Pins_save_request> pinsSaveRequest, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsSaveHelper(accessToken,
	pinId, pinsSaveRequest, adAccountId, 
	handler, userData, false);
}

static bool pinsUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Pin, Error, void* )
	= reinterpret_cast<void(*)(Pin, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Pin out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Pin")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Pin", "Pin");
			json_node_free(pJson);

			if ("Pin" == "std::string") {
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

static bool pinsUpdateHelper(char * accessToken,
	std::string pinId, std::shared_ptr<PinUpdate> pinUpdate, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
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

	if (isprimitive("PinUpdate")) {
		node = converttoJson(&pinUpdate, "PinUpdate", "");
	}
	
	char *jsonStr =  pinUpdate.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/pins/{pin_id}");
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
	string myhttpmethod("PATCH");

	if(strcmp("PUT", "PATCH") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pinsUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PinsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pinsUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PinsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PinsManager::pinsUpdateAsync(char * accessToken,
	std::string pinId, std::shared_ptr<PinUpdate> pinUpdate, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsUpdateHelper(accessToken,
	pinId, pinUpdate, adAccountId, 
	handler, userData, true);
}

bool PinsManager::pinsUpdateSync(char * accessToken,
	std::string pinId, std::shared_ptr<PinUpdate> pinUpdate, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsUpdateHelper(accessToken,
	pinId, pinUpdate, adAccountId, 
	handler, userData, false);
}

