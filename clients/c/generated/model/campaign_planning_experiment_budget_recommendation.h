/*
 * campaign_planning_experiment_budget_recommendation.h
 *
 * Experimental budget recommendation for a single experiment version.
 */

#ifndef _campaign_planning_experiment_budget_recommendation_H_
#define _campaign_planning_experiment_budget_recommendation_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_planning_experiment_budget_recommendation_t campaign_planning_experiment_budget_recommendation_t;

#include "campaign_planning_budget_recommendation_point.h"



typedef struct campaign_planning_experiment_budget_recommendation_t {
    int *budget_recommendation; //numeric
    int *lifetime_days_recommendation; //numeric
    list_t *point_estimations; //nonprimitive container
    char *version_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_planning_experiment_budget_recommendation_t;

__attribute__((deprecated)) campaign_planning_experiment_budget_recommendation_t *campaign_planning_experiment_budget_recommendation_create(
    int *budget_recommendation,
    int *lifetime_days_recommendation,
    list_t *point_estimations,
    char *version_id
);

void campaign_planning_experiment_budget_recommendation_free(campaign_planning_experiment_budget_recommendation_t *campaign_planning_experiment_budget_recommendation);

campaign_planning_experiment_budget_recommendation_t *campaign_planning_experiment_budget_recommendation_parseFromJSON(cJSON *campaign_planning_experiment_budget_recommendationJSON);

cJSON *campaign_planning_experiment_budget_recommendation_convertToJSON(campaign_planning_experiment_budget_recommendation_t *campaign_planning_experiment_budget_recommendation);

#endif /* _campaign_planning_experiment_budget_recommendation_H_ */

