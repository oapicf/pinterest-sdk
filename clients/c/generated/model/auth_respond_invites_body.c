#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "auth_respond_invites_body.h"



auth_respond_invites_body_t *auth_respond_invites_body_create(
    list_t *invites
    ) {
    auth_respond_invites_body_t *auth_respond_invites_body_local_var = malloc(sizeof(auth_respond_invites_body_t));
    if (!auth_respond_invites_body_local_var) {
        return NULL;
    }
    auth_respond_invites_body_local_var->invites = invites;

    return auth_respond_invites_body_local_var;
}


void auth_respond_invites_body_free(auth_respond_invites_body_t *auth_respond_invites_body) {
    if(NULL == auth_respond_invites_body){
        return ;
    }
    listEntry_t *listEntry;
    if (auth_respond_invites_body->invites) {
        list_ForEach(listEntry, auth_respond_invites_body->invites) {
            auth_respond_invites_body_invites_inner_free(listEntry->data);
        }
        list_freeList(auth_respond_invites_body->invites);
        auth_respond_invites_body->invites = NULL;
    }
    free(auth_respond_invites_body);
}

cJSON *auth_respond_invites_body_convertToJSON(auth_respond_invites_body_t *auth_respond_invites_body) {
    cJSON *item = cJSON_CreateObject();

    // auth_respond_invites_body->invites
    if (!auth_respond_invites_body->invites) {
        goto fail;
    }
    cJSON *invites = cJSON_AddArrayToObject(item, "invites");
    if(invites == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *invitesListEntry;
    if (auth_respond_invites_body->invites) {
    list_ForEach(invitesListEntry, auth_respond_invites_body->invites) {
    cJSON *itemLocal = auth_respond_invites_body_invites_inner_convertToJSON(invitesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(invites, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

auth_respond_invites_body_t *auth_respond_invites_body_parseFromJSON(cJSON *auth_respond_invites_bodyJSON){

    auth_respond_invites_body_t *auth_respond_invites_body_local_var = NULL;

    // define the local list for auth_respond_invites_body->invites
    list_t *invitesList = NULL;

    // auth_respond_invites_body->invites
    cJSON *invites = cJSON_GetObjectItemCaseSensitive(auth_respond_invites_bodyJSON, "invites");
    if (!invites) {
        goto end;
    }

    
    cJSON *invites_local_nonprimitive = NULL;
    if(!cJSON_IsArray(invites)){
        goto end; //nonprimitive container
    }

    invitesList = list_createList();

    cJSON_ArrayForEach(invites_local_nonprimitive,invites )
    {
        if(!cJSON_IsObject(invites_local_nonprimitive)){
            goto end;
        }
        auth_respond_invites_body_invites_inner_t *invitesItem = auth_respond_invites_body_invites_inner_parseFromJSON(invites_local_nonprimitive);

        list_addElement(invitesList, invitesItem);
    }


    auth_respond_invites_body_local_var = auth_respond_invites_body_create (
        invitesList
        );

    return auth_respond_invites_body_local_var;
end:
    if (invitesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, invitesList) {
            auth_respond_invites_body_invites_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(invitesList);
        invitesList = NULL;
    }
    return NULL;

}
