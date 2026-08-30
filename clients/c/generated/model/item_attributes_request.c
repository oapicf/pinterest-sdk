#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_attributes_request.h"



static item_attributes_request_t *item_attributes_request_create_internal(
    char *ad_image_0_link,
    char *ad_image_0_tag,
    char *ad_image_10_link,
    char *ad_image_10_tag,
    char *ad_image_11_link,
    char *ad_image_11_tag,
    char *ad_image_12_link,
    char *ad_image_12_tag,
    char *ad_image_13_link,
    char *ad_image_13_tag,
    char *ad_image_14_link,
    char *ad_image_14_tag,
    char *ad_image_15_link,
    char *ad_image_15_tag,
    char *ad_image_16_link,
    char *ad_image_16_tag,
    char *ad_image_17_link,
    char *ad_image_17_tag,
    char *ad_image_18_link,
    char *ad_image_18_tag,
    char *ad_image_19_link,
    char *ad_image_19_tag,
    char *ad_image_1_link,
    char *ad_image_1_tag,
    char *ad_image_2_link,
    char *ad_image_2_tag,
    char *ad_image_3_link,
    char *ad_image_3_tag,
    char *ad_image_4_link,
    char *ad_image_4_tag,
    char *ad_image_5_link,
    char *ad_image_5_tag,
    char *ad_image_6_link,
    char *ad_image_6_tag,
    char *ad_image_7_link,
    char *ad_image_7_tag,
    char *ad_image_8_link,
    char *ad_image_8_tag,
    char *ad_image_9_link,
    char *ad_image_9_tag,
    char *ad_link,
    char *ad_video_0_link,
    char *ad_video_0_tag,
    char *ad_video_1_link,
    char *ad_video_1_tag,
    char *ad_video_2_link,
    char *ad_video_2_tag,
    list_t *additional_image_link,
    int *adult,
    char *age_group,
    list_t *ai_disclosures,
    char *android_deep_link,
    char *availability,
    double *average_review_rating,
    char *brand,
    int *checkout_enabled,
    char *color,
    char *condition,
    char *custom_label_0,
    char *custom_label_1,
    char *custom_label_2,
    char *custom_label_3,
    char *custom_label_4,
    int *custom_number_0,
    int *custom_number_1,
    int *custom_number_2,
    int *custom_number_3,
    int *custom_number_4,
    char *description,
    int *free_shipping_label,
    char *free_shipping_limit,
    char *gender,
    char *google_product_category,
    updatable_item_attributes_gtin_t *gtin,
    char *id,
    item_attributes_request_image_link_t *image_link,
    char *installment_price,
    char *ios_deep_link,
    char *item_group_id,
    long *last_updated_time,
    char *link,
    char *material,
    char *min_ad_price,
    char *mobile_link,
    char *mpn,
    int *number_of_ratings,
    int *number_of_reviews,
    char *pattern,
    char *price,
    char *product_type,
    char *promotion_id,
    char *sale_price,
    char *sale_price_effective_date,
    int *save_pin_disabled,
    char *shipping,
    char *shipping_height,
    char *shipping_weight,
    char *shipping_width,
    char *size,
    char *size_system,
    char *size_type,
    char *tax,
    char *title,
    char *unit_pricing_base_measure,
    char *unit_pricing_measure,
    list_t *variant_names,
    list_t *variant_values,
    char *video_link
    ) {
    item_attributes_request_t *item_attributes_request_local_var = malloc(sizeof(item_attributes_request_t));
    if (!item_attributes_request_local_var) {
        return NULL;
    }
    memset(item_attributes_request_local_var, 0, sizeof(item_attributes_request_t));
    item_attributes_request_local_var->_library_owned = 1;
    item_attributes_request_local_var->ad_image_0_link = ad_image_0_link;
    item_attributes_request_local_var->ad_image_0_tag = ad_image_0_tag;
    item_attributes_request_local_var->ad_image_10_link = ad_image_10_link;
    item_attributes_request_local_var->ad_image_10_tag = ad_image_10_tag;
    item_attributes_request_local_var->ad_image_11_link = ad_image_11_link;
    item_attributes_request_local_var->ad_image_11_tag = ad_image_11_tag;
    item_attributes_request_local_var->ad_image_12_link = ad_image_12_link;
    item_attributes_request_local_var->ad_image_12_tag = ad_image_12_tag;
    item_attributes_request_local_var->ad_image_13_link = ad_image_13_link;
    item_attributes_request_local_var->ad_image_13_tag = ad_image_13_tag;
    item_attributes_request_local_var->ad_image_14_link = ad_image_14_link;
    item_attributes_request_local_var->ad_image_14_tag = ad_image_14_tag;
    item_attributes_request_local_var->ad_image_15_link = ad_image_15_link;
    item_attributes_request_local_var->ad_image_15_tag = ad_image_15_tag;
    item_attributes_request_local_var->ad_image_16_link = ad_image_16_link;
    item_attributes_request_local_var->ad_image_16_tag = ad_image_16_tag;
    item_attributes_request_local_var->ad_image_17_link = ad_image_17_link;
    item_attributes_request_local_var->ad_image_17_tag = ad_image_17_tag;
    item_attributes_request_local_var->ad_image_18_link = ad_image_18_link;
    item_attributes_request_local_var->ad_image_18_tag = ad_image_18_tag;
    item_attributes_request_local_var->ad_image_19_link = ad_image_19_link;
    item_attributes_request_local_var->ad_image_19_tag = ad_image_19_tag;
    item_attributes_request_local_var->ad_image_1_link = ad_image_1_link;
    item_attributes_request_local_var->ad_image_1_tag = ad_image_1_tag;
    item_attributes_request_local_var->ad_image_2_link = ad_image_2_link;
    item_attributes_request_local_var->ad_image_2_tag = ad_image_2_tag;
    item_attributes_request_local_var->ad_image_3_link = ad_image_3_link;
    item_attributes_request_local_var->ad_image_3_tag = ad_image_3_tag;
    item_attributes_request_local_var->ad_image_4_link = ad_image_4_link;
    item_attributes_request_local_var->ad_image_4_tag = ad_image_4_tag;
    item_attributes_request_local_var->ad_image_5_link = ad_image_5_link;
    item_attributes_request_local_var->ad_image_5_tag = ad_image_5_tag;
    item_attributes_request_local_var->ad_image_6_link = ad_image_6_link;
    item_attributes_request_local_var->ad_image_6_tag = ad_image_6_tag;
    item_attributes_request_local_var->ad_image_7_link = ad_image_7_link;
    item_attributes_request_local_var->ad_image_7_tag = ad_image_7_tag;
    item_attributes_request_local_var->ad_image_8_link = ad_image_8_link;
    item_attributes_request_local_var->ad_image_8_tag = ad_image_8_tag;
    item_attributes_request_local_var->ad_image_9_link = ad_image_9_link;
    item_attributes_request_local_var->ad_image_9_tag = ad_image_9_tag;
    item_attributes_request_local_var->ad_link = ad_link;
    item_attributes_request_local_var->ad_video_0_link = ad_video_0_link;
    item_attributes_request_local_var->ad_video_0_tag = ad_video_0_tag;
    item_attributes_request_local_var->ad_video_1_link = ad_video_1_link;
    item_attributes_request_local_var->ad_video_1_tag = ad_video_1_tag;
    item_attributes_request_local_var->ad_video_2_link = ad_video_2_link;
    item_attributes_request_local_var->ad_video_2_tag = ad_video_2_tag;
    item_attributes_request_local_var->additional_image_link = additional_image_link;
    item_attributes_request_local_var->adult = adult;
    item_attributes_request_local_var->age_group = age_group;
    item_attributes_request_local_var->ai_disclosures = ai_disclosures;
    item_attributes_request_local_var->android_deep_link = android_deep_link;
    item_attributes_request_local_var->availability = availability;
    item_attributes_request_local_var->average_review_rating = average_review_rating;
    item_attributes_request_local_var->brand = brand;
    item_attributes_request_local_var->checkout_enabled = checkout_enabled;
    item_attributes_request_local_var->color = color;
    item_attributes_request_local_var->condition = condition;
    item_attributes_request_local_var->custom_label_0 = custom_label_0;
    item_attributes_request_local_var->custom_label_1 = custom_label_1;
    item_attributes_request_local_var->custom_label_2 = custom_label_2;
    item_attributes_request_local_var->custom_label_3 = custom_label_3;
    item_attributes_request_local_var->custom_label_4 = custom_label_4;
    item_attributes_request_local_var->custom_number_0 = custom_number_0;
    item_attributes_request_local_var->custom_number_1 = custom_number_1;
    item_attributes_request_local_var->custom_number_2 = custom_number_2;
    item_attributes_request_local_var->custom_number_3 = custom_number_3;
    item_attributes_request_local_var->custom_number_4 = custom_number_4;
    item_attributes_request_local_var->description = description;
    item_attributes_request_local_var->free_shipping_label = free_shipping_label;
    item_attributes_request_local_var->free_shipping_limit = free_shipping_limit;
    item_attributes_request_local_var->gender = gender;
    item_attributes_request_local_var->google_product_category = google_product_category;
    item_attributes_request_local_var->gtin = gtin;
    item_attributes_request_local_var->id = id;
    item_attributes_request_local_var->image_link = image_link;
    item_attributes_request_local_var->installment_price = installment_price;
    item_attributes_request_local_var->ios_deep_link = ios_deep_link;
    item_attributes_request_local_var->item_group_id = item_group_id;
    item_attributes_request_local_var->last_updated_time = last_updated_time;
    item_attributes_request_local_var->link = link;
    item_attributes_request_local_var->material = material;
    item_attributes_request_local_var->min_ad_price = min_ad_price;
    item_attributes_request_local_var->mobile_link = mobile_link;
    item_attributes_request_local_var->mpn = mpn;
    item_attributes_request_local_var->number_of_ratings = number_of_ratings;
    item_attributes_request_local_var->number_of_reviews = number_of_reviews;
    item_attributes_request_local_var->pattern = pattern;
    item_attributes_request_local_var->price = price;
    item_attributes_request_local_var->product_type = product_type;
    item_attributes_request_local_var->promotion_id = promotion_id;
    item_attributes_request_local_var->sale_price = sale_price;
    item_attributes_request_local_var->sale_price_effective_date = sale_price_effective_date;
    item_attributes_request_local_var->save_pin_disabled = save_pin_disabled;
    item_attributes_request_local_var->shipping = shipping;
    item_attributes_request_local_var->shipping_height = shipping_height;
    item_attributes_request_local_var->shipping_weight = shipping_weight;
    item_attributes_request_local_var->shipping_width = shipping_width;
    item_attributes_request_local_var->size = size;
    item_attributes_request_local_var->size_system = size_system;
    item_attributes_request_local_var->size_type = size_type;
    item_attributes_request_local_var->tax = tax;
    item_attributes_request_local_var->title = title;
    item_attributes_request_local_var->unit_pricing_base_measure = unit_pricing_base_measure;
    item_attributes_request_local_var->unit_pricing_measure = unit_pricing_measure;
    item_attributes_request_local_var->variant_names = variant_names;
    item_attributes_request_local_var->variant_values = variant_values;
    item_attributes_request_local_var->video_link = video_link;
    return item_attributes_request_local_var;
}

__attribute__((deprecated)) item_attributes_request_t *item_attributes_request_create(
    char *ad_image_0_link,
    char *ad_image_0_tag,
    char *ad_image_10_link,
    char *ad_image_10_tag,
    char *ad_image_11_link,
    char *ad_image_11_tag,
    char *ad_image_12_link,
    char *ad_image_12_tag,
    char *ad_image_13_link,
    char *ad_image_13_tag,
    char *ad_image_14_link,
    char *ad_image_14_tag,
    char *ad_image_15_link,
    char *ad_image_15_tag,
    char *ad_image_16_link,
    char *ad_image_16_tag,
    char *ad_image_17_link,
    char *ad_image_17_tag,
    char *ad_image_18_link,
    char *ad_image_18_tag,
    char *ad_image_19_link,
    char *ad_image_19_tag,
    char *ad_image_1_link,
    char *ad_image_1_tag,
    char *ad_image_2_link,
    char *ad_image_2_tag,
    char *ad_image_3_link,
    char *ad_image_3_tag,
    char *ad_image_4_link,
    char *ad_image_4_tag,
    char *ad_image_5_link,
    char *ad_image_5_tag,
    char *ad_image_6_link,
    char *ad_image_6_tag,
    char *ad_image_7_link,
    char *ad_image_7_tag,
    char *ad_image_8_link,
    char *ad_image_8_tag,
    char *ad_image_9_link,
    char *ad_image_9_tag,
    char *ad_link,
    char *ad_video_0_link,
    char *ad_video_0_tag,
    char *ad_video_1_link,
    char *ad_video_1_tag,
    char *ad_video_2_link,
    char *ad_video_2_tag,
    list_t *additional_image_link,
    int *adult,
    char *age_group,
    list_t *ai_disclosures,
    char *android_deep_link,
    char *availability,
    double *average_review_rating,
    char *brand,
    int *checkout_enabled,
    char *color,
    char *condition,
    char *custom_label_0,
    char *custom_label_1,
    char *custom_label_2,
    char *custom_label_3,
    char *custom_label_4,
    int *custom_number_0,
    int *custom_number_1,
    int *custom_number_2,
    int *custom_number_3,
    int *custom_number_4,
    char *description,
    int *free_shipping_label,
    char *free_shipping_limit,
    char *gender,
    char *google_product_category,
    updatable_item_attributes_gtin_t *gtin,
    char *id,
    item_attributes_request_image_link_t *image_link,
    char *installment_price,
    char *ios_deep_link,
    char *item_group_id,
    long *last_updated_time,
    char *link,
    char *material,
    char *min_ad_price,
    char *mobile_link,
    char *mpn,
    int *number_of_ratings,
    int *number_of_reviews,
    char *pattern,
    char *price,
    char *product_type,
    char *promotion_id,
    char *sale_price,
    char *sale_price_effective_date,
    int *save_pin_disabled,
    char *shipping,
    char *shipping_height,
    char *shipping_weight,
    char *shipping_width,
    char *size,
    char *size_system,
    char *size_type,
    char *tax,
    char *title,
    char *unit_pricing_base_measure,
    char *unit_pricing_measure,
    list_t *variant_names,
    list_t *variant_values,
    char *video_link
    ) {
    int *adult_copy = NULL;
    if (adult) {
        adult_copy = malloc(sizeof(int));
        if (adult_copy) *adult_copy = *adult;
    }
    double *average_review_rating_copy = NULL;
    if (average_review_rating) {
        average_review_rating_copy = malloc(sizeof(double));
        if (average_review_rating_copy) *average_review_rating_copy = *average_review_rating;
    }
    int *checkout_enabled_copy = NULL;
    if (checkout_enabled) {
        checkout_enabled_copy = malloc(sizeof(int));
        if (checkout_enabled_copy) *checkout_enabled_copy = *checkout_enabled;
    }
    int *custom_number_0_copy = NULL;
    if (custom_number_0) {
        custom_number_0_copy = malloc(sizeof(int));
        if (custom_number_0_copy) *custom_number_0_copy = *custom_number_0;
    }
    int *custom_number_1_copy = NULL;
    if (custom_number_1) {
        custom_number_1_copy = malloc(sizeof(int));
        if (custom_number_1_copy) *custom_number_1_copy = *custom_number_1;
    }
    int *custom_number_2_copy = NULL;
    if (custom_number_2) {
        custom_number_2_copy = malloc(sizeof(int));
        if (custom_number_2_copy) *custom_number_2_copy = *custom_number_2;
    }
    int *custom_number_3_copy = NULL;
    if (custom_number_3) {
        custom_number_3_copy = malloc(sizeof(int));
        if (custom_number_3_copy) *custom_number_3_copy = *custom_number_3;
    }
    int *custom_number_4_copy = NULL;
    if (custom_number_4) {
        custom_number_4_copy = malloc(sizeof(int));
        if (custom_number_4_copy) *custom_number_4_copy = *custom_number_4;
    }
    int *free_shipping_label_copy = NULL;
    if (free_shipping_label) {
        free_shipping_label_copy = malloc(sizeof(int));
        if (free_shipping_label_copy) *free_shipping_label_copy = *free_shipping_label;
    }
    long *last_updated_time_copy = NULL;
    if (last_updated_time) {
        last_updated_time_copy = malloc(sizeof(long));
        if (last_updated_time_copy) *last_updated_time_copy = *last_updated_time;
    }
    int *number_of_ratings_copy = NULL;
    if (number_of_ratings) {
        number_of_ratings_copy = malloc(sizeof(int));
        if (number_of_ratings_copy) *number_of_ratings_copy = *number_of_ratings;
    }
    int *number_of_reviews_copy = NULL;
    if (number_of_reviews) {
        number_of_reviews_copy = malloc(sizeof(int));
        if (number_of_reviews_copy) *number_of_reviews_copy = *number_of_reviews;
    }
    int *save_pin_disabled_copy = NULL;
    if (save_pin_disabled) {
        save_pin_disabled_copy = malloc(sizeof(int));
        if (save_pin_disabled_copy) *save_pin_disabled_copy = *save_pin_disabled;
    }
    item_attributes_request_t *result = item_attributes_request_create_internal (
        ad_image_0_link,
        ad_image_0_tag,
        ad_image_10_link,
        ad_image_10_tag,
        ad_image_11_link,
        ad_image_11_tag,
        ad_image_12_link,
        ad_image_12_tag,
        ad_image_13_link,
        ad_image_13_tag,
        ad_image_14_link,
        ad_image_14_tag,
        ad_image_15_link,
        ad_image_15_tag,
        ad_image_16_link,
        ad_image_16_tag,
        ad_image_17_link,
        ad_image_17_tag,
        ad_image_18_link,
        ad_image_18_tag,
        ad_image_19_link,
        ad_image_19_tag,
        ad_image_1_link,
        ad_image_1_tag,
        ad_image_2_link,
        ad_image_2_tag,
        ad_image_3_link,
        ad_image_3_tag,
        ad_image_4_link,
        ad_image_4_tag,
        ad_image_5_link,
        ad_image_5_tag,
        ad_image_6_link,
        ad_image_6_tag,
        ad_image_7_link,
        ad_image_7_tag,
        ad_image_8_link,
        ad_image_8_tag,
        ad_image_9_link,
        ad_image_9_tag,
        ad_link,
        ad_video_0_link,
        ad_video_0_tag,
        ad_video_1_link,
        ad_video_1_tag,
        ad_video_2_link,
        ad_video_2_tag,
        additional_image_link,
        adult_copy,
        age_group,
        ai_disclosures,
        android_deep_link,
        availability,
        average_review_rating_copy,
        brand,
        checkout_enabled_copy,
        color,
        condition,
        custom_label_0,
        custom_label_1,
        custom_label_2,
        custom_label_3,
        custom_label_4,
        custom_number_0_copy,
        custom_number_1_copy,
        custom_number_2_copy,
        custom_number_3_copy,
        custom_number_4_copy,
        description,
        free_shipping_label_copy,
        free_shipping_limit,
        gender,
        google_product_category,
        gtin,
        id,
        image_link,
        installment_price,
        ios_deep_link,
        item_group_id,
        last_updated_time_copy,
        link,
        material,
        min_ad_price,
        mobile_link,
        mpn,
        number_of_ratings_copy,
        number_of_reviews_copy,
        pattern,
        price,
        product_type,
        promotion_id,
        sale_price,
        sale_price_effective_date,
        save_pin_disabled_copy,
        shipping,
        shipping_height,
        shipping_weight,
        shipping_width,
        size,
        size_system,
        size_type,
        tax,
        title,
        unit_pricing_base_measure,
        unit_pricing_measure,
        variant_names,
        variant_values,
        video_link
        );
    if (!result) {
        free(adult_copy);
        free(average_review_rating_copy);
        free(checkout_enabled_copy);
        free(custom_number_0_copy);
        free(custom_number_1_copy);
        free(custom_number_2_copy);
        free(custom_number_3_copy);
        free(custom_number_4_copy);
        free(free_shipping_label_copy);
        free(last_updated_time_copy);
        free(number_of_ratings_copy);
        free(number_of_reviews_copy);
        free(save_pin_disabled_copy);
    }
    return result;
}

void item_attributes_request_free(item_attributes_request_t *item_attributes_request) {
    if(NULL == item_attributes_request){
        return ;
    }
    if(item_attributes_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_attributes_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_attributes_request->ad_image_0_link) {
        free(item_attributes_request->ad_image_0_link);
        item_attributes_request->ad_image_0_link = NULL;
    }
    if (item_attributes_request->ad_image_0_tag) {
        free(item_attributes_request->ad_image_0_tag);
        item_attributes_request->ad_image_0_tag = NULL;
    }
    if (item_attributes_request->ad_image_10_link) {
        free(item_attributes_request->ad_image_10_link);
        item_attributes_request->ad_image_10_link = NULL;
    }
    if (item_attributes_request->ad_image_10_tag) {
        free(item_attributes_request->ad_image_10_tag);
        item_attributes_request->ad_image_10_tag = NULL;
    }
    if (item_attributes_request->ad_image_11_link) {
        free(item_attributes_request->ad_image_11_link);
        item_attributes_request->ad_image_11_link = NULL;
    }
    if (item_attributes_request->ad_image_11_tag) {
        free(item_attributes_request->ad_image_11_tag);
        item_attributes_request->ad_image_11_tag = NULL;
    }
    if (item_attributes_request->ad_image_12_link) {
        free(item_attributes_request->ad_image_12_link);
        item_attributes_request->ad_image_12_link = NULL;
    }
    if (item_attributes_request->ad_image_12_tag) {
        free(item_attributes_request->ad_image_12_tag);
        item_attributes_request->ad_image_12_tag = NULL;
    }
    if (item_attributes_request->ad_image_13_link) {
        free(item_attributes_request->ad_image_13_link);
        item_attributes_request->ad_image_13_link = NULL;
    }
    if (item_attributes_request->ad_image_13_tag) {
        free(item_attributes_request->ad_image_13_tag);
        item_attributes_request->ad_image_13_tag = NULL;
    }
    if (item_attributes_request->ad_image_14_link) {
        free(item_attributes_request->ad_image_14_link);
        item_attributes_request->ad_image_14_link = NULL;
    }
    if (item_attributes_request->ad_image_14_tag) {
        free(item_attributes_request->ad_image_14_tag);
        item_attributes_request->ad_image_14_tag = NULL;
    }
    if (item_attributes_request->ad_image_15_link) {
        free(item_attributes_request->ad_image_15_link);
        item_attributes_request->ad_image_15_link = NULL;
    }
    if (item_attributes_request->ad_image_15_tag) {
        free(item_attributes_request->ad_image_15_tag);
        item_attributes_request->ad_image_15_tag = NULL;
    }
    if (item_attributes_request->ad_image_16_link) {
        free(item_attributes_request->ad_image_16_link);
        item_attributes_request->ad_image_16_link = NULL;
    }
    if (item_attributes_request->ad_image_16_tag) {
        free(item_attributes_request->ad_image_16_tag);
        item_attributes_request->ad_image_16_tag = NULL;
    }
    if (item_attributes_request->ad_image_17_link) {
        free(item_attributes_request->ad_image_17_link);
        item_attributes_request->ad_image_17_link = NULL;
    }
    if (item_attributes_request->ad_image_17_tag) {
        free(item_attributes_request->ad_image_17_tag);
        item_attributes_request->ad_image_17_tag = NULL;
    }
    if (item_attributes_request->ad_image_18_link) {
        free(item_attributes_request->ad_image_18_link);
        item_attributes_request->ad_image_18_link = NULL;
    }
    if (item_attributes_request->ad_image_18_tag) {
        free(item_attributes_request->ad_image_18_tag);
        item_attributes_request->ad_image_18_tag = NULL;
    }
    if (item_attributes_request->ad_image_19_link) {
        free(item_attributes_request->ad_image_19_link);
        item_attributes_request->ad_image_19_link = NULL;
    }
    if (item_attributes_request->ad_image_19_tag) {
        free(item_attributes_request->ad_image_19_tag);
        item_attributes_request->ad_image_19_tag = NULL;
    }
    if (item_attributes_request->ad_image_1_link) {
        free(item_attributes_request->ad_image_1_link);
        item_attributes_request->ad_image_1_link = NULL;
    }
    if (item_attributes_request->ad_image_1_tag) {
        free(item_attributes_request->ad_image_1_tag);
        item_attributes_request->ad_image_1_tag = NULL;
    }
    if (item_attributes_request->ad_image_2_link) {
        free(item_attributes_request->ad_image_2_link);
        item_attributes_request->ad_image_2_link = NULL;
    }
    if (item_attributes_request->ad_image_2_tag) {
        free(item_attributes_request->ad_image_2_tag);
        item_attributes_request->ad_image_2_tag = NULL;
    }
    if (item_attributes_request->ad_image_3_link) {
        free(item_attributes_request->ad_image_3_link);
        item_attributes_request->ad_image_3_link = NULL;
    }
    if (item_attributes_request->ad_image_3_tag) {
        free(item_attributes_request->ad_image_3_tag);
        item_attributes_request->ad_image_3_tag = NULL;
    }
    if (item_attributes_request->ad_image_4_link) {
        free(item_attributes_request->ad_image_4_link);
        item_attributes_request->ad_image_4_link = NULL;
    }
    if (item_attributes_request->ad_image_4_tag) {
        free(item_attributes_request->ad_image_4_tag);
        item_attributes_request->ad_image_4_tag = NULL;
    }
    if (item_attributes_request->ad_image_5_link) {
        free(item_attributes_request->ad_image_5_link);
        item_attributes_request->ad_image_5_link = NULL;
    }
    if (item_attributes_request->ad_image_5_tag) {
        free(item_attributes_request->ad_image_5_tag);
        item_attributes_request->ad_image_5_tag = NULL;
    }
    if (item_attributes_request->ad_image_6_link) {
        free(item_attributes_request->ad_image_6_link);
        item_attributes_request->ad_image_6_link = NULL;
    }
    if (item_attributes_request->ad_image_6_tag) {
        free(item_attributes_request->ad_image_6_tag);
        item_attributes_request->ad_image_6_tag = NULL;
    }
    if (item_attributes_request->ad_image_7_link) {
        free(item_attributes_request->ad_image_7_link);
        item_attributes_request->ad_image_7_link = NULL;
    }
    if (item_attributes_request->ad_image_7_tag) {
        free(item_attributes_request->ad_image_7_tag);
        item_attributes_request->ad_image_7_tag = NULL;
    }
    if (item_attributes_request->ad_image_8_link) {
        free(item_attributes_request->ad_image_8_link);
        item_attributes_request->ad_image_8_link = NULL;
    }
    if (item_attributes_request->ad_image_8_tag) {
        free(item_attributes_request->ad_image_8_tag);
        item_attributes_request->ad_image_8_tag = NULL;
    }
    if (item_attributes_request->ad_image_9_link) {
        free(item_attributes_request->ad_image_9_link);
        item_attributes_request->ad_image_9_link = NULL;
    }
    if (item_attributes_request->ad_image_9_tag) {
        free(item_attributes_request->ad_image_9_tag);
        item_attributes_request->ad_image_9_tag = NULL;
    }
    if (item_attributes_request->ad_link) {
        free(item_attributes_request->ad_link);
        item_attributes_request->ad_link = NULL;
    }
    if (item_attributes_request->ad_video_0_link) {
        free(item_attributes_request->ad_video_0_link);
        item_attributes_request->ad_video_0_link = NULL;
    }
    if (item_attributes_request->ad_video_0_tag) {
        free(item_attributes_request->ad_video_0_tag);
        item_attributes_request->ad_video_0_tag = NULL;
    }
    if (item_attributes_request->ad_video_1_link) {
        free(item_attributes_request->ad_video_1_link);
        item_attributes_request->ad_video_1_link = NULL;
    }
    if (item_attributes_request->ad_video_1_tag) {
        free(item_attributes_request->ad_video_1_tag);
        item_attributes_request->ad_video_1_tag = NULL;
    }
    if (item_attributes_request->ad_video_2_link) {
        free(item_attributes_request->ad_video_2_link);
        item_attributes_request->ad_video_2_link = NULL;
    }
    if (item_attributes_request->ad_video_2_tag) {
        free(item_attributes_request->ad_video_2_tag);
        item_attributes_request->ad_video_2_tag = NULL;
    }
    if (item_attributes_request->additional_image_link) {
        list_ForEach(listEntry, item_attributes_request->additional_image_link) {
            free(listEntry->data);
        }
        list_freeList(item_attributes_request->additional_image_link);
        item_attributes_request->additional_image_link = NULL;
    }
    if (item_attributes_request->adult) {
        free(item_attributes_request->adult);
        item_attributes_request->adult = NULL;
    }
    if (item_attributes_request->age_group) {
        free(item_attributes_request->age_group);
        item_attributes_request->age_group = NULL;
    }
    if (item_attributes_request->ai_disclosures) {
        list_ForEach(listEntry, item_attributes_request->ai_disclosures) {
            catalogs_ai_content_disclosure_free(listEntry->data);
        }
        list_freeList(item_attributes_request->ai_disclosures);
        item_attributes_request->ai_disclosures = NULL;
    }
    if (item_attributes_request->android_deep_link) {
        free(item_attributes_request->android_deep_link);
        item_attributes_request->android_deep_link = NULL;
    }
    if (item_attributes_request->availability) {
        free(item_attributes_request->availability);
        item_attributes_request->availability = NULL;
    }
    if (item_attributes_request->average_review_rating) {
        free(item_attributes_request->average_review_rating);
        item_attributes_request->average_review_rating = NULL;
    }
    if (item_attributes_request->brand) {
        free(item_attributes_request->brand);
        item_attributes_request->brand = NULL;
    }
    if (item_attributes_request->checkout_enabled) {
        free(item_attributes_request->checkout_enabled);
        item_attributes_request->checkout_enabled = NULL;
    }
    if (item_attributes_request->color) {
        free(item_attributes_request->color);
        item_attributes_request->color = NULL;
    }
    if (item_attributes_request->condition) {
        free(item_attributes_request->condition);
        item_attributes_request->condition = NULL;
    }
    if (item_attributes_request->custom_label_0) {
        free(item_attributes_request->custom_label_0);
        item_attributes_request->custom_label_0 = NULL;
    }
    if (item_attributes_request->custom_label_1) {
        free(item_attributes_request->custom_label_1);
        item_attributes_request->custom_label_1 = NULL;
    }
    if (item_attributes_request->custom_label_2) {
        free(item_attributes_request->custom_label_2);
        item_attributes_request->custom_label_2 = NULL;
    }
    if (item_attributes_request->custom_label_3) {
        free(item_attributes_request->custom_label_3);
        item_attributes_request->custom_label_3 = NULL;
    }
    if (item_attributes_request->custom_label_4) {
        free(item_attributes_request->custom_label_4);
        item_attributes_request->custom_label_4 = NULL;
    }
    if (item_attributes_request->custom_number_0) {
        free(item_attributes_request->custom_number_0);
        item_attributes_request->custom_number_0 = NULL;
    }
    if (item_attributes_request->custom_number_1) {
        free(item_attributes_request->custom_number_1);
        item_attributes_request->custom_number_1 = NULL;
    }
    if (item_attributes_request->custom_number_2) {
        free(item_attributes_request->custom_number_2);
        item_attributes_request->custom_number_2 = NULL;
    }
    if (item_attributes_request->custom_number_3) {
        free(item_attributes_request->custom_number_3);
        item_attributes_request->custom_number_3 = NULL;
    }
    if (item_attributes_request->custom_number_4) {
        free(item_attributes_request->custom_number_4);
        item_attributes_request->custom_number_4 = NULL;
    }
    if (item_attributes_request->description) {
        free(item_attributes_request->description);
        item_attributes_request->description = NULL;
    }
    if (item_attributes_request->free_shipping_label) {
        free(item_attributes_request->free_shipping_label);
        item_attributes_request->free_shipping_label = NULL;
    }
    if (item_attributes_request->free_shipping_limit) {
        free(item_attributes_request->free_shipping_limit);
        item_attributes_request->free_shipping_limit = NULL;
    }
    if (item_attributes_request->gender) {
        free(item_attributes_request->gender);
        item_attributes_request->gender = NULL;
    }
    if (item_attributes_request->google_product_category) {
        free(item_attributes_request->google_product_category);
        item_attributes_request->google_product_category = NULL;
    }
    if (item_attributes_request->gtin) {
        updatable_item_attributes_gtin_free(item_attributes_request->gtin);
        item_attributes_request->gtin = NULL;
    }
    if (item_attributes_request->id) {
        free(item_attributes_request->id);
        item_attributes_request->id = NULL;
    }
    if (item_attributes_request->image_link) {
        item_attributes_request_image_link_free(item_attributes_request->image_link);
        item_attributes_request->image_link = NULL;
    }
    if (item_attributes_request->installment_price) {
        free(item_attributes_request->installment_price);
        item_attributes_request->installment_price = NULL;
    }
    if (item_attributes_request->ios_deep_link) {
        free(item_attributes_request->ios_deep_link);
        item_attributes_request->ios_deep_link = NULL;
    }
    if (item_attributes_request->item_group_id) {
        free(item_attributes_request->item_group_id);
        item_attributes_request->item_group_id = NULL;
    }
    if (item_attributes_request->last_updated_time) {
        free(item_attributes_request->last_updated_time);
        item_attributes_request->last_updated_time = NULL;
    }
    if (item_attributes_request->link) {
        free(item_attributes_request->link);
        item_attributes_request->link = NULL;
    }
    if (item_attributes_request->material) {
        free(item_attributes_request->material);
        item_attributes_request->material = NULL;
    }
    if (item_attributes_request->min_ad_price) {
        free(item_attributes_request->min_ad_price);
        item_attributes_request->min_ad_price = NULL;
    }
    if (item_attributes_request->mobile_link) {
        free(item_attributes_request->mobile_link);
        item_attributes_request->mobile_link = NULL;
    }
    if (item_attributes_request->mpn) {
        free(item_attributes_request->mpn);
        item_attributes_request->mpn = NULL;
    }
    if (item_attributes_request->number_of_ratings) {
        free(item_attributes_request->number_of_ratings);
        item_attributes_request->number_of_ratings = NULL;
    }
    if (item_attributes_request->number_of_reviews) {
        free(item_attributes_request->number_of_reviews);
        item_attributes_request->number_of_reviews = NULL;
    }
    if (item_attributes_request->pattern) {
        free(item_attributes_request->pattern);
        item_attributes_request->pattern = NULL;
    }
    if (item_attributes_request->price) {
        free(item_attributes_request->price);
        item_attributes_request->price = NULL;
    }
    if (item_attributes_request->product_type) {
        free(item_attributes_request->product_type);
        item_attributes_request->product_type = NULL;
    }
    if (item_attributes_request->promotion_id) {
        free(item_attributes_request->promotion_id);
        item_attributes_request->promotion_id = NULL;
    }
    if (item_attributes_request->sale_price) {
        free(item_attributes_request->sale_price);
        item_attributes_request->sale_price = NULL;
    }
    if (item_attributes_request->sale_price_effective_date) {
        free(item_attributes_request->sale_price_effective_date);
        item_attributes_request->sale_price_effective_date = NULL;
    }
    if (item_attributes_request->save_pin_disabled) {
        free(item_attributes_request->save_pin_disabled);
        item_attributes_request->save_pin_disabled = NULL;
    }
    if (item_attributes_request->shipping) {
        free(item_attributes_request->shipping);
        item_attributes_request->shipping = NULL;
    }
    if (item_attributes_request->shipping_height) {
        free(item_attributes_request->shipping_height);
        item_attributes_request->shipping_height = NULL;
    }
    if (item_attributes_request->shipping_weight) {
        free(item_attributes_request->shipping_weight);
        item_attributes_request->shipping_weight = NULL;
    }
    if (item_attributes_request->shipping_width) {
        free(item_attributes_request->shipping_width);
        item_attributes_request->shipping_width = NULL;
    }
    if (item_attributes_request->size) {
        free(item_attributes_request->size);
        item_attributes_request->size = NULL;
    }
    if (item_attributes_request->size_system) {
        free(item_attributes_request->size_system);
        item_attributes_request->size_system = NULL;
    }
    if (item_attributes_request->size_type) {
        free(item_attributes_request->size_type);
        item_attributes_request->size_type = NULL;
    }
    if (item_attributes_request->tax) {
        free(item_attributes_request->tax);
        item_attributes_request->tax = NULL;
    }
    if (item_attributes_request->title) {
        free(item_attributes_request->title);
        item_attributes_request->title = NULL;
    }
    if (item_attributes_request->unit_pricing_base_measure) {
        free(item_attributes_request->unit_pricing_base_measure);
        item_attributes_request->unit_pricing_base_measure = NULL;
    }
    if (item_attributes_request->unit_pricing_measure) {
        free(item_attributes_request->unit_pricing_measure);
        item_attributes_request->unit_pricing_measure = NULL;
    }
    if (item_attributes_request->variant_names) {
        list_ForEach(listEntry, item_attributes_request->variant_names) {
            free(listEntry->data);
        }
        list_freeList(item_attributes_request->variant_names);
        item_attributes_request->variant_names = NULL;
    }
    if (item_attributes_request->variant_values) {
        list_ForEach(listEntry, item_attributes_request->variant_values) {
            free(listEntry->data);
        }
        list_freeList(item_attributes_request->variant_values);
        item_attributes_request->variant_values = NULL;
    }
    if (item_attributes_request->video_link) {
        free(item_attributes_request->video_link);
        item_attributes_request->video_link = NULL;
    }
    free(item_attributes_request);
}

cJSON *item_attributes_request_convertToJSON(item_attributes_request_t *item_attributes_request) {
    cJSON *item = cJSON_CreateObject();

    // item_attributes_request->ad_image_0_link
    if(item_attributes_request->ad_image_0_link) {
    if(cJSON_AddStringToObject(item, "ad_image_0_link", item_attributes_request->ad_image_0_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_0_tag
    if(item_attributes_request->ad_image_0_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_0_tag", item_attributes_request->ad_image_0_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_10_link
    if(item_attributes_request->ad_image_10_link) {
    if(cJSON_AddStringToObject(item, "ad_image_10_link", item_attributes_request->ad_image_10_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_10_tag
    if(item_attributes_request->ad_image_10_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_10_tag", item_attributes_request->ad_image_10_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_11_link
    if(item_attributes_request->ad_image_11_link) {
    if(cJSON_AddStringToObject(item, "ad_image_11_link", item_attributes_request->ad_image_11_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_11_tag
    if(item_attributes_request->ad_image_11_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_11_tag", item_attributes_request->ad_image_11_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_12_link
    if(item_attributes_request->ad_image_12_link) {
    if(cJSON_AddStringToObject(item, "ad_image_12_link", item_attributes_request->ad_image_12_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_12_tag
    if(item_attributes_request->ad_image_12_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_12_tag", item_attributes_request->ad_image_12_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_13_link
    if(item_attributes_request->ad_image_13_link) {
    if(cJSON_AddStringToObject(item, "ad_image_13_link", item_attributes_request->ad_image_13_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_13_tag
    if(item_attributes_request->ad_image_13_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_13_tag", item_attributes_request->ad_image_13_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_14_link
    if(item_attributes_request->ad_image_14_link) {
    if(cJSON_AddStringToObject(item, "ad_image_14_link", item_attributes_request->ad_image_14_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_14_tag
    if(item_attributes_request->ad_image_14_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_14_tag", item_attributes_request->ad_image_14_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_15_link
    if(item_attributes_request->ad_image_15_link) {
    if(cJSON_AddStringToObject(item, "ad_image_15_link", item_attributes_request->ad_image_15_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_15_tag
    if(item_attributes_request->ad_image_15_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_15_tag", item_attributes_request->ad_image_15_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_16_link
    if(item_attributes_request->ad_image_16_link) {
    if(cJSON_AddStringToObject(item, "ad_image_16_link", item_attributes_request->ad_image_16_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_16_tag
    if(item_attributes_request->ad_image_16_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_16_tag", item_attributes_request->ad_image_16_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_17_link
    if(item_attributes_request->ad_image_17_link) {
    if(cJSON_AddStringToObject(item, "ad_image_17_link", item_attributes_request->ad_image_17_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_17_tag
    if(item_attributes_request->ad_image_17_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_17_tag", item_attributes_request->ad_image_17_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_18_link
    if(item_attributes_request->ad_image_18_link) {
    if(cJSON_AddStringToObject(item, "ad_image_18_link", item_attributes_request->ad_image_18_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_18_tag
    if(item_attributes_request->ad_image_18_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_18_tag", item_attributes_request->ad_image_18_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_19_link
    if(item_attributes_request->ad_image_19_link) {
    if(cJSON_AddStringToObject(item, "ad_image_19_link", item_attributes_request->ad_image_19_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_19_tag
    if(item_attributes_request->ad_image_19_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_19_tag", item_attributes_request->ad_image_19_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_1_link
    if(item_attributes_request->ad_image_1_link) {
    if(cJSON_AddStringToObject(item, "ad_image_1_link", item_attributes_request->ad_image_1_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_1_tag
    if(item_attributes_request->ad_image_1_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_1_tag", item_attributes_request->ad_image_1_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_2_link
    if(item_attributes_request->ad_image_2_link) {
    if(cJSON_AddStringToObject(item, "ad_image_2_link", item_attributes_request->ad_image_2_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_2_tag
    if(item_attributes_request->ad_image_2_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_2_tag", item_attributes_request->ad_image_2_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_3_link
    if(item_attributes_request->ad_image_3_link) {
    if(cJSON_AddStringToObject(item, "ad_image_3_link", item_attributes_request->ad_image_3_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_3_tag
    if(item_attributes_request->ad_image_3_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_3_tag", item_attributes_request->ad_image_3_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_4_link
    if(item_attributes_request->ad_image_4_link) {
    if(cJSON_AddStringToObject(item, "ad_image_4_link", item_attributes_request->ad_image_4_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_4_tag
    if(item_attributes_request->ad_image_4_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_4_tag", item_attributes_request->ad_image_4_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_5_link
    if(item_attributes_request->ad_image_5_link) {
    if(cJSON_AddStringToObject(item, "ad_image_5_link", item_attributes_request->ad_image_5_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_5_tag
    if(item_attributes_request->ad_image_5_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_5_tag", item_attributes_request->ad_image_5_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_6_link
    if(item_attributes_request->ad_image_6_link) {
    if(cJSON_AddStringToObject(item, "ad_image_6_link", item_attributes_request->ad_image_6_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_6_tag
    if(item_attributes_request->ad_image_6_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_6_tag", item_attributes_request->ad_image_6_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_7_link
    if(item_attributes_request->ad_image_7_link) {
    if(cJSON_AddStringToObject(item, "ad_image_7_link", item_attributes_request->ad_image_7_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_7_tag
    if(item_attributes_request->ad_image_7_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_7_tag", item_attributes_request->ad_image_7_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_8_link
    if(item_attributes_request->ad_image_8_link) {
    if(cJSON_AddStringToObject(item, "ad_image_8_link", item_attributes_request->ad_image_8_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_8_tag
    if(item_attributes_request->ad_image_8_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_8_tag", item_attributes_request->ad_image_8_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_9_link
    if(item_attributes_request->ad_image_9_link) {
    if(cJSON_AddStringToObject(item, "ad_image_9_link", item_attributes_request->ad_image_9_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_image_9_tag
    if(item_attributes_request->ad_image_9_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_9_tag", item_attributes_request->ad_image_9_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_link
    if(item_attributes_request->ad_link) {
    if(cJSON_AddStringToObject(item, "ad_link", item_attributes_request->ad_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_video_0_link
    if(item_attributes_request->ad_video_0_link) {
    if(cJSON_AddStringToObject(item, "ad_video_0_link", item_attributes_request->ad_video_0_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_video_0_tag
    if(item_attributes_request->ad_video_0_tag) {
    if(cJSON_AddStringToObject(item, "ad_video_0_tag", item_attributes_request->ad_video_0_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_video_1_link
    if(item_attributes_request->ad_video_1_link) {
    if(cJSON_AddStringToObject(item, "ad_video_1_link", item_attributes_request->ad_video_1_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_video_1_tag
    if(item_attributes_request->ad_video_1_tag) {
    if(cJSON_AddStringToObject(item, "ad_video_1_tag", item_attributes_request->ad_video_1_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_video_2_link
    if(item_attributes_request->ad_video_2_link) {
    if(cJSON_AddStringToObject(item, "ad_video_2_link", item_attributes_request->ad_video_2_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ad_video_2_tag
    if(item_attributes_request->ad_video_2_tag) {
    if(cJSON_AddStringToObject(item, "ad_video_2_tag", item_attributes_request->ad_video_2_tag) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->additional_image_link
    if(item_attributes_request->additional_image_link) {
    cJSON *additional_image_link = cJSON_AddArrayToObject(item, "additional_image_link");
    if(additional_image_link == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *additional_image_linkListEntry;
    list_ForEach(additional_image_linkListEntry, item_attributes_request->additional_image_link) {
    if(cJSON_AddStringToObject(additional_image_link, "", additional_image_linkListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // item_attributes_request->adult
    if(item_attributes_request->adult) {
    if(cJSON_AddBoolToObject(item, "adult", *item_attributes_request->adult) == NULL) {
    goto fail; //Bool
    }
    }


    // item_attributes_request->age_group
    if(item_attributes_request->age_group) {
    if(cJSON_AddStringToObject(item, "age_group", item_attributes_request->age_group) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ai_disclosures
    if(item_attributes_request->ai_disclosures) {
    cJSON *ai_disclosures = cJSON_AddArrayToObject(item, "ai_disclosures");
    if(ai_disclosures == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *ai_disclosuresListEntry;
    if (item_attributes_request->ai_disclosures) {
    list_ForEach(ai_disclosuresListEntry, item_attributes_request->ai_disclosures) {
    cJSON *itemLocal = catalogs_ai_content_disclosure_convertToJSON(ai_disclosuresListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(ai_disclosures, itemLocal);
    }
    }
    }


    // item_attributes_request->android_deep_link
    if(item_attributes_request->android_deep_link) {
    if(cJSON_AddStringToObject(item, "android_deep_link", item_attributes_request->android_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->availability
    if(item_attributes_request->availability) {
    if(cJSON_AddStringToObject(item, "availability", item_attributes_request->availability) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->average_review_rating
    if(item_attributes_request->average_review_rating) {
    if(cJSON_AddNumberToObject(item, "average_review_rating", *item_attributes_request->average_review_rating) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_attributes_request->brand
    if(item_attributes_request->brand) {
    if(cJSON_AddStringToObject(item, "brand", item_attributes_request->brand) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->checkout_enabled
    if(item_attributes_request->checkout_enabled) {
    if(cJSON_AddBoolToObject(item, "checkout_enabled", *item_attributes_request->checkout_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // item_attributes_request->color
    if(item_attributes_request->color) {
    if(cJSON_AddStringToObject(item, "color", item_attributes_request->color) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->condition
    if(item_attributes_request->condition) {
    if(cJSON_AddStringToObject(item, "condition", item_attributes_request->condition) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->custom_label_0
    if(item_attributes_request->custom_label_0) {
    if(cJSON_AddStringToObject(item, "custom_label_0", item_attributes_request->custom_label_0) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->custom_label_1
    if(item_attributes_request->custom_label_1) {
    if(cJSON_AddStringToObject(item, "custom_label_1", item_attributes_request->custom_label_1) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->custom_label_2
    if(item_attributes_request->custom_label_2) {
    if(cJSON_AddStringToObject(item, "custom_label_2", item_attributes_request->custom_label_2) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->custom_label_3
    if(item_attributes_request->custom_label_3) {
    if(cJSON_AddStringToObject(item, "custom_label_3", item_attributes_request->custom_label_3) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->custom_label_4
    if(item_attributes_request->custom_label_4) {
    if(cJSON_AddStringToObject(item, "custom_label_4", item_attributes_request->custom_label_4) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->custom_number_0
    if(item_attributes_request->custom_number_0) {
    if(cJSON_AddNumberToObject(item, "custom_number_0", *item_attributes_request->custom_number_0) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_attributes_request->custom_number_1
    if(item_attributes_request->custom_number_1) {
    if(cJSON_AddNumberToObject(item, "custom_number_1", *item_attributes_request->custom_number_1) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_attributes_request->custom_number_2
    if(item_attributes_request->custom_number_2) {
    if(cJSON_AddNumberToObject(item, "custom_number_2", *item_attributes_request->custom_number_2) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_attributes_request->custom_number_3
    if(item_attributes_request->custom_number_3) {
    if(cJSON_AddNumberToObject(item, "custom_number_3", *item_attributes_request->custom_number_3) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_attributes_request->custom_number_4
    if(item_attributes_request->custom_number_4) {
    if(cJSON_AddNumberToObject(item, "custom_number_4", *item_attributes_request->custom_number_4) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_attributes_request->description
    if(item_attributes_request->description) {
    if(cJSON_AddStringToObject(item, "description", item_attributes_request->description) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->free_shipping_label
    if(item_attributes_request->free_shipping_label) {
    if(cJSON_AddBoolToObject(item, "free_shipping_label", *item_attributes_request->free_shipping_label) == NULL) {
    goto fail; //Bool
    }
    }


    // item_attributes_request->free_shipping_limit
    if(item_attributes_request->free_shipping_limit) {
    if(cJSON_AddStringToObject(item, "free_shipping_limit", item_attributes_request->free_shipping_limit) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->gender
    if(item_attributes_request->gender) {
    if(cJSON_AddStringToObject(item, "gender", item_attributes_request->gender) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->google_product_category
    if(item_attributes_request->google_product_category) {
    if(cJSON_AddStringToObject(item, "google_product_category", item_attributes_request->google_product_category) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->gtin
    if(item_attributes_request->gtin) {
    cJSON *gtin_local_JSON = updatable_item_attributes_gtin_convertToJSON(item_attributes_request->gtin);
    if(gtin_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "gtin", gtin_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // item_attributes_request->id
    if(item_attributes_request->id) {
    if(cJSON_AddStringToObject(item, "id", item_attributes_request->id) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->image_link
    if(item_attributes_request->image_link) {
    cJSON *image_link_local_JSON = item_attributes_request_image_link_convertToJSON(item_attributes_request->image_link);
    if(image_link_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image_link", image_link_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // item_attributes_request->installment_price
    if(item_attributes_request->installment_price) {
    if(cJSON_AddStringToObject(item, "installment_price", item_attributes_request->installment_price) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->ios_deep_link
    if(item_attributes_request->ios_deep_link) {
    if(cJSON_AddStringToObject(item, "ios_deep_link", item_attributes_request->ios_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->item_group_id
    if(item_attributes_request->item_group_id) {
    if(cJSON_AddStringToObject(item, "item_group_id", item_attributes_request->item_group_id) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->last_updated_time
    if(item_attributes_request->last_updated_time) {
    if(cJSON_AddNumberToObject(item, "last_updated_time", *item_attributes_request->last_updated_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_attributes_request->link
    if(item_attributes_request->link) {
    if(cJSON_AddStringToObject(item, "link", item_attributes_request->link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->material
    if(item_attributes_request->material) {
    if(cJSON_AddStringToObject(item, "material", item_attributes_request->material) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->min_ad_price
    if(item_attributes_request->min_ad_price) {
    if(cJSON_AddStringToObject(item, "min_ad_price", item_attributes_request->min_ad_price) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->mobile_link
    if(item_attributes_request->mobile_link) {
    if(cJSON_AddStringToObject(item, "mobile_link", item_attributes_request->mobile_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->mpn
    if(item_attributes_request->mpn) {
    if(cJSON_AddStringToObject(item, "mpn", item_attributes_request->mpn) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->number_of_ratings
    if(item_attributes_request->number_of_ratings) {
    if(cJSON_AddNumberToObject(item, "number_of_ratings", *item_attributes_request->number_of_ratings) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_attributes_request->number_of_reviews
    if(item_attributes_request->number_of_reviews) {
    if(cJSON_AddNumberToObject(item, "number_of_reviews", *item_attributes_request->number_of_reviews) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_attributes_request->pattern
    if(item_attributes_request->pattern) {
    if(cJSON_AddStringToObject(item, "pattern", item_attributes_request->pattern) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->price
    if(item_attributes_request->price) {
    if(cJSON_AddStringToObject(item, "price", item_attributes_request->price) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->product_type
    if(item_attributes_request->product_type) {
    if(cJSON_AddStringToObject(item, "product_type", item_attributes_request->product_type) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->promotion_id
    if(item_attributes_request->promotion_id) {
    if(cJSON_AddStringToObject(item, "promotion_id", item_attributes_request->promotion_id) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->sale_price
    if(item_attributes_request->sale_price) {
    if(cJSON_AddStringToObject(item, "sale_price", item_attributes_request->sale_price) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->sale_price_effective_date
    if(item_attributes_request->sale_price_effective_date) {
    if(cJSON_AddStringToObject(item, "sale_price_effective_date", item_attributes_request->sale_price_effective_date) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->save_pin_disabled
    if(item_attributes_request->save_pin_disabled) {
    if(cJSON_AddBoolToObject(item, "save_pin_disabled", *item_attributes_request->save_pin_disabled) == NULL) {
    goto fail; //Bool
    }
    }


    // item_attributes_request->shipping
    if(item_attributes_request->shipping) {
    if(cJSON_AddStringToObject(item, "shipping", item_attributes_request->shipping) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->shipping_height
    if(item_attributes_request->shipping_height) {
    if(cJSON_AddStringToObject(item, "shipping_height", item_attributes_request->shipping_height) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->shipping_weight
    if(item_attributes_request->shipping_weight) {
    if(cJSON_AddStringToObject(item, "shipping_weight", item_attributes_request->shipping_weight) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->shipping_width
    if(item_attributes_request->shipping_width) {
    if(cJSON_AddStringToObject(item, "shipping_width", item_attributes_request->shipping_width) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->size
    if(item_attributes_request->size) {
    if(cJSON_AddStringToObject(item, "size", item_attributes_request->size) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->size_system
    if(item_attributes_request->size_system) {
    if(cJSON_AddStringToObject(item, "size_system", item_attributes_request->size_system) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->size_type
    if(item_attributes_request->size_type) {
    if(cJSON_AddStringToObject(item, "size_type", item_attributes_request->size_type) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->tax
    if(item_attributes_request->tax) {
    if(cJSON_AddStringToObject(item, "tax", item_attributes_request->tax) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->title
    if(item_attributes_request->title) {
    if(cJSON_AddStringToObject(item, "title", item_attributes_request->title) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->unit_pricing_base_measure
    if(item_attributes_request->unit_pricing_base_measure) {
    if(cJSON_AddStringToObject(item, "unit_pricing_base_measure", item_attributes_request->unit_pricing_base_measure) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->unit_pricing_measure
    if(item_attributes_request->unit_pricing_measure) {
    if(cJSON_AddStringToObject(item, "unit_pricing_measure", item_attributes_request->unit_pricing_measure) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->variant_names
    if(item_attributes_request->variant_names) {
    cJSON *variant_names = cJSON_AddArrayToObject(item, "variant_names");
    if(variant_names == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *variant_namesListEntry;
    list_ForEach(variant_namesListEntry, item_attributes_request->variant_names) {
    if(cJSON_AddStringToObject(variant_names, "", variant_namesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // item_attributes_request->variant_values
    if(item_attributes_request->variant_values) {
    cJSON *variant_values = cJSON_AddArrayToObject(item, "variant_values");
    if(variant_values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *variant_valuesListEntry;
    list_ForEach(variant_valuesListEntry, item_attributes_request->variant_values) {
    if(cJSON_AddStringToObject(variant_values, "", variant_valuesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // item_attributes_request->video_link
    if(item_attributes_request->video_link) {
    if(cJSON_AddStringToObject(item, "video_link", item_attributes_request->video_link) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_attributes_request_t *item_attributes_request_parseFromJSON(cJSON *item_attributes_requestJSON){

    item_attributes_request_t *item_attributes_request_local_var = NULL;

    char *ad_image_0_link_local_str = NULL;

    char *ad_image_0_tag_local_str = NULL;

    char *ad_image_10_link_local_str = NULL;

    char *ad_image_10_tag_local_str = NULL;

    char *ad_image_11_link_local_str = NULL;

    char *ad_image_11_tag_local_str = NULL;

    char *ad_image_12_link_local_str = NULL;

    char *ad_image_12_tag_local_str = NULL;

    char *ad_image_13_link_local_str = NULL;

    char *ad_image_13_tag_local_str = NULL;

    char *ad_image_14_link_local_str = NULL;

    char *ad_image_14_tag_local_str = NULL;

    char *ad_image_15_link_local_str = NULL;

    char *ad_image_15_tag_local_str = NULL;

    char *ad_image_16_link_local_str = NULL;

    char *ad_image_16_tag_local_str = NULL;

    char *ad_image_17_link_local_str = NULL;

    char *ad_image_17_tag_local_str = NULL;

    char *ad_image_18_link_local_str = NULL;

    char *ad_image_18_tag_local_str = NULL;

    char *ad_image_19_link_local_str = NULL;

    char *ad_image_19_tag_local_str = NULL;

    char *ad_image_1_link_local_str = NULL;

    char *ad_image_1_tag_local_str = NULL;

    char *ad_image_2_link_local_str = NULL;

    char *ad_image_2_tag_local_str = NULL;

    char *ad_image_3_link_local_str = NULL;

    char *ad_image_3_tag_local_str = NULL;

    char *ad_image_4_link_local_str = NULL;

    char *ad_image_4_tag_local_str = NULL;

    char *ad_image_5_link_local_str = NULL;

    char *ad_image_5_tag_local_str = NULL;

    char *ad_image_6_link_local_str = NULL;

    char *ad_image_6_tag_local_str = NULL;

    char *ad_image_7_link_local_str = NULL;

    char *ad_image_7_tag_local_str = NULL;

    char *ad_image_8_link_local_str = NULL;

    char *ad_image_8_tag_local_str = NULL;

    char *ad_image_9_link_local_str = NULL;

    char *ad_image_9_tag_local_str = NULL;

    char *ad_link_local_str = NULL;

    char *ad_video_0_link_local_str = NULL;

    char *ad_video_0_tag_local_str = NULL;

    char *ad_video_1_link_local_str = NULL;

    char *ad_video_1_tag_local_str = NULL;

    char *ad_video_2_link_local_str = NULL;

    char *ad_video_2_tag_local_str = NULL;

    // define the local list for item_attributes_request->additional_image_link
    list_t *additional_image_linkList = NULL;

    // define the local variable for item_attributes_request->adult
    int *adult_local_var = NULL;

    char *age_group_local_str = NULL;

    // define the local list for item_attributes_request->ai_disclosures
    list_t *ai_disclosuresList = NULL;

    char *android_deep_link_local_str = NULL;

    char *availability_local_str = NULL;

    // define the local variable for item_attributes_request->average_review_rating
    double *average_review_rating_local_var = NULL;

    char *brand_local_str = NULL;

    // define the local variable for item_attributes_request->checkout_enabled
    int *checkout_enabled_local_var = NULL;

    char *color_local_str = NULL;

    char *condition_local_str = NULL;

    char *custom_label_0_local_str = NULL;

    char *custom_label_1_local_str = NULL;

    char *custom_label_2_local_str = NULL;

    char *custom_label_3_local_str = NULL;

    char *custom_label_4_local_str = NULL;

    // define the local variable for item_attributes_request->custom_number_0
    int *custom_number_0_local_var = NULL;

    // define the local variable for item_attributes_request->custom_number_1
    int *custom_number_1_local_var = NULL;

    // define the local variable for item_attributes_request->custom_number_2
    int *custom_number_2_local_var = NULL;

    // define the local variable for item_attributes_request->custom_number_3
    int *custom_number_3_local_var = NULL;

    // define the local variable for item_attributes_request->custom_number_4
    int *custom_number_4_local_var = NULL;

    char *description_local_str = NULL;

    // define the local variable for item_attributes_request->free_shipping_label
    int *free_shipping_label_local_var = NULL;

    char *free_shipping_limit_local_str = NULL;

    char *gender_local_str = NULL;

    char *google_product_category_local_str = NULL;

    // define the local variable for item_attributes_request->gtin
    updatable_item_attributes_gtin_t *gtin_local_nonprim = NULL;

    char *id_local_str = NULL;

    // define the local variable for item_attributes_request->image_link
    item_attributes_request_image_link_t *image_link_local_nonprim = NULL;

    char *installment_price_local_str = NULL;

    char *ios_deep_link_local_str = NULL;

    char *item_group_id_local_str = NULL;

    // define the local variable for item_attributes_request->last_updated_time
    long *last_updated_time_local_var = NULL;

    char *link_local_str = NULL;

    char *material_local_str = NULL;

    char *min_ad_price_local_str = NULL;

    char *mobile_link_local_str = NULL;

    char *mpn_local_str = NULL;

    // define the local variable for item_attributes_request->number_of_ratings
    int *number_of_ratings_local_var = NULL;

    // define the local variable for item_attributes_request->number_of_reviews
    int *number_of_reviews_local_var = NULL;

    char *pattern_local_str = NULL;

    char *price_local_str = NULL;

    char *product_type_local_str = NULL;

    char *promotion_id_local_str = NULL;

    char *sale_price_local_str = NULL;

    char *sale_price_effective_date_local_str = NULL;

    // define the local variable for item_attributes_request->save_pin_disabled
    int *save_pin_disabled_local_var = NULL;

    char *shipping_local_str = NULL;

    char *shipping_height_local_str = NULL;

    char *shipping_weight_local_str = NULL;

    char *shipping_width_local_str = NULL;

    char *size_local_str = NULL;

    char *size_system_local_str = NULL;

    char *size_type_local_str = NULL;

    char *tax_local_str = NULL;

    char *title_local_str = NULL;

    char *unit_pricing_base_measure_local_str = NULL;

    char *unit_pricing_measure_local_str = NULL;

    // define the local list for item_attributes_request->variant_names
    list_t *variant_namesList = NULL;

    // define the local list for item_attributes_request->variant_values
    list_t *variant_valuesList = NULL;

    char *video_link_local_str = NULL;

    // item_attributes_request->ad_image_0_link
    cJSON *ad_image_0_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_0_link");
    if (cJSON_IsNull(ad_image_0_link)) {
        ad_image_0_link = NULL;
    }
    if (ad_image_0_link) { 
    if(!cJSON_IsString(ad_image_0_link) && !cJSON_IsNull(ad_image_0_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_0_tag
    cJSON *ad_image_0_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_0_tag");
    if (cJSON_IsNull(ad_image_0_tag)) {
        ad_image_0_tag = NULL;
    }
    if (ad_image_0_tag) { 
    if(!cJSON_IsString(ad_image_0_tag) && !cJSON_IsNull(ad_image_0_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_10_link
    cJSON *ad_image_10_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_10_link");
    if (cJSON_IsNull(ad_image_10_link)) {
        ad_image_10_link = NULL;
    }
    if (ad_image_10_link) { 
    if(!cJSON_IsString(ad_image_10_link) && !cJSON_IsNull(ad_image_10_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_10_tag
    cJSON *ad_image_10_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_10_tag");
    if (cJSON_IsNull(ad_image_10_tag)) {
        ad_image_10_tag = NULL;
    }
    if (ad_image_10_tag) { 
    if(!cJSON_IsString(ad_image_10_tag) && !cJSON_IsNull(ad_image_10_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_11_link
    cJSON *ad_image_11_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_11_link");
    if (cJSON_IsNull(ad_image_11_link)) {
        ad_image_11_link = NULL;
    }
    if (ad_image_11_link) { 
    if(!cJSON_IsString(ad_image_11_link) && !cJSON_IsNull(ad_image_11_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_11_tag
    cJSON *ad_image_11_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_11_tag");
    if (cJSON_IsNull(ad_image_11_tag)) {
        ad_image_11_tag = NULL;
    }
    if (ad_image_11_tag) { 
    if(!cJSON_IsString(ad_image_11_tag) && !cJSON_IsNull(ad_image_11_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_12_link
    cJSON *ad_image_12_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_12_link");
    if (cJSON_IsNull(ad_image_12_link)) {
        ad_image_12_link = NULL;
    }
    if (ad_image_12_link) { 
    if(!cJSON_IsString(ad_image_12_link) && !cJSON_IsNull(ad_image_12_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_12_tag
    cJSON *ad_image_12_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_12_tag");
    if (cJSON_IsNull(ad_image_12_tag)) {
        ad_image_12_tag = NULL;
    }
    if (ad_image_12_tag) { 
    if(!cJSON_IsString(ad_image_12_tag) && !cJSON_IsNull(ad_image_12_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_13_link
    cJSON *ad_image_13_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_13_link");
    if (cJSON_IsNull(ad_image_13_link)) {
        ad_image_13_link = NULL;
    }
    if (ad_image_13_link) { 
    if(!cJSON_IsString(ad_image_13_link) && !cJSON_IsNull(ad_image_13_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_13_tag
    cJSON *ad_image_13_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_13_tag");
    if (cJSON_IsNull(ad_image_13_tag)) {
        ad_image_13_tag = NULL;
    }
    if (ad_image_13_tag) { 
    if(!cJSON_IsString(ad_image_13_tag) && !cJSON_IsNull(ad_image_13_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_14_link
    cJSON *ad_image_14_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_14_link");
    if (cJSON_IsNull(ad_image_14_link)) {
        ad_image_14_link = NULL;
    }
    if (ad_image_14_link) { 
    if(!cJSON_IsString(ad_image_14_link) && !cJSON_IsNull(ad_image_14_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_14_tag
    cJSON *ad_image_14_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_14_tag");
    if (cJSON_IsNull(ad_image_14_tag)) {
        ad_image_14_tag = NULL;
    }
    if (ad_image_14_tag) { 
    if(!cJSON_IsString(ad_image_14_tag) && !cJSON_IsNull(ad_image_14_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_15_link
    cJSON *ad_image_15_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_15_link");
    if (cJSON_IsNull(ad_image_15_link)) {
        ad_image_15_link = NULL;
    }
    if (ad_image_15_link) { 
    if(!cJSON_IsString(ad_image_15_link) && !cJSON_IsNull(ad_image_15_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_15_tag
    cJSON *ad_image_15_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_15_tag");
    if (cJSON_IsNull(ad_image_15_tag)) {
        ad_image_15_tag = NULL;
    }
    if (ad_image_15_tag) { 
    if(!cJSON_IsString(ad_image_15_tag) && !cJSON_IsNull(ad_image_15_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_16_link
    cJSON *ad_image_16_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_16_link");
    if (cJSON_IsNull(ad_image_16_link)) {
        ad_image_16_link = NULL;
    }
    if (ad_image_16_link) { 
    if(!cJSON_IsString(ad_image_16_link) && !cJSON_IsNull(ad_image_16_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_16_tag
    cJSON *ad_image_16_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_16_tag");
    if (cJSON_IsNull(ad_image_16_tag)) {
        ad_image_16_tag = NULL;
    }
    if (ad_image_16_tag) { 
    if(!cJSON_IsString(ad_image_16_tag) && !cJSON_IsNull(ad_image_16_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_17_link
    cJSON *ad_image_17_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_17_link");
    if (cJSON_IsNull(ad_image_17_link)) {
        ad_image_17_link = NULL;
    }
    if (ad_image_17_link) { 
    if(!cJSON_IsString(ad_image_17_link) && !cJSON_IsNull(ad_image_17_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_17_tag
    cJSON *ad_image_17_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_17_tag");
    if (cJSON_IsNull(ad_image_17_tag)) {
        ad_image_17_tag = NULL;
    }
    if (ad_image_17_tag) { 
    if(!cJSON_IsString(ad_image_17_tag) && !cJSON_IsNull(ad_image_17_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_18_link
    cJSON *ad_image_18_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_18_link");
    if (cJSON_IsNull(ad_image_18_link)) {
        ad_image_18_link = NULL;
    }
    if (ad_image_18_link) { 
    if(!cJSON_IsString(ad_image_18_link) && !cJSON_IsNull(ad_image_18_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_18_tag
    cJSON *ad_image_18_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_18_tag");
    if (cJSON_IsNull(ad_image_18_tag)) {
        ad_image_18_tag = NULL;
    }
    if (ad_image_18_tag) { 
    if(!cJSON_IsString(ad_image_18_tag) && !cJSON_IsNull(ad_image_18_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_19_link
    cJSON *ad_image_19_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_19_link");
    if (cJSON_IsNull(ad_image_19_link)) {
        ad_image_19_link = NULL;
    }
    if (ad_image_19_link) { 
    if(!cJSON_IsString(ad_image_19_link) && !cJSON_IsNull(ad_image_19_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_19_tag
    cJSON *ad_image_19_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_19_tag");
    if (cJSON_IsNull(ad_image_19_tag)) {
        ad_image_19_tag = NULL;
    }
    if (ad_image_19_tag) { 
    if(!cJSON_IsString(ad_image_19_tag) && !cJSON_IsNull(ad_image_19_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_1_link
    cJSON *ad_image_1_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_1_link");
    if (cJSON_IsNull(ad_image_1_link)) {
        ad_image_1_link = NULL;
    }
    if (ad_image_1_link) { 
    if(!cJSON_IsString(ad_image_1_link) && !cJSON_IsNull(ad_image_1_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_1_tag
    cJSON *ad_image_1_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_1_tag");
    if (cJSON_IsNull(ad_image_1_tag)) {
        ad_image_1_tag = NULL;
    }
    if (ad_image_1_tag) { 
    if(!cJSON_IsString(ad_image_1_tag) && !cJSON_IsNull(ad_image_1_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_2_link
    cJSON *ad_image_2_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_2_link");
    if (cJSON_IsNull(ad_image_2_link)) {
        ad_image_2_link = NULL;
    }
    if (ad_image_2_link) { 
    if(!cJSON_IsString(ad_image_2_link) && !cJSON_IsNull(ad_image_2_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_2_tag
    cJSON *ad_image_2_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_2_tag");
    if (cJSON_IsNull(ad_image_2_tag)) {
        ad_image_2_tag = NULL;
    }
    if (ad_image_2_tag) { 
    if(!cJSON_IsString(ad_image_2_tag) && !cJSON_IsNull(ad_image_2_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_3_link
    cJSON *ad_image_3_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_3_link");
    if (cJSON_IsNull(ad_image_3_link)) {
        ad_image_3_link = NULL;
    }
    if (ad_image_3_link) { 
    if(!cJSON_IsString(ad_image_3_link) && !cJSON_IsNull(ad_image_3_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_3_tag
    cJSON *ad_image_3_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_3_tag");
    if (cJSON_IsNull(ad_image_3_tag)) {
        ad_image_3_tag = NULL;
    }
    if (ad_image_3_tag) { 
    if(!cJSON_IsString(ad_image_3_tag) && !cJSON_IsNull(ad_image_3_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_4_link
    cJSON *ad_image_4_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_4_link");
    if (cJSON_IsNull(ad_image_4_link)) {
        ad_image_4_link = NULL;
    }
    if (ad_image_4_link) { 
    if(!cJSON_IsString(ad_image_4_link) && !cJSON_IsNull(ad_image_4_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_4_tag
    cJSON *ad_image_4_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_4_tag");
    if (cJSON_IsNull(ad_image_4_tag)) {
        ad_image_4_tag = NULL;
    }
    if (ad_image_4_tag) { 
    if(!cJSON_IsString(ad_image_4_tag) && !cJSON_IsNull(ad_image_4_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_5_link
    cJSON *ad_image_5_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_5_link");
    if (cJSON_IsNull(ad_image_5_link)) {
        ad_image_5_link = NULL;
    }
    if (ad_image_5_link) { 
    if(!cJSON_IsString(ad_image_5_link) && !cJSON_IsNull(ad_image_5_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_5_tag
    cJSON *ad_image_5_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_5_tag");
    if (cJSON_IsNull(ad_image_5_tag)) {
        ad_image_5_tag = NULL;
    }
    if (ad_image_5_tag) { 
    if(!cJSON_IsString(ad_image_5_tag) && !cJSON_IsNull(ad_image_5_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_6_link
    cJSON *ad_image_6_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_6_link");
    if (cJSON_IsNull(ad_image_6_link)) {
        ad_image_6_link = NULL;
    }
    if (ad_image_6_link) { 
    if(!cJSON_IsString(ad_image_6_link) && !cJSON_IsNull(ad_image_6_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_6_tag
    cJSON *ad_image_6_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_6_tag");
    if (cJSON_IsNull(ad_image_6_tag)) {
        ad_image_6_tag = NULL;
    }
    if (ad_image_6_tag) { 
    if(!cJSON_IsString(ad_image_6_tag) && !cJSON_IsNull(ad_image_6_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_7_link
    cJSON *ad_image_7_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_7_link");
    if (cJSON_IsNull(ad_image_7_link)) {
        ad_image_7_link = NULL;
    }
    if (ad_image_7_link) { 
    if(!cJSON_IsString(ad_image_7_link) && !cJSON_IsNull(ad_image_7_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_7_tag
    cJSON *ad_image_7_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_7_tag");
    if (cJSON_IsNull(ad_image_7_tag)) {
        ad_image_7_tag = NULL;
    }
    if (ad_image_7_tag) { 
    if(!cJSON_IsString(ad_image_7_tag) && !cJSON_IsNull(ad_image_7_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_8_link
    cJSON *ad_image_8_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_8_link");
    if (cJSON_IsNull(ad_image_8_link)) {
        ad_image_8_link = NULL;
    }
    if (ad_image_8_link) { 
    if(!cJSON_IsString(ad_image_8_link) && !cJSON_IsNull(ad_image_8_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_8_tag
    cJSON *ad_image_8_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_8_tag");
    if (cJSON_IsNull(ad_image_8_tag)) {
        ad_image_8_tag = NULL;
    }
    if (ad_image_8_tag) { 
    if(!cJSON_IsString(ad_image_8_tag) && !cJSON_IsNull(ad_image_8_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_9_link
    cJSON *ad_image_9_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_9_link");
    if (cJSON_IsNull(ad_image_9_link)) {
        ad_image_9_link = NULL;
    }
    if (ad_image_9_link) { 
    if(!cJSON_IsString(ad_image_9_link) && !cJSON_IsNull(ad_image_9_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_image_9_tag
    cJSON *ad_image_9_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_image_9_tag");
    if (cJSON_IsNull(ad_image_9_tag)) {
        ad_image_9_tag = NULL;
    }
    if (ad_image_9_tag) { 
    if(!cJSON_IsString(ad_image_9_tag) && !cJSON_IsNull(ad_image_9_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_link
    cJSON *ad_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_link");
    if (cJSON_IsNull(ad_link)) {
        ad_link = NULL;
    }
    if (ad_link) { 
    if(!cJSON_IsString(ad_link) && !cJSON_IsNull(ad_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_video_0_link
    cJSON *ad_video_0_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_video_0_link");
    if (cJSON_IsNull(ad_video_0_link)) {
        ad_video_0_link = NULL;
    }
    if (ad_video_0_link) { 
    if(!cJSON_IsString(ad_video_0_link) && !cJSON_IsNull(ad_video_0_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_video_0_tag
    cJSON *ad_video_0_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_video_0_tag");
    if (cJSON_IsNull(ad_video_0_tag)) {
        ad_video_0_tag = NULL;
    }
    if (ad_video_0_tag) { 
    if(!cJSON_IsString(ad_video_0_tag) && !cJSON_IsNull(ad_video_0_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_video_1_link
    cJSON *ad_video_1_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_video_1_link");
    if (cJSON_IsNull(ad_video_1_link)) {
        ad_video_1_link = NULL;
    }
    if (ad_video_1_link) { 
    if(!cJSON_IsString(ad_video_1_link) && !cJSON_IsNull(ad_video_1_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_video_1_tag
    cJSON *ad_video_1_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_video_1_tag");
    if (cJSON_IsNull(ad_video_1_tag)) {
        ad_video_1_tag = NULL;
    }
    if (ad_video_1_tag) { 
    if(!cJSON_IsString(ad_video_1_tag) && !cJSON_IsNull(ad_video_1_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_video_2_link
    cJSON *ad_video_2_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_video_2_link");
    if (cJSON_IsNull(ad_video_2_link)) {
        ad_video_2_link = NULL;
    }
    if (ad_video_2_link) { 
    if(!cJSON_IsString(ad_video_2_link) && !cJSON_IsNull(ad_video_2_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ad_video_2_tag
    cJSON *ad_video_2_tag = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_video_2_tag");
    if (cJSON_IsNull(ad_video_2_tag)) {
        ad_video_2_tag = NULL;
    }
    if (ad_video_2_tag) { 
    if(!cJSON_IsString(ad_video_2_tag) && !cJSON_IsNull(ad_video_2_tag))
    {
    goto end; //String
    }
    }

    // item_attributes_request->additional_image_link
    cJSON *additional_image_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "additional_image_link");
    if (cJSON_IsNull(additional_image_link)) {
        additional_image_link = NULL;
    }
    if (additional_image_link) { 
    cJSON *additional_image_link_local = NULL;
    if(!cJSON_IsArray(additional_image_link)) {
        goto end;//primitive container
    }
    additional_image_linkList = list_createList();

    cJSON_ArrayForEach(additional_image_link_local, additional_image_link)
    {
        if(!cJSON_IsString(additional_image_link_local))
        {
            goto end;
        }
        list_addElement(additional_image_linkList , strdup(additional_image_link_local->valuestring));
    }
    }

    // item_attributes_request->adult
    cJSON *adult = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "adult");
    if (cJSON_IsNull(adult)) {
        adult = NULL;
    }
    if (adult) { 
    if(!cJSON_IsBool(adult))
    {
    goto end; //Bool
    }
    adult_local_var = malloc(sizeof(int));
    if(!adult_local_var)
    {
        goto end;
    }
    *adult_local_var = adult->valueint;
    }

    // item_attributes_request->age_group
    cJSON *age_group = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "age_group");
    if (cJSON_IsNull(age_group)) {
        age_group = NULL;
    }
    if (age_group) { 
    if(!cJSON_IsString(age_group) && !cJSON_IsNull(age_group))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ai_disclosures
    cJSON *ai_disclosures = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ai_disclosures");
    if (cJSON_IsNull(ai_disclosures)) {
        ai_disclosures = NULL;
    }
    if (ai_disclosures) { 
    cJSON *ai_disclosures_local_nonprimitive = NULL;
    if(!cJSON_IsArray(ai_disclosures)){
        goto end; //nonprimitive container
    }

    ai_disclosuresList = list_createList();

    cJSON_ArrayForEach(ai_disclosures_local_nonprimitive,ai_disclosures )
    {
        if(!cJSON_IsObject(ai_disclosures_local_nonprimitive)){
            goto end;
        }
        catalogs_ai_content_disclosure_t *ai_disclosuresItem = catalogs_ai_content_disclosure_parseFromJSON(ai_disclosures_local_nonprimitive);

        list_addElement(ai_disclosuresList, ai_disclosuresItem);
    }
    }

    // item_attributes_request->android_deep_link
    cJSON *android_deep_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "android_deep_link");
    if (cJSON_IsNull(android_deep_link)) {
        android_deep_link = NULL;
    }
    if (android_deep_link) { 
    if(!cJSON_IsString(android_deep_link) && !cJSON_IsNull(android_deep_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "availability");
    if (cJSON_IsNull(availability)) {
        availability = NULL;
    }
    if (availability) { 
    if(!cJSON_IsString(availability) && !cJSON_IsNull(availability))
    {
    goto end; //String
    }
    }

    // item_attributes_request->average_review_rating
    cJSON *average_review_rating = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "average_review_rating");
    if (cJSON_IsNull(average_review_rating)) {
        average_review_rating = NULL;
    }
    if (average_review_rating) { 
    if(!cJSON_IsNumber(average_review_rating))
    {
    goto end; //Numeric
    }
    average_review_rating_local_var = malloc(sizeof(double));
    if(!average_review_rating_local_var)
    {
        goto end;
    }
    *average_review_rating_local_var = average_review_rating->valuedouble;
    }

    // item_attributes_request->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "brand");
    if (cJSON_IsNull(brand)) {
        brand = NULL;
    }
    if (brand) { 
    if(!cJSON_IsString(brand) && !cJSON_IsNull(brand))
    {
    goto end; //String
    }
    }

    // item_attributes_request->checkout_enabled
    cJSON *checkout_enabled = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "checkout_enabled");
    if (cJSON_IsNull(checkout_enabled)) {
        checkout_enabled = NULL;
    }
    if (checkout_enabled) { 
    if(!cJSON_IsBool(checkout_enabled))
    {
    goto end; //Bool
    }
    checkout_enabled_local_var = malloc(sizeof(int));
    if(!checkout_enabled_local_var)
    {
        goto end;
    }
    *checkout_enabled_local_var = checkout_enabled->valueint;
    }

    // item_attributes_request->color
    cJSON *color = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "color");
    if (cJSON_IsNull(color)) {
        color = NULL;
    }
    if (color) { 
    if(!cJSON_IsString(color) && !cJSON_IsNull(color))
    {
    goto end; //String
    }
    }

    // item_attributes_request->condition
    cJSON *condition = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "condition");
    if (cJSON_IsNull(condition)) {
        condition = NULL;
    }
    if (condition) { 
    if(!cJSON_IsString(condition) && !cJSON_IsNull(condition))
    {
    goto end; //String
    }
    }

    // item_attributes_request->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_label_0");
    if (cJSON_IsNull(custom_label_0)) {
        custom_label_0 = NULL;
    }
    if (custom_label_0) { 
    if(!cJSON_IsString(custom_label_0) && !cJSON_IsNull(custom_label_0))
    {
    goto end; //String
    }
    }

    // item_attributes_request->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_label_1");
    if (cJSON_IsNull(custom_label_1)) {
        custom_label_1 = NULL;
    }
    if (custom_label_1) { 
    if(!cJSON_IsString(custom_label_1) && !cJSON_IsNull(custom_label_1))
    {
    goto end; //String
    }
    }

    // item_attributes_request->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_label_2");
    if (cJSON_IsNull(custom_label_2)) {
        custom_label_2 = NULL;
    }
    if (custom_label_2) { 
    if(!cJSON_IsString(custom_label_2) && !cJSON_IsNull(custom_label_2))
    {
    goto end; //String
    }
    }

    // item_attributes_request->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_label_3");
    if (cJSON_IsNull(custom_label_3)) {
        custom_label_3 = NULL;
    }
    if (custom_label_3) { 
    if(!cJSON_IsString(custom_label_3) && !cJSON_IsNull(custom_label_3))
    {
    goto end; //String
    }
    }

    // item_attributes_request->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_label_4");
    if (cJSON_IsNull(custom_label_4)) {
        custom_label_4 = NULL;
    }
    if (custom_label_4) { 
    if(!cJSON_IsString(custom_label_4) && !cJSON_IsNull(custom_label_4))
    {
    goto end; //String
    }
    }

    // item_attributes_request->custom_number_0
    cJSON *custom_number_0 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_number_0");
    if (cJSON_IsNull(custom_number_0)) {
        custom_number_0 = NULL;
    }
    if (custom_number_0) { 
    if(!cJSON_IsNumber(custom_number_0))
    {
    goto end; //Numeric
    }
    custom_number_0_local_var = malloc(sizeof(int));
    if(!custom_number_0_local_var)
    {
        goto end;
    }
    *custom_number_0_local_var = custom_number_0->valuedouble;
    }

    // item_attributes_request->custom_number_1
    cJSON *custom_number_1 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_number_1");
    if (cJSON_IsNull(custom_number_1)) {
        custom_number_1 = NULL;
    }
    if (custom_number_1) { 
    if(!cJSON_IsNumber(custom_number_1))
    {
    goto end; //Numeric
    }
    custom_number_1_local_var = malloc(sizeof(int));
    if(!custom_number_1_local_var)
    {
        goto end;
    }
    *custom_number_1_local_var = custom_number_1->valuedouble;
    }

    // item_attributes_request->custom_number_2
    cJSON *custom_number_2 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_number_2");
    if (cJSON_IsNull(custom_number_2)) {
        custom_number_2 = NULL;
    }
    if (custom_number_2) { 
    if(!cJSON_IsNumber(custom_number_2))
    {
    goto end; //Numeric
    }
    custom_number_2_local_var = malloc(sizeof(int));
    if(!custom_number_2_local_var)
    {
        goto end;
    }
    *custom_number_2_local_var = custom_number_2->valuedouble;
    }

    // item_attributes_request->custom_number_3
    cJSON *custom_number_3 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_number_3");
    if (cJSON_IsNull(custom_number_3)) {
        custom_number_3 = NULL;
    }
    if (custom_number_3) { 
    if(!cJSON_IsNumber(custom_number_3))
    {
    goto end; //Numeric
    }
    custom_number_3_local_var = malloc(sizeof(int));
    if(!custom_number_3_local_var)
    {
        goto end;
    }
    *custom_number_3_local_var = custom_number_3->valuedouble;
    }

    // item_attributes_request->custom_number_4
    cJSON *custom_number_4 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_number_4");
    if (cJSON_IsNull(custom_number_4)) {
        custom_number_4 = NULL;
    }
    if (custom_number_4) { 
    if(!cJSON_IsNumber(custom_number_4))
    {
    goto end; //Numeric
    }
    custom_number_4_local_var = malloc(sizeof(int));
    if(!custom_number_4_local_var)
    {
        goto end;
    }
    *custom_number_4_local_var = custom_number_4->valuedouble;
    }

    // item_attributes_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // item_attributes_request->free_shipping_label
    cJSON *free_shipping_label = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "free_shipping_label");
    if (cJSON_IsNull(free_shipping_label)) {
        free_shipping_label = NULL;
    }
    if (free_shipping_label) { 
    if(!cJSON_IsBool(free_shipping_label))
    {
    goto end; //Bool
    }
    free_shipping_label_local_var = malloc(sizeof(int));
    if(!free_shipping_label_local_var)
    {
        goto end;
    }
    *free_shipping_label_local_var = free_shipping_label->valueint;
    }

    // item_attributes_request->free_shipping_limit
    cJSON *free_shipping_limit = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "free_shipping_limit");
    if (cJSON_IsNull(free_shipping_limit)) {
        free_shipping_limit = NULL;
    }
    if (free_shipping_limit) { 
    if(!cJSON_IsString(free_shipping_limit) && !cJSON_IsNull(free_shipping_limit))
    {
    goto end; //String
    }
    }

    // item_attributes_request->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "gender");
    if (cJSON_IsNull(gender)) {
        gender = NULL;
    }
    if (gender) { 
    if(!cJSON_IsString(gender) && !cJSON_IsNull(gender))
    {
    goto end; //String
    }
    }

    // item_attributes_request->google_product_category
    cJSON *google_product_category = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "google_product_category");
    if (cJSON_IsNull(google_product_category)) {
        google_product_category = NULL;
    }
    if (google_product_category) { 
    if(!cJSON_IsString(google_product_category) && !cJSON_IsNull(google_product_category))
    {
    goto end; //String
    }
    }

    // item_attributes_request->gtin
    cJSON *gtin = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "gtin");
    if (cJSON_IsNull(gtin)) {
        gtin = NULL;
    }
    if (gtin) { 
    gtin_local_nonprim = updatable_item_attributes_gtin_parseFromJSON(gtin); //nonprimitive
    }

    // item_attributes_request->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // item_attributes_request->image_link
    cJSON *image_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "image_link");
    if (cJSON_IsNull(image_link)) {
        image_link = NULL;
    }
    if (image_link) { 
    image_link_local_nonprim = item_attributes_request_image_link_parseFromJSON(image_link); //nonprimitive
    }

    // item_attributes_request->installment_price
    cJSON *installment_price = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "installment_price");
    if (cJSON_IsNull(installment_price)) {
        installment_price = NULL;
    }
    if (installment_price) { 
    if(!cJSON_IsString(installment_price) && !cJSON_IsNull(installment_price))
    {
    goto end; //String
    }
    }

    // item_attributes_request->ios_deep_link
    cJSON *ios_deep_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ios_deep_link");
    if (cJSON_IsNull(ios_deep_link)) {
        ios_deep_link = NULL;
    }
    if (ios_deep_link) { 
    if(!cJSON_IsString(ios_deep_link) && !cJSON_IsNull(ios_deep_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->item_group_id
    cJSON *item_group_id = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "item_group_id");
    if (cJSON_IsNull(item_group_id)) {
        item_group_id = NULL;
    }
    if (item_group_id) { 
    if(!cJSON_IsString(item_group_id) && !cJSON_IsNull(item_group_id))
    {
    goto end; //String
    }
    }

    // item_attributes_request->last_updated_time
    cJSON *last_updated_time = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "last_updated_time");
    if (cJSON_IsNull(last_updated_time)) {
        last_updated_time = NULL;
    }
    if (last_updated_time) { 
    if(!cJSON_IsNumber(last_updated_time))
    {
    goto end; //Numeric
    }
    last_updated_time_local_var = malloc(sizeof(long));
    if(!last_updated_time_local_var)
    {
        goto end;
    }
    *last_updated_time_local_var = last_updated_time->valuedouble;
    }

    // item_attributes_request->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->material
    cJSON *material = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "material");
    if (cJSON_IsNull(material)) {
        material = NULL;
    }
    if (material) { 
    if(!cJSON_IsString(material) && !cJSON_IsNull(material))
    {
    goto end; //String
    }
    }

    // item_attributes_request->min_ad_price
    cJSON *min_ad_price = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "min_ad_price");
    if (cJSON_IsNull(min_ad_price)) {
        min_ad_price = NULL;
    }
    if (min_ad_price) { 
    if(!cJSON_IsString(min_ad_price) && !cJSON_IsNull(min_ad_price))
    {
    goto end; //String
    }
    }

    // item_attributes_request->mobile_link
    cJSON *mobile_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "mobile_link");
    if (cJSON_IsNull(mobile_link)) {
        mobile_link = NULL;
    }
    if (mobile_link) { 
    if(!cJSON_IsString(mobile_link) && !cJSON_IsNull(mobile_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->mpn
    cJSON *mpn = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "mpn");
    if (cJSON_IsNull(mpn)) {
        mpn = NULL;
    }
    if (mpn) { 
    if(!cJSON_IsString(mpn) && !cJSON_IsNull(mpn))
    {
    goto end; //String
    }
    }

    // item_attributes_request->number_of_ratings
    cJSON *number_of_ratings = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "number_of_ratings");
    if (cJSON_IsNull(number_of_ratings)) {
        number_of_ratings = NULL;
    }
    if (number_of_ratings) { 
    if(!cJSON_IsNumber(number_of_ratings))
    {
    goto end; //Numeric
    }
    number_of_ratings_local_var = malloc(sizeof(int));
    if(!number_of_ratings_local_var)
    {
        goto end;
    }
    *number_of_ratings_local_var = number_of_ratings->valuedouble;
    }

    // item_attributes_request->number_of_reviews
    cJSON *number_of_reviews = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "number_of_reviews");
    if (cJSON_IsNull(number_of_reviews)) {
        number_of_reviews = NULL;
    }
    if (number_of_reviews) { 
    if(!cJSON_IsNumber(number_of_reviews))
    {
    goto end; //Numeric
    }
    number_of_reviews_local_var = malloc(sizeof(int));
    if(!number_of_reviews_local_var)
    {
        goto end;
    }
    *number_of_reviews_local_var = number_of_reviews->valuedouble;
    }

    // item_attributes_request->pattern
    cJSON *pattern = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "pattern");
    if (cJSON_IsNull(pattern)) {
        pattern = NULL;
    }
    if (pattern) { 
    if(!cJSON_IsString(pattern) && !cJSON_IsNull(pattern))
    {
    goto end; //String
    }
    }

    // item_attributes_request->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "price");
    if (cJSON_IsNull(price)) {
        price = NULL;
    }
    if (price) { 
    if(!cJSON_IsString(price) && !cJSON_IsNull(price))
    {
    goto end; //String
    }
    }

    // item_attributes_request->product_type
    cJSON *product_type = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "product_type");
    if (cJSON_IsNull(product_type)) {
        product_type = NULL;
    }
    if (product_type) { 
    if(!cJSON_IsString(product_type) && !cJSON_IsNull(product_type))
    {
    goto end; //String
    }
    }

    // item_attributes_request->promotion_id
    cJSON *promotion_id = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "promotion_id");
    if (cJSON_IsNull(promotion_id)) {
        promotion_id = NULL;
    }
    if (promotion_id) { 
    if(!cJSON_IsString(promotion_id) && !cJSON_IsNull(promotion_id))
    {
    goto end; //String
    }
    }

    // item_attributes_request->sale_price
    cJSON *sale_price = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "sale_price");
    if (cJSON_IsNull(sale_price)) {
        sale_price = NULL;
    }
    if (sale_price) { 
    if(!cJSON_IsString(sale_price) && !cJSON_IsNull(sale_price))
    {
    goto end; //String
    }
    }

    // item_attributes_request->sale_price_effective_date
    cJSON *sale_price_effective_date = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "sale_price_effective_date");
    if (cJSON_IsNull(sale_price_effective_date)) {
        sale_price_effective_date = NULL;
    }
    if (sale_price_effective_date) { 
    if(!cJSON_IsString(sale_price_effective_date) && !cJSON_IsNull(sale_price_effective_date))
    {
    goto end; //String
    }
    }

    // item_attributes_request->save_pin_disabled
    cJSON *save_pin_disabled = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "save_pin_disabled");
    if (cJSON_IsNull(save_pin_disabled)) {
        save_pin_disabled = NULL;
    }
    if (save_pin_disabled) { 
    if(!cJSON_IsBool(save_pin_disabled))
    {
    goto end; //Bool
    }
    save_pin_disabled_local_var = malloc(sizeof(int));
    if(!save_pin_disabled_local_var)
    {
        goto end;
    }
    *save_pin_disabled_local_var = save_pin_disabled->valueint;
    }

    // item_attributes_request->shipping
    cJSON *shipping = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "shipping");
    if (cJSON_IsNull(shipping)) {
        shipping = NULL;
    }
    if (shipping) { 
    if(!cJSON_IsString(shipping) && !cJSON_IsNull(shipping))
    {
    goto end; //String
    }
    }

    // item_attributes_request->shipping_height
    cJSON *shipping_height = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "shipping_height");
    if (cJSON_IsNull(shipping_height)) {
        shipping_height = NULL;
    }
    if (shipping_height) { 
    if(!cJSON_IsString(shipping_height) && !cJSON_IsNull(shipping_height))
    {
    goto end; //String
    }
    }

    // item_attributes_request->shipping_weight
    cJSON *shipping_weight = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "shipping_weight");
    if (cJSON_IsNull(shipping_weight)) {
        shipping_weight = NULL;
    }
    if (shipping_weight) { 
    if(!cJSON_IsString(shipping_weight) && !cJSON_IsNull(shipping_weight))
    {
    goto end; //String
    }
    }

    // item_attributes_request->shipping_width
    cJSON *shipping_width = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "shipping_width");
    if (cJSON_IsNull(shipping_width)) {
        shipping_width = NULL;
    }
    if (shipping_width) { 
    if(!cJSON_IsString(shipping_width) && !cJSON_IsNull(shipping_width))
    {
    goto end; //String
    }
    }

    // item_attributes_request->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "size");
    if (cJSON_IsNull(size)) {
        size = NULL;
    }
    if (size) { 
    if(!cJSON_IsString(size) && !cJSON_IsNull(size))
    {
    goto end; //String
    }
    }

    // item_attributes_request->size_system
    cJSON *size_system = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "size_system");
    if (cJSON_IsNull(size_system)) {
        size_system = NULL;
    }
    if (size_system) { 
    if(!cJSON_IsString(size_system) && !cJSON_IsNull(size_system))
    {
    goto end; //String
    }
    }

    // item_attributes_request->size_type
    cJSON *size_type = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "size_type");
    if (cJSON_IsNull(size_type)) {
        size_type = NULL;
    }
    if (size_type) { 
    if(!cJSON_IsString(size_type) && !cJSON_IsNull(size_type))
    {
    goto end; //String
    }
    }

    // item_attributes_request->tax
    cJSON *tax = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "tax");
    if (cJSON_IsNull(tax)) {
        tax = NULL;
    }
    if (tax) { 
    if(!cJSON_IsString(tax) && !cJSON_IsNull(tax))
    {
    goto end; //String
    }
    }

    // item_attributes_request->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // item_attributes_request->unit_pricing_base_measure
    cJSON *unit_pricing_base_measure = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "unit_pricing_base_measure");
    if (cJSON_IsNull(unit_pricing_base_measure)) {
        unit_pricing_base_measure = NULL;
    }
    if (unit_pricing_base_measure) { 
    if(!cJSON_IsString(unit_pricing_base_measure) && !cJSON_IsNull(unit_pricing_base_measure))
    {
    goto end; //String
    }
    }

    // item_attributes_request->unit_pricing_measure
    cJSON *unit_pricing_measure = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "unit_pricing_measure");
    if (cJSON_IsNull(unit_pricing_measure)) {
        unit_pricing_measure = NULL;
    }
    if (unit_pricing_measure) { 
    if(!cJSON_IsString(unit_pricing_measure) && !cJSON_IsNull(unit_pricing_measure))
    {
    goto end; //String
    }
    }

    // item_attributes_request->variant_names
    cJSON *variant_names = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "variant_names");
    if (cJSON_IsNull(variant_names)) {
        variant_names = NULL;
    }
    if (variant_names) { 
    cJSON *variant_names_local = NULL;
    if(!cJSON_IsArray(variant_names)) {
        goto end;//primitive container
    }
    variant_namesList = list_createList();

    cJSON_ArrayForEach(variant_names_local, variant_names)
    {
        if(!cJSON_IsString(variant_names_local))
        {
            goto end;
        }
        list_addElement(variant_namesList , strdup(variant_names_local->valuestring));
    }
    }

    // item_attributes_request->variant_values
    cJSON *variant_values = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "variant_values");
    if (cJSON_IsNull(variant_values)) {
        variant_values = NULL;
    }
    if (variant_values) { 
    cJSON *variant_values_local = NULL;
    if(!cJSON_IsArray(variant_values)) {
        goto end;//primitive container
    }
    variant_valuesList = list_createList();

    cJSON_ArrayForEach(variant_values_local, variant_values)
    {
        if(!cJSON_IsString(variant_values_local))
        {
            goto end;
        }
        list_addElement(variant_valuesList , strdup(variant_values_local->valuestring));
    }
    }

    // item_attributes_request->video_link
    cJSON *video_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "video_link");
    if (cJSON_IsNull(video_link)) {
        video_link = NULL;
    }
    if (video_link) { 
    if(!cJSON_IsString(video_link) && !cJSON_IsNull(video_link))
    {
    goto end; //String
    }
    }


    if (ad_image_0_link && !cJSON_IsNull(ad_image_0_link)) ad_image_0_link_local_str = strdup(ad_image_0_link->valuestring);
    if (ad_image_0_tag && !cJSON_IsNull(ad_image_0_tag)) ad_image_0_tag_local_str = strdup(ad_image_0_tag->valuestring);
    if (ad_image_10_link && !cJSON_IsNull(ad_image_10_link)) ad_image_10_link_local_str = strdup(ad_image_10_link->valuestring);
    if (ad_image_10_tag && !cJSON_IsNull(ad_image_10_tag)) ad_image_10_tag_local_str = strdup(ad_image_10_tag->valuestring);
    if (ad_image_11_link && !cJSON_IsNull(ad_image_11_link)) ad_image_11_link_local_str = strdup(ad_image_11_link->valuestring);
    if (ad_image_11_tag && !cJSON_IsNull(ad_image_11_tag)) ad_image_11_tag_local_str = strdup(ad_image_11_tag->valuestring);
    if (ad_image_12_link && !cJSON_IsNull(ad_image_12_link)) ad_image_12_link_local_str = strdup(ad_image_12_link->valuestring);
    if (ad_image_12_tag && !cJSON_IsNull(ad_image_12_tag)) ad_image_12_tag_local_str = strdup(ad_image_12_tag->valuestring);
    if (ad_image_13_link && !cJSON_IsNull(ad_image_13_link)) ad_image_13_link_local_str = strdup(ad_image_13_link->valuestring);
    if (ad_image_13_tag && !cJSON_IsNull(ad_image_13_tag)) ad_image_13_tag_local_str = strdup(ad_image_13_tag->valuestring);
    if (ad_image_14_link && !cJSON_IsNull(ad_image_14_link)) ad_image_14_link_local_str = strdup(ad_image_14_link->valuestring);
    if (ad_image_14_tag && !cJSON_IsNull(ad_image_14_tag)) ad_image_14_tag_local_str = strdup(ad_image_14_tag->valuestring);
    if (ad_image_15_link && !cJSON_IsNull(ad_image_15_link)) ad_image_15_link_local_str = strdup(ad_image_15_link->valuestring);
    if (ad_image_15_tag && !cJSON_IsNull(ad_image_15_tag)) ad_image_15_tag_local_str = strdup(ad_image_15_tag->valuestring);
    if (ad_image_16_link && !cJSON_IsNull(ad_image_16_link)) ad_image_16_link_local_str = strdup(ad_image_16_link->valuestring);
    if (ad_image_16_tag && !cJSON_IsNull(ad_image_16_tag)) ad_image_16_tag_local_str = strdup(ad_image_16_tag->valuestring);
    if (ad_image_17_link && !cJSON_IsNull(ad_image_17_link)) ad_image_17_link_local_str = strdup(ad_image_17_link->valuestring);
    if (ad_image_17_tag && !cJSON_IsNull(ad_image_17_tag)) ad_image_17_tag_local_str = strdup(ad_image_17_tag->valuestring);
    if (ad_image_18_link && !cJSON_IsNull(ad_image_18_link)) ad_image_18_link_local_str = strdup(ad_image_18_link->valuestring);
    if (ad_image_18_tag && !cJSON_IsNull(ad_image_18_tag)) ad_image_18_tag_local_str = strdup(ad_image_18_tag->valuestring);
    if (ad_image_19_link && !cJSON_IsNull(ad_image_19_link)) ad_image_19_link_local_str = strdup(ad_image_19_link->valuestring);
    if (ad_image_19_tag && !cJSON_IsNull(ad_image_19_tag)) ad_image_19_tag_local_str = strdup(ad_image_19_tag->valuestring);
    if (ad_image_1_link && !cJSON_IsNull(ad_image_1_link)) ad_image_1_link_local_str = strdup(ad_image_1_link->valuestring);
    if (ad_image_1_tag && !cJSON_IsNull(ad_image_1_tag)) ad_image_1_tag_local_str = strdup(ad_image_1_tag->valuestring);
    if (ad_image_2_link && !cJSON_IsNull(ad_image_2_link)) ad_image_2_link_local_str = strdup(ad_image_2_link->valuestring);
    if (ad_image_2_tag && !cJSON_IsNull(ad_image_2_tag)) ad_image_2_tag_local_str = strdup(ad_image_2_tag->valuestring);
    if (ad_image_3_link && !cJSON_IsNull(ad_image_3_link)) ad_image_3_link_local_str = strdup(ad_image_3_link->valuestring);
    if (ad_image_3_tag && !cJSON_IsNull(ad_image_3_tag)) ad_image_3_tag_local_str = strdup(ad_image_3_tag->valuestring);
    if (ad_image_4_link && !cJSON_IsNull(ad_image_4_link)) ad_image_4_link_local_str = strdup(ad_image_4_link->valuestring);
    if (ad_image_4_tag && !cJSON_IsNull(ad_image_4_tag)) ad_image_4_tag_local_str = strdup(ad_image_4_tag->valuestring);
    if (ad_image_5_link && !cJSON_IsNull(ad_image_5_link)) ad_image_5_link_local_str = strdup(ad_image_5_link->valuestring);
    if (ad_image_5_tag && !cJSON_IsNull(ad_image_5_tag)) ad_image_5_tag_local_str = strdup(ad_image_5_tag->valuestring);
    if (ad_image_6_link && !cJSON_IsNull(ad_image_6_link)) ad_image_6_link_local_str = strdup(ad_image_6_link->valuestring);
    if (ad_image_6_tag && !cJSON_IsNull(ad_image_6_tag)) ad_image_6_tag_local_str = strdup(ad_image_6_tag->valuestring);
    if (ad_image_7_link && !cJSON_IsNull(ad_image_7_link)) ad_image_7_link_local_str = strdup(ad_image_7_link->valuestring);
    if (ad_image_7_tag && !cJSON_IsNull(ad_image_7_tag)) ad_image_7_tag_local_str = strdup(ad_image_7_tag->valuestring);
    if (ad_image_8_link && !cJSON_IsNull(ad_image_8_link)) ad_image_8_link_local_str = strdup(ad_image_8_link->valuestring);
    if (ad_image_8_tag && !cJSON_IsNull(ad_image_8_tag)) ad_image_8_tag_local_str = strdup(ad_image_8_tag->valuestring);
    if (ad_image_9_link && !cJSON_IsNull(ad_image_9_link)) ad_image_9_link_local_str = strdup(ad_image_9_link->valuestring);
    if (ad_image_9_tag && !cJSON_IsNull(ad_image_9_tag)) ad_image_9_tag_local_str = strdup(ad_image_9_tag->valuestring);
    if (ad_link && !cJSON_IsNull(ad_link)) ad_link_local_str = strdup(ad_link->valuestring);
    if (ad_video_0_link && !cJSON_IsNull(ad_video_0_link)) ad_video_0_link_local_str = strdup(ad_video_0_link->valuestring);
    if (ad_video_0_tag && !cJSON_IsNull(ad_video_0_tag)) ad_video_0_tag_local_str = strdup(ad_video_0_tag->valuestring);
    if (ad_video_1_link && !cJSON_IsNull(ad_video_1_link)) ad_video_1_link_local_str = strdup(ad_video_1_link->valuestring);
    if (ad_video_1_tag && !cJSON_IsNull(ad_video_1_tag)) ad_video_1_tag_local_str = strdup(ad_video_1_tag->valuestring);
    if (ad_video_2_link && !cJSON_IsNull(ad_video_2_link)) ad_video_2_link_local_str = strdup(ad_video_2_link->valuestring);
    if (ad_video_2_tag && !cJSON_IsNull(ad_video_2_tag)) ad_video_2_tag_local_str = strdup(ad_video_2_tag->valuestring);
    if (age_group && !cJSON_IsNull(age_group)) age_group_local_str = strdup(age_group->valuestring);
    if (android_deep_link && !cJSON_IsNull(android_deep_link)) android_deep_link_local_str = strdup(android_deep_link->valuestring);
    if (availability && !cJSON_IsNull(availability)) availability_local_str = strdup(availability->valuestring);
    if (brand && !cJSON_IsNull(brand)) brand_local_str = strdup(brand->valuestring);
    if (color && !cJSON_IsNull(color)) color_local_str = strdup(color->valuestring);
    if (condition && !cJSON_IsNull(condition)) condition_local_str = strdup(condition->valuestring);
    if (custom_label_0 && !cJSON_IsNull(custom_label_0)) custom_label_0_local_str = strdup(custom_label_0->valuestring);
    if (custom_label_1 && !cJSON_IsNull(custom_label_1)) custom_label_1_local_str = strdup(custom_label_1->valuestring);
    if (custom_label_2 && !cJSON_IsNull(custom_label_2)) custom_label_2_local_str = strdup(custom_label_2->valuestring);
    if (custom_label_3 && !cJSON_IsNull(custom_label_3)) custom_label_3_local_str = strdup(custom_label_3->valuestring);
    if (custom_label_4 && !cJSON_IsNull(custom_label_4)) custom_label_4_local_str = strdup(custom_label_4->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (free_shipping_limit && !cJSON_IsNull(free_shipping_limit)) free_shipping_limit_local_str = strdup(free_shipping_limit->valuestring);
    if (gender && !cJSON_IsNull(gender)) gender_local_str = strdup(gender->valuestring);
    if (google_product_category && !cJSON_IsNull(google_product_category)) google_product_category_local_str = strdup(google_product_category->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (installment_price && !cJSON_IsNull(installment_price)) installment_price_local_str = strdup(installment_price->valuestring);
    if (ios_deep_link && !cJSON_IsNull(ios_deep_link)) ios_deep_link_local_str = strdup(ios_deep_link->valuestring);
    if (item_group_id && !cJSON_IsNull(item_group_id)) item_group_id_local_str = strdup(item_group_id->valuestring);
    if (link && !cJSON_IsNull(link)) link_local_str = strdup(link->valuestring);
    if (material && !cJSON_IsNull(material)) material_local_str = strdup(material->valuestring);
    if (min_ad_price && !cJSON_IsNull(min_ad_price)) min_ad_price_local_str = strdup(min_ad_price->valuestring);
    if (mobile_link && !cJSON_IsNull(mobile_link)) mobile_link_local_str = strdup(mobile_link->valuestring);
    if (mpn && !cJSON_IsNull(mpn)) mpn_local_str = strdup(mpn->valuestring);
    if (pattern && !cJSON_IsNull(pattern)) pattern_local_str = strdup(pattern->valuestring);
    if (price && !cJSON_IsNull(price)) price_local_str = strdup(price->valuestring);
    if (product_type && !cJSON_IsNull(product_type)) product_type_local_str = strdup(product_type->valuestring);
    if (promotion_id && !cJSON_IsNull(promotion_id)) promotion_id_local_str = strdup(promotion_id->valuestring);
    if (sale_price && !cJSON_IsNull(sale_price)) sale_price_local_str = strdup(sale_price->valuestring);
    if (sale_price_effective_date && !cJSON_IsNull(sale_price_effective_date)) sale_price_effective_date_local_str = strdup(sale_price_effective_date->valuestring);
    if (shipping && !cJSON_IsNull(shipping)) shipping_local_str = strdup(shipping->valuestring);
    if (shipping_height && !cJSON_IsNull(shipping_height)) shipping_height_local_str = strdup(shipping_height->valuestring);
    if (shipping_weight && !cJSON_IsNull(shipping_weight)) shipping_weight_local_str = strdup(shipping_weight->valuestring);
    if (shipping_width && !cJSON_IsNull(shipping_width)) shipping_width_local_str = strdup(shipping_width->valuestring);
    if (size && !cJSON_IsNull(size)) size_local_str = strdup(size->valuestring);
    if (size_system && !cJSON_IsNull(size_system)) size_system_local_str = strdup(size_system->valuestring);
    if (size_type && !cJSON_IsNull(size_type)) size_type_local_str = strdup(size_type->valuestring);
    if (tax && !cJSON_IsNull(tax)) tax_local_str = strdup(tax->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (unit_pricing_base_measure && !cJSON_IsNull(unit_pricing_base_measure)) unit_pricing_base_measure_local_str = strdup(unit_pricing_base_measure->valuestring);
    if (unit_pricing_measure && !cJSON_IsNull(unit_pricing_measure)) unit_pricing_measure_local_str = strdup(unit_pricing_measure->valuestring);
    if (video_link && !cJSON_IsNull(video_link)) video_link_local_str = strdup(video_link->valuestring);

    item_attributes_request_local_var = item_attributes_request_create_internal (
        ad_image_0_link_local_str,
        ad_image_0_tag_local_str,
        ad_image_10_link_local_str,
        ad_image_10_tag_local_str,
        ad_image_11_link_local_str,
        ad_image_11_tag_local_str,
        ad_image_12_link_local_str,
        ad_image_12_tag_local_str,
        ad_image_13_link_local_str,
        ad_image_13_tag_local_str,
        ad_image_14_link_local_str,
        ad_image_14_tag_local_str,
        ad_image_15_link_local_str,
        ad_image_15_tag_local_str,
        ad_image_16_link_local_str,
        ad_image_16_tag_local_str,
        ad_image_17_link_local_str,
        ad_image_17_tag_local_str,
        ad_image_18_link_local_str,
        ad_image_18_tag_local_str,
        ad_image_19_link_local_str,
        ad_image_19_tag_local_str,
        ad_image_1_link_local_str,
        ad_image_1_tag_local_str,
        ad_image_2_link_local_str,
        ad_image_2_tag_local_str,
        ad_image_3_link_local_str,
        ad_image_3_tag_local_str,
        ad_image_4_link_local_str,
        ad_image_4_tag_local_str,
        ad_image_5_link_local_str,
        ad_image_5_tag_local_str,
        ad_image_6_link_local_str,
        ad_image_6_tag_local_str,
        ad_image_7_link_local_str,
        ad_image_7_tag_local_str,
        ad_image_8_link_local_str,
        ad_image_8_tag_local_str,
        ad_image_9_link_local_str,
        ad_image_9_tag_local_str,
        ad_link_local_str,
        ad_video_0_link_local_str,
        ad_video_0_tag_local_str,
        ad_video_1_link_local_str,
        ad_video_1_tag_local_str,
        ad_video_2_link_local_str,
        ad_video_2_tag_local_str,
        additional_image_link ? additional_image_linkList : NULL,
        adult_local_var,
        age_group_local_str,
        ai_disclosures ? ai_disclosuresList : NULL,
        android_deep_link_local_str,
        availability_local_str,
        average_review_rating_local_var,
        brand_local_str,
        checkout_enabled_local_var,
        color_local_str,
        condition_local_str,
        custom_label_0_local_str,
        custom_label_1_local_str,
        custom_label_2_local_str,
        custom_label_3_local_str,
        custom_label_4_local_str,
        custom_number_0_local_var,
        custom_number_1_local_var,
        custom_number_2_local_var,
        custom_number_3_local_var,
        custom_number_4_local_var,
        description_local_str,
        free_shipping_label_local_var,
        free_shipping_limit_local_str,
        gender_local_str,
        google_product_category_local_str,
        gtin ? gtin_local_nonprim : NULL,
        id_local_str,
        image_link ? image_link_local_nonprim : NULL,
        installment_price_local_str,
        ios_deep_link_local_str,
        item_group_id_local_str,
        last_updated_time_local_var,
        link_local_str,
        material_local_str,
        min_ad_price_local_str,
        mobile_link_local_str,
        mpn_local_str,
        number_of_ratings_local_var,
        number_of_reviews_local_var,
        pattern_local_str,
        price_local_str,
        product_type_local_str,
        promotion_id_local_str,
        sale_price_local_str,
        sale_price_effective_date_local_str,
        save_pin_disabled_local_var,
        shipping_local_str,
        shipping_height_local_str,
        shipping_weight_local_str,
        shipping_width_local_str,
        size_local_str,
        size_system_local_str,
        size_type_local_str,
        tax_local_str,
        title_local_str,
        unit_pricing_base_measure_local_str,
        unit_pricing_measure_local_str,
        variant_names ? variant_namesList : NULL,
        variant_values ? variant_valuesList : NULL,
        video_link_local_str
        );

    if (!item_attributes_request_local_var) {
        goto end;
    }

    return item_attributes_request_local_var;
end:
    if (ad_image_0_link_local_str) {
        free(ad_image_0_link_local_str);
        ad_image_0_link_local_str = NULL;
    }
    if (ad_image_0_tag_local_str) {
        free(ad_image_0_tag_local_str);
        ad_image_0_tag_local_str = NULL;
    }
    if (ad_image_10_link_local_str) {
        free(ad_image_10_link_local_str);
        ad_image_10_link_local_str = NULL;
    }
    if (ad_image_10_tag_local_str) {
        free(ad_image_10_tag_local_str);
        ad_image_10_tag_local_str = NULL;
    }
    if (ad_image_11_link_local_str) {
        free(ad_image_11_link_local_str);
        ad_image_11_link_local_str = NULL;
    }
    if (ad_image_11_tag_local_str) {
        free(ad_image_11_tag_local_str);
        ad_image_11_tag_local_str = NULL;
    }
    if (ad_image_12_link_local_str) {
        free(ad_image_12_link_local_str);
        ad_image_12_link_local_str = NULL;
    }
    if (ad_image_12_tag_local_str) {
        free(ad_image_12_tag_local_str);
        ad_image_12_tag_local_str = NULL;
    }
    if (ad_image_13_link_local_str) {
        free(ad_image_13_link_local_str);
        ad_image_13_link_local_str = NULL;
    }
    if (ad_image_13_tag_local_str) {
        free(ad_image_13_tag_local_str);
        ad_image_13_tag_local_str = NULL;
    }
    if (ad_image_14_link_local_str) {
        free(ad_image_14_link_local_str);
        ad_image_14_link_local_str = NULL;
    }
    if (ad_image_14_tag_local_str) {
        free(ad_image_14_tag_local_str);
        ad_image_14_tag_local_str = NULL;
    }
    if (ad_image_15_link_local_str) {
        free(ad_image_15_link_local_str);
        ad_image_15_link_local_str = NULL;
    }
    if (ad_image_15_tag_local_str) {
        free(ad_image_15_tag_local_str);
        ad_image_15_tag_local_str = NULL;
    }
    if (ad_image_16_link_local_str) {
        free(ad_image_16_link_local_str);
        ad_image_16_link_local_str = NULL;
    }
    if (ad_image_16_tag_local_str) {
        free(ad_image_16_tag_local_str);
        ad_image_16_tag_local_str = NULL;
    }
    if (ad_image_17_link_local_str) {
        free(ad_image_17_link_local_str);
        ad_image_17_link_local_str = NULL;
    }
    if (ad_image_17_tag_local_str) {
        free(ad_image_17_tag_local_str);
        ad_image_17_tag_local_str = NULL;
    }
    if (ad_image_18_link_local_str) {
        free(ad_image_18_link_local_str);
        ad_image_18_link_local_str = NULL;
    }
    if (ad_image_18_tag_local_str) {
        free(ad_image_18_tag_local_str);
        ad_image_18_tag_local_str = NULL;
    }
    if (ad_image_19_link_local_str) {
        free(ad_image_19_link_local_str);
        ad_image_19_link_local_str = NULL;
    }
    if (ad_image_19_tag_local_str) {
        free(ad_image_19_tag_local_str);
        ad_image_19_tag_local_str = NULL;
    }
    if (ad_image_1_link_local_str) {
        free(ad_image_1_link_local_str);
        ad_image_1_link_local_str = NULL;
    }
    if (ad_image_1_tag_local_str) {
        free(ad_image_1_tag_local_str);
        ad_image_1_tag_local_str = NULL;
    }
    if (ad_image_2_link_local_str) {
        free(ad_image_2_link_local_str);
        ad_image_2_link_local_str = NULL;
    }
    if (ad_image_2_tag_local_str) {
        free(ad_image_2_tag_local_str);
        ad_image_2_tag_local_str = NULL;
    }
    if (ad_image_3_link_local_str) {
        free(ad_image_3_link_local_str);
        ad_image_3_link_local_str = NULL;
    }
    if (ad_image_3_tag_local_str) {
        free(ad_image_3_tag_local_str);
        ad_image_3_tag_local_str = NULL;
    }
    if (ad_image_4_link_local_str) {
        free(ad_image_4_link_local_str);
        ad_image_4_link_local_str = NULL;
    }
    if (ad_image_4_tag_local_str) {
        free(ad_image_4_tag_local_str);
        ad_image_4_tag_local_str = NULL;
    }
    if (ad_image_5_link_local_str) {
        free(ad_image_5_link_local_str);
        ad_image_5_link_local_str = NULL;
    }
    if (ad_image_5_tag_local_str) {
        free(ad_image_5_tag_local_str);
        ad_image_5_tag_local_str = NULL;
    }
    if (ad_image_6_link_local_str) {
        free(ad_image_6_link_local_str);
        ad_image_6_link_local_str = NULL;
    }
    if (ad_image_6_tag_local_str) {
        free(ad_image_6_tag_local_str);
        ad_image_6_tag_local_str = NULL;
    }
    if (ad_image_7_link_local_str) {
        free(ad_image_7_link_local_str);
        ad_image_7_link_local_str = NULL;
    }
    if (ad_image_7_tag_local_str) {
        free(ad_image_7_tag_local_str);
        ad_image_7_tag_local_str = NULL;
    }
    if (ad_image_8_link_local_str) {
        free(ad_image_8_link_local_str);
        ad_image_8_link_local_str = NULL;
    }
    if (ad_image_8_tag_local_str) {
        free(ad_image_8_tag_local_str);
        ad_image_8_tag_local_str = NULL;
    }
    if (ad_image_9_link_local_str) {
        free(ad_image_9_link_local_str);
        ad_image_9_link_local_str = NULL;
    }
    if (ad_image_9_tag_local_str) {
        free(ad_image_9_tag_local_str);
        ad_image_9_tag_local_str = NULL;
    }
    if (ad_link_local_str) {
        free(ad_link_local_str);
        ad_link_local_str = NULL;
    }
    if (ad_video_0_link_local_str) {
        free(ad_video_0_link_local_str);
        ad_video_0_link_local_str = NULL;
    }
    if (ad_video_0_tag_local_str) {
        free(ad_video_0_tag_local_str);
        ad_video_0_tag_local_str = NULL;
    }
    if (ad_video_1_link_local_str) {
        free(ad_video_1_link_local_str);
        ad_video_1_link_local_str = NULL;
    }
    if (ad_video_1_tag_local_str) {
        free(ad_video_1_tag_local_str);
        ad_video_1_tag_local_str = NULL;
    }
    if (ad_video_2_link_local_str) {
        free(ad_video_2_link_local_str);
        ad_video_2_link_local_str = NULL;
    }
    if (ad_video_2_tag_local_str) {
        free(ad_video_2_tag_local_str);
        ad_video_2_tag_local_str = NULL;
    }
    if (additional_image_linkList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, additional_image_linkList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(additional_image_linkList);
        additional_image_linkList = NULL;
    }
    if (adult_local_var) {
        free(adult_local_var);
        adult_local_var = NULL;
    }
    if (age_group_local_str) {
        free(age_group_local_str);
        age_group_local_str = NULL;
    }
    if (ai_disclosuresList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ai_disclosuresList) {
            catalogs_ai_content_disclosure_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ai_disclosuresList);
        ai_disclosuresList = NULL;
    }
    if (android_deep_link_local_str) {
        free(android_deep_link_local_str);
        android_deep_link_local_str = NULL;
    }
    if (availability_local_str) {
        free(availability_local_str);
        availability_local_str = NULL;
    }
    if (average_review_rating_local_var) {
        free(average_review_rating_local_var);
        average_review_rating_local_var = NULL;
    }
    if (brand_local_str) {
        free(brand_local_str);
        brand_local_str = NULL;
    }
    if (checkout_enabled_local_var) {
        free(checkout_enabled_local_var);
        checkout_enabled_local_var = NULL;
    }
    if (color_local_str) {
        free(color_local_str);
        color_local_str = NULL;
    }
    if (condition_local_str) {
        free(condition_local_str);
        condition_local_str = NULL;
    }
    if (custom_label_0_local_str) {
        free(custom_label_0_local_str);
        custom_label_0_local_str = NULL;
    }
    if (custom_label_1_local_str) {
        free(custom_label_1_local_str);
        custom_label_1_local_str = NULL;
    }
    if (custom_label_2_local_str) {
        free(custom_label_2_local_str);
        custom_label_2_local_str = NULL;
    }
    if (custom_label_3_local_str) {
        free(custom_label_3_local_str);
        custom_label_3_local_str = NULL;
    }
    if (custom_label_4_local_str) {
        free(custom_label_4_local_str);
        custom_label_4_local_str = NULL;
    }
    if (custom_number_0_local_var) {
        free(custom_number_0_local_var);
        custom_number_0_local_var = NULL;
    }
    if (custom_number_1_local_var) {
        free(custom_number_1_local_var);
        custom_number_1_local_var = NULL;
    }
    if (custom_number_2_local_var) {
        free(custom_number_2_local_var);
        custom_number_2_local_var = NULL;
    }
    if (custom_number_3_local_var) {
        free(custom_number_3_local_var);
        custom_number_3_local_var = NULL;
    }
    if (custom_number_4_local_var) {
        free(custom_number_4_local_var);
        custom_number_4_local_var = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (free_shipping_label_local_var) {
        free(free_shipping_label_local_var);
        free_shipping_label_local_var = NULL;
    }
    if (free_shipping_limit_local_str) {
        free(free_shipping_limit_local_str);
        free_shipping_limit_local_str = NULL;
    }
    if (gender_local_str) {
        free(gender_local_str);
        gender_local_str = NULL;
    }
    if (google_product_category_local_str) {
        free(google_product_category_local_str);
        google_product_category_local_str = NULL;
    }
    if (gtin_local_nonprim) {
        updatable_item_attributes_gtin_free(gtin_local_nonprim);
        gtin_local_nonprim = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (image_link_local_nonprim) {
        item_attributes_request_image_link_free(image_link_local_nonprim);
        image_link_local_nonprim = NULL;
    }
    if (installment_price_local_str) {
        free(installment_price_local_str);
        installment_price_local_str = NULL;
    }
    if (ios_deep_link_local_str) {
        free(ios_deep_link_local_str);
        ios_deep_link_local_str = NULL;
    }
    if (item_group_id_local_str) {
        free(item_group_id_local_str);
        item_group_id_local_str = NULL;
    }
    if (last_updated_time_local_var) {
        free(last_updated_time_local_var);
        last_updated_time_local_var = NULL;
    }
    if (link_local_str) {
        free(link_local_str);
        link_local_str = NULL;
    }
    if (material_local_str) {
        free(material_local_str);
        material_local_str = NULL;
    }
    if (min_ad_price_local_str) {
        free(min_ad_price_local_str);
        min_ad_price_local_str = NULL;
    }
    if (mobile_link_local_str) {
        free(mobile_link_local_str);
        mobile_link_local_str = NULL;
    }
    if (mpn_local_str) {
        free(mpn_local_str);
        mpn_local_str = NULL;
    }
    if (number_of_ratings_local_var) {
        free(number_of_ratings_local_var);
        number_of_ratings_local_var = NULL;
    }
    if (number_of_reviews_local_var) {
        free(number_of_reviews_local_var);
        number_of_reviews_local_var = NULL;
    }
    if (pattern_local_str) {
        free(pattern_local_str);
        pattern_local_str = NULL;
    }
    if (price_local_str) {
        free(price_local_str);
        price_local_str = NULL;
    }
    if (product_type_local_str) {
        free(product_type_local_str);
        product_type_local_str = NULL;
    }
    if (promotion_id_local_str) {
        free(promotion_id_local_str);
        promotion_id_local_str = NULL;
    }
    if (sale_price_local_str) {
        free(sale_price_local_str);
        sale_price_local_str = NULL;
    }
    if (sale_price_effective_date_local_str) {
        free(sale_price_effective_date_local_str);
        sale_price_effective_date_local_str = NULL;
    }
    if (save_pin_disabled_local_var) {
        free(save_pin_disabled_local_var);
        save_pin_disabled_local_var = NULL;
    }
    if (shipping_local_str) {
        free(shipping_local_str);
        shipping_local_str = NULL;
    }
    if (shipping_height_local_str) {
        free(shipping_height_local_str);
        shipping_height_local_str = NULL;
    }
    if (shipping_weight_local_str) {
        free(shipping_weight_local_str);
        shipping_weight_local_str = NULL;
    }
    if (shipping_width_local_str) {
        free(shipping_width_local_str);
        shipping_width_local_str = NULL;
    }
    if (size_local_str) {
        free(size_local_str);
        size_local_str = NULL;
    }
    if (size_system_local_str) {
        free(size_system_local_str);
        size_system_local_str = NULL;
    }
    if (size_type_local_str) {
        free(size_type_local_str);
        size_type_local_str = NULL;
    }
    if (tax_local_str) {
        free(tax_local_str);
        tax_local_str = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    if (unit_pricing_base_measure_local_str) {
        free(unit_pricing_base_measure_local_str);
        unit_pricing_base_measure_local_str = NULL;
    }
    if (unit_pricing_measure_local_str) {
        free(unit_pricing_measure_local_str);
        unit_pricing_measure_local_str = NULL;
    }
    if (variant_namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, variant_namesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(variant_namesList);
        variant_namesList = NULL;
    }
    if (variant_valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, variant_valuesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(variant_valuesList);
        variant_valuesList = NULL;
    }
    if (video_link_local_str) {
        free(video_link_local_str);
        video_link_local_str = NULL;
    }
    return NULL;

}
