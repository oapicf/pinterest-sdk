#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dynamic_titles_get_status.h"



static dynamic_titles_get_status_t *dynamic_titles_get_status_create_internal(
    int *generated_count,
    int *is_ready,
    int *reviewed_count
    ) {
    dynamic_titles_get_status_t *dynamic_titles_get_status_local_var = malloc(sizeof(dynamic_titles_get_status_t));
    if (!dynamic_titles_get_status_local_var) {
        return NULL;
    }
    memset(dynamic_titles_get_status_local_var, 0, sizeof(dynamic_titles_get_status_t));
    dynamic_titles_get_status_local_var->_library_owned = 1;
    dynamic_titles_get_status_local_var->generated_count = generated_count;
    dynamic_titles_get_status_local_var->is_ready = is_ready;
    dynamic_titles_get_status_local_var->reviewed_count = reviewed_count;
    return dynamic_titles_get_status_local_var;
}

__attribute__((deprecated)) dynamic_titles_get_status_t *dynamic_titles_get_status_create(
    int *generated_count,
    int *is_ready,
    int *reviewed_count
    ) {
    int *generated_count_copy = NULL;
    if (generated_count) {
        generated_count_copy = malloc(sizeof(int));
        if (generated_count_copy) *generated_count_copy = *generated_count;
    }
    int *is_ready_copy = NULL;
    if (is_ready) {
        is_ready_copy = malloc(sizeof(int));
        if (is_ready_copy) *is_ready_copy = *is_ready;
    }
    int *reviewed_count_copy = NULL;
    if (reviewed_count) {
        reviewed_count_copy = malloc(sizeof(int));
        if (reviewed_count_copy) *reviewed_count_copy = *reviewed_count;
    }
    dynamic_titles_get_status_t *result = dynamic_titles_get_status_create_internal (
        generated_count_copy,
        is_ready_copy,
        reviewed_count_copy
        );
    if (!result) {
        free(generated_count_copy);
        free(is_ready_copy);
        free(reviewed_count_copy);
    }
    return result;
}

void dynamic_titles_get_status_free(dynamic_titles_get_status_t *dynamic_titles_get_status) {
    if(NULL == dynamic_titles_get_status){
        return ;
    }
    if(dynamic_titles_get_status->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "dynamic_titles_get_status_free");
        return ;
    }
    listEntry_t *listEntry;
    if (dynamic_titles_get_status->generated_count) {
        free(dynamic_titles_get_status->generated_count);
        dynamic_titles_get_status->generated_count = NULL;
    }
    if (dynamic_titles_get_status->is_ready) {
        free(dynamic_titles_get_status->is_ready);
        dynamic_titles_get_status->is_ready = NULL;
    }
    if (dynamic_titles_get_status->reviewed_count) {
        free(dynamic_titles_get_status->reviewed_count);
        dynamic_titles_get_status->reviewed_count = NULL;
    }
    free(dynamic_titles_get_status);
}

cJSON *dynamic_titles_get_status_convertToJSON(dynamic_titles_get_status_t *dynamic_titles_get_status) {
    cJSON *item = cJSON_CreateObject();

    // dynamic_titles_get_status->generated_count
    if(dynamic_titles_get_status->generated_count) {
    if(cJSON_AddNumberToObject(item, "generated_count", *dynamic_titles_get_status->generated_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // dynamic_titles_get_status->is_ready
    if(dynamic_titles_get_status->is_ready) {
    if(cJSON_AddBoolToObject(item, "is_ready", *dynamic_titles_get_status->is_ready) == NULL) {
    goto fail; //Bool
    }
    }


    // dynamic_titles_get_status->reviewed_count
    if(dynamic_titles_get_status->reviewed_count) {
    if(cJSON_AddNumberToObject(item, "reviewed_count", *dynamic_titles_get_status->reviewed_count) == NULL) {
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

dynamic_titles_get_status_t *dynamic_titles_get_status_parseFromJSON(cJSON *dynamic_titles_get_statusJSON){

    dynamic_titles_get_status_t *dynamic_titles_get_status_local_var = NULL;

    // define the local variable for dynamic_titles_get_status->generated_count
    int *generated_count_local_var = NULL;

    // define the local variable for dynamic_titles_get_status->is_ready
    int *is_ready_local_var = NULL;

    // define the local variable for dynamic_titles_get_status->reviewed_count
    int *reviewed_count_local_var = NULL;

    // dynamic_titles_get_status->generated_count
    cJSON *generated_count = cJSON_GetObjectItemCaseSensitive(dynamic_titles_get_statusJSON, "generated_count");
    if (cJSON_IsNull(generated_count)) {
        generated_count = NULL;
    }
    if (generated_count) { 
    if(!cJSON_IsNumber(generated_count))
    {
    goto end; //Numeric
    }
    generated_count_local_var = malloc(sizeof(int));
    if(!generated_count_local_var)
    {
        goto end;
    }
    *generated_count_local_var = generated_count->valuedouble;
    }

    // dynamic_titles_get_status->is_ready
    cJSON *is_ready = cJSON_GetObjectItemCaseSensitive(dynamic_titles_get_statusJSON, "is_ready");
    if (cJSON_IsNull(is_ready)) {
        is_ready = NULL;
    }
    if (is_ready) { 
    if(!cJSON_IsBool(is_ready))
    {
    goto end; //Bool
    }
    is_ready_local_var = malloc(sizeof(int));
    if(!is_ready_local_var)
    {
        goto end;
    }
    *is_ready_local_var = is_ready->valueint;
    }

    // dynamic_titles_get_status->reviewed_count
    cJSON *reviewed_count = cJSON_GetObjectItemCaseSensitive(dynamic_titles_get_statusJSON, "reviewed_count");
    if (cJSON_IsNull(reviewed_count)) {
        reviewed_count = NULL;
    }
    if (reviewed_count) { 
    if(!cJSON_IsNumber(reviewed_count))
    {
    goto end; //Numeric
    }
    reviewed_count_local_var = malloc(sizeof(int));
    if(!reviewed_count_local_var)
    {
        goto end;
    }
    *reviewed_count_local_var = reviewed_count->valuedouble;
    }



    dynamic_titles_get_status_local_var = dynamic_titles_get_status_create_internal (
        generated_count_local_var,
        is_ready_local_var,
        reviewed_count_local_var
        );

    if (!dynamic_titles_get_status_local_var) {
        goto end;
    }

    return dynamic_titles_get_status_local_var;
end:
    if (generated_count_local_var) {
        free(generated_count_local_var);
        generated_count_local_var = NULL;
    }
    if (is_ready_local_var) {
        free(is_ready_local_var);
        is_ready_local_var = NULL;
    }
    if (reviewed_count_local_var) {
        free(reviewed_count_local_var);
        reviewed_count_local_var = NULL;
    }
    return NULL;

}
