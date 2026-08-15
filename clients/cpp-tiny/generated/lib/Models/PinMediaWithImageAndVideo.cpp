

#include "PinMediaWithImageAndVideo.h"

using namespace Tiny;

PinMediaWithImageAndVideo::PinMediaWithImageAndVideo()
{
	items = std::list<PinMediaMetadata>();
	media_type = std::string();
}

PinMediaWithImageAndVideo::PinMediaWithImageAndVideo(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaWithImageAndVideo::~PinMediaWithImageAndVideo()
{

}

void
PinMediaWithImageAndVideo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<PinMediaMetadata> items_list;
        PinMediaMetadata element;
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
PinMediaWithImageAndVideo::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<PinMediaMetadata> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        PinMediaMetadata obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["media_type"] = getMediaType();



    return object;

}

std::list<PinMediaMetadata>
PinMediaWithImageAndVideo::getItems()
{
	return items;
}

void
PinMediaWithImageAndVideo::setItems(std::list <PinMediaMetadata> items)
{
	this->items = items;
}

std::string
PinMediaWithImageAndVideo::getMediaType()
{
	return media_type;
}

void
PinMediaWithImageAndVideo::setMediaType(std::string  media_type)
{
	this->media_type = media_type;
}



