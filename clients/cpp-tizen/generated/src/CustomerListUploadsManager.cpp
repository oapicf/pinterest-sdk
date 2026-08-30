#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "CustomerListUploadsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


CustomerListUploadsManager::CustomerListUploadsManager()
{

}

CustomerListUploadsManager::~CustomerListUploadsManager()
{

}

static gboolean __CustomerListUploadsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __CustomerListUploadsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__CustomerListUploadsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool customerListUploadsCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CustomerListUploadCreateResponse, Error, void* )
	= reinterpret_cast<void(*)(CustomerListUploadCreateResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CustomerListUploadCreateResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CustomerListUploadCreateResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CustomerListUploadCreateResponse", "CustomerListUploadCreateResponse");
			json_node_free(pJson);

			if ("CustomerListUploadCreateResponse" == "std::string") {
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

static bool customerListUploadsCreateHelper(char * accessToken,
	std::string adAccountId, std::string customerListId, std::shared_ptr<CustomerListUploadCreateRequest> customerListUploadCreateRequest, 
	void(* handler)(CustomerListUploadCreateResponse, Error, void* )
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

	if (isprimitive("CustomerListUploadCreateRequest")) {
		node = converttoJson(&customerListUploadCreateRequest, "CustomerListUploadCreateRequest", "");
	}
	
	char *jsonStr =  customerListUploadCreateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads");
	int pos;

	string s_adAccountId("{");
	s_adAccountId.append("ad_account_id");
	s_adAccountId.append("}");
	pos = url.find(s_adAccountId);
	url.erase(pos, s_adAccountId.length());
	url.insert(pos, stringify(&adAccountId, "std::string"));
	string s_customerListId("{");
	s_customerListId.append("customer_list_id");
	s_customerListId.append("}");
	pos = url.find(s_customerListId);
	url.erase(pos, s_customerListId.length());
	url.insert(pos, stringify(&customerListId, "std::string"));

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
		NetClient::easycurl(CustomerListUploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = customerListUploadsCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CustomerListUploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), customerListUploadsCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CustomerListUploadsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CustomerListUploadsManager::customerListUploadsCreateAsync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::shared_ptr<CustomerListUploadCreateRequest> customerListUploadCreateRequest, 
	void(* handler)(CustomerListUploadCreateResponse, Error, void* )
	, void* userData)
{
	return customerListUploadsCreateHelper(accessToken,
	adAccountId, customerListId, customerListUploadCreateRequest, 
	handler, userData, true);
}

bool CustomerListUploadsManager::customerListUploadsCreateSync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::shared_ptr<CustomerListUploadCreateRequest> customerListUploadCreateRequest, 
	void(* handler)(CustomerListUploadCreateResponse, Error, void* )
	, void* userData)
{
	return customerListUploadsCreateHelper(accessToken,
	adAccountId, customerListId, customerListUploadCreateRequest, 
	handler, userData, false);
}

static bool customerListUploadsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CustomerListUpload, Error, void* )
	= reinterpret_cast<void(*)(CustomerListUpload, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CustomerListUpload out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CustomerListUpload")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CustomerListUpload", "CustomerListUpload");
			json_node_free(pJson);

			if ("CustomerListUpload" == "std::string") {
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

static bool customerListUploadsGetHelper(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUpload, Error, void* )
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

	string url("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}");
	int pos;

	string s_adAccountId("{");
	s_adAccountId.append("ad_account_id");
	s_adAccountId.append("}");
	pos = url.find(s_adAccountId);
	url.erase(pos, s_adAccountId.length());
	url.insert(pos, stringify(&adAccountId, "std::string"));
	string s_customerListId("{");
	s_customerListId.append("customer_list_id");
	s_customerListId.append("}");
	pos = url.find(s_customerListId);
	url.erase(pos, s_customerListId.length());
	url.insert(pos, stringify(&customerListId, "std::string"));
	string s_customerListUploadId("{");
	s_customerListUploadId.append("customer_list_upload_id");
	s_customerListUploadId.append("}");
	pos = url.find(s_customerListUploadId);
	url.erase(pos, s_customerListUploadId.length());
	url.insert(pos, stringify(&customerListUploadId, "std::string"));

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
		NetClient::easycurl(CustomerListUploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = customerListUploadsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CustomerListUploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), customerListUploadsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CustomerListUploadsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CustomerListUploadsManager::customerListUploadsGetAsync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUpload, Error, void* )
	, void* userData)
{
	return customerListUploadsGetHelper(accessToken,
	adAccountId, customerListId, customerListUploadId, 
	handler, userData, true);
}

bool CustomerListUploadsManager::customerListUploadsGetSync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUpload, Error, void* )
	, void* userData)
{
	return customerListUploadsGetHelper(accessToken,
	adAccountId, customerListId, customerListUploadId, 
	handler, userData, false);
}

static bool customerListUploadsRunProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CustomerListUpload, Error, void* )
	= reinterpret_cast<void(*)(CustomerListUpload, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CustomerListUpload out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CustomerListUpload")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CustomerListUpload", "CustomerListUpload");
			json_node_free(pJson);

			if ("CustomerListUpload" == "std::string") {
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

static bool customerListUploadsRunHelper(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUpload, Error, void* )
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

	string url("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run");
	int pos;

	string s_adAccountId("{");
	s_adAccountId.append("ad_account_id");
	s_adAccountId.append("}");
	pos = url.find(s_adAccountId);
	url.erase(pos, s_adAccountId.length());
	url.insert(pos, stringify(&adAccountId, "std::string"));
	string s_customerListId("{");
	s_customerListId.append("customer_list_id");
	s_customerListId.append("}");
	pos = url.find(s_customerListId);
	url.erase(pos, s_customerListId.length());
	url.insert(pos, stringify(&customerListId, "std::string"));
	string s_customerListUploadId("{");
	s_customerListUploadId.append("customer_list_upload_id");
	s_customerListUploadId.append("}");
	pos = url.find(s_customerListUploadId);
	url.erase(pos, s_customerListUploadId.length());
	url.insert(pos, stringify(&customerListUploadId, "std::string"));

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
		NetClient::easycurl(CustomerListUploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = customerListUploadsRunProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CustomerListUploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), customerListUploadsRunProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CustomerListUploadsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CustomerListUploadsManager::customerListUploadsRunAsync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUpload, Error, void* )
	, void* userData)
{
	return customerListUploadsRunHelper(accessToken,
	adAccountId, customerListId, customerListUploadId, 
	handler, userData, true);
}

bool CustomerListUploadsManager::customerListUploadsRunSync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUpload, Error, void* )
	, void* userData)
{
	return customerListUploadsRunHelper(accessToken,
	adAccountId, customerListId, customerListUploadId, 
	handler, userData, false);
}

