#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_operation_age_bucket.h"


char* targeting_spec_operation_age_bucket_field_ToString(pinterest_rest_api_targeting_spec_operation_age_bucket_FIELD_e field) {
    char* fieldArray[] =  { "NULL", "AGE_BUCKET" };
    return fieldArray[field];
}

pinterest_rest_api_targeting_spec_operation_age_bucket_FIELD_e targeting_spec_operation_age_bucket_field_FromString(char* field){
    int stringToReturn = 0;
    char *fieldArray[] =  { "NULL", "AGE_BUCKET" };
    size_t sizeofArray = sizeof(fieldArray) / sizeof(fieldArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(field, fieldArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* targeting_spec_operation_age_bucket_operation_ToString(pinterest_rest_api_targeting_spec_operation_age_bucket_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "SET" };
    return operationArray[operation];
}

pinterest_rest_api_targeting_spec_operation_age_bucket_OPERATION_e targeting_spec_operation_age_bucket_operation_FromString(char* operation){
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
char* targeting_spec_operation_age_bucket_values_ToString(pinterest_rest_api_targeting_spec_operation_age_bucket__e values) {
    char *valuesArray[] =  { "NULL", "18-24", "19+", "20+", "21+", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    return valuesArray[values - 1];
}

pinterest_rest_api_targeting_spec_operation_age_bucket__e targeting_spec_operation_age_bucket_values_FromString(char* values) {
    int stringToReturn = 0;
    char *valuesArray[] =  { "NULL", "18-24", "19+", "20+", "21+", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    size_t sizeofArray = sizeof(valuesArray) / sizeof(valuesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(values, valuesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static targeting_spec_operation_age_bucket_t *targeting_spec_operation_age_bucket_create_internal(
    pinterest_rest_api_targeting_spec_operation_age_bucket_FIELD_e field,
    pinterest_rest_api_targeting_spec_operation_age_bucket_OPERATION_e operation,
    list_t *values
    ) {
    targeting_spec_operation_age_bucket_t *targeting_spec_operation_age_bucket_local_var = malloc(sizeof(targeting_spec_operation_age_bucket_t));
    if (!targeting_spec_operation_age_bucket_local_var) {
        return NULL;
    }
    memset(targeting_spec_operation_age_bucket_local_var, 0, sizeof(targeting_spec_operation_age_bucket_t));
    targeting_spec_operation_age_bucket_local_var->_library_owned = 1;
    targeting_spec_operation_age_bucket_local_var->field = field;
    targeting_spec_operation_age_bucket_local_var->operation = operation;
    targeting_spec_operation_age_bucket_local_var->values = values;
    return targeting_spec_operation_age_bucket_local_var;
}

__attribute__((deprecated)) targeting_spec_operation_age_bucket_t *targeting_spec_operation_age_bucket_create(
    pinterest_rest_api_targeting_spec_operation_age_bucket_FIELD_e field,
    pinterest_rest_api_targeting_spec_operation_age_bucket_OPERATION_e operation,
    list_t *values
    ) {
    targeting_spec_operation_age_bucket_t *result = targeting_spec_operation_age_bucket_create_internal (
        field,
        operation,
        values
        );
    if (!result) {
    }
    return result;
}

void targeting_spec_operation_age_bucket_free(targeting_spec_operation_age_bucket_t *targeting_spec_operation_age_bucket) {
    if(NULL == targeting_spec_operation_age_bucket){
        return ;
    }
    if(targeting_spec_operation_age_bucket->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_spec_operation_age_bucket_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_spec_operation_age_bucket->values) {
        list_ForEach(listEntry, targeting_spec_operation_age_bucket->values) {
            targeting_spec_age_bucket_free(listEntry->data);
        }
        list_freeList(targeting_spec_operation_age_bucket->values);
        targeting_spec_operation_age_bucket->values = NULL;
    }
    free(targeting_spec_operation_age_bucket);
}

cJSON *targeting_spec_operation_age_bucket_convertToJSON(targeting_spec_operation_age_bucket_t *targeting_spec_operation_age_bucket) {
    cJSON *item = cJSON_CreateObject();

    // targeting_spec_operation_age_bucket->field
    if (pinterest_rest_api_targeting_spec_operation_age_bucket_FIELD_NULL == targeting_spec_operation_age_bucket->field) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "field", targeting_spec_operation_age_bucket_field_ToString(targeting_spec_operation_age_bucket->field)) == NULL)
    {
    goto fail; //Enum
    }


    // targeting_spec_operation_age_bucket->operation
    if (pinterest_rest_api_targeting_spec_operation_age_bucket_OPERATION_NULL == targeting_spec_operation_age_bucket->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", targeting_spec_operation_age_bucket_operation_ToString(targeting_spec_operation_age_bucket->operation)) == NULL)
    {
    goto fail; //Enum
    }


    // targeting_spec_operation_age_bucket->values
    if (pinterest_rest_api_list_VALUES_NULL == targeting_spec_operation_age_bucket->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *valuesListEntry;
    if (targeting_spec_operation_age_bucket->values) {
    list_ForEach(valuesListEntry, targeting_spec_operation_age_bucket->values) {
    cJSON *itemLocal = targeting_spec_age_bucket_convertToJSON((pinterest_rest_api_targeting_spec_operation_age_bucket__e)valuesListEntry->data);
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

targeting_spec_operation_age_bucket_t *targeting_spec_operation_age_bucket_parseFromJSON(cJSON *targeting_spec_operation_age_bucketJSON){

    targeting_spec_operation_age_bucket_t *targeting_spec_operation_age_bucket_local_var = NULL;

    // define the local list for targeting_spec_operation_age_bucket->values
    list_t *valuesList = NULL;

    // targeting_spec_operation_age_bucket->field
    cJSON *field = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_age_bucketJSON, "field");
    if (cJSON_IsNull(field)) {
        field = NULL;
    }
    if (!field) {
        goto end;
    }

    pinterest_rest_api_targeting_spec_operation_age_bucket_FIELD_e fieldVariable;
    
    if(!cJSON_IsString(field))
    {
    goto end; //Enum
    }
    fieldVariable = targeting_spec_operation_age_bucket_field_FromString(field->valuestring);

    // targeting_spec_operation_age_bucket->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_age_bucketJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_targeting_spec_operation_age_bucket_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = targeting_spec_operation_age_bucket_operation_FromString(operation->valuestring);

    // targeting_spec_operation_age_bucket->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_age_bucketJSON, "values");
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
        targeting_spec_operation_age_bucket_targeting_spec_age_bucket_e valuesItem = targeting_spec_age_bucket_parseFromJSON(values_local_nonprimitive);

        list_addElement(valuesList, (void *)valuesItem);
    }



    targeting_spec_operation_age_bucket_local_var = targeting_spec_operation_age_bucket_create_internal (
        fieldVariable,
        operationVariable,
        valuesList
        );

    if (!targeting_spec_operation_age_bucket_local_var) {
        goto end;
    }

    return targeting_spec_operation_age_bucket_local_var;
end:
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            targeting_spec_age_bucket_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
