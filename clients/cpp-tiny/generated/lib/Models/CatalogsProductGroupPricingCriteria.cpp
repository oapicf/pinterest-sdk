

#include "CatalogsProductGroupPricingCriteria.h"

using namespace Tiny;

CatalogsProductGroupPricingCriteria::CatalogsProductGroupPricingCriteria()
{
	inclusion = bool(false);
	negated = bool(false);
	values = float(0);
}

CatalogsProductGroupPricingCriteria::CatalogsProductGroupPricingCriteria(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupPricingCriteria::~CatalogsProductGroupPricingCriteria()
{

}

void
CatalogsProductGroupPricingCriteria::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *inclusionKey = "inclusion";

    if(object.has_key(inclusionKey))
    {
        bourne::json value = object[inclusionKey];



        jsonToValue(&inclusion, value, "bool");


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



        jsonToValue(&values, value, "long");


    }


}

bourne::json
CatalogsProductGroupPricingCriteria::toJson()
{
    bourne::json object = bourne::json::object();





    object["inclusion"] = isInclusion();






    object["negated"] = isNegated();






    object["values"] = getValues();



    return object;

}

bool
CatalogsProductGroupPricingCriteria::isInclusion()
{
	return inclusion;
}

void
CatalogsProductGroupPricingCriteria::setInclusion(bool  inclusion)
{
	this->inclusion = inclusion;
}

bool
CatalogsProductGroupPricingCriteria::isNegated()
{
	return negated;
}

void
CatalogsProductGroupPricingCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}

long
CatalogsProductGroupPricingCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupPricingCriteria::setValues(long  values)
{
	this->values = values;
}



