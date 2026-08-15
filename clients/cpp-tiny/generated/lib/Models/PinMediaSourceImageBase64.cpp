

#include "PinMediaSourceImageBase64.h"

using namespace Tiny;

PinMediaSourceImageBase64::PinMediaSourceImageBase64()
{
	content_type = ContentType();
	data = std::string();
	is_standard = bool(false);
	source_type = std::string();
}

PinMediaSourceImageBase64::PinMediaSourceImageBase64(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaSourceImageBase64::~PinMediaSourceImageBase64()
{

}

void
PinMediaSourceImageBase64::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *content_typeKey = "content_type";

    if(object.has_key(content_typeKey))
    {
        bourne::json value = object[content_typeKey];




        ContentType* obj = &content_type;
		obj->fromJson(value.dump());

    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];



        jsonToValue(&data, value, "std::string");


    }

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


}

bourne::json
PinMediaSourceImageBase64::toJson()
{
    bourne::json object = bourne::json::object();






	object["content_type"] = getContentType().toJson();





    object["data"] = getData();






    object["is_standard"] = isIsStandard();






    object["source_type"] = getSourceType();



    return object;

}

ContentType
PinMediaSourceImageBase64::getContentType()
{
	return content_type;
}

void
PinMediaSourceImageBase64::setContentType(ContentType  content_type)
{
	this->content_type = content_type;
}

std::string
PinMediaSourceImageBase64::getData()
{
	return data;
}

void
PinMediaSourceImageBase64::setData(std::string  data)
{
	this->data = data;
}

bool
PinMediaSourceImageBase64::isIsStandard()
{
	return is_standard;
}

void
PinMediaSourceImageBase64::setIsStandard(bool  is_standard)
{
	this->is_standard = is_standard;
}

std::string
PinMediaSourceImageBase64::getSourceType()
{
	return source_type;
}

void
PinMediaSourceImageBase64::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}



