

#include "AdPreviewRequest.h"

using namespace Tiny;

AdPreviewRequest::AdPreviewRequest()
{
	image_url = std::string();
	promotion_id = std::string();
	title = std::string();
	creative_type = null;
	pin_id = std::string();
	catalog_product_group_id = std::string();
	customizable_cta_type = null;
	hero_image_title = std::string();
	hero_image_url = std::string();
	hero_pin_id = std::string();
	image_tag = std::string();
	item_id = std::string();
	preferred_media_type = null;
	show_promotion = bool(false);
	video_tag = std::string();
}

AdPreviewRequest::AdPreviewRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdPreviewRequest::~AdPreviewRequest()
{

}

void
AdPreviewRequest::fromJson(std::string jsonObj)
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

    const char *creative_typeKey = "creative_type";

    if(object.has_key(creative_typeKey))
    {
        bourne::json value = object[creative_typeKey];




        AdShoppingPreviewCreativeType* obj = &creative_type;
		obj->fromJson(value.dump());

    }

    const char *pin_idKey = "pin_id";

    if(object.has_key(pin_idKey))
    {
        bourne::json value = object[pin_idKey];



        jsonToValue(&pin_id, value, "std::string");


    }

    const char *catalog_product_group_idKey = "catalog_product_group_id";

    if(object.has_key(catalog_product_group_idKey))
    {
        bourne::json value = object[catalog_product_group_idKey];



        jsonToValue(&catalog_product_group_id, value, "std::string");


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




        BasePreferredMediaType* obj = &preferred_media_type;
		obj->fromJson(value.dump());

    }

    const char *show_promotionKey = "show_promotion";

    if(object.has_key(show_promotionKey))
    {
        bourne::json value = object[show_promotionKey];



        jsonToValue(&show_promotion, value, "bool");


    }

    const char *video_tagKey = "video_tag";

    if(object.has_key(video_tagKey))
    {
        bourne::json value = object[video_tagKey];



        jsonToValue(&video_tag, value, "std::string");


    }


}

bourne::json
AdPreviewRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["image_url"] = getImageUrl();






    object["promotion_id"] = getPromotionId();






    object["title"] = getTitle();







	object["creative_type"] = getCreativeType().toJson();





    object["pin_id"] = getPinId();






    object["catalog_product_group_id"] = getCatalogProductGroupId();







	object["customizable_cta_type"] = getCustomizableCtaType().toJson();





    object["hero_image_title"] = getHeroImageTitle();






    object["hero_image_url"] = getHeroImageUrl();






    object["hero_pin_id"] = getHeroPinId();






    object["image_tag"] = getImageTag();






    object["item_id"] = getItemId();







	object["preferred_media_type"] = getPreferredMediaType().toJson();





    object["show_promotion"] = isShowPromotion();






    object["video_tag"] = getVideoTag();



    return object;

}

std::string
AdPreviewRequest::getImageUrl()
{
	return image_url;
}

void
AdPreviewRequest::setImageUrl(std::string image_url)
{
	this->image_url = image_url;
}

std::string
AdPreviewRequest::getPromotionId()
{
	return promotion_id;
}

void
AdPreviewRequest::setPromotionId(std::string promotion_id)
{
	this->promotion_id = promotion_id;
}

std::string
AdPreviewRequest::getTitle()
{
	return title;
}

void
AdPreviewRequest::setTitle(std::string title)
{
	this->title = title;
}

AdShoppingPreviewCreativeType
AdPreviewRequest::getCreativeType()
{
	return creative_type;
}

void
AdPreviewRequest::setCreativeType(AdShoppingPreviewCreativeType creative_type)
{
	this->creative_type = creative_type;
}

std::string
AdPreviewRequest::getPinId()
{
	return pin_id;
}

void
AdPreviewRequest::setPinId(std::string pin_id)
{
	this->pin_id = pin_id;
}

std::string
AdPreviewRequest::getCatalogProductGroupId()
{
	return catalog_product_group_id;
}

void
AdPreviewRequest::setCatalogProductGroupId(std::string catalog_product_group_id)
{
	this->catalog_product_group_id = catalog_product_group_id;
}

CustomizableCTAType
AdPreviewRequest::getCustomizableCtaType()
{
	return customizable_cta_type;
}

void
AdPreviewRequest::setCustomizableCtaType(CustomizableCTAType customizable_cta_type)
{
	this->customizable_cta_type = customizable_cta_type;
}

std::string
AdPreviewRequest::getHeroImageTitle()
{
	return hero_image_title;
}

void
AdPreviewRequest::setHeroImageTitle(std::string hero_image_title)
{
	this->hero_image_title = hero_image_title;
}

std::string
AdPreviewRequest::getHeroImageUrl()
{
	return hero_image_url;
}

void
AdPreviewRequest::setHeroImageUrl(std::string hero_image_url)
{
	this->hero_image_url = hero_image_url;
}

std::string
AdPreviewRequest::getHeroPinId()
{
	return hero_pin_id;
}

void
AdPreviewRequest::setHeroPinId(std::string hero_pin_id)
{
	this->hero_pin_id = hero_pin_id;
}

std::string
AdPreviewRequest::getImageTag()
{
	return image_tag;
}

void
AdPreviewRequest::setImageTag(std::string image_tag)
{
	this->image_tag = image_tag;
}

std::string
AdPreviewRequest::getItemId()
{
	return item_id;
}

void
AdPreviewRequest::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

BasePreferredMediaType
AdPreviewRequest::getPreferredMediaType()
{
	return preferred_media_type;
}

void
AdPreviewRequest::setPreferredMediaType(BasePreferredMediaType preferred_media_type)
{
	this->preferred_media_type = preferred_media_type;
}

bool
AdPreviewRequest::isShowPromotion()
{
	return show_promotion;
}

void
AdPreviewRequest::setShowPromotion(bool show_promotion)
{
	this->show_promotion = show_promotion;
}

std::string
AdPreviewRequest::getVideoTag()
{
	return video_tag;
}

void
AdPreviewRequest::setVideoTag(std::string video_tag)
{
	this->video_tag = video_tag;
}



