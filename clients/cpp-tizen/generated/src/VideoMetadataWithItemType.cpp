#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VideoMetadataWithItemType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VideoMetadataWithItemType::VideoMetadataWithItemType()
{
	//__init();
}

VideoMetadataWithItemType::~VideoMetadataWithItemType()
{
	//__cleanup();
}

void
VideoMetadataWithItemType::__init()
{
	//cover_image_url = std::string();
	//duration = double(0);
	//height = int(0);
	//item_type = std::string();
	//video_url = std::string();
	//video_url_hls = std::string();
	//width = int(0);
}

void
VideoMetadataWithItemType::__cleanup()
{
	//if(cover_image_url != NULL) {
	//
	//delete cover_image_url;
	//cover_image_url = NULL;
	//}
	//if(duration != NULL) {
	//
	//delete duration;
	//duration = NULL;
	//}
	//if(height != NULL) {
	//
	//delete height;
	//height = NULL;
	//}
	//if(item_type != NULL) {
	//
	//delete item_type;
	//item_type = NULL;
	//}
	//if(video_url != NULL) {
	//
	//delete video_url;
	//video_url = NULL;
	//}
	//if(video_url_hls != NULL) {
	//
	//delete video_url_hls;
	//video_url_hls = NULL;
	//}
	//if(width != NULL) {
	//
	//delete width;
	//width = NULL;
	//}
	//
}

void
VideoMetadataWithItemType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cover_image_urlKey = "cover_image_url";
	node = json_object_get_member(pJsonObject, cover_image_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cover_image_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *durationKey = "duration";
	node = json_object_get_member(pJsonObject, durationKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&duration, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&duration);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *heightKey = "height";
	node = json_object_get_member(pJsonObject, heightKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&height, node, "int", "");
		} else {
			
		}
	}
	const gchar *item_typeKey = "item_type";
	node = json_object_get_member(pJsonObject, item_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *video_urlKey = "video_url";
	node = json_object_get_member(pJsonObject, video_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&video_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *video_url_hlsKey = "video_url_hls";
	node = json_object_get_member(pJsonObject, video_url_hlsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&video_url_hls, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *widthKey = "width";
	node = json_object_get_member(pJsonObject, widthKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&width, node, "int", "");
		} else {
			
		}
	}
}

VideoMetadataWithItemType::VideoMetadataWithItemType(char* json)
{
	this->fromJson(json);
}

char*
VideoMetadataWithItemType::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCoverImageUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cover_image_urlKey = "cover_image_url";
	json_object_set_member(pJsonObject, cover_image_urlKey, node);
	if (isprimitive("long long")) {
		long long obj = getDuration();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getDuration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *durationKey = "duration";
	json_object_set_member(pJsonObject, durationKey, node);
	if (isprimitive("int")) {
		int obj = getHeight();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *heightKey = "height";
	json_object_set_member(pJsonObject, heightKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_typeKey = "item_type";
	json_object_set_member(pJsonObject, item_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVideoUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *video_urlKey = "video_url";
	json_object_set_member(pJsonObject, video_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVideoUrlHls();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *video_url_hlsKey = "video_url_hls";
	json_object_set_member(pJsonObject, video_url_hlsKey, node);
	if (isprimitive("int")) {
		int obj = getWidth();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *widthKey = "width";
	json_object_set_member(pJsonObject, widthKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
VideoMetadataWithItemType::getCoverImageUrl()
{
	return cover_image_url;
}

void
VideoMetadataWithItemType::setCoverImageUrl(std::string  cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

long long
VideoMetadataWithItemType::getDuration()
{
	return duration;
}

void
VideoMetadataWithItemType::setDuration(long long  duration)
{
	this->duration = duration;
}

int
VideoMetadataWithItemType::getHeight()
{
	return height;
}

void
VideoMetadataWithItemType::setHeight(int  height)
{
	this->height = height;
}

std::string
VideoMetadataWithItemType::getItemType()
{
	return item_type;
}

void
VideoMetadataWithItemType::setItemType(std::string  item_type)
{
	this->item_type = item_type;
}

std::string
VideoMetadataWithItemType::getVideoUrl()
{
	return video_url;
}

void
VideoMetadataWithItemType::setVideoUrl(std::string  video_url)
{
	this->video_url = video_url;
}

std::string
VideoMetadataWithItemType::getVideoUrlHls()
{
	return video_url_hls;
}

void
VideoMetadataWithItemType::setVideoUrlHls(std::string  video_url_hls)
{
	this->video_url_hls = video_url_hls;
}

int
VideoMetadataWithItemType::getWidth()
{
	return width;
}

void
VideoMetadataWithItemType::setWidth(int  width)
{
	this->width = width;
}


