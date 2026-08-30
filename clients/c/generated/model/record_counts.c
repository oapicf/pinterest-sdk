#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "record_counts.h"



static record_counts_t *record_counts_create_internal(
    int *invalid,
    int *processed,
    int *valid
    ) {
    record_counts_t *record_counts_local_var = malloc(sizeof(record_counts_t));
    if (!record_counts_local_var) {
        return NULL;
    }
    memset(record_counts_local_var, 0, sizeof(record_counts_t));
    record_counts_local_var->_library_owned = 1;
    record_counts_local_var->invalid = invalid;
    record_counts_local_var->processed = processed;
    record_counts_local_var->valid = valid;
    return record_counts_local_var;
}

__attribute__((deprecated)) record_counts_t *record_counts_create(
    int *invalid,
    int *processed,
    int *valid
    ) {
    int *invalid_copy = NULL;
    if (invalid) {
        invalid_copy = malloc(sizeof(int));
        if (invalid_copy) *invalid_copy = *invalid;
    }
    int *processed_copy = NULL;
    if (processed) {
        processed_copy = malloc(sizeof(int));
        if (processed_copy) *processed_copy = *processed;
    }
    int *valid_copy = NULL;
    if (valid) {
        valid_copy = malloc(sizeof(int));
        if (valid_copy) *valid_copy = *valid;
    }
    record_counts_t *result = record_counts_create_internal (
        invalid_copy,
        processed_copy,
        valid_copy
        );
    if (!result) {
        free(invalid_copy);
        free(processed_copy);
        free(valid_copy);
    }
    return result;
}

void record_counts_free(record_counts_t *record_counts) {
    if(NULL == record_counts){
        return ;
    }
    if(record_counts->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "record_counts_free");
        return ;
    }
    listEntry_t *listEntry;
    if (record_counts->invalid) {
        free(record_counts->invalid);
        record_counts->invalid = NULL;
    }
    if (record_counts->processed) {
        free(record_counts->processed);
        record_counts->processed = NULL;
    }
    if (record_counts->valid) {
        free(record_counts->valid);
        record_counts->valid = NULL;
    }
    free(record_counts);
}

cJSON *record_counts_convertToJSON(record_counts_t *record_counts) {
    cJSON *item = cJSON_CreateObject();

    // record_counts->invalid
    if (!record_counts->invalid) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "invalid", *record_counts->invalid) == NULL) {
    goto fail; //Numeric
    }


    // record_counts->processed
    if (!record_counts->processed) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "processed", *record_counts->processed) == NULL) {
    goto fail; //Numeric
    }


    // record_counts->valid
    if (!record_counts->valid) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "valid", *record_counts->valid) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

record_counts_t *record_counts_parseFromJSON(cJSON *record_countsJSON){

    record_counts_t *record_counts_local_var = NULL;

    // define the local variable for record_counts->invalid
    int *invalid_local_var = NULL;

    // define the local variable for record_counts->processed
    int *processed_local_var = NULL;

    // define the local variable for record_counts->valid
    int *valid_local_var = NULL;

    // record_counts->invalid
    cJSON *invalid = cJSON_GetObjectItemCaseSensitive(record_countsJSON, "invalid");
    if (cJSON_IsNull(invalid)) {
        invalid = NULL;
    }
    if (!invalid) {
        goto end;
    }

    
    if(!cJSON_IsNumber(invalid))
    {
    goto end; //Numeric
    }
    invalid_local_var = malloc(sizeof(int));
    if(!invalid_local_var)
    {
        goto end;
    }
    *invalid_local_var = invalid->valuedouble;

    // record_counts->processed
    cJSON *processed = cJSON_GetObjectItemCaseSensitive(record_countsJSON, "processed");
    if (cJSON_IsNull(processed)) {
        processed = NULL;
    }
    if (!processed) {
        goto end;
    }

    
    if(!cJSON_IsNumber(processed))
    {
    goto end; //Numeric
    }
    processed_local_var = malloc(sizeof(int));
    if(!processed_local_var)
    {
        goto end;
    }
    *processed_local_var = processed->valuedouble;

    // record_counts->valid
    cJSON *valid = cJSON_GetObjectItemCaseSensitive(record_countsJSON, "valid");
    if (cJSON_IsNull(valid)) {
        valid = NULL;
    }
    if (!valid) {
        goto end;
    }

    
    if(!cJSON_IsNumber(valid))
    {
    goto end; //Numeric
    }
    valid_local_var = malloc(sizeof(int));
    if(!valid_local_var)
    {
        goto end;
    }
    *valid_local_var = valid->valuedouble;



    record_counts_local_var = record_counts_create_internal (
        invalid_local_var,
        processed_local_var,
        valid_local_var
        );

    if (!record_counts_local_var) {
        goto end;
    }

    return record_counts_local_var;
end:
    if (invalid_local_var) {
        free(invalid_local_var);
        invalid_local_var = NULL;
    }
    if (processed_local_var) {
        free(processed_local_var);
        processed_local_var = NULL;
    }
    if (valid_local_var) {
        free(valid_local_var);
        valid_local_var = NULL;
    }
    return NULL;

}
