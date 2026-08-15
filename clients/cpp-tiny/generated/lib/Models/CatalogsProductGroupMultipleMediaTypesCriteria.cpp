

#include "CatalogsProductGroupMultipleMediaTypesCriteria.h"

using namespace Tiny;

CatalogsProductGroupMultipleMediaTypesCriteria::CatalogsProductGroupMultipleMediaTypesCriteria()
{
	negated = bool(false);
	values = std::list<MediaType>();
}

CatalogsProductGroupMultipleMediaTypesCriteria::CatalogsProductGroupMultipleMediaTypesCriteria(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupMultipleMediaTypesCriteria::~CatalogsProductGroupMultipleMediaTypesCriteria()
{

}

void
CatalogsProductGroupMultipleMediaTypesCriteria::fromJson(std::string jsonObj)
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


        std::list<MediaType> values_list;
        MediaType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
CatalogsProductGroupMultipleMediaTypesCriteria::toJson()
{
    bourne::json object = bourne::json::object();





    object["negated"] = isNegated();





    std::list<MediaType> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        MediaType obj = var;
        values_arr.append(obj.toJson());
    }
    object["values"] = values_arr;




    return object;

}

bool
CatalogsProductGroupMultipleMediaTypesCriteria::isNegated()
{
	return negated;
}

void
CatalogsProductGroupMultipleMediaTypesCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}

std::list<MediaType>
CatalogsProductGroupMultipleMediaTypesCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupMultipleMediaTypesCriteria::setValues(std::list <MediaType> values)
{
	this->values = values;
}



