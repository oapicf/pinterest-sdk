

#include "AggregatedPinComment.h"

using namespace Tiny;

AggregatedPinComment::AggregatedPinComment()
{
	ai_disclosures = null;
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
	is_product = bool(false);
	is_standard = bool(false);
	link = std::string();
	media = null;
	parent_pin_id = std::string();
	pin_metrics = null;
	title = std::string();
}

AggregatedPinComment::AggregatedPinComment(std::string jsonString)
{
	this->fromJson(jsonString);
}

AggregatedPinComment::~AggregatedPinComment()
{

}

void
AggregatedPinComment::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ai_disclosuresKey = "ai_disclosures";

    if(object.has_key(ai_disclosuresKey))
    {
        bourne::json value = object[ai_disclosuresKey];




        AiDisclosures* obj = &ai_disclosures;
		obj->fromJson(value.dump());

    }

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
AggregatedPinComment::toJson()
{
    bourne::json object = bourne::json::object();






	object["ai_disclosures"] = getAiDisclosures().toJson();





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






    object["is_product"] = isIsProduct();






    object["is_standard"] = isIsStandard();






    object["link"] = getLink();







	object["media"] = getMedia().toJson();





    object["parent_pin_id"] = getParentPinId();







	object["pin_metrics"] = getPinMetrics().toJson();





    object["title"] = getTitle();



    return object;

}

AiDisclosures
AggregatedPinComment::getAiDisclosures()
{
	return ai_disclosures;
}

void
AggregatedPinComment::setAiDisclosures(AiDisclosures ai_disclosures)
{
	this->ai_disclosures = ai_disclosures;
}

std::string
AggregatedPinComment::getAltText()
{
	return alt_text;
}

void
AggregatedPinComment::setAltText(std::string alt_text)
{
	this->alt_text = alt_text;
}

std::string
AggregatedPinComment::getBoardId()
{
	return board_id;
}

void
AggregatedPinComment::setBoardId(std::string board_id)
{
	this->board_id = board_id;
}

BoardOwner
AggregatedPinComment::getBoardOwner()
{
	return board_owner;
}

void
AggregatedPinComment::setBoardOwner(BoardOwner board_owner)
{
	this->board_owner = board_owner;
}

std::string
AggregatedPinComment::getBoardSectionId()
{
	return board_section_id;
}

void
AggregatedPinComment::setBoardSectionId(std::string board_section_id)
{
	this->board_section_id = board_section_id;
}

std::string
AggregatedPinComment::getCreatedAt()
{
	return created_at;
}

void
AggregatedPinComment::setCreatedAt(std::string created_at)
{
	this->created_at = created_at;
}

CreativeType
AggregatedPinComment::getCreativeType()
{
	return creative_type;
}

void
AggregatedPinComment::setCreativeType(CreativeType creative_type)
{
	this->creative_type = creative_type;
}

std::string
AggregatedPinComment::getDescription()
{
	return description;
}

void
AggregatedPinComment::setDescription(std::string description)
{
	this->description = description;
}

std::string
AggregatedPinComment::getDominantColor()
{
	return dominant_color;
}

void
AggregatedPinComment::setDominantColor(std::string dominant_color)
{
	this->dominant_color = dominant_color;
}

bool
AggregatedPinComment::isHasBeenPromoted()
{
	return has_been_promoted;
}

void
AggregatedPinComment::setHasBeenPromoted(bool has_been_promoted)
{
	this->has_been_promoted = has_been_promoted;
}

std::string
AggregatedPinComment::getId()
{
	return id;
}

void
AggregatedPinComment::setId(std::string id)
{
	this->id = id;
}

bool
AggregatedPinComment::isIsOwner()
{
	return is_owner;
}

void
AggregatedPinComment::setIsOwner(bool is_owner)
{
	this->is_owner = is_owner;
}

bool
AggregatedPinComment::isIsProduct()
{
	return is_product;
}

void
AggregatedPinComment::setIsProduct(bool is_product)
{
	this->is_product = is_product;
}

bool
AggregatedPinComment::isIsStandard()
{
	return is_standard;
}

void
AggregatedPinComment::setIsStandard(bool is_standard)
{
	this->is_standard = is_standard;
}

std::string
AggregatedPinComment::getLink()
{
	return link;
}

void
AggregatedPinComment::setLink(std::string link)
{
	this->link = link;
}

PinMedia
AggregatedPinComment::getMedia()
{
	return media;
}

void
AggregatedPinComment::setMedia(PinMedia media)
{
	this->media = media;
}

std::string
AggregatedPinComment::getParentPinId()
{
	return parent_pin_id;
}

void
AggregatedPinComment::setParentPinId(std::string parent_pin_id)
{
	this->parent_pin_id = parent_pin_id;
}

Object
AggregatedPinComment::getPinMetrics()
{
	return pin_metrics;
}

void
AggregatedPinComment::setPinMetrics(Object pin_metrics)
{
	this->pin_metrics = pin_metrics;
}

std::string
AggregatedPinComment::getTitle()
{
	return title;
}

void
AggregatedPinComment::setTitle(std::string title)
{
	this->title = title;
}



