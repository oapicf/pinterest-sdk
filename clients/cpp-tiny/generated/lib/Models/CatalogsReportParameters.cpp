

#include "CatalogsReportParameters.h"

using namespace Tiny;

CatalogsReportParameters::CatalogsReportParameters()
{
	catalog_type = CatalogsType();
	report = CatalogsHotelReportParameters_report();
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




        CatalogsType* obj = &catalog_type;
		obj->fromJson(value.dump());

    }

    const char *reportKey = "report";

    if(object.has_key(reportKey))
    {
        bourne::json value = object[reportKey];




        CatalogsHotelReportParameters_report* obj = &report;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsReportParameters::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();






	object["report"] = getReport().toJson();


    return object;

}

CatalogsType
CatalogsReportParameters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsReportParameters::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelReportParameters_report
CatalogsReportParameters::getReport()
{
	return report;
}

void
CatalogsReportParameters::setReport(CatalogsHotelReportParameters_report  report)
{
	this->report = report;
}



