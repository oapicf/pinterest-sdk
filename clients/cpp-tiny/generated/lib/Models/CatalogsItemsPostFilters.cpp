

#include "CatalogsItemsPostFilters.h"

using namespace Tiny;

CatalogsItemsPostFilters::CatalogsItemsPostFilters()
{
	catalog_type = CatalogsType();
	catalog_id = std::string();
	item_ids = std::list<std::string>();
	hotel_ids = std::list<std::string>();
	creative_assets_ids = std::list<std::string>();
}

CatalogsItemsPostFilters::CatalogsItemsPostFilters(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemsPostFilters::~CatalogsItemsPostFilters()
{

}

void
CatalogsItemsPostFilters::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];




        CatalogsType* obj = &catalog_type;
		obj->fromJson(value.dump());

    }

    const char *catalog_idKey = "catalog_id";

    if(object.has_key(catalog_idKey))
    {
        bourne::json value = object[catalog_idKey];



        jsonToValue(&catalog_id, value, "std::string");


    }

    const char *item_idsKey = "item_ids";

    if(object.has_key(item_idsKey))
    {
        bourne::json value = object[item_idsKey];


        std::list<std::string> item_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            item_ids_list.push_back(element);
        }
        item_ids = item_ids_list;


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

    const char *creative_assets_idsKey = "creative_assets_ids";

    if(object.has_key(creative_assets_idsKey))
    {
        bourne::json value = object[creative_assets_idsKey];


        std::list<std::string> creative_assets_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            creative_assets_ids_list.push_back(element);
        }
        creative_assets_ids = creative_assets_ids_list;


    }


}

bourne::json
CatalogsItemsPostFilters::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();





    object["catalog_id"] = getCatalogId();





    std::list<std::string> item_ids_list = getItemIds();
    bourne::json item_ids_arr = bourne::json::array();

    for(auto& var : item_ids_list)
    {
        item_ids_arr.append(var);
    }
    object["item_ids"] = item_ids_arr;








    std::list<std::string> hotel_ids_list = getHotelIds();
    bourne::json hotel_ids_arr = bourne::json::array();

    for(auto& var : hotel_ids_list)
    {
        hotel_ids_arr.append(var);
    }
    object["hotel_ids"] = hotel_ids_arr;








    std::list<std::string> creative_assets_ids_list = getCreativeAssetsIds();
    bourne::json creative_assets_ids_arr = bourne::json::array();

    for(auto& var : creative_assets_ids_list)
    {
        creative_assets_ids_arr.append(var);
    }
    object["creative_assets_ids"] = creative_assets_ids_arr;






    return object;

}

CatalogsType
CatalogsItemsPostFilters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsItemsPostFilters::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsItemsPostFilters::getCatalogId()
{
	return catalog_id;
}

void
CatalogsItemsPostFilters::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::list<std::string>
CatalogsItemsPostFilters::getItemIds()
{
	return item_ids;
}

void
CatalogsItemsPostFilters::setItemIds(std::list <std::string> item_ids)
{
	this->item_ids = item_ids;
}

std::list<std::string>
CatalogsItemsPostFilters::getHotelIds()
{
	return hotel_ids;
}

void
CatalogsItemsPostFilters::setHotelIds(std::list <std::string> hotel_ids)
{
	this->hotel_ids = hotel_ids;
}

std::list<std::string>
CatalogsItemsPostFilters::getCreativeAssetsIds()
{
	return creative_assets_ids;
}

void
CatalogsItemsPostFilters::setCreativeAssetsIds(std::list <std::string> creative_assets_ids)
{
	this->creative_assets_ids = creative_assets_ids;
}



