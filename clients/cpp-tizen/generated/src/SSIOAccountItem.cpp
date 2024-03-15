#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SSIOAccountItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SSIOAccountItem::SSIOAccountItem()
{
	//__init();
}

SSIOAccountItem::~SSIOAccountItem()
{
	//__cleanup();
}

void
SSIOAccountItem::__init()
{
	//id = std::string();
	//io_terms_id = std::string();
	//io_terms = std::string();
	//us_terms_id = std::string();
	//us_terms = std::string();
	//row_terms_id = std::string();
	//row_terms = std::string();
	//io_type = std::string();
	//new std::list()std::list> addresses;
}

void
SSIOAccountItem::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(io_terms_id != NULL) {
	//
	//delete io_terms_id;
	//io_terms_id = NULL;
	//}
	//if(io_terms != NULL) {
	//
	//delete io_terms;
	//io_terms = NULL;
	//}
	//if(us_terms_id != NULL) {
	//
	//delete us_terms_id;
	//us_terms_id = NULL;
	//}
	//if(us_terms != NULL) {
	//
	//delete us_terms;
	//us_terms = NULL;
	//}
	//if(row_terms_id != NULL) {
	//
	//delete row_terms_id;
	//row_terms_id = NULL;
	//}
	//if(row_terms != NULL) {
	//
	//delete row_terms;
	//row_terms = NULL;
	//}
	//if(io_type != NULL) {
	//
	//delete io_type;
	//io_type = NULL;
	//}
	//if(addresses != NULL) {
	//addresses.RemoveAll(true);
	//delete addresses;
	//addresses = NULL;
	//}
	//
}

void
SSIOAccountItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *io_terms_idKey = "io_terms_id";
	node = json_object_get_member(pJsonObject, io_terms_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&io_terms_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *io_termsKey = "io_terms";
	node = json_object_get_member(pJsonObject, io_termsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&io_terms, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *us_terms_idKey = "us_terms_id";
	node = json_object_get_member(pJsonObject, us_terms_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&us_terms_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *us_termsKey = "us_terms";
	node = json_object_get_member(pJsonObject, us_termsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&us_terms, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *row_terms_idKey = "row_terms_id";
	node = json_object_get_member(pJsonObject, row_terms_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&row_terms_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *row_termsKey = "row_terms";
	node = json_object_get_member(pJsonObject, row_termsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&row_terms, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *io_typeKey = "io_type";
	node = json_object_get_member(pJsonObject, io_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&io_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *addressesKey = "addresses";
	node = json_object_get_member(pJsonObject, addressesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SSIOAccountAddress> new_list;
			SSIOAccountAddress inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SSIOAccountAddress")) {
					jsonToValue(&inst, temp_json, "SSIOAccountAddress", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			addresses = new_list;
		}
		
	}
}

SSIOAccountItem::SSIOAccountItem(char* json)
{
	this->fromJson(json);
}

char*
SSIOAccountItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIoTermsId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *io_terms_idKey = "io_terms_id";
	json_object_set_member(pJsonObject, io_terms_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIoTerms();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *io_termsKey = "io_terms";
	json_object_set_member(pJsonObject, io_termsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUsTermsId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *us_terms_idKey = "us_terms_id";
	json_object_set_member(pJsonObject, us_terms_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUsTerms();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *us_termsKey = "us_terms";
	json_object_set_member(pJsonObject, us_termsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRowTermsId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *row_terms_idKey = "row_terms_id";
	json_object_set_member(pJsonObject, row_terms_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRowTerms();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *row_termsKey = "row_terms";
	json_object_set_member(pJsonObject, row_termsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIoType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *io_typeKey = "io_type";
	json_object_set_member(pJsonObject, io_typeKey, node);
	if (isprimitive("SSIOAccountAddress")) {
		list<SSIOAccountAddress> new_list = static_cast<list <SSIOAccountAddress> > (getAddresses());
		node = converttoJson(&new_list, "SSIOAccountAddress", "array");
	} else {
		node = json_node_alloc();
		list<SSIOAccountAddress> new_list = static_cast<list <SSIOAccountAddress> > (getAddresses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SSIOAccountAddress>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SSIOAccountAddress obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *addressesKey = "addresses";
	json_object_set_member(pJsonObject, addressesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SSIOAccountItem::getId()
{
	return id;
}

void
SSIOAccountItem::setId(std::string  id)
{
	this->id = id;
}

std::string
SSIOAccountItem::getIoTermsId()
{
	return io_terms_id;
}

void
SSIOAccountItem::setIoTermsId(std::string  io_terms_id)
{
	this->io_terms_id = io_terms_id;
}

std::string
SSIOAccountItem::getIoTerms()
{
	return io_terms;
}

void
SSIOAccountItem::setIoTerms(std::string  io_terms)
{
	this->io_terms = io_terms;
}

std::string
SSIOAccountItem::getUsTermsId()
{
	return us_terms_id;
}

void
SSIOAccountItem::setUsTermsId(std::string  us_terms_id)
{
	this->us_terms_id = us_terms_id;
}

std::string
SSIOAccountItem::getUsTerms()
{
	return us_terms;
}

void
SSIOAccountItem::setUsTerms(std::string  us_terms)
{
	this->us_terms = us_terms;
}

std::string
SSIOAccountItem::getRowTermsId()
{
	return row_terms_id;
}

void
SSIOAccountItem::setRowTermsId(std::string  row_terms_id)
{
	this->row_terms_id = row_terms_id;
}

std::string
SSIOAccountItem::getRowTerms()
{
	return row_terms;
}

void
SSIOAccountItem::setRowTerms(std::string  row_terms)
{
	this->row_terms = row_terms;
}

std::string
SSIOAccountItem::getIoType()
{
	return io_type;
}

void
SSIOAccountItem::setIoType(std::string  io_type)
{
	this->io_type = io_type;
}

std::list<SSIOAccountAddress>
SSIOAccountItem::getAddresses()
{
	return addresses;
}

void
SSIOAccountItem::setAddresses(std::list <SSIOAccountAddress> addresses)
{
	this->addresses = addresses;
}


