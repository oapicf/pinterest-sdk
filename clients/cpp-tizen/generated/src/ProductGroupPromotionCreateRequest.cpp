#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductGroupPromotionCreateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductGroupPromotionCreateRequest::ProductGroupPromotionCreateRequest()
{
	//__init();
}

ProductGroupPromotionCreateRequest::~ProductGroupPromotionCreateRequest()
{
	//__cleanup();
}

void
ProductGroupPromotionCreateRequest::__init()
{
	//ad_group_id = std::string();
	//new std::list()std::list> product_group_promotion;
}

void
ProductGroupPromotionCreateRequest::__cleanup()
{
	//if(ad_group_id != NULL) {
	//
	//delete ad_group_id;
	//ad_group_id = NULL;
	//}
	//if(product_group_promotion != NULL) {
	//product_group_promotion.RemoveAll(true);
	//delete product_group_promotion;
	//product_group_promotion = NULL;
	//}
	//
}

void
ProductGroupPromotionCreateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_group_idKey = "ad_group_id";
	node = json_object_get_member(pJsonObject, ad_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_group_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *product_group_promotionKey = "product_group_promotion";
	node = json_object_get_member(pJsonObject, product_group_promotionKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ProductGroupPromotion> new_list;
			ProductGroupPromotion inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ProductGroupPromotion")) {
					jsonToValue(&inst, temp_json, "ProductGroupPromotion", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			product_group_promotion = new_list;
		}
		
	}
}

ProductGroupPromotionCreateRequest::ProductGroupPromotionCreateRequest(char* json)
{
	this->fromJson(json);
}

char*
ProductGroupPromotionCreateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_group_idKey = "ad_group_id";
	json_object_set_member(pJsonObject, ad_group_idKey, node);
	if (isprimitive("ProductGroupPromotion")) {
		list<ProductGroupPromotion> new_list = static_cast<list <ProductGroupPromotion> > (getProductGroupPromotion());
		node = converttoJson(&new_list, "ProductGroupPromotion", "array");
	} else {
		node = json_node_alloc();
		list<ProductGroupPromotion> new_list = static_cast<list <ProductGroupPromotion> > (getProductGroupPromotion());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ProductGroupPromotion>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ProductGroupPromotion obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *product_group_promotionKey = "product_group_promotion";
	json_object_set_member(pJsonObject, product_group_promotionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ProductGroupPromotionCreateRequest::getAdGroupId()
{
	return ad_group_id;
}

void
ProductGroupPromotionCreateRequest::setAdGroupId(std::string  ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

std::list<ProductGroupPromotion>
ProductGroupPromotionCreateRequest::getProductGroupPromotion()
{
	return product_group_promotion;
}

void
ProductGroupPromotionCreateRequest::setProductGroupPromotion(std::list <ProductGroupPromotion> product_group_promotion)
{
	this->product_group_promotion = product_group_promotion;
}


