#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BookClosed.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BookClosed::BookClosed()
{
	//__init();
}

BookClosed::~BookClosed()
{
	//__cleanup();
}

void
BookClosed::__init()
{
	//conversion_metrics_ready = bool(false);
	//non_conversion_metrics_ready = bool(false);
}

void
BookClosed::__cleanup()
{
	//if(conversion_metrics_ready != NULL) {
	//
	//delete conversion_metrics_ready;
	//conversion_metrics_ready = NULL;
	//}
	//if(non_conversion_metrics_ready != NULL) {
	//
	//delete non_conversion_metrics_ready;
	//non_conversion_metrics_ready = NULL;
	//}
	//
}

void
BookClosed::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *conversion_metrics_readyKey = "conversion_metrics_ready";
	node = json_object_get_member(pJsonObject, conversion_metrics_readyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&conversion_metrics_ready, node, "bool", "");
		} else {
			
		}
	}
	const gchar *non_conversion_metrics_readyKey = "non_conversion_metrics_ready";
	node = json_object_get_member(pJsonObject, non_conversion_metrics_readyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&non_conversion_metrics_ready, node, "bool", "");
		} else {
			
		}
	}
}

BookClosed::BookClosed(char* json)
{
	this->fromJson(json);
}

char*
BookClosed::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getConversionMetricsReady();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *conversion_metrics_readyKey = "conversion_metrics_ready";
	json_object_set_member(pJsonObject, conversion_metrics_readyKey, node);
	if (isprimitive("bool")) {
		bool obj = getNonConversionMetricsReady();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *non_conversion_metrics_readyKey = "non_conversion_metrics_ready";
	json_object_set_member(pJsonObject, non_conversion_metrics_readyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
BookClosed::getConversionMetricsReady()
{
	return conversion_metrics_ready;
}

void
BookClosed::setConversionMetricsReady(bool  conversion_metrics_ready)
{
	this->conversion_metrics_ready = conversion_metrics_ready;
}

bool
BookClosed::getNonConversionMetricsReady()
{
	return non_conversion_metrics_ready;
}

void
BookClosed::setNonConversionMetricsReady(bool  non_conversion_metrics_ready)
{
	this->non_conversion_metrics_ready = non_conversion_metrics_ready;
}


