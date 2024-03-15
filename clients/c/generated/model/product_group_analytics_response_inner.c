#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_analytics_response_inner.h"



product_group_analytics_response_inner_t *product_group_analytics_response_inner_create(
    char *product_group_id,
    char *date
    ) {
    product_group_analytics_response_inner_t *product_group_analytics_response_inner_local_var = malloc(sizeof(product_group_analytics_response_inner_t));
    if (!product_group_analytics_response_inner_local_var) {
        return NULL;
    }
    product_group_analytics_response_inner_local_var->product_group_id = product_group_id;
    product_group_analytics_response_inner_local_var->date = date;

    return product_group_analytics_response_inner_local_var;
}


void product_group_analytics_response_inner_free(product_group_analytics_response_inner_t *product_group_analytics_response_inner) {
    if(NULL == product_group_analytics_response_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (product_group_analytics_response_inner->product_group_id) {
        free(product_group_analytics_response_inner->product_group_id);
        product_group_analytics_response_inner->product_group_id = NULL;
    }
    if (product_group_analytics_response_inner->date) {
        free(product_group_analytics_response_inner->date);
        product_group_analytics_response_inner->date = NULL;
    }
    free(product_group_analytics_response_inner);
}

cJSON *product_group_analytics_response_inner_convertToJSON(product_group_analytics_response_inner_t *product_group_analytics_response_inner) {
    cJSON *item = cJSON_CreateObject();

    // product_group_analytics_response_inner->product_group_id
    if (!product_group_analytics_response_inner->product_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "PRODUCT_GROUP_ID", product_group_analytics_response_inner->product_group_id) == NULL) {
    goto fail; //String
    }


    // product_group_analytics_response_inner->date
    if(product_group_analytics_response_inner->date) {
    if(cJSON_AddStringToObject(item, "DATE", product_group_analytics_response_inner->date) == NULL) {
    goto fail; //Date
    }
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

    // product_group_analytics_response_inner->product_group_id
    cJSON *product_group_id = cJSON_GetObjectItemCaseSensitive(product_group_analytics_response_innerJSON, "PRODUCT_GROUP_ID");
    if (!product_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(product_group_id))
    {
    goto end; //String
    }

    // product_group_analytics_response_inner->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(product_group_analytics_response_innerJSON, "DATE");
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    product_group_analytics_response_inner_local_var = product_group_analytics_response_inner_create (
        strdup(product_group_id->valuestring),
        date ? strdup(date->valuestring) : NULL
        );

    return product_group_analytics_response_inner_local_var;
end:
    return NULL;

}
