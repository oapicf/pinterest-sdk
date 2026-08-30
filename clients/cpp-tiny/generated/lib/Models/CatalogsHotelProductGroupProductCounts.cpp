

#include "CatalogsHotelProductGroupProductCounts.h"

using namespace Tiny;

CatalogsHotelProductGroupProductCounts::CatalogsHotelProductGroupProductCounts()
{
	catalog_type = std::string();
	total = float(0);
}

CatalogsHotelProductGroupProductCounts::CatalogsHotelProductGroupProductCounts(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelProductGroupProductCounts::~CatalogsHotelProductGroupProductCounts()
{

}

void
CatalogsHotelProductGroupProductCounts::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *totalKey = "total";

    if(object.has_key(totalKey))
    {
        bourne::json value = object[totalKey];



        jsonToValue(&total, value, "long");


    }


}

bourne::json
CatalogsHotelProductGroupProductCounts::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();






    object["total"] = getTotal();



    return object;

}

std::string
CatalogsHotelProductGroupProductCounts::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelProductGroupProductCounts::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

long
CatalogsHotelProductGroupProductCounts::getTotal()
{
	return total;
}

void
CatalogsHotelProductGroupProductCounts::setTotal(long total)
{
	this->total = total;
}



