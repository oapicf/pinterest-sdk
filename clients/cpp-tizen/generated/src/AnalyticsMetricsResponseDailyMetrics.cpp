#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AnalyticsMetricsResponse_daily_metrics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AnalyticsMetricsResponse_daily_metrics::AnalyticsMetricsResponse_daily_metrics()
{
	//__init();
}

AnalyticsMetricsResponse_daily_metrics::~AnalyticsMetricsResponse_daily_metrics()
{
	//__cleanup();
}

void
AnalyticsMetricsResponse_daily_metrics::__init()
{
	//data_status = std::string();
	//date = std::string();
	//new std::map()std::map> metrics;
}

void
AnalyticsMetricsResponse_daily_metrics::__cleanup()
{
	//if(data_status != NULL) {
	//
	//delete data_status;
	//data_status = NULL;
	//}
	//if(date != NULL) {
	//
	//delete date;
	//date = NULL;
	//}
	//if(metrics != NULL) {
	//metrics.RemoveAll(true);
	//delete metrics;
	//metrics = NULL;
	//}
	//
}

void
AnalyticsMetricsResponse_daily_metrics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *data_statusKey = "data_status";
	node = json_object_get_member(pJsonObject, data_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&data_status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dateKey = "date";
	node = json_object_get_member(pJsonObject, dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *metricsKey = "metrics";
	node = json_object_get_member(pJsonObject, metricsKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			metrics = new_map;
		}
		
	}
}

AnalyticsMetricsResponse_daily_metrics::AnalyticsMetricsResponse_daily_metrics(char* json)
{
	this->fromJson(json);
}

char*
AnalyticsMetricsResponse_daily_metrics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDataStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *data_statusKey = "data_status";
	json_object_set_member(pJsonObject, data_statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dateKey = "date";
	json_object_set_member(pJsonObject, dateKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getMetrics());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
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
AnalyticsMetricsResponse_daily_metrics::getDataStatus()
{
	return data_status;
}

void
AnalyticsMetricsResponse_daily_metrics::setDataStatus(std::string  data_status)
{
	this->data_status = data_status;
}

std::string
AnalyticsMetricsResponse_daily_metrics::getDate()
{
	return date;
}

void
AnalyticsMetricsResponse_daily_metrics::setDate(std::string  date)
{
	this->date = date;
}

std::map<string, string>
AnalyticsMetricsResponse_daily_metrics::getMetrics()
{
	return metrics;
}

void
AnalyticsMetricsResponse_daily_metrics::setMetrics(std::map <string, string> metrics)
{
	this->metrics = metrics;
}


