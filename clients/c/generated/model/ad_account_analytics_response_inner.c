#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_analytics_response_inner.h"



ad_account_analytics_response_inner_t *ad_account_analytics_response_inner_create(
    char *ad_account_id,
    char *date
    ) {
    ad_account_analytics_response_inner_t *ad_account_analytics_response_inner_local_var = malloc(sizeof(ad_account_analytics_response_inner_t));
    if (!ad_account_analytics_response_inner_local_var) {
        return NULL;
    }
    ad_account_analytics_response_inner_local_var->ad_account_id = ad_account_id;
    ad_account_analytics_response_inner_local_var->date = date;

    return ad_account_analytics_response_inner_local_var;
}


void ad_account_analytics_response_inner_free(ad_account_analytics_response_inner_t *ad_account_analytics_response_inner) {
    if(NULL == ad_account_analytics_response_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_analytics_response_inner->ad_account_id) {
        free(ad_account_analytics_response_inner->ad_account_id);
        ad_account_analytics_response_inner->ad_account_id = NULL;
    }
    if (ad_account_analytics_response_inner->date) {
        free(ad_account_analytics_response_inner->date);
        ad_account_analytics_response_inner->date = NULL;
    }
    free(ad_account_analytics_response_inner);
}

cJSON *ad_account_analytics_response_inner_convertToJSON(ad_account_analytics_response_inner_t *ad_account_analytics_response_inner) {
    cJSON *item = cJSON_CreateObject();

    // ad_account_analytics_response_inner->ad_account_id
    if (!ad_account_analytics_response_inner->ad_account_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "AD_ACCOUNT_ID", ad_account_analytics_response_inner->ad_account_id) == NULL) {
    goto fail; //String
    }


    // ad_account_analytics_response_inner->date
    if(ad_account_analytics_response_inner->date) {
    if(cJSON_AddStringToObject(item, "DATE", ad_account_analytics_response_inner->date) == NULL) {
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

ad_account_analytics_response_inner_t *ad_account_analytics_response_inner_parseFromJSON(cJSON *ad_account_analytics_response_innerJSON){

    ad_account_analytics_response_inner_t *ad_account_analytics_response_inner_local_var = NULL;

    // ad_account_analytics_response_inner->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(ad_account_analytics_response_innerJSON, "AD_ACCOUNT_ID");
    if (!ad_account_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_account_id))
    {
    goto end; //String
    }

    // ad_account_analytics_response_inner->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(ad_account_analytics_response_innerJSON, "DATE");
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    ad_account_analytics_response_inner_local_var = ad_account_analytics_response_inner_create (
        strdup(ad_account_id->valuestring),
        date ? strdup(date->valuestring) : NULL
        );

    return ad_account_analytics_response_inner_local_var;
end:
    return NULL;

}
