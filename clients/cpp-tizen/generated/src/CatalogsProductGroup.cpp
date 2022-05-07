#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroup.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroup::CatalogsProductGroup()
{
	//__init();
}

CatalogsProductGroup::~CatalogsProductGroup()
{
	//__cleanup();
}

void
CatalogsProductGroup::__init()
{
	//id = std::string();
	//name = std::string();
	//description = std::string();
	//filters = new CatalogsProductGroupFilters();
	//type = new CatalogsProductGroupType();
	//status = new CatalogsProductGroupStatus();
	//feed_id = std::string();
	//created_at = int(0);
	//updated_at = int(0);
}

void
CatalogsProductGroup::__cleanup()
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
	//if(feed_id != NULL) {
	//
	//delete feed_id;
	//feed_id = NULL;
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
	//
}

void
CatalogsProductGroup::fromJson(char* jsonStr)
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
	const gchar *feed_idKey = "feed_id";
	node = json_object_get_member(pJsonObject, feed_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&feed_id, node, "std::string", "");
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
	const gchar *updated_atKey = "updated_at";
	node = json_object_get_member(pJsonObject, updated_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_at, node, "int", "");
		} else {
			
		}
	}
}

CatalogsProductGroup::CatalogsProductGroup(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroup::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getFeedId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_idKey = "feed_id";
	json_object_set_member(pJsonObject, feed_idKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsProductGroup::getId()
{
	return id;
}

void
CatalogsProductGroup::setId(std::string  id)
{
	this->id = id;
}

std::string
CatalogsProductGroup::getName()
{
	return name;
}

void
CatalogsProductGroup::setName(std::string  name)
{
	this->name = name;
}

std::string
CatalogsProductGroup::getDescription()
{
	return description;
}

void
CatalogsProductGroup::setDescription(std::string  description)
{
	this->description = description;
}

CatalogsProductGroupFilters
CatalogsProductGroup::getFilters()
{
	return filters;
}

void
CatalogsProductGroup::setFilters(CatalogsProductGroupFilters  filters)
{
	this->filters = filters;
}

CatalogsProductGroupType
CatalogsProductGroup::getType()
{
	return type;
}

void
CatalogsProductGroup::setType(CatalogsProductGroupType  type)
{
	this->type = type;
}

CatalogsProductGroupStatus
CatalogsProductGroup::getStatus()
{
	return status;
}

void
CatalogsProductGroup::setStatus(CatalogsProductGroupStatus  status)
{
	this->status = status;
}

std::string
CatalogsProductGroup::getFeedId()
{
	return feed_id;
}

void
CatalogsProductGroup::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

int
CatalogsProductGroup::getCreatedAt()
{
	return created_at;
}

void
CatalogsProductGroup::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

int
CatalogsProductGroup::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsProductGroup::setUpdatedAt(int  updated_at)
{
	this->updated_at = updated_at;
}


