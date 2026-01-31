#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AgeTrendsBucket.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AgeTrendsBucket::AgeTrendsBucket()
{
	//__init();
}

AgeTrendsBucket::~AgeTrendsBucket()
{
	//__cleanup();
}

void
AgeTrendsBucket::__init()
{
}

void
AgeTrendsBucket::__cleanup()
{
	//
}

void
AgeTrendsBucket::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

AgeTrendsBucket::AgeTrendsBucket(char* json)
{
	this->fromJson(json);
}

char*
AgeTrendsBucket::toJson()
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


