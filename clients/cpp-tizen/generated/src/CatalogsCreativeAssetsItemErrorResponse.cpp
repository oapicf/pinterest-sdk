#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreativeAssetsItemErrorResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreativeAssetsItemErrorResponse::CatalogsCreativeAssetsItemErrorResponse()
{
	//__init();
}

CatalogsCreativeAssetsItemErrorResponse::~CatalogsCreativeAssetsItemErrorResponse()
{
	//__cleanup();
}

void
CatalogsCreativeAssetsItemErrorResponse::__init()
{
	//catalog_type = new CatalogsType();
	//creative_assets_id = std::string();
	//new std::list()std::list> errors;
}

void
CatalogsCreativeAssetsItemErrorResponse::__cleanup()
{
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(creative_assets_id != NULL) {
	//
	//delete creative_assets_id;
	//creative_assets_id = NULL;
	//}
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//
}

void
CatalogsCreativeAssetsItemErrorResponse::fromJson(char* jsonStr)
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
	const gchar *creative_assets_idKey = "creative_assets_id";
	node = json_object_get_member(pJsonObject, creative_assets_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&creative_assets_id, node, "std::string", "");
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

CatalogsCreativeAssetsItemErrorResponse::CatalogsCreativeAssetsItemErrorResponse(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreativeAssetsItemErrorResponse::toJson()
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
		std::string obj = getCreativeAssetsId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *creative_assets_idKey = "creative_assets_id";
	json_object_set_member(pJsonObject, creative_assets_idKey, node);
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
CatalogsCreativeAssetsItemErrorResponse::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsItemErrorResponse::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsCreativeAssetsItemErrorResponse::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CatalogsCreativeAssetsItemErrorResponse::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::list<ItemValidationEvent>
CatalogsCreativeAssetsItemErrorResponse::getErrors()
{
	return errors;
}

void
CatalogsCreativeAssetsItemErrorResponse::setErrors(std::list <ItemValidationEvent> errors)
{
	this->errors = errors;
}


