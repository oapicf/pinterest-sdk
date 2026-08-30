#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_id_filter.h"



static item_id_filter_t *item_id_filter_create_internal(
    catalogs_product_group_multiple_string_criteria_t *item_id
    ) {
    item_id_filter_t *item_id_filter_local_var = malloc(sizeof(item_id_filter_t));
    if (!item_id_filter_local_var) {
        return NULL;
    }
    memset(item_id_filter_local_var, 0, sizeof(item_id_filter_t));
    item_id_filter_local_var->_library_owned = 1;
    item_id_filter_local_var->item_id = item_id;
    return item_id_filter_local_var;
}

__attribute__((deprecated)) item_id_filter_t *item_id_filter_create(
    catalogs_product_group_multiple_string_criteria_t *item_id
    ) {
    item_id_filter_t *result = item_id_filter_create_internal (
        item_id
        );
    if (!result) {
    }
    return result;
}

void item_id_filter_free(item_id_filter_t *item_id_filter) {
    if(NULL == item_id_filter){
        return ;
    }
    if(item_id_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_id_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_id_filter->item_id) {
        catalogs_product_group_multiple_string_criteria_free(item_id_filter->item_id);
        item_id_filter->item_id = NULL;
    }
    free(item_id_filter);
}

cJSON *item_id_filter_convertToJSON(item_id_filter_t *item_id_filter) {
    cJSON *item = cJSON_CreateObject();

    // item_id_filter->item_id
    if (!item_id_filter->item_id) {
        goto fail;
    }
    cJSON *item_id_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(item_id_filter->item_id);
    if(item_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ITEM_ID", item_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_id_filter_t *item_id_filter_parseFromJSON(cJSON *item_id_filterJSON){

    item_id_filter_t *item_id_filter_local_var = NULL;

    // define the local variable for item_id_filter->item_id
    catalogs_product_group_multiple_string_criteria_t *item_id_local_nonprim = NULL;

    // item_id_filter->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(item_id_filterJSON, "ITEM_ID");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (!item_id) {
        goto end;
    }

    
    item_id_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(item_id); //nonprimitive



    item_id_filter_local_var = item_id_filter_create_internal (
        item_id_local_nonprim
        );

    if (!item_id_filter_local_var) {
        goto end;
    }

    return item_id_filter_local_var;
end:
    if (item_id_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(item_id_local_nonprim);
        item_id_local_nonprim = NULL;
    }
    return NULL;

}
