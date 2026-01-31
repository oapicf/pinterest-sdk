#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Pinterest.Lib.PaginationOrder.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Pinterest.Lib.PaginationOrder::Pinterest.Lib.PaginationOrder()
{
	//__init();
}

Pinterest.Lib.PaginationOrder::~Pinterest.Lib.PaginationOrder()
{
	//__cleanup();
}

void
Pinterest.Lib.PaginationOrder::__init()
{
}

void
Pinterest.Lib.PaginationOrder::__cleanup()
{
	//
}

void
Pinterest.Lib.PaginationOrder::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

Pinterest.Lib.PaginationOrder::Pinterest.Lib.PaginationOrder(char* json)
{
	this->fromJson(json);
}

char*
Pinterest.Lib.PaginationOrder::toJson()
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


