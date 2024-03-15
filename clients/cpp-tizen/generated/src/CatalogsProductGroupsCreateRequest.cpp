#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Catalogs_product_groups_create_request.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Catalogs_product_groups_create_request::Catalogs_product_groups_create_request()
{
	//__init();
}

Catalogs_product_groups_create_request::~Catalogs_product_groups_create_request()
{
	//__cleanup();
}

void
Catalogs_product_groups_create_request::__init()
{
	//name = std::string();
	//description = std::string();
	//is_featured = bool(false);
	//filters = new CatalogsHotelProductGroupFilters();
	//feed_id = std::string();
	//catalog_type = std::string();
	//catalog_id = std::string();
}

void
Catalogs_product_groups_create_request::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(is_featured != NULL) {
	//
	//delete is_featured;
	//is_featured = NULL;
	//}
	//if(filters != NULL) {
	//
	//delete filters;
	//filters = NULL;
	//}
	//if(feed_id != NULL) {
	//
	//delete feed_id;
	//feed_id = NULL;
	//}
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//
}

void
Catalogs_product_groups_create_request::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_featuredKey = "is_featured";
	node = json_object_get_member(pJsonObject, is_featuredKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_featured, node, "bool", "");
		} else {
			
		}
	}
	const gchar *filtersKey = "filters";
	node = json_object_get_member(pJsonObject, filtersKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsHotelProductGroupFilters")) {
			jsonToValue(&filters, node, "CatalogsHotelProductGroupFilters", "CatalogsHotelProductGroupFilters");
		} else {
			
			CatalogsHotelProductGroupFilters* obj = static_cast<CatalogsHotelProductGroupFilters*> (&filters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *feed_idKey = "feed_id";
	node = json_object_get_member(pJsonObject, feed_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&feed_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *catalog_typeKey = "catalog_type";
	node = json_object_get_member(pJsonObject, catalog_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *catalog_idKey = "catalog_id";
	node = json_object_get_member(pJsonObject, catalog_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_id, node, "std::string", "");
		} else {
			
		}
	}
}

Catalogs_product_groups_create_request::Catalogs_product_groups_create_request(char* json)
{
	this->fromJson(json);
}

char*
Catalogs_product_groups_create_request::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsFeatured();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_featuredKey = "is_featured";
	json_object_set_member(pJsonObject, is_featuredKey, node);
	if (isprimitive("CatalogsHotelProductGroupFilters")) {
		CatalogsHotelProductGroupFilters obj = getFilters();
		node = converttoJson(&obj, "CatalogsHotelProductGroupFilters", "");
	}
	else {
		
		CatalogsHotelProductGroupFilters obj = static_cast<CatalogsHotelProductGroupFilters> (getFilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtersKey = "filters";
	json_object_set_member(pJsonObject, filtersKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFeedId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_idKey = "feed_id";
	json_object_set_member(pJsonObject, feed_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_typeKey = "catalog_type";
	json_object_set_member(pJsonObject, catalog_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_idKey = "catalog_id";
	json_object_set_member(pJsonObject, catalog_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Catalogs_product_groups_create_request::getName()
{
	return name;
}

void
Catalogs_product_groups_create_request::setName(std::string  name)
{
	this->name = name;
}

std::string
Catalogs_product_groups_create_request::getDescription()
{
	return description;
}

void
Catalogs_product_groups_create_request::setDescription(std::string  description)
{
	this->description = description;
}

bool
Catalogs_product_groups_create_request::getIsFeatured()
{
	return is_featured;
}

void
Catalogs_product_groups_create_request::setIsFeatured(bool  is_featured)
{
	this->is_featured = is_featured;
}

CatalogsHotelProductGroupFilters
Catalogs_product_groups_create_request::getFilters()
{
	return filters;
}

void
Catalogs_product_groups_create_request::setFilters(CatalogsHotelProductGroupFilters  filters)
{
	this->filters = filters;
}

std::string
Catalogs_product_groups_create_request::getFeedId()
{
	return feed_id;
}

void
Catalogs_product_groups_create_request::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

std::string
Catalogs_product_groups_create_request::getCatalogType()
{
	return catalog_type;
}

void
Catalogs_product_groups_create_request::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
Catalogs_product_groups_create_request::getCatalogId()
{
	return catalog_id;
}

void
Catalogs_product_groups_create_request::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}


