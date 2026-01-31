#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DisclosureType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DisclosureType::DisclosureType()
{
	//__init();
}

DisclosureType::~DisclosureType()
{
	//__cleanup();
}

void
DisclosureType::__init()
{
}

void
DisclosureType::__cleanup()
{
	//
}

void
DisclosureType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

DisclosureType::DisclosureType(char* json)
{
	this->fromJson(json);
}

char*
DisclosureType::toJson()
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


