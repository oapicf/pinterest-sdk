#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_asset_invites_request.h"



static create_asset_invites_request_t *create_asset_invites_request_create_internal(
    list_t *invites
    ) {
    create_asset_invites_request_t *create_asset_invites_request_local_var = malloc(sizeof(create_asset_invites_request_t));
    if (!create_asset_invites_request_local_var) {
        return NULL;
    }
    memset(create_asset_invites_request_local_var, 0, sizeof(create_asset_invites_request_t));
    create_asset_invites_request_local_var->_library_owned = 1;
    create_asset_invites_request_local_var->invites = invites;
    return create_asset_invites_request_local_var;
}

__attribute__((deprecated)) create_asset_invites_request_t *create_asset_invites_request_create(
    list_t *invites
    ) {
    create_asset_invites_request_t *result = create_asset_invites_request_create_internal (
        invites
        );
    if (!result) {
    }
    return result;
}

void create_asset_invites_request_free(create_asset_invites_request_t *create_asset_invites_request) {
    if(NULL == create_asset_invites_request){
        return ;
    }
    if(create_asset_invites_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_asset_invites_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_asset_invites_request->invites) {
        list_ForEach(listEntry, create_asset_invites_request->invites) {
            create_asset_invites_request_item_free(listEntry->data);
        }
        list_freeList(create_asset_invites_request->invites);
        create_asset_invites_request->invites = NULL;
    }
    free(create_asset_invites_request);
}

cJSON *create_asset_invites_request_convertToJSON(create_asset_invites_request_t *create_asset_invites_request) {
    cJSON *item = cJSON_CreateObject();

    // create_asset_invites_request->invites
    if (!create_asset_invites_request->invites) {
        goto fail;
    }
    cJSON *invites = cJSON_AddArrayToObject(item, "invites");
    if(invites == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *invitesListEntry;
    if (create_asset_invites_request->invites) {
    list_ForEach(invitesListEntry, create_asset_invites_request->invites) {
    cJSON *itemLocal = create_asset_invites_request_item_convertToJSON(invitesListEntry->data);
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

create_asset_invites_request_t *create_asset_invites_request_parseFromJSON(cJSON *create_asset_invites_requestJSON){

    create_asset_invites_request_t *create_asset_invites_request_local_var = NULL;

    // define the local list for create_asset_invites_request->invites
    list_t *invitesList = NULL;

    // create_asset_invites_request->invites
    cJSON *invites = cJSON_GetObjectItemCaseSensitive(create_asset_invites_requestJSON, "invites");
    if (cJSON_IsNull(invites)) {
        invites = NULL;
    }
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
        create_asset_invites_request_item_t *invitesItem = create_asset_invites_request_item_parseFromJSON(invites_local_nonprimitive);

        list_addElement(invitesList, invitesItem);
    }



    create_asset_invites_request_local_var = create_asset_invites_request_create_internal (
        invitesList
        );

    if (!create_asset_invites_request_local_var) {
        goto end;
    }

    return create_asset_invites_request_local_var;
end:
    if (invitesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, invitesList) {
            create_asset_invites_request_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(invitesList);
        invitesList = NULL;
    }
    return NULL;

}
