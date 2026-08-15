

#include "CatalogsProductGroupMultipleCountriesCriteria.h"

using namespace Tiny;

CatalogsProductGroupMultipleCountriesCriteria::CatalogsProductGroupMultipleCountriesCriteria()
{
	negated = bool(false);
	values = std::list<Country>();
}

CatalogsProductGroupMultipleCountriesCriteria::CatalogsProductGroupMultipleCountriesCriteria(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupMultipleCountriesCriteria::~CatalogsProductGroupMultipleCountriesCriteria()
{

}

void
CatalogsProductGroupMultipleCountriesCriteria::fromJson(std::string jsonObj)
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


        std::list<Country> values_list;
        Country element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
CatalogsProductGroupMultipleCountriesCriteria::toJson()
{
    bourne::json object = bourne::json::object();





    object["negated"] = isNegated();





    std::list<Country> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        Country obj = var;
        values_arr.append(obj.toJson());
    }
    object["values"] = values_arr;




    return object;

}

bool
CatalogsProductGroupMultipleCountriesCriteria::isNegated()
{
	return negated;
}

void
CatalogsProductGroupMultipleCountriesCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}

std::list<Country>
CatalogsProductGroupMultipleCountriesCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupMultipleCountriesCriteria::setValues(std::list <Country> values)
{
	this->values = values;
}



