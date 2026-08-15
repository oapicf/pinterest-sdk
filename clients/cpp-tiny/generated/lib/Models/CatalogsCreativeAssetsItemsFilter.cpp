

#include "CatalogsCreativeAssetsItemsFilter.h"

using namespace Tiny;

CatalogsCreativeAssetsItemsFilter::CatalogsCreativeAssetsItemsFilter()
{
	catalog_id = std::string();
	catalog_type = std::string();
	creative_assets_ids = std::list<std::string>();
}

CatalogsCreativeAssetsItemsFilter::CatalogsCreativeAssetsItemsFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsItemsFilter::~CatalogsCreativeAssetsItemsFilter()
{

}

void
CatalogsCreativeAssetsItemsFilter::fromJson(std::string jsonObj)
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
CatalogsCreativeAssetsItemsFilter::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();





    std::list<std::string> creative_assets_ids_list = getCreativeAssetsIds();
    bourne::json creative_assets_ids_arr = bourne::json::array();

    for(auto& var : creative_assets_ids_list)
    {
        creative_assets_ids_arr.append(var);
    }
    object["creative_assets_ids"] = creative_assets_ids_arr;






    return object;

}

std::string
CatalogsCreativeAssetsItemsFilter::getCatalogId()
{
	return catalog_id;
}

void
CatalogsCreativeAssetsItemsFilter::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsCreativeAssetsItemsFilter::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsItemsFilter::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::list<std::string>
CatalogsCreativeAssetsItemsFilter::getCreativeAssetsIds()
{
	return creative_assets_ids;
}

void
CatalogsCreativeAssetsItemsFilter::setCreativeAssetsIds(std::list <std::string> creative_assets_ids)
{
	this->creative_assets_ids = creative_assets_ids;
}



