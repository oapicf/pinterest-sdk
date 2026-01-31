#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionProductReportRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionProductReportRequest::ConversionProductReportRequest()
{
	//__init();
}

ConversionProductReportRequest::~ConversionProductReportRequest()
{
	//__cleanup();
}

void
ConversionProductReportRequest::__init()
{
	//new std::list()std::list> ad_group_ids;
	//new std::list()std::list> campaign_ids;
	//new std::list()std::list> campaign_objective_types;
	//click_window_days = int(0);
	//new std::list()std::list> columns;
	//conversion_product_attribution_type = std::string();
	//conversion_product_breakdown = std::string();
	//conversion_report_time = std::string();
	//end_date = std::string();
	//granularity = std::string();
	//level = std::string();
	//new std::list()std::list> product_sku_ids;
	//report_name = std::string();
	//start_date = std::string();
	//view_window_days = int(0);
}

void
ConversionProductReportRequest::__cleanup()
{
	//if(ad_group_ids != NULL) {
	//ad_group_ids.RemoveAll(true);
	//delete ad_group_ids;
	//ad_group_ids = NULL;
	//}
	//if(campaign_ids != NULL) {
	//campaign_ids.RemoveAll(true);
	//delete campaign_ids;
	//campaign_ids = NULL;
	//}
	//if(campaign_objective_types != NULL) {
	//campaign_objective_types.RemoveAll(true);
	//delete campaign_objective_types;
	//campaign_objective_types = NULL;
	//}
	//if(click_window_days != NULL) {
	//
	//delete click_window_days;
	//click_window_days = NULL;
	//}
	//if(columns != NULL) {
	//columns.RemoveAll(true);
	//delete columns;
	//columns = NULL;
	//}
	//if(conversion_product_attribution_type != NULL) {
	//
	//delete conversion_product_attribution_type;
	//conversion_product_attribution_type = NULL;
	//}
	//if(conversion_product_breakdown != NULL) {
	//
	//delete conversion_product_breakdown;
	//conversion_product_breakdown = NULL;
	//}
	//if(conversion_report_time != NULL) {
	//
	//delete conversion_report_time;
	//conversion_report_time = NULL;
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
	//if(level != NULL) {
	//
	//delete level;
	//level = NULL;
	//}
	//if(product_sku_ids != NULL) {
	//product_sku_ids.RemoveAll(true);
	//delete product_sku_ids;
	//product_sku_ids = NULL;
	//}
	//if(report_name != NULL) {
	//
	//delete report_name;
	//report_name = NULL;
	//}
	//if(start_date != NULL) {
	//
	//delete start_date;
	//start_date = NULL;
	//}
	//if(view_window_days != NULL) {
	//
	//delete view_window_days;
	//view_window_days = NULL;
	//}
	//
}

void
ConversionProductReportRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *columnsKey = "columns";
	node = json_object_get_member(pJsonObject, columnsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ConversionProductReportingColumn> new_list;
			ConversionProductReportingColumn inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ConversionProductReportingColumn")) {
					jsonToValue(&inst, temp_json, "ConversionProductReportingColumn", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			columns = new_list;
		}
		
	}
	const gchar *conversion_product_attribution_typeKey = "conversion_product_attribution_type";
	node = json_object_get_member(pJsonObject, conversion_product_attribution_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&conversion_product_attribution_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *conversion_product_breakdownKey = "conversion_product_breakdown";
	node = json_object_get_member(pJsonObject, conversion_product_breakdownKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&conversion_product_breakdown, node, "std::string", "");
		} else {
			
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
	

		if (isprimitive("std::string")) {
			jsonToValue(&granularity, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *levelKey = "level";
	node = json_object_get_member(pJsonObject, levelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&level, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *product_sku_idsKey = "product_sku_ids";
	node = json_object_get_member(pJsonObject, product_sku_idsKey);
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
			product_sku_ids = new_list;
		}
		
	}
	const gchar *report_nameKey = "report_name";
	node = json_object_get_member(pJsonObject, report_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&report_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *start_dateKey = "start_date";
	node = json_object_get_member(pJsonObject, start_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&start_date, node, "std::string", "");
		} else {
			
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
}

ConversionProductReportRequest::ConversionProductReportRequest(char* json)
{
	this->fromJson(json);
}

char*
ConversionProductReportRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("ConversionProductReportingColumn")) {
		list<ConversionProductReportingColumn> new_list = static_cast<list <ConversionProductReportingColumn> > (getColumns());
		node = converttoJson(&new_list, "ConversionProductReportingColumn", "array");
	} else {
		node = json_node_alloc();
		list<ConversionProductReportingColumn> new_list = static_cast<list <ConversionProductReportingColumn> > (getColumns());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ConversionProductReportingColumn>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ConversionProductReportingColumn obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *columnsKey = "columns";
	json_object_set_member(pJsonObject, columnsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConversionProductAttributionType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *conversion_product_attribution_typeKey = "conversion_product_attribution_type";
	json_object_set_member(pJsonObject, conversion_product_attribution_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConversionProductBreakdown();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *conversion_product_breakdownKey = "conversion_product_breakdown";
	json_object_set_member(pJsonObject, conversion_product_breakdownKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getEndDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *end_dateKey = "end_date";
	json_object_set_member(pJsonObject, end_dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getGranularity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *granularityKey = "granularity";
	json_object_set_member(pJsonObject, granularityKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLevel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *levelKey = "level";
	json_object_set_member(pJsonObject, levelKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getProductSkuIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getProductSkuIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *product_sku_idsKey = "product_sku_ids";
	json_object_set_member(pJsonObject, product_sku_idsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getReportName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *report_nameKey = "report_name";
	json_object_set_member(pJsonObject, report_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *start_dateKey = "start_date";
	json_object_set_member(pJsonObject, start_dateKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
ConversionProductReportRequest::getAdGroupIds()
{
	return ad_group_ids;
}

void
ConversionProductReportRequest::setAdGroupIds(std::list <std::string> ad_group_ids)
{
	this->ad_group_ids = ad_group_ids;
}

std::list<std::string>
ConversionProductReportRequest::getCampaignIds()
{
	return campaign_ids;
}

void
ConversionProductReportRequest::setCampaignIds(std::list <std::string> campaign_ids)
{
	this->campaign_ids = campaign_ids;
}

std::list<ObjectiveType>
ConversionProductReportRequest::getCampaignObjectiveTypes()
{
	return campaign_objective_types;
}

void
ConversionProductReportRequest::setCampaignObjectiveTypes(std::list <ObjectiveType> campaign_objective_types)
{
	this->campaign_objective_types = campaign_objective_types;
}

ConversionAttributionWindowDays
ConversionProductReportRequest::getClickWindowDays()
{
	return click_window_days;
}

void
ConversionProductReportRequest::setClickWindowDays(ConversionAttributionWindowDays  click_window_days)
{
	this->click_window_days = click_window_days;
}

std::list<ConversionProductReportingColumn>
ConversionProductReportRequest::getColumns()
{
	return columns;
}

void
ConversionProductReportRequest::setColumns(std::list <ConversionProductReportingColumn> columns)
{
	this->columns = columns;
}

std::string
ConversionProductReportRequest::getConversionProductAttributionType()
{
	return conversion_product_attribution_type;
}

void
ConversionProductReportRequest::setConversionProductAttributionType(std::string  conversion_product_attribution_type)
{
	this->conversion_product_attribution_type = conversion_product_attribution_type;
}

std::string
ConversionProductReportRequest::getConversionProductBreakdown()
{
	return conversion_product_breakdown;
}

void
ConversionProductReportRequest::setConversionProductBreakdown(std::string  conversion_product_breakdown)
{
	this->conversion_product_breakdown = conversion_product_breakdown;
}

ConversionReportTimeType
ConversionProductReportRequest::getConversionReportTime()
{
	return conversion_report_time;
}

void
ConversionProductReportRequest::setConversionReportTime(ConversionReportTimeType  conversion_report_time)
{
	this->conversion_report_time = conversion_report_time;
}

std::string
ConversionProductReportRequest::getEndDate()
{
	return end_date;
}

void
ConversionProductReportRequest::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

std::string
ConversionProductReportRequest::getGranularity()
{
	return granularity;
}

void
ConversionProductReportRequest::setGranularity(std::string  granularity)
{
	this->granularity = granularity;
}

std::string
ConversionProductReportRequest::getLevel()
{
	return level;
}

void
ConversionProductReportRequest::setLevel(std::string  level)
{
	this->level = level;
}

std::list<std::string>
ConversionProductReportRequest::getProductSkuIds()
{
	return product_sku_ids;
}

void
ConversionProductReportRequest::setProductSkuIds(std::list <std::string> product_sku_ids)
{
	this->product_sku_ids = product_sku_ids;
}

std::string
ConversionProductReportRequest::getReportName()
{
	return report_name;
}

void
ConversionProductReportRequest::setReportName(std::string  report_name)
{
	this->report_name = report_name;
}

std::string
ConversionProductReportRequest::getStartDate()
{
	return start_date;
}

void
ConversionProductReportRequest::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

ConversionAttributionWindowDays
ConversionProductReportRequest::getViewWindowDays()
{
	return view_window_days;
}

void
ConversionProductReportRequest::setViewWindowDays(ConversionAttributionWindowDays  view_window_days)
{
	this->view_window_days = view_window_days;
}


