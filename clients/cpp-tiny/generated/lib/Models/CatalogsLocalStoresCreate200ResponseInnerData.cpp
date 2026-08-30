

#include "Catalogs_local_stores_create_200_response_inner_data.h"

using namespace Tiny;

Catalogs_local_stores_create_200_response_inner_data::Catalogs_local_stores_create_200_response_inner_data()
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
	exceptions = Pinterest.Lib.Error();
}

Catalogs_local_stores_create_200_response_inner_data::Catalogs_local_stores_create_200_response_inner_data(std::string jsonString)
{
	this->fromJson(jsonString);
}

Catalogs_local_stores_create_200_response_inner_data::~Catalogs_local_stores_create_200_response_inner_data()
{

}

void
Catalogs_local_stores_create_200_response_inner_data::fromJson(std::string jsonObj)
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

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];




        Pinterest.Lib.Error* obj = &exceptions;
		obj->fromJson(value.dump());

    }


}

bourne::json
Catalogs_local_stores_create_200_response_inner_data::toJson()
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







	object["exceptions"] = getExceptions().toJson();


    return object;

}

std::string
Catalogs_local_stores_create_200_response_inner_data::getAddressPrimary()
{
	return address_primary;
}

void
Catalogs_local_stores_create_200_response_inner_data::setAddressPrimary(std::string address_primary)
{
	this->address_primary = address_primary;
}

std::string
Catalogs_local_stores_create_200_response_inner_data::getAddressSecondary()
{
	return address_secondary;
}

void
Catalogs_local_stores_create_200_response_inner_data::setAddressSecondary(std::string address_secondary)
{
	this->address_secondary = address_secondary;
}

std::string
Catalogs_local_stores_create_200_response_inner_data::getCity()
{
	return city;
}

void
Catalogs_local_stores_create_200_response_inner_data::setCity(std::string city)
{
	this->city = city;
}

Country
Catalogs_local_stores_create_200_response_inner_data::getCountry()
{
	return country;
}

void
Catalogs_local_stores_create_200_response_inner_data::setCountry(Country country)
{
	this->country = country;
}

std::string
Catalogs_local_stores_create_200_response_inner_data::getCreatedAt()
{
	return created_at;
}

void
Catalogs_local_stores_create_200_response_inner_data::setCreatedAt(std::string created_at)
{
	this->created_at = created_at;
}

std::string
Catalogs_local_stores_create_200_response_inner_data::getId()
{
	return id;
}

void
Catalogs_local_stores_create_200_response_inner_data::setId(std::string id)
{
	this->id = id;
}

float
Catalogs_local_stores_create_200_response_inner_data::getLatitude()
{
	return latitude;
}

void
Catalogs_local_stores_create_200_response_inner_data::setLatitude(float latitude)
{
	this->latitude = latitude;
}

float
Catalogs_local_stores_create_200_response_inner_data::getLongitude()
{
	return longitude;
}

void
Catalogs_local_stores_create_200_response_inner_data::setLongitude(float longitude)
{
	this->longitude = longitude;
}

std::string
Catalogs_local_stores_create_200_response_inner_data::getName()
{
	return name;
}

void
Catalogs_local_stores_create_200_response_inner_data::setName(std::string name)
{
	this->name = name;
}

std::string
Catalogs_local_stores_create_200_response_inner_data::getPostalCode()
{
	return postal_code;
}

void
Catalogs_local_stores_create_200_response_inner_data::setPostalCode(std::string postal_code)
{
	this->postal_code = postal_code;
}

std::string
Catalogs_local_stores_create_200_response_inner_data::getRegion()
{
	return region;
}

void
Catalogs_local_stores_create_200_response_inner_data::setRegion(std::string region)
{
	this->region = region;
}

std::string
Catalogs_local_stores_create_200_response_inner_data::getStoreCode()
{
	return store_code;
}

void
Catalogs_local_stores_create_200_response_inner_data::setStoreCode(std::string store_code)
{
	this->store_code = store_code;
}

std::string
Catalogs_local_stores_create_200_response_inner_data::getUpdatedAt()
{
	return updated_at;
}

void
Catalogs_local_stores_create_200_response_inner_data::setUpdatedAt(std::string updated_at)
{
	this->updated_at = updated_at;
}

Pinterest.Lib.Error
Catalogs_local_stores_create_200_response_inner_data::getExceptions()
{
	return exceptions;
}

void
Catalogs_local_stores_create_200_response_inner_data::setExceptions(Pinterest.Lib.Error exceptions)
{
	this->exceptions = exceptions;
}



