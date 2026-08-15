

#include "PinCreate.h"

using namespace Tiny;

PinCreate::PinCreate()
{
	alt_text = std::string();
	board_id = std::string();
	board_section_id = std::string();
	description = std::string();
	dominant_color = std::string();
	link = std::string();
	media_source = PinMediaSource();
	parent_pin_id = std::string();
	sponsor_id = std::string();
	title = std::string();
}

PinCreate::PinCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinCreate::~PinCreate()
{

}

void
PinCreate::fromJson(std::string jsonObj)
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

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *dominant_colorKey = "dominant_color";

    if(object.has_key(dominant_colorKey))
    {
        bourne::json value = object[dominant_colorKey];



        jsonToValue(&dominant_color, value, "std::string");


    }

    const char *linkKey = "link";

    if(object.has_key(linkKey))
    {
        bourne::json value = object[linkKey];



        jsonToValue(&link, value, "std::string");


    }

    const char *media_sourceKey = "media_source";

    if(object.has_key(media_sourceKey))
    {
        bourne::json value = object[media_sourceKey];




        PinMediaSource* obj = &media_source;
		obj->fromJson(value.dump());

    }

    const char *parent_pin_idKey = "parent_pin_id";

    if(object.has_key(parent_pin_idKey))
    {
        bourne::json value = object[parent_pin_idKey];



        jsonToValue(&parent_pin_id, value, "std::string");


    }

    const char *sponsor_idKey = "sponsor_id";

    if(object.has_key(sponsor_idKey))
    {
        bourne::json value = object[sponsor_idKey];



        jsonToValue(&sponsor_id, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
PinCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["alt_text"] = getAltText();






    object["board_id"] = getBoardId();






    object["board_section_id"] = getBoardSectionId();






    object["description"] = getDescription();






    object["dominant_color"] = getDominantColor();






    object["link"] = getLink();







	object["media_source"] = getMediaSource().toJson();





    object["parent_pin_id"] = getParentPinId();






    object["sponsor_id"] = getSponsorId();






    object["title"] = getTitle();



    return object;

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
PinCreate::getLink()
{
	return link;
}

void
PinCreate::setLink(std::string  link)
{
	this->link = link;
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
PinCreate::getSponsorId()
{
	return sponsor_id;
}

void
PinCreate::setSponsorId(std::string  sponsor_id)
{
	this->sponsor_id = sponsor_id;
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



