#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "SearchManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


SearchManager::SearchManager()
{

}

SearchManager::~SearchManager()
{

}

static gboolean __SearchManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __SearchManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__SearchManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool searchPartnerPinsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Search_partner_pins_200_response, Error, void* )
	= reinterpret_cast<void(*)(Search_partner_pins_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Search_partner_pins_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Search_partner_pins_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Search_partner_pins_200_response", "Search_partner_pins_200_response");
			json_node_free(pJson);

			if ("Search_partner_pins_200_response" == "std::string") {
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

static bool searchPartnerPinsHelper(char * accessToken,
	std::string term, std::string countryCode, std::string bookmark, std::string locale, int limit, 
	void(* handler)(Search_partner_pins_200_response, Error, void* )
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
	

	itemAtq = stringify(&term, "std::string");
	queryParams.insert(pair<string, string>("term", itemAtq));


	itemAtq = stringify(&countryCode, "std::string");
	queryParams.insert(pair<string, string>("country_code", itemAtq));


	itemAtq = stringify(&bookmark, "std::string");
	queryParams.insert(pair<string, string>("bookmark", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bookmark");
	}


	itemAtq = stringify(&locale, "std::string");
	queryParams.insert(pair<string, string>("locale", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("locale");
	}


	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/search/partner/pins");
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
		NetClient::easycurl(SearchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = searchPartnerPinsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SearchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), searchPartnerPinsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SearchManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SearchManager::searchPartnerPinsAsync(char * accessToken,
	std::string term, std::string countryCode, std::string bookmark, std::string locale, int limit, 
	void(* handler)(Search_partner_pins_200_response, Error, void* )
	, void* userData)
{
	return searchPartnerPinsHelper(accessToken,
	term, countryCode, bookmark, locale, limit, 
	handler, userData, true);
}

bool SearchManager::searchPartnerPinsSync(char * accessToken,
	std::string term, std::string countryCode, std::string bookmark, std::string locale, int limit, 
	void(* handler)(Search_partner_pins_200_response, Error, void* )
	, void* userData)
{
	return searchPartnerPinsHelper(accessToken,
	term, countryCode, bookmark, locale, limit, 
	handler, userData, false);
}

static bool searchUserBoardsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Search_user_boards_get_200_response, Error, void* )
	= reinterpret_cast<void(*)(Search_user_boards_get_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Search_user_boards_get_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Search_user_boards_get_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Search_user_boards_get_200_response", "Search_user_boards_get_200_response");
			json_node_free(pJson);

			if ("Search_user_boards_get_200_response" == "std::string") {
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

static bool searchUserBoardsGetHelper(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string query, 
	void(* handler)(Search_user_boards_get_200_response, Error, void* )
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


	itemAtq = stringify(&query, "std::string");
	queryParams.insert(pair<string, string>("query", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("query");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/search/boards");
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
		NetClient::easycurl(SearchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = searchUserBoardsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SearchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), searchUserBoardsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SearchManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SearchManager::searchUserBoardsGetAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string query, 
	void(* handler)(Search_user_boards_get_200_response, Error, void* )
	, void* userData)
{
	return searchUserBoardsGetHelper(accessToken,
	adAccountId, bookmark, pageSize, query, 
	handler, userData, true);
}

bool SearchManager::searchUserBoardsGetSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string query, 
	void(* handler)(Search_user_boards_get_200_response, Error, void* )
	, void* userData)
{
	return searchUserBoardsGetHelper(accessToken,
	adAccountId, bookmark, pageSize, query, 
	handler, userData, false);
}

static bool searchUserPinsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool searchUserPinsListHelper(char * accessToken,
	std::string query, std::string adAccountId, std::string bookmark, 
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
	

	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}


	itemAtq = stringify(&query, "std::string");
	queryParams.insert(pair<string, string>("query", itemAtq));


	itemAtq = stringify(&bookmark, "std::string");
	queryParams.insert(pair<string, string>("bookmark", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bookmark");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/search/pins");
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
		NetClient::easycurl(SearchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = searchUserPinsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SearchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), searchUserPinsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SearchManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SearchManager::searchUserPinsListAsync(char * accessToken,
	std::string query, std::string adAccountId, std::string bookmark, 
	void(* handler)(Pins_list_200_response, Error, void* )
	, void* userData)
{
	return searchUserPinsListHelper(accessToken,
	query, adAccountId, bookmark, 
	handler, userData, true);
}

bool SearchManager::searchUserPinsListSync(char * accessToken,
	std::string query, std::string adAccountId, std::string bookmark, 
	void(* handler)(Pins_list_200_response, Error, void* )
	, void* userData)
{
	return searchUserPinsListHelper(accessToken,
	query, adAccountId, bookmark, 
	handler, userData, false);
}

