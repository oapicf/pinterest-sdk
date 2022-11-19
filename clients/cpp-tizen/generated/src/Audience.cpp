#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Audience.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Audience::Audience()
{
	//__init();
}

Audience::~Audience()
{
	//__cleanup();
}

void
Audience::__init()
{
	//ad_account_id = std::string();
	//id = std::string();
	//name = std::string();
	//audience_type = std::string();
	//description = std::string();
	//rule = new AudienceRule();
	//size = int(0);
	//status = std::string();
	//type = std::string();
	//created_timestamp = int(0);
	//updated_timestamp = int(0);
}

void
Audience::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
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
	//if(audience_type != NULL) {
	//
	//delete audience_type;
	//audience_type = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(rule != NULL) {
	//
	//delete rule;
	//rule = NULL;
	//}
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
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
	//if(created_timestamp != NULL) {
	//
	//delete created_timestamp;
	//created_timestamp = NULL;
	//}
	//if(updated_timestamp != NULL) {
	//
	//delete updated_timestamp;
	//updated_timestamp = NULL;
	//}
	//
}

void
Audience::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *audience_typeKey = "audience_type";
	node = json_object_get_member(pJsonObject, audience_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&audience_type, node, "std::string", "");
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
	const gchar *ruleKey = "rule";
	node = json_object_get_member(pJsonObject, ruleKey);
	if (node !=NULL) {
	

		if (isprimitive("AudienceRule")) {
			jsonToValue(&rule, node, "AudienceRule", "AudienceRule");
		} else {
			
			AudienceRule* obj = static_cast<AudienceRule*> (&rule);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&size, node, "int", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
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
	const gchar *created_timestampKey = "created_timestamp";
	node = json_object_get_member(pJsonObject, created_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_timestamp, node, "int", "");
		} else {
			
		}
	}
	const gchar *updated_timestampKey = "updated_timestamp";
	node = json_object_get_member(pJsonObject, updated_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_timestamp, node, "int", "");
		} else {
			
		}
	}
}

Audience::Audience(char* json)
{
	this->fromJson(json);
}

char*
Audience::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
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
		std::string obj = getAudienceType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *audience_typeKey = "audience_type";
	json_object_set_member(pJsonObject, audience_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("AudienceRule")) {
		AudienceRule obj = getRule();
		node = converttoJson(&obj, "AudienceRule", "");
	}
	else {
		
		AudienceRule obj = static_cast<AudienceRule> (getRule());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ruleKey = "rule";
	json_object_set_member(pJsonObject, ruleKey, node);
	if (isprimitive("int")) {
		int obj = getSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTimestamp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timestampKey = "created_timestamp";
	json_object_set_member(pJsonObject, created_timestampKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedTimestamp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_timestampKey = "updated_timestamp";
	json_object_set_member(pJsonObject, updated_timestampKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Audience::getAdAccountId()
{
	return ad_account_id;
}

void
Audience::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
Audience::getId()
{
	return id;
}

void
Audience::setId(std::string  id)
{
	this->id = id;
}

std::string
Audience::getName()
{
	return name;
}

void
Audience::setName(std::string  name)
{
	this->name = name;
}

std::string
Audience::getAudienceType()
{
	return audience_type;
}

void
Audience::setAudienceType(std::string  audience_type)
{
	this->audience_type = audience_type;
}

std::string
Audience::getDescription()
{
	return description;
}

void
Audience::setDescription(std::string  description)
{
	this->description = description;
}

AudienceRule
Audience::getRule()
{
	return rule;
}

void
Audience::setRule(AudienceRule  rule)
{
	this->rule = rule;
}

int
Audience::getSize()
{
	return size;
}

void
Audience::setSize(int  size)
{
	this->size = size;
}

std::string
Audience::getStatus()
{
	return status;
}

void
Audience::setStatus(std::string  status)
{
	this->status = status;
}

std::string
Audience::getType()
{
	return type;
}

void
Audience::setType(std::string  type)
{
	this->type = type;
}

int
Audience::getCreatedTimestamp()
{
	return created_timestamp;
}

void
Audience::setCreatedTimestamp(int  created_timestamp)
{
	this->created_timestamp = created_timestamp;
}

int
Audience::getUpdatedTimestamp()
{
	return updated_timestamp;
}

void
Audience::setUpdatedTimestamp(int  updated_timestamp)
{
	this->updated_timestamp = updated_timestamp;
}


