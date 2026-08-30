#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedules_create_200_response_inner_data_one_of.h"



static schedules_create_200_response_inner_data_one_of_t *schedules_create_200_response_inner_data_one_of_create_internal(
    char *id,
    char *schedule_id,
    pinterest_lib_error_t *exceptions
    ) {
    schedules_create_200_response_inner_data_one_of_t *schedules_create_200_response_inner_data_one_of_local_var = malloc(sizeof(schedules_create_200_response_inner_data_one_of_t));
    if (!schedules_create_200_response_inner_data_one_of_local_var) {
        return NULL;
    }
    memset(schedules_create_200_response_inner_data_one_of_local_var, 0, sizeof(schedules_create_200_response_inner_data_one_of_t));
    schedules_create_200_response_inner_data_one_of_local_var->_library_owned = 1;
    schedules_create_200_response_inner_data_one_of_local_var->id = id;
    schedules_create_200_response_inner_data_one_of_local_var->schedule_id = schedule_id;
    schedules_create_200_response_inner_data_one_of_local_var->exceptions = exceptions;
    return schedules_create_200_response_inner_data_one_of_local_var;
}

__attribute__((deprecated)) schedules_create_200_response_inner_data_one_of_t *schedules_create_200_response_inner_data_one_of_create(
    char *id,
    char *schedule_id,
    pinterest_lib_error_t *exceptions
    ) {
    schedules_create_200_response_inner_data_one_of_t *result = schedules_create_200_response_inner_data_one_of_create_internal (
        id,
        schedule_id,
        exceptions
        );
    if (!result) {
    }
    return result;
}

void schedules_create_200_response_inner_data_one_of_free(schedules_create_200_response_inner_data_one_of_t *schedules_create_200_response_inner_data_one_of) {
    if(NULL == schedules_create_200_response_inner_data_one_of){
        return ;
    }
    if(schedules_create_200_response_inner_data_one_of->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedules_create_200_response_inner_data_one_of_free");
        return ;
    }
    listEntry_t *listEntry;
    if (schedules_create_200_response_inner_data_one_of->id) {
        free(schedules_create_200_response_inner_data_one_of->id);
        schedules_create_200_response_inner_data_one_of->id = NULL;
    }
    if (schedules_create_200_response_inner_data_one_of->schedule_id) {
        free(schedules_create_200_response_inner_data_one_of->schedule_id);
        schedules_create_200_response_inner_data_one_of->schedule_id = NULL;
    }
    if (schedules_create_200_response_inner_data_one_of->exceptions) {
        pinterest_lib_error_free(schedules_create_200_response_inner_data_one_of->exceptions);
        schedules_create_200_response_inner_data_one_of->exceptions = NULL;
    }
    free(schedules_create_200_response_inner_data_one_of);
}

cJSON *schedules_create_200_response_inner_data_one_of_convertToJSON(schedules_create_200_response_inner_data_one_of_t *schedules_create_200_response_inner_data_one_of) {
    cJSON *item = cJSON_CreateObject();

    // schedules_create_200_response_inner_data_one_of->id
    if (!schedules_create_200_response_inner_data_one_of->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", schedules_create_200_response_inner_data_one_of->id) == NULL) {
    goto fail; //String
    }


    // schedules_create_200_response_inner_data_one_of->schedule_id
    if (!schedules_create_200_response_inner_data_one_of->schedule_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "schedule_id", schedules_create_200_response_inner_data_one_of->schedule_id) == NULL) {
    goto fail; //String
    }


    // schedules_create_200_response_inner_data_one_of->exceptions
    if (!schedules_create_200_response_inner_data_one_of->exceptions) {
        goto fail;
    }
    cJSON *exceptions_local_JSON = pinterest_lib_error_convertToJSON(schedules_create_200_response_inner_data_one_of->exceptions);
    if(exceptions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exceptions", exceptions_local_JSON);
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

schedules_create_200_response_inner_data_one_of_t *schedules_create_200_response_inner_data_one_of_parseFromJSON(cJSON *schedules_create_200_response_inner_data_one_ofJSON){

    schedules_create_200_response_inner_data_one_of_t *schedules_create_200_response_inner_data_one_of_local_var = NULL;

    char *id_local_str = NULL;

    char *schedule_id_local_str = NULL;

    // define the local variable for schedules_create_200_response_inner_data_one_of->exceptions
    pinterest_lib_error_t *exceptions_local_nonprim = NULL;

    // schedules_create_200_response_inner_data_one_of->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_data_one_ofJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // schedules_create_200_response_inner_data_one_of->schedule_id
    cJSON *schedule_id = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_data_one_ofJSON, "schedule_id");
    if (cJSON_IsNull(schedule_id)) {
        schedule_id = NULL;
    }
    if (!schedule_id) {
        goto end;
    }

    
    if(!cJSON_IsString(schedule_id))
    {
    goto end; //String
    }

    // schedules_create_200_response_inner_data_one_of->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(schedules_create_200_response_inner_data_one_ofJSON, "exceptions");
    if (cJSON_IsNull(exceptions)) {
        exceptions = NULL;
    }
    if (!exceptions) {
        goto end;
    }

    
    exceptions_local_nonprim = pinterest_lib_error_parseFromJSON(exceptions); //nonprimitive


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (schedule_id && !cJSON_IsNull(schedule_id)) schedule_id_local_str = strdup(schedule_id->valuestring);

    schedules_create_200_response_inner_data_one_of_local_var = schedules_create_200_response_inner_data_one_of_create_internal (
        id_local_str,
        schedule_id_local_str,
        exceptions_local_nonprim
        );

    if (!schedules_create_200_response_inner_data_one_of_local_var) {
        goto end;
    }

    return schedules_create_200_response_inner_data_one_of_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (schedule_id_local_str) {
        free(schedule_id_local_str);
        schedule_id_local_str = NULL;
    }
    if (exceptions_local_nonprim) {
        pinterest_lib_error_free(exceptions_local_nonprim);
        exceptions_local_nonprim = NULL;
    }
    return NULL;

}
