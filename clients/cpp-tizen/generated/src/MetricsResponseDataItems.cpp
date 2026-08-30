#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MetricsResponseDataItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MetricsResponseDataItems::MetricsResponseDataItems()
{
	//__init();
}

MetricsResponseDataItems::~MetricsResponseDataItems()
{
	//__cleanup();
}

void
MetricsResponseDataItems::__init()
{
	//metrics = null;
	//targeting_type = std::string();
	//targeting_value = std::string();
}

void
MetricsResponseDataItems::__cleanup()
{
	//if(metrics != NULL) {
	//
	//delete metrics;
	//metrics = NULL;
	//}
	//if(targeting_type != NULL) {
	//
	//delete targeting_type;
	//targeting_type = NULL;
	//}
	//if(targeting_value != NULL) {
	//
	//delete targeting_value;
	//targeting_value = NULL;
	//}
	//
}

void
MetricsResponseDataItems::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *metricsKey = "metrics";
	node = json_object_get_member(pJsonObject, metricsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&metrics, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&metrics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *targeting_typeKey = "targeting_type";
	node = json_object_get_member(pJsonObject, targeting_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&targeting_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *targeting_valueKey = "targeting_value";
	node = json_object_get_member(pJsonObject, targeting_valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&targeting_value, node, "std::string", "");
		} else {
			
		}
	}
}

MetricsResponseDataItems::MetricsResponseDataItems(char* json)
{
	this->fromJson(json);
}

char*
MetricsResponseDataItems::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMetrics();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getMetrics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metricsKey = "metrics";
	json_object_set_member(pJsonObject, metricsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTargetingType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *targeting_typeKey = "targeting_type";
	json_object_set_member(pJsonObject, targeting_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTargetingValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *targeting_valueKey = "targeting_value";
	json_object_set_member(pJsonObject, targeting_valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MetricsResponseDataItems::getMetrics()
{
	return metrics;
}

void
MetricsResponseDataItems::setMetrics(std::string  metrics)
{
	this->metrics = metrics;
}

std::string
MetricsResponseDataItems::getTargetingType()
{
	return targeting_type;
}

void
MetricsResponseDataItems::setTargetingType(std::string  targeting_type)
{
	this->targeting_type = targeting_type;
}

std::string
MetricsResponseDataItems::getTargetingValue()
{
	return targeting_value;
}

void
MetricsResponseDataItems::setTargetingValue(std::string  targeting_value)
{
	this->targeting_value = targeting_value;
}


