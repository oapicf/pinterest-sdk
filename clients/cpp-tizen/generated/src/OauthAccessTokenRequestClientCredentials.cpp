#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OauthAccessTokenRequestClientCredentials.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OauthAccessTokenRequestClientCredentials::OauthAccessTokenRequestClientCredentials()
{
	//__init();
}

OauthAccessTokenRequestClientCredentials::~OauthAccessTokenRequestClientCredentials()
{
	//__cleanup();
}

void
OauthAccessTokenRequestClientCredentials::__init()
{
	//scope = std::string();
	//grant_type = std::string();
}

void
OauthAccessTokenRequestClientCredentials::__cleanup()
{
	//if(scope != NULL) {
	//
	//delete scope;
	//scope = NULL;
	//}
	//if(grant_type != NULL) {
	//
	//delete grant_type;
	//grant_type = NULL;
	//}
	//
}

void
OauthAccessTokenRequestClientCredentials::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *scopeKey = "scope";
	node = json_object_get_member(pJsonObject, scopeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&scope, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *grant_typeKey = "grant_type";
	node = json_object_get_member(pJsonObject, grant_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&grant_type, node, "std::string", "");
		} else {
			
		}
	}
}

OauthAccessTokenRequestClientCredentials::OauthAccessTokenRequestClientCredentials(char* json)
{
	this->fromJson(json);
}

char*
OauthAccessTokenRequestClientCredentials::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getScope();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *scopeKey = "scope";
	json_object_set_member(pJsonObject, scopeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getGrantType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *grant_typeKey = "grant_type";
	json_object_set_member(pJsonObject, grant_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OauthAccessTokenRequestClientCredentials::getScope()
{
	return scope;
}

void
OauthAccessTokenRequestClientCredentials::setScope(std::string  scope)
{
	this->scope = scope;
}

std::string
OauthAccessTokenRequestClientCredentials::getGrantType()
{
	return grant_type;
}

void
OauthAccessTokenRequestClientCredentials::setGrantType(std::string  grant_type)
{
	this->grant_type = grant_type;
}


