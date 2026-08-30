

#include "CatalogsRetailBatchRequest.h"

using namespace Tiny;

CatalogsRetailBatchRequest::CatalogsRetailBatchRequest()
{
	catalog_id = null;
	catalog_type = std::string();
	country = Country();
	items = std::list<CatalogsRetailBatchRequestItemsItems>();
	language = std::string();
}

CatalogsRetailBatchRequest::CatalogsRetailBatchRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailBatchRequest::~CatalogsRetailBatchRequest()
{

}

void
CatalogsRetailBatchRequest::fromJson(std::string jsonObj)
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


        std::list<CatalogsRetailBatchRequestItemsItems> items_list;
        CatalogsRetailBatchRequestItemsItems element;
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
CatalogsRetailBatchRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();







	object["country"] = getCountry().toJson();




    std::list<CatalogsRetailBatchRequestItemsItems> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        CatalogsRetailBatchRequestItemsItems obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["language"] = getLanguage();



    return object;

}

std::string
CatalogsRetailBatchRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsRetailBatchRequest::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsRetailBatchRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailBatchRequest::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsRetailBatchRequest::getCountry()
{
	return country;
}

void
CatalogsRetailBatchRequest::setCountry(Country country)
{
	this->country = country;
}

std::list<CatalogsRetailBatchRequestItemsItems>
CatalogsRetailBatchRequest::getItems()
{
	return items;
}

void
CatalogsRetailBatchRequest::setItems(std::list<CatalogsRetailBatchRequestItemsItems> items)
{
	this->items = items;
}

std::string
CatalogsRetailBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsRetailBatchRequest::setLanguage(std::string language)
{
	this->language = language;
}



