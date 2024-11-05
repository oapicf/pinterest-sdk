#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_update_retail_item.h"


char* catalogs_update_retail_item_operation_ToString(pinterest_rest_api_catalogs_update_retail_item_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "UPDATE" };
    return operationArray[operation];
}

pinterest_rest_api_catalogs_update_retail_item_OPERATION_e catalogs_update_retail_item_operation_FromString(char* operation){
    int stringToReturn = 0;
    char *operationArray[] =  { "NULL", "UPDATE" };
    size_t sizeofArray = sizeof(operationArray) / sizeof(operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation, operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_update_retail_item_update_mask_ToString(pinterest_rest_api_catalogs_update_retail_item__e update_mask) {
    char *update_maskArray[] =  { "NULL", "ad_link", "adult", "age_group", "availability", "average_review_rating", "brand", "checkout_enabled", "color", "condition", "custom_label_0", "custom_label_1", "custom_label_2", "custom_label_3", "custom_label_4", "description", "free_shipping_label", "free_shipping_limit", "gender", "google_product_category", "gtin", "item_group_id", "last_updated_time", "link", "material", "min_ad_price", "mpn", "number_of_ratings", "number_of_reviews", "pattern", "price", "product_type", "sale_price", "shipping", "shipping_height", "shipping_weight", "shipping_width", "size", "size_system", "size_type", "tax", "title", "variant_names", "variant_values" };
    return update_maskArray[update_mask - 1];
}

pinterest_rest_api_catalogs_update_retail_item__e catalogs_update_retail_item_update_mask_FromString(char* update_mask) {
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

catalogs_update_retail_item_t *catalogs_update_retail_item_create(
    char *item_id,
    pinterest_rest_api_catalogs_update_retail_item_OPERATION_e operation,
    updatable_item_attributes_t *attributes,
    list_t *update_mask
    ) {
    catalogs_update_retail_item_t *catalogs_update_retail_item_local_var = malloc(sizeof(catalogs_update_retail_item_t));
    if (!catalogs_update_retail_item_local_var) {
        return NULL;
    }
    catalogs_update_retail_item_local_var->item_id = item_id;
    catalogs_update_retail_item_local_var->operation = operation;
    catalogs_update_retail_item_local_var->attributes = attributes;
    catalogs_update_retail_item_local_var->update_mask = update_mask;

    return catalogs_update_retail_item_local_var;
}


void catalogs_update_retail_item_free(catalogs_update_retail_item_t *catalogs_update_retail_item) {
    if(NULL == catalogs_update_retail_item){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_update_retail_item->item_id) {
        free(catalogs_update_retail_item->item_id);
        catalogs_update_retail_item->item_id = NULL;
    }
    if (catalogs_update_retail_item->attributes) {
        updatable_item_attributes_free(catalogs_update_retail_item->attributes);
        catalogs_update_retail_item->attributes = NULL;
    }
    if (catalogs_update_retail_item->update_mask) {
        list_ForEach(listEntry, catalogs_update_retail_item->update_mask) {
            update_mask_field_type_free(listEntry->data);
        }
        list_freeList(catalogs_update_retail_item->update_mask);
        catalogs_update_retail_item->update_mask = NULL;
    }
    free(catalogs_update_retail_item);
}

cJSON *catalogs_update_retail_item_convertToJSON(catalogs_update_retail_item_t *catalogs_update_retail_item) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_update_retail_item->item_id
    if (!catalogs_update_retail_item->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", catalogs_update_retail_item->item_id) == NULL) {
    goto fail; //String
    }


    // catalogs_update_retail_item->operation
    if (pinterest_rest_api_catalogs_update_retail_item_OPERATION_NULL == catalogs_update_retail_item->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", operationcatalogs_update_retail_item_ToString(catalogs_update_retail_item->operation)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_update_retail_item->attributes
    if (!catalogs_update_retail_item->attributes) {
        goto fail;
    }
    cJSON *attributes_local_JSON = updatable_item_attributes_convertToJSON(catalogs_update_retail_item->attributes);
    if(attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attributes", attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_update_retail_item->update_mask
    if(catalogs_update_retail_item->update_mask != pinterest_rest_api_catalogs_update_retail_item_UPDATEMASK_NULL) {
    cJSON *update_mask = cJSON_AddArrayToObject(item, "update_mask");
    if(update_mask == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *update_maskListEntry;
    if (catalogs_update_retail_item->update_mask) {
    list_ForEach(update_maskListEntry, catalogs_update_retail_item->update_mask) {
    cJSON *itemLocal = update_mask_field_type_convertToJSON((pinterest_rest_api_catalogs_update_retail_item__e)update_maskListEntry->data);
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

catalogs_update_retail_item_t *catalogs_update_retail_item_parseFromJSON(cJSON *catalogs_update_retail_itemJSON){

    catalogs_update_retail_item_t *catalogs_update_retail_item_local_var = NULL;

    // define the local variable for catalogs_update_retail_item->attributes
    updatable_item_attributes_t *attributes_local_nonprim = NULL;

    // define the local list for catalogs_update_retail_item->update_mask
    list_t *update_maskList = NULL;

    // catalogs_update_retail_item->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(catalogs_update_retail_itemJSON, "item_id");
    if (!item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_id))
    {
    goto end; //String
    }

    // catalogs_update_retail_item->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(catalogs_update_retail_itemJSON, "operation");
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_catalogs_update_retail_item_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = catalogs_update_retail_item_operation_FromString(operation->valuestring);

    // catalogs_update_retail_item->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(catalogs_update_retail_itemJSON, "attributes");
    if (!attributes) {
        goto end;
    }

    
    attributes_local_nonprim = updatable_item_attributes_parseFromJSON(attributes); //nonprimitive

    // catalogs_update_retail_item->update_mask
    cJSON *update_mask = cJSON_GetObjectItemCaseSensitive(catalogs_update_retail_itemJSON, "update_mask");
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
        catalogs_update_retail_item_update_mask_field_type_e update_maskItem = update_mask_field_type_parseFromJSON(update_mask_local_nonprimitive);

        list_addElement(update_maskList, (void *)update_maskItem);
    }
    }


    catalogs_update_retail_item_local_var = catalogs_update_retail_item_create (
        strdup(item_id->valuestring),
        operationVariable,
        attributes_local_nonprim,
        update_mask ? update_maskList : NULL
        );

    return catalogs_update_retail_item_local_var;
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
