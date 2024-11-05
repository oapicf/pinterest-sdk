#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreativeAssetsProduct.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreativeAssetsProduct::CatalogsCreativeAssetsProduct()
{
	//__init();
}

CatalogsCreativeAssetsProduct::~CatalogsCreativeAssetsProduct()
{
	//__cleanup();
}

void
CatalogsCreativeAssetsProduct::__init()
{
	//catalog_type = std::string();
	//metadata = new CatalogsCreativeAssetsProductMetadata();
	//pin = new Pin();
}

void
CatalogsCreativeAssetsProduct::__cleanup()
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
CatalogsCreativeAssetsProduct::fromJson(char* jsonStr)
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

CatalogsCreativeAssetsProduct::CatalogsCreativeAssetsProduct(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreativeAssetsProduct::toJson()
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

std::string
CatalogsCreativeAssetsProduct::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsProduct::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsCreativeAssetsProductMetadata
CatalogsCreativeAssetsProduct::getMetadata()
{
	return metadata;
}

void
CatalogsCreativeAssetsProduct::setMetadata(CatalogsCreativeAssetsProductMetadata  metadata)
{
	this->metadata = metadata;
}

Pin
CatalogsCreativeAssetsProduct::getPin()
{
	return pin;
}

void
CatalogsCreativeAssetsProduct::setPin(Pin  pin)
{
	this->pin = pin;
}


