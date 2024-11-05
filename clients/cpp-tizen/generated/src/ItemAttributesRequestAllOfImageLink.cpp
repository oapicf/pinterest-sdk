#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemAttributesRequest_allOf_image_link.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemAttributesRequest_allOf_image_link::ItemAttributesRequest_allOf_image_link()
{
	//__init();
}

ItemAttributesRequest_allOf_image_link::~ItemAttributesRequest_allOf_image_link()
{
	//__cleanup();
}

void
ItemAttributesRequest_allOf_image_link::__init()
{
}

void
ItemAttributesRequest_allOf_image_link::__cleanup()
{
	//
}

void
ItemAttributesRequest_allOf_image_link::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

ItemAttributesRequest_allOf_image_link::ItemAttributesRequest_allOf_image_link(char* json)
{
	this->fromJson(json);
}

char*
ItemAttributesRequest_allOf_image_link::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}


