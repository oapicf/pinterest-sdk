#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Pins_analytics_metric_types_parameter_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Pins_analytics_metric_types_parameter_inner::Pins_analytics_metric_types_parameter_inner()
{
	//__init();
}

Pins_analytics_metric_types_parameter_inner::~Pins_analytics_metric_types_parameter_inner()
{
	//__cleanup();
}

void
Pins_analytics_metric_types_parameter_inner::__init()
{
}

void
Pins_analytics_metric_types_parameter_inner::__cleanup()
{
	//
}

void
Pins_analytics_metric_types_parameter_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

Pins_analytics_metric_types_parameter_inner::Pins_analytics_metric_types_parameter_inner(char* json)
{
	this->fromJson(json);
}

char*
Pins_analytics_metric_types_parameter_inner::toJson()
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


