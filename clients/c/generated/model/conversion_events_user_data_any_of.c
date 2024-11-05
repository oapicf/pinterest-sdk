#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_events_user_data_any_of.h"



conversion_events_user_data_any_of_t *conversion_events_user_data_any_of_create(
    list_t *em,
    list_t *hashed_maids,
    char *client_ip_address,
    char *client_user_agent
    ) {
    conversion_events_user_data_any_of_t *conversion_events_user_data_any_of_local_var = malloc(sizeof(conversion_events_user_data_any_of_t));
    if (!conversion_events_user_data_any_of_local_var) {
        return NULL;
    }
    conversion_events_user_data_any_of_local_var->em = em;
    conversion_events_user_data_any_of_local_var->hashed_maids = hashed_maids;
    conversion_events_user_data_any_of_local_var->client_ip_address = client_ip_address;
    conversion_events_user_data_any_of_local_var->client_user_agent = client_user_agent;

    return conversion_events_user_data_any_of_local_var;
}


void conversion_events_user_data_any_of_free(conversion_events_user_data_any_of_t *conversion_events_user_data_any_of) {
    if(NULL == conversion_events_user_data_any_of){
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_events_user_data_any_of->em) {
        list_ForEach(listEntry, conversion_events_user_data_any_of->em) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_any_of->em);
        conversion_events_user_data_any_of->em = NULL;
    }
    if (conversion_events_user_data_any_of->hashed_maids) {
        list_ForEach(listEntry, conversion_events_user_data_any_of->hashed_maids) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_any_of->hashed_maids);
        conversion_events_user_data_any_of->hashed_maids = NULL;
    }
    if (conversion_events_user_data_any_of->client_ip_address) {
        free(conversion_events_user_data_any_of->client_ip_address);
        conversion_events_user_data_any_of->client_ip_address = NULL;
    }
    if (conversion_events_user_data_any_of->client_user_agent) {
        free(conversion_events_user_data_any_of->client_user_agent);
        conversion_events_user_data_any_of->client_user_agent = NULL;
    }
    free(conversion_events_user_data_any_of);
}

cJSON *conversion_events_user_data_any_of_convertToJSON(conversion_events_user_data_any_of_t *conversion_events_user_data_any_of) {
    cJSON *item = cJSON_CreateObject();

    // conversion_events_user_data_any_of->em
    if (!conversion_events_user_data_any_of->em) {
        goto fail;
    }
    cJSON *em = cJSON_AddArrayToObject(item, "em");
    if(em == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *emListEntry;
    list_ForEach(emListEntry, conversion_events_user_data_any_of->em) {
    if(cJSON_AddStringToObject(em, "", (char*)emListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // conversion_events_user_data_any_of->hashed_maids
    if(conversion_events_user_data_any_of->hashed_maids) {
    cJSON *hashed_maids = cJSON_AddArrayToObject(item, "hashed_maids");
    if(hashed_maids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *hashed_maidsListEntry;
    list_ForEach(hashed_maidsListEntry, conversion_events_user_data_any_of->hashed_maids) {
    if(cJSON_AddStringToObject(hashed_maids, "", (char*)hashed_maidsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data_any_of->client_ip_address
    if(conversion_events_user_data_any_of->client_ip_address) {
    if(cJSON_AddStringToObject(item, "client_ip_address", conversion_events_user_data_any_of->client_ip_address) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_user_data_any_of->client_user_agent
    if(conversion_events_user_data_any_of->client_user_agent) {
    if(cJSON_AddStringToObject(item, "client_user_agent", conversion_events_user_data_any_of->client_user_agent) == NULL) {
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

conversion_events_user_data_any_of_t *conversion_events_user_data_any_of_parseFromJSON(cJSON *conversion_events_user_data_any_ofJSON){

    conversion_events_user_data_any_of_t *conversion_events_user_data_any_of_local_var = NULL;

    // define the local list for conversion_events_user_data_any_of->em
    list_t *emList = NULL;

    // define the local list for conversion_events_user_data_any_of->hashed_maids
    list_t *hashed_maidsList = NULL;

    // conversion_events_user_data_any_of->em
    cJSON *em = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_any_ofJSON, "em");
    if (!em) {
        goto end;
    }

    
    cJSON *em_local = NULL;
    if(!cJSON_IsArray(em)) {
        goto end;//primitive container
    }
    emList = list_createList();

    cJSON_ArrayForEach(em_local, em)
    {
        if(!cJSON_IsString(em_local))
        {
            goto end;
        }
        list_addElement(emList , strdup(em_local->valuestring));
    }

    // conversion_events_user_data_any_of->hashed_maids
    cJSON *hashed_maids = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_any_ofJSON, "hashed_maids");
    if (hashed_maids) { 
    cJSON *hashed_maids_local = NULL;
    if(!cJSON_IsArray(hashed_maids)) {
        goto end;//primitive container
    }
    hashed_maidsList = list_createList();

    cJSON_ArrayForEach(hashed_maids_local, hashed_maids)
    {
        if(!cJSON_IsString(hashed_maids_local))
        {
            goto end;
        }
        list_addElement(hashed_maidsList , strdup(hashed_maids_local->valuestring));
    }
    }

    // conversion_events_user_data_any_of->client_ip_address
    cJSON *client_ip_address = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_any_ofJSON, "client_ip_address");
    if (client_ip_address) { 
    if(!cJSON_IsString(client_ip_address) && !cJSON_IsNull(client_ip_address))
    {
    goto end; //String
    }
    }

    // conversion_events_user_data_any_of->client_user_agent
    cJSON *client_user_agent = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_any_ofJSON, "client_user_agent");
    if (client_user_agent) { 
    if(!cJSON_IsString(client_user_agent) && !cJSON_IsNull(client_user_agent))
    {
    goto end; //String
    }
    }


    conversion_events_user_data_any_of_local_var = conversion_events_user_data_any_of_create (
        emList,
        hashed_maids ? hashed_maidsList : NULL,
        client_ip_address && !cJSON_IsNull(client_ip_address) ? strdup(client_ip_address->valuestring) : NULL,
        client_user_agent && !cJSON_IsNull(client_user_agent) ? strdup(client_user_agent->valuestring) : NULL
        );

    return conversion_events_user_data_any_of_local_var;
end:
    if (emList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, emList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(emList);
        emList = NULL;
    }
    if (hashed_maidsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, hashed_maidsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(hashed_maidsList);
        hashed_maidsList = NULL;
    }
    return NULL;

}
