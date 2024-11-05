#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreativeAssetsProductMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreativeAssetsProductMetadata::CatalogsCreativeAssetsProductMetadata()
{
	//__init();
}

CatalogsCreativeAssetsProductMetadata::~CatalogsCreativeAssetsProductMetadata()
{
	//__cleanup();
}

void
CatalogsCreativeAssetsProductMetadata::__init()
{
	//creative_assets_id = std::string();
	//visibility = new CreativeAssetsVisibilityType();
}

void
CatalogsCreativeAssetsProductMetadata::__cleanup()
{
	//if(creative_assets_id != NULL) {
	//
	//delete creative_assets_id;
	//creative_assets_id = NULL;
	//}
	//if(visibility != NULL) {
	//
	//delete visibility;
	//visibility = NULL;
	//}
	//
}

void
CatalogsCreativeAssetsProductMetadata::fromJson(char* jsonStr)
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
	const gchar *visibilityKey = "visibility";
	node = json_object_get_member(pJsonObject, visibilityKey);
	if (node !=NULL) {
	

		if (isprimitive("CreativeAssetsVisibilityType")) {
			jsonToValue(&visibility, node, "CreativeAssetsVisibilityType", "CreativeAssetsVisibilityType");
		} else {
			
			CreativeAssetsVisibilityType* obj = static_cast<CreativeAssetsVisibilityType*> (&visibility);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsCreativeAssetsProductMetadata::CatalogsCreativeAssetsProductMetadata(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreativeAssetsProductMetadata::toJson()
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
	if (isprimitive("CreativeAssetsVisibilityType")) {
		CreativeAssetsVisibilityType obj = getVisibility();
		node = converttoJson(&obj, "CreativeAssetsVisibilityType", "");
	}
	else {
		
		CreativeAssetsVisibilityType obj = static_cast<CreativeAssetsVisibilityType> (getVisibility());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *visibilityKey = "visibility";
	json_object_set_member(pJsonObject, visibilityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsCreativeAssetsProductMetadata::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CatalogsCreativeAssetsProductMetadata::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

CreativeAssetsVisibilityType
CatalogsCreativeAssetsProductMetadata::getVisibility()
{
	return visibility;
}

void
CatalogsCreativeAssetsProductMetadata::setVisibility(CreativeAssetsVisibilityType  visibility)
{
	this->visibility = visibility;
}


