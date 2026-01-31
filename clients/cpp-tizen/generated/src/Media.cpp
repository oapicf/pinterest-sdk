#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Media.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Media::Media()
{
	//__init();
}

Media::~Media()
{
	//__cleanup();
}

void
Media::__init()
{
	//media_id = std::string();
	//media_type = null;
	//status = null;
}

void
Media::__cleanup()
{
	//if(media_id != NULL) {
	//
	//delete media_id;
	//media_id = NULL;
	//}
	//if(media_type != NULL) {
	//
	//delete media_type;
	//media_type = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
Media::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *media_idKey = "media_id";
	node = json_object_get_member(pJsonObject, media_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *media_typeKey = "media_type";
	node = json_object_get_member(pJsonObject, media_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("MediaUploadType")) {
			jsonToValue(&media_type, node, "MediaUploadType", "MediaUploadType");
		} else {
			
			MediaUploadType* obj = static_cast<MediaUploadType*> (&media_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("MediaUploadStatus")) {
			jsonToValue(&status, node, "MediaUploadStatus", "MediaUploadStatus");
		} else {
			
			MediaUploadStatus* obj = static_cast<MediaUploadStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Media::Media(char* json)
{
	this->fromJson(json);
}

char*
Media::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMediaId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_idKey = "media_id";
	json_object_set_member(pJsonObject, media_idKey, node);
	if (isprimitive("MediaUploadType")) {
		MediaUploadType obj = getMediaType();
		node = converttoJson(&obj, "MediaUploadType", "");
	}
	else {
		
		MediaUploadType obj = static_cast<MediaUploadType> (getMediaType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *media_typeKey = "media_type";
	json_object_set_member(pJsonObject, media_typeKey, node);
	if (isprimitive("MediaUploadStatus")) {
		MediaUploadStatus obj = getStatus();
		node = converttoJson(&obj, "MediaUploadStatus", "");
	}
	else {
		
		MediaUploadStatus obj = static_cast<MediaUploadStatus> (getStatus());
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
Media::getMediaId()
{
	return media_id;
}

void
Media::setMediaId(std::string  media_id)
{
	this->media_id = media_id;
}

MediaUploadType
Media::getMediaType()
{
	return media_type;
}

void
Media::setMediaType(MediaUploadType  media_type)
{
	this->media_type = media_type;
}

MediaUploadStatus
Media::getStatus()
{
	return status;
}

void
Media::setStatus(MediaUploadStatus  status)
{
	this->status = status;
}


