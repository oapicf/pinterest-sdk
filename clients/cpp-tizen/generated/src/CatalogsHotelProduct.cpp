#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelProduct.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelProduct::CatalogsHotelProduct()
{
	//__init();
}

CatalogsHotelProduct::~CatalogsHotelProduct()
{
	//__cleanup();
}

void
CatalogsHotelProduct::__init()
{
	//catalog_type = std::string();
	//metadata = new CatalogsHotelProductMetadata();
	//pin = new Pin();
}

void
CatalogsHotelProduct::__cleanup()
{
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(metadata != NULL) {
	//
	//delete metadata;
	//metadata = NULL;
	//}
	//if(pin != NULL) {
	//
	//delete pin;
	//pin = NULL;
	//}
	//
}

void
CatalogsHotelProduct::fromJson(char* jsonStr)
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
	const gchar *metadataKey = "metadata";
	node = json_object_get_member(pJsonObject, metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsHotelProductMetadata")) {
			jsonToValue(&metadata, node, "CatalogsHotelProductMetadata", "CatalogsHotelProductMetadata");
		} else {
			
			CatalogsHotelProductMetadata* obj = static_cast<CatalogsHotelProductMetadata*> (&metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pinKey = "pin";
	node = json_object_get_member(pJsonObject, pinKey);
	if (node !=NULL) {
	

		if (isprimitive("Pin")) {
			jsonToValue(&pin, node, "Pin", "Pin");
		} else {
			
			Pin* obj = static_cast<Pin*> (&pin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsHotelProduct::CatalogsHotelProduct(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelProduct::toJson()
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
	if (isprimitive("CatalogsHotelProductMetadata")) {
		CatalogsHotelProductMetadata obj = getMetadata();
		node = converttoJson(&obj, "CatalogsHotelProductMetadata", "");
	}
	else {
		
		CatalogsHotelProductMetadata obj = static_cast<CatalogsHotelProductMetadata> (getMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metadataKey = "metadata";
	json_object_set_member(pJsonObject, metadataKey, node);
	if (isprimitive("Pin")) {
		Pin obj = getPin();
		node = converttoJson(&obj, "Pin", "");
	}
	else {
		
		Pin obj = static_cast<Pin> (getPin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pinKey = "pin";
	json_object_set_member(pJsonObject, pinKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsHotelProduct::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelProduct::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelProductMetadata
CatalogsHotelProduct::getMetadata()
{
	return metadata;
}

void
CatalogsHotelProduct::setMetadata(CatalogsHotelProductMetadata  metadata)
{
	this->metadata = metadata;
}

Pin
CatalogsHotelProduct::getPin()
{
	return pin;
}

void
CatalogsHotelProduct::setPin(Pin  pin)
{
	this->pin = pin;
}


