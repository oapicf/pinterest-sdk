

#include "PinsSaveRequestCreate.h"

using namespace Tiny;

PinsSaveRequestCreate::PinsSaveRequestCreate()
{
	board_id = std::string();
	board_section_id = std::string();
}

PinsSaveRequestCreate::PinsSaveRequestCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinsSaveRequestCreate::~PinsSaveRequestCreate()
{

}

void
PinsSaveRequestCreate::fromJson(std::string jsonObj)
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
PinsSaveRequestCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["board_id"] = getBoardId();






    object["board_section_id"] = getBoardSectionId();



    return object;

}

std::string
PinsSaveRequestCreate::getBoardId()
{
	return board_id;
}

void
PinsSaveRequestCreate::setBoardId(std::string board_id)
{
	this->board_id = board_id;
}

std::string
PinsSaveRequestCreate::getBoardSectionId()
{
	return board_section_id;
}

void
PinsSaveRequestCreate::setBoardSectionId(std::string board_section_id)
{
	this->board_section_id = board_section_id;
}



