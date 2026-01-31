/*
 * predicted_time_series.h
 *
 * A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical &#x60;time_series&#x60;, normalization is applied independently to the predicted time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative predicted volume between keywords.&lt;br /&gt; **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of &#x60;2024-01-07&#x60; would include predicted searches for the week ending on &#x60;2024-01-07&#x60;.
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

