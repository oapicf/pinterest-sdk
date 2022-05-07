#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OauthAccessTokenResponseCode_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OauthAccessTokenResponseCode_allOf::OauthAccessTokenResponseCode_allOf()
{
	//__init();
}

OauthAccessTokenResponseCode_allOf::~OauthAccessTokenResponseCode_allOf()
{
	//__cleanup();
}

void
OauthAccessTokenResponseCode_allOf::__init()
{
	//refresh_token = std::string();
	//refresh_token_expires_in = int(0);
}

void
OauthAccessTokenResponseCode_allOf::__cleanup()
{
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
OauthAccessTokenResponseCode_allOf::fromJson(char* jsonStr)
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
	const gchar *refresh_token_expires_inKey = "refresh_token_expires_in";
	node = json_object_get_member(pJsonObject, refresh_token_expires_inKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&refresh_token_expires_in, node, "int", "");
		} else {
			
		}
	}
}

OauthAccessTokenResponseCode_allOf::OauthAccessTokenResponseCode_allOf(char* json)
{
	this->fromJson(json);
}

char*
OauthAccessTokenResponseCode_allOf::toJson()
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
OauthAccessTokenResponseCode_allOf::getRefreshToken()
{
	return refresh_token;
}

void
OauthAccessTokenResponseCode_allOf::setRefreshToken(std::string  refresh_token)
{
	this->refresh_token = refresh_token;
}

int
OauthAccessTokenResponseCode_allOf::getRefreshTokenExpiresIn()
{
	return refresh_token_expires_in;
}

void
OauthAccessTokenResponseCode_allOf::setRefreshTokenExpiresIn(int  refresh_token_expires_in)
{
	this->refresh_token_expires_in = refresh_token_expires_in;
}


