/*
 * campaign_planning_confidence_level_alert.h
 *
 * A confidence level alert for the delivery estimates provided in the response.
 */

#ifndef _campaign_planning_confidence_level_alert_H_
#define _campaign_planning_confidence_level_alert_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_planning_confidence_level_alert_t campaign_planning_confidence_level_alert_t;

#include "campaign_planning_confidence_level_alert_reason.h"
#include "campaign_planning_confidence_level_alert_severity.h"



typedef struct campaign_planning_confidence_level_alert_t {
    char *description; // string
    campaign_planning_confidence_level_alert_reason_t *reason; // custom
    campaign_planning_confidence_level_alert_severity_t *severity; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_planning_confidence_level_alert_t;

__attribute__((deprecated)) campaign_planning_confidence_level_alert_t *campaign_planning_confidence_level_alert_create(
    char *description,
    campaign_planning_confidence_level_alert_reason_t *reason,
    campaign_planning_confidence_level_alert_severity_t *severity
);

void campaign_planning_confidence_level_alert_free(campaign_planning_confidence_level_alert_t *campaign_planning_confidence_level_alert);

campaign_planning_confidence_level_alert_t *campaign_planning_confidence_level_alert_parseFromJSON(cJSON *campaign_planning_confidence_level_alertJSON);

cJSON *campaign_planning_confidence_level_alert_convertToJSON(campaign_planning_confidence_level_alert_t *campaign_planning_confidence_level_alert);

#endif /* _campaign_planning_confidence_level_alert_H_ */

