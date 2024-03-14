#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductGroupPromotion.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductGroupPromotion::ProductGroupPromotion()
{
	//__init();
}

ProductGroupPromotion::~ProductGroupPromotion()
{
	//__cleanup();
}

void
ProductGroupPromotion::__init()
{
	//id = std::string();
	//ad_group_id = std::string();
	//type = std::string();
	//bid_in_micro_currency = int(0);
	//included = bool(false);
	//definition = std::string();
	//relative_definition = std::string();
	//parent_id = std::string();
	//slideshow_collections_title = std::string();
	//slideshow_collections_description = std::string();
	//status = new EntityStatus();
	//tracking_url = std::string();
	//catalogs_product_group_id = std::string();
	//catalogs_product_group_name = std::string();
	//creative_type = new CreativeType();
	//collections_hero_pin_id = std::string();
	//collections_hero_destination_url = std::string();
	//is_mdl = bool(false);
}

void
ProductGroupPromotion::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(ad_group_id != NULL) {
	//
	//delete ad_group_id;
	//ad_group_id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(bid_in_micro_currency != NULL) {
	//
	//delete bid_in_micro_currency;
	//bid_in_micro_currency = NULL;
	//}
	//if(included != NULL) {
	//
	//delete included;
	//included = NULL;
	//}
	//if(definition != NULL) {
	//
	//delete definition;
	//definition = NULL;
	//}
	//if(relative_definition != NULL) {
	//
	//delete relative_definition;
	//relative_definition = NULL;
	//}
	//if(parent_id != NULL) {
	//
	//delete parent_id;
	//parent_id = NULL;
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
	//if(is_mdl != NULL) {
	//
	//delete is_mdl;
	//is_mdl = NULL;
	//}
	//
}

void
ProductGroupPromotion::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ad_group_idKey = "ad_group_id";
	node = json_object_get_member(pJsonObject, ad_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_group_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *bid_in_micro_currencyKey = "bid_in_micro_currency";
	node = json_object_get_member(pJsonObject, bid_in_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bid_in_micro_currency, node, "int", "");
		} else {
			
		}
	}
	const gchar *includedKey = "included";
	node = json_object_get_member(pJsonObject, includedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&included, node, "bool", "");
		} else {
			
		}
	}
	const gchar *definitionKey = "definition";
	node = json_object_get_member(pJsonObject, definitionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&definition, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *relative_definitionKey = "relative_definition";
	node = json_object_get_member(pJsonObject, relative_definitionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&relative_definition, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *parent_idKey = "parent_id";
	node = json_object_get_member(pJsonObject, parent_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&parent_id, node, "std::string", "");
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
	const gchar *is_mdlKey = "is_mdl";
	node = json_object_get_member(pJsonObject, is_mdlKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_mdl, node, "bool", "");
		} else {
			
		}
	}
}

ProductGroupPromotion::ProductGroupPromotion(char* json)
{
	this->fromJson(json);
}

char*
ProductGroupPromotion::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_group_idKey = "ad_group_id";
	json_object_set_member(pJsonObject, ad_group_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("int")) {
		int obj = getBidInMicroCurrency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bid_in_micro_currencyKey = "bid_in_micro_currency";
	json_object_set_member(pJsonObject, bid_in_micro_currencyKey, node);
	if (isprimitive("bool")) {
		bool obj = getIncluded();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *includedKey = "included";
	json_object_set_member(pJsonObject, includedKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDefinition();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *definitionKey = "definition";
	json_object_set_member(pJsonObject, definitionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRelativeDefinition();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *relative_definitionKey = "relative_definition";
	json_object_set_member(pJsonObject, relative_definitionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getParentId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *parent_idKey = "parent_id";
	json_object_set_member(pJsonObject, parent_idKey, node);
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

std::string
ProductGroupPromotion::getId()
{
	return id;
}

void
ProductGroupPromotion::setId(std::string  id)
{
	this->id = id;
}

std::string
ProductGroupPromotion::getAdGroupId()
{
	return ad_group_id;
}

void
ProductGroupPromotion::setAdGroupId(std::string  ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

std::string
ProductGroupPromotion::getType()
{
	return type;
}

void
ProductGroupPromotion::setType(std::string  type)
{
	this->type = type;
}

int
ProductGroupPromotion::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
ProductGroupPromotion::setBidInMicroCurrency(int  bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
}

bool
ProductGroupPromotion::getIncluded()
{
	return included;
}

void
ProductGroupPromotion::setIncluded(bool  included)
{
	this->included = included;
}

std::string
ProductGroupPromotion::getDefinition()
{
	return definition;
}

void
ProductGroupPromotion::setDefinition(std::string  definition)
{
	this->definition = definition;
}

std::string
ProductGroupPromotion::getRelativeDefinition()
{
	return relative_definition;
}

void
ProductGroupPromotion::setRelativeDefinition(std::string  relative_definition)
{
	this->relative_definition = relative_definition;
}

std::string
ProductGroupPromotion::getParentId()
{
	return parent_id;
}

void
ProductGroupPromotion::setParentId(std::string  parent_id)
{
	this->parent_id = parent_id;
}

std::string
ProductGroupPromotion::getSlideshowCollectionsTitle()
{
	return slideshow_collections_title;
}

void
ProductGroupPromotion::setSlideshowCollectionsTitle(std::string  slideshow_collections_title)
{
	this->slideshow_collections_title = slideshow_collections_title;
}

std::string
ProductGroupPromotion::getSlideshowCollectionsDescription()
{
	return slideshow_collections_description;
}

void
ProductGroupPromotion::setSlideshowCollectionsDescription(std::string  slideshow_collections_description)
{
	this->slideshow_collections_description = slideshow_collections_description;
}

EntityStatus
ProductGroupPromotion::getStatus()
{
	return status;
}

void
ProductGroupPromotion::setStatus(EntityStatus  status)
{
	this->status = status;
}

std::string
ProductGroupPromotion::getTrackingUrl()
{
	return tracking_url;
}

void
ProductGroupPromotion::setTrackingUrl(std::string  tracking_url)
{
	this->tracking_url = tracking_url;
}

std::string
ProductGroupPromotion::getCatalogsProductGroupId()
{
	return catalogs_product_group_id;
}

void
ProductGroupPromotion::setCatalogsProductGroupId(std::string  catalogs_product_group_id)
{
	this->catalogs_product_group_id = catalogs_product_group_id;
}

std::string
ProductGroupPromotion::getCatalogsProductGroupName()
{
	return catalogs_product_group_name;
}

void
ProductGroupPromotion::setCatalogsProductGroupName(std::string  catalogs_product_group_name)
{
	this->catalogs_product_group_name = catalogs_product_group_name;
}

CreativeType
ProductGroupPromotion::getCreativeType()
{
	return creative_type;
}

void
ProductGroupPromotion::setCreativeType(CreativeType  creative_type)
{
	this->creative_type = creative_type;
}

std::string
ProductGroupPromotion::getCollectionsHeroPinId()
{
	return collections_hero_pin_id;
}

void
ProductGroupPromotion::setCollectionsHeroPinId(std::string  collections_hero_pin_id)
{
	this->collections_hero_pin_id = collections_hero_pin_id;
}

std::string
ProductGroupPromotion::getCollectionsHeroDestinationUrl()
{
	return collections_hero_destination_url;
}

void
ProductGroupPromotion::setCollectionsHeroDestinationUrl(std::string  collections_hero_destination_url)
{
	this->collections_hero_destination_url = collections_hero_destination_url;
}

bool
ProductGroupPromotion::getIsMdl()
{
	return is_mdl;
}

void
ProductGroupPromotion::setIsMdl(bool  is_mdl)
{
	this->is_mdl = is_mdl;
}


