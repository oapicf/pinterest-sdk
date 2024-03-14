#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Product_groups_create_request_feed_base_case.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Product_groups_create_request_feed_base_case::Product_groups_create_request_feed_base_case()
{
	//__init();
}

Product_groups_create_request_feed_base_case::~Product_groups_create_request_feed_base_case()
{
	//__cleanup();
}

void
Product_groups_create_request_feed_base_case::__init()
{
	//name = std::string();
	//description = std::string();
	//is_featured = bool(false);
	//filters = new CatalogsProductGroupFiltersAllOfRequest();
	//feed_id = std::string();
}

void
Product_groups_create_request_feed_base_case::__cleanup()
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
	//if(feed_id != NULL) {
	//
	//delete feed_id;
	//feed_id = NULL;
	//}
	//
}

void
Product_groups_create_request_feed_base_case::fromJson(char* jsonStr)
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
	

		if (isprimitive("CatalogsProductGroupFiltersAllOfRequest")) {
			jsonToValue(&filters, node, "CatalogsProductGroupFiltersAllOfRequest", "CatalogsProductGroupFiltersAllOfRequest");
		} else {
			
			CatalogsProductGroupFiltersAllOfRequest* obj = static_cast<CatalogsProductGroupFiltersAllOfRequest*> (&filters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *feed_idKey = "feed_id";
	node = json_object_get_member(pJsonObject, feed_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&feed_id, node, "std::string", "");
		} else {
			
		}
	}
}

Product_groups_create_request_feed_base_case::Product_groups_create_request_feed_base_case(char* json)
{
	this->fromJson(json);
}

char*
Product_groups_create_request_feed_base_case::toJson()
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
	if (isprimitive("CatalogsProductGroupFiltersAllOfRequest")) {
		CatalogsProductGroupFiltersAllOfRequest obj = getFilters();
		node = converttoJson(&obj, "CatalogsProductGroupFiltersAllOfRequest", "");
	}
	else {
		
		CatalogsProductGroupFiltersAllOfRequest obj = static_cast<CatalogsProductGroupFiltersAllOfRequest> (getFilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtersKey = "filters";
	json_object_set_member(pJsonObject, filtersKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFeedId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_idKey = "feed_id";
	json_object_set_member(pJsonObject, feed_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Product_groups_create_request_feed_base_case::getName()
{
	return name;
}

void
Product_groups_create_request_feed_base_case::setName(std::string  name)
{
	this->name = name;
}

std::string
Product_groups_create_request_feed_base_case::getDescription()
{
	return description;
}

void
Product_groups_create_request_feed_base_case::setDescription(std::string  description)
{
	this->description = description;
}

bool
Product_groups_create_request_feed_base_case::getIsFeatured()
{
	return is_featured;
}

void
Product_groups_create_request_feed_base_case::setIsFeatured(bool  is_featured)
{
	this->is_featured = is_featured;
}

CatalogsProductGroupFiltersAllOfRequest
Product_groups_create_request_feed_base_case::getFilters()
{
	return filters;
}

void
Product_groups_create_request_feed_base_case::setFilters(CatalogsProductGroupFiltersAllOfRequest  filters)
{
	this->filters = filters;
}

std::string
Product_groups_create_request_feed_base_case::getFeedId()
{
	return feed_id;
}

void
Product_groups_create_request_feed_base_case::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}


