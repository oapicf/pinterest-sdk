#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AccountTemplate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AccountTemplate::AccountTemplate()
{
	//__init();
}

AccountTemplate::~AccountTemplate()
{
	//__cleanup();
}

void
AccountTemplate::__init()
{
	//ad_account_id = std::string();
	//new std::list()std::list> ad_account_ids;
	//new std::list()std::list> ade_columns;
	//attribution_type = null;
	//click_window_days = double(0);
	//new std::list()std::list> columns;
	//conversion_report_time_type = null;
	//creation_source = null;
	//new std::list()std::list> custom_column_ids;
	//display_metadata = std::string();
	//engagement_window_days = double(0);
	//filters_json = std::string();
	//granularity = new Granularity();
	//id = std::string();
	//new std::list()std::list> ingestion_sources;
	//is_default = bool(false);
	//is_deleted = bool(false);
	//is_owned_by_user = bool(false);
	//is_scheduled = bool(false);
	//name = std::string();
	//report_end_relative_days_in_past = double(0);
	//report_format = new DataOutputFormat();
	//report_level = new MetricsReportingLevel();
	//report_start_relative_days_in_past = double(0);
	//reporting_time_zone = null;
	//sort_by = null;
	//type = std::string();
	//updated_time = double(0);
	//user_id = std::string();
	//view_window_days = double(0);
}

void
AccountTemplate::__cleanup()
{
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
	//if(ade_columns != NULL) {
	//ade_columns.RemoveAll(true);
	//delete ade_columns;
	//ade_columns = NULL;
	//}
	//if(attribution_type != NULL) {
	//
	//delete attribution_type;
	//attribution_type = NULL;
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
	//if(conversion_report_time_type != NULL) {
	//
	//delete conversion_report_time_type;
	//conversion_report_time_type = NULL;
	//}
	//if(creation_source != NULL) {
	//
	//delete creation_source;
	//creation_source = NULL;
	//}
	//if(custom_column_ids != NULL) {
	//custom_column_ids.RemoveAll(true);
	//delete custom_column_ids;
	//custom_column_ids = NULL;
	//}
	//if(display_metadata != NULL) {
	//
	//delete display_metadata;
	//display_metadata = NULL;
	//}
	//if(engagement_window_days != NULL) {
	//
	//delete engagement_window_days;
	//engagement_window_days = NULL;
	//}
	//if(filters_json != NULL) {
	//
	//delete filters_json;
	//filters_json = NULL;
	//}
	//if(granularity != NULL) {
	//
	//delete granularity;
	//granularity = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(ingestion_sources != NULL) {
	//ingestion_sources.RemoveAll(true);
	//delete ingestion_sources;
	//ingestion_sources = NULL;
	//}
	//if(is_default != NULL) {
	//
	//delete is_default;
	//is_default = NULL;
	//}
	//if(is_deleted != NULL) {
	//
	//delete is_deleted;
	//is_deleted = NULL;
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
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(report_end_relative_days_in_past != NULL) {
	//
	//delete report_end_relative_days_in_past;
	//report_end_relative_days_in_past = NULL;
	//}
	//if(report_format != NULL) {
	//
	//delete report_format;
	//report_format = NULL;
	//}
	//if(report_level != NULL) {
	//
	//delete report_level;
	//report_level = NULL;
	//}
	//if(report_start_relative_days_in_past != NULL) {
	//
	//delete report_start_relative_days_in_past;
	//report_start_relative_days_in_past = NULL;
	//}
	//if(reporting_time_zone != NULL) {
	//
	//delete reporting_time_zone;
	//reporting_time_zone = NULL;
	//}
	//if(sort_by != NULL) {
	//
	//delete sort_by;
	//sort_by = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//if(user_id != NULL) {
	//
	//delete user_id;
	//user_id = NULL;
	//}
	//if(view_window_days != NULL) {
	//
	//delete view_window_days;
	//view_window_days = NULL;
	//}
	//
}

void
AccountTemplate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *ade_columnsKey = "ade_columns";
	node = json_object_get_member(pJsonObject, ade_columnsKey);
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
			ade_columns = new_list;
		}
		
	}
	const gchar *attribution_typeKey = "attribution_type";
	node = json_object_get_member(pJsonObject, attribution_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&attribution_type, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&attribution_type);
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
	const gchar *columnsKey = "columns";
	node = json_object_get_member(pJsonObject, columnsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ReportingColumn> new_list;
			ReportingColumn inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ReportingColumn")) {
					jsonToValue(&inst, temp_json, "ReportingColumn", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			columns = new_list;
		}
		
	}
	const gchar *conversion_report_time_typeKey = "conversion_report_time_type";
	node = json_object_get_member(pJsonObject, conversion_report_time_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionReportTimeType")) {
			jsonToValue(&conversion_report_time_type, node, "ConversionReportTimeType", "ConversionReportTimeType");
		} else {
			
			ConversionReportTimeType* obj = static_cast<ConversionReportTimeType*> (&conversion_report_time_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *creation_sourceKey = "creation_source";
	node = json_object_get_member(pJsonObject, creation_sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("CreationSource")) {
			jsonToValue(&creation_source, node, "CreationSource", "CreationSource");
		} else {
			
			CreationSource* obj = static_cast<CreationSource*> (&creation_source);
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
	const gchar *display_metadataKey = "display_metadata";
	node = json_object_get_member(pJsonObject, display_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&display_metadata, node, "std::string", "");
		} else {
			
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
	const gchar *filters_jsonKey = "filters_json";
	node = json_object_get_member(pJsonObject, filters_jsonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&filters_json, node, "std::string", "");
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ingestion_sourcesKey = "ingestion_sources";
	node = json_object_get_member(pJsonObject, ingestion_sourcesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<IngestionSource> new_list;
			IngestionSource inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("IngestionSource")) {
					jsonToValue(&inst, temp_json, "IngestionSource", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			ingestion_sources = new_list;
		}
		
	}
	const gchar *is_defaultKey = "is_default";
	node = json_object_get_member(pJsonObject, is_defaultKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_default, node, "bool", "");
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
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
	const gchar *reporting_time_zoneKey = "reporting_time_zone";
	node = json_object_get_member(pJsonObject, reporting_time_zoneKey);
	if (node !=NULL) {
	

		if (isprimitive("ReportingTimeZone")) {
			jsonToValue(&reporting_time_zone, node, "ReportingTimeZone", "ReportingTimeZone");
		} else {
			
			ReportingTimeZone* obj = static_cast<ReportingTimeZone*> (&reporting_time_zone);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sort_byKey = "sort_by";
	node = json_object_get_member(pJsonObject, sort_byKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&sort_by, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&sort_by);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *user_idKey = "user_id";
	node = json_object_get_member(pJsonObject, user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user_id, node, "std::string", "");
		} else {
			
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
}

AccountTemplate::AccountTemplate(char* json)
{
	this->fromJson(json);
}

char*
AccountTemplate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
		list<std::string> new_list = static_cast<list <std::string> > (getAdeColumns());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdeColumns());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ade_columnsKey = "ade_columns";
	json_object_set_member(pJsonObject, ade_columnsKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getAttributionType();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getAttributionType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attribution_typeKey = "attribution_type";
	json_object_set_member(pJsonObject, attribution_typeKey, node);
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
	if (isprimitive("ReportingColumn")) {
		list<ReportingColumn> new_list = static_cast<list <ReportingColumn> > (getColumns());
		node = converttoJson(&new_list, "ReportingColumn", "array");
	} else {
		node = json_node_alloc();
		list<ReportingColumn> new_list = static_cast<list <ReportingColumn> > (getColumns());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ReportingColumn>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ReportingColumn obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *columnsKey = "columns";
	json_object_set_member(pJsonObject, columnsKey, node);
	if (isprimitive("ConversionReportTimeType")) {
		ConversionReportTimeType obj = getConversionReportTimeType();
		node = converttoJson(&obj, "ConversionReportTimeType", "");
	}
	else {
		
		ConversionReportTimeType obj = static_cast<ConversionReportTimeType> (getConversionReportTimeType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *conversion_report_time_typeKey = "conversion_report_time_type";
	json_object_set_member(pJsonObject, conversion_report_time_typeKey, node);
	if (isprimitive("CreationSource")) {
		CreationSource obj = getCreationSource();
		node = converttoJson(&obj, "CreationSource", "");
	}
	else {
		
		CreationSource obj = static_cast<CreationSource> (getCreationSource());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *creation_sourceKey = "creation_source";
	json_object_set_member(pJsonObject, creation_sourceKey, node);
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
		std::string obj = getDisplayMetadata();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *display_metadataKey = "display_metadata";
	json_object_set_member(pJsonObject, display_metadataKey, node);
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
		std::string obj = getFiltersJson();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *filters_jsonKey = "filters_json";
	json_object_set_member(pJsonObject, filters_jsonKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("IngestionSource")) {
		list<IngestionSource> new_list = static_cast<list <IngestionSource> > (getIngestionSources());
		node = converttoJson(&new_list, "IngestionSource", "array");
	} else {
		node = json_node_alloc();
		list<IngestionSource> new_list = static_cast<list <IngestionSource> > (getIngestionSources());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<IngestionSource>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			IngestionSource obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *ingestion_sourcesKey = "ingestion_sources";
	json_object_set_member(pJsonObject, ingestion_sourcesKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsDefault();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_defaultKey = "is_default";
	json_object_set_member(pJsonObject, is_defaultKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsDeleted();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_deletedKey = "is_deleted";
	json_object_set_member(pJsonObject, is_deletedKey, node);
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
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
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
	if (isprimitive("ReportingTimeZone")) {
		ReportingTimeZone obj = getReportingTimeZone();
		node = converttoJson(&obj, "ReportingTimeZone", "");
	}
	else {
		
		ReportingTimeZone obj = static_cast<ReportingTimeZone> (getReportingTimeZone());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reporting_time_zoneKey = "reporting_time_zone";
	json_object_set_member(pJsonObject, reporting_time_zoneKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getSortBy();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getSortBy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sort_byKey = "sort_by";
	json_object_set_member(pJsonObject, sort_byKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
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
		std::string obj = getUserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AccountTemplate::getAdAccountId()
{
	return ad_account_id;
}

void
AccountTemplate::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::list<std::string>
AccountTemplate::getAdAccountIds()
{
	return ad_account_ids;
}

void
AccountTemplate::setAdAccountIds(std::list <std::string> ad_account_ids)
{
	this->ad_account_ids = ad_account_ids;
}

std::list<std::string>
AccountTemplate::getAdeColumns()
{
	return ade_columns;
}

void
AccountTemplate::setAdeColumns(std::list <std::string> ade_columns)
{
	this->ade_columns = ade_columns;
}

AnyType
AccountTemplate::getAttributionType()
{
	return attribution_type;
}

void
AccountTemplate::setAttributionType(AnyType  attribution_type)
{
	this->attribution_type = attribution_type;
}

long long
AccountTemplate::getClickWindowDays()
{
	return click_window_days;
}

void
AccountTemplate::setClickWindowDays(long long  click_window_days)
{
	this->click_window_days = click_window_days;
}

std::list<ReportingColumn>
AccountTemplate::getColumns()
{
	return columns;
}

void
AccountTemplate::setColumns(std::list <ReportingColumn> columns)
{
	this->columns = columns;
}

ConversionReportTimeType
AccountTemplate::getConversionReportTimeType()
{
	return conversion_report_time_type;
}

void
AccountTemplate::setConversionReportTimeType(ConversionReportTimeType  conversion_report_time_type)
{
	this->conversion_report_time_type = conversion_report_time_type;
}

CreationSource
AccountTemplate::getCreationSource()
{
	return creation_source;
}

void
AccountTemplate::setCreationSource(CreationSource  creation_source)
{
	this->creation_source = creation_source;
}

std::list<std::string>
AccountTemplate::getCustomColumnIds()
{
	return custom_column_ids;
}

void
AccountTemplate::setCustomColumnIds(std::list <std::string> custom_column_ids)
{
	this->custom_column_ids = custom_column_ids;
}

std::string
AccountTemplate::getDisplayMetadata()
{
	return display_metadata;
}

void
AccountTemplate::setDisplayMetadata(std::string  display_metadata)
{
	this->display_metadata = display_metadata;
}

long long
AccountTemplate::getEngagementWindowDays()
{
	return engagement_window_days;
}

void
AccountTemplate::setEngagementWindowDays(long long  engagement_window_days)
{
	this->engagement_window_days = engagement_window_days;
}

std::string
AccountTemplate::getFiltersJson()
{
	return filters_json;
}

void
AccountTemplate::setFiltersJson(std::string  filters_json)
{
	this->filters_json = filters_json;
}

Granularity
AccountTemplate::getGranularity()
{
	return granularity;
}

void
AccountTemplate::setGranularity(Granularity  granularity)
{
	this->granularity = granularity;
}

std::string
AccountTemplate::getId()
{
	return id;
}

void
AccountTemplate::setId(std::string  id)
{
	this->id = id;
}

std::list<IngestionSource>
AccountTemplate::getIngestionSources()
{
	return ingestion_sources;
}

void
AccountTemplate::setIngestionSources(std::list <IngestionSource> ingestion_sources)
{
	this->ingestion_sources = ingestion_sources;
}

bool
AccountTemplate::getIsDefault()
{
	return is_default;
}

void
AccountTemplate::setIsDefault(bool  is_default)
{
	this->is_default = is_default;
}

bool
AccountTemplate::getIsDeleted()
{
	return is_deleted;
}

void
AccountTemplate::setIsDeleted(bool  is_deleted)
{
	this->is_deleted = is_deleted;
}

bool
AccountTemplate::getIsOwnedByUser()
{
	return is_owned_by_user;
}

void
AccountTemplate::setIsOwnedByUser(bool  is_owned_by_user)
{
	this->is_owned_by_user = is_owned_by_user;
}

bool
AccountTemplate::getIsScheduled()
{
	return is_scheduled;
}

void
AccountTemplate::setIsScheduled(bool  is_scheduled)
{
	this->is_scheduled = is_scheduled;
}

std::string
AccountTemplate::getName()
{
	return name;
}

void
AccountTemplate::setName(std::string  name)
{
	this->name = name;
}

long long
AccountTemplate::getReportEndRelativeDaysInPast()
{
	return report_end_relative_days_in_past;
}

void
AccountTemplate::setReportEndRelativeDaysInPast(long long  report_end_relative_days_in_past)
{
	this->report_end_relative_days_in_past = report_end_relative_days_in_past;
}

DataOutputFormat
AccountTemplate::getReportFormat()
{
	return report_format;
}

void
AccountTemplate::setReportFormat(DataOutputFormat  report_format)
{
	this->report_format = report_format;
}

MetricsReportingLevel
AccountTemplate::getReportLevel()
{
	return report_level;
}

void
AccountTemplate::setReportLevel(MetricsReportingLevel  report_level)
{
	this->report_level = report_level;
}

long long
AccountTemplate::getReportStartRelativeDaysInPast()
{
	return report_start_relative_days_in_past;
}

void
AccountTemplate::setReportStartRelativeDaysInPast(long long  report_start_relative_days_in_past)
{
	this->report_start_relative_days_in_past = report_start_relative_days_in_past;
}

ReportingTimeZone
AccountTemplate::getReportingTimeZone()
{
	return reporting_time_zone;
}

void
AccountTemplate::setReportingTimeZone(ReportingTimeZone  reporting_time_zone)
{
	this->reporting_time_zone = reporting_time_zone;
}

AnyType
AccountTemplate::getSortBy()
{
	return sort_by;
}

void
AccountTemplate::setSortBy(AnyType  sort_by)
{
	this->sort_by = sort_by;
}

std::string
AccountTemplate::getType()
{
	return type;
}

void
AccountTemplate::setType(std::string  type)
{
	this->type = type;
}

long long
AccountTemplate::getUpdatedTime()
{
	return updated_time;
}

void
AccountTemplate::setUpdatedTime(long long  updated_time)
{
	this->updated_time = updated_time;
}

std::string
AccountTemplate::getUserId()
{
	return user_id;
}

void
AccountTemplate::setUserId(std::string  user_id)
{
	this->user_id = user_id;
}

long long
AccountTemplate::getViewWindowDays()
{
	return view_window_days;
}

void
AccountTemplate::setViewWindowDays(long long  view_window_days)
{
	this->view_window_days = view_window_days;
}


