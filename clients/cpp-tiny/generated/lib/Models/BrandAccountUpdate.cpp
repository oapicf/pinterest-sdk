

#include "BrandAccountUpdate.h"

using namespace Tiny;

BrandAccountUpdate::BrandAccountUpdate()
{
	about = std::string();
	country = Country();
	name = std::string();
	profile_image = BrandAccountProfileImageUpdate();
	username = std::string();
	website = std::string();
}

BrandAccountUpdate::BrandAccountUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

BrandAccountUpdate::~BrandAccountUpdate()
{

}

void
BrandAccountUpdate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aboutKey = "about";

    if(object.has_key(aboutKey))
    {
        bourne::json value = object[aboutKey];



        jsonToValue(&about, value, "std::string");


    }

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];




        Country* obj = &country;
		obj->fromJson(value.dump());

    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *profile_imageKey = "profile_image";

    if(object.has_key(profile_imageKey))
    {
        bourne::json value = object[profile_imageKey];




        BrandAccountProfileImageUpdate* obj = &profile_image;
		obj->fromJson(value.dump());

    }

    const char *usernameKey = "username";

    if(object.has_key(usernameKey))
    {
        bourne::json value = object[usernameKey];



        jsonToValue(&username, value, "std::string");


    }

    const char *websiteKey = "website";

    if(object.has_key(websiteKey))
    {
        bourne::json value = object[websiteKey];



        jsonToValue(&website, value, "std::string");


    }


}

bourne::json
BrandAccountUpdate::toJson()
{
    bourne::json object = bourne::json::object();





    object["about"] = getAbout();







	object["country"] = getCountry().toJson();





    object["name"] = getName();







	object["profile_image"] = getProfileImage().toJson();





    object["username"] = getUsername();






    object["website"] = getWebsite();



    return object;

}

std::string
BrandAccountUpdate::getAbout()
{
	return about;
}

void
BrandAccountUpdate::setAbout(std::string about)
{
	this->about = about;
}

Country
BrandAccountUpdate::getCountry()
{
	return country;
}

void
BrandAccountUpdate::setCountry(Country country)
{
	this->country = country;
}

std::string
BrandAccountUpdate::getName()
{
	return name;
}

void
BrandAccountUpdate::setName(std::string name)
{
	this->name = name;
}

BrandAccountProfileImageUpdate
BrandAccountUpdate::getProfileImage()
{
	return profile_image;
}

void
BrandAccountUpdate::setProfileImage(BrandAccountProfileImageUpdate profile_image)
{
	this->profile_image = profile_image;
}

std::string
BrandAccountUpdate::getUsername()
{
	return username;
}

void
BrandAccountUpdate::setUsername(std::string username)
{
	this->username = username;
}

std::string
BrandAccountUpdate::getWebsite()
{
	return website;
}

void
BrandAccountUpdate::setWebsite(std::string website)
{
	this->website = website;
}



