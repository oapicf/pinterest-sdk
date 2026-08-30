#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "updatable_item_attributes.h"



static updatable_item_attributes_t *updatable_item_attributes_create_internal(
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
    int *adult,
    char *age_group,
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
    list_t *variant_values
    ) {
    updatable_item_attributes_t *updatable_item_attributes_local_var = malloc(sizeof(updatable_item_attributes_t));
    if (!updatable_item_attributes_local_var) {
        return NULL;
    }
    memset(updatable_item_attributes_local_var, 0, sizeof(updatable_item_attributes_t));
    updatable_item_attributes_local_var->_library_owned = 1;
    updatable_item_attributes_local_var->ad_image_0_link = ad_image_0_link;
    updatable_item_attributes_local_var->ad_image_0_tag = ad_image_0_tag;
    updatable_item_attributes_local_var->ad_image_10_link = ad_image_10_link;
    updatable_item_attributes_local_var->ad_image_10_tag = ad_image_10_tag;
    updatable_item_attributes_local_var->ad_image_11_link = ad_image_11_link;
    updatable_item_attributes_local_var->ad_image_11_tag = ad_image_11_tag;
    updatable_item_attributes_local_var->ad_image_12_link = ad_image_12_link;
    updatable_item_attributes_local_var->ad_image_12_tag = ad_image_12_tag;
    updatable_item_attributes_local_var->ad_image_13_link = ad_image_13_link;
    updatable_item_attributes_local_var->ad_image_13_tag = ad_image_13_tag;
    updatable_item_attributes_local_var->ad_image_14_link = ad_image_14_link;
    updatable_item_attributes_local_var->ad_image_14_tag = ad_image_14_tag;
    updatable_item_attributes_local_var->ad_image_15_link = ad_image_15_link;
    updatable_item_attributes_local_var->ad_image_15_tag = ad_image_15_tag;
    updatable_item_attributes_local_var->ad_image_16_link = ad_image_16_link;
    updatable_item_attributes_local_var->ad_image_16_tag = ad_image_16_tag;
    updatable_item_attributes_local_var->ad_image_17_link = ad_image_17_link;
    updatable_item_attributes_local_var->ad_image_17_tag = ad_image_17_tag;
    updatable_item_attributes_local_var->ad_image_18_link = ad_image_18_link;
    updatable_item_attributes_local_var->ad_image_18_tag = ad_image_18_tag;
    updatable_item_attributes_local_var->ad_image_19_link = ad_image_19_link;
    updatable_item_attributes_local_var->ad_image_19_tag = ad_image_19_tag;
    updatable_item_attributes_local_var->ad_image_1_link = ad_image_1_link;
    updatable_item_attributes_local_var->ad_image_1_tag = ad_image_1_tag;
    updatable_item_attributes_local_var->ad_image_2_link = ad_image_2_link;
    updatable_item_attributes_local_var->ad_image_2_tag = ad_image_2_tag;
    updatable_item_attributes_local_var->ad_image_3_link = ad_image_3_link;
    updatable_item_attributes_local_var->ad_image_3_tag = ad_image_3_tag;
    updatable_item_attributes_local_var->ad_image_4_link = ad_image_4_link;
    updatable_item_attributes_local_var->ad_image_4_tag = ad_image_4_tag;
    updatable_item_attributes_local_var->ad_image_5_link = ad_image_5_link;
    updatable_item_attributes_local_var->ad_image_5_tag = ad_image_5_tag;
    updatable_item_attributes_local_var->ad_image_6_link = ad_image_6_link;
    updatable_item_attributes_local_var->ad_image_6_tag = ad_image_6_tag;
    updatable_item_attributes_local_var->ad_image_7_link = ad_image_7_link;
    updatable_item_attributes_local_var->ad_image_7_tag = ad_image_7_tag;
    updatable_item_attributes_local_var->ad_image_8_link = ad_image_8_link;
    updatable_item_attributes_local_var->ad_image_8_tag = ad_image_8_tag;
    updatable_item_attributes_local_var->ad_image_9_link = ad_image_9_link;
    updatable_item_attributes_local_var->ad_image_9_tag = ad_image_9_tag;
    updatable_item_attributes_local_var->ad_link = ad_link;
    updatable_item_attributes_local_var->ad_video_0_link = ad_video_0_link;
    updatable_item_attributes_local_var->ad_video_0_tag = ad_video_0_tag;
    updatable_item_attributes_local_var->ad_video_1_link = ad_video_1_link;
    updatable_item_attributes_local_var->ad_video_1_tag = ad_video_1_tag;
    updatable_item_attributes_local_var->ad_video_2_link = ad_video_2_link;
    updatable_item_attributes_local_var->ad_video_2_tag = ad_video_2_tag;
    updatable_item_attributes_local_var->adult = adult;
    updatable_item_attributes_local_var->age_group = age_group;
    updatable_item_attributes_local_var->android_deep_link = android_deep_link;
    updatable_item_attributes_local_var->availability = availability;
    updatable_item_attributes_local_var->average_review_rating = average_review_rating;
    updatable_item_attributes_local_var->brand = brand;
    updatable_item_attributes_local_var->checkout_enabled = checkout_enabled;
    updatable_item_attributes_local_var->color = color;
    updatable_item_attributes_local_var->condition = condition;
    updatable_item_attributes_local_var->custom_label_0 = custom_label_0;
    updatable_item_attributes_local_var->custom_label_1 = custom_label_1;
    updatable_item_attributes_local_var->custom_label_2 = custom_label_2;
    updatable_item_attributes_local_var->custom_label_3 = custom_label_3;
    updatable_item_attributes_local_var->custom_label_4 = custom_label_4;
    updatable_item_attributes_local_var->custom_number_0 = custom_number_0;
    updatable_item_attributes_local_var->custom_number_1 = custom_number_1;
    updatable_item_attributes_local_var->custom_number_2 = custom_number_2;
    updatable_item_attributes_local_var->custom_number_3 = custom_number_3;
    updatable_item_attributes_local_var->custom_number_4 = custom_number_4;
    updatable_item_attributes_local_var->description = description;
    updatable_item_attributes_local_var->free_shipping_label = free_shipping_label;
    updatable_item_attributes_local_var->free_shipping_limit = free_shipping_limit;
    updatable_item_attributes_local_var->gender = gender;
    updatable_item_attributes_local_var->google_product_category = google_product_category;
    updatable_item_attributes_local_var->gtin = gtin;
    updatable_item_attributes_local_var->id = id;
    updatable_item_attributes_local_var->installment_price = installment_price;
    updatable_item_attributes_local_var->ios_deep_link = ios_deep_link;
    updatable_item_attributes_local_var->item_group_id = item_group_id;
    updatable_item_attributes_local_var->last_updated_time = last_updated_time;
    updatable_item_attributes_local_var->link = link;
    updatable_item_attributes_local_var->material = material;
    updatable_item_attributes_local_var->min_ad_price = min_ad_price;
    updatable_item_attributes_local_var->mobile_link = mobile_link;
    updatable_item_attributes_local_var->mpn = mpn;
    updatable_item_attributes_local_var->number_of_ratings = number_of_ratings;
    updatable_item_attributes_local_var->number_of_reviews = number_of_reviews;
    updatable_item_attributes_local_var->pattern = pattern;
    updatable_item_attributes_local_var->price = price;
    updatable_item_attributes_local_var->product_type = product_type;
    updatable_item_attributes_local_var->promotion_id = promotion_id;
    updatable_item_attributes_local_var->sale_price = sale_price;
    updatable_item_attributes_local_var->sale_price_effective_date = sale_price_effective_date;
    updatable_item_attributes_local_var->shipping = shipping;
    updatable_item_attributes_local_var->shipping_height = shipping_height;
    updatable_item_attributes_local_var->shipping_weight = shipping_weight;
    updatable_item_attributes_local_var->shipping_width = shipping_width;
    updatable_item_attributes_local_var->size = size;
    updatable_item_attributes_local_var->size_system = size_system;
    updatable_item_attributes_local_var->size_type = size_type;
    updatable_item_attributes_local_var->tax = tax;
    updatable_item_attributes_local_var->title = title;
    updatable_item_attributes_local_var->unit_pricing_base_measure = unit_pricing_base_measure;
    updatable_item_attributes_local_var->unit_pricing_measure = unit_pricing_measure;
    updatable_item_attributes_local_var->variant_names = variant_names;
    updatable_item_attributes_local_var->variant_values = variant_values;
    return updatable_item_attributes_local_var;
}

__attribute__((deprecated)) updatable_item_attributes_t *updatable_item_attributes_create(
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
    int *adult,
    char *age_group,
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
    list_t *variant_values
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
    updatable_item_attributes_t *result = updatable_item_attributes_create_internal (
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
        adult_copy,
        age_group,
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
        variant_values
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
    }
    return result;
}

void updatable_item_attributes_free(updatable_item_attributes_t *updatable_item_attributes) {
    if(NULL == updatable_item_attributes){
        return ;
    }
    if(updatable_item_attributes->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "updatable_item_attributes_free");
        return ;
    }
    listEntry_t *listEntry;
    if (updatable_item_attributes->ad_image_0_link) {
        free(updatable_item_attributes->ad_image_0_link);
        updatable_item_attributes->ad_image_0_link = NULL;
    }
    if (updatable_item_attributes->ad_image_0_tag) {
        free(updatable_item_attributes->ad_image_0_tag);
        updatable_item_attributes->ad_image_0_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_10_link) {
        free(updatable_item_attributes->ad_image_10_link);
        updatable_item_attributes->ad_image_10_link = NULL;
    }
    if (updatable_item_attributes->ad_image_10_tag) {
        free(updatable_item_attributes->ad_image_10_tag);
        updatable_item_attributes->ad_image_10_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_11_link) {
        free(updatable_item_attributes->ad_image_11_link);
        updatable_item_attributes->ad_image_11_link = NULL;
    }
    if (updatable_item_attributes->ad_image_11_tag) {
        free(updatable_item_attributes->ad_image_11_tag);
        updatable_item_attributes->ad_image_11_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_12_link) {
        free(updatable_item_attributes->ad_image_12_link);
        updatable_item_attributes->ad_image_12_link = NULL;
    }
    if (updatable_item_attributes->ad_image_12_tag) {
        free(updatable_item_attributes->ad_image_12_tag);
        updatable_item_attributes->ad_image_12_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_13_link) {
        free(updatable_item_attributes->ad_image_13_link);
        updatable_item_attributes->ad_image_13_link = NULL;
    }
    if (updatable_item_attributes->ad_image_13_tag) {
        free(updatable_item_attributes->ad_image_13_tag);
        updatable_item_attributes->ad_image_13_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_14_link) {
        free(updatable_item_attributes->ad_image_14_link);
        updatable_item_attributes->ad_image_14_link = NULL;
    }
    if (updatable_item_attributes->ad_image_14_tag) {
        free(updatable_item_attributes->ad_image_14_tag);
        updatable_item_attributes->ad_image_14_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_15_link) {
        free(updatable_item_attributes->ad_image_15_link);
        updatable_item_attributes->ad_image_15_link = NULL;
    }
    if (updatable_item_attributes->ad_image_15_tag) {
        free(updatable_item_attributes->ad_image_15_tag);
        updatable_item_attributes->ad_image_15_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_16_link) {
        free(updatable_item_attributes->ad_image_16_link);
        updatable_item_attributes->ad_image_16_link = NULL;
    }
    if (updatable_item_attributes->ad_image_16_tag) {
        free(updatable_item_attributes->ad_image_16_tag);
        updatable_item_attributes->ad_image_16_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_17_link) {
        free(updatable_item_attributes->ad_image_17_link);
        updatable_item_attributes->ad_image_17_link = NULL;
    }
    if (updatable_item_attributes->ad_image_17_tag) {
        free(updatable_item_attributes->ad_image_17_tag);
        updatable_item_attributes->ad_image_17_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_18_link) {
        free(updatable_item_attributes->ad_image_18_link);
        updatable_item_attributes->ad_image_18_link = NULL;
    }
    if (updatable_item_attributes->ad_image_18_tag) {
        free(updatable_item_attributes->ad_image_18_tag);
        updatable_item_attributes->ad_image_18_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_19_link) {
        free(updatable_item_attributes->ad_image_19_link);
        updatable_item_attributes->ad_image_19_link = NULL;
    }
    if (updatable_item_attributes->ad_image_19_tag) {
        free(updatable_item_attributes->ad_image_19_tag);
        updatable_item_attributes->ad_image_19_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_1_link) {
        free(updatable_item_attributes->ad_image_1_link);
        updatable_item_attributes->ad_image_1_link = NULL;
    }
    if (updatable_item_attributes->ad_image_1_tag) {
        free(updatable_item_attributes->ad_image_1_tag);
        updatable_item_attributes->ad_image_1_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_2_link) {
        free(updatable_item_attributes->ad_image_2_link);
        updatable_item_attributes->ad_image_2_link = NULL;
    }
    if (updatable_item_attributes->ad_image_2_tag) {
        free(updatable_item_attributes->ad_image_2_tag);
        updatable_item_attributes->ad_image_2_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_3_link) {
        free(updatable_item_attributes->ad_image_3_link);
        updatable_item_attributes->ad_image_3_link = NULL;
    }
    if (updatable_item_attributes->ad_image_3_tag) {
        free(updatable_item_attributes->ad_image_3_tag);
        updatable_item_attributes->ad_image_3_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_4_link) {
        free(updatable_item_attributes->ad_image_4_link);
        updatable_item_attributes->ad_image_4_link = NULL;
    }
    if (updatable_item_attributes->ad_image_4_tag) {
        free(updatable_item_attributes->ad_image_4_tag);
        updatable_item_attributes->ad_image_4_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_5_link) {
        free(updatable_item_attributes->ad_image_5_link);
        updatable_item_attributes->ad_image_5_link = NULL;
    }
    if (updatable_item_attributes->ad_image_5_tag) {
        free(updatable_item_attributes->ad_image_5_tag);
        updatable_item_attributes->ad_image_5_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_6_link) {
        free(updatable_item_attributes->ad_image_6_link);
        updatable_item_attributes->ad_image_6_link = NULL;
    }
    if (updatable_item_attributes->ad_image_6_tag) {
        free(updatable_item_attributes->ad_image_6_tag);
        updatable_item_attributes->ad_image_6_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_7_link) {
        free(updatable_item_attributes->ad_image_7_link);
        updatable_item_attributes->ad_image_7_link = NULL;
    }
    if (updatable_item_attributes->ad_image_7_tag) {
        free(updatable_item_attributes->ad_image_7_tag);
        updatable_item_attributes->ad_image_7_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_8_link) {
        free(updatable_item_attributes->ad_image_8_link);
        updatable_item_attributes->ad_image_8_link = NULL;
    }
    if (updatable_item_attributes->ad_image_8_tag) {
        free(updatable_item_attributes->ad_image_8_tag);
        updatable_item_attributes->ad_image_8_tag = NULL;
    }
    if (updatable_item_attributes->ad_image_9_link) {
        free(updatable_item_attributes->ad_image_9_link);
        updatable_item_attributes->ad_image_9_link = NULL;
    }
    if (updatable_item_attributes->ad_image_9_tag) {
        free(updatable_item_attributes->ad_image_9_tag);
        updatable_item_attributes->ad_image_9_tag = NULL;
    }
    if (updatable_item_attributes->ad_link) {
        free(updatable_item_attributes->ad_link);
        updatable_item_attributes->ad_link = NULL;
    }
    if (updatable_item_attributes->ad_video_0_link) {
        free(updatable_item_attributes->ad_video_0_link);
        updatable_item_attributes->ad_video_0_link = NULL;
    }
    if (updatable_item_attributes->ad_video_0_tag) {
        free(updatable_item_attributes->ad_video_0_tag);
        updatable_item_attributes->ad_video_0_tag = NULL;
    }
    if (updatable_item_attributes->ad_video_1_link) {
        free(updatable_item_attributes->ad_video_1_link);
        updatable_item_attributes->ad_video_1_link = NULL;
    }
    if (updatable_item_attributes->ad_video_1_tag) {
        free(updatable_item_attributes->ad_video_1_tag);
        updatable_item_attributes->ad_video_1_tag = NULL;
    }
    if (updatable_item_attributes->ad_video_2_link) {
        free(updatable_item_attributes->ad_video_2_link);
        updatable_item_attributes->ad_video_2_link = NULL;
    }
    if (updatable_item_attributes->ad_video_2_tag) {
        free(updatable_item_attributes->ad_video_2_tag);
        updatable_item_attributes->ad_video_2_tag = NULL;
    }
    if (updatable_item_attributes->adult) {
        free(updatable_item_attributes->adult);
        updatable_item_attributes->adult = NULL;
    }
    if (updatable_item_attributes->age_group) {
        free(updatable_item_attributes->age_group);
        updatable_item_attributes->age_group = NULL;
    }
    if (updatable_item_attributes->android_deep_link) {
        free(updatable_item_attributes->android_deep_link);
        updatable_item_attributes->android_deep_link = NULL;
    }
    if (updatable_item_attributes->availability) {
        free(updatable_item_attributes->availability);
        updatable_item_attributes->availability = NULL;
    }
    if (updatable_item_attributes->average_review_rating) {
        free(updatable_item_attributes->average_review_rating);
        updatable_item_attributes->average_review_rating = NULL;
    }
    if (updatable_item_attributes->brand) {
        free(updatable_item_attributes->brand);
        updatable_item_attributes->brand = NULL;
    }
    if (updatable_item_attributes->checkout_enabled) {
        free(updatable_item_attributes->checkout_enabled);
        updatable_item_attributes->checkout_enabled = NULL;
    }
    if (updatable_item_attributes->color) {
        free(updatable_item_attributes->color);
        updatable_item_attributes->color = NULL;
    }
    if (updatable_item_attributes->condition) {
        free(updatable_item_attributes->condition);
        updatable_item_attributes->condition = NULL;
    }
    if (updatable_item_attributes->custom_label_0) {
        free(updatable_item_attributes->custom_label_0);
        updatable_item_attributes->custom_label_0 = NULL;
    }
    if (updatable_item_attributes->custom_label_1) {
        free(updatable_item_attributes->custom_label_1);
        updatable_item_attributes->custom_label_1 = NULL;
    }
    if (updatable_item_attributes->custom_label_2) {
        free(updatable_item_attributes->custom_label_2);
        updatable_item_attributes->custom_label_2 = NULL;
    }
    if (updatable_item_attributes->custom_label_3) {
        free(updatable_item_attributes->custom_label_3);
        updatable_item_attributes->custom_label_3 = NULL;
    }
    if (updatable_item_attributes->custom_label_4) {
        free(updatable_item_attributes->custom_label_4);
        updatable_item_attributes->custom_label_4 = NULL;
    }
    if (updatable_item_attributes->custom_number_0) {
        free(updatable_item_attributes->custom_number_0);
        updatable_item_attributes->custom_number_0 = NULL;
    }
    if (updatable_item_attributes->custom_number_1) {
        free(updatable_item_attributes->custom_number_1);
        updatable_item_attributes->custom_number_1 = NULL;
    }
    if (updatable_item_attributes->custom_number_2) {
        free(updatable_item_attributes->custom_number_2);
        updatable_item_attributes->custom_number_2 = NULL;
    }
    if (updatable_item_attributes->custom_number_3) {
        free(updatable_item_attributes->custom_number_3);
        updatable_item_attributes->custom_number_3 = NULL;
    }
    if (updatable_item_attributes->custom_number_4) {
        free(updatable_item_attributes->custom_number_4);
        updatable_item_attributes->custom_number_4 = NULL;
    }
    if (updatable_item_attributes->description) {
        free(updatable_item_attributes->description);
        updatable_item_attributes->description = NULL;
    }
    if (updatable_item_attributes->free_shipping_label) {
        free(updatable_item_attributes->free_shipping_label);
        updatable_item_attributes->free_shipping_label = NULL;
    }
    if (updatable_item_attributes->free_shipping_limit) {
        free(updatable_item_attributes->free_shipping_limit);
        updatable_item_attributes->free_shipping_limit = NULL;
    }
    if (updatable_item_attributes->gender) {
        free(updatable_item_attributes->gender);
        updatable_item_attributes->gender = NULL;
    }
    if (updatable_item_attributes->google_product_category) {
        free(updatable_item_attributes->google_product_category);
        updatable_item_attributes->google_product_category = NULL;
    }
    if (updatable_item_attributes->gtin) {
        updatable_item_attributes_gtin_free(updatable_item_attributes->gtin);
        updatable_item_attributes->gtin = NULL;
    }
    if (updatable_item_attributes->id) {
        free(updatable_item_attributes->id);
        updatable_item_attributes->id = NULL;
    }
    if (updatable_item_attributes->installment_price) {
        free(updatable_item_attributes->installment_price);
        updatable_item_attributes->installment_price = NULL;
    }
    if (updatable_item_attributes->ios_deep_link) {
        free(updatable_item_attributes->ios_deep_link);
        updatable_item_attributes->ios_deep_link = NULL;
    }
    if (updatable_item_attributes->item_group_id) {
        free(updatable_item_attributes->item_group_id);
        updatable_item_attributes->item_group_id = NULL;
    }
    if (updatable_item_attributes->last_updated_time) {
        free(updatable_item_attributes->last_updated_time);
        updatable_item_attributes->last_updated_time = NULL;
    }
    if (updatable_item_attributes->link) {
        free(updatable_item_attributes->link);
        updatable_item_attributes->link = NULL;
    }
    if (updatable_item_attributes->material) {
        free(updatable_item_attributes->material);
        updatable_item_attributes->material = NULL;
    }
    if (updatable_item_attributes->min_ad_price) {
        free(updatable_item_attributes->min_ad_price);
        updatable_item_attributes->min_ad_price = NULL;
    }
    if (updatable_item_attributes->mobile_link) {
        free(updatable_item_attributes->mobile_link);
        updatable_item_attributes->mobile_link = NULL;
    }
    if (updatable_item_attributes->mpn) {
        free(updatable_item_attributes->mpn);
        updatable_item_attributes->mpn = NULL;
    }
    if (updatable_item_attributes->number_of_ratings) {
        free(updatable_item_attributes->number_of_ratings);
        updatable_item_attributes->number_of_ratings = NULL;
    }
    if (updatable_item_attributes->number_of_reviews) {
        free(updatable_item_attributes->number_of_reviews);
        updatable_item_attributes->number_of_reviews = NULL;
    }
    if (updatable_item_attributes->pattern) {
        free(updatable_item_attributes->pattern);
        updatable_item_attributes->pattern = NULL;
    }
    if (updatable_item_attributes->price) {
        free(updatable_item_attributes->price);
        updatable_item_attributes->price = NULL;
    }
    if (updatable_item_attributes->product_type) {
        free(updatable_item_attributes->product_type);
        updatable_item_attributes->product_type = NULL;
    }
    if (updatable_item_attributes->promotion_id) {
        free(updatable_item_attributes->promotion_id);
        updatable_item_attributes->promotion_id = NULL;
    }
    if (updatable_item_attributes->sale_price) {
        free(updatable_item_attributes->sale_price);
        updatable_item_attributes->sale_price = NULL;
    }
    if (updatable_item_attributes->sale_price_effective_date) {
        free(updatable_item_attributes->sale_price_effective_date);
        updatable_item_attributes->sale_price_effective_date = NULL;
    }
    if (updatable_item_attributes->shipping) {
        free(updatable_item_attributes->shipping);
        updatable_item_attributes->shipping = NULL;
    }
    if (updatable_item_attributes->shipping_height) {
        free(updatable_item_attributes->shipping_height);
        updatable_item_attributes->shipping_height = NULL;
    }
    if (updatable_item_attributes->shipping_weight) {
        free(updatable_item_attributes->shipping_weight);
        updatable_item_attributes->shipping_weight = NULL;
    }
    if (updatable_item_attributes->shipping_width) {
        free(updatable_item_attributes->shipping_width);
        updatable_item_attributes->shipping_width = NULL;
    }
    if (updatable_item_attributes->size) {
        free(updatable_item_attributes->size);
        updatable_item_attributes->size = NULL;
    }
    if (updatable_item_attributes->size_system) {
        free(updatable_item_attributes->size_system);
        updatable_item_attributes->size_system = NULL;
    }
    if (updatable_item_attributes->size_type) {
        free(updatable_item_attributes->size_type);
        updatable_item_attributes->size_type = NULL;
    }
    if (updatable_item_attributes->tax) {
        free(updatable_item_attributes->tax);
        updatable_item_attributes->tax = NULL;
    }
    if (updatable_item_attributes->title) {
        free(updatable_item_attributes->title);
        updatable_item_attributes->title = NULL;
    }
    if (updatable_item_attributes->unit_pricing_base_measure) {
        free(updatable_item_attributes->unit_pricing_base_measure);
        updatable_item_attributes->unit_pricing_base_measure = NULL;
    }
    if (updatable_item_attributes->unit_pricing_measure) {
        free(updatable_item_attributes->unit_pricing_measure);
        updatable_item_attributes->unit_pricing_measure = NULL;
    }
    if (updatable_item_attributes->variant_names) {
        list_ForEach(listEntry, updatable_item_attributes->variant_names) {
            free(listEntry->data);
        }
        list_freeList(updatable_item_attributes->variant_names);
        updatable_item_attributes->variant_names = NULL;
    }
    if (updatable_item_attributes->variant_values) {
        list_ForEach(listEntry, updatable_item_attributes->variant_values) {
            free(listEntry->data);
        }
        list_freeList(updatable_item_attributes->variant_values);
        updatable_item_attributes->variant_values = NULL;
    }
    free(updatable_item_attributes);
}

cJSON *updatable_item_attributes_convertToJSON(updatable_item_attributes_t *updatable_item_attributes) {
    cJSON *item = cJSON_CreateObject();

    // updatable_item_attributes->ad_image_0_link
    if(updatable_item_attributes->ad_image_0_link) {
    if(cJSON_AddStringToObject(item, "ad_image_0_link", updatable_item_attributes->ad_image_0_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_0_tag
    if(updatable_item_attributes->ad_image_0_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_0_tag", updatable_item_attributes->ad_image_0_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_10_link
    if(updatable_item_attributes->ad_image_10_link) {
    if(cJSON_AddStringToObject(item, "ad_image_10_link", updatable_item_attributes->ad_image_10_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_10_tag
    if(updatable_item_attributes->ad_image_10_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_10_tag", updatable_item_attributes->ad_image_10_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_11_link
    if(updatable_item_attributes->ad_image_11_link) {
    if(cJSON_AddStringToObject(item, "ad_image_11_link", updatable_item_attributes->ad_image_11_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_11_tag
    if(updatable_item_attributes->ad_image_11_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_11_tag", updatable_item_attributes->ad_image_11_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_12_link
    if(updatable_item_attributes->ad_image_12_link) {
    if(cJSON_AddStringToObject(item, "ad_image_12_link", updatable_item_attributes->ad_image_12_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_12_tag
    if(updatable_item_attributes->ad_image_12_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_12_tag", updatable_item_attributes->ad_image_12_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_13_link
    if(updatable_item_attributes->ad_image_13_link) {
    if(cJSON_AddStringToObject(item, "ad_image_13_link", updatable_item_attributes->ad_image_13_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_13_tag
    if(updatable_item_attributes->ad_image_13_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_13_tag", updatable_item_attributes->ad_image_13_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_14_link
    if(updatable_item_attributes->ad_image_14_link) {
    if(cJSON_AddStringToObject(item, "ad_image_14_link", updatable_item_attributes->ad_image_14_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_14_tag
    if(updatable_item_attributes->ad_image_14_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_14_tag", updatable_item_attributes->ad_image_14_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_15_link
    if(updatable_item_attributes->ad_image_15_link) {
    if(cJSON_AddStringToObject(item, "ad_image_15_link", updatable_item_attributes->ad_image_15_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_15_tag
    if(updatable_item_attributes->ad_image_15_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_15_tag", updatable_item_attributes->ad_image_15_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_16_link
    if(updatable_item_attributes->ad_image_16_link) {
    if(cJSON_AddStringToObject(item, "ad_image_16_link", updatable_item_attributes->ad_image_16_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_16_tag
    if(updatable_item_attributes->ad_image_16_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_16_tag", updatable_item_attributes->ad_image_16_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_17_link
    if(updatable_item_attributes->ad_image_17_link) {
    if(cJSON_AddStringToObject(item, "ad_image_17_link", updatable_item_attributes->ad_image_17_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_17_tag
    if(updatable_item_attributes->ad_image_17_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_17_tag", updatable_item_attributes->ad_image_17_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_18_link
    if(updatable_item_attributes->ad_image_18_link) {
    if(cJSON_AddStringToObject(item, "ad_image_18_link", updatable_item_attributes->ad_image_18_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_18_tag
    if(updatable_item_attributes->ad_image_18_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_18_tag", updatable_item_attributes->ad_image_18_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_19_link
    if(updatable_item_attributes->ad_image_19_link) {
    if(cJSON_AddStringToObject(item, "ad_image_19_link", updatable_item_attributes->ad_image_19_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_19_tag
    if(updatable_item_attributes->ad_image_19_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_19_tag", updatable_item_attributes->ad_image_19_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_1_link
    if(updatable_item_attributes->ad_image_1_link) {
    if(cJSON_AddStringToObject(item, "ad_image_1_link", updatable_item_attributes->ad_image_1_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_1_tag
    if(updatable_item_attributes->ad_image_1_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_1_tag", updatable_item_attributes->ad_image_1_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_2_link
    if(updatable_item_attributes->ad_image_2_link) {
    if(cJSON_AddStringToObject(item, "ad_image_2_link", updatable_item_attributes->ad_image_2_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_2_tag
    if(updatable_item_attributes->ad_image_2_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_2_tag", updatable_item_attributes->ad_image_2_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_3_link
    if(updatable_item_attributes->ad_image_3_link) {
    if(cJSON_AddStringToObject(item, "ad_image_3_link", updatable_item_attributes->ad_image_3_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_3_tag
    if(updatable_item_attributes->ad_image_3_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_3_tag", updatable_item_attributes->ad_image_3_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_4_link
    if(updatable_item_attributes->ad_image_4_link) {
    if(cJSON_AddStringToObject(item, "ad_image_4_link", updatable_item_attributes->ad_image_4_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_4_tag
    if(updatable_item_attributes->ad_image_4_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_4_tag", updatable_item_attributes->ad_image_4_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_5_link
    if(updatable_item_attributes->ad_image_5_link) {
    if(cJSON_AddStringToObject(item, "ad_image_5_link", updatable_item_attributes->ad_image_5_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_5_tag
    if(updatable_item_attributes->ad_image_5_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_5_tag", updatable_item_attributes->ad_image_5_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_6_link
    if(updatable_item_attributes->ad_image_6_link) {
    if(cJSON_AddStringToObject(item, "ad_image_6_link", updatable_item_attributes->ad_image_6_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_6_tag
    if(updatable_item_attributes->ad_image_6_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_6_tag", updatable_item_attributes->ad_image_6_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_7_link
    if(updatable_item_attributes->ad_image_7_link) {
    if(cJSON_AddStringToObject(item, "ad_image_7_link", updatable_item_attributes->ad_image_7_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_7_tag
    if(updatable_item_attributes->ad_image_7_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_7_tag", updatable_item_attributes->ad_image_7_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_8_link
    if(updatable_item_attributes->ad_image_8_link) {
    if(cJSON_AddStringToObject(item, "ad_image_8_link", updatable_item_attributes->ad_image_8_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_8_tag
    if(updatable_item_attributes->ad_image_8_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_8_tag", updatable_item_attributes->ad_image_8_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_9_link
    if(updatable_item_attributes->ad_image_9_link) {
    if(cJSON_AddStringToObject(item, "ad_image_9_link", updatable_item_attributes->ad_image_9_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_image_9_tag
    if(updatable_item_attributes->ad_image_9_tag) {
    if(cJSON_AddStringToObject(item, "ad_image_9_tag", updatable_item_attributes->ad_image_9_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_link
    if(updatable_item_attributes->ad_link) {
    if(cJSON_AddStringToObject(item, "ad_link", updatable_item_attributes->ad_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_video_0_link
    if(updatable_item_attributes->ad_video_0_link) {
    if(cJSON_AddStringToObject(item, "ad_video_0_link", updatable_item_attributes->ad_video_0_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_video_0_tag
    if(updatable_item_attributes->ad_video_0_tag) {
    if(cJSON_AddStringToObject(item, "ad_video_0_tag", updatable_item_attributes->ad_video_0_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_video_1_link
    if(updatable_item_attributes->ad_video_1_link) {
    if(cJSON_AddStringToObject(item, "ad_video_1_link", updatable_item_attributes->ad_video_1_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_video_1_tag
    if(updatable_item_attributes->ad_video_1_tag) {
    if(cJSON_AddStringToObject(item, "ad_video_1_tag", updatable_item_attributes->ad_video_1_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_video_2_link
    if(updatable_item_attributes->ad_video_2_link) {
    if(cJSON_AddStringToObject(item, "ad_video_2_link", updatable_item_attributes->ad_video_2_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ad_video_2_tag
    if(updatable_item_attributes->ad_video_2_tag) {
    if(cJSON_AddStringToObject(item, "ad_video_2_tag", updatable_item_attributes->ad_video_2_tag) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->adult
    if(updatable_item_attributes->adult) {
    if(cJSON_AddBoolToObject(item, "adult", *updatable_item_attributes->adult) == NULL) {
    goto fail; //Bool
    }
    }


    // updatable_item_attributes->age_group
    if(updatable_item_attributes->age_group) {
    if(cJSON_AddStringToObject(item, "age_group", updatable_item_attributes->age_group) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->android_deep_link
    if(updatable_item_attributes->android_deep_link) {
    if(cJSON_AddStringToObject(item, "android_deep_link", updatable_item_attributes->android_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->availability
    if(updatable_item_attributes->availability) {
    if(cJSON_AddStringToObject(item, "availability", updatable_item_attributes->availability) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->average_review_rating
    if(updatable_item_attributes->average_review_rating) {
    if(cJSON_AddNumberToObject(item, "average_review_rating", *updatable_item_attributes->average_review_rating) == NULL) {
    goto fail; //Numeric
    }
    }


    // updatable_item_attributes->brand
    if(updatable_item_attributes->brand) {
    if(cJSON_AddStringToObject(item, "brand", updatable_item_attributes->brand) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->checkout_enabled
    if(updatable_item_attributes->checkout_enabled) {
    if(cJSON_AddBoolToObject(item, "checkout_enabled", *updatable_item_attributes->checkout_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // updatable_item_attributes->color
    if(updatable_item_attributes->color) {
    if(cJSON_AddStringToObject(item, "color", updatable_item_attributes->color) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->condition
    if(updatable_item_attributes->condition) {
    if(cJSON_AddStringToObject(item, "condition", updatable_item_attributes->condition) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->custom_label_0
    if(updatable_item_attributes->custom_label_0) {
    if(cJSON_AddStringToObject(item, "custom_label_0", updatable_item_attributes->custom_label_0) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->custom_label_1
    if(updatable_item_attributes->custom_label_1) {
    if(cJSON_AddStringToObject(item, "custom_label_1", updatable_item_attributes->custom_label_1) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->custom_label_2
    if(updatable_item_attributes->custom_label_2) {
    if(cJSON_AddStringToObject(item, "custom_label_2", updatable_item_attributes->custom_label_2) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->custom_label_3
    if(updatable_item_attributes->custom_label_3) {
    if(cJSON_AddStringToObject(item, "custom_label_3", updatable_item_attributes->custom_label_3) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->custom_label_4
    if(updatable_item_attributes->custom_label_4) {
    if(cJSON_AddStringToObject(item, "custom_label_4", updatable_item_attributes->custom_label_4) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->custom_number_0
    if(updatable_item_attributes->custom_number_0) {
    if(cJSON_AddNumberToObject(item, "custom_number_0", *updatable_item_attributes->custom_number_0) == NULL) {
    goto fail; //Numeric
    }
    }


    // updatable_item_attributes->custom_number_1
    if(updatable_item_attributes->custom_number_1) {
    if(cJSON_AddNumberToObject(item, "custom_number_1", *updatable_item_attributes->custom_number_1) == NULL) {
    goto fail; //Numeric
    }
    }


    // updatable_item_attributes->custom_number_2
    if(updatable_item_attributes->custom_number_2) {
    if(cJSON_AddNumberToObject(item, "custom_number_2", *updatable_item_attributes->custom_number_2) == NULL) {
    goto fail; //Numeric
    }
    }


    // updatable_item_attributes->custom_number_3
    if(updatable_item_attributes->custom_number_3) {
    if(cJSON_AddNumberToObject(item, "custom_number_3", *updatable_item_attributes->custom_number_3) == NULL) {
    goto fail; //Numeric
    }
    }


    // updatable_item_attributes->custom_number_4
    if(updatable_item_attributes->custom_number_4) {
    if(cJSON_AddNumberToObject(item, "custom_number_4", *updatable_item_attributes->custom_number_4) == NULL) {
    goto fail; //Numeric
    }
    }


    // updatable_item_attributes->description
    if(updatable_item_attributes->description) {
    if(cJSON_AddStringToObject(item, "description", updatable_item_attributes->description) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->free_shipping_label
    if(updatable_item_attributes->free_shipping_label) {
    if(cJSON_AddBoolToObject(item, "free_shipping_label", *updatable_item_attributes->free_shipping_label) == NULL) {
    goto fail; //Bool
    }
    }


    // updatable_item_attributes->free_shipping_limit
    if(updatable_item_attributes->free_shipping_limit) {
    if(cJSON_AddStringToObject(item, "free_shipping_limit", updatable_item_attributes->free_shipping_limit) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->gender
    if(updatable_item_attributes->gender) {
    if(cJSON_AddStringToObject(item, "gender", updatable_item_attributes->gender) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->google_product_category
    if(updatable_item_attributes->google_product_category) {
    if(cJSON_AddStringToObject(item, "google_product_category", updatable_item_attributes->google_product_category) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->gtin
    if(updatable_item_attributes->gtin) {
    cJSON *gtin_local_JSON = updatable_item_attributes_gtin_convertToJSON(updatable_item_attributes->gtin);
    if(gtin_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "gtin", gtin_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // updatable_item_attributes->id
    if(updatable_item_attributes->id) {
    if(cJSON_AddStringToObject(item, "id", updatable_item_attributes->id) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->installment_price
    if(updatable_item_attributes->installment_price) {
    if(cJSON_AddStringToObject(item, "installment_price", updatable_item_attributes->installment_price) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->ios_deep_link
    if(updatable_item_attributes->ios_deep_link) {
    if(cJSON_AddStringToObject(item, "ios_deep_link", updatable_item_attributes->ios_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->item_group_id
    if(updatable_item_attributes->item_group_id) {
    if(cJSON_AddStringToObject(item, "item_group_id", updatable_item_attributes->item_group_id) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->last_updated_time
    if(updatable_item_attributes->last_updated_time) {
    if(cJSON_AddNumberToObject(item, "last_updated_time", *updatable_item_attributes->last_updated_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // updatable_item_attributes->link
    if(updatable_item_attributes->link) {
    if(cJSON_AddStringToObject(item, "link", updatable_item_attributes->link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->material
    if(updatable_item_attributes->material) {
    if(cJSON_AddStringToObject(item, "material", updatable_item_attributes->material) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->min_ad_price
    if(updatable_item_attributes->min_ad_price) {
    if(cJSON_AddStringToObject(item, "min_ad_price", updatable_item_attributes->min_ad_price) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->mobile_link
    if(updatable_item_attributes->mobile_link) {
    if(cJSON_AddStringToObject(item, "mobile_link", updatable_item_attributes->mobile_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->mpn
    if(updatable_item_attributes->mpn) {
    if(cJSON_AddStringToObject(item, "mpn", updatable_item_attributes->mpn) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->number_of_ratings
    if(updatable_item_attributes->number_of_ratings) {
    if(cJSON_AddNumberToObject(item, "number_of_ratings", *updatable_item_attributes->number_of_ratings) == NULL) {
    goto fail; //Numeric
    }
    }


    // updatable_item_attributes->number_of_reviews
    if(updatable_item_attributes->number_of_reviews) {
    if(cJSON_AddNumberToObject(item, "number_of_reviews", *updatable_item_attributes->number_of_reviews) == NULL) {
    goto fail; //Numeric
    }
    }


    // updatable_item_attributes->pattern
    if(updatable_item_attributes->pattern) {
    if(cJSON_AddStringToObject(item, "pattern", updatable_item_attributes->pattern) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->price
    if(updatable_item_attributes->price) {
    if(cJSON_AddStringToObject(item, "price", updatable_item_attributes->price) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->product_type
    if(updatable_item_attributes->product_type) {
    if(cJSON_AddStringToObject(item, "product_type", updatable_item_attributes->product_type) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->promotion_id
    if(updatable_item_attributes->promotion_id) {
    if(cJSON_AddStringToObject(item, "promotion_id", updatable_item_attributes->promotion_id) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->sale_price
    if(updatable_item_attributes->sale_price) {
    if(cJSON_AddStringToObject(item, "sale_price", updatable_item_attributes->sale_price) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->sale_price_effective_date
    if(updatable_item_attributes->sale_price_effective_date) {
    if(cJSON_AddStringToObject(item, "sale_price_effective_date", updatable_item_attributes->sale_price_effective_date) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->shipping
    if(updatable_item_attributes->shipping) {
    if(cJSON_AddStringToObject(item, "shipping", updatable_item_attributes->shipping) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->shipping_height
    if(updatable_item_attributes->shipping_height) {
    if(cJSON_AddStringToObject(item, "shipping_height", updatable_item_attributes->shipping_height) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->shipping_weight
    if(updatable_item_attributes->shipping_weight) {
    if(cJSON_AddStringToObject(item, "shipping_weight", updatable_item_attributes->shipping_weight) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->shipping_width
    if(updatable_item_attributes->shipping_width) {
    if(cJSON_AddStringToObject(item, "shipping_width", updatable_item_attributes->shipping_width) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->size
    if(updatable_item_attributes->size) {
    if(cJSON_AddStringToObject(item, "size", updatable_item_attributes->size) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->size_system
    if(updatable_item_attributes->size_system) {
    if(cJSON_AddStringToObject(item, "size_system", updatable_item_attributes->size_system) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->size_type
    if(updatable_item_attributes->size_type) {
    if(cJSON_AddStringToObject(item, "size_type", updatable_item_attributes->size_type) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->tax
    if(updatable_item_attributes->tax) {
    if(cJSON_AddStringToObject(item, "tax", updatable_item_attributes->tax) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->title
    if(updatable_item_attributes->title) {
    if(cJSON_AddStringToObject(item, "title", updatable_item_attributes->title) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->unit_pricing_base_measure
    if(updatable_item_attributes->unit_pricing_base_measure) {
    if(cJSON_AddStringToObject(item, "unit_pricing_base_measure", updatable_item_attributes->unit_pricing_base_measure) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->unit_pricing_measure
    if(updatable_item_attributes->unit_pricing_measure) {
    if(cJSON_AddStringToObject(item, "unit_pricing_measure", updatable_item_attributes->unit_pricing_measure) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->variant_names
    if(updatable_item_attributes->variant_names) {
    cJSON *variant_names = cJSON_AddArrayToObject(item, "variant_names");
    if(variant_names == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *variant_namesListEntry;
    list_ForEach(variant_namesListEntry, updatable_item_attributes->variant_names) {
    if(cJSON_AddStringToObject(variant_names, "", variant_namesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // updatable_item_attributes->variant_values
    if(updatable_item_attributes->variant_values) {
    cJSON *variant_values = cJSON_AddArrayToObject(item, "variant_values");
    if(variant_values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *variant_valuesListEntry;
    list_ForEach(variant_valuesListEntry, updatable_item_attributes->variant_values) {
    if(cJSON_AddStringToObject(variant_values, "", variant_valuesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

updatable_item_attributes_t *updatable_item_attributes_parseFromJSON(cJSON *updatable_item_attributesJSON){

    updatable_item_attributes_t *updatable_item_attributes_local_var = NULL;

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

    // define the local variable for updatable_item_attributes->adult
    int *adult_local_var = NULL;

    char *age_group_local_str = NULL;

    char *android_deep_link_local_str = NULL;

    char *availability_local_str = NULL;

    // define the local variable for updatable_item_attributes->average_review_rating
    double *average_review_rating_local_var = NULL;

    char *brand_local_str = NULL;

    // define the local variable for updatable_item_attributes->checkout_enabled
    int *checkout_enabled_local_var = NULL;

    char *color_local_str = NULL;

    char *condition_local_str = NULL;

    char *custom_label_0_local_str = NULL;

    char *custom_label_1_local_str = NULL;

    char *custom_label_2_local_str = NULL;

    char *custom_label_3_local_str = NULL;

    char *custom_label_4_local_str = NULL;

    // define the local variable for updatable_item_attributes->custom_number_0
    int *custom_number_0_local_var = NULL;

    // define the local variable for updatable_item_attributes->custom_number_1
    int *custom_number_1_local_var = NULL;

    // define the local variable for updatable_item_attributes->custom_number_2
    int *custom_number_2_local_var = NULL;

    // define the local variable for updatable_item_attributes->custom_number_3
    int *custom_number_3_local_var = NULL;

    // define the local variable for updatable_item_attributes->custom_number_4
    int *custom_number_4_local_var = NULL;

    char *description_local_str = NULL;

    // define the local variable for updatable_item_attributes->free_shipping_label
    int *free_shipping_label_local_var = NULL;

    char *free_shipping_limit_local_str = NULL;

    char *gender_local_str = NULL;

    char *google_product_category_local_str = NULL;

    // define the local variable for updatable_item_attributes->gtin
    updatable_item_attributes_gtin_t *gtin_local_nonprim = NULL;

    char *id_local_str = NULL;

    char *installment_price_local_str = NULL;

    char *ios_deep_link_local_str = NULL;

    char *item_group_id_local_str = NULL;

    // define the local variable for updatable_item_attributes->last_updated_time
    long *last_updated_time_local_var = NULL;

    char *link_local_str = NULL;

    char *material_local_str = NULL;

    char *min_ad_price_local_str = NULL;

    char *mobile_link_local_str = NULL;

    char *mpn_local_str = NULL;

    // define the local variable for updatable_item_attributes->number_of_ratings
    int *number_of_ratings_local_var = NULL;

    // define the local variable for updatable_item_attributes->number_of_reviews
    int *number_of_reviews_local_var = NULL;

    char *pattern_local_str = NULL;

    char *price_local_str = NULL;

    char *product_type_local_str = NULL;

    char *promotion_id_local_str = NULL;

    char *sale_price_local_str = NULL;

    char *sale_price_effective_date_local_str = NULL;

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

    // define the local list for updatable_item_attributes->variant_names
    list_t *variant_namesList = NULL;

    // define the local list for updatable_item_attributes->variant_values
    list_t *variant_valuesList = NULL;

    // updatable_item_attributes->ad_image_0_link
    cJSON *ad_image_0_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_0_link");
    if (cJSON_IsNull(ad_image_0_link)) {
        ad_image_0_link = NULL;
    }
    if (ad_image_0_link) { 
    if(!cJSON_IsString(ad_image_0_link) && !cJSON_IsNull(ad_image_0_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_0_tag
    cJSON *ad_image_0_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_0_tag");
    if (cJSON_IsNull(ad_image_0_tag)) {
        ad_image_0_tag = NULL;
    }
    if (ad_image_0_tag) { 
    if(!cJSON_IsString(ad_image_0_tag) && !cJSON_IsNull(ad_image_0_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_10_link
    cJSON *ad_image_10_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_10_link");
    if (cJSON_IsNull(ad_image_10_link)) {
        ad_image_10_link = NULL;
    }
    if (ad_image_10_link) { 
    if(!cJSON_IsString(ad_image_10_link) && !cJSON_IsNull(ad_image_10_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_10_tag
    cJSON *ad_image_10_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_10_tag");
    if (cJSON_IsNull(ad_image_10_tag)) {
        ad_image_10_tag = NULL;
    }
    if (ad_image_10_tag) { 
    if(!cJSON_IsString(ad_image_10_tag) && !cJSON_IsNull(ad_image_10_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_11_link
    cJSON *ad_image_11_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_11_link");
    if (cJSON_IsNull(ad_image_11_link)) {
        ad_image_11_link = NULL;
    }
    if (ad_image_11_link) { 
    if(!cJSON_IsString(ad_image_11_link) && !cJSON_IsNull(ad_image_11_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_11_tag
    cJSON *ad_image_11_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_11_tag");
    if (cJSON_IsNull(ad_image_11_tag)) {
        ad_image_11_tag = NULL;
    }
    if (ad_image_11_tag) { 
    if(!cJSON_IsString(ad_image_11_tag) && !cJSON_IsNull(ad_image_11_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_12_link
    cJSON *ad_image_12_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_12_link");
    if (cJSON_IsNull(ad_image_12_link)) {
        ad_image_12_link = NULL;
    }
    if (ad_image_12_link) { 
    if(!cJSON_IsString(ad_image_12_link) && !cJSON_IsNull(ad_image_12_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_12_tag
    cJSON *ad_image_12_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_12_tag");
    if (cJSON_IsNull(ad_image_12_tag)) {
        ad_image_12_tag = NULL;
    }
    if (ad_image_12_tag) { 
    if(!cJSON_IsString(ad_image_12_tag) && !cJSON_IsNull(ad_image_12_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_13_link
    cJSON *ad_image_13_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_13_link");
    if (cJSON_IsNull(ad_image_13_link)) {
        ad_image_13_link = NULL;
    }
    if (ad_image_13_link) { 
    if(!cJSON_IsString(ad_image_13_link) && !cJSON_IsNull(ad_image_13_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_13_tag
    cJSON *ad_image_13_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_13_tag");
    if (cJSON_IsNull(ad_image_13_tag)) {
        ad_image_13_tag = NULL;
    }
    if (ad_image_13_tag) { 
    if(!cJSON_IsString(ad_image_13_tag) && !cJSON_IsNull(ad_image_13_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_14_link
    cJSON *ad_image_14_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_14_link");
    if (cJSON_IsNull(ad_image_14_link)) {
        ad_image_14_link = NULL;
    }
    if (ad_image_14_link) { 
    if(!cJSON_IsString(ad_image_14_link) && !cJSON_IsNull(ad_image_14_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_14_tag
    cJSON *ad_image_14_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_14_tag");
    if (cJSON_IsNull(ad_image_14_tag)) {
        ad_image_14_tag = NULL;
    }
    if (ad_image_14_tag) { 
    if(!cJSON_IsString(ad_image_14_tag) && !cJSON_IsNull(ad_image_14_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_15_link
    cJSON *ad_image_15_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_15_link");
    if (cJSON_IsNull(ad_image_15_link)) {
        ad_image_15_link = NULL;
    }
    if (ad_image_15_link) { 
    if(!cJSON_IsString(ad_image_15_link) && !cJSON_IsNull(ad_image_15_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_15_tag
    cJSON *ad_image_15_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_15_tag");
    if (cJSON_IsNull(ad_image_15_tag)) {
        ad_image_15_tag = NULL;
    }
    if (ad_image_15_tag) { 
    if(!cJSON_IsString(ad_image_15_tag) && !cJSON_IsNull(ad_image_15_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_16_link
    cJSON *ad_image_16_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_16_link");
    if (cJSON_IsNull(ad_image_16_link)) {
        ad_image_16_link = NULL;
    }
    if (ad_image_16_link) { 
    if(!cJSON_IsString(ad_image_16_link) && !cJSON_IsNull(ad_image_16_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_16_tag
    cJSON *ad_image_16_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_16_tag");
    if (cJSON_IsNull(ad_image_16_tag)) {
        ad_image_16_tag = NULL;
    }
    if (ad_image_16_tag) { 
    if(!cJSON_IsString(ad_image_16_tag) && !cJSON_IsNull(ad_image_16_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_17_link
    cJSON *ad_image_17_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_17_link");
    if (cJSON_IsNull(ad_image_17_link)) {
        ad_image_17_link = NULL;
    }
    if (ad_image_17_link) { 
    if(!cJSON_IsString(ad_image_17_link) && !cJSON_IsNull(ad_image_17_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_17_tag
    cJSON *ad_image_17_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_17_tag");
    if (cJSON_IsNull(ad_image_17_tag)) {
        ad_image_17_tag = NULL;
    }
    if (ad_image_17_tag) { 
    if(!cJSON_IsString(ad_image_17_tag) && !cJSON_IsNull(ad_image_17_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_18_link
    cJSON *ad_image_18_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_18_link");
    if (cJSON_IsNull(ad_image_18_link)) {
        ad_image_18_link = NULL;
    }
    if (ad_image_18_link) { 
    if(!cJSON_IsString(ad_image_18_link) && !cJSON_IsNull(ad_image_18_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_18_tag
    cJSON *ad_image_18_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_18_tag");
    if (cJSON_IsNull(ad_image_18_tag)) {
        ad_image_18_tag = NULL;
    }
    if (ad_image_18_tag) { 
    if(!cJSON_IsString(ad_image_18_tag) && !cJSON_IsNull(ad_image_18_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_19_link
    cJSON *ad_image_19_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_19_link");
    if (cJSON_IsNull(ad_image_19_link)) {
        ad_image_19_link = NULL;
    }
    if (ad_image_19_link) { 
    if(!cJSON_IsString(ad_image_19_link) && !cJSON_IsNull(ad_image_19_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_19_tag
    cJSON *ad_image_19_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_19_tag");
    if (cJSON_IsNull(ad_image_19_tag)) {
        ad_image_19_tag = NULL;
    }
    if (ad_image_19_tag) { 
    if(!cJSON_IsString(ad_image_19_tag) && !cJSON_IsNull(ad_image_19_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_1_link
    cJSON *ad_image_1_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_1_link");
    if (cJSON_IsNull(ad_image_1_link)) {
        ad_image_1_link = NULL;
    }
    if (ad_image_1_link) { 
    if(!cJSON_IsString(ad_image_1_link) && !cJSON_IsNull(ad_image_1_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_1_tag
    cJSON *ad_image_1_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_1_tag");
    if (cJSON_IsNull(ad_image_1_tag)) {
        ad_image_1_tag = NULL;
    }
    if (ad_image_1_tag) { 
    if(!cJSON_IsString(ad_image_1_tag) && !cJSON_IsNull(ad_image_1_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_2_link
    cJSON *ad_image_2_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_2_link");
    if (cJSON_IsNull(ad_image_2_link)) {
        ad_image_2_link = NULL;
    }
    if (ad_image_2_link) { 
    if(!cJSON_IsString(ad_image_2_link) && !cJSON_IsNull(ad_image_2_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_2_tag
    cJSON *ad_image_2_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_2_tag");
    if (cJSON_IsNull(ad_image_2_tag)) {
        ad_image_2_tag = NULL;
    }
    if (ad_image_2_tag) { 
    if(!cJSON_IsString(ad_image_2_tag) && !cJSON_IsNull(ad_image_2_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_3_link
    cJSON *ad_image_3_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_3_link");
    if (cJSON_IsNull(ad_image_3_link)) {
        ad_image_3_link = NULL;
    }
    if (ad_image_3_link) { 
    if(!cJSON_IsString(ad_image_3_link) && !cJSON_IsNull(ad_image_3_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_3_tag
    cJSON *ad_image_3_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_3_tag");
    if (cJSON_IsNull(ad_image_3_tag)) {
        ad_image_3_tag = NULL;
    }
    if (ad_image_3_tag) { 
    if(!cJSON_IsString(ad_image_3_tag) && !cJSON_IsNull(ad_image_3_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_4_link
    cJSON *ad_image_4_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_4_link");
    if (cJSON_IsNull(ad_image_4_link)) {
        ad_image_4_link = NULL;
    }
    if (ad_image_4_link) { 
    if(!cJSON_IsString(ad_image_4_link) && !cJSON_IsNull(ad_image_4_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_4_tag
    cJSON *ad_image_4_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_4_tag");
    if (cJSON_IsNull(ad_image_4_tag)) {
        ad_image_4_tag = NULL;
    }
    if (ad_image_4_tag) { 
    if(!cJSON_IsString(ad_image_4_tag) && !cJSON_IsNull(ad_image_4_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_5_link
    cJSON *ad_image_5_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_5_link");
    if (cJSON_IsNull(ad_image_5_link)) {
        ad_image_5_link = NULL;
    }
    if (ad_image_5_link) { 
    if(!cJSON_IsString(ad_image_5_link) && !cJSON_IsNull(ad_image_5_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_5_tag
    cJSON *ad_image_5_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_5_tag");
    if (cJSON_IsNull(ad_image_5_tag)) {
        ad_image_5_tag = NULL;
    }
    if (ad_image_5_tag) { 
    if(!cJSON_IsString(ad_image_5_tag) && !cJSON_IsNull(ad_image_5_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_6_link
    cJSON *ad_image_6_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_6_link");
    if (cJSON_IsNull(ad_image_6_link)) {
        ad_image_6_link = NULL;
    }
    if (ad_image_6_link) { 
    if(!cJSON_IsString(ad_image_6_link) && !cJSON_IsNull(ad_image_6_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_6_tag
    cJSON *ad_image_6_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_6_tag");
    if (cJSON_IsNull(ad_image_6_tag)) {
        ad_image_6_tag = NULL;
    }
    if (ad_image_6_tag) { 
    if(!cJSON_IsString(ad_image_6_tag) && !cJSON_IsNull(ad_image_6_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_7_link
    cJSON *ad_image_7_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_7_link");
    if (cJSON_IsNull(ad_image_7_link)) {
        ad_image_7_link = NULL;
    }
    if (ad_image_7_link) { 
    if(!cJSON_IsString(ad_image_7_link) && !cJSON_IsNull(ad_image_7_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_7_tag
    cJSON *ad_image_7_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_7_tag");
    if (cJSON_IsNull(ad_image_7_tag)) {
        ad_image_7_tag = NULL;
    }
    if (ad_image_7_tag) { 
    if(!cJSON_IsString(ad_image_7_tag) && !cJSON_IsNull(ad_image_7_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_8_link
    cJSON *ad_image_8_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_8_link");
    if (cJSON_IsNull(ad_image_8_link)) {
        ad_image_8_link = NULL;
    }
    if (ad_image_8_link) { 
    if(!cJSON_IsString(ad_image_8_link) && !cJSON_IsNull(ad_image_8_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_8_tag
    cJSON *ad_image_8_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_8_tag");
    if (cJSON_IsNull(ad_image_8_tag)) {
        ad_image_8_tag = NULL;
    }
    if (ad_image_8_tag) { 
    if(!cJSON_IsString(ad_image_8_tag) && !cJSON_IsNull(ad_image_8_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_9_link
    cJSON *ad_image_9_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_9_link");
    if (cJSON_IsNull(ad_image_9_link)) {
        ad_image_9_link = NULL;
    }
    if (ad_image_9_link) { 
    if(!cJSON_IsString(ad_image_9_link) && !cJSON_IsNull(ad_image_9_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_image_9_tag
    cJSON *ad_image_9_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_image_9_tag");
    if (cJSON_IsNull(ad_image_9_tag)) {
        ad_image_9_tag = NULL;
    }
    if (ad_image_9_tag) { 
    if(!cJSON_IsString(ad_image_9_tag) && !cJSON_IsNull(ad_image_9_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_link
    cJSON *ad_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_link");
    if (cJSON_IsNull(ad_link)) {
        ad_link = NULL;
    }
    if (ad_link) { 
    if(!cJSON_IsString(ad_link) && !cJSON_IsNull(ad_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_video_0_link
    cJSON *ad_video_0_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_video_0_link");
    if (cJSON_IsNull(ad_video_0_link)) {
        ad_video_0_link = NULL;
    }
    if (ad_video_0_link) { 
    if(!cJSON_IsString(ad_video_0_link) && !cJSON_IsNull(ad_video_0_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_video_0_tag
    cJSON *ad_video_0_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_video_0_tag");
    if (cJSON_IsNull(ad_video_0_tag)) {
        ad_video_0_tag = NULL;
    }
    if (ad_video_0_tag) { 
    if(!cJSON_IsString(ad_video_0_tag) && !cJSON_IsNull(ad_video_0_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_video_1_link
    cJSON *ad_video_1_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_video_1_link");
    if (cJSON_IsNull(ad_video_1_link)) {
        ad_video_1_link = NULL;
    }
    if (ad_video_1_link) { 
    if(!cJSON_IsString(ad_video_1_link) && !cJSON_IsNull(ad_video_1_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_video_1_tag
    cJSON *ad_video_1_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_video_1_tag");
    if (cJSON_IsNull(ad_video_1_tag)) {
        ad_video_1_tag = NULL;
    }
    if (ad_video_1_tag) { 
    if(!cJSON_IsString(ad_video_1_tag) && !cJSON_IsNull(ad_video_1_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_video_2_link
    cJSON *ad_video_2_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_video_2_link");
    if (cJSON_IsNull(ad_video_2_link)) {
        ad_video_2_link = NULL;
    }
    if (ad_video_2_link) { 
    if(!cJSON_IsString(ad_video_2_link) && !cJSON_IsNull(ad_video_2_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ad_video_2_tag
    cJSON *ad_video_2_tag = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_video_2_tag");
    if (cJSON_IsNull(ad_video_2_tag)) {
        ad_video_2_tag = NULL;
    }
    if (ad_video_2_tag) { 
    if(!cJSON_IsString(ad_video_2_tag) && !cJSON_IsNull(ad_video_2_tag))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->adult
    cJSON *adult = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "adult");
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

    // updatable_item_attributes->age_group
    cJSON *age_group = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "age_group");
    if (cJSON_IsNull(age_group)) {
        age_group = NULL;
    }
    if (age_group) { 
    if(!cJSON_IsString(age_group) && !cJSON_IsNull(age_group))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->android_deep_link
    cJSON *android_deep_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "android_deep_link");
    if (cJSON_IsNull(android_deep_link)) {
        android_deep_link = NULL;
    }
    if (android_deep_link) { 
    if(!cJSON_IsString(android_deep_link) && !cJSON_IsNull(android_deep_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "availability");
    if (cJSON_IsNull(availability)) {
        availability = NULL;
    }
    if (availability) { 
    if(!cJSON_IsString(availability) && !cJSON_IsNull(availability))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->average_review_rating
    cJSON *average_review_rating = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "average_review_rating");
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

    // updatable_item_attributes->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "brand");
    if (cJSON_IsNull(brand)) {
        brand = NULL;
    }
    if (brand) { 
    if(!cJSON_IsString(brand) && !cJSON_IsNull(brand))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->checkout_enabled
    cJSON *checkout_enabled = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "checkout_enabled");
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

    // updatable_item_attributes->color
    cJSON *color = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "color");
    if (cJSON_IsNull(color)) {
        color = NULL;
    }
    if (color) { 
    if(!cJSON_IsString(color) && !cJSON_IsNull(color))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->condition
    cJSON *condition = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "condition");
    if (cJSON_IsNull(condition)) {
        condition = NULL;
    }
    if (condition) { 
    if(!cJSON_IsString(condition) && !cJSON_IsNull(condition))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_label_0");
    if (cJSON_IsNull(custom_label_0)) {
        custom_label_0 = NULL;
    }
    if (custom_label_0) { 
    if(!cJSON_IsString(custom_label_0) && !cJSON_IsNull(custom_label_0))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_label_1");
    if (cJSON_IsNull(custom_label_1)) {
        custom_label_1 = NULL;
    }
    if (custom_label_1) { 
    if(!cJSON_IsString(custom_label_1) && !cJSON_IsNull(custom_label_1))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_label_2");
    if (cJSON_IsNull(custom_label_2)) {
        custom_label_2 = NULL;
    }
    if (custom_label_2) { 
    if(!cJSON_IsString(custom_label_2) && !cJSON_IsNull(custom_label_2))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_label_3");
    if (cJSON_IsNull(custom_label_3)) {
        custom_label_3 = NULL;
    }
    if (custom_label_3) { 
    if(!cJSON_IsString(custom_label_3) && !cJSON_IsNull(custom_label_3))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_label_4");
    if (cJSON_IsNull(custom_label_4)) {
        custom_label_4 = NULL;
    }
    if (custom_label_4) { 
    if(!cJSON_IsString(custom_label_4) && !cJSON_IsNull(custom_label_4))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->custom_number_0
    cJSON *custom_number_0 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_number_0");
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

    // updatable_item_attributes->custom_number_1
    cJSON *custom_number_1 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_number_1");
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

    // updatable_item_attributes->custom_number_2
    cJSON *custom_number_2 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_number_2");
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

    // updatable_item_attributes->custom_number_3
    cJSON *custom_number_3 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_number_3");
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

    // updatable_item_attributes->custom_number_4
    cJSON *custom_number_4 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_number_4");
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

    // updatable_item_attributes->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->free_shipping_label
    cJSON *free_shipping_label = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "free_shipping_label");
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

    // updatable_item_attributes->free_shipping_limit
    cJSON *free_shipping_limit = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "free_shipping_limit");
    if (cJSON_IsNull(free_shipping_limit)) {
        free_shipping_limit = NULL;
    }
    if (free_shipping_limit) { 
    if(!cJSON_IsString(free_shipping_limit) && !cJSON_IsNull(free_shipping_limit))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "gender");
    if (cJSON_IsNull(gender)) {
        gender = NULL;
    }
    if (gender) { 
    if(!cJSON_IsString(gender) && !cJSON_IsNull(gender))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->google_product_category
    cJSON *google_product_category = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "google_product_category");
    if (cJSON_IsNull(google_product_category)) {
        google_product_category = NULL;
    }
    if (google_product_category) { 
    if(!cJSON_IsString(google_product_category) && !cJSON_IsNull(google_product_category))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->gtin
    cJSON *gtin = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "gtin");
    if (cJSON_IsNull(gtin)) {
        gtin = NULL;
    }
    if (gtin) { 
    gtin_local_nonprim = updatable_item_attributes_gtin_parseFromJSON(gtin); //nonprimitive
    }

    // updatable_item_attributes->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->installment_price
    cJSON *installment_price = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "installment_price");
    if (cJSON_IsNull(installment_price)) {
        installment_price = NULL;
    }
    if (installment_price) { 
    if(!cJSON_IsString(installment_price) && !cJSON_IsNull(installment_price))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->ios_deep_link
    cJSON *ios_deep_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ios_deep_link");
    if (cJSON_IsNull(ios_deep_link)) {
        ios_deep_link = NULL;
    }
    if (ios_deep_link) { 
    if(!cJSON_IsString(ios_deep_link) && !cJSON_IsNull(ios_deep_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->item_group_id
    cJSON *item_group_id = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "item_group_id");
    if (cJSON_IsNull(item_group_id)) {
        item_group_id = NULL;
    }
    if (item_group_id) { 
    if(!cJSON_IsString(item_group_id) && !cJSON_IsNull(item_group_id))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->last_updated_time
    cJSON *last_updated_time = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "last_updated_time");
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

    // updatable_item_attributes->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->material
    cJSON *material = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "material");
    if (cJSON_IsNull(material)) {
        material = NULL;
    }
    if (material) { 
    if(!cJSON_IsString(material) && !cJSON_IsNull(material))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->min_ad_price
    cJSON *min_ad_price = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "min_ad_price");
    if (cJSON_IsNull(min_ad_price)) {
        min_ad_price = NULL;
    }
    if (min_ad_price) { 
    if(!cJSON_IsString(min_ad_price) && !cJSON_IsNull(min_ad_price))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->mobile_link
    cJSON *mobile_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "mobile_link");
    if (cJSON_IsNull(mobile_link)) {
        mobile_link = NULL;
    }
    if (mobile_link) { 
    if(!cJSON_IsString(mobile_link) && !cJSON_IsNull(mobile_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->mpn
    cJSON *mpn = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "mpn");
    if (cJSON_IsNull(mpn)) {
        mpn = NULL;
    }
    if (mpn) { 
    if(!cJSON_IsString(mpn) && !cJSON_IsNull(mpn))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->number_of_ratings
    cJSON *number_of_ratings = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "number_of_ratings");
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

    // updatable_item_attributes->number_of_reviews
    cJSON *number_of_reviews = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "number_of_reviews");
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

    // updatable_item_attributes->pattern
    cJSON *pattern = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "pattern");
    if (cJSON_IsNull(pattern)) {
        pattern = NULL;
    }
    if (pattern) { 
    if(!cJSON_IsString(pattern) && !cJSON_IsNull(pattern))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "price");
    if (cJSON_IsNull(price)) {
        price = NULL;
    }
    if (price) { 
    if(!cJSON_IsString(price) && !cJSON_IsNull(price))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->product_type
    cJSON *product_type = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "product_type");
    if (cJSON_IsNull(product_type)) {
        product_type = NULL;
    }
    if (product_type) { 
    if(!cJSON_IsString(product_type) && !cJSON_IsNull(product_type))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->promotion_id
    cJSON *promotion_id = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "promotion_id");
    if (cJSON_IsNull(promotion_id)) {
        promotion_id = NULL;
    }
    if (promotion_id) { 
    if(!cJSON_IsString(promotion_id) && !cJSON_IsNull(promotion_id))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->sale_price
    cJSON *sale_price = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "sale_price");
    if (cJSON_IsNull(sale_price)) {
        sale_price = NULL;
    }
    if (sale_price) { 
    if(!cJSON_IsString(sale_price) && !cJSON_IsNull(sale_price))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->sale_price_effective_date
    cJSON *sale_price_effective_date = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "sale_price_effective_date");
    if (cJSON_IsNull(sale_price_effective_date)) {
        sale_price_effective_date = NULL;
    }
    if (sale_price_effective_date) { 
    if(!cJSON_IsString(sale_price_effective_date) && !cJSON_IsNull(sale_price_effective_date))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->shipping
    cJSON *shipping = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "shipping");
    if (cJSON_IsNull(shipping)) {
        shipping = NULL;
    }
    if (shipping) { 
    if(!cJSON_IsString(shipping) && !cJSON_IsNull(shipping))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->shipping_height
    cJSON *shipping_height = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "shipping_height");
    if (cJSON_IsNull(shipping_height)) {
        shipping_height = NULL;
    }
    if (shipping_height) { 
    if(!cJSON_IsString(shipping_height) && !cJSON_IsNull(shipping_height))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->shipping_weight
    cJSON *shipping_weight = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "shipping_weight");
    if (cJSON_IsNull(shipping_weight)) {
        shipping_weight = NULL;
    }
    if (shipping_weight) { 
    if(!cJSON_IsString(shipping_weight) && !cJSON_IsNull(shipping_weight))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->shipping_width
    cJSON *shipping_width = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "shipping_width");
    if (cJSON_IsNull(shipping_width)) {
        shipping_width = NULL;
    }
    if (shipping_width) { 
    if(!cJSON_IsString(shipping_width) && !cJSON_IsNull(shipping_width))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "size");
    if (cJSON_IsNull(size)) {
        size = NULL;
    }
    if (size) { 
    if(!cJSON_IsString(size) && !cJSON_IsNull(size))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->size_system
    cJSON *size_system = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "size_system");
    if (cJSON_IsNull(size_system)) {
        size_system = NULL;
    }
    if (size_system) { 
    if(!cJSON_IsString(size_system) && !cJSON_IsNull(size_system))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->size_type
    cJSON *size_type = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "size_type");
    if (cJSON_IsNull(size_type)) {
        size_type = NULL;
    }
    if (size_type) { 
    if(!cJSON_IsString(size_type) && !cJSON_IsNull(size_type))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->tax
    cJSON *tax = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "tax");
    if (cJSON_IsNull(tax)) {
        tax = NULL;
    }
    if (tax) { 
    if(!cJSON_IsString(tax) && !cJSON_IsNull(tax))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->unit_pricing_base_measure
    cJSON *unit_pricing_base_measure = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "unit_pricing_base_measure");
    if (cJSON_IsNull(unit_pricing_base_measure)) {
        unit_pricing_base_measure = NULL;
    }
    if (unit_pricing_base_measure) { 
    if(!cJSON_IsString(unit_pricing_base_measure) && !cJSON_IsNull(unit_pricing_base_measure))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->unit_pricing_measure
    cJSON *unit_pricing_measure = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "unit_pricing_measure");
    if (cJSON_IsNull(unit_pricing_measure)) {
        unit_pricing_measure = NULL;
    }
    if (unit_pricing_measure) { 
    if(!cJSON_IsString(unit_pricing_measure) && !cJSON_IsNull(unit_pricing_measure))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->variant_names
    cJSON *variant_names = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "variant_names");
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

    // updatable_item_attributes->variant_values
    cJSON *variant_values = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "variant_values");
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

    updatable_item_attributes_local_var = updatable_item_attributes_create_internal (
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
        adult_local_var,
        age_group_local_str,
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
        variant_values ? variant_valuesList : NULL
        );

    if (!updatable_item_attributes_local_var) {
        goto end;
    }

    return updatable_item_attributes_local_var;
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
    if (adult_local_var) {
        free(adult_local_var);
        adult_local_var = NULL;
    }
    if (age_group_local_str) {
        free(age_group_local_str);
        age_group_local_str = NULL;
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
    return NULL;

}
