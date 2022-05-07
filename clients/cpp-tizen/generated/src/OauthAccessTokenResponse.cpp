#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OauthAccessTokenResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OauthAccessTokenResponse::OauthAccessTokenResponse()
{
	//__init();
}

OauthAccessTokenResponse::~OauthAccessTokenResponse()
{
	//__cleanup();
}

void
OauthAccessTokenResponse::__init()
{
	//response_type = std::string();
	//access_token = std::string();
	//token_type = std::string();
	//expires_in = int(0);
	//scope = std::string();
}

void
OauthAccessTokenResponse::__cleanup()
{
	//if(response_type != NULL) {
	//
	//delete response_type;
	//response_type = NULL;
	//}
	//if(access_token != NULL) {
	//
	//delete access_token;
	//access_token = NULL;
	//}
	//if(token_type != NULL) {
	//
	//delete token_type;
	//token_type = NULL;
	//}
	//if(expires_in != NULL) {
	//
	//delete expires_in;
	//expires_in = NULL;
	//}
	//if(scope != NULL) {
	//
	//delete scope;
	//scope = NULL;
	//}
	//
}

void
OauthAccessTokenResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *response_typeKey = "response_type";
	node = json_object_get_member(pJsonObject, response_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&response_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *access_tokenKey = "access_token";
	node = json_object_get_member(pJsonObject, access_tokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&access_token, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *token_typeKey = "token_type";
	node = json_object_get_member(pJsonObject, token_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&token_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *expires_inKey = "expires_in";
	node = json_object_get_member(pJsonObject, expires_inKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&expires_in, node, "int", "");
		} else {
			
		}
	}
	const gchar *scopeKey = "scope";
	node = json_object_get_member(pJsonObject, scopeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&scope, node, "std::string", "");
		} else {
			
		}
	}
}

OauthAccessTokenResponse::OauthAccessTokenResponse(char* json)
{
	this->fromJson(json);
}

char*
OauthAccessTokenResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getResponseType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *response_typeKey = "response_type";
	json_object_set_member(pJsonObject, response_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAccessToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *access_tokenKey = "access_token";
	json_object_set_member(pJsonObject, access_tokenKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTokenType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *token_typeKey = "token_type";
	json_object_set_member(pJsonObject, token_typeKey, node);
	if (isprimitive("int")) {
		int obj = getExpiresIn();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *expires_inKey = "expires_in";
	json_object_set_member(pJsonObject, expires_inKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getScope();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *scopeKey = "scope";
	json_object_set_member(pJsonObject, scopeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OauthAccessTokenResponse::getResponseType()
{
	return response_type;
}

void
OauthAccessTokenResponse::setResponseType(std::string  response_type)
{
	this->response_type = response_type;
}

std::string
OauthAccessTokenResponse::getAccessToken()
{
	return access_token;
}

void
OauthAccessTokenResponse::setAccessToken(std::string  access_token)
{
	this->access_token = access_token;
}

std::string
OauthAccessTokenResponse::getTokenType()
{
	return token_type;
}

void
OauthAccessTokenResponse::setTokenType(std::string  token_type)
{
	this->token_type = token_type;
}

int
OauthAccessTokenResponse::getExpiresIn()
{
	return expires_in;
}

void
OauthAccessTokenResponse::setExpiresIn(int  expires_in)
{
	this->expires_in = expires_in;
}

std::string
OauthAccessTokenResponse::getScope()
{
	return scope;
}

void
OauthAccessTokenResponse::setScope(std::string  scope)
{
	this->scope = scope;
}


