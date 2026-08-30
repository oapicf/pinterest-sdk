#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "custom_number0_filter.h"



static custom_number0_filter_t *custom_number0_filter_create_internal(
    catalogs_product_group_uint32_criteria_t *custom_number_0
    ) {
    custom_number0_filter_t *custom_number0_filter_local_var = malloc(sizeof(custom_number0_filter_t));
    if (!custom_number0_filter_local_var) {
        return NULL;
    }
    memset(custom_number0_filter_local_var, 0, sizeof(custom_number0_filter_t));
    custom_number0_filter_local_var->_library_owned = 1;
    custom_number0_filter_local_var->custom_number_0 = custom_number_0;
    return custom_number0_filter_local_var;
}

__attribute__((deprecated)) custom_number0_filter_t *custom_number0_filter_create(
    catalogs_product_group_uint32_criteria_t *custom_number_0
    ) {
    custom_number0_filter_t *result = custom_number0_filter_create_internal (
        custom_number_0
        );
    if (!result) {
    }
    return result;
}

void custom_number0_filter_free(custom_number0_filter_t *custom_number0_filter) {
    if(NULL == custom_number0_filter){
        return ;
    }
    if(custom_number0_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "custom_number0_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (custom_number0_filter->custom_number_0) {
        catalogs_product_group_uint32_criteria_free(custom_number0_filter->custom_number_0);
        custom_number0_filter->custom_number_0 = NULL;
    }
    free(custom_number0_filter);
}

cJSON *custom_number0_filter_convertToJSON(custom_number0_filter_t *custom_number0_filter) {
    cJSON *item = cJSON_CreateObject();

    // custom_number0_filter->custom_number_0
    if (!custom_number0_filter->custom_number_0) {
        goto fail;
    }
    cJSON *custom_number_0_local_JSON = catalogs_product_group_uint32_criteria_convertToJSON(custom_number0_filter->custom_number_0);
    if(custom_number_0_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_NUMBER_0", custom_number_0_local_JSON);
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

custom_number0_filter_t *custom_number0_filter_parseFromJSON(cJSON *custom_number0_filterJSON){

    custom_number0_filter_t *custom_number0_filter_local_var = NULL;

    // define the local variable for custom_number0_filter->custom_number_0
    catalogs_product_group_uint32_criteria_t *custom_number_0_local_nonprim = NULL;

    // custom_number0_filter->custom_number_0
    cJSON *custom_number_0 = cJSON_GetObjectItemCaseSensitive(custom_number0_filterJSON, "CUSTOM_NUMBER_0");
    if (cJSON_IsNull(custom_number_0)) {
        custom_number_0 = NULL;
    }
    if (!custom_number_0) {
        goto end;
    }

    
    custom_number_0_local_nonprim = catalogs_product_group_uint32_criteria_parseFromJSON(custom_number_0); //nonprimitive



    custom_number0_filter_local_var = custom_number0_filter_create_internal (
        custom_number_0_local_nonprim
        );

    if (!custom_number0_filter_local_var) {
        goto end;
    }

    return custom_number0_filter_local_var;
end:
    if (custom_number_0_local_nonprim) {
        catalogs_product_group_uint32_criteria_free(custom_number_0_local_nonprim);
        custom_number_0_local_nonprim = NULL;
    }
    return NULL;

}
