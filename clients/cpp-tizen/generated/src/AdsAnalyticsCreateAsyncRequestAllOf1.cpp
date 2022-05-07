#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsAnalyticsCreateAsyncRequest_allOf_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsAnalyticsCreateAsyncRequest_allOf_1::AdsAnalyticsCreateAsyncRequest_allOf_1()
{
	//__init();
}

AdsAnalyticsCreateAsyncRequest_allOf_1::~AdsAnalyticsCreateAsyncRequest_allOf_1()
{
	//__cleanup();
}

void
AdsAnalyticsCreateAsyncRequest_allOf_1::__init()
{
	//new std::list()std::list> columns;
	//level = std::string();
	//report_format = std::string();
}

void
AdsAnalyticsCreateAsyncRequest_allOf_1::__cleanup()
{
	//if(columns != NULL) {
	//columns.RemoveAll(true);
	//delete columns;
	//columns = NULL;
	//}
	//if(level != NULL) {
	//
	//delete level;
	//level = NULL;
	//}
	//if(report_format != NULL) {
	//
	//delete report_format;
	//report_format = NULL;
	//}
	//
}

void
AdsAnalyticsCreateAsyncRequest_allOf_1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *columnsKey = "columns";
	node = json_object_get_member(pJsonObject, columnsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ReportingColumnAsync> new_list;
			ReportingColumnAsync inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ReportingColumnAsync")) {
					jsonToValue(&inst, temp_json, "ReportingColumnAsync", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			columns = new_list;
		}
		
	}
	const gchar *levelKey = "level";
	node = json_object_get_member(pJsonObject, levelKey);
	if (node !=NULL) {
	

		if (isprimitive("MetricsReportingLevel")) {
			jsonToValue(&level, node, "MetricsReportingLevel", "MetricsReportingLevel");
		} else {
			
		}
	}
	const gchar *report_formatKey = "report_format";
	node = json_object_get_member(pJsonObject, report_formatKey);
	if (node !=NULL) {
	

		if (isprimitive("DataOutputFormat")) {
			jsonToValue(&report_format, node, "DataOutputFormat", "DataOutputFormat");
		} else {
			
		}
	}
}

AdsAnalyticsCreateAsyncRequest_allOf_1::AdsAnalyticsCreateAsyncRequest_allOf_1(char* json)
{
	this->fromJson(json);
}

char*
AdsAnalyticsCreateAsyncRequest_allOf_1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ReportingColumnAsync")) {
		list<ReportingColumnAsync> new_list = static_cast<list <ReportingColumnAsync> > (getColumns());
		node = converttoJson(&new_list, "ReportingColumnAsync", "array");
	} else {
		node = json_node_alloc();
		list<ReportingColumnAsync> new_list = static_cast<list <ReportingColumnAsync> > (getColumns());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ReportingColumnAsync>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ReportingColumnAsync obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *columnsKey = "columns";
	json_object_set_member(pJsonObject, columnsKey, node);
	if (isprimitive("MetricsReportingLevel")) {
		MetricsReportingLevel obj = getLevel();
		node = converttoJson(&obj, "MetricsReportingLevel", "");
	}
	else {
		
	}
	const gchar *levelKey = "level";
	json_object_set_member(pJsonObject, levelKey, node);
	if (isprimitive("DataOutputFormat")) {
		DataOutputFormat obj = getReportFormat();
		node = converttoJson(&obj, "DataOutputFormat", "");
	}
	else {
		
	}
	const gchar *report_formatKey = "report_format";
	json_object_set_member(pJsonObject, report_formatKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<ReportingColumnAsync>
AdsAnalyticsCreateAsyncRequest_allOf_1::getColumns()
{
	return columns;
}

void
AdsAnalyticsCreateAsyncRequest_allOf_1::setColumns(std::list <ReportingColumnAsync> columns)
{
	this->columns = columns;
}

MetricsReportingLevel
AdsAnalyticsCreateAsyncRequest_allOf_1::getLevel()
{
	return level;
}

void
AdsAnalyticsCreateAsyncRequest_allOf_1::setLevel(MetricsReportingLevel  level)
{
	this->level = level;
}

DataOutputFormat
AdsAnalyticsCreateAsyncRequest_allOf_1::getReportFormat()
{
	return report_format;
}

void
AdsAnalyticsCreateAsyncRequest_allOf_1::setReportFormat(DataOutputFormat  report_format)
{
	this->report_format = report_format;
}


