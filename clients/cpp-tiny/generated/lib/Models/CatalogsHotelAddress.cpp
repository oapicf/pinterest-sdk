

#include "CatalogsHotelAddress.h"

using namespace Tiny;

CatalogsHotelAddress::CatalogsHotelAddress()
{
	addr1 = std::string();
	city = std::string();
	country = std::string();
	postal_code = std::string();
	region = std::string();
}

CatalogsHotelAddress::CatalogsHotelAddress(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelAddress::~CatalogsHotelAddress()
{

}

void
CatalogsHotelAddress::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *addr1Key = "addr1";

    if(object.has_key(addr1Key))
    {
        bourne::json value = object[addr1Key];



        jsonToValue(&addr1, value, "std::string");


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



        jsonToValue(&country, value, "std::string");


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


}

bourne::json
CatalogsHotelAddress::toJson()
{
    bourne::json object = bourne::json::object();





    object["addr1"] = getAddr1();






    object["city"] = getCity();






    object["country"] = getCountry();






    object["postal_code"] = getPostalCode();






    object["region"] = getRegion();



    return object;

}

std::string
CatalogsHotelAddress::getAddr1()
{
	return addr1;
}

void
CatalogsHotelAddress::setAddr1(std::string addr1)
{
	this->addr1 = addr1;
}

std::string
CatalogsHotelAddress::getCity()
{
	return city;
}

void
CatalogsHotelAddress::setCity(std::string city)
{
	this->city = city;
}

std::string
CatalogsHotelAddress::getCountry()
{
	return country;
}

void
CatalogsHotelAddress::setCountry(std::string country)
{
	this->country = country;
}

std::string
CatalogsHotelAddress::getPostalCode()
{
	return postal_code;
}

void
CatalogsHotelAddress::setPostalCode(std::string postal_code)
{
	this->postal_code = postal_code;
}

std::string
CatalogsHotelAddress::getRegion()
{
	return region;
}

void
CatalogsHotelAddress::setRegion(std::string region)
{
	this->region = region;
}



