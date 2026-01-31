#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetBusinessAssetsResponse_catalog_info.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetBusinessAssetsResponse_catalog_info::GetBusinessAssetsResponse_catalog_info()
{
	//__init();
}

GetBusinessAssetsResponse_catalog_info::~GetBusinessAssetsResponse_catalog_info()
{
	//__cleanup();
}

void
GetBusinessAssetsResponse_catalog_info::__init()
{
	//catalog_type = std::string();
	//id = std::string();
	//name = std::string();
}

void
GetBusinessAssetsResponse_catalog_info::__cleanup()
{
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
GetBusinessAssetsResponse_catalog_info::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *catalog_typeKey = "catalog_type";
	node = json_object_get_member(pJsonObject, catalog_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_type, node, "std::string", "");
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

GetBusinessAssetsResponse_catalog_info::GetBusinessAssetsResponse_catalog_info(char* json)
{
	this->fromJson(json);
}

char*
GetBusinessAssetsResponse_catalog_info::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCatalogType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_typeKey = "catalog_type";
	json_object_set_member(pJsonObject, catalog_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GetBusinessAssetsResponse_catalog_info::getCatalogType()
{
	return catalog_type;
}

void
GetBusinessAssetsResponse_catalog_info::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
GetBusinessAssetsResponse_catalog_info::getId()
{
	return id;
}

void
GetBusinessAssetsResponse_catalog_info::setId(std::string  id)
{
	this->id = id;
}

std::string
GetBusinessAssetsResponse_catalog_info::getName()
{
	return name;
}

void
GetBusinessAssetsResponse_catalog_info::setName(std::string  name)
{
	this->name = name;
}


