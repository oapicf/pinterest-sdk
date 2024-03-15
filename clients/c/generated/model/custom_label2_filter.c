#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "custom_label2_filter.h"



custom_label2_filter_t *custom_label2_filter_create(
    catalogs_product_group_multiple_string_criteria_t *custom_label_2
    ) {
    custom_label2_filter_t *custom_label2_filter_local_var = malloc(sizeof(custom_label2_filter_t));
    if (!custom_label2_filter_local_var) {
        return NULL;
    }
    custom_label2_filter_local_var->custom_label_2 = custom_label_2;

    return custom_label2_filter_local_var;
}


void custom_label2_filter_free(custom_label2_filter_t *custom_label2_filter) {
    if(NULL == custom_label2_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (custom_label2_filter->custom_label_2) {
        object_free(custom_label2_filter->custom_label_2);
        custom_label2_filter->custom_label_2 = NULL;
    }
    free(custom_label2_filter);
}

cJSON *custom_label2_filter_convertToJSON(custom_label2_filter_t *custom_label2_filter) {
    cJSON *item = cJSON_CreateObject();

    // custom_label2_filter->custom_label_2
    if (!custom_label2_filter->custom_label_2) {
        goto fail;
    }
    cJSON *custom_label_2_object = object_convertToJSON(custom_label2_filter->custom_label_2);
    if(custom_label_2_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_2", custom_label_2_object);
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

custom_label2_filter_t *custom_label2_filter_parseFromJSON(cJSON *custom_label2_filterJSON){

    custom_label2_filter_t *custom_label2_filter_local_var = NULL;

    // custom_label2_filter->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(custom_label2_filterJSON, "CUSTOM_LABEL_2");
    if (!custom_label_2) {
        goto end;
    }

    object_t *custom_label_2_local_object = NULL;
    
    custom_label_2_local_object = object_parseFromJSON(custom_label_2); //object


    custom_label2_filter_local_var = custom_label2_filter_create (
        custom_label_2_local_object
        );

    return custom_label2_filter_local_var;
end:
    return NULL;

}
