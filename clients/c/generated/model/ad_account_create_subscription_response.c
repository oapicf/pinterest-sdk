#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_create_subscription_response.h"



ad_account_create_subscription_response_t *ad_account_create_subscription_response_create(
    char *id,
    char *cryptographic_key,
    char *cryptographic_algorithm,
    int created_time
    ) {
    ad_account_create_subscription_response_t *ad_account_create_subscription_response_local_var = malloc(sizeof(ad_account_create_subscription_response_t));
    if (!ad_account_create_subscription_response_local_var) {
        return NULL;
    }
    ad_account_create_subscription_response_local_var->id = id;
    ad_account_create_subscription_response_local_var->cryptographic_key = cryptographic_key;
    ad_account_create_subscription_response_local_var->cryptographic_algorithm = cryptographic_algorithm;
    ad_account_create_subscription_response_local_var->created_time = created_time;

    return ad_account_create_subscription_response_local_var;
}


void ad_account_create_subscription_response_free(ad_account_create_subscription_response_t *ad_account_create_subscription_response) {
    if(NULL == ad_account_create_subscription_response){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_create_subscription_response->id) {
        free(ad_account_create_subscription_response->id);
        ad_account_create_subscription_response->id = NULL;
    }
    if (ad_account_create_subscription_response->cryptographic_key) {
        free(ad_account_create_subscription_response->cryptographic_key);
        ad_account_create_subscription_response->cryptographic_key = NULL;
    }
    if (ad_account_create_subscription_response->cryptographic_algorithm) {
        free(ad_account_create_subscription_response->cryptographic_algorithm);
        ad_account_create_subscription_response->cryptographic_algorithm = NULL;
    }
    free(ad_account_create_subscription_response);
}

cJSON *ad_account_create_subscription_response_convertToJSON(ad_account_create_subscription_response_t *ad_account_create_subscription_response) {
    cJSON *item = cJSON_CreateObject();

    // ad_account_create_subscription_response->id
    if(ad_account_create_subscription_response->id) {
    if(cJSON_AddStringToObject(item, "id", ad_account_create_subscription_response->id) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_response->cryptographic_key
    if(ad_account_create_subscription_response->cryptographic_key) {
    if(cJSON_AddStringToObject(item, "cryptographic_key", ad_account_create_subscription_response->cryptographic_key) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_response->cryptographic_algorithm
    if(ad_account_create_subscription_response->cryptographic_algorithm) {
    if(cJSON_AddStringToObject(item, "cryptographic_algorithm", ad_account_create_subscription_response->cryptographic_algorithm) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_subscription_response->created_time
    if(ad_account_create_subscription_response->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", ad_account_create_subscription_response->created_time) == NULL) {
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

ad_account_create_subscription_response_t *ad_account_create_subscription_response_parseFromJSON(cJSON *ad_account_create_subscription_responseJSON){

    ad_account_create_subscription_response_t *ad_account_create_subscription_response_local_var = NULL;

    // ad_account_create_subscription_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_response->cryptographic_key
    cJSON *cryptographic_key = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "cryptographic_key");
    if (cryptographic_key) { 
    if(!cJSON_IsString(cryptographic_key) && !cJSON_IsNull(cryptographic_key))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_response->cryptographic_algorithm
    cJSON *cryptographic_algorithm = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "cryptographic_algorithm");
    if (cryptographic_algorithm) { 
    if(!cJSON_IsString(cryptographic_algorithm) && !cJSON_IsNull(cryptographic_algorithm))
    {
    goto end; //String
    }
    }

    // ad_account_create_subscription_response->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(ad_account_create_subscription_responseJSON, "created_time");
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }


    ad_account_create_subscription_response_local_var = ad_account_create_subscription_response_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        cryptographic_key && !cJSON_IsNull(cryptographic_key) ? strdup(cryptographic_key->valuestring) : NULL,
        cryptographic_algorithm && !cJSON_IsNull(cryptographic_algorithm) ? strdup(cryptographic_algorithm->valuestring) : NULL,
        created_time ? created_time->valuedouble : 0
        );

    return ad_account_create_subscription_response_local_var;
end:
    return NULL;

}
