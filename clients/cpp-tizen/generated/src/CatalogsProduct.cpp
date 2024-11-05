#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProduct.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProduct::CatalogsProduct()
{
	//__init();
}

CatalogsProduct::~CatalogsProduct()
{
	//__cleanup();
}

void
CatalogsProduct::__init()
{
	//catalog_type = new CatalogsType();
	//metadata = new CatalogsCreativeAssetsProductMetadata();
	//pin = new Pin();
}

void
CatalogsProduct::__cleanup()
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
CatalogsProduct::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *catalog_typeKey = "catalog_type";
	node = json_object_get_member(pJsonObject, catalog_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsType")) {
			jsonToValue(&catalog_type, node, "CatalogsType", "CatalogsType");
		} else {
			
			CatalogsType* obj = static_cast<CatalogsType*> (&catalog_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *metadataKey = "metadata";
	node = json_object_get_member(pJsonObject, metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsCreativeAssetsProductMetadata")) {
			jsonToValue(&metadata, node, "CatalogsCreativeAssetsProductMetadata", "CatalogsCreativeAssetsProductMetadata");
		} else {
			
			CatalogsCreativeAssetsProductMetadata* obj = static_cast<CatalogsCreativeAssetsProductMetadata*> (&metadata);
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

CatalogsProduct::CatalogsProduct(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProduct::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsType")) {
		CatalogsType obj = getCatalogType();
		node = converttoJson(&obj, "CatalogsType", "");
	}
	else {
		
		CatalogsType obj = static_cast<CatalogsType> (getCatalogType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *catalog_typeKey = "catalog_type";
	json_object_set_member(pJsonObject, catalog_typeKey, node);
	if (isprimitive("CatalogsCreativeAssetsProductMetadata")) {
		CatalogsCreativeAssetsProductMetadata obj = getMetadata();
		node = converttoJson(&obj, "CatalogsCreativeAssetsProductMetadata", "");
	}
	else {
		
		CatalogsCreativeAssetsProductMetadata obj = static_cast<CatalogsCreativeAssetsProductMetadata> (getMetadata());
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

CatalogsType
CatalogsProduct::getCatalogType()
{
	return catalog_type;
}

void
CatalogsProduct::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsCreativeAssetsProductMetadata
CatalogsProduct::getMetadata()
{
	return metadata;
}

void
CatalogsProduct::setMetadata(CatalogsCreativeAssetsProductMetadata  metadata)
{
	this->metadata = metadata;
}

Pin
CatalogsProduct::getPin()
{
	return pin;
}

void
CatalogsProduct::setPin(Pin  pin)
{
	this->pin = pin;
}


