#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_deletion_request_targets.h"



static conversion_deletion_request_targets_t *conversion_deletion_request_targets_create_internal(
    list_t *user_emails,
    list_t *epiks
    ) {
    conversion_deletion_request_targets_t *conversion_deletion_request_targets_local_var = malloc(sizeof(conversion_deletion_request_targets_t));
    if (!conversion_deletion_request_targets_local_var) {
        return NULL;
    }
    memset(conversion_deletion_request_targets_local_var, 0, sizeof(conversion_deletion_request_targets_t));
    conversion_deletion_request_targets_local_var->_library_owned = 1;
    conversion_deletion_request_targets_local_var->user_emails = user_emails;
    conversion_deletion_request_targets_local_var->epiks = epiks;
    return conversion_deletion_request_targets_local_var;
}

__attribute__((deprecated)) conversion_deletion_request_targets_t *conversion_deletion_request_targets_create(
    list_t *user_emails,
    list_t *epiks
    ) {
    conversion_deletion_request_targets_t *result = conversion_deletion_request_targets_create_internal (
        user_emails,
        epiks
        );
    if (!result) {
    }
    return result;
}

void conversion_deletion_request_targets_free(conversion_deletion_request_targets_t *conversion_deletion_request_targets) {
    if(NULL == conversion_deletion_request_targets){
        return ;
    }
    if(conversion_deletion_request_targets->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_deletion_request_targets_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_deletion_request_targets->user_emails) {
        list_ForEach(listEntry, conversion_deletion_request_targets->user_emails) {
            free(listEntry->data);
        }
        list_freeList(conversion_deletion_request_targets->user_emails);
        conversion_deletion_request_targets->user_emails = NULL;
    }
    if (conversion_deletion_request_targets->epiks) {
        list_ForEach(listEntry, conversion_deletion_request_targets->epiks) {
            free(listEntry->data);
        }
        list_freeList(conversion_deletion_request_targets->epiks);
        conversion_deletion_request_targets->epiks = NULL;
    }
    free(conversion_deletion_request_targets);
}

cJSON *conversion_deletion_request_targets_convertToJSON(conversion_deletion_request_targets_t *conversion_deletion_request_targets) {
    cJSON *item = cJSON_CreateObject();

    // conversion_deletion_request_targets->user_emails
    if (!conversion_deletion_request_targets->user_emails) {
        goto fail;
    }
    cJSON *user_emails = cJSON_AddArrayToObject(item, "user_emails");
    if(user_emails == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *user_emailsListEntry;
    list_ForEach(user_emailsListEntry, conversion_deletion_request_targets->user_emails) {
    if(cJSON_AddStringToObject(user_emails, "", user_emailsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // conversion_deletion_request_targets->epiks
    if (!conversion_deletion_request_targets->epiks) {
        goto fail;
    }
    cJSON *epiks = cJSON_AddArrayToObject(item, "epiks");
    if(epiks == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *epiksListEntry;
    list_ForEach(epiksListEntry, conversion_deletion_request_targets->epiks) {
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

conversion_deletion_request_targets_t *conversion_deletion_request_targets_parseFromJSON(cJSON *conversion_deletion_request_targetsJSON){

    conversion_deletion_request_targets_t *conversion_deletion_request_targets_local_var = NULL;

    // define the local list for conversion_deletion_request_targets->user_emails
    list_t *user_emailsList = NULL;

    // define the local list for conversion_deletion_request_targets->epiks
    list_t *epiksList = NULL;

    // conversion_deletion_request_targets->user_emails
    cJSON *user_emails = cJSON_GetObjectItemCaseSensitive(conversion_deletion_request_targetsJSON, "user_emails");
    if (cJSON_IsNull(user_emails)) {
        user_emails = NULL;
    }
    if (!user_emails) {
        goto end;
    }

    
    cJSON *user_emails_local = NULL;
    if(!cJSON_IsArray(user_emails)) {
        goto end;//primitive container
    }
    user_emailsList = list_createList();

    cJSON_ArrayForEach(user_emails_local, user_emails)
    {
        if(!cJSON_IsString(user_emails_local))
        {
            goto end;
        }
        list_addElement(user_emailsList , strdup(user_emails_local->valuestring));
    }

    // conversion_deletion_request_targets->epiks
    cJSON *epiks = cJSON_GetObjectItemCaseSensitive(conversion_deletion_request_targetsJSON, "epiks");
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



    conversion_deletion_request_targets_local_var = conversion_deletion_request_targets_create_internal (
        user_emailsList,
        epiksList
        );

    if (!conversion_deletion_request_targets_local_var) {
        goto end;
    }

    return conversion_deletion_request_targets_local_var;
end:
    if (user_emailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, user_emailsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(user_emailsList);
        user_emailsList = NULL;
    }
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
