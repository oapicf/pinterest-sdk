#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "metrics_response_data_items.h"



static metrics_response_data_items_t *metrics_response_data_items_create_internal(
    object_t *metrics,
    char *targeting_type,
    char *targeting_value
    ) {
    metrics_response_data_items_t *metrics_response_data_items_local_var = malloc(sizeof(metrics_response_data_items_t));
    if (!metrics_response_data_items_local_var) {
        return NULL;
    }
    memset(metrics_response_data_items_local_var, 0, sizeof(metrics_response_data_items_t));
    metrics_response_data_items_local_var->_library_owned = 1;
    metrics_response_data_items_local_var->metrics = metrics;
    metrics_response_data_items_local_var->targeting_type = targeting_type;
    metrics_response_data_items_local_var->targeting_value = targeting_value;
    return metrics_response_data_items_local_var;
}

__attribute__((deprecated)) metrics_response_data_items_t *metrics_response_data_items_create(
    object_t *metrics,
    char *targeting_type,
    char *targeting_value
    ) {
    metrics_response_data_items_t *result = metrics_response_data_items_create_internal (
        metrics,
        targeting_type,
        targeting_value
        );
    if (!result) {
    }
    return result;
}

void metrics_response_data_items_free(metrics_response_data_items_t *metrics_response_data_items) {
    if(NULL == metrics_response_data_items){
        return ;
    }
    if(metrics_response_data_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "metrics_response_data_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (metrics_response_data_items->metrics) {
        object_free(metrics_response_data_items->metrics);
        metrics_response_data_items->metrics = NULL;
    }
    if (metrics_response_data_items->targeting_type) {
        free(metrics_response_data_items->targeting_type);
        metrics_response_data_items->targeting_type = NULL;
    }
    if (metrics_response_data_items->targeting_value) {
        free(metrics_response_data_items->targeting_value);
        metrics_response_data_items->targeting_value = NULL;
    }
    free(metrics_response_data_items);
}

cJSON *metrics_response_data_items_convertToJSON(metrics_response_data_items_t *metrics_response_data_items) {
    cJSON *item = cJSON_CreateObject();

    // metrics_response_data_items->metrics
    if (!metrics_response_data_items->metrics) {
        goto fail;
    }
    cJSON *metrics_object = object_convertToJSON(metrics_response_data_items->metrics);
    if(metrics_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metrics", metrics_object);
    if(item->child == NULL) {
    goto fail;
    }


    // metrics_response_data_items->targeting_type
    if (!metrics_response_data_items->targeting_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "targeting_type", metrics_response_data_items->targeting_type) == NULL) {
    goto fail; //String
    }


    // metrics_response_data_items->targeting_value
    if (!metrics_response_data_items->targeting_value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "targeting_value", metrics_response_data_items->targeting_value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

metrics_response_data_items_t *metrics_response_data_items_parseFromJSON(cJSON *metrics_response_data_itemsJSON){

    metrics_response_data_items_t *metrics_response_data_items_local_var = NULL;

    char *targeting_type_local_str = NULL;

    char *targeting_value_local_str = NULL;

    // metrics_response_data_items->metrics
    cJSON *metrics = cJSON_GetObjectItemCaseSensitive(metrics_response_data_itemsJSON, "metrics");
    if (cJSON_IsNull(metrics)) {
        metrics = NULL;
    }
    if (!metrics) {
        goto end;
    }

    object_t *metrics_local_object = NULL;
    
    metrics_local_object = object_parseFromJSON(metrics); //object

    // metrics_response_data_items->targeting_type
    cJSON *targeting_type = cJSON_GetObjectItemCaseSensitive(metrics_response_data_itemsJSON, "targeting_type");
    if (cJSON_IsNull(targeting_type)) {
        targeting_type = NULL;
    }
    if (!targeting_type) {
        goto end;
    }

    
    if(!cJSON_IsString(targeting_type))
    {
    goto end; //String
    }

    // metrics_response_data_items->targeting_value
    cJSON *targeting_value = cJSON_GetObjectItemCaseSensitive(metrics_response_data_itemsJSON, "targeting_value");
    if (cJSON_IsNull(targeting_value)) {
        targeting_value = NULL;
    }
    if (!targeting_value) {
        goto end;
    }

    
    if(!cJSON_IsString(targeting_value))
    {
    goto end; //String
    }


    if (targeting_type && !cJSON_IsNull(targeting_type)) targeting_type_local_str = strdup(targeting_type->valuestring);
    if (targeting_value && !cJSON_IsNull(targeting_value)) targeting_value_local_str = strdup(targeting_value->valuestring);

    metrics_response_data_items_local_var = metrics_response_data_items_create_internal (
        metrics_local_object,
        targeting_type_local_str,
        targeting_value_local_str
        );

    if (!metrics_response_data_items_local_var) {
        goto end;
    }

    return metrics_response_data_items_local_var;
end:
    if (targeting_type_local_str) {
        free(targeting_type_local_str);
        targeting_type_local_str = NULL;
    }
    if (targeting_value_local_str) {
        free(targeting_value_local_str);
        targeting_value_local_str = NULL;
    }
    return NULL;

}
