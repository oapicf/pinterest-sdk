

#include "AdPreviewShopping.h"

using namespace Tiny;

AdPreviewShopping::AdPreviewShopping()
{
	catalog_product_group_id = std::string();
	creative_type = std::string();
	customizable_cta_type = null;
	hero_image_title = std::string();
	hero_image_url = std::string();
	hero_pin_id = std::string();
	image_tag = std::string();
	item_id = std::string();
	preferred_media_type = std::string();
	video_tag = std::string();
}

AdPreviewShopping::AdPreviewShopping(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdPreviewShopping::~AdPreviewShopping()
{

}

void
AdPreviewShopping::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_product_group_idKey = "catalog_product_group_id";

    if(object.has_key(catalog_product_group_idKey))
    {
        bourne::json value = object[catalog_product_group_idKey];



        jsonToValue(&catalog_product_group_id, value, "std::string");


    }

    const char *creative_typeKey = "creative_type";

    if(object.has_key(creative_typeKey))
    {
        bourne::json value = object[creative_typeKey];



        jsonToValue(&creative_type, value, "std::string");


    }

    const char *customizable_cta_typeKey = "customizable_cta_type";

    if(object.has_key(customizable_cta_typeKey))
    {
        bourne::json value = object[customizable_cta_typeKey];




        CustomizableCTAType* obj = &customizable_cta_type;
		obj->fromJson(value.dump());

    }

    const char *hero_image_titleKey = "hero_image_title";

    if(object.has_key(hero_image_titleKey))
    {
        bourne::json value = object[hero_image_titleKey];



        jsonToValue(&hero_image_title, value, "std::string");


    }

    const char *hero_image_urlKey = "hero_image_url";

    if(object.has_key(hero_image_urlKey))
    {
        bourne::json value = object[hero_image_urlKey];



        jsonToValue(&hero_image_url, value, "std::string");


    }

    const char *hero_pin_idKey = "hero_pin_id";

    if(object.has_key(hero_pin_idKey))
    {
        bourne::json value = object[hero_pin_idKey];



        jsonToValue(&hero_pin_id, value, "std::string");


    }

    const char *image_tagKey = "image_tag";

    if(object.has_key(image_tagKey))
    {
        bourne::json value = object[image_tagKey];



        jsonToValue(&image_tag, value, "std::string");


    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *preferred_media_typeKey = "preferred_media_type";

    if(object.has_key(preferred_media_typeKey))
    {
        bourne::json value = object[preferred_media_typeKey];



        jsonToValue(&preferred_media_type, value, "std::string");


    }

    const char *video_tagKey = "video_tag";

    if(object.has_key(video_tagKey))
    {
        bourne::json value = object[video_tagKey];



        jsonToValue(&video_tag, value, "std::string");


    }


}

bourne::json
AdPreviewShopping::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_product_group_id"] = getCatalogProductGroupId();






    object["creative_type"] = getCreativeType();







	object["customizable_cta_type"] = getCustomizableCtaType().toJson();





    object["hero_image_title"] = getHeroImageTitle();






    object["hero_image_url"] = getHeroImageUrl();






    object["hero_pin_id"] = getHeroPinId();






    object["image_tag"] = getImageTag();






    object["item_id"] = getItemId();






    object["preferred_media_type"] = getPreferredMediaType();






    object["video_tag"] = getVideoTag();



    return object;

}

std::string
AdPreviewShopping::getCatalogProductGroupId()
{
	return catalog_product_group_id;
}

void
AdPreviewShopping::setCatalogProductGroupId(std::string  catalog_product_group_id)
{
	this->catalog_product_group_id = catalog_product_group_id;
}

std::string
AdPreviewShopping::getCreativeType()
{
	return creative_type;
}

void
AdPreviewShopping::setCreativeType(std::string  creative_type)
{
	this->creative_type = creative_type;
}

CustomizableCTAType
AdPreviewShopping::getCustomizableCtaType()
{
	return customizable_cta_type;
}

void
AdPreviewShopping::setCustomizableCtaType(CustomizableCTAType  customizable_cta_type)
{
	this->customizable_cta_type = customizable_cta_type;
}

std::string
AdPreviewShopping::getHeroImageTitle()
{
	return hero_image_title;
}

void
AdPreviewShopping::setHeroImageTitle(std::string  hero_image_title)
{
	this->hero_image_title = hero_image_title;
}

std::string
AdPreviewShopping::getHeroImageUrl()
{
	return hero_image_url;
}

void
AdPreviewShopping::setHeroImageUrl(std::string  hero_image_url)
{
	this->hero_image_url = hero_image_url;
}

std::string
AdPreviewShopping::getHeroPinId()
{
	return hero_pin_id;
}

void
AdPreviewShopping::setHeroPinId(std::string  hero_pin_id)
{
	this->hero_pin_id = hero_pin_id;
}

std::string
AdPreviewShopping::getImageTag()
{
	return image_tag;
}

void
AdPreviewShopping::setImageTag(std::string  image_tag)
{
	this->image_tag = image_tag;
}

std::string
AdPreviewShopping::getItemId()
{
	return item_id;
}

void
AdPreviewShopping::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::string
AdPreviewShopping::getPreferredMediaType()
{
	return preferred_media_type;
}

void
AdPreviewShopping::setPreferredMediaType(std::string  preferred_media_type)
{
	this->preferred_media_type = preferred_media_type;
}

std::string
AdPreviewShopping::getVideoTag()
{
	return video_tag;
}

void
AdPreviewShopping::setVideoTag(std::string  video_tag)
{
	this->video_tag = video_tag;
}



