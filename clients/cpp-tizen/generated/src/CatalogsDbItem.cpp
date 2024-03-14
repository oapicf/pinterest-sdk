#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsDbItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsDbItem::CatalogsDbItem()
{
	//__init();
}

CatalogsDbItem::~CatalogsDbItem()
{
	//__cleanup();
}

void
CatalogsDbItem::__init()
{
	//created_at = null;
	//id = std::string();
	//updated_at = null;
}

void
CatalogsDbItem::__cleanup()
{
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(updated_at != NULL) {
	//
	//delete updated_at;
	//updated_at = NULL;
	//}
	//
}

void
CatalogsDbItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_at, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *updated_atKey = "updated_at";
	node = json_object_get_member(pJsonObject, updated_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updated_at, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsDbItem::CatalogsDbItem(char* json)
{
	this->fromJson(json);
}

char*
CatalogsDbItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updated_atKey = "updated_at";
	json_object_set_member(pJsonObject, updated_atKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsDbItem::getCreatedAt()
{
	return created_at;
}

void
CatalogsDbItem::setCreatedAt(std::string  created_at)
{
	this->created_at = created_at;
}

std::string
CatalogsDbItem::getId()
{
	return id;
}

void
CatalogsDbItem::setId(std::string  id)
{
	this->id = id;
}

std::string
CatalogsDbItem::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsDbItem::setUpdatedAt(std::string  updated_at)
{
	this->updated_at = updated_at;
}


