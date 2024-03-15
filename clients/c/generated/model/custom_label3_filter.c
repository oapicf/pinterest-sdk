#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "custom_label3_filter.h"



custom_label3_filter_t *custom_label3_filter_create(
    catalogs_product_group_multiple_string_criteria_t *custom_label_3
    ) {
    custom_label3_filter_t *custom_label3_filter_local_var = malloc(sizeof(custom_label3_filter_t));
    if (!custom_label3_filter_local_var) {
        return NULL;
    }
    custom_label3_filter_local_var->custom_label_3 = custom_label_3;

    return custom_label3_filter_local_var;
}


void custom_label3_filter_free(custom_label3_filter_t *custom_label3_filter) {
    if(NULL == custom_label3_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (custom_label3_filter->custom_label_3) {
        object_free(custom_label3_filter->custom_label_3);
        custom_label3_filter->custom_label_3 = NULL;
    }
    free(custom_label3_filter);
}

cJSON *custom_label3_filter_convertToJSON(custom_label3_filter_t *custom_label3_filter) {
    cJSON *item = cJSON_CreateObject();

    // custom_label3_filter->custom_label_3
    if (!custom_label3_filter->custom_label_3) {
        goto fail;
    }
    cJSON *custom_label_3_object = object_convertToJSON(custom_label3_filter->custom_label_3);
    if(custom_label_3_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_3", custom_label_3_object);
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

custom_label3_filter_t *custom_label3_filter_parseFromJSON(cJSON *custom_label3_filterJSON){

    custom_label3_filter_t *custom_label3_filter_local_var = NULL;

    // custom_label3_filter->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(custom_label3_filterJSON, "CUSTOM_LABEL_3");
    if (!custom_label_3) {
        goto end;
    }

    object_t *custom_label_3_local_object = NULL;
    
    custom_label_3_local_object = object_parseFromJSON(custom_label_3); //object


    custom_label3_filter_local_var = custom_label3_filter_create (
        custom_label_3_local_object
        );

    return custom_label3_filter_local_var;
end:
    return NULL;

}
