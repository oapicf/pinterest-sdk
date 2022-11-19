#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BulkUpsertRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BulkUpsertRequest::BulkUpsertRequest()
{
	//__init();
}

BulkUpsertRequest::~BulkUpsertRequest()
{
	//__cleanup();
}

void
BulkUpsertRequest::__init()
{
	//create = new BulkUpsertRequestCreate();
	//update = new BulkUpsertRequestUpdate();
}

void
BulkUpsertRequest::__cleanup()
{
	//if(create != NULL) {
	//
	//delete create;
	//create = NULL;
	//}
	//if(update != NULL) {
	//
	//delete update;
	//update = NULL;
	//}
	//
}

void
BulkUpsertRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *createKey = "create";
	node = json_object_get_member(pJsonObject, createKey);
	if (node !=NULL) {
	

		if (isprimitive("BulkUpsertRequestCreate")) {
			jsonToValue(&create, node, "BulkUpsertRequestCreate", "BulkUpsertRequestCreate");
		} else {
			
			BulkUpsertRequestCreate* obj = static_cast<BulkUpsertRequestCreate*> (&create);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *updateKey = "update";
	node = json_object_get_member(pJsonObject, updateKey);
	if (node !=NULL) {
	

		if (isprimitive("BulkUpsertRequestUpdate")) {
			jsonToValue(&update, node, "BulkUpsertRequestUpdate", "BulkUpsertRequestUpdate");
		} else {
			
			BulkUpsertRequestUpdate* obj = static_cast<BulkUpsertRequestUpdate*> (&update);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BulkUpsertRequest::BulkUpsertRequest(char* json)
{
	this->fromJson(json);
}

char*
BulkUpsertRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BulkUpsertRequestCreate")) {
		BulkUpsertRequestCreate obj = getCreate();
		node = converttoJson(&obj, "BulkUpsertRequestCreate", "");
	}
	else {
		
		BulkUpsertRequestCreate obj = static_cast<BulkUpsertRequestCreate> (getCreate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *createKey = "create";
	json_object_set_member(pJsonObject, createKey, node);
	if (isprimitive("BulkUpsertRequestUpdate")) {
		BulkUpsertRequestUpdate obj = getUpdate();
		node = converttoJson(&obj, "BulkUpsertRequestUpdate", "");
	}
	else {
		
		BulkUpsertRequestUpdate obj = static_cast<BulkUpsertRequestUpdate> (getUpdate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *updateKey = "update";
	json_object_set_member(pJsonObject, updateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

BulkUpsertRequestCreate
BulkUpsertRequest::getCreate()
{
	return create;
}

void
BulkUpsertRequest::setCreate(BulkUpsertRequestCreate  create)
{
	this->create = create;
}

BulkUpsertRequestUpdate
BulkUpsertRequest::getUpdate()
{
	return update;
}

void
BulkUpsertRequest::setUpdate(BulkUpsertRequestUpdate  update)
{
	this->update = update;
}


