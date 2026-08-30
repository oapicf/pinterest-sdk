

#include "PinMediaWithImages.h"

using namespace Tiny;

PinMediaWithImages::PinMediaWithImages()
{
	items = std::list<ImageMetadata>();
	media_type = std::string();
}

PinMediaWithImages::PinMediaWithImages(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaWithImages::~PinMediaWithImages()
{

}

void
PinMediaWithImages::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<ImageMetadata> items_list;
        ImageMetadata element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *media_typeKey = "media_type";

    if(object.has_key(media_typeKey))
    {
        bourne::json value = object[media_typeKey];



        jsonToValue(&media_type, value, "std::string");


    }


}

bourne::json
PinMediaWithImages::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ImageMetadata> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ImageMetadata obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["media_type"] = getMediaType();



    return object;

}

std::list<ImageMetadata>
PinMediaWithImages::getItems()
{
	return items;
}

void
PinMediaWithImages::setItems(std::list<ImageMetadata> items)
{
	this->items = items;
}

std::string
PinMediaWithImages::getMediaType()
{
	return media_type;
}

void
PinMediaWithImages::setMediaType(std::string media_type)
{
	this->media_type = media_type;
}



