#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ImageSize.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ImageSize::ImageSize()
{
	//__init();
}

ImageSize::~ImageSize()
{
	//__cleanup();
}

void
ImageSize::__init()
{
	//1200x = new ImageDetails();
	//150x150 = new ImageDetails();
	//400x300 = new ImageDetails();
	//600x = new ImageDetails();
}

void
ImageSize::__cleanup()
{
	//if(1200x != NULL) {
	//
	//delete 1200x;
	//1200x = NULL;
	//}
	//if(150x150 != NULL) {
	//
	//delete 150x150;
	//150x150 = NULL;
	//}
	//if(400x300 != NULL) {
	//
	//delete 400x300;
	//400x300 = NULL;
	//}
	//if(600x != NULL) {
	//
	//delete 600x;
	//600x = NULL;
	//}
	//
}

void
ImageSize::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *1200xKey = "1200x";
	node = json_object_get_member(pJsonObject, 1200xKey);
	if (node !=NULL) {
	

		if (isprimitive("ImageDetails")) {
			jsonToValue(&1200x, node, "ImageDetails", "ImageDetails");
		} else {
			
			ImageDetails* obj = static_cast<ImageDetails*> (&1200x);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *150x150Key = "150x150";
	node = json_object_get_member(pJsonObject, 150x150Key);
	if (node !=NULL) {
	

		if (isprimitive("ImageDetails")) {
			jsonToValue(&150x150, node, "ImageDetails", "ImageDetails");
		} else {
			
			ImageDetails* obj = static_cast<ImageDetails*> (&150x150);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *400x300Key = "400x300";
	node = json_object_get_member(pJsonObject, 400x300Key);
	if (node !=NULL) {
	

		if (isprimitive("ImageDetails")) {
			jsonToValue(&400x300, node, "ImageDetails", "ImageDetails");
		} else {
			
			ImageDetails* obj = static_cast<ImageDetails*> (&400x300);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *600xKey = "600x";
	node = json_object_get_member(pJsonObject, 600xKey);
	if (node !=NULL) {
	

		if (isprimitive("ImageDetails")) {
			jsonToValue(&600x, node, "ImageDetails", "ImageDetails");
		} else {
			
			ImageDetails* obj = static_cast<ImageDetails*> (&600x);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ImageSize::ImageSize(char* json)
{
	this->fromJson(json);
}

char*
ImageSize::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ImageDetails")) {
		ImageDetails obj = get1200x();
		node = converttoJson(&obj, "ImageDetails", "");
	}
	else {
		
		ImageDetails obj = static_cast<ImageDetails> (get1200x());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *1200xKey = "1200x";
	json_object_set_member(pJsonObject, 1200xKey, node);
	if (isprimitive("ImageDetails")) {
		ImageDetails obj = get150x150();
		node = converttoJson(&obj, "ImageDetails", "");
	}
	else {
		
		ImageDetails obj = static_cast<ImageDetails> (get150x150());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *150x150Key = "150x150";
	json_object_set_member(pJsonObject, 150x150Key, node);
	if (isprimitive("ImageDetails")) {
		ImageDetails obj = get400x300();
		node = converttoJson(&obj, "ImageDetails", "");
	}
	else {
		
		ImageDetails obj = static_cast<ImageDetails> (get400x300());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *400x300Key = "400x300";
	json_object_set_member(pJsonObject, 400x300Key, node);
	if (isprimitive("ImageDetails")) {
		ImageDetails obj = get600x();
		node = converttoJson(&obj, "ImageDetails", "");
	}
	else {
		
		ImageDetails obj = static_cast<ImageDetails> (get600x());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *600xKey = "600x";
	json_object_set_member(pJsonObject, 600xKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ImageDetails
ImageSize::get1200x()
{
	return 1200x;
}

void
ImageSize::set1200x(ImageDetails  1200x)
{
	this->1200x = 1200x;
}

ImageDetails
ImageSize::get150x150()
{
	return 150x150;
}

void
ImageSize::set150x150(ImageDetails  150x150)
{
	this->150x150 = 150x150;
}

ImageDetails
ImageSize::get400x300()
{
	return 400x300;
}

void
ImageSize::set400x300(ImageDetails  400x300)
{
	this->400x300 = 400x300;
}

ImageDetails
ImageSize::get600x()
{
	return 600x;
}

void
ImageSize::set600x(ImageDetails  600x)
{
	this->600x = 600x;
}


