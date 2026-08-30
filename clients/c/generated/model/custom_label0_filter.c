#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "custom_label0_filter.h"



static custom_label0_filter_t *custom_label0_filter_create_internal(
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_0
    ) {
    custom_label0_filter_t *custom_label0_filter_local_var = malloc(sizeof(custom_label0_filter_t));
    if (!custom_label0_filter_local_var) {
        return NULL;
    }
    memset(custom_label0_filter_local_var, 0, sizeof(custom_label0_filter_t));
    custom_label0_filter_local_var->_library_owned = 1;
    custom_label0_filter_local_var->custom_label_0 = custom_label_0;
    return custom_label0_filter_local_var;
}

__attribute__((deprecated)) custom_label0_filter_t *custom_label0_filter_create(
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_0
    ) {
    custom_label0_filter_t *result = custom_label0_filter_create_internal (
        custom_label_0
        );
    if (!result) {
    }
    return result;
}

void custom_label0_filter_free(custom_label0_filter_t *custom_label0_filter) {
    if(NULL == custom_label0_filter){
        return ;
    }
    if(custom_label0_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "custom_label0_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (custom_label0_filter->custom_label_0) {
        catalogs_product_group_filter_operator_type_criteria_free(custom_label0_filter->custom_label_0);
        custom_label0_filter->custom_label_0 = NULL;
    }
    free(custom_label0_filter);
}

cJSON *custom_label0_filter_convertToJSON(custom_label0_filter_t *custom_label0_filter) {
    cJSON *item = cJSON_CreateObject();

    // custom_label0_filter->custom_label_0
    if (!custom_label0_filter->custom_label_0) {
        goto fail;
    }
    cJSON *custom_label_0_local_JSON = catalogs_product_group_filter_operator_type_criteria_convertToJSON(custom_label0_filter->custom_label_0);
    if(custom_label_0_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_0", custom_label_0_local_JSON);
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

custom_label0_filter_t *custom_label0_filter_parseFromJSON(cJSON *custom_label0_filterJSON){

    custom_label0_filter_t *custom_label0_filter_local_var = NULL;

    // define the local variable for custom_label0_filter->custom_label_0
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_0_local_nonprim = NULL;

    // custom_label0_filter->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(custom_label0_filterJSON, "CUSTOM_LABEL_0");
    if (cJSON_IsNull(custom_label_0)) {
        custom_label_0 = NULL;
    }
    if (!custom_label_0) {
        goto end;
    }

    
    custom_label_0_local_nonprim = catalogs_product_group_filter_operator_type_criteria_parseFromJSON(custom_label_0); //nonprimitive



    custom_label0_filter_local_var = custom_label0_filter_create_internal (
        custom_label_0_local_nonprim
        );

    if (!custom_label0_filter_local_var) {
        goto end;
    }

    return custom_label0_filter_local_var;
end:
    if (custom_label_0_local_nonprim) {
        catalogs_product_group_filter_operator_type_criteria_free(custom_label_0_local_nonprim);
        custom_label_0_local_nonprim = NULL;
    }
    return NULL;

}
