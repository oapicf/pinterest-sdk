#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "custom_label1_filter.h"



custom_label1_filter_t *custom_label1_filter_create(
    catalogs_product_group_multiple_string_criteria_t *custom_label_1
    ) {
    custom_label1_filter_t *custom_label1_filter_local_var = malloc(sizeof(custom_label1_filter_t));
    if (!custom_label1_filter_local_var) {
        return NULL;
    }
    custom_label1_filter_local_var->custom_label_1 = custom_label_1;

    return custom_label1_filter_local_var;
}


void custom_label1_filter_free(custom_label1_filter_t *custom_label1_filter) {
    if(NULL == custom_label1_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (custom_label1_filter->custom_label_1) {
        object_free(custom_label1_filter->custom_label_1);
        custom_label1_filter->custom_label_1 = NULL;
    }
    free(custom_label1_filter);
}

cJSON *custom_label1_filter_convertToJSON(custom_label1_filter_t *custom_label1_filter) {
    cJSON *item = cJSON_CreateObject();

    // custom_label1_filter->custom_label_1
    if (!custom_label1_filter->custom_label_1) {
        goto fail;
    }
    cJSON *custom_label_1_object = object_convertToJSON(custom_label1_filter->custom_label_1);
    if(custom_label_1_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_1", custom_label_1_object);
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

custom_label1_filter_t *custom_label1_filter_parseFromJSON(cJSON *custom_label1_filterJSON){

    custom_label1_filter_t *custom_label1_filter_local_var = NULL;

    // custom_label1_filter->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(custom_label1_filterJSON, "CUSTOM_LABEL_1");
    if (!custom_label_1) {
        goto end;
    }

    object_t *custom_label_1_local_object = NULL;
    
    custom_label_1_local_object = object_parseFromJSON(custom_label_1); //object


    custom_label1_filter_local_var = custom_label1_filter_create (
        custom_label_1_local_object
        );

    return custom_label1_filter_local_var;
end:
    return NULL;

}
