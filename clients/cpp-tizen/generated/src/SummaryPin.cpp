#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SummaryPin.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SummaryPin::SummaryPin()
{
	//__init();
}

SummaryPin::~SummaryPin()
{
	//__cleanup();
}

void
SummaryPin::__init()
{
	//media = new SummaryPin_media();
	//alt_text = std::string();
	//link = std::string();
	//title = std::string();
	//description = std::string();
}

void
SummaryPin::__cleanup()
{
	//if(media != NULL) {
	//
	//delete media;
	//media = NULL;
	//}
	//if(alt_text != NULL) {
	//
	//delete alt_text;
	//alt_text = NULL;
	//}
	//if(link != NULL) {
	//
	//delete link;
	//link = NULL;
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
	//
}

void
SummaryPin::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mediaKey = "media";
	node = json_object_get_member(pJsonObject, mediaKey);
	if (node !=NULL) {
	

		if (isprimitive("SummaryPin_media")) {
			jsonToValue(&media, node, "SummaryPin_media", "SummaryPin_media");
		} else {
			
			SummaryPin_media* obj = static_cast<SummaryPin_media*> (&media);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *alt_textKey = "alt_text";
	node = json_object_get_member(pJsonObject, alt_textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&alt_text, node, "std::string", "");
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
}

SummaryPin::SummaryPin(char* json)
{
	this->fromJson(json);
}

char*
SummaryPin::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SummaryPin_media")) {
		SummaryPin_media obj = getMedia();
		node = converttoJson(&obj, "SummaryPin_media", "");
	}
	else {
		
		SummaryPin_media obj = static_cast<SummaryPin_media> (getMedia());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mediaKey = "media";
	json_object_set_member(pJsonObject, mediaKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAltText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *alt_textKey = "alt_text";
	json_object_set_member(pJsonObject, alt_textKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *linkKey = "link";
	json_object_set_member(pJsonObject, linkKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

SummaryPin_media
SummaryPin::getMedia()
{
	return media;
}

void
SummaryPin::setMedia(SummaryPin_media  media)
{
	this->media = media;
}

std::string
SummaryPin::getAltText()
{
	return alt_text;
}

void
SummaryPin::setAltText(std::string  alt_text)
{
	this->alt_text = alt_text;
}

std::string
SummaryPin::getLink()
{
	return link;
}

void
SummaryPin::setLink(std::string  link)
{
	this->link = link;
}

std::string
SummaryPin::getTitle()
{
	return title;
}

void
SummaryPin::setTitle(std::string  title)
{
	this->title = title;
}

std::string
SummaryPin::getDescription()
{
	return description;
}

void
SummaryPin::setDescription(std::string  description)
{
	this->description = description;
}


