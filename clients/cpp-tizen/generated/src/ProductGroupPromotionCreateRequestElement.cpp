#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductGroupPromotionCreateRequestElement.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductGroupPromotionCreateRequestElement::ProductGroupPromotionCreateRequestElement()
{
	//__init();
}

ProductGroupPromotionCreateRequestElement::~ProductGroupPromotionCreateRequestElement()
{
	//__cleanup();
}

void
ProductGroupPromotionCreateRequestElement::__init()
{
	//id = std::string();
	//ad_group_id = std::string();
	//bid_in_micro_currency = int(0);
	//included = bool(false);
	//definition = std::string();
	//relative_definition = std::string();
	//parent_id = std::string();
	//slideshow_collections_title = std::string();
	//slideshow_collections_description = std::string();
	//is_mdl = bool(false);
	//status = new EntityStatus();
	//tracking_url = std::string();
	//catalog_product_group_id = std::string();
	//catalog_product_group_name = std::string();
	//collections_hero_pin_id = std::string();
	//collections_hero_destination_url = std::string();
	//grid_click_type = new GridClickType();
	//creative_type = new CreativeType();
}

void
ProductGroupPromotionCreateRequestElement::__cleanup()
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
	//if(is_mdl != NULL) {
	//
	//delete is_mdl;
	//is_mdl = NULL;
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
	//if(catalog_product_group_id != NULL) {
	//
	//delete catalog_product_group_id;
	//catalog_product_group_id = NULL;
	//}
	//if(catalog_product_group_name != NULL) {
	//
	//delete catalog_product_group_name;
	//catalog_product_group_name = NULL;
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
	//if(grid_click_type != NULL) {
	//
	//delete grid_click_type;
	//grid_click_type = NULL;
	//}
	//if(creative_type != NULL) {
	//
	//delete creative_type;
	//creative_type = NULL;
	//}
	//
}

void
ProductGroupPromotionCreateRequestElement::fromJson(char* jsonStr)
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
	const gchar *is_mdlKey = "is_mdl";
	node = json_object_get_member(pJsonObject, is_mdlKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_mdl, node, "bool", "");
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
	const gchar *catalog_product_group_idKey = "catalog_product_group_id";
	node = json_object_get_member(pJsonObject, catalog_product_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_product_group_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *catalog_product_group_nameKey = "catalog_product_group_name";
	node = json_object_get_member(pJsonObject, catalog_product_group_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_product_group_name, node, "std::string", "");
		} else {
			
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
	const gchar *grid_click_typeKey = "grid_click_type";
	node = json_object_get_member(pJsonObject, grid_click_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("GridClickType")) {
			jsonToValue(&grid_click_type, node, "GridClickType", "GridClickType");
		} else {
			
			GridClickType* obj = static_cast<GridClickType*> (&grid_click_type);
			obj->fromJson(json_to_string(node, false));
			
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
}

ProductGroupPromotionCreateRequestElement::ProductGroupPromotionCreateRequestElement(char* json)
{
	this->fromJson(json);
}

char*
ProductGroupPromotionCreateRequestElement::toJson()
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
	if (isprimitive("bool")) {
		bool obj = getIsMdl();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_mdlKey = "is_mdl";
	json_object_set_member(pJsonObject, is_mdlKey, node);
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
		std::string obj = getCatalogProductGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_product_group_idKey = "catalog_product_group_id";
	json_object_set_member(pJsonObject, catalog_product_group_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogProductGroupName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_product_group_nameKey = "catalog_product_group_name";
	json_object_set_member(pJsonObject, catalog_product_group_nameKey, node);
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
	if (isprimitive("GridClickType")) {
		GridClickType obj = getGridClickType();
		node = converttoJson(&obj, "GridClickType", "");
	}
	else {
		
		GridClickType obj = static_cast<GridClickType> (getGridClickType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *grid_click_typeKey = "grid_click_type";
	json_object_set_member(pJsonObject, grid_click_typeKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ProductGroupPromotionCreateRequestElement::getId()
{
	return id;
}

void
ProductGroupPromotionCreateRequestElement::setId(std::string  id)
{
	this->id = id;
}

std::string
ProductGroupPromotionCreateRequestElement::getAdGroupId()
{
	return ad_group_id;
}

void
ProductGroupPromotionCreateRequestElement::setAdGroupId(std::string  ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

int
ProductGroupPromotionCreateRequestElement::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
ProductGroupPromotionCreateRequestElement::setBidInMicroCurrency(int  bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
}

bool
ProductGroupPromotionCreateRequestElement::getIncluded()
{
	return included;
}

void
ProductGroupPromotionCreateRequestElement::setIncluded(bool  included)
{
	this->included = included;
}

std::string
ProductGroupPromotionCreateRequestElement::getDefinition()
{
	return definition;
}

void
ProductGroupPromotionCreateRequestElement::setDefinition(std::string  definition)
{
	this->definition = definition;
}

std::string
ProductGroupPromotionCreateRequestElement::getRelativeDefinition()
{
	return relative_definition;
}

void
ProductGroupPromotionCreateRequestElement::setRelativeDefinition(std::string  relative_definition)
{
	this->relative_definition = relative_definition;
}

std::string
ProductGroupPromotionCreateRequestElement::getParentId()
{
	return parent_id;
}

void
ProductGroupPromotionCreateRequestElement::setParentId(std::string  parent_id)
{
	this->parent_id = parent_id;
}

std::string
ProductGroupPromotionCreateRequestElement::getSlideshowCollectionsTitle()
{
	return slideshow_collections_title;
}

void
ProductGroupPromotionCreateRequestElement::setSlideshowCollectionsTitle(std::string  slideshow_collections_title)
{
	this->slideshow_collections_title = slideshow_collections_title;
}

std::string
ProductGroupPromotionCreateRequestElement::getSlideshowCollectionsDescription()
{
	return slideshow_collections_description;
}

void
ProductGroupPromotionCreateRequestElement::setSlideshowCollectionsDescription(std::string  slideshow_collections_description)
{
	this->slideshow_collections_description = slideshow_collections_description;
}

bool
ProductGroupPromotionCreateRequestElement::getIsMdl()
{
	return is_mdl;
}

void
ProductGroupPromotionCreateRequestElement::setIsMdl(bool  is_mdl)
{
	this->is_mdl = is_mdl;
}

EntityStatus
ProductGroupPromotionCreateRequestElement::getStatus()
{
	return status;
}

void
ProductGroupPromotionCreateRequestElement::setStatus(EntityStatus  status)
{
	this->status = status;
}

std::string
ProductGroupPromotionCreateRequestElement::getTrackingUrl()
{
	return tracking_url;
}

void
ProductGroupPromotionCreateRequestElement::setTrackingUrl(std::string  tracking_url)
{
	this->tracking_url = tracking_url;
}

std::string
ProductGroupPromotionCreateRequestElement::getCatalogProductGroupId()
{
	return catalog_product_group_id;
}

void
ProductGroupPromotionCreateRequestElement::setCatalogProductGroupId(std::string  catalog_product_group_id)
{
	this->catalog_product_group_id = catalog_product_group_id;
}

std::string
ProductGroupPromotionCreateRequestElement::getCatalogProductGroupName()
{
	return catalog_product_group_name;
}

void
ProductGroupPromotionCreateRequestElement::setCatalogProductGroupName(std::string  catalog_product_group_name)
{
	this->catalog_product_group_name = catalog_product_group_name;
}

std::string
ProductGroupPromotionCreateRequestElement::getCollectionsHeroPinId()
{
	return collections_hero_pin_id;
}

void
ProductGroupPromotionCreateRequestElement::setCollectionsHeroPinId(std::string  collections_hero_pin_id)
{
	this->collections_hero_pin_id = collections_hero_pin_id;
}

std::string
ProductGroupPromotionCreateRequestElement::getCollectionsHeroDestinationUrl()
{
	return collections_hero_destination_url;
}

void
ProductGroupPromotionCreateRequestElement::setCollectionsHeroDestinationUrl(std::string  collections_hero_destination_url)
{
	this->collections_hero_destination_url = collections_hero_destination_url;
}

GridClickType
ProductGroupPromotionCreateRequestElement::getGridClickType()
{
	return grid_click_type;
}

void
ProductGroupPromotionCreateRequestElement::setGridClickType(GridClickType  grid_click_type)
{
	this->grid_click_type = grid_click_type;
}

CreativeType
ProductGroupPromotionCreateRequestElement::getCreativeType()
{
	return creative_type;
}

void
ProductGroupPromotionCreateRequestElement::setCreativeType(CreativeType  creative_type)
{
	this->creative_type = creative_type;
}


