

#include "MMMReportCreate.h"

using namespace Tiny;

MMMReportCreate::MMMReportCreate()
{
	advertiser_ids = std::list<std::string>();
	columns = std::list<MMMReportingColumn>();
	countries = std::list<TargetingAdvertiserCountry>();
	custom_column_ids = std::list<std::string>();
	end_date = std::string();
	granularity = null;
	level = null;
	report_name = std::string();
	start_date = std::string();
	targeting_types = std::list<MMMReportingTargetingType>();
}

MMMReportCreate::MMMReportCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

MMMReportCreate::~MMMReportCreate()
{

}

void
MMMReportCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *advertiser_idsKey = "advertiser_ids";

    if(object.has_key(advertiser_idsKey))
    {
        bourne::json value = object[advertiser_idsKey];


        std::list<std::string> advertiser_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            advertiser_ids_list.push_back(element);
        }
        advertiser_ids = advertiser_ids_list;


    }

    const char *columnsKey = "columns";

    if(object.has_key(columnsKey))
    {
        bourne::json value = object[columnsKey];


        std::list<MMMReportingColumn> columns_list;
        MMMReportingColumn element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            columns_list.push_back(element);
        }
        columns = columns_list;


    }

    const char *countriesKey = "countries";

    if(object.has_key(countriesKey))
    {
        bourne::json value = object[countriesKey];


        std::list<TargetingAdvertiserCountry> countries_list;
        TargetingAdvertiserCountry element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            countries_list.push_back(element);
        }
        countries = countries_list;


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

    const char *end_dateKey = "end_date";

    if(object.has_key(end_dateKey))
    {
        bourne::json value = object[end_dateKey];



        jsonToValue(&end_date, value, "std::string");


    }

    const char *granularityKey = "granularity";

    if(object.has_key(granularityKey))
    {
        bourne::json value = object[granularityKey];




        MMMReportGranularity* obj = &granularity;
		obj->fromJson(value.dump());

    }

    const char *levelKey = "level";

    if(object.has_key(levelKey))
    {
        bourne::json value = object[levelKey];




        MMMReportLevel* obj = &level;
		obj->fromJson(value.dump());

    }

    const char *report_nameKey = "report_name";

    if(object.has_key(report_nameKey))
    {
        bourne::json value = object[report_nameKey];



        jsonToValue(&report_name, value, "std::string");


    }

    const char *start_dateKey = "start_date";

    if(object.has_key(start_dateKey))
    {
        bourne::json value = object[start_dateKey];



        jsonToValue(&start_date, value, "std::string");


    }

    const char *targeting_typesKey = "targeting_types";

    if(object.has_key(targeting_typesKey))
    {
        bourne::json value = object[targeting_typesKey];


        std::list<MMMReportingTargetingType> targeting_types_list;
        MMMReportingTargetingType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            targeting_types_list.push_back(element);
        }
        targeting_types = targeting_types_list;


    }


}

bourne::json
MMMReportCreate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> advertiser_ids_list = getAdvertiserIds();
    bourne::json advertiser_ids_arr = bourne::json::array();

    for(auto& var : advertiser_ids_list)
    {
        advertiser_ids_arr.append(var);
    }
    object["advertiser_ids"] = advertiser_ids_arr;








    std::list<MMMReportingColumn> columns_list = getColumns();
    bourne::json columns_arr = bourne::json::array();

    for(auto& var : columns_list)
    {
        MMMReportingColumn obj = var;
        columns_arr.append(obj.toJson());
    }
    object["columns"] = columns_arr;






    std::list<TargetingAdvertiserCountry> countries_list = getCountries();
    bourne::json countries_arr = bourne::json::array();

    for(auto& var : countries_list)
    {
        TargetingAdvertiserCountry obj = var;
        countries_arr.append(obj.toJson());
    }
    object["countries"] = countries_arr;






    std::list<std::string> custom_column_ids_list = getCustomColumnIds();
    bourne::json custom_column_ids_arr = bourne::json::array();

    for(auto& var : custom_column_ids_list)
    {
        custom_column_ids_arr.append(var);
    }
    object["custom_column_ids"] = custom_column_ids_arr;









    object["end_date"] = getEndDate();







	object["granularity"] = getGranularity().toJson();






	object["level"] = getLevel().toJson();





    object["report_name"] = getReportName();






    object["start_date"] = getStartDate();





    std::list<MMMReportingTargetingType> targeting_types_list = getTargetingTypes();
    bourne::json targeting_types_arr = bourne::json::array();

    for(auto& var : targeting_types_list)
    {
        MMMReportingTargetingType obj = var;
        targeting_types_arr.append(obj.toJson());
    }
    object["targeting_types"] = targeting_types_arr;




    return object;

}

std::list<std::string>
MMMReportCreate::getAdvertiserIds()
{
	return advertiser_ids;
}

void
MMMReportCreate::setAdvertiserIds(std::list<std::string> advertiser_ids)
{
	this->advertiser_ids = advertiser_ids;
}

std::list<MMMReportingColumn>
MMMReportCreate::getColumns()
{
	return columns;
}

void
MMMReportCreate::setColumns(std::list<MMMReportingColumn> columns)
{
	this->columns = columns;
}

std::list<TargetingAdvertiserCountry>
MMMReportCreate::getCountries()
{
	return countries;
}

void
MMMReportCreate::setCountries(std::list<TargetingAdvertiserCountry> countries)
{
	this->countries = countries;
}

std::list<std::string>
MMMReportCreate::getCustomColumnIds()
{
	return custom_column_ids;
}

void
MMMReportCreate::setCustomColumnIds(std::list<std::string> custom_column_ids)
{
	this->custom_column_ids = custom_column_ids;
}

std::string
MMMReportCreate::getEndDate()
{
	return end_date;
}

void
MMMReportCreate::setEndDate(std::string end_date)
{
	this->end_date = end_date;
}

MMMReportGranularity
MMMReportCreate::getGranularity()
{
	return granularity;
}

void
MMMReportCreate::setGranularity(MMMReportGranularity granularity)
{
	this->granularity = granularity;
}

MMMReportLevel
MMMReportCreate::getLevel()
{
	return level;
}

void
MMMReportCreate::setLevel(MMMReportLevel level)
{
	this->level = level;
}

std::string
MMMReportCreate::getReportName()
{
	return report_name;
}

void
MMMReportCreate::setReportName(std::string report_name)
{
	this->report_name = report_name;
}

std::string
MMMReportCreate::getStartDate()
{
	return start_date;
}

void
MMMReportCreate::setStartDate(std::string start_date)
{
	this->start_date = start_date;
}

std::list<MMMReportingTargetingType>
MMMReportCreate::getTargetingTypes()
{
	return targeting_types;
}

void
MMMReportCreate::setTargetingTypes(std::list<MMMReportingTargetingType> targeting_types)
{
	this->targeting_types = targeting_types;
}



