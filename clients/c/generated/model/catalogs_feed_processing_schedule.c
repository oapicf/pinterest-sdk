#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_processing_schedule.h"



static catalogs_feed_processing_schedule_t *catalogs_feed_processing_schedule_create_internal(
    char *time,
    catalogs_feed_processing_schedule_timezone_t *timezone
    ) {
    catalogs_feed_processing_schedule_t *catalogs_feed_processing_schedule_local_var = malloc(sizeof(catalogs_feed_processing_schedule_t));
    if (!catalogs_feed_processing_schedule_local_var) {
        return NULL;
    }
    memset(catalogs_feed_processing_schedule_local_var, 0, sizeof(catalogs_feed_processing_schedule_t));
    catalogs_feed_processing_schedule_local_var->_library_owned = 1;
    catalogs_feed_processing_schedule_local_var->time = time;
    catalogs_feed_processing_schedule_local_var->timezone = timezone;
    return catalogs_feed_processing_schedule_local_var;
}

__attribute__((deprecated)) catalogs_feed_processing_schedule_t *catalogs_feed_processing_schedule_create(
    char *time,
    catalogs_feed_processing_schedule_timezone_t *timezone
    ) {
    catalogs_feed_processing_schedule_t *result = catalogs_feed_processing_schedule_create_internal (
        time,
        timezone
        );
    if (!result) {
    }
    return result;
}

void catalogs_feed_processing_schedule_free(catalogs_feed_processing_schedule_t *catalogs_feed_processing_schedule) {
    if(NULL == catalogs_feed_processing_schedule){
        return ;
    }
    if(catalogs_feed_processing_schedule->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feed_processing_schedule_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_processing_schedule->time) {
        free(catalogs_feed_processing_schedule->time);
        catalogs_feed_processing_schedule->time = NULL;
    }
    if (catalogs_feed_processing_schedule->timezone) {
        catalogs_feed_processing_schedule_timezone_free(catalogs_feed_processing_schedule->timezone);
        catalogs_feed_processing_schedule->timezone = NULL;
    }
    free(catalogs_feed_processing_schedule);
}

cJSON *catalogs_feed_processing_schedule_convertToJSON(catalogs_feed_processing_schedule_t *catalogs_feed_processing_schedule) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_processing_schedule->time
    if (!catalogs_feed_processing_schedule->time) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "time", catalogs_feed_processing_schedule->time) == NULL) {
    goto fail; //String
    }


    // catalogs_feed_processing_schedule->timezone
    if (!catalogs_feed_processing_schedule->timezone) {
        goto fail;
    }
    cJSON *timezone_local_JSON = catalogs_feed_processing_schedule_timezone_convertToJSON(catalogs_feed_processing_schedule->timezone);
    if(timezone_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "timezone", timezone_local_JSON);
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

catalogs_feed_processing_schedule_t *catalogs_feed_processing_schedule_parseFromJSON(cJSON *catalogs_feed_processing_scheduleJSON){

    catalogs_feed_processing_schedule_t *catalogs_feed_processing_schedule_local_var = NULL;

    char *time_local_str = NULL;

    // define the local variable for catalogs_feed_processing_schedule->timezone
    catalogs_feed_processing_schedule_timezone_t *timezone_local_nonprim = NULL;

    // catalogs_feed_processing_schedule->time
    cJSON *time = cJSON_GetObjectItemCaseSensitive(catalogs_feed_processing_scheduleJSON, "time");
    if (cJSON_IsNull(time)) {
        time = NULL;
    }
    if (!time) {
        goto end;
    }

    
    if(!cJSON_IsString(time))
    {
    goto end; //String
    }

    // catalogs_feed_processing_schedule->timezone
    cJSON *timezone = cJSON_GetObjectItemCaseSensitive(catalogs_feed_processing_scheduleJSON, "timezone");
    if (cJSON_IsNull(timezone)) {
        timezone = NULL;
    }
    if (!timezone) {
        goto end;
    }

    
    timezone_local_nonprim = catalogs_feed_processing_schedule_timezone_parseFromJSON(timezone); //custom


    if (time && !cJSON_IsNull(time)) time_local_str = strdup(time->valuestring);

    catalogs_feed_processing_schedule_local_var = catalogs_feed_processing_schedule_create_internal (
        time_local_str,
        timezone_local_nonprim
        );

    if (!catalogs_feed_processing_schedule_local_var) {
        goto end;
    }

    return catalogs_feed_processing_schedule_local_var;
end:
    if (time_local_str) {
        free(time_local_str);
        time_local_str = NULL;
    }
    if (timezone_local_nonprim) {
        catalogs_feed_processing_schedule_timezone_free(timezone_local_nonprim);
        timezone_local_nonprim = NULL;
    }
    return NULL;

}
