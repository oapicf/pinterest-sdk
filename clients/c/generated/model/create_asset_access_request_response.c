#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_asset_access_request_response.h"



create_asset_access_request_response_t *create_asset_access_request_response_create(
    list_t *exceptions,
    list_t* invites
    ) {
    create_asset_access_request_response_t *create_asset_access_request_response_local_var = malloc(sizeof(create_asset_access_request_response_t));
    if (!create_asset_access_request_response_local_var) {
        return NULL;
    }
    create_asset_access_request_response_local_var->exceptions = exceptions;
    create_asset_access_request_response_local_var->invites = invites;

    return create_asset_access_request_response_local_var;
}


void create_asset_access_request_response_free(create_asset_access_request_response_t *create_asset_access_request_response) {
    if(NULL == create_asset_access_request_response){
        return ;
    }
    listEntry_t *listEntry;
    if (create_asset_access_request_response->exceptions) {
        list_ForEach(listEntry, create_asset_access_request_response->exceptions) {
            create_asset_access_request_error_message_inner_free(listEntry->data);
        }
        list_freeList(create_asset_access_request_response->exceptions);
        create_asset_access_request_response->exceptions = NULL;
    }
    if (create_asset_access_request_response->invites) {
        list_ForEach(listEntry, create_asset_access_request_response->invites) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(create_asset_access_request_response->invites);
        create_asset_access_request_response->invites = NULL;
    }
    free(create_asset_access_request_response);
}

cJSON *create_asset_access_request_response_convertToJSON(create_asset_access_request_response_t *create_asset_access_request_response) {
    cJSON *item = cJSON_CreateObject();

    // create_asset_access_request_response->exceptions
    if(create_asset_access_request_response->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *exceptionsListEntry;
    if (create_asset_access_request_response->exceptions) {
    list_ForEach(exceptionsListEntry, create_asset_access_request_response->exceptions) {
    cJSON *itemLocal = create_asset_access_request_error_message_inner_convertToJSON(exceptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(exceptions, itemLocal);
    }
    }
    }


    // create_asset_access_request_response->invites
    if(create_asset_access_request_response->invites) {
    cJSON *invites = cJSON_AddObjectToObject(item, "invites");
    if(invites == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = invites;
    listEntry_t *invitesListEntry;
    if (create_asset_access_request_response->invites) {
    list_ForEach(invitesListEntry, create_asset_access_request_response->invites) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)invitesListEntry->data;
        if(cJSON_AddStringToObject(localMapObject, localKeyValue->key, (char*)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_asset_access_request_response_t *create_asset_access_request_response_parseFromJSON(cJSON *create_asset_access_request_responseJSON){

    create_asset_access_request_response_t *create_asset_access_request_response_local_var = NULL;

    // define the local list for create_asset_access_request_response->exceptions
    list_t *exceptionsList = NULL;

    // define the local map for create_asset_access_request_response->invites
    list_t *invitesList = NULL;

    // create_asset_access_request_response->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(create_asset_access_request_responseJSON, "exceptions");
    if (exceptions) { 
    cJSON *exceptions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(exceptions)){
        goto end; //nonprimitive container
    }

    exceptionsList = list_createList();

    cJSON_ArrayForEach(exceptions_local_nonprimitive,exceptions )
    {
        if(!cJSON_IsObject(exceptions_local_nonprimitive)){
            goto end;
        }
        create_asset_access_request_error_message_inner_t *exceptionsItem = create_asset_access_request_error_message_inner_parseFromJSON(exceptions_local_nonprimitive);

        list_addElement(exceptionsList, exceptionsItem);
    }
    }

    // create_asset_access_request_response->invites
    cJSON *invites = cJSON_GetObjectItemCaseSensitive(create_asset_access_request_responseJSON, "invites");
    if (invites) { 
    cJSON *invites_local_map = NULL;
    if(!cJSON_IsObject(invites) && !cJSON_IsNull(invites))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(invites))
    {
        invitesList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(invites_local_map, invites)
        {
            cJSON *localMapObject = invites_local_map;
            if(!cJSON_IsString(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),strdup(localMapObject->valuestring));
            list_addElement(invitesList , localMapKeyPair);
        }
    }
    }


    create_asset_access_request_response_local_var = create_asset_access_request_response_create (
        exceptions ? exceptionsList : NULL,
        invites ? invitesList : NULL
        );

    return create_asset_access_request_response_local_var;
end:
    if (exceptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, exceptionsList) {
            create_asset_access_request_error_message_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(exceptionsList);
        exceptionsList = NULL;
    }
    if (invitesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, invitesList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            free(localKeyValue->value);
            localKeyValue->value = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(invitesList);
        invitesList = NULL;
    }
    return NULL;

}
