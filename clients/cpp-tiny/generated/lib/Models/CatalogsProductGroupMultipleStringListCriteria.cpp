

#include "CatalogsProductGroupMultipleStringListCriteria.h"

using namespace Tiny;

CatalogsProductGroupMultipleStringListCriteria::CatalogsProductGroupMultipleStringListCriteria()
{
	negated = bool(false);
	values = std::list<std::list>();
}

CatalogsProductGroupMultipleStringListCriteria::CatalogsProductGroupMultipleStringListCriteria(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupMultipleStringListCriteria::~CatalogsProductGroupMultipleStringListCriteria()
{

}

void
CatalogsProductGroupMultipleStringListCriteria::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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


        std::list<std::list> values_list;
        std::list element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::list");


            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
CatalogsProductGroupMultipleStringListCriteria::toJson()
{
    bourne::json object = bourne::json::object();





    object["negated"] = isNegated();





    std::list<std::list> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        values_arr.append(var);
    }
    object["values"] = values_arr;






    return object;

}

bool
CatalogsProductGroupMultipleStringListCriteria::isNegated()
{
	return negated;
}

void
CatalogsProductGroupMultipleStringListCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}

std::list<std::list>
CatalogsProductGroupMultipleStringListCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupMultipleStringListCriteria::setValues(std::list <std::list> values)
{
	this->values = values;
}



