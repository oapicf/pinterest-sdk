#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_operation_list.h"


char* targeting_spec_operation_list_operation_ToString(pinterest_rest_api_targeting_spec_operation_list_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "SET", "ADD", "REMOVE" };
    return operationArray[operation];
}

pinterest_rest_api_targeting_spec_operation_list_OPERATION_e targeting_spec_operation_list_operation_FromString(char* operation){
    int stringToReturn = 0;
    char *operationArray[] =  { "NULL", "SET", "ADD", "REMOVE" };
    size_t sizeofArray = sizeof(operationArray) / sizeof(operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation, operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static targeting_spec_operation_list_t *targeting_spec_operation_list_create_internal(
    char *field,
    pinterest_rest_api_targeting_spec_operation_list_OPERATION_e operation,
    list_t *values
    ) {
    targeting_spec_operation_list_t *targeting_spec_operation_list_local_var = malloc(sizeof(targeting_spec_operation_list_t));
    if (!targeting_spec_operation_list_local_var) {
        return NULL;
    }
    targeting_spec_operation_list_local_var->field = field;
    targeting_spec_operation_list_local_var->operation = operation;
    targeting_spec_operation_list_local_var->values = values;

    targeting_spec_operation_list_local_var->_library_owned = 1;
    return targeting_spec_operation_list_local_var;
}

__attribute__((deprecated)) targeting_spec_operation_list_t *targeting_spec_operation_list_create(
    char *field,
    pinterest_rest_api_targeting_spec_operation_list_OPERATION_e operation,
    list_t *values
    ) {
    return targeting_spec_operation_list_create_internal (
        field,
        operation,
        values
        );
}

void targeting_spec_operation_list_free(targeting_spec_operation_list_t *targeting_spec_operation_list) {
    if(NULL == targeting_spec_operation_list){
        return ;
    }
    if(targeting_spec_operation_list->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_spec_operation_list_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_spec_operation_list->field) {
        free(targeting_spec_operation_list->field);
        targeting_spec_operation_list->field = NULL;
    }
    if (targeting_spec_operation_list->values) {
        list_ForEach(listEntry, targeting_spec_operation_list->values) {
            free(listEntry->data);
        }
        list_freeList(targeting_spec_operation_list->values);
        targeting_spec_operation_list->values = NULL;
    }
    free(targeting_spec_operation_list);
}

cJSON *targeting_spec_operation_list_convertToJSON(targeting_spec_operation_list_t *targeting_spec_operation_list) {
    cJSON *item = cJSON_CreateObject();

    // targeting_spec_operation_list->field
    if (!targeting_spec_operation_list->field) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "field", targeting_spec_operation_list->field) == NULL) {
    goto fail; //String
    }


    // targeting_spec_operation_list->operation
    if (pinterest_rest_api_targeting_spec_operation_list_OPERATION_NULL == targeting_spec_operation_list->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", targeting_spec_operation_list_operation_ToString(targeting_spec_operation_list->operation)) == NULL)
    {
    goto fail; //Enum
    }


    // targeting_spec_operation_list->values
    if (!targeting_spec_operation_list->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *valuesListEntry;
    list_ForEach(valuesListEntry, targeting_spec_operation_list->values) {
    if(cJSON_AddStringToObject(values, "", valuesListEntry->data) == NULL)
    {
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

targeting_spec_operation_list_t *targeting_spec_operation_list_parseFromJSON(cJSON *targeting_spec_operation_listJSON){

    targeting_spec_operation_list_t *targeting_spec_operation_list_local_var = NULL;

    // define the local list for targeting_spec_operation_list->values
    list_t *valuesList = NULL;

    // targeting_spec_operation_list->field
    cJSON *field = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_listJSON, "field");
    if (cJSON_IsNull(field)) {
        field = NULL;
    }
    if (!field) {
        goto end;
    }

    
    if(!cJSON_IsString(field))
    {
    goto end; //String
    }

    // targeting_spec_operation_list->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_listJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_targeting_spec_operation_list_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = targeting_spec_operation_list_operation_FromString(operation->valuestring);

    // targeting_spec_operation_list->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_listJSON, "values");
    if (cJSON_IsNull(values)) {
        values = NULL;
    }
    if (!values) {
        goto end;
    }

    
    cJSON *values_local = NULL;
    if(!cJSON_IsArray(values)) {
        goto end;//primitive container
    }
    valuesList = list_createList();

    cJSON_ArrayForEach(values_local, values)
    {
        if(!cJSON_IsString(values_local))
        {
            goto end;
        }
        list_addElement(valuesList , strdup(values_local->valuestring));
    }


    targeting_spec_operation_list_local_var = targeting_spec_operation_list_create_internal (
        strdup(field->valuestring),
        operationVariable,
        valuesList
        );

    return targeting_spec_operation_list_local_var;
end:
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
