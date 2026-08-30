#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_accounts_country.h"



static ad_accounts_country_t *ad_accounts_country_create_internal(
    country_t *code,
    char *currency,
    double *index,
    char *name
    ) {
    ad_accounts_country_t *ad_accounts_country_local_var = malloc(sizeof(ad_accounts_country_t));
    if (!ad_accounts_country_local_var) {
        return NULL;
    }
    memset(ad_accounts_country_local_var, 0, sizeof(ad_accounts_country_t));
    ad_accounts_country_local_var->_library_owned = 1;
    ad_accounts_country_local_var->code = code;
    ad_accounts_country_local_var->currency = currency;
    ad_accounts_country_local_var->index = index;
    ad_accounts_country_local_var->name = name;
    return ad_accounts_country_local_var;
}

__attribute__((deprecated)) ad_accounts_country_t *ad_accounts_country_create(
    country_t *code,
    char *currency,
    double *index,
    char *name
    ) {
    double *index_copy = NULL;
    if (index) {
        index_copy = malloc(sizeof(double));
        if (index_copy) *index_copy = *index;
    }
    ad_accounts_country_t *result = ad_accounts_country_create_internal (
        code,
        currency,
        index_copy,
        name
        );
    if (!result) {
        free(index_copy);
    }
    return result;
}

void ad_accounts_country_free(ad_accounts_country_t *ad_accounts_country) {
    if(NULL == ad_accounts_country){
        return ;
    }
    if(ad_accounts_country->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_accounts_country_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_accounts_country->code) {
        country_free(ad_accounts_country->code);
        ad_accounts_country->code = NULL;
    }
    if (ad_accounts_country->currency) {
        free(ad_accounts_country->currency);
        ad_accounts_country->currency = NULL;
    }
    if (ad_accounts_country->index) {
        free(ad_accounts_country->index);
        ad_accounts_country->index = NULL;
    }
    if (ad_accounts_country->name) {
        free(ad_accounts_country->name);
        ad_accounts_country->name = NULL;
    }
    free(ad_accounts_country);
}

cJSON *ad_accounts_country_convertToJSON(ad_accounts_country_t *ad_accounts_country) {
    cJSON *item = cJSON_CreateObject();

    // ad_accounts_country->code
    if (!ad_accounts_country->code) {
        goto fail;
    }
    cJSON *code_local_JSON = country_convertToJSON(ad_accounts_country->code);
    if(code_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "code", code_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad_accounts_country->currency
    if (!ad_accounts_country->currency) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "currency", ad_accounts_country->currency) == NULL) {
    goto fail; //String
    }


    // ad_accounts_country->index
    if (!ad_accounts_country->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", *ad_accounts_country->index) == NULL) {
    goto fail; //Numeric
    }


    // ad_accounts_country->name
    if (!ad_accounts_country->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", ad_accounts_country->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_accounts_country_t *ad_accounts_country_parseFromJSON(cJSON *ad_accounts_countryJSON){

    ad_accounts_country_t *ad_accounts_country_local_var = NULL;

    // define the local variable for ad_accounts_country->code
    country_t *code_local_nonprim = NULL;

    char *currency_local_str = NULL;

    // define the local variable for ad_accounts_country->index
    double *index_local_var = NULL;

    char *name_local_str = NULL;

    // ad_accounts_country->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(ad_accounts_countryJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (!code) {
        goto end;
    }

    
    code_local_nonprim = country_parseFromJSON(code); //custom

    // ad_accounts_country->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(ad_accounts_countryJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (!currency) {
        goto end;
    }

    
    if(!cJSON_IsString(currency))
    {
    goto end; //String
    }

    // ad_accounts_country->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(ad_accounts_countryJSON, "index");
    if (cJSON_IsNull(index)) {
        index = NULL;
    }
    if (!index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }
    index_local_var = malloc(sizeof(double));
    if(!index_local_var)
    {
        goto end;
    }
    *index_local_var = index->valuedouble;

    // ad_accounts_country->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_accounts_countryJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    if (currency && !cJSON_IsNull(currency)) currency_local_str = strdup(currency->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    ad_accounts_country_local_var = ad_accounts_country_create_internal (
        code_local_nonprim,
        currency_local_str,
        index_local_var,
        name_local_str
        );

    if (!ad_accounts_country_local_var) {
        goto end;
    }

    return ad_accounts_country_local_var;
end:
    if (code_local_nonprim) {
        country_free(code_local_nonprim);
        code_local_nonprim = NULL;
    }
    if (currency_local_str) {
        free(currency_local_str);
        currency_local_str = NULL;
    }
    if (index_local_var) {
        free(index_local_var);
        index_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
