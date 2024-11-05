#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdvancedAuctionItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdvancedAuctionItem::AdvancedAuctionItem()
{
	//__init();
}

AdvancedAuctionItem::~AdvancedAuctionItem()
{
	//__cleanup();
}

void
AdvancedAuctionItem::__init()
{
	//item_id = std::string();
	//country = new Country();
	//language = new Language();
	//bid_options = new AdvancedAuctionBidOptions();
}

void
AdvancedAuctionItem::__cleanup()
{
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//if(bid_options != NULL) {
	//
	//delete bid_options;
	//bid_options = NULL;
	//}
	//
}

void
AdvancedAuctionItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *item_idKey = "item_id";
	node = json_object_get_member(pJsonObject, item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *countryKey = "country";
	node = json_object_get_member(pJsonObject, countryKey);
	if (node !=NULL) {
	

		if (isprimitive("Country")) {
			jsonToValue(&country, node, "Country", "Country");
		} else {
			
			Country* obj = static_cast<Country*> (&country);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *languageKey = "language";
	node = json_object_get_member(pJsonObject, languageKey);
	if (node !=NULL) {
	

		if (isprimitive("Language")) {
			jsonToValue(&language, node, "Language", "Language");
		} else {
			
			Language* obj = static_cast<Language*> (&language);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *bid_optionsKey = "bid_options";
	node = json_object_get_member(pJsonObject, bid_optionsKey);
	if (node !=NULL) {
	

		if (isprimitive("AdvancedAuctionBidOptions")) {
			jsonToValue(&bid_options, node, "AdvancedAuctionBidOptions", "AdvancedAuctionBidOptions");
		} else {
			
			AdvancedAuctionBidOptions* obj = static_cast<AdvancedAuctionBidOptions*> (&bid_options);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdvancedAuctionItem::AdvancedAuctionItem(char* json)
{
	this->fromJson(json);
}

char*
AdvancedAuctionItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
	if (isprimitive("Country")) {
		Country obj = getCountry();
		node = converttoJson(&obj, "Country", "");
	}
	else {
		
		Country obj = static_cast<Country> (getCountry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *countryKey = "country";
	json_object_set_member(pJsonObject, countryKey, node);
	if (isprimitive("Language")) {
		Language obj = getLanguage();
		node = converttoJson(&obj, "Language", "");
	}
	else {
		
		Language obj = static_cast<Language> (getLanguage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *languageKey = "language";
	json_object_set_member(pJsonObject, languageKey, node);
	if (isprimitive("AdvancedAuctionBidOptions")) {
		AdvancedAuctionBidOptions obj = getBidOptions();
		node = converttoJson(&obj, "AdvancedAuctionBidOptions", "");
	}
	else {
		
		AdvancedAuctionBidOptions obj = static_cast<AdvancedAuctionBidOptions> (getBidOptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bid_optionsKey = "bid_options";
	json_object_set_member(pJsonObject, bid_optionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdvancedAuctionItem::getItemId()
{
	return item_id;
}

void
AdvancedAuctionItem::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

Country
AdvancedAuctionItem::getCountry()
{
	return country;
}

void
AdvancedAuctionItem::setCountry(Country  country)
{
	this->country = country;
}

Language
AdvancedAuctionItem::getLanguage()
{
	return language;
}

void
AdvancedAuctionItem::setLanguage(Language  language)
{
	this->language = language;
}

AdvancedAuctionBidOptions
AdvancedAuctionItem::getBidOptions()
{
	return bid_options;
}

void
AdvancedAuctionItem::setBidOptions(AdvancedAuctionBidOptions  bid_options)
{
	this->bid_options = bid_options;
}


