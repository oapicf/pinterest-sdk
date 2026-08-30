

#include "AdAccountsCountry.h"

using namespace Tiny;

AdAccountsCountry::AdAccountsCountry()
{
	code = null;
	currency = std::string();
	index = float(0);
	name = std::string();
}

AdAccountsCountry::AdAccountsCountry(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountsCountry::~AdAccountsCountry()
{

}

void
AdAccountsCountry::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];




        Country* obj = &code;
		obj->fromJson(value.dump());

    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];



        jsonToValue(&currency, value, "std::string");


    }

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "long");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
AdAccountsCountry::toJson()
{
    bourne::json object = bourne::json::object();






	object["code"] = getCode().toJson();





    object["currency"] = getCurrency();






    object["index"] = getIndex();






    object["name"] = getName();



    return object;

}

Country
AdAccountsCountry::getCode()
{
	return code;
}

void
AdAccountsCountry::setCode(Country code)
{
	this->code = code;
}

std::string
AdAccountsCountry::getCurrency()
{
	return currency;
}

void
AdAccountsCountry::setCurrency(std::string currency)
{
	this->currency = currency;
}

long
AdAccountsCountry::getIndex()
{
	return index;
}

void
AdAccountsCountry::setIndex(long index)
{
	this->index = index;
}

std::string
AdAccountsCountry::getName()
{
	return name;
}

void
AdAccountsCountry::setName(std::string name)
{
	this->name = name;
}



