

#include "Items_issues_list_200_response.h"

using namespace Tiny;

Items_issues_list_200_response::Items_issues_list_200_response()
{
	bookmark = std::string();
	items = std::list<CatalogsItemValidationIssues>();
}

Items_issues_list_200_response::Items_issues_list_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Items_issues_list_200_response::~Items_issues_list_200_response()
{

}

void
Items_issues_list_200_response::fromJson(std::string jsonObj)
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


        std::list<CatalogsItemValidationIssues> items_list;
        CatalogsItemValidationIssues element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
Items_issues_list_200_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["bookmark"] = getBookmark();





    std::list<CatalogsItemValidationIssues> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        CatalogsItemValidationIssues obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::string
Items_issues_list_200_response::getBookmark()
{
	return bookmark;
}

void
Items_issues_list_200_response::setBookmark(std::string bookmark)
{
	this->bookmark = bookmark;
}

std::list<CatalogsItemValidationIssues>
Items_issues_list_200_response::getItems()
{
	return items;
}

void
Items_issues_list_200_response::setItems(std::list<CatalogsItemValidationIssues> items)
{
	this->items = items;
}



