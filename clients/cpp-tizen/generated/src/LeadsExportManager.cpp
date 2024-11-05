#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "LeadsExportManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


LeadsExportManager::LeadsExportManager()
{

}

LeadsExportManager::~LeadsExportManager()
{

}

static gboolean __LeadsExportManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __LeadsExportManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__LeadsExportManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool leadsExportCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(LeadsExportCreateResponse, Error, void* )
	= reinterpret_cast<void(*)(LeadsExportCreateResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	LeadsExportCreateResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("LeadsExportCreateResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "LeadsExportCreateResponse", "LeadsExportCreateResponse");
			json_node_free(pJson);

			if ("LeadsExportCreateResponse" == "std::string") {
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

static bool leadsExportCreateHelper(char * accessToken,
	std::string adAccountId, std::shared_ptr<LeadsExportCreateRequest> leadsExportCreateRequest, 
	void(* handler)(LeadsExportCreateResponse, Error, void* )
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

	if (isprimitive("LeadsExportCreateRequest")) {
		node = converttoJson(&leadsExportCreateRequest, "LeadsExportCreateRequest", "");
	}
	
	char *jsonStr =  leadsExportCreateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/ad_accounts/{ad_account_id}/leads_export");
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
		NetClient::easycurl(LeadsExportManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = leadsExportCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LeadsExportManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), leadsExportCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LeadsExportManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LeadsExportManager::leadsExportCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<LeadsExportCreateRequest> leadsExportCreateRequest, 
	void(* handler)(LeadsExportCreateResponse, Error, void* )
	, void* userData)
{
	return leadsExportCreateHelper(accessToken,
	adAccountId, leadsExportCreateRequest, 
	handler, userData, true);
}

bool LeadsExportManager::leadsExportCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<LeadsExportCreateRequest> leadsExportCreateRequest, 
	void(* handler)(LeadsExportCreateResponse, Error, void* )
	, void* userData)
{
	return leadsExportCreateHelper(accessToken,
	adAccountId, leadsExportCreateRequest, 
	handler, userData, false);
}

static bool leadsExportGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(LeadsExportResponseData, Error, void* )
	= reinterpret_cast<void(*)(LeadsExportResponseData, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	LeadsExportResponseData out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("LeadsExportResponseData")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "LeadsExportResponseData", "LeadsExportResponseData");
			json_node_free(pJson);

			if ("LeadsExportResponseData" == "std::string") {
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

static bool leadsExportGetHelper(char * accessToken,
	std::string adAccountId, std::string leadsExportId, 
	void(* handler)(LeadsExportResponseData, Error, void* )
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

	string url("/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}");
	int pos;

	string s_adAccountId("{");
	s_adAccountId.append("ad_account_id");
	s_adAccountId.append("}");
	pos = url.find(s_adAccountId);
	url.erase(pos, s_adAccountId.length());
	url.insert(pos, stringify(&adAccountId, "std::string"));
	string s_leadsExportId("{");
	s_leadsExportId.append("leads_export_id");
	s_leadsExportId.append("}");
	pos = url.find(s_leadsExportId);
	url.erase(pos, s_leadsExportId.length());
	url.insert(pos, stringify(&leadsExportId, "std::string"));

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
		NetClient::easycurl(LeadsExportManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = leadsExportGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LeadsExportManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), leadsExportGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LeadsExportManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LeadsExportManager::leadsExportGetAsync(char * accessToken,
	std::string adAccountId, std::string leadsExportId, 
	void(* handler)(LeadsExportResponseData, Error, void* )
	, void* userData)
{
	return leadsExportGetHelper(accessToken,
	adAccountId, leadsExportId, 
	handler, userData, true);
}

bool LeadsExportManager::leadsExportGetSync(char * accessToken,
	std::string adAccountId, std::string leadsExportId, 
	void(* handler)(LeadsExportResponseData, Error, void* )
	, void* userData)
{
	return leadsExportGetHelper(accessToken,
	adAccountId, leadsExportId, 
	handler, userData, false);
}

