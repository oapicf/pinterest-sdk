

#include "LocalStoreBatchUpdate.h"

using namespace Tiny;

LocalStoreBatchUpdate::LocalStoreBatchUpdate()
{
	address_primary = std::string();
	address_secondary = std::string();
	city = std::string();
	country = null;
	id = std::string();
	latitude = float(0);
	longitude = float(0);
	name = std::string();
	postal_code = std::string();
	region = std::string();
	store_code = std::string();
}

LocalStoreBatchUpdate::LocalStoreBatchUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocalStoreBatchUpdate::~LocalStoreBatchUpdate()
{

}

void
LocalStoreBatchUpdate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *address_primaryKey = "address_primary";

    if(object.has_key(address_primaryKey))
    {
        bourne::json value = object[address_primaryKey];



        jsonToValue(&address_primary, value, "std::string");


    }

    const char *address_secondaryKey = "address_secondary";

    if(object.has_key(address_secondaryKey))
    {
        bourne::json value = object[address_secondaryKey];



        jsonToValue(&address_secondary, value, "std::string");


    }

    const char *cityKey = "city";

    if(object.has_key(cityKey))
    {
        bourne::json value = object[cityKey];



        jsonToValue(&city, value, "std::string");


    }

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];




        Country* obj = &country;
		obj->fromJson(value.dump());

    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *latitudeKey = "latitude";

    if(object.has_key(latitudeKey))
    {
        bourne::json value = object[latitudeKey];



        jsonToValue(&latitude, value, "float");


    }

    const char *longitudeKey = "longitude";

    if(object.has_key(longitudeKey))
    {
        bourne::json value = object[longitudeKey];



        jsonToValue(&longitude, value, "float");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *postal_codeKey = "postal_code";

    if(object.has_key(postal_codeKey))
    {
        bourne::json value = object[postal_codeKey];



        jsonToValue(&postal_code, value, "std::string");


    }

    const char *regionKey = "region";

    if(object.has_key(regionKey))
    {
        bourne::json value = object[regionKey];



        jsonToValue(&region, value, "std::string");


    }

    const char *store_codeKey = "store_code";

    if(object.has_key(store_codeKey))
    {
        bourne::json value = object[store_codeKey];



        jsonToValue(&store_code, value, "std::string");


    }


}

bourne::json
LocalStoreBatchUpdate::toJson()
{
    bourne::json object = bourne::json::object();





    object["address_primary"] = getAddressPrimary();






    object["address_secondary"] = getAddressSecondary();






    object["city"] = getCity();







	object["country"] = getCountry().toJson();





    object["id"] = getId();






    object["latitude"] = getLatitude();






    object["longitude"] = getLongitude();






    object["name"] = getName();






    object["postal_code"] = getPostalCode();






    object["region"] = getRegion();






    object["store_code"] = getStoreCode();



    return object;

}

std::string
LocalStoreBatchUpdate::getAddressPrimary()
{
	return address_primary;
}

void
LocalStoreBatchUpdate::setAddressPrimary(std::string address_primary)
{
	this->address_primary = address_primary;
}

std::string
LocalStoreBatchUpdate::getAddressSecondary()
{
	return address_secondary;
}

void
LocalStoreBatchUpdate::setAddressSecondary(std::string address_secondary)
{
	this->address_secondary = address_secondary;
}

std::string
LocalStoreBatchUpdate::getCity()
{
	return city;
}

void
LocalStoreBatchUpdate::setCity(std::string city)
{
	this->city = city;
}

Country
LocalStoreBatchUpdate::getCountry()
{
	return country;
}

void
LocalStoreBatchUpdate::setCountry(Country country)
{
	this->country = country;
}

std::string
LocalStoreBatchUpdate::getId()
{
	return id;
}

void
LocalStoreBatchUpdate::setId(std::string id)
{
	this->id = id;
}

float
LocalStoreBatchUpdate::getLatitude()
{
	return latitude;
}

void
LocalStoreBatchUpdate::setLatitude(float latitude)
{
	this->latitude = latitude;
}

float
LocalStoreBatchUpdate::getLongitude()
{
	return longitude;
}

void
LocalStoreBatchUpdate::setLongitude(float longitude)
{
	this->longitude = longitude;
}

std::string
LocalStoreBatchUpdate::getName()
{
	return name;
}

void
LocalStoreBatchUpdate::setName(std::string name)
{
	this->name = name;
}

std::string
LocalStoreBatchUpdate::getPostalCode()
{
	return postal_code;
}

void
LocalStoreBatchUpdate::setPostalCode(std::string postal_code)
{
	this->postal_code = postal_code;
}

std::string
LocalStoreBatchUpdate::getRegion()
{
	return region;
}

void
LocalStoreBatchUpdate::setRegion(std::string region)
{
	this->region = region;
}

std::string
LocalStoreBatchUpdate::getStoreCode()
{
	return store_code;
}

void
LocalStoreBatchUpdate::setStoreCode(std::string store_code)
{
	this->store_code = store_code;
}



