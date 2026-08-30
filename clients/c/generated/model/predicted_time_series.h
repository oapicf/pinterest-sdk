/*
 * predicted_time_series.h
 *
 * 
 */

#ifndef _predicted_time_series_H_
#define _predicted_time_series_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct predicted_time_series_t predicted_time_series_t;




typedef struct predicted_time_series_t {
    char *date; //date

    int _library_owned; // Is the library responsible for freeing this object?
} predicted_time_series_t;

__attribute__((deprecated)) predicted_time_series_t *predicted_time_series_create(
    char *date
);

void predicted_time_series_free(predicted_time_series_t *predicted_time_series);

predicted_time_series_t *predicted_time_series_parseFromJSON(cJSON *predicted_time_seriesJSON);

cJSON *predicted_time_series_convertToJSON(predicted_time_series_t *predicted_time_series);

#endif /* _predicted_time_series_H_ */

