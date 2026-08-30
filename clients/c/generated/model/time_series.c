#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "time_series.h"



static time_series_t *time_series_create_internal(
    char *date
    ) {
    time_series_t *time_series_local_var = malloc(sizeof(time_series_t));
    if (!time_series_local_var) {
        return NULL;
    }
    memset(time_series_local_var, 0, sizeof(time_series_t));
    time_series_local_var->_library_owned = 1;
    time_series_local_var->date = date;
    return time_series_local_var;
}

__attribute__((deprecated)) time_series_t *time_series_create(
    char *date
    ) {
    time_series_t *result = time_series_create_internal (
        date
        );
    if (!result) {
    }
    return result;
}

void time_series_free(time_series_t *time_series) {
    if(NULL == time_series){
        return ;
    }
    if(time_series->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "time_series_free");
        return ;
    }
    listEntry_t *listEntry;
    if (time_series->date) {
        free(time_series->date);
        time_series->date = NULL;
    }
    free(time_series);
}

cJSON *time_series_convertToJSON(time_series_t *time_series) {
    cJSON *item = cJSON_CreateObject();

    // time_series->date
    if(time_series->date) {
    if(cJSON_AddStringToObject(item, "date", time_series->date) == NULL) {
    goto fail; //Date
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

time_series_t *time_series_parseFromJSON(cJSON *time_seriesJSON){

    time_series_t *time_series_local_var = NULL;

    char *date_local_str = NULL;

    // time_series->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(time_seriesJSON, "date");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    if (date) date_local_str = strdup(date->valuestring);

    time_series_local_var = time_series_create_internal (
        date_local_str
        );

    if (!time_series_local_var) {
        goto end;
    }

    return time_series_local_var;
end:
    if (date_local_str) {
        free(date_local_str);
        date_local_str = NULL;
    }
    return NULL;

}
