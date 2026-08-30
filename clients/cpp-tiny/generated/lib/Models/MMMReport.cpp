

#include "MMMReport.h"

using namespace Tiny;

MMMReport::MMMReport()
{
	message = std::string();
	report_status = null;
	size = float(0);
	status = std::string();
	token = std::string();
	url = std::string();
}

MMMReport::MMMReport(std::string jsonString)
{
	this->fromJson(jsonString);
}

MMMReport::~MMMReport()
{

}

void
MMMReport::fromJson(std::string jsonObj)
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

    const char *sizeKey = "size";

    if(object.has_key(sizeKey))
    {
        bourne::json value = object[sizeKey];



        jsonToValue(&size, value, "long");


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

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
MMMReport::toJson()
{
    bourne::json object = bourne::json::object();





    object["message"] = getMessage();







	object["report_status"] = getReportStatus().toJson();





    object["size"] = getSize();






    object["status"] = getStatus();






    object["token"] = getToken();






    object["url"] = getUrl();



    return object;

}

std::string
MMMReport::getMessage()
{
	return message;
}

void
MMMReport::setMessage(std::string message)
{
	this->message = message;
}

BulkReportingJobStatus
MMMReport::getReportStatus()
{
	return report_status;
}

void
MMMReport::setReportStatus(BulkReportingJobStatus report_status)
{
	this->report_status = report_status;
}

long
MMMReport::getSize()
{
	return size;
}

void
MMMReport::setSize(long size)
{
	this->size = size;
}

std::string
MMMReport::getStatus()
{
	return status;
}

void
MMMReport::setStatus(std::string status)
{
	this->status = status;
}

std::string
MMMReport::getToken()
{
	return token;
}

void
MMMReport::setToken(std::string token)
{
	this->token = token;
}

std::string
MMMReport::getUrl()
{
	return url;
}

void
MMMReport::setUrl(std::string url)
{
	this->url = url;
}



