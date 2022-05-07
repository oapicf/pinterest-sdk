#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OauthAccessTokenRequestCode.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OauthAccessTokenRequestCode::OauthAccessTokenRequestCode()
{
	//__init();
}

OauthAccessTokenRequestCode::~OauthAccessTokenRequestCode()
{
	//__cleanup();
}

void
OauthAccessTokenRequestCode::__init()
{
	//grant_type = std::string();
	//code = std::string();
	//redirect_uri = std::string();
}

void
OauthAccessTokenRequestCode::__cleanup()
{
	//if(grant_type != NULL) {
	//
	//delete grant_type;
	//grant_type = NULL;
	//}
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(redirect_uri != NULL) {
	//
	//delete redirect_uri;
	//redirect_uri = NULL;
	//}
	//
}

void
OauthAccessTokenRequestCode::fromJson(char* jsonStr)
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
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&code, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *redirect_uriKey = "redirect_uri";
	node = json_object_get_member(pJsonObject, redirect_uriKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&redirect_uri, node, "std::string", "");
		} else {
			
		}
	}
}

OauthAccessTokenRequestCode::OauthAccessTokenRequestCode(char* json)
{
	this->fromJson(json);
}

char*
OauthAccessTokenRequestCode::toJson()
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
		std::string obj = getCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRedirectUri();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *redirect_uriKey = "redirect_uri";
	json_object_set_member(pJsonObject, redirect_uriKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OauthAccessTokenRequestCode::getGrantType()
{
	return grant_type;
}

void
OauthAccessTokenRequestCode::setGrantType(std::string  grant_type)
{
	this->grant_type = grant_type;
}

std::string
OauthAccessTokenRequestCode::getCode()
{
	return code;
}

void
OauthAccessTokenRequestCode::setCode(std::string  code)
{
	this->code = code;
}

std::string
OauthAccessTokenRequestCode::getRedirectUri()
{
	return redirect_uri;
}

void
OauthAccessTokenRequestCode::setRedirectUri(std::string  redirect_uri)
{
	this->redirect_uri = redirect_uri;
}


