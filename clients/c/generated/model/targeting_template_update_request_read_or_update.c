#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_template_update_request_read_or_update.h"



static targeting_template_update_request_read_or_update_t *targeting_template_update_request_read_or_update_create_internal(
    char *id,
    pinterest_rest_api_audience_update_operation_type__e operation_type,
    targeting_spec_optimal_t *targeting_attributes
    ) {
    targeting_template_update_request_read_or_update_t *targeting_template_update_request_read_or_update_local_var = malloc(sizeof(targeting_template_update_request_read_or_update_t));
    if (!targeting_template_update_request_read_or_update_local_var) {
        return NULL;
    }
    memset(targeting_template_update_request_read_or_update_local_var, 0, sizeof(targeting_template_update_request_read_or_update_t));
    targeting_template_update_request_read_or_update_local_var->_library_owned = 1;
    targeting_template_update_request_read_or_update_local_var->id = id;
    targeting_template_update_request_read_or_update_local_var->operation_type = operation_type;
    targeting_template_update_request_read_or_update_local_var->targeting_attributes = targeting_attributes;
    return targeting_template_update_request_read_or_update_local_var;
}

__attribute__((deprecated)) targeting_template_update_request_read_or_update_t *targeting_template_update_request_read_or_update_create(
    char *id,
    pinterest_rest_api_audience_update_operation_type__e operation_type,
    targeting_spec_optimal_t *targeting_attributes
    ) {
    targeting_template_update_request_read_or_update_t *result = targeting_template_update_request_read_or_update_create_internal (
        id,
        operation_type,
        targeting_attributes
        );
    if (!result) {
    }
    return result;
}

void targeting_template_update_request_read_or_update_free(targeting_template_update_request_read_or_update_t *targeting_template_update_request_read_or_update) {
    if(NULL == targeting_template_update_request_read_or_update){
        return ;
    }
    if(targeting_template_update_request_read_or_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_template_update_request_read_or_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_template_update_request_read_or_update->id) {
        free(targeting_template_update_request_read_or_update->id);
        targeting_template_update_request_read_or_update->id = NULL;
    }
    if (targeting_template_update_request_read_or_update->targeting_attributes) {
        targeting_spec_optimal_free(targeting_template_update_request_read_or_update->targeting_attributes);
        targeting_template_update_request_read_or_update->targeting_attributes = NULL;
    }
    free(targeting_template_update_request_read_or_update);
}

cJSON *targeting_template_update_request_read_or_update_convertToJSON(targeting_template_update_request_read_or_update_t *targeting_template_update_request_read_or_update) {
    cJSON *item = cJSON_CreateObject();

    // targeting_template_update_request_read_or_update->id
    if (!targeting_template_update_request_read_or_update->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", targeting_template_update_request_read_or_update->id) == NULL) {
    goto fail; //String
    }


    // targeting_template_update_request_read_or_update->operation_type
    if (pinterest_rest_api_audience_update_operation_type__NULL == targeting_template_update_request_read_or_update->operation_type) {
        goto fail;
    }
    cJSON *operation_type_local_JSON = audience_update_operation_type_convertToJSON(targeting_template_update_request_read_or_update->operation_type);
    if(operation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation_type", operation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // targeting_template_update_request_read_or_update->targeting_attributes
    if(targeting_template_update_request_read_or_update->targeting_attributes) {
    cJSON *targeting_attributes_local_JSON = targeting_spec_optimal_convertToJSON(targeting_template_update_request_read_or_update->targeting_attributes);
    if(targeting_attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "targeting_attributes", targeting_attributes_local_JSON);
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

targeting_template_update_request_read_or_update_t *targeting_template_update_request_read_or_update_parseFromJSON(cJSON *targeting_template_update_request_read_or_updateJSON){

    targeting_template_update_request_read_or_update_t *targeting_template_update_request_read_or_update_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for targeting_template_update_request_read_or_update->operation_type
    pinterest_rest_api_audience_update_operation_type__e operation_type_local_nonprim = 0;

    // define the local variable for targeting_template_update_request_read_or_update->targeting_attributes
    targeting_spec_optimal_t *targeting_attributes_local_nonprim = NULL;

    // targeting_template_update_request_read_or_update->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(targeting_template_update_request_read_or_updateJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // targeting_template_update_request_read_or_update->operation_type
    cJSON *operation_type = cJSON_GetObjectItemCaseSensitive(targeting_template_update_request_read_or_updateJSON, "operation_type");
    if (cJSON_IsNull(operation_type)) {
        operation_type = NULL;
    }
    if (!operation_type) {
        goto end;
    }

    
    operation_type_local_nonprim = audience_update_operation_type_parseFromJSON(operation_type); //custom

    // targeting_template_update_request_read_or_update->targeting_attributes
    cJSON *targeting_attributes = cJSON_GetObjectItemCaseSensitive(targeting_template_update_request_read_or_updateJSON, "targeting_attributes");
    if (cJSON_IsNull(targeting_attributes)) {
        targeting_attributes = NULL;
    }
    if (targeting_attributes) { 
    targeting_attributes_local_nonprim = targeting_spec_optimal_parseFromJSON(targeting_attributes); //nonprimitive
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    targeting_template_update_request_read_or_update_local_var = targeting_template_update_request_read_or_update_create_internal (
        id_local_str,
        operation_type_local_nonprim,
        targeting_attributes ? targeting_attributes_local_nonprim : NULL
        );

    if (!targeting_template_update_request_read_or_update_local_var) {
        goto end;
    }

    return targeting_template_update_request_read_or_update_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (operation_type_local_nonprim) {
        operation_type_local_nonprim = 0;
    }
    if (targeting_attributes_local_nonprim) {
        targeting_spec_optimal_free(targeting_attributes_local_nonprim);
        targeting_attributes_local_nonprim = NULL;
    }
    return NULL;

}
