#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ActionType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ActionType::ActionType()
{
	//__init();
}

ActionType::~ActionType()
{
	//__cleanup();
}

void
ActionType::__init()
{
}

void
ActionType::__cleanup()
{
	//
}

void
ActionType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

ActionType::ActionType(char* json)
{
	this->fromJson(json);
}

char*
ActionType::toJson()
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


