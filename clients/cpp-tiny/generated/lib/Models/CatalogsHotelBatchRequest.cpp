

#include "CatalogsHotelBatchRequest.h"

using namespace Tiny;

CatalogsHotelBatchRequest::CatalogsHotelBatchRequest()
{
	catalog_id = std::string();
	catalog_type = std::string();
	country = Country();
	items = std::list<CatalogsHotelBatchItem>();
	language = std::string();
}

CatalogsHotelBatchRequest::CatalogsHotelBatchRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelBatchRequest::~CatalogsHotelBatchRequest()
{

}

void
CatalogsHotelBatchRequest::fromJson(std::string jsonObj)
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


        std::list<CatalogsHotelBatchItem> items_list;
        CatalogsHotelBatchItem element;
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
CatalogsHotelBatchRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();







	object["country"] = getCountry().toJson();




    std::list<CatalogsHotelBatchItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        CatalogsHotelBatchItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["language"] = getLanguage();



    return object;

}

std::string
CatalogsHotelBatchRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelBatchRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsHotelBatchRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelBatchRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsHotelBatchRequest::getCountry()
{
	return country;
}

void
CatalogsHotelBatchRequest::setCountry(Country  country)
{
	this->country = country;
}

std::list<CatalogsHotelBatchItem>
CatalogsHotelBatchRequest::getItems()
{
	return items;
}

void
CatalogsHotelBatchRequest::setItems(std::list <CatalogsHotelBatchItem> items)
{
	this->items = items;
}

std::string
CatalogsHotelBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsHotelBatchRequest::setLanguage(std::string  language)
{
	this->language = language;
}



