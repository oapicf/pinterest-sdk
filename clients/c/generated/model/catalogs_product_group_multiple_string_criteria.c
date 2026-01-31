#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_multiple_string_criteria.h"



static catalogs_product_group_multiple_string_criteria_t *catalogs_product_group_multiple_string_criteria_create_internal(
    int negated,
    list_t *values
    ) {
    catalogs_product_group_multiple_string_criteria_t *catalogs_product_group_multiple_string_criteria_local_var = malloc(sizeof(catalogs_product_group_multiple_string_criteria_t));
    if (!catalogs_product_group_multiple_string_criteria_local_var) {
        return NULL;
    }
    catalogs_product_group_multiple_string_criteria_local_var->negated = negated;
    catalogs_product_group_multiple_string_criteria_local_var->values = values;

    catalogs_product_group_multiple_string_criteria_local_var->_library_owned = 1;
    return catalogs_product_group_multiple_string_criteria_local_var;
}

__attribute__((deprecated)) catalogs_product_group_multiple_string_criteria_t *catalogs_product_group_multiple_string_criteria_create(
    int negated,
    list_t *values
    ) {
    return catalogs_product_group_multiple_string_criteria_create_internal (
        negated,
        values
        );
}

void catalogs_product_group_multiple_string_criteria_free(catalogs_product_group_multiple_string_criteria_t *catalogs_product_group_multiple_string_criteria) {
    if(NULL == catalogs_product_group_multiple_string_criteria){
        return ;
    }
    if(catalogs_product_group_multiple_string_criteria->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_multiple_string_criteria_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_multiple_string_criteria->values) {
        list_ForEach(listEntry, catalogs_product_group_multiple_string_criteria->values) {
            free(listEntry->data);
        }
        list_freeList(catalogs_product_group_multiple_string_criteria->values);
        catalogs_product_group_multiple_string_criteria->values = NULL;
    }
    free(catalogs_product_group_multiple_string_criteria);
}

cJSON *catalogs_product_group_multiple_string_criteria_convertToJSON(catalogs_product_group_multiple_string_criteria_t *catalogs_product_group_multiple_string_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_multiple_string_criteria->negated
    if(catalogs_product_group_multiple_string_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", catalogs_product_group_multiple_string_criteria->negated) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_group_multiple_string_criteria->values
    if (!catalogs_product_group_multiple_string_criteria->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *valuesListEntry;
    list_ForEach(valuesListEntry, catalogs_product_group_multiple_string_criteria->values) {
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

catalogs_product_group_multiple_string_criteria_t *catalogs_product_group_multiple_string_criteria_parseFromJSON(cJSON *catalogs_product_group_multiple_string_criteriaJSON){

    catalogs_product_group_multiple_string_criteria_t *catalogs_product_group_multiple_string_criteria_local_var = NULL;

    // define the local list for catalogs_product_group_multiple_string_criteria->values
    list_t *valuesList = NULL;

    // catalogs_product_group_multiple_string_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_multiple_string_criteriaJSON, "negated");
    if (cJSON_IsNull(negated)) {
        negated = NULL;
    }
    if (negated) { 
    if(!cJSON_IsBool(negated))
    {
    goto end; //Bool
    }
    }

    // catalogs_product_group_multiple_string_criteria->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_multiple_string_criteriaJSON, "values");
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


    catalogs_product_group_multiple_string_criteria_local_var = catalogs_product_group_multiple_string_criteria_create_internal (
        negated ? negated->valueint : 0,
        valuesList
        );

    return catalogs_product_group_multiple_string_criteria_local_var;
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
