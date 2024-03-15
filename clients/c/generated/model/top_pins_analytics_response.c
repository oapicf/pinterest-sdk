#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "top_pins_analytics_response.h"


char* top_pins_analytics_response_sort_by_ToString(pinterest_rest_api_top_pins_analytics_response_SORTBY_e sort_by) {
    char* sort_byArray[] =  { "NULL", "ENGAGEMENT", "SAVE", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK" };
    return sort_byArray[sort_by];
}

pinterest_rest_api_top_pins_analytics_response_SORTBY_e top_pins_analytics_response_sort_by_FromString(char* sort_by){
    int stringToReturn = 0;
    char *sort_byArray[] =  { "NULL", "ENGAGEMENT", "SAVE", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK" };
    size_t sizeofArray = sizeof(sort_byArray) / sizeof(sort_byArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(sort_by, sort_byArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

top_pins_analytics_response_t *top_pins_analytics_response_create(
    top_pins_analytics_response_date_availability_t *date_availability,
    list_t *pins,
    pinterest_rest_api_top_pins_analytics_response_SORTBY_e sort_by
    ) {
    top_pins_analytics_response_t *top_pins_analytics_response_local_var = malloc(sizeof(top_pins_analytics_response_t));
    if (!top_pins_analytics_response_local_var) {
        return NULL;
    }
    top_pins_analytics_response_local_var->date_availability = date_availability;
    top_pins_analytics_response_local_var->pins = pins;
    top_pins_analytics_response_local_var->sort_by = sort_by;

    return top_pins_analytics_response_local_var;
}


void top_pins_analytics_response_free(top_pins_analytics_response_t *top_pins_analytics_response) {
    if(NULL == top_pins_analytics_response){
        return ;
    }
    listEntry_t *listEntry;
    if (top_pins_analytics_response->date_availability) {
        top_pins_analytics_response_date_availability_free(top_pins_analytics_response->date_availability);
        top_pins_analytics_response->date_availability = NULL;
    }
    if (top_pins_analytics_response->pins) {
        list_ForEach(listEntry, top_pins_analytics_response->pins) {
            top_pins_analytics_response_pins_inner_free(listEntry->data);
        }
        list_freeList(top_pins_analytics_response->pins);
        top_pins_analytics_response->pins = NULL;
    }
    free(top_pins_analytics_response);
}

cJSON *top_pins_analytics_response_convertToJSON(top_pins_analytics_response_t *top_pins_analytics_response) {
    cJSON *item = cJSON_CreateObject();

    // top_pins_analytics_response->date_availability
    if(top_pins_analytics_response->date_availability) {
    cJSON *date_availability_local_JSON = top_pins_analytics_response_date_availability_convertToJSON(top_pins_analytics_response->date_availability);
    if(date_availability_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "date_availability", date_availability_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // top_pins_analytics_response->pins
    if(top_pins_analytics_response->pins) {
    cJSON *pins = cJSON_AddArrayToObject(item, "pins");
    if(pins == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pinsListEntry;
    if (top_pins_analytics_response->pins) {
    list_ForEach(pinsListEntry, top_pins_analytics_response->pins) {
    cJSON *itemLocal = top_pins_analytics_response_pins_inner_convertToJSON(pinsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pins, itemLocal);
    }
    }
    }


    // top_pins_analytics_response->sort_by
    if(top_pins_analytics_response->sort_by != pinterest_rest_api_top_pins_analytics_response_SORTBY_NULL) {
    if(cJSON_AddStringToObject(item, "sort_by", sort_bytop_pins_analytics_response_ToString(top_pins_analytics_response->sort_by)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

top_pins_analytics_response_t *top_pins_analytics_response_parseFromJSON(cJSON *top_pins_analytics_responseJSON){

    top_pins_analytics_response_t *top_pins_analytics_response_local_var = NULL;

    // define the local variable for top_pins_analytics_response->date_availability
    top_pins_analytics_response_date_availability_t *date_availability_local_nonprim = NULL;

    // define the local list for top_pins_analytics_response->pins
    list_t *pinsList = NULL;

    // top_pins_analytics_response->date_availability
    cJSON *date_availability = cJSON_GetObjectItemCaseSensitive(top_pins_analytics_responseJSON, "date_availability");
    if (date_availability) { 
    date_availability_local_nonprim = top_pins_analytics_response_date_availability_parseFromJSON(date_availability); //nonprimitive
    }

    // top_pins_analytics_response->pins
    cJSON *pins = cJSON_GetObjectItemCaseSensitive(top_pins_analytics_responseJSON, "pins");
    if (pins) { 
    cJSON *pins_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pins)){
        goto end; //nonprimitive container
    }

    pinsList = list_createList();

    cJSON_ArrayForEach(pins_local_nonprimitive,pins )
    {
        if(!cJSON_IsObject(pins_local_nonprimitive)){
            goto end;
        }
        top_pins_analytics_response_pins_inner_t *pinsItem = top_pins_analytics_response_pins_inner_parseFromJSON(pins_local_nonprimitive);

        list_addElement(pinsList, pinsItem);
    }
    }

    // top_pins_analytics_response->sort_by
    cJSON *sort_by = cJSON_GetObjectItemCaseSensitive(top_pins_analytics_responseJSON, "sort_by");
    pinterest_rest_api_top_pins_analytics_response_SORTBY_e sort_byVariable;
    if (sort_by) { 
    if(!cJSON_IsString(sort_by))
    {
    goto end; //Enum
    }
    sort_byVariable = top_pins_analytics_response_sort_by_FromString(sort_by->valuestring);
    }


    top_pins_analytics_response_local_var = top_pins_analytics_response_create (
        date_availability ? date_availability_local_nonprim : NULL,
        pins ? pinsList : NULL,
        sort_by ? sort_byVariable : pinterest_rest_api_top_pins_analytics_response_SORTBY_NULL
        );

    return top_pins_analytics_response_local_var;
end:
    if (date_availability_local_nonprim) {
        top_pins_analytics_response_date_availability_free(date_availability_local_nonprim);
        date_availability_local_nonprim = NULL;
    }
    if (pinsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pinsList) {
            top_pins_analytics_response_pins_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pinsList);
        pinsList = NULL;
    }
    return NULL;

}
