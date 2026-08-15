

#include "AdAccountCreate.h"

using namespace Tiny;

AdAccountCreate::AdAccountCreate()
{
	country = Country();
	currency = Currency();
	name = std::string();
	owner_user_id = std::string();
}

AdAccountCreate::AdAccountCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountCreate::~AdAccountCreate()
{

}

void
AdAccountCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];




        Country* obj = &country;
		obj->fromJson(value.dump());

    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        Currency* obj = &currency;
		obj->fromJson(value.dump());

    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *owner_user_idKey = "owner_user_id";

    if(object.has_key(owner_user_idKey))
    {
        bourne::json value = object[owner_user_idKey];



        jsonToValue(&owner_user_id, value, "std::string");


    }


}

bourne::json
AdAccountCreate::toJson()
{
    bourne::json object = bourne::json::object();






	object["country"] = getCountry().toJson();






	object["currency"] = getCurrency().toJson();





    object["name"] = getName();






    object["owner_user_id"] = getOwnerUserId();



    return object;

}

Country
AdAccountCreate::getCountry()
{
	return country;
}

void
AdAccountCreate::setCountry(Country  country)
{
	this->country = country;
}

Currency
AdAccountCreate::getCurrency()
{
	return currency;
}

void
AdAccountCreate::setCurrency(Currency  currency)
{
	this->currency = currency;
}

std::string
AdAccountCreate::getName()
{
	return name;
}

void
AdAccountCreate::setName(std::string  name)
{
	this->name = name;
}

std::string
AdAccountCreate::getOwnerUserId()
{
	return owner_user_id;
}

void
AdAccountCreate::setOwnerUserId(std::string  owner_user_id)
{
	this->owner_user_id = owner_user_id;
}



