#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows.h"



optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_create(
    int click_window_days,
    int engagement_window_days,
    int view_window_days
    ) {
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_local_var = malloc(sizeof(optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_t));
    if (!optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_local_var) {
        return NULL;
    }
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_local_var->click_window_days = click_window_days;
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_local_var->engagement_window_days = engagement_window_days;
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_local_var->view_window_days = view_window_days;

    return optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_local_var;
}


void optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_free(optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows) {
    if(NULL == optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows){
        return ;
    }
    listEntry_t *listEntry;
    free(optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows);
}

cJSON *optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_convertToJSON(optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows) {
    cJSON *item = cJSON_CreateObject();

    // optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows->click_window_days
    if(optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows->click_window_days) {
    if(cJSON_AddNumberToObject(item, "click_window_days", optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows->click_window_days) == NULL) {
    goto fail; //Numeric
    }
    }


    // optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows->engagement_window_days
    if(optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows->engagement_window_days) {
    if(cJSON_AddNumberToObject(item, "engagement_window_days", optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows->engagement_window_days) == NULL) {
    goto fail; //Numeric
    }
    }


    // optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows->view_window_days
    if(optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows->view_window_days) {
    if(cJSON_AddNumberToObject(item, "view_window_days", optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows->view_window_days) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_parseFromJSON(cJSON *optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windowsJSON){

    optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_local_var = NULL;

    // optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows->click_window_days
    cJSON *click_window_days = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windowsJSON, "click_window_days");
    if (click_window_days) { 
    if(!cJSON_IsNumber(click_window_days))
    {
    goto end; //Numeric
    }
    }

    // optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows->engagement_window_days
    cJSON *engagement_window_days = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windowsJSON, "engagement_window_days");
    if (engagement_window_days) { 
    if(!cJSON_IsNumber(engagement_window_days))
    {
    goto end; //Numeric
    }
    }

    // optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows->view_window_days
    cJSON *view_window_days = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windowsJSON, "view_window_days");
    if (view_window_days) { 
    if(!cJSON_IsNumber(view_window_days))
    {
    goto end; //Numeric
    }
    }


    optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_local_var = optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_create (
        click_window_days ? click_window_days->valuedouble : 0,
        engagement_window_days ? engagement_window_days->valuedouble : 0,
        view_window_days ? view_window_days->valuedouble : 0
        );

    return optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_local_var;
end:
    return NULL;

}
