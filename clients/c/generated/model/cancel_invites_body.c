#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cancel_invites_body.h"



cancel_invites_body_t *cancel_invites_body_create(
    list_t *invite_ids
    ) {
    cancel_invites_body_t *cancel_invites_body_local_var = malloc(sizeof(cancel_invites_body_t));
    if (!cancel_invites_body_local_var) {
        return NULL;
    }
    cancel_invites_body_local_var->invite_ids = invite_ids;

    return cancel_invites_body_local_var;
}


void cancel_invites_body_free(cancel_invites_body_t *cancel_invites_body) {
    if(NULL == cancel_invites_body){
        return ;
    }
    listEntry_t *listEntry;
    if (cancel_invites_body->invite_ids) {
        list_ForEach(listEntry, cancel_invites_body->invite_ids) {
            free(listEntry->data);
        }
        list_freeList(cancel_invites_body->invite_ids);
        cancel_invites_body->invite_ids = NULL;
    }
    free(cancel_invites_body);
}

cJSON *cancel_invites_body_convertToJSON(cancel_invites_body_t *cancel_invites_body) {
    cJSON *item = cJSON_CreateObject();

    // cancel_invites_body->invite_ids
    if (!cancel_invites_body->invite_ids) {
        goto fail;
    }
    cJSON *invite_ids = cJSON_AddArrayToObject(item, "invite_ids");
    if(invite_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *invite_idsListEntry;
    list_ForEach(invite_idsListEntry, cancel_invites_body->invite_ids) {
    if(cJSON_AddStringToObject(invite_ids, "", (char*)invite_idsListEntry->data) == NULL)
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

cancel_invites_body_t *cancel_invites_body_parseFromJSON(cJSON *cancel_invites_bodyJSON){

    cancel_invites_body_t *cancel_invites_body_local_var = NULL;

    // define the local list for cancel_invites_body->invite_ids
    list_t *invite_idsList = NULL;

    // cancel_invites_body->invite_ids
    cJSON *invite_ids = cJSON_GetObjectItemCaseSensitive(cancel_invites_bodyJSON, "invite_ids");
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


    cancel_invites_body_local_var = cancel_invites_body_create (
        invite_idsList
        );

    return cancel_invites_body_local_var;
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
