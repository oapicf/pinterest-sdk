#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Items.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Items::Items()
{
	//__init();
}

Items::~Items()
{
	//__cleanup();
}

void
Items::__init()
{
	//items = new ProductGroupPromotionCommon();
}

void
Items::__cleanup()
{
	//if(items != NULL) {
	//
	//delete items;
	//items = NULL;
	//}
	//
}

void
Items::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	

		if (isprimitive("ProductGroupPromotionCommon")) {
			jsonToValue(&items, node, "ProductGroupPromotionCommon", "ProductGroupPromotionCommon");
		} else {
			
			ProductGroupPromotionCommon* obj = static_cast<ProductGroupPromotionCommon*> (&items);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Items::Items(char* json)
{
	this->fromJson(json);
}

char*
Items::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ProductGroupPromotionCommon")) {
		ProductGroupPromotionCommon obj = getItems();
		node = converttoJson(&obj, "ProductGroupPromotionCommon", "");
	}
	else {
		
		ProductGroupPromotionCommon obj = static_cast<ProductGroupPromotionCommon> (getItems());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ProductGroupPromotionCommon
Items::getItems()
{
	return items;
}

void
Items::setItems(ProductGroupPromotionCommon  items)
{
	this->items = items;
}


