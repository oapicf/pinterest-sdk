

#include "Pin.h"

using namespace Tiny;

Pin::Pin()
{
	alt_text = std::string();
	board_id = std::string();
	board_owner = null;
	board_section_id = std::string();
	created_at = std::string();
	creative_type = null;
	description = std::string();
	dominant_color = std::string();
	has_been_promoted = bool(false);
	id = std::string();
	is_owner = bool(false);
	is_standard = bool(false);
	link = std::string();
	media = null;
	parent_pin_id = std::string();
	pin_metrics = null;
	title = std::string();
}

Pin::Pin(std::string jsonString)
{
	this->fromJson(jsonString);
}

Pin::~Pin()
{

}

void
Pin::fromJson(std::string jsonObj)
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

    const char *board_ownerKey = "board_owner";

    if(object.has_key(board_ownerKey))
    {
        bourne::json value = object[board_ownerKey];




        BoardOwner* obj = &board_owner;
		obj->fromJson(value.dump());

    }

    const char *board_section_idKey = "board_section_id";

    if(object.has_key(board_section_idKey))
    {
        bourne::json value = object[board_section_idKey];



        jsonToValue(&board_section_id, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "std::string");


    }

    const char *creative_typeKey = "creative_type";

    if(object.has_key(creative_typeKey))
    {
        bourne::json value = object[creative_typeKey];




        CreativeType* obj = &creative_type;
		obj->fromJson(value.dump());

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

    const char *has_been_promotedKey = "has_been_promoted";

    if(object.has_key(has_been_promotedKey))
    {
        bourne::json value = object[has_been_promotedKey];



        jsonToValue(&has_been_promoted, value, "bool");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *is_ownerKey = "is_owner";

    if(object.has_key(is_ownerKey))
    {
        bourne::json value = object[is_ownerKey];



        jsonToValue(&is_owner, value, "bool");


    }

    const char *is_standardKey = "is_standard";

    if(object.has_key(is_standardKey))
    {
        bourne::json value = object[is_standardKey];



        jsonToValue(&is_standard, value, "bool");


    }

    const char *linkKey = "link";

    if(object.has_key(linkKey))
    {
        bourne::json value = object[linkKey];



        jsonToValue(&link, value, "std::string");


    }

    const char *mediaKey = "media";

    if(object.has_key(mediaKey))
    {
        bourne::json value = object[mediaKey];




        PinMedia* obj = &media;
		obj->fromJson(value.dump());

    }

    const char *parent_pin_idKey = "parent_pin_id";

    if(object.has_key(parent_pin_idKey))
    {
        bourne::json value = object[parent_pin_idKey];



        jsonToValue(&parent_pin_id, value, "std::string");


    }

    const char *pin_metricsKey = "pin_metrics";

    if(object.has_key(pin_metricsKey))
    {
        bourne::json value = object[pin_metricsKey];




        Object* obj = &pin_metrics;
		obj->fromJson(value.dump());

    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
Pin::toJson()
{
    bourne::json object = bourne::json::object();





    object["alt_text"] = getAltText();






    object["board_id"] = getBoardId();







	object["board_owner"] = getBoardOwner().toJson();





    object["board_section_id"] = getBoardSectionId();






    object["created_at"] = getCreatedAt();







	object["creative_type"] = getCreativeType().toJson();





    object["description"] = getDescription();






    object["dominant_color"] = getDominantColor();






    object["has_been_promoted"] = isHasBeenPromoted();






    object["id"] = getId();






    object["is_owner"] = isIsOwner();






    object["is_standard"] = isIsStandard();






    object["link"] = getLink();







	object["media"] = getMedia().toJson();





    object["parent_pin_id"] = getParentPinId();







	object["pin_metrics"] = getPinMetrics().toJson();





    object["title"] = getTitle();



    return object;

}

std::string
Pin::getAltText()
{
	return alt_text;
}

void
Pin::setAltText(std::string  alt_text)
{
	this->alt_text = alt_text;
}

std::string
Pin::getBoardId()
{
	return board_id;
}

void
Pin::setBoardId(std::string  board_id)
{
	this->board_id = board_id;
}

BoardOwner
Pin::getBoardOwner()
{
	return board_owner;
}

void
Pin::setBoardOwner(BoardOwner  board_owner)
{
	this->board_owner = board_owner;
}

std::string
Pin::getBoardSectionId()
{
	return board_section_id;
}

void
Pin::setBoardSectionId(std::string  board_section_id)
{
	this->board_section_id = board_section_id;
}

std::string
Pin::getCreatedAt()
{
	return created_at;
}

void
Pin::setCreatedAt(std::string  created_at)
{
	this->created_at = created_at;
}

CreativeType
Pin::getCreativeType()
{
	return creative_type;
}

void
Pin::setCreativeType(CreativeType  creative_type)
{
	this->creative_type = creative_type;
}

std::string
Pin::getDescription()
{
	return description;
}

void
Pin::setDescription(std::string  description)
{
	this->description = description;
}

std::string
Pin::getDominantColor()
{
	return dominant_color;
}

void
Pin::setDominantColor(std::string  dominant_color)
{
	this->dominant_color = dominant_color;
}

bool
Pin::isHasBeenPromoted()
{
	return has_been_promoted;
}

void
Pin::setHasBeenPromoted(bool  has_been_promoted)
{
	this->has_been_promoted = has_been_promoted;
}

std::string
Pin::getId()
{
	return id;
}

void
Pin::setId(std::string  id)
{
	this->id = id;
}

bool
Pin::isIsOwner()
{
	return is_owner;
}

void
Pin::setIsOwner(bool  is_owner)
{
	this->is_owner = is_owner;
}

bool
Pin::isIsStandard()
{
	return is_standard;
}

void
Pin::setIsStandard(bool  is_standard)
{
	this->is_standard = is_standard;
}

std::string
Pin::getLink()
{
	return link;
}

void
Pin::setLink(std::string  link)
{
	this->link = link;
}

PinMedia
Pin::getMedia()
{
	return media;
}

void
Pin::setMedia(PinMedia  media)
{
	this->media = media;
}

std::string
Pin::getParentPinId()
{
	return parent_pin_id;
}

void
Pin::setParentPinId(std::string  parent_pin_id)
{
	this->parent_pin_id = parent_pin_id;
}

Object
Pin::getPinMetrics()
{
	return pin_metrics;
}

void
Pin::setPinMetrics(Object  pin_metrics)
{
	this->pin_metrics = pin_metrics;
}

std::string
Pin::getTitle()
{
	return title;
}

void
Pin::setTitle(std::string  title)
{
	this->title = title;
}



