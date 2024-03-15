#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Board_media.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Board_media::Board_media()
{
	//__init();
}

Board_media::~Board_media()
{
	//__cleanup();
}

void
Board_media::__init()
{
	//image_cover_url = std::string();
	//new std::list()std::list> pin_thumbnail_urls;
}

void
Board_media::__cleanup()
{
	//if(image_cover_url != NULL) {
	//
	//delete image_cover_url;
	//image_cover_url = NULL;
	//}
	//if(pin_thumbnail_urls != NULL) {
	//pin_thumbnail_urls.RemoveAll(true);
	//delete pin_thumbnail_urls;
	//pin_thumbnail_urls = NULL;
	//}
	//
}

void
Board_media::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *image_cover_urlKey = "image_cover_url";
	node = json_object_get_member(pJsonObject, image_cover_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&image_cover_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pin_thumbnail_urlsKey = "pin_thumbnail_urls";
	node = json_object_get_member(pJsonObject, pin_thumbnail_urlsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			pin_thumbnail_urls = new_list;
		}
		
	}
}

Board_media::Board_media(char* json)
{
	this->fromJson(json);
}

char*
Board_media::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getImageCoverUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *image_cover_urlKey = "image_cover_url";
	json_object_set_member(pJsonObject, image_cover_urlKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPinThumbnailUrls());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPinThumbnailUrls());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *pin_thumbnail_urlsKey = "pin_thumbnail_urls";
	json_object_set_member(pJsonObject, pin_thumbnail_urlsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Board_media::getImageCoverUrl()
{
	return image_cover_url;
}

void
Board_media::setImageCoverUrl(std::string  image_cover_url)
{
	this->image_cover_url = image_cover_url;
}

std::list<std::string>
Board_media::getPinThumbnailUrls()
{
	return pin_thumbnail_urls;
}

void
Board_media::setPinThumbnailUrls(std::list <std::string> pin_thumbnail_urls)
{
	this->pin_thumbnail_urls = pin_thumbnail_urls;
}


