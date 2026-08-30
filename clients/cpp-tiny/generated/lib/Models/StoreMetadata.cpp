

#include "StoreMetadata.h"

using namespace Tiny;

StoreMetadata::StoreMetadata()
{
	geohash = std::string();
	latitude = float(0);
	longitude = float(0);
	store_code = std::string();
	store_id = std::string();
	store_name = std::string();
}

StoreMetadata::StoreMetadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

StoreMetadata::~StoreMetadata()
{

}

void
StoreMetadata::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *geohashKey = "geohash";

    if(object.has_key(geohashKey))
    {
        bourne::json value = object[geohashKey];



        jsonToValue(&geohash, value, "std::string");


    }

    const char *latitudeKey = "latitude";

    if(object.has_key(latitudeKey))
    {
        bourne::json value = object[latitudeKey];



        jsonToValue(&latitude, value, "double");


    }

    const char *longitudeKey = "longitude";

    if(object.has_key(longitudeKey))
    {
        bourne::json value = object[longitudeKey];



        jsonToValue(&longitude, value, "double");


    }

    const char *store_codeKey = "store_code";

    if(object.has_key(store_codeKey))
    {
        bourne::json value = object[store_codeKey];



        jsonToValue(&store_code, value, "std::string");


    }

    const char *store_idKey = "store_id";

    if(object.has_key(store_idKey))
    {
        bourne::json value = object[store_idKey];



        jsonToValue(&store_id, value, "std::string");


    }

    const char *store_nameKey = "store_name";

    if(object.has_key(store_nameKey))
    {
        bourne::json value = object[store_nameKey];



        jsonToValue(&store_name, value, "std::string");


    }


}

bourne::json
StoreMetadata::toJson()
{
    bourne::json object = bourne::json::object();





    object["geohash"] = getGeohash();






    object["latitude"] = getLatitude();






    object["longitude"] = getLongitude();






    object["store_code"] = getStoreCode();






    object["store_id"] = getStoreId();






    object["store_name"] = getStoreName();



    return object;

}

std::string
StoreMetadata::getGeohash()
{
	return geohash;
}

void
StoreMetadata::setGeohash(std::string geohash)
{
	this->geohash = geohash;
}

double
StoreMetadata::getLatitude()
{
	return latitude;
}

void
StoreMetadata::setLatitude(double latitude)
{
	this->latitude = latitude;
}

double
StoreMetadata::getLongitude()
{
	return longitude;
}

void
StoreMetadata::setLongitude(double longitude)
{
	this->longitude = longitude;
}

std::string
StoreMetadata::getStoreCode()
{
	return store_code;
}

void
StoreMetadata::setStoreCode(std::string store_code)
{
	this->store_code = store_code;
}

std::string
StoreMetadata::getStoreId()
{
	return store_id;
}

void
StoreMetadata::setStoreId(std::string store_id)
{
	this->store_id = store_id;
}

std::string
StoreMetadata::getStoreName()
{
	return store_name;
}

void
StoreMetadata::setStoreName(std::string store_name)
{
	this->store_name = store_name;
}



