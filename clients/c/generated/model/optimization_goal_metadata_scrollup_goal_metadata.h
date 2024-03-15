/*
 * optimization_goal_metadata_scrollup_goal_metadata.h
 *
 * 
 */

#ifndef _optimization_goal_metadata_scrollup_goal_metadata_H_
#define _optimization_goal_metadata_scrollup_goal_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct optimization_goal_metadata_scrollup_goal_metadata_t optimization_goal_metadata_scrollup_goal_metadata_t;




typedef struct optimization_goal_metadata_scrollup_goal_metadata_t {
    char *scrollup_goal_value_in_micro_currency; // string

} optimization_goal_metadata_scrollup_goal_metadata_t;

optimization_goal_metadata_scrollup_goal_metadata_t *optimization_goal_metadata_scrollup_goal_metadata_create(
    char *scrollup_goal_value_in_micro_currency
);

void optimization_goal_metadata_scrollup_goal_metadata_free(optimization_goal_metadata_scrollup_goal_metadata_t *optimization_goal_metadata_scrollup_goal_metadata);

optimization_goal_metadata_scrollup_goal_metadata_t *optimization_goal_metadata_scrollup_goal_metadata_parseFromJSON(cJSON *optimization_goal_metadata_scrollup_goal_metadataJSON);

cJSON *optimization_goal_metadata_scrollup_goal_metadata_convertToJSON(optimization_goal_metadata_scrollup_goal_metadata_t *optimization_goal_metadata_scrollup_goal_metadata);

#endif /* _optimization_goal_metadata_scrollup_goal_metadata_H_ */

