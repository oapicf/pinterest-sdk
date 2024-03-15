#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_multiple_gender_criteria.h"


char* catalogs_product_group_multiple_gender_criteria_values_ToString(pinterest_rest_api_catalogs_product_group_multiple_gender_criteria__e values) {
    char *valuesArray[] =  { "NULL", "FEMALE", "MALE", "UNISEX" };
    return valuesArray[values - 1];
}

pinterest_rest_api_catalogs_product_group_multiple_gender_criteria__e catalogs_product_group_multiple_gender_criteria_values_FromString(char* values) {
    int stringToReturn = 0;
    char *valuesArray[] =  { "NULL", "FEMALE", "MALE", "UNISEX" };
    size_t sizeofArray = sizeof(valuesArray) / sizeof(valuesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(values, valuesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_product_group_multiple_gender_criteria_t *catalogs_product_group_multiple_gender_criteria_create(
    list_t *values,
    int negated
    ) {
    catalogs_product_group_multiple_gender_criteria_t *catalogs_product_group_multiple_gender_criteria_local_var = malloc(sizeof(catalogs_product_group_multiple_gender_criteria_t));
    if (!catalogs_product_group_multiple_gender_criteria_local_var) {
        return NULL;
    }
    catalogs_product_group_multiple_gender_criteria_local_var->values = values;
    catalogs_product_group_multiple_gender_criteria_local_var->negated = negated;

    return catalogs_product_group_multiple_gender_criteria_local_var;
}


void catalogs_product_group_multiple_gender_criteria_free(catalogs_product_group_multiple_gender_criteria_t *catalogs_product_group_multiple_gender_criteria) {
    if(NULL == catalogs_product_group_multiple_gender_criteria){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_multiple_gender_criteria->values) {
        list_ForEach(listEntry, catalogs_product_group_multiple_gender_criteria->values) {
            gender_free(listEntry->data);
        }
        list_freeList(catalogs_product_group_multiple_gender_criteria->values);
        catalogs_product_group_multiple_gender_criteria->values = NULL;
    }
    free(catalogs_product_group_multiple_gender_criteria);
}

cJSON *catalogs_product_group_multiple_gender_criteria_convertToJSON(catalogs_product_group_multiple_gender_criteria_t *catalogs_product_group_multiple_gender_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_multiple_gender_criteria->values
    if (pinterest_rest_api_catalogs_product_group_multiple_gender_criteria_VALUES_NULL == catalogs_product_group_multiple_gender_criteria->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *valuesListEntry;
    if (catalogs_product_group_multiple_gender_criteria->values) {
    list_ForEach(valuesListEntry, catalogs_product_group_multiple_gender_criteria->values) {
    cJSON *itemLocal = gender_convertToJSON((pinterest_rest_api_catalogs_product_group_multiple_gender_criteria__e)valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(values, itemLocal);
    }
    }


    // catalogs_product_group_multiple_gender_criteria->negated
    if(catalogs_product_group_multiple_gender_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", catalogs_product_group_multiple_gender_criteria->negated) == NULL) {
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

catalogs_product_group_multiple_gender_criteria_t *catalogs_product_group_multiple_gender_criteria_parseFromJSON(cJSON *catalogs_product_group_multiple_gender_criteriaJSON){

    catalogs_product_group_multiple_gender_criteria_t *catalogs_product_group_multiple_gender_criteria_local_var = NULL;

    // define the local list for catalogs_product_group_multiple_gender_criteria->values
    list_t *valuesList = NULL;

    // catalogs_product_group_multiple_gender_criteria->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_multiple_gender_criteriaJSON, "values");
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
        catalogs_product_group_multiple_gender_criteria_gender_e valuesItem = gender_parseFromJSON(values_local_nonprimitive);

        list_addElement(valuesList, (void *)valuesItem);
    }

    // catalogs_product_group_multiple_gender_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_multiple_gender_criteriaJSON, "negated");
    if (negated) { 
    if(!cJSON_IsBool(negated))
    {
    goto end; //Bool
    }
    }


    catalogs_product_group_multiple_gender_criteria_local_var = catalogs_product_group_multiple_gender_criteria_create (
        valuesList,
        negated ? negated->valueint : 0
        );

    return catalogs_product_group_multiple_gender_criteria_local_var;
end:
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            gender_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
