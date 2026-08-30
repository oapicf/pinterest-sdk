

#include "CatalogsHotelItemsPostFilter.h"

using namespace Tiny;

CatalogsHotelItemsPostFilter::CatalogsHotelItemsPostFilter()
{
	catalog_id = std::string();
	catalog_type = std::string();
	hotel_ids = std::list<std::string>();
}

CatalogsHotelItemsPostFilter::CatalogsHotelItemsPostFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelItemsPostFilter::~CatalogsHotelItemsPostFilter()
{

}

void
CatalogsHotelItemsPostFilter::fromJson(std::string jsonObj)
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
CatalogsHotelItemsPostFilter::toJson()
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
CatalogsHotelItemsPostFilter::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelItemsPostFilter::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsHotelItemsPostFilter::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelItemsPostFilter::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

std::list<std::string>
CatalogsHotelItemsPostFilter::getHotelIds()
{
	return hotel_ids;
}

void
CatalogsHotelItemsPostFilter::setHotelIds(std::list<std::string> hotel_ids)
{
	this->hotel_ids = hotel_ids;
}



