#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_filter_price.h"



static price_filter_price_t *price_filter_price_create_internal(
    pinterest_rest_api_non_nullable_catalogs_currency__e currency,
    int *negated,
    pinterest_rest_api_numeric_filter_operator_type__e _operator,
    double *value
    ) {
    price_filter_price_t *price_filter_price_local_var = malloc(sizeof(price_filter_price_t));
    if (!price_filter_price_local_var) {
        return NULL;
    }
    memset(price_filter_price_local_var, 0, sizeof(price_filter_price_t));
    price_filter_price_local_var->_library_owned = 1;
    price_filter_price_local_var->currency = currency;
    price_filter_price_local_var->negated = negated;
    price_filter_price_local_var->_operator = _operator;
    price_filter_price_local_var->value = value;
    return price_filter_price_local_var;
}

__attribute__((deprecated)) price_filter_price_t *price_filter_price_create(
    pinterest_rest_api_non_nullable_catalogs_currency__e currency,
    int *negated,
    pinterest_rest_api_numeric_filter_operator_type__e _operator,
    double *value
    ) {
    int *negated_copy = NULL;
    if (negated) {
        negated_copy = malloc(sizeof(int));
        if (negated_copy) *negated_copy = *negated;
    }
    double *value_copy = NULL;
    if (value) {
        value_copy = malloc(sizeof(double));
        if (value_copy) *value_copy = *value;
    }
    price_filter_price_t *result = price_filter_price_create_internal (
        currency,
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

void price_filter_price_free(price_filter_price_t *price_filter_price) {
    if(NULL == price_filter_price){
        return ;
    }
    if(price_filter_price->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "price_filter_price_free");
        return ;
    }
    listEntry_t *listEntry;
    if (price_filter_price->negated) {
        free(price_filter_price->negated);
        price_filter_price->negated = NULL;
    }
    if (price_filter_price->value) {
        free(price_filter_price->value);
        price_filter_price->value = NULL;
    }
    free(price_filter_price);
}

cJSON *price_filter_price_convertToJSON(price_filter_price_t *price_filter_price) {
    cJSON *item = cJSON_CreateObject();

    // price_filter_price->currency
    if (pinterest_rest_api_non_nullable_catalogs_currency__NULL == price_filter_price->currency) {
        goto fail;
    }
    cJSON *currency_local_JSON = non_nullable_catalogs_currency_convertToJSON(price_filter_price->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // price_filter_price->negated
    if(price_filter_price->negated) {
    if(cJSON_AddBoolToObject(item, "negated", *price_filter_price->negated) == NULL) {
    goto fail; //Bool
    }
    }


    // price_filter_price->_operator
    if (pinterest_rest_api_numeric_filter_operator_type__NULL == price_filter_price->_operator) {
        goto fail;
    }
    cJSON *_operator_local_JSON = numeric_filter_operator_type_convertToJSON(price_filter_price->_operator);
    if(_operator_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operator", _operator_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // price_filter_price->value
    if (!price_filter_price->value) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "value", *price_filter_price->value) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

price_filter_price_t *price_filter_price_parseFromJSON(cJSON *price_filter_priceJSON){

    price_filter_price_t *price_filter_price_local_var = NULL;

    // define the local variable for price_filter_price->currency
    pinterest_rest_api_non_nullable_catalogs_currency__e currency_local_nonprim = 0;

    // define the local variable for price_filter_price->negated
    int *negated_local_var = NULL;

    // define the local variable for price_filter_price->_operator
    pinterest_rest_api_numeric_filter_operator_type__e _operator_local_nonprim = 0;

    // define the local variable for price_filter_price->value
    double *value_local_var = NULL;

    // price_filter_price->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(price_filter_priceJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (!currency) {
        goto end;
    }

    
    currency_local_nonprim = non_nullable_catalogs_currency_parseFromJSON(currency); //custom

    // price_filter_price->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(price_filter_priceJSON, "negated");
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

    // price_filter_price->_operator
    cJSON *_operator = cJSON_GetObjectItemCaseSensitive(price_filter_priceJSON, "operator");
    if (cJSON_IsNull(_operator)) {
        _operator = NULL;
    }
    if (!_operator) {
        goto end;
    }

    
    _operator_local_nonprim = numeric_filter_operator_type_parseFromJSON(_operator); //custom

    // price_filter_price->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(price_filter_priceJSON, "value");
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
    value_local_var = malloc(sizeof(double));
    if(!value_local_var)
    {
        goto end;
    }
    *value_local_var = value->valuedouble;



    price_filter_price_local_var = price_filter_price_create_internal (
        currency_local_nonprim,
        negated_local_var,
        _operator_local_nonprim,
        value_local_var
        );

    if (!price_filter_price_local_var) {
        goto end;
    }

    return price_filter_price_local_var;
end:
    if (currency_local_nonprim) {
        currency_local_nonprim = 0;
    }
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
