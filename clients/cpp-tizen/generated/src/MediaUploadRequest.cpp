#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MediaUploadRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MediaUploadRequest::MediaUploadRequest()
{
	//__init();
}

MediaUploadRequest::~MediaUploadRequest()
{
	//__cleanup();
}

void
MediaUploadRequest::__init()
{
	//media_type = std::string();
}

void
MediaUploadRequest::__cleanup()
{
	//if(media_type != NULL) {
	//
	//delete media_type;
	//media_type = NULL;
	//}
	//
}

void
MediaUploadRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *media_typeKey = "media_type";
	node = json_object_get_member(pJsonObject, media_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("MediaUploadType")) {
			jsonToValue(&media_type, node, "MediaUploadType", "MediaUploadType");
		} else {
			
		}
	}
}

MediaUploadRequest::MediaUploadRequest(char* json)
{
	this->fromJson(json);
}

char*
MediaUploadRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MediaUploadType")) {
		MediaUploadType obj = getMediaType();
		node = converttoJson(&obj, "MediaUploadType", "");
	}
	else {
		
	}
	const gchar *media_typeKey = "media_type";
	json_object_set_member(pJsonObject, media_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

MediaUploadType
MediaUploadRequest::getMediaType()
{
	return media_type;
}

void
MediaUploadRequest::setMediaType(MediaUploadType  media_type)
{
	this->media_type = media_type;
}


