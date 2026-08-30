/*
 * placement_traffic_type.h
 *
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 */

#ifndef _placement_traffic_type_H_
#define _placement_traffic_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct placement_traffic_type_t placement_traffic_type_t;


// Enum  for placement_traffic_type

typedef enum { pinterest_rest_api_placement_traffic_type__NULL = 0, pinterest_rest_api_placement_traffic_type__ALL, pinterest_rest_api_placement_traffic_type__TWO_COLUMN_FEED, pinterest_rest_api_placement_traffic_type__FULLSCREEN_FEED } pinterest_rest_api_placement_traffic_type__e;

char* placement_traffic_type_placement_traffic_type_ToString(pinterest_rest_api_placement_traffic_type__e placement_traffic_type);

pinterest_rest_api_placement_traffic_type__e placement_traffic_type_placement_traffic_type_FromString(char* placement_traffic_type);

cJSON *placement_traffic_type_convertToJSON(pinterest_rest_api_placement_traffic_type__e placement_traffic_type);

pinterest_rest_api_placement_traffic_type__e placement_traffic_type_parseFromJSON(cJSON *placement_traffic_typeJSON);

#endif /* _placement_traffic_type_H_ */

