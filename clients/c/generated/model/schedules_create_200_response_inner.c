#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedules_create_200_response_inner.h"



static schedules_create_200_response_inner_t *schedules_create_200_response_inner_create_internal(
    schedules_create_200_response_inner_data_t *data
    ) {
    schedules_create_200_response_inner_t *schedules_create_200_response_inner_local_var = malloc(sizeof(schedules_create_200_response_inner_t));
    if (!schedules_create_200_response_inner_local_var) {
        return NULL;
    }
    memset(schedules_create_200_response_inner_local_var, 0, sizeof(schedules_create_200_response_inner_t));
    schedules_create_200_response_inner_local_var->_library_owned = 1;
    schedules_create_200_response_inner_local_var->data = data;
    return schedules_create_200_response_inner_local_var;
}

__attribute__((deprecated)) schedules_create_200_response_inner_t *schedules_create_200_response_inner_create(
    schedules_create_200_response_inner_data_t *data
    ) {
    schedules_create_200_response_inner_t *result = schedules_create_200_response_inner_create_internal (
        data
        );
    if (!result) {
    }
    return result;
}

void schedules_create_200_response_inner_free(schedules_create_200_response_inner_t *schedules_create_200_response_inner) {
    if(NULL == schedules_create_200_response_inner){
        return ;
    }
    if(schedules_create_200_response_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedules_create_200_response_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (schedules_create_200_response_inner->data) {
        schedules_create_200_response_inner_data_free(schedules_create_200_response_inner->data);
        schedules_create_200_response_inner->data = NULL;
    }
    free(schedules_create_200_response_inner);
}

cJSON *schedules_create_200_response_inner_convertToJSON(schedules_create_200_response_inner_t *schedules_create_200_response_inner) {
    cJSON *item = cJSON_CreateObject();

    // schedules_create_200_response_inner->data
    if (!schedules_create_200_response_inner->data) {
        goto fail;
    }
    cJSON *data_local_JSON = schedules_create_200_response_inner_data_convertToJSON(schedules_create_200_response_inner->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
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

schedules_create_200_response_inner_t *schedules_create_200_response_inner_parseFromJSON(cJSON *schedules_create_200_response_innerJSON){

    schedules_create_200_response_inner_t *schedules_create_200_response_inner_local_var = NULL;

    // define the local variable for schedules_create_200_response_inner->data
    schedules_create_200_response_inner_data_t *data_local_nonprim = NULL;

    // schedules_create_200_response_inner->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_innerJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = schedules_create_200_response_inner_data_parseFromJSON(data); //nonprimitive



    schedules_create_200_response_inner_local_var = schedules_create_200_response_inner_create_internal (
        data_local_nonprim
        );

    if (!schedules_create_200_response_inner_local_var) {
        goto end;
    }

    return schedules_create_200_response_inner_local_var;
end:
    if (data_local_nonprim) {
        schedules_create_200_response_inner_data_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
