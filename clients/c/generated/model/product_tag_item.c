#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_tag_item.h"



static product_tag_item_t *product_tag_item_create_internal(
    char *pin_id
    ) {
    product_tag_item_t *product_tag_item_local_var = malloc(sizeof(product_tag_item_t));
    if (!product_tag_item_local_var) {
        return NULL;
    }
    memset(product_tag_item_local_var, 0, sizeof(product_tag_item_t));
    product_tag_item_local_var->_library_owned = 1;
    product_tag_item_local_var->pin_id = pin_id;
    return product_tag_item_local_var;
}

__attribute__((deprecated)) product_tag_item_t *product_tag_item_create(
    char *pin_id
    ) {
    product_tag_item_t *result = product_tag_item_create_internal (
        pin_id
        );
    if (!result) {
    }
    return result;
}

void product_tag_item_free(product_tag_item_t *product_tag_item) {
    if(NULL == product_tag_item){
        return ;
    }
    if(product_tag_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_tag_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_tag_item->pin_id) {
        free(product_tag_item->pin_id);
        product_tag_item->pin_id = NULL;
    }
    free(product_tag_item);
}

cJSON *product_tag_item_convertToJSON(product_tag_item_t *product_tag_item) {
    cJSON *item = cJSON_CreateObject();

    // product_tag_item->pin_id
    if (!product_tag_item->pin_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "pin_id", product_tag_item->pin_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

product_tag_item_t *product_tag_item_parseFromJSON(cJSON *product_tag_itemJSON){

    product_tag_item_t *product_tag_item_local_var = NULL;

    char *pin_id_local_str = NULL;

    // product_tag_item->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(product_tag_itemJSON, "pin_id");
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

    product_tag_item_local_var = product_tag_item_create_internal (
        pin_id_local_str
        );

    if (!product_tag_item_local_var) {
        goto end;
    }

    return product_tag_item_local_var;
end:
    if (pin_id_local_str) {
        free(pin_id_local_str);
        pin_id_local_str = NULL;
    }
    return NULL;

}
