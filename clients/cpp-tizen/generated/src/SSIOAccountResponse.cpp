#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SSIOAccountResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SSIOAccountResponse::SSIOAccountResponse()
{
	//__init();
}

SSIOAccountResponse::~SSIOAccountResponse()
{
	//__cleanup();
}

void
SSIOAccountResponse::__init()
{
	//eligible = bool(false);
	//can_edit = bool(false);
	//new std::list()std::list> billto_infos;
	//currency = std::string();
	//new std::list()std::list> pmp_names;
	//error = std::string();
}

void
SSIOAccountResponse::__cleanup()
{
	//if(eligible != NULL) {
	//
	//delete eligible;
	//eligible = NULL;
	//}
	//if(can_edit != NULL) {
	//
	//delete can_edit;
	//can_edit = NULL;
	//}
	//if(billto_infos != NULL) {
	//billto_infos.RemoveAll(true);
	//delete billto_infos;
	//billto_infos = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(pmp_names != NULL) {
	//pmp_names.RemoveAll(true);
	//delete pmp_names;
	//pmp_names = NULL;
	//}
	//if(error != NULL) {
	//
	//delete error;
	//error = NULL;
	//}
	//
}

void
SSIOAccountResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *eligibleKey = "eligible";
	node = json_object_get_member(pJsonObject, eligibleKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&eligible, node, "bool", "");
		} else {
			
		}
	}
	const gchar *can_editKey = "can_edit";
	node = json_object_get_member(pJsonObject, can_editKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&can_edit, node, "bool", "");
		} else {
			
		}
	}
	const gchar *billto_infosKey = "billto_infos";
	node = json_object_get_member(pJsonObject, billto_infosKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SSIOAccountItem> new_list;
			SSIOAccountItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SSIOAccountItem")) {
					jsonToValue(&inst, temp_json, "SSIOAccountItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			billto_infos = new_list;
		}
		
	}
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&currency, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pmp_namesKey = "pmp_names";
	node = json_object_get_member(pJsonObject, pmp_namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SSIOAccountPMPName> new_list;
			SSIOAccountPMPName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SSIOAccountPMPName")) {
					jsonToValue(&inst, temp_json, "SSIOAccountPMPName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pmp_names = new_list;
		}
		
	}
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&error, node, "std::string", "");
		} else {
			
		}
	}
}

SSIOAccountResponse::SSIOAccountResponse(char* json)
{
	this->fromJson(json);
}

char*
SSIOAccountResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getEligible();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *eligibleKey = "eligible";
	json_object_set_member(pJsonObject, eligibleKey, node);
	if (isprimitive("bool")) {
		bool obj = getCanEdit();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *can_editKey = "can_edit";
	json_object_set_member(pJsonObject, can_editKey, node);
	if (isprimitive("SSIOAccountItem")) {
		list<SSIOAccountItem> new_list = static_cast<list <SSIOAccountItem> > (getBilltoInfos());
		node = converttoJson(&new_list, "SSIOAccountItem", "array");
	} else {
		node = json_node_alloc();
		list<SSIOAccountItem> new_list = static_cast<list <SSIOAccountItem> > (getBilltoInfos());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SSIOAccountItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SSIOAccountItem obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *billto_infosKey = "billto_infos";
	json_object_set_member(pJsonObject, billto_infosKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCurrency();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	if (isprimitive("SSIOAccountPMPName")) {
		list<SSIOAccountPMPName> new_list = static_cast<list <SSIOAccountPMPName> > (getPmpNames());
		node = converttoJson(&new_list, "SSIOAccountPMPName", "array");
	} else {
		node = json_node_alloc();
		list<SSIOAccountPMPName> new_list = static_cast<list <SSIOAccountPMPName> > (getPmpNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SSIOAccountPMPName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SSIOAccountPMPName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pmp_namesKey = "pmp_names";
	json_object_set_member(pJsonObject, pmp_namesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getError();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *errorKey = "error";
	json_object_set_member(pJsonObject, errorKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
SSIOAccountResponse::getEligible()
{
	return eligible;
}

void
SSIOAccountResponse::setEligible(bool  eligible)
{
	this->eligible = eligible;
}

bool
SSIOAccountResponse::getCanEdit()
{
	return can_edit;
}

void
SSIOAccountResponse::setCanEdit(bool  can_edit)
{
	this->can_edit = can_edit;
}

std::list<SSIOAccountItem>
SSIOAccountResponse::getBilltoInfos()
{
	return billto_infos;
}

void
SSIOAccountResponse::setBilltoInfos(std::list <SSIOAccountItem> billto_infos)
{
	this->billto_infos = billto_infos;
}

std::string
SSIOAccountResponse::getCurrency()
{
	return currency;
}

void
SSIOAccountResponse::setCurrency(std::string  currency)
{
	this->currency = currency;
}

std::list<SSIOAccountPMPName>
SSIOAccountResponse::getPmpNames()
{
	return pmp_names;
}

void
SSIOAccountResponse::setPmpNames(std::list <SSIOAccountPMPName> pmp_names)
{
	this->pmp_names = pmp_names;
}

std::string
SSIOAccountResponse::getError()
{
	return error;
}

void
SSIOAccountResponse::setError(std::string  error)
{
	this->error = error;
}


