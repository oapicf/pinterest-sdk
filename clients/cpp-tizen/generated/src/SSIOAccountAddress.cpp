#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SSIOAccountAddress.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SSIOAccountAddress::SSIOAccountAddress()
{
	//__init();
}

SSIOAccountAddress::~SSIOAccountAddress()
{
	//__cleanup();
}

void
SSIOAccountAddress::__init()
{
	//display = std::string();
	//purpose = std::string();
	//address_id = std::string();
	//order_legal_entity = std::string();
}

void
SSIOAccountAddress::__cleanup()
{
	//if(display != NULL) {
	//
	//delete display;
	//display = NULL;
	//}
	//if(purpose != NULL) {
	//
	//delete purpose;
	//purpose = NULL;
	//}
	//if(address_id != NULL) {
	//
	//delete address_id;
	//address_id = NULL;
	//}
	//if(order_legal_entity != NULL) {
	//
	//delete order_legal_entity;
	//order_legal_entity = NULL;
	//}
	//
}

void
SSIOAccountAddress::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *displayKey = "display";
	node = json_object_get_member(pJsonObject, displayKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&display, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *purposeKey = "purpose";
	node = json_object_get_member(pJsonObject, purposeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&purpose, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *address_idKey = "address_id";
	node = json_object_get_member(pJsonObject, address_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&address_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *order_legal_entityKey = "order_legal_entity";
	node = json_object_get_member(pJsonObject, order_legal_entityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&order_legal_entity, node, "std::string", "");
		} else {
			
		}
	}
}

SSIOAccountAddress::SSIOAccountAddress(char* json)
{
	this->fromJson(json);
}

char*
SSIOAccountAddress::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDisplay();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *displayKey = "display";
	json_object_set_member(pJsonObject, displayKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPurpose();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *purposeKey = "purpose";
	json_object_set_member(pJsonObject, purposeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAddressId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *address_idKey = "address_id";
	json_object_set_member(pJsonObject, address_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrderLegalEntity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *order_legal_entityKey = "order_legal_entity";
	json_object_set_member(pJsonObject, order_legal_entityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SSIOAccountAddress::getDisplay()
{
	return display;
}

void
SSIOAccountAddress::setDisplay(std::string  display)
{
	this->display = display;
}

std::string
SSIOAccountAddress::getPurpose()
{
	return purpose;
}

void
SSIOAccountAddress::setPurpose(std::string  purpose)
{
	this->purpose = purpose;
}

std::string
SSIOAccountAddress::getAddressId()
{
	return address_id;
}

void
SSIOAccountAddress::setAddressId(std::string  address_id)
{
	this->address_id = address_id;
}

std::string
SSIOAccountAddress::getOrderLegalEntity()
{
	return order_legal_entity;
}

void
SSIOAccountAddress::setOrderLegalEntity(std::string  order_legal_entity)
{
	this->order_legal_entity = order_legal_entity;
}


