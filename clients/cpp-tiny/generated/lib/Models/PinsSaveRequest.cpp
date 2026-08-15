

#include "Pins_save_request.h"

using namespace Tiny;

Pins_save_request::Pins_save_request()
{
	board_id = std::string();
	board_section_id = std::string();
}

Pins_save_request::Pins_save_request(std::string jsonString)
{
	this->fromJson(jsonString);
}

Pins_save_request::~Pins_save_request()
{

}

void
Pins_save_request::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *board_idKey = "board_id";

    if(object.has_key(board_idKey))
    {
        bourne::json value = object[board_idKey];



        jsonToValue(&board_id, value, "std::string");


    }

    const char *board_section_idKey = "board_section_id";

    if(object.has_key(board_section_idKey))
    {
        bourne::json value = object[board_section_idKey];



        jsonToValue(&board_section_id, value, "std::string");


    }


}

bourne::json
Pins_save_request::toJson()
{
    bourne::json object = bourne::json::object();





    object["board_id"] = getBoardId();






    object["board_section_id"] = getBoardSectionId();



    return object;

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



