/*
 * placement_type.h
 *
 * Placement type for bid multiplier targeting.
 */

#ifndef _placement_type_H_
#define _placement_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct placement_type_t placement_type_t;


// Enum  for placement_type

typedef enum { pinterest_rest_api_placement_type__NULL = 0, pinterest_rest_api_placement_type__SEARCH, pinterest_rest_api_placement_type__BROWSE, pinterest_rest_api_placement_type__RELATED_PINS } pinterest_rest_api_placement_type__e;

char* placement_type_placement_type_ToString(pinterest_rest_api_placement_type__e placement_type);

pinterest_rest_api_placement_type__e placement_type_placement_type_FromString(char* placement_type);

cJSON *placement_type_convertToJSON(pinterest_rest_api_placement_type__e placement_type);

pinterest_rest_api_placement_type__e placement_type_parseFromJSON(cJSON *placement_typeJSON);

#endif /* _placement_type_H_ */

