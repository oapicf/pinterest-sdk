

#include "Reports_stats_parameters_parameter.h"

using namespace Tiny;

Reports_stats_parameters_parameter::Reports_stats_parameters_parameter()
{
	catalog_type = CatalogsType();
	report = CatalogsHotelReportStatsParameters_report();
}

Reports_stats_parameters_parameter::Reports_stats_parameters_parameter(std::string jsonString)
{
	this->fromJson(jsonString);
}

Reports_stats_parameters_parameter::~Reports_stats_parameters_parameter()
{

}

void
Reports_stats_parameters_parameter::fromJson(std::string jsonObj)
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




        CatalogsHotelReportStatsParameters_report* obj = &report;
		obj->fromJson(value.dump());

    }


}

bourne::json
Reports_stats_parameters_parameter::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();






	object["report"] = getReport().toJson();


    return object;

}

CatalogsType
Reports_stats_parameters_parameter::getCatalogType()
{
	return catalog_type;
}

void
Reports_stats_parameters_parameter::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelReportStatsParameters_report
Reports_stats_parameters_parameter::getReport()
{
	return report;
}

void
Reports_stats_parameters_parameter::setReport(CatalogsHotelReportStatsParameters_report  report)
{
	this->report = report;
}



