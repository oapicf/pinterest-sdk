

#include "PinMediaSourceImageURL.h"

using namespace Tiny;

PinMediaSourceImageURL::PinMediaSourceImageURL()
{
	is_standard = bool(false);
	source_type = std::string();
	url = std::string();
}

PinMediaSourceImageURL::PinMediaSourceImageURL(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaSourceImageURL::~PinMediaSourceImageURL()
{

}

void
PinMediaSourceImageURL::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *is_standardKey = "is_standard";

    if(object.has_key(is_standardKey))
    {
        bourne::json value = object[is_standardKey];



        jsonToValue(&is_standard, value, "bool");


    }

    const char *source_typeKey = "source_type";

    if(object.has_key(source_typeKey))
    {
        bourne::json value = object[source_typeKey];



        jsonToValue(&source_type, value, "std::string");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
PinMediaSourceImageURL::toJson()
{
    bourne::json object = bourne::json::object();





    object["is_standard"] = isIsStandard();






    object["source_type"] = getSourceType();






    object["url"] = getUrl();



    return object;

}

bool
PinMediaSourceImageURL::isIsStandard()
{
	return is_standard;
}

void
PinMediaSourceImageURL::setIsStandard(bool  is_standard)
{
	this->is_standard = is_standard;
}

std::string
PinMediaSourceImageURL::getSourceType()
{
	return source_type;
}

void
PinMediaSourceImageURL::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}

std::string
PinMediaSourceImageURL::getUrl()
{
	return url;
}

void
PinMediaSourceImageURL::setUrl(std::string  url)
{
	this->url = url;
}



