#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "updatable_item_attributes_gtin.h"



static updatable_item_attributes_gtin_t *updatable_item_attributes_gtin_create_internal(
    ) {
    updatable_item_attributes_gtin_t *updatable_item_attributes_gtin_local_var = malloc(sizeof(updatable_item_attributes_gtin_t));
    if (!updatable_item_attributes_gtin_local_var) {
        return NULL;
    }

    updatable_item_attributes_gtin_local_var->_library_owned = 1;
    return updatable_item_attributes_gtin_local_var;
}

__attribute__((deprecated)) updatable_item_attributes_gtin_t *updatable_item_attributes_gtin_create(
    ) {
    return updatable_item_attributes_gtin_create_internal (
        );
}

void updatable_item_attributes_gtin_free(updatable_item_attributes_gtin_t *updatable_item_attributes_gtin) {
    if(NULL == updatable_item_attributes_gtin){
        return ;
    }
    if(updatable_item_attributes_gtin->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "updatable_item_attributes_gtin_free");
        return ;
    }
    listEntry_t *listEntry;
    free(updatable_item_attributes_gtin);
}

cJSON *updatable_item_attributes_gtin_convertToJSON(updatable_item_attributes_gtin_t *updatable_item_attributes_gtin) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

updatable_item_attributes_gtin_t *updatable_item_attributes_gtin_parseFromJSON(cJSON *updatable_item_attributes_gtinJSON){

    updatable_item_attributes_gtin_t *updatable_item_attributes_gtin_local_var = NULL;


    updatable_item_attributes_gtin_local_var = updatable_item_attributes_gtin_create_internal (
        );

    return updatable_item_attributes_gtin_local_var;
end:
    return NULL;

}
