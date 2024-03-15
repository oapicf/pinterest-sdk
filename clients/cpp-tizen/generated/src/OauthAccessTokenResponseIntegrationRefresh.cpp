#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OauthAccessTokenResponseIntegrationRefresh.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OauthAccessTokenResponseIntegrationRefresh::OauthAccessTokenResponseIntegrationRefresh()
{
	//__init();
}

OauthAccessTokenResponseIntegrationRefresh::~OauthAccessTokenResponseIntegrationRefresh()
{
	//__cleanup();
}

void
OauthAccessTokenResponseIntegrationRefresh::__init()
{
	//response_type = std::string();
	//access_token = std::string();
	//token_type = std::string();
	//expires_in = int(0);
	//scope = std::string();
	//refresh_token = std::string();
	//refresh_token_expires_in = int(0);
}

void
OauthAccessTokenResponseIntegrationRefresh::__cleanup()
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
	//if(refresh_token != NULL) {
	//
	//delete refresh_token;
	//refresh_token = NULL;
	//}
	//if(refresh_token_expires_in != NULL) {
	//
	//delete refresh_token_expires_in;
	//refresh_token_expires_in = NULL;
	//}
	//
}

void
OauthAccessTokenResponseIntegrationRefresh::fromJson(char* jsonStr)
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
	const gchar *refresh_tokenKey = "refresh_token";
	node = json_object_get_member(pJsonObject, refresh_tokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&refresh_token, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *refresh_token_expires_inKey = "refresh_token_expires_in";
	node = json_object_get_member(pJsonObject, refresh_token_expires_inKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&refresh_token_expires_in, node, "int", "");
		} else {
			
		}
	}
}

OauthAccessTokenResponseIntegrationRefresh::OauthAccessTokenResponseIntegrationRefresh(char* json)
{
	this->fromJson(json);
}

char*
OauthAccessTokenResponseIntegrationRefresh::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getRefreshToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *refresh_tokenKey = "refresh_token";
	json_object_set_member(pJsonObject, refresh_tokenKey, node);
	if (isprimitive("int")) {
		int obj = getRefreshTokenExpiresIn();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *refresh_token_expires_inKey = "refresh_token_expires_in";
	json_object_set_member(pJsonObject, refresh_token_expires_inKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OauthAccessTokenResponseIntegrationRefresh::getResponseType()
{
	return response_type;
}

void
OauthAccessTokenResponseIntegrationRefresh::setResponseType(std::string  response_type)
{
	this->response_type = response_type;
}

std::string
OauthAccessTokenResponseIntegrationRefresh::getAccessToken()
{
	return access_token;
}

void
OauthAccessTokenResponseIntegrationRefresh::setAccessToken(std::string  access_token)
{
	this->access_token = access_token;
}

std::string
OauthAccessTokenResponseIntegrationRefresh::getTokenType()
{
	return token_type;
}

void
OauthAccessTokenResponseIntegrationRefresh::setTokenType(std::string  token_type)
{
	this->token_type = token_type;
}

int
OauthAccessTokenResponseIntegrationRefresh::getExpiresIn()
{
	return expires_in;
}

void
OauthAccessTokenResponseIntegrationRefresh::setExpiresIn(int  expires_in)
{
	this->expires_in = expires_in;
}

std::string
OauthAccessTokenResponseIntegrationRefresh::getScope()
{
	return scope;
}

void
OauthAccessTokenResponseIntegrationRefresh::setScope(std::string  scope)
{
	this->scope = scope;
}

std::string
OauthAccessTokenResponseIntegrationRefresh::getRefreshToken()
{
	return refresh_token;
}

void
OauthAccessTokenResponseIntegrationRefresh::setRefreshToken(std::string  refresh_token)
{
	this->refresh_token = refresh_token;
}

int
OauthAccessTokenResponseIntegrationRefresh::getRefreshTokenExpiresIn()
{
	return refresh_token_expires_in;
}

void
OauthAccessTokenResponseIntegrationRefresh::setRefreshTokenExpiresIn(int  refresh_token_expires_in)
{
	this->refresh_token_expires_in = refresh_token_expires_in;
}


