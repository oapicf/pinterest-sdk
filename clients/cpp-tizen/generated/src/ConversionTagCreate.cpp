#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionTagCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionTagCreate::ConversionTagCreate()
{
	//__init();
}

ConversionTagCreate::~ConversionTagCreate()
{
	//__cleanup();
}

void
ConversionTagCreate::__init()
{
	//name = std::string();
	//aem_enabled = bool(false);
	//md_frequency = double(0);
	//aem_fnln_enabled = bool(false);
	//aem_ph_enabled = bool(false);
	//aem_ge_enabled = bool(false);
	//aem_db_enabled = bool(false);
	//aem_loc_enabled = bool(false);
}

void
ConversionTagCreate::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(aem_enabled != NULL) {
	//
	//delete aem_enabled;
	//aem_enabled = NULL;
	//}
	//if(md_frequency != NULL) {
	//
	//delete md_frequency;
	//md_frequency = NULL;
	//}
	//if(aem_fnln_enabled != NULL) {
	//
	//delete aem_fnln_enabled;
	//aem_fnln_enabled = NULL;
	//}
	//if(aem_ph_enabled != NULL) {
	//
	//delete aem_ph_enabled;
	//aem_ph_enabled = NULL;
	//}
	//if(aem_ge_enabled != NULL) {
	//
	//delete aem_ge_enabled;
	//aem_ge_enabled = NULL;
	//}
	//if(aem_db_enabled != NULL) {
	//
	//delete aem_db_enabled;
	//aem_db_enabled = NULL;
	//}
	//if(aem_loc_enabled != NULL) {
	//
	//delete aem_loc_enabled;
	//aem_loc_enabled = NULL;
	//}
	//
}

void
ConversionTagCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
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
	const gchar *aem_fnln_enabledKey = "aem_fnln_enabled";
	node = json_object_get_member(pJsonObject, aem_fnln_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&aem_fnln_enabled, node, "bool", "");
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
	const gchar *aem_ge_enabledKey = "aem_ge_enabled";
	node = json_object_get_member(pJsonObject, aem_ge_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&aem_ge_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *aem_db_enabledKey = "aem_db_enabled";
	node = json_object_get_member(pJsonObject, aem_db_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&aem_db_enabled, node, "bool", "");
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
}

ConversionTagCreate::ConversionTagCreate(char* json)
{
	this->fromJson(json);
}

char*
ConversionTagCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("bool")) {
		bool obj = getAemEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_enabledKey = "aem_enabled";
	json_object_set_member(pJsonObject, aem_enabledKey, node);
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
	if (isprimitive("bool")) {
		bool obj = getAemFnlnEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_fnln_enabledKey = "aem_fnln_enabled";
	json_object_set_member(pJsonObject, aem_fnln_enabledKey, node);
	if (isprimitive("bool")) {
		bool obj = getAemPhEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_ph_enabledKey = "aem_ph_enabled";
	json_object_set_member(pJsonObject, aem_ph_enabledKey, node);
	if (isprimitive("bool")) {
		bool obj = getAemGeEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_ge_enabledKey = "aem_ge_enabled";
	json_object_set_member(pJsonObject, aem_ge_enabledKey, node);
	if (isprimitive("bool")) {
		bool obj = getAemDbEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_db_enabledKey = "aem_db_enabled";
	json_object_set_member(pJsonObject, aem_db_enabledKey, node);
	if (isprimitive("bool")) {
		bool obj = getAemLocEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *aem_loc_enabledKey = "aem_loc_enabled";
	json_object_set_member(pJsonObject, aem_loc_enabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConversionTagCreate::getName()
{
	return name;
}

void
ConversionTagCreate::setName(std::string  name)
{
	this->name = name;
}

bool
ConversionTagCreate::getAemEnabled()
{
	return aem_enabled;
}

void
ConversionTagCreate::setAemEnabled(bool  aem_enabled)
{
	this->aem_enabled = aem_enabled;
}

long long
ConversionTagCreate::getMdFrequency()
{
	return md_frequency;
}

void
ConversionTagCreate::setMdFrequency(long long  md_frequency)
{
	this->md_frequency = md_frequency;
}

bool
ConversionTagCreate::getAemFnlnEnabled()
{
	return aem_fnln_enabled;
}

void
ConversionTagCreate::setAemFnlnEnabled(bool  aem_fnln_enabled)
{
	this->aem_fnln_enabled = aem_fnln_enabled;
}

bool
ConversionTagCreate::getAemPhEnabled()
{
	return aem_ph_enabled;
}

void
ConversionTagCreate::setAemPhEnabled(bool  aem_ph_enabled)
{
	this->aem_ph_enabled = aem_ph_enabled;
}

bool
ConversionTagCreate::getAemGeEnabled()
{
	return aem_ge_enabled;
}

void
ConversionTagCreate::setAemGeEnabled(bool  aem_ge_enabled)
{
	this->aem_ge_enabled = aem_ge_enabled;
}

bool
ConversionTagCreate::getAemDbEnabled()
{
	return aem_db_enabled;
}

void
ConversionTagCreate::setAemDbEnabled(bool  aem_db_enabled)
{
	this->aem_db_enabled = aem_db_enabled;
}

bool
ConversionTagCreate::getAemLocEnabled()
{
	return aem_loc_enabled;
}

void
ConversionTagCreate::setAemLocEnabled(bool  aem_loc_enabled)
{
	this->aem_loc_enabled = aem_loc_enabled;
}


