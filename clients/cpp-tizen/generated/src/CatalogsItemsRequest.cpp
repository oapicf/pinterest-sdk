#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsItemsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsItemsRequest::CatalogsItemsRequest()
{
	//__init();
}

CatalogsItemsRequest::~CatalogsItemsRequest()
{
	//__cleanup();
}

void
CatalogsItemsRequest::__init()
{
	//country = new Country();
	//language = new CatalogsItemsRequest_language();
	//filters = new CatalogsItemsPostFilters();
}

void
CatalogsItemsRequest::__cleanup()
{
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//if(filters != NULL) {
	//
	//delete filters;
	//filters = NULL;
	//}
	//
}

void
CatalogsItemsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *languageKey = "language";
	node = json_object_get_member(pJsonObject, languageKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemsRequest_language")) {
			jsonToValue(&language, node, "CatalogsItemsRequest_language", "CatalogsItemsRequest_language");
		} else {
			
			CatalogsItemsRequest_language* obj = static_cast<CatalogsItemsRequest_language*> (&language);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filtersKey = "filters";
	node = json_object_get_member(pJsonObject, filtersKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemsPostFilters")) {
			jsonToValue(&filters, node, "CatalogsItemsPostFilters", "CatalogsItemsPostFilters");
		} else {
			
			CatalogsItemsPostFilters* obj = static_cast<CatalogsItemsPostFilters*> (&filters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsItemsRequest::CatalogsItemsRequest(char* json)
{
	this->fromJson(json);
}

char*
CatalogsItemsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("CatalogsItemsRequest_language")) {
		CatalogsItemsRequest_language obj = getLanguage();
		node = converttoJson(&obj, "CatalogsItemsRequest_language", "");
	}
	else {
		
		CatalogsItemsRequest_language obj = static_cast<CatalogsItemsRequest_language> (getLanguage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *languageKey = "language";
	json_object_set_member(pJsonObject, languageKey, node);
	if (isprimitive("CatalogsItemsPostFilters")) {
		CatalogsItemsPostFilters obj = getFilters();
		node = converttoJson(&obj, "CatalogsItemsPostFilters", "");
	}
	else {
		
		CatalogsItemsPostFilters obj = static_cast<CatalogsItemsPostFilters> (getFilters());
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

Country
CatalogsItemsRequest::getCountry()
{
	return country;
}

void
CatalogsItemsRequest::setCountry(Country  country)
{
	this->country = country;
}

CatalogsItemsRequest_language
CatalogsItemsRequest::getLanguage()
{
	return language;
}

void
CatalogsItemsRequest::setLanguage(CatalogsItemsRequest_language  language)
{
	this->language = language;
}

CatalogsItemsPostFilters
CatalogsItemsRequest::getFilters()
{
	return filters;
}

void
CatalogsItemsRequest::setFilters(CatalogsItemsPostFilters  filters)
{
	this->filters = filters;
}


