#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsRetailItemResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsRetailItemResponse::CatalogsRetailItemResponse()
{
	//__init();
}

CatalogsRetailItemResponse::~CatalogsRetailItemResponse()
{
	//__cleanup();
}

void
CatalogsRetailItemResponse::__init()
{
	//catalog_type = new CatalogsType();
	//item_id = std::string();
	//new std::list()std::list> pins;
	//attributes = new ItemAttributes();
}

void
CatalogsRetailItemResponse::__cleanup()
{
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//if(pins != NULL) {
	//pins.RemoveAll(true);
	//delete pins;
	//pins = NULL;
	//}
	//if(attributes != NULL) {
	//
	//delete attributes;
	//attributes = NULL;
	//}
	//
}

void
CatalogsRetailItemResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *catalog_typeKey = "catalog_type";
	node = json_object_get_member(pJsonObject, catalog_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsType")) {
			jsonToValue(&catalog_type, node, "CatalogsType", "CatalogsType");
		} else {
			
			CatalogsType* obj = static_cast<CatalogsType*> (&catalog_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *item_idKey = "item_id";
	node = json_object_get_member(pJsonObject, item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pinsKey = "pins";
	node = json_object_get_member(pJsonObject, pinsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Pin> new_list;
			Pin inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Pin")) {
					jsonToValue(&inst, temp_json, "Pin", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pins = new_list;
		}
		
	}
	const gchar *attributesKey = "attributes";
	node = json_object_get_member(pJsonObject, attributesKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemAttributes")) {
			jsonToValue(&attributes, node, "ItemAttributes", "ItemAttributes");
		} else {
			
			ItemAttributes* obj = static_cast<ItemAttributes*> (&attributes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsRetailItemResponse::CatalogsRetailItemResponse(char* json)
{
	this->fromJson(json);
}

char*
CatalogsRetailItemResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsType")) {
		CatalogsType obj = getCatalogType();
		node = converttoJson(&obj, "CatalogsType", "");
	}
	else {
		
		CatalogsType obj = static_cast<CatalogsType> (getCatalogType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *catalog_typeKey = "catalog_type";
	json_object_set_member(pJsonObject, catalog_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
	if (isprimitive("Pin")) {
		list<Pin> new_list = static_cast<list <Pin> > (getPins());
		node = converttoJson(&new_list, "Pin", "array");
	} else {
		node = json_node_alloc();
		list<Pin> new_list = static_cast<list <Pin> > (getPins());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Pin>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Pin obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pinsKey = "pins";
	json_object_set_member(pJsonObject, pinsKey, node);
	if (isprimitive("ItemAttributes")) {
		ItemAttributes obj = getAttributes();
		node = converttoJson(&obj, "ItemAttributes", "");
	}
	else {
		
		ItemAttributes obj = static_cast<ItemAttributes> (getAttributes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attributesKey = "attributes";
	json_object_set_member(pJsonObject, attributesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsType
CatalogsRetailItemResponse::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailItemResponse::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsRetailItemResponse::getItemId()
{
	return item_id;
}

void
CatalogsRetailItemResponse::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::list<Pin>
CatalogsRetailItemResponse::getPins()
{
	return pins;
}

void
CatalogsRetailItemResponse::setPins(std::list <Pin> pins)
{
	this->pins = pins;
}

ItemAttributes
CatalogsRetailItemResponse::getAttributes()
{
	return attributes;
}

void
CatalogsRetailItemResponse::setAttributes(ItemAttributes  attributes)
{
	this->attributes = attributes;
}


