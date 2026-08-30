

#include "CatalogsReportParameters.h"

using namespace Tiny;

CatalogsReportParameters::CatalogsReportParameters()
{
	catalog_type = std::string();
	report = CatalogsHotelReportParametersReport();
}

CatalogsReportParameters::CatalogsReportParameters(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsReportParameters::~CatalogsReportParameters()
{

}

void
CatalogsReportParameters::fromJson(std::string jsonObj)
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




        CatalogsHotelReportParametersReport* obj = &report;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsReportParameters::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["report"] = getReport().toJson();


    return object;

}

std::string
CatalogsReportParameters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsReportParameters::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelReportParametersReport
CatalogsReportParameters::getReport()
{
	return report;
}

void
CatalogsReportParameters::setReport(CatalogsHotelReportParametersReport report)
{
	this->report = report;
}



