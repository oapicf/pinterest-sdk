/*
 * time_series.h
 *
 * 
 */

#ifndef _time_series_H_
#define _time_series_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct time_series_t time_series_t;




typedef struct time_series_t {
    char *date; //date

    int _library_owned; // Is the library responsible for freeing this object?
} time_series_t;

__attribute__((deprecated)) time_series_t *time_series_create(
    char *date
);

void time_series_free(time_series_t *time_series);

time_series_t *time_series_parseFromJSON(cJSON *time_seriesJSON);

cJSON *time_series_convertToJSON(time_series_t *time_series);

#endif /* _time_series_H_ */

