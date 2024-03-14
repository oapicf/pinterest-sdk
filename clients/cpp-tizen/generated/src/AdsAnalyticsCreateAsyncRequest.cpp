#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsAnalyticsCreateAsyncRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsAnalyticsCreateAsyncRequest::AdsAnalyticsCreateAsyncRequest()
{
	//__init();
}

AdsAnalyticsCreateAsyncRequest::~AdsAnalyticsCreateAsyncRequest()
{
	//__cleanup();
}

void
AdsAnalyticsCreateAsyncRequest::__init()
{
	//start_date = std::string();
	//end_date = std::string();
	//granularity = std::string();
	//click_window_days = int(0);
	//engagement_window_days = int(0);
	//view_window_days = int(0);
	//conversion_report_time = std::string();
	//new std::list()std::list> attribution_types;
	//new std::list()std::list> campaign_ids;
	//new std::list()std::list> campaign_statuses;
	//new std::list()std::list> campaign_objective_types;
	//new std::list()std::list> ad_group_ids;
	//new std::list()std::list> ad_group_statuses;
	//new std::list()std::list> ad_ids;
	//new std::list()std::list> ad_statuses;
	//new std::list()std::list> product_group_ids;
	//new std::list()std::list> product_group_statuses;
	//new std::list()std::list> product_item_ids;
	//new std::list()std::list> targeting_types;
	//new std::list()std::list> metrics_filters;
	//new std::list()std::list> columns;
	//level = std::string();
	//report_format = std::string();
}

void
AdsAnalyticsCreateAsyncRequest::__cleanup()
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
	//if(campaign_ids != NULL) {
	//campaign_ids.RemoveAll(true);
	//delete campaign_ids;
	//campaign_ids = NULL;
	//}
	//if(campaign_statuses != NULL) {
	//campaign_statuses.RemoveAll(true);
	//delete campaign_statuses;
	//campaign_statuses = NULL;
	//}
	//if(campaign_objective_types != NULL) {
	//campaign_objective_types.RemoveAll(true);
	//delete campaign_objective_types;
	//campaign_objective_types = NULL;
	//}
	//if(ad_group_ids != NULL) {
	//ad_group_ids.RemoveAll(true);
	//delete ad_group_ids;
	//ad_group_ids = NULL;
	//}
	//if(ad_group_statuses != NULL) {
	//ad_group_statuses.RemoveAll(true);
	//delete ad_group_statuses;
	//ad_group_statuses = NULL;
	//}
	//if(ad_ids != NULL) {
	//ad_ids.RemoveAll(true);
	//delete ad_ids;
	//ad_ids = NULL;
	//}
	//if(ad_statuses != NULL) {
	//ad_statuses.RemoveAll(true);
	//delete ad_statuses;
	//ad_statuses = NULL;
	//}
	//if(product_group_ids != NULL) {
	//product_group_ids.RemoveAll(true);
	//delete product_group_ids;
	//product_group_ids = NULL;
	//}
	//if(product_group_statuses != NULL) {
	//product_group_statuses.RemoveAll(true);
	//delete product_group_statuses;
	//product_group_statuses = NULL;
	//}
	//if(product_item_ids != NULL) {
	//product_item_ids.RemoveAll(true);
	//delete product_item_ids;
	//product_item_ids = NULL;
	//}
	//if(targeting_types != NULL) {
	//targeting_types.RemoveAll(true);
	//delete targeting_types;
	//targeting_types = NULL;
	//}
	//if(metrics_filters != NULL) {
	//metrics_filters.RemoveAll(true);
	//delete metrics_filters;
	//metrics_filters = NULL;
	//}
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
AdsAnalyticsCreateAsyncRequest::fromJson(char* jsonStr)
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
			
			Granularity* obj = static_cast<Granularity*> (&granularity);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *click_window_daysKey = "click_window_days";
	node = json_object_get_member(pJsonObject, click_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionAttributionWindowDays")) {
			jsonToValue(&click_window_days, node, "ConversionAttributionWindowDays", "ConversionAttributionWindowDays");
		} else {
			
			ConversionAttributionWindowDays* obj = static_cast<ConversionAttributionWindowDays*> (&click_window_days);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *engagement_window_daysKey = "engagement_window_days";
	node = json_object_get_member(pJsonObject, engagement_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionAttributionWindowDays")) {
			jsonToValue(&engagement_window_days, node, "ConversionAttributionWindowDays", "ConversionAttributionWindowDays");
		} else {
			
			ConversionAttributionWindowDays* obj = static_cast<ConversionAttributionWindowDays*> (&engagement_window_days);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *view_window_daysKey = "view_window_days";
	node = json_object_get_member(pJsonObject, view_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionAttributionWindowDays")) {
			jsonToValue(&view_window_days, node, "ConversionAttributionWindowDays", "ConversionAttributionWindowDays");
		} else {
			
			ConversionAttributionWindowDays* obj = static_cast<ConversionAttributionWindowDays*> (&view_window_days);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *conversion_report_timeKey = "conversion_report_time";
	node = json_object_get_member(pJsonObject, conversion_report_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionReportTimeType")) {
			jsonToValue(&conversion_report_time, node, "ConversionReportTimeType", "ConversionReportTimeType");
		} else {
			
			ConversionReportTimeType* obj = static_cast<ConversionReportTimeType*> (&conversion_report_time);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *campaign_idsKey = "campaign_ids";
	node = json_object_get_member(pJsonObject, campaign_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			campaign_ids = new_list;
		}
		
	}
	const gchar *campaign_statusesKey = "campaign_statuses";
	node = json_object_get_member(pJsonObject, campaign_statusesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignSummaryStatus> new_list;
			CampaignSummaryStatus inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignSummaryStatus")) {
					jsonToValue(&inst, temp_json, "CampaignSummaryStatus", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			campaign_statuses = new_list;
		}
		
	}
	const gchar *campaign_objective_typesKey = "campaign_objective_types";
	node = json_object_get_member(pJsonObject, campaign_objective_typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ObjectiveType> new_list;
			ObjectiveType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ObjectiveType")) {
					jsonToValue(&inst, temp_json, "ObjectiveType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			campaign_objective_types = new_list;
		}
		
	}
	const gchar *ad_group_idsKey = "ad_group_ids";
	node = json_object_get_member(pJsonObject, ad_group_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			ad_group_ids = new_list;
		}
		
	}
	const gchar *ad_group_statusesKey = "ad_group_statuses";
	node = json_object_get_member(pJsonObject, ad_group_statusesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdGroupSummaryStatus> new_list;
			AdGroupSummaryStatus inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdGroupSummaryStatus")) {
					jsonToValue(&inst, temp_json, "AdGroupSummaryStatus", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			ad_group_statuses = new_list;
		}
		
	}
	const gchar *ad_idsKey = "ad_ids";
	node = json_object_get_member(pJsonObject, ad_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			ad_ids = new_list;
		}
		
	}
	const gchar *ad_statusesKey = "ad_statuses";
	node = json_object_get_member(pJsonObject, ad_statusesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PinPromotionSummaryStatus> new_list;
			PinPromotionSummaryStatus inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PinPromotionSummaryStatus")) {
					jsonToValue(&inst, temp_json, "PinPromotionSummaryStatus", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			ad_statuses = new_list;
		}
		
	}
	const gchar *product_group_idsKey = "product_group_ids";
	node = json_object_get_member(pJsonObject, product_group_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			product_group_ids = new_list;
		}
		
	}
	const gchar *product_group_statusesKey = "product_group_statuses";
	node = json_object_get_member(pJsonObject, product_group_statusesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ProductGroupSummaryStatus> new_list;
			ProductGroupSummaryStatus inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ProductGroupSummaryStatus")) {
					jsonToValue(&inst, temp_json, "ProductGroupSummaryStatus", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			product_group_statuses = new_list;
		}
		
	}
	const gchar *product_item_idsKey = "product_item_ids";
	node = json_object_get_member(pJsonObject, product_item_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			product_item_ids = new_list;
		}
		
	}
	const gchar *targeting_typesKey = "targeting_types";
	node = json_object_get_member(pJsonObject, targeting_typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdsAnalyticsTargetingType> new_list;
			AdsAnalyticsTargetingType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdsAnalyticsTargetingType")) {
					jsonToValue(&inst, temp_json, "AdsAnalyticsTargetingType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			targeting_types = new_list;
		}
		
	}
	const gchar *metrics_filtersKey = "metrics_filters";
	node = json_object_get_member(pJsonObject, metrics_filtersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdsAnalyticsMetricsFilter> new_list;
			AdsAnalyticsMetricsFilter inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdsAnalyticsMetricsFilter")) {
					jsonToValue(&inst, temp_json, "AdsAnalyticsMetricsFilter", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			metrics_filters = new_list;
		}
		
	}
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
			
			MetricsReportingLevel* obj = static_cast<MetricsReportingLevel*> (&level);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *report_formatKey = "report_format";
	node = json_object_get_member(pJsonObject, report_formatKey);
	if (node !=NULL) {
	

		if (isprimitive("DataOutputFormat")) {
			jsonToValue(&report_format, node, "DataOutputFormat", "DataOutputFormat");
		} else {
			
			DataOutputFormat* obj = static_cast<DataOutputFormat*> (&report_format);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdsAnalyticsCreateAsyncRequest::AdsAnalyticsCreateAsyncRequest(char* json)
{
	this->fromJson(json);
}

char*
AdsAnalyticsCreateAsyncRequest::toJson()
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
		
		Granularity obj = static_cast<Granularity> (getGranularity());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *granularityKey = "granularity";
	json_object_set_member(pJsonObject, granularityKey, node);
	if (isprimitive("ConversionAttributionWindowDays")) {
		ConversionAttributionWindowDays obj = getClickWindowDays();
		node = converttoJson(&obj, "ConversionAttributionWindowDays", "");
	}
	else {
		
		ConversionAttributionWindowDays obj = static_cast<ConversionAttributionWindowDays> (getClickWindowDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *click_window_daysKey = "click_window_days";
	json_object_set_member(pJsonObject, click_window_daysKey, node);
	if (isprimitive("ConversionAttributionWindowDays")) {
		ConversionAttributionWindowDays obj = getEngagementWindowDays();
		node = converttoJson(&obj, "ConversionAttributionWindowDays", "");
	}
	else {
		
		ConversionAttributionWindowDays obj = static_cast<ConversionAttributionWindowDays> (getEngagementWindowDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *engagement_window_daysKey = "engagement_window_days";
	json_object_set_member(pJsonObject, engagement_window_daysKey, node);
	if (isprimitive("ConversionAttributionWindowDays")) {
		ConversionAttributionWindowDays obj = getViewWindowDays();
		node = converttoJson(&obj, "ConversionAttributionWindowDays", "");
	}
	else {
		
		ConversionAttributionWindowDays obj = static_cast<ConversionAttributionWindowDays> (getViewWindowDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *view_window_daysKey = "view_window_days";
	json_object_set_member(pJsonObject, view_window_daysKey, node);
	if (isprimitive("ConversionReportTimeType")) {
		ConversionReportTimeType obj = getConversionReportTime();
		node = converttoJson(&obj, "ConversionReportTimeType", "");
	}
	else {
		
		ConversionReportTimeType obj = static_cast<ConversionReportTimeType> (getConversionReportTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCampaignIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCampaignIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *campaign_idsKey = "campaign_ids";
	json_object_set_member(pJsonObject, campaign_idsKey, node);
	if (isprimitive("CampaignSummaryStatus")) {
		list<CampaignSummaryStatus> new_list = static_cast<list <CampaignSummaryStatus> > (getCampaignStatuses());
		node = converttoJson(&new_list, "CampaignSummaryStatus", "array");
	} else {
		node = json_node_alloc();
		list<CampaignSummaryStatus> new_list = static_cast<list <CampaignSummaryStatus> > (getCampaignStatuses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignSummaryStatus>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignSummaryStatus obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *campaign_statusesKey = "campaign_statuses";
	json_object_set_member(pJsonObject, campaign_statusesKey, node);
	if (isprimitive("ObjectiveType")) {
		list<ObjectiveType> new_list = static_cast<list <ObjectiveType> > (getCampaignObjectiveTypes());
		node = converttoJson(&new_list, "ObjectiveType", "array");
	} else {
		node = json_node_alloc();
		list<ObjectiveType> new_list = static_cast<list <ObjectiveType> > (getCampaignObjectiveTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ObjectiveType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ObjectiveType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *campaign_objective_typesKey = "campaign_objective_types";
	json_object_set_member(pJsonObject, campaign_objective_typesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAdGroupIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdGroupIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ad_group_idsKey = "ad_group_ids";
	json_object_set_member(pJsonObject, ad_group_idsKey, node);
	if (isprimitive("AdGroupSummaryStatus")) {
		list<AdGroupSummaryStatus> new_list = static_cast<list <AdGroupSummaryStatus> > (getAdGroupStatuses());
		node = converttoJson(&new_list, "AdGroupSummaryStatus", "array");
	} else {
		node = json_node_alloc();
		list<AdGroupSummaryStatus> new_list = static_cast<list <AdGroupSummaryStatus> > (getAdGroupStatuses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdGroupSummaryStatus>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdGroupSummaryStatus obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *ad_group_statusesKey = "ad_group_statuses";
	json_object_set_member(pJsonObject, ad_group_statusesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAdIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ad_idsKey = "ad_ids";
	json_object_set_member(pJsonObject, ad_idsKey, node);
	if (isprimitive("PinPromotionSummaryStatus")) {
		list<PinPromotionSummaryStatus> new_list = static_cast<list <PinPromotionSummaryStatus> > (getAdStatuses());
		node = converttoJson(&new_list, "PinPromotionSummaryStatus", "array");
	} else {
		node = json_node_alloc();
		list<PinPromotionSummaryStatus> new_list = static_cast<list <PinPromotionSummaryStatus> > (getAdStatuses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PinPromotionSummaryStatus>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PinPromotionSummaryStatus obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *ad_statusesKey = "ad_statuses";
	json_object_set_member(pJsonObject, ad_statusesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getProductGroupIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getProductGroupIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *product_group_idsKey = "product_group_ids";
	json_object_set_member(pJsonObject, product_group_idsKey, node);
	if (isprimitive("ProductGroupSummaryStatus")) {
		list<ProductGroupSummaryStatus> new_list = static_cast<list <ProductGroupSummaryStatus> > (getProductGroupStatuses());
		node = converttoJson(&new_list, "ProductGroupSummaryStatus", "array");
	} else {
		node = json_node_alloc();
		list<ProductGroupSummaryStatus> new_list = static_cast<list <ProductGroupSummaryStatus> > (getProductGroupStatuses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ProductGroupSummaryStatus>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ProductGroupSummaryStatus obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *product_group_statusesKey = "product_group_statuses";
	json_object_set_member(pJsonObject, product_group_statusesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getProductItemIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getProductItemIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *product_item_idsKey = "product_item_ids";
	json_object_set_member(pJsonObject, product_item_idsKey, node);
	if (isprimitive("AdsAnalyticsTargetingType")) {
		list<AdsAnalyticsTargetingType> new_list = static_cast<list <AdsAnalyticsTargetingType> > (getTargetingTypes());
		node = converttoJson(&new_list, "AdsAnalyticsTargetingType", "array");
	} else {
		node = json_node_alloc();
		list<AdsAnalyticsTargetingType> new_list = static_cast<list <AdsAnalyticsTargetingType> > (getTargetingTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdsAnalyticsTargetingType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdsAnalyticsTargetingType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *targeting_typesKey = "targeting_types";
	json_object_set_member(pJsonObject, targeting_typesKey, node);
	if (isprimitive("AdsAnalyticsMetricsFilter")) {
		list<AdsAnalyticsMetricsFilter> new_list = static_cast<list <AdsAnalyticsMetricsFilter> > (getMetricsFilters());
		node = converttoJson(&new_list, "AdsAnalyticsMetricsFilter", "array");
	} else {
		node = json_node_alloc();
		list<AdsAnalyticsMetricsFilter> new_list = static_cast<list <AdsAnalyticsMetricsFilter> > (getMetricsFilters());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdsAnalyticsMetricsFilter>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdsAnalyticsMetricsFilter obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *metrics_filtersKey = "metrics_filters";
	json_object_set_member(pJsonObject, metrics_filtersKey, node);
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
		
		MetricsReportingLevel obj = static_cast<MetricsReportingLevel> (getLevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *levelKey = "level";
	json_object_set_member(pJsonObject, levelKey, node);
	if (isprimitive("DataOutputFormat")) {
		DataOutputFormat obj = getReportFormat();
		node = converttoJson(&obj, "DataOutputFormat", "");
	}
	else {
		
		DataOutputFormat obj = static_cast<DataOutputFormat> (getReportFormat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

std::string
AdsAnalyticsCreateAsyncRequest::getStartDate()
{
	return start_date;
}

void
AdsAnalyticsCreateAsyncRequest::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

std::string
AdsAnalyticsCreateAsyncRequest::getEndDate()
{
	return end_date;
}

void
AdsAnalyticsCreateAsyncRequest::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

Granularity
AdsAnalyticsCreateAsyncRequest::getGranularity()
{
	return granularity;
}

void
AdsAnalyticsCreateAsyncRequest::setGranularity(Granularity  granularity)
{
	this->granularity = granularity;
}

ConversionAttributionWindowDays
AdsAnalyticsCreateAsyncRequest::getClickWindowDays()
{
	return click_window_days;
}

void
AdsAnalyticsCreateAsyncRequest::setClickWindowDays(ConversionAttributionWindowDays  click_window_days)
{
	this->click_window_days = click_window_days;
}

ConversionAttributionWindowDays
AdsAnalyticsCreateAsyncRequest::getEngagementWindowDays()
{
	return engagement_window_days;
}

void
AdsAnalyticsCreateAsyncRequest::setEngagementWindowDays(ConversionAttributionWindowDays  engagement_window_days)
{
	this->engagement_window_days = engagement_window_days;
}

ConversionAttributionWindowDays
AdsAnalyticsCreateAsyncRequest::getViewWindowDays()
{
	return view_window_days;
}

void
AdsAnalyticsCreateAsyncRequest::setViewWindowDays(ConversionAttributionWindowDays  view_window_days)
{
	this->view_window_days = view_window_days;
}

ConversionReportTimeType
AdsAnalyticsCreateAsyncRequest::getConversionReportTime()
{
	return conversion_report_time;
}

void
AdsAnalyticsCreateAsyncRequest::setConversionReportTime(ConversionReportTimeType  conversion_report_time)
{
	this->conversion_report_time = conversion_report_time;
}

std::list<ConversionReportAttributionType>
AdsAnalyticsCreateAsyncRequest::getAttributionTypes()
{
	return attribution_types;
}

void
AdsAnalyticsCreateAsyncRequest::setAttributionTypes(std::list <ConversionReportAttributionType> attribution_types)
{
	this->attribution_types = attribution_types;
}

std::list<std::string>
AdsAnalyticsCreateAsyncRequest::getCampaignIds()
{
	return campaign_ids;
}

void
AdsAnalyticsCreateAsyncRequest::setCampaignIds(std::list <std::string> campaign_ids)
{
	this->campaign_ids = campaign_ids;
}

std::list<CampaignSummaryStatus>
AdsAnalyticsCreateAsyncRequest::getCampaignStatuses()
{
	return campaign_statuses;
}

void
AdsAnalyticsCreateAsyncRequest::setCampaignStatuses(std::list <CampaignSummaryStatus> campaign_statuses)
{
	this->campaign_statuses = campaign_statuses;
}

std::list<ObjectiveType>
AdsAnalyticsCreateAsyncRequest::getCampaignObjectiveTypes()
{
	return campaign_objective_types;
}

void
AdsAnalyticsCreateAsyncRequest::setCampaignObjectiveTypes(std::list <ObjectiveType> campaign_objective_types)
{
	this->campaign_objective_types = campaign_objective_types;
}

std::list<std::string>
AdsAnalyticsCreateAsyncRequest::getAdGroupIds()
{
	return ad_group_ids;
}

void
AdsAnalyticsCreateAsyncRequest::setAdGroupIds(std::list <std::string> ad_group_ids)
{
	this->ad_group_ids = ad_group_ids;
}

std::list<AdGroupSummaryStatus>
AdsAnalyticsCreateAsyncRequest::getAdGroupStatuses()
{
	return ad_group_statuses;
}

void
AdsAnalyticsCreateAsyncRequest::setAdGroupStatuses(std::list <AdGroupSummaryStatus> ad_group_statuses)
{
	this->ad_group_statuses = ad_group_statuses;
}

std::list<std::string>
AdsAnalyticsCreateAsyncRequest::getAdIds()
{
	return ad_ids;
}

void
AdsAnalyticsCreateAsyncRequest::setAdIds(std::list <std::string> ad_ids)
{
	this->ad_ids = ad_ids;
}

std::list<PinPromotionSummaryStatus>
AdsAnalyticsCreateAsyncRequest::getAdStatuses()
{
	return ad_statuses;
}

void
AdsAnalyticsCreateAsyncRequest::setAdStatuses(std::list <PinPromotionSummaryStatus> ad_statuses)
{
	this->ad_statuses = ad_statuses;
}

std::list<std::string>
AdsAnalyticsCreateAsyncRequest::getProductGroupIds()
{
	return product_group_ids;
}

void
AdsAnalyticsCreateAsyncRequest::setProductGroupIds(std::list <std::string> product_group_ids)
{
	this->product_group_ids = product_group_ids;
}

std::list<ProductGroupSummaryStatus>
AdsAnalyticsCreateAsyncRequest::getProductGroupStatuses()
{
	return product_group_statuses;
}

void
AdsAnalyticsCreateAsyncRequest::setProductGroupStatuses(std::list <ProductGroupSummaryStatus> product_group_statuses)
{
	this->product_group_statuses = product_group_statuses;
}

std::list<std::string>
AdsAnalyticsCreateAsyncRequest::getProductItemIds()
{
	return product_item_ids;
}

void
AdsAnalyticsCreateAsyncRequest::setProductItemIds(std::list <std::string> product_item_ids)
{
	this->product_item_ids = product_item_ids;
}

std::list<AdsAnalyticsTargetingType>
AdsAnalyticsCreateAsyncRequest::getTargetingTypes()
{
	return targeting_types;
}

void
AdsAnalyticsCreateAsyncRequest::setTargetingTypes(std::list <AdsAnalyticsTargetingType> targeting_types)
{
	this->targeting_types = targeting_types;
}

std::list<AdsAnalyticsMetricsFilter>
AdsAnalyticsCreateAsyncRequest::getMetricsFilters()
{
	return metrics_filters;
}

void
AdsAnalyticsCreateAsyncRequest::setMetricsFilters(std::list <AdsAnalyticsMetricsFilter> metrics_filters)
{
	this->metrics_filters = metrics_filters;
}

std::list<ReportingColumnAsync>
AdsAnalyticsCreateAsyncRequest::getColumns()
{
	return columns;
}

void
AdsAnalyticsCreateAsyncRequest::setColumns(std::list <ReportingColumnAsync> columns)
{
	this->columns = columns;
}

MetricsReportingLevel
AdsAnalyticsCreateAsyncRequest::getLevel()
{
	return level;
}

void
AdsAnalyticsCreateAsyncRequest::setLevel(MetricsReportingLevel  level)
{
	this->level = level;
}

DataOutputFormat
AdsAnalyticsCreateAsyncRequest::getReportFormat()
{
	return report_format;
}

void
AdsAnalyticsCreateAsyncRequest::setReportFormat(DataOutputFormat  report_format)
{
	this->report_format = report_format;
}


