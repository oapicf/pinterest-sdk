

#include "Catalogs_product_group_pins_list_200_response.h"

using namespace Tiny;

Catalogs_product_group_pins_list_200_response::Catalogs_product_group_pins_list_200_response()
{
	bookmark = std::string();
	items = std::list<CatalogsProduct>();
}

Catalogs_product_group_pins_list_200_response::Catalogs_product_group_pins_list_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Catalogs_product_group_pins_list_200_response::~Catalogs_product_group_pins_list_200_response()
{

}

void
Catalogs_product_group_pins_list_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bookmarkKey = "bookmark";

    if(object.has_key(bookmarkKey))
    {
        bourne::json value = object[bookmarkKey];



        jsonToValue(&bookmark, value, "std::string");


    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<CatalogsProduct> items_list;
        CatalogsProduct element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
Catalogs_product_group_pins_list_200_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["bookmark"] = getBookmark();





    std::list<CatalogsProduct> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        CatalogsProduct obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::string
Catalogs_product_group_pins_list_200_response::getBookmark()
{
	return bookmark;
}

void
Catalogs_product_group_pins_list_200_response::setBookmark(std::string  bookmark)
{
	this->bookmark = bookmark;
}

std::list<CatalogsProduct>
Catalogs_product_group_pins_list_200_response::getItems()
{
	return items;
}

void
Catalogs_product_group_pins_list_200_response::setItems(std::list <CatalogsProduct> items)
{
	this->items = items;
}



