#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BulkUpsertRequestCreateCatalogProductGroupsItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BulkUpsertRequestCreateCatalogProductGroupsItems::BulkUpsertRequestCreateCatalogProductGroupsItems()
{
	//__init();
}

BulkUpsertRequestCreateCatalogProductGroupsItems::~BulkUpsertRequestCreateCatalogProductGroupsItems()
{
	//__cleanup();
}

void
BulkUpsertRequestCreateCatalogProductGroupsItems::__init()
{
	//description = std::string();
	//feed_id = std::string();
	//filters = new CatalogsCreativeAssetsProductGroupFilters();
	//is_featured = bool(false);
	//name = std::string();
	//catalog_id = null;
	//catalog_type = std::string();
	//country = new Country();
	//locale = new CatalogsLocale();
}

void
BulkUpsertRequestCreateCatalogProductGroupsItems::__cleanup()
{
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(feed_id != NULL) {
	//
	//delete feed_id;
	//feed_id = NULL;
	//}
	//if(filters != NULL) {
	//
	//delete filters;
	//filters = NULL;
	//}
	//if(is_featured != NULL) {
	//
	//delete is_featured;
	//is_featured = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(locale != NULL) {
	//
	//delete locale;
	//locale = NULL;
	//}
	//
}

void
BulkUpsertRequestCreateCatalogProductGroupsItems::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
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
	const gchar *filtersKey = "filters";
	node = json_object_get_member(pJsonObject, filtersKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsCreativeAssetsProductGroupFilters")) {
			jsonToValue(&filters, node, "CatalogsCreativeAssetsProductGroupFilters", "CatalogsCreativeAssetsProductGroupFilters");
		} else {
			
			CatalogsCreativeAssetsProductGroupFilters* obj = static_cast<CatalogsCreativeAssetsProductGroupFilters*> (&filters);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
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
	const gchar *catalog_typeKey = "catalog_type";
	node = json_object_get_member(pJsonObject, catalog_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *countryKey = "country";
	node = json_object_get_member(pJsonObject, countryKey);
	if (node !=NULL) {
	

		if (isprimitive("Country")) {
			jsonToValue(&country, node, "Country", "Country");
		} else {
			
			Country* obj = static_cast<Country*> (&country);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *localeKey = "locale";
	node = json_object_get_member(pJsonObject, localeKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsLocale")) {
			jsonToValue(&locale, node, "CatalogsLocale", "CatalogsLocale");
		} else {
			
			CatalogsLocale* obj = static_cast<CatalogsLocale*> (&locale);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BulkUpsertRequestCreateCatalogProductGroupsItems::BulkUpsertRequestCreateCatalogProductGroupsItems(char* json)
{
	this->fromJson(json);
}

char*
BulkUpsertRequestCreateCatalogProductGroupsItems::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFeedId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_idKey = "feed_id";
	json_object_set_member(pJsonObject, feed_idKey, node);
	if (isprimitive("CatalogsCreativeAssetsProductGroupFilters")) {
		CatalogsCreativeAssetsProductGroupFilters obj = getFilters();
		node = converttoJson(&obj, "CatalogsCreativeAssetsProductGroupFilters", "");
	}
	else {
		
		CatalogsCreativeAssetsProductGroupFilters obj = static_cast<CatalogsCreativeAssetsProductGroupFilters> (getFilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtersKey = "filters";
	json_object_set_member(pJsonObject, filtersKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsFeatured();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_featuredKey = "is_featured";
	json_object_set_member(pJsonObject, is_featuredKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_idKey = "catalog_id";
	json_object_set_member(pJsonObject, catalog_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_typeKey = "catalog_type";
	json_object_set_member(pJsonObject, catalog_typeKey, node);
	if (isprimitive("Country")) {
		Country obj = getCountry();
		node = converttoJson(&obj, "Country", "");
	}
	else {
		
		Country obj = static_cast<Country> (getCountry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *countryKey = "country";
	json_object_set_member(pJsonObject, countryKey, node);
	if (isprimitive("CatalogsLocale")) {
		CatalogsLocale obj = getLocale();
		node = converttoJson(&obj, "CatalogsLocale", "");
	}
	else {
		
		CatalogsLocale obj = static_cast<CatalogsLocale> (getLocale());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *localeKey = "locale";
	json_object_set_member(pJsonObject, localeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BulkUpsertRequestCreateCatalogProductGroupsItems::getDescription()
{
	return description;
}

void
BulkUpsertRequestCreateCatalogProductGroupsItems::setDescription(std::string  description)
{
	this->description = description;
}

std::string
BulkUpsertRequestCreateCatalogProductGroupsItems::getFeedId()
{
	return feed_id;
}

void
BulkUpsertRequestCreateCatalogProductGroupsItems::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

CatalogsCreativeAssetsProductGroupFilters
BulkUpsertRequestCreateCatalogProductGroupsItems::getFilters()
{
	return filters;
}

void
BulkUpsertRequestCreateCatalogProductGroupsItems::setFilters(CatalogsCreativeAssetsProductGroupFilters  filters)
{
	this->filters = filters;
}

bool
BulkUpsertRequestCreateCatalogProductGroupsItems::getIsFeatured()
{
	return is_featured;
}

void
BulkUpsertRequestCreateCatalogProductGroupsItems::setIsFeatured(bool  is_featured)
{
	this->is_featured = is_featured;
}

std::string
BulkUpsertRequestCreateCatalogProductGroupsItems::getName()
{
	return name;
}

void
BulkUpsertRequestCreateCatalogProductGroupsItems::setName(std::string  name)
{
	this->name = name;
}

std::string
BulkUpsertRequestCreateCatalogProductGroupsItems::getCatalogId()
{
	return catalog_id;
}

void
BulkUpsertRequestCreateCatalogProductGroupsItems::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
BulkUpsertRequestCreateCatalogProductGroupsItems::getCatalogType()
{
	return catalog_type;
}

void
BulkUpsertRequestCreateCatalogProductGroupsItems::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
BulkUpsertRequestCreateCatalogProductGroupsItems::getCountry()
{
	return country;
}

void
BulkUpsertRequestCreateCatalogProductGroupsItems::setCountry(Country  country)
{
	this->country = country;
}

CatalogsLocale
BulkUpsertRequestCreateCatalogProductGroupsItems::getLocale()
{
	return locale;
}

void
BulkUpsertRequestCreateCatalogProductGroupsItems::setLocale(CatalogsLocale  locale)
{
	this->locale = locale;
}


