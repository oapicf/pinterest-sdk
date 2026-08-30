#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendingPin.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendingPin::TrendingPin()
{
	//__init();
}

TrendingPin::~TrendingPin()
{
	//__cleanup();
}

void
TrendingPin::__init()
{
	//color = std::string();
	//height = int(0);
	//id = std::string();
	//src = std::string();
	//vertical_offset = double(0);
	//width = int(0);
}

void
TrendingPin::__cleanup()
{
	//if(color != NULL) {
	//
	//delete color;
	//color = NULL;
	//}
	//if(height != NULL) {
	//
	//delete height;
	//height = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(src != NULL) {
	//
	//delete src;
	//src = NULL;
	//}
	//if(vertical_offset != NULL) {
	//
	//delete vertical_offset;
	//vertical_offset = NULL;
	//}
	//if(width != NULL) {
	//
	//delete width;
	//width = NULL;
	//}
	//
}

void
TrendingPin::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *colorKey = "color";
	node = json_object_get_member(pJsonObject, colorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&color, node, "std::string", "");
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *srcKey = "src";
	node = json_object_get_member(pJsonObject, srcKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&src, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *vertical_offsetKey = "vertical_offset";
	node = json_object_get_member(pJsonObject, vertical_offsetKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&vertical_offset, node, "double", "");
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

TrendingPin::TrendingPin(char* json)
{
	this->fromJson(json);
}

char*
TrendingPin::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getColor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *colorKey = "color";
	json_object_set_member(pJsonObject, colorKey, node);
	if (isprimitive("int")) {
		int obj = getHeight();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *heightKey = "height";
	json_object_set_member(pJsonObject, heightKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSrc();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *srcKey = "src";
	json_object_set_member(pJsonObject, srcKey, node);
	if (isprimitive("double")) {
		double obj = getVerticalOffset();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *vertical_offsetKey = "vertical_offset";
	json_object_set_member(pJsonObject, vertical_offsetKey, node);
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
TrendingPin::getColor()
{
	return color;
}

void
TrendingPin::setColor(std::string  color)
{
	this->color = color;
}

int
TrendingPin::getHeight()
{
	return height;
}

void
TrendingPin::setHeight(int  height)
{
	this->height = height;
}

std::string
TrendingPin::getId()
{
	return id;
}

void
TrendingPin::setId(std::string  id)
{
	this->id = id;
}

std::string
TrendingPin::getSrc()
{
	return src;
}

void
TrendingPin::setSrc(std::string  src)
{
	this->src = src;
}

double
TrendingPin::getVerticalOffset()
{
	return vertical_offset;
}

void
TrendingPin::setVerticalOffset(double  vertical_offset)
{
	this->vertical_offset = vertical_offset;
}

int
TrendingPin::getWidth()
{
	return width;
}

void
TrendingPin::setWidth(int  width)
{
	this->width = width;
}


