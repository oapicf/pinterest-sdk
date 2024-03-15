#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "custom_label4_filter.h"



custom_label4_filter_t *custom_label4_filter_create(
    catalogs_product_group_multiple_string_criteria_t *custom_label_4
    ) {
    custom_label4_filter_t *custom_label4_filter_local_var = malloc(sizeof(custom_label4_filter_t));
    if (!custom_label4_filter_local_var) {
        return NULL;
    }
    custom_label4_filter_local_var->custom_label_4 = custom_label_4;

    return custom_label4_filter_local_var;
}


void custom_label4_filter_free(custom_label4_filter_t *custom_label4_filter) {
    if(NULL == custom_label4_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (custom_label4_filter->custom_label_4) {
        object_free(custom_label4_filter->custom_label_4);
        custom_label4_filter->custom_label_4 = NULL;
    }
    free(custom_label4_filter);
}

cJSON *custom_label4_filter_convertToJSON(custom_label4_filter_t *custom_label4_filter) {
    cJSON *item = cJSON_CreateObject();

    // custom_label4_filter->custom_label_4
    if (!custom_label4_filter->custom_label_4) {
        goto fail;
    }
    cJSON *custom_label_4_object = object_convertToJSON(custom_label4_filter->custom_label_4);
    if(custom_label_4_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_4", custom_label_4_object);
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

custom_label4_filter_t *custom_label4_filter_parseFromJSON(cJSON *custom_label4_filterJSON){

    custom_label4_filter_t *custom_label4_filter_local_var = NULL;

    // custom_label4_filter->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(custom_label4_filterJSON, "CUSTOM_LABEL_4");
    if (!custom_label_4) {
        goto end;
    }

    object_t *custom_label_4_local_object = NULL;
    
    custom_label_4_local_object = object_parseFromJSON(custom_label_4); //object


    custom_label4_filter_local_var = custom_label4_filter_create (
        custom_label_4_local_object
        );

    return custom_label4_filter_local_var;
end:
    return NULL;

}
