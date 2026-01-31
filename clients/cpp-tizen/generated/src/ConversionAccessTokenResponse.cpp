#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionAccessTokenResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionAccessTokenResponse::ConversionAccessTokenResponse()
{
	//__init();
}

ConversionAccessTokenResponse::~ConversionAccessTokenResponse()
{
	//__cleanup();
}

void
ConversionAccessTokenResponse::__init()
{
	//access_token = std::string();
	//token_type = std::string();
}

void
ConversionAccessTokenResponse::__cleanup()
{
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
	//
}

void
ConversionAccessTokenResponse::fromJson(char* jsonStr)
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
	const gchar *token_typeKey = "token_type";
	node = json_object_get_member(pJsonObject, token_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&token_type, node, "std::string", "");
		} else {
			
		}
	}
}

ConversionAccessTokenResponse::ConversionAccessTokenResponse(char* json)
{
	this->fromJson(json);
}

char*
ConversionAccessTokenResponse::toJson()
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
ConversionAccessTokenResponse::getAccessToken()
{
	return access_token;
}

void
ConversionAccessTokenResponse::setAccessToken(std::string  access_token)
{
	this->access_token = access_token;
}

std::string
ConversionAccessTokenResponse::getTokenType()
{
	return token_type;
}

void
ConversionAccessTokenResponse::setTokenType(std::string  token_type)
{
	this->token_type = token_type;
}


