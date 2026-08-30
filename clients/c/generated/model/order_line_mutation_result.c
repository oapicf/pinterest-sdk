#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_line_mutation_result.h"



static order_line_mutation_result_t *order_line_mutation_result_create_internal(
    list_t *errors,
    list_t *order_line
    ) {
    order_line_mutation_result_t *order_line_mutation_result_local_var = malloc(sizeof(order_line_mutation_result_t));
    if (!order_line_mutation_result_local_var) {
        return NULL;
    }
    memset(order_line_mutation_result_local_var, 0, sizeof(order_line_mutation_result_t));
    order_line_mutation_result_local_var->_library_owned = 1;
    order_line_mutation_result_local_var->errors = errors;
    order_line_mutation_result_local_var->order_line = order_line;
    return order_line_mutation_result_local_var;
}

__attribute__((deprecated)) order_line_mutation_result_t *order_line_mutation_result_create(
    list_t *errors,
    list_t *order_line
    ) {
    order_line_mutation_result_t *result = order_line_mutation_result_create_internal (
        errors,
        order_line
        );
    if (!result) {
    }
    return result;
}

void order_line_mutation_result_free(order_line_mutation_result_t *order_line_mutation_result) {
    if(NULL == order_line_mutation_result){
        return ;
    }
    if(order_line_mutation_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "order_line_mutation_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (order_line_mutation_result->errors) {
        list_ForEach(listEntry, order_line_mutation_result->errors) {
            order_line_mutation_error_free(listEntry->data);
        }
        list_freeList(order_line_mutation_result->errors);
        order_line_mutation_result->errors = NULL;
    }
    if (order_line_mutation_result->order_line) {
        list_ForEach(listEntry, order_line_mutation_result->order_line) {
            order_line_free(listEntry->data);
        }
        list_freeList(order_line_mutation_result->order_line);
        order_line_mutation_result->order_line = NULL;
    }
    free(order_line_mutation_result);
}

cJSON *order_line_mutation_result_convertToJSON(order_line_mutation_result_t *order_line_mutation_result) {
    cJSON *item = cJSON_CreateObject();

    // order_line_mutation_result->errors
    if(order_line_mutation_result->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (order_line_mutation_result->errors) {
    list_ForEach(errorsListEntry, order_line_mutation_result->errors) {
    cJSON *itemLocal = order_line_mutation_error_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // order_line_mutation_result->order_line
    if(order_line_mutation_result->order_line) {
    cJSON *order_line = cJSON_AddArrayToObject(item, "order_line");
    if(order_line == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *order_lineListEntry;
    if (order_line_mutation_result->order_line) {
    list_ForEach(order_lineListEntry, order_line_mutation_result->order_line) {
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

order_line_mutation_result_t *order_line_mutation_result_parseFromJSON(cJSON *order_line_mutation_resultJSON){

    order_line_mutation_result_t *order_line_mutation_result_local_var = NULL;

    // define the local list for order_line_mutation_result->errors
    list_t *errorsList = NULL;

    // define the local list for order_line_mutation_result->order_line
    list_t *order_lineList = NULL;

    // order_line_mutation_result->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(order_line_mutation_resultJSON, "errors");
    if (cJSON_IsNull(errors)) {
        errors = NULL;
    }
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
        order_line_mutation_error_t *errorsItem = order_line_mutation_error_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }

    // order_line_mutation_result->order_line
    cJSON *order_line = cJSON_GetObjectItemCaseSensitive(order_line_mutation_resultJSON, "order_line");
    if (cJSON_IsNull(order_line)) {
        order_line = NULL;
    }
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



    order_line_mutation_result_local_var = order_line_mutation_result_create_internal (
        errors ? errorsList : NULL,
        order_line ? order_lineList : NULL
        );

    if (!order_line_mutation_result_local_var) {
        goto end;
    }

    return order_line_mutation_result_local_var;
end:
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            order_line_mutation_error_free(listEntry->data);
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
