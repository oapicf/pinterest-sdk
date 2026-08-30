#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "NullableLabelStatus.h"

using namespace std;
using namespace Tizen::ArtikCloud;

NullableLabelStatus::NullableLabelStatus()
{
	//__init();
}

NullableLabelStatus::~NullableLabelStatus()
{
	//__cleanup();
}

void
NullableLabelStatus::__init()
{
}

void
NullableLabelStatus::__cleanup()
{
	//
}

void
NullableLabelStatus::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

NullableLabelStatus::NullableLabelStatus(char* json)
{
	this->fromJson(json);
}

char*
NullableLabelStatus::toJson()
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


