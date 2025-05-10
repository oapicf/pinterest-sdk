#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "gender_filter.h"



static gender_filter_t *gender_filter_create_internal(
    catalogs_product_group_multiple_gender_criteria_t *gender
    ) {
    gender_filter_t *gender_filter_local_var = malloc(sizeof(gender_filter_t));
    if (!gender_filter_local_var) {
        return NULL;
    }
    gender_filter_local_var->gender = gender;

    gender_filter_local_var->_library_owned = 1;
    return gender_filter_local_var;
}

__attribute__((deprecated)) gender_filter_t *gender_filter_create(
    catalogs_product_group_multiple_gender_criteria_t *gender
    ) {
    return gender_filter_create_internal (
        gender
        );
}

void gender_filter_free(gender_filter_t *gender_filter) {
    if(NULL == gender_filter){
        return ;
    }
    if(gender_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "gender_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (gender_filter->gender) {
        object_free(gender_filter->gender);
        gender_filter->gender = NULL;
    }
    free(gender_filter);
}

cJSON *gender_filter_convertToJSON(gender_filter_t *gender_filter) {
    cJSON *item = cJSON_CreateObject();

    // gender_filter->gender
    if (!gender_filter->gender) {
        goto fail;
    }
    cJSON *gender_object = object_convertToJSON(gender_filter->gender);
    if(gender_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GENDER", gender_object);
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

gender_filter_t *gender_filter_parseFromJSON(cJSON *gender_filterJSON){

    gender_filter_t *gender_filter_local_var = NULL;

    // gender_filter->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(gender_filterJSON, "GENDER");
    if (cJSON_IsNull(gender)) {
        gender = NULL;
    }
    if (!gender) {
        goto end;
    }

    object_t *gender_local_object = NULL;
    
    gender_local_object = object_parseFromJSON(gender); //object


    gender_filter_local_var = gender_filter_create_internal (
        gender_local_object
        );

    return gender_filter_local_var;
end:
    return NULL;

}
