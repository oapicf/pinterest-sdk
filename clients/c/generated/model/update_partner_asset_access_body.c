#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_partner_asset_access_body.h"



update_partner_asset_access_body_t *update_partner_asset_access_body_create(
    list_t *accesses
    ) {
    update_partner_asset_access_body_t *update_partner_asset_access_body_local_var = malloc(sizeof(update_partner_asset_access_body_t));
    if (!update_partner_asset_access_body_local_var) {
        return NULL;
    }
    update_partner_asset_access_body_local_var->accesses = accesses;

    return update_partner_asset_access_body_local_var;
}


void update_partner_asset_access_body_free(update_partner_asset_access_body_t *update_partner_asset_access_body) {
    if(NULL == update_partner_asset_access_body){
        return ;
    }
    listEntry_t *listEntry;
    if (update_partner_asset_access_body->accesses) {
        list_ForEach(listEntry, update_partner_asset_access_body->accesses) {
            update_partner_asset_access_body_accesses_inner_free(listEntry->data);
        }
        list_freeList(update_partner_asset_access_body->accesses);
        update_partner_asset_access_body->accesses = NULL;
    }
    free(update_partner_asset_access_body);
}

cJSON *update_partner_asset_access_body_convertToJSON(update_partner_asset_access_body_t *update_partner_asset_access_body) {
    cJSON *item = cJSON_CreateObject();

    // update_partner_asset_access_body->accesses
    if (!update_partner_asset_access_body->accesses) {
        goto fail;
    }
    cJSON *accesses = cJSON_AddArrayToObject(item, "accesses");
    if(accesses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *accessesListEntry;
    if (update_partner_asset_access_body->accesses) {
    list_ForEach(accessesListEntry, update_partner_asset_access_body->accesses) {
    cJSON *itemLocal = update_partner_asset_access_body_accesses_inner_convertToJSON(accessesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(accesses, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_partner_asset_access_body_t *update_partner_asset_access_body_parseFromJSON(cJSON *update_partner_asset_access_bodyJSON){

    update_partner_asset_access_body_t *update_partner_asset_access_body_local_var = NULL;

    // define the local list for update_partner_asset_access_body->accesses
    list_t *accessesList = NULL;

    // update_partner_asset_access_body->accesses
    cJSON *accesses = cJSON_GetObjectItemCaseSensitive(update_partner_asset_access_bodyJSON, "accesses");
    if (!accesses) {
        goto end;
    }

    
    cJSON *accesses_local_nonprimitive = NULL;
    if(!cJSON_IsArray(accesses)){
        goto end; //nonprimitive container
    }

    accessesList = list_createList();

    cJSON_ArrayForEach(accesses_local_nonprimitive,accesses )
    {
        if(!cJSON_IsObject(accesses_local_nonprimitive)){
            goto end;
        }
        update_partner_asset_access_body_accesses_inner_t *accessesItem = update_partner_asset_access_body_accesses_inner_parseFromJSON(accesses_local_nonprimitive);

        list_addElement(accessesList, accessesItem);
    }


    update_partner_asset_access_body_local_var = update_partner_asset_access_body_create (
        accessesList
        );

    return update_partner_asset_access_body_local_var;
end:
    if (accessesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, accessesList) {
            update_partner_asset_access_body_accesses_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(accessesList);
        accessesList = NULL;
    }
    return NULL;

}
