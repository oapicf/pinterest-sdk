#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AggregatedPinComment.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AggregatedPinComment::AggregatedPinComment()
{
	//__init();
}

AggregatedPinComment::~AggregatedPinComment()
{
	//__cleanup();
}

void
AggregatedPinComment::__init()
{
	//ai_disclosures = null;
	//alt_text = std::string();
	//board_id = std::string();
	//board_owner = null;
	//board_section_id = std::string();
	//created_at = null;
	//creative_type = null;
	//description = std::string();
	//dominant_color = std::string();
	//has_been_promoted = bool(false);
	//id = std::string();
	//is_owner = bool(false);
	//is_product = bool(false);
	//is_standard = bool(false);
	//link = std::string();
	//media = null;
	//parent_pin_id = std::string();
	//pin_metrics = null;
	//title = std::string();
}

void
AggregatedPinComment::__cleanup()
{
	//if(ai_disclosures != NULL) {
	//
	//delete ai_disclosures;
	//ai_disclosures = NULL;
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
	//if(board_owner != NULL) {
	//
	//delete board_owner;
	//board_owner = NULL;
	//}
	//if(board_section_id != NULL) {
	//
	//delete board_section_id;
	//board_section_id = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(creative_type != NULL) {
	//
	//delete creative_type;
	//creative_type = NULL;
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
	//if(has_been_promoted != NULL) {
	//
	//delete has_been_promoted;
	//has_been_promoted = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(is_owner != NULL) {
	//
	//delete is_owner;
	//is_owner = NULL;
	//}
	//if(is_product != NULL) {
	//
	//delete is_product;
	//is_product = NULL;
	//}
	//if(is_standard != NULL) {
	//
	//delete is_standard;
	//is_standard = NULL;
	//}
	//if(link != NULL) {
	//
	//delete link;
	//link = NULL;
	//}
	//if(media != NULL) {
	//
	//delete media;
	//media = NULL;
	//}
	//if(parent_pin_id != NULL) {
	//
	//delete parent_pin_id;
	//parent_pin_id = NULL;
	//}
	//if(pin_metrics != NULL) {
	//
	//delete pin_metrics;
	//pin_metrics = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//
}

void
AggregatedPinComment::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ai_disclosuresKey = "ai_disclosures";
	node = json_object_get_member(pJsonObject, ai_disclosuresKey);
	if (node !=NULL) {
	

		if (isprimitive("AiDisclosures")) {
			jsonToValue(&ai_disclosures, node, "AiDisclosures", "AiDisclosures");
		} else {
			
			AiDisclosures* obj = static_cast<AiDisclosures*> (&ai_disclosures);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *board_section_idKey = "board_section_id";
	node = json_object_get_member(pJsonObject, board_section_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&board_section_id, node, "std::string", "");
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
	const gchar *creative_typeKey = "creative_type";
	node = json_object_get_member(pJsonObject, creative_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CreativeType")) {
			jsonToValue(&creative_type, node, "CreativeType", "CreativeType");
		} else {
			
			CreativeType* obj = static_cast<CreativeType*> (&creative_type);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *has_been_promotedKey = "has_been_promoted";
	node = json_object_get_member(pJsonObject, has_been_promotedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&has_been_promoted, node, "bool", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_ownerKey = "is_owner";
	node = json_object_get_member(pJsonObject, is_ownerKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_owner, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_productKey = "is_product";
	node = json_object_get_member(pJsonObject, is_productKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_product, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_standardKey = "is_standard";
	node = json_object_get_member(pJsonObject, is_standardKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_standard, node, "bool", "");
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
	const gchar *parent_pin_idKey = "parent_pin_id";
	node = json_object_get_member(pJsonObject, parent_pin_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&parent_pin_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pin_metricsKey = "pin_metrics";
	node = json_object_get_member(pJsonObject, pin_metricsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pin_metrics, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&pin_metrics);
			obj->fromJson(json_to_string(node, false));
			
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
}

AggregatedPinComment::AggregatedPinComment(char* json)
{
	this->fromJson(json);
}

char*
AggregatedPinComment::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AiDisclosures")) {
		AiDisclosures obj = getAiDisclosures();
		node = converttoJson(&obj, "AiDisclosures", "");
	}
	else {
		
		AiDisclosures obj = static_cast<AiDisclosures> (getAiDisclosures());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ai_disclosuresKey = "ai_disclosures";
	json_object_set_member(pJsonObject, ai_disclosuresKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getBoardSectionId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *board_section_idKey = "board_section_id";
	json_object_set_member(pJsonObject, board_section_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("CreativeType")) {
		CreativeType obj = getCreativeType();
		node = converttoJson(&obj, "CreativeType", "");
	}
	else {
		
		CreativeType obj = static_cast<CreativeType> (getCreativeType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *creative_typeKey = "creative_type";
	json_object_set_member(pJsonObject, creative_typeKey, node);
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
	if (isprimitive("bool")) {
		bool obj = getHasBeenPromoted();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *has_been_promotedKey = "has_been_promoted";
	json_object_set_member(pJsonObject, has_been_promotedKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsOwner();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_ownerKey = "is_owner";
	json_object_set_member(pJsonObject, is_ownerKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsProduct();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_productKey = "is_product";
	json_object_set_member(pJsonObject, is_productKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsStandard();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_standardKey = "is_standard";
	json_object_set_member(pJsonObject, is_standardKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *linkKey = "link";
	json_object_set_member(pJsonObject, linkKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getParentPinId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *parent_pin_idKey = "parent_pin_id";
	json_object_set_member(pJsonObject, parent_pin_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPinMetrics();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getPinMetrics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pin_metricsKey = "pin_metrics";
	json_object_set_member(pJsonObject, pin_metricsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AiDisclosures
AggregatedPinComment::getAiDisclosures()
{
	return ai_disclosures;
}

void
AggregatedPinComment::setAiDisclosures(AiDisclosures  ai_disclosures)
{
	this->ai_disclosures = ai_disclosures;
}

std::string
AggregatedPinComment::getAltText()
{
	return alt_text;
}

void
AggregatedPinComment::setAltText(std::string  alt_text)
{
	this->alt_text = alt_text;
}

std::string
AggregatedPinComment::getBoardId()
{
	return board_id;
}

void
AggregatedPinComment::setBoardId(std::string  board_id)
{
	this->board_id = board_id;
}

BoardOwner
AggregatedPinComment::getBoardOwner()
{
	return board_owner;
}

void
AggregatedPinComment::setBoardOwner(BoardOwner  board_owner)
{
	this->board_owner = board_owner;
}

std::string
AggregatedPinComment::getBoardSectionId()
{
	return board_section_id;
}

void
AggregatedPinComment::setBoardSectionId(std::string  board_section_id)
{
	this->board_section_id = board_section_id;
}

std::string
AggregatedPinComment::getCreatedAt()
{
	return created_at;
}

void
AggregatedPinComment::setCreatedAt(std::string  created_at)
{
	this->created_at = created_at;
}

CreativeType
AggregatedPinComment::getCreativeType()
{
	return creative_type;
}

void
AggregatedPinComment::setCreativeType(CreativeType  creative_type)
{
	this->creative_type = creative_type;
}

std::string
AggregatedPinComment::getDescription()
{
	return description;
}

void
AggregatedPinComment::setDescription(std::string  description)
{
	this->description = description;
}

std::string
AggregatedPinComment::getDominantColor()
{
	return dominant_color;
}

void
AggregatedPinComment::setDominantColor(std::string  dominant_color)
{
	this->dominant_color = dominant_color;
}

bool
AggregatedPinComment::getHasBeenPromoted()
{
	return has_been_promoted;
}

void
AggregatedPinComment::setHasBeenPromoted(bool  has_been_promoted)
{
	this->has_been_promoted = has_been_promoted;
}

std::string
AggregatedPinComment::getId()
{
	return id;
}

void
AggregatedPinComment::setId(std::string  id)
{
	this->id = id;
}

bool
AggregatedPinComment::getIsOwner()
{
	return is_owner;
}

void
AggregatedPinComment::setIsOwner(bool  is_owner)
{
	this->is_owner = is_owner;
}

bool
AggregatedPinComment::getIsProduct()
{
	return is_product;
}

void
AggregatedPinComment::setIsProduct(bool  is_product)
{
	this->is_product = is_product;
}

bool
AggregatedPinComment::getIsStandard()
{
	return is_standard;
}

void
AggregatedPinComment::setIsStandard(bool  is_standard)
{
	this->is_standard = is_standard;
}

std::string
AggregatedPinComment::getLink()
{
	return link;
}

void
AggregatedPinComment::setLink(std::string  link)
{
	this->link = link;
}

PinMedia
AggregatedPinComment::getMedia()
{
	return media;
}

void
AggregatedPinComment::setMedia(PinMedia  media)
{
	this->media = media;
}

std::string
AggregatedPinComment::getParentPinId()
{
	return parent_pin_id;
}

void
AggregatedPinComment::setParentPinId(std::string  parent_pin_id)
{
	this->parent_pin_id = parent_pin_id;
}

std::string
AggregatedPinComment::getPinMetrics()
{
	return pin_metrics;
}

void
AggregatedPinComment::setPinMetrics(std::string  pin_metrics)
{
	this->pin_metrics = pin_metrics;
}

std::string
AggregatedPinComment::getTitle()
{
	return title;
}

void
AggregatedPinComment::setTitle(std::string  title)
{
	this->title = title;
}


