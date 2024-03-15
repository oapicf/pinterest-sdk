#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ProductGroupsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ProductGroupsManager::ProductGroupsManager()
{

}

ProductGroupsManager::~ProductGroupsManager()
{

}

static gboolean __ProductGroupsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ProductGroupsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ProductGroupsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool adAccountsCatalogsProductGroupsListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Ad_accounts_catalogs_product_groups_list_200_response, Error, void* )
	= reinterpret_cast<void(*)(Ad_accounts_catalogs_product_groups_list_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Ad_accounts_catalogs_product_groups_list_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Ad_accounts_catalogs_product_groups_list_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Ad_accounts_catalogs_product_groups_list_200_response", "Ad_accounts_catalogs_product_groups_list_200_response");
			json_node_free(pJson);

			if ("Ad_accounts_catalogs_product_groups_list_200_response" == "std::string") {
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

static bool adAccountsCatalogsProductGroupsListHelper(char * accessToken,
	std::string adAccountId, std::string feedProfileId, 
	void(* handler)(Ad_accounts_catalogs_product_groups_list_200_response, Error, void* )
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
	

	itemAtq = stringify(&feedProfileId, "std::string");
	queryParams.insert(pair<string, string>("feed_profile_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("feed_profile_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/ad_accounts/{ad_account_id}/product_groups/catalogs");
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
		NetClient::easycurl(ProductGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adAccountsCatalogsProductGroupsListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProductGroupsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adAccountsCatalogsProductGroupsListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProductGroupsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProductGroupsManager::adAccountsCatalogsProductGroupsListAsync(char * accessToken,
	std::string adAccountId, std::string feedProfileId, 
	void(* handler)(Ad_accounts_catalogs_product_groups_list_200_response, Error, void* )
	, void* userData)
{
	return adAccountsCatalogsProductGroupsListHelper(accessToken,
	adAccountId, feedProfileId, 
	handler, userData, true);
}

bool ProductGroupsManager::adAccountsCatalogsProductGroupsListSync(char * accessToken,
	std::string adAccountId, std::string feedProfileId, 
	void(* handler)(Ad_accounts_catalogs_product_groups_list_200_response, Error, void* )
	, void* userData)
{
	return adAccountsCatalogsProductGroupsListHelper(accessToken,
	adAccountId, feedProfileId, 
	handler, userData, false);
}

