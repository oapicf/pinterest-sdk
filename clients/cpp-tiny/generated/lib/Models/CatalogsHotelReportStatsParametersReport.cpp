

#include "CatalogsHotelReportStatsParameters_report.h"

using namespace Tiny;

CatalogsHotelReportStatsParameters_report::CatalogsHotelReportStatsParameters_report()
{
	report_type = std::string();
	feed_id = std::string();
	processing_result_id = std::string();
	catalog_id = std::string();
}

CatalogsHotelReportStatsParameters_report::CatalogsHotelReportStatsParameters_report(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelReportStatsParameters_report::~CatalogsHotelReportStatsParameters_report()
{

}

void
CatalogsHotelReportStatsParameters_report::fromJson(std::string jsonObj)
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
CatalogsHotelReportStatsParameters_report::toJson()
{
    bourne::json object = bourne::json::object();





    object["report_type"] = getReportType();






    object["feed_id"] = getFeedId();






    object["processing_result_id"] = getProcessingResultId();






    object["catalog_id"] = getCatalogId();



    return object;

}

std::string
CatalogsHotelReportStatsParameters_report::getReportType()
{
	return report_type;
}

void
CatalogsHotelReportStatsParameters_report::setReportType(std::string  report_type)
{
	this->report_type = report_type;
}

std::string
CatalogsHotelReportStatsParameters_report::getFeedId()
{
	return feed_id;
}

void
CatalogsHotelReportStatsParameters_report::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

std::string
CatalogsHotelReportStatsParameters_report::getProcessingResultId()
{
	return processing_result_id;
}

void
CatalogsHotelReportStatsParameters_report::setProcessingResultId(std::string  processing_result_id)
{
	this->processing_result_id = processing_result_id;
}

std::string
CatalogsHotelReportStatsParameters_report::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelReportStatsParameters_report::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}



