#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Pinterest.Lib.Status204.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Pinterest.Lib.Status204::Pinterest.Lib.Status204()
{
	//__init();
}

Pinterest.Lib.Status204::~Pinterest.Lib.Status204()
{
	//__cleanup();
}

void
Pinterest.Lib.Status204::__init()
{
	//statusCode = double(0);
}

void
Pinterest.Lib.Status204::__cleanup()
{
	//if(statusCode != NULL) {
	//
	//delete statusCode;
	//statusCode = NULL;
	//}
	//
}

void
Pinterest.Lib.Status204::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusCodeKey = "statusCode";
	node = json_object_get_member(pJsonObject, statusCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&statusCode, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&statusCode);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Pinterest.Lib.Status204::Pinterest.Lib.Status204(char* json)
{
	this->fromJson(json);
}

char*
Pinterest.Lib.Status204::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getStatusCode();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getStatusCode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusCodeKey = "statusCode";
	json_object_set_member(pJsonObject, statusCodeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
Pinterest.Lib.Status204::getStatusCode()
{
	return statusCode;
}

void
Pinterest.Lib.Status204::setStatusCode(long long  statusCode)
{
	this->statusCode = statusCode;
}


