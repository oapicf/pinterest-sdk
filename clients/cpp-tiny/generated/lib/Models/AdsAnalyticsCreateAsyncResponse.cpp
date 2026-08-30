

#include "AdsAnalyticsCreateAsyncResponse.h"

using namespace Tiny;

AdsAnalyticsCreateAsyncResponse::AdsAnalyticsCreateAsyncResponse()
{
	message = std::string();
	report_status = BulkReportingJobStatus();
	token = std::string();
}

AdsAnalyticsCreateAsyncResponse::AdsAnalyticsCreateAsyncResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsCreateAsyncResponse::~AdsAnalyticsCreateAsyncResponse()
{

}

void
AdsAnalyticsCreateAsyncResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *report_statusKey = "report_status";

    if(object.has_key(report_statusKey))
    {
        bourne::json value = object[report_statusKey];




        BulkReportingJobStatus* obj = &report_status;
		obj->fromJson(value.dump());

    }

    const char *tokenKey = "token";

    if(object.has_key(tokenKey))
    {
        bourne::json value = object[tokenKey];



        jsonToValue(&token, value, "std::string");


    }


}

bourne::json
AdsAnalyticsCreateAsyncResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["message"] = getMessage();







	object["report_status"] = getReportStatus().toJson();





    object["token"] = getToken();



    return object;

}

std::string
AdsAnalyticsCreateAsyncResponse::getMessage()
{
	return message;
}

void
AdsAnalyticsCreateAsyncResponse::setMessage(std::string message)
{
	this->message = message;
}

BulkReportingJobStatus
AdsAnalyticsCreateAsyncResponse::getReportStatus()
{
	return report_status;
}

void
AdsAnalyticsCreateAsyncResponse::setReportStatus(BulkReportingJobStatus report_status)
{
	this->report_status = report_status;
}

std::string
AdsAnalyticsCreateAsyncResponse::getToken()
{
	return token;
}

void
AdsAnalyticsCreateAsyncResponse::setToken(std::string token)
{
	this->token = token;
}



