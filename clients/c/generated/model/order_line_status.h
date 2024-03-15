/*
 * order_line_status.h
 *
 * Order Line Status
 */

#ifndef _order_line_status_H_
#define _order_line_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_line_status_t order_line_status_t;


// Enum  for order_line_status

typedef enum { pinterest_rest_api_order_line_status__NULL = 0, pinterest_rest_api_order_line_status__ACTIVE, pinterest_rest_api_order_line_status__PAUSED, pinterest_rest_api_order_line_status__DELETED } pinterest_rest_api_order_line_status__e;

char* order_line_status_order_line_status_ToString(pinterest_rest_api_order_line_status__e order_line_status);

pinterest_rest_api_order_line_status__e order_line_status_order_line_status_FromString(char* order_line_status);

//cJSON *order_line_status_order_line_status_convertToJSON(pinterest_rest_api_order_line_status__e order_line_status);

//pinterest_rest_api_order_line_status__e order_line_status_order_line_status_parseFromJSON(cJSON *order_line_statusJSON);

#endif /* _order_line_status_H_ */

