

#include "CatalogsHotelReportParameters.h"

using namespace Tiny;

CatalogsHotelReportParameters::CatalogsHotelReportParameters()
{
	catalog_type = std::string();
	report = CatalogsHotelReportParametersReport();
}

CatalogsHotelReportParameters::CatalogsHotelReportParameters(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelReportParameters::~CatalogsHotelReportParameters()
{

}

void
CatalogsHotelReportParameters::fromJson(std::string jsonObj)
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
CatalogsHotelReportParameters::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["report"] = getReport().toJson();


    return object;

}

std::string
CatalogsHotelReportParameters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelReportParameters::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelReportParametersReport
CatalogsHotelReportParameters::getReport()
{
	return report;
}

void
CatalogsHotelReportParameters::setReport(CatalogsHotelReportParametersReport report)
{
	this->report = report;
}



