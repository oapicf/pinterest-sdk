#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelBatchItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelBatchItem::CatalogsHotelBatchItem()
{
	//__init();
}

CatalogsHotelBatchItem::~CatalogsHotelBatchItem()
{
	//__cleanup();
}

void
CatalogsHotelBatchItem::__init()
{
	//hotel_id = std::string();
	//operation = std::string();
	//attributes = new CatalogsUpdatableHotelAttributes();
}

void
CatalogsHotelBatchItem::__cleanup()
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
CatalogsHotelBatchItem::fromJson(char* jsonStr)
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
	

		if (isprimitive("CatalogsUpdatableHotelAttributes")) {
			jsonToValue(&attributes, node, "CatalogsUpdatableHotelAttributes", "CatalogsUpdatableHotelAttributes");
		} else {
			
			CatalogsUpdatableHotelAttributes* obj = static_cast<CatalogsUpdatableHotelAttributes*> (&attributes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsHotelBatchItem::CatalogsHotelBatchItem(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelBatchItem::toJson()
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
	if (isprimitive("CatalogsUpdatableHotelAttributes")) {
		CatalogsUpdatableHotelAttributes obj = getAttributes();
		node = converttoJson(&obj, "CatalogsUpdatableHotelAttributes", "");
	}
	else {
		
		CatalogsUpdatableHotelAttributes obj = static_cast<CatalogsUpdatableHotelAttributes> (getAttributes());
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
CatalogsHotelBatchItem::getHotelId()
{
	return hotel_id;
}

void
CatalogsHotelBatchItem::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}

std::string
CatalogsHotelBatchItem::getOperation()
{
	return operation;
}

void
CatalogsHotelBatchItem::setOperation(std::string  operation)
{
	this->operation = operation;
}

CatalogsUpdatableHotelAttributes
CatalogsHotelBatchItem::getAttributes()
{
	return attributes;
}

void
CatalogsHotelBatchItem::setAttributes(CatalogsUpdatableHotelAttributes  attributes)
{
	this->attributes = attributes;
}


