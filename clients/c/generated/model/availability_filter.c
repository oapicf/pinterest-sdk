#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "availability_filter.h"



availability_filter_t *availability_filter_create(
    catalogs_product_group_multiple_string_criteria_t *availability
    ) {
    availability_filter_t *availability_filter_local_var = malloc(sizeof(availability_filter_t));
    if (!availability_filter_local_var) {
        return NULL;
    }
    availability_filter_local_var->availability = availability;

    return availability_filter_local_var;
}


void availability_filter_free(availability_filter_t *availability_filter) {
    if(NULL == availability_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (availability_filter->availability) {
        object_free(availability_filter->availability);
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
    cJSON *availability_object = object_convertToJSON(availability_filter->availability);
    if(availability_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "AVAILABILITY", availability_object);
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

    // availability_filter->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(availability_filterJSON, "AVAILABILITY");
    if (!availability) {
        goto end;
    }

    object_t *availability_local_object = NULL;
    
    availability_local_object = object_parseFromJSON(availability); //object


    availability_filter_local_var = availability_filter_create (
        availability_local_object
        );

    return availability_filter_local_var;
end:
    return NULL;

}
