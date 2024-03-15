#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TemplateResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TemplateResponse::TemplateResponse()
{
	//__init();
}

TemplateResponse::~TemplateResponse()
{
	//__cleanup();
}

void
TemplateResponse::__init()
{
	//id = std::string();
	//ad_account_id = std::string();
	//new std::list()std::list> ad_account_ids;
	//user_id = std::string();
	//name = std::string();
	//report_start_relative_days_in_past = double(0);
	//report_end_relative_days_in_past = double(0);
	//date_range = new TemplateResponse_date_range();
	//report_level = new MetricsReportingLevel();
	//report_format = new DataOutputFormat();
	//new std::list()std::list> columns;
	//granularity = new Granularity();
	//view_window_days = double(0);
	//click_window_days = double(0);
	//engagement_window_days = double(0);
	//conversion_report_time_type = std::string();
	//filters_json = std::string();
	//is_owned_by_user = bool(false);
	//is_scheduled = bool(false);
	//creation_source = std::string();
	//is_deleted = bool(false);
	//updated_time = double(0);
	//new std::list()std::list> custom_column_ids;
	//type = std::string();
	//new std::list()std::list> ingestion_sources;
}

void
TemplateResponse::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(ad_account_ids != NULL) {
	//ad_account_ids.RemoveAll(true);
	//delete ad_account_ids;
	//ad_account_ids = NULL;
	//}
	//if(user_id != NULL) {
	//
	//delete user_id;
	//user_id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(report_start_relative_days_in_past != NULL) {
	//
	//delete report_start_relative_days_in_past;
	//report_start_relative_days_in_past = NULL;
	//}
	//if(report_end_relative_days_in_past != NULL) {
	//
	//delete report_end_relative_days_in_past;
	//report_end_relative_days_in_past = NULL;
	//}
	//if(date_range != NULL) {
	//
	//delete date_range;
	//date_range = NULL;
	//}
	//if(report_level != NULL) {
	//
	//delete report_level;
	//report_level = NULL;
	//}
	//if(report_format != NULL) {
	//
	//delete report_format;
	//report_format = NULL;
	//}
	//if(columns != NULL) {
	//columns.RemoveAll(true);
	//delete columns;
	//columns = NULL;
	//}
	//if(granularity != NULL) {
	//
	//delete granularity;
	//granularity = NULL;
	//}
	//if(view_window_days != NULL) {
	//
	//delete view_window_days;
	//view_window_days = NULL;
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
	//if(conversion_report_time_type != NULL) {
	//
	//delete conversion_report_time_type;
	//conversion_report_time_type = NULL;
	//}
	//if(filters_json != NULL) {
	//
	//delete filters_json;
	//filters_json = NULL;
	//}
	//if(is_owned_by_user != NULL) {
	//
	//delete is_owned_by_user;
	//is_owned_by_user = NULL;
	//}
	//if(is_scheduled != NULL) {
	//
	//delete is_scheduled;
	//is_scheduled = NULL;
	//}
	//if(creation_source != NULL) {
	//
	//delete creation_source;
	//creation_source = NULL;
	//}
	//if(is_deleted != NULL) {
	//
	//delete is_deleted;
	//is_deleted = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//if(custom_column_ids != NULL) {
	//custom_column_ids.RemoveAll(true);
	//delete custom_column_ids;
	//custom_column_ids = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(ingestion_sources != NULL) {
	//ingestion_sources.RemoveAll(true);
	//delete ingestion_sources;
	//ingestion_sources = NULL;
	//}
	//
}

void
TemplateResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ad_account_idsKey = "ad_account_ids";
	node = json_object_get_member(pJsonObject, ad_account_idsKey);
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
			ad_account_ids = new_list;
		}
		
	}
	const gchar *user_idKey = "user_id";
	node = json_object_get_member(pJsonObject, user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *report_start_relative_days_in_pastKey = "report_start_relative_days_in_past";
	node = json_object_get_member(pJsonObject, report_start_relative_days_in_pastKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&report_start_relative_days_in_past, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&report_start_relative_days_in_past);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *report_end_relative_days_in_pastKey = "report_end_relative_days_in_past";
	node = json_object_get_member(pJsonObject, report_end_relative_days_in_pastKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&report_end_relative_days_in_past, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&report_end_relative_days_in_past);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *date_rangeKey = "date_range";
	node = json_object_get_member(pJsonObject, date_rangeKey);
	if (node !=NULL) {
	

		if (isprimitive("TemplateResponse_date_range")) {
			jsonToValue(&date_range, node, "TemplateResponse_date_range", "TemplateResponse_date_range");
		} else {
			
			TemplateResponse_date_range* obj = static_cast<TemplateResponse_date_range*> (&date_range);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *report_levelKey = "report_level";
	node = json_object_get_member(pJsonObject, report_levelKey);
	if (node !=NULL) {
	

		if (isprimitive("MetricsReportingLevel")) {
			jsonToValue(&report_level, node, "MetricsReportingLevel", "MetricsReportingLevel");
		} else {
			
			MetricsReportingLevel* obj = static_cast<MetricsReportingLevel*> (&report_level);
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
	const gchar *columnsKey = "columns";
	node = json_object_get_member(pJsonObject, columnsKey);
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
			columns = new_list;
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
	const gchar *view_window_daysKey = "view_window_days";
	node = json_object_get_member(pJsonObject, view_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&view_window_days, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&view_window_days);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *click_window_daysKey = "click_window_days";
	node = json_object_get_member(pJsonObject, click_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&click_window_days, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&click_window_days);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *engagement_window_daysKey = "engagement_window_days";
	node = json_object_get_member(pJsonObject, engagement_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&engagement_window_days, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&engagement_window_days);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *conversion_report_time_typeKey = "conversion_report_time_type";
	node = json_object_get_member(pJsonObject, conversion_report_time_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&conversion_report_time_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *filters_jsonKey = "filters_json";
	node = json_object_get_member(pJsonObject, filters_jsonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&filters_json, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_owned_by_userKey = "is_owned_by_user";
	node = json_object_get_member(pJsonObject, is_owned_by_userKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_owned_by_user, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_scheduledKey = "is_scheduled";
	node = json_object_get_member(pJsonObject, is_scheduledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_scheduled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *creation_sourceKey = "creation_source";
	node = json_object_get_member(pJsonObject, creation_sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&creation_source, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_deletedKey = "is_deleted";
	node = json_object_get_member(pJsonObject, is_deletedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_deleted, node, "bool", "");
		} else {
			
		}
	}
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&updated_time, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&updated_time);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *custom_column_idsKey = "custom_column_ids";
	node = json_object_get_member(pJsonObject, custom_column_idsKey);
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
			custom_column_ids = new_list;
		}
		
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ingestion_sourcesKey = "ingestion_sources";
	node = json_object_get_member(pJsonObject, ingestion_sourcesKey);
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
			ingestion_sources = new_list;
		}
		
	}
}

TemplateResponse::TemplateResponse(char* json)
{
	this->fromJson(json);
}

char*
TemplateResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAdAccountIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdAccountIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ad_account_idsKey = "ad_account_ids";
	json_object_set_member(pJsonObject, ad_account_idsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getReportStartRelativeDaysInPast();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getReportStartRelativeDaysInPast());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *report_start_relative_days_in_pastKey = "report_start_relative_days_in_past";
	json_object_set_member(pJsonObject, report_start_relative_days_in_pastKey, node);
	if (isprimitive("long long")) {
		long long obj = getReportEndRelativeDaysInPast();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getReportEndRelativeDaysInPast());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *report_end_relative_days_in_pastKey = "report_end_relative_days_in_past";
	json_object_set_member(pJsonObject, report_end_relative_days_in_pastKey, node);
	if (isprimitive("TemplateResponse_date_range")) {
		TemplateResponse_date_range obj = getDateRange();
		node = converttoJson(&obj, "TemplateResponse_date_range", "");
	}
	else {
		
		TemplateResponse_date_range obj = static_cast<TemplateResponse_date_range> (getDateRange());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *date_rangeKey = "date_range";
	json_object_set_member(pJsonObject, date_rangeKey, node);
	if (isprimitive("MetricsReportingLevel")) {
		MetricsReportingLevel obj = getReportLevel();
		node = converttoJson(&obj, "MetricsReportingLevel", "");
	}
	else {
		
		MetricsReportingLevel obj = static_cast<MetricsReportingLevel> (getReportLevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *report_levelKey = "report_level";
	json_object_set_member(pJsonObject, report_levelKey, node);
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
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getColumns());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getColumns());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *columnsKey = "columns";
	json_object_set_member(pJsonObject, columnsKey, node);
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
	if (isprimitive("long long")) {
		long long obj = getViewWindowDays();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getViewWindowDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *view_window_daysKey = "view_window_days";
	json_object_set_member(pJsonObject, view_window_daysKey, node);
	if (isprimitive("long long")) {
		long long obj = getClickWindowDays();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getClickWindowDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *click_window_daysKey = "click_window_days";
	json_object_set_member(pJsonObject, click_window_daysKey, node);
	if (isprimitive("long long")) {
		long long obj = getEngagementWindowDays();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getEngagementWindowDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *engagement_window_daysKey = "engagement_window_days";
	json_object_set_member(pJsonObject, engagement_window_daysKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConversionReportTimeType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *conversion_report_time_typeKey = "conversion_report_time_type";
	json_object_set_member(pJsonObject, conversion_report_time_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFiltersJson();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *filters_jsonKey = "filters_json";
	json_object_set_member(pJsonObject, filters_jsonKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsOwnedByUser();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_owned_by_userKey = "is_owned_by_user";
	json_object_set_member(pJsonObject, is_owned_by_userKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsScheduled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_scheduledKey = "is_scheduled";
	json_object_set_member(pJsonObject, is_scheduledKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreationSource();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *creation_sourceKey = "creation_source";
	json_object_set_member(pJsonObject, creation_sourceKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsDeleted();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_deletedKey = "is_deleted";
	json_object_set_member(pJsonObject, is_deletedKey, node);
	if (isprimitive("long long")) {
		long long obj = getUpdatedTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getUpdatedTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomColumnIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomColumnIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_column_idsKey = "custom_column_ids";
	json_object_set_member(pJsonObject, custom_column_idsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getIngestionSources());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getIngestionSources());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ingestion_sourcesKey = "ingestion_sources";
	json_object_set_member(pJsonObject, ingestion_sourcesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TemplateResponse::getId()
{
	return id;
}

void
TemplateResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
TemplateResponse::getAdAccountId()
{
	return ad_account_id;
}

void
TemplateResponse::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::list<std::string>
TemplateResponse::getAdAccountIds()
{
	return ad_account_ids;
}

void
TemplateResponse::setAdAccountIds(std::list <std::string> ad_account_ids)
{
	this->ad_account_ids = ad_account_ids;
}

std::string
TemplateResponse::getUserId()
{
	return user_id;
}

void
TemplateResponse::setUserId(std::string  user_id)
{
	this->user_id = user_id;
}

std::string
TemplateResponse::getName()
{
	return name;
}

void
TemplateResponse::setName(std::string  name)
{
	this->name = name;
}

long long
TemplateResponse::getReportStartRelativeDaysInPast()
{
	return report_start_relative_days_in_past;
}

void
TemplateResponse::setReportStartRelativeDaysInPast(long long  report_start_relative_days_in_past)
{
	this->report_start_relative_days_in_past = report_start_relative_days_in_past;
}

long long
TemplateResponse::getReportEndRelativeDaysInPast()
{
	return report_end_relative_days_in_past;
}

void
TemplateResponse::setReportEndRelativeDaysInPast(long long  report_end_relative_days_in_past)
{
	this->report_end_relative_days_in_past = report_end_relative_days_in_past;
}

TemplateResponse_date_range
TemplateResponse::getDateRange()
{
	return date_range;
}

void
TemplateResponse::setDateRange(TemplateResponse_date_range  date_range)
{
	this->date_range = date_range;
}

MetricsReportingLevel
TemplateResponse::getReportLevel()
{
	return report_level;
}

void
TemplateResponse::setReportLevel(MetricsReportingLevel  report_level)
{
	this->report_level = report_level;
}

DataOutputFormat
TemplateResponse::getReportFormat()
{
	return report_format;
}

void
TemplateResponse::setReportFormat(DataOutputFormat  report_format)
{
	this->report_format = report_format;
}

std::list<std::string>
TemplateResponse::getColumns()
{
	return columns;
}

void
TemplateResponse::setColumns(std::list <std::string> columns)
{
	this->columns = columns;
}

Granularity
TemplateResponse::getGranularity()
{
	return granularity;
}

void
TemplateResponse::setGranularity(Granularity  granularity)
{
	this->granularity = granularity;
}

long long
TemplateResponse::getViewWindowDays()
{
	return view_window_days;
}

void
TemplateResponse::setViewWindowDays(long long  view_window_days)
{
	this->view_window_days = view_window_days;
}

long long
TemplateResponse::getClickWindowDays()
{
	return click_window_days;
}

void
TemplateResponse::setClickWindowDays(long long  click_window_days)
{
	this->click_window_days = click_window_days;
}

long long
TemplateResponse::getEngagementWindowDays()
{
	return engagement_window_days;
}

void
TemplateResponse::setEngagementWindowDays(long long  engagement_window_days)
{
	this->engagement_window_days = engagement_window_days;
}

std::string
TemplateResponse::getConversionReportTimeType()
{
	return conversion_report_time_type;
}

void
TemplateResponse::setConversionReportTimeType(std::string  conversion_report_time_type)
{
	this->conversion_report_time_type = conversion_report_time_type;
}

std::string
TemplateResponse::getFiltersJson()
{
	return filters_json;
}

void
TemplateResponse::setFiltersJson(std::string  filters_json)
{
	this->filters_json = filters_json;
}

bool
TemplateResponse::getIsOwnedByUser()
{
	return is_owned_by_user;
}

void
TemplateResponse::setIsOwnedByUser(bool  is_owned_by_user)
{
	this->is_owned_by_user = is_owned_by_user;
}

bool
TemplateResponse::getIsScheduled()
{
	return is_scheduled;
}

void
TemplateResponse::setIsScheduled(bool  is_scheduled)
{
	this->is_scheduled = is_scheduled;
}

std::string
TemplateResponse::getCreationSource()
{
	return creation_source;
}

void
TemplateResponse::setCreationSource(std::string  creation_source)
{
	this->creation_source = creation_source;
}

bool
TemplateResponse::getIsDeleted()
{
	return is_deleted;
}

void
TemplateResponse::setIsDeleted(bool  is_deleted)
{
	this->is_deleted = is_deleted;
}

long long
TemplateResponse::getUpdatedTime()
{
	return updated_time;
}

void
TemplateResponse::setUpdatedTime(long long  updated_time)
{
	this->updated_time = updated_time;
}

std::list<std::string>
TemplateResponse::getCustomColumnIds()
{
	return custom_column_ids;
}

void
TemplateResponse::setCustomColumnIds(std::list <std::string> custom_column_ids)
{
	this->custom_column_ids = custom_column_ids;
}

std::string
TemplateResponse::getType()
{
	return type;
}

void
TemplateResponse::setType(std::string  type)
{
	this->type = type;
}

std::list<std::string>
TemplateResponse::getIngestionSources()
{
	return ingestion_sources;
}

void
TemplateResponse::setIngestionSources(std::list <std::string> ingestion_sources)
{
	this->ingestion_sources = ingestion_sources;
}


