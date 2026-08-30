

#include "PriceFilterPrice.h"

using namespace Tiny;

PriceFilterPrice::PriceFilterPrice()
{
	currency = NonNullableCatalogsCurrency();
	negated = bool(false);
	r_operator = NumericFilterOperatorType();
	value = float(0);
}

PriceFilterPrice::PriceFilterPrice(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceFilterPrice::~PriceFilterPrice()
{

}

void
PriceFilterPrice::fromJson(std::string jsonObj)
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




        NumericFilterOperatorType* obj = &r_operator;
		obj->fromJson(value.dump());

    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "long");


    }


}

bourne::json
PriceFilterPrice::toJson()
{
    bourne::json object = bourne::json::object();






	object["currency"] = getCurrency().toJson();





    object["negated"] = isNegated();







	object["r_operator"] = getROperator().toJson();





    object["value"] = getValue();



    return object;

}

NonNullableCatalogsCurrency
PriceFilterPrice::getCurrency()
{
	return currency;
}

void
PriceFilterPrice::setCurrency(NonNullableCatalogsCurrency currency)
{
	this->currency = currency;
}

bool
PriceFilterPrice::isNegated()
{
	return negated;
}

void
PriceFilterPrice::setNegated(bool negated)
{
	this->negated = negated;
}

NumericFilterOperatorType
PriceFilterPrice::getROperator()
{
	return r_operator;
}

void
PriceFilterPrice::setROperator(NumericFilterOperatorType r_operator)
{
	this->r_operator = r_operator;
}

long
PriceFilterPrice::getValue()
{
	return value;
}

void
PriceFilterPrice::setValue(long value)
{
	this->value = value;
}



