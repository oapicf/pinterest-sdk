/*
 * trending_keywords_response_trends_inner.h
 *
 * 
 */

#ifndef _trending_keywords_response_trends_inner_H_
#define _trending_keywords_response_trends_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trending_keywords_response_trends_inner_t trending_keywords_response_trends_inner_t;

#include "trending_keywords_response_trends_inner_time_series.h"



typedef struct trending_keywords_response_trends_inner_t {
    char *keyword; // string
    int pct_growth_wow; //numeric
    int pct_growth_mom; //numeric
    int pct_growth_yoy; //numeric
    trending_keywords_response_trends_inner_time_series_t *time_series; // custom

} trending_keywords_response_trends_inner_t;

trending_keywords_response_trends_inner_t *trending_keywords_response_trends_inner_create(
    char *keyword,
    int pct_growth_wow,
    int pct_growth_mom,
    int pct_growth_yoy,
    trending_keywords_response_trends_inner_time_series_t *time_series
);

void trending_keywords_response_trends_inner_free(trending_keywords_response_trends_inner_t *trending_keywords_response_trends_inner);

trending_keywords_response_trends_inner_t *trending_keywords_response_trends_inner_parseFromJSON(cJSON *trending_keywords_response_trends_innerJSON);

cJSON *trending_keywords_response_trends_inner_convertToJSON(trending_keywords_response_trends_inner_t *trending_keywords_response_trends_inner);

#endif /* _trending_keywords_response_trends_inner_H_ */

