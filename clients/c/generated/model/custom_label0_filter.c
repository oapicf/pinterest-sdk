#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "custom_label0_filter.h"



custom_label0_filter_t *custom_label0_filter_create(
    catalogs_product_group_multiple_string_criteria_t *custom_label_0
    ) {
    custom_label0_filter_t *custom_label0_filter_local_var = malloc(sizeof(custom_label0_filter_t));
    if (!custom_label0_filter_local_var) {
        return NULL;
    }
    custom_label0_filter_local_var->custom_label_0 = custom_label_0;

    return custom_label0_filter_local_var;
}


void custom_label0_filter_free(custom_label0_filter_t *custom_label0_filter) {
    if(NULL == custom_label0_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (custom_label0_filter->custom_label_0) {
        object_free(custom_label0_filter->custom_label_0);
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
    cJSON *custom_label_0_object = object_convertToJSON(custom_label0_filter->custom_label_0);
    if(custom_label_0_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_0", custom_label_0_object);
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

    // custom_label0_filter->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(custom_label0_filterJSON, "CUSTOM_LABEL_0");
    if (!custom_label_0) {
        goto end;
    }

    object_t *custom_label_0_local_object = NULL;
    
    custom_label_0_local_object = object_parseFromJSON(custom_label_0); //object


    custom_label0_filter_local_var = custom_label0_filter_create (
        custom_label_0_local_object
        );

    return custom_label0_filter_local_var;
end:
    return NULL;

}
