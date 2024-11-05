#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_filter_keys.h"



catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys_create(
    catalogs_product_group_pricing_criteria_t *min_price,
    catalogs_product_group_pricing_criteria_t *max_price,
    catalogs_product_group_currency_criteria_t *currency,
    catalogs_product_group_multiple_string_criteria_t *item_id,
    catalogs_product_group_multiple_string_criteria_t *availability,
    catalogs_product_group_multiple_string_criteria_t *brand,
    catalogs_product_group_multiple_string_criteria_t *condition,
    catalogs_product_group_multiple_string_criteria_t *custom_label_0,
    catalogs_product_group_multiple_string_criteria_t *custom_label_1,
    catalogs_product_group_multiple_string_criteria_t *custom_label_2,
    catalogs_product_group_multiple_string_criteria_t *custom_label_3,
    catalogs_product_group_multiple_string_criteria_t *custom_label_4,
    catalogs_product_group_multiple_string_criteria_t *item_group_id,
    catalogs_product_group_multiple_gender_criteria_t *gender,
    catalogs_product_group_multiple_media_types_criteria_t *media_type,
    catalogs_product_group_multiple_string_list_criteria_t *product_type_4,
    catalogs_product_group_multiple_string_list_criteria_t *product_type_3,
    catalogs_product_group_multiple_string_list_criteria_t *product_type_2,
    catalogs_product_group_multiple_string_list_criteria_t *product_type_1,
    catalogs_product_group_multiple_string_list_criteria_t *product_type_0,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_6,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_5,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_4,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_3,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_2,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_1,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_0,
    catalogs_product_group_multiple_string_criteria_t *product_group
    ) {
    catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys_local_var = malloc(sizeof(catalogs_product_group_filter_keys_t));
    if (!catalogs_product_group_filter_keys_local_var) {
        return NULL;
    }
    catalogs_product_group_filter_keys_local_var->min_price = min_price;
    catalogs_product_group_filter_keys_local_var->max_price = max_price;
    catalogs_product_group_filter_keys_local_var->currency = currency;
    catalogs_product_group_filter_keys_local_var->item_id = item_id;
    catalogs_product_group_filter_keys_local_var->availability = availability;
    catalogs_product_group_filter_keys_local_var->brand = brand;
    catalogs_product_group_filter_keys_local_var->condition = condition;
    catalogs_product_group_filter_keys_local_var->custom_label_0 = custom_label_0;
    catalogs_product_group_filter_keys_local_var->custom_label_1 = custom_label_1;
    catalogs_product_group_filter_keys_local_var->custom_label_2 = custom_label_2;
    catalogs_product_group_filter_keys_local_var->custom_label_3 = custom_label_3;
    catalogs_product_group_filter_keys_local_var->custom_label_4 = custom_label_4;
    catalogs_product_group_filter_keys_local_var->item_group_id = item_group_id;
    catalogs_product_group_filter_keys_local_var->gender = gender;
    catalogs_product_group_filter_keys_local_var->media_type = media_type;
    catalogs_product_group_filter_keys_local_var->product_type_4 = product_type_4;
    catalogs_product_group_filter_keys_local_var->product_type_3 = product_type_3;
    catalogs_product_group_filter_keys_local_var->product_type_2 = product_type_2;
    catalogs_product_group_filter_keys_local_var->product_type_1 = product_type_1;
    catalogs_product_group_filter_keys_local_var->product_type_0 = product_type_0;
    catalogs_product_group_filter_keys_local_var->google_product_category_6 = google_product_category_6;
    catalogs_product_group_filter_keys_local_var->google_product_category_5 = google_product_category_5;
    catalogs_product_group_filter_keys_local_var->google_product_category_4 = google_product_category_4;
    catalogs_product_group_filter_keys_local_var->google_product_category_3 = google_product_category_3;
    catalogs_product_group_filter_keys_local_var->google_product_category_2 = google_product_category_2;
    catalogs_product_group_filter_keys_local_var->google_product_category_1 = google_product_category_1;
    catalogs_product_group_filter_keys_local_var->google_product_category_0 = google_product_category_0;
    catalogs_product_group_filter_keys_local_var->product_group = product_group;

    return catalogs_product_group_filter_keys_local_var;
}


void catalogs_product_group_filter_keys_free(catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys) {
    if(NULL == catalogs_product_group_filter_keys){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_filter_keys->min_price) {
        object_free(catalogs_product_group_filter_keys->min_price);
        catalogs_product_group_filter_keys->min_price = NULL;
    }
    if (catalogs_product_group_filter_keys->max_price) {
        object_free(catalogs_product_group_filter_keys->max_price);
        catalogs_product_group_filter_keys->max_price = NULL;
    }
    if (catalogs_product_group_filter_keys->currency) {
        object_free(catalogs_product_group_filter_keys->currency);
        catalogs_product_group_filter_keys->currency = NULL;
    }
    if (catalogs_product_group_filter_keys->item_id) {
        object_free(catalogs_product_group_filter_keys->item_id);
        catalogs_product_group_filter_keys->item_id = NULL;
    }
    if (catalogs_product_group_filter_keys->availability) {
        object_free(catalogs_product_group_filter_keys->availability);
        catalogs_product_group_filter_keys->availability = NULL;
    }
    if (catalogs_product_group_filter_keys->brand) {
        object_free(catalogs_product_group_filter_keys->brand);
        catalogs_product_group_filter_keys->brand = NULL;
    }
    if (catalogs_product_group_filter_keys->condition) {
        object_free(catalogs_product_group_filter_keys->condition);
        catalogs_product_group_filter_keys->condition = NULL;
    }
    if (catalogs_product_group_filter_keys->custom_label_0) {
        object_free(catalogs_product_group_filter_keys->custom_label_0);
        catalogs_product_group_filter_keys->custom_label_0 = NULL;
    }
    if (catalogs_product_group_filter_keys->custom_label_1) {
        object_free(catalogs_product_group_filter_keys->custom_label_1);
        catalogs_product_group_filter_keys->custom_label_1 = NULL;
    }
    if (catalogs_product_group_filter_keys->custom_label_2) {
        object_free(catalogs_product_group_filter_keys->custom_label_2);
        catalogs_product_group_filter_keys->custom_label_2 = NULL;
    }
    if (catalogs_product_group_filter_keys->custom_label_3) {
        object_free(catalogs_product_group_filter_keys->custom_label_3);
        catalogs_product_group_filter_keys->custom_label_3 = NULL;
    }
    if (catalogs_product_group_filter_keys->custom_label_4) {
        object_free(catalogs_product_group_filter_keys->custom_label_4);
        catalogs_product_group_filter_keys->custom_label_4 = NULL;
    }
    if (catalogs_product_group_filter_keys->item_group_id) {
        object_free(catalogs_product_group_filter_keys->item_group_id);
        catalogs_product_group_filter_keys->item_group_id = NULL;
    }
    if (catalogs_product_group_filter_keys->gender) {
        object_free(catalogs_product_group_filter_keys->gender);
        catalogs_product_group_filter_keys->gender = NULL;
    }
    if (catalogs_product_group_filter_keys->media_type) {
        object_free(catalogs_product_group_filter_keys->media_type);
        catalogs_product_group_filter_keys->media_type = NULL;
    }
    if (catalogs_product_group_filter_keys->product_type_4) {
        object_free(catalogs_product_group_filter_keys->product_type_4);
        catalogs_product_group_filter_keys->product_type_4 = NULL;
    }
    if (catalogs_product_group_filter_keys->product_type_3) {
        object_free(catalogs_product_group_filter_keys->product_type_3);
        catalogs_product_group_filter_keys->product_type_3 = NULL;
    }
    if (catalogs_product_group_filter_keys->product_type_2) {
        object_free(catalogs_product_group_filter_keys->product_type_2);
        catalogs_product_group_filter_keys->product_type_2 = NULL;
    }
    if (catalogs_product_group_filter_keys->product_type_1) {
        object_free(catalogs_product_group_filter_keys->product_type_1);
        catalogs_product_group_filter_keys->product_type_1 = NULL;
    }
    if (catalogs_product_group_filter_keys->product_type_0) {
        object_free(catalogs_product_group_filter_keys->product_type_0);
        catalogs_product_group_filter_keys->product_type_0 = NULL;
    }
    if (catalogs_product_group_filter_keys->google_product_category_6) {
        object_free(catalogs_product_group_filter_keys->google_product_category_6);
        catalogs_product_group_filter_keys->google_product_category_6 = NULL;
    }
    if (catalogs_product_group_filter_keys->google_product_category_5) {
        object_free(catalogs_product_group_filter_keys->google_product_category_5);
        catalogs_product_group_filter_keys->google_product_category_5 = NULL;
    }
    if (catalogs_product_group_filter_keys->google_product_category_4) {
        object_free(catalogs_product_group_filter_keys->google_product_category_4);
        catalogs_product_group_filter_keys->google_product_category_4 = NULL;
    }
    if (catalogs_product_group_filter_keys->google_product_category_3) {
        object_free(catalogs_product_group_filter_keys->google_product_category_3);
        catalogs_product_group_filter_keys->google_product_category_3 = NULL;
    }
    if (catalogs_product_group_filter_keys->google_product_category_2) {
        object_free(catalogs_product_group_filter_keys->google_product_category_2);
        catalogs_product_group_filter_keys->google_product_category_2 = NULL;
    }
    if (catalogs_product_group_filter_keys->google_product_category_1) {
        object_free(catalogs_product_group_filter_keys->google_product_category_1);
        catalogs_product_group_filter_keys->google_product_category_1 = NULL;
    }
    if (catalogs_product_group_filter_keys->google_product_category_0) {
        object_free(catalogs_product_group_filter_keys->google_product_category_0);
        catalogs_product_group_filter_keys->google_product_category_0 = NULL;
    }
    if (catalogs_product_group_filter_keys->product_group) {
        object_free(catalogs_product_group_filter_keys->product_group);
        catalogs_product_group_filter_keys->product_group = NULL;
    }
    free(catalogs_product_group_filter_keys);
}

cJSON *catalogs_product_group_filter_keys_convertToJSON(catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_filter_keys->min_price
    if (!catalogs_product_group_filter_keys->min_price) {
        goto fail;
    }
    cJSON *min_price_object = object_convertToJSON(catalogs_product_group_filter_keys->min_price);
    if(min_price_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MIN_PRICE", min_price_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->max_price
    if (!catalogs_product_group_filter_keys->max_price) {
        goto fail;
    }
    cJSON *max_price_object = object_convertToJSON(catalogs_product_group_filter_keys->max_price);
    if(max_price_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MAX_PRICE", max_price_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->currency
    if (!catalogs_product_group_filter_keys->currency) {
        goto fail;
    }
    cJSON *currency_object = object_convertToJSON(catalogs_product_group_filter_keys->currency);
    if(currency_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CURRENCY", currency_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->item_id
    if (!catalogs_product_group_filter_keys->item_id) {
        goto fail;
    }
    cJSON *item_id_object = object_convertToJSON(catalogs_product_group_filter_keys->item_id);
    if(item_id_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ITEM_ID", item_id_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->availability
    if (!catalogs_product_group_filter_keys->availability) {
        goto fail;
    }
    cJSON *availability_object = object_convertToJSON(catalogs_product_group_filter_keys->availability);
    if(availability_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "AVAILABILITY", availability_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->brand
    if (!catalogs_product_group_filter_keys->brand) {
        goto fail;
    }
    cJSON *brand_object = object_convertToJSON(catalogs_product_group_filter_keys->brand);
    if(brand_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "BRAND", brand_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->condition
    if (!catalogs_product_group_filter_keys->condition) {
        goto fail;
    }
    cJSON *condition_object = object_convertToJSON(catalogs_product_group_filter_keys->condition);
    if(condition_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CONDITION", condition_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->custom_label_0
    if (!catalogs_product_group_filter_keys->custom_label_0) {
        goto fail;
    }
    cJSON *custom_label_0_object = object_convertToJSON(catalogs_product_group_filter_keys->custom_label_0);
    if(custom_label_0_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_0", custom_label_0_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->custom_label_1
    if (!catalogs_product_group_filter_keys->custom_label_1) {
        goto fail;
    }
    cJSON *custom_label_1_object = object_convertToJSON(catalogs_product_group_filter_keys->custom_label_1);
    if(custom_label_1_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_1", custom_label_1_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->custom_label_2
    if (!catalogs_product_group_filter_keys->custom_label_2) {
        goto fail;
    }
    cJSON *custom_label_2_object = object_convertToJSON(catalogs_product_group_filter_keys->custom_label_2);
    if(custom_label_2_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_2", custom_label_2_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->custom_label_3
    if (!catalogs_product_group_filter_keys->custom_label_3) {
        goto fail;
    }
    cJSON *custom_label_3_object = object_convertToJSON(catalogs_product_group_filter_keys->custom_label_3);
    if(custom_label_3_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_3", custom_label_3_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->custom_label_4
    if (!catalogs_product_group_filter_keys->custom_label_4) {
        goto fail;
    }
    cJSON *custom_label_4_object = object_convertToJSON(catalogs_product_group_filter_keys->custom_label_4);
    if(custom_label_4_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_4", custom_label_4_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->item_group_id
    if (!catalogs_product_group_filter_keys->item_group_id) {
        goto fail;
    }
    cJSON *item_group_id_object = object_convertToJSON(catalogs_product_group_filter_keys->item_group_id);
    if(item_group_id_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ITEM_GROUP_ID", item_group_id_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->gender
    if (!catalogs_product_group_filter_keys->gender) {
        goto fail;
    }
    cJSON *gender_object = object_convertToJSON(catalogs_product_group_filter_keys->gender);
    if(gender_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GENDER", gender_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->media_type
    if (!catalogs_product_group_filter_keys->media_type) {
        goto fail;
    }
    cJSON *media_type_object = object_convertToJSON(catalogs_product_group_filter_keys->media_type);
    if(media_type_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MEDIA_TYPE", media_type_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->product_type_4
    if (!catalogs_product_group_filter_keys->product_type_4) {
        goto fail;
    }
    cJSON *product_type_4_object = object_convertToJSON(catalogs_product_group_filter_keys->product_type_4);
    if(product_type_4_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_TYPE_4", product_type_4_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->product_type_3
    if (!catalogs_product_group_filter_keys->product_type_3) {
        goto fail;
    }
    cJSON *product_type_3_object = object_convertToJSON(catalogs_product_group_filter_keys->product_type_3);
    if(product_type_3_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_TYPE_3", product_type_3_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->product_type_2
    if (!catalogs_product_group_filter_keys->product_type_2) {
        goto fail;
    }
    cJSON *product_type_2_object = object_convertToJSON(catalogs_product_group_filter_keys->product_type_2);
    if(product_type_2_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_TYPE_2", product_type_2_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->product_type_1
    if (!catalogs_product_group_filter_keys->product_type_1) {
        goto fail;
    }
    cJSON *product_type_1_object = object_convertToJSON(catalogs_product_group_filter_keys->product_type_1);
    if(product_type_1_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_TYPE_1", product_type_1_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->product_type_0
    if (!catalogs_product_group_filter_keys->product_type_0) {
        goto fail;
    }
    cJSON *product_type_0_object = object_convertToJSON(catalogs_product_group_filter_keys->product_type_0);
    if(product_type_0_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_TYPE_0", product_type_0_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->google_product_category_6
    if (!catalogs_product_group_filter_keys->google_product_category_6) {
        goto fail;
    }
    cJSON *google_product_category_6_object = object_convertToJSON(catalogs_product_group_filter_keys->google_product_category_6);
    if(google_product_category_6_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_6", google_product_category_6_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->google_product_category_5
    if (!catalogs_product_group_filter_keys->google_product_category_5) {
        goto fail;
    }
    cJSON *google_product_category_5_object = object_convertToJSON(catalogs_product_group_filter_keys->google_product_category_5);
    if(google_product_category_5_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_5", google_product_category_5_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->google_product_category_4
    if (!catalogs_product_group_filter_keys->google_product_category_4) {
        goto fail;
    }
    cJSON *google_product_category_4_object = object_convertToJSON(catalogs_product_group_filter_keys->google_product_category_4);
    if(google_product_category_4_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_4", google_product_category_4_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->google_product_category_3
    if (!catalogs_product_group_filter_keys->google_product_category_3) {
        goto fail;
    }
    cJSON *google_product_category_3_object = object_convertToJSON(catalogs_product_group_filter_keys->google_product_category_3);
    if(google_product_category_3_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_3", google_product_category_3_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->google_product_category_2
    if (!catalogs_product_group_filter_keys->google_product_category_2) {
        goto fail;
    }
    cJSON *google_product_category_2_object = object_convertToJSON(catalogs_product_group_filter_keys->google_product_category_2);
    if(google_product_category_2_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_2", google_product_category_2_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->google_product_category_1
    if (!catalogs_product_group_filter_keys->google_product_category_1) {
        goto fail;
    }
    cJSON *google_product_category_1_object = object_convertToJSON(catalogs_product_group_filter_keys->google_product_category_1);
    if(google_product_category_1_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_1", google_product_category_1_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->google_product_category_0
    if (!catalogs_product_group_filter_keys->google_product_category_0) {
        goto fail;
    }
    cJSON *google_product_category_0_object = object_convertToJSON(catalogs_product_group_filter_keys->google_product_category_0);
    if(google_product_category_0_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_0", google_product_category_0_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_group_filter_keys->product_group
    if (!catalogs_product_group_filter_keys->product_group) {
        goto fail;
    }
    cJSON *product_group_object = object_convertToJSON(catalogs_product_group_filter_keys->product_group);
    if(product_group_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_GROUP", product_group_object);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys_parseFromJSON(cJSON *catalogs_product_group_filter_keysJSON){

    catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys_local_var = NULL;

    // catalogs_product_group_filter_keys->min_price
    cJSON *min_price = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "MIN_PRICE");
    if (!min_price) {
        goto end;
    }

    object_t *min_price_local_object = NULL;
    
    min_price_local_object = object_parseFromJSON(min_price); //object

    // catalogs_product_group_filter_keys->max_price
    cJSON *max_price = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "MAX_PRICE");
    if (!max_price) {
        goto end;
    }

    object_t *max_price_local_object = NULL;
    
    max_price_local_object = object_parseFromJSON(max_price); //object

    // catalogs_product_group_filter_keys->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "CURRENCY");
    if (!currency) {
        goto end;
    }

    object_t *currency_local_object = NULL;
    
    currency_local_object = object_parseFromJSON(currency); //object

    // catalogs_product_group_filter_keys->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "ITEM_ID");
    if (!item_id) {
        goto end;
    }

    object_t *item_id_local_object = NULL;
    
    item_id_local_object = object_parseFromJSON(item_id); //object

    // catalogs_product_group_filter_keys->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "AVAILABILITY");
    if (!availability) {
        goto end;
    }

    object_t *availability_local_object = NULL;
    
    availability_local_object = object_parseFromJSON(availability); //object

    // catalogs_product_group_filter_keys->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "BRAND");
    if (!brand) {
        goto end;
    }

    object_t *brand_local_object = NULL;
    
    brand_local_object = object_parseFromJSON(brand); //object

    // catalogs_product_group_filter_keys->condition
    cJSON *condition = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "CONDITION");
    if (!condition) {
        goto end;
    }

    object_t *condition_local_object = NULL;
    
    condition_local_object = object_parseFromJSON(condition); //object

    // catalogs_product_group_filter_keys->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "CUSTOM_LABEL_0");
    if (!custom_label_0) {
        goto end;
    }

    object_t *custom_label_0_local_object = NULL;
    
    custom_label_0_local_object = object_parseFromJSON(custom_label_0); //object

    // catalogs_product_group_filter_keys->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "CUSTOM_LABEL_1");
    if (!custom_label_1) {
        goto end;
    }

    object_t *custom_label_1_local_object = NULL;
    
    custom_label_1_local_object = object_parseFromJSON(custom_label_1); //object

    // catalogs_product_group_filter_keys->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "CUSTOM_LABEL_2");
    if (!custom_label_2) {
        goto end;
    }

    object_t *custom_label_2_local_object = NULL;
    
    custom_label_2_local_object = object_parseFromJSON(custom_label_2); //object

    // catalogs_product_group_filter_keys->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "CUSTOM_LABEL_3");
    if (!custom_label_3) {
        goto end;
    }

    object_t *custom_label_3_local_object = NULL;
    
    custom_label_3_local_object = object_parseFromJSON(custom_label_3); //object

    // catalogs_product_group_filter_keys->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "CUSTOM_LABEL_4");
    if (!custom_label_4) {
        goto end;
    }

    object_t *custom_label_4_local_object = NULL;
    
    custom_label_4_local_object = object_parseFromJSON(custom_label_4); //object

    // catalogs_product_group_filter_keys->item_group_id
    cJSON *item_group_id = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "ITEM_GROUP_ID");
    if (!item_group_id) {
        goto end;
    }

    object_t *item_group_id_local_object = NULL;
    
    item_group_id_local_object = object_parseFromJSON(item_group_id); //object

    // catalogs_product_group_filter_keys->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "GENDER");
    if (!gender) {
        goto end;
    }

    object_t *gender_local_object = NULL;
    
    gender_local_object = object_parseFromJSON(gender); //object

    // catalogs_product_group_filter_keys->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "MEDIA_TYPE");
    if (!media_type) {
        goto end;
    }

    object_t *media_type_local_object = NULL;
    
    media_type_local_object = object_parseFromJSON(media_type); //object

    // catalogs_product_group_filter_keys->product_type_4
    cJSON *product_type_4 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "PRODUCT_TYPE_4");
    if (!product_type_4) {
        goto end;
    }

    object_t *product_type_4_local_object = NULL;
    
    product_type_4_local_object = object_parseFromJSON(product_type_4); //object

    // catalogs_product_group_filter_keys->product_type_3
    cJSON *product_type_3 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "PRODUCT_TYPE_3");
    if (!product_type_3) {
        goto end;
    }

    object_t *product_type_3_local_object = NULL;
    
    product_type_3_local_object = object_parseFromJSON(product_type_3); //object

    // catalogs_product_group_filter_keys->product_type_2
    cJSON *product_type_2 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "PRODUCT_TYPE_2");
    if (!product_type_2) {
        goto end;
    }

    object_t *product_type_2_local_object = NULL;
    
    product_type_2_local_object = object_parseFromJSON(product_type_2); //object

    // catalogs_product_group_filter_keys->product_type_1
    cJSON *product_type_1 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "PRODUCT_TYPE_1");
    if (!product_type_1) {
        goto end;
    }

    object_t *product_type_1_local_object = NULL;
    
    product_type_1_local_object = object_parseFromJSON(product_type_1); //object

    // catalogs_product_group_filter_keys->product_type_0
    cJSON *product_type_0 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "PRODUCT_TYPE_0");
    if (!product_type_0) {
        goto end;
    }

    object_t *product_type_0_local_object = NULL;
    
    product_type_0_local_object = object_parseFromJSON(product_type_0); //object

    // catalogs_product_group_filter_keys->google_product_category_6
    cJSON *google_product_category_6 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_6");
    if (!google_product_category_6) {
        goto end;
    }

    object_t *google_product_category_6_local_object = NULL;
    
    google_product_category_6_local_object = object_parseFromJSON(google_product_category_6); //object

    // catalogs_product_group_filter_keys->google_product_category_5
    cJSON *google_product_category_5 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_5");
    if (!google_product_category_5) {
        goto end;
    }

    object_t *google_product_category_5_local_object = NULL;
    
    google_product_category_5_local_object = object_parseFromJSON(google_product_category_5); //object

    // catalogs_product_group_filter_keys->google_product_category_4
    cJSON *google_product_category_4 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_4");
    if (!google_product_category_4) {
        goto end;
    }

    object_t *google_product_category_4_local_object = NULL;
    
    google_product_category_4_local_object = object_parseFromJSON(google_product_category_4); //object

    // catalogs_product_group_filter_keys->google_product_category_3
    cJSON *google_product_category_3 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_3");
    if (!google_product_category_3) {
        goto end;
    }

    object_t *google_product_category_3_local_object = NULL;
    
    google_product_category_3_local_object = object_parseFromJSON(google_product_category_3); //object

    // catalogs_product_group_filter_keys->google_product_category_2
    cJSON *google_product_category_2 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_2");
    if (!google_product_category_2) {
        goto end;
    }

    object_t *google_product_category_2_local_object = NULL;
    
    google_product_category_2_local_object = object_parseFromJSON(google_product_category_2); //object

    // catalogs_product_group_filter_keys->google_product_category_1
    cJSON *google_product_category_1 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_1");
    if (!google_product_category_1) {
        goto end;
    }

    object_t *google_product_category_1_local_object = NULL;
    
    google_product_category_1_local_object = object_parseFromJSON(google_product_category_1); //object

    // catalogs_product_group_filter_keys->google_product_category_0
    cJSON *google_product_category_0 = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_0");
    if (!google_product_category_0) {
        goto end;
    }

    object_t *google_product_category_0_local_object = NULL;
    
    google_product_category_0_local_object = object_parseFromJSON(google_product_category_0); //object

    // catalogs_product_group_filter_keys->product_group
    cJSON *product_group = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_keysJSON, "PRODUCT_GROUP");
    if (!product_group) {
        goto end;
    }

    object_t *product_group_local_object = NULL;
    
    product_group_local_object = object_parseFromJSON(product_group); //object


    catalogs_product_group_filter_keys_local_var = catalogs_product_group_filter_keys_create (
        min_price_local_object,
        max_price_local_object,
        currency_local_object,
        item_id_local_object,
        availability_local_object,
        brand_local_object,
        condition_local_object,
        custom_label_0_local_object,
        custom_label_1_local_object,
        custom_label_2_local_object,
        custom_label_3_local_object,
        custom_label_4_local_object,
        item_group_id_local_object,
        gender_local_object,
        media_type_local_object,
        product_type_4_local_object,
        product_type_3_local_object,
        product_type_2_local_object,
        product_type_1_local_object,
        product_type_0_local_object,
        google_product_category_6_local_object,
        google_product_category_5_local_object,
        google_product_category_4_local_object,
        google_product_category_3_local_object,
        google_product_category_2_local_object,
        google_product_category_1_local_object,
        google_product_category_0_local_object,
        product_group_local_object
        );

    return catalogs_product_group_filter_keys_local_var;
end:
    return NULL;

}
