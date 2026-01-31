/*
 * pinterest_lib_pagination_order.h
 *
 * 
 */

#ifndef _pinterest_lib_pagination_order_H_
#define _pinterest_lib_pagination_order_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pinterest_lib_pagination_order_t pinterest_lib_pagination_order_t;


// Enum  for pinterest_lib_pagination_order

typedef enum { pinterest_rest_api_pinterest_lib_pagination_order__NULL = 0, pinterest_rest_api_pinterest_lib_pagination_order__ASCENDING, pinterest_rest_api_pinterest_lib_pagination_order__DESCENDING } pinterest_rest_api_pinterest_lib_pagination_order__e;

char* pinterest_lib_pagination_order_pinterest_lib_pagination_order_ToString(pinterest_rest_api_pinterest_lib_pagination_order__e pinterest_lib_pagination_order);

pinterest_rest_api_pinterest_lib_pagination_order__e pinterest_lib_pagination_order_pinterest_lib_pagination_order_FromString(char* pinterest_lib_pagination_order);

cJSON *pinterest_lib_pagination_order_convertToJSON(pinterest_rest_api_pinterest_lib_pagination_order__e pinterest_lib_pagination_order);

pinterest_rest_api_pinterest_lib_pagination_order__e pinterest_lib_pagination_order_parseFromJSON(cJSON *pinterest_lib_pagination_orderJSON);

#endif /* _pinterest_lib_pagination_order_H_ */

