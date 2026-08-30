#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IneligibleProductTagsErrorDetails.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IneligibleProductTagsErrorDetails::IneligibleProductTagsErrorDetails()
{
	//__init();
}

IneligibleProductTagsErrorDetails::~IneligibleProductTagsErrorDetails()
{
	//__cleanup();
}

void
IneligibleProductTagsErrorDetails::__init()
{
	//new std::list()std::list> product_tags;
}

void
IneligibleProductTagsErrorDetails::__cleanup()
{
	//if(product_tags != NULL) {
	//product_tags.RemoveAll(true);
	//delete product_tags;
	//product_tags = NULL;
	//}
	//
}

void
IneligibleProductTagsErrorDetails::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *product_tagsKey = "product_tags";
	node = json_object_get_member(pJsonObject, product_tagsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<IneligibleProductTagErrorItem> new_list;
			IneligibleProductTagErrorItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("IneligibleProductTagErrorItem")) {
					jsonToValue(&inst, temp_json, "IneligibleProductTagErrorItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			product_tags = new_list;
		}
		
	}
}

IneligibleProductTagsErrorDetails::IneligibleProductTagsErrorDetails(char* json)
{
	this->fromJson(json);
}

char*
IneligibleProductTagsErrorDetails::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("IneligibleProductTagErrorItem")) {
		list<IneligibleProductTagErrorItem> new_list = static_cast<list <IneligibleProductTagErrorItem> > (getProductTags());
		node = converttoJson(&new_list, "IneligibleProductTagErrorItem", "array");
	} else {
		node = json_node_alloc();
		list<IneligibleProductTagErrorItem> new_list = static_cast<list <IneligibleProductTagErrorItem> > (getProductTags());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<IneligibleProductTagErrorItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			IneligibleProductTagErrorItem obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *product_tagsKey = "product_tags";
	json_object_set_member(pJsonObject, product_tagsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<IneligibleProductTagErrorItem>
IneligibleProductTagsErrorDetails::getProductTags()
{
	return product_tags;
}

void
IneligibleProductTagsErrorDetails::setProductTags(std::list <IneligibleProductTagErrorItem> product_tags)
{
	this->product_tags = product_tags;
}


