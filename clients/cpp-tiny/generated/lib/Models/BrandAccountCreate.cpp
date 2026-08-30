

#include "BrandAccountCreate.h"

using namespace Tiny;

BrandAccountCreate::BrandAccountCreate()
{
	about = std::string();
	country = Country();
	name = std::string();
	profile_image = BrandAccountProfileImage();
	username = std::string();
	website = std::string();
}

BrandAccountCreate::BrandAccountCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

BrandAccountCreate::~BrandAccountCreate()
{

}

void
BrandAccountCreate::fromJson(std::string jsonObj)
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




        BrandAccountProfileImage* obj = &profile_image;
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
BrandAccountCreate::toJson()
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
BrandAccountCreate::getAbout()
{
	return about;
}

void
BrandAccountCreate::setAbout(std::string about)
{
	this->about = about;
}

Country
BrandAccountCreate::getCountry()
{
	return country;
}

void
BrandAccountCreate::setCountry(Country country)
{
	this->country = country;
}

std::string
BrandAccountCreate::getName()
{
	return name;
}

void
BrandAccountCreate::setName(std::string name)
{
	this->name = name;
}

BrandAccountProfileImage
BrandAccountCreate::getProfileImage()
{
	return profile_image;
}

void
BrandAccountCreate::setProfileImage(BrandAccountProfileImage profile_image)
{
	this->profile_image = profile_image;
}

std::string
BrandAccountCreate::getUsername()
{
	return username;
}

void
BrandAccountCreate::setUsername(std::string username)
{
	this->username = username;
}

std::string
BrandAccountCreate::getWebsite()
{
	return website;
}

void
BrandAccountCreate::setWebsite(std::string website)
{
	this->website = website;
}



