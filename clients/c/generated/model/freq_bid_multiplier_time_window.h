/*
 * freq_bid_multiplier_time_window.h
 *
 * The time window for frequency bid multipliers.
 */

#ifndef _freq_bid_multiplier_time_window_H_
#define _freq_bid_multiplier_time_window_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct freq_bid_multiplier_time_window_t freq_bid_multiplier_time_window_t;


// Enum  for freq_bid_multiplier_time_window

typedef enum { pinterest_rest_api_freq_bid_multiplier_time_window__NULL = 0, pinterest_rest_api_freq_bid_multiplier_time_window__WEEK, pinterest_rest_api_freq_bid_multiplier_time_window__MONTH } pinterest_rest_api_freq_bid_multiplier_time_window__e;

char* freq_bid_multiplier_time_window_freq_bid_multiplier_time_window_ToString(pinterest_rest_api_freq_bid_multiplier_time_window__e freq_bid_multiplier_time_window);

pinterest_rest_api_freq_bid_multiplier_time_window__e freq_bid_multiplier_time_window_freq_bid_multiplier_time_window_FromString(char* freq_bid_multiplier_time_window);

cJSON *freq_bid_multiplier_time_window_convertToJSON(pinterest_rest_api_freq_bid_multiplier_time_window__e freq_bid_multiplier_time_window);

pinterest_rest_api_freq_bid_multiplier_time_window__e freq_bid_multiplier_time_window_parseFromJSON(cJSON *freq_bid_multiplier_time_windowJSON);

#endif /* _freq_bid_multiplier_time_window_H_ */

