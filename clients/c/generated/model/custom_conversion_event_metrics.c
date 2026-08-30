#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "custom_conversion_event_metrics.h"



static custom_conversion_event_metrics_t *custom_conversion_event_metrics_create_internal(
    pinterest_rest_api_ade_column_type__e custom_event_metrics_type,
    char *custom_event_name
    ) {
    custom_conversion_event_metrics_t *custom_conversion_event_metrics_local_var = malloc(sizeof(custom_conversion_event_metrics_t));
    if (!custom_conversion_event_metrics_local_var) {
        return NULL;
    }
    memset(custom_conversion_event_metrics_local_var, 0, sizeof(custom_conversion_event_metrics_t));
    custom_conversion_event_metrics_local_var->_library_owned = 1;
    custom_conversion_event_metrics_local_var->custom_event_metrics_type = custom_event_metrics_type;
    custom_conversion_event_metrics_local_var->custom_event_name = custom_event_name;
    return custom_conversion_event_metrics_local_var;
}

__attribute__((deprecated)) custom_conversion_event_metrics_t *custom_conversion_event_metrics_create(
    pinterest_rest_api_ade_column_type__e custom_event_metrics_type,
    char *custom_event_name
    ) {
    custom_conversion_event_metrics_t *result = custom_conversion_event_metrics_create_internal (
        custom_event_metrics_type,
        custom_event_name
        );
    if (!result) {
    }
    return result;
}

void custom_conversion_event_metrics_free(custom_conversion_event_metrics_t *custom_conversion_event_metrics) {
    if(NULL == custom_conversion_event_metrics){
        return ;
    }
    if(custom_conversion_event_metrics->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "custom_conversion_event_metrics_free");
        return ;
    }
    listEntry_t *listEntry;
    if (custom_conversion_event_metrics->custom_event_name) {
        free(custom_conversion_event_metrics->custom_event_name);
        custom_conversion_event_metrics->custom_event_name = NULL;
    }
    free(custom_conversion_event_metrics);
}

cJSON *custom_conversion_event_metrics_convertToJSON(custom_conversion_event_metrics_t *custom_conversion_event_metrics) {
    cJSON *item = cJSON_CreateObject();

    // custom_conversion_event_metrics->custom_event_metrics_type
    if (pinterest_rest_api_ade_column_type__NULL == custom_conversion_event_metrics->custom_event_metrics_type) {
        goto fail;
    }
    cJSON *custom_event_metrics_type_local_JSON = ade_column_type_convertToJSON(custom_conversion_event_metrics->custom_event_metrics_type);
    if(custom_event_metrics_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "custom_event_metrics_type", custom_event_metrics_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // custom_conversion_event_metrics->custom_event_name
    if (!custom_conversion_event_metrics->custom_event_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "custom_event_name", custom_conversion_event_metrics->custom_event_name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

custom_conversion_event_metrics_t *custom_conversion_event_metrics_parseFromJSON(cJSON *custom_conversion_event_metricsJSON){

    custom_conversion_event_metrics_t *custom_conversion_event_metrics_local_var = NULL;

    // define the local variable for custom_conversion_event_metrics->custom_event_metrics_type
    pinterest_rest_api_ade_column_type__e custom_event_metrics_type_local_nonprim = 0;

    char *custom_event_name_local_str = NULL;

    // custom_conversion_event_metrics->custom_event_metrics_type
    cJSON *custom_event_metrics_type = cJSON_GetObjectItemCaseSensitive(custom_conversion_event_metricsJSON, "custom_event_metrics_type");
    if (cJSON_IsNull(custom_event_metrics_type)) {
        custom_event_metrics_type = NULL;
    }
    if (!custom_event_metrics_type) {
        goto end;
    }

    
    custom_event_metrics_type_local_nonprim = ade_column_type_parseFromJSON(custom_event_metrics_type); //custom

    // custom_conversion_event_metrics->custom_event_name
    cJSON *custom_event_name = cJSON_GetObjectItemCaseSensitive(custom_conversion_event_metricsJSON, "custom_event_name");
    if (cJSON_IsNull(custom_event_name)) {
        custom_event_name = NULL;
    }
    if (!custom_event_name) {
        goto end;
    }

    
    if(!cJSON_IsString(custom_event_name))
    {
    goto end; //String
    }


    if (custom_event_name && !cJSON_IsNull(custom_event_name)) custom_event_name_local_str = strdup(custom_event_name->valuestring);

    custom_conversion_event_metrics_local_var = custom_conversion_event_metrics_create_internal (
        custom_event_metrics_type_local_nonprim,
        custom_event_name_local_str
        );

    if (!custom_conversion_event_metrics_local_var) {
        goto end;
    }

    return custom_conversion_event_metrics_local_var;
end:
    if (custom_event_metrics_type_local_nonprim) {
        custom_event_metrics_type_local_nonprim = 0;
    }
    if (custom_event_name_local_str) {
        free(custom_event_name_local_str);
        custom_event_name_local_str = NULL;
    }
    return NULL;

}
