

#include "CatalogsProductGroupFilterOperatorTypeCriteria.h"

using namespace Tiny;

CatalogsProductGroupFilterOperatorTypeCriteria::CatalogsProductGroupFilterOperatorTypeCriteria()
{
	filter_operator_type = std::string();
	negated = bool(false);
	values = std::list<std::string>();
}

CatalogsProductGroupFilterOperatorTypeCriteria::CatalogsProductGroupFilterOperatorTypeCriteria(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupFilterOperatorTypeCriteria::~CatalogsProductGroupFilterOperatorTypeCriteria()
{

}

void
CatalogsProductGroupFilterOperatorTypeCriteria::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *filter_operator_typeKey = "filter_operator_type";

    if(object.has_key(filter_operator_typeKey))
    {
        bourne::json value = object[filter_operator_typeKey];



        jsonToValue(&filter_operator_type, value, "std::string");


    }

    const char *negatedKey = "negated";

    if(object.has_key(negatedKey))
    {
        bourne::json value = object[negatedKey];



        jsonToValue(&negated, value, "bool");


    }

    const char *valuesKey = "values";

    if(object.has_key(valuesKey))
    {
        bourne::json value = object[valuesKey];


        std::list<std::string> values_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
CatalogsProductGroupFilterOperatorTypeCriteria::toJson()
{
    bourne::json object = bourne::json::object();





    object["filter_operator_type"] = getFilterOperatorType();






    object["negated"] = isNegated();





    std::list<std::string> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        values_arr.append(var);
    }
    object["values"] = values_arr;






    return object;

}

std::string
CatalogsProductGroupFilterOperatorTypeCriteria::getFilterOperatorType()
{
	return filter_operator_type;
}

void
CatalogsProductGroupFilterOperatorTypeCriteria::setFilterOperatorType(std::string  filter_operator_type)
{
	this->filter_operator_type = filter_operator_type;
}

bool
CatalogsProductGroupFilterOperatorTypeCriteria::isNegated()
{
	return negated;
}

void
CatalogsProductGroupFilterOperatorTypeCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}

std::list<std::string>
CatalogsProductGroupFilterOperatorTypeCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupFilterOperatorTypeCriteria::setValues(std::list <std::string> values)
{
	this->values = values;
}



