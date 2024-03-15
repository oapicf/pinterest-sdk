#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_update_batch_record.h"


char* item_update_batch_record_update_mask_ToString(pinterest_rest_api_item_update_batch_record__e update_mask) {
    char *update_maskArray[] =  { "NULL", "ad_link", "adult", "age_group", "availability", "average_review_rating", "brand", "checkout_enabled", "color", "condition", "custom_label_0", "custom_label_1", "custom_label_2", "custom_label_3", "custom_label_4", "description", "free_shipping_label", "free_shipping_limit", "gender", "google_product_category", "gtin", "item_group_id", "last_updated_time", "link", "material", "min_ad_price", "mpn", "number_of_ratings", "number_of_reviews", "pattern", "price", "product_type", "sale_price", "shipping", "shipping_height", "shipping_weight", "shipping_width", "size", "size_system", "size_type", "tax", "title", "variant_names", "variant_values" };
    return update_maskArray[update_mask - 1];
}

pinterest_rest_api_item_update_batch_record__e item_update_batch_record_update_mask_FromString(char* update_mask) {
    int stringToReturn = 0;
    char *update_maskArray[] =  { "NULL", "ad_link", "adult", "age_group", "availability", "average_review_rating", "brand", "checkout_enabled", "color", "condition", "custom_label_0", "custom_label_1", "custom_label_2", "custom_label_3", "custom_label_4", "description", "free_shipping_label", "free_shipping_limit", "gender", "google_product_category", "gtin", "item_group_id", "last_updated_time", "link", "material", "min_ad_price", "mpn", "number_of_ratings", "number_of_reviews", "pattern", "price", "product_type", "sale_price", "shipping", "shipping_height", "shipping_weight", "shipping_width", "size", "size_system", "size_type", "tax", "title", "variant_names", "variant_values" };
    size_t sizeofArray = sizeof(update_maskArray) / sizeof(update_maskArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(update_mask, update_maskArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

item_update_batch_record_t *item_update_batch_record_create(
    char *item_id,
    updatable_item_attributes_t *attributes,
    list_t *update_mask
    ) {
    item_update_batch_record_t *item_update_batch_record_local_var = malloc(sizeof(item_update_batch_record_t));
    if (!item_update_batch_record_local_var) {
        return NULL;
    }
    item_update_batch_record_local_var->item_id = item_id;
    item_update_batch_record_local_var->attributes = attributes;
    item_update_batch_record_local_var->update_mask = update_mask;

    return item_update_batch_record_local_var;
}


void item_update_batch_record_free(item_update_batch_record_t *item_update_batch_record) {
    if(NULL == item_update_batch_record){
        return ;
    }
    listEntry_t *listEntry;
    if (item_update_batch_record->item_id) {
        free(item_update_batch_record->item_id);
        item_update_batch_record->item_id = NULL;
    }
    if (item_update_batch_record->attributes) {
        updatable_item_attributes_free(item_update_batch_record->attributes);
        item_update_batch_record->attributes = NULL;
    }
    if (item_update_batch_record->update_mask) {
        list_ForEach(listEntry, item_update_batch_record->update_mask) {
            update_mask_field_type_free(listEntry->data);
        }
        list_freeList(item_update_batch_record->update_mask);
        item_update_batch_record->update_mask = NULL;
    }
    free(item_update_batch_record);
}

cJSON *item_update_batch_record_convertToJSON(item_update_batch_record_t *item_update_batch_record) {
    cJSON *item = cJSON_CreateObject();

    // item_update_batch_record->item_id
    if(item_update_batch_record->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", item_update_batch_record->item_id) == NULL) {
    goto fail; //String
    }
    }


    // item_update_batch_record->attributes
    if(item_update_batch_record->attributes) {
    cJSON *attributes_local_JSON = updatable_item_attributes_convertToJSON(item_update_batch_record->attributes);
    if(attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attributes", attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // item_update_batch_record->update_mask
    if(item_update_batch_record->update_mask != pinterest_rest_api_item_update_batch_record_UPDATEMASK_NULL) {
    cJSON *update_mask = cJSON_AddArrayToObject(item, "update_mask");
    if(update_mask == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *update_maskListEntry;
    if (item_update_batch_record->update_mask) {
    list_ForEach(update_maskListEntry, item_update_batch_record->update_mask) {
    cJSON *itemLocal = update_mask_field_type_convertToJSON((pinterest_rest_api_item_update_batch_record__e)update_maskListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(update_mask, itemLocal);
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

item_update_batch_record_t *item_update_batch_record_parseFromJSON(cJSON *item_update_batch_recordJSON){

    item_update_batch_record_t *item_update_batch_record_local_var = NULL;

    // define the local variable for item_update_batch_record->attributes
    updatable_item_attributes_t *attributes_local_nonprim = NULL;

    // define the local list for item_update_batch_record->update_mask
    list_t *update_maskList = NULL;

    // item_update_batch_record->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(item_update_batch_recordJSON, "item_id");
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }

    // item_update_batch_record->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(item_update_batch_recordJSON, "attributes");
    if (attributes) { 
    attributes_local_nonprim = updatable_item_attributes_parseFromJSON(attributes); //nonprimitive
    }

    // item_update_batch_record->update_mask
    cJSON *update_mask = cJSON_GetObjectItemCaseSensitive(item_update_batch_recordJSON, "update_mask");
    if (update_mask) { 
    cJSON *update_mask_local_nonprimitive = NULL;
    if(!cJSON_IsArray(update_mask)){
        goto end; //nonprimitive container
    }

    update_maskList = list_createList();

    cJSON_ArrayForEach(update_mask_local_nonprimitive,update_mask )
    {
        if(!cJSON_IsObject(update_mask_local_nonprimitive)){
            goto end;
        }
        item_update_batch_record_update_mask_field_type_e update_maskItem = update_mask_field_type_parseFromJSON(update_mask_local_nonprimitive);

        list_addElement(update_maskList, (void *)update_maskItem);
    }
    }


    item_update_batch_record_local_var = item_update_batch_record_create (
        item_id && !cJSON_IsNull(item_id) ? strdup(item_id->valuestring) : NULL,
        attributes ? attributes_local_nonprim : NULL,
        update_mask ? update_maskList : NULL
        );

    return item_update_batch_record_local_var;
end:
    if (attributes_local_nonprim) {
        updatable_item_attributes_free(attributes_local_nonprim);
        attributes_local_nonprim = NULL;
    }
    if (update_maskList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, update_maskList) {
            update_mask_field_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(update_maskList);
        update_maskList = NULL;
    }
    return NULL;

}
