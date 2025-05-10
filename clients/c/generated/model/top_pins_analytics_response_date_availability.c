#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "top_pins_analytics_response_date_availability.h"



static top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability_create_internal(
    double latest_available_timestamp,
    int is_realtime
    ) {
    top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability_local_var = malloc(sizeof(top_pins_analytics_response_date_availability_t));
    if (!top_pins_analytics_response_date_availability_local_var) {
        return NULL;
    }
    top_pins_analytics_response_date_availability_local_var->latest_available_timestamp = latest_available_timestamp;
    top_pins_analytics_response_date_availability_local_var->is_realtime = is_realtime;

    top_pins_analytics_response_date_availability_local_var->_library_owned = 1;
    return top_pins_analytics_response_date_availability_local_var;
}

__attribute__((deprecated)) top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability_create(
    double latest_available_timestamp,
    int is_realtime
    ) {
    return top_pins_analytics_response_date_availability_create_internal (
        latest_available_timestamp,
        is_realtime
        );
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
    free(top_pins_analytics_response_date_availability);
}

cJSON *top_pins_analytics_response_date_availability_convertToJSON(top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability) {
    cJSON *item = cJSON_CreateObject();

    // top_pins_analytics_response_date_availability->latest_available_timestamp
    if(top_pins_analytics_response_date_availability->latest_available_timestamp) {
    if(cJSON_AddNumberToObject(item, "latest_available_timestamp", top_pins_analytics_response_date_availability->latest_available_timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // top_pins_analytics_response_date_availability->is_realtime
    if(top_pins_analytics_response_date_availability->is_realtime) {
    if(cJSON_AddBoolToObject(item, "is_realtime", top_pins_analytics_response_date_availability->is_realtime) == NULL) {
    goto fail; //Bool
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
    }

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
    }


    top_pins_analytics_response_date_availability_local_var = top_pins_analytics_response_date_availability_create_internal (
        latest_available_timestamp ? latest_available_timestamp->valuedouble : 0,
        is_realtime ? is_realtime->valueint : 0
        );

    return top_pins_analytics_response_date_availability_local_var;
end:
    return NULL;

}
