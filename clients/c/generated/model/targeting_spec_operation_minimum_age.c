#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_operation_minimum_age.h"


char* targeting_spec_operation_minimum_age_field_ToString(pinterest_rest_api_targeting_spec_operation_minimum_age_FIELD_e field) {
    char* fieldArray[] =  { "NULL", "MINIMUM_AGE" };
    return fieldArray[field];
}

pinterest_rest_api_targeting_spec_operation_minimum_age_FIELD_e targeting_spec_operation_minimum_age_field_FromString(char* field){
    int stringToReturn = 0;
    char *fieldArray[] =  { "NULL", "MINIMUM_AGE" };
    size_t sizeofArray = sizeof(fieldArray) / sizeof(fieldArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(field, fieldArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* targeting_spec_operation_minimum_age_operation_ToString(pinterest_rest_api_targeting_spec_operation_minimum_age_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "SET" };
    return operationArray[operation];
}

pinterest_rest_api_targeting_spec_operation_minimum_age_OPERATION_e targeting_spec_operation_minimum_age_operation_FromString(char* operation){
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

static targeting_spec_operation_minimum_age_t *targeting_spec_operation_minimum_age_create_internal(
    pinterest_rest_api_targeting_spec_operation_minimum_age_FIELD_e field,
    pinterest_rest_api_targeting_spec_operation_minimum_age_OPERATION_e operation,
    char *value
    ) {
    targeting_spec_operation_minimum_age_t *targeting_spec_operation_minimum_age_local_var = malloc(sizeof(targeting_spec_operation_minimum_age_t));
    if (!targeting_spec_operation_minimum_age_local_var) {
        return NULL;
    }
    memset(targeting_spec_operation_minimum_age_local_var, 0, sizeof(targeting_spec_operation_minimum_age_t));
    targeting_spec_operation_minimum_age_local_var->_library_owned = 1;
    targeting_spec_operation_minimum_age_local_var->field = field;
    targeting_spec_operation_minimum_age_local_var->operation = operation;
    targeting_spec_operation_minimum_age_local_var->value = value;
    return targeting_spec_operation_minimum_age_local_var;
}

__attribute__((deprecated)) targeting_spec_operation_minimum_age_t *targeting_spec_operation_minimum_age_create(
    pinterest_rest_api_targeting_spec_operation_minimum_age_FIELD_e field,
    pinterest_rest_api_targeting_spec_operation_minimum_age_OPERATION_e operation,
    char *value
    ) {
    targeting_spec_operation_minimum_age_t *result = targeting_spec_operation_minimum_age_create_internal (
        field,
        operation,
        value
        );
    if (!result) {
    }
    return result;
}

void targeting_spec_operation_minimum_age_free(targeting_spec_operation_minimum_age_t *targeting_spec_operation_minimum_age) {
    if(NULL == targeting_spec_operation_minimum_age){
        return ;
    }
    if(targeting_spec_operation_minimum_age->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_spec_operation_minimum_age_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_spec_operation_minimum_age->value) {
        free(targeting_spec_operation_minimum_age->value);
        targeting_spec_operation_minimum_age->value = NULL;
    }
    free(targeting_spec_operation_minimum_age);
}

cJSON *targeting_spec_operation_minimum_age_convertToJSON(targeting_spec_operation_minimum_age_t *targeting_spec_operation_minimum_age) {
    cJSON *item = cJSON_CreateObject();

    // targeting_spec_operation_minimum_age->field
    if (pinterest_rest_api_targeting_spec_operation_minimum_age_FIELD_NULL == targeting_spec_operation_minimum_age->field) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "field", targeting_spec_operation_minimum_age_field_ToString(targeting_spec_operation_minimum_age->field)) == NULL)
    {
    goto fail; //Enum
    }


    // targeting_spec_operation_minimum_age->operation
    if (pinterest_rest_api_targeting_spec_operation_minimum_age_OPERATION_NULL == targeting_spec_operation_minimum_age->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", targeting_spec_operation_minimum_age_operation_ToString(targeting_spec_operation_minimum_age->operation)) == NULL)
    {
    goto fail; //Enum
    }


    // targeting_spec_operation_minimum_age->value
    if (!targeting_spec_operation_minimum_age->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", targeting_spec_operation_minimum_age->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

targeting_spec_operation_minimum_age_t *targeting_spec_operation_minimum_age_parseFromJSON(cJSON *targeting_spec_operation_minimum_ageJSON){

    targeting_spec_operation_minimum_age_t *targeting_spec_operation_minimum_age_local_var = NULL;

    char *value_local_str = NULL;

    // targeting_spec_operation_minimum_age->field
    cJSON *field = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_minimum_ageJSON, "field");
    if (cJSON_IsNull(field)) {
        field = NULL;
    }
    if (!field) {
        goto end;
    }

    pinterest_rest_api_targeting_spec_operation_minimum_age_FIELD_e fieldVariable;
    
    if(!cJSON_IsString(field))
    {
    goto end; //Enum
    }
    fieldVariable = targeting_spec_operation_minimum_age_field_FromString(field->valuestring);

    // targeting_spec_operation_minimum_age->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_minimum_ageJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_targeting_spec_operation_minimum_age_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = targeting_spec_operation_minimum_age_operation_FromString(operation->valuestring);

    // targeting_spec_operation_minimum_age->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_minimum_ageJSON, "value");
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


    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);

    targeting_spec_operation_minimum_age_local_var = targeting_spec_operation_minimum_age_create_internal (
        fieldVariable,
        operationVariable,
        value_local_str
        );

    if (!targeting_spec_operation_minimum_age_local_var) {
        goto end;
    }

    return targeting_spec_operation_minimum_age_local_var;
end:
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    return NULL;

}
