#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_partners_response.h"



delete_partners_response_t *delete_partners_response_create(
    list_t *deleted_partners
    ) {
    delete_partners_response_t *delete_partners_response_local_var = malloc(sizeof(delete_partners_response_t));
    if (!delete_partners_response_local_var) {
        return NULL;
    }
    delete_partners_response_local_var->deleted_partners = deleted_partners;

    return delete_partners_response_local_var;
}


void delete_partners_response_free(delete_partners_response_t *delete_partners_response) {
    if(NULL == delete_partners_response){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_partners_response->deleted_partners) {
        list_ForEach(listEntry, delete_partners_response->deleted_partners) {
            free(listEntry->data);
        }
        list_freeList(delete_partners_response->deleted_partners);
        delete_partners_response->deleted_partners = NULL;
    }
    free(delete_partners_response);
}

cJSON *delete_partners_response_convertToJSON(delete_partners_response_t *delete_partners_response) {
    cJSON *item = cJSON_CreateObject();

    // delete_partners_response->deleted_partners
    if(delete_partners_response->deleted_partners) {
    cJSON *deleted_partners = cJSON_AddArrayToObject(item, "deleted_partners");
    if(deleted_partners == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *deleted_partnersListEntry;
    list_ForEach(deleted_partnersListEntry, delete_partners_response->deleted_partners) {
    if(cJSON_AddStringToObject(deleted_partners, "", (char*)deleted_partnersListEntry->data) == NULL)
    {
        goto fail;
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

delete_partners_response_t *delete_partners_response_parseFromJSON(cJSON *delete_partners_responseJSON){

    delete_partners_response_t *delete_partners_response_local_var = NULL;

    // define the local list for delete_partners_response->deleted_partners
    list_t *deleted_partnersList = NULL;

    // delete_partners_response->deleted_partners
    cJSON *deleted_partners = cJSON_GetObjectItemCaseSensitive(delete_partners_responseJSON, "deleted_partners");
    if (deleted_partners) { 
    cJSON *deleted_partners_local = NULL;
    if(!cJSON_IsArray(deleted_partners)) {
        goto end;//primitive container
    }
    deleted_partnersList = list_createList();

    cJSON_ArrayForEach(deleted_partners_local, deleted_partners)
    {
        if(!cJSON_IsString(deleted_partners_local))
        {
            goto end;
        }
        list_addElement(deleted_partnersList , strdup(deleted_partners_local->valuestring));
    }
    }


    delete_partners_response_local_var = delete_partners_response_create (
        deleted_partners ? deleted_partnersList : NULL
        );

    return delete_partners_response_local_var;
end:
    if (deleted_partnersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, deleted_partnersList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(deleted_partnersList);
        deleted_partnersList = NULL;
    }
    return NULL;

}
