/*
 * pin_filter.h
 *
 * 
 */

#ifndef _pin_filter_H_
#define _pin_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_filter_t pin_filter_t;


// Enum  for pin_filter

typedef enum { pinterest_rest_api_pin_filter__NULL = 0, pinterest_rest_api_pin_filter__exclude_native, pinterest_rest_api_pin_filter__exclude_repins, pinterest_rest_api_pin_filter__has_been_promoted } pinterest_rest_api_pin_filter__e;

char* pin_filter_pin_filter_ToString(pinterest_rest_api_pin_filter__e pin_filter);

pinterest_rest_api_pin_filter__e pin_filter_pin_filter_FromString(char* pin_filter);

cJSON *pin_filter_convertToJSON(pinterest_rest_api_pin_filter__e pin_filter);

pinterest_rest_api_pin_filter__e pin_filter_parseFromJSON(cJSON *pin_filterJSON);

#endif /* _pin_filter_H_ */

