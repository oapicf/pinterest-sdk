/*
 * pacing_delivery_type.h
 *
 * Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
 */

#ifndef _pacing_delivery_type_H_
#define _pacing_delivery_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pacing_delivery_type_t pacing_delivery_type_t;


// Enum  for pacing_delivery_type

typedef enum { pinterest_rest_api_pacing_delivery_type__NULL = 0, pinterest_rest_api_pacing_delivery_type__STANDARD, pinterest_rest_api_pacing_delivery_type__ACCELERATED } pinterest_rest_api_pacing_delivery_type__e;

char* pacing_delivery_type_pacing_delivery_type_ToString(pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type);

pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type_pacing_delivery_type_FromString(char* pacing_delivery_type);

//cJSON *pacing_delivery_type_pacing_delivery_type_convertToJSON(pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type);

//pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type_pacing_delivery_type_parseFromJSON(cJSON *pacing_delivery_typeJSON);

#endif /* _pacing_delivery_type_H_ */

