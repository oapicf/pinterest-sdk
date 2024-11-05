#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreateReportResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreateReportResponse::CatalogsCreateReportResponse()
{
	//__init();
}

CatalogsCreateReportResponse::~CatalogsCreateReportResponse()
{
	//__cleanup();
}

void
CatalogsCreateReportResponse::__init()
{
	//token = std::string();
}

void
CatalogsCreateReportResponse::__cleanup()
{
	//if(token != NULL) {
	//
	//delete token;
	//token = NULL;
	//}
	//
}

void
CatalogsCreateReportResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tokenKey = "token";
	node = json_object_get_member(pJsonObject, tokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&token, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsCreateReportResponse::CatalogsCreateReportResponse(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreateReportResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tokenKey = "token";
	json_object_set_member(pJsonObject, tokenKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsCreateReportResponse::getToken()
{
	return token;
}

void
CatalogsCreateReportResponse::setToken(std::string  token)
{
	this->token = token;
}


