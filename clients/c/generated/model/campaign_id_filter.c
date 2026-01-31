#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_id_filter.h"



static campaign_id_filter_t *campaign_id_filter_create_internal(
    list_t *campaign_ids
    ) {
    campaign_id_filter_t *campaign_id_filter_local_var = malloc(sizeof(campaign_id_filter_t));
    if (!campaign_id_filter_local_var) {
        return NULL;
    }
    campaign_id_filter_local_var->campaign_ids = campaign_ids;

    campaign_id_filter_local_var->_library_owned = 1;
    return campaign_id_filter_local_var;
}

__attribute__((deprecated)) campaign_id_filter_t *campaign_id_filter_create(
    list_t *campaign_ids
    ) {
    return campaign_id_filter_create_internal (
        campaign_ids
        );
}

void campaign_id_filter_free(campaign_id_filter_t *campaign_id_filter) {
    if(NULL == campaign_id_filter){
        return ;
    }
    if(campaign_id_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_id_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_id_filter->campaign_ids) {
        list_ForEach(listEntry, campaign_id_filter->campaign_ids) {
            free(listEntry->data);
        }
        list_freeList(campaign_id_filter->campaign_ids);
        campaign_id_filter->campaign_ids = NULL;
    }
    free(campaign_id_filter);
}

cJSON *campaign_id_filter_convertToJSON(campaign_id_filter_t *campaign_id_filter) {
    cJSON *item = cJSON_CreateObject();

    // campaign_id_filter->campaign_ids
    if(campaign_id_filter->campaign_ids) {
    cJSON *campaign_ids = cJSON_AddArrayToObject(item, "campaign_ids");
    if(campaign_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *campaign_idsListEntry;
    list_ForEach(campaign_idsListEntry, campaign_id_filter->campaign_ids) {
    if(cJSON_AddStringToObject(campaign_ids, "", campaign_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_id_filter_t *campaign_id_filter_parseFromJSON(cJSON *campaign_id_filterJSON){

    campaign_id_filter_t *campaign_id_filter_local_var = NULL;

    // define the local list for campaign_id_filter->campaign_ids
    list_t *campaign_idsList = NULL;

    // campaign_id_filter->campaign_ids
    cJSON *campaign_ids = cJSON_GetObjectItemCaseSensitive(campaign_id_filterJSON, "campaign_ids");
    if (cJSON_IsNull(campaign_ids)) {
        campaign_ids = NULL;
    }
    if (campaign_ids) { 
    cJSON *campaign_ids_local = NULL;
    if(!cJSON_IsArray(campaign_ids)) {
        goto end;//primitive container
    }
    campaign_idsList = list_createList();

    cJSON_ArrayForEach(campaign_ids_local, campaign_ids)
    {
        if(!cJSON_IsString(campaign_ids_local))
        {
            goto end;
        }
        list_addElement(campaign_idsList , strdup(campaign_ids_local->valuestring));
    }
    }


    campaign_id_filter_local_var = campaign_id_filter_create_internal (
        campaign_ids ? campaign_idsList : NULL
        );

    return campaign_id_filter_local_var;
end:
    if (campaign_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_idsList);
        campaign_idsList = NULL;
    }
    return NULL;

}
