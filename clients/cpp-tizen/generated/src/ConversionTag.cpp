#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionTag.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionTag::ConversionTag()
{
	//__init();
}

ConversionTag::~ConversionTag()
{
	//__cleanup();
}

void
ConversionTag::__init()
{
	//code_snippet = std::string();
	//configs = null;
	//enhanced_match_status = null;
	//id = std::string();
	//last_fired_time_ms = double(0);
	//name = std::string();
	//version = std::string();
	//ad_account_id = std::string();
	//status = null;
}

void
ConversionTag::__cleanup()
{
	//if(code_snippet != NULL) {
	//
	//delete code_snippet;
	//code_snippet = NULL;
	//}
	//if(configs != NULL) {
	//
	//delete configs;
	//configs = NULL;
	//}
	//if(enhanced_match_status != NULL) {
	//
	//delete enhanced_match_status;
	//enhanced_match_status = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(last_fired_time_ms != NULL) {
	//
	//delete last_fired_time_ms;
	//last_fired_time_ms = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(version != NULL) {
	//
	//delete version;
	//version = NULL;
	//}
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
ConversionTag::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *code_snippetKey = "code_snippet";
	node = json_object_get_member(pJsonObject, code_snippetKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&code_snippet, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *configsKey = "configs";
	node = json_object_get_member(pJsonObject, configsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionTagConfigs")) {
			jsonToValue(&configs, node, "ConversionTagConfigs", "ConversionTagConfigs");
		} else {
			
			ConversionTagConfigs* obj = static_cast<ConversionTagConfigs*> (&configs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enhanced_match_statusKey = "enhanced_match_status";
	node = json_object_get_member(pJsonObject, enhanced_match_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("EnhancedMatchStatusType")) {
			jsonToValue(&enhanced_match_status, node, "EnhancedMatchStatusType", "EnhancedMatchStatusType");
		} else {
			
			EnhancedMatchStatusType* obj = static_cast<EnhancedMatchStatusType*> (&enhanced_match_status);
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
	const gchar *last_fired_time_msKey = "last_fired_time_ms";
	node = json_object_get_member(pJsonObject, last_fired_time_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&last_fired_time_ms, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&last_fired_time_ms);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *versionKey = "version";
	node = json_object_get_member(pJsonObject, versionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&version, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
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
}

ConversionTag::ConversionTag(char* json)
{
	this->fromJson(json);
}

char*
ConversionTag::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCodeSnippet();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *code_snippetKey = "code_snippet";
	json_object_set_member(pJsonObject, code_snippetKey, node);
	if (isprimitive("ConversionTagConfigs")) {
		ConversionTagConfigs obj = getConfigs();
		node = converttoJson(&obj, "ConversionTagConfigs", "");
	}
	else {
		
		ConversionTagConfigs obj = static_cast<ConversionTagConfigs> (getConfigs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *configsKey = "configs";
	json_object_set_member(pJsonObject, configsKey, node);
	if (isprimitive("EnhancedMatchStatusType")) {
		EnhancedMatchStatusType obj = getEnhancedMatchStatus();
		node = converttoJson(&obj, "EnhancedMatchStatusType", "");
	}
	else {
		
		EnhancedMatchStatusType obj = static_cast<EnhancedMatchStatusType> (getEnhancedMatchStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enhanced_match_statusKey = "enhanced_match_status";
	json_object_set_member(pJsonObject, enhanced_match_statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("long long")) {
		long long obj = getLastFiredTimeMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getLastFiredTimeMs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *last_fired_time_msKey = "last_fired_time_ms";
	json_object_set_member(pJsonObject, last_fired_time_msKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVersion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *versionKey = "version";
	json_object_set_member(pJsonObject, versionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConversionTag::getCodeSnippet()
{
	return code_snippet;
}

void
ConversionTag::setCodeSnippet(std::string  code_snippet)
{
	this->code_snippet = code_snippet;
}

ConversionTagConfigs
ConversionTag::getConfigs()
{
	return configs;
}

void
ConversionTag::setConfigs(ConversionTagConfigs  configs)
{
	this->configs = configs;
}

EnhancedMatchStatusType
ConversionTag::getEnhancedMatchStatus()
{
	return enhanced_match_status;
}

void
ConversionTag::setEnhancedMatchStatus(EnhancedMatchStatusType  enhanced_match_status)
{
	this->enhanced_match_status = enhanced_match_status;
}

std::string
ConversionTag::getId()
{
	return id;
}

void
ConversionTag::setId(std::string  id)
{
	this->id = id;
}

long long
ConversionTag::getLastFiredTimeMs()
{
	return last_fired_time_ms;
}

void
ConversionTag::setLastFiredTimeMs(long long  last_fired_time_ms)
{
	this->last_fired_time_ms = last_fired_time_ms;
}

std::string
ConversionTag::getName()
{
	return name;
}

void
ConversionTag::setName(std::string  name)
{
	this->name = name;
}

std::string
ConversionTag::getVersion()
{
	return version;
}

void
ConversionTag::setVersion(std::string  version)
{
	this->version = version;
}

std::string
ConversionTag::getAdAccountId()
{
	return ad_account_id;
}

void
ConversionTag::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

EntityStatus
ConversionTag::getStatus()
{
	return status;
}

void
ConversionTag::setStatus(EntityStatus  status)
{
	this->status = status;
}


