

#include "CatalogsReport.h"

using namespace Tiny;

CatalogsReport::CatalogsReport()
{
	report_status = std::string();
	size = float(0);
	url = std::string();
}

CatalogsReport::CatalogsReport(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsReport::~CatalogsReport()
{

}

void
CatalogsReport::fromJson(std::string jsonObj)
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
CatalogsReport::toJson()
{
    bourne::json object = bourne::json::object();





    object["report_status"] = getReportStatus();






    object["size"] = getSize();






    object["url"] = getUrl();



    return object;

}

std::string
CatalogsReport::getReportStatus()
{
	return report_status;
}

void
CatalogsReport::setReportStatus(std::string report_status)
{
	this->report_status = report_status;
}

long
CatalogsReport::getSize()
{
	return size;
}

void
CatalogsReport::setSize(long size)
{
	this->size = size;
}

std::string
CatalogsReport::getUrl()
{
	return url;
}

void
CatalogsReport::setUrl(std::string url)
{
	this->url = url;
}



