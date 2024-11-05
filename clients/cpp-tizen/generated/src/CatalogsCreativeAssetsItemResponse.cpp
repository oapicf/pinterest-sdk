#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreativeAssetsItemResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreativeAssetsItemResponse::CatalogsCreativeAssetsItemResponse()
{
	//__init();
}

CatalogsCreativeAssetsItemResponse::~CatalogsCreativeAssetsItemResponse()
{
	//__cleanup();
}

void
CatalogsCreativeAssetsItemResponse::__init()
{
	//catalog_type = new CatalogsType();
	//creative_assets_id = std::string();
	//new std::list()std::list> pins;
	//attributes = new CatalogsCreativeAssetsAttributes();
}

void
CatalogsCreativeAssetsItemResponse::__cleanup()
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
CatalogsCreativeAssetsItemResponse::fromJson(char* jsonStr)
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
	

		if (isprimitive("CatalogsCreativeAssetsAttributes")) {
			jsonToValue(&attributes, node, "CatalogsCreativeAssetsAttributes", "CatalogsCreativeAssetsAttributes");
		} else {
			
			CatalogsCreativeAssetsAttributes* obj = static_cast<CatalogsCreativeAssetsAttributes*> (&attributes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsCreativeAssetsItemResponse::CatalogsCreativeAssetsItemResponse(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreativeAssetsItemResponse::toJson()
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
	if (isprimitive("CatalogsCreativeAssetsAttributes")) {
		CatalogsCreativeAssetsAttributes obj = getAttributes();
		node = converttoJson(&obj, "CatalogsCreativeAssetsAttributes", "");
	}
	else {
		
		CatalogsCreativeAssetsAttributes obj = static_cast<CatalogsCreativeAssetsAttributes> (getAttributes());
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
CatalogsCreativeAssetsItemResponse::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsItemResponse::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsCreativeAssetsItemResponse::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CatalogsCreativeAssetsItemResponse::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::list<Pin>
CatalogsCreativeAssetsItemResponse::getPins()
{
	return pins;
}

void
CatalogsCreativeAssetsItemResponse::setPins(std::list <Pin> pins)
{
	this->pins = pins;
}

CatalogsCreativeAssetsAttributes
CatalogsCreativeAssetsItemResponse::getAttributes()
{
	return attributes;
}

void
CatalogsCreativeAssetsItemResponse::setAttributes(CatalogsCreativeAssetsAttributes  attributes)
{
	this->attributes = attributes;
}


