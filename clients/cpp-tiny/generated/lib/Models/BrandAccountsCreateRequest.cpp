

#include "Brand_accounts_create_request.h"

using namespace Tiny;

Brand_accounts_create_request::Brand_accounts_create_request()
{
	name = std::string();
	username = std::string();
	country = Country();
	about = std::string();
	website = std::string();
	profile_image = Image_Base64();
}

Brand_accounts_create_request::Brand_accounts_create_request(std::string jsonString)
{
	this->fromJson(jsonString);
}

Brand_accounts_create_request::~Brand_accounts_create_request()
{

}

void
Brand_accounts_create_request::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *usernameKey = "username";

    if(object.has_key(usernameKey))
    {
        bourne::json value = object[usernameKey];



        jsonToValue(&username, value, "std::string");


    }

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];




        Country* obj = &country;
		obj->fromJson(value.dump());

    }

    const char *aboutKey = "about";

    if(object.has_key(aboutKey))
    {
        bourne::json value = object[aboutKey];



        jsonToValue(&about, value, "std::string");


    }

    const char *websiteKey = "website";

    if(object.has_key(websiteKey))
    {
        bourne::json value = object[websiteKey];



        jsonToValue(&website, value, "std::string");


    }

    const char *profile_imageKey = "profile_image";

    if(object.has_key(profile_imageKey))
    {
        bourne::json value = object[profile_imageKey];




        Image_Base64* obj = &profile_image;
		obj->fromJson(value.dump());

    }


}

bourne::json
Brand_accounts_create_request::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["username"] = getUsername();







	object["country"] = getCountry().toJson();





    object["about"] = getAbout();






    object["website"] = getWebsite();







	object["profile_image"] = getProfileImage().toJson();


    return object;

}

std::string
Brand_accounts_create_request::getName()
{
	return name;
}

void
Brand_accounts_create_request::setName(std::string  name)
{
	this->name = name;
}

std::string
Brand_accounts_create_request::getUsername()
{
	return username;
}

void
Brand_accounts_create_request::setUsername(std::string  username)
{
	this->username = username;
}

Country
Brand_accounts_create_request::getCountry()
{
	return country;
}

void
Brand_accounts_create_request::setCountry(Country  country)
{
	this->country = country;
}

std::string
Brand_accounts_create_request::getAbout()
{
	return about;
}

void
Brand_accounts_create_request::setAbout(std::string  about)
{
	this->about = about;
}

std::string
Brand_accounts_create_request::getWebsite()
{
	return website;
}

void
Brand_accounts_create_request::setWebsite(std::string  website)
{
	this->website = website;
}

Image_Base64
Brand_accounts_create_request::getProfileImage()
{
	return profile_image;
}

void
Brand_accounts_create_request::setProfileImage(Image_Base64  profile_image)
{
	this->profile_image = profile_image;
}



