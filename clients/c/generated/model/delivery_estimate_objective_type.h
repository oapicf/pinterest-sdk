/*
 * delivery_estimate_objective_type.h
 *
 * Objective type for delivery estimates.
 */

#ifndef _delivery_estimate_objective_type_H_
#define _delivery_estimate_objective_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delivery_estimate_objective_type_t delivery_estimate_objective_type_t;


// Enum  for delivery_estimate_objective_type

typedef enum { pinterest_rest_api_delivery_estimate_objective_type__NULL = 0, pinterest_rest_api_delivery_estimate_objective_type__AWARENESS, pinterest_rest_api_delivery_estimate_objective_type__CONSIDERATION, pinterest_rest_api_delivery_estimate_objective_type__CATALOG_SALES, pinterest_rest_api_delivery_estimate_objective_type__WEB_CONVERSION } pinterest_rest_api_delivery_estimate_objective_type__e;

char* delivery_estimate_objective_type_delivery_estimate_objective_type_ToString(pinterest_rest_api_delivery_estimate_objective_type__e delivery_estimate_objective_type);

pinterest_rest_api_delivery_estimate_objective_type__e delivery_estimate_objective_type_delivery_estimate_objective_type_FromString(char* delivery_estimate_objective_type);

cJSON *delivery_estimate_objective_type_convertToJSON(pinterest_rest_api_delivery_estimate_objective_type__e delivery_estimate_objective_type);

pinterest_rest_api_delivery_estimate_objective_type__e delivery_estimate_objective_type_parseFromJSON(cJSON *delivery_estimate_objective_typeJSON);

#endif /* _delivery_estimate_objective_type_H_ */

