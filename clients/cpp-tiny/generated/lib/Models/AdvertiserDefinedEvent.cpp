

#include "AdvertiserDefinedEvent.h"

using namespace Tiny;

AdvertiserDefinedEvent::AdvertiserDefinedEvent()
{
	mapped_conversion_type = null;
	name = std::string();
}

AdvertiserDefinedEvent::AdvertiserDefinedEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvertiserDefinedEvent::~AdvertiserDefinedEvent()
{

}

void
AdvertiserDefinedEvent::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mapped_conversion_typeKey = "mapped_conversion_type";

    if(object.has_key(mapped_conversion_typeKey))
    {
        bourne::json value = object[mapped_conversion_typeKey];




        ConversionTagTypeOptimal* obj = &mapped_conversion_type;
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
AdvertiserDefinedEvent::toJson()
{
    bourne::json object = bourne::json::object();






	object["mapped_conversion_type"] = getMappedConversionType().toJson();





    object["name"] = getName();



    return object;

}

ConversionTagTypeOptimal
AdvertiserDefinedEvent::getMappedConversionType()
{
	return mapped_conversion_type;
}

void
AdvertiserDefinedEvent::setMappedConversionType(ConversionTagTypeOptimal mapped_conversion_type)
{
	this->mapped_conversion_type = mapped_conversion_type;
}

std::string
AdvertiserDefinedEvent::getName()
{
	return name;
}

void
AdvertiserDefinedEvent::setName(std::string name)
{
	this->name = name;
}



