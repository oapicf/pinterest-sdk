

#include "CatalogsVerticalBatchRequest.h"

using namespace Tiny;

CatalogsVerticalBatchRequest::CatalogsVerticalBatchRequest()
{
	catalog_id = std::string();
	catalog_type = std::string();
	country = Country();
	items = std::list<CatalogsCreativeAssetsBatchItem>();
	language = std::string();
}

CatalogsVerticalBatchRequest::CatalogsVerticalBatchRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsVerticalBatchRequest::~CatalogsVerticalBatchRequest()
{

}

void
CatalogsVerticalBatchRequest::fromJson(std::string jsonObj)
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

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];




        Country* obj = &country;
		obj->fromJson(value.dump());

    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<CatalogsCreativeAssetsBatchItem> items_list;
        CatalogsCreativeAssetsBatchItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];



        jsonToValue(&language, value, "std::string");


    }


}

bourne::json
CatalogsVerticalBatchRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();







	object["country"] = getCountry().toJson();




    std::list<CatalogsCreativeAssetsBatchItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        CatalogsCreativeAssetsBatchItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["language"] = getLanguage();



    return object;

}

std::string
CatalogsVerticalBatchRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsVerticalBatchRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsVerticalBatchRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsVerticalBatchRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsVerticalBatchRequest::getCountry()
{
	return country;
}

void
CatalogsVerticalBatchRequest::setCountry(Country  country)
{
	this->country = country;
}

std::list<CatalogsCreativeAssetsBatchItem>
CatalogsVerticalBatchRequest::getItems()
{
	return items;
}

void
CatalogsVerticalBatchRequest::setItems(std::list <CatalogsCreativeAssetsBatchItem> items)
{
	this->items = items;
}

std::string
CatalogsVerticalBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsVerticalBatchRequest::setLanguage(std::string  language)
{
	this->language = language;
}



