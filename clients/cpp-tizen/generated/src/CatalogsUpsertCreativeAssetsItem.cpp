#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsUpsertCreativeAssetsItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsUpsertCreativeAssetsItem::CatalogsUpsertCreativeAssetsItem()
{
	//__init();
}

CatalogsUpsertCreativeAssetsItem::~CatalogsUpsertCreativeAssetsItem()
{
	//__cleanup();
}

void
CatalogsUpsertCreativeAssetsItem::__init()
{
	//creative_assets_id = std::string();
	//operation = std::string();
	//attributes = new CatalogsCreativeAssetsAttributes();
}

void
CatalogsUpsertCreativeAssetsItem::__cleanup()
{
	//if(creative_assets_id != NULL) {
	//
	//delete creative_assets_id;
	//creative_assets_id = NULL;
	//}
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//if(attributes != NULL) {
	//
	//delete attributes;
	//attributes = NULL;
	//}
	//
}

void
CatalogsUpsertCreativeAssetsItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *creative_assets_idKey = "creative_assets_id";
	node = json_object_get_member(pJsonObject, creative_assets_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&creative_assets_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&operation, node, "std::string", "");
		} else {
			
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

CatalogsUpsertCreativeAssetsItem::CatalogsUpsertCreativeAssetsItem(char* json)
{
	this->fromJson(json);
}

char*
CatalogsUpsertCreativeAssetsItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCreativeAssetsId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *creative_assets_idKey = "creative_assets_id";
	json_object_set_member(pJsonObject, creative_assets_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOperation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
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

std::string
CatalogsUpsertCreativeAssetsItem::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CatalogsUpsertCreativeAssetsItem::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::string
CatalogsUpsertCreativeAssetsItem::getOperation()
{
	return operation;
}

void
CatalogsUpsertCreativeAssetsItem::setOperation(std::string  operation)
{
	this->operation = operation;
}

CatalogsCreativeAssetsAttributes
CatalogsUpsertCreativeAssetsItem::getAttributes()
{
	return attributes;
}

void
CatalogsUpsertCreativeAssetsItem::setAttributes(CatalogsCreativeAssetsAttributes  attributes)
{
	this->attributes = attributes;
}


