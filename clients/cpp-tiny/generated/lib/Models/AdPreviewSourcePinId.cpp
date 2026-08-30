

#include "AdPreviewSourcePinId.h"

using namespace Tiny;

AdPreviewSourcePinId::AdPreviewSourcePinId()
{
	creative_type = null;
	pin_id = std::string();
}

AdPreviewSourcePinId::AdPreviewSourcePinId(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdPreviewSourcePinId::~AdPreviewSourcePinId()
{

}

void
AdPreviewSourcePinId::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *creative_typeKey = "creative_type";

    if(object.has_key(creative_typeKey))
    {
        bourne::json value = object[creative_typeKey];




        AdPinPreviewCreativeType* obj = &creative_type;
		obj->fromJson(value.dump());

    }

    const char *pin_idKey = "pin_id";

    if(object.has_key(pin_idKey))
    {
        bourne::json value = object[pin_idKey];



        jsonToValue(&pin_id, value, "std::string");


    }


}

bourne::json
AdPreviewSourcePinId::toJson()
{
    bourne::json object = bourne::json::object();






	object["creative_type"] = getCreativeType().toJson();





    object["pin_id"] = getPinId();



    return object;

}

AdPinPreviewCreativeType
AdPreviewSourcePinId::getCreativeType()
{
	return creative_type;
}

void
AdPreviewSourcePinId::setCreativeType(AdPinPreviewCreativeType creative_type)
{
	this->creative_type = creative_type;
}

std::string
AdPreviewSourcePinId::getPinId()
{
	return pin_id;
}

void
AdPreviewSourcePinId::setPinId(std::string pin_id)
{
	this->pin_id = pin_id;
}



