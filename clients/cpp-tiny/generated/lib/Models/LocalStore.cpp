

#include "LocalStore.h"

using namespace Tiny;

LocalStore::LocalStore()
{
	address_primary = std::string();
	address_secondary = std::string();
	city = std::string();
	country = null;
	created_at = std::string();
	id = std::string();
	latitude = float(0);
	longitude = float(0);
	name = std::string();
	postal_code = std::string();
	region = std::string();
	store_code = std::string();
	updated_at = std::string();
}

LocalStore::LocalStore(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocalStore::~LocalStore()
{

}

void
LocalStore::fromJson(std::string jsonObj)
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

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "std::string");


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

    const char *updated_atKey = "updated_at";

    if(object.has_key(updated_atKey))
    {
        bourne::json value = object[updated_atKey];



        jsonToValue(&updated_at, value, "std::string");


    }


}

bourne::json
LocalStore::toJson()
{
    bourne::json object = bourne::json::object();





    object["address_primary"] = getAddressPrimary();






    object["address_secondary"] = getAddressSecondary();






    object["city"] = getCity();







	object["country"] = getCountry().toJson();





    object["created_at"] = getCreatedAt();






    object["id"] = getId();






    object["latitude"] = getLatitude();






    object["longitude"] = getLongitude();






    object["name"] = getName();






    object["postal_code"] = getPostalCode();






    object["region"] = getRegion();






    object["store_code"] = getStoreCode();






    object["updated_at"] = getUpdatedAt();



    return object;

}

std::string
LocalStore::getAddressPrimary()
{
	return address_primary;
}

void
LocalStore::setAddressPrimary(std::string address_primary)
{
	this->address_primary = address_primary;
}

std::string
LocalStore::getAddressSecondary()
{
	return address_secondary;
}

void
LocalStore::setAddressSecondary(std::string address_secondary)
{
	this->address_secondary = address_secondary;
}

std::string
LocalStore::getCity()
{
	return city;
}

void
LocalStore::setCity(std::string city)
{
	this->city = city;
}

Country
LocalStore::getCountry()
{
	return country;
}

void
LocalStore::setCountry(Country country)
{
	this->country = country;
}

std::string
LocalStore::getCreatedAt()
{
	return created_at;
}

void
LocalStore::setCreatedAt(std::string created_at)
{
	this->created_at = created_at;
}

std::string
LocalStore::getId()
{
	return id;
}

void
LocalStore::setId(std::string id)
{
	this->id = id;
}

float
LocalStore::getLatitude()
{
	return latitude;
}

void
LocalStore::setLatitude(float latitude)
{
	this->latitude = latitude;
}

float
LocalStore::getLongitude()
{
	return longitude;
}

void
LocalStore::setLongitude(float longitude)
{
	this->longitude = longitude;
}

std::string
LocalStore::getName()
{
	return name;
}

void
LocalStore::setName(std::string name)
{
	this->name = name;
}

std::string
LocalStore::getPostalCode()
{
	return postal_code;
}

void
LocalStore::setPostalCode(std::string postal_code)
{
	this->postal_code = postal_code;
}

std::string
LocalStore::getRegion()
{
	return region;
}

void
LocalStore::setRegion(std::string region)
{
	this->region = region;
}

std::string
LocalStore::getStoreCode()
{
	return store_code;
}

void
LocalStore::setStoreCode(std::string store_code)
{
	this->store_code = store_code;
}

std::string
LocalStore::getUpdatedAt()
{
	return updated_at;
}

void
LocalStore::setUpdatedAt(std::string updated_at)
{
	this->updated_at = updated_at;
}



