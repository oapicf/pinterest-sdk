#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductTagsBulkAddRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductTagsBulkAddRequest::ProductTagsBulkAddRequest()
{
	//__init();
}

ProductTagsBulkAddRequest::~ProductTagsBulkAddRequest()
{
	//__cleanup();
}

void
ProductTagsBulkAddRequest::__init()
{
	//new std::list()std::list> product_tags;
}

void
ProductTagsBulkAddRequest::__cleanup()
{
	//if(product_tags != NULL) {
	//product_tags.RemoveAll(true);
	//delete product_tags;
	//product_tags = NULL;
	//}
	//
}

void
ProductTagsBulkAddRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *product_tagsKey = "product_tags";
	node = json_object_get_member(pJsonObject, product_tagsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ProductTagItem> new_list;
			ProductTagItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ProductTagItem")) {
					jsonToValue(&inst, temp_json, "ProductTagItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			product_tags = new_list;
		}
		
	}
}

ProductTagsBulkAddRequest::ProductTagsBulkAddRequest(char* json)
{
	this->fromJson(json);
}

char*
ProductTagsBulkAddRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ProductTagItem")) {
		list<ProductTagItem> new_list = static_cast<list <ProductTagItem> > (getProductTags());
		node = converttoJson(&new_list, "ProductTagItem", "array");
	} else {
		node = json_node_alloc();
		list<ProductTagItem> new_list = static_cast<list <ProductTagItem> > (getProductTags());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ProductTagItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ProductTagItem obj = *it;
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

std::list<ProductTagItem>
ProductTagsBulkAddRequest::getProductTags()
{
	return product_tags;
}

void
ProductTagsBulkAddRequest::setProductTags(std::list <ProductTagItem> product_tags)
{
	this->product_tags = product_tags;
}


