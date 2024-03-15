#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_multiple_string_list_criteria.h"



catalogs_product_group_multiple_string_list_criteria_t *catalogs_product_group_multiple_string_list_criteria_create(
    list_t *values,
    int negated
    ) {
    catalogs_product_group_multiple_string_list_criteria_t *catalogs_product_group_multiple_string_list_criteria_local_var = malloc(sizeof(catalogs_product_group_multiple_string_list_criteria_t));
    if (!catalogs_product_group_multiple_string_list_criteria_local_var) {
        return NULL;
    }
    catalogs_product_group_multiple_string_list_criteria_local_var->values = values;
    catalogs_product_group_multiple_string_list_criteria_local_var->negated = negated;

    return catalogs_product_group_multiple_string_list_criteria_local_var;
}


void catalogs_product_group_multiple_string_list_criteria_free(catalogs_product_group_multiple_string_list_criteria_t *catalogs_product_group_multiple_string_list_criteria) {
    if(NULL == catalogs_product_group_multiple_string_list_criteria){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_multiple_string_list_criteria->values) {
        list_ForEach(listEntry, catalogs_product_group_multiple_string_list_criteria->values) {
            free(listEntry->data);
        }
        list_freeList(catalogs_product_group_multiple_string_list_criteria->values);
        catalogs_product_group_multiple_string_list_criteria->values = NULL;
    }
    free(catalogs_product_group_multiple_string_list_criteria);
}

cJSON *catalogs_product_group_multiple_string_list_criteria_convertToJSON(catalogs_product_group_multiple_string_list_criteria_t *catalogs_product_group_multiple_string_list_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_multiple_string_list_criteria->values
    if (!catalogs_product_group_multiple_string_list_criteria->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *valuesListEntry;
    list_ForEach(valuesListEntry, catalogs_product_group_multiple_string_list_criteria->values) {
    }


    // catalogs_product_group_multiple_string_list_criteria->negated
    if(catalogs_product_group_multiple_string_list_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", catalogs_product_group_multiple_string_list_criteria->negated) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_multiple_string_list_criteria_t *catalogs_product_group_multiple_string_list_criteria_parseFromJSON(cJSON *catalogs_product_group_multiple_string_list_criteriaJSON){

    catalogs_product_group_multiple_string_list_criteria_t *catalogs_product_group_multiple_string_list_criteria_local_var = NULL;

    // define the local list for catalogs_product_group_multiple_string_list_criteria->values
    list_t *valuesList = NULL;

    // catalogs_product_group_multiple_string_list_criteria->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_multiple_string_list_criteriaJSON, "values");
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
    }

    // catalogs_product_group_multiple_string_list_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_multiple_string_list_criteriaJSON, "negated");
    if (negated) { 
    if(!cJSON_IsBool(negated))
    {
    goto end; //Bool
    }
    }


    catalogs_product_group_multiple_string_list_criteria_local_var = catalogs_product_group_multiple_string_list_criteria_create (
        valuesList,
        negated ? negated->valueint : 0
        );

    return catalogs_product_group_multiple_string_list_criteria_local_var;
end:
    if (valuesList) {
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
