#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "condition_filter.h"



static condition_filter_t *condition_filter_create_internal(
    catalogs_product_group_multiple_string_criteria_t *condition
    ) {
    condition_filter_t *condition_filter_local_var = malloc(sizeof(condition_filter_t));
    if (!condition_filter_local_var) {
        return NULL;
    }
    memset(condition_filter_local_var, 0, sizeof(condition_filter_t));
    condition_filter_local_var->_library_owned = 1;
    condition_filter_local_var->condition = condition;
    return condition_filter_local_var;
}

__attribute__((deprecated)) condition_filter_t *condition_filter_create(
    catalogs_product_group_multiple_string_criteria_t *condition
    ) {
    condition_filter_t *result = condition_filter_create_internal (
        condition
        );
    if (!result) {
    }
    return result;
}

void condition_filter_free(condition_filter_t *condition_filter) {
    if(NULL == condition_filter){
        return ;
    }
    if(condition_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "condition_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (condition_filter->condition) {
        catalogs_product_group_multiple_string_criteria_free(condition_filter->condition);
        condition_filter->condition = NULL;
    }
    free(condition_filter);
}

cJSON *condition_filter_convertToJSON(condition_filter_t *condition_filter) {
    cJSON *item = cJSON_CreateObject();

    // condition_filter->condition
    if (!condition_filter->condition) {
        goto fail;
    }
    cJSON *condition_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(condition_filter->condition);
    if(condition_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CONDITION", condition_local_JSON);
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

condition_filter_t *condition_filter_parseFromJSON(cJSON *condition_filterJSON){

    condition_filter_t *condition_filter_local_var = NULL;

    // define the local variable for condition_filter->condition
    catalogs_product_group_multiple_string_criteria_t *condition_local_nonprim = NULL;

    // condition_filter->condition
    cJSON *condition = cJSON_GetObjectItemCaseSensitive(condition_filterJSON, "CONDITION");
    if (cJSON_IsNull(condition)) {
        condition = NULL;
    }
    if (!condition) {
        goto end;
    }

    
    condition_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(condition); //nonprimitive



    condition_filter_local_var = condition_filter_create_internal (
        condition_local_nonprim
        );

    if (!condition_filter_local_var) {
        goto end;
    }

    return condition_filter_local_var;
end:
    if (condition_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(condition_local_nonprim);
        condition_local_nonprim = NULL;
    }
    return NULL;

}
