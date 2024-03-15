#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinUpdate::PinUpdate()
{
	//__init();
}

PinUpdate::~PinUpdate()
{
	//__cleanup();
}

void
PinUpdate::__init()
{
	//alt_text = std::string();
	//board_id = std::string();
	//board_section_id = std::string();
	//description = std::string();
	//link = std::string();
	//title = std::string();
	//new std::list()std::list> carousel_slots;
	//note = std::string();
}

void
PinUpdate::__cleanup()
{
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
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(carousel_slots != NULL) {
	//carousel_slots.RemoveAll(true);
	//delete carousel_slots;
	//carousel_slots = NULL;
	//}
	//if(note != NULL) {
	//
	//delete note;
	//note = NULL;
	//}
	//
}

void
PinUpdate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *carousel_slotsKey = "carousel_slots";
	node = json_object_get_member(pJsonObject, carousel_slotsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PinUpdate_carousel_slots_inner> new_list;
			PinUpdate_carousel_slots_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PinUpdate_carousel_slots_inner")) {
					jsonToValue(&inst, temp_json, "PinUpdate_carousel_slots_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			carousel_slots = new_list;
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

PinUpdate::PinUpdate(char* json)
{
	this->fromJson(json);
}

char*
PinUpdate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("PinUpdate_carousel_slots_inner")) {
		list<PinUpdate_carousel_slots_inner> new_list = static_cast<list <PinUpdate_carousel_slots_inner> > (getCarouselSlots());
		node = converttoJson(&new_list, "PinUpdate_carousel_slots_inner", "array");
	} else {
		node = json_node_alloc();
		list<PinUpdate_carousel_slots_inner> new_list = static_cast<list <PinUpdate_carousel_slots_inner> > (getCarouselSlots());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PinUpdate_carousel_slots_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PinUpdate_carousel_slots_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *carousel_slotsKey = "carousel_slots";
	json_object_set_member(pJsonObject, carousel_slotsKey, node);
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
PinUpdate::getAltText()
{
	return alt_text;
}

void
PinUpdate::setAltText(std::string  alt_text)
{
	this->alt_text = alt_text;
}

std::string
PinUpdate::getBoardId()
{
	return board_id;
}

void
PinUpdate::setBoardId(std::string  board_id)
{
	this->board_id = board_id;
}

std::string
PinUpdate::getBoardSectionId()
{
	return board_section_id;
}

void
PinUpdate::setBoardSectionId(std::string  board_section_id)
{
	this->board_section_id = board_section_id;
}

std::string
PinUpdate::getDescription()
{
	return description;
}

void
PinUpdate::setDescription(std::string  description)
{
	this->description = description;
}

std::string
PinUpdate::getLink()
{
	return link;
}

void
PinUpdate::setLink(std::string  link)
{
	this->link = link;
}

std::string
PinUpdate::getTitle()
{
	return title;
}

void
PinUpdate::setTitle(std::string  title)
{
	this->title = title;
}

std::list<PinUpdate_carousel_slots_inner>
PinUpdate::getCarouselSlots()
{
	return carousel_slots;
}

void
PinUpdate::setCarouselSlots(std::list <PinUpdate_carousel_slots_inner> carousel_slots)
{
	this->carousel_slots = carousel_slots;
}

std::string
PinUpdate::getNote()
{
	return note;
}

void
PinUpdate::setNote(std::string  note)
{
	this->note = note;
}


