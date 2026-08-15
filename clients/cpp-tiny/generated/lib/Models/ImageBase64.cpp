

#include "Image_Base64.h"

using namespace Tiny;

Image_Base64::Image_Base64()
{
	content_type = std::string();
	data = std::string();
}

Image_Base64::Image_Base64(std::string jsonString)
{
	this->fromJson(jsonString);
}

Image_Base64::~Image_Base64()
{

}

void
Image_Base64::fromJson(std::string jsonObj)
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
Image_Base64::toJson()
{
    bourne::json object = bourne::json::object();





    object["content_type"] = getContentType();






    object["data"] = getData();



    return object;

}

std::string
Image_Base64::getContentType()
{
	return content_type;
}

void
Image_Base64::setContentType(std::string  content_type)
{
	this->content_type = content_type;
}

std::string
Image_Base64::getData()
{
	return data;
}

void
Image_Base64::setData(std::string  data)
{
	this->data = data;
}



