#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinAnalyticsMetricsResponse_daily_metrics_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinAnalyticsMetricsResponse_daily_metrics_inner::PinAnalyticsMetricsResponse_daily_metrics_inner()
{
	//__init();
}

PinAnalyticsMetricsResponse_daily_metrics_inner::~PinAnalyticsMetricsResponse_daily_metrics_inner()
{
	//__cleanup();
}

void
PinAnalyticsMetricsResponse_daily_metrics_inner::__init()
{
	//data_status = new DataStatus();
	//date = std::string();
	//new std::map()std::map> metrics;
}

void
PinAnalyticsMetricsResponse_daily_metrics_inner::__cleanup()
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
PinAnalyticsMetricsResponse_daily_metrics_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *data_statusKey = "data_status";
	node = json_object_get_member(pJsonObject, data_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("DataStatus")) {
			jsonToValue(&data_status, node, "DataStatus", "DataStatus");
		} else {
			
			DataStatus* obj = static_cast<DataStatus*> (&data_status);
			obj->fromJson(json_to_string(node, false));
			
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

PinAnalyticsMetricsResponse_daily_metrics_inner::PinAnalyticsMetricsResponse_daily_metrics_inner(char* json)
{
	this->fromJson(json);
}

char*
PinAnalyticsMetricsResponse_daily_metrics_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DataStatus")) {
		DataStatus obj = getDataStatus();
		node = converttoJson(&obj, "DataStatus", "");
	}
	else {
		
		DataStatus obj = static_cast<DataStatus> (getDataStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

DataStatus
PinAnalyticsMetricsResponse_daily_metrics_inner::getDataStatus()
{
	return data_status;
}

void
PinAnalyticsMetricsResponse_daily_metrics_inner::setDataStatus(DataStatus  data_status)
{
	this->data_status = data_status;
}

std::string
PinAnalyticsMetricsResponse_daily_metrics_inner::getDate()
{
	return date;
}

void
PinAnalyticsMetricsResponse_daily_metrics_inner::setDate(std::string  date)
{
	this->date = date;
}

std::map<string, string>
PinAnalyticsMetricsResponse_daily_metrics_inner::getMetrics()
{
	return metrics;
}

void
PinAnalyticsMetricsResponse_daily_metrics_inner::setMetrics(std::map <string, string> metrics)
{
	this->metrics = metrics;
}


