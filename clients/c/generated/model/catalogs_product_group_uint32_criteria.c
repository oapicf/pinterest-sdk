#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_uint32_criteria.h"



static catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria_create_internal(
    int *negated,
    pinterest_rest_api_numeric_filter_operator_type__e _operator,
    int *value
    ) {
    catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria_local_var = malloc(sizeof(catalogs_product_group_uint32_criteria_t));
    if (!catalogs_product_group_uint32_criteria_local_var) {
        return NULL;
    }
    memset(catalogs_product_group_uint32_criteria_local_var, 0, sizeof(catalogs_product_group_uint32_criteria_t));
    catalogs_product_group_uint32_criteria_local_var->_library_owned = 1;
    catalogs_product_group_uint32_criteria_local_var->negated = negated;
    catalogs_product_group_uint32_criteria_local_var->_operator = _operator;
    catalogs_product_group_uint32_criteria_local_var->value = value;
    return catalogs_product_group_uint32_criteria_local_var;
}

__attribute__((deprecated)) catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria_create(
    int *negated,
    pinterest_rest_api_numeric_filter_operator_type__e _operator,
    int *value
    ) {
    int *negated_copy = NULL;
    if (negated) {
        negated_copy = malloc(sizeof(int));
        if (negated_copy) *negated_copy = *negated;
    }
    int *value_copy = NULL;
    if (value) {
        value_copy = malloc(sizeof(int));
        if (value_copy) *value_copy = *value;
    }
    catalogs_product_group_uint32_criteria_t *result = catalogs_product_group_uint32_criteria_create_internal (
        negated_copy,
        _operator,
        value_copy
        );
    if (!result) {
        free(negated_copy);
        free(value_copy);
    }
    return result;
}

void catalogs_product_group_uint32_criteria_free(catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria) {
    if(NULL == catalogs_product_group_uint32_criteria){
        return ;
    }
    if(catalogs_product_group_uint32_criteria->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_uint32_criteria_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_uint32_criteria->negated) {
        free(catalogs_product_group_uint32_criteria->negated);
        catalogs_product_group_uint32_criteria->negated = NULL;
    }
    if (catalogs_product_group_uint32_criteria->value) {
        free(catalogs_product_group_uint32_criteria->value);
        catalogs_product_group_uint32_criteria->value = NULL;
    }
    free(catalogs_product_group_uint32_criteria);
}

cJSON *catalogs_product_group_uint32_criteria_convertToJSON(catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_uint32_criteria->negated
    if(catalogs_product_group_uint32_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", *catalogs_product_group_uint32_criteria->negated) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_group_uint32_criteria->_operator
    if (pinterest_rest_api_numeric_filter_operator_type__NULL == catalogs_product_group_uint32_criteria->_operator) {
        goto fail;
    }
    cJSON *_operator_local_JSON = numeric_filter_operator_type_convertToJSON(catalogs_product_group_uint32_criteria->_operator);
    if(_operator_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operator", _operator_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_product_group_uint32_criteria->value
    if (!catalogs_product_group_uint32_criteria->value) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "value", *catalogs_product_group_uint32_criteria->value) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria_parseFromJSON(cJSON *catalogs_product_group_uint32_criteriaJSON){

    catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria_local_var = NULL;

    // define the local variable for catalogs_product_group_uint32_criteria->negated
    int *negated_local_var = NULL;

    // define the local variable for catalogs_product_group_uint32_criteria->_operator
    pinterest_rest_api_numeric_filter_operator_type__e _operator_local_nonprim = 0;

    // define the local variable for catalogs_product_group_uint32_criteria->value
    int *value_local_var = NULL;

    // catalogs_product_group_uint32_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_uint32_criteriaJSON, "negated");
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

    // catalogs_product_group_uint32_criteria->_operator
    cJSON *_operator = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_uint32_criteriaJSON, "operator");
    if (cJSON_IsNull(_operator)) {
        _operator = NULL;
    }
    if (!_operator) {
        goto end;
    }

    
    _operator_local_nonprim = numeric_filter_operator_type_parseFromJSON(_operator); //custom

    // catalogs_product_group_uint32_criteria->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_uint32_criteriaJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }
    value_local_var = malloc(sizeof(int));
    if(!value_local_var)
    {
        goto end;
    }
    *value_local_var = value->valuedouble;



    catalogs_product_group_uint32_criteria_local_var = catalogs_product_group_uint32_criteria_create_internal (
        negated_local_var,
        _operator_local_nonprim,
        value_local_var
        );

    if (!catalogs_product_group_uint32_criteria_local_var) {
        goto end;
    }

    return catalogs_product_group_uint32_criteria_local_var;
end:
    if (negated_local_var) {
        free(negated_local_var);
        negated_local_var = NULL;
    }
    if (_operator_local_nonprim) {
        _operator_local_nonprim = 0;
    }
    if (value_local_var) {
        free(value_local_var);
        value_local_var = NULL;
    }
    return NULL;

}
