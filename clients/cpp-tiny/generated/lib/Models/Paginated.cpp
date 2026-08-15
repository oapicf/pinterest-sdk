

#include "Paginated.h"

using namespace Tiny;

Paginated::Paginated()
{
	bookmark = std::string();
	items = std::list<Object>();
}

Paginated::Paginated(std::string jsonString)
{
	this->fromJson(jsonString);
}

Paginated::~Paginated()
{

}

void
Paginated::fromJson(std::string jsonObj)
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


        std::list<Object> items_list;
        Object element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
Paginated::toJson()
{
    bourne::json object = bourne::json::object();





    object["bookmark"] = getBookmark();





    std::list<Object> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        Object obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::string
Paginated::getBookmark()
{
	return bookmark;
}

void
Paginated::setBookmark(std::string  bookmark)
{
	this->bookmark = bookmark;
}

std::list<Object>
Paginated::getItems()
{
	return items;
}

void
Paginated::setItems(std::list <Object> items)
{
	this->items = items;
}



