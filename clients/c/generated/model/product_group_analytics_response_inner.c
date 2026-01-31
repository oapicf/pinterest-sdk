#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_analytics_response_inner.h"



static product_group_analytics_response_inner_t *product_group_analytics_response_inner_create_internal(
    char *date,
    char *product_group_id
    ) {
    product_group_analytics_response_inner_t *product_group_analytics_response_inner_local_var = malloc(sizeof(product_group_analytics_response_inner_t));
    if (!product_group_analytics_response_inner_local_var) {
        return NULL;
    }
    product_group_analytics_response_inner_local_var->date = date;
    product_group_analytics_response_inner_local_var->product_group_id = product_group_id;

    product_group_analytics_response_inner_local_var->_library_owned = 1;
    return product_group_analytics_response_inner_local_var;
}

__attribute__((deprecated)) product_group_analytics_response_inner_t *product_group_analytics_response_inner_create(
    char *date,
    char *product_group_id
    ) {
    return product_group_analytics_response_inner_create_internal (
        date,
        product_group_id
        );
}

void product_group_analytics_response_inner_free(product_group_analytics_response_inner_t *product_group_analytics_response_inner) {
    if(NULL == product_group_analytics_response_inner){
        return ;
    }
    if(product_group_analytics_response_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_group_analytics_response_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_group_analytics_response_inner->date) {
        free(product_group_analytics_response_inner->date);
        product_group_analytics_response_inner->date = NULL;
    }
    if (product_group_analytics_response_inner->product_group_id) {
        free(product_group_analytics_response_inner->product_group_id);
        product_group_analytics_response_inner->product_group_id = NULL;
    }
    free(product_group_analytics_response_inner);
}

cJSON *product_group_analytics_response_inner_convertToJSON(product_group_analytics_response_inner_t *product_group_analytics_response_inner) {
    cJSON *item = cJSON_CreateObject();

    // product_group_analytics_response_inner->date
    if(product_group_analytics_response_inner->date) {
    if(cJSON_AddStringToObject(item, "DATE", product_group_analytics_response_inner->date) == NULL) {
    goto fail; //Date
    }
    }


    // product_group_analytics_response_inner->product_group_id
    if (!product_group_analytics_response_inner->product_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "PRODUCT_GROUP_ID", product_group_analytics_response_inner->product_group_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

product_group_analytics_response_inner_t *product_group_analytics_response_inner_parseFromJSON(cJSON *product_group_analytics_response_innerJSON){

    product_group_analytics_response_inner_t *product_group_analytics_response_inner_local_var = NULL;

    // product_group_analytics_response_inner->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(product_group_analytics_response_innerJSON, "DATE");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }

    // product_group_analytics_response_inner->product_group_id
    cJSON *product_group_id = cJSON_GetObjectItemCaseSensitive(product_group_analytics_response_innerJSON, "PRODUCT_GROUP_ID");
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


    product_group_analytics_response_inner_local_var = product_group_analytics_response_inner_create_internal (
        date ? strdup(date->valuestring) : NULL,
        strdup(product_group_id->valuestring)
        );

    return product_group_analytics_response_inner_local_var;
end:
    return NULL;

}
