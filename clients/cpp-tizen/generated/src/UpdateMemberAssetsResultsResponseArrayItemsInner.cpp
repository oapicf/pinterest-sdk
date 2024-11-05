#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateMemberAssetsResultsResponseArray_items_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateMemberAssetsResultsResponseArray_items_inner::UpdateMemberAssetsResultsResponseArray_items_inner()
{
	//__init();
}

UpdateMemberAssetsResultsResponseArray_items_inner::~UpdateMemberAssetsResultsResponseArray_items_inner()
{
	//__cleanup();
}

void
UpdateMemberAssetsResultsResponseArray_items_inner::__init()
{
	//response = new UsersForIndividualAssetResponse();
}

void
UpdateMemberAssetsResultsResponseArray_items_inner::__cleanup()
{
	//if(response != NULL) {
	//
	//delete response;
	//response = NULL;
	//}
	//
}

void
UpdateMemberAssetsResultsResponseArray_items_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *responseKey = "response";
	node = json_object_get_member(pJsonObject, responseKey);
	if (node !=NULL) {
	

		if (isprimitive("UsersForIndividualAssetResponse")) {
			jsonToValue(&response, node, "UsersForIndividualAssetResponse", "UsersForIndividualAssetResponse");
		} else {
			
			UsersForIndividualAssetResponse* obj = static_cast<UsersForIndividualAssetResponse*> (&response);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UpdateMemberAssetsResultsResponseArray_items_inner::UpdateMemberAssetsResultsResponseArray_items_inner(char* json)
{
	this->fromJson(json);
}

char*
UpdateMemberAssetsResultsResponseArray_items_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UsersForIndividualAssetResponse")) {
		UsersForIndividualAssetResponse obj = getResponse();
		node = converttoJson(&obj, "UsersForIndividualAssetResponse", "");
	}
	else {
		
		UsersForIndividualAssetResponse obj = static_cast<UsersForIndividualAssetResponse> (getResponse());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *responseKey = "response";
	json_object_set_member(pJsonObject, responseKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

UsersForIndividualAssetResponse
UpdateMemberAssetsResultsResponseArray_items_inner::getResponse()
{
	return response;
}

void
UpdateMemberAssetsResultsResponseArray_items_inner::setResponse(UsersForIndividualAssetResponse  response)
{
	this->response = response;
}


