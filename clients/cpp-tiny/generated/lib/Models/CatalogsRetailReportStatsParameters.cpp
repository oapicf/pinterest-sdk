

#include "CatalogsRetailReportStatsParameters.h"

using namespace Tiny;

CatalogsRetailReportStatsParameters::CatalogsRetailReportStatsParameters()
{
	catalog_type = std::string();
	report = CatalogsRetailReportStatsParametersReport();
}

CatalogsRetailReportStatsParameters::CatalogsRetailReportStatsParameters(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailReportStatsParameters::~CatalogsRetailReportStatsParameters()
{

}

void
CatalogsRetailReportStatsParameters::fromJson(std::string jsonObj)
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




        CatalogsRetailReportStatsParametersReport* obj = &report;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsRetailReportStatsParameters::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["report"] = getReport().toJson();


    return object;

}

std::string
CatalogsRetailReportStatsParameters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailReportStatsParameters::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsRetailReportStatsParametersReport
CatalogsRetailReportStatsParameters::getReport()
{
	return report;
}

void
CatalogsRetailReportStatsParameters::setReport(CatalogsRetailReportStatsParametersReport report)
{
	this->report = report;
}



