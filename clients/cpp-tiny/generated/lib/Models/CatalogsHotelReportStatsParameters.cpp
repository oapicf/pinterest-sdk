

#include "CatalogsHotelReportStatsParameters.h"

using namespace Tiny;

CatalogsHotelReportStatsParameters::CatalogsHotelReportStatsParameters()
{
	catalog_type = std::string();
	report = CatalogsHotelReportStatsParametersReport();
}

CatalogsHotelReportStatsParameters::CatalogsHotelReportStatsParameters(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelReportStatsParameters::~CatalogsHotelReportStatsParameters()
{

}

void
CatalogsHotelReportStatsParameters::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *reportKey = "report";

    if(object.has_key(reportKey))
    {
        bourne::json value = object[reportKey];




        CatalogsHotelReportStatsParametersReport* obj = &report;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsHotelReportStatsParameters::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["report"] = getReport().toJson();


    return object;

}

std::string
CatalogsHotelReportStatsParameters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelReportStatsParameters::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelReportStatsParametersReport
CatalogsHotelReportStatsParameters::getReport()
{
	return report;
}

void
CatalogsHotelReportStatsParameters::setReport(CatalogsHotelReportStatsParametersReport report)
{
	this->report = report;
}



