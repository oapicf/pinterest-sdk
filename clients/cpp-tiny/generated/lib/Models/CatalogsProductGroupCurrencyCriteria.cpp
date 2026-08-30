

#include "CatalogsProductGroupCurrencyCriteria.h"

using namespace Tiny;

CatalogsProductGroupCurrencyCriteria::CatalogsProductGroupCurrencyCriteria()
{
	negated = bool(false);
	values = NonNullableCatalogsCurrency();
}

CatalogsProductGroupCurrencyCriteria::CatalogsProductGroupCurrencyCriteria(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupCurrencyCriteria::~CatalogsProductGroupCurrencyCriteria()
{

}

void
CatalogsProductGroupCurrencyCriteria::fromJson(std::string jsonObj)
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




        NonNullableCatalogsCurrency* obj = &values;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsProductGroupCurrencyCriteria::toJson()
{
    bourne::json object = bourne::json::object();





    object["negated"] = isNegated();







	object["values"] = getValues().toJson();


    return object;

}

bool
CatalogsProductGroupCurrencyCriteria::isNegated()
{
	return negated;
}

void
CatalogsProductGroupCurrencyCriteria::setNegated(bool negated)
{
	this->negated = negated;
}

NonNullableCatalogsCurrency
CatalogsProductGroupCurrencyCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupCurrencyCriteria::setValues(NonNullableCatalogsCurrency values)
{
	this->values = values;
}



