#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_asset_access_request_body.h"



create_asset_access_request_body_t *create_asset_access_request_body_create(
    list_t *asset_requests
    ) {
    create_asset_access_request_body_t *create_asset_access_request_body_local_var = malloc(sizeof(create_asset_access_request_body_t));
    if (!create_asset_access_request_body_local_var) {
        return NULL;
    }
    create_asset_access_request_body_local_var->asset_requests = asset_requests;

    return create_asset_access_request_body_local_var;
}


void create_asset_access_request_body_free(create_asset_access_request_body_t *create_asset_access_request_body) {
    if(NULL == create_asset_access_request_body){
        return ;
    }
    listEntry_t *listEntry;
    if (create_asset_access_request_body->asset_requests) {
        list_ForEach(listEntry, create_asset_access_request_body->asset_requests) {
            create_asset_access_request_body_asset_requests_inner_free(listEntry->data);
        }
        list_freeList(create_asset_access_request_body->asset_requests);
        create_asset_access_request_body->asset_requests = NULL;
    }
    free(create_asset_access_request_body);
}

cJSON *create_asset_access_request_body_convertToJSON(create_asset_access_request_body_t *create_asset_access_request_body) {
    cJSON *item = cJSON_CreateObject();

    // create_asset_access_request_body->asset_requests
    if (!create_asset_access_request_body->asset_requests) {
        goto fail;
    }
    cJSON *asset_requests = cJSON_AddArrayToObject(item, "asset_requests");
    if(asset_requests == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *asset_requestsListEntry;
    if (create_asset_access_request_body->asset_requests) {
    list_ForEach(asset_requestsListEntry, create_asset_access_request_body->asset_requests) {
    cJSON *itemLocal = create_asset_access_request_body_asset_requests_inner_convertToJSON(asset_requestsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(asset_requests, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_asset_access_request_body_t *create_asset_access_request_body_parseFromJSON(cJSON *create_asset_access_request_bodyJSON){

    create_asset_access_request_body_t *create_asset_access_request_body_local_var = NULL;

    // define the local list for create_asset_access_request_body->asset_requests
    list_t *asset_requestsList = NULL;

    // create_asset_access_request_body->asset_requests
    cJSON *asset_requests = cJSON_GetObjectItemCaseSensitive(create_asset_access_request_bodyJSON, "asset_requests");
    if (!asset_requests) {
        goto end;
    }

    
    cJSON *asset_requests_local_nonprimitive = NULL;
    if(!cJSON_IsArray(asset_requests)){
        goto end; //nonprimitive container
    }

    asset_requestsList = list_createList();

    cJSON_ArrayForEach(asset_requests_local_nonprimitive,asset_requests )
    {
        if(!cJSON_IsObject(asset_requests_local_nonprimitive)){
            goto end;
        }
        create_asset_access_request_body_asset_requests_inner_t *asset_requestsItem = create_asset_access_request_body_asset_requests_inner_parseFromJSON(asset_requests_local_nonprimitive);

        list_addElement(asset_requestsList, asset_requestsItem);
    }


    create_asset_access_request_body_local_var = create_asset_access_request_body_create (
        asset_requestsList
        );

    return create_asset_access_request_body_local_var;
end:
    if (asset_requestsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, asset_requestsList) {
            create_asset_access_request_body_asset_requests_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(asset_requestsList);
        asset_requestsList = NULL;
    }
    return NULL;

}
