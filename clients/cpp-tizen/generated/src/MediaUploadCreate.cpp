#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MediaUploadCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MediaUploadCreate::MediaUploadCreate()
{
	//__init();
}

MediaUploadCreate::~MediaUploadCreate()
{
	//__cleanup();
}

void
MediaUploadCreate::__init()
{
	//media_type = null;
}

void
MediaUploadCreate::__cleanup()
{
	//if(media_type != NULL) {
	//
	//delete media_type;
	//media_type = NULL;
	//}
	//
}

void
MediaUploadCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
}

MediaUploadCreate::MediaUploadCreate(char* json)
{
	this->fromJson(json);
}

char*
MediaUploadCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

MediaUploadType
MediaUploadCreate::getMediaType()
{
	return media_type;
}

void
MediaUploadCreate::setMediaType(MediaUploadType  media_type)
{
	this->media_type = media_type;
}


