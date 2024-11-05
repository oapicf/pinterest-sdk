#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreativeAssetsProductGroupUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreativeAssetsProductGroupUpdateRequest::CatalogsCreativeAssetsProductGroupUpdateRequest()
{
	//__init();
}

CatalogsCreativeAssetsProductGroupUpdateRequest::~CatalogsCreativeAssetsProductGroupUpdateRequest()
{
	//__cleanup();
}

void
CatalogsCreativeAssetsProductGroupUpdateRequest::__init()
{
	//catalog_type = std::string();
	//name = std::string();
	//description = std::string();
	//filters = new CatalogsCreativeAssetsProductGroupFilters();
}

void
CatalogsCreativeAssetsProductGroupUpdateRequest::__cleanup()
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
	//
}

void
CatalogsCreativeAssetsProductGroupUpdateRequest::fromJson(char* jsonStr)
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
	

		if (isprimitive("CatalogsCreativeAssetsProductGroupFilters")) {
			jsonToValue(&filters, node, "CatalogsCreativeAssetsProductGroupFilters", "CatalogsCreativeAssetsProductGroupFilters");
		} else {
			
			CatalogsCreativeAssetsProductGroupFilters* obj = static_cast<CatalogsCreativeAssetsProductGroupFilters*> (&filters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsCreativeAssetsProductGroupUpdateRequest::CatalogsCreativeAssetsProductGroupUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreativeAssetsProductGroupUpdateRequest::toJson()
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
	if (isprimitive("CatalogsCreativeAssetsProductGroupFilters")) {
		CatalogsCreativeAssetsProductGroupFilters obj = getFilters();
		node = converttoJson(&obj, "CatalogsCreativeAssetsProductGroupFilters", "");
	}
	else {
		
		CatalogsCreativeAssetsProductGroupFilters obj = static_cast<CatalogsCreativeAssetsProductGroupFilters> (getFilters());
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
CatalogsCreativeAssetsProductGroupUpdateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsProductGroupUpdateRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsCreativeAssetsProductGroupUpdateRequest::getName()
{
	return name;
}

void
CatalogsCreativeAssetsProductGroupUpdateRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
CatalogsCreativeAssetsProductGroupUpdateRequest::getDescription()
{
	return description;
}

void
CatalogsCreativeAssetsProductGroupUpdateRequest::setDescription(std::string  description)
{
	this->description = description;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsCreativeAssetsProductGroupUpdateRequest::getFilters()
{
	return filters;
}

void
CatalogsCreativeAssetsProductGroupUpdateRequest::setFilters(CatalogsCreativeAssetsProductGroupFilters  filters)
{
	this->filters = filters;
}


