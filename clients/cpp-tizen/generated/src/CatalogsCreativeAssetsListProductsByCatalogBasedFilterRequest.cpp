#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest()
{
	//__init();
}

CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::~CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest()
{
	//__cleanup();
}

void
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::__init()
{
	//catalog_type = std::string();
	//catalog_id = std::string();
	//filters = new CatalogsCreativeAssetsProductGroupFilters();
}

void
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::__cleanup()
{
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//if(filters != NULL) {
	//
	//delete filters;
	//filters = NULL;
	//}
	//
}

void
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::fromJson(char* jsonStr)
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
	const gchar *catalog_idKey = "catalog_id";
	node = json_object_get_member(pJsonObject, catalog_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_id, node, "std::string", "");
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

CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::toJson()
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
		std::string obj = getCatalogId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_idKey = "catalog_id";
	json_object_set_member(pJsonObject, catalog_idKey, node);
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
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::getFilters()
{
	return filters;
}

void
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::setFilters(CatalogsCreativeAssetsProductGroupFilters  filters)
{
	this->filters = filters;
}


