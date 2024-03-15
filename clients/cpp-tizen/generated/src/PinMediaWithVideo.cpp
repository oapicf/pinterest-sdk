#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaWithVideo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaWithVideo::PinMediaWithVideo()
{
	//__init();
}

PinMediaWithVideo::~PinMediaWithVideo()
{
	//__cleanup();
}

void
PinMediaWithVideo::__init()
{
	//media_type = std::string();
	//images = new ImageMetadata_images();
	//cover_image_url = std::string();
	//video_url = std::string();
	//duration = double(0);
	//height = int(0);
	//width = int(0);
}

void
PinMediaWithVideo::__cleanup()
{
	//if(media_type != NULL) {
	//
	//delete media_type;
	//media_type = NULL;
	//}
	//if(images != NULL) {
	//
	//delete images;
	//images = NULL;
	//}
	//if(cover_image_url != NULL) {
	//
	//delete cover_image_url;
	//cover_image_url = NULL;
	//}
	//if(video_url != NULL) {
	//
	//delete video_url;
	//video_url = NULL;
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
	//if(width != NULL) {
	//
	//delete width;
	//width = NULL;
	//}
	//
}

void
PinMediaWithVideo::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *media_typeKey = "media_type";
	node = json_object_get_member(pJsonObject, media_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *imagesKey = "images";
	node = json_object_get_member(pJsonObject, imagesKey);
	if (node !=NULL) {
	

		if (isprimitive("ImageMetadata_images")) {
			jsonToValue(&images, node, "ImageMetadata_images", "ImageMetadata_images");
		} else {
			
			ImageMetadata_images* obj = static_cast<ImageMetadata_images*> (&images);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *video_urlKey = "video_url";
	node = json_object_get_member(pJsonObject, video_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&video_url, node, "std::string", "");
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
	const gchar *widthKey = "width";
	node = json_object_get_member(pJsonObject, widthKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&width, node, "int", "");
		} else {
			
		}
	}
}

PinMediaWithVideo::PinMediaWithVideo(char* json)
{
	this->fromJson(json);
}

char*
PinMediaWithVideo::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMediaType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_typeKey = "media_type";
	json_object_set_member(pJsonObject, media_typeKey, node);
	if (isprimitive("ImageMetadata_images")) {
		ImageMetadata_images obj = getImages();
		node = converttoJson(&obj, "ImageMetadata_images", "");
	}
	else {
		
		ImageMetadata_images obj = static_cast<ImageMetadata_images> (getImages());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *imagesKey = "images";
	json_object_set_member(pJsonObject, imagesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCoverImageUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cover_image_urlKey = "cover_image_url";
	json_object_set_member(pJsonObject, cover_image_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVideoUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *video_urlKey = "video_url";
	json_object_set_member(pJsonObject, video_urlKey, node);
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
PinMediaWithVideo::getMediaType()
{
	return media_type;
}

void
PinMediaWithVideo::setMediaType(std::string  media_type)
{
	this->media_type = media_type;
}

ImageMetadata_images
PinMediaWithVideo::getImages()
{
	return images;
}

void
PinMediaWithVideo::setImages(ImageMetadata_images  images)
{
	this->images = images;
}

std::string
PinMediaWithVideo::getCoverImageUrl()
{
	return cover_image_url;
}

void
PinMediaWithVideo::setCoverImageUrl(std::string  cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

std::string
PinMediaWithVideo::getVideoUrl()
{
	return video_url;
}

void
PinMediaWithVideo::setVideoUrl(std::string  video_url)
{
	this->video_url = video_url;
}

long long
PinMediaWithVideo::getDuration()
{
	return duration;
}

void
PinMediaWithVideo::setDuration(long long  duration)
{
	this->duration = duration;
}

int
PinMediaWithVideo::getHeight()
{
	return height;
}

void
PinMediaWithVideo::setHeight(int  height)
{
	this->height = height;
}

int
PinMediaWithVideo::getWidth()
{
	return width;
}

void
PinMediaWithVideo::setWidth(int  width)
{
	this->width = width;
}


