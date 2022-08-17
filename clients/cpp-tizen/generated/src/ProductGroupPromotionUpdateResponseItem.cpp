#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductGroupPromotionUpdateResponseItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductGroupPromotionUpdateResponseItem::ProductGroupPromotionUpdateResponseItem()
{
	//__init();
}

ProductGroupPromotionUpdateResponseItem::~ProductGroupPromotionUpdateResponseItem()
{
	//__cleanup();
}

void
ProductGroupPromotionUpdateResponseItem::__init()
{
	//data = new ProductGroupPromotion();
	//exceptions = new Exception();
}

void
ProductGroupPromotionUpdateResponseItem::__cleanup()
{
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(exceptions != NULL) {
	//
	//delete exceptions;
	//exceptions = NULL;
	//}
	//
}

void
ProductGroupPromotionUpdateResponseItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("ProductGroupPromotion")) {
			jsonToValue(&data, node, "ProductGroupPromotion", "ProductGroupPromotion");
		} else {
			
			ProductGroupPromotion* obj = static_cast<ProductGroupPromotion*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	

		if (isprimitive("Exception")) {
			jsonToValue(&exceptions, node, "Exception", "Exception");
		} else {
			
			Exception* obj = static_cast<Exception*> (&exceptions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ProductGroupPromotionUpdateResponseItem::ProductGroupPromotionUpdateResponseItem(char* json)
{
	this->fromJson(json);
}

char*
ProductGroupPromotionUpdateResponseItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ProductGroupPromotion")) {
		ProductGroupPromotion obj = getData();
		node = converttoJson(&obj, "ProductGroupPromotion", "");
	}
	else {
		
		ProductGroupPromotion obj = static_cast<ProductGroupPromotion> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("Exception")) {
		Exception obj = getExceptions();
		node = converttoJson(&obj, "Exception", "");
	}
	else {
		
		Exception obj = static_cast<Exception> (getExceptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

ProductGroupPromotion
ProductGroupPromotionUpdateResponseItem::getData()
{
	return data;
}

void
ProductGroupPromotionUpdateResponseItem::setData(ProductGroupPromotion  data)
{
	this->data = data;
}

Exception
ProductGroupPromotionUpdateResponseItem::getExceptions()
{
	return exceptions;
}

void
ProductGroupPromotionUpdateResponseItem::setExceptions(Exception  exceptions)
{
	this->exceptions = exceptions;
}


