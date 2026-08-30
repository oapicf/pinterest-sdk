#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LabelCreateItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LabelCreateItem::LabelCreateItem()
{
	//__init();
}

LabelCreateItem::~LabelCreateItem()
{
	//__cleanup();
}

void
LabelCreateItem::__init()
{
	//label_type = new LabelType();
	//value = std::string();
}

void
LabelCreateItem::__cleanup()
{
	//if(label_type != NULL) {
	//
	//delete label_type;
	//label_type = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
LabelCreateItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *label_typeKey = "label_type";
	node = json_object_get_member(pJsonObject, label_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("LabelType")) {
			jsonToValue(&label_type, node, "LabelType", "LabelType");
		} else {
			
			LabelType* obj = static_cast<LabelType*> (&label_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
}

LabelCreateItem::LabelCreateItem(char* json)
{
	this->fromJson(json);
}

char*
LabelCreateItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("LabelType")) {
		LabelType obj = getLabelType();
		node = converttoJson(&obj, "LabelType", "");
	}
	else {
		
		LabelType obj = static_cast<LabelType> (getLabelType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *label_typeKey = "label_type";
	json_object_set_member(pJsonObject, label_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

LabelType
LabelCreateItem::getLabelType()
{
	return label_type;
}

void
LabelCreateItem::setLabelType(LabelType  label_type)
{
	this->label_type = label_type;
}

std::string
LabelCreateItem::getValue()
{
	return value;
}

void
LabelCreateItem::setValue(std::string  value)
{
	this->value = value;
}


