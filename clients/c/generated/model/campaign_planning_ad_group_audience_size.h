/*
 * campaign_planning_ad_group_audience_size.h
 *
 * Range audience size for an ad group.
 */

#ifndef _campaign_planning_ad_group_audience_size_H_
#define _campaign_planning_ad_group_audience_size_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_planning_ad_group_audience_size_t campaign_planning_ad_group_audience_size_t;




typedef struct campaign_planning_ad_group_audience_size_t {
    int *count_lower; //numeric
    int *count_upper; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_planning_ad_group_audience_size_t;

__attribute__((deprecated)) campaign_planning_ad_group_audience_size_t *campaign_planning_ad_group_audience_size_create(
    int *count_lower,
    int *count_upper
);

void campaign_planning_ad_group_audience_size_free(campaign_planning_ad_group_audience_size_t *campaign_planning_ad_group_audience_size);

campaign_planning_ad_group_audience_size_t *campaign_planning_ad_group_audience_size_parseFromJSON(cJSON *campaign_planning_ad_group_audience_sizeJSON);

cJSON *campaign_planning_ad_group_audience_size_convertToJSON(campaign_planning_ad_group_audience_size_t *campaign_planning_ad_group_audience_size);

#endif /* _campaign_planning_ad_group_audience_size_H_ */

