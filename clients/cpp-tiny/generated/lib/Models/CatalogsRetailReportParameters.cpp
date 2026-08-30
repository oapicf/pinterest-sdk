

#include "CatalogsRetailReportParameters.h"

using namespace Tiny;

CatalogsRetailReportParameters::CatalogsRetailReportParameters()
{
	catalog_type = std::string();
	report = CatalogsRetailReportParametersReport();
}

CatalogsRetailReportParameters::CatalogsRetailReportParameters(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailReportParameters::~CatalogsRetailReportParameters()
{

}

void
CatalogsRetailReportParameters::fromJson(std::string jsonObj)
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




        CatalogsRetailReportParametersReport* obj = &report;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsRetailReportParameters::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["report"] = getReport().toJson();


    return object;

}

std::string
CatalogsRetailReportParameters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailReportParameters::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsRetailReportParametersReport
CatalogsRetailReportParameters::getReport()
{
	return report;
}

void
CatalogsRetailReportParameters::setReport(CatalogsRetailReportParametersReport report)
{
	this->report = report;
}



