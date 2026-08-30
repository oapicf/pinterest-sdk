#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promotion_template_value.h"



static promotion_template_value_t *promotion_template_value_create_internal(
    double *amount,
    pinterest_rest_api_currency__e currency_code,
    char *custom_text,
    double *percent
    ) {
    promotion_template_value_t *promotion_template_value_local_var = malloc(sizeof(promotion_template_value_t));
    if (!promotion_template_value_local_var) {
        return NULL;
    }
    memset(promotion_template_value_local_var, 0, sizeof(promotion_template_value_t));
    promotion_template_value_local_var->_library_owned = 1;
    promotion_template_value_local_var->amount = amount;
    promotion_template_value_local_var->currency_code = currency_code;
    promotion_template_value_local_var->custom_text = custom_text;
    promotion_template_value_local_var->percent = percent;
    return promotion_template_value_local_var;
}

__attribute__((deprecated)) promotion_template_value_t *promotion_template_value_create(
    double *amount,
    pinterest_rest_api_currency__e currency_code,
    char *custom_text,
    double *percent
    ) {
    double *amount_copy = NULL;
    if (amount) {
        amount_copy = malloc(sizeof(double));
        if (amount_copy) *amount_copy = *amount;
    }
    double *percent_copy = NULL;
    if (percent) {
        percent_copy = malloc(sizeof(double));
        if (percent_copy) *percent_copy = *percent;
    }
    promotion_template_value_t *result = promotion_template_value_create_internal (
        amount_copy,
        currency_code,
        custom_text,
        percent_copy
        );
    if (!result) {
        free(amount_copy);
        free(percent_copy);
    }
    return result;
}

void promotion_template_value_free(promotion_template_value_t *promotion_template_value) {
    if(NULL == promotion_template_value){
        return ;
    }
    if(promotion_template_value->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "promotion_template_value_free");
        return ;
    }
    listEntry_t *listEntry;
    if (promotion_template_value->amount) {
        free(promotion_template_value->amount);
        promotion_template_value->amount = NULL;
    }
    if (promotion_template_value->custom_text) {
        free(promotion_template_value->custom_text);
        promotion_template_value->custom_text = NULL;
    }
    if (promotion_template_value->percent) {
        free(promotion_template_value->percent);
        promotion_template_value->percent = NULL;
    }
    free(promotion_template_value);
}

cJSON *promotion_template_value_convertToJSON(promotion_template_value_t *promotion_template_value) {
    cJSON *item = cJSON_CreateObject();

    // promotion_template_value->amount
    if(promotion_template_value->amount) {
    if(cJSON_AddNumberToObject(item, "amount", *promotion_template_value->amount) == NULL) {
    goto fail; //Numeric
    }
    }


    // promotion_template_value->currency_code
    if(promotion_template_value->currency_code != pinterest_rest_api_currency__NULL) {
    cJSON *currency_code_local_JSON = currency_convertToJSON(promotion_template_value->currency_code);
    if(currency_code_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency_code", currency_code_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // promotion_template_value->custom_text
    if(promotion_template_value->custom_text) {
    if(cJSON_AddStringToObject(item, "custom_text", promotion_template_value->custom_text) == NULL) {
    goto fail; //String
    }
    }


    // promotion_template_value->percent
    if(promotion_template_value->percent) {
    if(cJSON_AddNumberToObject(item, "percent", *promotion_template_value->percent) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

promotion_template_value_t *promotion_template_value_parseFromJSON(cJSON *promotion_template_valueJSON){

    promotion_template_value_t *promotion_template_value_local_var = NULL;

    // define the local variable for promotion_template_value->amount
    double *amount_local_var = NULL;

    // define the local variable for promotion_template_value->currency_code
    pinterest_rest_api_currency__e currency_code_local_nonprim = 0;

    char *custom_text_local_str = NULL;

    // define the local variable for promotion_template_value->percent
    double *percent_local_var = NULL;

    // promotion_template_value->amount
    cJSON *amount = cJSON_GetObjectItemCaseSensitive(promotion_template_valueJSON, "amount");
    if (cJSON_IsNull(amount)) {
        amount = NULL;
    }
    if (amount) { 
    if(!cJSON_IsNumber(amount))
    {
    goto end; //Numeric
    }
    amount_local_var = malloc(sizeof(double));
    if(!amount_local_var)
    {
        goto end;
    }
    *amount_local_var = amount->valuedouble;
    }

    // promotion_template_value->currency_code
    cJSON *currency_code = cJSON_GetObjectItemCaseSensitive(promotion_template_valueJSON, "currency_code");
    if (cJSON_IsNull(currency_code)) {
        currency_code = NULL;
    }
    if (currency_code) { 
    currency_code_local_nonprim = currency_parseFromJSON(currency_code); //custom
    }

    // promotion_template_value->custom_text
    cJSON *custom_text = cJSON_GetObjectItemCaseSensitive(promotion_template_valueJSON, "custom_text");
    if (cJSON_IsNull(custom_text)) {
        custom_text = NULL;
    }
    if (custom_text) { 
    if(!cJSON_IsString(custom_text) && !cJSON_IsNull(custom_text))
    {
    goto end; //String
    }
    }

    // promotion_template_value->percent
    cJSON *percent = cJSON_GetObjectItemCaseSensitive(promotion_template_valueJSON, "percent");
    if (cJSON_IsNull(percent)) {
        percent = NULL;
    }
    if (percent) { 
    if(!cJSON_IsNumber(percent))
    {
    goto end; //Numeric
    }
    percent_local_var = malloc(sizeof(double));
    if(!percent_local_var)
    {
        goto end;
    }
    *percent_local_var = percent->valuedouble;
    }


    if (custom_text && !cJSON_IsNull(custom_text)) custom_text_local_str = strdup(custom_text->valuestring);

    promotion_template_value_local_var = promotion_template_value_create_internal (
        amount_local_var,
        currency_code ? currency_code_local_nonprim : 0,
        custom_text_local_str,
        percent_local_var
        );

    if (!promotion_template_value_local_var) {
        goto end;
    }

    return promotion_template_value_local_var;
end:
    if (amount_local_var) {
        free(amount_local_var);
        amount_local_var = NULL;
    }
    if (currency_code_local_nonprim) {
        currency_code_local_nonprim = 0;
    }
    if (custom_text_local_str) {
        free(custom_text_local_str);
        custom_text_local_str = NULL;
    }
    if (percent_local_var) {
        free(percent_local_var);
        percent_local_var = NULL;
    }
    return NULL;

}
