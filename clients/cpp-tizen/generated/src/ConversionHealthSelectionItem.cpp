#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionHealthSelectionItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionHealthSelectionItem::ConversionHealthSelectionItem()
{
	//__init();
}

ConversionHealthSelectionItem::~ConversionHealthSelectionItem()
{
	//__cleanup();
}

void
ConversionHealthSelectionItem::__init()
{
	//conversionType = null;
	//criteria = null;
	//ingestionSource = null;
	//status = null;
}

void
ConversionHealthSelectionItem::__cleanup()
{
	//if(conversionType != NULL) {
	//
	//delete conversionType;
	//conversionType = NULL;
	//}
	//if(criteria != NULL) {
	//
	//delete criteria;
	//criteria = NULL;
	//}
	//if(ingestionSource != NULL) {
	//
	//delete ingestionSource;
	//ingestionSource = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
ConversionHealthSelectionItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *conversionTypeKey = "conversionType";
	node = json_object_get_member(pJsonObject, conversionTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&conversionType, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&conversionType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *criteriaKey = "criteria";
	node = json_object_get_member(pJsonObject, criteriaKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&criteria, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&criteria);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ingestionSourceKey = "ingestionSource";
	node = json_object_get_member(pJsonObject, ingestionSourceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ingestionSource, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&ingestionSource);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&status, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ConversionHealthSelectionItem::ConversionHealthSelectionItem(char* json)
{
	this->fromJson(json);
}

char*
ConversionHealthSelectionItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getConversionType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getConversionType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *conversionTypeKey = "conversionType";
	json_object_set_member(pJsonObject, conversionTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCriteria();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getCriteria());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *criteriaKey = "criteria";
	json_object_set_member(pJsonObject, criteriaKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIngestionSource();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getIngestionSource());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ingestionSourceKey = "ingestionSource";
	json_object_set_member(pJsonObject, ingestionSourceKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getStatus();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConversionHealthSelectionItem::getConversionType()
{
	return conversionType;
}

void
ConversionHealthSelectionItem::setConversionType(std::string  conversionType)
{
	this->conversionType = conversionType;
}

std::string
ConversionHealthSelectionItem::getCriteria()
{
	return criteria;
}

void
ConversionHealthSelectionItem::setCriteria(std::string  criteria)
{
	this->criteria = criteria;
}

std::string
ConversionHealthSelectionItem::getIngestionSource()
{
	return ingestionSource;
}

void
ConversionHealthSelectionItem::setIngestionSource(std::string  ingestionSource)
{
	this->ingestionSource = ingestionSource;
}

AnyType
ConversionHealthSelectionItem::getStatus()
{
	return status;
}

void
ConversionHealthSelectionItem::setStatus(AnyType  status)
{
	this->status = status;
}


