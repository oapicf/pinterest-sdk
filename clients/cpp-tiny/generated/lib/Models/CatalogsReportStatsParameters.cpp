

#include "CatalogsReportStatsParameters.h"

using namespace Tiny;

CatalogsReportStatsParameters::CatalogsReportStatsParameters()
{
	catalog_type = std::string();
	report = CatalogsHotelReportStatsParametersReport();
}

CatalogsReportStatsParameters::CatalogsReportStatsParameters(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsReportStatsParameters::~CatalogsReportStatsParameters()
{

}

void
CatalogsReportStatsParameters::fromJson(std::string jsonObj)
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
CatalogsReportStatsParameters::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["report"] = getReport().toJson();


    return object;

}

std::string
CatalogsReportStatsParameters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsReportStatsParameters::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelReportStatsParametersReport
CatalogsReportStatsParameters::getReport()
{
	return report;
}

void
CatalogsReportStatsParameters::setReport(CatalogsHotelReportStatsParametersReport report)
{
	this->report = report;
}



