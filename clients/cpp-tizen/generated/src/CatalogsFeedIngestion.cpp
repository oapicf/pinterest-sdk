#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedIngestion.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedIngestion::CatalogsFeedIngestion()
{
	//__init();
}

CatalogsFeedIngestion::~CatalogsFeedIngestion()
{
	//__cleanup();
}

void
CatalogsFeedIngestion::__init()
{
	//id = std::string();
	//feed_id = std::string();
	//created_at = null;
	//status = new CatalogsFeedProcessingStatus();
}

void
CatalogsFeedIngestion::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(feed_id != NULL) {
	//
	//delete feed_id;
	//feed_id = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
CatalogsFeedIngestion::fromJson(char* jsonStr)
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
	const gchar *feed_idKey = "feed_id";
	node = json_object_get_member(pJsonObject, feed_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&feed_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_at, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedProcessingStatus")) {
			jsonToValue(&status, node, "CatalogsFeedProcessingStatus", "CatalogsFeedProcessingStatus");
		} else {
			
			CatalogsFeedProcessingStatus* obj = static_cast<CatalogsFeedProcessingStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsFeedIngestion::CatalogsFeedIngestion(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedIngestion::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getFeedId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_idKey = "feed_id";
	json_object_set_member(pJsonObject, feed_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("CatalogsFeedProcessingStatus")) {
		CatalogsFeedProcessingStatus obj = getStatus();
		node = converttoJson(&obj, "CatalogsFeedProcessingStatus", "");
	}
	else {
		
		CatalogsFeedProcessingStatus obj = static_cast<CatalogsFeedProcessingStatus> (getStatus());
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
CatalogsFeedIngestion::getId()
{
	return id;
}

void
CatalogsFeedIngestion::setId(std::string  id)
{
	this->id = id;
}

std::string
CatalogsFeedIngestion::getFeedId()
{
	return feed_id;
}

void
CatalogsFeedIngestion::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

std::string
CatalogsFeedIngestion::getCreatedAt()
{
	return created_at;
}

void
CatalogsFeedIngestion::setCreatedAt(std::string  created_at)
{
	this->created_at = created_at;
}

CatalogsFeedProcessingStatus
CatalogsFeedIngestion::getStatus()
{
	return status;
}

void
CatalogsFeedIngestion::setStatus(CatalogsFeedProcessingStatus  status)
{
	this->status = status;
}


