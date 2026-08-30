#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "frequency_goal_metadata.h"



static frequency_goal_metadata_t *frequency_goal_metadata_create_internal(
    int *frequency,
    pinterest_rest_api_frequency_goal_metadata_timerange__e timerange
    ) {
    frequency_goal_metadata_t *frequency_goal_metadata_local_var = malloc(sizeof(frequency_goal_metadata_t));
    if (!frequency_goal_metadata_local_var) {
        return NULL;
    }
    memset(frequency_goal_metadata_local_var, 0, sizeof(frequency_goal_metadata_t));
    frequency_goal_metadata_local_var->_library_owned = 1;
    frequency_goal_metadata_local_var->frequency = frequency;
    frequency_goal_metadata_local_var->timerange = timerange;
    return frequency_goal_metadata_local_var;
}

__attribute__((deprecated)) frequency_goal_metadata_t *frequency_goal_metadata_create(
    int *frequency,
    pinterest_rest_api_frequency_goal_metadata_timerange__e timerange
    ) {
    int *frequency_copy = NULL;
    if (frequency) {
        frequency_copy = malloc(sizeof(int));
        if (frequency_copy) *frequency_copy = *frequency;
    }
    frequency_goal_metadata_t *result = frequency_goal_metadata_create_internal (
        frequency_copy,
        timerange
        );
    if (!result) {
        free(frequency_copy);
    }
    return result;
}

void frequency_goal_metadata_free(frequency_goal_metadata_t *frequency_goal_metadata) {
    if(NULL == frequency_goal_metadata){
        return ;
    }
    if(frequency_goal_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "frequency_goal_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (frequency_goal_metadata->frequency) {
        free(frequency_goal_metadata->frequency);
        frequency_goal_metadata->frequency = NULL;
    }
    free(frequency_goal_metadata);
}

cJSON *frequency_goal_metadata_convertToJSON(frequency_goal_metadata_t *frequency_goal_metadata) {
    cJSON *item = cJSON_CreateObject();

    // frequency_goal_metadata->frequency
    if(frequency_goal_metadata->frequency) {
    if(cJSON_AddNumberToObject(item, "frequency", *frequency_goal_metadata->frequency) == NULL) {
    goto fail; //Numeric
    }
    }


    // frequency_goal_metadata->timerange
    if(frequency_goal_metadata->timerange != pinterest_rest_api_frequency_goal_metadata_timerange__NULL) {
    cJSON *timerange_local_JSON = frequency_goal_metadata_timerange_convertToJSON(frequency_goal_metadata->timerange);
    if(timerange_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "timerange", timerange_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

frequency_goal_metadata_t *frequency_goal_metadata_parseFromJSON(cJSON *frequency_goal_metadataJSON){

    frequency_goal_metadata_t *frequency_goal_metadata_local_var = NULL;

    // define the local variable for frequency_goal_metadata->frequency
    int *frequency_local_var = NULL;

    // define the local variable for frequency_goal_metadata->timerange
    pinterest_rest_api_frequency_goal_metadata_timerange__e timerange_local_nonprim = 0;

    // frequency_goal_metadata->frequency
    cJSON *frequency = cJSON_GetObjectItemCaseSensitive(frequency_goal_metadataJSON, "frequency");
    if (cJSON_IsNull(frequency)) {
        frequency = NULL;
    }
    if (frequency) { 
    if(!cJSON_IsNumber(frequency))
    {
    goto end; //Numeric
    }
    frequency_local_var = malloc(sizeof(int));
    if(!frequency_local_var)
    {
        goto end;
    }
    *frequency_local_var = frequency->valuedouble;
    }

    // frequency_goal_metadata->timerange
    cJSON *timerange = cJSON_GetObjectItemCaseSensitive(frequency_goal_metadataJSON, "timerange");
    if (cJSON_IsNull(timerange)) {
        timerange = NULL;
    }
    if (timerange) { 
    timerange_local_nonprim = frequency_goal_metadata_timerange_parseFromJSON(timerange); //custom
    }



    frequency_goal_metadata_local_var = frequency_goal_metadata_create_internal (
        frequency_local_var,
        timerange ? timerange_local_nonprim : 0
        );

    if (!frequency_goal_metadata_local_var) {
        goto end;
    }

    return frequency_goal_metadata_local_var;
end:
    if (frequency_local_var) {
        free(frequency_local_var);
        frequency_local_var = NULL;
    }
    if (timerange_local_nonprim) {
        timerange_local_nonprim = 0;
    }
    return NULL;

}
