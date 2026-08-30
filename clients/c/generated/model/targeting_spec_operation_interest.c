#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_operation_interest.h"


char* targeting_spec_operation_interest_field_ToString(pinterest_rest_api_targeting_spec_operation_interest_FIELD_e field) {
    char* fieldArray[] =  { "NULL", "INTEREST" };
    return fieldArray[field];
}

pinterest_rest_api_targeting_spec_operation_interest_FIELD_e targeting_spec_operation_interest_field_FromString(char* field){
    int stringToReturn = 0;
    char *fieldArray[] =  { "NULL", "INTEREST" };
    size_t sizeofArray = sizeof(fieldArray) / sizeof(fieldArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(field, fieldArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static targeting_spec_operation_interest_t *targeting_spec_operation_interest_create_internal(
    pinterest_rest_api_targeting_spec_operation_interest_FIELD_e field,
    pinterest_rest_api_targeting_spec_list_operation__e operation,
    list_t *values
    ) {
    targeting_spec_operation_interest_t *targeting_spec_operation_interest_local_var = malloc(sizeof(targeting_spec_operation_interest_t));
    if (!targeting_spec_operation_interest_local_var) {
        return NULL;
    }
    memset(targeting_spec_operation_interest_local_var, 0, sizeof(targeting_spec_operation_interest_t));
    targeting_spec_operation_interest_local_var->_library_owned = 1;
    targeting_spec_operation_interest_local_var->field = field;
    targeting_spec_operation_interest_local_var->operation = operation;
    targeting_spec_operation_interest_local_var->values = values;
    return targeting_spec_operation_interest_local_var;
}

__attribute__((deprecated)) targeting_spec_operation_interest_t *targeting_spec_operation_interest_create(
    pinterest_rest_api_targeting_spec_operation_interest_FIELD_e field,
    pinterest_rest_api_targeting_spec_list_operation__e operation,
    list_t *values
    ) {
    targeting_spec_operation_interest_t *result = targeting_spec_operation_interest_create_internal (
        field,
        operation,
        values
        );
    if (!result) {
    }
    return result;
}

void targeting_spec_operation_interest_free(targeting_spec_operation_interest_t *targeting_spec_operation_interest) {
    if(NULL == targeting_spec_operation_interest){
        return ;
    }
    if(targeting_spec_operation_interest->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_spec_operation_interest_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_spec_operation_interest->values) {
        list_ForEach(listEntry, targeting_spec_operation_interest->values) {
            free(listEntry->data);
        }
        list_freeList(targeting_spec_operation_interest->values);
        targeting_spec_operation_interest->values = NULL;
    }
    free(targeting_spec_operation_interest);
}

cJSON *targeting_spec_operation_interest_convertToJSON(targeting_spec_operation_interest_t *targeting_spec_operation_interest) {
    cJSON *item = cJSON_CreateObject();

    // targeting_spec_operation_interest->field
    if (pinterest_rest_api_targeting_spec_operation_interest_FIELD_NULL == targeting_spec_operation_interest->field) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "field", targeting_spec_operation_interest_field_ToString(targeting_spec_operation_interest->field)) == NULL)
    {
    goto fail; //Enum
    }


    // targeting_spec_operation_interest->operation
    if (pinterest_rest_api_targeting_spec_list_operation__NULL == targeting_spec_operation_interest->operation) {
        goto fail;
    }
    cJSON *operation_local_JSON = targeting_spec_list_operation_convertToJSON(targeting_spec_operation_interest->operation);
    if(operation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // targeting_spec_operation_interest->values
    if (!targeting_spec_operation_interest->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *valuesListEntry;
    list_ForEach(valuesListEntry, targeting_spec_operation_interest->values) {
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

targeting_spec_operation_interest_t *targeting_spec_operation_interest_parseFromJSON(cJSON *targeting_spec_operation_interestJSON){

    targeting_spec_operation_interest_t *targeting_spec_operation_interest_local_var = NULL;

    // define the local variable for targeting_spec_operation_interest->operation
    pinterest_rest_api_targeting_spec_list_operation__e operation_local_nonprim = 0;

    // define the local list for targeting_spec_operation_interest->values
    list_t *valuesList = NULL;

    // targeting_spec_operation_interest->field
    cJSON *field = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_interestJSON, "field");
    if (cJSON_IsNull(field)) {
        field = NULL;
    }
    if (!field) {
        goto end;
    }

    pinterest_rest_api_targeting_spec_operation_interest_FIELD_e fieldVariable;
    
    if(!cJSON_IsString(field))
    {
    goto end; //Enum
    }
    fieldVariable = targeting_spec_operation_interest_field_FromString(field->valuestring);

    // targeting_spec_operation_interest->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_interestJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    
    operation_local_nonprim = targeting_spec_list_operation_parseFromJSON(operation); //custom

    // targeting_spec_operation_interest->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_interestJSON, "values");
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



    targeting_spec_operation_interest_local_var = targeting_spec_operation_interest_create_internal (
        fieldVariable,
        operation_local_nonprim,
        valuesList
        );

    if (!targeting_spec_operation_interest_local_var) {
        goto end;
    }

    return targeting_spec_operation_interest_local_var;
end:
    if (operation_local_nonprim) {
        operation_local_nonprim = 0;
    }
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
