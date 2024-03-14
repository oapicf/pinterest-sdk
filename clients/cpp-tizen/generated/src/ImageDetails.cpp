#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ImageDetails.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ImageDetails::ImageDetails()
{
	//__init();
}

ImageDetails::~ImageDetails()
{
	//__cleanup();
}

void
ImageDetails::__init()
{
	//width = int(0);
	//height = int(0);
	//url = std::string();
}

void
ImageDetails::__cleanup()
{
	//if(width != NULL) {
	//
	//delete width;
	//width = NULL;
	//}
	//if(height != NULL) {
	//
	//delete height;
	//height = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
ImageDetails::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *widthKey = "width";
	node = json_object_get_member(pJsonObject, widthKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&width, node, "int", "");
		} else {
			
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
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

ImageDetails::ImageDetails(char* json)
{
	this->fromJson(json);
}

char*
ImageDetails::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getWidth();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *widthKey = "width";
	json_object_set_member(pJsonObject, widthKey, node);
	if (isprimitive("int")) {
		int obj = getHeight();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *heightKey = "height";
	json_object_set_member(pJsonObject, heightKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
ImageDetails::getWidth()
{
	return width;
}

void
ImageDetails::setWidth(int  width)
{
	this->width = width;
}

int
ImageDetails::getHeight()
{
	return height;
}

void
ImageDetails::setHeight(int  height)
{
	this->height = height;
}

std::string
ImageDetails::getUrl()
{
	return url;
}

void
ImageDetails::setUrl(std::string  url)
{
	this->url = url;
}


