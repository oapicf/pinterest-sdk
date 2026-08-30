#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_pricing_criteria.h"



static catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria_create_internal(
    int *inclusion,
    int *negated,
    double *values
    ) {
    catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria_local_var = malloc(sizeof(catalogs_product_group_pricing_criteria_t));
    if (!catalogs_product_group_pricing_criteria_local_var) {
        return NULL;
    }
    memset(catalogs_product_group_pricing_criteria_local_var, 0, sizeof(catalogs_product_group_pricing_criteria_t));
    catalogs_product_group_pricing_criteria_local_var->_library_owned = 1;
    catalogs_product_group_pricing_criteria_local_var->inclusion = inclusion;
    catalogs_product_group_pricing_criteria_local_var->negated = negated;
    catalogs_product_group_pricing_criteria_local_var->values = values;
    return catalogs_product_group_pricing_criteria_local_var;
}

__attribute__((deprecated)) catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria_create(
    int *inclusion,
    int *negated,
    double *values
    ) {
    int *inclusion_copy = NULL;
    if (inclusion) {
        inclusion_copy = malloc(sizeof(int));
        if (inclusion_copy) *inclusion_copy = *inclusion;
    }
    int *negated_copy = NULL;
    if (negated) {
        negated_copy = malloc(sizeof(int));
        if (negated_copy) *negated_copy = *negated;
    }
    double *values_copy = NULL;
    if (values) {
        values_copy = malloc(sizeof(double));
        if (values_copy) *values_copy = *values;
    }
    catalogs_product_group_pricing_criteria_t *result = catalogs_product_group_pricing_criteria_create_internal (
        inclusion_copy,
        negated_copy,
        values_copy
        );
    if (!result) {
        free(inclusion_copy);
        free(negated_copy);
        free(values_copy);
    }
    return result;
}

void catalogs_product_group_pricing_criteria_free(catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria) {
    if(NULL == catalogs_product_group_pricing_criteria){
        return ;
    }
    if(catalogs_product_group_pricing_criteria->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_pricing_criteria_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_pricing_criteria->inclusion) {
        free(catalogs_product_group_pricing_criteria->inclusion);
        catalogs_product_group_pricing_criteria->inclusion = NULL;
    }
    if (catalogs_product_group_pricing_criteria->negated) {
        free(catalogs_product_group_pricing_criteria->negated);
        catalogs_product_group_pricing_criteria->negated = NULL;
    }
    if (catalogs_product_group_pricing_criteria->values) {
        free(catalogs_product_group_pricing_criteria->values);
        catalogs_product_group_pricing_criteria->values = NULL;
    }
    free(catalogs_product_group_pricing_criteria);
}

cJSON *catalogs_product_group_pricing_criteria_convertToJSON(catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_pricing_criteria->inclusion
    if(catalogs_product_group_pricing_criteria->inclusion) {
    if(cJSON_AddBoolToObject(item, "inclusion", *catalogs_product_group_pricing_criteria->inclusion) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_group_pricing_criteria->negated
    if(catalogs_product_group_pricing_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", *catalogs_product_group_pricing_criteria->negated) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_group_pricing_criteria->values
    if (!catalogs_product_group_pricing_criteria->values) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "values", *catalogs_product_group_pricing_criteria->values) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria_parseFromJSON(cJSON *catalogs_product_group_pricing_criteriaJSON){

    catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria_local_var = NULL;

    // define the local variable for catalogs_product_group_pricing_criteria->inclusion
    int *inclusion_local_var = NULL;

    // define the local variable for catalogs_product_group_pricing_criteria->negated
    int *negated_local_var = NULL;

    // define the local variable for catalogs_product_group_pricing_criteria->values
    double *values_local_var = NULL;

    // catalogs_product_group_pricing_criteria->inclusion
    cJSON *inclusion = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_criteriaJSON, "inclusion");
    if (cJSON_IsNull(inclusion)) {
        inclusion = NULL;
    }
    if (inclusion) { 
    if(!cJSON_IsBool(inclusion))
    {
    goto end; //Bool
    }
    inclusion_local_var = malloc(sizeof(int));
    if(!inclusion_local_var)
    {
        goto end;
    }
    *inclusion_local_var = inclusion->valueint;
    }

    // catalogs_product_group_pricing_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_criteriaJSON, "negated");
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

    // catalogs_product_group_pricing_criteria->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_criteriaJSON, "values");
    if (cJSON_IsNull(values)) {
        values = NULL;
    }
    if (!values) {
        goto end;
    }

    
    if(!cJSON_IsNumber(values))
    {
    goto end; //Numeric
    }
    values_local_var = malloc(sizeof(double));
    if(!values_local_var)
    {
        goto end;
    }
    *values_local_var = values->valuedouble;



    catalogs_product_group_pricing_criteria_local_var = catalogs_product_group_pricing_criteria_create_internal (
        inclusion_local_var,
        negated_local_var,
        values_local_var
        );

    if (!catalogs_product_group_pricing_criteria_local_var) {
        goto end;
    }

    return catalogs_product_group_pricing_criteria_local_var;
end:
    if (inclusion_local_var) {
        free(inclusion_local_var);
        inclusion_local_var = NULL;
    }
    if (negated_local_var) {
        free(negated_local_var);
        negated_local_var = NULL;
    }
    if (values_local_var) {
        free(values_local_var);
        values_local_var = NULL;
    }
    return NULL;

}
