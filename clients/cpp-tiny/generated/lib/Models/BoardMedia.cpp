

#include "BoardMedia.h"

using namespace Tiny;

BoardMedia::BoardMedia()
{
	image_cover_url = std::string();
	pin_thumbnail_urls = std::list<std::string>();
}

BoardMedia::BoardMedia(std::string jsonString)
{
	this->fromJson(jsonString);
}

BoardMedia::~BoardMedia()
{

}

void
BoardMedia::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *image_cover_urlKey = "image_cover_url";

    if(object.has_key(image_cover_urlKey))
    {
        bourne::json value = object[image_cover_urlKey];



        jsonToValue(&image_cover_url, value, "std::string");


    }

    const char *pin_thumbnail_urlsKey = "pin_thumbnail_urls";

    if(object.has_key(pin_thumbnail_urlsKey))
    {
        bourne::json value = object[pin_thumbnail_urlsKey];


        std::list<std::string> pin_thumbnail_urls_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            pin_thumbnail_urls_list.push_back(element);
        }
        pin_thumbnail_urls = pin_thumbnail_urls_list;


    }


}

bourne::json
BoardMedia::toJson()
{
    bourne::json object = bourne::json::object();





    object["image_cover_url"] = getImageCoverUrl();





    std::list<std::string> pin_thumbnail_urls_list = getPinThumbnailUrls();
    bourne::json pin_thumbnail_urls_arr = bourne::json::array();

    for(auto& var : pin_thumbnail_urls_list)
    {
        pin_thumbnail_urls_arr.append(var);
    }
    object["pin_thumbnail_urls"] = pin_thumbnail_urls_arr;






    return object;

}

std::string
BoardMedia::getImageCoverUrl()
{
	return image_cover_url;
}

void
BoardMedia::setImageCoverUrl(std::string image_cover_url)
{
	this->image_cover_url = image_cover_url;
}

std::list<std::string>
BoardMedia::getPinThumbnailUrls()
{
	return pin_thumbnail_urls;
}

void
BoardMedia::setPinThumbnailUrls(std::list<std::string> pin_thumbnail_urls)
{
	this->pin_thumbnail_urls = pin_thumbnail_urls;
}



