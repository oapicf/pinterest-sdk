#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_partners_request.h"



delete_partners_request_t *delete_partners_request_create(
    list_t *partner_ids,
    char *partner_type
    ) {
    delete_partners_request_t *delete_partners_request_local_var = malloc(sizeof(delete_partners_request_t));
    if (!delete_partners_request_local_var) {
        return NULL;
    }
    delete_partners_request_local_var->partner_ids = partner_ids;
    delete_partners_request_local_var->partner_type = partner_type;

    return delete_partners_request_local_var;
}


void delete_partners_request_free(delete_partners_request_t *delete_partners_request) {
    if(NULL == delete_partners_request){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_partners_request->partner_ids) {
        list_ForEach(listEntry, delete_partners_request->partner_ids) {
            free(listEntry->data);
        }
        list_freeList(delete_partners_request->partner_ids);
        delete_partners_request->partner_ids = NULL;
    }
    if (delete_partners_request->partner_type) {
        free(delete_partners_request->partner_type);
        delete_partners_request->partner_type = NULL;
    }
    free(delete_partners_request);
}

cJSON *delete_partners_request_convertToJSON(delete_partners_request_t *delete_partners_request) {
    cJSON *item = cJSON_CreateObject();

    // delete_partners_request->partner_ids
    if (!delete_partners_request->partner_ids) {
        goto fail;
    }
    cJSON *partner_ids = cJSON_AddArrayToObject(item, "partner_ids");
    if(partner_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *partner_idsListEntry;
    list_ForEach(partner_idsListEntry, delete_partners_request->partner_ids) {
    if(cJSON_AddStringToObject(partner_ids, "", (char*)partner_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // delete_partners_request->partner_type
    if(delete_partners_request->partner_type) {
    if(cJSON_AddStringToObject(item, "partner_type", delete_partners_request->partner_type) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delete_partners_request_t *delete_partners_request_parseFromJSON(cJSON *delete_partners_requestJSON){

    delete_partners_request_t *delete_partners_request_local_var = NULL;

    // define the local list for delete_partners_request->partner_ids
    list_t *partner_idsList = NULL;

    // delete_partners_request->partner_ids
    cJSON *partner_ids = cJSON_GetObjectItemCaseSensitive(delete_partners_requestJSON, "partner_ids");
    if (!partner_ids) {
        goto end;
    }

    
    cJSON *partner_ids_local = NULL;
    if(!cJSON_IsArray(partner_ids)) {
        goto end;//primitive container
    }
    partner_idsList = list_createList();

    cJSON_ArrayForEach(partner_ids_local, partner_ids)
    {
        if(!cJSON_IsString(partner_ids_local))
        {
            goto end;
        }
        list_addElement(partner_idsList , strdup(partner_ids_local->valuestring));
    }

    // delete_partners_request->partner_type
    cJSON *partner_type = cJSON_GetObjectItemCaseSensitive(delete_partners_requestJSON, "partner_type");
    if (partner_type) { 
    if(!cJSON_IsString(partner_type) && !cJSON_IsNull(partner_type))
    {
    goto end; //String
    }
    }


    delete_partners_request_local_var = delete_partners_request_create (
        partner_idsList,
        partner_type && !cJSON_IsNull(partner_type) ? strdup(partner_type->valuestring) : NULL
        );

    return delete_partners_request_local_var;
end:
    if (partner_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, partner_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(partner_idsList);
        partner_idsList = NULL;
    }
    return NULL;

}
