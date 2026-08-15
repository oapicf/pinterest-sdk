

#include "CatalogsRetailItemsPostFilter.h"

using namespace Tiny;

CatalogsRetailItemsPostFilter::CatalogsRetailItemsPostFilter()
{
	catalog_id = std::string();
	catalog_type = std::string();
	item_ids = std::list<std::string>();
}

CatalogsRetailItemsPostFilter::CatalogsRetailItemsPostFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailItemsPostFilter::~CatalogsRetailItemsPostFilter()
{

}

void
CatalogsRetailItemsPostFilter::fromJson(std::string jsonObj)
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


}

bourne::json
CatalogsRetailItemsPostFilter::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();





    std::list<std::string> item_ids_list = getItemIds();
    bourne::json item_ids_arr = bourne::json::array();

    for(auto& var : item_ids_list)
    {
        item_ids_arr.append(var);
    }
    object["item_ids"] = item_ids_arr;






    return object;

}

std::string
CatalogsRetailItemsPostFilter::getCatalogId()
{
	return catalog_id;
}

void
CatalogsRetailItemsPostFilter::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsRetailItemsPostFilter::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailItemsPostFilter::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::list<std::string>
CatalogsRetailItemsPostFilter::getItemIds()
{
	return item_ids;
}

void
CatalogsRetailItemsPostFilter::setItemIds(std::list <std::string> item_ids)
{
	this->item_ids = item_ids;
}



