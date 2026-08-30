#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Campaign_ad_preview_create_200_response_inner_data_oneOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Campaign_ad_preview_create_200_response_inner_data_oneOf::Campaign_ad_preview_create_200_response_inner_data_oneOf()
{
	//__init();
}

Campaign_ad_preview_create_200_response_inner_data_oneOf::~Campaign_ad_preview_create_200_response_inner_data_oneOf()
{
	//__cleanup();
}

void
Campaign_ad_preview_create_200_response_inner_data_oneOf::__init()
{
	//exceptions = new Pinterest.Lib.Error();
}

void
Campaign_ad_preview_create_200_response_inner_data_oneOf::__cleanup()
{
	//if(exceptions != NULL) {
	//
	//delete exceptions;
	//exceptions = NULL;
	//}
	//
}

void
Campaign_ad_preview_create_200_response_inner_data_oneOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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

Campaign_ad_preview_create_200_response_inner_data_oneOf::Campaign_ad_preview_create_200_response_inner_data_oneOf(char* json)
{
	this->fromJson(json);
}

char*
Campaign_ad_preview_create_200_response_inner_data_oneOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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

Pinterest.Lib.Error
Campaign_ad_preview_create_200_response_inner_data_oneOf::getExceptions()
{
	return exceptions;
}

void
Campaign_ad_preview_create_200_response_inner_data_oneOf::setExceptions(Pinterest.Lib.Error  exceptions)
{
	this->exceptions = exceptions;
}


