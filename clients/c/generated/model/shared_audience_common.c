#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shared_audience_common.h"



static shared_audience_common_t *shared_audience_common_create_internal(
    char *audience_id,
    pinterest_rest_api_operation_type__e operation_type
    ) {
    shared_audience_common_t *shared_audience_common_local_var = malloc(sizeof(shared_audience_common_t));
    if (!shared_audience_common_local_var) {
        return NULL;
    }
    shared_audience_common_local_var->audience_id = audience_id;
    shared_audience_common_local_var->operation_type = operation_type;

    shared_audience_common_local_var->_library_owned = 1;
    return shared_audience_common_local_var;
}

__attribute__((deprecated)) shared_audience_common_t *shared_audience_common_create(
    char *audience_id,
    pinterest_rest_api_operation_type__e operation_type
    ) {
    return shared_audience_common_create_internal (
        audience_id,
        operation_type
        );
}

void shared_audience_common_free(shared_audience_common_t *shared_audience_common) {
    if(NULL == shared_audience_common){
        return ;
    }
    if(shared_audience_common->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "shared_audience_common_free");
        return ;
    }
    listEntry_t *listEntry;
    if (shared_audience_common->audience_id) {
        free(shared_audience_common->audience_id);
        shared_audience_common->audience_id = NULL;
    }
    free(shared_audience_common);
}

cJSON *shared_audience_common_convertToJSON(shared_audience_common_t *shared_audience_common) {
    cJSON *item = cJSON_CreateObject();

    // shared_audience_common->audience_id
    if(shared_audience_common->audience_id) {
    if(cJSON_AddStringToObject(item, "audience_id", shared_audience_common->audience_id) == NULL) {
    goto fail; //String
    }
    }


    // shared_audience_common->operation_type
    if(shared_audience_common->operation_type != pinterest_rest_api_operation_type__NULL) {
    cJSON *operation_type_local_JSON = operation_type_convertToJSON(shared_audience_common->operation_type);
    if(operation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation_type", operation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

shared_audience_common_t *shared_audience_common_parseFromJSON(cJSON *shared_audience_commonJSON){

    shared_audience_common_t *shared_audience_common_local_var = NULL;

    // define the local variable for shared_audience_common->operation_type
    pinterest_rest_api_operation_type__e operation_type_local_nonprim = 0;

    // shared_audience_common->audience_id
    cJSON *audience_id = cJSON_GetObjectItemCaseSensitive(shared_audience_commonJSON, "audience_id");
    if (cJSON_IsNull(audience_id)) {
        audience_id = NULL;
    }
    if (audience_id) { 
    if(!cJSON_IsString(audience_id) && !cJSON_IsNull(audience_id))
    {
    goto end; //String
    }
    }

    // shared_audience_common->operation_type
    cJSON *operation_type = cJSON_GetObjectItemCaseSensitive(shared_audience_commonJSON, "operation_type");
    if (cJSON_IsNull(operation_type)) {
        operation_type = NULL;
    }
    if (operation_type) { 
    operation_type_local_nonprim = operation_type_parseFromJSON(operation_type); //custom
    }


    shared_audience_common_local_var = shared_audience_common_create_internal (
        audience_id && !cJSON_IsNull(audience_id) ? strdup(audience_id->valuestring) : NULL,
        operation_type ? operation_type_local_nonprim : 0
        );

    return shared_audience_common_local_var;
end:
    if (operation_type_local_nonprim) {
        operation_type_local_nonprim = 0;
    }
    return NULL;

}
