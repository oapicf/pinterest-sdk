#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_attributes_request.h"



item_attributes_request_t *item_attributes_request_create(
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
    list_t *variant_values,
    list_t *additional_image_link,
    item_attributes_request_all_of_image_link_t *image_link,
    char *video_link
    ) {
    item_attributes_request_t *item_attributes_request_local_var = malloc(sizeof(item_attributes_request_t));
    if (!item_attributes_request_local_var) {
        return NULL;
    }
    item_attributes_request_local_var->ad_link = ad_link;
    item_attributes_request_local_var->adult = adult;
    item_attributes_request_local_var->age_group = age_group;
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
    item_attributes_request_local_var->description = description;
    item_attributes_request_local_var->free_shipping_label = free_shipping_label;
    item_attributes_request_local_var->free_shipping_limit = free_shipping_limit;
    item_attributes_request_local_var->gender = gender;
    item_attributes_request_local_var->google_product_category = google_product_category;
    item_attributes_request_local_var->gtin = gtin;
    item_attributes_request_local_var->id = id;
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
    item_attributes_request_local_var->sale_price = sale_price;
    item_attributes_request_local_var->shipping = shipping;
    item_attributes_request_local_var->shipping_height = shipping_height;
    item_attributes_request_local_var->shipping_weight = shipping_weight;
    item_attributes_request_local_var->shipping_width = shipping_width;
    item_attributes_request_local_var->size = size;
    item_attributes_request_local_var->size_system = size_system;
    item_attributes_request_local_var->size_type = size_type;
    item_attributes_request_local_var->tax = tax;
    item_attributes_request_local_var->title = title;
    item_attributes_request_local_var->variant_names = variant_names;
    item_attributes_request_local_var->variant_values = variant_values;
    item_attributes_request_local_var->additional_image_link = additional_image_link;
    item_attributes_request_local_var->image_link = image_link;
    item_attributes_request_local_var->video_link = video_link;

    return item_attributes_request_local_var;
}


void item_attributes_request_free(item_attributes_request_t *item_attributes_request) {
    if(NULL == item_attributes_request){
        return ;
    }
    listEntry_t *listEntry;
    if (item_attributes_request->ad_link) {
        free(item_attributes_request->ad_link);
        item_attributes_request->ad_link = NULL;
    }
    if (item_attributes_request->age_group) {
        free(item_attributes_request->age_group);
        item_attributes_request->age_group = NULL;
    }
    if (item_attributes_request->availability) {
        free(item_attributes_request->availability);
        item_attributes_request->availability = NULL;
    }
    if (item_attributes_request->brand) {
        free(item_attributes_request->brand);
        item_attributes_request->brand = NULL;
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
    if (item_attributes_request->description) {
        free(item_attributes_request->description);
        item_attributes_request->description = NULL;
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
    if (item_attributes_request->id) {
        free(item_attributes_request->id);
        item_attributes_request->id = NULL;
    }
    if (item_attributes_request->item_group_id) {
        free(item_attributes_request->item_group_id);
        item_attributes_request->item_group_id = NULL;
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
    if (item_attributes_request->sale_price) {
        free(item_attributes_request->sale_price);
        item_attributes_request->sale_price = NULL;
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
    if (item_attributes_request->additional_image_link) {
        list_ForEach(listEntry, item_attributes_request->additional_image_link) {
            free(listEntry->data);
        }
        list_freeList(item_attributes_request->additional_image_link);
        item_attributes_request->additional_image_link = NULL;
    }
    if (item_attributes_request->image_link) {
        item_attributes_request_all_of_image_link_free(item_attributes_request->image_link);
        item_attributes_request->image_link = NULL;
    }
    if (item_attributes_request->video_link) {
        free(item_attributes_request->video_link);
        item_attributes_request->video_link = NULL;
    }
    free(item_attributes_request);
}

cJSON *item_attributes_request_convertToJSON(item_attributes_request_t *item_attributes_request) {
    cJSON *item = cJSON_CreateObject();

    // item_attributes_request->ad_link
    if(item_attributes_request->ad_link) {
    if(cJSON_AddStringToObject(item, "ad_link", item_attributes_request->ad_link) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->adult
    if(item_attributes_request->adult) {
    if(cJSON_AddBoolToObject(item, "adult", item_attributes_request->adult) == NULL) {
    goto fail; //Bool
    }
    }


    // item_attributes_request->age_group
    if(item_attributes_request->age_group) {
    if(cJSON_AddStringToObject(item, "age_group", item_attributes_request->age_group) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "average_review_rating", item_attributes_request->average_review_rating) == NULL) {
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
    if(cJSON_AddBoolToObject(item, "checkout_enabled", item_attributes_request->checkout_enabled) == NULL) {
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


    // item_attributes_request->description
    if(item_attributes_request->description) {
    if(cJSON_AddStringToObject(item, "description", item_attributes_request->description) == NULL) {
    goto fail; //String
    }
    }


    // item_attributes_request->free_shipping_label
    if(item_attributes_request->free_shipping_label) {
    if(cJSON_AddBoolToObject(item, "free_shipping_label", item_attributes_request->free_shipping_label) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "gtin", item_attributes_request->gtin) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_attributes_request->id
    if(item_attributes_request->id) {
    if(cJSON_AddStringToObject(item, "id", item_attributes_request->id) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "last_updated_time", item_attributes_request->last_updated_time) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "number_of_ratings", item_attributes_request->number_of_ratings) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_attributes_request->number_of_reviews
    if(item_attributes_request->number_of_reviews) {
    if(cJSON_AddNumberToObject(item, "number_of_reviews", item_attributes_request->number_of_reviews) == NULL) {
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


    // item_attributes_request->sale_price
    if(item_attributes_request->sale_price) {
    if(cJSON_AddStringToObject(item, "sale_price", item_attributes_request->sale_price) == NULL) {
    goto fail; //String
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


    // item_attributes_request->variant_names
    if(item_attributes_request->variant_names) {
    cJSON *variant_names = cJSON_AddArrayToObject(item, "variant_names");
    if(variant_names == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *variant_namesListEntry;
    list_ForEach(variant_namesListEntry, item_attributes_request->variant_names) {
    if(cJSON_AddStringToObject(variant_names, "", (char*)variant_namesListEntry->data) == NULL)
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
    if(cJSON_AddStringToObject(variant_values, "", (char*)variant_valuesListEntry->data) == NULL)
    {
        goto fail;
    }
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
    if(cJSON_AddStringToObject(additional_image_link, "", (char*)additional_image_linkListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // item_attributes_request->image_link
    if(item_attributes_request->image_link) {
    cJSON *image_link_local_JSON = item_attributes_request_all_of_image_link_convertToJSON(item_attributes_request->image_link);
    if(image_link_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image_link", image_link_local_JSON);
    if(item->child == NULL) {
    goto fail;
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

    // define the local list for item_attributes_request->variant_names
    list_t *variant_namesList = NULL;

    // define the local list for item_attributes_request->variant_values
    list_t *variant_valuesList = NULL;

    // define the local list for item_attributes_request->additional_image_link
    list_t *additional_image_linkList = NULL;

    // define the local variable for item_attributes_request->image_link
    item_attributes_request_all_of_image_link_t *image_link_local_nonprim = NULL;

    // item_attributes_request->ad_link
    cJSON *ad_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "ad_link");
    if (ad_link) { 
    if(!cJSON_IsString(ad_link) && !cJSON_IsNull(ad_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->adult
    cJSON *adult = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "adult");
    if (adult) { 
    if(!cJSON_IsBool(adult))
    {
    goto end; //Bool
    }
    }

    // item_attributes_request->age_group
    cJSON *age_group = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "age_group");
    if (age_group) { 
    if(!cJSON_IsString(age_group) && !cJSON_IsNull(age_group))
    {
    goto end; //String
    }
    }

    // item_attributes_request->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "availability");
    if (availability) { 
    if(!cJSON_IsString(availability) && !cJSON_IsNull(availability))
    {
    goto end; //String
    }
    }

    // item_attributes_request->average_review_rating
    cJSON *average_review_rating = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "average_review_rating");
    if (average_review_rating) { 
    if(!cJSON_IsNumber(average_review_rating))
    {
    goto end; //Numeric
    }
    }

    // item_attributes_request->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "brand");
    if (brand) { 
    if(!cJSON_IsString(brand) && !cJSON_IsNull(brand))
    {
    goto end; //String
    }
    }

    // item_attributes_request->checkout_enabled
    cJSON *checkout_enabled = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "checkout_enabled");
    if (checkout_enabled) { 
    if(!cJSON_IsBool(checkout_enabled))
    {
    goto end; //Bool
    }
    }

    // item_attributes_request->color
    cJSON *color = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "color");
    if (color) { 
    if(!cJSON_IsString(color) && !cJSON_IsNull(color))
    {
    goto end; //String
    }
    }

    // item_attributes_request->condition
    cJSON *condition = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "condition");
    if (condition) { 
    if(!cJSON_IsString(condition) && !cJSON_IsNull(condition))
    {
    goto end; //String
    }
    }

    // item_attributes_request->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_label_0");
    if (custom_label_0) { 
    if(!cJSON_IsString(custom_label_0) && !cJSON_IsNull(custom_label_0))
    {
    goto end; //String
    }
    }

    // item_attributes_request->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_label_1");
    if (custom_label_1) { 
    if(!cJSON_IsString(custom_label_1) && !cJSON_IsNull(custom_label_1))
    {
    goto end; //String
    }
    }

    // item_attributes_request->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_label_2");
    if (custom_label_2) { 
    if(!cJSON_IsString(custom_label_2) && !cJSON_IsNull(custom_label_2))
    {
    goto end; //String
    }
    }

    // item_attributes_request->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_label_3");
    if (custom_label_3) { 
    if(!cJSON_IsString(custom_label_3) && !cJSON_IsNull(custom_label_3))
    {
    goto end; //String
    }
    }

    // item_attributes_request->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "custom_label_4");
    if (custom_label_4) { 
    if(!cJSON_IsString(custom_label_4) && !cJSON_IsNull(custom_label_4))
    {
    goto end; //String
    }
    }

    // item_attributes_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // item_attributes_request->free_shipping_label
    cJSON *free_shipping_label = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "free_shipping_label");
    if (free_shipping_label) { 
    if(!cJSON_IsBool(free_shipping_label))
    {
    goto end; //Bool
    }
    }

    // item_attributes_request->free_shipping_limit
    cJSON *free_shipping_limit = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "free_shipping_limit");
    if (free_shipping_limit) { 
    if(!cJSON_IsString(free_shipping_limit) && !cJSON_IsNull(free_shipping_limit))
    {
    goto end; //String
    }
    }

    // item_attributes_request->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "gender");
    if (gender) { 
    if(!cJSON_IsString(gender) && !cJSON_IsNull(gender))
    {
    goto end; //String
    }
    }

    // item_attributes_request->google_product_category
    cJSON *google_product_category = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "google_product_category");
    if (google_product_category) { 
    if(!cJSON_IsString(google_product_category) && !cJSON_IsNull(google_product_category))
    {
    goto end; //String
    }
    }

    // item_attributes_request->gtin
    cJSON *gtin = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "gtin");
    if (gtin) { 
    if(!cJSON_IsNumber(gtin))
    {
    goto end; //Numeric
    }
    }

    // item_attributes_request->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // item_attributes_request->item_group_id
    cJSON *item_group_id = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "item_group_id");
    if (item_group_id) { 
    if(!cJSON_IsString(item_group_id) && !cJSON_IsNull(item_group_id))
    {
    goto end; //String
    }
    }

    // item_attributes_request->last_updated_time
    cJSON *last_updated_time = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "last_updated_time");
    if (last_updated_time) { 
    if(!cJSON_IsNumber(last_updated_time))
    {
    goto end; //Numeric
    }
    }

    // item_attributes_request->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->material
    cJSON *material = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "material");
    if (material) { 
    if(!cJSON_IsString(material) && !cJSON_IsNull(material))
    {
    goto end; //String
    }
    }

    // item_attributes_request->min_ad_price
    cJSON *min_ad_price = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "min_ad_price");
    if (min_ad_price) { 
    if(!cJSON_IsString(min_ad_price) && !cJSON_IsNull(min_ad_price))
    {
    goto end; //String
    }
    }

    // item_attributes_request->mobile_link
    cJSON *mobile_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "mobile_link");
    if (mobile_link) { 
    if(!cJSON_IsString(mobile_link) && !cJSON_IsNull(mobile_link))
    {
    goto end; //String
    }
    }

    // item_attributes_request->mpn
    cJSON *mpn = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "mpn");
    if (mpn) { 
    if(!cJSON_IsString(mpn) && !cJSON_IsNull(mpn))
    {
    goto end; //String
    }
    }

    // item_attributes_request->number_of_ratings
    cJSON *number_of_ratings = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "number_of_ratings");
    if (number_of_ratings) { 
    if(!cJSON_IsNumber(number_of_ratings))
    {
    goto end; //Numeric
    }
    }

    // item_attributes_request->number_of_reviews
    cJSON *number_of_reviews = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "number_of_reviews");
    if (number_of_reviews) { 
    if(!cJSON_IsNumber(number_of_reviews))
    {
    goto end; //Numeric
    }
    }

    // item_attributes_request->pattern
    cJSON *pattern = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "pattern");
    if (pattern) { 
    if(!cJSON_IsString(pattern) && !cJSON_IsNull(pattern))
    {
    goto end; //String
    }
    }

    // item_attributes_request->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "price");
    if (price) { 
    if(!cJSON_IsString(price) && !cJSON_IsNull(price))
    {
    goto end; //String
    }
    }

    // item_attributes_request->product_type
    cJSON *product_type = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "product_type");
    if (product_type) { 
    if(!cJSON_IsString(product_type) && !cJSON_IsNull(product_type))
    {
    goto end; //String
    }
    }

    // item_attributes_request->sale_price
    cJSON *sale_price = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "sale_price");
    if (sale_price) { 
    if(!cJSON_IsString(sale_price) && !cJSON_IsNull(sale_price))
    {
    goto end; //String
    }
    }

    // item_attributes_request->shipping
    cJSON *shipping = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "shipping");
    if (shipping) { 
    if(!cJSON_IsString(shipping) && !cJSON_IsNull(shipping))
    {
    goto end; //String
    }
    }

    // item_attributes_request->shipping_height
    cJSON *shipping_height = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "shipping_height");
    if (shipping_height) { 
    if(!cJSON_IsString(shipping_height) && !cJSON_IsNull(shipping_height))
    {
    goto end; //String
    }
    }

    // item_attributes_request->shipping_weight
    cJSON *shipping_weight = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "shipping_weight");
    if (shipping_weight) { 
    if(!cJSON_IsString(shipping_weight) && !cJSON_IsNull(shipping_weight))
    {
    goto end; //String
    }
    }

    // item_attributes_request->shipping_width
    cJSON *shipping_width = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "shipping_width");
    if (shipping_width) { 
    if(!cJSON_IsString(shipping_width) && !cJSON_IsNull(shipping_width))
    {
    goto end; //String
    }
    }

    // item_attributes_request->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "size");
    if (size) { 
    if(!cJSON_IsString(size) && !cJSON_IsNull(size))
    {
    goto end; //String
    }
    }

    // item_attributes_request->size_system
    cJSON *size_system = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "size_system");
    if (size_system) { 
    if(!cJSON_IsString(size_system) && !cJSON_IsNull(size_system))
    {
    goto end; //String
    }
    }

    // item_attributes_request->size_type
    cJSON *size_type = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "size_type");
    if (size_type) { 
    if(!cJSON_IsString(size_type) && !cJSON_IsNull(size_type))
    {
    goto end; //String
    }
    }

    // item_attributes_request->tax
    cJSON *tax = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "tax");
    if (tax) { 
    if(!cJSON_IsString(tax) && !cJSON_IsNull(tax))
    {
    goto end; //String
    }
    }

    // item_attributes_request->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // item_attributes_request->variant_names
    cJSON *variant_names = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "variant_names");
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

    // item_attributes_request->additional_image_link
    cJSON *additional_image_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "additional_image_link");
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

    // item_attributes_request->image_link
    cJSON *image_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "image_link");
    if (image_link) { 
    image_link_local_nonprim = item_attributes_request_all_of_image_link_parseFromJSON(image_link); //nonprimitive
    }

    // item_attributes_request->video_link
    cJSON *video_link = cJSON_GetObjectItemCaseSensitive(item_attributes_requestJSON, "video_link");
    if (video_link) { 
    if(!cJSON_IsString(video_link) && !cJSON_IsNull(video_link))
    {
    goto end; //String
    }
    }


    item_attributes_request_local_var = item_attributes_request_create (
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
        variant_values ? variant_valuesList : NULL,
        additional_image_link ? additional_image_linkList : NULL,
        image_link ? image_link_local_nonprim : NULL,
        video_link && !cJSON_IsNull(video_link) ? strdup(video_link->valuestring) : NULL
        );

    return item_attributes_request_local_var;
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
    if (additional_image_linkList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, additional_image_linkList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(additional_image_linkList);
        additional_image_linkList = NULL;
    }
    if (image_link_local_nonprim) {
        item_attributes_request_all_of_image_link_free(image_link_local_nonprim);
        image_link_local_nonprim = NULL;
    }
    return NULL;

}
