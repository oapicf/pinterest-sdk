

#include "CatalogsProductGroupMultipleStringCriteria.h"

using namespace Tiny;

CatalogsProductGroupMultipleStringCriteria::CatalogsProductGroupMultipleStringCriteria()
{
	negated = bool(false);
	values = std::list<std::string>();
}

CatalogsProductGroupMultipleStringCriteria::CatalogsProductGroupMultipleStringCriteria(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupMultipleStringCriteria::~CatalogsProductGroupMultipleStringCriteria()
{

}

void
CatalogsProductGroupMultipleStringCriteria::fromJson(std::string jsonObj)
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
CatalogsProductGroupMultipleStringCriteria::toJson()
{
    bourne::json object = bourne::json::object();





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

bool
CatalogsProductGroupMultipleStringCriteria::isNegated()
{
	return negated;
}

void
CatalogsProductGroupMultipleStringCriteria::setNegated(bool negated)
{
	this->negated = negated;
}

std::list<std::string>
CatalogsProductGroupMultipleStringCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupMultipleStringCriteria::setValues(std::list<std::string> values)
{
	this->values = values;
}



