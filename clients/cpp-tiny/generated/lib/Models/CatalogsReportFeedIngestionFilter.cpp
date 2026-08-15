

#include "CatalogsReportFeedIngestionFilter.h"

using namespace Tiny;

CatalogsReportFeedIngestionFilter::CatalogsReportFeedIngestionFilter()
{
	feed_id = std::string();
	processing_result_id = std::string();
	report_type = std::string();
}

CatalogsReportFeedIngestionFilter::CatalogsReportFeedIngestionFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsReportFeedIngestionFilter::~CatalogsReportFeedIngestionFilter()
{

}

void
CatalogsReportFeedIngestionFilter::fromJson(std::string jsonObj)
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


}

bourne::json
CatalogsReportFeedIngestionFilter::toJson()
{
    bourne::json object = bourne::json::object();





    object["feed_id"] = getFeedId();






    object["processing_result_id"] = getProcessingResultId();






    object["report_type"] = getReportType();



    return object;

}

std::string
CatalogsReportFeedIngestionFilter::getFeedId()
{
	return feed_id;
}

void
CatalogsReportFeedIngestionFilter::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

std::string
CatalogsReportFeedIngestionFilter::getProcessingResultId()
{
	return processing_result_id;
}

void
CatalogsReportFeedIngestionFilter::setProcessingResultId(std::string  processing_result_id)
{
	this->processing_result_id = processing_result_id;
}

std::string
CatalogsReportFeedIngestionFilter::getReportType()
{
	return report_type;
}

void
CatalogsReportFeedIngestionFilter::setReportType(std::string  report_type)
{
	this->report_type = report_type;
}



