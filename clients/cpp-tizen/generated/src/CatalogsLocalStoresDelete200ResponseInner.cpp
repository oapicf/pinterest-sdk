#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Catalogs_local_stores_delete_200_response_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Catalogs_local_stores_delete_200_response_inner::Catalogs_local_stores_delete_200_response_inner()
{
	//__init();
}

Catalogs_local_stores_delete_200_response_inner::~Catalogs_local_stores_delete_200_response_inner()
{
	//__cleanup();
}

void
Catalogs_local_stores_delete_200_response_inner::__init()
{
	//id = std::string();
	//status = new Campaign_ad_preview_delete_200_response_inner_status();
}

void
Catalogs_local_stores_delete_200_response_inner::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
Catalogs_local_stores_delete_200_response_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("Campaign_ad_preview_delete_200_response_inner_status")) {
			jsonToValue(&status, node, "Campaign_ad_preview_delete_200_response_inner_status", "Campaign_ad_preview_delete_200_response_inner_status");
		} else {
			
			Campaign_ad_preview_delete_200_response_inner_status* obj = static_cast<Campaign_ad_preview_delete_200_response_inner_status*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Catalogs_local_stores_delete_200_response_inner::Catalogs_local_stores_delete_200_response_inner(char* json)
{
	this->fromJson(json);
}

char*
Catalogs_local_stores_delete_200_response_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("Campaign_ad_preview_delete_200_response_inner_status")) {
		Campaign_ad_preview_delete_200_response_inner_status obj = getStatus();
		node = converttoJson(&obj, "Campaign_ad_preview_delete_200_response_inner_status", "");
	}
	else {
		
		Campaign_ad_preview_delete_200_response_inner_status obj = static_cast<Campaign_ad_preview_delete_200_response_inner_status> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Catalogs_local_stores_delete_200_response_inner::getId()
{
	return id;
}

void
Catalogs_local_stores_delete_200_response_inner::setId(std::string  id)
{
	this->id = id;
}

Campaign_ad_preview_delete_200_response_inner_status
Catalogs_local_stores_delete_200_response_inner::getStatus()
{
	return status;
}

void
Catalogs_local_stores_delete_200_response_inner::setStatus(Campaign_ad_preview_delete_200_response_inner_status  status)
{
	this->status = status;
}


