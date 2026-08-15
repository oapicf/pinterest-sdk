

#include "ProductGroupPromotionResponse.h"

using namespace Tiny;

ProductGroupPromotionResponse::ProductGroupPromotionResponse()
{
	items = std::list<ProductGroupPromotionResponseItem>();
}

ProductGroupPromotionResponse::ProductGroupPromotionResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductGroupPromotionResponse::~ProductGroupPromotionResponse()
{

}

void
ProductGroupPromotionResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<ProductGroupPromotionResponseItem> items_list;
        ProductGroupPromotionResponseItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
ProductGroupPromotionResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ProductGroupPromotionResponseItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ProductGroupPromotionResponseItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<ProductGroupPromotionResponseItem>
ProductGroupPromotionResponse::getItems()
{
	return items;
}

void
ProductGroupPromotionResponse::setItems(std::list <ProductGroupPromotionResponseItem> items)
{
	this->items = items;
}



