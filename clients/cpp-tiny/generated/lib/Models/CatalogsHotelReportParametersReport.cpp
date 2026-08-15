

#include "CatalogsHotelReportParameters_report.h"

using namespace Tiny;

CatalogsHotelReportParameters_report::CatalogsHotelReportParameters_report()
{
	report_type = std::string();
	feed_id = std::string();
	processing_result_id = std::string();
	catalog_id = std::string();
}

CatalogsHotelReportParameters_report::CatalogsHotelReportParameters_report(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelReportParameters_report::~CatalogsHotelReportParameters_report()
{

}

void
CatalogsHotelReportParameters_report::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *report_typeKey = "report_type";

    if(object.has_key(report_typeKey))
    {
        bourne::json value = object[report_typeKey];



        jsonToValue(&report_type, value, "std::string");


    }

    const char *feed_idKey = "feed_id";

    if(object.has_key(feed_idKey))
    {
        bourne::json value = object[feed_idKey];



        jsonToValue(&feed_id, value, "std::string");


    }

    const char *processing_result_idKey = "processing_result_id";

    if(object.has_key(processing_result_idKey))
    {
        bourne::json value = object[processing_result_idKey];



        jsonToValue(&processing_result_id, value, "std::string");


    }

    const char *catalog_idKey = "catalog_id";

    if(object.has_key(catalog_idKey))
    {
        bourne::json value = object[catalog_idKey];



        jsonToValue(&catalog_id, value, "std::string");


    }


}

bourne::json
CatalogsHotelReportParameters_report::toJson()
{
    bourne::json object = bourne::json::object();





    object["report_type"] = getReportType();






    object["feed_id"] = getFeedId();






    object["processing_result_id"] = getProcessingResultId();






    object["catalog_id"] = getCatalogId();



    return object;

}

std::string
CatalogsHotelReportParameters_report::getReportType()
{
	return report_type;
}

void
CatalogsHotelReportParameters_report::setReportType(std::string  report_type)
{
	this->report_type = report_type;
}

std::string
CatalogsHotelReportParameters_report::getFeedId()
{
	return feed_id;
}

void
CatalogsHotelReportParameters_report::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

std::string
CatalogsHotelReportParameters_report::getProcessingResultId()
{
	return processing_result_id;
}

void
CatalogsHotelReportParameters_report::setProcessingResultId(std::string  processing_result_id)
{
	this->processing_result_id = processing_result_id;
}

std::string
CatalogsHotelReportParameters_report::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelReportParameters_report::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}



