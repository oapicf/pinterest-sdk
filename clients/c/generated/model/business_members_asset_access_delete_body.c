#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_members_asset_access_delete_body.h"



static business_members_asset_access_delete_body_t *business_members_asset_access_delete_body_create_internal(
    list_t *accesses
    ) {
    business_members_asset_access_delete_body_t *business_members_asset_access_delete_body_local_var = malloc(sizeof(business_members_asset_access_delete_body_t));
    if (!business_members_asset_access_delete_body_local_var) {
        return NULL;
    }
    memset(business_members_asset_access_delete_body_local_var, 0, sizeof(business_members_asset_access_delete_body_t));
    business_members_asset_access_delete_body_local_var->_library_owned = 1;
    business_members_asset_access_delete_body_local_var->accesses = accesses;
    return business_members_asset_access_delete_body_local_var;
}

__attribute__((deprecated)) business_members_asset_access_delete_body_t *business_members_asset_access_delete_body_create(
    list_t *accesses
    ) {
    business_members_asset_access_delete_body_t *result = business_members_asset_access_delete_body_create_internal (
        accesses
        );
    if (!result) {
    }
    return result;
}

void business_members_asset_access_delete_body_free(business_members_asset_access_delete_body_t *business_members_asset_access_delete_body) {
    if(NULL == business_members_asset_access_delete_body){
        return ;
    }
    if(business_members_asset_access_delete_body->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "business_members_asset_access_delete_body_free");
        return ;
    }
    listEntry_t *listEntry;
    if (business_members_asset_access_delete_body->accesses) {
        list_ForEach(listEntry, business_members_asset_access_delete_body->accesses) {
            delete_member_asset_access_item_free(listEntry->data);
        }
        list_freeList(business_members_asset_access_delete_body->accesses);
        business_members_asset_access_delete_body->accesses = NULL;
    }
    free(business_members_asset_access_delete_body);
}

cJSON *business_members_asset_access_delete_body_convertToJSON(business_members_asset_access_delete_body_t *business_members_asset_access_delete_body) {
    cJSON *item = cJSON_CreateObject();

    // business_members_asset_access_delete_body->accesses
    if (!business_members_asset_access_delete_body->accesses) {
        goto fail;
    }
    cJSON *accesses = cJSON_AddArrayToObject(item, "accesses");
    if(accesses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *accessesListEntry;
    if (business_members_asset_access_delete_body->accesses) {
    list_ForEach(accessesListEntry, business_members_asset_access_delete_body->accesses) {
    cJSON *itemLocal = delete_member_asset_access_item_convertToJSON(accessesListEntry->data);
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

business_members_asset_access_delete_body_t *business_members_asset_access_delete_body_parseFromJSON(cJSON *business_members_asset_access_delete_bodyJSON){

    business_members_asset_access_delete_body_t *business_members_asset_access_delete_body_local_var = NULL;

    // define the local list for business_members_asset_access_delete_body->accesses
    list_t *accessesList = NULL;

    // business_members_asset_access_delete_body->accesses
    cJSON *accesses = cJSON_GetObjectItemCaseSensitive(business_members_asset_access_delete_bodyJSON, "accesses");
    if (cJSON_IsNull(accesses)) {
        accesses = NULL;
    }
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
        delete_member_asset_access_item_t *accessesItem = delete_member_asset_access_item_parseFromJSON(accesses_local_nonprimitive);

        list_addElement(accessesList, accessesItem);
    }



    business_members_asset_access_delete_body_local_var = business_members_asset_access_delete_body_create_internal (
        accessesList
        );

    if (!business_members_asset_access_delete_body_local_var) {
        goto end;
    }

    return business_members_asset_access_delete_body_local_var;
end:
    if (accessesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, accessesList) {
            delete_member_asset_access_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(accessesList);
        accessesList = NULL;
    }
    return NULL;

}
