

#include "TemplateResponse.h"

using namespace Tiny;

TemplateResponse::TemplateResponse()
{
	ad_account_id = std::string();
	ad_account_ids = std::list<std::string>();
	click_window_days = float(0);
	columns = std::list<std::string>();
	conversion_report_time_type = std::string();
	creation_source = std::string();
	custom_column_ids = std::list<std::string>();
	date_range = TemplateResponse_date_range();
	engagement_window_days = float(0);
	filters_json = std::string();
	granularity = Granularity();
	id = std::string();
	ingestion_sources = std::list<std::string>();
	is_deleted = bool(false);
	is_owned_by_user = bool(false);
	is_scheduled = bool(false);
	name = std::string();
	report_end_relative_days_in_past = float(0);
	report_format = DataOutputFormat();
	report_level = MetricsReportingLevel();
	report_start_relative_days_in_past = float(0);
	type = std::string();
	updated_time = float(0);
	user_id = std::string();
	view_window_days = float(0);
}

TemplateResponse::TemplateResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

TemplateResponse::~TemplateResponse()
{

}

void
TemplateResponse::fromJson(std::string jsonObj)
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


        std::list<std::string> columns_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            columns_list.push_back(element);
        }
        columns = columns_list;


    }

    const char *conversion_report_time_typeKey = "conversion_report_time_type";

    if(object.has_key(conversion_report_time_typeKey))
    {
        bourne::json value = object[conversion_report_time_typeKey];



        jsonToValue(&conversion_report_time_type, value, "std::string");


    }

    const char *creation_sourceKey = "creation_source";

    if(object.has_key(creation_sourceKey))
    {
        bourne::json value = object[creation_sourceKey];



        jsonToValue(&creation_source, value, "std::string");


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

    const char *date_rangeKey = "date_range";

    if(object.has_key(date_rangeKey))
    {
        bourne::json value = object[date_rangeKey];




        TemplateResponse_date_range* obj = &date_range;
		obj->fromJson(value.dump());

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


        std::list<std::string> ingestion_sources_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ingestion_sources_list.push_back(element);
        }
        ingestion_sources = ingestion_sources_list;


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
TemplateResponse::toJson()
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









    object["click_window_days"] = getClickWindowDays();





    std::list<std::string> columns_list = getColumns();
    bourne::json columns_arr = bourne::json::array();

    for(auto& var : columns_list)
    {
        columns_arr.append(var);
    }
    object["columns"] = columns_arr;









    object["conversion_report_time_type"] = getConversionReportTimeType();






    object["creation_source"] = getCreationSource();





    std::list<std::string> custom_column_ids_list = getCustomColumnIds();
    bourne::json custom_column_ids_arr = bourne::json::array();

    for(auto& var : custom_column_ids_list)
    {
        custom_column_ids_arr.append(var);
    }
    object["custom_column_ids"] = custom_column_ids_arr;










	object["date_range"] = getDateRange().toJson();





    object["engagement_window_days"] = getEngagementWindowDays();






    object["filters_json"] = getFiltersJson();







	object["granularity"] = getGranularity().toJson();





    object["id"] = getId();





    std::list<std::string> ingestion_sources_list = getIngestionSources();
    bourne::json ingestion_sources_arr = bourne::json::array();

    for(auto& var : ingestion_sources_list)
    {
        ingestion_sources_arr.append(var);
    }
    object["ingestion_sources"] = ingestion_sources_arr;









    object["is_deleted"] = isIsDeleted();






    object["is_owned_by_user"] = isIsOwnedByUser();






    object["is_scheduled"] = isIsScheduled();






    object["name"] = getName();






    object["report_end_relative_days_in_past"] = getReportEndRelativeDaysInPast();







	object["report_format"] = getReportFormat().toJson();






	object["report_level"] = getReportLevel().toJson();





    object["report_start_relative_days_in_past"] = getReportStartRelativeDaysInPast();






    object["type"] = getType();






    object["updated_time"] = getUpdatedTime();






    object["user_id"] = getUserId();






    object["view_window_days"] = getViewWindowDays();



    return object;

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

long
TemplateResponse::getClickWindowDays()
{
	return click_window_days;
}

void
TemplateResponse::setClickWindowDays(long  click_window_days)
{
	this->click_window_days = click_window_days;
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
TemplateResponse::getCreationSource()
{
	return creation_source;
}

void
TemplateResponse::setCreationSource(std::string  creation_source)
{
	this->creation_source = creation_source;
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

long
TemplateResponse::getEngagementWindowDays()
{
	return engagement_window_days;
}

void
TemplateResponse::setEngagementWindowDays(long  engagement_window_days)
{
	this->engagement_window_days = engagement_window_days;
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

bool
TemplateResponse::isIsDeleted()
{
	return is_deleted;
}

void
TemplateResponse::setIsDeleted(bool  is_deleted)
{
	this->is_deleted = is_deleted;
}

bool
TemplateResponse::isIsOwnedByUser()
{
	return is_owned_by_user;
}

void
TemplateResponse::setIsOwnedByUser(bool  is_owned_by_user)
{
	this->is_owned_by_user = is_owned_by_user;
}

bool
TemplateResponse::isIsScheduled()
{
	return is_scheduled;
}

void
TemplateResponse::setIsScheduled(bool  is_scheduled)
{
	this->is_scheduled = is_scheduled;
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

long
TemplateResponse::getReportEndRelativeDaysInPast()
{
	return report_end_relative_days_in_past;
}

void
TemplateResponse::setReportEndRelativeDaysInPast(long  report_end_relative_days_in_past)
{
	this->report_end_relative_days_in_past = report_end_relative_days_in_past;
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

long
TemplateResponse::getReportStartRelativeDaysInPast()
{
	return report_start_relative_days_in_past;
}

void
TemplateResponse::setReportStartRelativeDaysInPast(long  report_start_relative_days_in_past)
{
	this->report_start_relative_days_in_past = report_start_relative_days_in_past;
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

long
TemplateResponse::getUpdatedTime()
{
	return updated_time;
}

void
TemplateResponse::setUpdatedTime(long  updated_time)
{
	this->updated_time = updated_time;
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

long
TemplateResponse::getViewWindowDays()
{
	return view_window_days;
}

void
TemplateResponse::setViewWindowDays(long  view_window_days)
{
	this->view_window_days = view_window_days;
}



