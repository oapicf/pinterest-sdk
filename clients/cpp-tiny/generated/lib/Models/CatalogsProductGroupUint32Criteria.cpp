

#include "CatalogsProductGroupUint32Criteria.h"

using namespace Tiny;

CatalogsProductGroupUint32Criteria::CatalogsProductGroupUint32Criteria()
{
	negated = bool(false);
	r_operator = std::string();
	value = int(0);
}

CatalogsProductGroupUint32Criteria::CatalogsProductGroupUint32Criteria(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupUint32Criteria::~CatalogsProductGroupUint32Criteria()
{

}

void
CatalogsProductGroupUint32Criteria::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *negatedKey = "negated";

    if(object.has_key(negatedKey))
    {
        bourne::json value = object[negatedKey];



        jsonToValue(&negated, value, "bool");


    }

    const char *r_operatorKey = "operator";

    if(object.has_key(r_operatorKey))
    {
        bourne::json value = object[r_operatorKey];



        jsonToValue(&r_operator, value, "std::string");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "int");


    }


}

bourne::json
CatalogsProductGroupUint32Criteria::toJson()
{
    bourne::json object = bourne::json::object();





    object["negated"] = isNegated();






    object["r_operator"] = getROperator();






    object["value"] = getValue();



    return object;

}

bool
CatalogsProductGroupUint32Criteria::isNegated()
{
	return negated;
}

void
CatalogsProductGroupUint32Criteria::setNegated(bool  negated)
{
	this->negated = negated;
}

std::string
CatalogsProductGroupUint32Criteria::getROperator()
{
	return r_operator;
}

void
CatalogsProductGroupUint32Criteria::setROperator(std::string  r_operator)
{
	this->r_operator = r_operator;
}

int
CatalogsProductGroupUint32Criteria::getValue()
{
	return value;
}

void
CatalogsProductGroupUint32Criteria::setValue(int  value)
{
	this->value = value;
}



