

#include "ProductGroupPromotion.h"

using namespace Tiny;

ProductGroupPromotion::ProductGroupPromotion()
{
	ad_group_id = std::string();
	bid_in_micro_currency = int(0);
	catalog_product_group_id = std::string();
	catalog_product_group_name = std::string();
	collections_header_type = CollectionsHeaderType();
	collections_hero_destination_url = std::string();
	collections_hero_pin_id = std::string();
	creative_type = CreativeType();
	customizable_cta_type = ProductGroupPromotionCustomizableCTAType();
	definition = std::string();
	grid_click_type = GridClickType();
	id = std::string();
	included = bool(false);
	is_generate_background = bool(false);
	is_image_auto_resizing = bool(false);
	is_mdl = bool(false);
	parent_id = std::string();
	preferred_media_type = PreferredMediaType();
	relative_definition = std::string();
	selected_image_tag = std::string();
	selected_video_tag = std::string();
	slideshow_collections_description = std::string();
	slideshow_collections_title = std::string();
	status = EntityStatus();
	tracking_url = std::string();
}

ProductGroupPromotion::ProductGroupPromotion(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductGroupPromotion::~ProductGroupPromotion()
{

}

void
ProductGroupPromotion::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_group_idKey = "ad_group_id";

    if(object.has_key(ad_group_idKey))
    {
        bourne::json value = object[ad_group_idKey];



        jsonToValue(&ad_group_id, value, "std::string");


    }

    const char *bid_in_micro_currencyKey = "bid_in_micro_currency";

    if(object.has_key(bid_in_micro_currencyKey))
    {
        bourne::json value = object[bid_in_micro_currencyKey];



        jsonToValue(&bid_in_micro_currency, value, "int");


    }

    const char *catalog_product_group_idKey = "catalog_product_group_id";

    if(object.has_key(catalog_product_group_idKey))
    {
        bourne::json value = object[catalog_product_group_idKey];



        jsonToValue(&catalog_product_group_id, value, "std::string");


    }

    const char *catalog_product_group_nameKey = "catalog_product_group_name";

    if(object.has_key(catalog_product_group_nameKey))
    {
        bourne::json value = object[catalog_product_group_nameKey];



        jsonToValue(&catalog_product_group_name, value, "std::string");


    }

    const char *collections_header_typeKey = "collections_header_type";

    if(object.has_key(collections_header_typeKey))
    {
        bourne::json value = object[collections_header_typeKey];




        CollectionsHeaderType* obj = &collections_header_type;
		obj->fromJson(value.dump());

    }

    const char *collections_hero_destination_urlKey = "collections_hero_destination_url";

    if(object.has_key(collections_hero_destination_urlKey))
    {
        bourne::json value = object[collections_hero_destination_urlKey];



        jsonToValue(&collections_hero_destination_url, value, "std::string");


    }

    const char *collections_hero_pin_idKey = "collections_hero_pin_id";

    if(object.has_key(collections_hero_pin_idKey))
    {
        bourne::json value = object[collections_hero_pin_idKey];



        jsonToValue(&collections_hero_pin_id, value, "std::string");


    }

    const char *creative_typeKey = "creative_type";

    if(object.has_key(creative_typeKey))
    {
        bourne::json value = object[creative_typeKey];




        CreativeType* obj = &creative_type;
		obj->fromJson(value.dump());

    }

    const char *customizable_cta_typeKey = "customizable_cta_type";

    if(object.has_key(customizable_cta_typeKey))
    {
        bourne::json value = object[customizable_cta_typeKey];




        ProductGroupPromotionCustomizableCTAType* obj = &customizable_cta_type;
		obj->fromJson(value.dump());

    }

    const char *definitionKey = "definition";

    if(object.has_key(definitionKey))
    {
        bourne::json value = object[definitionKey];



        jsonToValue(&definition, value, "std::string");


    }

    const char *grid_click_typeKey = "grid_click_type";

    if(object.has_key(grid_click_typeKey))
    {
        bourne::json value = object[grid_click_typeKey];




        GridClickType* obj = &grid_click_type;
		obj->fromJson(value.dump());

    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *includedKey = "included";

    if(object.has_key(includedKey))
    {
        bourne::json value = object[includedKey];



        jsonToValue(&included, value, "bool");


    }

    const char *is_generate_backgroundKey = "is_generate_background";

    if(object.has_key(is_generate_backgroundKey))
    {
        bourne::json value = object[is_generate_backgroundKey];



        jsonToValue(&is_generate_background, value, "bool");


    }

    const char *is_image_auto_resizingKey = "is_image_auto_resizing";

    if(object.has_key(is_image_auto_resizingKey))
    {
        bourne::json value = object[is_image_auto_resizingKey];



        jsonToValue(&is_image_auto_resizing, value, "bool");


    }

    const char *is_mdlKey = "is_mdl";

    if(object.has_key(is_mdlKey))
    {
        bourne::json value = object[is_mdlKey];



        jsonToValue(&is_mdl, value, "bool");


    }

    const char *parent_idKey = "parent_id";

    if(object.has_key(parent_idKey))
    {
        bourne::json value = object[parent_idKey];



        jsonToValue(&parent_id, value, "std::string");


    }

    const char *preferred_media_typeKey = "preferred_media_type";

    if(object.has_key(preferred_media_typeKey))
    {
        bourne::json value = object[preferred_media_typeKey];




        PreferredMediaType* obj = &preferred_media_type;
		obj->fromJson(value.dump());

    }

    const char *relative_definitionKey = "relative_definition";

    if(object.has_key(relative_definitionKey))
    {
        bourne::json value = object[relative_definitionKey];



        jsonToValue(&relative_definition, value, "std::string");


    }

    const char *selected_image_tagKey = "selected_image_tag";

    if(object.has_key(selected_image_tagKey))
    {
        bourne::json value = object[selected_image_tagKey];



        jsonToValue(&selected_image_tag, value, "std::string");


    }

    const char *selected_video_tagKey = "selected_video_tag";

    if(object.has_key(selected_video_tagKey))
    {
        bourne::json value = object[selected_video_tagKey];



        jsonToValue(&selected_video_tag, value, "std::string");


    }

    const char *slideshow_collections_descriptionKey = "slideshow_collections_description";

    if(object.has_key(slideshow_collections_descriptionKey))
    {
        bourne::json value = object[slideshow_collections_descriptionKey];



        jsonToValue(&slideshow_collections_description, value, "std::string");


    }

    const char *slideshow_collections_titleKey = "slideshow_collections_title";

    if(object.has_key(slideshow_collections_titleKey))
    {
        bourne::json value = object[slideshow_collections_titleKey];



        jsonToValue(&slideshow_collections_title, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        EntityStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *tracking_urlKey = "tracking_url";

    if(object.has_key(tracking_urlKey))
    {
        bourne::json value = object[tracking_urlKey];



        jsonToValue(&tracking_url, value, "std::string");


    }


}

bourne::json
ProductGroupPromotion::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_group_id"] = getAdGroupId();






    object["bid_in_micro_currency"] = getBidInMicroCurrency();






    object["catalog_product_group_id"] = getCatalogProductGroupId();






    object["catalog_product_group_name"] = getCatalogProductGroupName();







	object["collections_header_type"] = getCollectionsHeaderType().toJson();





    object["collections_hero_destination_url"] = getCollectionsHeroDestinationUrl();






    object["collections_hero_pin_id"] = getCollectionsHeroPinId();







	object["creative_type"] = getCreativeType().toJson();






	object["customizable_cta_type"] = getCustomizableCtaType().toJson();





    object["definition"] = getDefinition();







	object["grid_click_type"] = getGridClickType().toJson();





    object["id"] = getId();






    object["included"] = isIncluded();






    object["is_generate_background"] = isIsGenerateBackground();






    object["is_image_auto_resizing"] = isIsImageAutoResizing();






    object["is_mdl"] = isIsMdl();






    object["parent_id"] = getParentId();







	object["preferred_media_type"] = getPreferredMediaType().toJson();





    object["relative_definition"] = getRelativeDefinition();






    object["selected_image_tag"] = getSelectedImageTag();






    object["selected_video_tag"] = getSelectedVideoTag();






    object["slideshow_collections_description"] = getSlideshowCollectionsDescription();






    object["slideshow_collections_title"] = getSlideshowCollectionsTitle();







	object["status"] = getStatus().toJson();





    object["tracking_url"] = getTrackingUrl();



    return object;

}

std::string
ProductGroupPromotion::getAdGroupId()
{
	return ad_group_id;
}

void
ProductGroupPromotion::setAdGroupId(std::string ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

int
ProductGroupPromotion::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
ProductGroupPromotion::setBidInMicroCurrency(int bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
}

std::string
ProductGroupPromotion::getCatalogProductGroupId()
{
	return catalog_product_group_id;
}

void
ProductGroupPromotion::setCatalogProductGroupId(std::string catalog_product_group_id)
{
	this->catalog_product_group_id = catalog_product_group_id;
}

std::string
ProductGroupPromotion::getCatalogProductGroupName()
{
	return catalog_product_group_name;
}

void
ProductGroupPromotion::setCatalogProductGroupName(std::string catalog_product_group_name)
{
	this->catalog_product_group_name = catalog_product_group_name;
}

CollectionsHeaderType
ProductGroupPromotion::getCollectionsHeaderType()
{
	return collections_header_type;
}

void
ProductGroupPromotion::setCollectionsHeaderType(CollectionsHeaderType collections_header_type)
{
	this->collections_header_type = collections_header_type;
}

std::string
ProductGroupPromotion::getCollectionsHeroDestinationUrl()
{
	return collections_hero_destination_url;
}

void
ProductGroupPromotion::setCollectionsHeroDestinationUrl(std::string collections_hero_destination_url)
{
	this->collections_hero_destination_url = collections_hero_destination_url;
}

std::string
ProductGroupPromotion::getCollectionsHeroPinId()
{
	return collections_hero_pin_id;
}

void
ProductGroupPromotion::setCollectionsHeroPinId(std::string collections_hero_pin_id)
{
	this->collections_hero_pin_id = collections_hero_pin_id;
}

CreativeType
ProductGroupPromotion::getCreativeType()
{
	return creative_type;
}

void
ProductGroupPromotion::setCreativeType(CreativeType creative_type)
{
	this->creative_type = creative_type;
}

ProductGroupPromotionCustomizableCTAType
ProductGroupPromotion::getCustomizableCtaType()
{
	return customizable_cta_type;
}

void
ProductGroupPromotion::setCustomizableCtaType(ProductGroupPromotionCustomizableCTAType customizable_cta_type)
{
	this->customizable_cta_type = customizable_cta_type;
}

std::string
ProductGroupPromotion::getDefinition()
{
	return definition;
}

void
ProductGroupPromotion::setDefinition(std::string definition)
{
	this->definition = definition;
}

GridClickType
ProductGroupPromotion::getGridClickType()
{
	return grid_click_type;
}

void
ProductGroupPromotion::setGridClickType(GridClickType grid_click_type)
{
	this->grid_click_type = grid_click_type;
}

std::string
ProductGroupPromotion::getId()
{
	return id;
}

void
ProductGroupPromotion::setId(std::string id)
{
	this->id = id;
}

bool
ProductGroupPromotion::isIncluded()
{
	return included;
}

void
ProductGroupPromotion::setIncluded(bool included)
{
	this->included = included;
}

bool
ProductGroupPromotion::isIsGenerateBackground()
{
	return is_generate_background;
}

void
ProductGroupPromotion::setIsGenerateBackground(bool is_generate_background)
{
	this->is_generate_background = is_generate_background;
}

bool
ProductGroupPromotion::isIsImageAutoResizing()
{
	return is_image_auto_resizing;
}

void
ProductGroupPromotion::setIsImageAutoResizing(bool is_image_auto_resizing)
{
	this->is_image_auto_resizing = is_image_auto_resizing;
}

bool
ProductGroupPromotion::isIsMdl()
{
	return is_mdl;
}

void
ProductGroupPromotion::setIsMdl(bool is_mdl)
{
	this->is_mdl = is_mdl;
}

std::string
ProductGroupPromotion::getParentId()
{
	return parent_id;
}

void
ProductGroupPromotion::setParentId(std::string parent_id)
{
	this->parent_id = parent_id;
}

PreferredMediaType
ProductGroupPromotion::getPreferredMediaType()
{
	return preferred_media_type;
}

void
ProductGroupPromotion::setPreferredMediaType(PreferredMediaType preferred_media_type)
{
	this->preferred_media_type = preferred_media_type;
}

std::string
ProductGroupPromotion::getRelativeDefinition()
{
	return relative_definition;
}

void
ProductGroupPromotion::setRelativeDefinition(std::string relative_definition)
{
	this->relative_definition = relative_definition;
}

std::string
ProductGroupPromotion::getSelectedImageTag()
{
	return selected_image_tag;
}

void
ProductGroupPromotion::setSelectedImageTag(std::string selected_image_tag)
{
	this->selected_image_tag = selected_image_tag;
}

std::string
ProductGroupPromotion::getSelectedVideoTag()
{
	return selected_video_tag;
}

void
ProductGroupPromotion::setSelectedVideoTag(std::string selected_video_tag)
{
	this->selected_video_tag = selected_video_tag;
}

std::string
ProductGroupPromotion::getSlideshowCollectionsDescription()
{
	return slideshow_collections_description;
}

void
ProductGroupPromotion::setSlideshowCollectionsDescription(std::string slideshow_collections_description)
{
	this->slideshow_collections_description = slideshow_collections_description;
}

std::string
ProductGroupPromotion::getSlideshowCollectionsTitle()
{
	return slideshow_collections_title;
}

void
ProductGroupPromotion::setSlideshowCollectionsTitle(std::string slideshow_collections_title)
{
	this->slideshow_collections_title = slideshow_collections_title;
}

EntityStatus
ProductGroupPromotion::getStatus()
{
	return status;
}

void
ProductGroupPromotion::setStatus(EntityStatus status)
{
	this->status = status;
}

std::string
ProductGroupPromotion::getTrackingUrl()
{
	return tracking_url;
}

void
ProductGroupPromotion::setTrackingUrl(std::string tracking_url)
{
	this->tracking_url = tracking_url;
}



