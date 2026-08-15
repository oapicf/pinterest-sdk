

#include "GetMMMReportResponseData.h"

using namespace Tiny;

GetMMMReportResponseData::GetMMMReportResponseData()
{
	report_status = std::string();
	size = float(0);
	url = std::string();
}

GetMMMReportResponseData::GetMMMReportResponseData(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetMMMReportResponseData::~GetMMMReportResponseData()
{

}

void
GetMMMReportResponseData::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *report_statusKey = "report_status";

    if(object.has_key(report_statusKey))
    {
        bourne::json value = object[report_statusKey];



        jsonToValue(&report_status, value, "std::string");


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
GetMMMReportResponseData::toJson()
{
    bourne::json object = bourne::json::object();





    object["report_status"] = getReportStatus();






    object["size"] = getSize();






    object["url"] = getUrl();



    return object;

}

std::string
GetMMMReportResponseData::getReportStatus()
{
	return report_status;
}

void
GetMMMReportResponseData::setReportStatus(std::string  report_status)
{
	this->report_status = report_status;
}

long
GetMMMReportResponseData::getSize()
{
	return size;
}

void
GetMMMReportResponseData::setSize(long  size)
{
	this->size = size;
}

std::string
GetMMMReportResponseData::getUrl()
{
	return url;
}

void
GetMMMReportResponseData::setUrl(std::string  url)
{
	this->url = url;
}



