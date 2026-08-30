#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccountsAudience.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccountsAudience::AdAccountsAudience()
{
	//__init();
}

AdAccountsAudience::~AdAccountsAudience()
{
	//__cleanup();
}

void
AdAccountsAudience::__init()
{
	//ad_account_id = std::string();
	//audience_type = null;
	//created_by_company_name = std::string();
	//created_timestamp = int(0);
	//description = std::string();
	//id = std::string();
	//is_nca = bool(false);
	//name = std::string();
	//rule = new AdAccountsAudienceRule();
	//size = int(0);
	//status = null;
	//type = std::string();
	//updated_timestamp = int(0);
}

void
AdAccountsAudience::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(audience_type != NULL) {
	//
	//delete audience_type;
	//audience_type = NULL;
	//}
	//if(created_by_company_name != NULL) {
	//
	//delete created_by_company_name;
	//created_by_company_name = NULL;
	//}
	//if(created_timestamp != NULL) {
	//
	//delete created_timestamp;
	//created_timestamp = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(is_nca != NULL) {
	//
	//delete is_nca;
	//is_nca = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
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
	//if(updated_timestamp != NULL) {
	//
	//delete updated_timestamp;
	//updated_timestamp = NULL;
	//}
	//
}

void
AdAccountsAudience::fromJson(char* jsonStr)
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
	const gchar *audience_typeKey = "audience_type";
	node = json_object_get_member(pJsonObject, audience_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AudienceType")) {
			jsonToValue(&audience_type, node, "AudienceType", "AudienceType");
		} else {
			
			AudienceType* obj = static_cast<AudienceType*> (&audience_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *created_by_company_nameKey = "created_by_company_name";
	node = json_object_get_member(pJsonObject, created_by_company_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_by_company_name, node, "std::string", "");
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
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
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
	const gchar *is_ncaKey = "is_nca";
	node = json_object_get_member(pJsonObject, is_ncaKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_nca, node, "bool", "");
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
	const gchar *ruleKey = "rule";
	node = json_object_get_member(pJsonObject, ruleKey);
	if (node !=NULL) {
	

		if (isprimitive("AdAccountsAudienceRule")) {
			jsonToValue(&rule, node, "AdAccountsAudienceRule", "AdAccountsAudienceRule");
		} else {
			
			AdAccountsAudienceRule* obj = static_cast<AdAccountsAudienceRule*> (&rule);
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
	

		if (isprimitive("AudienceStatus")) {
			jsonToValue(&status, node, "AudienceStatus", "AudienceStatus");
		} else {
			
			AudienceStatus* obj = static_cast<AudienceStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *updated_timestampKey = "updated_timestamp";
	node = json_object_get_member(pJsonObject, updated_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_timestamp, node, "int", "");
		} else {
			
		}
	}
}

AdAccountsAudience::AdAccountsAudience(char* json)
{
	this->fromJson(json);
}

char*
AdAccountsAudience::toJson()
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
	if (isprimitive("AudienceType")) {
		AudienceType obj = getAudienceType();
		node = converttoJson(&obj, "AudienceType", "");
	}
	else {
		
		AudienceType obj = static_cast<AudienceType> (getAudienceType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *audience_typeKey = "audience_type";
	json_object_set_member(pJsonObject, audience_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedByCompanyName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_by_company_nameKey = "created_by_company_name";
	json_object_set_member(pJsonObject, created_by_company_nameKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTimestamp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timestampKey = "created_timestamp";
	json_object_set_member(pJsonObject, created_timestampKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsNca();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_ncaKey = "is_nca";
	json_object_set_member(pJsonObject, is_ncaKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("AdAccountsAudienceRule")) {
		AdAccountsAudienceRule obj = getRule();
		node = converttoJson(&obj, "AdAccountsAudienceRule", "");
	}
	else {
		
		AdAccountsAudienceRule obj = static_cast<AdAccountsAudienceRule> (getRule());
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
	if (isprimitive("AudienceStatus")) {
		AudienceStatus obj = getStatus();
		node = converttoJson(&obj, "AudienceStatus", "");
	}
	else {
		
		AudienceStatus obj = static_cast<AudienceStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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
AdAccountsAudience::getAdAccountId()
{
	return ad_account_id;
}

void
AdAccountsAudience::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

AudienceType
AdAccountsAudience::getAudienceType()
{
	return audience_type;
}

void
AdAccountsAudience::setAudienceType(AudienceType  audience_type)
{
	this->audience_type = audience_type;
}

std::string
AdAccountsAudience::getCreatedByCompanyName()
{
	return created_by_company_name;
}

void
AdAccountsAudience::setCreatedByCompanyName(std::string  created_by_company_name)
{
	this->created_by_company_name = created_by_company_name;
}

int
AdAccountsAudience::getCreatedTimestamp()
{
	return created_timestamp;
}

void
AdAccountsAudience::setCreatedTimestamp(int  created_timestamp)
{
	this->created_timestamp = created_timestamp;
}

std::string
AdAccountsAudience::getDescription()
{
	return description;
}

void
AdAccountsAudience::setDescription(std::string  description)
{
	this->description = description;
}

std::string
AdAccountsAudience::getId()
{
	return id;
}

void
AdAccountsAudience::setId(std::string  id)
{
	this->id = id;
}

bool
AdAccountsAudience::getIsNca()
{
	return is_nca;
}

void
AdAccountsAudience::setIsNca(bool  is_nca)
{
	this->is_nca = is_nca;
}

std::string
AdAccountsAudience::getName()
{
	return name;
}

void
AdAccountsAudience::setName(std::string  name)
{
	this->name = name;
}

AdAccountsAudienceRule
AdAccountsAudience::getRule()
{
	return rule;
}

void
AdAccountsAudience::setRule(AdAccountsAudienceRule  rule)
{
	this->rule = rule;
}

int
AdAccountsAudience::getSize()
{
	return size;
}

void
AdAccountsAudience::setSize(int  size)
{
	this->size = size;
}

AudienceStatus
AdAccountsAudience::getStatus()
{
	return status;
}

void
AdAccountsAudience::setStatus(AudienceStatus  status)
{
	this->status = status;
}

std::string
AdAccountsAudience::getType()
{
	return type;
}

void
AdAccountsAudience::setType(std::string  type)
{
	this->type = type;
}

int
AdAccountsAudience::getUpdatedTimestamp()
{
	return updated_timestamp;
}

void
AdAccountsAudience::setUpdatedTimestamp(int  updated_timestamp)
{
	this->updated_timestamp = updated_timestamp;
}


