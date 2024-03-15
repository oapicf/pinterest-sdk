#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IntegrationLogClientRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IntegrationLogClientRequest::IntegrationLogClientRequest()
{
	//__init();
}

IntegrationLogClientRequest::~IntegrationLogClientRequest()
{
	//__cleanup();
}

void
IntegrationLogClientRequest::__init()
{
	//method = std::string();
	//host = std::string();
	//path = std::string();
	//new std::map()std::map> request_headers;
	//new std::map()std::map> response_headers;
	//response_status_code = int(0);
}

void
IntegrationLogClientRequest::__cleanup()
{
	//if(method != NULL) {
	//
	//delete method;
	//method = NULL;
	//}
	//if(host != NULL) {
	//
	//delete host;
	//host = NULL;
	//}
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//if(request_headers != NULL) {
	//request_headers.RemoveAll(true);
	//delete request_headers;
	//request_headers = NULL;
	//}
	//if(response_headers != NULL) {
	//response_headers.RemoveAll(true);
	//delete response_headers;
	//response_headers = NULL;
	//}
	//if(response_status_code != NULL) {
	//
	//delete response_status_code;
	//response_status_code = NULL;
	//}
	//
}

void
IntegrationLogClientRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *methodKey = "method";
	node = json_object_get_member(pJsonObject, methodKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&method, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *hostKey = "host";
	node = json_object_get_member(pJsonObject, hostKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&host, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&path, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *request_headersKey = "request_headers";
	node = json_object_get_member(pJsonObject, request_headersKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			request_headers = new_map;
		}
		
	}
	const gchar *response_headersKey = "response_headers";
	node = json_object_get_member(pJsonObject, response_headersKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			response_headers = new_map;
		}
		
	}
	const gchar *response_status_codeKey = "response_status_code";
	node = json_object_get_member(pJsonObject, response_status_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&response_status_code, node, "int", "");
		} else {
			
		}
	}
}

IntegrationLogClientRequest::IntegrationLogClientRequest(char* json)
{
	this->fromJson(json);
}

char*
IntegrationLogClientRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMethod();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *methodKey = "method";
	json_object_set_member(pJsonObject, methodKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHost();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hostKey = "host";
	json_object_set_member(pJsonObject, hostKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPath();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getRequestHeaders());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *request_headersKey = "request_headers";
	json_object_set_member(pJsonObject, request_headersKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getResponseHeaders());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *response_headersKey = "response_headers";
	json_object_set_member(pJsonObject, response_headersKey, node);
	if (isprimitive("int")) {
		int obj = getResponseStatusCode();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *response_status_codeKey = "response_status_code";
	json_object_set_member(pJsonObject, response_status_codeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
IntegrationLogClientRequest::getMethod()
{
	return method;
}

void
IntegrationLogClientRequest::setMethod(std::string  method)
{
	this->method = method;
}

std::string
IntegrationLogClientRequest::getHost()
{
	return host;
}

void
IntegrationLogClientRequest::setHost(std::string  host)
{
	this->host = host;
}

std::string
IntegrationLogClientRequest::getPath()
{
	return path;
}

void
IntegrationLogClientRequest::setPath(std::string  path)
{
	this->path = path;
}

std::map<string, string>
IntegrationLogClientRequest::getRequestHeaders()
{
	return request_headers;
}

void
IntegrationLogClientRequest::setRequestHeaders(std::map <string, string> request_headers)
{
	this->request_headers = request_headers;
}

std::map<string, string>
IntegrationLogClientRequest::getResponseHeaders()
{
	return response_headers;
}

void
IntegrationLogClientRequest::setResponseHeaders(std::map <string, string> response_headers)
{
	this->response_headers = response_headers;
}

int
IntegrationLogClientRequest::getResponseStatusCode()
{
	return response_status_code;
}

void
IntegrationLogClientRequest::setResponseStatusCode(int  response_status_code)
{
	this->response_status_code = response_status_code;
}


