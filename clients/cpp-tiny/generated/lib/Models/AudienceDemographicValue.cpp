

#include "AudienceDemographicValue.h"

using namespace Tiny;

AudienceDemographicValue::AudienceDemographicValue()
{
	key = std::string();
	name = std::string();
	ratio = float(0);
}

AudienceDemographicValue::AudienceDemographicValue(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceDemographicValue::~AudienceDemographicValue()
{

}

void
AudienceDemographicValue::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *keyKey = "key";

    if(object.has_key(keyKey))
    {
        bourne::json value = object[keyKey];



        jsonToValue(&key, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *ratioKey = "ratio";

    if(object.has_key(ratioKey))
    {
        bourne::json value = object[ratioKey];



        jsonToValue(&ratio, value, "long");


    }


}

bourne::json
AudienceDemographicValue::toJson()
{
    bourne::json object = bourne::json::object();





    object["key"] = getKey();






    object["name"] = getName();






    object["ratio"] = getRatio();



    return object;

}

std::string
AudienceDemographicValue::getKey()
{
	return key;
}

void
AudienceDemographicValue::setKey(std::string key)
{
	this->key = key;
}

std::string
AudienceDemographicValue::getName()
{
	return name;
}

void
AudienceDemographicValue::setName(std::string name)
{
	this->name = name;
}

long
AudienceDemographicValue::getRatio()
{
	return ratio;
}

void
AudienceDemographicValue::setRatio(long ratio)
{
	this->ratio = ratio;
}



