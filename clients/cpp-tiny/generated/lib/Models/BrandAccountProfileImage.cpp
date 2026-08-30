

#include "BrandAccountProfileImage.h"

using namespace Tiny;

BrandAccountProfileImage::BrandAccountProfileImage()
{
	content_type = std::string();
	data = std::string();
}

BrandAccountProfileImage::BrandAccountProfileImage(std::string jsonString)
{
	this->fromJson(jsonString);
}

BrandAccountProfileImage::~BrandAccountProfileImage()
{

}

void
BrandAccountProfileImage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *content_typeKey = "content_type";

    if(object.has_key(content_typeKey))
    {
        bourne::json value = object[content_typeKey];



        jsonToValue(&content_type, value, "std::string");


    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];



        jsonToValue(&data, value, "std::string");


    }


}

bourne::json
BrandAccountProfileImage::toJson()
{
    bourne::json object = bourne::json::object();





    object["content_type"] = getContentType();






    object["data"] = getData();



    return object;

}

std::string
BrandAccountProfileImage::getContentType()
{
	return content_type;
}

void
BrandAccountProfileImage::setContentType(std::string content_type)
{
	this->content_type = content_type;
}

std::string
BrandAccountProfileImage::getData()
{
	return data;
}

void
BrandAccountProfileImage::setData(std::string data)
{
	this->data = data;
}



