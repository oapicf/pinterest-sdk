

#include "Ad_account_countries_get_200_response.h"

using namespace Tiny;

Ad_account_countries_get_200_response::Ad_account_countries_get_200_response()
{
	items = std::list<AdAccountsCountry>();
}

Ad_account_countries_get_200_response::Ad_account_countries_get_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Ad_account_countries_get_200_response::~Ad_account_countries_get_200_response()
{

}

void
Ad_account_countries_get_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AdAccountsCountry> items_list;
        AdAccountsCountry element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
Ad_account_countries_get_200_response::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AdAccountsCountry> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AdAccountsCountry obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<AdAccountsCountry>
Ad_account_countries_get_200_response::getItems()
{
	return items;
}

void
Ad_account_countries_get_200_response::setItems(std::list<AdAccountsCountry> items)
{
	this->items = items;
}



