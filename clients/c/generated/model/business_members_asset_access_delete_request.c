#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_members_asset_access_delete_request.h"



business_members_asset_access_delete_request_t *business_members_asset_access_delete_request_create(
    list_t *accesses
    ) {
    business_members_asset_access_delete_request_t *business_members_asset_access_delete_request_local_var = malloc(sizeof(business_members_asset_access_delete_request_t));
    if (!business_members_asset_access_delete_request_local_var) {
        return NULL;
    }
    business_members_asset_access_delete_request_local_var->accesses = accesses;

    return business_members_asset_access_delete_request_local_var;
}


void business_members_asset_access_delete_request_free(business_members_asset_access_delete_request_t *business_members_asset_access_delete_request) {
    if(NULL == business_members_asset_access_delete_request){
        return ;
    }
    listEntry_t *listEntry;
    if (business_members_asset_access_delete_request->accesses) {
        list_ForEach(listEntry, business_members_asset_access_delete_request->accesses) {
            business_members_asset_access_delete_request_accesses_inner_free(listEntry->data);
        }
        list_freeList(business_members_asset_access_delete_request->accesses);
        business_members_asset_access_delete_request->accesses = NULL;
    }
    free(business_members_asset_access_delete_request);
}

cJSON *business_members_asset_access_delete_request_convertToJSON(business_members_asset_access_delete_request_t *business_members_asset_access_delete_request) {
    cJSON *item = cJSON_CreateObject();

    // business_members_asset_access_delete_request->accesses
    if (!business_members_asset_access_delete_request->accesses) {
        goto fail;
    }
    cJSON *accesses = cJSON_AddArrayToObject(item, "accesses");
    if(accesses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *accessesListEntry;
    if (business_members_asset_access_delete_request->accesses) {
    list_ForEach(accessesListEntry, business_members_asset_access_delete_request->accesses) {
    cJSON *itemLocal = business_members_asset_access_delete_request_accesses_inner_convertToJSON(accessesListEntry->data);
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

business_members_asset_access_delete_request_t *business_members_asset_access_delete_request_parseFromJSON(cJSON *business_members_asset_access_delete_requestJSON){

    business_members_asset_access_delete_request_t *business_members_asset_access_delete_request_local_var = NULL;

    // define the local list for business_members_asset_access_delete_request->accesses
    list_t *accessesList = NULL;

    // business_members_asset_access_delete_request->accesses
    cJSON *accesses = cJSON_GetObjectItemCaseSensitive(business_members_asset_access_delete_requestJSON, "accesses");
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
        business_members_asset_access_delete_request_accesses_inner_t *accessesItem = business_members_asset_access_delete_request_accesses_inner_parseFromJSON(accesses_local_nonprimitive);

        list_addElement(accessesList, accessesItem);
    }


    business_members_asset_access_delete_request_local_var = business_members_asset_access_delete_request_create (
        accessesList
        );

    return business_members_asset_access_delete_request_local_var;
end:
    if (accessesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, accessesList) {
            business_members_asset_access_delete_request_accesses_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(accessesList);
        accessesList = NULL;
    }
    return NULL;

}
