#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_api_response.h"



conversion_api_response_t *conversion_api_response_create(
    int num_events_received,
    int num_events_processed,
    list_t *events
    ) {
    conversion_api_response_t *conversion_api_response_local_var = malloc(sizeof(conversion_api_response_t));
    if (!conversion_api_response_local_var) {
        return NULL;
    }
    conversion_api_response_local_var->num_events_received = num_events_received;
    conversion_api_response_local_var->num_events_processed = num_events_processed;
    conversion_api_response_local_var->events = events;

    return conversion_api_response_local_var;
}


void conversion_api_response_free(conversion_api_response_t *conversion_api_response) {
    if(NULL == conversion_api_response){
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_api_response->events) {
        list_ForEach(listEntry, conversion_api_response->events) {
            conversion_api_response_events_inner_free(listEntry->data);
        }
        list_freeList(conversion_api_response->events);
        conversion_api_response->events = NULL;
    }
    free(conversion_api_response);
}

cJSON *conversion_api_response_convertToJSON(conversion_api_response_t *conversion_api_response) {
    cJSON *item = cJSON_CreateObject();

    // conversion_api_response->num_events_received
    if (!conversion_api_response->num_events_received) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "num_events_received", conversion_api_response->num_events_received) == NULL) {
    goto fail; //Numeric
    }


    // conversion_api_response->num_events_processed
    if (!conversion_api_response->num_events_processed) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "num_events_processed", conversion_api_response->num_events_processed) == NULL) {
    goto fail; //Numeric
    }


    // conversion_api_response->events
    if (!conversion_api_response->events) {
        goto fail;
    }
    cJSON *events = cJSON_AddArrayToObject(item, "events");
    if(events == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *eventsListEntry;
    if (conversion_api_response->events) {
    list_ForEach(eventsListEntry, conversion_api_response->events) {
    cJSON *itemLocal = conversion_api_response_events_inner_convertToJSON(eventsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(events, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_api_response_t *conversion_api_response_parseFromJSON(cJSON *conversion_api_responseJSON){

    conversion_api_response_t *conversion_api_response_local_var = NULL;

    // define the local list for conversion_api_response->events
    list_t *eventsList = NULL;

    // conversion_api_response->num_events_received
    cJSON *num_events_received = cJSON_GetObjectItemCaseSensitive(conversion_api_responseJSON, "num_events_received");
    if (!num_events_received) {
        goto end;
    }

    
    if(!cJSON_IsNumber(num_events_received))
    {
    goto end; //Numeric
    }

    // conversion_api_response->num_events_processed
    cJSON *num_events_processed = cJSON_GetObjectItemCaseSensitive(conversion_api_responseJSON, "num_events_processed");
    if (!num_events_processed) {
        goto end;
    }

    
    if(!cJSON_IsNumber(num_events_processed))
    {
    goto end; //Numeric
    }

    // conversion_api_response->events
    cJSON *events = cJSON_GetObjectItemCaseSensitive(conversion_api_responseJSON, "events");
    if (!events) {
        goto end;
    }

    
    cJSON *events_local_nonprimitive = NULL;
    if(!cJSON_IsArray(events)){
        goto end; //nonprimitive container
    }

    eventsList = list_createList();

    cJSON_ArrayForEach(events_local_nonprimitive,events )
    {
        if(!cJSON_IsObject(events_local_nonprimitive)){
            goto end;
        }
        conversion_api_response_events_inner_t *eventsItem = conversion_api_response_events_inner_parseFromJSON(events_local_nonprimitive);

        list_addElement(eventsList, eventsItem);
    }


    conversion_api_response_local_var = conversion_api_response_create (
        num_events_received->valuedouble,
        num_events_processed->valuedouble,
        eventsList
        );

    return conversion_api_response_local_var;
end:
    if (eventsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, eventsList) {
            conversion_api_response_events_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(eventsList);
        eventsList = NULL;
    }
    return NULL;

}
