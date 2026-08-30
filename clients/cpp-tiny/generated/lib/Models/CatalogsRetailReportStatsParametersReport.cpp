

#include "CatalogsRetailReportStatsParametersReport.h"

using namespace Tiny;

CatalogsRetailReportStatsParametersReport::CatalogsRetailReportStatsParametersReport()
{
	feed_id = std::string();
	processing_result_id = std::string();
	report_type = std::string();
	catalog_id = std::string();
}

CatalogsRetailReportStatsParametersReport::CatalogsRetailReportStatsParametersReport(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailReportStatsParametersReport::~CatalogsRetailReportStatsParametersReport()
{

}

void
CatalogsRetailReportStatsParametersReport::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *report_typeKey = "report_type";

    if(object.has_key(report_typeKey))
    {
        bourne::json value = object[report_typeKey];



        jsonToValue(&report_type, value, "std::string");


    }

    const char *catalog_idKey = "catalog_id";

    if(object.has_key(catalog_idKey))
    {
        bourne::json value = object[catalog_idKey];



        jsonToValue(&catalog_id, value, "std::string");


    }


}

bourne::json
CatalogsRetailReportStatsParametersReport::toJson()
{
    bourne::json object = bourne::json::object();





    object["feed_id"] = getFeedId();






    object["processing_result_id"] = getProcessingResultId();






    object["report_type"] = getReportType();






    object["catalog_id"] = getCatalogId();



    return object;

}

std::string
CatalogsRetailReportStatsParametersReport::getFeedId()
{
	return feed_id;
}

void
CatalogsRetailReportStatsParametersReport::setFeedId(std::string feed_id)
{
	this->feed_id = feed_id;
}

std::string
CatalogsRetailReportStatsParametersReport::getProcessingResultId()
{
	return processing_result_id;
}

void
CatalogsRetailReportStatsParametersReport::setProcessingResultId(std::string processing_result_id)
{
	this->processing_result_id = processing_result_id;
}

std::string
CatalogsRetailReportStatsParametersReport::getReportType()
{
	return report_type;
}

void
CatalogsRetailReportStatsParametersReport::setReportType(std::string report_type)
{
	this->report_type = report_type;
}

std::string
CatalogsRetailReportStatsParametersReport::getCatalogId()
{
	return catalog_id;
}

void
CatalogsRetailReportStatsParametersReport::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}



