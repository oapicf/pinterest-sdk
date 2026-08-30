#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccountsAudienceCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccountsAudienceCreate::AdAccountsAudienceCreate()
{
	//__init();
}

AdAccountsAudienceCreate::~AdAccountsAudienceCreate()
{
	//__cleanup();
}

void
AdAccountsAudienceCreate::__init()
{
	//ad_account_id = std::string();
	//audience_type = null;
	//description = std::string();
	//name = std::string();
	//rule = new AdAccountsAudienceRule();
}

void
AdAccountsAudienceCreate::__cleanup()
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
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
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
	//
}

void
AdAccountsAudienceCreate::fromJson(char* jsonStr)
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
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
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
}

AdAccountsAudienceCreate::AdAccountsAudienceCreate(char* json)
{
	this->fromJson(json);
}

char*
AdAccountsAudienceCreate::toJson()
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
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdAccountsAudienceCreate::getAdAccountId()
{
	return ad_account_id;
}

void
AdAccountsAudienceCreate::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

AudienceType
AdAccountsAudienceCreate::getAudienceType()
{
	return audience_type;
}

void
AdAccountsAudienceCreate::setAudienceType(AudienceType  audience_type)
{
	this->audience_type = audience_type;
}

std::string
AdAccountsAudienceCreate::getDescription()
{
	return description;
}

void
AdAccountsAudienceCreate::setDescription(std::string  description)
{
	this->description = description;
}

std::string
AdAccountsAudienceCreate::getName()
{
	return name;
}

void
AdAccountsAudienceCreate::setName(std::string  name)
{
	this->name = name;
}

AdAccountsAudienceRule
AdAccountsAudienceCreate::getRule()
{
	return rule;
}

void
AdAccountsAudienceCreate::setRule(AdAccountsAudienceRule  rule)
{
	this->rule = rule;
}


