#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_operation_shopping_retargeting.h"


char* targeting_spec_operation_shopping_retargeting_field_ToString(pinterest_rest_api_targeting_spec_operation_shopping_retargeting_FIELD_e field) {
    char* fieldArray[] =  { "NULL", "SHOPPING_RETARGETING" };
    return fieldArray[field];
}

pinterest_rest_api_targeting_spec_operation_shopping_retargeting_FIELD_e targeting_spec_operation_shopping_retargeting_field_FromString(char* field){
    int stringToReturn = 0;
    char *fieldArray[] =  { "NULL", "SHOPPING_RETARGETING" };
    size_t sizeofArray = sizeof(fieldArray) / sizeof(fieldArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(field, fieldArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* targeting_spec_operation_shopping_retargeting_operation_ToString(pinterest_rest_api_targeting_spec_operation_shopping_retargeting_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "SET" };
    return operationArray[operation];
}

pinterest_rest_api_targeting_spec_operation_shopping_retargeting_OPERATION_e targeting_spec_operation_shopping_retargeting_operation_FromString(char* operation){
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

static targeting_spec_operation_shopping_retargeting_t *targeting_spec_operation_shopping_retargeting_create_internal(
    pinterest_rest_api_targeting_spec_operation_shopping_retargeting_FIELD_e field,
    pinterest_rest_api_targeting_spec_operation_shopping_retargeting_OPERATION_e operation,
    list_t *values
    ) {
    targeting_spec_operation_shopping_retargeting_t *targeting_spec_operation_shopping_retargeting_local_var = malloc(sizeof(targeting_spec_operation_shopping_retargeting_t));
    if (!targeting_spec_operation_shopping_retargeting_local_var) {
        return NULL;
    }
    targeting_spec_operation_shopping_retargeting_local_var->field = field;
    targeting_spec_operation_shopping_retargeting_local_var->operation = operation;
    targeting_spec_operation_shopping_retargeting_local_var->values = values;

    targeting_spec_operation_shopping_retargeting_local_var->_library_owned = 1;
    return targeting_spec_operation_shopping_retargeting_local_var;
}

__attribute__((deprecated)) targeting_spec_operation_shopping_retargeting_t *targeting_spec_operation_shopping_retargeting_create(
    pinterest_rest_api_targeting_spec_operation_shopping_retargeting_FIELD_e field,
    pinterest_rest_api_targeting_spec_operation_shopping_retargeting_OPERATION_e operation,
    list_t *values
    ) {
    return targeting_spec_operation_shopping_retargeting_create_internal (
        field,
        operation,
        values
        );
}

void targeting_spec_operation_shopping_retargeting_free(targeting_spec_operation_shopping_retargeting_t *targeting_spec_operation_shopping_retargeting) {
    if(NULL == targeting_spec_operation_shopping_retargeting){
        return ;
    }
    if(targeting_spec_operation_shopping_retargeting->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_spec_operation_shopping_retargeting_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_spec_operation_shopping_retargeting->values) {
        list_ForEach(listEntry, targeting_spec_operation_shopping_retargeting->values) {
            targeting_spec_shopping_retargeting_free(listEntry->data);
        }
        list_freeList(targeting_spec_operation_shopping_retargeting->values);
        targeting_spec_operation_shopping_retargeting->values = NULL;
    }
    free(targeting_spec_operation_shopping_retargeting);
}

cJSON *targeting_spec_operation_shopping_retargeting_convertToJSON(targeting_spec_operation_shopping_retargeting_t *targeting_spec_operation_shopping_retargeting) {
    cJSON *item = cJSON_CreateObject();

    // targeting_spec_operation_shopping_retargeting->field
    if (pinterest_rest_api_targeting_spec_operation_shopping_retargeting_FIELD_NULL == targeting_spec_operation_shopping_retargeting->field) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "field", targeting_spec_operation_shopping_retargeting_field_ToString(targeting_spec_operation_shopping_retargeting->field)) == NULL)
    {
    goto fail; //Enum
    }


    // targeting_spec_operation_shopping_retargeting->operation
    if (pinterest_rest_api_targeting_spec_operation_shopping_retargeting_OPERATION_NULL == targeting_spec_operation_shopping_retargeting->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", targeting_spec_operation_shopping_retargeting_operation_ToString(targeting_spec_operation_shopping_retargeting->operation)) == NULL)
    {
    goto fail; //Enum
    }


    // targeting_spec_operation_shopping_retargeting->values
    if (!targeting_spec_operation_shopping_retargeting->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *valuesListEntry;
    if (targeting_spec_operation_shopping_retargeting->values) {
    list_ForEach(valuesListEntry, targeting_spec_operation_shopping_retargeting->values) {
    cJSON *itemLocal = targeting_spec_shopping_retargeting_convertToJSON(valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(values, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

targeting_spec_operation_shopping_retargeting_t *targeting_spec_operation_shopping_retargeting_parseFromJSON(cJSON *targeting_spec_operation_shopping_retargetingJSON){

    targeting_spec_operation_shopping_retargeting_t *targeting_spec_operation_shopping_retargeting_local_var = NULL;

    // define the local list for targeting_spec_operation_shopping_retargeting->values
    list_t *valuesList = NULL;

    // targeting_spec_operation_shopping_retargeting->field
    cJSON *field = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_shopping_retargetingJSON, "field");
    if (cJSON_IsNull(field)) {
        field = NULL;
    }
    if (!field) {
        goto end;
    }

    pinterest_rest_api_targeting_spec_operation_shopping_retargeting_FIELD_e fieldVariable;
    
    if(!cJSON_IsString(field))
    {
    goto end; //Enum
    }
    fieldVariable = targeting_spec_operation_shopping_retargeting_field_FromString(field->valuestring);

    // targeting_spec_operation_shopping_retargeting->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_shopping_retargetingJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_targeting_spec_operation_shopping_retargeting_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = targeting_spec_operation_shopping_retargeting_operation_FromString(operation->valuestring);

    // targeting_spec_operation_shopping_retargeting->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_shopping_retargetingJSON, "values");
    if (cJSON_IsNull(values)) {
        values = NULL;
    }
    if (!values) {
        goto end;
    }

    
    cJSON *values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(values)){
        goto end; //nonprimitive container
    }

    valuesList = list_createList();

    cJSON_ArrayForEach(values_local_nonprimitive,values )
    {
        if(!cJSON_IsObject(values_local_nonprimitive)){
            goto end;
        }
        targeting_spec_shopping_retargeting_t *valuesItem = targeting_spec_shopping_retargeting_parseFromJSON(values_local_nonprimitive);

        list_addElement(valuesList, valuesItem);
    }


    targeting_spec_operation_shopping_retargeting_local_var = targeting_spec_operation_shopping_retargeting_create_internal (
        fieldVariable,
        operationVariable,
        valuesList
        );

    return targeting_spec_operation_shopping_retargeting_local_var;
end:
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            targeting_spec_shopping_retargeting_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
