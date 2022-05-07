#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OauthAccessTokenRequestRefresh_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OauthAccessTokenRequestRefresh_allOf::OauthAccessTokenRequestRefresh_allOf()
{
	//__init();
}

OauthAccessTokenRequestRefresh_allOf::~OauthAccessTokenRequestRefresh_allOf()
{
	//__cleanup();
}

void
OauthAccessTokenRequestRefresh_allOf::__init()
{
	//refresh_token = std::string();
	//scope = std::string();
}

void
OauthAccessTokenRequestRefresh_allOf::__cleanup()
{
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
	//
}

void
OauthAccessTokenRequestRefresh_allOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
}

OauthAccessTokenRequestRefresh_allOf::OauthAccessTokenRequestRefresh_allOf(char* json)
{
	this->fromJson(json);
}

char*
OauthAccessTokenRequestRefresh_allOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OauthAccessTokenRequestRefresh_allOf::getRefreshToken()
{
	return refresh_token;
}

void
OauthAccessTokenRequestRefresh_allOf::setRefreshToken(std::string  refresh_token)
{
	this->refresh_token = refresh_token;
}

std::string
OauthAccessTokenRequestRefresh_allOf::getScope()
{
	return scope;
}

void
OauthAccessTokenRequestRefresh_allOf::setScope(std::string  scope)
{
	this->scope = scope;
}


