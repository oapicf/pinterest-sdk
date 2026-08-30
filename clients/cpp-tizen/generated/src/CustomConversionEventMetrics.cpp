#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomConversionEventMetrics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomConversionEventMetrics::CustomConversionEventMetrics()
{
	//__init();
}

CustomConversionEventMetrics::~CustomConversionEventMetrics()
{
	//__cleanup();
}

void
CustomConversionEventMetrics::__init()
{
	//custom_event_metrics_type = new AdeColumnType();
	//custom_event_name = std::string();
}

void
CustomConversionEventMetrics::__cleanup()
{
	//if(custom_event_metrics_type != NULL) {
	//
	//delete custom_event_metrics_type;
	//custom_event_metrics_type = NULL;
	//}
	//if(custom_event_name != NULL) {
	//
	//delete custom_event_name;
	//custom_event_name = NULL;
	//}
	//
}

void
CustomConversionEventMetrics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *custom_event_metrics_typeKey = "custom_event_metrics_type";
	node = json_object_get_member(pJsonObject, custom_event_metrics_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AdeColumnType")) {
			jsonToValue(&custom_event_metrics_type, node, "AdeColumnType", "AdeColumnType");
		} else {
			
			AdeColumnType* obj = static_cast<AdeColumnType*> (&custom_event_metrics_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *custom_event_nameKey = "custom_event_name";
	node = json_object_get_member(pJsonObject, custom_event_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_event_name, node, "std::string", "");
		} else {
			
		}
	}
}

CustomConversionEventMetrics::CustomConversionEventMetrics(char* json)
{
	this->fromJson(json);
}

char*
CustomConversionEventMetrics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AdeColumnType")) {
		AdeColumnType obj = getCustomEventMetricsType();
		node = converttoJson(&obj, "AdeColumnType", "");
	}
	else {
		
		AdeColumnType obj = static_cast<AdeColumnType> (getCustomEventMetricsType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *custom_event_metrics_typeKey = "custom_event_metrics_type";
	json_object_set_member(pJsonObject, custom_event_metrics_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomEventName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_event_nameKey = "custom_event_name";
	json_object_set_member(pJsonObject, custom_event_nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AdeColumnType
CustomConversionEventMetrics::getCustomEventMetricsType()
{
	return custom_event_metrics_type;
}

void
CustomConversionEventMetrics::setCustomEventMetricsType(AdeColumnType  custom_event_metrics_type)
{
	this->custom_event_metrics_type = custom_event_metrics_type;
}

std::string
CustomConversionEventMetrics::getCustomEventName()
{
	return custom_event_name;
}

void
CustomConversionEventMetrics::setCustomEventName(std::string  custom_event_name)
{
	this->custom_event_name = custom_event_name;
}


