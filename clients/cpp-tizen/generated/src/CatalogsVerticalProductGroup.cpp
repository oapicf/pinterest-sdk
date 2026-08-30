#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsVerticalProductGroup.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsVerticalProductGroup::CatalogsVerticalProductGroup()
{
	//__init();
}

CatalogsVerticalProductGroup::~CatalogsVerticalProductGroup()
{
	//__cleanup();
}

void
CatalogsVerticalProductGroup::__init()
{
	//catalog_id = null;
	//catalog_type = std::string();
	//country = std::string();
	//created_at = int(0);
	//description = std::string();
	//feed_id = std::string();
	//filters = new CatalogsCreativeAssetsProductGroupFilters();
	//id = null;
	//is_featured = bool(false);
	//locale = std::string();
	//name = std::string();
	//status = new CatalogsProductGroupStatus();
	//type = new CatalogsHotelProductGroupType();
	//updated_at = int(0);
}

void
CatalogsVerticalProductGroup::__cleanup()
{
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
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
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
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(is_featured != NULL) {
	//
	//delete is_featured;
	//is_featured = NULL;
	//}
	//if(locale != NULL) {
	//
	//delete locale;
	//locale = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(updated_at != NULL) {
	//
	//delete updated_at;
	//updated_at = NULL;
	//}
	//
}

void
CatalogsVerticalProductGroup::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	

		if (isprimitive("std::string")) {
			jsonToValue(&country, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
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
	const gchar *localeKey = "locale";
	node = json_object_get_member(pJsonObject, localeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&locale, node, "std::string", "");
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
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupStatus")) {
			jsonToValue(&status, node, "CatalogsProductGroupStatus", "CatalogsProductGroupStatus");
		} else {
			
			CatalogsProductGroupStatus* obj = static_cast<CatalogsProductGroupStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsHotelProductGroupType")) {
			jsonToValue(&type, node, "CatalogsHotelProductGroupType", "CatalogsHotelProductGroupType");
		} else {
			
			CatalogsHotelProductGroupType* obj = static_cast<CatalogsHotelProductGroupType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *updated_atKey = "updated_at";
	node = json_object_get_member(pJsonObject, updated_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_at, node, "int", "");
		} else {
			
		}
	}
}

CatalogsVerticalProductGroup::CatalogsVerticalProductGroup(char* json)
{
	this->fromJson(json);
}

char*
CatalogsVerticalProductGroup::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("std::string")) {
		std::string obj = getCountry();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *countryKey = "country";
	json_object_set_member(pJsonObject, countryKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsFeatured();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_featuredKey = "is_featured";
	json_object_set_member(pJsonObject, is_featuredKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLocale();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *localeKey = "locale";
	json_object_set_member(pJsonObject, localeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("CatalogsProductGroupStatus")) {
		CatalogsProductGroupStatus obj = getStatus();
		node = converttoJson(&obj, "CatalogsProductGroupStatus", "");
	}
	else {
		
		CatalogsProductGroupStatus obj = static_cast<CatalogsProductGroupStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("CatalogsHotelProductGroupType")) {
		CatalogsHotelProductGroupType obj = getType();
		node = converttoJson(&obj, "CatalogsHotelProductGroupType", "");
	}
	else {
		
		CatalogsHotelProductGroupType obj = static_cast<CatalogsHotelProductGroupType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_atKey = "updated_at";
	json_object_set_member(pJsonObject, updated_atKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsVerticalProductGroup::getCatalogId()
{
	return catalog_id;
}

void
CatalogsVerticalProductGroup::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsVerticalProductGroup::getCatalogType()
{
	return catalog_type;
}

void
CatalogsVerticalProductGroup::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsVerticalProductGroup::getCountry()
{
	return country;
}

void
CatalogsVerticalProductGroup::setCountry(std::string  country)
{
	this->country = country;
}

int
CatalogsVerticalProductGroup::getCreatedAt()
{
	return created_at;
}

void
CatalogsVerticalProductGroup::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
CatalogsVerticalProductGroup::getDescription()
{
	return description;
}

void
CatalogsVerticalProductGroup::setDescription(std::string  description)
{
	this->description = description;
}

std::string
CatalogsVerticalProductGroup::getFeedId()
{
	return feed_id;
}

void
CatalogsVerticalProductGroup::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsVerticalProductGroup::getFilters()
{
	return filters;
}

void
CatalogsVerticalProductGroup::setFilters(CatalogsCreativeAssetsProductGroupFilters  filters)
{
	this->filters = filters;
}

std::string
CatalogsVerticalProductGroup::getId()
{
	return id;
}

void
CatalogsVerticalProductGroup::setId(std::string  id)
{
	this->id = id;
}

bool
CatalogsVerticalProductGroup::getIsFeatured()
{
	return is_featured;
}

void
CatalogsVerticalProductGroup::setIsFeatured(bool  is_featured)
{
	this->is_featured = is_featured;
}

std::string
CatalogsVerticalProductGroup::getLocale()
{
	return locale;
}

void
CatalogsVerticalProductGroup::setLocale(std::string  locale)
{
	this->locale = locale;
}

std::string
CatalogsVerticalProductGroup::getName()
{
	return name;
}

void
CatalogsVerticalProductGroup::setName(std::string  name)
{
	this->name = name;
}

CatalogsProductGroupStatus
CatalogsVerticalProductGroup::getStatus()
{
	return status;
}

void
CatalogsVerticalProductGroup::setStatus(CatalogsProductGroupStatus  status)
{
	this->status = status;
}

CatalogsHotelProductGroupType
CatalogsVerticalProductGroup::getType()
{
	return type;
}

void
CatalogsVerticalProductGroup::setType(CatalogsHotelProductGroupType  type)
{
	this->type = type;
}

int
CatalogsVerticalProductGroup::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsVerticalProductGroup::setUpdatedAt(int  updated_at)
{
	this->updated_at = updated_at;
}


