#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_audience_multipliers.h"



static campaign_audience_multipliers_t *campaign_audience_multipliers_create_internal(
    char *audience_id
    ) {
    campaign_audience_multipliers_t *campaign_audience_multipliers_local_var = malloc(sizeof(campaign_audience_multipliers_t));
    if (!campaign_audience_multipliers_local_var) {
        return NULL;
    }
    memset(campaign_audience_multipliers_local_var, 0, sizeof(campaign_audience_multipliers_t));
    campaign_audience_multipliers_local_var->_library_owned = 1;
    campaign_audience_multipliers_local_var->audience_id = audience_id;
    return campaign_audience_multipliers_local_var;
}

__attribute__((deprecated)) campaign_audience_multipliers_t *campaign_audience_multipliers_create(
    char *audience_id
    ) {
    campaign_audience_multipliers_t *result = campaign_audience_multipliers_create_internal (
        audience_id
        );
    if (!result) {
    }
    return result;
}

void campaign_audience_multipliers_free(campaign_audience_multipliers_t *campaign_audience_multipliers) {
    if(NULL == campaign_audience_multipliers){
        return ;
    }
    if(campaign_audience_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_audience_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_audience_multipliers->audience_id) {
        free(campaign_audience_multipliers->audience_id);
        campaign_audience_multipliers->audience_id = NULL;
    }
    free(campaign_audience_multipliers);
}

cJSON *campaign_audience_multipliers_convertToJSON(campaign_audience_multipliers_t *campaign_audience_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // campaign_audience_multipliers->audience_id
    if(campaign_audience_multipliers->audience_id) {
    if(cJSON_AddStringToObject(item, "AUDIENCE_ID", campaign_audience_multipliers->audience_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_audience_multipliers_t *campaign_audience_multipliers_parseFromJSON(cJSON *campaign_audience_multipliersJSON){

    campaign_audience_multipliers_t *campaign_audience_multipliers_local_var = NULL;

    char *audience_id_local_str = NULL;

    // campaign_audience_multipliers->audience_id
    cJSON *audience_id = cJSON_GetObjectItemCaseSensitive(campaign_audience_multipliersJSON, "AUDIENCE_ID");
    if (cJSON_IsNull(audience_id)) {
        audience_id = NULL;
    }
    if (audience_id) { 
    if(!cJSON_IsString(audience_id) && !cJSON_IsNull(audience_id))
    {
    goto end; //String
    }
    }


    if (audience_id && !cJSON_IsNull(audience_id)) audience_id_local_str = strdup(audience_id->valuestring);

    campaign_audience_multipliers_local_var = campaign_audience_multipliers_create_internal (
        audience_id_local_str
        );

    if (!campaign_audience_multipliers_local_var) {
        goto end;
    }

    return campaign_audience_multipliers_local_var;
end:
    if (audience_id_local_str) {
        free(audience_id_local_str);
        audience_id_local_str = NULL;
    }
    return NULL;

}
