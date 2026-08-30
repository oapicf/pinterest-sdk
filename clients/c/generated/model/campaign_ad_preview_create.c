#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_ad_preview_create.h"



static campaign_ad_preview_create_t *campaign_ad_preview_create_create_internal(
    char *ad_group_id
    ) {
    campaign_ad_preview_create_t *campaign_ad_preview_create_local_var = malloc(sizeof(campaign_ad_preview_create_t));
    if (!campaign_ad_preview_create_local_var) {
        return NULL;
    }
    memset(campaign_ad_preview_create_local_var, 0, sizeof(campaign_ad_preview_create_t));
    campaign_ad_preview_create_local_var->_library_owned = 1;
    campaign_ad_preview_create_local_var->ad_group_id = ad_group_id;
    return campaign_ad_preview_create_local_var;
}

__attribute__((deprecated)) campaign_ad_preview_create_t *campaign_ad_preview_create_create(
    char *ad_group_id
    ) {
    campaign_ad_preview_create_t *result = campaign_ad_preview_create_create_internal (
        ad_group_id
        );
    if (!result) {
    }
    return result;
}

void campaign_ad_preview_create_free(campaign_ad_preview_create_t *campaign_ad_preview_create) {
    if(NULL == campaign_ad_preview_create){
        return ;
    }
    if(campaign_ad_preview_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_ad_preview_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_ad_preview_create->ad_group_id) {
        free(campaign_ad_preview_create->ad_group_id);
        campaign_ad_preview_create->ad_group_id = NULL;
    }
    free(campaign_ad_preview_create);
}

cJSON *campaign_ad_preview_create_convertToJSON(campaign_ad_preview_create_t *campaign_ad_preview_create) {
    cJSON *item = cJSON_CreateObject();

    // campaign_ad_preview_create->ad_group_id
    if (!campaign_ad_preview_create->ad_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_group_id", campaign_ad_preview_create->ad_group_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_ad_preview_create_t *campaign_ad_preview_create_parseFromJSON(cJSON *campaign_ad_preview_createJSON){

    campaign_ad_preview_create_t *campaign_ad_preview_create_local_var = NULL;

    char *ad_group_id_local_str = NULL;

    // campaign_ad_preview_create->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_createJSON, "ad_group_id");
    if (cJSON_IsNull(ad_group_id)) {
        ad_group_id = NULL;
    }
    if (!ad_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_group_id))
    {
    goto end; //String
    }


    if (ad_group_id && !cJSON_IsNull(ad_group_id)) ad_group_id_local_str = strdup(ad_group_id->valuestring);

    campaign_ad_preview_create_local_var = campaign_ad_preview_create_create_internal (
        ad_group_id_local_str
        );

    if (!campaign_ad_preview_create_local_var) {
        goto end;
    }

    return campaign_ad_preview_create_local_var;
end:
    if (ad_group_id_local_str) {
        free(ad_group_id_local_str);
        ad_group_id_local_str = NULL;
    }
    return NULL;

}
