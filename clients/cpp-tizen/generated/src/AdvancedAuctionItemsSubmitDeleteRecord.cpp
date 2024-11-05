#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdvancedAuctionItemsSubmitDeleteRecord.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdvancedAuctionItemsSubmitDeleteRecord::AdvancedAuctionItemsSubmitDeleteRecord()
{
	//__init();
}

AdvancedAuctionItemsSubmitDeleteRecord::~AdvancedAuctionItemsSubmitDeleteRecord()
{
	//__cleanup();
}

void
AdvancedAuctionItemsSubmitDeleteRecord::__init()
{
	//item_id = std::string();
	//country = new Country();
	//language = new Language();
}

void
AdvancedAuctionItemsSubmitDeleteRecord::__cleanup()
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
	//
}

void
AdvancedAuctionItemsSubmitDeleteRecord::fromJson(char* jsonStr)
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
}

AdvancedAuctionItemsSubmitDeleteRecord::AdvancedAuctionItemsSubmitDeleteRecord(char* json)
{
	this->fromJson(json);
}

char*
AdvancedAuctionItemsSubmitDeleteRecord::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdvancedAuctionItemsSubmitDeleteRecord::getItemId()
{
	return item_id;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

Country
AdvancedAuctionItemsSubmitDeleteRecord::getCountry()
{
	return country;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setCountry(Country  country)
{
	this->country = country;
}

Language
AdvancedAuctionItemsSubmitDeleteRecord::getLanguage()
{
	return language;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setLanguage(Language  language)
{
	this->language = language;
}


