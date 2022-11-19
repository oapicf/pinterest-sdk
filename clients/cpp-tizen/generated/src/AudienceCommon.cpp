#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceCommon.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceCommon::AudienceCommon()
{
	//__init();
}

AudienceCommon::~AudienceCommon()
{
	//__cleanup();
}

void
AudienceCommon::__init()
{
	//ad_account_id = std::string();
	//name = std::string();
	//rule = new AudienceRule();
}

void
AudienceCommon::__cleanup()
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
	//
}

void
AudienceCommon::fromJson(char* jsonStr)
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
}

AudienceCommon::AudienceCommon(char* json)
{
	this->fromJson(json);
}

char*
AudienceCommon::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AudienceCommon::getAdAccountId()
{
	return ad_account_id;
}

void
AudienceCommon::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
AudienceCommon::getName()
{
	return name;
}

void
AudienceCommon::setName(std::string  name)
{
	this->name = name;
}

AudienceRule
AudienceCommon::getRule()
{
	return rule;
}

void
AudienceCommon::setRule(AudienceRule  rule)
{
	this->rule = rule;
}


