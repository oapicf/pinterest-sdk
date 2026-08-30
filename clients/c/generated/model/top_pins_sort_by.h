/*
 * top_pins_sort_by.h
 *
 * Sort metric for top pins analytics.
 */

#ifndef _top_pins_sort_by_H_
#define _top_pins_sort_by_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct top_pins_sort_by_t top_pins_sort_by_t;


// Enum  for top_pins_sort_by

typedef enum { pinterest_rest_api_top_pins_sort_by__NULL = 0, pinterest_rest_api_top_pins_sort_by__ENGAGEMENT, pinterest_rest_api_top_pins_sort_by__SAVE, pinterest_rest_api_top_pins_sort_by__IMPRESSION, pinterest_rest_api_top_pins_sort_by__OUTBOUND_CLICK, pinterest_rest_api_top_pins_sort_by__PIN_CLICK } pinterest_rest_api_top_pins_sort_by__e;

char* top_pins_sort_by_top_pins_sort_by_ToString(pinterest_rest_api_top_pins_sort_by__e top_pins_sort_by);

pinterest_rest_api_top_pins_sort_by__e top_pins_sort_by_top_pins_sort_by_FromString(char* top_pins_sort_by);

cJSON *top_pins_sort_by_convertToJSON(pinterest_rest_api_top_pins_sort_by__e top_pins_sort_by);

pinterest_rest_api_top_pins_sort_by__e top_pins_sort_by_parseFromJSON(cJSON *top_pins_sort_byJSON);

#endif /* _top_pins_sort_by_H_ */

