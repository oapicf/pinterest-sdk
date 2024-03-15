#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupUpdateRequest::CatalogsProductGroupUpdateRequest()
{
	//__init();
}

CatalogsProductGroupUpdateRequest::~CatalogsProductGroupUpdateRequest()
{
	//__cleanup();
}

void
CatalogsProductGroupUpdateRequest::__init()
{
	//name = std::string();
	//description = std::string();
	//is_featured = bool(false);
	//filters = new CatalogsProductGroupFiltersRequest();
}

void
CatalogsProductGroupUpdateRequest::__cleanup()
{
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
	//if(is_featured != NULL) {
	//
	//delete is_featured;
	//is_featured = NULL;
	//}
	//if(filters != NULL) {
	//
	//delete filters;
	//filters = NULL;
	//}
	//
}

void
CatalogsProductGroupUpdateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *is_featuredKey = "is_featured";
	node = json_object_get_member(pJsonObject, is_featuredKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_featured, node, "bool", "");
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
}

CatalogsProductGroupUpdateRequest::CatalogsProductGroupUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupUpdateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("bool")) {
		bool obj = getIsFeatured();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_featuredKey = "is_featured";
	json_object_set_member(pJsonObject, is_featuredKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsProductGroupUpdateRequest::getName()
{
	return name;
}

void
CatalogsProductGroupUpdateRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
CatalogsProductGroupUpdateRequest::getDescription()
{
	return description;
}

void
CatalogsProductGroupUpdateRequest::setDescription(std::string  description)
{
	this->description = description;
}

bool
CatalogsProductGroupUpdateRequest::getIsFeatured()
{
	return is_featured;
}

void
CatalogsProductGroupUpdateRequest::setIsFeatured(bool  is_featured)
{
	this->is_featured = is_featured;
}

CatalogsProductGroupFiltersRequest
CatalogsProductGroupUpdateRequest::getFilters()
{
	return filters;
}

void
CatalogsProductGroupUpdateRequest::setFilters(CatalogsProductGroupFiltersRequest  filters)
{
	this->filters = filters;
}


