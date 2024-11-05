#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaWithImage_allOf_images.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaWithImage_allOf_images::PinMediaWithImage_allOf_images()
{
	//__init();
}

PinMediaWithImage_allOf_images::~PinMediaWithImage_allOf_images()
{
	//__cleanup();
}

void
PinMediaWithImage_allOf_images::__init()
{
	//150x150 = null;
	//400x300 = null;
	//600x = null;
	//1200x = null;
}

void
PinMediaWithImage_allOf_images::__cleanup()
{
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
	//if(1200x != NULL) {
	//
	//delete 1200x;
	//1200x = NULL;
	//}
	//
}

void
PinMediaWithImage_allOf_images::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *150x150Key = "150x150";
	node = json_object_get_member(pJsonObject, 150x150Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&150x150, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&150x150);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *400x300Key = "400x300";
	node = json_object_get_member(pJsonObject, 400x300Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&400x300, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&400x300);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *600xKey = "600x";
	node = json_object_get_member(pJsonObject, 600xKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&600x, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&600x);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *1200xKey = "1200x";
	node = json_object_get_member(pJsonObject, 1200xKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&1200x, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&1200x);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PinMediaWithImage_allOf_images::PinMediaWithImage_allOf_images(char* json)
{
	this->fromJson(json);
}

char*
PinMediaWithImage_allOf_images::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = get150x150();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (get150x150());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *150x150Key = "150x150";
	json_object_set_member(pJsonObject, 150x150Key, node);
	if (isprimitive("std::string")) {
		std::string obj = get400x300();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (get400x300());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *400x300Key = "400x300";
	json_object_set_member(pJsonObject, 400x300Key, node);
	if (isprimitive("std::string")) {
		std::string obj = get600x();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (get600x());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *600xKey = "600x";
	json_object_set_member(pJsonObject, 600xKey, node);
	if (isprimitive("std::string")) {
		std::string obj = get1200x();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (get1200x());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *1200xKey = "1200x";
	json_object_set_member(pJsonObject, 1200xKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PinMediaWithImage_allOf_images::get150x150()
{
	return 150x150;
}

void
PinMediaWithImage_allOf_images::set150x150(std::string  150x150)
{
	this->150x150 = 150x150;
}

std::string
PinMediaWithImage_allOf_images::get400x300()
{
	return 400x300;
}

void
PinMediaWithImage_allOf_images::set400x300(std::string  400x300)
{
	this->400x300 = 400x300;
}

std::string
PinMediaWithImage_allOf_images::get600x()
{
	return 600x;
}

void
PinMediaWithImage_allOf_images::set600x(std::string  600x)
{
	this->600x = 600x;
}

std::string
PinMediaWithImage_allOf_images::get1200x()
{
	return 1200x;
}

void
PinMediaWithImage_allOf_images::set1200x(std::string  1200x)
{
	this->1200x = 1200x;
}


