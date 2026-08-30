#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_ad_preview_create_200_response_inner.h"



static campaign_ad_preview_create_200_response_inner_t *campaign_ad_preview_create_200_response_inner_create_internal(
    campaign_ad_preview_create_200_response_inner_data_t *data
    ) {
    campaign_ad_preview_create_200_response_inner_t *campaign_ad_preview_create_200_response_inner_local_var = malloc(sizeof(campaign_ad_preview_create_200_response_inner_t));
    if (!campaign_ad_preview_create_200_response_inner_local_var) {
        return NULL;
    }
    memset(campaign_ad_preview_create_200_response_inner_local_var, 0, sizeof(campaign_ad_preview_create_200_response_inner_t));
    campaign_ad_preview_create_200_response_inner_local_var->_library_owned = 1;
    campaign_ad_preview_create_200_response_inner_local_var->data = data;
    return campaign_ad_preview_create_200_response_inner_local_var;
}

__attribute__((deprecated)) campaign_ad_preview_create_200_response_inner_t *campaign_ad_preview_create_200_response_inner_create(
    campaign_ad_preview_create_200_response_inner_data_t *data
    ) {
    campaign_ad_preview_create_200_response_inner_t *result = campaign_ad_preview_create_200_response_inner_create_internal (
        data
        );
    if (!result) {
    }
    return result;
}

void campaign_ad_preview_create_200_response_inner_free(campaign_ad_preview_create_200_response_inner_t *campaign_ad_preview_create_200_response_inner) {
    if(NULL == campaign_ad_preview_create_200_response_inner){
        return ;
    }
    if(campaign_ad_preview_create_200_response_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_ad_preview_create_200_response_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_ad_preview_create_200_response_inner->data) {
        campaign_ad_preview_create_200_response_inner_data_free(campaign_ad_preview_create_200_response_inner->data);
        campaign_ad_preview_create_200_response_inner->data = NULL;
    }
    free(campaign_ad_preview_create_200_response_inner);
}

cJSON *campaign_ad_preview_create_200_response_inner_convertToJSON(campaign_ad_preview_create_200_response_inner_t *campaign_ad_preview_create_200_response_inner) {
    cJSON *item = cJSON_CreateObject();

    // campaign_ad_preview_create_200_response_inner->data
    if (!campaign_ad_preview_create_200_response_inner->data) {
        goto fail;
    }
    cJSON *data_local_JSON = campaign_ad_preview_create_200_response_inner_data_convertToJSON(campaign_ad_preview_create_200_response_inner->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_ad_preview_create_200_response_inner_t *campaign_ad_preview_create_200_response_inner_parseFromJSON(cJSON *campaign_ad_preview_create_200_response_innerJSON){

    campaign_ad_preview_create_200_response_inner_t *campaign_ad_preview_create_200_response_inner_local_var = NULL;

    // define the local variable for campaign_ad_preview_create_200_response_inner->data
    campaign_ad_preview_create_200_response_inner_data_t *data_local_nonprim = NULL;

    // campaign_ad_preview_create_200_response_inner->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_create_200_response_innerJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = campaign_ad_preview_create_200_response_inner_data_parseFromJSON(data); //nonprimitive



    campaign_ad_preview_create_200_response_inner_local_var = campaign_ad_preview_create_200_response_inner_create_internal (
        data_local_nonprim
        );

    if (!campaign_ad_preview_create_200_response_inner_local_var) {
        goto end;
    }

    return campaign_ad_preview_create_200_response_inner_local_var;
end:
    if (data_local_nonprim) {
        campaign_ad_preview_create_200_response_inner_data_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
