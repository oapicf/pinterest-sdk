#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_create_request_labels_inner.h"



static label_create_request_labels_inner_t *label_create_request_labels_inner_create_internal(
    pinterest_rest_api_label_type__e label_type,
    char *value
    ) {
    label_create_request_labels_inner_t *label_create_request_labels_inner_local_var = malloc(sizeof(label_create_request_labels_inner_t));
    if (!label_create_request_labels_inner_local_var) {
        return NULL;
    }
    label_create_request_labels_inner_local_var->label_type = label_type;
    label_create_request_labels_inner_local_var->value = value;

    label_create_request_labels_inner_local_var->_library_owned = 1;
    return label_create_request_labels_inner_local_var;
}

__attribute__((deprecated)) label_create_request_labels_inner_t *label_create_request_labels_inner_create(
    pinterest_rest_api_label_type__e label_type,
    char *value
    ) {
    return label_create_request_labels_inner_create_internal (
        label_type,
        value
        );
}

void label_create_request_labels_inner_free(label_create_request_labels_inner_t *label_create_request_labels_inner) {
    if(NULL == label_create_request_labels_inner){
        return ;
    }
    if(label_create_request_labels_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "label_create_request_labels_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (label_create_request_labels_inner->value) {
        free(label_create_request_labels_inner->value);
        label_create_request_labels_inner->value = NULL;
    }
    free(label_create_request_labels_inner);
}

cJSON *label_create_request_labels_inner_convertToJSON(label_create_request_labels_inner_t *label_create_request_labels_inner) {
    cJSON *item = cJSON_CreateObject();

    // label_create_request_labels_inner->label_type
    if (pinterest_rest_api_label_type__NULL == label_create_request_labels_inner->label_type) {
        goto fail;
    }
    cJSON *label_type_local_JSON = label_type_convertToJSON(label_create_request_labels_inner->label_type);
    if(label_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "label_type", label_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // label_create_request_labels_inner->value
    if (!label_create_request_labels_inner->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", label_create_request_labels_inner->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

label_create_request_labels_inner_t *label_create_request_labels_inner_parseFromJSON(cJSON *label_create_request_labels_innerJSON){

    label_create_request_labels_inner_t *label_create_request_labels_inner_local_var = NULL;

    // define the local variable for label_create_request_labels_inner->label_type
    pinterest_rest_api_label_type__e label_type_local_nonprim = 0;

    // label_create_request_labels_inner->label_type
    cJSON *label_type = cJSON_GetObjectItemCaseSensitive(label_create_request_labels_innerJSON, "label_type");
    if (cJSON_IsNull(label_type)) {
        label_type = NULL;
    }
    if (!label_type) {
        goto end;
    }

    
    label_type_local_nonprim = label_type_parseFromJSON(label_type); //custom

    // label_create_request_labels_inner->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(label_create_request_labels_innerJSON, "value");
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


    label_create_request_labels_inner_local_var = label_create_request_labels_inner_create_internal (
        label_type_local_nonprim,
        strdup(value->valuestring)
        );

    return label_create_request_labels_inner_local_var;
end:
    if (label_type_local_nonprim) {
        label_type_local_nonprim = 0;
    }
    return NULL;

}
