#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::CatalogsProductGroupUpdateManyRequestItemsOneOfItems0()
{
	//__init();
}

CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::~CatalogsProductGroupUpdateManyRequestItemsOneOfItems0()
{
	//__cleanup();
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::__init()
{
	//description = std::string();
	//filters = new CatalogsProductGroupFiltersRequest();
	//is_featured = bool(false);
	//name = std::string();
	//id = std::string();
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::__cleanup()
{
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
	//if(is_featured != NULL) {
	//
	//delete is_featured;
	//is_featured = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	

		if (isprimitive("CatalogsProductGroupFiltersRequest")) {
			jsonToValue(&filters, node, "CatalogsProductGroupFiltersRequest", "CatalogsProductGroupFiltersRequest");
		} else {
			
			CatalogsProductGroupFiltersRequest* obj = static_cast<CatalogsProductGroupFiltersRequest*> (&filters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_featuredKey = "is_featured";
	node = json_object_get_member(pJsonObject, is_featuredKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_featured, node, "bool", "");
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::CatalogsProductGroupUpdateManyRequestItemsOneOfItems0(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("CatalogsProductGroupFiltersRequest")) {
		CatalogsProductGroupFiltersRequest obj = getFilters();
		node = converttoJson(&obj, "CatalogsProductGroupFiltersRequest", "");
	}
	else {
		
		CatalogsProductGroupFiltersRequest obj = static_cast<CatalogsProductGroupFiltersRequest> (getFilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtersKey = "filters";
	json_object_set_member(pJsonObject, filtersKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsFeatured();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_featuredKey = "is_featured";
	json_object_set_member(pJsonObject, is_featuredKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::getDescription()
{
	return description;
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::setDescription(std::string  description)
{
	this->description = description;
}

CatalogsProductGroupFiltersRequest
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::getFilters()
{
	return filters;
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::setFilters(CatalogsProductGroupFiltersRequest  filters)
{
	this->filters = filters;
}

bool
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::getIsFeatured()
{
	return is_featured;
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::setIsFeatured(bool  is_featured)
{
	this->is_featured = is_featured;
}

std::string
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::getName()
{
	return name;
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::setName(std::string  name)
{
	this->name = name;
}

std::string
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::getId()
{
	return id;
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::setId(std::string  id)
{
	this->id = id;
}


