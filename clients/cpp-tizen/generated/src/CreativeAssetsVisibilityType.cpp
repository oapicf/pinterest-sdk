#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreativeAssetsVisibilityType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreativeAssetsVisibilityType::CreativeAssetsVisibilityType()
{
	//__init();
}

CreativeAssetsVisibilityType::~CreativeAssetsVisibilityType()
{
	//__cleanup();
}

void
CreativeAssetsVisibilityType::__init()
{
}

void
CreativeAssetsVisibilityType::__cleanup()
{
	//
}

void
CreativeAssetsVisibilityType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

CreativeAssetsVisibilityType::CreativeAssetsVisibilityType(char* json)
{
	this->fromJson(json);
}

char*
CreativeAssetsVisibilityType::toJson()
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


