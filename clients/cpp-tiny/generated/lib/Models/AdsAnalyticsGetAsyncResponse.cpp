

#include "AdsAnalyticsGetAsyncResponse.h"

using namespace Tiny;

AdsAnalyticsGetAsyncResponse::AdsAnalyticsGetAsyncResponse()
{
	report_status = std::string();
	size = float(0);
	url = std::string();
}

AdsAnalyticsGetAsyncResponse::AdsAnalyticsGetAsyncResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsGetAsyncResponse::~AdsAnalyticsGetAsyncResponse()
{

}

void
AdsAnalyticsGetAsyncResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
AdsAnalyticsGetAsyncResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["report_status"] = getReportStatus().toJson();





    object["size"] = getSize();






    object["url"] = getUrl();



    return object;

}

BulkReportingJobStatus
AdsAnalyticsGetAsyncResponse::getReportStatus()
{
	return report_status;
}

void
AdsAnalyticsGetAsyncResponse::setReportStatus(BulkReportingJobStatus  report_status)
{
	this->report_status = report_status;
}

long
AdsAnalyticsGetAsyncResponse::getSize()
{
	return size;
}

void
AdsAnalyticsGetAsyncResponse::setSize(long  size)
{
	this->size = size;
}

std::string
AdsAnalyticsGetAsyncResponse::getUrl()
{
	return url;
}

void
AdsAnalyticsGetAsyncResponse::setUrl(std::string  url)
{
	this->url = url;
}



