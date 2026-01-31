#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMedia.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMedia::PinMedia()
{
	//__init();
}

PinMedia::~PinMedia()
{
	//__cleanup();
}

void
PinMedia::__init()
{
	//images = new ImageSize();
	//media_type = std::string();
	//cover_image_url = std::string();
	//duration = double(0);
	//height = int(0);
	//video_url = std::string();
	//width = int(0);
	//new std::list()std::list> items;
}

void
PinMedia::__cleanup()
{
	//if(images != NULL) {
	//
	//delete images;
	//images = NULL;
	//}
	//if(media_type != NULL) {
	//
	//delete media_type;
	//media_type = NULL;
	//}
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
	//if(video_url != NULL) {
	//
	//delete video_url;
	//video_url = NULL;
	//}
	//if(width != NULL) {
	//
	//delete width;
	//width = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
PinMedia::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *imagesKey = "images";
	node = json_object_get_member(pJsonObject, imagesKey);
	if (node !=NULL) {
	

		if (isprimitive("ImageSize")) {
			jsonToValue(&images, node, "ImageSize", "ImageSize");
		} else {
			
			ImageSize* obj = static_cast<ImageSize*> (&images);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *media_typeKey = "media_type";
	node = json_object_get_member(pJsonObject, media_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_type, node, "std::string", "");
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
	const gchar *video_urlKey = "video_url";
	node = json_object_get_member(pJsonObject, video_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&video_url, node, "std::string", "");
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
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PinMediaMetadata> new_list;
			PinMediaMetadata inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PinMediaMetadata")) {
					jsonToValue(&inst, temp_json, "PinMediaMetadata", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

PinMedia::PinMedia(char* json)
{
	this->fromJson(json);
}

char*
PinMedia::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ImageSize")) {
		ImageSize obj = getImages();
		node = converttoJson(&obj, "ImageSize", "");
	}
	else {
		
		ImageSize obj = static_cast<ImageSize> (getImages());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *imagesKey = "images";
	json_object_set_member(pJsonObject, imagesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMediaType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_typeKey = "media_type";
	json_object_set_member(pJsonObject, media_typeKey, node);
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
		std::string obj = getVideoUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *video_urlKey = "video_url";
	json_object_set_member(pJsonObject, video_urlKey, node);
	if (isprimitive("int")) {
		int obj = getWidth();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *widthKey = "width";
	json_object_set_member(pJsonObject, widthKey, node);
	if (isprimitive("PinMediaMetadata")) {
		list<PinMediaMetadata> new_list = static_cast<list <PinMediaMetadata> > (getItems());
		node = converttoJson(&new_list, "PinMediaMetadata", "array");
	} else {
		node = json_node_alloc();
		list<PinMediaMetadata> new_list = static_cast<list <PinMediaMetadata> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PinMediaMetadata>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PinMediaMetadata obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ImageSize
PinMedia::getImages()
{
	return images;
}

void
PinMedia::setImages(ImageSize  images)
{
	this->images = images;
}

std::string
PinMedia::getMediaType()
{
	return media_type;
}

void
PinMedia::setMediaType(std::string  media_type)
{
	this->media_type = media_type;
}

std::string
PinMedia::getCoverImageUrl()
{
	return cover_image_url;
}

void
PinMedia::setCoverImageUrl(std::string  cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

long long
PinMedia::getDuration()
{
	return duration;
}

void
PinMedia::setDuration(long long  duration)
{
	this->duration = duration;
}

int
PinMedia::getHeight()
{
	return height;
}

void
PinMedia::setHeight(int  height)
{
	this->height = height;
}

std::string
PinMedia::getVideoUrl()
{
	return video_url;
}

void
PinMedia::setVideoUrl(std::string  video_url)
{
	this->video_url = video_url;
}

int
PinMedia::getWidth()
{
	return width;
}

void
PinMedia::setWidth(int  width)
{
	this->width = width;
}

std::list<PinMediaMetadata>
PinMedia::getItems()
{
	return items;
}

void
PinMedia::setItems(std::list <PinMediaMetadata> items)
{
	this->items = items;
}


