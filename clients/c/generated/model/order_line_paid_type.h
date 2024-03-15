/*
 * order_line_paid_type.h
 *
 * Order Line Paid Type
 */

#ifndef _order_line_paid_type_H_
#define _order_line_paid_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_line_paid_type_t order_line_paid_type_t;


// Enum  for order_line_paid_type

typedef enum { pinterest_rest_api_order_line_paid_type__NULL = 0, pinterest_rest_api_order_line_paid_type__PAID, pinterest_rest_api_order_line_paid_type__BONUS, pinterest_rest_api_order_line_paid_type__MAKE_GOOD, pinterest_rest_api_order_line_paid_type__TEST, pinterest_rest_api_order_line_paid_type__null } pinterest_rest_api_order_line_paid_type__e;

char* order_line_paid_type_order_line_paid_type_ToString(pinterest_rest_api_order_line_paid_type__e order_line_paid_type);

pinterest_rest_api_order_line_paid_type__e order_line_paid_type_order_line_paid_type_FromString(char* order_line_paid_type);

//cJSON *order_line_paid_type_order_line_paid_type_convertToJSON(pinterest_rest_api_order_line_paid_type__e order_line_paid_type);

//pinterest_rest_api_order_line_paid_type__e order_line_paid_type_order_line_paid_type_parseFromJSON(cJSON *order_line_paid_typeJSON);

#endif /* _order_line_paid_type_H_ */

