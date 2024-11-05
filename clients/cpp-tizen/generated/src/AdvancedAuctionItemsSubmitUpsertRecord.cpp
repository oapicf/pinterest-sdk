#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdvancedAuctionItemsSubmitUpsertRecord.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdvancedAuctionItemsSubmitUpsertRecord::AdvancedAuctionItemsSubmitUpsertRecord()
{
	//__init();
}

AdvancedAuctionItemsSubmitUpsertRecord::~AdvancedAuctionItemsSubmitUpsertRecord()
{
	//__cleanup();
}

void
AdvancedAuctionItemsSubmitUpsertRecord::__init()
{
	//item_id = std::string();
	//country = new Country();
	//language = new Language();
	//bid_options = new AdvancedAuctionBidOptions();
	//new std::list()std::list> update_mask;
}

void
AdvancedAuctionItemsSubmitUpsertRecord::__cleanup()
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
	//if(update_mask != NULL) {
	//update_mask.RemoveAll(true);
	//delete update_mask;
	//update_mask = NULL;
	//}
	//
}

void
AdvancedAuctionItemsSubmitUpsertRecord::fromJson(char* jsonStr)
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
	const gchar *update_maskKey = "update_mask";
	node = json_object_get_member(pJsonObject, update_maskKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdateMaskBidOptionField> new_list;
			UpdateMaskBidOptionField inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdateMaskBidOptionField")) {
					jsonToValue(&inst, temp_json, "UpdateMaskBidOptionField", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			update_mask = new_list;
		}
		
	}
}

AdvancedAuctionItemsSubmitUpsertRecord::AdvancedAuctionItemsSubmitUpsertRecord(char* json)
{
	this->fromJson(json);
}

char*
AdvancedAuctionItemsSubmitUpsertRecord::toJson()
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
	if (isprimitive("UpdateMaskBidOptionField")) {
		list<UpdateMaskBidOptionField> new_list = static_cast<list <UpdateMaskBidOptionField> > (getUpdateMask());
		node = converttoJson(&new_list, "UpdateMaskBidOptionField", "array");
	} else {
		node = json_node_alloc();
		list<UpdateMaskBidOptionField> new_list = static_cast<list <UpdateMaskBidOptionField> > (getUpdateMask());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdateMaskBidOptionField>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdateMaskBidOptionField obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *update_maskKey = "update_mask";
	json_object_set_member(pJsonObject, update_maskKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdvancedAuctionItemsSubmitUpsertRecord::getItemId()
{
	return item_id;
}

void
AdvancedAuctionItemsSubmitUpsertRecord::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

Country
AdvancedAuctionItemsSubmitUpsertRecord::getCountry()
{
	return country;
}

void
AdvancedAuctionItemsSubmitUpsertRecord::setCountry(Country  country)
{
	this->country = country;
}

Language
AdvancedAuctionItemsSubmitUpsertRecord::getLanguage()
{
	return language;
}

void
AdvancedAuctionItemsSubmitUpsertRecord::setLanguage(Language  language)
{
	this->language = language;
}

AdvancedAuctionBidOptions
AdvancedAuctionItemsSubmitUpsertRecord::getBidOptions()
{
	return bid_options;
}

void
AdvancedAuctionItemsSubmitUpsertRecord::setBidOptions(AdvancedAuctionBidOptions  bid_options)
{
	this->bid_options = bid_options;
}

std::list<UpdateMaskBidOptionField>
AdvancedAuctionItemsSubmitUpsertRecord::getUpdateMask()
{
	return update_mask;
}

void
AdvancedAuctionItemsSubmitUpsertRecord::setUpdateMask(std::list <UpdateMaskBidOptionField> update_mask)
{
	this->update_mask = update_mask;
}


