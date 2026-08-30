#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_operation_geo_exclude.h"


char* targeting_spec_operation_geo_exclude_field_ToString(pinterest_rest_api_targeting_spec_operation_geo_exclude_FIELD_e field) {
    char* fieldArray[] =  { "NULL", "GEO_EXCLUDE" };
    return fieldArray[field];
}

pinterest_rest_api_targeting_spec_operation_geo_exclude_FIELD_e targeting_spec_operation_geo_exclude_field_FromString(char* field){
    int stringToReturn = 0;
    char *fieldArray[] =  { "NULL", "GEO_EXCLUDE" };
    size_t sizeofArray = sizeof(fieldArray) / sizeof(fieldArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(field, fieldArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static targeting_spec_operation_geo_exclude_t *targeting_spec_operation_geo_exclude_create_internal(
    pinterest_rest_api_targeting_spec_operation_geo_exclude_FIELD_e field,
    pinterest_rest_api_targeting_spec_list_operation__e operation,
    list_t *values
    ) {
    targeting_spec_operation_geo_exclude_t *targeting_spec_operation_geo_exclude_local_var = malloc(sizeof(targeting_spec_operation_geo_exclude_t));
    if (!targeting_spec_operation_geo_exclude_local_var) {
        return NULL;
    }
    memset(targeting_spec_operation_geo_exclude_local_var, 0, sizeof(targeting_spec_operation_geo_exclude_t));
    targeting_spec_operation_geo_exclude_local_var->_library_owned = 1;
    targeting_spec_operation_geo_exclude_local_var->field = field;
    targeting_spec_operation_geo_exclude_local_var->operation = operation;
    targeting_spec_operation_geo_exclude_local_var->values = values;
    return targeting_spec_operation_geo_exclude_local_var;
}

__attribute__((deprecated)) targeting_spec_operation_geo_exclude_t *targeting_spec_operation_geo_exclude_create(
    pinterest_rest_api_targeting_spec_operation_geo_exclude_FIELD_e field,
    pinterest_rest_api_targeting_spec_list_operation__e operation,
    list_t *values
    ) {
    targeting_spec_operation_geo_exclude_t *result = targeting_spec_operation_geo_exclude_create_internal (
        field,
        operation,
        values
        );
    if (!result) {
    }
    return result;
}

void targeting_spec_operation_geo_exclude_free(targeting_spec_operation_geo_exclude_t *targeting_spec_operation_geo_exclude) {
    if(NULL == targeting_spec_operation_geo_exclude){
        return ;
    }
    if(targeting_spec_operation_geo_exclude->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_spec_operation_geo_exclude_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_spec_operation_geo_exclude->values) {
        list_ForEach(listEntry, targeting_spec_operation_geo_exclude->values) {
            free(listEntry->data);
        }
        list_freeList(targeting_spec_operation_geo_exclude->values);
        targeting_spec_operation_geo_exclude->values = NULL;
    }
    free(targeting_spec_operation_geo_exclude);
}

cJSON *targeting_spec_operation_geo_exclude_convertToJSON(targeting_spec_operation_geo_exclude_t *targeting_spec_operation_geo_exclude) {
    cJSON *item = cJSON_CreateObject();

    // targeting_spec_operation_geo_exclude->field
    if (pinterest_rest_api_targeting_spec_operation_geo_exclude_FIELD_NULL == targeting_spec_operation_geo_exclude->field) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "field", targeting_spec_operation_geo_exclude_field_ToString(targeting_spec_operation_geo_exclude->field)) == NULL)
    {
    goto fail; //Enum
    }


    // targeting_spec_operation_geo_exclude->operation
    if (pinterest_rest_api_targeting_spec_list_operation__NULL == targeting_spec_operation_geo_exclude->operation) {
        goto fail;
    }
    cJSON *operation_local_JSON = targeting_spec_list_operation_convertToJSON(targeting_spec_operation_geo_exclude->operation);
    if(operation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // targeting_spec_operation_geo_exclude->values
    if (!targeting_spec_operation_geo_exclude->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *valuesListEntry;
    list_ForEach(valuesListEntry, targeting_spec_operation_geo_exclude->values) {
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

targeting_spec_operation_geo_exclude_t *targeting_spec_operation_geo_exclude_parseFromJSON(cJSON *targeting_spec_operation_geo_excludeJSON){

    targeting_spec_operation_geo_exclude_t *targeting_spec_operation_geo_exclude_local_var = NULL;

    // define the local variable for targeting_spec_operation_geo_exclude->operation
    pinterest_rest_api_targeting_spec_list_operation__e operation_local_nonprim = 0;

    // define the local list for targeting_spec_operation_geo_exclude->values
    list_t *valuesList = NULL;

    // targeting_spec_operation_geo_exclude->field
    cJSON *field = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_geo_excludeJSON, "field");
    if (cJSON_IsNull(field)) {
        field = NULL;
    }
    if (!field) {
        goto end;
    }

    pinterest_rest_api_targeting_spec_operation_geo_exclude_FIELD_e fieldVariable;
    
    if(!cJSON_IsString(field))
    {
    goto end; //Enum
    }
    fieldVariable = targeting_spec_operation_geo_exclude_field_FromString(field->valuestring);

    // targeting_spec_operation_geo_exclude->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_geo_excludeJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    
    operation_local_nonprim = targeting_spec_list_operation_parseFromJSON(operation); //custom

    // targeting_spec_operation_geo_exclude->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(targeting_spec_operation_geo_excludeJSON, "values");
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



    targeting_spec_operation_geo_exclude_local_var = targeting_spec_operation_geo_exclude_create_internal (
        fieldVariable,
        operation_local_nonprim,
        valuesList
        );

    if (!targeting_spec_operation_geo_exclude_local_var) {
        goto end;
    }

    return targeting_spec_operation_geo_exclude_local_var;
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
