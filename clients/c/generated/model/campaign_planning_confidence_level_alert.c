#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_confidence_level_alert.h"



static campaign_planning_confidence_level_alert_t *campaign_planning_confidence_level_alert_create_internal(
    char *description,
    campaign_planning_confidence_level_alert_reason_t *reason,
    campaign_planning_confidence_level_alert_severity_t *severity
    ) {
    campaign_planning_confidence_level_alert_t *campaign_planning_confidence_level_alert_local_var = malloc(sizeof(campaign_planning_confidence_level_alert_t));
    if (!campaign_planning_confidence_level_alert_local_var) {
        return NULL;
    }
    memset(campaign_planning_confidence_level_alert_local_var, 0, sizeof(campaign_planning_confidence_level_alert_t));
    campaign_planning_confidence_level_alert_local_var->_library_owned = 1;
    campaign_planning_confidence_level_alert_local_var->description = description;
    campaign_planning_confidence_level_alert_local_var->reason = reason;
    campaign_planning_confidence_level_alert_local_var->severity = severity;
    return campaign_planning_confidence_level_alert_local_var;
}

__attribute__((deprecated)) campaign_planning_confidence_level_alert_t *campaign_planning_confidence_level_alert_create(
    char *description,
    campaign_planning_confidence_level_alert_reason_t *reason,
    campaign_planning_confidence_level_alert_severity_t *severity
    ) {
    campaign_planning_confidence_level_alert_t *result = campaign_planning_confidence_level_alert_create_internal (
        description,
        reason,
        severity
        );
    if (!result) {
    }
    return result;
}

void campaign_planning_confidence_level_alert_free(campaign_planning_confidence_level_alert_t *campaign_planning_confidence_level_alert) {
    if(NULL == campaign_planning_confidence_level_alert){
        return ;
    }
    if(campaign_planning_confidence_level_alert->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_planning_confidence_level_alert_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_planning_confidence_level_alert->description) {
        free(campaign_planning_confidence_level_alert->description);
        campaign_planning_confidence_level_alert->description = NULL;
    }
    if (campaign_planning_confidence_level_alert->reason) {
        campaign_planning_confidence_level_alert_reason_free(campaign_planning_confidence_level_alert->reason);
        campaign_planning_confidence_level_alert->reason = NULL;
    }
    if (campaign_planning_confidence_level_alert->severity) {
        campaign_planning_confidence_level_alert_severity_free(campaign_planning_confidence_level_alert->severity);
        campaign_planning_confidence_level_alert->severity = NULL;
    }
    free(campaign_planning_confidence_level_alert);
}

cJSON *campaign_planning_confidence_level_alert_convertToJSON(campaign_planning_confidence_level_alert_t *campaign_planning_confidence_level_alert) {
    cJSON *item = cJSON_CreateObject();

    // campaign_planning_confidence_level_alert->description
    if(campaign_planning_confidence_level_alert->description) {
    if(cJSON_AddStringToObject(item, "description", campaign_planning_confidence_level_alert->description) == NULL) {
    goto fail; //String
    }
    }


    // campaign_planning_confidence_level_alert->reason
    if(campaign_planning_confidence_level_alert->reason) {
    cJSON *reason_local_JSON = campaign_planning_confidence_level_alert_reason_convertToJSON(campaign_planning_confidence_level_alert->reason);
    if(reason_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "reason", reason_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_planning_confidence_level_alert->severity
    if(campaign_planning_confidence_level_alert->severity) {
    cJSON *severity_local_JSON = campaign_planning_confidence_level_alert_severity_convertToJSON(campaign_planning_confidence_level_alert->severity);
    if(severity_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "severity", severity_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_planning_confidence_level_alert_t *campaign_planning_confidence_level_alert_parseFromJSON(cJSON *campaign_planning_confidence_level_alertJSON){

    campaign_planning_confidence_level_alert_t *campaign_planning_confidence_level_alert_local_var = NULL;

    char *description_local_str = NULL;

    // define the local variable for campaign_planning_confidence_level_alert->reason
    campaign_planning_confidence_level_alert_reason_t *reason_local_nonprim = NULL;

    // define the local variable for campaign_planning_confidence_level_alert->severity
    campaign_planning_confidence_level_alert_severity_t *severity_local_nonprim = NULL;

    // campaign_planning_confidence_level_alert->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(campaign_planning_confidence_level_alertJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // campaign_planning_confidence_level_alert->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(campaign_planning_confidence_level_alertJSON, "reason");
    if (cJSON_IsNull(reason)) {
        reason = NULL;
    }
    if (reason) { 
    reason_local_nonprim = campaign_planning_confidence_level_alert_reason_parseFromJSON(reason); //custom
    }

    // campaign_planning_confidence_level_alert->severity
    cJSON *severity = cJSON_GetObjectItemCaseSensitive(campaign_planning_confidence_level_alertJSON, "severity");
    if (cJSON_IsNull(severity)) {
        severity = NULL;
    }
    if (severity) { 
    severity_local_nonprim = campaign_planning_confidence_level_alert_severity_parseFromJSON(severity); //custom
    }


    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    campaign_planning_confidence_level_alert_local_var = campaign_planning_confidence_level_alert_create_internal (
        description_local_str,
        reason ? reason_local_nonprim : NULL,
        severity ? severity_local_nonprim : NULL
        );

    if (!campaign_planning_confidence_level_alert_local_var) {
        goto end;
    }

    return campaign_planning_confidence_level_alert_local_var;
end:
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (reason_local_nonprim) {
        campaign_planning_confidence_level_alert_reason_free(reason_local_nonprim);
        reason_local_nonprim = NULL;
    }
    if (severity_local_nonprim) {
        campaign_planning_confidence_level_alert_severity_free(severity_local_nonprim);
        severity_local_nonprim = NULL;
    }
    return NULL;

}
