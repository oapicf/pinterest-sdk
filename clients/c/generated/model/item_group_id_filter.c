#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_group_id_filter.h"



static item_group_id_filter_t *item_group_id_filter_create_internal(
    catalogs_product_group_multiple_string_criteria_t *item_group_id
    ) {
    item_group_id_filter_t *item_group_id_filter_local_var = malloc(sizeof(item_group_id_filter_t));
    if (!item_group_id_filter_local_var) {
        return NULL;
    }
    memset(item_group_id_filter_local_var, 0, sizeof(item_group_id_filter_t));
    item_group_id_filter_local_var->_library_owned = 1;
    item_group_id_filter_local_var->item_group_id = item_group_id;
    return item_group_id_filter_local_var;
}

__attribute__((deprecated)) item_group_id_filter_t *item_group_id_filter_create(
    catalogs_product_group_multiple_string_criteria_t *item_group_id
    ) {
    item_group_id_filter_t *result = item_group_id_filter_create_internal (
        item_group_id
        );
    if (!result) {
    }
    return result;
}

void item_group_id_filter_free(item_group_id_filter_t *item_group_id_filter) {
    if(NULL == item_group_id_filter){
        return ;
    }
    if(item_group_id_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_group_id_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_group_id_filter->item_group_id) {
        catalogs_product_group_multiple_string_criteria_free(item_group_id_filter->item_group_id);
        item_group_id_filter->item_group_id = NULL;
    }
    free(item_group_id_filter);
}

cJSON *item_group_id_filter_convertToJSON(item_group_id_filter_t *item_group_id_filter) {
    cJSON *item = cJSON_CreateObject();

    // item_group_id_filter->item_group_id
    if (!item_group_id_filter->item_group_id) {
        goto fail;
    }
    cJSON *item_group_id_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(item_group_id_filter->item_group_id);
    if(item_group_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ITEM_GROUP_ID", item_group_id_local_JSON);
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

item_group_id_filter_t *item_group_id_filter_parseFromJSON(cJSON *item_group_id_filterJSON){

    item_group_id_filter_t *item_group_id_filter_local_var = NULL;

    // define the local variable for item_group_id_filter->item_group_id
    catalogs_product_group_multiple_string_criteria_t *item_group_id_local_nonprim = NULL;

    // item_group_id_filter->item_group_id
    cJSON *item_group_id = cJSON_GetObjectItemCaseSensitive(item_group_id_filterJSON, "ITEM_GROUP_ID");
    if (cJSON_IsNull(item_group_id)) {
        item_group_id = NULL;
    }
    if (!item_group_id) {
        goto end;
    }

    
    item_group_id_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(item_group_id); //nonprimitive



    item_group_id_filter_local_var = item_group_id_filter_create_internal (
        item_group_id_local_nonprim
        );

    if (!item_group_id_filter_local_var) {
        goto end;
    }

    return item_group_id_filter_local_var;
end:
    if (item_group_id_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(item_group_id_local_nonprim);
        item_group_id_local_nonprim = NULL;
    }
    return NULL;

}
