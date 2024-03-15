#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemResponse::ItemResponse()
{
	//__init();
}

ItemResponse::~ItemResponse()
{
	//__cleanup();
}

void
ItemResponse::__init()
{
	//catalog_type = new CatalogsType();
	//item_id = std::string();
	//new std::list()std::list> pins;
	//attributes = new CatalogsHotelAttributes();
	//hotel_id = std::string();
	//new std::list()std::list> errors;
}

void
ItemResponse::__cleanup()
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
	//if(hotel_id != NULL) {
	//
	//delete hotel_id;
	//hotel_id = NULL;
	//}
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//
}

void
ItemResponse::fromJson(char* jsonStr)
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
	

		if (isprimitive("CatalogsHotelAttributes")) {
			jsonToValue(&attributes, node, "CatalogsHotelAttributes", "CatalogsHotelAttributes");
		} else {
			
			CatalogsHotelAttributes* obj = static_cast<CatalogsHotelAttributes*> (&attributes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hotel_idKey = "hotel_id";
	node = json_object_get_member(pJsonObject, hotel_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hotel_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemValidationEvent> new_list;
			ItemValidationEvent inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemValidationEvent")) {
					jsonToValue(&inst, temp_json, "ItemValidationEvent", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
		}
		
	}
}

ItemResponse::ItemResponse(char* json)
{
	this->fromJson(json);
}

char*
ItemResponse::toJson()
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
	if (isprimitive("CatalogsHotelAttributes")) {
		CatalogsHotelAttributes obj = getAttributes();
		node = converttoJson(&obj, "CatalogsHotelAttributes", "");
	}
	else {
		
		CatalogsHotelAttributes obj = static_cast<CatalogsHotelAttributes> (getAttributes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attributesKey = "attributes";
	json_object_set_member(pJsonObject, attributesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHotelId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hotel_idKey = "hotel_id";
	json_object_set_member(pJsonObject, hotel_idKey, node);
	if (isprimitive("ItemValidationEvent")) {
		list<ItemValidationEvent> new_list = static_cast<list <ItemValidationEvent> > (getErrors());
		node = converttoJson(&new_list, "ItemValidationEvent", "array");
	} else {
		node = json_node_alloc();
		list<ItemValidationEvent> new_list = static_cast<list <ItemValidationEvent> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemValidationEvent>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemValidationEvent obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsType
ItemResponse::getCatalogType()
{
	return catalog_type;
}

void
ItemResponse::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
ItemResponse::getItemId()
{
	return item_id;
}

void
ItemResponse::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::list<Pin>
ItemResponse::getPins()
{
	return pins;
}

void
ItemResponse::setPins(std::list <Pin> pins)
{
	this->pins = pins;
}

CatalogsHotelAttributes
ItemResponse::getAttributes()
{
	return attributes;
}

void
ItemResponse::setAttributes(CatalogsHotelAttributes  attributes)
{
	this->attributes = attributes;
}

std::string
ItemResponse::getHotelId()
{
	return hotel_id;
}

void
ItemResponse::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}

std::list<ItemValidationEvent>
ItemResponse::getErrors()
{
	return errors;
}

void
ItemResponse::setErrors(std::list <ItemValidationEvent> errors)
{
	this->errors = errors;
}


