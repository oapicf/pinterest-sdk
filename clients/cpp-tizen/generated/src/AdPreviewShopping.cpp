#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdPreviewShopping.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdPreviewShopping::AdPreviewShopping()
{
	//__init();
}

AdPreviewShopping::~AdPreviewShopping()
{
	//__cleanup();
}

void
AdPreviewShopping::__init()
{
	//catalog_product_group_id = std::string();
	//creative_type = null;
	//customizable_cta_type = null;
	//hero_image_title = std::string();
	//hero_image_url = std::string();
	//hero_pin_id = std::string();
	//image_tag = std::string();
	//item_id = std::string();
	//preferred_media_type = null;
	//show_promotion = bool(false);
	//video_tag = std::string();
}

void
AdPreviewShopping::__cleanup()
{
	//if(catalog_product_group_id != NULL) {
	//
	//delete catalog_product_group_id;
	//catalog_product_group_id = NULL;
	//}
	//if(creative_type != NULL) {
	//
	//delete creative_type;
	//creative_type = NULL;
	//}
	//if(customizable_cta_type != NULL) {
	//
	//delete customizable_cta_type;
	//customizable_cta_type = NULL;
	//}
	//if(hero_image_title != NULL) {
	//
	//delete hero_image_title;
	//hero_image_title = NULL;
	//}
	//if(hero_image_url != NULL) {
	//
	//delete hero_image_url;
	//hero_image_url = NULL;
	//}
	//if(hero_pin_id != NULL) {
	//
	//delete hero_pin_id;
	//hero_pin_id = NULL;
	//}
	//if(image_tag != NULL) {
	//
	//delete image_tag;
	//image_tag = NULL;
	//}
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//if(preferred_media_type != NULL) {
	//
	//delete preferred_media_type;
	//preferred_media_type = NULL;
	//}
	//if(show_promotion != NULL) {
	//
	//delete show_promotion;
	//show_promotion = NULL;
	//}
	//if(video_tag != NULL) {
	//
	//delete video_tag;
	//video_tag = NULL;
	//}
	//
}

void
AdPreviewShopping::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *catalog_product_group_idKey = "catalog_product_group_id";
	node = json_object_get_member(pJsonObject, catalog_product_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_product_group_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *creative_typeKey = "creative_type";
	node = json_object_get_member(pJsonObject, creative_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AdShoppingPreviewCreativeType")) {
			jsonToValue(&creative_type, node, "AdShoppingPreviewCreativeType", "AdShoppingPreviewCreativeType");
		} else {
			
			AdShoppingPreviewCreativeType* obj = static_cast<AdShoppingPreviewCreativeType*> (&creative_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *customizable_cta_typeKey = "customizable_cta_type";
	node = json_object_get_member(pJsonObject, customizable_cta_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CustomizableCTAType")) {
			jsonToValue(&customizable_cta_type, node, "CustomizableCTAType", "CustomizableCTAType");
		} else {
			
			CustomizableCTAType* obj = static_cast<CustomizableCTAType*> (&customizable_cta_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hero_image_titleKey = "hero_image_title";
	node = json_object_get_member(pJsonObject, hero_image_titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hero_image_title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *hero_image_urlKey = "hero_image_url";
	node = json_object_get_member(pJsonObject, hero_image_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hero_image_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *hero_pin_idKey = "hero_pin_id";
	node = json_object_get_member(pJsonObject, hero_pin_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hero_pin_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *image_tagKey = "image_tag";
	node = json_object_get_member(pJsonObject, image_tagKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&image_tag, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *item_idKey = "item_id";
	node = json_object_get_member(pJsonObject, item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *preferred_media_typeKey = "preferred_media_type";
	node = json_object_get_member(pJsonObject, preferred_media_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("BasePreferredMediaType")) {
			jsonToValue(&preferred_media_type, node, "BasePreferredMediaType", "BasePreferredMediaType");
		} else {
			
			BasePreferredMediaType* obj = static_cast<BasePreferredMediaType*> (&preferred_media_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *show_promotionKey = "show_promotion";
	node = json_object_get_member(pJsonObject, show_promotionKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&show_promotion, node, "bool", "");
		} else {
			
		}
	}
	const gchar *video_tagKey = "video_tag";
	node = json_object_get_member(pJsonObject, video_tagKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&video_tag, node, "std::string", "");
		} else {
			
		}
	}
}

AdPreviewShopping::AdPreviewShopping(char* json)
{
	this->fromJson(json);
}

char*
AdPreviewShopping::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCatalogProductGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_product_group_idKey = "catalog_product_group_id";
	json_object_set_member(pJsonObject, catalog_product_group_idKey, node);
	if (isprimitive("AdShoppingPreviewCreativeType")) {
		AdShoppingPreviewCreativeType obj = getCreativeType();
		node = converttoJson(&obj, "AdShoppingPreviewCreativeType", "");
	}
	else {
		
		AdShoppingPreviewCreativeType obj = static_cast<AdShoppingPreviewCreativeType> (getCreativeType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *creative_typeKey = "creative_type";
	json_object_set_member(pJsonObject, creative_typeKey, node);
	if (isprimitive("CustomizableCTAType")) {
		CustomizableCTAType obj = getCustomizableCtaType();
		node = converttoJson(&obj, "CustomizableCTAType", "");
	}
	else {
		
		CustomizableCTAType obj = static_cast<CustomizableCTAType> (getCustomizableCtaType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *customizable_cta_typeKey = "customizable_cta_type";
	json_object_set_member(pJsonObject, customizable_cta_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHeroImageTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hero_image_titleKey = "hero_image_title";
	json_object_set_member(pJsonObject, hero_image_titleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHeroImageUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hero_image_urlKey = "hero_image_url";
	json_object_set_member(pJsonObject, hero_image_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHeroPinId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hero_pin_idKey = "hero_pin_id";
	json_object_set_member(pJsonObject, hero_pin_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getImageTag();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *image_tagKey = "image_tag";
	json_object_set_member(pJsonObject, image_tagKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
	if (isprimitive("BasePreferredMediaType")) {
		BasePreferredMediaType obj = getPreferredMediaType();
		node = converttoJson(&obj, "BasePreferredMediaType", "");
	}
	else {
		
		BasePreferredMediaType obj = static_cast<BasePreferredMediaType> (getPreferredMediaType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *preferred_media_typeKey = "preferred_media_type";
	json_object_set_member(pJsonObject, preferred_media_typeKey, node);
	if (isprimitive("bool")) {
		bool obj = getShowPromotion();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *show_promotionKey = "show_promotion";
	json_object_set_member(pJsonObject, show_promotionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVideoTag();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *video_tagKey = "video_tag";
	json_object_set_member(pJsonObject, video_tagKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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

AdShoppingPreviewCreativeType
AdPreviewShopping::getCreativeType()
{
	return creative_type;
}

void
AdPreviewShopping::setCreativeType(AdShoppingPreviewCreativeType  creative_type)
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

BasePreferredMediaType
AdPreviewShopping::getPreferredMediaType()
{
	return preferred_media_type;
}

void
AdPreviewShopping::setPreferredMediaType(BasePreferredMediaType  preferred_media_type)
{
	this->preferred_media_type = preferred_media_type;
}

bool
AdPreviewShopping::getShowPromotion()
{
	return show_promotion;
}

void
AdPreviewShopping::setShowPromotion(bool  show_promotion)
{
	this->show_promotion = show_promotion;
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


