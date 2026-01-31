#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_operation_string.h"


char* targeting_spec_operation_string_operation_ToString(pinterest_rest_api_targeting_spec_operation_string_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "SET" };
    return operationArray[operation];
}

pinterest_rest_api_targeting_spec_operation_string_OPERATION_e targeting_spec_operation_string_operation_FromString(char* operation){
    int stringToReturn = 0;
    char *operationArray[] =  { "NULL", "SET" };
    size_t sizeofArray = sizeof(operationArray) / sizeof(operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation, operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static targeting_spec_operation_string_t *targeting_spec_operation_string_create_internal(
    char *field,
    pinterest_rest_api_targeting_spec_operation_string_OPERATION_e operation,
    char *value
    ) {
    targeting_spec_operation_string_t *targeting_spec_operation_string_local_var = malloc(sizeof(targeting_spec_operation_string_t));
    if (!targeting_spec_operation_string_local_var) {
        return NULL;
    }
    targeting_spec_operation_string_local_var->field = field;
    targeting_spec_operation_string_local_var->operation = operation;
    targeting_spec_operation_string_local_var->value = value;

    targeting_spec_operation_string_local_var->_library_owned = 1;
    return targeting_spec_operation_string_local_var;
}

__attribute__((deprecated)) targeting_spec_operation_string_t *targeting_spec_operation_string_create(
    char *field,
    pinterest_rest_api_targeting_spec_operation_string_OPERATION_e operation,
    char *value
    ) {
    return targeting_spec_operation_string_create_internal (
        field,
        operation,
        value
        );
}

void targeting_spec_operation_string_free(targeting_spec_operation_string_t *targeting_spec_operation_string) {
    if(NULL == targeting_spec_operation_string){
        return ;
    }
    if(targeting_spec_operation_string->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_spec_operation_string_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_spec_operation_string->field) {
        free(targeting_spec_operation_string->field);
        targeting_spec_operation_string->field = NULL;
    }
    if (targeting_spec_operation_string->value) {
        free(targeting_spec_operation_string->value);
        targeting_spec_operation_string->value = NULL;
    }
    free(targeting_spec_operation_string);
}

cJSON *targeting_spec_operation_string_convertToJSON(targeting_spec_operation_string_t *targeting_spec_operation_string) {
    cJSON *item = cJSON_CreateObject();

    // targeting_spec_operation_string->field
    if (!targeting_spec_operation_string->field) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "field", targeting_spec_operation_string->field) == NULL) {
    goto fail; //String
    }


    // targeting_spec_operation_string->operation
    if (pinterest_rest_api_targeting_spec_operation_string_OPERATION_NULL == targeting_spec_operation_string->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", targeting_spec_operation_string_operation_ToString(targeting_spec_operation_string->operation)) == NULL)
    {
    goto fail; //Enum
    }


    // targeting_spec_operation_string->value
    if (!targeting_spec_operation_string->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", targeting_spec_operation_string->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

targeting_spec_operation_string_t *targeting_spec_operation_string_parseFromJSON(cJSON *targeting_spec_operation_stringJSON){

    targeting_spec_operation_string_t *targeting_spec_operation_string_local_var = NULL;

    // targeting_spec_operation_string->field
    cJSON *field = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_stringJSON, "field");
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

    // targeting_spec_operation_string->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_stringJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_targeting_spec_operation_string_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = targeting_spec_operation_string_operation_FromString(operation->valuestring);

    // targeting_spec_operation_string->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_stringJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }


    targeting_spec_operation_string_local_var = targeting_spec_operation_string_create_internal (
        strdup(field->valuestring),
        operationVariable,
        strdup(value->valuestring)
        );

    return targeting_spec_operation_string_local_var;
end:
    return NULL;

}
