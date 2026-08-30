/*
 * order.h
 *
 * 
 */

#ifndef _order_H_
#define _order_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_t order_t;


// Enum  for order

typedef enum { pinterest_rest_api_order__NULL = 0, pinterest_rest_api_order__ASCENDING, pinterest_rest_api_order__DESCENDING } pinterest_rest_api_order__e;

char* order_order_ToString(pinterest_rest_api_order__e order);

pinterest_rest_api_order__e order_order_FromString(char* order);

cJSON *order_convertToJSON(pinterest_rest_api_order__e order);

pinterest_rest_api_order__e order_parseFromJSON(cJSON *orderJSON);

#endif /* _order_H_ */

