#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductGroupPromotionResponseItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductGroupPromotionResponseItem::ProductGroupPromotionResponseItem()
{
	//__init();
}

ProductGroupPromotionResponseItem::~ProductGroupPromotionResponseItem()
{
	//__cleanup();
}

void
ProductGroupPromotionResponseItem::__init()
{
	//data = new ProductGroupPromotionResponseElement();
	//new std::list()std::list> exceptions;
}

void
ProductGroupPromotionResponseItem::__cleanup()
{
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(exceptions != NULL) {
	//exceptions.RemoveAll(true);
	//delete exceptions;
	//exceptions = NULL;
	//}
	//
}

void
ProductGroupPromotionResponseItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("ProductGroupPromotionResponseElement")) {
			jsonToValue(&data, node, "ProductGroupPromotionResponseElement", "ProductGroupPromotionResponseElement");
		} else {
			
			ProductGroupPromotionResponseElement* obj = static_cast<ProductGroupPromotionResponseElement*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Exception> new_list;
			Exception inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Exception")) {
					jsonToValue(&inst, temp_json, "Exception", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			exceptions = new_list;
		}
		
	}
}

ProductGroupPromotionResponseItem::ProductGroupPromotionResponseItem(char* json)
{
	this->fromJson(json);
}

char*
ProductGroupPromotionResponseItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ProductGroupPromotionResponseElement")) {
		ProductGroupPromotionResponseElement obj = getData();
		node = converttoJson(&obj, "ProductGroupPromotionResponseElement", "");
	}
	else {
		
		ProductGroupPromotionResponseElement obj = static_cast<ProductGroupPromotionResponseElement> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("Exception")) {
		list<Exception> new_list = static_cast<list <Exception> > (getExceptions());
		node = converttoJson(&new_list, "Exception", "array");
	} else {
		node = json_node_alloc();
		list<Exception> new_list = static_cast<list <Exception> > (getExceptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Exception>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Exception obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *exceptionsKey = "exceptions";
	json_object_set_member(pJsonObject, exceptionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ProductGroupPromotionResponseElement
ProductGroupPromotionResponseItem::getData()
{
	return data;
}

void
ProductGroupPromotionResponseItem::setData(ProductGroupPromotionResponseElement  data)
{
	this->data = data;
}

std::list<Exception>
ProductGroupPromotionResponseItem::getExceptions()
{
	return exceptions;
}

void
ProductGroupPromotionResponseItem::setExceptions(std::list <Exception> exceptions)
{
	this->exceptions = exceptions;
}


