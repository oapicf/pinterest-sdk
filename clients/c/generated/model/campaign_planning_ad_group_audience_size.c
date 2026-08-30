#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_ad_group_audience_size.h"



static campaign_planning_ad_group_audience_size_t *campaign_planning_ad_group_audience_size_create_internal(
    int *count_lower,
    int *count_upper
    ) {
    campaign_planning_ad_group_audience_size_t *campaign_planning_ad_group_audience_size_local_var = malloc(sizeof(campaign_planning_ad_group_audience_size_t));
    if (!campaign_planning_ad_group_audience_size_local_var) {
        return NULL;
    }
    memset(campaign_planning_ad_group_audience_size_local_var, 0, sizeof(campaign_planning_ad_group_audience_size_t));
    campaign_planning_ad_group_audience_size_local_var->_library_owned = 1;
    campaign_planning_ad_group_audience_size_local_var->count_lower = count_lower;
    campaign_planning_ad_group_audience_size_local_var->count_upper = count_upper;
    return campaign_planning_ad_group_audience_size_local_var;
}

__attribute__((deprecated)) campaign_planning_ad_group_audience_size_t *campaign_planning_ad_group_audience_size_create(
    int *count_lower,
    int *count_upper
    ) {
    int *count_lower_copy = NULL;
    if (count_lower) {
        count_lower_copy = malloc(sizeof(int));
        if (count_lower_copy) *count_lower_copy = *count_lower;
    }
    int *count_upper_copy = NULL;
    if (count_upper) {
        count_upper_copy = malloc(sizeof(int));
        if (count_upper_copy) *count_upper_copy = *count_upper;
    }
    campaign_planning_ad_group_audience_size_t *result = campaign_planning_ad_group_audience_size_create_internal (
        count_lower_copy,
        count_upper_copy
        );
    if (!result) {
        free(count_lower_copy);
        free(count_upper_copy);
    }
    return result;
}

void campaign_planning_ad_group_audience_size_free(campaign_planning_ad_group_audience_size_t *campaign_planning_ad_group_audience_size) {
    if(NULL == campaign_planning_ad_group_audience_size){
        return ;
    }
    if(campaign_planning_ad_group_audience_size->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_planning_ad_group_audience_size_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_planning_ad_group_audience_size->count_lower) {
        free(campaign_planning_ad_group_audience_size->count_lower);
        campaign_planning_ad_group_audience_size->count_lower = NULL;
    }
    if (campaign_planning_ad_group_audience_size->count_upper) {
        free(campaign_planning_ad_group_audience_size->count_upper);
        campaign_planning_ad_group_audience_size->count_upper = NULL;
    }
    free(campaign_planning_ad_group_audience_size);
}

cJSON *campaign_planning_ad_group_audience_size_convertToJSON(campaign_planning_ad_group_audience_size_t *campaign_planning_ad_group_audience_size) {
    cJSON *item = cJSON_CreateObject();

    // campaign_planning_ad_group_audience_size->count_lower
    if(campaign_planning_ad_group_audience_size->count_lower) {
    if(cJSON_AddNumberToObject(item, "count_lower", *campaign_planning_ad_group_audience_size->count_lower) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_planning_ad_group_audience_size->count_upper
    if(campaign_planning_ad_group_audience_size->count_upper) {
    if(cJSON_AddNumberToObject(item, "count_upper", *campaign_planning_ad_group_audience_size->count_upper) == NULL) {
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

campaign_planning_ad_group_audience_size_t *campaign_planning_ad_group_audience_size_parseFromJSON(cJSON *campaign_planning_ad_group_audience_sizeJSON){

    campaign_planning_ad_group_audience_size_t *campaign_planning_ad_group_audience_size_local_var = NULL;

    // define the local variable for campaign_planning_ad_group_audience_size->count_lower
    int *count_lower_local_var = NULL;

    // define the local variable for campaign_planning_ad_group_audience_size->count_upper
    int *count_upper_local_var = NULL;

    // campaign_planning_ad_group_audience_size->count_lower
    cJSON *count_lower = cJSON_GetObjectItemCaseSensitive(campaign_planning_ad_group_audience_sizeJSON, "count_lower");
    if (cJSON_IsNull(count_lower)) {
        count_lower = NULL;
    }
    if (count_lower) { 
    if(!cJSON_IsNumber(count_lower))
    {
    goto end; //Numeric
    }
    count_lower_local_var = malloc(sizeof(int));
    if(!count_lower_local_var)
    {
        goto end;
    }
    *count_lower_local_var = count_lower->valuedouble;
    }

    // campaign_planning_ad_group_audience_size->count_upper
    cJSON *count_upper = cJSON_GetObjectItemCaseSensitive(campaign_planning_ad_group_audience_sizeJSON, "count_upper");
    if (cJSON_IsNull(count_upper)) {
        count_upper = NULL;
    }
    if (count_upper) { 
    if(!cJSON_IsNumber(count_upper))
    {
    goto end; //Numeric
    }
    count_upper_local_var = malloc(sizeof(int));
    if(!count_upper_local_var)
    {
        goto end;
    }
    *count_upper_local_var = count_upper->valuedouble;
    }



    campaign_planning_ad_group_audience_size_local_var = campaign_planning_ad_group_audience_size_create_internal (
        count_lower_local_var,
        count_upper_local_var
        );

    if (!campaign_planning_ad_group_audience_size_local_var) {
        goto end;
    }

    return campaign_planning_ad_group_audience_size_local_var;
end:
    if (count_lower_local_var) {
        free(count_lower_local_var);
        count_lower_local_var = NULL;
    }
    if (count_upper_local_var) {
        free(count_upper_local_var);
        count_upper_local_var = NULL;
    }
    return NULL;

}
