

#include "Catalogs_product_group_pricing_currency_criteria.h"

using namespace Tiny;

Catalogs_product_group_pricing_currency_criteria::Catalogs_product_group_pricing_currency_criteria()
{
	currency = NonNullableCatalogsCurrency();
	negated = bool(false);
	r_operator = std::string();
	value = float(0);
}

Catalogs_product_group_pricing_currency_criteria::Catalogs_product_group_pricing_currency_criteria(std::string jsonString)
{
	this->fromJson(jsonString);
}

Catalogs_product_group_pricing_currency_criteria::~Catalogs_product_group_pricing_currency_criteria()
{

}

void
Catalogs_product_group_pricing_currency_criteria::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        NonNullableCatalogsCurrency* obj = &currency;
		obj->fromJson(value.dump());

    }

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



        jsonToValue(&value, value, "long");


    }


}

bourne::json
Catalogs_product_group_pricing_currency_criteria::toJson()
{
    bourne::json object = bourne::json::object();






	object["currency"] = getCurrency().toJson();





    object["negated"] = isNegated();






    object["r_operator"] = getROperator();






    object["value"] = getValue();



    return object;

}

NonNullableCatalogsCurrency
Catalogs_product_group_pricing_currency_criteria::getCurrency()
{
	return currency;
}

void
Catalogs_product_group_pricing_currency_criteria::setCurrency(NonNullableCatalogsCurrency  currency)
{
	this->currency = currency;
}

bool
Catalogs_product_group_pricing_currency_criteria::isNegated()
{
	return negated;
}

void
Catalogs_product_group_pricing_currency_criteria::setNegated(bool  negated)
{
	this->negated = negated;
}

std::string
Catalogs_product_group_pricing_currency_criteria::getROperator()
{
	return r_operator;
}

void
Catalogs_product_group_pricing_currency_criteria::setROperator(std::string  r_operator)
{
	this->r_operator = r_operator;
}

long
Catalogs_product_group_pricing_currency_criteria::getValue()
{
	return value;
}

void
Catalogs_product_group_pricing_currency_criteria::setValue(long  value)
{
	this->value = value;
}



