

#include "PinUpdate.h"

using namespace Tiny;

PinUpdate::PinUpdate()
{
	alt_text = std::string();
	board_id = std::string();
	board_section_id = std::string();
	carousel_slots = std::list<CarouselSlot>();
	description = std::string();
	link = std::string();
	title = std::string();
}

PinUpdate::PinUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinUpdate::~PinUpdate()
{

}

void
PinUpdate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *alt_textKey = "alt_text";

    if(object.has_key(alt_textKey))
    {
        bourne::json value = object[alt_textKey];



        jsonToValue(&alt_text, value, "std::string");


    }

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

    const char *carousel_slotsKey = "carousel_slots";

    if(object.has_key(carousel_slotsKey))
    {
        bourne::json value = object[carousel_slotsKey];


        std::list<CarouselSlot> carousel_slots_list;
        CarouselSlot element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            carousel_slots_list.push_back(element);
        }
        carousel_slots = carousel_slots_list;


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *linkKey = "link";

    if(object.has_key(linkKey))
    {
        bourne::json value = object[linkKey];



        jsonToValue(&link, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
PinUpdate::toJson()
{
    bourne::json object = bourne::json::object();





    object["alt_text"] = getAltText();






    object["board_id"] = getBoardId();






    object["board_section_id"] = getBoardSectionId();





    std::list<CarouselSlot> carousel_slots_list = getCarouselSlots();
    bourne::json carousel_slots_arr = bourne::json::array();

    for(auto& var : carousel_slots_list)
    {
        CarouselSlot obj = var;
        carousel_slots_arr.append(obj.toJson());
    }
    object["carousel_slots"] = carousel_slots_arr;







    object["description"] = getDescription();






    object["link"] = getLink();






    object["title"] = getTitle();



    return object;

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

std::list<CarouselSlot>
PinUpdate::getCarouselSlots()
{
	return carousel_slots;
}

void
PinUpdate::setCarouselSlots(std::list <CarouselSlot> carousel_slots)
{
	this->carousel_slots = carousel_slots;
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



