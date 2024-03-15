/*
 * get_audiences_order_by.h
 *
 * 
 */

#ifndef _get_audiences_order_by_H_
#define _get_audiences_order_by_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_audiences_order_by_t get_audiences_order_by_t;


// Enum  for get_audiences_order_by

typedef enum { pinterest_rest_api_get_audiences_order_by__NULL = 0, pinterest_rest_api_get_audiences_order_by__NONE, pinterest_rest_api_get_audiences_order_by__ID, pinterest_rest_api_get_audiences_order_by__SIZE, pinterest_rest_api_get_audiences_order_by__CREATION_DATE, pinterest_rest_api_get_audiences_order_by__UPDATED_TIME, pinterest_rest_api_get_audiences_order_by__NAME, pinterest_rest_api_get_audiences_order_by__STATUS, pinterest_rest_api_get_audiences_order_by__TYPE } pinterest_rest_api_get_audiences_order_by__e;

char* get_audiences_order_by_get_audiences_order_by_ToString(pinterest_rest_api_get_audiences_order_by__e get_audiences_order_by);

pinterest_rest_api_get_audiences_order_by__e get_audiences_order_by_get_audiences_order_by_FromString(char* get_audiences_order_by);

//cJSON *get_audiences_order_by_get_audiences_order_by_convertToJSON(pinterest_rest_api_get_audiences_order_by__e get_audiences_order_by);

//pinterest_rest_api_get_audiences_order_by__e get_audiences_order_by_get_audiences_order_by_parseFromJSON(cJSON *get_audiences_order_byJSON);

#endif /* _get_audiences_order_by_H_ */

