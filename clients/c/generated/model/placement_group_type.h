/*
 * placement_group_type.h
 *
 * Campaign placement group type
 */

#ifndef _placement_group_type_H_
#define _placement_group_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct placement_group_type_t placement_group_type_t;


// Enum  for placement_group_type

typedef enum { pinterest_rest_api_placement_group_type__NULL = 0, pinterest_rest_api_placement_group_type__ALL, pinterest_rest_api_placement_group_type__SEARCH, pinterest_rest_api_placement_group_type__BROWSE, pinterest_rest_api_placement_group_type__OTHER } pinterest_rest_api_placement_group_type__e;

char* placement_group_type_placement_group_type_ToString(pinterest_rest_api_placement_group_type__e placement_group_type);

pinterest_rest_api_placement_group_type__e placement_group_type_placement_group_type_FromString(char* placement_group_type);

//cJSON *placement_group_type_placement_group_type_convertToJSON(pinterest_rest_api_placement_group_type__e placement_group_type);

//pinterest_rest_api_placement_group_type__e placement_group_type_placement_group_type_parseFromJSON(cJSON *placement_group_typeJSON);

#endif /* _placement_group_type_H_ */

