#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_error_data.h"



static label_error_data_t *label_error_data_create_internal(
    char *id,
    pinterest_rest_api_nullable_label_type__e label_type,
    pinterest_rest_api_nullable_label_status__e status,
    char *value
    ) {
    label_error_data_t *label_error_data_local_var = malloc(sizeof(label_error_data_t));
    if (!label_error_data_local_var) {
        return NULL;
    }
    memset(label_error_data_local_var, 0, sizeof(label_error_data_t));
    label_error_data_local_var->_library_owned = 1;
    label_error_data_local_var->id = id;
    label_error_data_local_var->label_type = label_type;
    label_error_data_local_var->status = status;
    label_error_data_local_var->value = value;
    return label_error_data_local_var;
}

__attribute__((deprecated)) label_error_data_t *label_error_data_create(
    char *id,
    pinterest_rest_api_nullable_label_type__e label_type,
    pinterest_rest_api_nullable_label_status__e status,
    char *value
    ) {
    label_error_data_t *result = label_error_data_create_internal (
        id,
        label_type,
        status,
        value
        );
    if (!result) {
    }
    return result;
}

void label_error_data_free(label_error_data_t *label_error_data) {
    if(NULL == label_error_data){
        return ;
    }
    if(label_error_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "label_error_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (label_error_data->id) {
        free(label_error_data->id);
        label_error_data->id = NULL;
    }
    if (label_error_data->value) {
        free(label_error_data->value);
        label_error_data->value = NULL;
    }
    free(label_error_data);
}

cJSON *label_error_data_convertToJSON(label_error_data_t *label_error_data) {
    cJSON *item = cJSON_CreateObject();

    // label_error_data->id
    if(label_error_data->id) {
    if(cJSON_AddStringToObject(item, "id", label_error_data->id) == NULL) {
    goto fail; //String
    }
    }


    // label_error_data->label_type
    if(label_error_data->label_type != pinterest_rest_api_nullable_label_type__NULL) {
    cJSON *label_type_local_JSON = nullable_label_type_convertToJSON(label_error_data->label_type);
    if(label_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "label_type", label_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // label_error_data->status
    if(label_error_data->status != pinterest_rest_api_nullable_label_status__NULL) {
    cJSON *status_local_JSON = nullable_label_status_convertToJSON(label_error_data->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // label_error_data->value
    if(label_error_data->value) {
    if(cJSON_AddStringToObject(item, "value", label_error_data->value) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

label_error_data_t *label_error_data_parseFromJSON(cJSON *label_error_dataJSON){

    label_error_data_t *label_error_data_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for label_error_data->label_type
    pinterest_rest_api_nullable_label_type__e label_type_local_nonprim = 0;

    // define the local variable for label_error_data->status
    pinterest_rest_api_nullable_label_status__e status_local_nonprim = 0;

    char *value_local_str = NULL;

    // label_error_data->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(label_error_dataJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // label_error_data->label_type
    cJSON *label_type = cJSON_GetObjectItemCaseSensitive(label_error_dataJSON, "label_type");
    if (cJSON_IsNull(label_type)) {
        label_type = NULL;
    }
    if (label_type) { 
    label_type_local_nonprim = nullable_label_type_parseFromJSON(label_type); //custom
    }

    // label_error_data->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(label_error_dataJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = nullable_label_status_parseFromJSON(status); //custom
    }

    // label_error_data->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(label_error_dataJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);

    label_error_data_local_var = label_error_data_create_internal (
        id_local_str,
        label_type ? label_type_local_nonprim : 0,
        status ? status_local_nonprim : 0,
        value_local_str
        );

    if (!label_error_data_local_var) {
        goto end;
    }

    return label_error_data_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (label_type_local_nonprim) {
        label_type_local_nonprim = 0;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    return NULL;

}
