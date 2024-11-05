#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemResponse_anyOf_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemResponse_anyOf_1::ItemResponse_anyOf_1()
{
	//__init();
}

ItemResponse_anyOf_1::~ItemResponse_anyOf_1()
{
	//__cleanup();
}

void
ItemResponse_anyOf_1::__init()
{
	//catalog_type = new CatalogsType();
	//item_id = std::string();
	//new std::list()std::list> errors;
	//hotel_id = std::string();
	//creative_assets_id = std::string();
}

void
ItemResponse_anyOf_1::__cleanup()
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
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//if(hotel_id != NULL) {
	//
	//delete hotel_id;
	//hotel_id = NULL;
	//}
	//if(creative_assets_id != NULL) {
	//
	//delete creative_assets_id;
	//creative_assets_id = NULL;
	//}
	//
}

void
ItemResponse_anyOf_1::fromJson(char* jsonStr)
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
	const gchar *hotel_idKey = "hotel_id";
	node = json_object_get_member(pJsonObject, hotel_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hotel_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *creative_assets_idKey = "creative_assets_id";
	node = json_object_get_member(pJsonObject, creative_assets_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&creative_assets_id, node, "std::string", "");
		} else {
			
		}
	}
}

ItemResponse_anyOf_1::ItemResponse_anyOf_1(char* json)
{
	this->fromJson(json);
}

char*
ItemResponse_anyOf_1::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getHotelId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hotel_idKey = "hotel_id";
	json_object_set_member(pJsonObject, hotel_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreativeAssetsId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *creative_assets_idKey = "creative_assets_id";
	json_object_set_member(pJsonObject, creative_assets_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsType
ItemResponse_anyOf_1::getCatalogType()
{
	return catalog_type;
}

void
ItemResponse_anyOf_1::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
ItemResponse_anyOf_1::getItemId()
{
	return item_id;
}

void
ItemResponse_anyOf_1::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::list<ItemValidationEvent>
ItemResponse_anyOf_1::getErrors()
{
	return errors;
}

void
ItemResponse_anyOf_1::setErrors(std::list <ItemValidationEvent> errors)
{
	this->errors = errors;
}

std::string
ItemResponse_anyOf_1::getHotelId()
{
	return hotel_id;
}

void
ItemResponse_anyOf_1::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}

std::string
ItemResponse_anyOf_1::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
ItemResponse_anyOf_1::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}


