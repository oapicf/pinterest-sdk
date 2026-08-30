

#include "CatalogsRetailReportAllItemsFilter.h"

using namespace Tiny;

CatalogsRetailReportAllItemsFilter::CatalogsRetailReportAllItemsFilter()
{
	catalog_id = std::string();
	product_group_id = std::string();
	report_type = std::string();
}

CatalogsRetailReportAllItemsFilter::CatalogsRetailReportAllItemsFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailReportAllItemsFilter::~CatalogsRetailReportAllItemsFilter()
{

}

void
CatalogsRetailReportAllItemsFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *report_typeKey = "report_type";

    if(object.has_key(report_typeKey))
    {
        bourne::json value = object[report_typeKey];



        jsonToValue(&report_type, value, "std::string");


    }


}

bourne::json
CatalogsRetailReportAllItemsFilter::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["product_group_id"] = getProductGroupId();






    object["report_type"] = getReportType();



    return object;

}

std::string
CatalogsRetailReportAllItemsFilter::getCatalogId()
{
	return catalog_id;
}

void
CatalogsRetailReportAllItemsFilter::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsRetailReportAllItemsFilter::getProductGroupId()
{
	return product_group_id;
}

void
CatalogsRetailReportAllItemsFilter::setProductGroupId(std::string product_group_id)
{
	this->product_group_id = product_group_id;
}

std::string
CatalogsRetailReportAllItemsFilter::getReportType()
{
	return report_type;
}

void
CatalogsRetailReportAllItemsFilter::setReportType(std::string report_type)
{
	this->report_type = report_type;
}



