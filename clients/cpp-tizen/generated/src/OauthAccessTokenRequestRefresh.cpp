#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OauthAccessTokenRequestRefresh.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OauthAccessTokenRequestRefresh::OauthAccessTokenRequestRefresh()
{
	//__init();
}

OauthAccessTokenRequestRefresh::~OauthAccessTokenRequestRefresh()
{
	//__cleanup();
}

void
OauthAccessTokenRequestRefresh::__init()
{
	//grant_type = std::string();
	//refresh_token = std::string();
	//scope = std::string();
	//refresh_on = bool(false);
}

void
OauthAccessTokenRequestRefresh::__cleanup()
{
	//if(grant_type != NULL) {
	//
	//delete grant_type;
	//grant_type = NULL;
	//}
	//if(refresh_token != NULL) {
	//
	//delete refresh_token;
	//refresh_token = NULL;
	//}
	//if(scope != NULL) {
	//
	//delete scope;
	//scope = NULL;
	//}
	//if(refresh_on != NULL) {
	//
	//delete refresh_on;
	//refresh_on = NULL;
	//}
	//
}

void
OauthAccessTokenRequestRefresh::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *grant_typeKey = "grant_type";
	node = json_object_get_member(pJsonObject, grant_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&grant_type, node, "std::string", "");
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
	const gchar *scopeKey = "scope";
	node = json_object_get_member(pJsonObject, scopeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&scope, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *refresh_onKey = "refresh_on";
	node = json_object_get_member(pJsonObject, refresh_onKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&refresh_on, node, "bool", "");
		} else {
			
		}
	}
}

OauthAccessTokenRequestRefresh::OauthAccessTokenRequestRefresh(char* json)
{
	this->fromJson(json);
}

char*
OauthAccessTokenRequestRefresh::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getGrantType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *grant_typeKey = "grant_type";
	json_object_set_member(pJsonObject, grant_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRefreshToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *refresh_tokenKey = "refresh_token";
	json_object_set_member(pJsonObject, refresh_tokenKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getScope();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *scopeKey = "scope";
	json_object_set_member(pJsonObject, scopeKey, node);
	if (isprimitive("bool")) {
		bool obj = getRefreshOn();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *refresh_onKey = "refresh_on";
	json_object_set_member(pJsonObject, refresh_onKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OauthAccessTokenRequestRefresh::getGrantType()
{
	return grant_type;
}

void
OauthAccessTokenRequestRefresh::setGrantType(std::string  grant_type)
{
	this->grant_type = grant_type;
}

std::string
OauthAccessTokenRequestRefresh::getRefreshToken()
{
	return refresh_token;
}

void
OauthAccessTokenRequestRefresh::setRefreshToken(std::string  refresh_token)
{
	this->refresh_token = refresh_token;
}

std::string
OauthAccessTokenRequestRefresh::getScope()
{
	return scope;
}

void
OauthAccessTokenRequestRefresh::setScope(std::string  scope)
{
	this->scope = scope;
}

bool
OauthAccessTokenRequestRefresh::getRefreshOn()
{
	return refresh_on;
}

void
OauthAccessTokenRequestRefresh::setRefreshOn(bool  refresh_on)
{
	this->refresh_on = refresh_on;
}


