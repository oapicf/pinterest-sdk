/*
 * campaign_planning_budget_recommendation_point.h
 *
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 */

#ifndef _campaign_planning_budget_recommendation_point_H_
#define _campaign_planning_budget_recommendation_point_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_planning_budget_recommendation_point_t campaign_planning_budget_recommendation_point_t;

#include "campaign_planning_estimation_type.h"
#include "campaign_planning_point_estimate.h"



typedef struct campaign_planning_budget_recommendation_point_t {
    campaign_planning_estimation_type_t *estimation_type; // custom
    struct campaign_planning_point_estimate_t *point_estimate; //model

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_planning_budget_recommendation_point_t;

__attribute__((deprecated)) campaign_planning_budget_recommendation_point_t *campaign_planning_budget_recommendation_point_create(
    campaign_planning_estimation_type_t *estimation_type,
    campaign_planning_point_estimate_t *point_estimate
);

void campaign_planning_budget_recommendation_point_free(campaign_planning_budget_recommendation_point_t *campaign_planning_budget_recommendation_point);

campaign_planning_budget_recommendation_point_t *campaign_planning_budget_recommendation_point_parseFromJSON(cJSON *campaign_planning_budget_recommendation_pointJSON);

cJSON *campaign_planning_budget_recommendation_point_convertToJSON(campaign_planning_budget_recommendation_point_t *campaign_planning_budget_recommendation_point);

#endif /* _campaign_planning_budget_recommendation_point_H_ */

