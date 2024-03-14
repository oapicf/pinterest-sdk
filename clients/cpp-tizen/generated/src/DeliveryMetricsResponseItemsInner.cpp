#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeliveryMetricsResponse_items_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeliveryMetricsResponse_items_inner::DeliveryMetricsResponse_items_inner()
{
	//__init();
}

DeliveryMetricsResponse_items_inner::~DeliveryMetricsResponse_items_inner()
{
	//__cleanup();
}

void
DeliveryMetricsResponse_items_inner::__init()
{
	//name = std::string();
	//category = std::string();
	//definition = std::string();
	//display_name = std::string();
}

void
DeliveryMetricsResponse_items_inner::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(category != NULL) {
	//
	//delete category;
	//category = NULL;
	//}
	//if(definition != NULL) {
	//
	//delete definition;
	//definition = NULL;
	//}
	//if(display_name != NULL) {
	//
	//delete display_name;
	//display_name = NULL;
	//}
	//
}

void
DeliveryMetricsResponse_items_inner::fromJson(char* jsonStr)
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
	const gchar *categoryKey = "category";
	node = json_object_get_member(pJsonObject, categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&category, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *definitionKey = "definition";
	node = json_object_get_member(pJsonObject, definitionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&definition, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *display_nameKey = "display_name";
	node = json_object_get_member(pJsonObject, display_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&display_name, node, "std::string", "");
		} else {
			
		}
	}
}

DeliveryMetricsResponse_items_inner::DeliveryMetricsResponse_items_inner(char* json)
{
	this->fromJson(json);
}

char*
DeliveryMetricsResponse_items_inner::toJson()
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
		std::string obj = getCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *categoryKey = "category";
	json_object_set_member(pJsonObject, categoryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDefinition();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *definitionKey = "definition";
	json_object_set_member(pJsonObject, definitionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDisplayName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *display_nameKey = "display_name";
	json_object_set_member(pJsonObject, display_nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DeliveryMetricsResponse_items_inner::getName()
{
	return name;
}

void
DeliveryMetricsResponse_items_inner::setName(std::string  name)
{
	this->name = name;
}

std::string
DeliveryMetricsResponse_items_inner::getCategory()
{
	return category;
}

void
DeliveryMetricsResponse_items_inner::setCategory(std::string  category)
{
	this->category = category;
}

std::string
DeliveryMetricsResponse_items_inner::getDefinition()
{
	return definition;
}

void
DeliveryMetricsResponse_items_inner::setDefinition(std::string  definition)
{
	this->definition = definition;
}

std::string
DeliveryMetricsResponse_items_inner::getDisplayName()
{
	return display_name;
}

void
DeliveryMetricsResponse_items_inner::setDisplayName(std::string  display_name)
{
	this->display_name = display_name;
}


