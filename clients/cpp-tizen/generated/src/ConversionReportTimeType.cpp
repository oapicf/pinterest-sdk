#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionReportTimeType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionReportTimeType::ConversionReportTimeType()
{
	//__init();
}

ConversionReportTimeType::~ConversionReportTimeType()
{
	//__cleanup();
}

void
ConversionReportTimeType::__init()
{
}

void
ConversionReportTimeType::__cleanup()
{
	//
}

void
ConversionReportTimeType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

ConversionReportTimeType::ConversionReportTimeType(char* json)
{
	this->fromJson(json);
}

char*
ConversionReportTimeType::toJson()
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


