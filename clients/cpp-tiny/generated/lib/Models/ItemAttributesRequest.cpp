

#include "ItemAttributesRequest.h"

using namespace Tiny;

ItemAttributesRequest::ItemAttributesRequest()
{
	ad_image_0_link = std::string();
	ad_image_0_tag = std::string();
	ad_image_10_link = std::string();
	ad_image_10_tag = std::string();
	ad_image_11_link = std::string();
	ad_image_11_tag = std::string();
	ad_image_12_link = std::string();
	ad_image_12_tag = std::string();
	ad_image_13_link = std::string();
	ad_image_13_tag = std::string();
	ad_image_14_link = std::string();
	ad_image_14_tag = std::string();
	ad_image_15_link = std::string();
	ad_image_15_tag = std::string();
	ad_image_16_link = std::string();
	ad_image_16_tag = std::string();
	ad_image_17_link = std::string();
	ad_image_17_tag = std::string();
	ad_image_18_link = std::string();
	ad_image_18_tag = std::string();
	ad_image_19_link = std::string();
	ad_image_19_tag = std::string();
	ad_image_1_link = std::string();
	ad_image_1_tag = std::string();
	ad_image_2_link = std::string();
	ad_image_2_tag = std::string();
	ad_image_3_link = std::string();
	ad_image_3_tag = std::string();
	ad_image_4_link = std::string();
	ad_image_4_tag = std::string();
	ad_image_5_link = std::string();
	ad_image_5_tag = std::string();
	ad_image_6_link = std::string();
	ad_image_6_tag = std::string();
	ad_image_7_link = std::string();
	ad_image_7_tag = std::string();
	ad_image_8_link = std::string();
	ad_image_8_tag = std::string();
	ad_image_9_link = std::string();
	ad_image_9_tag = std::string();
	ad_link = std::string();
	ad_video_0_link = std::string();
	ad_video_0_tag = std::string();
	ad_video_1_link = std::string();
	ad_video_1_tag = std::string();
	ad_video_2_link = std::string();
	ad_video_2_tag = std::string();
	adult = bool(false);
	age_group = std::string();
	android_deep_link = std::string();
	availability = std::string();
	average_review_rating = float(0);
	brand = std::string();
	checkout_enabled = bool(false);
	color = std::string();
	condition = std::string();
	custom_label_0 = std::string();
	custom_label_1 = std::string();
	custom_label_2 = std::string();
	custom_label_3 = std::string();
	custom_label_4 = std::string();
	custom_number_0 = int(0);
	custom_number_1 = int(0);
	custom_number_2 = int(0);
	custom_number_3 = int(0);
	custom_number_4 = int(0);
	description = std::string();
	free_shipping_label = bool(false);
	free_shipping_limit = std::string();
	gender = std::string();
	google_product_category = std::string();
	gtin = UpdatableItemAttributes_gtin();
	id = std::string();
	installment_price = std::string();
	ios_deep_link = std::string();
	item_group_id = std::string();
	last_updated_time = long(0);
	link = std::string();
	material = std::string();
	min_ad_price = std::string();
	mobile_link = std::string();
	mpn = std::string();
	number_of_ratings = int(0);
	number_of_reviews = int(0);
	pattern = std::string();
	price = std::string();
	product_type = std::string();
	promotion_id = std::string();
	sale_price = std::string();
	sale_price_effective_date = std::string();
	shipping = std::string();
	shipping_height = std::string();
	shipping_weight = std::string();
	shipping_width = std::string();
	size = std::string();
	size_system = std::string();
	size_type = std::string();
	tax = std::string();
	title = std::string();
	unit_pricing_base_measure = std::string();
	unit_pricing_measure = std::string();
	variant_names = std::list<std::string>();
	variant_values = std::list<std::string>();
	additional_image_link = std::list<std::string>();
	image_link = ItemAttributesRequest_allOf_image_link();
	save_pin_disabled = bool(false);
	video_link = std::string();
}

ItemAttributesRequest::ItemAttributesRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemAttributesRequest::~ItemAttributesRequest()
{

}

void
ItemAttributesRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_image_0_linkKey = "ad_image_0_link";

    if(object.has_key(ad_image_0_linkKey))
    {
        bourne::json value = object[ad_image_0_linkKey];



        jsonToValue(&ad_image_0_link, value, "std::string");


    }

    const char *ad_image_0_tagKey = "ad_image_0_tag";

    if(object.has_key(ad_image_0_tagKey))
    {
        bourne::json value = object[ad_image_0_tagKey];



        jsonToValue(&ad_image_0_tag, value, "std::string");


    }

    const char *ad_image_10_linkKey = "ad_image_10_link";

    if(object.has_key(ad_image_10_linkKey))
    {
        bourne::json value = object[ad_image_10_linkKey];



        jsonToValue(&ad_image_10_link, value, "std::string");


    }

    const char *ad_image_10_tagKey = "ad_image_10_tag";

    if(object.has_key(ad_image_10_tagKey))
    {
        bourne::json value = object[ad_image_10_tagKey];



        jsonToValue(&ad_image_10_tag, value, "std::string");


    }

    const char *ad_image_11_linkKey = "ad_image_11_link";

    if(object.has_key(ad_image_11_linkKey))
    {
        bourne::json value = object[ad_image_11_linkKey];



        jsonToValue(&ad_image_11_link, value, "std::string");


    }

    const char *ad_image_11_tagKey = "ad_image_11_tag";

    if(object.has_key(ad_image_11_tagKey))
    {
        bourne::json value = object[ad_image_11_tagKey];



        jsonToValue(&ad_image_11_tag, value, "std::string");


    }

    const char *ad_image_12_linkKey = "ad_image_12_link";

    if(object.has_key(ad_image_12_linkKey))
    {
        bourne::json value = object[ad_image_12_linkKey];



        jsonToValue(&ad_image_12_link, value, "std::string");


    }

    const char *ad_image_12_tagKey = "ad_image_12_tag";

    if(object.has_key(ad_image_12_tagKey))
    {
        bourne::json value = object[ad_image_12_tagKey];



        jsonToValue(&ad_image_12_tag, value, "std::string");


    }

    const char *ad_image_13_linkKey = "ad_image_13_link";

    if(object.has_key(ad_image_13_linkKey))
    {
        bourne::json value = object[ad_image_13_linkKey];



        jsonToValue(&ad_image_13_link, value, "std::string");


    }

    const char *ad_image_13_tagKey = "ad_image_13_tag";

    if(object.has_key(ad_image_13_tagKey))
    {
        bourne::json value = object[ad_image_13_tagKey];



        jsonToValue(&ad_image_13_tag, value, "std::string");


    }

    const char *ad_image_14_linkKey = "ad_image_14_link";

    if(object.has_key(ad_image_14_linkKey))
    {
        bourne::json value = object[ad_image_14_linkKey];



        jsonToValue(&ad_image_14_link, value, "std::string");


    }

    const char *ad_image_14_tagKey = "ad_image_14_tag";

    if(object.has_key(ad_image_14_tagKey))
    {
        bourne::json value = object[ad_image_14_tagKey];



        jsonToValue(&ad_image_14_tag, value, "std::string");


    }

    const char *ad_image_15_linkKey = "ad_image_15_link";

    if(object.has_key(ad_image_15_linkKey))
    {
        bourne::json value = object[ad_image_15_linkKey];



        jsonToValue(&ad_image_15_link, value, "std::string");


    }

    const char *ad_image_15_tagKey = "ad_image_15_tag";

    if(object.has_key(ad_image_15_tagKey))
    {
        bourne::json value = object[ad_image_15_tagKey];



        jsonToValue(&ad_image_15_tag, value, "std::string");


    }

    const char *ad_image_16_linkKey = "ad_image_16_link";

    if(object.has_key(ad_image_16_linkKey))
    {
        bourne::json value = object[ad_image_16_linkKey];



        jsonToValue(&ad_image_16_link, value, "std::string");


    }

    const char *ad_image_16_tagKey = "ad_image_16_tag";

    if(object.has_key(ad_image_16_tagKey))
    {
        bourne::json value = object[ad_image_16_tagKey];



        jsonToValue(&ad_image_16_tag, value, "std::string");


    }

    const char *ad_image_17_linkKey = "ad_image_17_link";

    if(object.has_key(ad_image_17_linkKey))
    {
        bourne::json value = object[ad_image_17_linkKey];



        jsonToValue(&ad_image_17_link, value, "std::string");


    }

    const char *ad_image_17_tagKey = "ad_image_17_tag";

    if(object.has_key(ad_image_17_tagKey))
    {
        bourne::json value = object[ad_image_17_tagKey];



        jsonToValue(&ad_image_17_tag, value, "std::string");


    }

    const char *ad_image_18_linkKey = "ad_image_18_link";

    if(object.has_key(ad_image_18_linkKey))
    {
        bourne::json value = object[ad_image_18_linkKey];



        jsonToValue(&ad_image_18_link, value, "std::string");


    }

    const char *ad_image_18_tagKey = "ad_image_18_tag";

    if(object.has_key(ad_image_18_tagKey))
    {
        bourne::json value = object[ad_image_18_tagKey];



        jsonToValue(&ad_image_18_tag, value, "std::string");


    }

    const char *ad_image_19_linkKey = "ad_image_19_link";

    if(object.has_key(ad_image_19_linkKey))
    {
        bourne::json value = object[ad_image_19_linkKey];



        jsonToValue(&ad_image_19_link, value, "std::string");


    }

    const char *ad_image_19_tagKey = "ad_image_19_tag";

    if(object.has_key(ad_image_19_tagKey))
    {
        bourne::json value = object[ad_image_19_tagKey];



        jsonToValue(&ad_image_19_tag, value, "std::string");


    }

    const char *ad_image_1_linkKey = "ad_image_1_link";

    if(object.has_key(ad_image_1_linkKey))
    {
        bourne::json value = object[ad_image_1_linkKey];



        jsonToValue(&ad_image_1_link, value, "std::string");


    }

    const char *ad_image_1_tagKey = "ad_image_1_tag";

    if(object.has_key(ad_image_1_tagKey))
    {
        bourne::json value = object[ad_image_1_tagKey];



        jsonToValue(&ad_image_1_tag, value, "std::string");


    }

    const char *ad_image_2_linkKey = "ad_image_2_link";

    if(object.has_key(ad_image_2_linkKey))
    {
        bourne::json value = object[ad_image_2_linkKey];



        jsonToValue(&ad_image_2_link, value, "std::string");


    }

    const char *ad_image_2_tagKey = "ad_image_2_tag";

    if(object.has_key(ad_image_2_tagKey))
    {
        bourne::json value = object[ad_image_2_tagKey];



        jsonToValue(&ad_image_2_tag, value, "std::string");


    }

    const char *ad_image_3_linkKey = "ad_image_3_link";

    if(object.has_key(ad_image_3_linkKey))
    {
        bourne::json value = object[ad_image_3_linkKey];



        jsonToValue(&ad_image_3_link, value, "std::string");


    }

    const char *ad_image_3_tagKey = "ad_image_3_tag";

    if(object.has_key(ad_image_3_tagKey))
    {
        bourne::json value = object[ad_image_3_tagKey];



        jsonToValue(&ad_image_3_tag, value, "std::string");


    }

    const char *ad_image_4_linkKey = "ad_image_4_link";

    if(object.has_key(ad_image_4_linkKey))
    {
        bourne::json value = object[ad_image_4_linkKey];



        jsonToValue(&ad_image_4_link, value, "std::string");


    }

    const char *ad_image_4_tagKey = "ad_image_4_tag";

    if(object.has_key(ad_image_4_tagKey))
    {
        bourne::json value = object[ad_image_4_tagKey];



        jsonToValue(&ad_image_4_tag, value, "std::string");


    }

    const char *ad_image_5_linkKey = "ad_image_5_link";

    if(object.has_key(ad_image_5_linkKey))
    {
        bourne::json value = object[ad_image_5_linkKey];



        jsonToValue(&ad_image_5_link, value, "std::string");


    }

    const char *ad_image_5_tagKey = "ad_image_5_tag";

    if(object.has_key(ad_image_5_tagKey))
    {
        bourne::json value = object[ad_image_5_tagKey];



        jsonToValue(&ad_image_5_tag, value, "std::string");


    }

    const char *ad_image_6_linkKey = "ad_image_6_link";

    if(object.has_key(ad_image_6_linkKey))
    {
        bourne::json value = object[ad_image_6_linkKey];



        jsonToValue(&ad_image_6_link, value, "std::string");


    }

    const char *ad_image_6_tagKey = "ad_image_6_tag";

    if(object.has_key(ad_image_6_tagKey))
    {
        bourne::json value = object[ad_image_6_tagKey];



        jsonToValue(&ad_image_6_tag, value, "std::string");


    }

    const char *ad_image_7_linkKey = "ad_image_7_link";

    if(object.has_key(ad_image_7_linkKey))
    {
        bourne::json value = object[ad_image_7_linkKey];



        jsonToValue(&ad_image_7_link, value, "std::string");


    }

    const char *ad_image_7_tagKey = "ad_image_7_tag";

    if(object.has_key(ad_image_7_tagKey))
    {
        bourne::json value = object[ad_image_7_tagKey];



        jsonToValue(&ad_image_7_tag, value, "std::string");


    }

    const char *ad_image_8_linkKey = "ad_image_8_link";

    if(object.has_key(ad_image_8_linkKey))
    {
        bourne::json value = object[ad_image_8_linkKey];



        jsonToValue(&ad_image_8_link, value, "std::string");


    }

    const char *ad_image_8_tagKey = "ad_image_8_tag";

    if(object.has_key(ad_image_8_tagKey))
    {
        bourne::json value = object[ad_image_8_tagKey];



        jsonToValue(&ad_image_8_tag, value, "std::string");


    }

    const char *ad_image_9_linkKey = "ad_image_9_link";

    if(object.has_key(ad_image_9_linkKey))
    {
        bourne::json value = object[ad_image_9_linkKey];



        jsonToValue(&ad_image_9_link, value, "std::string");


    }

    const char *ad_image_9_tagKey = "ad_image_9_tag";

    if(object.has_key(ad_image_9_tagKey))
    {
        bourne::json value = object[ad_image_9_tagKey];



        jsonToValue(&ad_image_9_tag, value, "std::string");


    }

    const char *ad_linkKey = "ad_link";

    if(object.has_key(ad_linkKey))
    {
        bourne::json value = object[ad_linkKey];



        jsonToValue(&ad_link, value, "std::string");


    }

    const char *ad_video_0_linkKey = "ad_video_0_link";

    if(object.has_key(ad_video_0_linkKey))
    {
        bourne::json value = object[ad_video_0_linkKey];



        jsonToValue(&ad_video_0_link, value, "std::string");


    }

    const char *ad_video_0_tagKey = "ad_video_0_tag";

    if(object.has_key(ad_video_0_tagKey))
    {
        bourne::json value = object[ad_video_0_tagKey];



        jsonToValue(&ad_video_0_tag, value, "std::string");


    }

    const char *ad_video_1_linkKey = "ad_video_1_link";

    if(object.has_key(ad_video_1_linkKey))
    {
        bourne::json value = object[ad_video_1_linkKey];



        jsonToValue(&ad_video_1_link, value, "std::string");


    }

    const char *ad_video_1_tagKey = "ad_video_1_tag";

    if(object.has_key(ad_video_1_tagKey))
    {
        bourne::json value = object[ad_video_1_tagKey];



        jsonToValue(&ad_video_1_tag, value, "std::string");


    }

    const char *ad_video_2_linkKey = "ad_video_2_link";

    if(object.has_key(ad_video_2_linkKey))
    {
        bourne::json value = object[ad_video_2_linkKey];



        jsonToValue(&ad_video_2_link, value, "std::string");


    }

    const char *ad_video_2_tagKey = "ad_video_2_tag";

    if(object.has_key(ad_video_2_tagKey))
    {
        bourne::json value = object[ad_video_2_tagKey];



        jsonToValue(&ad_video_2_tag, value, "std::string");


    }

    const char *adultKey = "adult";

    if(object.has_key(adultKey))
    {
        bourne::json value = object[adultKey];



        jsonToValue(&adult, value, "bool");


    }

    const char *age_groupKey = "age_group";

    if(object.has_key(age_groupKey))
    {
        bourne::json value = object[age_groupKey];



        jsonToValue(&age_group, value, "std::string");


    }

    const char *android_deep_linkKey = "android_deep_link";

    if(object.has_key(android_deep_linkKey))
    {
        bourne::json value = object[android_deep_linkKey];



        jsonToValue(&android_deep_link, value, "std::string");


    }

    const char *availabilityKey = "availability";

    if(object.has_key(availabilityKey))
    {
        bourne::json value = object[availabilityKey];



        jsonToValue(&availability, value, "std::string");


    }

    const char *average_review_ratingKey = "average_review_rating";

    if(object.has_key(average_review_ratingKey))
    {
        bourne::json value = object[average_review_ratingKey];



        jsonToValue(&average_review_rating, value, "long");


    }

    const char *brandKey = "brand";

    if(object.has_key(brandKey))
    {
        bourne::json value = object[brandKey];



        jsonToValue(&brand, value, "std::string");


    }

    const char *checkout_enabledKey = "checkout_enabled";

    if(object.has_key(checkout_enabledKey))
    {
        bourne::json value = object[checkout_enabledKey];



        jsonToValue(&checkout_enabled, value, "bool");


    }

    const char *colorKey = "color";

    if(object.has_key(colorKey))
    {
        bourne::json value = object[colorKey];



        jsonToValue(&color, value, "std::string");


    }

    const char *conditionKey = "condition";

    if(object.has_key(conditionKey))
    {
        bourne::json value = object[conditionKey];



        jsonToValue(&condition, value, "std::string");


    }

    const char *custom_label_0Key = "custom_label_0";

    if(object.has_key(custom_label_0Key))
    {
        bourne::json value = object[custom_label_0Key];



        jsonToValue(&custom_label_0, value, "std::string");


    }

    const char *custom_label_1Key = "custom_label_1";

    if(object.has_key(custom_label_1Key))
    {
        bourne::json value = object[custom_label_1Key];



        jsonToValue(&custom_label_1, value, "std::string");


    }

    const char *custom_label_2Key = "custom_label_2";

    if(object.has_key(custom_label_2Key))
    {
        bourne::json value = object[custom_label_2Key];



        jsonToValue(&custom_label_2, value, "std::string");


    }

    const char *custom_label_3Key = "custom_label_3";

    if(object.has_key(custom_label_3Key))
    {
        bourne::json value = object[custom_label_3Key];



        jsonToValue(&custom_label_3, value, "std::string");


    }

    const char *custom_label_4Key = "custom_label_4";

    if(object.has_key(custom_label_4Key))
    {
        bourne::json value = object[custom_label_4Key];



        jsonToValue(&custom_label_4, value, "std::string");


    }

    const char *custom_number_0Key = "custom_number_0";

    if(object.has_key(custom_number_0Key))
    {
        bourne::json value = object[custom_number_0Key];



        jsonToValue(&custom_number_0, value, "int");


    }

    const char *custom_number_1Key = "custom_number_1";

    if(object.has_key(custom_number_1Key))
    {
        bourne::json value = object[custom_number_1Key];



        jsonToValue(&custom_number_1, value, "int");


    }

    const char *custom_number_2Key = "custom_number_2";

    if(object.has_key(custom_number_2Key))
    {
        bourne::json value = object[custom_number_2Key];



        jsonToValue(&custom_number_2, value, "int");


    }

    const char *custom_number_3Key = "custom_number_3";

    if(object.has_key(custom_number_3Key))
    {
        bourne::json value = object[custom_number_3Key];



        jsonToValue(&custom_number_3, value, "int");


    }

    const char *custom_number_4Key = "custom_number_4";

    if(object.has_key(custom_number_4Key))
    {
        bourne::json value = object[custom_number_4Key];



        jsonToValue(&custom_number_4, value, "int");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *free_shipping_labelKey = "free_shipping_label";

    if(object.has_key(free_shipping_labelKey))
    {
        bourne::json value = object[free_shipping_labelKey];



        jsonToValue(&free_shipping_label, value, "bool");


    }

    const char *free_shipping_limitKey = "free_shipping_limit";

    if(object.has_key(free_shipping_limitKey))
    {
        bourne::json value = object[free_shipping_limitKey];



        jsonToValue(&free_shipping_limit, value, "std::string");


    }

    const char *genderKey = "gender";

    if(object.has_key(genderKey))
    {
        bourne::json value = object[genderKey];



        jsonToValue(&gender, value, "std::string");


    }

    const char *google_product_categoryKey = "google_product_category";

    if(object.has_key(google_product_categoryKey))
    {
        bourne::json value = object[google_product_categoryKey];



        jsonToValue(&google_product_category, value, "std::string");


    }

    const char *gtinKey = "gtin";

    if(object.has_key(gtinKey))
    {
        bourne::json value = object[gtinKey];




        UpdatableItemAttributes_gtin* obj = &gtin;
		obj->fromJson(value.dump());

    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *installment_priceKey = "installment_price";

    if(object.has_key(installment_priceKey))
    {
        bourne::json value = object[installment_priceKey];



        jsonToValue(&installment_price, value, "std::string");


    }

    const char *ios_deep_linkKey = "ios_deep_link";

    if(object.has_key(ios_deep_linkKey))
    {
        bourne::json value = object[ios_deep_linkKey];



        jsonToValue(&ios_deep_link, value, "std::string");


    }

    const char *item_group_idKey = "item_group_id";

    if(object.has_key(item_group_idKey))
    {
        bourne::json value = object[item_group_idKey];



        jsonToValue(&item_group_id, value, "std::string");


    }

    const char *last_updated_timeKey = "last_updated_time";

    if(object.has_key(last_updated_timeKey))
    {
        bourne::json value = object[last_updated_timeKey];



        jsonToValue(&last_updated_time, value, "long");


    }

    const char *linkKey = "link";

    if(object.has_key(linkKey))
    {
        bourne::json value = object[linkKey];



        jsonToValue(&link, value, "std::string");


    }

    const char *materialKey = "material";

    if(object.has_key(materialKey))
    {
        bourne::json value = object[materialKey];



        jsonToValue(&material, value, "std::string");


    }

    const char *min_ad_priceKey = "min_ad_price";

    if(object.has_key(min_ad_priceKey))
    {
        bourne::json value = object[min_ad_priceKey];



        jsonToValue(&min_ad_price, value, "std::string");


    }

    const char *mobile_linkKey = "mobile_link";

    if(object.has_key(mobile_linkKey))
    {
        bourne::json value = object[mobile_linkKey];



        jsonToValue(&mobile_link, value, "std::string");


    }

    const char *mpnKey = "mpn";

    if(object.has_key(mpnKey))
    {
        bourne::json value = object[mpnKey];



        jsonToValue(&mpn, value, "std::string");


    }

    const char *number_of_ratingsKey = "number_of_ratings";

    if(object.has_key(number_of_ratingsKey))
    {
        bourne::json value = object[number_of_ratingsKey];



        jsonToValue(&number_of_ratings, value, "int");


    }

    const char *number_of_reviewsKey = "number_of_reviews";

    if(object.has_key(number_of_reviewsKey))
    {
        bourne::json value = object[number_of_reviewsKey];



        jsonToValue(&number_of_reviews, value, "int");


    }

    const char *patternKey = "pattern";

    if(object.has_key(patternKey))
    {
        bourne::json value = object[patternKey];



        jsonToValue(&pattern, value, "std::string");


    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "std::string");


    }

    const char *product_typeKey = "product_type";

    if(object.has_key(product_typeKey))
    {
        bourne::json value = object[product_typeKey];



        jsonToValue(&product_type, value, "std::string");


    }

    const char *promotion_idKey = "promotion_id";

    if(object.has_key(promotion_idKey))
    {
        bourne::json value = object[promotion_idKey];



        jsonToValue(&promotion_id, value, "std::string");


    }

    const char *sale_priceKey = "sale_price";

    if(object.has_key(sale_priceKey))
    {
        bourne::json value = object[sale_priceKey];



        jsonToValue(&sale_price, value, "std::string");


    }

    const char *sale_price_effective_dateKey = "sale_price_effective_date";

    if(object.has_key(sale_price_effective_dateKey))
    {
        bourne::json value = object[sale_price_effective_dateKey];



        jsonToValue(&sale_price_effective_date, value, "std::string");


    }

    const char *shippingKey = "shipping";

    if(object.has_key(shippingKey))
    {
        bourne::json value = object[shippingKey];



        jsonToValue(&shipping, value, "std::string");


    }

    const char *shipping_heightKey = "shipping_height";

    if(object.has_key(shipping_heightKey))
    {
        bourne::json value = object[shipping_heightKey];



        jsonToValue(&shipping_height, value, "std::string");


    }

    const char *shipping_weightKey = "shipping_weight";

    if(object.has_key(shipping_weightKey))
    {
        bourne::json value = object[shipping_weightKey];



        jsonToValue(&shipping_weight, value, "std::string");


    }

    const char *shipping_widthKey = "shipping_width";

    if(object.has_key(shipping_widthKey))
    {
        bourne::json value = object[shipping_widthKey];



        jsonToValue(&shipping_width, value, "std::string");


    }

    const char *sizeKey = "size";

    if(object.has_key(sizeKey))
    {
        bourne::json value = object[sizeKey];



        jsonToValue(&size, value, "std::string");


    }

    const char *size_systemKey = "size_system";

    if(object.has_key(size_systemKey))
    {
        bourne::json value = object[size_systemKey];



        jsonToValue(&size_system, value, "std::string");


    }

    const char *size_typeKey = "size_type";

    if(object.has_key(size_typeKey))
    {
        bourne::json value = object[size_typeKey];



        jsonToValue(&size_type, value, "std::string");


    }

    const char *taxKey = "tax";

    if(object.has_key(taxKey))
    {
        bourne::json value = object[taxKey];



        jsonToValue(&tax, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *unit_pricing_base_measureKey = "unit_pricing_base_measure";

    if(object.has_key(unit_pricing_base_measureKey))
    {
        bourne::json value = object[unit_pricing_base_measureKey];



        jsonToValue(&unit_pricing_base_measure, value, "std::string");


    }

    const char *unit_pricing_measureKey = "unit_pricing_measure";

    if(object.has_key(unit_pricing_measureKey))
    {
        bourne::json value = object[unit_pricing_measureKey];



        jsonToValue(&unit_pricing_measure, value, "std::string");


    }

    const char *variant_namesKey = "variant_names";

    if(object.has_key(variant_namesKey))
    {
        bourne::json value = object[variant_namesKey];


        std::list<std::string> variant_names_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            variant_names_list.push_back(element);
        }
        variant_names = variant_names_list;


    }

    const char *variant_valuesKey = "variant_values";

    if(object.has_key(variant_valuesKey))
    {
        bourne::json value = object[variant_valuesKey];


        std::list<std::string> variant_values_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            variant_values_list.push_back(element);
        }
        variant_values = variant_values_list;


    }

    const char *additional_image_linkKey = "additional_image_link";

    if(object.has_key(additional_image_linkKey))
    {
        bourne::json value = object[additional_image_linkKey];


        std::list<std::string> additional_image_link_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            additional_image_link_list.push_back(element);
        }
        additional_image_link = additional_image_link_list;


    }

    const char *image_linkKey = "image_link";

    if(object.has_key(image_linkKey))
    {
        bourne::json value = object[image_linkKey];




        ItemAttributesRequest_allOf_image_link* obj = &image_link;
		obj->fromJson(value.dump());

    }

    const char *save_pin_disabledKey = "save_pin_disabled";

    if(object.has_key(save_pin_disabledKey))
    {
        bourne::json value = object[save_pin_disabledKey];



        jsonToValue(&save_pin_disabled, value, "bool");


    }

    const char *video_linkKey = "video_link";

    if(object.has_key(video_linkKey))
    {
        bourne::json value = object[video_linkKey];



        jsonToValue(&video_link, value, "std::string");


    }


}

bourne::json
ItemAttributesRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_image_0_link"] = getAdImage0Link();






    object["ad_image_0_tag"] = getAdImage0Tag();






    object["ad_image_10_link"] = getAdImage10Link();






    object["ad_image_10_tag"] = getAdImage10Tag();






    object["ad_image_11_link"] = getAdImage11Link();






    object["ad_image_11_tag"] = getAdImage11Tag();






    object["ad_image_12_link"] = getAdImage12Link();






    object["ad_image_12_tag"] = getAdImage12Tag();






    object["ad_image_13_link"] = getAdImage13Link();






    object["ad_image_13_tag"] = getAdImage13Tag();






    object["ad_image_14_link"] = getAdImage14Link();






    object["ad_image_14_tag"] = getAdImage14Tag();






    object["ad_image_15_link"] = getAdImage15Link();






    object["ad_image_15_tag"] = getAdImage15Tag();






    object["ad_image_16_link"] = getAdImage16Link();






    object["ad_image_16_tag"] = getAdImage16Tag();






    object["ad_image_17_link"] = getAdImage17Link();






    object["ad_image_17_tag"] = getAdImage17Tag();






    object["ad_image_18_link"] = getAdImage18Link();






    object["ad_image_18_tag"] = getAdImage18Tag();






    object["ad_image_19_link"] = getAdImage19Link();






    object["ad_image_19_tag"] = getAdImage19Tag();






    object["ad_image_1_link"] = getAdImage1Link();






    object["ad_image_1_tag"] = getAdImage1Tag();






    object["ad_image_2_link"] = getAdImage2Link();






    object["ad_image_2_tag"] = getAdImage2Tag();






    object["ad_image_3_link"] = getAdImage3Link();






    object["ad_image_3_tag"] = getAdImage3Tag();






    object["ad_image_4_link"] = getAdImage4Link();






    object["ad_image_4_tag"] = getAdImage4Tag();






    object["ad_image_5_link"] = getAdImage5Link();






    object["ad_image_5_tag"] = getAdImage5Tag();






    object["ad_image_6_link"] = getAdImage6Link();






    object["ad_image_6_tag"] = getAdImage6Tag();






    object["ad_image_7_link"] = getAdImage7Link();






    object["ad_image_7_tag"] = getAdImage7Tag();






    object["ad_image_8_link"] = getAdImage8Link();






    object["ad_image_8_tag"] = getAdImage8Tag();






    object["ad_image_9_link"] = getAdImage9Link();






    object["ad_image_9_tag"] = getAdImage9Tag();






    object["ad_link"] = getAdLink();






    object["ad_video_0_link"] = getAdVideo0Link();






    object["ad_video_0_tag"] = getAdVideo0Tag();






    object["ad_video_1_link"] = getAdVideo1Link();






    object["ad_video_1_tag"] = getAdVideo1Tag();






    object["ad_video_2_link"] = getAdVideo2Link();






    object["ad_video_2_tag"] = getAdVideo2Tag();






    object["adult"] = isAdult();






    object["age_group"] = getAgeGroup();






    object["android_deep_link"] = getAndroidDeepLink();






    object["availability"] = getAvailability();






    object["average_review_rating"] = getAverageReviewRating();






    object["brand"] = getBrand();






    object["checkout_enabled"] = isCheckoutEnabled();






    object["color"] = getColor();






    object["condition"] = getCondition();






    object["custom_label_0"] = getCustomLabel0();






    object["custom_label_1"] = getCustomLabel1();






    object["custom_label_2"] = getCustomLabel2();






    object["custom_label_3"] = getCustomLabel3();






    object["custom_label_4"] = getCustomLabel4();






    object["custom_number_0"] = getCustomNumber0();






    object["custom_number_1"] = getCustomNumber1();






    object["custom_number_2"] = getCustomNumber2();






    object["custom_number_3"] = getCustomNumber3();






    object["custom_number_4"] = getCustomNumber4();






    object["description"] = getDescription();






    object["free_shipping_label"] = isFreeShippingLabel();






    object["free_shipping_limit"] = getFreeShippingLimit();






    object["gender"] = getGender();






    object["google_product_category"] = getGoogleProductCategory();







	object["gtin"] = getGtin().toJson();





    object["id"] = getId();






    object["installment_price"] = getInstallmentPrice();






    object["ios_deep_link"] = getIosDeepLink();






    object["item_group_id"] = getItemGroupId();






    object["last_updated_time"] = getLastUpdatedTime();






    object["link"] = getLink();






    object["material"] = getMaterial();






    object["min_ad_price"] = getMinAdPrice();






    object["mobile_link"] = getMobileLink();






    object["mpn"] = getMpn();






    object["number_of_ratings"] = getNumberOfRatings();






    object["number_of_reviews"] = getNumberOfReviews();






    object["pattern"] = getPattern();






    object["price"] = getPrice();






    object["product_type"] = getProductType();






    object["promotion_id"] = getPromotionId();






    object["sale_price"] = getSalePrice();






    object["sale_price_effective_date"] = getSalePriceEffectiveDate();






    object["shipping"] = getShipping();






    object["shipping_height"] = getShippingHeight();






    object["shipping_weight"] = getShippingWeight();






    object["shipping_width"] = getShippingWidth();






    object["size"] = getSize();






    object["size_system"] = getSizeSystem();






    object["size_type"] = getSizeType();






    object["tax"] = getTax();






    object["title"] = getTitle();






    object["unit_pricing_base_measure"] = getUnitPricingBaseMeasure();






    object["unit_pricing_measure"] = getUnitPricingMeasure();





    std::list<std::string> variant_names_list = getVariantNames();
    bourne::json variant_names_arr = bourne::json::array();

    for(auto& var : variant_names_list)
    {
        variant_names_arr.append(var);
    }
    object["variant_names"] = variant_names_arr;








    std::list<std::string> variant_values_list = getVariantValues();
    bourne::json variant_values_arr = bourne::json::array();

    for(auto& var : variant_values_list)
    {
        variant_values_arr.append(var);
    }
    object["variant_values"] = variant_values_arr;








    std::list<std::string> additional_image_link_list = getAdditionalImageLink();
    bourne::json additional_image_link_arr = bourne::json::array();

    for(auto& var : additional_image_link_list)
    {
        additional_image_link_arr.append(var);
    }
    object["additional_image_link"] = additional_image_link_arr;










	object["image_link"] = getImageLink().toJson();





    object["save_pin_disabled"] = isSavePinDisabled();






    object["video_link"] = getVideoLink();



    return object;

}

std::string
ItemAttributesRequest::getAdImage0Link()
{
	return ad_image_0_link;
}

void
ItemAttributesRequest::setAdImage0Link(std::string  ad_image_0_link)
{
	this->ad_image_0_link = ad_image_0_link;
}

std::string
ItemAttributesRequest::getAdImage0Tag()
{
	return ad_image_0_tag;
}

void
ItemAttributesRequest::setAdImage0Tag(std::string  ad_image_0_tag)
{
	this->ad_image_0_tag = ad_image_0_tag;
}

std::string
ItemAttributesRequest::getAdImage10Link()
{
	return ad_image_10_link;
}

void
ItemAttributesRequest::setAdImage10Link(std::string  ad_image_10_link)
{
	this->ad_image_10_link = ad_image_10_link;
}

std::string
ItemAttributesRequest::getAdImage10Tag()
{
	return ad_image_10_tag;
}

void
ItemAttributesRequest::setAdImage10Tag(std::string  ad_image_10_tag)
{
	this->ad_image_10_tag = ad_image_10_tag;
}

std::string
ItemAttributesRequest::getAdImage11Link()
{
	return ad_image_11_link;
}

void
ItemAttributesRequest::setAdImage11Link(std::string  ad_image_11_link)
{
	this->ad_image_11_link = ad_image_11_link;
}

std::string
ItemAttributesRequest::getAdImage11Tag()
{
	return ad_image_11_tag;
}

void
ItemAttributesRequest::setAdImage11Tag(std::string  ad_image_11_tag)
{
	this->ad_image_11_tag = ad_image_11_tag;
}

std::string
ItemAttributesRequest::getAdImage12Link()
{
	return ad_image_12_link;
}

void
ItemAttributesRequest::setAdImage12Link(std::string  ad_image_12_link)
{
	this->ad_image_12_link = ad_image_12_link;
}

std::string
ItemAttributesRequest::getAdImage12Tag()
{
	return ad_image_12_tag;
}

void
ItemAttributesRequest::setAdImage12Tag(std::string  ad_image_12_tag)
{
	this->ad_image_12_tag = ad_image_12_tag;
}

std::string
ItemAttributesRequest::getAdImage13Link()
{
	return ad_image_13_link;
}

void
ItemAttributesRequest::setAdImage13Link(std::string  ad_image_13_link)
{
	this->ad_image_13_link = ad_image_13_link;
}

std::string
ItemAttributesRequest::getAdImage13Tag()
{
	return ad_image_13_tag;
}

void
ItemAttributesRequest::setAdImage13Tag(std::string  ad_image_13_tag)
{
	this->ad_image_13_tag = ad_image_13_tag;
}

std::string
ItemAttributesRequest::getAdImage14Link()
{
	return ad_image_14_link;
}

void
ItemAttributesRequest::setAdImage14Link(std::string  ad_image_14_link)
{
	this->ad_image_14_link = ad_image_14_link;
}

std::string
ItemAttributesRequest::getAdImage14Tag()
{
	return ad_image_14_tag;
}

void
ItemAttributesRequest::setAdImage14Tag(std::string  ad_image_14_tag)
{
	this->ad_image_14_tag = ad_image_14_tag;
}

std::string
ItemAttributesRequest::getAdImage15Link()
{
	return ad_image_15_link;
}

void
ItemAttributesRequest::setAdImage15Link(std::string  ad_image_15_link)
{
	this->ad_image_15_link = ad_image_15_link;
}

std::string
ItemAttributesRequest::getAdImage15Tag()
{
	return ad_image_15_tag;
}

void
ItemAttributesRequest::setAdImage15Tag(std::string  ad_image_15_tag)
{
	this->ad_image_15_tag = ad_image_15_tag;
}

std::string
ItemAttributesRequest::getAdImage16Link()
{
	return ad_image_16_link;
}

void
ItemAttributesRequest::setAdImage16Link(std::string  ad_image_16_link)
{
	this->ad_image_16_link = ad_image_16_link;
}

std::string
ItemAttributesRequest::getAdImage16Tag()
{
	return ad_image_16_tag;
}

void
ItemAttributesRequest::setAdImage16Tag(std::string  ad_image_16_tag)
{
	this->ad_image_16_tag = ad_image_16_tag;
}

std::string
ItemAttributesRequest::getAdImage17Link()
{
	return ad_image_17_link;
}

void
ItemAttributesRequest::setAdImage17Link(std::string  ad_image_17_link)
{
	this->ad_image_17_link = ad_image_17_link;
}

std::string
ItemAttributesRequest::getAdImage17Tag()
{
	return ad_image_17_tag;
}

void
ItemAttributesRequest::setAdImage17Tag(std::string  ad_image_17_tag)
{
	this->ad_image_17_tag = ad_image_17_tag;
}

std::string
ItemAttributesRequest::getAdImage18Link()
{
	return ad_image_18_link;
}

void
ItemAttributesRequest::setAdImage18Link(std::string  ad_image_18_link)
{
	this->ad_image_18_link = ad_image_18_link;
}

std::string
ItemAttributesRequest::getAdImage18Tag()
{
	return ad_image_18_tag;
}

void
ItemAttributesRequest::setAdImage18Tag(std::string  ad_image_18_tag)
{
	this->ad_image_18_tag = ad_image_18_tag;
}

std::string
ItemAttributesRequest::getAdImage19Link()
{
	return ad_image_19_link;
}

void
ItemAttributesRequest::setAdImage19Link(std::string  ad_image_19_link)
{
	this->ad_image_19_link = ad_image_19_link;
}

std::string
ItemAttributesRequest::getAdImage19Tag()
{
	return ad_image_19_tag;
}

void
ItemAttributesRequest::setAdImage19Tag(std::string  ad_image_19_tag)
{
	this->ad_image_19_tag = ad_image_19_tag;
}

std::string
ItemAttributesRequest::getAdImage1Link()
{
	return ad_image_1_link;
}

void
ItemAttributesRequest::setAdImage1Link(std::string  ad_image_1_link)
{
	this->ad_image_1_link = ad_image_1_link;
}

std::string
ItemAttributesRequest::getAdImage1Tag()
{
	return ad_image_1_tag;
}

void
ItemAttributesRequest::setAdImage1Tag(std::string  ad_image_1_tag)
{
	this->ad_image_1_tag = ad_image_1_tag;
}

std::string
ItemAttributesRequest::getAdImage2Link()
{
	return ad_image_2_link;
}

void
ItemAttributesRequest::setAdImage2Link(std::string  ad_image_2_link)
{
	this->ad_image_2_link = ad_image_2_link;
}

std::string
ItemAttributesRequest::getAdImage2Tag()
{
	return ad_image_2_tag;
}

void
ItemAttributesRequest::setAdImage2Tag(std::string  ad_image_2_tag)
{
	this->ad_image_2_tag = ad_image_2_tag;
}

std::string
ItemAttributesRequest::getAdImage3Link()
{
	return ad_image_3_link;
}

void
ItemAttributesRequest::setAdImage3Link(std::string  ad_image_3_link)
{
	this->ad_image_3_link = ad_image_3_link;
}

std::string
ItemAttributesRequest::getAdImage3Tag()
{
	return ad_image_3_tag;
}

void
ItemAttributesRequest::setAdImage3Tag(std::string  ad_image_3_tag)
{
	this->ad_image_3_tag = ad_image_3_tag;
}

std::string
ItemAttributesRequest::getAdImage4Link()
{
	return ad_image_4_link;
}

void
ItemAttributesRequest::setAdImage4Link(std::string  ad_image_4_link)
{
	this->ad_image_4_link = ad_image_4_link;
}

std::string
ItemAttributesRequest::getAdImage4Tag()
{
	return ad_image_4_tag;
}

void
ItemAttributesRequest::setAdImage4Tag(std::string  ad_image_4_tag)
{
	this->ad_image_4_tag = ad_image_4_tag;
}

std::string
ItemAttributesRequest::getAdImage5Link()
{
	return ad_image_5_link;
}

void
ItemAttributesRequest::setAdImage5Link(std::string  ad_image_5_link)
{
	this->ad_image_5_link = ad_image_5_link;
}

std::string
ItemAttributesRequest::getAdImage5Tag()
{
	return ad_image_5_tag;
}

void
ItemAttributesRequest::setAdImage5Tag(std::string  ad_image_5_tag)
{
	this->ad_image_5_tag = ad_image_5_tag;
}

std::string
ItemAttributesRequest::getAdImage6Link()
{
	return ad_image_6_link;
}

void
ItemAttributesRequest::setAdImage6Link(std::string  ad_image_6_link)
{
	this->ad_image_6_link = ad_image_6_link;
}

std::string
ItemAttributesRequest::getAdImage6Tag()
{
	return ad_image_6_tag;
}

void
ItemAttributesRequest::setAdImage6Tag(std::string  ad_image_6_tag)
{
	this->ad_image_6_tag = ad_image_6_tag;
}

std::string
ItemAttributesRequest::getAdImage7Link()
{
	return ad_image_7_link;
}

void
ItemAttributesRequest::setAdImage7Link(std::string  ad_image_7_link)
{
	this->ad_image_7_link = ad_image_7_link;
}

std::string
ItemAttributesRequest::getAdImage7Tag()
{
	return ad_image_7_tag;
}

void
ItemAttributesRequest::setAdImage7Tag(std::string  ad_image_7_tag)
{
	this->ad_image_7_tag = ad_image_7_tag;
}

std::string
ItemAttributesRequest::getAdImage8Link()
{
	return ad_image_8_link;
}

void
ItemAttributesRequest::setAdImage8Link(std::string  ad_image_8_link)
{
	this->ad_image_8_link = ad_image_8_link;
}

std::string
ItemAttributesRequest::getAdImage8Tag()
{
	return ad_image_8_tag;
}

void
ItemAttributesRequest::setAdImage8Tag(std::string  ad_image_8_tag)
{
	this->ad_image_8_tag = ad_image_8_tag;
}

std::string
ItemAttributesRequest::getAdImage9Link()
{
	return ad_image_9_link;
}

void
ItemAttributesRequest::setAdImage9Link(std::string  ad_image_9_link)
{
	this->ad_image_9_link = ad_image_9_link;
}

std::string
ItemAttributesRequest::getAdImage9Tag()
{
	return ad_image_9_tag;
}

void
ItemAttributesRequest::setAdImage9Tag(std::string  ad_image_9_tag)
{
	this->ad_image_9_tag = ad_image_9_tag;
}

std::string
ItemAttributesRequest::getAdLink()
{
	return ad_link;
}

void
ItemAttributesRequest::setAdLink(std::string  ad_link)
{
	this->ad_link = ad_link;
}

std::string
ItemAttributesRequest::getAdVideo0Link()
{
	return ad_video_0_link;
}

void
ItemAttributesRequest::setAdVideo0Link(std::string  ad_video_0_link)
{
	this->ad_video_0_link = ad_video_0_link;
}

std::string
ItemAttributesRequest::getAdVideo0Tag()
{
	return ad_video_0_tag;
}

void
ItemAttributesRequest::setAdVideo0Tag(std::string  ad_video_0_tag)
{
	this->ad_video_0_tag = ad_video_0_tag;
}

std::string
ItemAttributesRequest::getAdVideo1Link()
{
	return ad_video_1_link;
}

void
ItemAttributesRequest::setAdVideo1Link(std::string  ad_video_1_link)
{
	this->ad_video_1_link = ad_video_1_link;
}

std::string
ItemAttributesRequest::getAdVideo1Tag()
{
	return ad_video_1_tag;
}

void
ItemAttributesRequest::setAdVideo1Tag(std::string  ad_video_1_tag)
{
	this->ad_video_1_tag = ad_video_1_tag;
}

std::string
ItemAttributesRequest::getAdVideo2Link()
{
	return ad_video_2_link;
}

void
ItemAttributesRequest::setAdVideo2Link(std::string  ad_video_2_link)
{
	this->ad_video_2_link = ad_video_2_link;
}

std::string
ItemAttributesRequest::getAdVideo2Tag()
{
	return ad_video_2_tag;
}

void
ItemAttributesRequest::setAdVideo2Tag(std::string  ad_video_2_tag)
{
	this->ad_video_2_tag = ad_video_2_tag;
}

bool
ItemAttributesRequest::isAdult()
{
	return adult;
}

void
ItemAttributesRequest::setAdult(bool  adult)
{
	this->adult = adult;
}

std::string
ItemAttributesRequest::getAgeGroup()
{
	return age_group;
}

void
ItemAttributesRequest::setAgeGroup(std::string  age_group)
{
	this->age_group = age_group;
}

std::string
ItemAttributesRequest::getAndroidDeepLink()
{
	return android_deep_link;
}

void
ItemAttributesRequest::setAndroidDeepLink(std::string  android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::string
ItemAttributesRequest::getAvailability()
{
	return availability;
}

void
ItemAttributesRequest::setAvailability(std::string  availability)
{
	this->availability = availability;
}

long
ItemAttributesRequest::getAverageReviewRating()
{
	return average_review_rating;
}

void
ItemAttributesRequest::setAverageReviewRating(long  average_review_rating)
{
	this->average_review_rating = average_review_rating;
}

std::string
ItemAttributesRequest::getBrand()
{
	return brand;
}

void
ItemAttributesRequest::setBrand(std::string  brand)
{
	this->brand = brand;
}

bool
ItemAttributesRequest::isCheckoutEnabled()
{
	return checkout_enabled;
}

void
ItemAttributesRequest::setCheckoutEnabled(bool  checkout_enabled)
{
	this->checkout_enabled = checkout_enabled;
}

std::string
ItemAttributesRequest::getColor()
{
	return color;
}

void
ItemAttributesRequest::setColor(std::string  color)
{
	this->color = color;
}

std::string
ItemAttributesRequest::getCondition()
{
	return condition;
}

void
ItemAttributesRequest::setCondition(std::string  condition)
{
	this->condition = condition;
}

std::string
ItemAttributesRequest::getCustomLabel0()
{
	return custom_label_0;
}

void
ItemAttributesRequest::setCustomLabel0(std::string  custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::string
ItemAttributesRequest::getCustomLabel1()
{
	return custom_label_1;
}

void
ItemAttributesRequest::setCustomLabel1(std::string  custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::string
ItemAttributesRequest::getCustomLabel2()
{
	return custom_label_2;
}

void
ItemAttributesRequest::setCustomLabel2(std::string  custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::string
ItemAttributesRequest::getCustomLabel3()
{
	return custom_label_3;
}

void
ItemAttributesRequest::setCustomLabel3(std::string  custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::string
ItemAttributesRequest::getCustomLabel4()
{
	return custom_label_4;
}

void
ItemAttributesRequest::setCustomLabel4(std::string  custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

int
ItemAttributesRequest::getCustomNumber0()
{
	return custom_number_0;
}

void
ItemAttributesRequest::setCustomNumber0(int  custom_number_0)
{
	this->custom_number_0 = custom_number_0;
}

int
ItemAttributesRequest::getCustomNumber1()
{
	return custom_number_1;
}

void
ItemAttributesRequest::setCustomNumber1(int  custom_number_1)
{
	this->custom_number_1 = custom_number_1;
}

int
ItemAttributesRequest::getCustomNumber2()
{
	return custom_number_2;
}

void
ItemAttributesRequest::setCustomNumber2(int  custom_number_2)
{
	this->custom_number_2 = custom_number_2;
}

int
ItemAttributesRequest::getCustomNumber3()
{
	return custom_number_3;
}

void
ItemAttributesRequest::setCustomNumber3(int  custom_number_3)
{
	this->custom_number_3 = custom_number_3;
}

int
ItemAttributesRequest::getCustomNumber4()
{
	return custom_number_4;
}

void
ItemAttributesRequest::setCustomNumber4(int  custom_number_4)
{
	this->custom_number_4 = custom_number_4;
}

std::string
ItemAttributesRequest::getDescription()
{
	return description;
}

void
ItemAttributesRequest::setDescription(std::string  description)
{
	this->description = description;
}

bool
ItemAttributesRequest::isFreeShippingLabel()
{
	return free_shipping_label;
}

void
ItemAttributesRequest::setFreeShippingLabel(bool  free_shipping_label)
{
	this->free_shipping_label = free_shipping_label;
}

std::string
ItemAttributesRequest::getFreeShippingLimit()
{
	return free_shipping_limit;
}

void
ItemAttributesRequest::setFreeShippingLimit(std::string  free_shipping_limit)
{
	this->free_shipping_limit = free_shipping_limit;
}

std::string
ItemAttributesRequest::getGender()
{
	return gender;
}

void
ItemAttributesRequest::setGender(std::string  gender)
{
	this->gender = gender;
}

std::string
ItemAttributesRequest::getGoogleProductCategory()
{
	return google_product_category;
}

void
ItemAttributesRequest::setGoogleProductCategory(std::string  google_product_category)
{
	this->google_product_category = google_product_category;
}

UpdatableItemAttributes_gtin
ItemAttributesRequest::getGtin()
{
	return gtin;
}

void
ItemAttributesRequest::setGtin(UpdatableItemAttributes_gtin  gtin)
{
	this->gtin = gtin;
}

std::string
ItemAttributesRequest::getId()
{
	return id;
}

void
ItemAttributesRequest::setId(std::string  id)
{
	this->id = id;
}

std::string
ItemAttributesRequest::getInstallmentPrice()
{
	return installment_price;
}

void
ItemAttributesRequest::setInstallmentPrice(std::string  installment_price)
{
	this->installment_price = installment_price;
}

std::string
ItemAttributesRequest::getIosDeepLink()
{
	return ios_deep_link;
}

void
ItemAttributesRequest::setIosDeepLink(std::string  ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

std::string
ItemAttributesRequest::getItemGroupId()
{
	return item_group_id;
}

void
ItemAttributesRequest::setItemGroupId(std::string  item_group_id)
{
	this->item_group_id = item_group_id;
}

long
ItemAttributesRequest::getLastUpdatedTime()
{
	return last_updated_time;
}

void
ItemAttributesRequest::setLastUpdatedTime(long  last_updated_time)
{
	this->last_updated_time = last_updated_time;
}

std::string
ItemAttributesRequest::getLink()
{
	return link;
}

void
ItemAttributesRequest::setLink(std::string  link)
{
	this->link = link;
}

std::string
ItemAttributesRequest::getMaterial()
{
	return material;
}

void
ItemAttributesRequest::setMaterial(std::string  material)
{
	this->material = material;
}

std::string
ItemAttributesRequest::getMinAdPrice()
{
	return min_ad_price;
}

void
ItemAttributesRequest::setMinAdPrice(std::string  min_ad_price)
{
	this->min_ad_price = min_ad_price;
}

std::string
ItemAttributesRequest::getMobileLink()
{
	return mobile_link;
}

void
ItemAttributesRequest::setMobileLink(std::string  mobile_link)
{
	this->mobile_link = mobile_link;
}

std::string
ItemAttributesRequest::getMpn()
{
	return mpn;
}

void
ItemAttributesRequest::setMpn(std::string  mpn)
{
	this->mpn = mpn;
}

int
ItemAttributesRequest::getNumberOfRatings()
{
	return number_of_ratings;
}

void
ItemAttributesRequest::setNumberOfRatings(int  number_of_ratings)
{
	this->number_of_ratings = number_of_ratings;
}

int
ItemAttributesRequest::getNumberOfReviews()
{
	return number_of_reviews;
}

void
ItemAttributesRequest::setNumberOfReviews(int  number_of_reviews)
{
	this->number_of_reviews = number_of_reviews;
}

std::string
ItemAttributesRequest::getPattern()
{
	return pattern;
}

void
ItemAttributesRequest::setPattern(std::string  pattern)
{
	this->pattern = pattern;
}

std::string
ItemAttributesRequest::getPrice()
{
	return price;
}

void
ItemAttributesRequest::setPrice(std::string  price)
{
	this->price = price;
}

std::string
ItemAttributesRequest::getProductType()
{
	return product_type;
}

void
ItemAttributesRequest::setProductType(std::string  product_type)
{
	this->product_type = product_type;
}

std::string
ItemAttributesRequest::getPromotionId()
{
	return promotion_id;
}

void
ItemAttributesRequest::setPromotionId(std::string  promotion_id)
{
	this->promotion_id = promotion_id;
}

std::string
ItemAttributesRequest::getSalePrice()
{
	return sale_price;
}

void
ItemAttributesRequest::setSalePrice(std::string  sale_price)
{
	this->sale_price = sale_price;
}

std::string
ItemAttributesRequest::getSalePriceEffectiveDate()
{
	return sale_price_effective_date;
}

void
ItemAttributesRequest::setSalePriceEffectiveDate(std::string  sale_price_effective_date)
{
	this->sale_price_effective_date = sale_price_effective_date;
}

std::string
ItemAttributesRequest::getShipping()
{
	return shipping;
}

void
ItemAttributesRequest::setShipping(std::string  shipping)
{
	this->shipping = shipping;
}

std::string
ItemAttributesRequest::getShippingHeight()
{
	return shipping_height;
}

void
ItemAttributesRequest::setShippingHeight(std::string  shipping_height)
{
	this->shipping_height = shipping_height;
}

std::string
ItemAttributesRequest::getShippingWeight()
{
	return shipping_weight;
}

void
ItemAttributesRequest::setShippingWeight(std::string  shipping_weight)
{
	this->shipping_weight = shipping_weight;
}

std::string
ItemAttributesRequest::getShippingWidth()
{
	return shipping_width;
}

void
ItemAttributesRequest::setShippingWidth(std::string  shipping_width)
{
	this->shipping_width = shipping_width;
}

std::string
ItemAttributesRequest::getSize()
{
	return size;
}

void
ItemAttributesRequest::setSize(std::string  size)
{
	this->size = size;
}

std::string
ItemAttributesRequest::getSizeSystem()
{
	return size_system;
}

void
ItemAttributesRequest::setSizeSystem(std::string  size_system)
{
	this->size_system = size_system;
}

std::string
ItemAttributesRequest::getSizeType()
{
	return size_type;
}

void
ItemAttributesRequest::setSizeType(std::string  size_type)
{
	this->size_type = size_type;
}

std::string
ItemAttributesRequest::getTax()
{
	return tax;
}

void
ItemAttributesRequest::setTax(std::string  tax)
{
	this->tax = tax;
}

std::string
ItemAttributesRequest::getTitle()
{
	return title;
}

void
ItemAttributesRequest::setTitle(std::string  title)
{
	this->title = title;
}

std::string
ItemAttributesRequest::getUnitPricingBaseMeasure()
{
	return unit_pricing_base_measure;
}

void
ItemAttributesRequest::setUnitPricingBaseMeasure(std::string  unit_pricing_base_measure)
{
	this->unit_pricing_base_measure = unit_pricing_base_measure;
}

std::string
ItemAttributesRequest::getUnitPricingMeasure()
{
	return unit_pricing_measure;
}

void
ItemAttributesRequest::setUnitPricingMeasure(std::string  unit_pricing_measure)
{
	this->unit_pricing_measure = unit_pricing_measure;
}

std::list<std::string>
ItemAttributesRequest::getVariantNames()
{
	return variant_names;
}

void
ItemAttributesRequest::setVariantNames(std::list <std::string> variant_names)
{
	this->variant_names = variant_names;
}

std::list<std::string>
ItemAttributesRequest::getVariantValues()
{
	return variant_values;
}

void
ItemAttributesRequest::setVariantValues(std::list <std::string> variant_values)
{
	this->variant_values = variant_values;
}

std::list<std::string>
ItemAttributesRequest::getAdditionalImageLink()
{
	return additional_image_link;
}

void
ItemAttributesRequest::setAdditionalImageLink(std::list <std::string> additional_image_link)
{
	this->additional_image_link = additional_image_link;
}

ItemAttributesRequest_allOf_image_link
ItemAttributesRequest::getImageLink()
{
	return image_link;
}

void
ItemAttributesRequest::setImageLink(ItemAttributesRequest_allOf_image_link  image_link)
{
	this->image_link = image_link;
}

bool
ItemAttributesRequest::isSavePinDisabled()
{
	return save_pin_disabled;
}

void
ItemAttributesRequest::setSavePinDisabled(bool  save_pin_disabled)
{
	this->save_pin_disabled = save_pin_disabled;
}

std::string
ItemAttributesRequest::getVideoLink()
{
	return video_link;
}

void
ItemAttributesRequest::setVideoLink(std::string  video_link)
{
	this->video_link = video_link;
}



