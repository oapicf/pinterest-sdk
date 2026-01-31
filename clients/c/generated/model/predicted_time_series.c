#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "predicted_time_series.h"



static predicted_time_series_t *predicted_time_series_create_internal(
    char *date
    ) {
    predicted_time_series_t *predicted_time_series_local_var = malloc(sizeof(predicted_time_series_t));
    if (!predicted_time_series_local_var) {
        return NULL;
    }
    predicted_time_series_local_var->date = date;

    predicted_time_series_local_var->_library_owned = 1;
    return predicted_time_series_local_var;
}

__attribute__((deprecated)) predicted_time_series_t *predicted_time_series_create(
    char *date
    ) {
    return predicted_time_series_create_internal (
        date
        );
}

void predicted_time_series_free(predicted_time_series_t *predicted_time_series) {
    if(NULL == predicted_time_series){
        return ;
    }
    if(predicted_time_series->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "predicted_time_series_free");
        return ;
    }
    listEntry_t *listEntry;
    if (predicted_time_series->date) {
        free(predicted_time_series->date);
        predicted_time_series->date = NULL;
    }
    free(predicted_time_series);
}

cJSON *predicted_time_series_convertToJSON(predicted_time_series_t *predicted_time_series) {
    cJSON *item = cJSON_CreateObject();

    // predicted_time_series->date
    if(predicted_time_series->date) {
    if(cJSON_AddStringToObject(item, "date", predicted_time_series->date) == NULL) {
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

predicted_time_series_t *predicted_time_series_parseFromJSON(cJSON *predicted_time_seriesJSON){

    predicted_time_series_t *predicted_time_series_local_var = NULL;

    // predicted_time_series->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(predicted_time_seriesJSON, "date");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    predicted_time_series_local_var = predicted_time_series_create_internal (
        date ? strdup(date->valuestring) : NULL
        );

    return predicted_time_series_local_var;
end:
    return NULL;

}
