#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics()
{
	//__init();
}

AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::~AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics()
{
	//__cleanup();
}

void
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::__init()
{
	//custom_event_metrics_type = std::string();
	//custom_event_name = std::string();
}

void
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::__cleanup()
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
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *custom_event_metrics_typeKey = "custom_event_metrics_type";
	node = json_object_get_member(pJsonObject, custom_event_metrics_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_event_metrics_type, node, "std::string", "");
		} else {
			
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

AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics(char* json)
{
	this->fromJson(json);
}

char*
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCustomEventMetricsType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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

std::string
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::getCustomEventMetricsType()
{
	return custom_event_metrics_type;
}

void
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::setCustomEventMetricsType(std::string  custom_event_metrics_type)
{
	this->custom_event_metrics_type = custom_event_metrics_type;
}

std::string
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::getCustomEventName()
{
	return custom_event_name;
}

void
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::setCustomEventName(std::string  custom_event_name)
{
	this->custom_event_name = custom_event_name;
}


