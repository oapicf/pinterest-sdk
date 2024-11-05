#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SharedAudienceCommon.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SharedAudienceCommon::SharedAudienceCommon()
{
	//__init();
}

SharedAudienceCommon::~SharedAudienceCommon()
{
	//__cleanup();
}

void
SharedAudienceCommon::__init()
{
	//audience_id = std::string();
	//operation_type = new OperationType();
}

void
SharedAudienceCommon::__cleanup()
{
	//if(audience_id != NULL) {
	//
	//delete audience_id;
	//audience_id = NULL;
	//}
	//if(operation_type != NULL) {
	//
	//delete operation_type;
	//operation_type = NULL;
	//}
	//
}

void
SharedAudienceCommon::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *audience_idKey = "audience_id";
	node = json_object_get_member(pJsonObject, audience_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&audience_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operation_typeKey = "operation_type";
	node = json_object_get_member(pJsonObject, operation_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OperationType")) {
			jsonToValue(&operation_type, node, "OperationType", "OperationType");
		} else {
			
			OperationType* obj = static_cast<OperationType*> (&operation_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

SharedAudienceCommon::SharedAudienceCommon(char* json)
{
	this->fromJson(json);
}

char*
SharedAudienceCommon::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAudienceId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *audience_idKey = "audience_id";
	json_object_set_member(pJsonObject, audience_idKey, node);
	if (isprimitive("OperationType")) {
		OperationType obj = getOperationType();
		node = converttoJson(&obj, "OperationType", "");
	}
	else {
		
		OperationType obj = static_cast<OperationType> (getOperationType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operation_typeKey = "operation_type";
	json_object_set_member(pJsonObject, operation_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SharedAudienceCommon::getAudienceId()
{
	return audience_id;
}

void
SharedAudienceCommon::setAudienceId(std::string  audience_id)
{
	this->audience_id = audience_id;
}

OperationType
SharedAudienceCommon::getOperationType()
{
	return operation_type;
}

void
SharedAudienceCommon::setOperationType(OperationType  operation_type)
{
	this->operation_type = operation_type;
}


