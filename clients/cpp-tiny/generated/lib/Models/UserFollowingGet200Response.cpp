

#include "User_following_get_200_response.h"

using namespace Tiny;

User_following_get_200_response::User_following_get_200_response()
{
	bookmark = std::string();
	items = std::list<UserSummary>();
}

User_following_get_200_response::User_following_get_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

User_following_get_200_response::~User_following_get_200_response()
{

}

void
User_following_get_200_response::fromJson(std::string jsonObj)
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


        std::list<UserSummary> items_list;
        UserSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
User_following_get_200_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["bookmark"] = getBookmark();





    std::list<UserSummary> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        UserSummary obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::string
User_following_get_200_response::getBookmark()
{
	return bookmark;
}

void
User_following_get_200_response::setBookmark(std::string  bookmark)
{
	this->bookmark = bookmark;
}

std::list<UserSummary>
User_following_get_200_response::getItems()
{
	return items;
}

void
User_following_get_200_response::setItems(std::list <UserSummary> items)
{
	this->items = items;
}



