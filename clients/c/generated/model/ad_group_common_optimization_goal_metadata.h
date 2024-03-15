/*
 * ad_group_common_optimization_goal_metadata.h
 *
 * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
 */

#ifndef _ad_group_common_optimization_goal_metadata_H_
#define _ad_group_common_optimization_goal_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_common_optimization_goal_metadata_t ad_group_common_optimization_goal_metadata_t;

#include "optimization_goal_metadata_conversion_tag_v3_goal_metadata.h"
#include "optimization_goal_metadata_frequency_goal_metadata.h"
#include "optimization_goal_metadata_scrollup_goal_metadata.h"



typedef struct ad_group_common_optimization_goal_metadata_t {
    struct optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata; //model
    struct optimization_goal_metadata_frequency_goal_metadata_t *frequency_goal_metadata; //model
    struct optimization_goal_metadata_scrollup_goal_metadata_t *scrollup_goal_metadata; //model

} ad_group_common_optimization_goal_metadata_t;

ad_group_common_optimization_goal_metadata_t *ad_group_common_optimization_goal_metadata_create(
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata,
    optimization_goal_metadata_frequency_goal_metadata_t *frequency_goal_metadata,
    optimization_goal_metadata_scrollup_goal_metadata_t *scrollup_goal_metadata
);

void ad_group_common_optimization_goal_metadata_free(ad_group_common_optimization_goal_metadata_t *ad_group_common_optimization_goal_metadata);

ad_group_common_optimization_goal_metadata_t *ad_group_common_optimization_goal_metadata_parseFromJSON(cJSON *ad_group_common_optimization_goal_metadataJSON);

cJSON *ad_group_common_optimization_goal_metadata_convertToJSON(ad_group_common_optimization_goal_metadata_t *ad_group_common_optimization_goal_metadata);

#endif /* _ad_group_common_optimization_goal_metadata_H_ */

