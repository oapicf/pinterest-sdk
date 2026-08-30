#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_analytics_items.h"



static product_group_analytics_items_t *product_group_analytics_items_create_internal(
    char *date,
    char *product_group_id
    ) {
    product_group_analytics_items_t *product_group_analytics_items_local_var = malloc(sizeof(product_group_analytics_items_t));
    if (!product_group_analytics_items_local_var) {
        return NULL;
    }
    memset(product_group_analytics_items_local_var, 0, sizeof(product_group_analytics_items_t));
    product_group_analytics_items_local_var->_library_owned = 1;
    product_group_analytics_items_local_var->date = date;
    product_group_analytics_items_local_var->product_group_id = product_group_id;
    return product_group_analytics_items_local_var;
}

__attribute__((deprecated)) product_group_analytics_items_t *product_group_analytics_items_create(
    char *date,
    char *product_group_id
    ) {
    product_group_analytics_items_t *result = product_group_analytics_items_create_internal (
        date,
        product_group_id
        );
    if (!result) {
    }
    return result;
}

void product_group_analytics_items_free(product_group_analytics_items_t *product_group_analytics_items) {
    if(NULL == product_group_analytics_items){
        return ;
    }
    if(product_group_analytics_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_group_analytics_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_group_analytics_items->date) {
        free(product_group_analytics_items->date);
        product_group_analytics_items->date = NULL;
    }
    if (product_group_analytics_items->product_group_id) {
        free(product_group_analytics_items->product_group_id);
        product_group_analytics_items->product_group_id = NULL;
    }
    free(product_group_analytics_items);
}

cJSON *product_group_analytics_items_convertToJSON(product_group_analytics_items_t *product_group_analytics_items) {
    cJSON *item = cJSON_CreateObject();

    // product_group_analytics_items->date
    if(product_group_analytics_items->date) {
    if(cJSON_AddStringToObject(item, "DATE", product_group_analytics_items->date) == NULL) {
    goto fail; //Date
    }
    }


    // product_group_analytics_items->product_group_id
    if (!product_group_analytics_items->product_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "PRODUCT_GROUP_ID", product_group_analytics_items->product_group_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

product_group_analytics_items_t *product_group_analytics_items_parseFromJSON(cJSON *product_group_analytics_itemsJSON){

    product_group_analytics_items_t *product_group_analytics_items_local_var = NULL;

    char *date_local_str = NULL;

    char *product_group_id_local_str = NULL;

    // product_group_analytics_items->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(product_group_analytics_itemsJSON, "DATE");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }

    // product_group_analytics_items->product_group_id
    cJSON *product_group_id = cJSON_GetObjectItemCaseSensitive(product_group_analytics_itemsJSON, "PRODUCT_GROUP_ID");
    if (cJSON_IsNull(product_group_id)) {
        product_group_id = NULL;
    }
    if (!product_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(product_group_id))
    {
    goto end; //String
    }


    if (date) date_local_str = strdup(date->valuestring);
    if (product_group_id && !cJSON_IsNull(product_group_id)) product_group_id_local_str = strdup(product_group_id->valuestring);

    product_group_analytics_items_local_var = product_group_analytics_items_create_internal (
        date_local_str,
        product_group_id_local_str
        );

    if (!product_group_analytics_items_local_var) {
        goto end;
    }

    return product_group_analytics_items_local_var;
end:
    if (date_local_str) {
        free(date_local_str);
        date_local_str = NULL;
    }
    if (product_group_id_local_str) {
        free(product_group_id_local_str);
        product_group_id_local_str = NULL;
    }
    return NULL;

}
