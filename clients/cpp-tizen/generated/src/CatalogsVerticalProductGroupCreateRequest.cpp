#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsVerticalProductGroupCreateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsVerticalProductGroupCreateRequest::CatalogsVerticalProductGroupCreateRequest()
{
	//__init();
}

CatalogsVerticalProductGroupCreateRequest::~CatalogsVerticalProductGroupCreateRequest()
{
	//__cleanup();
}

void
CatalogsVerticalProductGroupCreateRequest::__init()
{
	//catalog_type = std::string();
	//name = std::string();
	//description = std::string();
	//filters = new CatalogsHotelProductGroupFilters();
	//catalog_id = std::string();
}

void
CatalogsVerticalProductGroupCreateRequest::__cleanup()
{
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
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
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//
}

void
CatalogsVerticalProductGroupCreateRequest::fromJson(char* jsonStr)
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
	const gchar *catalog_idKey = "catalog_id";
	node = json_object_get_member(pJsonObject, catalog_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_id, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsVerticalProductGroupCreateRequest::CatalogsVerticalProductGroupCreateRequest(char* json)
{
	this->fromJson(json);
}

char*
CatalogsVerticalProductGroupCreateRequest::toJson()
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
CatalogsVerticalProductGroupCreateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsVerticalProductGroupCreateRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsVerticalProductGroupCreateRequest::getName()
{
	return name;
}

void
CatalogsVerticalProductGroupCreateRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
CatalogsVerticalProductGroupCreateRequest::getDescription()
{
	return description;
}

void
CatalogsVerticalProductGroupCreateRequest::setDescription(std::string  description)
{
	this->description = description;
}

CatalogsHotelProductGroupFilters
CatalogsVerticalProductGroupCreateRequest::getFilters()
{
	return filters;
}

void
CatalogsVerticalProductGroupCreateRequest::setFilters(CatalogsHotelProductGroupFilters  filters)
{
	this->filters = filters;
}

std::string
CatalogsVerticalProductGroupCreateRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsVerticalProductGroupCreateRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}


