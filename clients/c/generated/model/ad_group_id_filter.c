#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_id_filter.h"



static ad_group_id_filter_t *ad_group_id_filter_create_internal(
    list_t *ad_group_ids
    ) {
    ad_group_id_filter_t *ad_group_id_filter_local_var = malloc(sizeof(ad_group_id_filter_t));
    if (!ad_group_id_filter_local_var) {
        return NULL;
    }
    ad_group_id_filter_local_var->ad_group_ids = ad_group_ids;

    ad_group_id_filter_local_var->_library_owned = 1;
    return ad_group_id_filter_local_var;
}

__attribute__((deprecated)) ad_group_id_filter_t *ad_group_id_filter_create(
    list_t *ad_group_ids
    ) {
    return ad_group_id_filter_create_internal (
        ad_group_ids
        );
}

void ad_group_id_filter_free(ad_group_id_filter_t *ad_group_id_filter) {
    if(NULL == ad_group_id_filter){
        return ;
    }
    if(ad_group_id_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_group_id_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_id_filter->ad_group_ids) {
        list_ForEach(listEntry, ad_group_id_filter->ad_group_ids) {
            free(listEntry->data);
        }
        list_freeList(ad_group_id_filter->ad_group_ids);
        ad_group_id_filter->ad_group_ids = NULL;
    }
    free(ad_group_id_filter);
}

cJSON *ad_group_id_filter_convertToJSON(ad_group_id_filter_t *ad_group_id_filter) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_id_filter->ad_group_ids
    if(ad_group_id_filter->ad_group_ids) {
    cJSON *ad_group_ids = cJSON_AddArrayToObject(item, "ad_group_ids");
    if(ad_group_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *ad_group_idsListEntry;
    list_ForEach(ad_group_idsListEntry, ad_group_id_filter->ad_group_ids) {
    if(cJSON_AddStringToObject(ad_group_ids, "", ad_group_idsListEntry->data) == NULL)
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

ad_group_id_filter_t *ad_group_id_filter_parseFromJSON(cJSON *ad_group_id_filterJSON){

    ad_group_id_filter_t *ad_group_id_filter_local_var = NULL;

    // define the local list for ad_group_id_filter->ad_group_ids
    list_t *ad_group_idsList = NULL;

    // ad_group_id_filter->ad_group_ids
    cJSON *ad_group_ids = cJSON_GetObjectItemCaseSensitive(ad_group_id_filterJSON, "ad_group_ids");
    if (cJSON_IsNull(ad_group_ids)) {
        ad_group_ids = NULL;
    }
    if (ad_group_ids) { 
    cJSON *ad_group_ids_local = NULL;
    if(!cJSON_IsArray(ad_group_ids)) {
        goto end;//primitive container
    }
    ad_group_idsList = list_createList();

    cJSON_ArrayForEach(ad_group_ids_local, ad_group_ids)
    {
        if(!cJSON_IsString(ad_group_ids_local))
        {
            goto end;
        }
        list_addElement(ad_group_idsList , strdup(ad_group_ids_local->valuestring));
    }
    }


    ad_group_id_filter_local_var = ad_group_id_filter_create_internal (
        ad_group_ids ? ad_group_idsList : NULL
        );

    return ad_group_id_filter_local_var;
end:
    if (ad_group_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ad_group_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ad_group_idsList);
        ad_group_idsList = NULL;
    }
    return NULL;

}
