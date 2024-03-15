/*
 * updatable_item_attributes.h
 *
 * 
 */

#ifndef _updatable_item_attributes_H_
#define _updatable_item_attributes_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct updatable_item_attributes_t updatable_item_attributes_t;




typedef struct updatable_item_attributes_t {
    char *ad_link; // string
    int adult; //boolean
    char *age_group; // string
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
    char *description; // string
    int free_shipping_label; //boolean
    char *free_shipping_limit; // string
    char *gender; // string
    char *google_product_category; // string
    int gtin; //numeric
    char *id; // string
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
    char *sale_price; // string
    char *shipping; // string
    char *shipping_height; // string
    char *shipping_weight; // string
    char *shipping_width; // string
    char *size; // string
    char *size_system; // string
    char *size_type; // string
    char *tax; // string
    char *title; // string
    list_t *variant_names; //primitive container
    list_t *variant_values; //primitive container

} updatable_item_attributes_t;

updatable_item_attributes_t *updatable_item_attributes_create(
    char *ad_link,
    int adult,
    char *age_group,
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
    char *description,
    int free_shipping_label,
    char *free_shipping_limit,
    char *gender,
    char *google_product_category,
    int gtin,
    char *id,
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
    char *sale_price,
    char *shipping,
    char *shipping_height,
    char *shipping_weight,
    char *shipping_width,
    char *size,
    char *size_system,
    char *size_type,
    char *tax,
    char *title,
    list_t *variant_names,
    list_t *variant_values
);

void updatable_item_attributes_free(updatable_item_attributes_t *updatable_item_attributes);

updatable_item_attributes_t *updatable_item_attributes_parseFromJSON(cJSON *updatable_item_attributesJSON);

cJSON *updatable_item_attributes_convertToJSON(updatable_item_attributes_t *updatable_item_attributes);

#endif /* _updatable_item_attributes_H_ */

