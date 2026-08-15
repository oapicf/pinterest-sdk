

#include "CatalogsHotelItemsFilter.h"

using namespace Tiny;

CatalogsHotelItemsFilter::CatalogsHotelItemsFilter()
{
	catalog_id = std::string();
	catalog_type = std::string();
	hotel_ids = std::list<std::string>();
}

CatalogsHotelItemsFilter::CatalogsHotelItemsFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelItemsFilter::~CatalogsHotelItemsFilter()
{

}

void
CatalogsHotelItemsFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_idKey = "catalog_id";

    if(object.has_key(catalog_idKey))
    {
        bourne::json value = object[catalog_idKey];



        jsonToValue(&catalog_id, value, "std::string");


    }

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *hotel_idsKey = "hotel_ids";

    if(object.has_key(hotel_idsKey))
    {
        bourne::json value = object[hotel_idsKey];


        std::list<std::string> hotel_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            hotel_ids_list.push_back(element);
        }
        hotel_ids = hotel_ids_list;


    }


}

bourne::json
CatalogsHotelItemsFilter::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();





    std::list<std::string> hotel_ids_list = getHotelIds();
    bourne::json hotel_ids_arr = bourne::json::array();

    for(auto& var : hotel_ids_list)
    {
        hotel_ids_arr.append(var);
    }
    object["hotel_ids"] = hotel_ids_arr;






    return object;

}

std::string
CatalogsHotelItemsFilter::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelItemsFilter::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsHotelItemsFilter::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelItemsFilter::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::list<std::string>
CatalogsHotelItemsFilter::getHotelIds()
{
	return hotel_ids;
}

void
CatalogsHotelItemsFilter::setHotelIds(std::list <std::string> hotel_ids)
{
	this->hotel_ids = hotel_ids;
}



