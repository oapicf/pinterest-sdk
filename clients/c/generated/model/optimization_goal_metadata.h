/*
 * optimization_goal_metadata.h
 *
 * 
 */

#ifndef _optimization_goal_metadata_H_
#define _optimization_goal_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct optimization_goal_metadata_t optimization_goal_metadata_t;

#include "optimization_goal_metadata_conversion_tag_v3_goal_metadata.h"
#include "optimization_goal_metadata_frequency_goal_metadata.h"
#include "optimization_goal_metadata_scrollup_goal_metadata.h"



typedef struct optimization_goal_metadata_t {
    struct optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata; //model
    struct optimization_goal_metadata_frequency_goal_metadata_t *frequency_goal_metadata; //model
    struct optimization_goal_metadata_scrollup_goal_metadata_t *scrollup_goal_metadata; //model

} optimization_goal_metadata_t;

optimization_goal_metadata_t *optimization_goal_metadata_create(
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata,
    optimization_goal_metadata_frequency_goal_metadata_t *frequency_goal_metadata,
    optimization_goal_metadata_scrollup_goal_metadata_t *scrollup_goal_metadata
);

void optimization_goal_metadata_free(optimization_goal_metadata_t *optimization_goal_metadata);

optimization_goal_metadata_t *optimization_goal_metadata_parseFromJSON(cJSON *optimization_goal_metadataJSON);

cJSON *optimization_goal_metadata_convertToJSON(optimization_goal_metadata_t *optimization_goal_metadata);

#endif /* _optimization_goal_metadata_H_ */

