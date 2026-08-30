

#include "Product_group_promotions_list_200_response.h"

using namespace Tiny;

Product_group_promotions_list_200_response::Product_group_promotions_list_200_response()
{
	bookmark = std::string();
	items = std::list<ProductGroupPromotion>();
}

Product_group_promotions_list_200_response::Product_group_promotions_list_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Product_group_promotions_list_200_response::~Product_group_promotions_list_200_response()
{

}

void
Product_group_promotions_list_200_response::fromJson(std::string jsonObj)
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


        std::list<ProductGroupPromotion> items_list;
        ProductGroupPromotion element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
Product_group_promotions_list_200_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["bookmark"] = getBookmark();





    std::list<ProductGroupPromotion> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ProductGroupPromotion obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::string
Product_group_promotions_list_200_response::getBookmark()
{
	return bookmark;
}

void
Product_group_promotions_list_200_response::setBookmark(std::string bookmark)
{
	this->bookmark = bookmark;
}

std::list<ProductGroupPromotion>
Product_group_promotions_list_200_response::getItems()
{
	return items;
}

void
Product_group_promotions_list_200_response::setItems(std::list<ProductGroupPromotion> items)
{
	this->items = items;
}



