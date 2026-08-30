#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_events.h"



static conversion_events_t *conversion_events_create_internal(
    list_t *events,
    int *num_events_processed,
    int *num_events_received
    ) {
    conversion_events_t *conversion_events_local_var = malloc(sizeof(conversion_events_t));
    if (!conversion_events_local_var) {
        return NULL;
    }
    memset(conversion_events_local_var, 0, sizeof(conversion_events_t));
    conversion_events_local_var->_library_owned = 1;
    conversion_events_local_var->events = events;
    conversion_events_local_var->num_events_processed = num_events_processed;
    conversion_events_local_var->num_events_received = num_events_received;
    return conversion_events_local_var;
}

__attribute__((deprecated)) conversion_events_t *conversion_events_create(
    list_t *events,
    int *num_events_processed,
    int *num_events_received
    ) {
    int *num_events_processed_copy = NULL;
    if (num_events_processed) {
        num_events_processed_copy = malloc(sizeof(int));
        if (num_events_processed_copy) *num_events_processed_copy = *num_events_processed;
    }
    int *num_events_received_copy = NULL;
    if (num_events_received) {
        num_events_received_copy = malloc(sizeof(int));
        if (num_events_received_copy) *num_events_received_copy = *num_events_received;
    }
    conversion_events_t *result = conversion_events_create_internal (
        events,
        num_events_processed_copy,
        num_events_received_copy
        );
    if (!result) {
        free(num_events_processed_copy);
        free(num_events_received_copy);
    }
    return result;
}

void conversion_events_free(conversion_events_t *conversion_events) {
    if(NULL == conversion_events){
        return ;
    }
    if(conversion_events->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_events_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_events->events) {
        list_ForEach(listEntry, conversion_events->events) {
            conversion_api_response_events_items_free(listEntry->data);
        }
        list_freeList(conversion_events->events);
        conversion_events->events = NULL;
    }
    if (conversion_events->num_events_processed) {
        free(conversion_events->num_events_processed);
        conversion_events->num_events_processed = NULL;
    }
    if (conversion_events->num_events_received) {
        free(conversion_events->num_events_received);
        conversion_events->num_events_received = NULL;
    }
    free(conversion_events);
}

cJSON *conversion_events_convertToJSON(conversion_events_t *conversion_events) {
    cJSON *item = cJSON_CreateObject();

    // conversion_events->events
    if (!conversion_events->events) {
        goto fail;
    }
    cJSON *events = cJSON_AddArrayToObject(item, "events");
    if(events == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *eventsListEntry;
    if (conversion_events->events) {
    list_ForEach(eventsListEntry, conversion_events->events) {
    cJSON *itemLocal = conversion_api_response_events_items_convertToJSON(eventsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(events, itemLocal);
    }
    }


    // conversion_events->num_events_processed
    if (!conversion_events->num_events_processed) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "num_events_processed", *conversion_events->num_events_processed) == NULL) {
    goto fail; //Numeric
    }


    // conversion_events->num_events_received
    if (!conversion_events->num_events_received) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "num_events_received", *conversion_events->num_events_received) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_events_t *conversion_events_parseFromJSON(cJSON *conversion_eventsJSON){

    conversion_events_t *conversion_events_local_var = NULL;

    // define the local list for conversion_events->events
    list_t *eventsList = NULL;

    // define the local variable for conversion_events->num_events_processed
    int *num_events_processed_local_var = NULL;

    // define the local variable for conversion_events->num_events_received
    int *num_events_received_local_var = NULL;

    // conversion_events->events
    cJSON *events = cJSON_GetObjectItemCaseSensitive(conversion_eventsJSON, "events");
    if (cJSON_IsNull(events)) {
        events = NULL;
    }
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
        conversion_api_response_events_items_t *eventsItem = conversion_api_response_events_items_parseFromJSON(events_local_nonprimitive);

        list_addElement(eventsList, eventsItem);
    }

    // conversion_events->num_events_processed
    cJSON *num_events_processed = cJSON_GetObjectItemCaseSensitive(conversion_eventsJSON, "num_events_processed");
    if (cJSON_IsNull(num_events_processed)) {
        num_events_processed = NULL;
    }
    if (!num_events_processed) {
        goto end;
    }

    
    if(!cJSON_IsNumber(num_events_processed))
    {
    goto end; //Numeric
    }
    num_events_processed_local_var = malloc(sizeof(int));
    if(!num_events_processed_local_var)
    {
        goto end;
    }
    *num_events_processed_local_var = num_events_processed->valuedouble;

    // conversion_events->num_events_received
    cJSON *num_events_received = cJSON_GetObjectItemCaseSensitive(conversion_eventsJSON, "num_events_received");
    if (cJSON_IsNull(num_events_received)) {
        num_events_received = NULL;
    }
    if (!num_events_received) {
        goto end;
    }

    
    if(!cJSON_IsNumber(num_events_received))
    {
    goto end; //Numeric
    }
    num_events_received_local_var = malloc(sizeof(int));
    if(!num_events_received_local_var)
    {
        goto end;
    }
    *num_events_received_local_var = num_events_received->valuedouble;



    conversion_events_local_var = conversion_events_create_internal (
        eventsList,
        num_events_processed_local_var,
        num_events_received_local_var
        );

    if (!conversion_events_local_var) {
        goto end;
    }

    return conversion_events_local_var;
end:
    if (eventsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, eventsList) {
            conversion_api_response_events_items_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(eventsList);
        eventsList = NULL;
    }
    if (num_events_processed_local_var) {
        free(num_events_processed_local_var);
        num_events_processed_local_var = NULL;
    }
    if (num_events_received_local_var) {
        free(num_events_received_local_var);
        num_events_received_local_var = NULL;
    }
    return NULL;

}
