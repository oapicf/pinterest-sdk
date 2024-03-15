#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_id.h"



campaign_id_t *campaign_id_create(
    char *id
    ) {
    campaign_id_t *campaign_id_local_var = malloc(sizeof(campaign_id_t));
    if (!campaign_id_local_var) {
        return NULL;
    }
    campaign_id_local_var->id = id;

    return campaign_id_local_var;
}


void campaign_id_free(campaign_id_t *campaign_id) {
    if(NULL == campaign_id){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_id->id) {
        free(campaign_id->id);
        campaign_id->id = NULL;
    }
    free(campaign_id);
}

cJSON *campaign_id_convertToJSON(campaign_id_t *campaign_id) {
    cJSON *item = cJSON_CreateObject();

    // campaign_id->id
    if(campaign_id->id) {
    if(cJSON_AddStringToObject(item, "id", campaign_id->id) == NULL) {
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

campaign_id_t *campaign_id_parseFromJSON(cJSON *campaign_idJSON){

    campaign_id_t *campaign_id_local_var = NULL;

    // campaign_id->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(campaign_idJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }


    campaign_id_local_var = campaign_id_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL
        );

    return campaign_id_local_var;
end:
    return NULL;

}
