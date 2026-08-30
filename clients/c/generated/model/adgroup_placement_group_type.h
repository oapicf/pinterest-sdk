/*
 * adgroup_placement_group_type.h
 *
 * Campaign placement group type
 */

#ifndef _adgroup_placement_group_type_H_
#define _adgroup_placement_group_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct adgroup_placement_group_type_t adgroup_placement_group_type_t;


// Enum  for adgroup_placement_group_type

typedef enum { pinterest_rest_api_adgroup_placement_group_type__NULL = 0, pinterest_rest_api_adgroup_placement_group_type__ALL, pinterest_rest_api_adgroup_placement_group_type__SEARCH, pinterest_rest_api_adgroup_placement_group_type__BROWSE, pinterest_rest_api_adgroup_placement_group_type__OTHER } pinterest_rest_api_adgroup_placement_group_type__e;

char* adgroup_placement_group_type_adgroup_placement_group_type_ToString(pinterest_rest_api_adgroup_placement_group_type__e adgroup_placement_group_type);

pinterest_rest_api_adgroup_placement_group_type__e adgroup_placement_group_type_adgroup_placement_group_type_FromString(char* adgroup_placement_group_type);

cJSON *adgroup_placement_group_type_convertToJSON(pinterest_rest_api_adgroup_placement_group_type__e adgroup_placement_group_type);

pinterest_rest_api_adgroup_placement_group_type__e adgroup_placement_group_type_parseFromJSON(cJSON *adgroup_placement_group_typeJSON);

#endif /* _adgroup_placement_group_type_H_ */

