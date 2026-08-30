#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PromotionArrayElement.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PromotionArrayElement::PromotionArrayElement()
{
	//__init();
}

PromotionArrayElement::~PromotionArrayElement()
{
	//__cleanup();
}

void
PromotionArrayElement::__init()
{
	//data = new Promotion();
	//exception = new Exception();
}

void
PromotionArrayElement::__cleanup()
{
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(exception != NULL) {
	//
	//delete exception;
	//exception = NULL;
	//}
	//
}

void
PromotionArrayElement::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("Promotion")) {
			jsonToValue(&data, node, "Promotion", "Promotion");
		} else {
			
			Promotion* obj = static_cast<Promotion*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *exceptionKey = "exception";
	node = json_object_get_member(pJsonObject, exceptionKey);
	if (node !=NULL) {
	

		if (isprimitive("Exception")) {
			jsonToValue(&exception, node, "Exception", "Exception");
		} else {
			
			Exception* obj = static_cast<Exception*> (&exception);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PromotionArrayElement::PromotionArrayElement(char* json)
{
	this->fromJson(json);
}

char*
PromotionArrayElement::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Promotion")) {
		Promotion obj = getData();
		node = converttoJson(&obj, "Promotion", "");
	}
	else {
		
		Promotion obj = static_cast<Promotion> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("Exception")) {
		Exception obj = getException();
		node = converttoJson(&obj, "Exception", "");
	}
	else {
		
		Exception obj = static_cast<Exception> (getException());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *exceptionKey = "exception";
	json_object_set_member(pJsonObject, exceptionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Promotion
PromotionArrayElement::getData()
{
	return data;
}

void
PromotionArrayElement::setData(Promotion  data)
{
	this->data = data;
}

Exception
PromotionArrayElement::getException()
{
	return exception;
}

void
PromotionArrayElement::setException(Exception  exception)
{
	this->exception = exception;
}


