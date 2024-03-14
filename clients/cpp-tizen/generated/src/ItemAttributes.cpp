#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemAttributes.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemAttributes::ItemAttributes()
{
	//__init();
}

ItemAttributes::~ItemAttributes()
{
	//__cleanup();
}

void
ItemAttributes::__init()
{
	//ad_link = std::string();
	//adult = bool(false);
	//age_group = std::string();
	//availability = std::string();
	//average_review_rating = double(0);
	//brand = std::string();
	//checkout_enabled = bool(false);
	//color = std::string();
	//condition = std::string();
	//custom_label_0 = std::string();
	//custom_label_1 = std::string();
	//custom_label_2 = std::string();
	//custom_label_3 = std::string();
	//custom_label_4 = std::string();
	//description = std::string();
	//free_shipping_label = bool(false);
	//free_shipping_limit = std::string();
	//gender = std::string();
	//google_product_category = std::string();
	//gtin = int(0);
	//id = std::string();
	//item_group_id = std::string();
	//last_updated_time = long(0);
	//link = std::string();
	//material = std::string();
	//min_ad_price = std::string();
	//mobile_link = std::string();
	//mpn = std::string();
	//number_of_ratings = int(0);
	//number_of_reviews = int(0);
	//pattern = std::string();
	//price = std::string();
	//product_type = std::string();
	//sale_price = std::string();
	//shipping = std::string();
	//shipping_height = std::string();
	//shipping_weight = std::string();
	//shipping_width = std::string();
	//size = std::string();
	//size_system = std::string();
	//size_type = std::string();
	//tax = std::string();
	//title = std::string();
	//new std::list()std::list> variant_names;
	//new std::list()std::list> variant_values;
	//new std::list()std::list> additional_image_link;
	//new std::list()std::list> image_link;
}

void
ItemAttributes::__cleanup()
{
	//if(ad_link != NULL) {
	//
	//delete ad_link;
	//ad_link = NULL;
	//}
	//if(adult != NULL) {
	//
	//delete adult;
	//adult = NULL;
	//}
	//if(age_group != NULL) {
	//
	//delete age_group;
	//age_group = NULL;
	//}
	//if(availability != NULL) {
	//
	//delete availability;
	//availability = NULL;
	//}
	//if(average_review_rating != NULL) {
	//
	//delete average_review_rating;
	//average_review_rating = NULL;
	//}
	//if(brand != NULL) {
	//
	//delete brand;
	//brand = NULL;
	//}
	//if(checkout_enabled != NULL) {
	//
	//delete checkout_enabled;
	//checkout_enabled = NULL;
	//}
	//if(color != NULL) {
	//
	//delete color;
	//color = NULL;
	//}
	//if(condition != NULL) {
	//
	//delete condition;
	//condition = NULL;
	//}
	//if(custom_label_0 != NULL) {
	//
	//delete custom_label_0;
	//custom_label_0 = NULL;
	//}
	//if(custom_label_1 != NULL) {
	//
	//delete custom_label_1;
	//custom_label_1 = NULL;
	//}
	//if(custom_label_2 != NULL) {
	//
	//delete custom_label_2;
	//custom_label_2 = NULL;
	//}
	//if(custom_label_3 != NULL) {
	//
	//delete custom_label_3;
	//custom_label_3 = NULL;
	//}
	//if(custom_label_4 != NULL) {
	//
	//delete custom_label_4;
	//custom_label_4 = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(free_shipping_label != NULL) {
	//
	//delete free_shipping_label;
	//free_shipping_label = NULL;
	//}
	//if(free_shipping_limit != NULL) {
	//
	//delete free_shipping_limit;
	//free_shipping_limit = NULL;
	//}
	//if(gender != NULL) {
	//
	//delete gender;
	//gender = NULL;
	//}
	//if(google_product_category != NULL) {
	//
	//delete google_product_category;
	//google_product_category = NULL;
	//}
	//if(gtin != NULL) {
	//
	//delete gtin;
	//gtin = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(item_group_id != NULL) {
	//
	//delete item_group_id;
	//item_group_id = NULL;
	//}
	//if(last_updated_time != NULL) {
	//
	//delete last_updated_time;
	//last_updated_time = NULL;
	//}
	//if(link != NULL) {
	//
	//delete link;
	//link = NULL;
	//}
	//if(material != NULL) {
	//
	//delete material;
	//material = NULL;
	//}
	//if(min_ad_price != NULL) {
	//
	//delete min_ad_price;
	//min_ad_price = NULL;
	//}
	//if(mobile_link != NULL) {
	//
	//delete mobile_link;
	//mobile_link = NULL;
	//}
	//if(mpn != NULL) {
	//
	//delete mpn;
	//mpn = NULL;
	//}
	//if(number_of_ratings != NULL) {
	//
	//delete number_of_ratings;
	//number_of_ratings = NULL;
	//}
	//if(number_of_reviews != NULL) {
	//
	//delete number_of_reviews;
	//number_of_reviews = NULL;
	//}
	//if(pattern != NULL) {
	//
	//delete pattern;
	//pattern = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//if(product_type != NULL) {
	//
	//delete product_type;
	//product_type = NULL;
	//}
	//if(sale_price != NULL) {
	//
	//delete sale_price;
	//sale_price = NULL;
	//}
	//if(shipping != NULL) {
	//
	//delete shipping;
	//shipping = NULL;
	//}
	//if(shipping_height != NULL) {
	//
	//delete shipping_height;
	//shipping_height = NULL;
	//}
	//if(shipping_weight != NULL) {
	//
	//delete shipping_weight;
	//shipping_weight = NULL;
	//}
	//if(shipping_width != NULL) {
	//
	//delete shipping_width;
	//shipping_width = NULL;
	//}
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
	//}
	//if(size_system != NULL) {
	//
	//delete size_system;
	//size_system = NULL;
	//}
	//if(size_type != NULL) {
	//
	//delete size_type;
	//size_type = NULL;
	//}
	//if(tax != NULL) {
	//
	//delete tax;
	//tax = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(variant_names != NULL) {
	//variant_names.RemoveAll(true);
	//delete variant_names;
	//variant_names = NULL;
	//}
	//if(variant_values != NULL) {
	//variant_values.RemoveAll(true);
	//delete variant_values;
	//variant_values = NULL;
	//}
	//if(additional_image_link != NULL) {
	//additional_image_link.RemoveAll(true);
	//delete additional_image_link;
	//additional_image_link = NULL;
	//}
	//if(image_link != NULL) {
	//image_link.RemoveAll(true);
	//delete image_link;
	//image_link = NULL;
	//}
	//
}

void
ItemAttributes::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_linkKey = "ad_link";
	node = json_object_get_member(pJsonObject, ad_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *adultKey = "adult";
	node = json_object_get_member(pJsonObject, adultKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&adult, node, "bool", "");
		} else {
			
		}
	}
	const gchar *age_groupKey = "age_group";
	node = json_object_get_member(pJsonObject, age_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&age_group, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *availabilityKey = "availability";
	node = json_object_get_member(pJsonObject, availabilityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&availability, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *average_review_ratingKey = "average_review_rating";
	node = json_object_get_member(pJsonObject, average_review_ratingKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&average_review_rating, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&average_review_rating);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *brandKey = "brand";
	node = json_object_get_member(pJsonObject, brandKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&brand, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *checkout_enabledKey = "checkout_enabled";
	node = json_object_get_member(pJsonObject, checkout_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&checkout_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *colorKey = "color";
	node = json_object_get_member(pJsonObject, colorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&color, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *conditionKey = "condition";
	node = json_object_get_member(pJsonObject, conditionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&condition, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_0Key = "custom_label_0";
	node = json_object_get_member(pJsonObject, custom_label_0Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_0, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_1Key = "custom_label_1";
	node = json_object_get_member(pJsonObject, custom_label_1Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_1, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_2Key = "custom_label_2";
	node = json_object_get_member(pJsonObject, custom_label_2Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_2, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_3Key = "custom_label_3";
	node = json_object_get_member(pJsonObject, custom_label_3Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_3, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_4Key = "custom_label_4";
	node = json_object_get_member(pJsonObject, custom_label_4Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_4, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *free_shipping_labelKey = "free_shipping_label";
	node = json_object_get_member(pJsonObject, free_shipping_labelKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&free_shipping_label, node, "bool", "");
		} else {
			
		}
	}
	const gchar *free_shipping_limitKey = "free_shipping_limit";
	node = json_object_get_member(pJsonObject, free_shipping_limitKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&free_shipping_limit, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *genderKey = "gender";
	node = json_object_get_member(pJsonObject, genderKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&gender, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *google_product_categoryKey = "google_product_category";
	node = json_object_get_member(pJsonObject, google_product_categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&google_product_category, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *gtinKey = "gtin";
	node = json_object_get_member(pJsonObject, gtinKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&gtin, node, "int", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *item_group_idKey = "item_group_id";
	node = json_object_get_member(pJsonObject, item_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_group_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *last_updated_timeKey = "last_updated_time";
	node = json_object_get_member(pJsonObject, last_updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&last_updated_time, node, "long long", "");
		} else {
			
		}
	}
	const gchar *linkKey = "link";
	node = json_object_get_member(pJsonObject, linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *materialKey = "material";
	node = json_object_get_member(pJsonObject, materialKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&material, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *min_ad_priceKey = "min_ad_price";
	node = json_object_get_member(pJsonObject, min_ad_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&min_ad_price, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *mobile_linkKey = "mobile_link";
	node = json_object_get_member(pJsonObject, mobile_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&mobile_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *mpnKey = "mpn";
	node = json_object_get_member(pJsonObject, mpnKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&mpn, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *number_of_ratingsKey = "number_of_ratings";
	node = json_object_get_member(pJsonObject, number_of_ratingsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&number_of_ratings, node, "int", "");
		} else {
			
		}
	}
	const gchar *number_of_reviewsKey = "number_of_reviews";
	node = json_object_get_member(pJsonObject, number_of_reviewsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&number_of_reviews, node, "int", "");
		} else {
			
		}
	}
	const gchar *patternKey = "pattern";
	node = json_object_get_member(pJsonObject, patternKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pattern, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *priceKey = "price";
	node = json_object_get_member(pJsonObject, priceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&price, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *product_typeKey = "product_type";
	node = json_object_get_member(pJsonObject, product_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&product_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sale_priceKey = "sale_price";
	node = json_object_get_member(pJsonObject, sale_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sale_price, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *shippingKey = "shipping";
	node = json_object_get_member(pJsonObject, shippingKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shipping, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *shipping_heightKey = "shipping_height";
	node = json_object_get_member(pJsonObject, shipping_heightKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shipping_height, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *shipping_weightKey = "shipping_weight";
	node = json_object_get_member(pJsonObject, shipping_weightKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shipping_weight, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *shipping_widthKey = "shipping_width";
	node = json_object_get_member(pJsonObject, shipping_widthKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shipping_width, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&size, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *size_systemKey = "size_system";
	node = json_object_get_member(pJsonObject, size_systemKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&size_system, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *size_typeKey = "size_type";
	node = json_object_get_member(pJsonObject, size_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&size_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *taxKey = "tax";
	node = json_object_get_member(pJsonObject, taxKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&tax, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *variant_namesKey = "variant_names";
	node = json_object_get_member(pJsonObject, variant_namesKey);
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
			variant_names = new_list;
		}
		
	}
	const gchar *variant_valuesKey = "variant_values";
	node = json_object_get_member(pJsonObject, variant_valuesKey);
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
			variant_values = new_list;
		}
		
	}
	const gchar *additional_image_linkKey = "additional_image_link";
	node = json_object_get_member(pJsonObject, additional_image_linkKey);
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
			additional_image_link = new_list;
		}
		
	}
	const gchar *image_linkKey = "image_link";
	node = json_object_get_member(pJsonObject, image_linkKey);
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
			image_link = new_list;
		}
		
	}
}

ItemAttributes::ItemAttributes(char* json)
{
	this->fromJson(json);
}

char*
ItemAttributes::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_linkKey = "ad_link";
	json_object_set_member(pJsonObject, ad_linkKey, node);
	if (isprimitive("bool")) {
		bool obj = getAdult();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *adultKey = "adult";
	json_object_set_member(pJsonObject, adultKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAgeGroup();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *age_groupKey = "age_group";
	json_object_set_member(pJsonObject, age_groupKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAvailability();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *availabilityKey = "availability";
	json_object_set_member(pJsonObject, availabilityKey, node);
	if (isprimitive("long long")) {
		long long obj = getAverageReviewRating();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getAverageReviewRating());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *average_review_ratingKey = "average_review_rating";
	json_object_set_member(pJsonObject, average_review_ratingKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBrand();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *brandKey = "brand";
	json_object_set_member(pJsonObject, brandKey, node);
	if (isprimitive("bool")) {
		bool obj = getCheckoutEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *checkout_enabledKey = "checkout_enabled";
	json_object_set_member(pJsonObject, checkout_enabledKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getColor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *colorKey = "color";
	json_object_set_member(pJsonObject, colorKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCondition();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *conditionKey = "condition";
	json_object_set_member(pJsonObject, conditionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel0();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_0Key = "custom_label_0";
	json_object_set_member(pJsonObject, custom_label_0Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel1();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_1Key = "custom_label_1";
	json_object_set_member(pJsonObject, custom_label_1Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel2();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_2Key = "custom_label_2";
	json_object_set_member(pJsonObject, custom_label_2Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel3();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_3Key = "custom_label_3";
	json_object_set_member(pJsonObject, custom_label_3Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel4();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_4Key = "custom_label_4";
	json_object_set_member(pJsonObject, custom_label_4Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("bool")) {
		bool obj = getFreeShippingLabel();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *free_shipping_labelKey = "free_shipping_label";
	json_object_set_member(pJsonObject, free_shipping_labelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFreeShippingLimit();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *free_shipping_limitKey = "free_shipping_limit";
	json_object_set_member(pJsonObject, free_shipping_limitKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getGender();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *genderKey = "gender";
	json_object_set_member(pJsonObject, genderKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getGoogleProductCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *google_product_categoryKey = "google_product_category";
	json_object_set_member(pJsonObject, google_product_categoryKey, node);
	if (isprimitive("int")) {
		int obj = getGtin();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *gtinKey = "gtin";
	json_object_set_member(pJsonObject, gtinKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_group_idKey = "item_group_id";
	json_object_set_member(pJsonObject, item_group_idKey, node);
	if (isprimitive("long long")) {
		long long obj = getLastUpdatedTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *last_updated_timeKey = "last_updated_time";
	json_object_set_member(pJsonObject, last_updated_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *linkKey = "link";
	json_object_set_member(pJsonObject, linkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMaterial();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *materialKey = "material";
	json_object_set_member(pJsonObject, materialKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMinAdPrice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *min_ad_priceKey = "min_ad_price";
	json_object_set_member(pJsonObject, min_ad_priceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMobileLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *mobile_linkKey = "mobile_link";
	json_object_set_member(pJsonObject, mobile_linkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMpn();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *mpnKey = "mpn";
	json_object_set_member(pJsonObject, mpnKey, node);
	if (isprimitive("int")) {
		int obj = getNumberOfRatings();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *number_of_ratingsKey = "number_of_ratings";
	json_object_set_member(pJsonObject, number_of_ratingsKey, node);
	if (isprimitive("int")) {
		int obj = getNumberOfReviews();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *number_of_reviewsKey = "number_of_reviews";
	json_object_set_member(pJsonObject, number_of_reviewsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPattern();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *patternKey = "pattern";
	json_object_set_member(pJsonObject, patternKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPrice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *priceKey = "price";
	json_object_set_member(pJsonObject, priceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProductType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *product_typeKey = "product_type";
	json_object_set_member(pJsonObject, product_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSalePrice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sale_priceKey = "sale_price";
	json_object_set_member(pJsonObject, sale_priceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShipping();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shippingKey = "shipping";
	json_object_set_member(pJsonObject, shippingKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShippingHeight();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shipping_heightKey = "shipping_height";
	json_object_set_member(pJsonObject, shipping_heightKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShippingWeight();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shipping_weightKey = "shipping_weight";
	json_object_set_member(pJsonObject, shipping_weightKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShippingWidth();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shipping_widthKey = "shipping_width";
	json_object_set_member(pJsonObject, shipping_widthKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSize();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSizeSystem();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *size_systemKey = "size_system";
	json_object_set_member(pJsonObject, size_systemKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSizeType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *size_typeKey = "size_type";
	json_object_set_member(pJsonObject, size_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTax();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *taxKey = "tax";
	json_object_set_member(pJsonObject, taxKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getVariantNames());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getVariantNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *variant_namesKey = "variant_names";
	json_object_set_member(pJsonObject, variant_namesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getVariantValues());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getVariantValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *variant_valuesKey = "variant_values";
	json_object_set_member(pJsonObject, variant_valuesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAdditionalImageLink());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdditionalImageLink());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *additional_image_linkKey = "additional_image_link";
	json_object_set_member(pJsonObject, additional_image_linkKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getImageLink());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getImageLink());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *image_linkKey = "image_link";
	json_object_set_member(pJsonObject, image_linkKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ItemAttributes::getAdLink()
{
	return ad_link;
}

void
ItemAttributes::setAdLink(std::string  ad_link)
{
	this->ad_link = ad_link;
}

bool
ItemAttributes::getAdult()
{
	return adult;
}

void
ItemAttributes::setAdult(bool  adult)
{
	this->adult = adult;
}

std::string
ItemAttributes::getAgeGroup()
{
	return age_group;
}

void
ItemAttributes::setAgeGroup(std::string  age_group)
{
	this->age_group = age_group;
}

std::string
ItemAttributes::getAvailability()
{
	return availability;
}

void
ItemAttributes::setAvailability(std::string  availability)
{
	this->availability = availability;
}

long long
ItemAttributes::getAverageReviewRating()
{
	return average_review_rating;
}

void
ItemAttributes::setAverageReviewRating(long long  average_review_rating)
{
	this->average_review_rating = average_review_rating;
}

std::string
ItemAttributes::getBrand()
{
	return brand;
}

void
ItemAttributes::setBrand(std::string  brand)
{
	this->brand = brand;
}

bool
ItemAttributes::getCheckoutEnabled()
{
	return checkout_enabled;
}

void
ItemAttributes::setCheckoutEnabled(bool  checkout_enabled)
{
	this->checkout_enabled = checkout_enabled;
}

std::string
ItemAttributes::getColor()
{
	return color;
}

void
ItemAttributes::setColor(std::string  color)
{
	this->color = color;
}

std::string
ItemAttributes::getCondition()
{
	return condition;
}

void
ItemAttributes::setCondition(std::string  condition)
{
	this->condition = condition;
}

std::string
ItemAttributes::getCustomLabel0()
{
	return custom_label_0;
}

void
ItemAttributes::setCustomLabel0(std::string  custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::string
ItemAttributes::getCustomLabel1()
{
	return custom_label_1;
}

void
ItemAttributes::setCustomLabel1(std::string  custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::string
ItemAttributes::getCustomLabel2()
{
	return custom_label_2;
}

void
ItemAttributes::setCustomLabel2(std::string  custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::string
ItemAttributes::getCustomLabel3()
{
	return custom_label_3;
}

void
ItemAttributes::setCustomLabel3(std::string  custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::string
ItemAttributes::getCustomLabel4()
{
	return custom_label_4;
}

void
ItemAttributes::setCustomLabel4(std::string  custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::string
ItemAttributes::getDescription()
{
	return description;
}

void
ItemAttributes::setDescription(std::string  description)
{
	this->description = description;
}

bool
ItemAttributes::getFreeShippingLabel()
{
	return free_shipping_label;
}

void
ItemAttributes::setFreeShippingLabel(bool  free_shipping_label)
{
	this->free_shipping_label = free_shipping_label;
}

std::string
ItemAttributes::getFreeShippingLimit()
{
	return free_shipping_limit;
}

void
ItemAttributes::setFreeShippingLimit(std::string  free_shipping_limit)
{
	this->free_shipping_limit = free_shipping_limit;
}

std::string
ItemAttributes::getGender()
{
	return gender;
}

void
ItemAttributes::setGender(std::string  gender)
{
	this->gender = gender;
}

std::string
ItemAttributes::getGoogleProductCategory()
{
	return google_product_category;
}

void
ItemAttributes::setGoogleProductCategory(std::string  google_product_category)
{
	this->google_product_category = google_product_category;
}

int
ItemAttributes::getGtin()
{
	return gtin;
}

void
ItemAttributes::setGtin(int  gtin)
{
	this->gtin = gtin;
}

std::string
ItemAttributes::getId()
{
	return id;
}

void
ItemAttributes::setId(std::string  id)
{
	this->id = id;
}

std::string
ItemAttributes::getItemGroupId()
{
	return item_group_id;
}

void
ItemAttributes::setItemGroupId(std::string  item_group_id)
{
	this->item_group_id = item_group_id;
}

long long
ItemAttributes::getLastUpdatedTime()
{
	return last_updated_time;
}

void
ItemAttributes::setLastUpdatedTime(long long  last_updated_time)
{
	this->last_updated_time = last_updated_time;
}

std::string
ItemAttributes::getLink()
{
	return link;
}

void
ItemAttributes::setLink(std::string  link)
{
	this->link = link;
}

std::string
ItemAttributes::getMaterial()
{
	return material;
}

void
ItemAttributes::setMaterial(std::string  material)
{
	this->material = material;
}

std::string
ItemAttributes::getMinAdPrice()
{
	return min_ad_price;
}

void
ItemAttributes::setMinAdPrice(std::string  min_ad_price)
{
	this->min_ad_price = min_ad_price;
}

std::string
ItemAttributes::getMobileLink()
{
	return mobile_link;
}

void
ItemAttributes::setMobileLink(std::string  mobile_link)
{
	this->mobile_link = mobile_link;
}

std::string
ItemAttributes::getMpn()
{
	return mpn;
}

void
ItemAttributes::setMpn(std::string  mpn)
{
	this->mpn = mpn;
}

int
ItemAttributes::getNumberOfRatings()
{
	return number_of_ratings;
}

void
ItemAttributes::setNumberOfRatings(int  number_of_ratings)
{
	this->number_of_ratings = number_of_ratings;
}

int
ItemAttributes::getNumberOfReviews()
{
	return number_of_reviews;
}

void
ItemAttributes::setNumberOfReviews(int  number_of_reviews)
{
	this->number_of_reviews = number_of_reviews;
}

std::string
ItemAttributes::getPattern()
{
	return pattern;
}

void
ItemAttributes::setPattern(std::string  pattern)
{
	this->pattern = pattern;
}

std::string
ItemAttributes::getPrice()
{
	return price;
}

void
ItemAttributes::setPrice(std::string  price)
{
	this->price = price;
}

std::string
ItemAttributes::getProductType()
{
	return product_type;
}

void
ItemAttributes::setProductType(std::string  product_type)
{
	this->product_type = product_type;
}

std::string
ItemAttributes::getSalePrice()
{
	return sale_price;
}

void
ItemAttributes::setSalePrice(std::string  sale_price)
{
	this->sale_price = sale_price;
}

std::string
ItemAttributes::getShipping()
{
	return shipping;
}

void
ItemAttributes::setShipping(std::string  shipping)
{
	this->shipping = shipping;
}

std::string
ItemAttributes::getShippingHeight()
{
	return shipping_height;
}

void
ItemAttributes::setShippingHeight(std::string  shipping_height)
{
	this->shipping_height = shipping_height;
}

std::string
ItemAttributes::getShippingWeight()
{
	return shipping_weight;
}

void
ItemAttributes::setShippingWeight(std::string  shipping_weight)
{
	this->shipping_weight = shipping_weight;
}

std::string
ItemAttributes::getShippingWidth()
{
	return shipping_width;
}

void
ItemAttributes::setShippingWidth(std::string  shipping_width)
{
	this->shipping_width = shipping_width;
}

std::string
ItemAttributes::getSize()
{
	return size;
}

void
ItemAttributes::setSize(std::string  size)
{
	this->size = size;
}

std::string
ItemAttributes::getSizeSystem()
{
	return size_system;
}

void
ItemAttributes::setSizeSystem(std::string  size_system)
{
	this->size_system = size_system;
}

std::string
ItemAttributes::getSizeType()
{
	return size_type;
}

void
ItemAttributes::setSizeType(std::string  size_type)
{
	this->size_type = size_type;
}

std::string
ItemAttributes::getTax()
{
	return tax;
}

void
ItemAttributes::setTax(std::string  tax)
{
	this->tax = tax;
}

std::string
ItemAttributes::getTitle()
{
	return title;
}

void
ItemAttributes::setTitle(std::string  title)
{
	this->title = title;
}

std::list<std::string>
ItemAttributes::getVariantNames()
{
	return variant_names;
}

void
ItemAttributes::setVariantNames(std::list <std::string> variant_names)
{
	this->variant_names = variant_names;
}

std::list<std::string>
ItemAttributes::getVariantValues()
{
	return variant_values;
}

void
ItemAttributes::setVariantValues(std::list <std::string> variant_values)
{
	this->variant_values = variant_values;
}

std::list<std::string>
ItemAttributes::getAdditionalImageLink()
{
	return additional_image_link;
}

void
ItemAttributes::setAdditionalImageLink(std::list <std::string> additional_image_link)
{
	this->additional_image_link = additional_image_link;
}

std::list<std::string>
ItemAttributes::getImageLink()
{
	return image_link;
}

void
ItemAttributes::setImageLink(std::list <std::string> image_link)
{
	this->image_link = image_link;
}


