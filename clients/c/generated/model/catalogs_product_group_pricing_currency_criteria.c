#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_pricing_currency_criteria.h"


char* catalogs_product_group_pricing_currency_criteria__operator_ToString(pinterest_rest_api_catalogs_product_group_pricing_currency_criteria_OPERATOR_e _operator) {
    char* _operatorArray[] =  { "NULL", "GREATER_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN", "LESS_THAN_OR_EQUALS" };
    return _operatorArray[_operator];
}

pinterest_rest_api_catalogs_product_group_pricing_currency_criteria_OPERATOR_e catalogs_product_group_pricing_currency_criteria__operator_FromString(char* _operator){
    int stringToReturn = 0;
    char *_operatorArray[] =  { "NULL", "GREATER_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN", "LESS_THAN_OR_EQUALS" };
    size_t sizeofArray = sizeof(_operatorArray) / sizeof(_operatorArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(_operator, _operatorArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria_create_internal(
    pinterest_rest_api_catalogs_product_group_pricing_currency_criteria_OPERATOR_e _operator,
    double value,
    pinterest_rest_api_non_nullable_catalogs_currency__e currency,
    int negated
    ) {
    catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria_local_var = malloc(sizeof(catalogs_product_group_pricing_currency_criteria_t));
    if (!catalogs_product_group_pricing_currency_criteria_local_var) {
        return NULL;
    }
    catalogs_product_group_pricing_currency_criteria_local_var->_operator = _operator;
    catalogs_product_group_pricing_currency_criteria_local_var->value = value;
    catalogs_product_group_pricing_currency_criteria_local_var->currency = currency;
    catalogs_product_group_pricing_currency_criteria_local_var->negated = negated;

    catalogs_product_group_pricing_currency_criteria_local_var->_library_owned = 1;
    return catalogs_product_group_pricing_currency_criteria_local_var;
}

__attribute__((deprecated)) catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria_create(
    pinterest_rest_api_catalogs_product_group_pricing_currency_criteria_OPERATOR_e _operator,
    double value,
    pinterest_rest_api_non_nullable_catalogs_currency__e currency,
    int negated
    ) {
    return catalogs_product_group_pricing_currency_criteria_create_internal (
        _operator,
        value,
        currency,
        negated
        );
}

void catalogs_product_group_pricing_currency_criteria_free(catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria) {
    if(NULL == catalogs_product_group_pricing_currency_criteria){
        return ;
    }
    if(catalogs_product_group_pricing_currency_criteria->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_pricing_currency_criteria_free");
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_product_group_pricing_currency_criteria);
}

cJSON *catalogs_product_group_pricing_currency_criteria_convertToJSON(catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_pricing_currency_criteria->_operator
    if (pinterest_rest_api_catalogs_product_group_pricing_currency_criteria_OPERATOR_NULL == catalogs_product_group_pricing_currency_criteria->_operator) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operator", catalogs_product_group_pricing_currency_criteria__operator_ToString(catalogs_product_group_pricing_currency_criteria->_operator)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_product_group_pricing_currency_criteria->value
    if (!catalogs_product_group_pricing_currency_criteria->value) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "value", catalogs_product_group_pricing_currency_criteria->value) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_pricing_currency_criteria->currency
    if (pinterest_rest_api_non_nullable_catalogs_currency__NULL == catalogs_product_group_pricing_currency_criteria->currency) {
        goto fail;
    }
    cJSON *currency_local_JSON = non_nullable_catalogs_currency_convertToJSON(catalogs_product_group_pricing_currency_criteria->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_product_group_pricing_currency_criteria->negated
    if(catalogs_product_group_pricing_currency_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", catalogs_product_group_pricing_currency_criteria->negated) == NULL) {
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

catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria_parseFromJSON(cJSON *catalogs_product_group_pricing_currency_criteriaJSON){

    catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria_local_var = NULL;

    // define the local variable for catalogs_product_group_pricing_currency_criteria->currency
    pinterest_rest_api_non_nullable_catalogs_currency__e currency_local_nonprim = 0;

    // catalogs_product_group_pricing_currency_criteria->_operator
    cJSON *_operator = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_currency_criteriaJSON, "operator");
    if (cJSON_IsNull(_operator)) {
        _operator = NULL;
    }
    if (!_operator) {
        goto end;
    }

    pinterest_rest_api_catalogs_product_group_pricing_currency_criteria_OPERATOR_e _operatorVariable;
    
    if(!cJSON_IsString(_operator))
    {
    goto end; //Enum
    }
    _operatorVariable = catalogs_product_group_pricing_currency_criteria__operator_FromString(_operator->valuestring);

    // catalogs_product_group_pricing_currency_criteria->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_currency_criteriaJSON, "value");
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

    // catalogs_product_group_pricing_currency_criteria->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_currency_criteriaJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (!currency) {
        goto end;
    }

    
    currency_local_nonprim = non_nullable_catalogs_currency_parseFromJSON(currency); //custom

    // catalogs_product_group_pricing_currency_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_currency_criteriaJSON, "negated");
    if (cJSON_IsNull(negated)) {
        negated = NULL;
    }
    if (negated) { 
    if(!cJSON_IsBool(negated))
    {
    goto end; //Bool
    }
    }


    catalogs_product_group_pricing_currency_criteria_local_var = catalogs_product_group_pricing_currency_criteria_create_internal (
        _operatorVariable,
        value->valuedouble,
        currency_local_nonprim,
        negated ? negated->valueint : 0
        );

    return catalogs_product_group_pricing_currency_criteria_local_var;
end:
    if (currency_local_nonprim) {
        currency_local_nonprim = 0;
    }
    return NULL;

}
