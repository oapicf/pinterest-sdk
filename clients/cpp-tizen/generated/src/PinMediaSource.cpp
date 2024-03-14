#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaSource.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaSource::PinMediaSource()
{
	//__init();
}

PinMediaSource::~PinMediaSource()
{
	//__cleanup();
}

void
PinMediaSource::__init()
{
	//source_type = std::string();
	//content_type = std::string();
	//data = std::string();
	//url = std::string();
	//cover_image_url = std::string();
	//media_id = std::string();
}

void
PinMediaSource::__cleanup()
{
	//if(source_type != NULL) {
	//
	//delete source_type;
	//source_type = NULL;
	//}
	//if(content_type != NULL) {
	//
	//delete content_type;
	//content_type = NULL;
	//}
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
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
PinMediaSource::fromJson(char* jsonStr)
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
	const gchar *content_typeKey = "content_type";
	node = json_object_get_member(pJsonObject, content_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&content_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&data, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
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

PinMediaSource::PinMediaSource(char* json)
{
	this->fromJson(json);
}

char*
PinMediaSource::toJson()
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
		std::string obj = getContentType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *content_typeKey = "content_type";
	json_object_set_member(pJsonObject, content_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getData();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
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
PinMediaSource::getSourceType()
{
	return source_type;
}

void
PinMediaSource::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}

std::string
PinMediaSource::getContentType()
{
	return content_type;
}

void
PinMediaSource::setContentType(std::string  content_type)
{
	this->content_type = content_type;
}

std::string
PinMediaSource::getData()
{
	return data;
}

void
PinMediaSource::setData(std::string  data)
{
	this->data = data;
}

std::string
PinMediaSource::getUrl()
{
	return url;
}

void
PinMediaSource::setUrl(std::string  url)
{
	this->url = url;
}

std::string
PinMediaSource::getCoverImageUrl()
{
	return cover_image_url;
}

void
PinMediaSource::setCoverImageUrl(std::string  cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

std::string
PinMediaSource::getMediaId()
{
	return media_id;
}

void
PinMediaSource::setMediaId(std::string  media_id)
{
	this->media_id = media_id;
}


