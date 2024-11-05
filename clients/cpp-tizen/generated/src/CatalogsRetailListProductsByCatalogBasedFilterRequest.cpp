#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsRetailListProductsByCatalogBasedFilterRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsRetailListProductsByCatalogBasedFilterRequest::CatalogsRetailListProductsByCatalogBasedFilterRequest()
{
	//__init();
}

CatalogsRetailListProductsByCatalogBasedFilterRequest::~CatalogsRetailListProductsByCatalogBasedFilterRequest()
{
	//__cleanup();
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::__init()
{
	//catalog_type = std::string();
	//catalog_id = std::string();
	//filters = new CatalogsProductGroupFilters();
	//country = new Country();
	//locale = new CatalogsLocale();
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::__cleanup()
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
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(locale != NULL) {
	//
	//delete locale;
	//locale = NULL;
	//}
	//
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::fromJson(char* jsonStr)
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
	

		if (isprimitive("CatalogsProductGroupFilters")) {
			jsonToValue(&filters, node, "CatalogsProductGroupFilters", "CatalogsProductGroupFilters");
		} else {
			
			CatalogsProductGroupFilters* obj = static_cast<CatalogsProductGroupFilters*> (&filters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *countryKey = "country";
	node = json_object_get_member(pJsonObject, countryKey);
	if (node !=NULL) {
	

		if (isprimitive("Country")) {
			jsonToValue(&country, node, "Country", "Country");
		} else {
			
			Country* obj = static_cast<Country*> (&country);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *localeKey = "locale";
	node = json_object_get_member(pJsonObject, localeKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsLocale")) {
			jsonToValue(&locale, node, "CatalogsLocale", "CatalogsLocale");
		} else {
			
			CatalogsLocale* obj = static_cast<CatalogsLocale*> (&locale);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsRetailListProductsByCatalogBasedFilterRequest::CatalogsRetailListProductsByCatalogBasedFilterRequest(char* json)
{
	this->fromJson(json);
}

char*
CatalogsRetailListProductsByCatalogBasedFilterRequest::toJson()
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
	if (isprimitive("CatalogsProductGroupFilters")) {
		CatalogsProductGroupFilters obj = getFilters();
		node = converttoJson(&obj, "CatalogsProductGroupFilters", "");
	}
	else {
		
		CatalogsProductGroupFilters obj = static_cast<CatalogsProductGroupFilters> (getFilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtersKey = "filters";
	json_object_set_member(pJsonObject, filtersKey, node);
	if (isprimitive("Country")) {
		Country obj = getCountry();
		node = converttoJson(&obj, "Country", "");
	}
	else {
		
		Country obj = static_cast<Country> (getCountry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *countryKey = "country";
	json_object_set_member(pJsonObject, countryKey, node);
	if (isprimitive("CatalogsLocale")) {
		CatalogsLocale obj = getLocale();
		node = converttoJson(&obj, "CatalogsLocale", "");
	}
	else {
		
		CatalogsLocale obj = static_cast<CatalogsLocale> (getLocale());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *localeKey = "locale";
	json_object_set_member(pJsonObject, localeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsRetailListProductsByCatalogBasedFilterRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsRetailListProductsByCatalogBasedFilterRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

CatalogsProductGroupFilters
CatalogsRetailListProductsByCatalogBasedFilterRequest::getFilters()
{
	return filters;
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::setFilters(CatalogsProductGroupFilters  filters)
{
	this->filters = filters;
}

Country
CatalogsRetailListProductsByCatalogBasedFilterRequest::getCountry()
{
	return country;
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::setCountry(Country  country)
{
	this->country = country;
}

CatalogsLocale
CatalogsRetailListProductsByCatalogBasedFilterRequest::getLocale()
{
	return locale;
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::setLocale(CatalogsLocale  locale)
{
	this->locale = locale;
}


