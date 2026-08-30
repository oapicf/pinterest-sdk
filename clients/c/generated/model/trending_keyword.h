/*
 * trending_keyword.h
 *
 * 
 */

#ifndef _trending_keyword_H_
#define _trending_keyword_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trending_keyword_t trending_keyword_t;

#include "predicted_time_series.h"
#include "time_series.h"
#include "trending_keyword_demographics.h"



typedef struct trending_keyword_t {
    struct trending_keyword_demographics_t *demographics; //model
    int *has_prediction; //boolean
    char *keyword; // string
    int *pct_growth_mom; //numeric
    int *pct_growth_wow; //numeric
    int *pct_growth_yoy; //numeric
    predicted_time_series_t *predicted_time_series; // custom
    time_series_t *time_series; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} trending_keyword_t;

__attribute__((deprecated)) trending_keyword_t *trending_keyword_create(
    trending_keyword_demographics_t *demographics,
    int *has_prediction,
    char *keyword,
    int *pct_growth_mom,
    int *pct_growth_wow,
    int *pct_growth_yoy,
    predicted_time_series_t *predicted_time_series,
    time_series_t *time_series
);

void trending_keyword_free(trending_keyword_t *trending_keyword);

trending_keyword_t *trending_keyword_parseFromJSON(cJSON *trending_keywordJSON);

cJSON *trending_keyword_convertToJSON(trending_keyword_t *trending_keyword);

#endif /* _trending_keyword_H_ */

