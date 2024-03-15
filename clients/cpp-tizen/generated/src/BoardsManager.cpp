#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "BoardsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


BoardsManager::BoardsManager()
{

}

BoardsManager::~BoardsManager()
{

}

static gboolean __BoardsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __BoardsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__BoardsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool boardSectionsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BoardSection, Error, void* )
	= reinterpret_cast<void(*)(BoardSection, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BoardSection out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BoardSection")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BoardSection", "BoardSection");
			json_node_free(pJson);

			if ("BoardSection" == "std::string") {
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

static bool boardSectionsCreateHelper(char * accessToken,
	std::string boardId, std::shared_ptr<BoardSection> boardSection, std::string adAccountId, 
	void(* handler)(BoardSection, Error, void* )
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

	if (isprimitive("BoardSection")) {
		node = converttoJson(&boardSection, "BoardSection", "");
	}
	
	char *jsonStr =  boardSection.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/boards/{board_id}/sections");
	int pos;

	string s_boardId("{");
	s_boardId.append("board_id");
	s_boardId.append("}");
	pos = url.find(s_boardId);
	url.erase(pos, s_boardId.length());
	url.insert(pos, stringify(&boardId, "std::string"));

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
		NetClient::easycurl(BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = boardSectionsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), boardSectionsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BoardsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BoardsManager::boardSectionsCreateAsync(char * accessToken,
	std::string boardId, std::shared_ptr<BoardSection> boardSection, std::string adAccountId, 
	void(* handler)(BoardSection, Error, void* )
	, void* userData)
{
	return boardSectionsCreateHelper(accessToken,
	boardId, boardSection, adAccountId, 
	handler, userData, true);
}

bool BoardsManager::boardSectionsCreateSync(char * accessToken,
	std::string boardId, std::shared_ptr<BoardSection> boardSection, std::string adAccountId, 
	void(* handler)(BoardSection, Error, void* )
	, void* userData)
{
	return boardSectionsCreateHelper(accessToken,
	boardId, boardSection, adAccountId, 
	handler, userData, false);
}

static bool boardSectionsDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool boardSectionsDeleteHelper(char * accessToken,
	std::string boardId, std::string sectionId, std::string adAccountId, 
	
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

	string url("/boards/{board_id}/sections/{section_id}");
	int pos;

	string s_boardId("{");
	s_boardId.append("board_id");
	s_boardId.append("}");
	pos = url.find(s_boardId);
	url.erase(pos, s_boardId.length());
	url.insert(pos, stringify(&boardId, "std::string"));
	string s_sectionId("{");
	s_sectionId.append("section_id");
	s_sectionId.append("}");
	pos = url.find(s_sectionId);
	url.erase(pos, s_sectionId.length());
	url.insert(pos, stringify(&sectionId, "std::string"));

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
		NetClient::easycurl(BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = boardSectionsDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), boardSectionsDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BoardsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BoardsManager::boardSectionsDeleteAsync(char * accessToken,
	std::string boardId, std::string sectionId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return boardSectionsDeleteHelper(accessToken,
	boardId, sectionId, adAccountId, 
	handler, userData, true);
}

bool BoardsManager::boardSectionsDeleteSync(char * accessToken,
	std::string boardId, std::string sectionId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return boardSectionsDeleteHelper(accessToken,
	boardId, sectionId, adAccountId, 
	handler, userData, false);
}

static bool boardSectionsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Board_sections_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Board_sections_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Board_sections_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Board_sections_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Board_sections_list_200_response", "Board_sections_list_200_response");
			json_node_free(pJson);

			if ("Board_sections_list_200_response" == "std::string") {
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

static bool boardSectionsListHelper(char * accessToken,
	std::string boardId, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Board_sections_list_200_response, Error, void* )
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

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/boards/{board_id}/sections");
	int pos;

	string s_boardId("{");
	s_boardId.append("board_id");
	s_boardId.append("}");
	pos = url.find(s_boardId);
	url.erase(pos, s_boardId.length());
	url.insert(pos, stringify(&boardId, "std::string"));

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
		NetClient::easycurl(BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = boardSectionsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), boardSectionsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BoardsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BoardsManager::boardSectionsListAsync(char * accessToken,
	std::string boardId, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Board_sections_list_200_response, Error, void* )
	, void* userData)
{
	return boardSectionsListHelper(accessToken,
	boardId, adAccountId, bookmark, pageSize, 
	handler, userData, true);
}

bool BoardsManager::boardSectionsListSync(char * accessToken,
	std::string boardId, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Board_sections_list_200_response, Error, void* )
	, void* userData)
{
	return boardSectionsListHelper(accessToken,
	boardId, adAccountId, bookmark, pageSize, 
	handler, userData, false);
}

static bool boardSectionsListPinsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Boards_list_pins_200_response, Error, void* )
	= reinterpret_cast<void(*)(Boards_list_pins_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Boards_list_pins_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Boards_list_pins_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Boards_list_pins_200_response", "Boards_list_pins_200_response");
			json_node_free(pJson);

			if ("Boards_list_pins_200_response" == "std::string") {
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

static bool boardSectionsListPinsHelper(char * accessToken,
	std::string boardId, std::string sectionId, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Boards_list_pins_200_response, Error, void* )
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

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/boards/{board_id}/sections/{section_id}/pins");
	int pos;

	string s_boardId("{");
	s_boardId.append("board_id");
	s_boardId.append("}");
	pos = url.find(s_boardId);
	url.erase(pos, s_boardId.length());
	url.insert(pos, stringify(&boardId, "std::string"));
	string s_sectionId("{");
	s_sectionId.append("section_id");
	s_sectionId.append("}");
	pos = url.find(s_sectionId);
	url.erase(pos, s_sectionId.length());
	url.insert(pos, stringify(&sectionId, "std::string"));

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
		NetClient::easycurl(BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = boardSectionsListPinsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), boardSectionsListPinsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BoardsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BoardsManager::boardSectionsListPinsAsync(char * accessToken,
	std::string boardId, std::string sectionId, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Boards_list_pins_200_response, Error, void* )
	, void* userData)
{
	return boardSectionsListPinsHelper(accessToken,
	boardId, sectionId, adAccountId, bookmark, pageSize, 
	handler, userData, true);
}

bool BoardsManager::boardSectionsListPinsSync(char * accessToken,
	std::string boardId, std::string sectionId, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Boards_list_pins_200_response, Error, void* )
	, void* userData)
{
	return boardSectionsListPinsHelper(accessToken,
	boardId, sectionId, adAccountId, bookmark, pageSize, 
	handler, userData, false);
}

static bool boardSectionsUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BoardSection, Error, void* )
	= reinterpret_cast<void(*)(BoardSection, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BoardSection out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BoardSection")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BoardSection", "BoardSection");
			json_node_free(pJson);

			if ("BoardSection" == "std::string") {
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

static bool boardSectionsUpdateHelper(char * accessToken,
	std::string boardId, std::string sectionId, std::shared_ptr<BoardSection> boardSection, std::string adAccountId, 
	void(* handler)(BoardSection, Error, void* )
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

	if (isprimitive("BoardSection")) {
		node = converttoJson(&boardSection, "BoardSection", "");
	}
	
	char *jsonStr =  boardSection.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/boards/{board_id}/sections/{section_id}");
	int pos;

	string s_boardId("{");
	s_boardId.append("board_id");
	s_boardId.append("}");
	pos = url.find(s_boardId);
	url.erase(pos, s_boardId.length());
	url.insert(pos, stringify(&boardId, "std::string"));
	string s_sectionId("{");
	s_sectionId.append("section_id");
	s_sectionId.append("}");
	pos = url.find(s_sectionId);
	url.erase(pos, s_sectionId.length());
	url.insert(pos, stringify(&sectionId, "std::string"));

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
		NetClient::easycurl(BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = boardSectionsUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), boardSectionsUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BoardsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BoardsManager::boardSectionsUpdateAsync(char * accessToken,
	std::string boardId, std::string sectionId, std::shared_ptr<BoardSection> boardSection, std::string adAccountId, 
	void(* handler)(BoardSection, Error, void* )
	, void* userData)
{
	return boardSectionsUpdateHelper(accessToken,
	boardId, sectionId, boardSection, adAccountId, 
	handler, userData, true);
}

bool BoardsManager::boardSectionsUpdateSync(char * accessToken,
	std::string boardId, std::string sectionId, std::shared_ptr<BoardSection> boardSection, std::string adAccountId, 
	void(* handler)(BoardSection, Error, void* )
	, void* userData)
{
	return boardSectionsUpdateHelper(accessToken,
	boardId, sectionId, boardSection, adAccountId, 
	handler, userData, false);
}

static bool boardsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Board, Error, void* )
	= reinterpret_cast<void(*)(Board, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Board out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Board")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Board", "Board");
			json_node_free(pJson);

			if ("Board" == "std::string") {
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

static bool boardsCreateHelper(char * accessToken,
	std::shared_ptr<Board> board, std::string adAccountId, 
	void(* handler)(Board, Error, void* )
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

	if (isprimitive("Board")) {
		node = converttoJson(&board, "Board", "");
	}
	
	char *jsonStr =  board.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/boards");
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
		NetClient::easycurl(BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = boardsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), boardsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BoardsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BoardsManager::boardsCreateAsync(char * accessToken,
	std::shared_ptr<Board> board, std::string adAccountId, 
	void(* handler)(Board, Error, void* )
	, void* userData)
{
	return boardsCreateHelper(accessToken,
	board, adAccountId, 
	handler, userData, true);
}

bool BoardsManager::boardsCreateSync(char * accessToken,
	std::shared_ptr<Board> board, std::string adAccountId, 
	void(* handler)(Board, Error, void* )
	, void* userData)
{
	return boardsCreateHelper(accessToken,
	board, adAccountId, 
	handler, userData, false);
}

static bool boardsDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool boardsDeleteHelper(char * accessToken,
	std::string boardId, std::string adAccountId, 
	
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

	string url("/boards/{board_id}");
	int pos;

	string s_boardId("{");
	s_boardId.append("board_id");
	s_boardId.append("}");
	pos = url.find(s_boardId);
	url.erase(pos, s_boardId.length());
	url.insert(pos, stringify(&boardId, "std::string"));

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
		NetClient::easycurl(BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = boardsDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), boardsDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BoardsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BoardsManager::boardsDeleteAsync(char * accessToken,
	std::string boardId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return boardsDeleteHelper(accessToken,
	boardId, adAccountId, 
	handler, userData, true);
}

bool BoardsManager::boardsDeleteSync(char * accessToken,
	std::string boardId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return boardsDeleteHelper(accessToken,
	boardId, adAccountId, 
	handler, userData, false);
}

static bool boardsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Board, Error, void* )
	= reinterpret_cast<void(*)(Board, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Board out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Board")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Board", "Board");
			json_node_free(pJson);

			if ("Board" == "std::string") {
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

static bool boardsGetHelper(char * accessToken,
	std::string boardId, std::string adAccountId, 
	void(* handler)(Board, Error, void* )
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

	string url("/boards/{board_id}");
	int pos;

	string s_boardId("{");
	s_boardId.append("board_id");
	s_boardId.append("}");
	pos = url.find(s_boardId);
	url.erase(pos, s_boardId.length());
	url.insert(pos, stringify(&boardId, "std::string"));

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
		NetClient::easycurl(BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = boardsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), boardsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BoardsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BoardsManager::boardsGetAsync(char * accessToken,
	std::string boardId, std::string adAccountId, 
	void(* handler)(Board, Error, void* )
	, void* userData)
{
	return boardsGetHelper(accessToken,
	boardId, adAccountId, 
	handler, userData, true);
}

bool BoardsManager::boardsGetSync(char * accessToken,
	std::string boardId, std::string adAccountId, 
	void(* handler)(Board, Error, void* )
	, void* userData)
{
	return boardsGetHelper(accessToken,
	boardId, adAccountId, 
	handler, userData, false);
}

static bool boardsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Boards_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Boards_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Boards_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Boards_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Boards_list_200_response", "Boards_list_200_response");
			json_node_free(pJson);

			if ("Boards_list_200_response" == "std::string") {
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

static bool boardsListHelper(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string privacy, 
	void(* handler)(Boards_list_200_response, Error, void* )
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


	itemAtq = stringify(&privacy, "std::string");
	queryParams.insert(pair<string, string>("privacy", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("privacy");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/boards");
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
		NetClient::easycurl(BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = boardsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), boardsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BoardsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BoardsManager::boardsListAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string privacy, 
	void(* handler)(Boards_list_200_response, Error, void* )
	, void* userData)
{
	return boardsListHelper(accessToken,
	adAccountId, bookmark, pageSize, privacy, 
	handler, userData, true);
}

bool BoardsManager::boardsListSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string privacy, 
	void(* handler)(Boards_list_200_response, Error, void* )
	, void* userData)
{
	return boardsListHelper(accessToken,
	adAccountId, bookmark, pageSize, privacy, 
	handler, userData, false);
}

static bool boardsListPinsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Boards_list_pins_200_response, Error, void* )
	= reinterpret_cast<void(*)(Boards_list_pins_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Boards_list_pins_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Boards_list_pins_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Boards_list_pins_200_response", "Boards_list_pins_200_response");
			json_node_free(pJson);

			if ("Boards_list_pins_200_response" == "std::string") {
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

static bool boardsListPinsHelper(char * accessToken,
	std::string boardId, std::string bookmark, int pageSize, std::list<std::string> creativeTypes, std::string adAccountId, bool pinMetrics, 
	void(* handler)(Boards_list_pins_200_response, Error, void* )
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

	string url("/boards/{board_id}/pins");
	int pos;

	string s_boardId("{");
	s_boardId.append("board_id");
	s_boardId.append("}");
	pos = url.find(s_boardId);
	url.erase(pos, s_boardId.length());
	url.insert(pos, stringify(&boardId, "std::string"));

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
		NetClient::easycurl(BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = boardsListPinsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), boardsListPinsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BoardsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BoardsManager::boardsListPinsAsync(char * accessToken,
	std::string boardId, std::string bookmark, int pageSize, std::list<std::string> creativeTypes, std::string adAccountId, bool pinMetrics, 
	void(* handler)(Boards_list_pins_200_response, Error, void* )
	, void* userData)
{
	return boardsListPinsHelper(accessToken,
	boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics, 
	handler, userData, true);
}

bool BoardsManager::boardsListPinsSync(char * accessToken,
	std::string boardId, std::string bookmark, int pageSize, std::list<std::string> creativeTypes, std::string adAccountId, bool pinMetrics, 
	void(* handler)(Boards_list_pins_200_response, Error, void* )
	, void* userData)
{
	return boardsListPinsHelper(accessToken,
	boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics, 
	handler, userData, false);
}

static bool boardsUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Board, Error, void* )
	= reinterpret_cast<void(*)(Board, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Board out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Board")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Board", "Board");
			json_node_free(pJson);

			if ("Board" == "std::string") {
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

static bool boardsUpdateHelper(char * accessToken,
	std::string boardId, std::shared_ptr<BoardUpdate> boardUpdate, std::string adAccountId, 
	void(* handler)(Board, Error, void* )
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

	if (isprimitive("BoardUpdate")) {
		node = converttoJson(&boardUpdate, "BoardUpdate", "");
	}
	
	char *jsonStr =  boardUpdate.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/boards/{board_id}");
	int pos;

	string s_boardId("{");
	s_boardId.append("board_id");
	s_boardId.append("}");
	pos = url.find(s_boardId);
	url.erase(pos, s_boardId.length());
	url.insert(pos, stringify(&boardId, "std::string"));

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
		NetClient::easycurl(BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = boardsUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BoardsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), boardsUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BoardsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BoardsManager::boardsUpdateAsync(char * accessToken,
	std::string boardId, std::shared_ptr<BoardUpdate> boardUpdate, std::string adAccountId, 
	void(* handler)(Board, Error, void* )
	, void* userData)
{
	return boardsUpdateHelper(accessToken,
	boardId, boardUpdate, adAccountId, 
	handler, userData, true);
}

bool BoardsManager::boardsUpdateSync(char * accessToken,
	std::string boardId, std::shared_ptr<BoardUpdate> boardUpdate, std::string adAccountId, 
	void(* handler)(Board, Error, void* )
	, void* userData)
{
	return boardsUpdateHelper(accessToken,
	boardId, boardUpdate, adAccountId, 
	handler, userData, false);
}

