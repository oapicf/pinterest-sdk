#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "custom_number2_filter.h"



static custom_number2_filter_t *custom_number2_filter_create_internal(
    catalogs_product_group_uint32_criteria_t *custom_number_2
    ) {
    custom_number2_filter_t *custom_number2_filter_local_var = malloc(sizeof(custom_number2_filter_t));
    if (!custom_number2_filter_local_var) {
        return NULL;
    }
    custom_number2_filter_local_var->custom_number_2 = custom_number_2;

    custom_number2_filter_local_var->_library_owned = 1;
    return custom_number2_filter_local_var;
}

__attribute__((deprecated)) custom_number2_filter_t *custom_number2_filter_create(
    catalogs_product_group_uint32_criteria_t *custom_number_2
    ) {
    return custom_number2_filter_create_internal (
        custom_number_2
        );
}

void custom_number2_filter_free(custom_number2_filter_t *custom_number2_filter) {
    if(NULL == custom_number2_filter){
        return ;
    }
    if(custom_number2_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "custom_number2_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (custom_number2_filter->custom_number_2) {
        object_free(custom_number2_filter->custom_number_2);
        custom_number2_filter->custom_number_2 = NULL;
    }
    free(custom_number2_filter);
}

cJSON *custom_number2_filter_convertToJSON(custom_number2_filter_t *custom_number2_filter) {
    cJSON *item = cJSON_CreateObject();

    // custom_number2_filter->custom_number_2
    if (!custom_number2_filter->custom_number_2) {
        goto fail;
    }
    cJSON *custom_number_2_object = object_convertToJSON(custom_number2_filter->custom_number_2);
    if(custom_number_2_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_NUMBER_2", custom_number_2_object);
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

custom_number2_filter_t *custom_number2_filter_parseFromJSON(cJSON *custom_number2_filterJSON){

    custom_number2_filter_t *custom_number2_filter_local_var = NULL;

    // custom_number2_filter->custom_number_2
    cJSON *custom_number_2 = cJSON_GetObjectItemCaseSensitive(custom_number2_filterJSON, "CUSTOM_NUMBER_2");
    if (cJSON_IsNull(custom_number_2)) {
        custom_number_2 = NULL;
    }
    if (!custom_number_2) {
        goto end;
    }

    object_t *custom_number_2_local_object = NULL;
    
    custom_number_2_local_object = object_parseFromJSON(custom_number_2); //object


    custom_number2_filter_local_var = custom_number2_filter_create_internal (
        custom_number_2_local_object
        );

    return custom_number2_filter_local_var;
end:
    return NULL;

}
