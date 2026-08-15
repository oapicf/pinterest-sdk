

#include "CatalogsProductGroupMultipleGenderCriteria.h"

using namespace Tiny;

CatalogsProductGroupMultipleGenderCriteria::CatalogsProductGroupMultipleGenderCriteria()
{
	negated = bool(false);
	values = std::list<Gender>();
}

CatalogsProductGroupMultipleGenderCriteria::CatalogsProductGroupMultipleGenderCriteria(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupMultipleGenderCriteria::~CatalogsProductGroupMultipleGenderCriteria()
{

}

void
CatalogsProductGroupMultipleGenderCriteria::fromJson(std::string jsonObj)
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


        std::list<Gender> values_list;
        Gender element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
CatalogsProductGroupMultipleGenderCriteria::toJson()
{
    bourne::json object = bourne::json::object();





    object["negated"] = isNegated();





    std::list<Gender> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        Gender obj = var;
        values_arr.append(obj.toJson());
    }
    object["values"] = values_arr;




    return object;

}

bool
CatalogsProductGroupMultipleGenderCriteria::isNegated()
{
	return negated;
}

void
CatalogsProductGroupMultipleGenderCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}

std::list<Gender>
CatalogsProductGroupMultipleGenderCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupMultipleGenderCriteria::setValues(std::list <Gender> values)
{
	this->values = values;
}



