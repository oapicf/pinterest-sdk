

#include "AdAccountsCountryResponse.h"

using namespace Tiny;

AdAccountsCountryResponse::AdAccountsCountryResponse()
{
	items = std::list<AdAccountsCountryResponseData>();
}

AdAccountsCountryResponse::AdAccountsCountryResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountsCountryResponse::~AdAccountsCountryResponse()
{

}

void
AdAccountsCountryResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AdAccountsCountryResponseData> items_list;
        AdAccountsCountryResponseData element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
AdAccountsCountryResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AdAccountsCountryResponseData> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AdAccountsCountryResponseData obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<AdAccountsCountryResponseData>
AdAccountsCountryResponse::getItems()
{
	return items;
}

void
AdAccountsCountryResponse::setItems(std::list <AdAccountsCountryResponseData> items)
{
	this->items = items;
}



