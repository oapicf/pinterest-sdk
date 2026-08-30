#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionDeletionRequestCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionDeletionRequestCreate::ConversionDeletionRequestCreate()
{
	//__init();
}

ConversionDeletionRequestCreate::~ConversionDeletionRequestCreate()
{
	//__cleanup();
}

void
ConversionDeletionRequestCreate::__init()
{
	//deletion_targets = null;
}

void
ConversionDeletionRequestCreate::__cleanup()
{
	//if(deletion_targets != NULL) {
	//
	//delete deletion_targets;
	//deletion_targets = NULL;
	//}
	//
}

void
ConversionDeletionRequestCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *deletion_targetsKey = "deletion_targets";
	node = json_object_get_member(pJsonObject, deletion_targetsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionDeletionRequestTargets")) {
			jsonToValue(&deletion_targets, node, "ConversionDeletionRequestTargets", "ConversionDeletionRequestTargets");
		} else {
			
			ConversionDeletionRequestTargets* obj = static_cast<ConversionDeletionRequestTargets*> (&deletion_targets);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ConversionDeletionRequestCreate::ConversionDeletionRequestCreate(char* json)
{
	this->fromJson(json);
}

char*
ConversionDeletionRequestCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConversionDeletionRequestTargets")) {
		ConversionDeletionRequestTargets obj = getDeletionTargets();
		node = converttoJson(&obj, "ConversionDeletionRequestTargets", "");
	}
	else {
		
		ConversionDeletionRequestTargets obj = static_cast<ConversionDeletionRequestTargets> (getDeletionTargets());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deletion_targetsKey = "deletion_targets";
	json_object_set_member(pJsonObject, deletion_targetsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConversionDeletionRequestTargets
ConversionDeletionRequestCreate::getDeletionTargets()
{
	return deletion_targets;
}

void
ConversionDeletionRequestCreate::setDeletionTargets(ConversionDeletionRequestTargets  deletion_targets)
{
	this->deletion_targets = deletion_targets;
}


