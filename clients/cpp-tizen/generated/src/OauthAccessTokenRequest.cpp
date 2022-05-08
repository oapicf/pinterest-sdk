#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OauthAccessTokenRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OauthAccessTokenRequest::OauthAccessTokenRequest()
{
	//__init();
}

OauthAccessTokenRequest::~OauthAccessTokenRequest()
{
	//__cleanup();
}

void
OauthAccessTokenRequest::__init()
{
	//grant_type = std::string();
}

void
OauthAccessTokenRequest::__cleanup()
{
	//if(grant_type != NULL) {
	//
	//delete grant_type;
	//grant_type = NULL;
	//}
	//
}

void
OauthAccessTokenRequest::fromJson(char* jsonStr)
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
}

OauthAccessTokenRequest::OauthAccessTokenRequest(char* json)
{
	this->fromJson(json);
}

char*
OauthAccessTokenRequest::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OauthAccessTokenRequest::getGrantType()
{
	return grant_type;
}

void
OauthAccessTokenRequest::setGrantType(std::string  grant_type)
{
	this->grant_type = grant_type;
}


