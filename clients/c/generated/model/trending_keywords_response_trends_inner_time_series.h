/*
 * trending_keywords_response_trends_inner_time_series.h
 *
 * A sequence of weekly observations of the relative search volume for this keyword over the past year.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.
 */

#ifndef _trending_keywords_response_trends_inner_time_series_H_
#define _trending_keywords_response_trends_inner_time_series_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trending_keywords_response_trends_inner_time_series_t trending_keywords_response_trends_inner_time_series_t;




typedef struct trending_keywords_response_trends_inner_time_series_t {
    char *date; //date

} trending_keywords_response_trends_inner_time_series_t;

trending_keywords_response_trends_inner_time_series_t *trending_keywords_response_trends_inner_time_series_create(
    char *date
);

void trending_keywords_response_trends_inner_time_series_free(trending_keywords_response_trends_inner_time_series_t *trending_keywords_response_trends_inner_time_series);

trending_keywords_response_trends_inner_time_series_t *trending_keywords_response_trends_inner_time_series_parseFromJSON(cJSON *trending_keywords_response_trends_inner_time_seriesJSON);

cJSON *trending_keywords_response_trends_inner_time_series_convertToJSON(trending_keywords_response_trends_inner_time_series_t *trending_keywords_response_trends_inner_time_series);

#endif /* _trending_keywords_response_trends_inner_time_series_H_ */

