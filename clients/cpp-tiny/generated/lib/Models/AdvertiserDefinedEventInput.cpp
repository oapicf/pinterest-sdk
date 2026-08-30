

#include "AdvertiserDefinedEventInput.h"

using namespace Tiny;

AdvertiserDefinedEventInput::AdvertiserDefinedEventInput()
{
	mapped_conversion_type = null;
	name = std::string();
}

AdvertiserDefinedEventInput::AdvertiserDefinedEventInput(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvertiserDefinedEventInput::~AdvertiserDefinedEventInput()
{

}

void
AdvertiserDefinedEventInput::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mapped_conversion_typeKey = "mapped_conversion_type";

    if(object.has_key(mapped_conversion_typeKey))
    {
        bourne::json value = object[mapped_conversion_typeKey];




        AdvertiserDefinedEventMappingType* obj = &mapped_conversion_type;
		obj->fromJson(value.dump());

    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
AdvertiserDefinedEventInput::toJson()
{
    bourne::json object = bourne::json::object();






	object["mapped_conversion_type"] = getMappedConversionType().toJson();





    object["name"] = getName();



    return object;

}

AdvertiserDefinedEventMappingType
AdvertiserDefinedEventInput::getMappedConversionType()
{
	return mapped_conversion_type;
}

void
AdvertiserDefinedEventInput::setMappedConversionType(AdvertiserDefinedEventMappingType mapped_conversion_type)
{
	this->mapped_conversion_type = mapped_conversion_type;
}

std::string
AdvertiserDefinedEventInput::getName()
{
	return name;
}

void
AdvertiserDefinedEventInput::setName(std::string name)
{
	this->name = name;
}



