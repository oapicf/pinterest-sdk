#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_partner_asset_access_body.h"



delete_partner_asset_access_body_t *delete_partner_asset_access_body_create(
    list_t *accesses
    ) {
    delete_partner_asset_access_body_t *delete_partner_asset_access_body_local_var = malloc(sizeof(delete_partner_asset_access_body_t));
    if (!delete_partner_asset_access_body_local_var) {
        return NULL;
    }
    delete_partner_asset_access_body_local_var->accesses = accesses;

    return delete_partner_asset_access_body_local_var;
}


void delete_partner_asset_access_body_free(delete_partner_asset_access_body_t *delete_partner_asset_access_body) {
    if(NULL == delete_partner_asset_access_body){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_partner_asset_access_body->accesses) {
        list_ForEach(listEntry, delete_partner_asset_access_body->accesses) {
            delete_partner_asset_access_body_accesses_inner_free(listEntry->data);
        }
        list_freeList(delete_partner_asset_access_body->accesses);
        delete_partner_asset_access_body->accesses = NULL;
    }
    free(delete_partner_asset_access_body);
}

cJSON *delete_partner_asset_access_body_convertToJSON(delete_partner_asset_access_body_t *delete_partner_asset_access_body) {
    cJSON *item = cJSON_CreateObject();

    // delete_partner_asset_access_body->accesses
    if (!delete_partner_asset_access_body->accesses) {
        goto fail;
    }
    cJSON *accesses = cJSON_AddArrayToObject(item, "accesses");
    if(accesses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *accessesListEntry;
    if (delete_partner_asset_access_body->accesses) {
    list_ForEach(accessesListEntry, delete_partner_asset_access_body->accesses) {
    cJSON *itemLocal = delete_partner_asset_access_body_accesses_inner_convertToJSON(accessesListEntry->data);
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

delete_partner_asset_access_body_t *delete_partner_asset_access_body_parseFromJSON(cJSON *delete_partner_asset_access_bodyJSON){

    delete_partner_asset_access_body_t *delete_partner_asset_access_body_local_var = NULL;

    // define the local list for delete_partner_asset_access_body->accesses
    list_t *accessesList = NULL;

    // delete_partner_asset_access_body->accesses
    cJSON *accesses = cJSON_GetObjectItemCaseSensitive(delete_partner_asset_access_bodyJSON, "accesses");
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
        delete_partner_asset_access_body_accesses_inner_t *accessesItem = delete_partner_asset_access_body_accesses_inner_parseFromJSON(accesses_local_nonprimitive);

        list_addElement(accessesList, accessesItem);
    }


    delete_partner_asset_access_body_local_var = delete_partner_asset_access_body_create (
        accessesList
        );

    return delete_partner_asset_access_body_local_var;
end:
    if (accessesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, accessesList) {
            delete_partner_asset_access_body_accesses_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(accessesList);
        accessesList = NULL;
    }
    return NULL;

}
