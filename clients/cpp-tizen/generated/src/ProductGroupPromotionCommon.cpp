#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductGroupPromotionCommon.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductGroupPromotionCommon::ProductGroupPromotionCommon()
{
	//__init();
}

ProductGroupPromotionCommon::~ProductGroupPromotionCommon()
{
	//__cleanup();
}

void
ProductGroupPromotionCommon::__init()
{
	//status = new EntityStatus();
	//tracking_url = std::string();
	//catalogs_product_group_id = std::string();
	//catalogs_product_group_name = std::string();
	//creative_type = new CreativeType();
	//collections_hero_pin_id = std::string();
	//collections_hero_destination_url = std::string();
	//slideshow_collections_title = std::string();
	//slideshow_collections_description = std::string();
	//is_mdl = bool(false);
}

void
ProductGroupPromotionCommon::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(tracking_url != NULL) {
	//
	//delete tracking_url;
	//tracking_url = NULL;
	//}
	//if(catalogs_product_group_id != NULL) {
	//
	//delete catalogs_product_group_id;
	//catalogs_product_group_id = NULL;
	//}
	//if(catalogs_product_group_name != NULL) {
	//
	//delete catalogs_product_group_name;
	//catalogs_product_group_name = NULL;
	//}
	//if(creative_type != NULL) {
	//
	//delete creative_type;
	//creative_type = NULL;
	//}
	//if(collections_hero_pin_id != NULL) {
	//
	//delete collections_hero_pin_id;
	//collections_hero_pin_id = NULL;
	//}
	//if(collections_hero_destination_url != NULL) {
	//
	//delete collections_hero_destination_url;
	//collections_hero_destination_url = NULL;
	//}
	//if(slideshow_collections_title != NULL) {
	//
	//delete slideshow_collections_title;
	//slideshow_collections_title = NULL;
	//}
	//if(slideshow_collections_description != NULL) {
	//
	//delete slideshow_collections_description;
	//slideshow_collections_description = NULL;
	//}
	//if(is_mdl != NULL) {
	//
	//delete is_mdl;
	//is_mdl = NULL;
	//}
	//
}

void
ProductGroupPromotionCommon::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("EntityStatus")) {
			jsonToValue(&status, node, "EntityStatus", "EntityStatus");
		} else {
			
			EntityStatus* obj = static_cast<EntityStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tracking_urlKey = "tracking_url";
	node = json_object_get_member(pJsonObject, tracking_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&tracking_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *catalogs_product_group_idKey = "catalogs_product_group_id";
	node = json_object_get_member(pJsonObject, catalogs_product_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalogs_product_group_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *catalogs_product_group_nameKey = "catalogs_product_group_name";
	node = json_object_get_member(pJsonObject, catalogs_product_group_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalogs_product_group_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *creative_typeKey = "creative_type";
	node = json_object_get_member(pJsonObject, creative_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CreativeType")) {
			jsonToValue(&creative_type, node, "CreativeType", "CreativeType");
		} else {
			
			CreativeType* obj = static_cast<CreativeType*> (&creative_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *collections_hero_pin_idKey = "collections_hero_pin_id";
	node = json_object_get_member(pJsonObject, collections_hero_pin_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&collections_hero_pin_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *collections_hero_destination_urlKey = "collections_hero_destination_url";
	node = json_object_get_member(pJsonObject, collections_hero_destination_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&collections_hero_destination_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *slideshow_collections_titleKey = "slideshow_collections_title";
	node = json_object_get_member(pJsonObject, slideshow_collections_titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&slideshow_collections_title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *slideshow_collections_descriptionKey = "slideshow_collections_description";
	node = json_object_get_member(pJsonObject, slideshow_collections_descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&slideshow_collections_description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_mdlKey = "is_mdl";
	node = json_object_get_member(pJsonObject, is_mdlKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_mdl, node, "bool", "");
		} else {
			
		}
	}
}

ProductGroupPromotionCommon::ProductGroupPromotionCommon(char* json)
{
	this->fromJson(json);
}

char*
ProductGroupPromotionCommon::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EntityStatus")) {
		EntityStatus obj = getStatus();
		node = converttoJson(&obj, "EntityStatus", "");
	}
	else {
		
		EntityStatus obj = static_cast<EntityStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTrackingUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tracking_urlKey = "tracking_url";
	json_object_set_member(pJsonObject, tracking_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogsProductGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalogs_product_group_idKey = "catalogs_product_group_id";
	json_object_set_member(pJsonObject, catalogs_product_group_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogsProductGroupName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalogs_product_group_nameKey = "catalogs_product_group_name";
	json_object_set_member(pJsonObject, catalogs_product_group_nameKey, node);
	if (isprimitive("CreativeType")) {
		CreativeType obj = getCreativeType();
		node = converttoJson(&obj, "CreativeType", "");
	}
	else {
		
		CreativeType obj = static_cast<CreativeType> (getCreativeType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *creative_typeKey = "creative_type";
	json_object_set_member(pJsonObject, creative_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCollectionsHeroPinId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *collections_hero_pin_idKey = "collections_hero_pin_id";
	json_object_set_member(pJsonObject, collections_hero_pin_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCollectionsHeroDestinationUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *collections_hero_destination_urlKey = "collections_hero_destination_url";
	json_object_set_member(pJsonObject, collections_hero_destination_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSlideshowCollectionsTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *slideshow_collections_titleKey = "slideshow_collections_title";
	json_object_set_member(pJsonObject, slideshow_collections_titleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSlideshowCollectionsDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *slideshow_collections_descriptionKey = "slideshow_collections_description";
	json_object_set_member(pJsonObject, slideshow_collections_descriptionKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsMdl();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_mdlKey = "is_mdl";
	json_object_set_member(pJsonObject, is_mdlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

EntityStatus
ProductGroupPromotionCommon::getStatus()
{
	return status;
}

void
ProductGroupPromotionCommon::setStatus(EntityStatus  status)
{
	this->status = status;
}

std::string
ProductGroupPromotionCommon::getTrackingUrl()
{
	return tracking_url;
}

void
ProductGroupPromotionCommon::setTrackingUrl(std::string  tracking_url)
{
	this->tracking_url = tracking_url;
}

std::string
ProductGroupPromotionCommon::getCatalogsProductGroupId()
{
	return catalogs_product_group_id;
}

void
ProductGroupPromotionCommon::setCatalogsProductGroupId(std::string  catalogs_product_group_id)
{
	this->catalogs_product_group_id = catalogs_product_group_id;
}

std::string
ProductGroupPromotionCommon::getCatalogsProductGroupName()
{
	return catalogs_product_group_name;
}

void
ProductGroupPromotionCommon::setCatalogsProductGroupName(std::string  catalogs_product_group_name)
{
	this->catalogs_product_group_name = catalogs_product_group_name;
}

CreativeType
ProductGroupPromotionCommon::getCreativeType()
{
	return creative_type;
}

void
ProductGroupPromotionCommon::setCreativeType(CreativeType  creative_type)
{
	this->creative_type = creative_type;
}

std::string
ProductGroupPromotionCommon::getCollectionsHeroPinId()
{
	return collections_hero_pin_id;
}

void
ProductGroupPromotionCommon::setCollectionsHeroPinId(std::string  collections_hero_pin_id)
{
	this->collections_hero_pin_id = collections_hero_pin_id;
}

std::string
ProductGroupPromotionCommon::getCollectionsHeroDestinationUrl()
{
	return collections_hero_destination_url;
}

void
ProductGroupPromotionCommon::setCollectionsHeroDestinationUrl(std::string  collections_hero_destination_url)
{
	this->collections_hero_destination_url = collections_hero_destination_url;
}

std::string
ProductGroupPromotionCommon::getSlideshowCollectionsTitle()
{
	return slideshow_collections_title;
}

void
ProductGroupPromotionCommon::setSlideshowCollectionsTitle(std::string  slideshow_collections_title)
{
	this->slideshow_collections_title = slideshow_collections_title;
}

std::string
ProductGroupPromotionCommon::getSlideshowCollectionsDescription()
{
	return slideshow_collections_description;
}

void
ProductGroupPromotionCommon::setSlideshowCollectionsDescription(std::string  slideshow_collections_description)
{
	this->slideshow_collections_description = slideshow_collections_description;
}

bool
ProductGroupPromotionCommon::getIsMdl()
{
	return is_mdl;
}

void
ProductGroupPromotionCommon::setIsMdl(bool  is_mdl)
{
	this->is_mdl = is_mdl;
}


