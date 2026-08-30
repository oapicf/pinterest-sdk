#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "top_pins_analytics_response_date_availability.h"



static top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability_create_internal(
    int *is_realtime,
    double *latest_available_timestamp
    ) {
    top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability_local_var = malloc(sizeof(top_pins_analytics_response_date_availability_t));
    if (!top_pins_analytics_response_date_availability_local_var) {
        return NULL;
    }
    memset(top_pins_analytics_response_date_availability_local_var, 0, sizeof(top_pins_analytics_response_date_availability_t));
    top_pins_analytics_response_date_availability_local_var->_library_owned = 1;
    top_pins_analytics_response_date_availability_local_var->is_realtime = is_realtime;
    top_pins_analytics_response_date_availability_local_var->latest_available_timestamp = latest_available_timestamp;
    return top_pins_analytics_response_date_availability_local_var;
}

__attribute__((deprecated)) top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability_create(
    int *is_realtime,
    double *latest_available_timestamp
    ) {
    int *is_realtime_copy = NULL;
    if (is_realtime) {
        is_realtime_copy = malloc(sizeof(int));
        if (is_realtime_copy) *is_realtime_copy = *is_realtime;
    }
    double *latest_available_timestamp_copy = NULL;
    if (latest_available_timestamp) {
        latest_available_timestamp_copy = malloc(sizeof(double));
        if (latest_available_timestamp_copy) *latest_available_timestamp_copy = *latest_available_timestamp;
    }
    top_pins_analytics_response_date_availability_t *result = top_pins_analytics_response_date_availability_create_internal (
        is_realtime_copy,
        latest_available_timestamp_copy
        );
    if (!result) {
        free(is_realtime_copy);
        free(latest_available_timestamp_copy);
    }
    return result;
}

void top_pins_analytics_response_date_availability_free(top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability) {
    if(NULL == top_pins_analytics_response_date_availability){
        return ;
    }
    if(top_pins_analytics_response_date_availability->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "top_pins_analytics_response_date_availability_free");
        return ;
    }
    listEntry_t *listEntry;
    if (top_pins_analytics_response_date_availability->is_realtime) {
        free(top_pins_analytics_response_date_availability->is_realtime);
        top_pins_analytics_response_date_availability->is_realtime = NULL;
    }
    if (top_pins_analytics_response_date_availability->latest_available_timestamp) {
        free(top_pins_analytics_response_date_availability->latest_available_timestamp);
        top_pins_analytics_response_date_availability->latest_available_timestamp = NULL;
    }
    free(top_pins_analytics_response_date_availability);
}

cJSON *top_pins_analytics_response_date_availability_convertToJSON(top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability) {
    cJSON *item = cJSON_CreateObject();

    // top_pins_analytics_response_date_availability->is_realtime
    if(top_pins_analytics_response_date_availability->is_realtime) {
    if(cJSON_AddBoolToObject(item, "is_realtime", *top_pins_analytics_response_date_availability->is_realtime) == NULL) {
    goto fail; //Bool
    }
    }


    // top_pins_analytics_response_date_availability->latest_available_timestamp
    if(top_pins_analytics_response_date_availability->latest_available_timestamp) {
    if(cJSON_AddNumberToObject(item, "latest_available_timestamp", *top_pins_analytics_response_date_availability->latest_available_timestamp) == NULL) {
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

top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability_parseFromJSON(cJSON *top_pins_analytics_response_date_availabilityJSON){

    top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability_local_var = NULL;

    // define the local variable for top_pins_analytics_response_date_availability->is_realtime
    int *is_realtime_local_var = NULL;

    // define the local variable for top_pins_analytics_response_date_availability->latest_available_timestamp
    double *latest_available_timestamp_local_var = NULL;

    // top_pins_analytics_response_date_availability->is_realtime
    cJSON *is_realtime = cJSON_GetObjectItemCaseSensitive(top_pins_analytics_response_date_availabilityJSON, "is_realtime");
    if (cJSON_IsNull(is_realtime)) {
        is_realtime = NULL;
    }
    if (is_realtime) { 
    if(!cJSON_IsBool(is_realtime))
    {
    goto end; //Bool
    }
    is_realtime_local_var = malloc(sizeof(int));
    if(!is_realtime_local_var)
    {
        goto end;
    }
    *is_realtime_local_var = is_realtime->valueint;
    }

    // top_pins_analytics_response_date_availability->latest_available_timestamp
    cJSON *latest_available_timestamp = cJSON_GetObjectItemCaseSensitive(top_pins_analytics_response_date_availabilityJSON, "latest_available_timestamp");
    if (cJSON_IsNull(latest_available_timestamp)) {
        latest_available_timestamp = NULL;
    }
    if (latest_available_timestamp) { 
    if(!cJSON_IsNumber(latest_available_timestamp))
    {
    goto end; //Numeric
    }
    latest_available_timestamp_local_var = malloc(sizeof(double));
    if(!latest_available_timestamp_local_var)
    {
        goto end;
    }
    *latest_available_timestamp_local_var = latest_available_timestamp->valuedouble;
    }



    top_pins_analytics_response_date_availability_local_var = top_pins_analytics_response_date_availability_create_internal (
        is_realtime_local_var,
        latest_available_timestamp_local_var
        );

    if (!top_pins_analytics_response_date_availability_local_var) {
        goto end;
    }

    return top_pins_analytics_response_date_availability_local_var;
end:
    if (is_realtime_local_var) {
        free(is_realtime_local_var);
        is_realtime_local_var = NULL;
    }
    if (latest_available_timestamp_local_var) {
        free(latest_available_timestamp_local_var);
        latest_available_timestamp_local_var = NULL;
    }
    return NULL;

}
