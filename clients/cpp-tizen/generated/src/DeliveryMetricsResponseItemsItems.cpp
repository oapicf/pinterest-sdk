#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeliveryMetricsResponseItemsItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeliveryMetricsResponseItemsItems::DeliveryMetricsResponseItemsItems()
{
	//__init();
}

DeliveryMetricsResponseItemsItems::~DeliveryMetricsResponseItemsItems()
{
	//__cleanup();
}

void
DeliveryMetricsResponseItemsItems::__init()
{
	//category = std::string();
	//definition = std::string();
	//display_name = std::string();
	//name = std::string();
}

void
DeliveryMetricsResponseItemsItems::__cleanup()
{
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
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
DeliveryMetricsResponseItemsItems::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

DeliveryMetricsResponseItemsItems::DeliveryMetricsResponseItemsItems(char* json)
{
	this->fromJson(json);
}

char*
DeliveryMetricsResponseItemsItems::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DeliveryMetricsResponseItemsItems::getCategory()
{
	return category;
}

void
DeliveryMetricsResponseItemsItems::setCategory(std::string  category)
{
	this->category = category;
}

std::string
DeliveryMetricsResponseItemsItems::getDefinition()
{
	return definition;
}

void
DeliveryMetricsResponseItemsItems::setDefinition(std::string  definition)
{
	this->definition = definition;
}

std::string
DeliveryMetricsResponseItemsItems::getDisplayName()
{
	return display_name;
}

void
DeliveryMetricsResponseItemsItems::setDisplayName(std::string  display_name)
{
	this->display_name = display_name;
}

std::string
DeliveryMetricsResponseItemsItems::getName()
{
	return name;
}

void
DeliveryMetricsResponseItemsItems::setName(std::string  name)
{
	this->name = name;
}


