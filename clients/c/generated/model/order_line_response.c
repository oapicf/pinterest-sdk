#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_line_response.h"



order_line_response_t *order_line_response_create(
    list_t *errors,
    list_t *order_line
    ) {
    order_line_response_t *order_line_response_local_var = malloc(sizeof(order_line_response_t));
    if (!order_line_response_local_var) {
        return NULL;
    }
    order_line_response_local_var->errors = errors;
    order_line_response_local_var->order_line = order_line;

    return order_line_response_local_var;
}


void order_line_response_free(order_line_response_t *order_line_response) {
    if(NULL == order_line_response){
        return ;
    }
    listEntry_t *listEntry;
    if (order_line_response->errors) {
        list_ForEach(listEntry, order_line_response->errors) {
            order_line_error_free(listEntry->data);
        }
        list_freeList(order_line_response->errors);
        order_line_response->errors = NULL;
    }
    if (order_line_response->order_line) {
        list_ForEach(listEntry, order_line_response->order_line) {
            order_line_free(listEntry->data);
        }
        list_freeList(order_line_response->order_line);
        order_line_response->order_line = NULL;
    }
    free(order_line_response);
}

cJSON *order_line_response_convertToJSON(order_line_response_t *order_line_response) {
    cJSON *item = cJSON_CreateObject();

    // order_line_response->errors
    if(order_line_response->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (order_line_response->errors) {
    list_ForEach(errorsListEntry, order_line_response->errors) {
    cJSON *itemLocal = order_line_error_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // order_line_response->order_line
    if(order_line_response->order_line) {
    cJSON *order_line = cJSON_AddArrayToObject(item, "order_line");
    if(order_line == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *order_lineListEntry;
    if (order_line_response->order_line) {
    list_ForEach(order_lineListEntry, order_line_response->order_line) {
    cJSON *itemLocal = order_line_convertToJSON(order_lineListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(order_line, itemLocal);
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

order_line_response_t *order_line_response_parseFromJSON(cJSON *order_line_responseJSON){

    order_line_response_t *order_line_response_local_var = NULL;

    // define the local list for order_line_response->errors
    list_t *errorsList = NULL;

    // define the local list for order_line_response->order_line
    list_t *order_lineList = NULL;

    // order_line_response->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(order_line_responseJSON, "errors");
    if (errors) { 
    cJSON *errors_local_nonprimitive = NULL;
    if(!cJSON_IsArray(errors)){
        goto end; //nonprimitive container
    }

    errorsList = list_createList();

    cJSON_ArrayForEach(errors_local_nonprimitive,errors )
    {
        if(!cJSON_IsObject(errors_local_nonprimitive)){
            goto end;
        }
        order_line_error_t *errorsItem = order_line_error_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }

    // order_line_response->order_line
    cJSON *order_line = cJSON_GetObjectItemCaseSensitive(order_line_responseJSON, "order_line");
    if (order_line) { 
    cJSON *order_line_local_nonprimitive = NULL;
    if(!cJSON_IsArray(order_line)){
        goto end; //nonprimitive container
    }

    order_lineList = list_createList();

    cJSON_ArrayForEach(order_line_local_nonprimitive,order_line )
    {
        if(!cJSON_IsObject(order_line_local_nonprimitive)){
            goto end;
        }
        order_line_t *order_lineItem = order_line_parseFromJSON(order_line_local_nonprimitive);

        list_addElement(order_lineList, order_lineItem);
    }
    }


    order_line_response_local_var = order_line_response_create (
        errors ? errorsList : NULL,
        order_line ? order_lineList : NULL
        );

    return order_line_response_local_var;
end:
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            order_line_error_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    if (order_lineList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, order_lineList) {
            order_line_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(order_lineList);
        order_lineList = NULL;
    }
    return NULL;

}
