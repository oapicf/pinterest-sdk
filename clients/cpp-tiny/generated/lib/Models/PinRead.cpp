

#include "PinRead.h"

using namespace Tiny;

PinRead::PinRead()
{
	ai_disclosures = null;
	board_id = std::string();
	board_owner = null;
	board_section_id = std::string();
	created_at = std::string();
	creative_type = null;
	dominant_color = std::string();
	has_been_promoted = bool(false);
	id = std::string();
	is_owner = bool(false);
	is_product = bool(false);
	is_standard = bool(false);
	media = null;
	parent_pin_id = std::string();
	pin_metrics = null;
	alt_text = std::string();
	description = std::string();
	link = std::string();
	title = std::string();
}

PinRead::PinRead(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinRead::~PinRead()
{

}

void
PinRead::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ai_disclosuresKey = "ai_disclosures";

    if(object.has_key(ai_disclosuresKey))
    {
        bourne::json value = object[ai_disclosuresKey];




        AiDisclosures* obj = &ai_disclosures;
		obj->fromJson(value.dump());

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

    const char *is_productKey = "is_product";

    if(object.has_key(is_productKey))
    {
        bourne::json value = object[is_productKey];



        jsonToValue(&is_product, value, "bool");


    }

    const char *is_standardKey = "is_standard";

    if(object.has_key(is_standardKey))
    {
        bourne::json value = object[is_standardKey];



        jsonToValue(&is_standard, value, "bool");


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

    const char *alt_textKey = "alt_text";

    if(object.has_key(alt_textKey))
    {
        bourne::json value = object[alt_textKey];



        jsonToValue(&alt_text, value, "std::string");


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
PinRead::toJson()
{
    bourne::json object = bourne::json::object();






	object["ai_disclosures"] = getAiDisclosures().toJson();





    object["board_id"] = getBoardId();







	object["board_owner"] = getBoardOwner().toJson();





    object["board_section_id"] = getBoardSectionId();






    object["created_at"] = getCreatedAt();







	object["creative_type"] = getCreativeType().toJson();





    object["dominant_color"] = getDominantColor();






    object["has_been_promoted"] = isHasBeenPromoted();






    object["id"] = getId();






    object["is_owner"] = isIsOwner();






    object["is_product"] = isIsProduct();






    object["is_standard"] = isIsStandard();







	object["media"] = getMedia().toJson();





    object["parent_pin_id"] = getParentPinId();







	object["pin_metrics"] = getPinMetrics().toJson();





    object["alt_text"] = getAltText();






    object["description"] = getDescription();






    object["link"] = getLink();






    object["title"] = getTitle();



    return object;

}

AiDisclosures
PinRead::getAiDisclosures()
{
	return ai_disclosures;
}

void
PinRead::setAiDisclosures(AiDisclosures ai_disclosures)
{
	this->ai_disclosures = ai_disclosures;
}

std::string
PinRead::getBoardId()
{
	return board_id;
}

void
PinRead::setBoardId(std::string board_id)
{
	this->board_id = board_id;
}

BoardOwner
PinRead::getBoardOwner()
{
	return board_owner;
}

void
PinRead::setBoardOwner(BoardOwner board_owner)
{
	this->board_owner = board_owner;
}

std::string
PinRead::getBoardSectionId()
{
	return board_section_id;
}

void
PinRead::setBoardSectionId(std::string board_section_id)
{
	this->board_section_id = board_section_id;
}

std::string
PinRead::getCreatedAt()
{
	return created_at;
}

void
PinRead::setCreatedAt(std::string created_at)
{
	this->created_at = created_at;
}

CreativeType
PinRead::getCreativeType()
{
	return creative_type;
}

void
PinRead::setCreativeType(CreativeType creative_type)
{
	this->creative_type = creative_type;
}

std::string
PinRead::getDominantColor()
{
	return dominant_color;
}

void
PinRead::setDominantColor(std::string dominant_color)
{
	this->dominant_color = dominant_color;
}

bool
PinRead::isHasBeenPromoted()
{
	return has_been_promoted;
}

void
PinRead::setHasBeenPromoted(bool has_been_promoted)
{
	this->has_been_promoted = has_been_promoted;
}

std::string
PinRead::getId()
{
	return id;
}

void
PinRead::setId(std::string id)
{
	this->id = id;
}

bool
PinRead::isIsOwner()
{
	return is_owner;
}

void
PinRead::setIsOwner(bool is_owner)
{
	this->is_owner = is_owner;
}

bool
PinRead::isIsProduct()
{
	return is_product;
}

void
PinRead::setIsProduct(bool is_product)
{
	this->is_product = is_product;
}

bool
PinRead::isIsStandard()
{
	return is_standard;
}

void
PinRead::setIsStandard(bool is_standard)
{
	this->is_standard = is_standard;
}

PinMedia
PinRead::getMedia()
{
	return media;
}

void
PinRead::setMedia(PinMedia media)
{
	this->media = media;
}

std::string
PinRead::getParentPinId()
{
	return parent_pin_id;
}

void
PinRead::setParentPinId(std::string parent_pin_id)
{
	this->parent_pin_id = parent_pin_id;
}

Object
PinRead::getPinMetrics()
{
	return pin_metrics;
}

void
PinRead::setPinMetrics(Object pin_metrics)
{
	this->pin_metrics = pin_metrics;
}

std::string
PinRead::getAltText()
{
	return alt_text;
}

void
PinRead::setAltText(std::string alt_text)
{
	this->alt_text = alt_text;
}

std::string
PinRead::getDescription()
{
	return description;
}

void
PinRead::setDescription(std::string description)
{
	this->description = description;
}

std::string
PinRead::getLink()
{
	return link;
}

void
PinRead::setLink(std::string link)
{
	this->link = link;
}

std::string
PinRead::getTitle()
{
	return title;
}

void
PinRead::setTitle(std::string title)
{
	this->title = title;
}



