/*
 * nullable_optimization_goal_metadata.h
 *
 * 
 */

#ifndef _nullable_optimization_goal_metadata_H_
#define _nullable_optimization_goal_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct nullable_optimization_goal_metadata_t nullable_optimization_goal_metadata_t;

#include "conversion_tag_v3_goal_metadata.h"
#include "frequency_goal_metadata.h"
#include "scrollup_goal_metadata.h"



typedef struct nullable_optimization_goal_metadata_t {
    struct conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata; //model
    struct frequency_goal_metadata_t *frequency_goal_metadata; //model
    struct scrollup_goal_metadata_t *scrollup_goal_metadata; //model

    int _library_owned; // Is the library responsible for freeing this object?
} nullable_optimization_goal_metadata_t;

__attribute__((deprecated)) nullable_optimization_goal_metadata_t *nullable_optimization_goal_metadata_create(
    conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata,
    frequency_goal_metadata_t *frequency_goal_metadata,
    scrollup_goal_metadata_t *scrollup_goal_metadata
);

void nullable_optimization_goal_metadata_free(nullable_optimization_goal_metadata_t *nullable_optimization_goal_metadata);

nullable_optimization_goal_metadata_t *nullable_optimization_goal_metadata_parseFromJSON(cJSON *nullable_optimization_goal_metadataJSON);

cJSON *nullable_optimization_goal_metadata_convertToJSON(nullable_optimization_goal_metadata_t *nullable_optimization_goal_metadata);

#endif /* _nullable_optimization_goal_metadata_H_ */

