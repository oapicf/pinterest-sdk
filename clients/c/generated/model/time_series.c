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
    time_series_local_var->date = date;

    time_series_local_var->_library_owned = 1;
    return time_series_local_var;
}

__attribute__((deprecated)) time_series_t *time_series_create(
    char *date
    ) {
    return time_series_create_internal (
        date
        );
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


    time_series_local_var = time_series_create_internal (
        date ? strdup(date->valuestring) : NULL
        );

    return time_series_local_var;
end:
    return NULL;

}
