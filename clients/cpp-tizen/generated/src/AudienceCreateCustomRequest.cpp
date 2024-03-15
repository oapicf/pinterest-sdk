#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceCreateCustomRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceCreateCustomRequest::AudienceCreateCustomRequest()
{
	//__init();
}

AudienceCreateCustomRequest::~AudienceCreateCustomRequest()
{
	//__cleanup();
}

void
AudienceCreateCustomRequest::__init()
{
	//ad_account_id = std::string();
	//name = std::string();
	//rule = new AudienceRule();
	//sharing_type = new AudienceSharingType();
	//data_party = new AudienceDataParty();
	//category = std::string();
}

void
AudienceCreateCustomRequest::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
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
	//if(sharing_type != NULL) {
	//
	//delete sharing_type;
	//sharing_type = NULL;
	//}
	//if(data_party != NULL) {
	//
	//delete data_party;
	//data_party = NULL;
	//}
	//if(category != NULL) {
	//
	//delete category;
	//category = NULL;
	//}
	//
}

void
AudienceCreateCustomRequest::fromJson(char* jsonStr)
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
	

		if (isprimitive("AudienceRule")) {
			jsonToValue(&rule, node, "AudienceRule", "AudienceRule");
		} else {
			
			AudienceRule* obj = static_cast<AudienceRule*> (&rule);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sharing_typeKey = "sharing_type";
	node = json_object_get_member(pJsonObject, sharing_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AudienceSharingType")) {
			jsonToValue(&sharing_type, node, "AudienceSharingType", "AudienceSharingType");
		} else {
			
			AudienceSharingType* obj = static_cast<AudienceSharingType*> (&sharing_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *data_partyKey = "data_party";
	node = json_object_get_member(pJsonObject, data_partyKey);
	if (node !=NULL) {
	

		if (isprimitive("AudienceDataParty")) {
			jsonToValue(&data_party, node, "AudienceDataParty", "AudienceDataParty");
		} else {
			
			AudienceDataParty* obj = static_cast<AudienceDataParty*> (&data_party);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *categoryKey = "category";
	node = json_object_get_member(pJsonObject, categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&category, node, "std::string", "");
		} else {
			
		}
	}
}

AudienceCreateCustomRequest::AudienceCreateCustomRequest(char* json)
{
	this->fromJson(json);
}

char*
AudienceCreateCustomRequest::toJson()
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
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
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
	if (isprimitive("AudienceSharingType")) {
		AudienceSharingType obj = getSharingType();
		node = converttoJson(&obj, "AudienceSharingType", "");
	}
	else {
		
		AudienceSharingType obj = static_cast<AudienceSharingType> (getSharingType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sharing_typeKey = "sharing_type";
	json_object_set_member(pJsonObject, sharing_typeKey, node);
	if (isprimitive("AudienceDataParty")) {
		AudienceDataParty obj = getDataParty();
		node = converttoJson(&obj, "AudienceDataParty", "");
	}
	else {
		
		AudienceDataParty obj = static_cast<AudienceDataParty> (getDataParty());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *data_partyKey = "data_party";
	json_object_set_member(pJsonObject, data_partyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *categoryKey = "category";
	json_object_set_member(pJsonObject, categoryKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AudienceCreateCustomRequest::getAdAccountId()
{
	return ad_account_id;
}

void
AudienceCreateCustomRequest::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
AudienceCreateCustomRequest::getName()
{
	return name;
}

void
AudienceCreateCustomRequest::setName(std::string  name)
{
	this->name = name;
}

AudienceRule
AudienceCreateCustomRequest::getRule()
{
	return rule;
}

void
AudienceCreateCustomRequest::setRule(AudienceRule  rule)
{
	this->rule = rule;
}

AudienceSharingType
AudienceCreateCustomRequest::getSharingType()
{
	return sharing_type;
}

void
AudienceCreateCustomRequest::setSharingType(AudienceSharingType  sharing_type)
{
	this->sharing_type = sharing_type;
}

AudienceDataParty
AudienceCreateCustomRequest::getDataParty()
{
	return data_party;
}

void
AudienceCreateCustomRequest::setDataParty(AudienceDataParty  data_party)
{
	this->data_party = data_party;
}

std::string
AudienceCreateCustomRequest::getCategory()
{
	return category;
}

void
AudienceCreateCustomRequest::setCategory(std::string  category)
{
	this->category = category;
}


