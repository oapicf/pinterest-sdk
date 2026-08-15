

#include "CreateMMMReportRequest.h"

using namespace Tiny;

CreateMMMReportRequest::CreateMMMReportRequest()
{
	countries = std::list<TargetingAdvertiserCountry>();
	columns = std::list<MMMReportingColumn>();
	end_date = std::string();
	granularity = std::string();
	level = std::string();
	report_name = std::string();
	start_date = std::string();
	targeting_types = std::list<MMMReportingTargetingType>();
}

CreateMMMReportRequest::CreateMMMReportRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateMMMReportRequest::~CreateMMMReportRequest()
{

}

void
CreateMMMReportRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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



        jsonToValue(&granularity, value, "std::string");


    }

    const char *levelKey = "level";

    if(object.has_key(levelKey))
    {
        bourne::json value = object[levelKey];



        jsonToValue(&level, value, "std::string");


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
CreateMMMReportRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<TargetingAdvertiserCountry> countries_list = getCountries();
    bourne::json countries_arr = bourne::json::array();

    for(auto& var : countries_list)
    {
        TargetingAdvertiserCountry obj = var;
        countries_arr.append(obj.toJson());
    }
    object["countries"] = countries_arr;






    std::list<MMMReportingColumn> columns_list = getColumns();
    bourne::json columns_arr = bourne::json::array();

    for(auto& var : columns_list)
    {
        MMMReportingColumn obj = var;
        columns_arr.append(obj.toJson());
    }
    object["columns"] = columns_arr;







    object["end_date"] = getEndDate();






    object["granularity"] = getGranularity();






    object["level"] = getLevel();






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

std::list<TargetingAdvertiserCountry>
CreateMMMReportRequest::getCountries()
{
	return countries;
}

void
CreateMMMReportRequest::setCountries(std::list <TargetingAdvertiserCountry> countries)
{
	this->countries = countries;
}

std::list<MMMReportingColumn>
CreateMMMReportRequest::getColumns()
{
	return columns;
}

void
CreateMMMReportRequest::setColumns(std::list <MMMReportingColumn> columns)
{
	this->columns = columns;
}

std::string
CreateMMMReportRequest::getEndDate()
{
	return end_date;
}

void
CreateMMMReportRequest::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

std::string
CreateMMMReportRequest::getGranularity()
{
	return granularity;
}

void
CreateMMMReportRequest::setGranularity(std::string  granularity)
{
	this->granularity = granularity;
}

std::string
CreateMMMReportRequest::getLevel()
{
	return level;
}

void
CreateMMMReportRequest::setLevel(std::string  level)
{
	this->level = level;
}

std::string
CreateMMMReportRequest::getReportName()
{
	return report_name;
}

void
CreateMMMReportRequest::setReportName(std::string  report_name)
{
	this->report_name = report_name;
}

std::string
CreateMMMReportRequest::getStartDate()
{
	return start_date;
}

void
CreateMMMReportRequest::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

std::list<MMMReportingTargetingType>
CreateMMMReportRequest::getTargetingTypes()
{
	return targeting_types;
}

void
CreateMMMReportRequest::setTargetingTypes(std::list <MMMReportingTargetingType> targeting_types)
{
	this->targeting_types = targeting_types;
}



