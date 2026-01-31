#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ContentType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ContentType::ContentType()
{
	//__init();
}

ContentType::~ContentType()
{
	//__cleanup();
}

void
ContentType::__init()
{
}

void
ContentType::__cleanup()
{
	//
}

void
ContentType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

ContentType::ContentType(char* json)
{
	this->fromJson(json);
}

char*
ContentType::toJson()
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


