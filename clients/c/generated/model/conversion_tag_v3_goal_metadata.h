/*
 * conversion_tag_v3_goal_metadata.h
 *
 * 
 */

#ifndef _conversion_tag_v3_goal_metadata_H_
#define _conversion_tag_v3_goal_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_tag_v3_goal_metadata_t conversion_tag_v3_goal_metadata_t;

#include "attribution_windows.h"
#include "conversion_event.h"



typedef struct conversion_tag_v3_goal_metadata_t {
    struct attribution_windows_t *attribution_windows; //model
    pinterest_rest_api_conversion_event__e conversion_event; //referenced enum
    char *conversion_tag_id; // string
    char *cpa_goal_value_in_micro_currency; // string
    int *is_roas_optimized; //boolean
    char *reporting_event; // string

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_tag_v3_goal_metadata_t;

__attribute__((deprecated)) conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata_create(
    attribution_windows_t *attribution_windows,
    pinterest_rest_api_conversion_event__e conversion_event,
    char *conversion_tag_id,
    char *cpa_goal_value_in_micro_currency,
    int *is_roas_optimized,
    char *reporting_event
);

void conversion_tag_v3_goal_metadata_free(conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata);

conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata_parseFromJSON(cJSON *conversion_tag_v3_goal_metadataJSON);

cJSON *conversion_tag_v3_goal_metadata_convertToJSON(conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata);

#endif /* _conversion_tag_v3_goal_metadata_H_ */

