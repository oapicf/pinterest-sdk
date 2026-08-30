#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_conversion_attribution.h"



static campaign_planning_conversion_attribution_t *campaign_planning_conversion_attribution_create_internal(
    campaign_planning_conversion_attribution_window_days_t *click_window_days,
    campaign_planning_conversion_attribution_window_days_t *engagement_window_days,
    campaign_planning_conversion_attribution_window_days_t *view_window_days
    ) {
    campaign_planning_conversion_attribution_t *campaign_planning_conversion_attribution_local_var = malloc(sizeof(campaign_planning_conversion_attribution_t));
    if (!campaign_planning_conversion_attribution_local_var) {
        return NULL;
    }
    memset(campaign_planning_conversion_attribution_local_var, 0, sizeof(campaign_planning_conversion_attribution_t));
    campaign_planning_conversion_attribution_local_var->_library_owned = 1;
    campaign_planning_conversion_attribution_local_var->click_window_days = click_window_days;
    campaign_planning_conversion_attribution_local_var->engagement_window_days = engagement_window_days;
    campaign_planning_conversion_attribution_local_var->view_window_days = view_window_days;
    return campaign_planning_conversion_attribution_local_var;
}

__attribute__((deprecated)) campaign_planning_conversion_attribution_t *campaign_planning_conversion_attribution_create(
    campaign_planning_conversion_attribution_window_days_t *click_window_days,
    campaign_planning_conversion_attribution_window_days_t *engagement_window_days,
    campaign_planning_conversion_attribution_window_days_t *view_window_days
    ) {
    campaign_planning_conversion_attribution_t *result = campaign_planning_conversion_attribution_create_internal (
        click_window_days,
        engagement_window_days,
        view_window_days
        );
    if (!result) {
    }
    return result;
}

void campaign_planning_conversion_attribution_free(campaign_planning_conversion_attribution_t *campaign_planning_conversion_attribution) {
    if(NULL == campaign_planning_conversion_attribution){
        return ;
    }
    if(campaign_planning_conversion_attribution->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_planning_conversion_attribution_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_planning_conversion_attribution->click_window_days) {
        campaign_planning_conversion_attribution_window_days_free(campaign_planning_conversion_attribution->click_window_days);
        campaign_planning_conversion_attribution->click_window_days = NULL;
    }
    if (campaign_planning_conversion_attribution->engagement_window_days) {
        campaign_planning_conversion_attribution_window_days_free(campaign_planning_conversion_attribution->engagement_window_days);
        campaign_planning_conversion_attribution->engagement_window_days = NULL;
    }
    if (campaign_planning_conversion_attribution->view_window_days) {
        campaign_planning_conversion_attribution_window_days_free(campaign_planning_conversion_attribution->view_window_days);
        campaign_planning_conversion_attribution->view_window_days = NULL;
    }
    free(campaign_planning_conversion_attribution);
}

cJSON *campaign_planning_conversion_attribution_convertToJSON(campaign_planning_conversion_attribution_t *campaign_planning_conversion_attribution) {
    cJSON *item = cJSON_CreateObject();

    // campaign_planning_conversion_attribution->click_window_days
    if(campaign_planning_conversion_attribution->click_window_days) {
    cJSON *click_window_days_local_JSON = campaign_planning_conversion_attribution_window_days_convertToJSON(campaign_planning_conversion_attribution->click_window_days);
    if(click_window_days_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "click_window_days", click_window_days_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_planning_conversion_attribution->engagement_window_days
    if(campaign_planning_conversion_attribution->engagement_window_days) {
    cJSON *engagement_window_days_local_JSON = campaign_planning_conversion_attribution_window_days_convertToJSON(campaign_planning_conversion_attribution->engagement_window_days);
    if(engagement_window_days_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "engagement_window_days", engagement_window_days_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_planning_conversion_attribution->view_window_days
    if(campaign_planning_conversion_attribution->view_window_days) {
    cJSON *view_window_days_local_JSON = campaign_planning_conversion_attribution_window_days_convertToJSON(campaign_planning_conversion_attribution->view_window_days);
    if(view_window_days_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "view_window_days", view_window_days_local_JSON);
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

campaign_planning_conversion_attribution_t *campaign_planning_conversion_attribution_parseFromJSON(cJSON *campaign_planning_conversion_attributionJSON){

    campaign_planning_conversion_attribution_t *campaign_planning_conversion_attribution_local_var = NULL;

    // define the local variable for campaign_planning_conversion_attribution->click_window_days
    campaign_planning_conversion_attribution_window_days_t *click_window_days_local_nonprim = NULL;

    // define the local variable for campaign_planning_conversion_attribution->engagement_window_days
    campaign_planning_conversion_attribution_window_days_t *engagement_window_days_local_nonprim = NULL;

    // define the local variable for campaign_planning_conversion_attribution->view_window_days
    campaign_planning_conversion_attribution_window_days_t *view_window_days_local_nonprim = NULL;

    // campaign_planning_conversion_attribution->click_window_days
    cJSON *click_window_days = cJSON_GetObjectItemCaseSensitive(campaign_planning_conversion_attributionJSON, "click_window_days");
    if (cJSON_IsNull(click_window_days)) {
        click_window_days = NULL;
    }
    if (click_window_days) { 
    click_window_days_local_nonprim = campaign_planning_conversion_attribution_window_days_parseFromJSON(click_window_days); //custom
    }

    // campaign_planning_conversion_attribution->engagement_window_days
    cJSON *engagement_window_days = cJSON_GetObjectItemCaseSensitive(campaign_planning_conversion_attributionJSON, "engagement_window_days");
    if (cJSON_IsNull(engagement_window_days)) {
        engagement_window_days = NULL;
    }
    if (engagement_window_days) { 
    engagement_window_days_local_nonprim = campaign_planning_conversion_attribution_window_days_parseFromJSON(engagement_window_days); //custom
    }

    // campaign_planning_conversion_attribution->view_window_days
    cJSON *view_window_days = cJSON_GetObjectItemCaseSensitive(campaign_planning_conversion_attributionJSON, "view_window_days");
    if (cJSON_IsNull(view_window_days)) {
        view_window_days = NULL;
    }
    if (view_window_days) { 
    view_window_days_local_nonprim = campaign_planning_conversion_attribution_window_days_parseFromJSON(view_window_days); //custom
    }



    campaign_planning_conversion_attribution_local_var = campaign_planning_conversion_attribution_create_internal (
        click_window_days ? click_window_days_local_nonprim : NULL,
        engagement_window_days ? engagement_window_days_local_nonprim : NULL,
        view_window_days ? view_window_days_local_nonprim : NULL
        );

    if (!campaign_planning_conversion_attribution_local_var) {
        goto end;
    }

    return campaign_planning_conversion_attribution_local_var;
end:
    if (click_window_days_local_nonprim) {
        campaign_planning_conversion_attribution_window_days_free(click_window_days_local_nonprim);
        click_window_days_local_nonprim = NULL;
    }
    if (engagement_window_days_local_nonprim) {
        campaign_planning_conversion_attribution_window_days_free(engagement_window_days_local_nonprim);
        engagement_window_days_local_nonprim = NULL;
    }
    if (view_window_days_local_nonprim) {
        campaign_planning_conversion_attribution_window_days_free(view_window_days_local_nonprim);
        view_window_days_local_nonprim = NULL;
    }
    return NULL;

}
