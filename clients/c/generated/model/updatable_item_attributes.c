#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "updatable_item_attributes.h"



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
    ) {
    updatable_item_attributes_t *updatable_item_attributes_local_var = malloc(sizeof(updatable_item_attributes_t));
    if (!updatable_item_attributes_local_var) {
        return NULL;
    }
    updatable_item_attributes_local_var->ad_link = ad_link;
    updatable_item_attributes_local_var->adult = adult;
    updatable_item_attributes_local_var->age_group = age_group;
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
    updatable_item_attributes_local_var->description = description;
    updatable_item_attributes_local_var->free_shipping_label = free_shipping_label;
    updatable_item_attributes_local_var->free_shipping_limit = free_shipping_limit;
    updatable_item_attributes_local_var->gender = gender;
    updatable_item_attributes_local_var->google_product_category = google_product_category;
    updatable_item_attributes_local_var->gtin = gtin;
    updatable_item_attributes_local_var->id = id;
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
    updatable_item_attributes_local_var->sale_price = sale_price;
    updatable_item_attributes_local_var->shipping = shipping;
    updatable_item_attributes_local_var->shipping_height = shipping_height;
    updatable_item_attributes_local_var->shipping_weight = shipping_weight;
    updatable_item_attributes_local_var->shipping_width = shipping_width;
    updatable_item_attributes_local_var->size = size;
    updatable_item_attributes_local_var->size_system = size_system;
    updatable_item_attributes_local_var->size_type = size_type;
    updatable_item_attributes_local_var->tax = tax;
    updatable_item_attributes_local_var->title = title;
    updatable_item_attributes_local_var->variant_names = variant_names;
    updatable_item_attributes_local_var->variant_values = variant_values;

    return updatable_item_attributes_local_var;
}


void updatable_item_attributes_free(updatable_item_attributes_t *updatable_item_attributes) {
    if(NULL == updatable_item_attributes){
        return ;
    }
    listEntry_t *listEntry;
    if (updatable_item_attributes->ad_link) {
        free(updatable_item_attributes->ad_link);
        updatable_item_attributes->ad_link = NULL;
    }
    if (updatable_item_attributes->age_group) {
        free(updatable_item_attributes->age_group);
        updatable_item_attributes->age_group = NULL;
    }
    if (updatable_item_attributes->availability) {
        free(updatable_item_attributes->availability);
        updatable_item_attributes->availability = NULL;
    }
    if (updatable_item_attributes->brand) {
        free(updatable_item_attributes->brand);
        updatable_item_attributes->brand = NULL;
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
    if (updatable_item_attributes->description) {
        free(updatable_item_attributes->description);
        updatable_item_attributes->description = NULL;
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
    if (updatable_item_attributes->id) {
        free(updatable_item_attributes->id);
        updatable_item_attributes->id = NULL;
    }
    if (updatable_item_attributes->item_group_id) {
        free(updatable_item_attributes->item_group_id);
        updatable_item_attributes->item_group_id = NULL;
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
    if (updatable_item_attributes->sale_price) {
        free(updatable_item_attributes->sale_price);
        updatable_item_attributes->sale_price = NULL;
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

    // updatable_item_attributes->ad_link
    if(updatable_item_attributes->ad_link) {
    if(cJSON_AddStringToObject(item, "ad_link", updatable_item_attributes->ad_link) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->adult
    if(updatable_item_attributes->adult) {
    if(cJSON_AddBoolToObject(item, "adult", updatable_item_attributes->adult) == NULL) {
    goto fail; //Bool
    }
    }


    // updatable_item_attributes->age_group
    if(updatable_item_attributes->age_group) {
    if(cJSON_AddStringToObject(item, "age_group", updatable_item_attributes->age_group) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "average_review_rating", updatable_item_attributes->average_review_rating) == NULL) {
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
    if(cJSON_AddBoolToObject(item, "checkout_enabled", updatable_item_attributes->checkout_enabled) == NULL) {
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


    // updatable_item_attributes->description
    if(updatable_item_attributes->description) {
    if(cJSON_AddStringToObject(item, "description", updatable_item_attributes->description) == NULL) {
    goto fail; //String
    }
    }


    // updatable_item_attributes->free_shipping_label
    if(updatable_item_attributes->free_shipping_label) {
    if(cJSON_AddBoolToObject(item, "free_shipping_label", updatable_item_attributes->free_shipping_label) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "gtin", updatable_item_attributes->gtin) == NULL) {
    goto fail; //Numeric
    }
    }


    // updatable_item_attributes->id
    if(updatable_item_attributes->id) {
    if(cJSON_AddStringToObject(item, "id", updatable_item_attributes->id) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "last_updated_time", updatable_item_attributes->last_updated_time) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "number_of_ratings", updatable_item_attributes->number_of_ratings) == NULL) {
    goto fail; //Numeric
    }
    }


    // updatable_item_attributes->number_of_reviews
    if(updatable_item_attributes->number_of_reviews) {
    if(cJSON_AddNumberToObject(item, "number_of_reviews", updatable_item_attributes->number_of_reviews) == NULL) {
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


    // updatable_item_attributes->sale_price
    if(updatable_item_attributes->sale_price) {
    if(cJSON_AddStringToObject(item, "sale_price", updatable_item_attributes->sale_price) == NULL) {
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


    // updatable_item_attributes->variant_names
    if(updatable_item_attributes->variant_names) {
    cJSON *variant_names = cJSON_AddArrayToObject(item, "variant_names");
    if(variant_names == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *variant_namesListEntry;
    list_ForEach(variant_namesListEntry, updatable_item_attributes->variant_names) {
    if(cJSON_AddStringToObject(variant_names, "", (char*)variant_namesListEntry->data) == NULL)
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
    if(cJSON_AddStringToObject(variant_values, "", (char*)variant_valuesListEntry->data) == NULL)
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

    // define the local list for updatable_item_attributes->variant_names
    list_t *variant_namesList = NULL;

    // define the local list for updatable_item_attributes->variant_values
    list_t *variant_valuesList = NULL;

    // updatable_item_attributes->ad_link
    cJSON *ad_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "ad_link");
    if (ad_link) { 
    if(!cJSON_IsString(ad_link) && !cJSON_IsNull(ad_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->adult
    cJSON *adult = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "adult");
    if (adult) { 
    if(!cJSON_IsBool(adult))
    {
    goto end; //Bool
    }
    }

    // updatable_item_attributes->age_group
    cJSON *age_group = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "age_group");
    if (age_group) { 
    if(!cJSON_IsString(age_group) && !cJSON_IsNull(age_group))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "availability");
    if (availability) { 
    if(!cJSON_IsString(availability) && !cJSON_IsNull(availability))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->average_review_rating
    cJSON *average_review_rating = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "average_review_rating");
    if (average_review_rating) { 
    if(!cJSON_IsNumber(average_review_rating))
    {
    goto end; //Numeric
    }
    }

    // updatable_item_attributes->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "brand");
    if (brand) { 
    if(!cJSON_IsString(brand) && !cJSON_IsNull(brand))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->checkout_enabled
    cJSON *checkout_enabled = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "checkout_enabled");
    if (checkout_enabled) { 
    if(!cJSON_IsBool(checkout_enabled))
    {
    goto end; //Bool
    }
    }

    // updatable_item_attributes->color
    cJSON *color = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "color");
    if (color) { 
    if(!cJSON_IsString(color) && !cJSON_IsNull(color))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->condition
    cJSON *condition = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "condition");
    if (condition) { 
    if(!cJSON_IsString(condition) && !cJSON_IsNull(condition))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_label_0");
    if (custom_label_0) { 
    if(!cJSON_IsString(custom_label_0) && !cJSON_IsNull(custom_label_0))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_label_1");
    if (custom_label_1) { 
    if(!cJSON_IsString(custom_label_1) && !cJSON_IsNull(custom_label_1))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_label_2");
    if (custom_label_2) { 
    if(!cJSON_IsString(custom_label_2) && !cJSON_IsNull(custom_label_2))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_label_3");
    if (custom_label_3) { 
    if(!cJSON_IsString(custom_label_3) && !cJSON_IsNull(custom_label_3))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "custom_label_4");
    if (custom_label_4) { 
    if(!cJSON_IsString(custom_label_4) && !cJSON_IsNull(custom_label_4))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->free_shipping_label
    cJSON *free_shipping_label = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "free_shipping_label");
    if (free_shipping_label) { 
    if(!cJSON_IsBool(free_shipping_label))
    {
    goto end; //Bool
    }
    }

    // updatable_item_attributes->free_shipping_limit
    cJSON *free_shipping_limit = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "free_shipping_limit");
    if (free_shipping_limit) { 
    if(!cJSON_IsString(free_shipping_limit) && !cJSON_IsNull(free_shipping_limit))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "gender");
    if (gender) { 
    if(!cJSON_IsString(gender) && !cJSON_IsNull(gender))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->google_product_category
    cJSON *google_product_category = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "google_product_category");
    if (google_product_category) { 
    if(!cJSON_IsString(google_product_category) && !cJSON_IsNull(google_product_category))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->gtin
    cJSON *gtin = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "gtin");
    if (gtin) { 
    if(!cJSON_IsNumber(gtin))
    {
    goto end; //Numeric
    }
    }

    // updatable_item_attributes->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->item_group_id
    cJSON *item_group_id = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "item_group_id");
    if (item_group_id) { 
    if(!cJSON_IsString(item_group_id) && !cJSON_IsNull(item_group_id))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->last_updated_time
    cJSON *last_updated_time = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "last_updated_time");
    if (last_updated_time) { 
    if(!cJSON_IsNumber(last_updated_time))
    {
    goto end; //Numeric
    }
    }

    // updatable_item_attributes->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->material
    cJSON *material = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "material");
    if (material) { 
    if(!cJSON_IsString(material) && !cJSON_IsNull(material))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->min_ad_price
    cJSON *min_ad_price = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "min_ad_price");
    if (min_ad_price) { 
    if(!cJSON_IsString(min_ad_price) && !cJSON_IsNull(min_ad_price))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->mobile_link
    cJSON *mobile_link = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "mobile_link");
    if (mobile_link) { 
    if(!cJSON_IsString(mobile_link) && !cJSON_IsNull(mobile_link))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->mpn
    cJSON *mpn = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "mpn");
    if (mpn) { 
    if(!cJSON_IsString(mpn) && !cJSON_IsNull(mpn))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->number_of_ratings
    cJSON *number_of_ratings = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "number_of_ratings");
    if (number_of_ratings) { 
    if(!cJSON_IsNumber(number_of_ratings))
    {
    goto end; //Numeric
    }
    }

    // updatable_item_attributes->number_of_reviews
    cJSON *number_of_reviews = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "number_of_reviews");
    if (number_of_reviews) { 
    if(!cJSON_IsNumber(number_of_reviews))
    {
    goto end; //Numeric
    }
    }

    // updatable_item_attributes->pattern
    cJSON *pattern = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "pattern");
    if (pattern) { 
    if(!cJSON_IsString(pattern) && !cJSON_IsNull(pattern))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "price");
    if (price) { 
    if(!cJSON_IsString(price) && !cJSON_IsNull(price))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->product_type
    cJSON *product_type = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "product_type");
    if (product_type) { 
    if(!cJSON_IsString(product_type) && !cJSON_IsNull(product_type))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->sale_price
    cJSON *sale_price = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "sale_price");
    if (sale_price) { 
    if(!cJSON_IsString(sale_price) && !cJSON_IsNull(sale_price))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->shipping
    cJSON *shipping = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "shipping");
    if (shipping) { 
    if(!cJSON_IsString(shipping) && !cJSON_IsNull(shipping))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->shipping_height
    cJSON *shipping_height = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "shipping_height");
    if (shipping_height) { 
    if(!cJSON_IsString(shipping_height) && !cJSON_IsNull(shipping_height))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->shipping_weight
    cJSON *shipping_weight = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "shipping_weight");
    if (shipping_weight) { 
    if(!cJSON_IsString(shipping_weight) && !cJSON_IsNull(shipping_weight))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->shipping_width
    cJSON *shipping_width = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "shipping_width");
    if (shipping_width) { 
    if(!cJSON_IsString(shipping_width) && !cJSON_IsNull(shipping_width))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "size");
    if (size) { 
    if(!cJSON_IsString(size) && !cJSON_IsNull(size))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->size_system
    cJSON *size_system = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "size_system");
    if (size_system) { 
    if(!cJSON_IsString(size_system) && !cJSON_IsNull(size_system))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->size_type
    cJSON *size_type = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "size_type");
    if (size_type) { 
    if(!cJSON_IsString(size_type) && !cJSON_IsNull(size_type))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->tax
    cJSON *tax = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "tax");
    if (tax) { 
    if(!cJSON_IsString(tax) && !cJSON_IsNull(tax))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // updatable_item_attributes->variant_names
    cJSON *variant_names = cJSON_GetObjectItemCaseSensitive(updatable_item_attributesJSON, "variant_names");
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


    updatable_item_attributes_local_var = updatable_item_attributes_create (
        ad_link && !cJSON_IsNull(ad_link) ? strdup(ad_link->valuestring) : NULL,
        adult ? adult->valueint : 0,
        age_group && !cJSON_IsNull(age_group) ? strdup(age_group->valuestring) : NULL,
        availability && !cJSON_IsNull(availability) ? strdup(availability->valuestring) : NULL,
        average_review_rating ? average_review_rating->valuedouble : 0,
        brand && !cJSON_IsNull(brand) ? strdup(brand->valuestring) : NULL,
        checkout_enabled ? checkout_enabled->valueint : 0,
        color && !cJSON_IsNull(color) ? strdup(color->valuestring) : NULL,
        condition && !cJSON_IsNull(condition) ? strdup(condition->valuestring) : NULL,
        custom_label_0 && !cJSON_IsNull(custom_label_0) ? strdup(custom_label_0->valuestring) : NULL,
        custom_label_1 && !cJSON_IsNull(custom_label_1) ? strdup(custom_label_1->valuestring) : NULL,
        custom_label_2 && !cJSON_IsNull(custom_label_2) ? strdup(custom_label_2->valuestring) : NULL,
        custom_label_3 && !cJSON_IsNull(custom_label_3) ? strdup(custom_label_3->valuestring) : NULL,
        custom_label_4 && !cJSON_IsNull(custom_label_4) ? strdup(custom_label_4->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        free_shipping_label ? free_shipping_label->valueint : 0,
        free_shipping_limit && !cJSON_IsNull(free_shipping_limit) ? strdup(free_shipping_limit->valuestring) : NULL,
        gender && !cJSON_IsNull(gender) ? strdup(gender->valuestring) : NULL,
        google_product_category && !cJSON_IsNull(google_product_category) ? strdup(google_product_category->valuestring) : NULL,
        gtin ? gtin->valuedouble : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        item_group_id && !cJSON_IsNull(item_group_id) ? strdup(item_group_id->valuestring) : NULL,
        last_updated_time ? last_updated_time->valuedouble : 0,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        material && !cJSON_IsNull(material) ? strdup(material->valuestring) : NULL,
        min_ad_price && !cJSON_IsNull(min_ad_price) ? strdup(min_ad_price->valuestring) : NULL,
        mobile_link && !cJSON_IsNull(mobile_link) ? strdup(mobile_link->valuestring) : NULL,
        mpn && !cJSON_IsNull(mpn) ? strdup(mpn->valuestring) : NULL,
        number_of_ratings ? number_of_ratings->valuedouble : 0,
        number_of_reviews ? number_of_reviews->valuedouble : 0,
        pattern && !cJSON_IsNull(pattern) ? strdup(pattern->valuestring) : NULL,
        price && !cJSON_IsNull(price) ? strdup(price->valuestring) : NULL,
        product_type && !cJSON_IsNull(product_type) ? strdup(product_type->valuestring) : NULL,
        sale_price && !cJSON_IsNull(sale_price) ? strdup(sale_price->valuestring) : NULL,
        shipping && !cJSON_IsNull(shipping) ? strdup(shipping->valuestring) : NULL,
        shipping_height && !cJSON_IsNull(shipping_height) ? strdup(shipping_height->valuestring) : NULL,
        shipping_weight && !cJSON_IsNull(shipping_weight) ? strdup(shipping_weight->valuestring) : NULL,
        shipping_width && !cJSON_IsNull(shipping_width) ? strdup(shipping_width->valuestring) : NULL,
        size && !cJSON_IsNull(size) ? strdup(size->valuestring) : NULL,
        size_system && !cJSON_IsNull(size_system) ? strdup(size_system->valuestring) : NULL,
        size_type && !cJSON_IsNull(size_type) ? strdup(size_type->valuestring) : NULL,
        tax && !cJSON_IsNull(tax) ? strdup(tax->valuestring) : NULL,
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        variant_names ? variant_namesList : NULL,
        variant_values ? variant_valuesList : NULL
        );

    return updatable_item_attributes_local_var;
end:
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
