#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelProductGroup.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelProductGroup::CatalogsHotelProductGroup()
{
	//__init();
}

CatalogsHotelProductGroup::~CatalogsHotelProductGroup()
{
	//__cleanup();
}

void
CatalogsHotelProductGroup::__init()
{
	//catalog_type = std::string();
	//id = std::string();
	//name = std::string();
	//description = std::string();
	//filters = new CatalogsHotelProductGroupFilters();
	//created_at = int(0);
	//updated_at = int(0);
	//catalog_id = std::string();
}

void
CatalogsHotelProductGroup::__cleanup()
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
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(filters != NULL) {
	//
	//delete filters;
	//filters = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(updated_at != NULL) {
	//
	//delete updated_at;
	//updated_at = NULL;
	//}
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//
}

void
CatalogsHotelProductGroup::fromJson(char* jsonStr)
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
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *filtersKey = "filters";
	node = json_object_get_member(pJsonObject, filtersKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsHotelProductGroupFilters")) {
			jsonToValue(&filters, node, "CatalogsHotelProductGroupFilters", "CatalogsHotelProductGroupFilters");
		} else {
			
			CatalogsHotelProductGroupFilters* obj = static_cast<CatalogsHotelProductGroupFilters*> (&filters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *updated_atKey = "updated_at";
	node = json_object_get_member(pJsonObject, updated_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *catalog_idKey = "catalog_id";
	node = json_object_get_member(pJsonObject, catalog_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_id, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsHotelProductGroup::CatalogsHotelProductGroup(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelProductGroup::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("CatalogsHotelProductGroupFilters")) {
		CatalogsHotelProductGroupFilters obj = getFilters();
		node = converttoJson(&obj, "CatalogsHotelProductGroupFilters", "");
	}
	else {
		
		CatalogsHotelProductGroupFilters obj = static_cast<CatalogsHotelProductGroupFilters> (getFilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtersKey = "filters";
	json_object_set_member(pJsonObject, filtersKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_atKey = "updated_at";
	json_object_set_member(pJsonObject, updated_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_idKey = "catalog_id";
	json_object_set_member(pJsonObject, catalog_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsHotelProductGroup::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelProductGroup::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsHotelProductGroup::getId()
{
	return id;
}

void
CatalogsHotelProductGroup::setId(std::string  id)
{
	this->id = id;
}

std::string
CatalogsHotelProductGroup::getName()
{
	return name;
}

void
CatalogsHotelProductGroup::setName(std::string  name)
{
	this->name = name;
}

std::string
CatalogsHotelProductGroup::getDescription()
{
	return description;
}

void
CatalogsHotelProductGroup::setDescription(std::string  description)
{
	this->description = description;
}

CatalogsHotelProductGroupFilters
CatalogsHotelProductGroup::getFilters()
{
	return filters;
}

void
CatalogsHotelProductGroup::setFilters(CatalogsHotelProductGroupFilters  filters)
{
	this->filters = filters;
}

int
CatalogsHotelProductGroup::getCreatedAt()
{
	return created_at;
}

void
CatalogsHotelProductGroup::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

int
CatalogsHotelProductGroup::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsHotelProductGroup::setUpdatedAt(int  updated_at)
{
	this->updated_at = updated_at;
}

std::string
CatalogsHotelProductGroup::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelProductGroup::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}


