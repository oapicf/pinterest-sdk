/*
 * campaign_planning_curve_estimate.h
 *
 * 
 */

#ifndef _campaign_planning_curve_estimate_H_
#define _campaign_planning_curve_estimate_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_planning_curve_estimate_t campaign_planning_curve_estimate_t;

#include "campaign_planning_estimation_type.h"
#include "campaign_planning_point_estimate.h"



typedef struct campaign_planning_curve_estimate_t {
    campaign_planning_estimation_type_t *estimation_type; // custom
    list_t *points; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_planning_curve_estimate_t;

__attribute__((deprecated)) campaign_planning_curve_estimate_t *campaign_planning_curve_estimate_create(
    campaign_planning_estimation_type_t *estimation_type,
    list_t *points
);

void campaign_planning_curve_estimate_free(campaign_planning_curve_estimate_t *campaign_planning_curve_estimate);

campaign_planning_curve_estimate_t *campaign_planning_curve_estimate_parseFromJSON(cJSON *campaign_planning_curve_estimateJSON);

cJSON *campaign_planning_curve_estimate_convertToJSON(campaign_planning_curve_estimate_t *campaign_planning_curve_estimate);

#endif /* _campaign_planning_curve_estimate_H_ */

