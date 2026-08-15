

#include "AdAccountsCountryResponseData.h"

using namespace Tiny;

AdAccountsCountryResponseData::AdAccountsCountryResponseData()
{
	code = AdCountry();
	currency = std::string();
	index = float(0);
	name = std::string();
}

AdAccountsCountryResponseData::AdAccountsCountryResponseData(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountsCountryResponseData::~AdAccountsCountryResponseData()
{

}

void
AdAccountsCountryResponseData::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];




        AdCountry* obj = &code;
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
AdAccountsCountryResponseData::toJson()
{
    bourne::json object = bourne::json::object();






	object["code"] = getCode().toJson();





    object["currency"] = getCurrency();






    object["index"] = getIndex();






    object["name"] = getName();



    return object;

}

AdCountry
AdAccountsCountryResponseData::getCode()
{
	return code;
}

void
AdAccountsCountryResponseData::setCode(AdCountry  code)
{
	this->code = code;
}

std::string
AdAccountsCountryResponseData::getCurrency()
{
	return currency;
}

void
AdAccountsCountryResponseData::setCurrency(std::string  currency)
{
	this->currency = currency;
}

long
AdAccountsCountryResponseData::getIndex()
{
	return index;
}

void
AdAccountsCountryResponseData::setIndex(long  index)
{
	this->index = index;
}

std::string
AdAccountsCountryResponseData::getName()
{
	return name;
}

void
AdAccountsCountryResponseData::setName(std::string  name)
{
	this->name = name;
}



