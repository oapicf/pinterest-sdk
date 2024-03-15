#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogProductGroup.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogProductGroup::CatalogProductGroup()
{
	//__init();
}

CatalogProductGroup::~CatalogProductGroup()
{
	//__cleanup();
}

void
CatalogProductGroup::__init()
{
	//id = std::string();
	//merchant_id = std::string();
	//name = std::string();
	//filters = null;
	//filter_v2 = null;
	//type = new Board();
	//status = new EntityStatus();
	//feed_profile_id = std::string();
	//created_at = int(0);
	//last_update = int(0);
	//product_count = int(0);
	//featured_position = int(0);
}

void
CatalogProductGroup::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(merchant_id != NULL) {
	//
	//delete merchant_id;
	//merchant_id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(filters != NULL) {
	//
	//delete filters;
	//filters = NULL;
	//}
	//if(filter_v2 != NULL) {
	//
	//delete filter_v2;
	//filter_v2 = NULL;
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
	//if(feed_profile_id != NULL) {
	//
	//delete feed_profile_id;
	//feed_profile_id = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(last_update != NULL) {
	//
	//delete last_update;
	//last_update = NULL;
	//}
	//if(product_count != NULL) {
	//
	//delete product_count;
	//product_count = NULL;
	//}
	//if(featured_position != NULL) {
	//
	//delete featured_position;
	//featured_position = NULL;
	//}
	//
}

void
CatalogProductGroup::fromJson(char* jsonStr)
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
	const gchar *merchant_idKey = "merchant_id";
	node = json_object_get_member(pJsonObject, merchant_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&merchant_id, node, "std::string", "");
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
	const gchar *filtersKey = "filters";
	node = json_object_get_member(pJsonObject, filtersKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&filters, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&filters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filter_v2Key = "filter_v2";
	node = json_object_get_member(pJsonObject, filter_v2Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&filter_v2, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&filter_v2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("Board")) {
			jsonToValue(&type, node, "Board", "Board");
		} else {
			
			Board* obj = static_cast<Board*> (&type);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *feed_profile_idKey = "feed_profile_id";
	node = json_object_get_member(pJsonObject, feed_profile_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&feed_profile_id, node, "std::string", "");
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
	const gchar *last_updateKey = "last_update";
	node = json_object_get_member(pJsonObject, last_updateKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&last_update, node, "int", "");
		} else {
			
		}
	}
	const gchar *product_countKey = "product_count";
	node = json_object_get_member(pJsonObject, product_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&product_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *featured_positionKey = "featured_position";
	node = json_object_get_member(pJsonObject, featured_positionKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&featured_position, node, "int", "");
		} else {
			
		}
	}
}

CatalogProductGroup::CatalogProductGroup(char* json)
{
	this->fromJson(json);
}

char*
CatalogProductGroup::toJson()
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
		std::string obj = getMerchantId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *merchant_idKey = "merchant_id";
	json_object_set_member(pJsonObject, merchant_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFilters();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getFilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtersKey = "filters";
	json_object_set_member(pJsonObject, filtersKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFilterV2();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getFilterV2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filter_v2Key = "filter_v2";
	json_object_set_member(pJsonObject, filter_v2Key, node);
	if (isprimitive("Board")) {
		Board obj = getType();
		node = converttoJson(&obj, "Board", "");
	}
	else {
		
		Board obj = static_cast<Board> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
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
		std::string obj = getFeedProfileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_profile_idKey = "feed_profile_id";
	json_object_set_member(pJsonObject, feed_profile_idKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("int")) {
		int obj = getLastUpdate();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *last_updateKey = "last_update";
	json_object_set_member(pJsonObject, last_updateKey, node);
	if (isprimitive("int")) {
		int obj = getProductCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *product_countKey = "product_count";
	json_object_set_member(pJsonObject, product_countKey, node);
	if (isprimitive("int")) {
		int obj = getFeaturedPosition();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *featured_positionKey = "featured_position";
	json_object_set_member(pJsonObject, featured_positionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogProductGroup::getId()
{
	return id;
}

void
CatalogProductGroup::setId(std::string  id)
{
	this->id = id;
}

std::string
CatalogProductGroup::getMerchantId()
{
	return merchant_id;
}

void
CatalogProductGroup::setMerchantId(std::string  merchant_id)
{
	this->merchant_id = merchant_id;
}

std::string
CatalogProductGroup::getName()
{
	return name;
}

void
CatalogProductGroup::setName(std::string  name)
{
	this->name = name;
}

std::string
CatalogProductGroup::getFilters()
{
	return filters;
}

void
CatalogProductGroup::setFilters(std::string  filters)
{
	this->filters = filters;
}

std::string
CatalogProductGroup::getFilterV2()
{
	return filter_v2;
}

void
CatalogProductGroup::setFilterV2(std::string  filter_v2)
{
	this->filter_v2 = filter_v2;
}

Board
CatalogProductGroup::getType()
{
	return type;
}

void
CatalogProductGroup::setType(Board  type)
{
	this->type = type;
}

EntityStatus
CatalogProductGroup::getStatus()
{
	return status;
}

void
CatalogProductGroup::setStatus(EntityStatus  status)
{
	this->status = status;
}

std::string
CatalogProductGroup::getFeedProfileId()
{
	return feed_profile_id;
}

void
CatalogProductGroup::setFeedProfileId(std::string  feed_profile_id)
{
	this->feed_profile_id = feed_profile_id;
}

int
CatalogProductGroup::getCreatedAt()
{
	return created_at;
}

void
CatalogProductGroup::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

int
CatalogProductGroup::getLastUpdate()
{
	return last_update;
}

void
CatalogProductGroup::setLastUpdate(int  last_update)
{
	this->last_update = last_update;
}

int
CatalogProductGroup::getProductCount()
{
	return product_count;
}

void
CatalogProductGroup::setProductCount(int  product_count)
{
	this->product_count = product_count;
}

int
CatalogProductGroup::getFeaturedPosition()
{
	return featured_position;
}

void
CatalogProductGroup::setFeaturedPosition(int  featured_position)
{
	this->featured_position = featured_position;
}


