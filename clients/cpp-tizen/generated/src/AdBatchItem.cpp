#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdBatchItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdBatchItem::AdBatchItem()
{
	//__init();
}

AdBatchItem::~AdBatchItem()
{
	//__cleanup();
}

void
AdBatchItem::__init()
{
	//data = new Ad();
	//exceptions = new Pinterest.Lib.Error();
}

void
AdBatchItem::__cleanup()
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
AdBatchItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("Ad")) {
			jsonToValue(&data, node, "Ad", "Ad");
		} else {
			
			Ad* obj = static_cast<Ad*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	

		if (isprimitive("Pinterest.Lib.Error")) {
			jsonToValue(&exceptions, node, "Pinterest.Lib.Error", "Pinterest.Lib.Error");
		} else {
			
			Pinterest.Lib.Error* obj = static_cast<Pinterest.Lib.Error*> (&exceptions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdBatchItem::AdBatchItem(char* json)
{
	this->fromJson(json);
}

char*
AdBatchItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Ad")) {
		Ad obj = getData();
		node = converttoJson(&obj, "Ad", "");
	}
	else {
		
		Ad obj = static_cast<Ad> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("Pinterest.Lib.Error")) {
		Pinterest.Lib.Error obj = getExceptions();
		node = converttoJson(&obj, "Pinterest.Lib.Error", "");
	}
	else {
		
		Pinterest.Lib.Error obj = static_cast<Pinterest.Lib.Error> (getExceptions());
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

Ad
AdBatchItem::getData()
{
	return data;
}

void
AdBatchItem::setData(Ad  data)
{
	this->data = data;
}

Pinterest.Lib.Error
AdBatchItem::getExceptions()
{
	return exceptions;
}

void
AdBatchItem::setExceptions(Pinterest.Lib.Error  exceptions)
{
	this->exceptions = exceptions;
}


