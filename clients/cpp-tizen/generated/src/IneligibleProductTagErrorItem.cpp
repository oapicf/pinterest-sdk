#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IneligibleProductTagErrorItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IneligibleProductTagErrorItem::IneligibleProductTagErrorItem()
{
	//__init();
}

IneligibleProductTagErrorItem::~IneligibleProductTagErrorItem()
{
	//__cleanup();
}

void
IneligibleProductTagErrorItem::__init()
{
	//error_message = null;
	//pin_id = std::string();
}

void
IneligibleProductTagErrorItem::__cleanup()
{
	//if(error_message != NULL) {
	//
	//delete error_message;
	//error_message = NULL;
	//}
	//if(pin_id != NULL) {
	//
	//delete pin_id;
	//pin_id = NULL;
	//}
	//
}

void
IneligibleProductTagErrorItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *error_messageKey = "error_message";
	node = json_object_get_member(pJsonObject, error_messageKey);
	if (node !=NULL) {
	

		if (isprimitive("IneligibleProductTagReason")) {
			jsonToValue(&error_message, node, "IneligibleProductTagReason", "IneligibleProductTagReason");
		} else {
			
			IneligibleProductTagReason* obj = static_cast<IneligibleProductTagReason*> (&error_message);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pin_idKey = "pin_id";
	node = json_object_get_member(pJsonObject, pin_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pin_id, node, "std::string", "");
		} else {
			
		}
	}
}

IneligibleProductTagErrorItem::IneligibleProductTagErrorItem(char* json)
{
	this->fromJson(json);
}

char*
IneligibleProductTagErrorItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("IneligibleProductTagReason")) {
		IneligibleProductTagReason obj = getErrorMessage();
		node = converttoJson(&obj, "IneligibleProductTagReason", "");
	}
	else {
		
		IneligibleProductTagReason obj = static_cast<IneligibleProductTagReason> (getErrorMessage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *error_messageKey = "error_message";
	json_object_set_member(pJsonObject, error_messageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPinId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pin_idKey = "pin_id";
	json_object_set_member(pJsonObject, pin_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

IneligibleProductTagReason
IneligibleProductTagErrorItem::getErrorMessage()
{
	return error_message;
}

void
IneligibleProductTagErrorItem::setErrorMessage(IneligibleProductTagReason  error_message)
{
	this->error_message = error_message;
}

std::string
IneligibleProductTagErrorItem::getPinId()
{
	return pin_id;
}

void
IneligibleProductTagErrorItem::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}


