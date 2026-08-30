/*
 * ssio_order_line_type.h
 *
 * The type of an SSIO order line.
 */

#ifndef _ssio_order_line_type_H_
#define _ssio_order_line_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_order_line_type_t ssio_order_line_type_t;


// Enum  for ssio_order_line_type

typedef enum { pinterest_rest_api_ssio_order_line_type__NULL = 0, pinterest_rest_api_ssio_order_line_type__BUDGET, pinterest_rest_api_ssio_order_line_type__PERPETUALS } pinterest_rest_api_ssio_order_line_type__e;

char* ssio_order_line_type_ssio_order_line_type_ToString(pinterest_rest_api_ssio_order_line_type__e ssio_order_line_type);

pinterest_rest_api_ssio_order_line_type__e ssio_order_line_type_ssio_order_line_type_FromString(char* ssio_order_line_type);

cJSON *ssio_order_line_type_convertToJSON(pinterest_rest_api_ssio_order_line_type__e ssio_order_line_type);

pinterest_rest_api_ssio_order_line_type__e ssio_order_line_type_parseFromJSON(cJSON *ssio_order_line_typeJSON);

#endif /* _ssio_order_line_type_H_ */

