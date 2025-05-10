#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_accounts_country_response_data.h"



static ad_accounts_country_response_data_t *ad_accounts_country_response_data_create_internal(
    pinterest_rest_api_ad_country__e code,
    char *currency,
    double index,
    char *name
    ) {
    ad_accounts_country_response_data_t *ad_accounts_country_response_data_local_var = malloc(sizeof(ad_accounts_country_response_data_t));
    if (!ad_accounts_country_response_data_local_var) {
        return NULL;
    }
    ad_accounts_country_response_data_local_var->code = code;
    ad_accounts_country_response_data_local_var->currency = currency;
    ad_accounts_country_response_data_local_var->index = index;
    ad_accounts_country_response_data_local_var->name = name;

    ad_accounts_country_response_data_local_var->_library_owned = 1;
    return ad_accounts_country_response_data_local_var;
}

__attribute__((deprecated)) ad_accounts_country_response_data_t *ad_accounts_country_response_data_create(
    pinterest_rest_api_ad_country__e code,
    char *currency,
    double index,
    char *name
    ) {
    return ad_accounts_country_response_data_create_internal (
        code,
        currency,
        index,
        name
        );
}

void ad_accounts_country_response_data_free(ad_accounts_country_response_data_t *ad_accounts_country_response_data) {
    if(NULL == ad_accounts_country_response_data){
        return ;
    }
    if(ad_accounts_country_response_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_accounts_country_response_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_accounts_country_response_data->currency) {
        free(ad_accounts_country_response_data->currency);
        ad_accounts_country_response_data->currency = NULL;
    }
    if (ad_accounts_country_response_data->name) {
        free(ad_accounts_country_response_data->name);
        ad_accounts_country_response_data->name = NULL;
    }
    free(ad_accounts_country_response_data);
}

cJSON *ad_accounts_country_response_data_convertToJSON(ad_accounts_country_response_data_t *ad_accounts_country_response_data) {
    cJSON *item = cJSON_CreateObject();

    // ad_accounts_country_response_data->code
    if(ad_accounts_country_response_data->code != pinterest_rest_api_ad_country__NULL) {
    cJSON *code_local_JSON = ad_country_convertToJSON(ad_accounts_country_response_data->code);
    if(code_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "code", code_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_accounts_country_response_data->currency
    if(ad_accounts_country_response_data->currency) {
    if(cJSON_AddStringToObject(item, "currency", ad_accounts_country_response_data->currency) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_country_response_data->index
    if(ad_accounts_country_response_data->index) {
    if(cJSON_AddNumberToObject(item, "index", ad_accounts_country_response_data->index) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_accounts_country_response_data->name
    if(ad_accounts_country_response_data->name) {
    if(cJSON_AddStringToObject(item, "name", ad_accounts_country_response_data->name) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_accounts_country_response_data_t *ad_accounts_country_response_data_parseFromJSON(cJSON *ad_accounts_country_response_dataJSON){

    ad_accounts_country_response_data_t *ad_accounts_country_response_data_local_var = NULL;

    // define the local variable for ad_accounts_country_response_data->code
    pinterest_rest_api_ad_country__e code_local_nonprim = 0;

    // ad_accounts_country_response_data->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(ad_accounts_country_response_dataJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    code_local_nonprim = ad_country_parseFromJSON(code); //custom
    }

    // ad_accounts_country_response_data->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(ad_accounts_country_response_dataJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (currency) { 
    if(!cJSON_IsString(currency) && !cJSON_IsNull(currency))
    {
    goto end; //String
    }
    }

    // ad_accounts_country_response_data->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(ad_accounts_country_response_dataJSON, "index");
    if (cJSON_IsNull(index)) {
        index = NULL;
    }
    if (index) { 
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }
    }

    // ad_accounts_country_response_data->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_accounts_country_response_dataJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    ad_accounts_country_response_data_local_var = ad_accounts_country_response_data_create_internal (
        code ? code_local_nonprim : 0,
        currency && !cJSON_IsNull(currency) ? strdup(currency->valuestring) : NULL,
        index ? index->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return ad_accounts_country_response_data_local_var;
end:
    if (code_local_nonprim) {
        code_local_nonprim = 0;
    }
    return NULL;

}
