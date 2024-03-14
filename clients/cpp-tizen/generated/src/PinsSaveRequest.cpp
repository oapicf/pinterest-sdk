#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Pins_save_request.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Pins_save_request::Pins_save_request()
{
	//__init();
}

Pins_save_request::~Pins_save_request()
{
	//__cleanup();
}

void
Pins_save_request::__init()
{
	//board_id = std::string();
	//board_section_id = std::string();
}

void
Pins_save_request::__cleanup()
{
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
	//
}

void
Pins_save_request::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
}

Pins_save_request::Pins_save_request(char* json)
{
	this->fromJson(json);
}

char*
Pins_save_request::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Pins_save_request::getBoardId()
{
	return board_id;
}

void
Pins_save_request::setBoardId(std::string  board_id)
{
	this->board_id = board_id;
}

std::string
Pins_save_request::getBoardSectionId()
{
	return board_section_id;
}

void
Pins_save_request::setBoardSectionId(std::string  board_section_id)
{
	this->board_section_id = board_section_id;
}


