#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "availability_filter.h"



static availability_filter_t *availability_filter_create_internal(
    catalogs_product_group_multiple_string_criteria_t *availability
    ) {
    availability_filter_t *availability_filter_local_var = malloc(sizeof(availability_filter_t));
    if (!availability_filter_local_var) {
        return NULL;
    }
    memset(availability_filter_local_var, 0, sizeof(availability_filter_t));
    availability_filter_local_var->_library_owned = 1;
    availability_filter_local_var->availability = availability;
    return availability_filter_local_var;
}

__attribute__((deprecated)) availability_filter_t *availability_filter_create(
    catalogs_product_group_multiple_string_criteria_t *availability
    ) {
    availability_filter_t *result = availability_filter_create_internal (
        availability
        );
    if (!result) {
    }
    return result;
}

void availability_filter_free(availability_filter_t *availability_filter) {
    if(NULL == availability_filter){
        return ;
    }
    if(availability_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "availability_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (availability_filter->availability) {
        catalogs_product_group_multiple_string_criteria_free(availability_filter->availability);
        availability_filter->availability = NULL;
    }
    free(availability_filter);
}

cJSON *availability_filter_convertToJSON(availability_filter_t *availability_filter) {
    cJSON *item = cJSON_CreateObject();

    // availability_filter->availability
    if (!availability_filter->availability) {
        goto fail;
    }
    cJSON *availability_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(availability_filter->availability);
    if(availability_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "AVAILABILITY", availability_local_JSON);
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

availability_filter_t *availability_filter_parseFromJSON(cJSON *availability_filterJSON){

    availability_filter_t *availability_filter_local_var = NULL;

    // define the local variable for availability_filter->availability
    catalogs_product_group_multiple_string_criteria_t *availability_local_nonprim = NULL;

    // availability_filter->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(availability_filterJSON, "AVAILABILITY");
    if (cJSON_IsNull(availability)) {
        availability = NULL;
    }
    if (!availability) {
        goto end;
    }

    
    availability_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(availability); //nonprimitive



    availability_filter_local_var = availability_filter_create_internal (
        availability_local_nonprim
        );

    if (!availability_filter_local_var) {
        goto end;
    }

    return availability_filter_local_var;
end:
    if (availability_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(availability_local_nonprim);
        availability_local_nonprim = NULL;
    }
    return NULL;

}
