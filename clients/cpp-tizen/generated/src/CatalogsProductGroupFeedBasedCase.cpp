#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Catalogs_product_group_feed_based_case.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Catalogs_product_group_feed_based_case::Catalogs_product_group_feed_based_case()
{
	//__init();
}

Catalogs_product_group_feed_based_case::~Catalogs_product_group_feed_based_case()
{
	//__cleanup();
}

void
Catalogs_product_group_feed_based_case::__init()
{
	//id = std::string();
	//name = std::string();
	//description = std::string();
	//filters = new CatalogsProductGroupFilters();
	//is_featured = bool(false);
	//type = new CatalogsProductGroupType();
	//status = new CatalogsProductGroupStatus();
	//created_at = int(0);
	//updated_at = int(0);
	//feed_id = std::string();
}

void
Catalogs_product_group_feed_based_case::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
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
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(updated_at != NULL) {
	//
	//delete updated_at;
	//updated_at = NULL;
	//}
	//if(feed_id != NULL) {
	//
	//delete feed_id;
	//feed_id = NULL;
	//}
	//
}

void
Catalogs_product_group_feed_based_case::fromJson(char* jsonStr)
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
	const gchar *filtersKey = "filters";
	node = json_object_get_member(pJsonObject, filtersKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupFilters")) {
			jsonToValue(&filters, node, "CatalogsProductGroupFilters", "CatalogsProductGroupFilters");
		} else {
			
			CatalogsProductGroupFilters* obj = static_cast<CatalogsProductGroupFilters*> (&filters);
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
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupType")) {
			jsonToValue(&type, node, "CatalogsProductGroupType", "CatalogsProductGroupType");
		} else {
			
			CatalogsProductGroupType* obj = static_cast<CatalogsProductGroupType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
		} else {
			
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
	const gchar *feed_idKey = "feed_id";
	node = json_object_get_member(pJsonObject, feed_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&feed_id, node, "std::string", "");
		} else {
			
		}
	}
}

Catalogs_product_group_feed_based_case::Catalogs_product_group_feed_based_case(char* json)
{
	this->fromJson(json);
}

char*
Catalogs_product_group_feed_based_case::toJson()
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
	if (isprimitive("CatalogsProductGroupFilters")) {
		CatalogsProductGroupFilters obj = getFilters();
		node = converttoJson(&obj, "CatalogsProductGroupFilters", "");
	}
	else {
		
		CatalogsProductGroupFilters obj = static_cast<CatalogsProductGroupFilters> (getFilters());
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
	if (isprimitive("CatalogsProductGroupType")) {
		CatalogsProductGroupType obj = getType();
		node = converttoJson(&obj, "CatalogsProductGroupType", "");
	}
	else {
		
		CatalogsProductGroupType obj = static_cast<CatalogsProductGroupType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
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
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_atKey = "updated_at";
	json_object_set_member(pJsonObject, updated_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFeedId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_idKey = "feed_id";
	json_object_set_member(pJsonObject, feed_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Catalogs_product_group_feed_based_case::getId()
{
	return id;
}

void
Catalogs_product_group_feed_based_case::setId(std::string  id)
{
	this->id = id;
}

std::string
Catalogs_product_group_feed_based_case::getName()
{
	return name;
}

void
Catalogs_product_group_feed_based_case::setName(std::string  name)
{
	this->name = name;
}

std::string
Catalogs_product_group_feed_based_case::getDescription()
{
	return description;
}

void
Catalogs_product_group_feed_based_case::setDescription(std::string  description)
{
	this->description = description;
}

CatalogsProductGroupFilters
Catalogs_product_group_feed_based_case::getFilters()
{
	return filters;
}

void
Catalogs_product_group_feed_based_case::setFilters(CatalogsProductGroupFilters  filters)
{
	this->filters = filters;
}

bool
Catalogs_product_group_feed_based_case::getIsFeatured()
{
	return is_featured;
}

void
Catalogs_product_group_feed_based_case::setIsFeatured(bool  is_featured)
{
	this->is_featured = is_featured;
}

CatalogsProductGroupType
Catalogs_product_group_feed_based_case::getType()
{
	return type;
}

void
Catalogs_product_group_feed_based_case::setType(CatalogsProductGroupType  type)
{
	this->type = type;
}

CatalogsProductGroupStatus
Catalogs_product_group_feed_based_case::getStatus()
{
	return status;
}

void
Catalogs_product_group_feed_based_case::setStatus(CatalogsProductGroupStatus  status)
{
	this->status = status;
}

int
Catalogs_product_group_feed_based_case::getCreatedAt()
{
	return created_at;
}

void
Catalogs_product_group_feed_based_case::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

int
Catalogs_product_group_feed_based_case::getUpdatedAt()
{
	return updated_at;
}

void
Catalogs_product_group_feed_based_case::setUpdatedAt(int  updated_at)
{
	this->updated_at = updated_at;
}

std::string
Catalogs_product_group_feed_based_case::getFeedId()
{
	return feed_id;
}

void
Catalogs_product_group_feed_based_case::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}


