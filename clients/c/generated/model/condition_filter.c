#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "condition_filter.h"



condition_filter_t *condition_filter_create(
    catalogs_product_group_multiple_string_criteria_t *condition
    ) {
    condition_filter_t *condition_filter_local_var = malloc(sizeof(condition_filter_t));
    if (!condition_filter_local_var) {
        return NULL;
    }
    condition_filter_local_var->condition = condition;

    return condition_filter_local_var;
}


void condition_filter_free(condition_filter_t *condition_filter) {
    if(NULL == condition_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (condition_filter->condition) {
        object_free(condition_filter->condition);
        condition_filter->condition = NULL;
    }
    free(condition_filter);
}

cJSON *condition_filter_convertToJSON(condition_filter_t *condition_filter) {
    cJSON *item = cJSON_CreateObject();

    // condition_filter->condition
    if (!condition_filter->condition) {
        goto fail;
    }
    cJSON *condition_object = object_convertToJSON(condition_filter->condition);
    if(condition_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CONDITION", condition_object);
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

condition_filter_t *condition_filter_parseFromJSON(cJSON *condition_filterJSON){

    condition_filter_t *condition_filter_local_var = NULL;

    // condition_filter->condition
    cJSON *condition = cJSON_GetObjectItemCaseSensitive(condition_filterJSON, "CONDITION");
    if (!condition) {
        goto end;
    }

    object_t *condition_local_object = NULL;
    
    condition_local_object = object_parseFromJSON(condition); //object


    condition_filter_local_var = condition_filter_create (
        condition_local_object
        );

    return condition_filter_local_var;
end:
    return NULL;

}
