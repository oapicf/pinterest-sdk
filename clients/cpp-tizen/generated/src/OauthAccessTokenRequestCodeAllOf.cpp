#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OauthAccessTokenRequestCode_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OauthAccessTokenRequestCode_allOf::OauthAccessTokenRequestCode_allOf()
{
	//__init();
}

OauthAccessTokenRequestCode_allOf::~OauthAccessTokenRequestCode_allOf()
{
	//__cleanup();
}

void
OauthAccessTokenRequestCode_allOf::__init()
{
	//code = std::string();
	//redirect_uri = std::string();
}

void
OauthAccessTokenRequestCode_allOf::__cleanup()
{
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
OauthAccessTokenRequestCode_allOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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

OauthAccessTokenRequestCode_allOf::OauthAccessTokenRequestCode_allOf(char* json)
{
	this->fromJson(json);
}

char*
OauthAccessTokenRequestCode_allOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
OauthAccessTokenRequestCode_allOf::getCode()
{
	return code;
}

void
OauthAccessTokenRequestCode_allOf::setCode(std::string  code)
{
	this->code = code;
}

std::string
OauthAccessTokenRequestCode_allOf::getRedirectUri()
{
	return redirect_uri;
}

void
OauthAccessTokenRequestCode_allOf::setRedirectUri(std::string  redirect_uri)
{
	this->redirect_uri = redirect_uri;
}


