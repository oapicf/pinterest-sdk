/*
 * item_attributes.h
 *
 * 
 */

#ifndef _item_attributes_H_
#define _item_attributes_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_attributes_t item_attributes_t;

#include "updatable_item_attributes_gtin.h"



typedef struct item_attributes_t {
    char *ad_image_0_link; // string
    char *ad_image_0_tag; // string
    char *ad_image_10_link; // string
    char *ad_image_10_tag; // string
    char *ad_image_11_link; // string
    char *ad_image_11_tag; // string
    char *ad_image_12_link; // string
    char *ad_image_12_tag; // string
    char *ad_image_13_link; // string
    char *ad_image_13_tag; // string
    char *ad_image_14_link; // string
    char *ad_image_14_tag; // string
    char *ad_image_15_link; // string
    char *ad_image_15_tag; // string
    char *ad_image_16_link; // string
    char *ad_image_16_tag; // string
    char *ad_image_17_link; // string
    char *ad_image_17_tag; // string
    char *ad_image_18_link; // string
    char *ad_image_18_tag; // string
    char *ad_image_19_link; // string
    char *ad_image_19_tag; // string
    char *ad_image_1_link; // string
    char *ad_image_1_tag; // string
    char *ad_image_2_link; // string
    char *ad_image_2_tag; // string
    char *ad_image_3_link; // string
    char *ad_image_3_tag; // string
    char *ad_image_4_link; // string
    char *ad_image_4_tag; // string
    char *ad_image_5_link; // string
    char *ad_image_5_tag; // string
    char *ad_image_6_link; // string
    char *ad_image_6_tag; // string
    char *ad_image_7_link; // string
    char *ad_image_7_tag; // string
    char *ad_image_8_link; // string
    char *ad_image_8_tag; // string
    char *ad_image_9_link; // string
    char *ad_image_9_tag; // string
    char *ad_link; // string
    char *ad_video_0_link; // string
    char *ad_video_0_tag; // string
    char *ad_video_1_link; // string
    char *ad_video_1_tag; // string
    char *ad_video_2_link; // string
    char *ad_video_2_tag; // string
    int adult; //boolean
    char *age_group; // string
    char *android_deep_link; // string
    char *availability; // string
    double average_review_rating; //numeric
    char *brand; // string
    int checkout_enabled; //boolean
    char *color; // string
    char *condition; // string
    char *custom_label_0; // string
    char *custom_label_1; // string
    char *custom_label_2; // string
    char *custom_label_3; // string
    char *custom_label_4; // string
    int custom_number_0; //numeric
    int custom_number_1; //numeric
    int custom_number_2; //numeric
    int custom_number_3; //numeric
    int custom_number_4; //numeric
    char *description; // string
    int free_shipping_label; //boolean
    char *free_shipping_limit; // string
    char *gender; // string
    char *google_product_category; // string
    struct updatable_item_attributes_gtin_t *gtin; //model
    char *id; // string
    char *installment_price; // string
    char *ios_deep_link; // string
    char *item_group_id; // string
    long last_updated_time; //numeric
    char *link; // string
    char *material; // string
    char *min_ad_price; // string
    char *mobile_link; // string
    char *mpn; // string
    int number_of_ratings; //numeric
    int number_of_reviews; //numeric
    char *pattern; // string
    char *price; // string
    char *product_type; // string
    char *promotion_id; // string
    char *sale_price; // string
    char *sale_price_effective_date; // string
    char *shipping; // string
    char *shipping_height; // string
    char *shipping_weight; // string
    char *shipping_width; // string
    char *size; // string
    char *size_system; // string
    char *size_type; // string
    char *tax; // string
    char *title; // string
    char *unit_pricing_base_measure; // string
    char *unit_pricing_measure; // string
    list_t *variant_names; //primitive container
    list_t *variant_values; //primitive container
    list_t *additional_image_link; //primitive container
    list_t *image_link; //primitive container
    char *video_link; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_attributes_t;

__attribute__((deprecated)) item_attributes_t *item_attributes_create(
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
    int adult,
    char *age_group,
    char *android_deep_link,
    char *availability,
    double average_review_rating,
    char *brand,
    int checkout_enabled,
    char *color,
    char *condition,
    char *custom_label_0,
    char *custom_label_1,
    char *custom_label_2,
    char *custom_label_3,
    char *custom_label_4,
    int custom_number_0,
    int custom_number_1,
    int custom_number_2,
    int custom_number_3,
    int custom_number_4,
    char *description,
    int free_shipping_label,
    char *free_shipping_limit,
    char *gender,
    char *google_product_category,
    updatable_item_attributes_gtin_t *gtin,
    char *id,
    char *installment_price,
    char *ios_deep_link,
    char *item_group_id,
    long last_updated_time,
    char *link,
    char *material,
    char *min_ad_price,
    char *mobile_link,
    char *mpn,
    int number_of_ratings,
    int number_of_reviews,
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
    list_t *variant_values,
    list_t *additional_image_link,
    list_t *image_link,
    char *video_link
);

void item_attributes_free(item_attributes_t *item_attributes);

item_attributes_t *item_attributes_parseFromJSON(cJSON *item_attributesJSON);

cJSON *item_attributes_convertToJSON(item_attributes_t *item_attributes);

#endif /* _item_attributes_H_ */

