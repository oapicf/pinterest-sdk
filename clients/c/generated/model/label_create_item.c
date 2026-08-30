#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_create_item.h"



static label_create_item_t *label_create_item_create_internal(
    pinterest_rest_api_label_type__e label_type,
    char *value
    ) {
    label_create_item_t *label_create_item_local_var = malloc(sizeof(label_create_item_t));
    if (!label_create_item_local_var) {
        return NULL;
    }
    memset(label_create_item_local_var, 0, sizeof(label_create_item_t));
    label_create_item_local_var->_library_owned = 1;
    label_create_item_local_var->label_type = label_type;
    label_create_item_local_var->value = value;
    return label_create_item_local_var;
}

__attribute__((deprecated)) label_create_item_t *label_create_item_create(
    pinterest_rest_api_label_type__e label_type,
    char *value
    ) {
    label_create_item_t *result = label_create_item_create_internal (
        label_type,
        value
        );
    if (!result) {
    }
    return result;
}

void label_create_item_free(label_create_item_t *label_create_item) {
    if(NULL == label_create_item){
        return ;
    }
    if(label_create_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "label_create_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (label_create_item->value) {
        free(label_create_item->value);
        label_create_item->value = NULL;
    }
    free(label_create_item);
}

cJSON *label_create_item_convertToJSON(label_create_item_t *label_create_item) {
    cJSON *item = cJSON_CreateObject();

    // label_create_item->label_type
    if (pinterest_rest_api_label_type__NULL == label_create_item->label_type) {
        goto fail;
    }
    cJSON *label_type_local_JSON = label_type_convertToJSON(label_create_item->label_type);
    if(label_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "label_type", label_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // label_create_item->value
    if (!label_create_item->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", label_create_item->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

label_create_item_t *label_create_item_parseFromJSON(cJSON *label_create_itemJSON){

    label_create_item_t *label_create_item_local_var = NULL;

    // define the local variable for label_create_item->label_type
    pinterest_rest_api_label_type__e label_type_local_nonprim = 0;

    char *value_local_str = NULL;

    // label_create_item->label_type
    cJSON *label_type = cJSON_GetObjectItemCaseSensitive(label_create_itemJSON, "label_type");
    if (cJSON_IsNull(label_type)) {
        label_type = NULL;
    }
    if (!label_type) {
        goto end;
    }

    
    label_type_local_nonprim = label_type_parseFromJSON(label_type); //custom

    // label_create_item->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(label_create_itemJSON, "value");
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


    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);

    label_create_item_local_var = label_create_item_create_internal (
        label_type_local_nonprim,
        value_local_str
        );

    if (!label_create_item_local_var) {
        goto end;
    }

    return label_create_item_local_var;
end:
    if (label_type_local_nonprim) {
        label_type_local_nonprim = 0;
    }
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    return NULL;

}
