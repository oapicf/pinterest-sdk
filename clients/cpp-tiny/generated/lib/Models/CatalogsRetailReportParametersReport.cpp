

#include "CatalogsRetailReportParametersReport.h"

using namespace Tiny;

CatalogsRetailReportParametersReport::CatalogsRetailReportParametersReport()
{
	feed_id = std::string();
	processing_result_id = std::string();
	report_type = std::string();
	catalog_id = std::string();
	product_group_id = std::string();
}

CatalogsRetailReportParametersReport::CatalogsRetailReportParametersReport(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailReportParametersReport::~CatalogsRetailReportParametersReport()
{

}

void
CatalogsRetailReportParametersReport::fromJson(std::string jsonObj)
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

    const char *product_group_idKey = "product_group_id";

    if(object.has_key(product_group_idKey))
    {
        bourne::json value = object[product_group_idKey];



        jsonToValue(&product_group_id, value, "std::string");


    }


}

bourne::json
CatalogsRetailReportParametersReport::toJson()
{
    bourne::json object = bourne::json::object();





    object["feed_id"] = getFeedId();






    object["processing_result_id"] = getProcessingResultId();






    object["report_type"] = getReportType();






    object["catalog_id"] = getCatalogId();






    object["product_group_id"] = getProductGroupId();



    return object;

}

std::string
CatalogsRetailReportParametersReport::getFeedId()
{
	return feed_id;
}

void
CatalogsRetailReportParametersReport::setFeedId(std::string feed_id)
{
	this->feed_id = feed_id;
}

std::string
CatalogsRetailReportParametersReport::getProcessingResultId()
{
	return processing_result_id;
}

void
CatalogsRetailReportParametersReport::setProcessingResultId(std::string processing_result_id)
{
	this->processing_result_id = processing_result_id;
}

std::string
CatalogsRetailReportParametersReport::getReportType()
{
	return report_type;
}

void
CatalogsRetailReportParametersReport::setReportType(std::string report_type)
{
	this->report_type = report_type;
}

std::string
CatalogsRetailReportParametersReport::getCatalogId()
{
	return catalog_id;
}

void
CatalogsRetailReportParametersReport::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsRetailReportParametersReport::getProductGroupId()
{
	return product_group_id;
}

void
CatalogsRetailReportParametersReport::setProductGroupId(std::string product_group_id)
{
	this->product_group_id = product_group_id;
}



