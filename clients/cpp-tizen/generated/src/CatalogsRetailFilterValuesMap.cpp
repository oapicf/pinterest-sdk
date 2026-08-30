#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsRetailFilterValuesMap.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsRetailFilterValuesMap::CatalogsRetailFilterValuesMap()
{
	//__init();
}

CatalogsRetailFilterValuesMap::~CatalogsRetailFilterValuesMap()
{
	//__cleanup();
}

void
CatalogsRetailFilterValuesMap::__init()
{
	//new std::list()std::list> ad_image_tags;
	//new std::list()std::list> ad_video_tags;
	//new std::list()std::list> availability;
	//new std::list()std::list> brand;
	//new std::list()std::list> condition;
	//new std::list()std::list> custom_label_0;
	//new std::list()std::list> custom_label_1;
	//new std::list()std::list> custom_label_2;
	//new std::list()std::list> custom_label_3;
	//new std::list()std::list> custom_label_4;
	//new std::list()std::list> gender;
	//new std::list()std::list> google_product_category_0;
	//new std::list()std::list> google_product_category_1;
	//new std::list()std::list> google_product_category_2;
	//new std::list()std::list> google_product_category_3;
	//new std::list()std::list> google_product_category_4;
	//new std::list()std::list> google_product_category_5;
	//new std::list()std::list> google_product_category_6;
	//new std::list()std::list> media_type;
	//new std::list()std::list> product_type_0;
	//new std::list()std::list> product_type_1;
	//new std::list()std::list> product_type_2;
	//new std::list()std::list> product_type_3;
	//new std::list()std::list> product_type_4;
}

void
CatalogsRetailFilterValuesMap::__cleanup()
{
	//if(ad_image_tags != NULL) {
	//ad_image_tags.RemoveAll(true);
	//delete ad_image_tags;
	//ad_image_tags = NULL;
	//}
	//if(ad_video_tags != NULL) {
	//ad_video_tags.RemoveAll(true);
	//delete ad_video_tags;
	//ad_video_tags = NULL;
	//}
	//if(availability != NULL) {
	//availability.RemoveAll(true);
	//delete availability;
	//availability = NULL;
	//}
	//if(brand != NULL) {
	//brand.RemoveAll(true);
	//delete brand;
	//brand = NULL;
	//}
	//if(condition != NULL) {
	//condition.RemoveAll(true);
	//delete condition;
	//condition = NULL;
	//}
	//if(custom_label_0 != NULL) {
	//custom_label_0.RemoveAll(true);
	//delete custom_label_0;
	//custom_label_0 = NULL;
	//}
	//if(custom_label_1 != NULL) {
	//custom_label_1.RemoveAll(true);
	//delete custom_label_1;
	//custom_label_1 = NULL;
	//}
	//if(custom_label_2 != NULL) {
	//custom_label_2.RemoveAll(true);
	//delete custom_label_2;
	//custom_label_2 = NULL;
	//}
	//if(custom_label_3 != NULL) {
	//custom_label_3.RemoveAll(true);
	//delete custom_label_3;
	//custom_label_3 = NULL;
	//}
	//if(custom_label_4 != NULL) {
	//custom_label_4.RemoveAll(true);
	//delete custom_label_4;
	//custom_label_4 = NULL;
	//}
	//if(gender != NULL) {
	//gender.RemoveAll(true);
	//delete gender;
	//gender = NULL;
	//}
	//if(google_product_category_0 != NULL) {
	//google_product_category_0.RemoveAll(true);
	//delete google_product_category_0;
	//google_product_category_0 = NULL;
	//}
	//if(google_product_category_1 != NULL) {
	//google_product_category_1.RemoveAll(true);
	//delete google_product_category_1;
	//google_product_category_1 = NULL;
	//}
	//if(google_product_category_2 != NULL) {
	//google_product_category_2.RemoveAll(true);
	//delete google_product_category_2;
	//google_product_category_2 = NULL;
	//}
	//if(google_product_category_3 != NULL) {
	//google_product_category_3.RemoveAll(true);
	//delete google_product_category_3;
	//google_product_category_3 = NULL;
	//}
	//if(google_product_category_4 != NULL) {
	//google_product_category_4.RemoveAll(true);
	//delete google_product_category_4;
	//google_product_category_4 = NULL;
	//}
	//if(google_product_category_5 != NULL) {
	//google_product_category_5.RemoveAll(true);
	//delete google_product_category_5;
	//google_product_category_5 = NULL;
	//}
	//if(google_product_category_6 != NULL) {
	//google_product_category_6.RemoveAll(true);
	//delete google_product_category_6;
	//google_product_category_6 = NULL;
	//}
	//if(media_type != NULL) {
	//media_type.RemoveAll(true);
	//delete media_type;
	//media_type = NULL;
	//}
	//if(product_type_0 != NULL) {
	//product_type_0.RemoveAll(true);
	//delete product_type_0;
	//product_type_0 = NULL;
	//}
	//if(product_type_1 != NULL) {
	//product_type_1.RemoveAll(true);
	//delete product_type_1;
	//product_type_1 = NULL;
	//}
	//if(product_type_2 != NULL) {
	//product_type_2.RemoveAll(true);
	//delete product_type_2;
	//product_type_2 = NULL;
	//}
	//if(product_type_3 != NULL) {
	//product_type_3.RemoveAll(true);
	//delete product_type_3;
	//product_type_3 = NULL;
	//}
	//if(product_type_4 != NULL) {
	//product_type_4.RemoveAll(true);
	//delete product_type_4;
	//product_type_4 = NULL;
	//}
	//
}

void
CatalogsRetailFilterValuesMap::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_image_tagsKey = "ad_image_tags";
	node = json_object_get_member(pJsonObject, ad_image_tagsKey);
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
			ad_image_tags = new_list;
		}
		
	}
	const gchar *ad_video_tagsKey = "ad_video_tags";
	node = json_object_get_member(pJsonObject, ad_video_tagsKey);
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
			ad_video_tags = new_list;
		}
		
	}
	const gchar *availabilityKey = "availability";
	node = json_object_get_member(pJsonObject, availabilityKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ProductAvailability> new_list;
			ProductAvailability inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ProductAvailability")) {
					jsonToValue(&inst, temp_json, "ProductAvailability", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			availability = new_list;
		}
		
	}
	const gchar *brandKey = "brand";
	node = json_object_get_member(pJsonObject, brandKey);
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
			brand = new_list;
		}
		
	}
	const gchar *conditionKey = "condition";
	node = json_object_get_member(pJsonObject, conditionKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ProductCondition> new_list;
			ProductCondition inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ProductCondition")) {
					jsonToValue(&inst, temp_json, "ProductCondition", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			condition = new_list;
		}
		
	}
	const gchar *custom_label_0Key = "custom_label_0";
	node = json_object_get_member(pJsonObject, custom_label_0Key);
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
			custom_label_0 = new_list;
		}
		
	}
	const gchar *custom_label_1Key = "custom_label_1";
	node = json_object_get_member(pJsonObject, custom_label_1Key);
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
			custom_label_1 = new_list;
		}
		
	}
	const gchar *custom_label_2Key = "custom_label_2";
	node = json_object_get_member(pJsonObject, custom_label_2Key);
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
			custom_label_2 = new_list;
		}
		
	}
	const gchar *custom_label_3Key = "custom_label_3";
	node = json_object_get_member(pJsonObject, custom_label_3Key);
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
			custom_label_3 = new_list;
		}
		
	}
	const gchar *custom_label_4Key = "custom_label_4";
	node = json_object_get_member(pJsonObject, custom_label_4Key);
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
			custom_label_4 = new_list;
		}
		
	}
	const gchar *genderKey = "gender";
	node = json_object_get_member(pJsonObject, genderKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Gender> new_list;
			Gender inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Gender")) {
					jsonToValue(&inst, temp_json, "Gender", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			gender = new_list;
		}
		
	}
	const gchar *google_product_category_0Key = "google_product_category_0";
	node = json_object_get_member(pJsonObject, google_product_category_0Key);
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
			google_product_category_0 = new_list;
		}
		
	}
	const gchar *google_product_category_1Key = "google_product_category_1";
	node = json_object_get_member(pJsonObject, google_product_category_1Key);
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
			google_product_category_1 = new_list;
		}
		
	}
	const gchar *google_product_category_2Key = "google_product_category_2";
	node = json_object_get_member(pJsonObject, google_product_category_2Key);
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
			google_product_category_2 = new_list;
		}
		
	}
	const gchar *google_product_category_3Key = "google_product_category_3";
	node = json_object_get_member(pJsonObject, google_product_category_3Key);
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
			google_product_category_3 = new_list;
		}
		
	}
	const gchar *google_product_category_4Key = "google_product_category_4";
	node = json_object_get_member(pJsonObject, google_product_category_4Key);
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
			google_product_category_4 = new_list;
		}
		
	}
	const gchar *google_product_category_5Key = "google_product_category_5";
	node = json_object_get_member(pJsonObject, google_product_category_5Key);
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
			google_product_category_5 = new_list;
		}
		
	}
	const gchar *google_product_category_6Key = "google_product_category_6";
	node = json_object_get_member(pJsonObject, google_product_category_6Key);
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
			google_product_category_6 = new_list;
		}
		
	}
	const gchar *media_typeKey = "media_type";
	node = json_object_get_member(pJsonObject, media_typeKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MediaType> new_list;
			MediaType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MediaType")) {
					jsonToValue(&inst, temp_json, "MediaType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			media_type = new_list;
		}
		
	}
	const gchar *product_type_0Key = "product_type_0";
	node = json_object_get_member(pJsonObject, product_type_0Key);
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
			product_type_0 = new_list;
		}
		
	}
	const gchar *product_type_1Key = "product_type_1";
	node = json_object_get_member(pJsonObject, product_type_1Key);
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
			product_type_1 = new_list;
		}
		
	}
	const gchar *product_type_2Key = "product_type_2";
	node = json_object_get_member(pJsonObject, product_type_2Key);
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
			product_type_2 = new_list;
		}
		
	}
	const gchar *product_type_3Key = "product_type_3";
	node = json_object_get_member(pJsonObject, product_type_3Key);
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
			product_type_3 = new_list;
		}
		
	}
	const gchar *product_type_4Key = "product_type_4";
	node = json_object_get_member(pJsonObject, product_type_4Key);
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
			product_type_4 = new_list;
		}
		
	}
}

CatalogsRetailFilterValuesMap::CatalogsRetailFilterValuesMap(char* json)
{
	this->fromJson(json);
}

char*
CatalogsRetailFilterValuesMap::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAdImageTags());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdImageTags());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ad_image_tagsKey = "ad_image_tags";
	json_object_set_member(pJsonObject, ad_image_tagsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAdVideoTags());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdVideoTags());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ad_video_tagsKey = "ad_video_tags";
	json_object_set_member(pJsonObject, ad_video_tagsKey, node);
	if (isprimitive("ProductAvailability")) {
		list<ProductAvailability> new_list = static_cast<list <ProductAvailability> > (getAvailability());
		node = converttoJson(&new_list, "ProductAvailability", "array");
	} else {
		node = json_node_alloc();
		list<ProductAvailability> new_list = static_cast<list <ProductAvailability> > (getAvailability());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ProductAvailability>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ProductAvailability obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *availabilityKey = "availability";
	json_object_set_member(pJsonObject, availabilityKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getBrand());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getBrand());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *brandKey = "brand";
	json_object_set_member(pJsonObject, brandKey, node);
	if (isprimitive("ProductCondition")) {
		list<ProductCondition> new_list = static_cast<list <ProductCondition> > (getCondition());
		node = converttoJson(&new_list, "ProductCondition", "array");
	} else {
		node = json_node_alloc();
		list<ProductCondition> new_list = static_cast<list <ProductCondition> > (getCondition());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ProductCondition>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ProductCondition obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *conditionKey = "condition";
	json_object_set_member(pJsonObject, conditionKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel0());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel0());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_label_0Key = "custom_label_0";
	json_object_set_member(pJsonObject, custom_label_0Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel1());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel1());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_label_1Key = "custom_label_1";
	json_object_set_member(pJsonObject, custom_label_1Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel2());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel2());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_label_2Key = "custom_label_2";
	json_object_set_member(pJsonObject, custom_label_2Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel3());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel3());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_label_3Key = "custom_label_3";
	json_object_set_member(pJsonObject, custom_label_3Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel4());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel4());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_label_4Key = "custom_label_4";
	json_object_set_member(pJsonObject, custom_label_4Key, node);
	if (isprimitive("Gender")) {
		list<Gender> new_list = static_cast<list <Gender> > (getGender());
		node = converttoJson(&new_list, "Gender", "array");
	} else {
		node = json_node_alloc();
		list<Gender> new_list = static_cast<list <Gender> > (getGender());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Gender>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Gender obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *genderKey = "gender";
	json_object_set_member(pJsonObject, genderKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory0());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory0());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_0Key = "google_product_category_0";
	json_object_set_member(pJsonObject, google_product_category_0Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory1());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory1());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_1Key = "google_product_category_1";
	json_object_set_member(pJsonObject, google_product_category_1Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory2());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory2());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_2Key = "google_product_category_2";
	json_object_set_member(pJsonObject, google_product_category_2Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory3());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory3());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_3Key = "google_product_category_3";
	json_object_set_member(pJsonObject, google_product_category_3Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory4());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory4());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_4Key = "google_product_category_4";
	json_object_set_member(pJsonObject, google_product_category_4Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory5());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory5());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_5Key = "google_product_category_5";
	json_object_set_member(pJsonObject, google_product_category_5Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory6());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory6());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_6Key = "google_product_category_6";
	json_object_set_member(pJsonObject, google_product_category_6Key, node);
	if (isprimitive("MediaType")) {
		list<MediaType> new_list = static_cast<list <MediaType> > (getMediaType());
		node = converttoJson(&new_list, "MediaType", "array");
	} else {
		node = json_node_alloc();
		list<MediaType> new_list = static_cast<list <MediaType> > (getMediaType());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MediaType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MediaType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *media_typeKey = "media_type";
	json_object_set_member(pJsonObject, media_typeKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getProductType0());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getProductType0());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *product_type_0Key = "product_type_0";
	json_object_set_member(pJsonObject, product_type_0Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getProductType1());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getProductType1());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *product_type_1Key = "product_type_1";
	json_object_set_member(pJsonObject, product_type_1Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getProductType2());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getProductType2());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *product_type_2Key = "product_type_2";
	json_object_set_member(pJsonObject, product_type_2Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getProductType3());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getProductType3());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *product_type_3Key = "product_type_3";
	json_object_set_member(pJsonObject, product_type_3Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getProductType4());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getProductType4());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *product_type_4Key = "product_type_4";
	json_object_set_member(pJsonObject, product_type_4Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getAdImageTags()
{
	return ad_image_tags;
}

void
CatalogsRetailFilterValuesMap::setAdImageTags(std::list <std::string> ad_image_tags)
{
	this->ad_image_tags = ad_image_tags;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getAdVideoTags()
{
	return ad_video_tags;
}

void
CatalogsRetailFilterValuesMap::setAdVideoTags(std::list <std::string> ad_video_tags)
{
	this->ad_video_tags = ad_video_tags;
}

std::list<ProductAvailability>
CatalogsRetailFilterValuesMap::getAvailability()
{
	return availability;
}

void
CatalogsRetailFilterValuesMap::setAvailability(std::list <ProductAvailability> availability)
{
	this->availability = availability;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getBrand()
{
	return brand;
}

void
CatalogsRetailFilterValuesMap::setBrand(std::list <std::string> brand)
{
	this->brand = brand;
}

std::list<ProductCondition>
CatalogsRetailFilterValuesMap::getCondition()
{
	return condition;
}

void
CatalogsRetailFilterValuesMap::setCondition(std::list <ProductCondition> condition)
{
	this->condition = condition;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getCustomLabel0()
{
	return custom_label_0;
}

void
CatalogsRetailFilterValuesMap::setCustomLabel0(std::list <std::string> custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getCustomLabel1()
{
	return custom_label_1;
}

void
CatalogsRetailFilterValuesMap::setCustomLabel1(std::list <std::string> custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getCustomLabel2()
{
	return custom_label_2;
}

void
CatalogsRetailFilterValuesMap::setCustomLabel2(std::list <std::string> custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getCustomLabel3()
{
	return custom_label_3;
}

void
CatalogsRetailFilterValuesMap::setCustomLabel3(std::list <std::string> custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getCustomLabel4()
{
	return custom_label_4;
}

void
CatalogsRetailFilterValuesMap::setCustomLabel4(std::list <std::string> custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::list<Gender>
CatalogsRetailFilterValuesMap::getGender()
{
	return gender;
}

void
CatalogsRetailFilterValuesMap::setGender(std::list <Gender> gender)
{
	this->gender = gender;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory0()
{
	return google_product_category_0;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory0(std::list <std::string> google_product_category_0)
{
	this->google_product_category_0 = google_product_category_0;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory1()
{
	return google_product_category_1;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory1(std::list <std::string> google_product_category_1)
{
	this->google_product_category_1 = google_product_category_1;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory2()
{
	return google_product_category_2;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory2(std::list <std::string> google_product_category_2)
{
	this->google_product_category_2 = google_product_category_2;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory3()
{
	return google_product_category_3;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory3(std::list <std::string> google_product_category_3)
{
	this->google_product_category_3 = google_product_category_3;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory4()
{
	return google_product_category_4;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory4(std::list <std::string> google_product_category_4)
{
	this->google_product_category_4 = google_product_category_4;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory5()
{
	return google_product_category_5;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory5(std::list <std::string> google_product_category_5)
{
	this->google_product_category_5 = google_product_category_5;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory6()
{
	return google_product_category_6;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory6(std::list <std::string> google_product_category_6)
{
	this->google_product_category_6 = google_product_category_6;
}

std::list<MediaType>
CatalogsRetailFilterValuesMap::getMediaType()
{
	return media_type;
}

void
CatalogsRetailFilterValuesMap::setMediaType(std::list <MediaType> media_type)
{
	this->media_type = media_type;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getProductType0()
{
	return product_type_0;
}

void
CatalogsRetailFilterValuesMap::setProductType0(std::list <std::string> product_type_0)
{
	this->product_type_0 = product_type_0;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getProductType1()
{
	return product_type_1;
}

void
CatalogsRetailFilterValuesMap::setProductType1(std::list <std::string> product_type_1)
{
	this->product_type_1 = product_type_1;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getProductType2()
{
	return product_type_2;
}

void
CatalogsRetailFilterValuesMap::setProductType2(std::list <std::string> product_type_2)
{
	this->product_type_2 = product_type_2;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getProductType3()
{
	return product_type_3;
}

void
CatalogsRetailFilterValuesMap::setProductType3(std::list <std::string> product_type_3)
{
	this->product_type_3 = product_type_3;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getProductType4()
{
	return product_type_4;
}

void
CatalogsRetailFilterValuesMap::setProductType4(std::list <std::string> product_type_4)
{
	this->product_type_4 = product_type_4;
}


