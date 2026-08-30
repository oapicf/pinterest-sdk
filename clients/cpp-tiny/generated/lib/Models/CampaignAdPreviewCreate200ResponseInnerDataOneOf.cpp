

#include "Campaign_ad_preview_create_200_response_inner_data_oneOf.h"

using namespace Tiny;

Campaign_ad_preview_create_200_response_inner_data_oneOf::Campaign_ad_preview_create_200_response_inner_data_oneOf()
{
	exceptions = Pinterest.Lib.Error();
}

Campaign_ad_preview_create_200_response_inner_data_oneOf::Campaign_ad_preview_create_200_response_inner_data_oneOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

Campaign_ad_preview_create_200_response_inner_data_oneOf::~Campaign_ad_preview_create_200_response_inner_data_oneOf()
{

}

void
Campaign_ad_preview_create_200_response_inner_data_oneOf::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];




        Pinterest.Lib.Error* obj = &exceptions;
		obj->fromJson(value.dump());

    }


}

bourne::json
Campaign_ad_preview_create_200_response_inner_data_oneOf::toJson()
{
    bourne::json object = bourne::json::object();






	object["exceptions"] = getExceptions().toJson();


    return object;

}

Pinterest.Lib.Error
Campaign_ad_preview_create_200_response_inner_data_oneOf::getExceptions()
{
	return exceptions;
}

void
Campaign_ad_preview_create_200_response_inner_data_oneOf::setExceptions(Pinterest.Lib.Error exceptions)
{
	this->exceptions = exceptions;
}



