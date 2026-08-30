

#include "BrandAccountProfileImageUpdate.h"

using namespace Tiny;

BrandAccountProfileImageUpdate::BrandAccountProfileImageUpdate()
{
	content_type = std::string();
	data = std::string();
}

BrandAccountProfileImageUpdate::BrandAccountProfileImageUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

BrandAccountProfileImageUpdate::~BrandAccountProfileImageUpdate()
{

}

void
BrandAccountProfileImageUpdate::fromJson(std::string jsonObj)
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
BrandAccountProfileImageUpdate::toJson()
{
    bourne::json object = bourne::json::object();





    object["content_type"] = getContentType();






    object["data"] = getData();



    return object;

}

std::string
BrandAccountProfileImageUpdate::getContentType()
{
	return content_type;
}

void
BrandAccountProfileImageUpdate::setContentType(std::string content_type)
{
	this->content_type = content_type;
}

std::string
BrandAccountProfileImageUpdate::getData()
{
	return data;
}

void
BrandAccountProfileImageUpdate::setData(std::string data)
{
	this->data = data;
}



