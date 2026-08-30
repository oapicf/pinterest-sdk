#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_operation_app_type.h"


char* targeting_spec_operation_app_type_field_ToString(pinterest_rest_api_targeting_spec_operation_app_type_FIELD_e field) {
    char* fieldArray[] =  { "NULL", "APPTYPE" };
    return fieldArray[field];
}

pinterest_rest_api_targeting_spec_operation_app_type_FIELD_e targeting_spec_operation_app_type_field_FromString(char* field){
    int stringToReturn = 0;
    char *fieldArray[] =  { "NULL", "APPTYPE" };
    size_t sizeofArray = sizeof(fieldArray) / sizeof(fieldArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(field, fieldArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* targeting_spec_operation_app_type_values_ToString(pinterest_rest_api_targeting_spec_operation_app_type__e values) {
    char *valuesArray[] =  { "NULL", "android_mobile", "android_tablet", "ipad", "iphone", "web", "web_mobile" };
    return valuesArray[values - 1];
}

pinterest_rest_api_targeting_spec_operation_app_type__e targeting_spec_operation_app_type_values_FromString(char* values) {
    int stringToReturn = 0;
    char *valuesArray[] =  { "NULL", "android_mobile", "android_tablet", "ipad", "iphone", "web", "web_mobile" };
    size_t sizeofArray = sizeof(valuesArray) / sizeof(valuesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(values, valuesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static targeting_spec_operation_app_type_t *targeting_spec_operation_app_type_create_internal(
    pinterest_rest_api_targeting_spec_operation_app_type_FIELD_e field,
    pinterest_rest_api_targeting_spec_list_operation__e operation,
    list_t *values
    ) {
    targeting_spec_operation_app_type_t *targeting_spec_operation_app_type_local_var = malloc(sizeof(targeting_spec_operation_app_type_t));
    if (!targeting_spec_operation_app_type_local_var) {
        return NULL;
    }
    memset(targeting_spec_operation_app_type_local_var, 0, sizeof(targeting_spec_operation_app_type_t));
    targeting_spec_operation_app_type_local_var->_library_owned = 1;
    targeting_spec_operation_app_type_local_var->field = field;
    targeting_spec_operation_app_type_local_var->operation = operation;
    targeting_spec_operation_app_type_local_var->values = values;
    return targeting_spec_operation_app_type_local_var;
}

__attribute__((deprecated)) targeting_spec_operation_app_type_t *targeting_spec_operation_app_type_create(
    pinterest_rest_api_targeting_spec_operation_app_type_FIELD_e field,
    pinterest_rest_api_targeting_spec_list_operation__e operation,
    list_t *values
    ) {
    targeting_spec_operation_app_type_t *result = targeting_spec_operation_app_type_create_internal (
        field,
        operation,
        values
        );
    if (!result) {
    }
    return result;
}

void targeting_spec_operation_app_type_free(targeting_spec_operation_app_type_t *targeting_spec_operation_app_type) {
    if(NULL == targeting_spec_operation_app_type){
        return ;
    }
    if(targeting_spec_operation_app_type->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_spec_operation_app_type_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_spec_operation_app_type->values) {
        list_ForEach(listEntry, targeting_spec_operation_app_type->values) {
            targeting_spec_app_type_free(listEntry->data);
        }
        list_freeList(targeting_spec_operation_app_type->values);
        targeting_spec_operation_app_type->values = NULL;
    }
    free(targeting_spec_operation_app_type);
}

cJSON *targeting_spec_operation_app_type_convertToJSON(targeting_spec_operation_app_type_t *targeting_spec_operation_app_type) {
    cJSON *item = cJSON_CreateObject();

    // targeting_spec_operation_app_type->field
    if (pinterest_rest_api_targeting_spec_operation_app_type_FIELD_NULL == targeting_spec_operation_app_type->field) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "field", targeting_spec_operation_app_type_field_ToString(targeting_spec_operation_app_type->field)) == NULL)
    {
    goto fail; //Enum
    }


    // targeting_spec_operation_app_type->operation
    if (pinterest_rest_api_targeting_spec_list_operation__NULL == targeting_spec_operation_app_type->operation) {
        goto fail;
    }
    cJSON *operation_local_JSON = targeting_spec_list_operation_convertToJSON(targeting_spec_operation_app_type->operation);
    if(operation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // targeting_spec_operation_app_type->values
    if (pinterest_rest_api_list_VALUES_NULL == targeting_spec_operation_app_type->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *valuesListEntry;
    if (targeting_spec_operation_app_type->values) {
    list_ForEach(valuesListEntry, targeting_spec_operation_app_type->values) {
    cJSON *itemLocal = targeting_spec_app_type_convertToJSON((pinterest_rest_api_targeting_spec_operation_app_type__e)valuesListEntry->data);
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

targeting_spec_operation_app_type_t *targeting_spec_operation_app_type_parseFromJSON(cJSON *targeting_spec_operation_app_typeJSON){

    targeting_spec_operation_app_type_t *targeting_spec_operation_app_type_local_var = NULL;

    // define the local variable for targeting_spec_operation_app_type->operation
    pinterest_rest_api_targeting_spec_list_operation__e operation_local_nonprim = 0;

    // define the local list for targeting_spec_operation_app_type->values
    list_t *valuesList = NULL;

    // targeting_spec_operation_app_type->field
    cJSON *field = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_app_typeJSON, "field");
    if (cJSON_IsNull(field)) {
        field = NULL;
    }
    if (!field) {
        goto end;
    }

    pinterest_rest_api_targeting_spec_operation_app_type_FIELD_e fieldVariable;
    
    if(!cJSON_IsString(field))
    {
    goto end; //Enum
    }
    fieldVariable = targeting_spec_operation_app_type_field_FromString(field->valuestring);

    // targeting_spec_operation_app_type->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_app_typeJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    
    operation_local_nonprim = targeting_spec_list_operation_parseFromJSON(operation); //custom

    // targeting_spec_operation_app_type->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_app_typeJSON, "values");
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
        targeting_spec_operation_app_type_targeting_spec_app_type_e valuesItem = targeting_spec_app_type_parseFromJSON(values_local_nonprimitive);

        list_addElement(valuesList, (void *)valuesItem);
    }



    targeting_spec_operation_app_type_local_var = targeting_spec_operation_app_type_create_internal (
        fieldVariable,
        operation_local_nonprim,
        valuesList
        );

    if (!targeting_spec_operation_app_type_local_var) {
        goto end;
    }

    return targeting_spec_operation_app_type_local_var;
end:
    if (operation_local_nonprim) {
        operation_local_nonprim = 0;
    }
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            targeting_spec_app_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
