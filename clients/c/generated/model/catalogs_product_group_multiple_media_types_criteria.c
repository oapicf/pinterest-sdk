#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_multiple_media_types_criteria.h"


char* catalogs_product_group_multiple_media_types_criteria_values_ToString(pinterest_rest_api_catalogs_product_group_multiple_media_types_criteria__e values) {
    char *valuesArray[] =  { "NULL", "IMAGE", "VIDEO" };
    return valuesArray[values - 1];
}

pinterest_rest_api_catalogs_product_group_multiple_media_types_criteria__e catalogs_product_group_multiple_media_types_criteria_values_FromString(char* values) {
    int stringToReturn = 0;
    char *valuesArray[] =  { "NULL", "IMAGE", "VIDEO" };
    size_t sizeofArray = sizeof(valuesArray) / sizeof(valuesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(values, valuesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_product_group_multiple_media_types_criteria_t *catalogs_product_group_multiple_media_types_criteria_create_internal(
    int *negated,
    list_t *values
    ) {
    catalogs_product_group_multiple_media_types_criteria_t *catalogs_product_group_multiple_media_types_criteria_local_var = malloc(sizeof(catalogs_product_group_multiple_media_types_criteria_t));
    if (!catalogs_product_group_multiple_media_types_criteria_local_var) {
        return NULL;
    }
    memset(catalogs_product_group_multiple_media_types_criteria_local_var, 0, sizeof(catalogs_product_group_multiple_media_types_criteria_t));
    catalogs_product_group_multiple_media_types_criteria_local_var->_library_owned = 1;
    catalogs_product_group_multiple_media_types_criteria_local_var->negated = negated;
    catalogs_product_group_multiple_media_types_criteria_local_var->values = values;
    return catalogs_product_group_multiple_media_types_criteria_local_var;
}

__attribute__((deprecated)) catalogs_product_group_multiple_media_types_criteria_t *catalogs_product_group_multiple_media_types_criteria_create(
    int *negated,
    list_t *values
    ) {
    int *negated_copy = NULL;
    if (negated) {
        negated_copy = malloc(sizeof(int));
        if (negated_copy) *negated_copy = *negated;
    }
    catalogs_product_group_multiple_media_types_criteria_t *result = catalogs_product_group_multiple_media_types_criteria_create_internal (
        negated_copy,
        values
        );
    if (!result) {
        free(negated_copy);
    }
    return result;
}

void catalogs_product_group_multiple_media_types_criteria_free(catalogs_product_group_multiple_media_types_criteria_t *catalogs_product_group_multiple_media_types_criteria) {
    if(NULL == catalogs_product_group_multiple_media_types_criteria){
        return ;
    }
    if(catalogs_product_group_multiple_media_types_criteria->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_multiple_media_types_criteria_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_multiple_media_types_criteria->negated) {
        free(catalogs_product_group_multiple_media_types_criteria->negated);
        catalogs_product_group_multiple_media_types_criteria->negated = NULL;
    }
    if (catalogs_product_group_multiple_media_types_criteria->values) {
        list_ForEach(listEntry, catalogs_product_group_multiple_media_types_criteria->values) {
            media_type_free(listEntry->data);
        }
        list_freeList(catalogs_product_group_multiple_media_types_criteria->values);
        catalogs_product_group_multiple_media_types_criteria->values = NULL;
    }
    free(catalogs_product_group_multiple_media_types_criteria);
}

cJSON *catalogs_product_group_multiple_media_types_criteria_convertToJSON(catalogs_product_group_multiple_media_types_criteria_t *catalogs_product_group_multiple_media_types_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_multiple_media_types_criteria->negated
    if(catalogs_product_group_multiple_media_types_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", *catalogs_product_group_multiple_media_types_criteria->negated) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_group_multiple_media_types_criteria->values
    if (pinterest_rest_api_list_VALUES_NULL == catalogs_product_group_multiple_media_types_criteria->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *valuesListEntry;
    if (catalogs_product_group_multiple_media_types_criteria->values) {
    list_ForEach(valuesListEntry, catalogs_product_group_multiple_media_types_criteria->values) {
    cJSON *itemLocal = media_type_convertToJSON((pinterest_rest_api_catalogs_product_group_multiple_media_types_criteria__e)valuesListEntry->data);
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

catalogs_product_group_multiple_media_types_criteria_t *catalogs_product_group_multiple_media_types_criteria_parseFromJSON(cJSON *catalogs_product_group_multiple_media_types_criteriaJSON){

    catalogs_product_group_multiple_media_types_criteria_t *catalogs_product_group_multiple_media_types_criteria_local_var = NULL;

    // define the local variable for catalogs_product_group_multiple_media_types_criteria->negated
    int *negated_local_var = NULL;

    // define the local list for catalogs_product_group_multiple_media_types_criteria->values
    list_t *valuesList = NULL;

    // catalogs_product_group_multiple_media_types_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_multiple_media_types_criteriaJSON, "negated");
    if (cJSON_IsNull(negated)) {
        negated = NULL;
    }
    if (negated) { 
    if(!cJSON_IsBool(negated))
    {
    goto end; //Bool
    }
    negated_local_var = malloc(sizeof(int));
    if(!negated_local_var)
    {
        goto end;
    }
    *negated_local_var = negated->valueint;
    }

    // catalogs_product_group_multiple_media_types_criteria->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_multiple_media_types_criteriaJSON, "values");
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
        catalogs_product_group_multiple_media_types_criteria_media_type_e valuesItem = media_type_parseFromJSON(values_local_nonprimitive);

        list_addElement(valuesList, (void *)valuesItem);
    }



    catalogs_product_group_multiple_media_types_criteria_local_var = catalogs_product_group_multiple_media_types_criteria_create_internal (
        negated_local_var,
        valuesList
        );

    if (!catalogs_product_group_multiple_media_types_criteria_local_var) {
        goto end;
    }

    return catalogs_product_group_multiple_media_types_criteria_local_var;
end:
    if (negated_local_var) {
        free(negated_local_var);
        negated_local_var = NULL;
    }
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            media_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
