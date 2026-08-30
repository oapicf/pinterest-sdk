#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEventIngestionSource.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEventIngestionSource::ConversionEventIngestionSource()
{
	//__init();
}

ConversionEventIngestionSource::~ConversionEventIngestionSource()
{
	//__cleanup();
}

void
ConversionEventIngestionSource::__init()
{
}

void
ConversionEventIngestionSource::__cleanup()
{
	//
}

void
ConversionEventIngestionSource::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

ConversionEventIngestionSource::ConversionEventIngestionSource(char* json)
{
	this->fromJson(json);
}

char*
ConversionEventIngestionSource::toJson()
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


