/*
 * frequency_goal_metadata.h
 *
 * Frequency target can only be between 2 and 20
 */

#ifndef _frequency_goal_metadata_H_
#define _frequency_goal_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct frequency_goal_metadata_t frequency_goal_metadata_t;

#include "frequency_goal_metadata_timerange.h"



typedef struct frequency_goal_metadata_t {
    int *frequency; //numeric
    pinterest_rest_api_frequency_goal_metadata_timerange__e timerange; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} frequency_goal_metadata_t;

__attribute__((deprecated)) frequency_goal_metadata_t *frequency_goal_metadata_create(
    int *frequency,
    pinterest_rest_api_frequency_goal_metadata_timerange__e timerange
);

void frequency_goal_metadata_free(frequency_goal_metadata_t *frequency_goal_metadata);

frequency_goal_metadata_t *frequency_goal_metadata_parseFromJSON(cJSON *frequency_goal_metadataJSON);

cJSON *frequency_goal_metadata_convertToJSON(frequency_goal_metadata_t *frequency_goal_metadata);

#endif /* _frequency_goal_metadata_H_ */

