#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_groups_analytics_response_inner.h"



ad_groups_analytics_response_inner_t *ad_groups_analytics_response_inner_create(
    char *ad_group_id,
    char *date
    ) {
    ad_groups_analytics_response_inner_t *ad_groups_analytics_response_inner_local_var = malloc(sizeof(ad_groups_analytics_response_inner_t));
    if (!ad_groups_analytics_response_inner_local_var) {
        return NULL;
    }
    ad_groups_analytics_response_inner_local_var->ad_group_id = ad_group_id;
    ad_groups_analytics_response_inner_local_var->date = date;

    return ad_groups_analytics_response_inner_local_var;
}


void ad_groups_analytics_response_inner_free(ad_groups_analytics_response_inner_t *ad_groups_analytics_response_inner) {
    if(NULL == ad_groups_analytics_response_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_groups_analytics_response_inner->ad_group_id) {
        free(ad_groups_analytics_response_inner->ad_group_id);
        ad_groups_analytics_response_inner->ad_group_id = NULL;
    }
    if (ad_groups_analytics_response_inner->date) {
        free(ad_groups_analytics_response_inner->date);
        ad_groups_analytics_response_inner->date = NULL;
    }
    free(ad_groups_analytics_response_inner);
}

cJSON *ad_groups_analytics_response_inner_convertToJSON(ad_groups_analytics_response_inner_t *ad_groups_analytics_response_inner) {
    cJSON *item = cJSON_CreateObject();

    // ad_groups_analytics_response_inner->ad_group_id
    if (!ad_groups_analytics_response_inner->ad_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "AD_GROUP_ID", ad_groups_analytics_response_inner->ad_group_id) == NULL) {
    goto fail; //String
    }


    // ad_groups_analytics_response_inner->date
    if(ad_groups_analytics_response_inner->date) {
    if(cJSON_AddStringToObject(item, "DATE", ad_groups_analytics_response_inner->date) == NULL) {
    goto fail; //Date
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_groups_analytics_response_inner_t *ad_groups_analytics_response_inner_parseFromJSON(cJSON *ad_groups_analytics_response_innerJSON){

    ad_groups_analytics_response_inner_t *ad_groups_analytics_response_inner_local_var = NULL;

    // ad_groups_analytics_response_inner->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(ad_groups_analytics_response_innerJSON, "AD_GROUP_ID");
    if (!ad_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_group_id))
    {
    goto end; //String
    }

    // ad_groups_analytics_response_inner->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(ad_groups_analytics_response_innerJSON, "DATE");
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    ad_groups_analytics_response_inner_local_var = ad_groups_analytics_response_inner_create (
        strdup(ad_group_id->valuestring),
        date ? strdup(date->valuestring) : NULL
        );

    return ad_groups_analytics_response_inner_local_var;
end:
    return NULL;

}
