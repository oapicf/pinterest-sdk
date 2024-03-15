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


static bool boardsUserFollowsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Boards_user_follows_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Boards_user_follows_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Boards_user_follows_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Boards_user_follows_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Boards_user_follows_list_200_response", "Boards_user_follows_list_200_response");
			json_node_free(pJson);

			if ("Boards_user_follows_list_200_response" == "std::string") {
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

static bool boardsUserFollowsListHelper(char * accessToken,
	std::string bookmark, int pageSize, bool explicitFollowing, std::string adAccountId, 
	void(* handler)(Boards_user_follows_list_200_response, Error, void* )
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


	itemAtq = stringify(&explicitFollowing, "bool");
	queryParams.insert(pair<string, string>("explicit_following", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("explicit_following");
	}


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user_account/following/boards");
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
		bool retval = boardsUserFollowsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), boardsUserFollowsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::boardsUserFollowsListAsync(char * accessToken,
	std::string bookmark, int pageSize, bool explicitFollowing, std::string adAccountId, 
	void(* handler)(Boards_user_follows_list_200_response, Error, void* )
	, void* userData)
{
	return boardsUserFollowsListHelper(accessToken,
	bookmark, pageSize, explicitFollowing, adAccountId, 
	handler, userData, true);
}

bool UserAccountManager::boardsUserFollowsListSync(char * accessToken,
	std::string bookmark, int pageSize, bool explicitFollowing, std::string adAccountId, 
	void(* handler)(Boards_user_follows_list_200_response, Error, void* )
	, void* userData)
{
	return boardsUserFollowsListHelper(accessToken,
	bookmark, pageSize, explicitFollowing, adAccountId, 
	handler, userData, false);
}

static bool followUserUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UserSummary, Error, void* )
	= reinterpret_cast<void(*)(UserSummary, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UserSummary out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UserSummary")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UserSummary", "UserSummary");
			json_node_free(pJson);

			if ("UserSummary" == "std::string") {
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

static bool followUserUpdateHelper(char * accessToken,
	std::string username, std::shared_ptr<FollowUserRequest> followUserRequest, 
	void(* handler)(UserSummary, Error, void* )
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

	if (isprimitive("FollowUserRequest")) {
		node = converttoJson(&followUserRequest, "FollowUserRequest", "");
	}
	
	char *jsonStr =  followUserRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/user_account/following/{username}");
	int pos;

	string s_username("{");
	s_username.append("username");
	s_username.append("}");
	pos = url.find(s_username);
	url.erase(pos, s_username.length());
	url.insert(pos, stringify(&username, "std::string"));

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
		NetClient::easycurl(UserAccountManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = followUserUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), followUserUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::followUserUpdateAsync(char * accessToken,
	std::string username, std::shared_ptr<FollowUserRequest> followUserRequest, 
	void(* handler)(UserSummary, Error, void* )
	, void* userData)
{
	return followUserUpdateHelper(accessToken,
	username, followUserRequest, 
	handler, userData, true);
}

bool UserAccountManager::followUserUpdateSync(char * accessToken,
	std::string username, std::shared_ptr<FollowUserRequest> followUserRequest, 
	void(* handler)(UserSummary, Error, void* )
	, void* userData)
{
	return followUserUpdateHelper(accessToken,
	username, followUserRequest, 
	handler, userData, false);
}

static bool followersListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Followers_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Followers_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Followers_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Followers_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Followers_list_200_response", "Followers_list_200_response");
			json_node_free(pJson);

			if ("Followers_list_200_response" == "std::string") {
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

static bool followersListHelper(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Followers_list_200_response, Error, void* )
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

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user_account/followers");
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
		bool retval = followersListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), followersListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::followersListAsync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Followers_list_200_response, Error, void* )
	, void* userData)
{
	return followersListHelper(accessToken,
	bookmark, pageSize, 
	handler, userData, true);
}

bool UserAccountManager::followersListSync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Followers_list_200_response, Error, void* )
	, void* userData)
{
	return followersListHelper(accessToken,
	bookmark, pageSize, 
	handler, userData, false);
}

static bool linkedBusinessAccountsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<LinkedBusiness>, Error, void* )
	= reinterpret_cast<void(*)(std::list<LinkedBusiness>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<LinkedBusiness> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			LinkedBusiness singlemodel;
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

static bool linkedBusinessAccountsGetHelper(char * accessToken,
	
	void(* handler)(std::list<LinkedBusiness>, Error, void* )
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

	string url("/user_account/businesses");
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
		bool retval = linkedBusinessAccountsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), linkedBusinessAccountsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::linkedBusinessAccountsGetAsync(char * accessToken,
	
	void(* handler)(std::list<LinkedBusiness>, Error, void* )
	, void* userData)
{
	return linkedBusinessAccountsGetHelper(accessToken,
	
	handler, userData, true);
}

bool UserAccountManager::linkedBusinessAccountsGetSync(char * accessToken,
	
	void(* handler)(std::list<LinkedBusiness>, Error, void* )
	, void* userData)
{
	return linkedBusinessAccountsGetHelper(accessToken,
	
	handler, userData, false);
}

static bool unverifyWebsiteDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool unverifyWebsiteDeleteHelper(char * accessToken,
	std::string website, 
	
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
	

	itemAtq = stringify(&website, "std::string");
	queryParams.insert(pair<string, string>("website", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user_account/websites");
	int pos;


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
		NetClient::easycurl(UserAccountManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = unverifyWebsiteDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), unverifyWebsiteDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::unverifyWebsiteDeleteAsync(char * accessToken,
	std::string website, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return unverifyWebsiteDeleteHelper(accessToken,
	website, 
	handler, userData, true);
}

bool UserAccountManager::unverifyWebsiteDeleteSync(char * accessToken,
	std::string website, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return unverifyWebsiteDeleteHelper(accessToken,
	website, 
	handler, userData, false);
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
	Date startDate, Date endDate, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, std::string splitField, std::string adAccountId, 
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


	itemAtq = stringify(&contentType, "std::string");
	queryParams.insert(pair<string, string>("content_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("content_type");
	}


	itemAtq = stringify(&source, "std::string");
	queryParams.insert(pair<string, string>("source", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("source");
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
	Date startDate, Date endDate, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<string,string>, Error, void* )
	, void* userData)
{
	return userAccountAnalyticsHelper(accessToken,
	startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId, 
	handler, userData, true);
}

bool UserAccountManager::userAccountAnalyticsSync(char * accessToken,
	Date startDate, Date endDate, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<string,string>, Error, void* )
	, void* userData)
{
	return userAccountAnalyticsHelper(accessToken,
	startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId, 
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
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
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


	itemAtq = stringify(&contentType, "std::string");
	queryParams.insert(pair<string, string>("content_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("content_type");
	}


	itemAtq = stringify(&source, "std::string");
	queryParams.insert(pair<string, string>("source", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("source");
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
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopPinsAnalyticsResponse, Error, void* )
	, void* userData)
{
	return userAccountAnalyticsTopPinsHelper(accessToken,
	startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, 
	handler, userData, true);
}

bool UserAccountManager::userAccountAnalyticsTopPinsSync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopPinsAnalyticsResponse, Error, void* )
	, void* userData)
{
	return userAccountAnalyticsTopPinsHelper(accessToken,
	startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, 
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
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
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


	itemAtq = stringify(&contentType, "std::string");
	queryParams.insert(pair<string, string>("content_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("content_type");
	}


	itemAtq = stringify(&source, "std::string");
	queryParams.insert(pair<string, string>("source", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("source");
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
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopVideoPinsAnalyticsResponse, Error, void* )
	, void* userData)
{
	return userAccountAnalyticsTopVideoPinsHelper(accessToken,
	startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, 
	handler, userData, true);
}

bool UserAccountManager::userAccountAnalyticsTopVideoPinsSync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopVideoPinsAnalyticsResponse, Error, void* )
	, void* userData)
{
	return userAccountAnalyticsTopVideoPinsHelper(accessToken,
	startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, 
	handler, userData, false);
}

static bool userAccountFollowedInterestsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(User_account_followed_interests_200_response, Error, void* )
	= reinterpret_cast<void(*)(User_account_followed_interests_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	User_account_followed_interests_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("User_account_followed_interests_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "User_account_followed_interests_200_response", "User_account_followed_interests_200_response");
			json_node_free(pJson);

			if ("User_account_followed_interests_200_response" == "std::string") {
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

static bool userAccountFollowedInterestsHelper(char * accessToken,
	std::string username, std::string bookmark, int pageSize, 
	void(* handler)(User_account_followed_interests_200_response, Error, void* )
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

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/{username}/interests/follow");
	int pos;

	string s_username("{");
	s_username.append("username");
	s_username.append("}");
	pos = url.find(s_username);
	url.erase(pos, s_username.length());
	url.insert(pos, stringify(&username, "std::string"));

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
		bool retval = userAccountFollowedInterestsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), userAccountFollowedInterestsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::userAccountFollowedInterestsAsync(char * accessToken,
	std::string username, std::string bookmark, int pageSize, 
	void(* handler)(User_account_followed_interests_200_response, Error, void* )
	, void* userData)
{
	return userAccountFollowedInterestsHelper(accessToken,
	username, bookmark, pageSize, 
	handler, userData, true);
}

bool UserAccountManager::userAccountFollowedInterestsSync(char * accessToken,
	std::string username, std::string bookmark, int pageSize, 
	void(* handler)(User_account_followed_interests_200_response, Error, void* )
	, void* userData)
{
	return userAccountFollowedInterestsHelper(accessToken,
	username, bookmark, pageSize, 
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

static bool userFollowingGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(User_following_get_200_response, Error, void* )
	= reinterpret_cast<void(*)(User_following_get_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	User_following_get_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("User_following_get_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "User_following_get_200_response", "User_following_get_200_response");
			json_node_free(pJson);

			if ("User_following_get_200_response" == "std::string") {
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

static bool userFollowingGetHelper(char * accessToken,
	std::string bookmark, int pageSize, UserFollowingFeedType feedType, bool explicitFollowing, std::string adAccountId, 
	void(* handler)(User_following_get_200_response, Error, void* )
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


	itemAtq = stringify(&feedType, "UserFollowingFeedType");
	queryParams.insert(pair<string, string>("feed_type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("feed_type");
	}


	itemAtq = stringify(&explicitFollowing, "bool");
	queryParams.insert(pair<string, string>("explicit_following", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("explicit_following");
	}


	itemAtq = stringify(&adAccountId, "std::string");
	queryParams.insert(pair<string, string>("ad_account_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ad_account_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user_account/following");
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
		bool retval = userFollowingGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), userFollowingGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::userFollowingGetAsync(char * accessToken,
	std::string bookmark, int pageSize, UserFollowingFeedType feedType, bool explicitFollowing, std::string adAccountId, 
	void(* handler)(User_following_get_200_response, Error, void* )
	, void* userData)
{
	return userFollowingGetHelper(accessToken,
	bookmark, pageSize, feedType, explicitFollowing, adAccountId, 
	handler, userData, true);
}

bool UserAccountManager::userFollowingGetSync(char * accessToken,
	std::string bookmark, int pageSize, UserFollowingFeedType feedType, bool explicitFollowing, std::string adAccountId, 
	void(* handler)(User_following_get_200_response, Error, void* )
	, void* userData)
{
	return userFollowingGetHelper(accessToken,
	bookmark, pageSize, feedType, explicitFollowing, adAccountId, 
	handler, userData, false);
}

static bool userWebsitesGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(User_websites_get_200_response, Error, void* )
	= reinterpret_cast<void(*)(User_websites_get_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	User_websites_get_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("User_websites_get_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "User_websites_get_200_response", "User_websites_get_200_response");
			json_node_free(pJson);

			if ("User_websites_get_200_response" == "std::string") {
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

static bool userWebsitesGetHelper(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(User_websites_get_200_response, Error, void* )
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

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user_account/websites");
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
		bool retval = userWebsitesGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), userWebsitesGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::userWebsitesGetAsync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(User_websites_get_200_response, Error, void* )
	, void* userData)
{
	return userWebsitesGetHelper(accessToken,
	bookmark, pageSize, 
	handler, userData, true);
}

bool UserAccountManager::userWebsitesGetSync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(User_websites_get_200_response, Error, void* )
	, void* userData)
{
	return userWebsitesGetHelper(accessToken,
	bookmark, pageSize, 
	handler, userData, false);
}

static bool verifyWebsiteUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UserWebsiteSummary, Error, void* )
	= reinterpret_cast<void(*)(UserWebsiteSummary, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UserWebsiteSummary out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UserWebsiteSummary")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UserWebsiteSummary", "UserWebsiteSummary");
			json_node_free(pJson);

			if ("UserWebsiteSummary" == "std::string") {
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

static bool verifyWebsiteUpdateHelper(char * accessToken,
	std::shared_ptr<UserWebsiteVerifyRequest> userWebsiteVerifyRequest, 
	void(* handler)(UserWebsiteSummary, Error, void* )
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

	if (isprimitive("UserWebsiteVerifyRequest")) {
		node = converttoJson(&userWebsiteVerifyRequest, "UserWebsiteVerifyRequest", "");
	}
	
	char *jsonStr =  userWebsiteVerifyRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/user_account/websites");
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
		NetClient::easycurl(UserAccountManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = verifyWebsiteUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), verifyWebsiteUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::verifyWebsiteUpdateAsync(char * accessToken,
	std::shared_ptr<UserWebsiteVerifyRequest> userWebsiteVerifyRequest, 
	void(* handler)(UserWebsiteSummary, Error, void* )
	, void* userData)
{
	return verifyWebsiteUpdateHelper(accessToken,
	userWebsiteVerifyRequest, 
	handler, userData, true);
}

bool UserAccountManager::verifyWebsiteUpdateSync(char * accessToken,
	std::shared_ptr<UserWebsiteVerifyRequest> userWebsiteVerifyRequest, 
	void(* handler)(UserWebsiteSummary, Error, void* )
	, void* userData)
{
	return verifyWebsiteUpdateHelper(accessToken,
	userWebsiteVerifyRequest, 
	handler, userData, false);
}

static bool websiteVerificationGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UserWebsiteVerificationCode, Error, void* )
	= reinterpret_cast<void(*)(UserWebsiteVerificationCode, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UserWebsiteVerificationCode out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UserWebsiteVerificationCode")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UserWebsiteVerificationCode", "UserWebsiteVerificationCode");
			json_node_free(pJson);

			if ("UserWebsiteVerificationCode" == "std::string") {
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

static bool websiteVerificationGetHelper(char * accessToken,
	
	void(* handler)(UserWebsiteVerificationCode, Error, void* )
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

	string url("/user_account/websites/verification");
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
		bool retval = websiteVerificationGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), websiteVerificationGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UserAccountManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UserAccountManager::websiteVerificationGetAsync(char * accessToken,
	
	void(* handler)(UserWebsiteVerificationCode, Error, void* )
	, void* userData)
{
	return websiteVerificationGetHelper(accessToken,
	
	handler, userData, true);
}

bool UserAccountManager::websiteVerificationGetSync(char * accessToken,
	
	void(* handler)(UserWebsiteVerificationCode, Error, void* )
	, void* userData)
{
	return websiteVerificationGetHelper(accessToken,
	
	handler, userData, false);
}

