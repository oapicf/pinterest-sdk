#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label.h"



static label_t *label_create_internal(
    char *id,
    pinterest_rest_api_nullable_label_type__e label_type,
    pinterest_rest_api_nullable_label_status__e status,
    char *value
    ) {
    label_t *label_local_var = malloc(sizeof(label_t));
    if (!label_local_var) {
        return NULL;
    }
    memset(label_local_var, 0, sizeof(label_t));
    label_local_var->_library_owned = 1;
    label_local_var->id = id;
    label_local_var->label_type = label_type;
    label_local_var->status = status;
    label_local_var->value = value;
    return label_local_var;
}

__attribute__((deprecated)) label_t *label_create(
    char *id,
    pinterest_rest_api_nullable_label_type__e label_type,
    pinterest_rest_api_nullable_label_status__e status,
    char *value
    ) {
    label_t *result = label_create_internal (
        id,
        label_type,
        status,
        value
        );
    if (!result) {
    }
    return result;
}

void label_free(label_t *label) {
    if(NULL == label){
        return ;
    }
    if(label->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "label_free");
        return ;
    }
    listEntry_t *listEntry;
    if (label->id) {
        free(label->id);
        label->id = NULL;
    }
    if (label->value) {
        free(label->value);
        label->value = NULL;
    }
    free(label);
}

cJSON *label_convertToJSON(label_t *label) {
    cJSON *item = cJSON_CreateObject();

    // label->id
    if (!label->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", label->id) == NULL) {
    goto fail; //String
    }


    // label->label_type
    if (pinterest_rest_api_nullable_label_type__NULL == label->label_type) {
        goto fail;
    }
    cJSON *label_type_local_JSON = nullable_label_type_convertToJSON(label->label_type);
    if(label_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "label_type", label_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // label->status
    if(label->status != pinterest_rest_api_nullable_label_status__NULL) {
    cJSON *status_local_JSON = nullable_label_status_convertToJSON(label->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // label->value
    if (!label->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", label->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

label_t *label_parseFromJSON(cJSON *labelJSON){

    label_t *label_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for label->label_type
    pinterest_rest_api_nullable_label_type__e label_type_local_nonprim = 0;

    // define the local variable for label->status
    pinterest_rest_api_nullable_label_status__e status_local_nonprim = 0;

    char *value_local_str = NULL;

    // label->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(labelJSON, "id");
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

    // label->label_type
    cJSON *label_type = cJSON_GetObjectItemCaseSensitive(labelJSON, "label_type");
    if (cJSON_IsNull(label_type)) {
        label_type = NULL;
    }
    if (!label_type) {
        goto end;
    }

    
    label_type_local_nonprim = nullable_label_type_parseFromJSON(label_type); //custom

    // label->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(labelJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = nullable_label_status_parseFromJSON(status); //custom
    }

    // label->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(labelJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);

    label_local_var = label_create_internal (
        id_local_str,
        label_type_local_nonprim,
        status ? status_local_nonprim : 0,
        value_local_str
        );

    if (!label_local_var) {
        goto end;
    }

    return label_local_var;
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
