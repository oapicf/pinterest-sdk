

#include "AdGroupDeliveryEstimatesKeywordsItems.h"

using namespace Tiny;

AdGroupDeliveryEstimatesKeywordsItems::AdGroupDeliveryEstimatesKeywordsItems()
{
	match_type = null;
	value = std::string();
}

AdGroupDeliveryEstimatesKeywordsItems::AdGroupDeliveryEstimatesKeywordsItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupDeliveryEstimatesKeywordsItems::~AdGroupDeliveryEstimatesKeywordsItems()
{

}

void
AdGroupDeliveryEstimatesKeywordsItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *match_typeKey = "match_type";

    if(object.has_key(match_typeKey))
    {
        bourne::json value = object[match_typeKey];




        NullalbleMatchType* obj = &match_type;
		obj->fromJson(value.dump());

    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }


}

bourne::json
AdGroupDeliveryEstimatesKeywordsItems::toJson()
{
    bourne::json object = bourne::json::object();






	object["match_type"] = getMatchType().toJson();





    object["value"] = getValue();



    return object;

}

NullalbleMatchType
AdGroupDeliveryEstimatesKeywordsItems::getMatchType()
{
	return match_type;
}

void
AdGroupDeliveryEstimatesKeywordsItems::setMatchType(NullalbleMatchType match_type)
{
	this->match_type = match_type;
}

std::string
AdGroupDeliveryEstimatesKeywordsItems::getValue()
{
	return value;
}

void
AdGroupDeliveryEstimatesKeywordsItems::setValue(std::string value)
{
	this->value = value;
}



