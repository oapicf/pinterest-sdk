#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaWithImage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaWithImage::PinMediaWithImage()
{
	//__init();
}

PinMediaWithImage::~PinMediaWithImage()
{
	//__cleanup();
}

void
PinMediaWithImage::__init()
{
	//media_type = std::string();
	//images = new ImageMetadata_images();
}

void
PinMediaWithImage::__cleanup()
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
	//
}

void
PinMediaWithImage::fromJson(char* jsonStr)
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
}

PinMediaWithImage::PinMediaWithImage(char* json)
{
	this->fromJson(json);
}

char*
PinMediaWithImage::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PinMediaWithImage::getMediaType()
{
	return media_type;
}

void
PinMediaWithImage::setMediaType(std::string  media_type)
{
	this->media_type = media_type;
}

ImageMetadata_images
PinMediaWithImage::getImages()
{
	return images;
}

void
PinMediaWithImage::setImages(ImageMetadata_images  images)
{
	this->images = images;
}


