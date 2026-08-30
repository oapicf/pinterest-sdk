#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendingProductCategory.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendingProductCategory::TrendingProductCategory()
{
	//__init();
}

TrendingProductCategory::~TrendingProductCategory()
{
	//__cleanup();
}

void
TrendingProductCategory::__init()
{
	//engagement_type = null;
	//pct_change_mom = int(0);
	//percent_relative_volume = int(0);
	//pinterest_product_category_id = int(0);
	//product_category = std::string();
	//new std::list()std::list> verticals;
}

void
TrendingProductCategory::__cleanup()
{
	//if(engagement_type != NULL) {
	//
	//delete engagement_type;
	//engagement_type = NULL;
	//}
	//if(pct_change_mom != NULL) {
	//
	//delete pct_change_mom;
	//pct_change_mom = NULL;
	//}
	//if(percent_relative_volume != NULL) {
	//
	//delete percent_relative_volume;
	//percent_relative_volume = NULL;
	//}
	//if(pinterest_product_category_id != NULL) {
	//
	//delete pinterest_product_category_id;
	//pinterest_product_category_id = NULL;
	//}
	//if(product_category != NULL) {
	//
	//delete product_category;
	//product_category = NULL;
	//}
	//if(verticals != NULL) {
	//verticals.RemoveAll(true);
	//delete verticals;
	//verticals = NULL;
	//}
	//
}

void
TrendingProductCategory::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *engagement_typeKey = "engagement_type";
	node = json_object_get_member(pJsonObject, engagement_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ProductCategoriesEngagementType")) {
			jsonToValue(&engagement_type, node, "ProductCategoriesEngagementType", "ProductCategoriesEngagementType");
		} else {
			
			ProductCategoriesEngagementType* obj = static_cast<ProductCategoriesEngagementType*> (&engagement_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pct_change_momKey = "pct_change_mom";
	node = json_object_get_member(pJsonObject, pct_change_momKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pct_change_mom, node, "int", "");
		} else {
			
		}
	}
	const gchar *percent_relative_volumeKey = "percent_relative_volume";
	node = json_object_get_member(pJsonObject, percent_relative_volumeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&percent_relative_volume, node, "int", "");
		} else {
			
		}
	}
	const gchar *pinterest_product_category_idKey = "pinterest_product_category_id";
	node = json_object_get_member(pJsonObject, pinterest_product_category_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pinterest_product_category_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *product_categoryKey = "product_category";
	node = json_object_get_member(pJsonObject, product_categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&product_category, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *verticalsKey = "verticals";
	node = json_object_get_member(pJsonObject, verticalsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			verticals = new_list;
		}
		
	}
}

TrendingProductCategory::TrendingProductCategory(char* json)
{
	this->fromJson(json);
}

char*
TrendingProductCategory::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ProductCategoriesEngagementType")) {
		ProductCategoriesEngagementType obj = getEngagementType();
		node = converttoJson(&obj, "ProductCategoriesEngagementType", "");
	}
	else {
		
		ProductCategoriesEngagementType obj = static_cast<ProductCategoriesEngagementType> (getEngagementType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *engagement_typeKey = "engagement_type";
	json_object_set_member(pJsonObject, engagement_typeKey, node);
	if (isprimitive("int")) {
		int obj = getPctChangeMom();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pct_change_momKey = "pct_change_mom";
	json_object_set_member(pJsonObject, pct_change_momKey, node);
	if (isprimitive("int")) {
		int obj = getPercentRelativeVolume();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *percent_relative_volumeKey = "percent_relative_volume";
	json_object_set_member(pJsonObject, percent_relative_volumeKey, node);
	if (isprimitive("int")) {
		int obj = getPinterestProductCategoryId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pinterest_product_category_idKey = "pinterest_product_category_id";
	json_object_set_member(pJsonObject, pinterest_product_category_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProductCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *product_categoryKey = "product_category";
	json_object_set_member(pJsonObject, product_categoryKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getVerticals());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getVerticals());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *verticalsKey = "verticals";
	json_object_set_member(pJsonObject, verticalsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ProductCategoriesEngagementType
TrendingProductCategory::getEngagementType()
{
	return engagement_type;
}

void
TrendingProductCategory::setEngagementType(ProductCategoriesEngagementType  engagement_type)
{
	this->engagement_type = engagement_type;
}

int
TrendingProductCategory::getPctChangeMom()
{
	return pct_change_mom;
}

void
TrendingProductCategory::setPctChangeMom(int  pct_change_mom)
{
	this->pct_change_mom = pct_change_mom;
}

int
TrendingProductCategory::getPercentRelativeVolume()
{
	return percent_relative_volume;
}

void
TrendingProductCategory::setPercentRelativeVolume(int  percent_relative_volume)
{
	this->percent_relative_volume = percent_relative_volume;
}

int
TrendingProductCategory::getPinterestProductCategoryId()
{
	return pinterest_product_category_id;
}

void
TrendingProductCategory::setPinterestProductCategoryId(int  pinterest_product_category_id)
{
	this->pinterest_product_category_id = pinterest_product_category_id;
}

std::string
TrendingProductCategory::getProductCategory()
{
	return product_category;
}

void
TrendingProductCategory::setProductCategory(std::string  product_category)
{
	this->product_category = product_category;
}

std::list<std::string>
TrendingProductCategory::getVerticals()
{
	return verticals;
}

void
TrendingProductCategory::setVerticals(std::list <std::string> verticals)
{
	this->verticals = verticals;
}


