#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OauthAccessToken.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OauthAccessToken::OauthAccessToken()
{
	//__init();
}

OauthAccessToken::~OauthAccessToken()
{
	//__cleanup();
}

void
OauthAccessToken::__init()
{
	//access_token = std::string();
	//expires_in = int(0);
	//refresh_token = std::string();
	//refresh_token_expires_at = int(0);
	//refresh_token_expires_in = int(0);
	//response_type = null;
	//scope = std::string();
	//token_type = std::string();
}

void
OauthAccessToken::__cleanup()
{
	//if(access_token != NULL) {
	//
	//delete access_token;
	//access_token = NULL;
	//}
	//if(expires_in != NULL) {
	//
	//delete expires_in;
	//expires_in = NULL;
	//}
	//if(refresh_token != NULL) {
	//
	//delete refresh_token;
	//refresh_token = NULL;
	//}
	//if(refresh_token_expires_at != NULL) {
	//
	//delete refresh_token_expires_at;
	//refresh_token_expires_at = NULL;
	//}
	//if(refresh_token_expires_in != NULL) {
	//
	//delete refresh_token_expires_in;
	//refresh_token_expires_in = NULL;
	//}
	//if(response_type != NULL) {
	//
	//delete response_type;
	//response_type = NULL;
	//}
	//if(scope != NULL) {
	//
	//delete scope;
	//scope = NULL;
	//}
	//if(token_type != NULL) {
	//
	//delete token_type;
	//token_type = NULL;
	//}
	//
}

void
OauthAccessToken::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *access_tokenKey = "access_token";
	node = json_object_get_member(pJsonObject, access_tokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&access_token, node, "std::string", "");
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
	const gchar *refresh_tokenKey = "refresh_token";
	node = json_object_get_member(pJsonObject, refresh_tokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&refresh_token, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *refresh_token_expires_atKey = "refresh_token_expires_at";
	node = json_object_get_member(pJsonObject, refresh_token_expires_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&refresh_token_expires_at, node, "int", "");
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
	const gchar *response_typeKey = "response_type";
	node = json_object_get_member(pJsonObject, response_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("TokenGrantType")) {
			jsonToValue(&response_type, node, "TokenGrantType", "TokenGrantType");
		} else {
			
			TokenGrantType* obj = static_cast<TokenGrantType*> (&response_type);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *token_typeKey = "token_type";
	node = json_object_get_member(pJsonObject, token_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&token_type, node, "std::string", "");
		} else {
			
		}
	}
}

OauthAccessToken::OauthAccessToken(char* json)
{
	this->fromJson(json);
}

char*
OauthAccessToken::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAccessToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *access_tokenKey = "access_token";
	json_object_set_member(pJsonObject, access_tokenKey, node);
	if (isprimitive("int")) {
		int obj = getExpiresIn();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *expires_inKey = "expires_in";
	json_object_set_member(pJsonObject, expires_inKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRefreshToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *refresh_tokenKey = "refresh_token";
	json_object_set_member(pJsonObject, refresh_tokenKey, node);
	if (isprimitive("int")) {
		int obj = getRefreshTokenExpiresAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *refresh_token_expires_atKey = "refresh_token_expires_at";
	json_object_set_member(pJsonObject, refresh_token_expires_atKey, node);
	if (isprimitive("int")) {
		int obj = getRefreshTokenExpiresIn();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *refresh_token_expires_inKey = "refresh_token_expires_in";
	json_object_set_member(pJsonObject, refresh_token_expires_inKey, node);
	if (isprimitive("TokenGrantType")) {
		TokenGrantType obj = getResponseType();
		node = converttoJson(&obj, "TokenGrantType", "");
	}
	else {
		
		TokenGrantType obj = static_cast<TokenGrantType> (getResponseType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *response_typeKey = "response_type";
	json_object_set_member(pJsonObject, response_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getScope();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *scopeKey = "scope";
	json_object_set_member(pJsonObject, scopeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTokenType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *token_typeKey = "token_type";
	json_object_set_member(pJsonObject, token_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OauthAccessToken::getAccessToken()
{
	return access_token;
}

void
OauthAccessToken::setAccessToken(std::string  access_token)
{
	this->access_token = access_token;
}

int
OauthAccessToken::getExpiresIn()
{
	return expires_in;
}

void
OauthAccessToken::setExpiresIn(int  expires_in)
{
	this->expires_in = expires_in;
}

std::string
OauthAccessToken::getRefreshToken()
{
	return refresh_token;
}

void
OauthAccessToken::setRefreshToken(std::string  refresh_token)
{
	this->refresh_token = refresh_token;
}

int
OauthAccessToken::getRefreshTokenExpiresAt()
{
	return refresh_token_expires_at;
}

void
OauthAccessToken::setRefreshTokenExpiresAt(int  refresh_token_expires_at)
{
	this->refresh_token_expires_at = refresh_token_expires_at;
}

int
OauthAccessToken::getRefreshTokenExpiresIn()
{
	return refresh_token_expires_in;
}

void
OauthAccessToken::setRefreshTokenExpiresIn(int  refresh_token_expires_in)
{
	this->refresh_token_expires_in = refresh_token_expires_in;
}

TokenGrantType
OauthAccessToken::getResponseType()
{
	return response_type;
}

void
OauthAccessToken::setResponseType(TokenGrantType  response_type)
{
	this->response_type = response_type;
}

std::string
OauthAccessToken::getScope()
{
	return scope;
}

void
OauthAccessToken::setScope(std::string  scope)
{
	this->scope = scope;
}

std::string
OauthAccessToken::getTokenType()
{
	return token_type;
}

void
OauthAccessToken::setTokenType(std::string  token_type)
{
	this->token_type = token_type;
}


