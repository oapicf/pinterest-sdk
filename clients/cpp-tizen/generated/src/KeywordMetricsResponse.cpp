#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordMetricsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordMetricsResponse::KeywordMetricsResponse()
{
	//__init();
}

KeywordMetricsResponse::~KeywordMetricsResponse()
{
	//__cleanup();
}

void
KeywordMetricsResponse::__init()
{
	//keyword = std::string();
	//metrics = new KeywordMetrics();
}

void
KeywordMetricsResponse::__cleanup()
{
	//if(keyword != NULL) {
	//
	//delete keyword;
	//keyword = NULL;
	//}
	//if(metrics != NULL) {
	//
	//delete metrics;
	//metrics = NULL;
	//}
	//
}

void
KeywordMetricsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *keywordKey = "keyword";
	node = json_object_get_member(pJsonObject, keywordKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&keyword, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *metricsKey = "metrics";
	node = json_object_get_member(pJsonObject, metricsKey);
	if (node !=NULL) {
	

		if (isprimitive("KeywordMetrics")) {
			jsonToValue(&metrics, node, "KeywordMetrics", "KeywordMetrics");
		} else {
			
			KeywordMetrics* obj = static_cast<KeywordMetrics*> (&metrics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

KeywordMetricsResponse::KeywordMetricsResponse(char* json)
{
	this->fromJson(json);
}

char*
KeywordMetricsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getKeyword();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *keywordKey = "keyword";
	json_object_set_member(pJsonObject, keywordKey, node);
	if (isprimitive("KeywordMetrics")) {
		KeywordMetrics obj = getMetrics();
		node = converttoJson(&obj, "KeywordMetrics", "");
	}
	else {
		
		KeywordMetrics obj = static_cast<KeywordMetrics> (getMetrics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metricsKey = "metrics";
	json_object_set_member(pJsonObject, metricsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
KeywordMetricsResponse::getKeyword()
{
	return keyword;
}

void
KeywordMetricsResponse::setKeyword(std::string  keyword)
{
	this->keyword = keyword;
}

KeywordMetrics
KeywordMetricsResponse::getMetrics()
{
	return metrics;
}

void
KeywordMetricsResponse::setMetrics(KeywordMetrics  metrics)
{
	this->metrics = metrics;
}


