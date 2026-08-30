/*
 * campaign_planning_point_estimate.h
 *
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 */

#ifndef _campaign_planning_point_estimate_H_
#define _campaign_planning_point_estimate_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_planning_point_estimate_t campaign_planning_point_estimate_t;




typedef struct campaign_planning_point_estimate_t {
    int *budget; //numeric
    double *double_y; //numeric
    int *max_y; //numeric
    int *min_y; //numeric
    int *y; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_planning_point_estimate_t;

__attribute__((deprecated)) campaign_planning_point_estimate_t *campaign_planning_point_estimate_create(
    int *budget,
    double *double_y,
    int *max_y,
    int *min_y,
    int *y
);

void campaign_planning_point_estimate_free(campaign_planning_point_estimate_t *campaign_planning_point_estimate);

campaign_planning_point_estimate_t *campaign_planning_point_estimate_parseFromJSON(cJSON *campaign_planning_point_estimateJSON);

cJSON *campaign_planning_point_estimate_convertToJSON(campaign_planning_point_estimate_t *campaign_planning_point_estimate);

#endif /* _campaign_planning_point_estimate_H_ */

