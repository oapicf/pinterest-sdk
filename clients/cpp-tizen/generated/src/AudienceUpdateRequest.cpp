#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceUpdateRequest::AudienceUpdateRequest()
{
	//__init();
}

AudienceUpdateRequest::~AudienceUpdateRequest()
{
	//__cleanup();
}

void
AudienceUpdateRequest::__init()
{
	//ad_account_id = std::string();
	//name = std::string();
	//rule = new AudienceRule();
	//description = std::string();
	//operation_type = new AudienceUpdateOperationType();
}

void
AudienceUpdateRequest::__cleanup()
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
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(operation_type != NULL) {
	//
	//delete operation_type;
	//operation_type = NULL;
	//}
	//
}

void
AudienceUpdateRequest::fromJson(char* jsonStr)
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
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operation_typeKey = "operation_type";
	node = json_object_get_member(pJsonObject, operation_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AudienceUpdateOperationType")) {
			jsonToValue(&operation_type, node, "AudienceUpdateOperationType", "AudienceUpdateOperationType");
		} else {
			
			AudienceUpdateOperationType* obj = static_cast<AudienceUpdateOperationType*> (&operation_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AudienceUpdateRequest::AudienceUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
AudienceUpdateRequest::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("AudienceUpdateOperationType")) {
		AudienceUpdateOperationType obj = getOperationType();
		node = converttoJson(&obj, "AudienceUpdateOperationType", "");
	}
	else {
		
		AudienceUpdateOperationType obj = static_cast<AudienceUpdateOperationType> (getOperationType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operation_typeKey = "operation_type";
	json_object_set_member(pJsonObject, operation_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AudienceUpdateRequest::getAdAccountId()
{
	return ad_account_id;
}

void
AudienceUpdateRequest::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
AudienceUpdateRequest::getName()
{
	return name;
}

void
AudienceUpdateRequest::setName(std::string  name)
{
	this->name = name;
}

AudienceRule
AudienceUpdateRequest::getRule()
{
	return rule;
}

void
AudienceUpdateRequest::setRule(AudienceRule  rule)
{
	this->rule = rule;
}

std::string
AudienceUpdateRequest::getDescription()
{
	return description;
}

void
AudienceUpdateRequest::setDescription(std::string  description)
{
	this->description = description;
}

AudienceUpdateOperationType
AudienceUpdateRequest::getOperationType()
{
	return operation_type;
}

void
AudienceUpdateRequest::setOperationType(AudienceUpdateOperationType  operation_type)
{
	this->operation_type = operation_type;
}


