#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BulkDownloadResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BulkDownloadResponse::BulkDownloadResponse()
{
	//__init();
}

BulkDownloadResponse::~BulkDownloadResponse()
{
	//__cleanup();
}

void
BulkDownloadResponse::__init()
{
	//request_id = std::string();
}

void
BulkDownloadResponse::__cleanup()
{
	//if(request_id != NULL) {
	//
	//delete request_id;
	//request_id = NULL;
	//}
	//
}

void
BulkDownloadResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *request_idKey = "request_id";
	node = json_object_get_member(pJsonObject, request_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&request_id, node, "std::string", "");
		} else {
			
		}
	}
}

BulkDownloadResponse::BulkDownloadResponse(char* json)
{
	this->fromJson(json);
}

char*
BulkDownloadResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getRequestId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *request_idKey = "request_id";
	json_object_set_member(pJsonObject, request_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BulkDownloadResponse::getRequestId()
{
	return request_id;
}

void
BulkDownloadResponse::setRequestId(std::string  request_id)
{
	this->request_id = request_id;
}


