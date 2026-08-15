

#include "CreateMMMReportResponseData.h"

using namespace Tiny;

CreateMMMReportResponseData::CreateMMMReportResponseData()
{
	message = std::string();
	report_status = std::string();
	status = std::string();
	token = std::string();
}

CreateMMMReportResponseData::CreateMMMReportResponseData(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateMMMReportResponseData::~CreateMMMReportResponseData()
{

}

void
CreateMMMReportResponseData::fromJson(std::string jsonObj)
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

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *tokenKey = "token";

    if(object.has_key(tokenKey))
    {
        bourne::json value = object[tokenKey];



        jsonToValue(&token, value, "std::string");


    }


}

bourne::json
CreateMMMReportResponseData::toJson()
{
    bourne::json object = bourne::json::object();





    object["message"] = getMessage();







	object["report_status"] = getReportStatus().toJson();





    object["status"] = getStatus();






    object["token"] = getToken();



    return object;

}

std::string
CreateMMMReportResponseData::getMessage()
{
	return message;
}

void
CreateMMMReportResponseData::setMessage(std::string  message)
{
	this->message = message;
}

BulkReportingJobStatus
CreateMMMReportResponseData::getReportStatus()
{
	return report_status;
}

void
CreateMMMReportResponseData::setReportStatus(BulkReportingJobStatus  report_status)
{
	this->report_status = report_status;
}

std::string
CreateMMMReportResponseData::getStatus()
{
	return status;
}

void
CreateMMMReportResponseData::setStatus(std::string  status)
{
	this->status = status;
}

std::string
CreateMMMReportResponseData::getToken()
{
	return token;
}

void
CreateMMMReportResponseData::setToken(std::string  token)
{
	this->token = token;
}



