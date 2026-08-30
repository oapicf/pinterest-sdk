

#include "PinMediaWithVideos.h"

using namespace Tiny;

PinMediaWithVideos::PinMediaWithVideos()
{
	items = std::list<VideoMetadataWithItemType>();
	media_type = std::string();
}

PinMediaWithVideos::PinMediaWithVideos(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaWithVideos::~PinMediaWithVideos()
{

}

void
PinMediaWithVideos::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<VideoMetadataWithItemType> items_list;
        VideoMetadataWithItemType element;
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
PinMediaWithVideos::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<VideoMetadataWithItemType> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        VideoMetadataWithItemType obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["media_type"] = getMediaType();



    return object;

}

std::list<VideoMetadataWithItemType>
PinMediaWithVideos::getItems()
{
	return items;
}

void
PinMediaWithVideos::setItems(std::list<VideoMetadataWithItemType> items)
{
	this->items = items;
}

std::string
PinMediaWithVideos::getMediaType()
{
	return media_type;
}

void
PinMediaWithVideos::setMediaType(std::string media_type)
{
	this->media_type = media_type;
}



