/*
 * campaign_planning_budget_recommendation.h
 *
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 */

#ifndef _campaign_planning_budget_recommendation_H_
#define _campaign_planning_budget_recommendation_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_planning_budget_recommendation_t campaign_planning_budget_recommendation_t;

#include "campaign_planning_budget_recommendation_point.h"
#include "campaign_planning_experiment_budget_recommendation.h"



typedef struct campaign_planning_budget_recommendation_t {
    int *budget_recommendation; //numeric
    list_t *experiment_campaign_budget_recommendation; //nonprimitive container
    int *lifetime_days_recommendation; //numeric
    list_t *point_estimations; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_planning_budget_recommendation_t;

__attribute__((deprecated)) campaign_planning_budget_recommendation_t *campaign_planning_budget_recommendation_create(
    int *budget_recommendation,
    list_t *experiment_campaign_budget_recommendation,
    int *lifetime_days_recommendation,
    list_t *point_estimations
);

void campaign_planning_budget_recommendation_free(campaign_planning_budget_recommendation_t *campaign_planning_budget_recommendation);

campaign_planning_budget_recommendation_t *campaign_planning_budget_recommendation_parseFromJSON(cJSON *campaign_planning_budget_recommendationJSON);

cJSON *campaign_planning_budget_recommendation_convertToJSON(campaign_planning_budget_recommendation_t *campaign_planning_budget_recommendation);

#endif /* _campaign_planning_budget_recommendation_H_ */

