#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ineligible_product_tag_error_item.h"



static ineligible_product_tag_error_item_t *ineligible_product_tag_error_item_create_internal(
    ineligible_product_tag_reason_t *error_message,
    char *pin_id
    ) {
    ineligible_product_tag_error_item_t *ineligible_product_tag_error_item_local_var = malloc(sizeof(ineligible_product_tag_error_item_t));
    if (!ineligible_product_tag_error_item_local_var) {
        return NULL;
    }
    memset(ineligible_product_tag_error_item_local_var, 0, sizeof(ineligible_product_tag_error_item_t));
    ineligible_product_tag_error_item_local_var->_library_owned = 1;
    ineligible_product_tag_error_item_local_var->error_message = error_message;
    ineligible_product_tag_error_item_local_var->pin_id = pin_id;
    return ineligible_product_tag_error_item_local_var;
}

__attribute__((deprecated)) ineligible_product_tag_error_item_t *ineligible_product_tag_error_item_create(
    ineligible_product_tag_reason_t *error_message,
    char *pin_id
    ) {
    ineligible_product_tag_error_item_t *result = ineligible_product_tag_error_item_create_internal (
        error_message,
        pin_id
        );
    if (!result) {
    }
    return result;
}

void ineligible_product_tag_error_item_free(ineligible_product_tag_error_item_t *ineligible_product_tag_error_item) {
    if(NULL == ineligible_product_tag_error_item){
        return ;
    }
    if(ineligible_product_tag_error_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ineligible_product_tag_error_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ineligible_product_tag_error_item->error_message) {
        ineligible_product_tag_reason_free(ineligible_product_tag_error_item->error_message);
        ineligible_product_tag_error_item->error_message = NULL;
    }
    if (ineligible_product_tag_error_item->pin_id) {
        free(ineligible_product_tag_error_item->pin_id);
        ineligible_product_tag_error_item->pin_id = NULL;
    }
    free(ineligible_product_tag_error_item);
}

cJSON *ineligible_product_tag_error_item_convertToJSON(ineligible_product_tag_error_item_t *ineligible_product_tag_error_item) {
    cJSON *item = cJSON_CreateObject();

    // ineligible_product_tag_error_item->error_message
    if (!ineligible_product_tag_error_item->error_message) {
        goto fail;
    }
    cJSON *error_message_local_JSON = ineligible_product_tag_reason_convertToJSON(ineligible_product_tag_error_item->error_message);
    if(error_message_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "error_message", error_message_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ineligible_product_tag_error_item->pin_id
    if (!ineligible_product_tag_error_item->pin_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "pin_id", ineligible_product_tag_error_item->pin_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ineligible_product_tag_error_item_t *ineligible_product_tag_error_item_parseFromJSON(cJSON *ineligible_product_tag_error_itemJSON){

    ineligible_product_tag_error_item_t *ineligible_product_tag_error_item_local_var = NULL;

    // define the local variable for ineligible_product_tag_error_item->error_message
    ineligible_product_tag_reason_t *error_message_local_nonprim = NULL;

    char *pin_id_local_str = NULL;

    // ineligible_product_tag_error_item->error_message
    cJSON *error_message = cJSON_GetObjectItemCaseSensitive(ineligible_product_tag_error_itemJSON, "error_message");
    if (cJSON_IsNull(error_message)) {
        error_message = NULL;
    }
    if (!error_message) {
        goto end;
    }

    
    error_message_local_nonprim = ineligible_product_tag_reason_parseFromJSON(error_message); //custom

    // ineligible_product_tag_error_item->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ineligible_product_tag_error_itemJSON, "pin_id");
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (!pin_id) {
        goto end;
    }

    
    if(!cJSON_IsString(pin_id))
    {
    goto end; //String
    }


    if (pin_id && !cJSON_IsNull(pin_id)) pin_id_local_str = strdup(pin_id->valuestring);

    ineligible_product_tag_error_item_local_var = ineligible_product_tag_error_item_create_internal (
        error_message_local_nonprim,
        pin_id_local_str
        );

    if (!ineligible_product_tag_error_item_local_var) {
        goto end;
    }

    return ineligible_product_tag_error_item_local_var;
end:
    if (error_message_local_nonprim) {
        ineligible_product_tag_reason_free(error_message_local_nonprim);
        error_message_local_nonprim = NULL;
    }
    if (pin_id_local_str) {
        free(pin_id_local_str);
        pin_id_local_str = NULL;
    }
    return NULL;

}
