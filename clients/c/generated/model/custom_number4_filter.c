#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "custom_number4_filter.h"



static custom_number4_filter_t *custom_number4_filter_create_internal(
    catalogs_product_group_uint32_criteria_t *custom_number_4
    ) {
    custom_number4_filter_t *custom_number4_filter_local_var = malloc(sizeof(custom_number4_filter_t));
    if (!custom_number4_filter_local_var) {
        return NULL;
    }
    memset(custom_number4_filter_local_var, 0, sizeof(custom_number4_filter_t));
    custom_number4_filter_local_var->_library_owned = 1;
    custom_number4_filter_local_var->custom_number_4 = custom_number_4;
    return custom_number4_filter_local_var;
}

__attribute__((deprecated)) custom_number4_filter_t *custom_number4_filter_create(
    catalogs_product_group_uint32_criteria_t *custom_number_4
    ) {
    custom_number4_filter_t *result = custom_number4_filter_create_internal (
        custom_number_4
        );
    if (!result) {
    }
    return result;
}

void custom_number4_filter_free(custom_number4_filter_t *custom_number4_filter) {
    if(NULL == custom_number4_filter){
        return ;
    }
    if(custom_number4_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "custom_number4_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (custom_number4_filter->custom_number_4) {
        catalogs_product_group_uint32_criteria_free(custom_number4_filter->custom_number_4);
        custom_number4_filter->custom_number_4 = NULL;
    }
    free(custom_number4_filter);
}

cJSON *custom_number4_filter_convertToJSON(custom_number4_filter_t *custom_number4_filter) {
    cJSON *item = cJSON_CreateObject();

    // custom_number4_filter->custom_number_4
    if (!custom_number4_filter->custom_number_4) {
        goto fail;
    }
    cJSON *custom_number_4_local_JSON = catalogs_product_group_uint32_criteria_convertToJSON(custom_number4_filter->custom_number_4);
    if(custom_number_4_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_NUMBER_4", custom_number_4_local_JSON);
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

custom_number4_filter_t *custom_number4_filter_parseFromJSON(cJSON *custom_number4_filterJSON){

    custom_number4_filter_t *custom_number4_filter_local_var = NULL;

    // define the local variable for custom_number4_filter->custom_number_4
    catalogs_product_group_uint32_criteria_t *custom_number_4_local_nonprim = NULL;

    // custom_number4_filter->custom_number_4
    cJSON *custom_number_4 = cJSON_GetObjectItemCaseSensitive(custom_number4_filterJSON, "CUSTOM_NUMBER_4");
    if (cJSON_IsNull(custom_number_4)) {
        custom_number_4 = NULL;
    }
    if (!custom_number_4) {
        goto end;
    }

    
    custom_number_4_local_nonprim = catalogs_product_group_uint32_criteria_parseFromJSON(custom_number_4); //nonprimitive



    custom_number4_filter_local_var = custom_number4_filter_create_internal (
        custom_number_4_local_nonprim
        );

    if (!custom_number4_filter_local_var) {
        goto end;
    }

    return custom_number4_filter_local_var;
end:
    if (custom_number_4_local_nonprim) {
        catalogs_product_group_uint32_criteria_free(custom_number_4_local_nonprim);
        custom_number_4_local_nonprim = NULL;
    }
    return NULL;

}
