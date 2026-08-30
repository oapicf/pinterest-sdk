#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "top_pins_analytics_response.h"



static top_pins_analytics_response_t *top_pins_analytics_response_create_internal(
    top_pins_analytics_response_date_availability_t *date_availability,
    list_t *pins,
    pinterest_rest_api_top_pins_sort_by__e sort_by
    ) {
    top_pins_analytics_response_t *top_pins_analytics_response_local_var = malloc(sizeof(top_pins_analytics_response_t));
    if (!top_pins_analytics_response_local_var) {
        return NULL;
    }
    memset(top_pins_analytics_response_local_var, 0, sizeof(top_pins_analytics_response_t));
    top_pins_analytics_response_local_var->_library_owned = 1;
    top_pins_analytics_response_local_var->date_availability = date_availability;
    top_pins_analytics_response_local_var->pins = pins;
    top_pins_analytics_response_local_var->sort_by = sort_by;
    return top_pins_analytics_response_local_var;
}

__attribute__((deprecated)) top_pins_analytics_response_t *top_pins_analytics_response_create(
    top_pins_analytics_response_date_availability_t *date_availability,
    list_t *pins,
    pinterest_rest_api_top_pins_sort_by__e sort_by
    ) {
    top_pins_analytics_response_t *result = top_pins_analytics_response_create_internal (
        date_availability,
        pins,
        sort_by
        );
    if (!result) {
    }
    return result;
}

void top_pins_analytics_response_free(top_pins_analytics_response_t *top_pins_analytics_response) {
    if(NULL == top_pins_analytics_response){
        return ;
    }
    if(top_pins_analytics_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "top_pins_analytics_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (top_pins_analytics_response->date_availability) {
        top_pins_analytics_response_date_availability_free(top_pins_analytics_response->date_availability);
        top_pins_analytics_response->date_availability = NULL;
    }
    if (top_pins_analytics_response->pins) {
        list_ForEach(listEntry, top_pins_analytics_response->pins) {
            top_pins_analytics_response_pins_items_free(listEntry->data);
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
    cJSON *itemLocal = top_pins_analytics_response_pins_items_convertToJSON(pinsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pins, itemLocal);
    }
    }
    }


    // top_pins_analytics_response->sort_by
    if(top_pins_analytics_response->sort_by != pinterest_rest_api_top_pins_sort_by__NULL) {
    cJSON *sort_by_local_JSON = top_pins_sort_by_convertToJSON(top_pins_analytics_response->sort_by);
    if(sort_by_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "sort_by", sort_by_local_JSON);
    if(item->child == NULL) {
        goto fail;
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

    // define the local variable for top_pins_analytics_response->sort_by
    pinterest_rest_api_top_pins_sort_by__e sort_by_local_nonprim = 0;

    // top_pins_analytics_response->date_availability
    cJSON *date_availability = cJSON_GetObjectItemCaseSensitive(top_pins_analytics_responseJSON, "date_availability");
    if (cJSON_IsNull(date_availability)) {
        date_availability = NULL;
    }
    if (date_availability) { 
    date_availability_local_nonprim = top_pins_analytics_response_date_availability_parseFromJSON(date_availability); //nonprimitive
    }

    // top_pins_analytics_response->pins
    cJSON *pins = cJSON_GetObjectItemCaseSensitive(top_pins_analytics_responseJSON, "pins");
    if (cJSON_IsNull(pins)) {
        pins = NULL;
    }
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
        top_pins_analytics_response_pins_items_t *pinsItem = top_pins_analytics_response_pins_items_parseFromJSON(pins_local_nonprimitive);

        list_addElement(pinsList, pinsItem);
    }
    }

    // top_pins_analytics_response->sort_by
    cJSON *sort_by = cJSON_GetObjectItemCaseSensitive(top_pins_analytics_responseJSON, "sort_by");
    if (cJSON_IsNull(sort_by)) {
        sort_by = NULL;
    }
    if (sort_by) { 
    sort_by_local_nonprim = top_pins_sort_by_parseFromJSON(sort_by); //custom
    }



    top_pins_analytics_response_local_var = top_pins_analytics_response_create_internal (
        date_availability ? date_availability_local_nonprim : NULL,
        pins ? pinsList : NULL,
        sort_by ? sort_by_local_nonprim : 0
        );

    if (!top_pins_analytics_response_local_var) {
        goto end;
    }

    return top_pins_analytics_response_local_var;
end:
    if (date_availability_local_nonprim) {
        top_pins_analytics_response_date_availability_free(date_availability_local_nonprim);
        date_availability_local_nonprim = NULL;
    }
    if (pinsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pinsList) {
            top_pins_analytics_response_pins_items_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pinsList);
        pinsList = NULL;
    }
    if (sort_by_local_nonprim) {
        sort_by_local_nonprim = 0;
    }
    return NULL;

}
