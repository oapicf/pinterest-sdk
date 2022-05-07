#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaSourceVideoID.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaSourceVideoID::PinMediaSourceVideoID()
{
	//__init();
}

PinMediaSourceVideoID::~PinMediaSourceVideoID()
{
	//__cleanup();
}

void
PinMediaSourceVideoID::__init()
{
	//source_type = std::string();
	//cover_image_url = std::string();
	//media_id = std::string();
}

void
PinMediaSourceVideoID::__cleanup()
{
	//if(source_type != NULL) {
	//
	//delete source_type;
	//source_type = NULL;
	//}
	//if(cover_image_url != NULL) {
	//
	//delete cover_image_url;
	//cover_image_url = NULL;
	//}
	//if(media_id != NULL) {
	//
	//delete media_id;
	//media_id = NULL;
	//}
	//
}

void
PinMediaSourceVideoID::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *source_typeKey = "source_type";
	node = json_object_get_member(pJsonObject, source_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&source_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cover_image_urlKey = "cover_image_url";
	node = json_object_get_member(pJsonObject, cover_image_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cover_image_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *media_idKey = "media_id";
	node = json_object_get_member(pJsonObject, media_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_id, node, "std::string", "");
		} else {
			
		}
	}
}

PinMediaSourceVideoID::PinMediaSourceVideoID(char* json)
{
	this->fromJson(json);
}

char*
PinMediaSourceVideoID::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getSourceType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *source_typeKey = "source_type";
	json_object_set_member(pJsonObject, source_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCoverImageUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cover_image_urlKey = "cover_image_url";
	json_object_set_member(pJsonObject, cover_image_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMediaId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_idKey = "media_id";
	json_object_set_member(pJsonObject, media_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PinMediaSourceVideoID::getSourceType()
{
	return source_type;
}

void
PinMediaSourceVideoID::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}

std::string
PinMediaSourceVideoID::getCoverImageUrl()
{
	return cover_image_url;
}

void
PinMediaSourceVideoID::setCoverImageUrl(std::string  cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

std::string
PinMediaSourceVideoID::getMediaId()
{
	return media_id;
}

void
PinMediaSourceVideoID::setMediaId(std::string  media_id)
{
	this->media_id = media_id;
}


