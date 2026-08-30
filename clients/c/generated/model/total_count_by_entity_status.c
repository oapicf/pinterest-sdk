#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "total_count_by_entity_status.h"



static total_count_by_entity_status_t *total_count_by_entity_status_create_internal(
    int *active,
    int *archived,
    int *paused
    ) {
    total_count_by_entity_status_t *total_count_by_entity_status_local_var = malloc(sizeof(total_count_by_entity_status_t));
    if (!total_count_by_entity_status_local_var) {
        return NULL;
    }
    memset(total_count_by_entity_status_local_var, 0, sizeof(total_count_by_entity_status_t));
    total_count_by_entity_status_local_var->_library_owned = 1;
    total_count_by_entity_status_local_var->active = active;
    total_count_by_entity_status_local_var->archived = archived;
    total_count_by_entity_status_local_var->paused = paused;
    return total_count_by_entity_status_local_var;
}

__attribute__((deprecated)) total_count_by_entity_status_t *total_count_by_entity_status_create(
    int *active,
    int *archived,
    int *paused
    ) {
    int *active_copy = NULL;
    if (active) {
        active_copy = malloc(sizeof(int));
        if (active_copy) *active_copy = *active;
    }
    int *archived_copy = NULL;
    if (archived) {
        archived_copy = malloc(sizeof(int));
        if (archived_copy) *archived_copy = *archived;
    }
    int *paused_copy = NULL;
    if (paused) {
        paused_copy = malloc(sizeof(int));
        if (paused_copy) *paused_copy = *paused;
    }
    total_count_by_entity_status_t *result = total_count_by_entity_status_create_internal (
        active_copy,
        archived_copy,
        paused_copy
        );
    if (!result) {
        free(active_copy);
        free(archived_copy);
        free(paused_copy);
    }
    return result;
}

void total_count_by_entity_status_free(total_count_by_entity_status_t *total_count_by_entity_status) {
    if(NULL == total_count_by_entity_status){
        return ;
    }
    if(total_count_by_entity_status->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "total_count_by_entity_status_free");
        return ;
    }
    listEntry_t *listEntry;
    if (total_count_by_entity_status->active) {
        free(total_count_by_entity_status->active);
        total_count_by_entity_status->active = NULL;
    }
    if (total_count_by_entity_status->archived) {
        free(total_count_by_entity_status->archived);
        total_count_by_entity_status->archived = NULL;
    }
    if (total_count_by_entity_status->paused) {
        free(total_count_by_entity_status->paused);
        total_count_by_entity_status->paused = NULL;
    }
    free(total_count_by_entity_status);
}

cJSON *total_count_by_entity_status_convertToJSON(total_count_by_entity_status_t *total_count_by_entity_status) {
    cJSON *item = cJSON_CreateObject();

    // total_count_by_entity_status->active
    if(total_count_by_entity_status->active) {
    if(cJSON_AddNumberToObject(item, "ACTIVE", *total_count_by_entity_status->active) == NULL) {
    goto fail; //Numeric
    }
    }


    // total_count_by_entity_status->archived
    if(total_count_by_entity_status->archived) {
    if(cJSON_AddNumberToObject(item, "ARCHIVED", *total_count_by_entity_status->archived) == NULL) {
    goto fail; //Numeric
    }
    }


    // total_count_by_entity_status->paused
    if(total_count_by_entity_status->paused) {
    if(cJSON_AddNumberToObject(item, "PAUSED", *total_count_by_entity_status->paused) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

total_count_by_entity_status_t *total_count_by_entity_status_parseFromJSON(cJSON *total_count_by_entity_statusJSON){

    total_count_by_entity_status_t *total_count_by_entity_status_local_var = NULL;

    // define the local variable for total_count_by_entity_status->active
    int *active_local_var = NULL;

    // define the local variable for total_count_by_entity_status->archived
    int *archived_local_var = NULL;

    // define the local variable for total_count_by_entity_status->paused
    int *paused_local_var = NULL;

    // total_count_by_entity_status->active
    cJSON *active = cJSON_GetObjectItemCaseSensitive(total_count_by_entity_statusJSON, "ACTIVE");
    if (cJSON_IsNull(active)) {
        active = NULL;
    }
    if (active) { 
    if(!cJSON_IsNumber(active))
    {
    goto end; //Numeric
    }
    active_local_var = malloc(sizeof(int));
    if(!active_local_var)
    {
        goto end;
    }
    *active_local_var = active->valuedouble;
    }

    // total_count_by_entity_status->archived
    cJSON *archived = cJSON_GetObjectItemCaseSensitive(total_count_by_entity_statusJSON, "ARCHIVED");
    if (cJSON_IsNull(archived)) {
        archived = NULL;
    }
    if (archived) { 
    if(!cJSON_IsNumber(archived))
    {
    goto end; //Numeric
    }
    archived_local_var = malloc(sizeof(int));
    if(!archived_local_var)
    {
        goto end;
    }
    *archived_local_var = archived->valuedouble;
    }

    // total_count_by_entity_status->paused
    cJSON *paused = cJSON_GetObjectItemCaseSensitive(total_count_by_entity_statusJSON, "PAUSED");
    if (cJSON_IsNull(paused)) {
        paused = NULL;
    }
    if (paused) { 
    if(!cJSON_IsNumber(paused))
    {
    goto end; //Numeric
    }
    paused_local_var = malloc(sizeof(int));
    if(!paused_local_var)
    {
        goto end;
    }
    *paused_local_var = paused->valuedouble;
    }



    total_count_by_entity_status_local_var = total_count_by_entity_status_create_internal (
        active_local_var,
        archived_local_var,
        paused_local_var
        );

    if (!total_count_by_entity_status_local_var) {
        goto end;
    }

    return total_count_by_entity_status_local_var;
end:
    if (active_local_var) {
        free(active_local_var);
        active_local_var = NULL;
    }
    if (archived_local_var) {
        free(archived_local_var);
        archived_local_var = NULL;
    }
    if (paused_local_var) {
        free(paused_local_var);
        paused_local_var = NULL;
    }
    return NULL;

}
