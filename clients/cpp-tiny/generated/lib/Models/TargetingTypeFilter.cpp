

#include "TargetingTypeFilter.h"

using namespace Tiny;

TargetingTypeFilter::TargetingTypeFilter()
{
	targeting_types = std::list<std::string>();
}

TargetingTypeFilter::TargetingTypeFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingTypeFilter::~TargetingTypeFilter()
{

}

void
TargetingTypeFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *targeting_typesKey = "targeting_types";

    if(object.has_key(targeting_typesKey))
    {
        bourne::json value = object[targeting_typesKey];


        std::list<std::string> targeting_types_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            targeting_types_list.push_back(element);
        }
        targeting_types = targeting_types_list;


    }


}

bourne::json
TargetingTypeFilter::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> targeting_types_list = getTargetingTypes();
    bourne::json targeting_types_arr = bourne::json::array();

    for(auto& var : targeting_types_list)
    {
        targeting_types_arr.append(var);
    }
    object["targeting_types"] = targeting_types_arr;






    return object;

}

std::list<std::string>
TargetingTypeFilter::getTargetingTypes()
{
	return targeting_types;
}

void
TargetingTypeFilter::setTargetingTypes(std::list <std::string> targeting_types)
{
	this->targeting_types = targeting_types;
}



