/*
 * lookback_period_options.h
 *
 * Days in lookback window in the GET Conversion EQS response.
 */

#ifndef _lookback_period_options_H_
#define _lookback_period_options_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lookback_period_options_t lookback_period_options_t;


// Enum  for lookback_period_options

typedef enum { pinterest_rest_api_lookback_period_options__NULL = 0, pinterest_rest_api_lookback_period_options___1d, pinterest_rest_api_lookback_period_options___14d } pinterest_rest_api_lookback_period_options__e;

char* lookback_period_options_lookback_period_options_ToString(pinterest_rest_api_lookback_period_options__e lookback_period_options);

pinterest_rest_api_lookback_period_options__e lookback_period_options_lookback_period_options_FromString(char* lookback_period_options);

cJSON *lookback_period_options_convertToJSON(pinterest_rest_api_lookback_period_options__e lookback_period_options);

pinterest_rest_api_lookback_period_options__e lookback_period_options_parseFromJSON(cJSON *lookback_period_optionsJSON);

#endif /* _lookback_period_options_H_ */

