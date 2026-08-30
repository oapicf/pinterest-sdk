

#include "AdPreviewSourceImage.h"

using namespace Tiny;

AdPreviewSourceImage::AdPreviewSourceImage()
{
	image_url = std::string();
	promotion_id = std::string();
	title = std::string();
}

AdPreviewSourceImage::AdPreviewSourceImage(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdPreviewSourceImage::~AdPreviewSourceImage()
{

}

void
AdPreviewSourceImage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *image_urlKey = "image_url";

    if(object.has_key(image_urlKey))
    {
        bourne::json value = object[image_urlKey];



        jsonToValue(&image_url, value, "std::string");


    }

    const char *promotion_idKey = "promotion_id";

    if(object.has_key(promotion_idKey))
    {
        bourne::json value = object[promotion_idKey];



        jsonToValue(&promotion_id, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
AdPreviewSourceImage::toJson()
{
    bourne::json object = bourne::json::object();





    object["image_url"] = getImageUrl();






    object["promotion_id"] = getPromotionId();






    object["title"] = getTitle();



    return object;

}

std::string
AdPreviewSourceImage::getImageUrl()
{
	return image_url;
}

void
AdPreviewSourceImage::setImageUrl(std::string image_url)
{
	this->image_url = image_url;
}

std::string
AdPreviewSourceImage::getPromotionId()
{
	return promotion_id;
}

void
AdPreviewSourceImage::setPromotionId(std::string promotion_id)
{
	this->promotion_id = promotion_id;
}

std::string
AdPreviewSourceImage::getTitle()
{
	return title;
}

void
AdPreviewSourceImage::setTitle(std::string title)
{
	this->title = title;
}



