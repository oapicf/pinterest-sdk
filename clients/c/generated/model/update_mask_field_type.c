#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_mask_field_type.h"


char* update_mask_field_type_update_mask_field_type_ToString(pinterest_rest_api_update_mask_field_type__e update_mask_field_type) {
    char *update_mask_field_typeArray[] =  { "NULL", "ad_link", "adult", "age_group", "availability", "average_review_rating", "brand", "checkout_enabled", "color", "condition", "custom_label_0", "custom_label_1", "custom_label_2", "custom_label_3", "custom_label_4", "description", "free_shipping_label", "free_shipping_limit", "gender", "google_product_category", "gtin", "item_group_id", "last_updated_time", "link", "material", "min_ad_price", "mpn", "number_of_ratings", "number_of_reviews", "pattern", "price", "product_type", "sale_price", "shipping", "shipping_height", "shipping_weight", "shipping_width", "size", "size_system", "size_type", "tax", "title", "variant_names", "variant_values" };
    return update_mask_field_typeArray[update_mask_field_type];
}

pinterest_rest_api_update_mask_field_type__e update_mask_field_type_update_mask_field_type_FromString(char* update_mask_field_type) {
    int stringToReturn = 0;
    char *update_mask_field_typeArray[] =  { "NULL", "ad_link", "adult", "age_group", "availability", "average_review_rating", "brand", "checkout_enabled", "color", "condition", "custom_label_0", "custom_label_1", "custom_label_2", "custom_label_3", "custom_label_4", "description", "free_shipping_label", "free_shipping_limit", "gender", "google_product_category", "gtin", "item_group_id", "last_updated_time", "link", "material", "min_ad_price", "mpn", "number_of_ratings", "number_of_reviews", "pattern", "price", "product_type", "sale_price", "shipping", "shipping_height", "shipping_weight", "shipping_width", "size", "size_system", "size_type", "tax", "title", "variant_names", "variant_values" };
    size_t sizeofArray = sizeof(update_mask_field_typeArray) / sizeof(update_mask_field_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(update_mask_field_type, update_mask_field_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *update_mask_field_type_update_mask_field_type_convertToJSON(pinterest_rest_api_update_mask_field_type__e update_mask_field_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "update_mask_field_type", update_mask_field_type_update_mask_field_type_ToString(update_mask_field_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_update_mask_field_type__e update_mask_field_type_update_mask_field_type_parseFromJSON(cJSON *update_mask_field_typeJSON) {
    pinterest_rest_api_update_mask_field_type__e *update_mask_field_type = NULL;
    pinterest_rest_api_update_mask_field_type__e update_mask_field_typeVariable;
    cJSON *update_mask_field_typeVar = cJSON_GetObjectItemCaseSensitive(update_mask_field_typeJSON, "update_mask_field_type");
    if(!cJSON_IsString(update_mask_field_typeVar) || (update_mask_field_typeVar->valuestring == NULL)){
        goto end;
    }
    update_mask_field_typeVariable = update_mask_field_type_update_mask_field_type_FromString(update_mask_field_typeVar->valuestring);
    return update_mask_field_typeVariable;
end:
    return 0;
}
