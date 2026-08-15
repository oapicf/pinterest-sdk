

#include "CatalogsReportAllItemsFilter.h"

using namespace Tiny;

CatalogsReportAllItemsFilter::CatalogsReportAllItemsFilter()
{
	catalog_id = std::string();
	report_type = std::string();
}

CatalogsReportAllItemsFilter::CatalogsReportAllItemsFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsReportAllItemsFilter::~CatalogsReportAllItemsFilter()
{

}

void
CatalogsReportAllItemsFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_idKey = "catalog_id";

    if(object.has_key(catalog_idKey))
    {
        bourne::json value = object[catalog_idKey];



        jsonToValue(&catalog_id, value, "std::string");


    }

    const char *report_typeKey = "report_type";

    if(object.has_key(report_typeKey))
    {
        bourne::json value = object[report_typeKey];



        jsonToValue(&report_type, value, "std::string");


    }


}

bourne::json
CatalogsReportAllItemsFilter::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["report_type"] = getReportType();



    return object;

}

std::string
CatalogsReportAllItemsFilter::getCatalogId()
{
	return catalog_id;
}

void
CatalogsReportAllItemsFilter::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsReportAllItemsFilter::getReportType()
{
	return report_type;
}

void
CatalogsReportAllItemsFilter::setReportType(std::string  report_type)
{
	this->report_type = report_type;
}



