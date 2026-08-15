

#include "ConversionEventResponse.h"

using namespace Tiny;

ConversionEventResponse::ConversionEventResponse()
{
	ad_account_id = std::string();
	conversion_event = ConversionTagType();
	conversion_tag_id = std::string();
	created_time = int(0);
}

ConversionEventResponse::ConversionEventResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEventResponse::~ConversionEventResponse()
{

}

void
ConversionEventResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *conversion_eventKey = "conversion_event";

    if(object.has_key(conversion_eventKey))
    {
        bourne::json value = object[conversion_eventKey];




        ConversionTagType* obj = &conversion_event;
		obj->fromJson(value.dump());

    }

    const char *conversion_tag_idKey = "conversion_tag_id";

    if(object.has_key(conversion_tag_idKey))
    {
        bourne::json value = object[conversion_tag_idKey];



        jsonToValue(&conversion_tag_id, value, "std::string");


    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


    }


}

bourne::json
ConversionEventResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();







	object["conversion_event"] = getConversionEvent().toJson();





    object["conversion_tag_id"] = getConversionTagId();






    object["created_time"] = getCreatedTime();



    return object;

}

std::string
ConversionEventResponse::getAdAccountId()
{
	return ad_account_id;
}

void
ConversionEventResponse::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

ConversionTagType
ConversionEventResponse::getConversionEvent()
{
	return conversion_event;
}

void
ConversionEventResponse::setConversionEvent(ConversionTagType  conversion_event)
{
	this->conversion_event = conversion_event;
}

std::string
ConversionEventResponse::getConversionTagId()
{
	return conversion_tag_id;
}

void
ConversionEventResponse::setConversionTagId(std::string  conversion_tag_id)
{
	this->conversion_tag_id = conversion_tag_id;
}

int
ConversionEventResponse::getCreatedTime()
{
	return created_time;
}

void
ConversionEventResponse::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}



