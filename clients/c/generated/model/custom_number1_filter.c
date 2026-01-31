#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "custom_number1_filter.h"



static custom_number1_filter_t *custom_number1_filter_create_internal(
    catalogs_product_group_uint32_criteria_t *custom_number_1
    ) {
    custom_number1_filter_t *custom_number1_filter_local_var = malloc(sizeof(custom_number1_filter_t));
    if (!custom_number1_filter_local_var) {
        return NULL;
    }
    custom_number1_filter_local_var->custom_number_1 = custom_number_1;

    custom_number1_filter_local_var->_library_owned = 1;
    return custom_number1_filter_local_var;
}

__attribute__((deprecated)) custom_number1_filter_t *custom_number1_filter_create(
    catalogs_product_group_uint32_criteria_t *custom_number_1
    ) {
    return custom_number1_filter_create_internal (
        custom_number_1
        );
}

void custom_number1_filter_free(custom_number1_filter_t *custom_number1_filter) {
    if(NULL == custom_number1_filter){
        return ;
    }
    if(custom_number1_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "custom_number1_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (custom_number1_filter->custom_number_1) {
        object_free(custom_number1_filter->custom_number_1);
        custom_number1_filter->custom_number_1 = NULL;
    }
    free(custom_number1_filter);
}

cJSON *custom_number1_filter_convertToJSON(custom_number1_filter_t *custom_number1_filter) {
    cJSON *item = cJSON_CreateObject();

    // custom_number1_filter->custom_number_1
    if (!custom_number1_filter->custom_number_1) {
        goto fail;
    }
    cJSON *custom_number_1_object = object_convertToJSON(custom_number1_filter->custom_number_1);
    if(custom_number_1_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_NUMBER_1", custom_number_1_object);
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

custom_number1_filter_t *custom_number1_filter_parseFromJSON(cJSON *custom_number1_filterJSON){

    custom_number1_filter_t *custom_number1_filter_local_var = NULL;

    // custom_number1_filter->custom_number_1
    cJSON *custom_number_1 = cJSON_GetObjectItemCaseSensitive(custom_number1_filterJSON, "CUSTOM_NUMBER_1");
    if (cJSON_IsNull(custom_number_1)) {
        custom_number_1 = NULL;
    }
    if (!custom_number_1) {
        goto end;
    }

    object_t *custom_number_1_local_object = NULL;
    
    custom_number_1_local_object = object_parseFromJSON(custom_number_1); //object


    custom_number1_filter_local_var = custom_number1_filter_create_internal (
        custom_number_1_local_object
        );

    return custom_number1_filter_local_var;
end:
    return NULL;

}
