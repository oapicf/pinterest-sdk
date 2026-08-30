#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cancel_invites_request.h"



static cancel_invites_request_t *cancel_invites_request_create_internal(
    list_t *invite_ids
    ) {
    cancel_invites_request_t *cancel_invites_request_local_var = malloc(sizeof(cancel_invites_request_t));
    if (!cancel_invites_request_local_var) {
        return NULL;
    }
    memset(cancel_invites_request_local_var, 0, sizeof(cancel_invites_request_t));
    cancel_invites_request_local_var->_library_owned = 1;
    cancel_invites_request_local_var->invite_ids = invite_ids;
    return cancel_invites_request_local_var;
}

__attribute__((deprecated)) cancel_invites_request_t *cancel_invites_request_create(
    list_t *invite_ids
    ) {
    cancel_invites_request_t *result = cancel_invites_request_create_internal (
        invite_ids
        );
    if (!result) {
    }
    return result;
}

void cancel_invites_request_free(cancel_invites_request_t *cancel_invites_request) {
    if(NULL == cancel_invites_request){
        return ;
    }
    if(cancel_invites_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "cancel_invites_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (cancel_invites_request->invite_ids) {
        list_ForEach(listEntry, cancel_invites_request->invite_ids) {
            free(listEntry->data);
        }
        list_freeList(cancel_invites_request->invite_ids);
        cancel_invites_request->invite_ids = NULL;
    }
    free(cancel_invites_request);
}

cJSON *cancel_invites_request_convertToJSON(cancel_invites_request_t *cancel_invites_request) {
    cJSON *item = cJSON_CreateObject();

    // cancel_invites_request->invite_ids
    if (!cancel_invites_request->invite_ids) {
        goto fail;
    }
    cJSON *invite_ids = cJSON_AddArrayToObject(item, "invite_ids");
    if(invite_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *invite_idsListEntry;
    list_ForEach(invite_idsListEntry, cancel_invites_request->invite_ids) {
    if(cJSON_AddStringToObject(invite_ids, "", invite_idsListEntry->data) == NULL)
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

cancel_invites_request_t *cancel_invites_request_parseFromJSON(cJSON *cancel_invites_requestJSON){

    cancel_invites_request_t *cancel_invites_request_local_var = NULL;

    // define the local list for cancel_invites_request->invite_ids
    list_t *invite_idsList = NULL;

    // cancel_invites_request->invite_ids
    cJSON *invite_ids = cJSON_GetObjectItemCaseSensitive(cancel_invites_requestJSON, "invite_ids");
    if (cJSON_IsNull(invite_ids)) {
        invite_ids = NULL;
    }
    if (!invite_ids) {
        goto end;
    }

    
    cJSON *invite_ids_local = NULL;
    if(!cJSON_IsArray(invite_ids)) {
        goto end;//primitive container
    }
    invite_idsList = list_createList();

    cJSON_ArrayForEach(invite_ids_local, invite_ids)
    {
        if(!cJSON_IsString(invite_ids_local))
        {
            goto end;
        }
        list_addElement(invite_idsList , strdup(invite_ids_local->valuestring));
    }



    cancel_invites_request_local_var = cancel_invites_request_create_internal (
        invite_idsList
        );

    if (!cancel_invites_request_local_var) {
        goto end;
    }

    return cancel_invites_request_local_var;
end:
    if (invite_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, invite_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(invite_idsList);
        invite_idsList = NULL;
    }
    return NULL;

}
