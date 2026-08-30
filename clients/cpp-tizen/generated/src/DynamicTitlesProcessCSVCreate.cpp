#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DynamicTitlesProcessCSVCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DynamicTitlesProcessCSVCreate::DynamicTitlesProcessCSVCreate()
{
	//__init();
}

DynamicTitlesProcessCSVCreate::~DynamicTitlesProcessCSVCreate()
{
	//__cleanup();
}

void
DynamicTitlesProcessCSVCreate::__init()
{
	//request_id = std::string();
}

void
DynamicTitlesProcessCSVCreate::__cleanup()
{
	//if(request_id != NULL) {
	//
	//delete request_id;
	//request_id = NULL;
	//}
	//
}

void
DynamicTitlesProcessCSVCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *request_idKey = "request_id";
	node = json_object_get_member(pJsonObject, request_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&request_id, node, "std::string", "");
		} else {
			
		}
	}
}

DynamicTitlesProcessCSVCreate::DynamicTitlesProcessCSVCreate(char* json)
{
	this->fromJson(json);
}

char*
DynamicTitlesProcessCSVCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getRequestId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *request_idKey = "request_id";
	json_object_set_member(pJsonObject, request_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DynamicTitlesProcessCSVCreate::getRequestId()
{
	return request_id;
}

void
DynamicTitlesProcessCSVCreate::setRequestId(std::string  request_id)
{
	this->request_id = request_id;
}


