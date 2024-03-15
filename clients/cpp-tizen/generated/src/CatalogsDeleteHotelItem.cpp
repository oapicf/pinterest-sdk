#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsDeleteHotelItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsDeleteHotelItem::CatalogsDeleteHotelItem()
{
	//__init();
}

CatalogsDeleteHotelItem::~CatalogsDeleteHotelItem()
{
	//__cleanup();
}

void
CatalogsDeleteHotelItem::__init()
{
	//hotel_id = std::string();
	//operation = std::string();
}

void
CatalogsDeleteHotelItem::__cleanup()
{
	//if(hotel_id != NULL) {
	//
	//delete hotel_id;
	//hotel_id = NULL;
	//}
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//
}

void
CatalogsDeleteHotelItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hotel_idKey = "hotel_id";
	node = json_object_get_member(pJsonObject, hotel_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hotel_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&operation, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsDeleteHotelItem::CatalogsDeleteHotelItem(char* json)
{
	this->fromJson(json);
}

char*
CatalogsDeleteHotelItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getHotelId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hotel_idKey = "hotel_id";
	json_object_set_member(pJsonObject, hotel_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOperation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsDeleteHotelItem::getHotelId()
{
	return hotel_id;
}

void
CatalogsDeleteHotelItem::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}

std::string
CatalogsDeleteHotelItem::getOperation()
{
	return operation;
}

void
CatalogsDeleteHotelItem::setOperation(std::string  operation)
{
	this->operation = operation;
}


