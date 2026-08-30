#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendsL1Interest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendsL1Interest::TrendsL1Interest()
{
	//__init();
}

TrendsL1Interest::~TrendsL1Interest()
{
	//__cleanup();
}

void
TrendsL1Interest::__init()
{
}

void
TrendsL1Interest::__cleanup()
{
	//
}

void
TrendsL1Interest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

TrendsL1Interest::TrendsL1Interest(char* json)
{
	this->fromJson(json);
}

char*
TrendsL1Interest::toJson()
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


