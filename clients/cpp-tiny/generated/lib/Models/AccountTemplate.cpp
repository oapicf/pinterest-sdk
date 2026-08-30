

#include "AccountTemplate.h"

using namespace Tiny;

AccountTemplate::AccountTemplate()
{
	ad_account_id = std::string();
	ad_account_ids = std::list<std::string>();
	ade_columns = std::list<std::string>();
	attribution_type = null;
	click_window_days = float(0);
	columns = std::list<ReportingColumn>();
	conversion_report_time_type = null;
	creation_source = null;
	custom_column_ids = std::list<std::string>();
	display_metadata = std::string();
	engagement_window_days = float(0);
	filters_json = std::string();
	granularity = Granularity();
	id = std::string();
	ingestion_sources = std::list<IngestionSource>();
	is_default = bool(false);
	is_deleted = bool(false);
	is_owned_by_user = bool(false);
	is_scheduled = bool(false);
	name = std::string();
	report_end_relative_days_in_past = float(0);
	report_format = DataOutputFormat();
	report_level = MetricsReportingLevel();
	report_start_relative_days_in_past = float(0);
	reporting_time_zone = null;
	sort_by = null;
	type = std::string();
	updated_time = float(0);
	user_id = std::string();
	view_window_days = float(0);
}

AccountTemplate::AccountTemplate(std::string jsonString)
{
	this->fromJson(jsonString);
}

AccountTemplate::~AccountTemplate()
{

}

void
AccountTemplate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *ad_account_idsKey = "ad_account_ids";

    if(object.has_key(ad_account_idsKey))
    {
        bourne::json value = object[ad_account_idsKey];


        std::list<std::string> ad_account_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ad_account_ids_list.push_back(element);
        }
        ad_account_ids = ad_account_ids_list;


    }

    const char *ade_columnsKey = "ade_columns";

    if(object.has_key(ade_columnsKey))
    {
        bourne::json value = object[ade_columnsKey];


        std::list<std::string> ade_columns_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ade_columns_list.push_back(element);
        }
        ade_columns = ade_columns_list;


    }

    const char *attribution_typeKey = "attribution_type";

    if(object.has_key(attribution_typeKey))
    {
        bourne::json value = object[attribution_typeKey];




        AnyType* obj = &attribution_type;
		obj->fromJson(value.dump());

    }

    const char *click_window_daysKey = "click_window_days";

    if(object.has_key(click_window_daysKey))
    {
        bourne::json value = object[click_window_daysKey];



        jsonToValue(&click_window_days, value, "long");


    }

    const char *columnsKey = "columns";

    if(object.has_key(columnsKey))
    {
        bourne::json value = object[columnsKey];


        std::list<ReportingColumn> columns_list;
        ReportingColumn element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            columns_list.push_back(element);
        }
        columns = columns_list;


    }

    const char *conversion_report_time_typeKey = "conversion_report_time_type";

    if(object.has_key(conversion_report_time_typeKey))
    {
        bourne::json value = object[conversion_report_time_typeKey];




        ConversionReportTimeType* obj = &conversion_report_time_type;
		obj->fromJson(value.dump());

    }

    const char *creation_sourceKey = "creation_source";

    if(object.has_key(creation_sourceKey))
    {
        bourne::json value = object[creation_sourceKey];




        CreationSource* obj = &creation_source;
		obj->fromJson(value.dump());

    }

    const char *custom_column_idsKey = "custom_column_ids";

    if(object.has_key(custom_column_idsKey))
    {
        bourne::json value = object[custom_column_idsKey];


        std::list<std::string> custom_column_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            custom_column_ids_list.push_back(element);
        }
        custom_column_ids = custom_column_ids_list;


    }

    const char *display_metadataKey = "display_metadata";

    if(object.has_key(display_metadataKey))
    {
        bourne::json value = object[display_metadataKey];



        jsonToValue(&display_metadata, value, "std::string");


    }

    const char *engagement_window_daysKey = "engagement_window_days";

    if(object.has_key(engagement_window_daysKey))
    {
        bourne::json value = object[engagement_window_daysKey];



        jsonToValue(&engagement_window_days, value, "long");


    }

    const char *filters_jsonKey = "filters_json";

    if(object.has_key(filters_jsonKey))
    {
        bourne::json value = object[filters_jsonKey];



        jsonToValue(&filters_json, value, "std::string");


    }

    const char *granularityKey = "granularity";

    if(object.has_key(granularityKey))
    {
        bourne::json value = object[granularityKey];




        Granularity* obj = &granularity;
		obj->fromJson(value.dump());

    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *ingestion_sourcesKey = "ingestion_sources";

    if(object.has_key(ingestion_sourcesKey))
    {
        bourne::json value = object[ingestion_sourcesKey];


        std::list<IngestionSource> ingestion_sources_list;
        IngestionSource element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            ingestion_sources_list.push_back(element);
        }
        ingestion_sources = ingestion_sources_list;


    }

    const char *is_defaultKey = "is_default";

    if(object.has_key(is_defaultKey))
    {
        bourne::json value = object[is_defaultKey];



        jsonToValue(&is_default, value, "bool");


    }

    const char *is_deletedKey = "is_deleted";

    if(object.has_key(is_deletedKey))
    {
        bourne::json value = object[is_deletedKey];



        jsonToValue(&is_deleted, value, "bool");


    }

    const char *is_owned_by_userKey = "is_owned_by_user";

    if(object.has_key(is_owned_by_userKey))
    {
        bourne::json value = object[is_owned_by_userKey];



        jsonToValue(&is_owned_by_user, value, "bool");


    }

    const char *is_scheduledKey = "is_scheduled";

    if(object.has_key(is_scheduledKey))
    {
        bourne::json value = object[is_scheduledKey];



        jsonToValue(&is_scheduled, value, "bool");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *report_end_relative_days_in_pastKey = "report_end_relative_days_in_past";

    if(object.has_key(report_end_relative_days_in_pastKey))
    {
        bourne::json value = object[report_end_relative_days_in_pastKey];



        jsonToValue(&report_end_relative_days_in_past, value, "long");


    }

    const char *report_formatKey = "report_format";

    if(object.has_key(report_formatKey))
    {
        bourne::json value = object[report_formatKey];




        DataOutputFormat* obj = &report_format;
		obj->fromJson(value.dump());

    }

    const char *report_levelKey = "report_level";

    if(object.has_key(report_levelKey))
    {
        bourne::json value = object[report_levelKey];




        MetricsReportingLevel* obj = &report_level;
		obj->fromJson(value.dump());

    }

    const char *report_start_relative_days_in_pastKey = "report_start_relative_days_in_past";

    if(object.has_key(report_start_relative_days_in_pastKey))
    {
        bourne::json value = object[report_start_relative_days_in_pastKey];



        jsonToValue(&report_start_relative_days_in_past, value, "long");


    }

    const char *reporting_time_zoneKey = "reporting_time_zone";

    if(object.has_key(reporting_time_zoneKey))
    {
        bourne::json value = object[reporting_time_zoneKey];




        ReportingTimeZone* obj = &reporting_time_zone;
		obj->fromJson(value.dump());

    }

    const char *sort_byKey = "sort_by";

    if(object.has_key(sort_byKey))
    {
        bourne::json value = object[sort_byKey];




        AnyType* obj = &sort_by;
		obj->fromJson(value.dump());

    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *updated_timeKey = "updated_time";

    if(object.has_key(updated_timeKey))
    {
        bourne::json value = object[updated_timeKey];



        jsonToValue(&updated_time, value, "long");


    }

    const char *user_idKey = "user_id";

    if(object.has_key(user_idKey))
    {
        bourne::json value = object[user_idKey];



        jsonToValue(&user_id, value, "std::string");


    }

    const char *view_window_daysKey = "view_window_days";

    if(object.has_key(view_window_daysKey))
    {
        bourne::json value = object[view_window_daysKey];



        jsonToValue(&view_window_days, value, "long");


    }


}

bourne::json
AccountTemplate::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();





    std::list<std::string> ad_account_ids_list = getAdAccountIds();
    bourne::json ad_account_ids_arr = bourne::json::array();

    for(auto& var : ad_account_ids_list)
    {
        ad_account_ids_arr.append(var);
    }
    object["ad_account_ids"] = ad_account_ids_arr;








    std::list<std::string> ade_columns_list = getAdeColumns();
    bourne::json ade_columns_arr = bourne::json::array();

    for(auto& var : ade_columns_list)
    {
        ade_columns_arr.append(var);
    }
    object["ade_columns"] = ade_columns_arr;










	object["attribution_type"] = getAttributionType().toJson();





    object["click_window_days"] = getClickWindowDays();





    std::list<ReportingColumn> columns_list = getColumns();
    bourne::json columns_arr = bourne::json::array();

    for(auto& var : columns_list)
    {
        ReportingColumn obj = var;
        columns_arr.append(obj.toJson());
    }
    object["columns"] = columns_arr;








	object["conversion_report_time_type"] = getConversionReportTimeType().toJson();






	object["creation_source"] = getCreationSource().toJson();




    std::list<std::string> custom_column_ids_list = getCustomColumnIds();
    bourne::json custom_column_ids_arr = bourne::json::array();

    for(auto& var : custom_column_ids_list)
    {
        custom_column_ids_arr.append(var);
    }
    object["custom_column_ids"] = custom_column_ids_arr;









    object["display_metadata"] = getDisplayMetadata();






    object["engagement_window_days"] = getEngagementWindowDays();






    object["filters_json"] = getFiltersJson();







	object["granularity"] = getGranularity().toJson();





    object["id"] = getId();





    std::list<IngestionSource> ingestion_sources_list = getIngestionSources();
    bourne::json ingestion_sources_arr = bourne::json::array();

    for(auto& var : ingestion_sources_list)
    {
        IngestionSource obj = var;
        ingestion_sources_arr.append(obj.toJson());
    }
    object["ingestion_sources"] = ingestion_sources_arr;







    object["is_default"] = isIsDefault();






    object["is_deleted"] = isIsDeleted();






    object["is_owned_by_user"] = isIsOwnedByUser();






    object["is_scheduled"] = isIsScheduled();






    object["name"] = getName();






    object["report_end_relative_days_in_past"] = getReportEndRelativeDaysInPast();







	object["report_format"] = getReportFormat().toJson();






	object["report_level"] = getReportLevel().toJson();





    object["report_start_relative_days_in_past"] = getReportStartRelativeDaysInPast();







	object["reporting_time_zone"] = getReportingTimeZone().toJson();






	object["sort_by"] = getSortBy().toJson();





    object["type"] = getType();






    object["updated_time"] = getUpdatedTime();






    object["user_id"] = getUserId();






    object["view_window_days"] = getViewWindowDays();



    return object;

}

std::string
AccountTemplate::getAdAccountId()
{
	return ad_account_id;
}

void
AccountTemplate::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::list<std::string>
AccountTemplate::getAdAccountIds()
{
	return ad_account_ids;
}

void
AccountTemplate::setAdAccountIds(std::list<std::string> ad_account_ids)
{
	this->ad_account_ids = ad_account_ids;
}

std::list<std::string>
AccountTemplate::getAdeColumns()
{
	return ade_columns;
}

void
AccountTemplate::setAdeColumns(std::list<std::string> ade_columns)
{
	this->ade_columns = ade_columns;
}

AnyType
AccountTemplate::getAttributionType()
{
	return attribution_type;
}

void
AccountTemplate::setAttributionType(AnyType attribution_type)
{
	this->attribution_type = attribution_type;
}

long
AccountTemplate::getClickWindowDays()
{
	return click_window_days;
}

void
AccountTemplate::setClickWindowDays(long click_window_days)
{
	this->click_window_days = click_window_days;
}

std::list<ReportingColumn>
AccountTemplate::getColumns()
{
	return columns;
}

void
AccountTemplate::setColumns(std::list<ReportingColumn> columns)
{
	this->columns = columns;
}

ConversionReportTimeType
AccountTemplate::getConversionReportTimeType()
{
	return conversion_report_time_type;
}

void
AccountTemplate::setConversionReportTimeType(ConversionReportTimeType conversion_report_time_type)
{
	this->conversion_report_time_type = conversion_report_time_type;
}

CreationSource
AccountTemplate::getCreationSource()
{
	return creation_source;
}

void
AccountTemplate::setCreationSource(CreationSource creation_source)
{
	this->creation_source = creation_source;
}

std::list<std::string>
AccountTemplate::getCustomColumnIds()
{
	return custom_column_ids;
}

void
AccountTemplate::setCustomColumnIds(std::list<std::string> custom_column_ids)
{
	this->custom_column_ids = custom_column_ids;
}

std::string
AccountTemplate::getDisplayMetadata()
{
	return display_metadata;
}

void
AccountTemplate::setDisplayMetadata(std::string display_metadata)
{
	this->display_metadata = display_metadata;
}

long
AccountTemplate::getEngagementWindowDays()
{
	return engagement_window_days;
}

void
AccountTemplate::setEngagementWindowDays(long engagement_window_days)
{
	this->engagement_window_days = engagement_window_days;
}

std::string
AccountTemplate::getFiltersJson()
{
	return filters_json;
}

void
AccountTemplate::setFiltersJson(std::string filters_json)
{
	this->filters_json = filters_json;
}

Granularity
AccountTemplate::getGranularity()
{
	return granularity;
}

void
AccountTemplate::setGranularity(Granularity granularity)
{
	this->granularity = granularity;
}

std::string
AccountTemplate::getId()
{
	return id;
}

void
AccountTemplate::setId(std::string id)
{
	this->id = id;
}

std::list<IngestionSource>
AccountTemplate::getIngestionSources()
{
	return ingestion_sources;
}

void
AccountTemplate::setIngestionSources(std::list<IngestionSource> ingestion_sources)
{
	this->ingestion_sources = ingestion_sources;
}

bool
AccountTemplate::isIsDefault()
{
	return is_default;
}

void
AccountTemplate::setIsDefault(bool is_default)
{
	this->is_default = is_default;
}

bool
AccountTemplate::isIsDeleted()
{
	return is_deleted;
}

void
AccountTemplate::setIsDeleted(bool is_deleted)
{
	this->is_deleted = is_deleted;
}

bool
AccountTemplate::isIsOwnedByUser()
{
	return is_owned_by_user;
}

void
AccountTemplate::setIsOwnedByUser(bool is_owned_by_user)
{
	this->is_owned_by_user = is_owned_by_user;
}

bool
AccountTemplate::isIsScheduled()
{
	return is_scheduled;
}

void
AccountTemplate::setIsScheduled(bool is_scheduled)
{
	this->is_scheduled = is_scheduled;
}

std::string
AccountTemplate::getName()
{
	return name;
}

void
AccountTemplate::setName(std::string name)
{
	this->name = name;
}

long
AccountTemplate::getReportEndRelativeDaysInPast()
{
	return report_end_relative_days_in_past;
}

void
AccountTemplate::setReportEndRelativeDaysInPast(long report_end_relative_days_in_past)
{
	this->report_end_relative_days_in_past = report_end_relative_days_in_past;
}

DataOutputFormat
AccountTemplate::getReportFormat()
{
	return report_format;
}

void
AccountTemplate::setReportFormat(DataOutputFormat report_format)
{
	this->report_format = report_format;
}

MetricsReportingLevel
AccountTemplate::getReportLevel()
{
	return report_level;
}

void
AccountTemplate::setReportLevel(MetricsReportingLevel report_level)
{
	this->report_level = report_level;
}

long
AccountTemplate::getReportStartRelativeDaysInPast()
{
	return report_start_relative_days_in_past;
}

void
AccountTemplate::setReportStartRelativeDaysInPast(long report_start_relative_days_in_past)
{
	this->report_start_relative_days_in_past = report_start_relative_days_in_past;
}

ReportingTimeZone
AccountTemplate::getReportingTimeZone()
{
	return reporting_time_zone;
}

void
AccountTemplate::setReportingTimeZone(ReportingTimeZone reporting_time_zone)
{
	this->reporting_time_zone = reporting_time_zone;
}

AnyType
AccountTemplate::getSortBy()
{
	return sort_by;
}

void
AccountTemplate::setSortBy(AnyType sort_by)
{
	this->sort_by = sort_by;
}

std::string
AccountTemplate::getType()
{
	return type;
}

void
AccountTemplate::setType(std::string type)
{
	this->type = type;
}

long
AccountTemplate::getUpdatedTime()
{
	return updated_time;
}

void
AccountTemplate::setUpdatedTime(long updated_time)
{
	this->updated_time = updated_time;
}

std::string
AccountTemplate::getUserId()
{
	return user_id;
}

void
AccountTemplate::setUserId(std::string user_id)
{
	this->user_id = user_id;
}

long
AccountTemplate::getViewWindowDays()
{
	return view_window_days;
}

void
AccountTemplate::setViewWindowDays(long view_window_days)
{
	this->view_window_days = view_window_days;
}



