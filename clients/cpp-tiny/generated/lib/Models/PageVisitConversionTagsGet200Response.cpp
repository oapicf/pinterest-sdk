

#include "Page_visit_conversion_tags_get_200_response.h"

using namespace Tiny;

Page_visit_conversion_tags_get_200_response::Page_visit_conversion_tags_get_200_response()
{
	bookmark = std::string();
	items = std::list<ConversionEventResponse>();
}

Page_visit_conversion_tags_get_200_response::Page_visit_conversion_tags_get_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Page_visit_conversion_tags_get_200_response::~Page_visit_conversion_tags_get_200_response()
{

}

void
Page_visit_conversion_tags_get_200_response::fromJson(std::string jsonObj)
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


        std::list<ConversionEventResponse> items_list;
        ConversionEventResponse element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
Page_visit_conversion_tags_get_200_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["bookmark"] = getBookmark();





    std::list<ConversionEventResponse> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ConversionEventResponse obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::string
Page_visit_conversion_tags_get_200_response::getBookmark()
{
	return bookmark;
}

void
Page_visit_conversion_tags_get_200_response::setBookmark(std::string bookmark)
{
	this->bookmark = bookmark;
}

std::list<ConversionEventResponse>
Page_visit_conversion_tags_get_200_response::getItems()
{
	return items;
}

void
Page_visit_conversion_tags_get_200_response::setItems(std::list<ConversionEventResponse> items)
{
	this->items = items;
}



