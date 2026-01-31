#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PromotionsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PromotionsResponse::PromotionsResponse()
{
	//__init();
}

PromotionsResponse::~PromotionsResponse()
{
	//__cleanup();
}

void
PromotionsResponse::__init()
{
	//new std::list()std::list> promotions;
}

void
PromotionsResponse::__cleanup()
{
	//if(promotions != NULL) {
	//promotions.RemoveAll(true);
	//delete promotions;
	//promotions = NULL;
	//}
	//
}

void
PromotionsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *promotionsKey = "promotions";
	node = json_object_get_member(pJsonObject, promotionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PromotionArrayElement> new_list;
			PromotionArrayElement inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PromotionArrayElement")) {
					jsonToValue(&inst, temp_json, "PromotionArrayElement", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			promotions = new_list;
		}
		
	}
}

PromotionsResponse::PromotionsResponse(char* json)
{
	this->fromJson(json);
}

char*
PromotionsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PromotionArrayElement")) {
		list<PromotionArrayElement> new_list = static_cast<list <PromotionArrayElement> > (getPromotions());
		node = converttoJson(&new_list, "PromotionArrayElement", "array");
	} else {
		node = json_node_alloc();
		list<PromotionArrayElement> new_list = static_cast<list <PromotionArrayElement> > (getPromotions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PromotionArrayElement>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PromotionArrayElement obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *promotionsKey = "promotions";
	json_object_set_member(pJsonObject, promotionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<PromotionArrayElement>
PromotionsResponse::getPromotions()
{
	return promotions;
}

void
PromotionsResponse::setPromotions(std::list <PromotionArrayElement> promotions)
{
	this->promotions = promotions;
}


