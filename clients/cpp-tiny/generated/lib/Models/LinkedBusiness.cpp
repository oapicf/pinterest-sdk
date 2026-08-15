

#include "LinkedBusiness.h"

using namespace Tiny;

LinkedBusiness::LinkedBusiness()
{
	image_large_url = std::string();
	image_medium_url = std::string();
	image_small_url = std::string();
	image_xlarge_url = std::string();
	username = std::string();
}

LinkedBusiness::LinkedBusiness(std::string jsonString)
{
	this->fromJson(jsonString);
}

LinkedBusiness::~LinkedBusiness()
{

}

void
LinkedBusiness::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *image_large_urlKey = "image_large_url";

    if(object.has_key(image_large_urlKey))
    {
        bourne::json value = object[image_large_urlKey];



        jsonToValue(&image_large_url, value, "std::string");


    }

    const char *image_medium_urlKey = "image_medium_url";

    if(object.has_key(image_medium_urlKey))
    {
        bourne::json value = object[image_medium_urlKey];



        jsonToValue(&image_medium_url, value, "std::string");


    }

    const char *image_small_urlKey = "image_small_url";

    if(object.has_key(image_small_urlKey))
    {
        bourne::json value = object[image_small_urlKey];



        jsonToValue(&image_small_url, value, "std::string");


    }

    const char *image_xlarge_urlKey = "image_xlarge_url";

    if(object.has_key(image_xlarge_urlKey))
    {
        bourne::json value = object[image_xlarge_urlKey];



        jsonToValue(&image_xlarge_url, value, "std::string");


    }

    const char *usernameKey = "username";

    if(object.has_key(usernameKey))
    {
        bourne::json value = object[usernameKey];



        jsonToValue(&username, value, "std::string");


    }


}

bourne::json
LinkedBusiness::toJson()
{
    bourne::json object = bourne::json::object();





    object["image_large_url"] = getImageLargeUrl();






    object["image_medium_url"] = getImageMediumUrl();






    object["image_small_url"] = getImageSmallUrl();






    object["image_xlarge_url"] = getImageXlargeUrl();






    object["username"] = getUsername();



    return object;

}

std::string
LinkedBusiness::getImageLargeUrl()
{
	return image_large_url;
}

void
LinkedBusiness::setImageLargeUrl(std::string  image_large_url)
{
	this->image_large_url = image_large_url;
}

std::string
LinkedBusiness::getImageMediumUrl()
{
	return image_medium_url;
}

void
LinkedBusiness::setImageMediumUrl(std::string  image_medium_url)
{
	this->image_medium_url = image_medium_url;
}

std::string
LinkedBusiness::getImageSmallUrl()
{
	return image_small_url;
}

void
LinkedBusiness::setImageSmallUrl(std::string  image_small_url)
{
	this->image_small_url = image_small_url;
}

std::string
LinkedBusiness::getImageXlargeUrl()
{
	return image_xlarge_url;
}

void
LinkedBusiness::setImageXlargeUrl(std::string  image_xlarge_url)
{
	this->image_xlarge_url = image_xlarge_url;
}

std::string
LinkedBusiness::getUsername()
{
	return username;
}

void
LinkedBusiness::setUsername(std::string  username)
{
	this->username = username;
}



