

#include "ConversionProductReport.h"

using namespace Tiny;

ConversionProductReport::ConversionProductReport()
{
	message = std::string();
	report_status = null;
	size = float(0);
	token = std::string();
	url = std::string();
}

ConversionProductReport::ConversionProductReport(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionProductReport::~ConversionProductReport()
{

}

void
ConversionProductReport::fromJson(std::string jsonObj)
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
ConversionProductReport::toJson()
{
    bourne::json object = bourne::json::object();





    object["message"] = getMessage();







	object["report_status"] = getReportStatus().toJson();





    object["size"] = getSize();






    object["token"] = getToken();






    object["url"] = getUrl();



    return object;

}

std::string
ConversionProductReport::getMessage()
{
	return message;
}

void
ConversionProductReport::setMessage(std::string message)
{
	this->message = message;
}

BulkReportingJobStatus
ConversionProductReport::getReportStatus()
{
	return report_status;
}

void
ConversionProductReport::setReportStatus(BulkReportingJobStatus report_status)
{
	this->report_status = report_status;
}

long
ConversionProductReport::getSize()
{
	return size;
}

void
ConversionProductReport::setSize(long size)
{
	this->size = size;
}

std::string
ConversionProductReport::getToken()
{
	return token;
}

void
ConversionProductReport::setToken(std::string token)
{
	this->token = token;
}

std::string
ConversionProductReport::getUrl()
{
	return url;
}

void
ConversionProductReport::setUrl(std::string url)
{
	this->url = url;
}



