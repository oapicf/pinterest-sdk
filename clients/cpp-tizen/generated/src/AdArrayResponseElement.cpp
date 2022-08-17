#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdArrayResponseElement.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdArrayResponseElement::AdArrayResponseElement()
{
	//__init();
}

AdArrayResponseElement::~AdArrayResponseElement()
{
	//__cleanup();
}

void
AdArrayResponseElement::__init()
{
	//data = new AdResponse();
	//exceptions = new Exception();
}

void
AdArrayResponseElement::__cleanup()
{
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(exceptions != NULL) {
	//
	//delete exceptions;
	//exceptions = NULL;
	//}
	//
}

void
AdArrayResponseElement::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("AdResponse")) {
			jsonToValue(&data, node, "AdResponse", "AdResponse");
		} else {
			
			AdResponse* obj = static_cast<AdResponse*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	

		if (isprimitive("Exception")) {
			jsonToValue(&exceptions, node, "Exception", "Exception");
		} else {
			
			Exception* obj = static_cast<Exception*> (&exceptions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdArrayResponseElement::AdArrayResponseElement(char* json)
{
	this->fromJson(json);
}

char*
AdArrayResponseElement::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AdResponse")) {
		AdResponse obj = getData();
		node = converttoJson(&obj, "AdResponse", "");
	}
	else {
		
		AdResponse obj = static_cast<AdResponse> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("Exception")) {
		Exception obj = getExceptions();
		node = converttoJson(&obj, "Exception", "");
	}
	else {
		
		Exception obj = static_cast<Exception> (getExceptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *exceptionsKey = "exceptions";
	json_object_set_member(pJsonObject, exceptionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AdResponse
AdArrayResponseElement::getData()
{
	return data;
}

void
AdArrayResponseElement::setData(AdResponse  data)
{
	this->data = data;
}

Exception
AdArrayResponseElement::getExceptions()
{
	return exceptions;
}

void
AdArrayResponseElement::setExceptions(Exception  exceptions)
{
	this->exceptions = exceptions;
}


