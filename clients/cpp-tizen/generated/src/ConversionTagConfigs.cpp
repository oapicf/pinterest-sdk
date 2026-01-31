#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionTagConfigs.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionTagConfigs::ConversionTagConfigs()
{
	//__init();
}

ConversionTagConfigs::~ConversionTagConfigs()
{
	//__cleanup();
}

void
ConversionTagConfigs::__init()
{
	//aem_db_enabled = bool(false);
	//aem_enabled = bool(false);
	//aem_external_id_enabled = bool(false);
	//aem_fnln_enabled = bool(false);
	//aem_ge_enabled = bool(false);
	//aem_loc_enabled = bool(false);
	//aem_ph_enabled = bool(false);
	//md_frequency = double(0);
	//new std::list()std::list> no_code_capi_domains;
}

void
ConversionTagConfigs::__cleanup()
{
	//if(aem_db_enabled != NULL) {
	//
	//delete aem_db_enabled;
	//aem_db_enabled = NULL;
	//}
	//if(aem_enabled != NULL) {
	//
	//delete aem_enabled;
	//aem_enabled = NULL;
	//}
	//if(aem_external_id_enabled != NULL) {
	//
	//delete aem_external_id_enabled;
	//aem_external_id_enabled = NULL;
	//}
	//if(aem_fnln_enabled != NULL) {
	//
	//delete aem_fnln_enabled;
	//aem_fnln_enabled = NULL;
	//}
	//if(aem_ge_enabled != NULL) {
	//
	//delete aem_ge_enabled;
	//aem_ge_enabled = NULL;
	//}
	//if(aem_loc_enabled != NULL) {
	//
	//delete aem_loc_enabled;
	//aem_loc_enabled = NULL;
	//}
	//if(aem_ph_enabled != NULL) {
	//
	//delete aem_ph_enabled;
	//aem_ph_enabled = NULL;
	//}
	//if(md_frequency != NULL) {
	//
	//delete md_frequency;
	//md_frequency = NULL;
	//}
	//if(no_code_capi_domains != NULL) {
	//no_code_capi_domains.RemoveAll(true);
	//delete no_code_capi_domains;
	//no_code_capi_domains = NULL;
	//}
	//
}

void
ConversionTagConfigs::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aem_db_enabledKey = "aem_db_enabled";
	node = json_object_get_member(pJsonObject, aem_db_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&aem_db_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *aem_enabledKey = "aem_enabled";
	node = json_object_get_member(pJsonObject, aem_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&aem_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *aem_external_id_enabledKey = "aem_external_id_enabled";
	node = json_object_get_member(pJsonObject, aem_external_id_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&aem_external_id_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *aem_fnln_enabledKey = "aem_fnln_enabled";
	node = json_object_get_member(pJsonObject, aem_fnln_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&aem_fnln_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *aem_ge_enabledKey = "aem_ge_enabled";
	node = json_object_get_member(pJsonObject, aem_ge_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&aem_ge_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *aem_loc_enabledKey = "aem_loc_enabled";
	node = json_object_get_member(pJsonObject, aem_loc_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&aem_loc_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *aem_ph_enabledKey = "aem_ph_enabled";
	node = json_object_get_member(pJsonObject, aem_ph_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&aem_ph_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *md_frequencyKey = "md_frequency";
	node = json_object_get_member(pJsonObject, md_frequencyKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&md_frequency, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&md_frequency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *no_code_capi_domainsKey = "no_code_capi_domains";
	node = json_object_get_member(pJsonObject, no_code_capi_domainsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			no_code_capi_domains = new_list;
		}
		
	}
}

ConversionTagConfigs::ConversionTagConfigs(char* json)
{
	this->fromJson(json);
}

char*
ConversionTagConfigs::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getAemDbEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_db_enabledKey = "aem_db_enabled";
	json_object_set_member(pJsonObject, aem_db_enabledKey, node);
	if (isprimitive("bool")) {
		bool obj = getAemEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_enabledKey = "aem_enabled";
	json_object_set_member(pJsonObject, aem_enabledKey, node);
	if (isprimitive("bool")) {
		bool obj = getAemExternalIdEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_external_id_enabledKey = "aem_external_id_enabled";
	json_object_set_member(pJsonObject, aem_external_id_enabledKey, node);
	if (isprimitive("bool")) {
		bool obj = getAemFnlnEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_fnln_enabledKey = "aem_fnln_enabled";
	json_object_set_member(pJsonObject, aem_fnln_enabledKey, node);
	if (isprimitive("bool")) {
		bool obj = getAemGeEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_ge_enabledKey = "aem_ge_enabled";
	json_object_set_member(pJsonObject, aem_ge_enabledKey, node);
	if (isprimitive("bool")) {
		bool obj = getAemLocEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_loc_enabledKey = "aem_loc_enabled";
	json_object_set_member(pJsonObject, aem_loc_enabledKey, node);
	if (isprimitive("bool")) {
		bool obj = getAemPhEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_ph_enabledKey = "aem_ph_enabled";
	json_object_set_member(pJsonObject, aem_ph_enabledKey, node);
	if (isprimitive("long long")) {
		long long obj = getMdFrequency();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getMdFrequency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *md_frequencyKey = "md_frequency";
	json_object_set_member(pJsonObject, md_frequencyKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getNoCodeCapiDomains());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getNoCodeCapiDomains());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *no_code_capi_domainsKey = "no_code_capi_domains";
	json_object_set_member(pJsonObject, no_code_capi_domainsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
ConversionTagConfigs::getAemDbEnabled()
{
	return aem_db_enabled;
}

void
ConversionTagConfigs::setAemDbEnabled(bool  aem_db_enabled)
{
	this->aem_db_enabled = aem_db_enabled;
}

bool
ConversionTagConfigs::getAemEnabled()
{
	return aem_enabled;
}

void
ConversionTagConfigs::setAemEnabled(bool  aem_enabled)
{
	this->aem_enabled = aem_enabled;
}

bool
ConversionTagConfigs::getAemExternalIdEnabled()
{
	return aem_external_id_enabled;
}

void
ConversionTagConfigs::setAemExternalIdEnabled(bool  aem_external_id_enabled)
{
	this->aem_external_id_enabled = aem_external_id_enabled;
}

bool
ConversionTagConfigs::getAemFnlnEnabled()
{
	return aem_fnln_enabled;
}

void
ConversionTagConfigs::setAemFnlnEnabled(bool  aem_fnln_enabled)
{
	this->aem_fnln_enabled = aem_fnln_enabled;
}

bool
ConversionTagConfigs::getAemGeEnabled()
{
	return aem_ge_enabled;
}

void
ConversionTagConfigs::setAemGeEnabled(bool  aem_ge_enabled)
{
	this->aem_ge_enabled = aem_ge_enabled;
}

bool
ConversionTagConfigs::getAemLocEnabled()
{
	return aem_loc_enabled;
}

void
ConversionTagConfigs::setAemLocEnabled(bool  aem_loc_enabled)
{
	this->aem_loc_enabled = aem_loc_enabled;
}

bool
ConversionTagConfigs::getAemPhEnabled()
{
	return aem_ph_enabled;
}

void
ConversionTagConfigs::setAemPhEnabled(bool  aem_ph_enabled)
{
	this->aem_ph_enabled = aem_ph_enabled;
}

long long
ConversionTagConfigs::getMdFrequency()
{
	return md_frequency;
}

void
ConversionTagConfigs::setMdFrequency(long long  md_frequency)
{
	this->md_frequency = md_frequency;
}

std::list<std::string>
ConversionTagConfigs::getNoCodeCapiDomains()
{
	return no_code_capi_domains;
}

void
ConversionTagConfigs::setNoCodeCapiDomains(std::list <std::string> no_code_capi_domains)
{
	this->no_code_capi_domains = no_code_capi_domains;
}


