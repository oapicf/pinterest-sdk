#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdPreviewSourcePinId.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdPreviewSourcePinId::AdPreviewSourcePinId()
{
	//__init();
}

AdPreviewSourcePinId::~AdPreviewSourcePinId()
{
	//__cleanup();
}

void
AdPreviewSourcePinId::__init()
{
	//creative_type = null;
	//pin_id = std::string();
}

void
AdPreviewSourcePinId::__cleanup()
{
	//if(creative_type != NULL) {
	//
	//delete creative_type;
	//creative_type = NULL;
	//}
	//if(pin_id != NULL) {
	//
	//delete pin_id;
	//pin_id = NULL;
	//}
	//
}

void
AdPreviewSourcePinId::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *creative_typeKey = "creative_type";
	node = json_object_get_member(pJsonObject, creative_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AdPinPreviewCreativeType")) {
			jsonToValue(&creative_type, node, "AdPinPreviewCreativeType", "AdPinPreviewCreativeType");
		} else {
			
			AdPinPreviewCreativeType* obj = static_cast<AdPinPreviewCreativeType*> (&creative_type);
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

AdPreviewSourcePinId::AdPreviewSourcePinId(char* json)
{
	this->fromJson(json);
}

char*
AdPreviewSourcePinId::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AdPinPreviewCreativeType")) {
		AdPinPreviewCreativeType obj = getCreativeType();
		node = converttoJson(&obj, "AdPinPreviewCreativeType", "");
	}
	else {
		
		AdPinPreviewCreativeType obj = static_cast<AdPinPreviewCreativeType> (getCreativeType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *creative_typeKey = "creative_type";
	json_object_set_member(pJsonObject, creative_typeKey, node);
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

AdPinPreviewCreativeType
AdPreviewSourcePinId::getCreativeType()
{
	return creative_type;
}

void
AdPreviewSourcePinId::setCreativeType(AdPinPreviewCreativeType  creative_type)
{
	this->creative_type = creative_type;
}

std::string
AdPreviewSourcePinId::getPinId()
{
	return pin_id;
}

void
AdPreviewSourcePinId::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}


