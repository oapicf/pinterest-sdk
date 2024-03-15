#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreateHotelItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreateHotelItem::CatalogsCreateHotelItem()
{
	//__init();
}

CatalogsCreateHotelItem::~CatalogsCreateHotelItem()
{
	//__cleanup();
}

void
CatalogsCreateHotelItem::__init()
{
	//hotel_id = std::string();
	//operation = std::string();
	//attributes = new CatalogsHotelAttributes();
}

void
CatalogsCreateHotelItem::__cleanup()
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
	//if(attributes != NULL) {
	//
	//delete attributes;
	//attributes = NULL;
	//}
	//
}

void
CatalogsCreateHotelItem::fromJson(char* jsonStr)
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
	const gchar *attributesKey = "attributes";
	node = json_object_get_member(pJsonObject, attributesKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsHotelAttributes")) {
			jsonToValue(&attributes, node, "CatalogsHotelAttributes", "CatalogsHotelAttributes");
		} else {
			
			CatalogsHotelAttributes* obj = static_cast<CatalogsHotelAttributes*> (&attributes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsCreateHotelItem::CatalogsCreateHotelItem(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreateHotelItem::toJson()
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
	if (isprimitive("CatalogsHotelAttributes")) {
		CatalogsHotelAttributes obj = getAttributes();
		node = converttoJson(&obj, "CatalogsHotelAttributes", "");
	}
	else {
		
		CatalogsHotelAttributes obj = static_cast<CatalogsHotelAttributes> (getAttributes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attributesKey = "attributes";
	json_object_set_member(pJsonObject, attributesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsCreateHotelItem::getHotelId()
{
	return hotel_id;
}

void
CatalogsCreateHotelItem::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}

std::string
CatalogsCreateHotelItem::getOperation()
{
	return operation;
}

void
CatalogsCreateHotelItem::setOperation(std::string  operation)
{
	this->operation = operation;
}

CatalogsHotelAttributes
CatalogsCreateHotelItem::getAttributes()
{
	return attributes;
}

void
CatalogsCreateHotelItem::setAttributes(CatalogsHotelAttributes  attributes)
{
	this->attributes = attributes;
}


