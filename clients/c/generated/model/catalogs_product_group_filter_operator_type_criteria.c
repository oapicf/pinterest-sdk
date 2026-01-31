#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_filter_operator_type_criteria.h"


char* catalogs_product_group_filter_operator_type_criteria_filter_operator_type_ToString(pinterest_rest_api_catalogs_product_group_filter_operator_type_criteria_FILTEROPERATORTYPE_e filter_operator_type) {
    char* filter_operator_typeArray[] =  { "NULL", "IS", "CONTAINS" };
    return filter_operator_typeArray[filter_operator_type];
}

pinterest_rest_api_catalogs_product_group_filter_operator_type_criteria_FILTEROPERATORTYPE_e catalogs_product_group_filter_operator_type_criteria_filter_operator_type_FromString(char* filter_operator_type){
    int stringToReturn = 0;
    char *filter_operator_typeArray[] =  { "NULL", "IS", "CONTAINS" };
    size_t sizeofArray = sizeof(filter_operator_typeArray) / sizeof(filter_operator_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(filter_operator_type, filter_operator_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_product_group_filter_operator_type_criteria_t *catalogs_product_group_filter_operator_type_criteria_create_internal(
    pinterest_rest_api_catalogs_product_group_filter_operator_type_criteria_FILTEROPERATORTYPE_e filter_operator_type,
    int negated,
    list_t *values
    ) {
    catalogs_product_group_filter_operator_type_criteria_t *catalogs_product_group_filter_operator_type_criteria_local_var = malloc(sizeof(catalogs_product_group_filter_operator_type_criteria_t));
    if (!catalogs_product_group_filter_operator_type_criteria_local_var) {
        return NULL;
    }
    catalogs_product_group_filter_operator_type_criteria_local_var->filter_operator_type = filter_operator_type;
    catalogs_product_group_filter_operator_type_criteria_local_var->negated = negated;
    catalogs_product_group_filter_operator_type_criteria_local_var->values = values;

    catalogs_product_group_filter_operator_type_criteria_local_var->_library_owned = 1;
    return catalogs_product_group_filter_operator_type_criteria_local_var;
}

__attribute__((deprecated)) catalogs_product_group_filter_operator_type_criteria_t *catalogs_product_group_filter_operator_type_criteria_create(
    pinterest_rest_api_catalogs_product_group_filter_operator_type_criteria_FILTEROPERATORTYPE_e filter_operator_type,
    int negated,
    list_t *values
    ) {
    return catalogs_product_group_filter_operator_type_criteria_create_internal (
        filter_operator_type,
        negated,
        values
        );
}

void catalogs_product_group_filter_operator_type_criteria_free(catalogs_product_group_filter_operator_type_criteria_t *catalogs_product_group_filter_operator_type_criteria) {
    if(NULL == catalogs_product_group_filter_operator_type_criteria){
        return ;
    }
    if(catalogs_product_group_filter_operator_type_criteria->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_filter_operator_type_criteria_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_filter_operator_type_criteria->values) {
        list_ForEach(listEntry, catalogs_product_group_filter_operator_type_criteria->values) {
            free(listEntry->data);
        }
        list_freeList(catalogs_product_group_filter_operator_type_criteria->values);
        catalogs_product_group_filter_operator_type_criteria->values = NULL;
    }
    free(catalogs_product_group_filter_operator_type_criteria);
}

cJSON *catalogs_product_group_filter_operator_type_criteria_convertToJSON(catalogs_product_group_filter_operator_type_criteria_t *catalogs_product_group_filter_operator_type_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_filter_operator_type_criteria->filter_operator_type
    if(catalogs_product_group_filter_operator_type_criteria->filter_operator_type != pinterest_rest_api_catalogs_product_group_filter_operator_type_criteria_FILTEROPERATORTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "filter_operator_type", catalogs_product_group_filter_operator_type_criteria_filter_operator_type_ToString(catalogs_product_group_filter_operator_type_criteria->filter_operator_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // catalogs_product_group_filter_operator_type_criteria->negated
    if(catalogs_product_group_filter_operator_type_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", catalogs_product_group_filter_operator_type_criteria->negated) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_group_filter_operator_type_criteria->values
    if (!catalogs_product_group_filter_operator_type_criteria->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *valuesListEntry;
    list_ForEach(valuesListEntry, catalogs_product_group_filter_operator_type_criteria->values) {
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

catalogs_product_group_filter_operator_type_criteria_t *catalogs_product_group_filter_operator_type_criteria_parseFromJSON(cJSON *catalogs_product_group_filter_operator_type_criteriaJSON){

    catalogs_product_group_filter_operator_type_criteria_t *catalogs_product_group_filter_operator_type_criteria_local_var = NULL;

    // define the local list for catalogs_product_group_filter_operator_type_criteria->values
    list_t *valuesList = NULL;

    // catalogs_product_group_filter_operator_type_criteria->filter_operator_type
    cJSON *filter_operator_type = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_operator_type_criteriaJSON, "filter_operator_type");
    if (cJSON_IsNull(filter_operator_type)) {
        filter_operator_type = NULL;
    }
    pinterest_rest_api_catalogs_product_group_filter_operator_type_criteria_FILTEROPERATORTYPE_e filter_operator_typeVariable;
    if (filter_operator_type) { 
    if(!cJSON_IsString(filter_operator_type))
    {
    goto end; //Enum
    }
    filter_operator_typeVariable = catalogs_product_group_filter_operator_type_criteria_filter_operator_type_FromString(filter_operator_type->valuestring);
    }

    // catalogs_product_group_filter_operator_type_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_operator_type_criteriaJSON, "negated");
    if (cJSON_IsNull(negated)) {
        negated = NULL;
    }
    if (negated) { 
    if(!cJSON_IsBool(negated))
    {
    goto end; //Bool
    }
    }

    // catalogs_product_group_filter_operator_type_criteria->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filter_operator_type_criteriaJSON, "values");
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


    catalogs_product_group_filter_operator_type_criteria_local_var = catalogs_product_group_filter_operator_type_criteria_create_internal (
        filter_operator_type ? filter_operator_typeVariable : pinterest_rest_api_catalogs_product_group_filter_operator_type_criteria_FILTEROPERATORTYPE_NULL,
        negated ? negated->valueint : 0,
        valuesList
        );

    return catalogs_product_group_filter_operator_type_criteria_local_var;
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
