#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaMetadata::PinMediaMetadata()
{
	//__init();
}

PinMediaMetadata::~PinMediaMetadata()
{
	//__cleanup();
}

void
PinMediaMetadata::__init()
{
	//item_type = std::string();
	//title = std::string();
	//description = std::string();
	//link = std::string();
	//images = new ImageMetadata_images();
	//cover_image_url = std::string();
	//video_url = std::string();
	//duration = double(0);
	//height = int(0);
	//width = int(0);
}

void
PinMediaMetadata::__cleanup()
{
	//if(item_type != NULL) {
	//
	//delete item_type;
	//item_type = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(link != NULL) {
	//
	//delete link;
	//link = NULL;
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
PinMediaMetadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *item_typeKey = "item_type";
	node = json_object_get_member(pJsonObject, item_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *linkKey = "link";
	node = json_object_get_member(pJsonObject, linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&link, node, "std::string", "");
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

PinMediaMetadata::PinMediaMetadata(char* json)
{
	this->fromJson(json);
}

char*
PinMediaMetadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getItemType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_typeKey = "item_type";
	json_object_set_member(pJsonObject, item_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *linkKey = "link";
	json_object_set_member(pJsonObject, linkKey, node);
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
PinMediaMetadata::getItemType()
{
	return item_type;
}

void
PinMediaMetadata::setItemType(std::string  item_type)
{
	this->item_type = item_type;
}

std::string
PinMediaMetadata::getTitle()
{
	return title;
}

void
PinMediaMetadata::setTitle(std::string  title)
{
	this->title = title;
}

std::string
PinMediaMetadata::getDescription()
{
	return description;
}

void
PinMediaMetadata::setDescription(std::string  description)
{
	this->description = description;
}

std::string
PinMediaMetadata::getLink()
{
	return link;
}

void
PinMediaMetadata::setLink(std::string  link)
{
	this->link = link;
}

ImageMetadata_images
PinMediaMetadata::getImages()
{
	return images;
}

void
PinMediaMetadata::setImages(ImageMetadata_images  images)
{
	this->images = images;
}

std::string
PinMediaMetadata::getCoverImageUrl()
{
	return cover_image_url;
}

void
PinMediaMetadata::setCoverImageUrl(std::string  cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

std::string
PinMediaMetadata::getVideoUrl()
{
	return video_url;
}

void
PinMediaMetadata::setVideoUrl(std::string  video_url)
{
	this->video_url = video_url;
}

long long
PinMediaMetadata::getDuration()
{
	return duration;
}

void
PinMediaMetadata::setDuration(long long  duration)
{
	this->duration = duration;
}

int
PinMediaMetadata::getHeight()
{
	return height;
}

void
PinMediaMetadata::setHeight(int  height)
{
	this->height = height;
}

int
PinMediaMetadata::getWidth()
{
	return width;
}

void
PinMediaMetadata::setWidth(int  width)
{
	this->width = width;
}


