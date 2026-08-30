#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_deletion_request_epik_targets.h"



static conversion_deletion_request_epik_targets_t *conversion_deletion_request_epik_targets_create_internal(
    list_t *epiks
    ) {
    conversion_deletion_request_epik_targets_t *conversion_deletion_request_epik_targets_local_var = malloc(sizeof(conversion_deletion_request_epik_targets_t));
    if (!conversion_deletion_request_epik_targets_local_var) {
        return NULL;
    }
    memset(conversion_deletion_request_epik_targets_local_var, 0, sizeof(conversion_deletion_request_epik_targets_t));
    conversion_deletion_request_epik_targets_local_var->_library_owned = 1;
    conversion_deletion_request_epik_targets_local_var->epiks = epiks;
    return conversion_deletion_request_epik_targets_local_var;
}

__attribute__((deprecated)) conversion_deletion_request_epik_targets_t *conversion_deletion_request_epik_targets_create(
    list_t *epiks
    ) {
    conversion_deletion_request_epik_targets_t *result = conversion_deletion_request_epik_targets_create_internal (
        epiks
        );
    if (!result) {
    }
    return result;
}

void conversion_deletion_request_epik_targets_free(conversion_deletion_request_epik_targets_t *conversion_deletion_request_epik_targets) {
    if(NULL == conversion_deletion_request_epik_targets){
        return ;
    }
    if(conversion_deletion_request_epik_targets->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_deletion_request_epik_targets_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_deletion_request_epik_targets->epiks) {
        list_ForEach(listEntry, conversion_deletion_request_epik_targets->epiks) {
            free(listEntry->data);
        }
        list_freeList(conversion_deletion_request_epik_targets->epiks);
        conversion_deletion_request_epik_targets->epiks = NULL;
    }
    free(conversion_deletion_request_epik_targets);
}

cJSON *conversion_deletion_request_epik_targets_convertToJSON(conversion_deletion_request_epik_targets_t *conversion_deletion_request_epik_targets) {
    cJSON *item = cJSON_CreateObject();

    // conversion_deletion_request_epik_targets->epiks
    if (!conversion_deletion_request_epik_targets->epiks) {
        goto fail;
    }
    cJSON *epiks = cJSON_AddArrayToObject(item, "epiks");
    if(epiks == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *epiksListEntry;
    list_ForEach(epiksListEntry, conversion_deletion_request_epik_targets->epiks) {
    if(cJSON_AddStringToObject(epiks, "", epiksListEntry->data) == NULL)
    {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_deletion_request_epik_targets_t *conversion_deletion_request_epik_targets_parseFromJSON(cJSON *conversion_deletion_request_epik_targetsJSON){

    conversion_deletion_request_epik_targets_t *conversion_deletion_request_epik_targets_local_var = NULL;

    // define the local list for conversion_deletion_request_epik_targets->epiks
    list_t *epiksList = NULL;

    // conversion_deletion_request_epik_targets->epiks
    cJSON *epiks = cJSON_GetObjectItemCaseSensitive(conversion_deletion_request_epik_targetsJSON, "epiks");
    if (cJSON_IsNull(epiks)) {
        epiks = NULL;
    }
    if (!epiks) {
        goto end;
    }

    
    cJSON *epiks_local = NULL;
    if(!cJSON_IsArray(epiks)) {
        goto end;//primitive container
    }
    epiksList = list_createList();

    cJSON_ArrayForEach(epiks_local, epiks)
    {
        if(!cJSON_IsString(epiks_local))
        {
            goto end;
        }
        list_addElement(epiksList , strdup(epiks_local->valuestring));
    }



    conversion_deletion_request_epik_targets_local_var = conversion_deletion_request_epik_targets_create_internal (
        epiksList
        );

    if (!conversion_deletion_request_epik_targets_local_var) {
        goto end;
    }

    return conversion_deletion_request_epik_targets_local_var;
end:
    if (epiksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, epiksList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(epiksList);
        epiksList = NULL;
    }
    return NULL;

}
