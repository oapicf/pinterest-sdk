#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_batch_request_items_inner.h"


char* catalogs_retail_batch_request_items_inner_operation_ToString(pinterest_rest_api_catalogs_retail_batch_request_items_inner_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "DELETE" };
    return operationArray[operation];
}

pinterest_rest_api_catalogs_retail_batch_request_items_inner_OPERATION_e catalogs_retail_batch_request_items_inner_operation_FromString(char* operation){
    int stringToReturn = 0;
    char *operationArray[] =  { "NULL", "DELETE" };
    size_t sizeofArray = sizeof(operationArray) / sizeof(operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation, operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_retail_batch_request_items_inner_update_mask_ToString(pinterest_rest_api_catalogs_retail_batch_request_items_inner__e update_mask) {
    char *update_maskArray[] =  { "NULL", "ad_link", "adult", "age_group", "availability", "average_review_rating", "brand", "checkout_enabled", "color", "condition", "custom_label_0", "custom_label_1", "custom_label_2", "custom_label_3", "custom_label_4", "description", "free_shipping_label", "free_shipping_limit", "gender", "google_product_category", "gtin", "item_group_id", "last_updated_time", "link", "material", "min_ad_price", "mpn", "number_of_ratings", "number_of_reviews", "pattern", "price", "product_type", "sale_price", "shipping", "shipping_height", "shipping_weight", "shipping_width", "size", "size_system", "size_type", "tax", "title", "variant_names", "variant_values" };
    return update_maskArray[update_mask - 1];
}

pinterest_rest_api_catalogs_retail_batch_request_items_inner__e catalogs_retail_batch_request_items_inner_update_mask_FromString(char* update_mask) {
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

catalogs_retail_batch_request_items_inner_t *catalogs_retail_batch_request_items_inner_create(
    char *item_id,
    pinterest_rest_api_catalogs_retail_batch_request_items_inner_OPERATION_e operation,
    item_attributes_request_t *attributes,
    list_t *update_mask
    ) {
    catalogs_retail_batch_request_items_inner_t *catalogs_retail_batch_request_items_inner_local_var = malloc(sizeof(catalogs_retail_batch_request_items_inner_t));
    if (!catalogs_retail_batch_request_items_inner_local_var) {
        return NULL;
    }
    catalogs_retail_batch_request_items_inner_local_var->item_id = item_id;
    catalogs_retail_batch_request_items_inner_local_var->operation = operation;
    catalogs_retail_batch_request_items_inner_local_var->attributes = attributes;
    catalogs_retail_batch_request_items_inner_local_var->update_mask = update_mask;

    return catalogs_retail_batch_request_items_inner_local_var;
}


void catalogs_retail_batch_request_items_inner_free(catalogs_retail_batch_request_items_inner_t *catalogs_retail_batch_request_items_inner) {
    if(NULL == catalogs_retail_batch_request_items_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_batch_request_items_inner->item_id) {
        free(catalogs_retail_batch_request_items_inner->item_id);
        catalogs_retail_batch_request_items_inner->item_id = NULL;
    }
    if (catalogs_retail_batch_request_items_inner->attributes) {
        item_attributes_request_free(catalogs_retail_batch_request_items_inner->attributes);
        catalogs_retail_batch_request_items_inner->attributes = NULL;
    }
    if (catalogs_retail_batch_request_items_inner->update_mask) {
        list_ForEach(listEntry, catalogs_retail_batch_request_items_inner->update_mask) {
            update_mask_field_type_free(listEntry->data);
        }
        list_freeList(catalogs_retail_batch_request_items_inner->update_mask);
        catalogs_retail_batch_request_items_inner->update_mask = NULL;
    }
    free(catalogs_retail_batch_request_items_inner);
}

cJSON *catalogs_retail_batch_request_items_inner_convertToJSON(catalogs_retail_batch_request_items_inner_t *catalogs_retail_batch_request_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_batch_request_items_inner->item_id
    if (!catalogs_retail_batch_request_items_inner->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", catalogs_retail_batch_request_items_inner->item_id) == NULL) {
    goto fail; //String
    }


    // catalogs_retail_batch_request_items_inner->operation
    if (pinterest_rest_api_catalogs_retail_batch_request_items_inner_OPERATION_NULL == catalogs_retail_batch_request_items_inner->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", operationcatalogs_retail_batch_request_items_inner_ToString(catalogs_retail_batch_request_items_inner->operation)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_retail_batch_request_items_inner->attributes
    if (!catalogs_retail_batch_request_items_inner->attributes) {
        goto fail;
    }
    cJSON *attributes_local_JSON = item_attributes_request_convertToJSON(catalogs_retail_batch_request_items_inner->attributes);
    if(attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attributes", attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_retail_batch_request_items_inner->update_mask
    if(catalogs_retail_batch_request_items_inner->update_mask != pinterest_rest_api_catalogs_retail_batch_request_items_inner_UPDATEMASK_NULL) {
    cJSON *update_mask = cJSON_AddArrayToObject(item, "update_mask");
    if(update_mask == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *update_maskListEntry;
    if (catalogs_retail_batch_request_items_inner->update_mask) {
    list_ForEach(update_maskListEntry, catalogs_retail_batch_request_items_inner->update_mask) {
    cJSON *itemLocal = update_mask_field_type_convertToJSON((pinterest_rest_api_catalogs_retail_batch_request_items_inner__e)update_maskListEntry->data);
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

catalogs_retail_batch_request_items_inner_t *catalogs_retail_batch_request_items_inner_parseFromJSON(cJSON *catalogs_retail_batch_request_items_innerJSON){

    catalogs_retail_batch_request_items_inner_t *catalogs_retail_batch_request_items_inner_local_var = NULL;

    // define the local variable for catalogs_retail_batch_request_items_inner->attributes
    item_attributes_request_t *attributes_local_nonprim = NULL;

    // define the local list for catalogs_retail_batch_request_items_inner->update_mask
    list_t *update_maskList = NULL;

    // catalogs_retail_batch_request_items_inner->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_batch_request_items_innerJSON, "item_id");
    if (!item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_id))
    {
    goto end; //String
    }

    // catalogs_retail_batch_request_items_inner->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(catalogs_retail_batch_request_items_innerJSON, "operation");
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_batch_request_items_inner_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = catalogs_retail_batch_request_items_inner_operation_FromString(operation->valuestring);

    // catalogs_retail_batch_request_items_inner->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(catalogs_retail_batch_request_items_innerJSON, "attributes");
    if (!attributes) {
        goto end;
    }

    
    attributes_local_nonprim = item_attributes_request_parseFromJSON(attributes); //nonprimitive

    // catalogs_retail_batch_request_items_inner->update_mask
    cJSON *update_mask = cJSON_GetObjectItemCaseSensitive(catalogs_retail_batch_request_items_innerJSON, "update_mask");
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
        catalogs_retail_batch_request_items_inner_update_mask_field_type_e update_maskItem = update_mask_field_type_parseFromJSON(update_mask_local_nonprimitive);

        list_addElement(update_maskList, (void *)update_maskItem);
    }
    }


    catalogs_retail_batch_request_items_inner_local_var = catalogs_retail_batch_request_items_inner_create (
        strdup(item_id->valuestring),
        operationVariable,
        attributes_local_nonprim,
        update_mask ? update_maskList : NULL
        );

    return catalogs_retail_batch_request_items_inner_local_var;
end:
    if (attributes_local_nonprim) {
        item_attributes_request_free(attributes_local_nonprim);
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
