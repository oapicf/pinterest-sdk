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
	std::string pinId, Date startDate, Date endDate, std::list<std::string> metricTypes, std::string appTypes, std::string splitField, std::string adAccountId, 
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
	<std::string>::iterator queryIter = metricTypes.begin(); queryIter != metricTypes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
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
	std::string pinId, Date startDate, Date endDate, std::list<std::string> metricTypes, std::string appTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<string,string>, Error, void* )
	, void* userData)
{
	return pinsAnalyticsHelper(accessToken,
	pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId, 
	handler, userData, true);
}

bool PinsManager::pinsAnalyticsSync(char * accessToken,
	std::string pinId, Date startDate, Date endDate, std::list<std::string> metricTypes, std::string appTypes, std::string splitField, std::string adAccountId, 
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
	std::shared_ptr<Pin> pin, 
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
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("Pin")) {
		node = converttoJson(&pin, "Pin", "");
	}
	
	char *jsonStr =  pin.toJson();
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
	std::shared_ptr<Pin> pin, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsCreateHelper(accessToken,
	pin, 
	handler, userData, true);
}

bool PinsManager::pinsCreateSync(char * accessToken,
	std::shared_ptr<Pin> pin, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsCreateHelper(accessToken,
	pin, 
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
	std::string pinId, 
	
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
	std::string pinId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return pinsDeleteHelper(accessToken,
	pinId, 
	handler, userData, true);
}

bool PinsManager::pinsDeleteSync(char * accessToken,
	std::string pinId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return pinsDeleteHelper(accessToken,
	pinId, 
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
	std::string pinId, std::string adAccountId, 
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
	std::string pinId, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsGetHelper(accessToken,
	pinId, adAccountId, 
	handler, userData, true);
}

bool PinsManager::pinsGetSync(char * accessToken,
	std::string pinId, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsGetHelper(accessToken,
	pinId, adAccountId, 
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
	std::string pinId, std::shared_ptr<Pins_save_request> pinsSaveRequest, 
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
	std::string pinId, std::shared_ptr<Pins_save_request> pinsSaveRequest, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsSaveHelper(accessToken,
	pinId, pinsSaveRequest, 
	handler, userData, true);
}

bool PinsManager::pinsSaveSync(char * accessToken,
	std::string pinId, std::shared_ptr<Pins_save_request> pinsSaveRequest, 
	void(* handler)(Pin, Error, void* )
	, void* userData)
{
	return pinsSaveHelper(accessToken,
	pinId, pinsSaveRequest, 
	handler, userData, false);
}

