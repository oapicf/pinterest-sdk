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
	//country = new Country();
	//item_id = std::string();
	//language = new Language();
	//new std::list()std::list> errors;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::__cleanup()
{
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//
}

void
AdvancedAuctionItemsSubmitDeleteRecord::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *item_idKey = "item_id";
	node = json_object_get_member(pJsonObject, item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_id, node, "std::string", "");
		} else {
			
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
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdvancedAuctionOperationError> new_list;
			AdvancedAuctionOperationError inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdvancedAuctionOperationError")) {
					jsonToValue(&inst, temp_json, "AdvancedAuctionOperationError", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
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
	if (isprimitive("std::string")) {
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
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
	if (isprimitive("AdvancedAuctionOperationError")) {
		list<AdvancedAuctionOperationError> new_list = static_cast<list <AdvancedAuctionOperationError> > (getErrors());
		node = converttoJson(&new_list, "AdvancedAuctionOperationError", "array");
	} else {
		node = json_node_alloc();
		list<AdvancedAuctionOperationError> new_list = static_cast<list <AdvancedAuctionOperationError> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdvancedAuctionOperationError>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdvancedAuctionOperationError obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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

std::list<AdvancedAuctionOperationError>
AdvancedAuctionItemsSubmitDeleteRecord::getErrors()
{
	return errors;
}

void
AdvancedAuctionItemsSubmitDeleteRecord::setErrors(std::list <AdvancedAuctionOperationError> errors)
{
	this->errors = errors;
}


