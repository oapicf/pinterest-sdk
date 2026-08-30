

#include "CampaignPlanningResponseError.h"

using namespace Tiny;

CampaignPlanningResponseError::CampaignPlanningResponseError()
{
	code = CampaignPlanningResponseErrorCode();
	message = std::string();
}

CampaignPlanningResponseError::CampaignPlanningResponseError(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningResponseError::~CampaignPlanningResponseError()
{

}

void
CampaignPlanningResponseError::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];




        CampaignPlanningResponseErrorCode* obj = &code;
		obj->fromJson(value.dump());

    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
CampaignPlanningResponseError::toJson()
{
    bourne::json object = bourne::json::object();






	object["code"] = getCode().toJson();





    object["message"] = getMessage();



    return object;

}

CampaignPlanningResponseErrorCode
CampaignPlanningResponseError::getCode()
{
	return code;
}

void
CampaignPlanningResponseError::setCode(CampaignPlanningResponseErrorCode code)
{
	this->code = code;
}

std::string
CampaignPlanningResponseError::getMessage()
{
	return message;
}

void
CampaignPlanningResponseError::setMessage(std::string message)
{
	this->message = message;
}



