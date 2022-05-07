#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsAnalyticsCreateAsyncRequest_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsAnalyticsCreateAsyncRequest_allOf::AdsAnalyticsCreateAsyncRequest_allOf()
{
	//__init();
}

AdsAnalyticsCreateAsyncRequest_allOf::~AdsAnalyticsCreateAsyncRequest_allOf()
{
	//__cleanup();
}

void
AdsAnalyticsCreateAsyncRequest_allOf::__init()
{
	//start_date = std::string();
	//end_date = std::string();
	//granularity = std::string();
	//click_window_days = int(0);
	//engagement_window_days = int(0);
	//view_window_days = int(0);
	//conversion_report_time = std::string();
	//new std::list()std::list> attribution_types;
}

void
AdsAnalyticsCreateAsyncRequest_allOf::__cleanup()
{
	//if(start_date != NULL) {
	//
	//delete start_date;
	//start_date = NULL;
	//}
	//if(end_date != NULL) {
	//
	//delete end_date;
	//end_date = NULL;
	//}
	//if(granularity != NULL) {
	//
	//delete granularity;
	//granularity = NULL;
	//}
	//if(click_window_days != NULL) {
	//
	//delete click_window_days;
	//click_window_days = NULL;
	//}
	//if(engagement_window_days != NULL) {
	//
	//delete engagement_window_days;
	//engagement_window_days = NULL;
	//}
	//if(view_window_days != NULL) {
	//
	//delete view_window_days;
	//view_window_days = NULL;
	//}
	//if(conversion_report_time != NULL) {
	//
	//delete conversion_report_time;
	//conversion_report_time = NULL;
	//}
	//if(attribution_types != NULL) {
	//attribution_types.RemoveAll(true);
	//delete attribution_types;
	//attribution_types = NULL;
	//}
	//
}

void
AdsAnalyticsCreateAsyncRequest_allOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *start_dateKey = "start_date";
	node = json_object_get_member(pJsonObject, start_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&start_date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *end_dateKey = "end_date";
	node = json_object_get_member(pJsonObject, end_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&end_date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *granularityKey = "granularity";
	node = json_object_get_member(pJsonObject, granularityKey);
	if (node !=NULL) {
	

		if (isprimitive("Granularity")) {
			jsonToValue(&granularity, node, "Granularity", "Granularity");
		} else {
			
		}
	}
	const gchar *click_window_daysKey = "click_window_days";
	node = json_object_get_member(pJsonObject, click_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionAttributionWindowDays")) {
			jsonToValue(&click_window_days, node, "ConversionAttributionWindowDays", "ConversionAttributionWindowDays");
		} else {
			
		}
	}
	const gchar *engagement_window_daysKey = "engagement_window_days";
	node = json_object_get_member(pJsonObject, engagement_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionAttributionWindowDays")) {
			jsonToValue(&engagement_window_days, node, "ConversionAttributionWindowDays", "ConversionAttributionWindowDays");
		} else {
			
		}
	}
	const gchar *view_window_daysKey = "view_window_days";
	node = json_object_get_member(pJsonObject, view_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionAttributionWindowDays")) {
			jsonToValue(&view_window_days, node, "ConversionAttributionWindowDays", "ConversionAttributionWindowDays");
		} else {
			
		}
	}
	const gchar *conversion_report_timeKey = "conversion_report_time";
	node = json_object_get_member(pJsonObject, conversion_report_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionReportTimeType")) {
			jsonToValue(&conversion_report_time, node, "ConversionReportTimeType", "ConversionReportTimeType");
		} else {
			
		}
	}
	const gchar *attribution_typesKey = "attribution_types";
	node = json_object_get_member(pJsonObject, attribution_typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ConversionReportAttributionType> new_list;
			ConversionReportAttributionType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ConversionReportAttributionType")) {
					jsonToValue(&inst, temp_json, "ConversionReportAttributionType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			attribution_types = new_list;
		}
		
	}
}

AdsAnalyticsCreateAsyncRequest_allOf::AdsAnalyticsCreateAsyncRequest_allOf(char* json)
{
	this->fromJson(json);
}

char*
AdsAnalyticsCreateAsyncRequest_allOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getStartDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *start_dateKey = "start_date";
	json_object_set_member(pJsonObject, start_dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEndDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *end_dateKey = "end_date";
	json_object_set_member(pJsonObject, end_dateKey, node);
	if (isprimitive("Granularity")) {
		Granularity obj = getGranularity();
		node = converttoJson(&obj, "Granularity", "");
	}
	else {
		
	}
	const gchar *granularityKey = "granularity";
	json_object_set_member(pJsonObject, granularityKey, node);
	if (isprimitive("ConversionAttributionWindowDays")) {
		ConversionAttributionWindowDays obj = getClickWindowDays();
		node = converttoJson(&obj, "ConversionAttributionWindowDays", "");
	}
	else {
		
	}
	const gchar *click_window_daysKey = "click_window_days";
	json_object_set_member(pJsonObject, click_window_daysKey, node);
	if (isprimitive("ConversionAttributionWindowDays")) {
		ConversionAttributionWindowDays obj = getEngagementWindowDays();
		node = converttoJson(&obj, "ConversionAttributionWindowDays", "");
	}
	else {
		
	}
	const gchar *engagement_window_daysKey = "engagement_window_days";
	json_object_set_member(pJsonObject, engagement_window_daysKey, node);
	if (isprimitive("ConversionAttributionWindowDays")) {
		ConversionAttributionWindowDays obj = getViewWindowDays();
		node = converttoJson(&obj, "ConversionAttributionWindowDays", "");
	}
	else {
		
	}
	const gchar *view_window_daysKey = "view_window_days";
	json_object_set_member(pJsonObject, view_window_daysKey, node);
	if (isprimitive("ConversionReportTimeType")) {
		ConversionReportTimeType obj = getConversionReportTime();
		node = converttoJson(&obj, "ConversionReportTimeType", "");
	}
	else {
		
	}
	const gchar *conversion_report_timeKey = "conversion_report_time";
	json_object_set_member(pJsonObject, conversion_report_timeKey, node);
	if (isprimitive("ConversionReportAttributionType")) {
		list<ConversionReportAttributionType> new_list = static_cast<list <ConversionReportAttributionType> > (getAttributionTypes());
		node = converttoJson(&new_list, "ConversionReportAttributionType", "array");
	} else {
		node = json_node_alloc();
		list<ConversionReportAttributionType> new_list = static_cast<list <ConversionReportAttributionType> > (getAttributionTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ConversionReportAttributionType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ConversionReportAttributionType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *attribution_typesKey = "attribution_types";
	json_object_set_member(pJsonObject, attribution_typesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdsAnalyticsCreateAsyncRequest_allOf::getStartDate()
{
	return start_date;
}

void
AdsAnalyticsCreateAsyncRequest_allOf::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

std::string
AdsAnalyticsCreateAsyncRequest_allOf::getEndDate()
{
	return end_date;
}

void
AdsAnalyticsCreateAsyncRequest_allOf::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

Granularity
AdsAnalyticsCreateAsyncRequest_allOf::getGranularity()
{
	return granularity;
}

void
AdsAnalyticsCreateAsyncRequest_allOf::setGranularity(Granularity  granularity)
{
	this->granularity = granularity;
}

ConversionAttributionWindowDays
AdsAnalyticsCreateAsyncRequest_allOf::getClickWindowDays()
{
	return click_window_days;
}

void
AdsAnalyticsCreateAsyncRequest_allOf::setClickWindowDays(ConversionAttributionWindowDays  click_window_days)
{
	this->click_window_days = click_window_days;
}

ConversionAttributionWindowDays
AdsAnalyticsCreateAsyncRequest_allOf::getEngagementWindowDays()
{
	return engagement_window_days;
}

void
AdsAnalyticsCreateAsyncRequest_allOf::setEngagementWindowDays(ConversionAttributionWindowDays  engagement_window_days)
{
	this->engagement_window_days = engagement_window_days;
}

ConversionAttributionWindowDays
AdsAnalyticsCreateAsyncRequest_allOf::getViewWindowDays()
{
	return view_window_days;
}

void
AdsAnalyticsCreateAsyncRequest_allOf::setViewWindowDays(ConversionAttributionWindowDays  view_window_days)
{
	this->view_window_days = view_window_days;
}

ConversionReportTimeType
AdsAnalyticsCreateAsyncRequest_allOf::getConversionReportTime()
{
	return conversion_report_time;
}

void
AdsAnalyticsCreateAsyncRequest_allOf::setConversionReportTime(ConversionReportTimeType  conversion_report_time)
{
	this->conversion_report_time = conversion_report_time;
}

std::list<ConversionReportAttributionType>
AdsAnalyticsCreateAsyncRequest_allOf::getAttributionTypes()
{
	return attribution_types;
}

void
AdsAnalyticsCreateAsyncRequest_allOf::setAttributionTypes(std::list <ConversionReportAttributionType> attribution_types)
{
	this->attribution_types = attribution_types;
}


