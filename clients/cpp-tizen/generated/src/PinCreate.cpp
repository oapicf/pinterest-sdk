#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinCreate::PinCreate()
{
	//__init();
}

PinCreate::~PinCreate()
{
	//__cleanup();
}

void
PinCreate::__init()
{
	//id = std::string();
	//created_at = null;
	//link = std::string();
	//title = std::string();
	//description = std::string();
	//dominant_color = std::string();
	//alt_text = std::string();
	//board_id = std::string();
	//board_section_id = std::string();
	//board_owner = null;
	//media = null;
	//media_source = null;
	//parent_pin_id = std::string();
	//note = std::string();
}

void
PinCreate::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
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
	//if(dominant_color != NULL) {
	//
	//delete dominant_color;
	//dominant_color = NULL;
	//}
	//if(alt_text != NULL) {
	//
	//delete alt_text;
	//alt_text = NULL;
	//}
	//if(board_id != NULL) {
	//
	//delete board_id;
	//board_id = NULL;
	//}
	//if(board_section_id != NULL) {
	//
	//delete board_section_id;
	//board_section_id = NULL;
	//}
	//if(board_owner != NULL) {
	//
	//delete board_owner;
	//board_owner = NULL;
	//}
	//if(media != NULL) {
	//
	//delete media;
	//media = NULL;
	//}
	//if(media_source != NULL) {
	//
	//delete media_source;
	//media_source = NULL;
	//}
	//if(parent_pin_id != NULL) {
	//
	//delete parent_pin_id;
	//parent_pin_id = NULL;
	//}
	//if(note != NULL) {
	//
	//delete note;
	//note = NULL;
	//}
	//
}

void
PinCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_at, node, "std::string", "");
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
	const gchar *dominant_colorKey = "dominant_color";
	node = json_object_get_member(pJsonObject, dominant_colorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dominant_color, node, "std::string", "");
		} else {
			
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
	const gchar *board_idKey = "board_id";
	node = json_object_get_member(pJsonObject, board_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&board_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *board_section_idKey = "board_section_id";
	node = json_object_get_member(pJsonObject, board_section_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&board_section_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *board_ownerKey = "board_owner";
	node = json_object_get_member(pJsonObject, board_ownerKey);
	if (node !=NULL) {
	

		if (isprimitive("BoardOwner")) {
			jsonToValue(&board_owner, node, "BoardOwner", "BoardOwner");
		} else {
			
			BoardOwner* obj = static_cast<BoardOwner*> (&board_owner);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mediaKey = "media";
	node = json_object_get_member(pJsonObject, mediaKey);
	if (node !=NULL) {
	

		if (isprimitive("PinMedia")) {
			jsonToValue(&media, node, "PinMedia", "PinMedia");
		} else {
			
			PinMedia* obj = static_cast<PinMedia*> (&media);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *media_sourceKey = "media_source";
	node = json_object_get_member(pJsonObject, media_sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("PinMediaSource")) {
			jsonToValue(&media_source, node, "PinMediaSource", "PinMediaSource");
		} else {
			
			PinMediaSource* obj = static_cast<PinMediaSource*> (&media_source);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *parent_pin_idKey = "parent_pin_id";
	node = json_object_get_member(pJsonObject, parent_pin_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&parent_pin_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *noteKey = "note";
	node = json_object_get_member(pJsonObject, noteKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&note, node, "std::string", "");
		} else {
			
		}
	}
}

PinCreate::PinCreate(char* json)
{
	this->fromJson(json);
}

char*
PinCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getDominantColor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dominant_colorKey = "dominant_color";
	json_object_set_member(pJsonObject, dominant_colorKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAltText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *alt_textKey = "alt_text";
	json_object_set_member(pJsonObject, alt_textKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBoardId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *board_idKey = "board_id";
	json_object_set_member(pJsonObject, board_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBoardSectionId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *board_section_idKey = "board_section_id";
	json_object_set_member(pJsonObject, board_section_idKey, node);
	if (isprimitive("BoardOwner")) {
		BoardOwner obj = getBoardOwner();
		node = converttoJson(&obj, "BoardOwner", "");
	}
	else {
		
		BoardOwner obj = static_cast<BoardOwner> (getBoardOwner());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *board_ownerKey = "board_owner";
	json_object_set_member(pJsonObject, board_ownerKey, node);
	if (isprimitive("PinMedia")) {
		PinMedia obj = getMedia();
		node = converttoJson(&obj, "PinMedia", "");
	}
	else {
		
		PinMedia obj = static_cast<PinMedia> (getMedia());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mediaKey = "media";
	json_object_set_member(pJsonObject, mediaKey, node);
	if (isprimitive("PinMediaSource")) {
		PinMediaSource obj = getMediaSource();
		node = converttoJson(&obj, "PinMediaSource", "");
	}
	else {
		
		PinMediaSource obj = static_cast<PinMediaSource> (getMediaSource());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *media_sourceKey = "media_source";
	json_object_set_member(pJsonObject, media_sourceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getParentPinId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *parent_pin_idKey = "parent_pin_id";
	json_object_set_member(pJsonObject, parent_pin_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNote();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *noteKey = "note";
	json_object_set_member(pJsonObject, noteKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PinCreate::getId()
{
	return id;
}

void
PinCreate::setId(std::string  id)
{
	this->id = id;
}

std::string
PinCreate::getCreatedAt()
{
	return created_at;
}

void
PinCreate::setCreatedAt(std::string  created_at)
{
	this->created_at = created_at;
}

std::string
PinCreate::getLink()
{
	return link;
}

void
PinCreate::setLink(std::string  link)
{
	this->link = link;
}

std::string
PinCreate::getTitle()
{
	return title;
}

void
PinCreate::setTitle(std::string  title)
{
	this->title = title;
}

std::string
PinCreate::getDescription()
{
	return description;
}

void
PinCreate::setDescription(std::string  description)
{
	this->description = description;
}

std::string
PinCreate::getDominantColor()
{
	return dominant_color;
}

void
PinCreate::setDominantColor(std::string  dominant_color)
{
	this->dominant_color = dominant_color;
}

std::string
PinCreate::getAltText()
{
	return alt_text;
}

void
PinCreate::setAltText(std::string  alt_text)
{
	this->alt_text = alt_text;
}

std::string
PinCreate::getBoardId()
{
	return board_id;
}

void
PinCreate::setBoardId(std::string  board_id)
{
	this->board_id = board_id;
}

std::string
PinCreate::getBoardSectionId()
{
	return board_section_id;
}

void
PinCreate::setBoardSectionId(std::string  board_section_id)
{
	this->board_section_id = board_section_id;
}

BoardOwner
PinCreate::getBoardOwner()
{
	return board_owner;
}

void
PinCreate::setBoardOwner(BoardOwner  board_owner)
{
	this->board_owner = board_owner;
}

PinMedia
PinCreate::getMedia()
{
	return media;
}

void
PinCreate::setMedia(PinMedia  media)
{
	this->media = media;
}

PinMediaSource
PinCreate::getMediaSource()
{
	return media_source;
}

void
PinCreate::setMediaSource(PinMediaSource  media_source)
{
	this->media_source = media_source;
}

std::string
PinCreate::getParentPinId()
{
	return parent_pin_id;
}

void
PinCreate::setParentPinId(std::string  parent_pin_id)
{
	this->parent_pin_id = parent_pin_id;
}

std::string
PinCreate::getNote()
{
	return note;
}

void
PinCreate::setNote(std::string  note)
{
	this->note = note;
}


