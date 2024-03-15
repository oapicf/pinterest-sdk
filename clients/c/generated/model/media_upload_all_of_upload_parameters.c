#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "media_upload_all_of_upload_parameters.h"



media_upload_all_of_upload_parameters_t *media_upload_all_of_upload_parameters_create(
    char *x_amz_date,
    char *x_amz_signature,
    char *x_amz_security_token,
    char *x_amz_algorithm,
    char *key,
    char *policy,
    char *x_amz_credential,
    char *content_type
    ) {
    media_upload_all_of_upload_parameters_t *media_upload_all_of_upload_parameters_local_var = malloc(sizeof(media_upload_all_of_upload_parameters_t));
    if (!media_upload_all_of_upload_parameters_local_var) {
        return NULL;
    }
    media_upload_all_of_upload_parameters_local_var->x_amz_date = x_amz_date;
    media_upload_all_of_upload_parameters_local_var->x_amz_signature = x_amz_signature;
    media_upload_all_of_upload_parameters_local_var->x_amz_security_token = x_amz_security_token;
    media_upload_all_of_upload_parameters_local_var->x_amz_algorithm = x_amz_algorithm;
    media_upload_all_of_upload_parameters_local_var->key = key;
    media_upload_all_of_upload_parameters_local_var->policy = policy;
    media_upload_all_of_upload_parameters_local_var->x_amz_credential = x_amz_credential;
    media_upload_all_of_upload_parameters_local_var->content_type = content_type;

    return media_upload_all_of_upload_parameters_local_var;
}


void media_upload_all_of_upload_parameters_free(media_upload_all_of_upload_parameters_t *media_upload_all_of_upload_parameters) {
    if(NULL == media_upload_all_of_upload_parameters){
        return ;
    }
    listEntry_t *listEntry;
    if (media_upload_all_of_upload_parameters->x_amz_date) {
        free(media_upload_all_of_upload_parameters->x_amz_date);
        media_upload_all_of_upload_parameters->x_amz_date = NULL;
    }
    if (media_upload_all_of_upload_parameters->x_amz_signature) {
        free(media_upload_all_of_upload_parameters->x_amz_signature);
        media_upload_all_of_upload_parameters->x_amz_signature = NULL;
    }
    if (media_upload_all_of_upload_parameters->x_amz_security_token) {
        free(media_upload_all_of_upload_parameters->x_amz_security_token);
        media_upload_all_of_upload_parameters->x_amz_security_token = NULL;
    }
    if (media_upload_all_of_upload_parameters->x_amz_algorithm) {
        free(media_upload_all_of_upload_parameters->x_amz_algorithm);
        media_upload_all_of_upload_parameters->x_amz_algorithm = NULL;
    }
    if (media_upload_all_of_upload_parameters->key) {
        free(media_upload_all_of_upload_parameters->key);
        media_upload_all_of_upload_parameters->key = NULL;
    }
    if (media_upload_all_of_upload_parameters->policy) {
        free(media_upload_all_of_upload_parameters->policy);
        media_upload_all_of_upload_parameters->policy = NULL;
    }
    if (media_upload_all_of_upload_parameters->x_amz_credential) {
        free(media_upload_all_of_upload_parameters->x_amz_credential);
        media_upload_all_of_upload_parameters->x_amz_credential = NULL;
    }
    if (media_upload_all_of_upload_parameters->content_type) {
        free(media_upload_all_of_upload_parameters->content_type);
        media_upload_all_of_upload_parameters->content_type = NULL;
    }
    free(media_upload_all_of_upload_parameters);
}

cJSON *media_upload_all_of_upload_parameters_convertToJSON(media_upload_all_of_upload_parameters_t *media_upload_all_of_upload_parameters) {
    cJSON *item = cJSON_CreateObject();

    // media_upload_all_of_upload_parameters->x_amz_date
    if(media_upload_all_of_upload_parameters->x_amz_date) {
    if(cJSON_AddStringToObject(item, "x-amz-date", media_upload_all_of_upload_parameters->x_amz_date) == NULL) {
    goto fail; //String
    }
    }


    // media_upload_all_of_upload_parameters->x_amz_signature
    if(media_upload_all_of_upload_parameters->x_amz_signature) {
    if(cJSON_AddStringToObject(item, "x-amz-signature", media_upload_all_of_upload_parameters->x_amz_signature) == NULL) {
    goto fail; //String
    }
    }


    // media_upload_all_of_upload_parameters->x_amz_security_token
    if(media_upload_all_of_upload_parameters->x_amz_security_token) {
    if(cJSON_AddStringToObject(item, "x-amz-security-token", media_upload_all_of_upload_parameters->x_amz_security_token) == NULL) {
    goto fail; //String
    }
    }


    // media_upload_all_of_upload_parameters->x_amz_algorithm
    if(media_upload_all_of_upload_parameters->x_amz_algorithm) {
    if(cJSON_AddStringToObject(item, "x-amz-algorithm", media_upload_all_of_upload_parameters->x_amz_algorithm) == NULL) {
    goto fail; //String
    }
    }


    // media_upload_all_of_upload_parameters->key
    if(media_upload_all_of_upload_parameters->key) {
    if(cJSON_AddStringToObject(item, "key", media_upload_all_of_upload_parameters->key) == NULL) {
    goto fail; //String
    }
    }


    // media_upload_all_of_upload_parameters->policy
    if(media_upload_all_of_upload_parameters->policy) {
    if(cJSON_AddStringToObject(item, "policy", media_upload_all_of_upload_parameters->policy) == NULL) {
    goto fail; //String
    }
    }


    // media_upload_all_of_upload_parameters->x_amz_credential
    if(media_upload_all_of_upload_parameters->x_amz_credential) {
    if(cJSON_AddStringToObject(item, "x-amz-credential", media_upload_all_of_upload_parameters->x_amz_credential) == NULL) {
    goto fail; //String
    }
    }


    // media_upload_all_of_upload_parameters->content_type
    if(media_upload_all_of_upload_parameters->content_type) {
    if(cJSON_AddStringToObject(item, "Content-Type", media_upload_all_of_upload_parameters->content_type) == NULL) {
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

media_upload_all_of_upload_parameters_t *media_upload_all_of_upload_parameters_parseFromJSON(cJSON *media_upload_all_of_upload_parametersJSON){

    media_upload_all_of_upload_parameters_t *media_upload_all_of_upload_parameters_local_var = NULL;

    // media_upload_all_of_upload_parameters->x_amz_date
    cJSON *x_amz_date = cJSON_GetObjectItemCaseSensitive(media_upload_all_of_upload_parametersJSON, "x-amz-date");
    if (x_amz_date) { 
    if(!cJSON_IsString(x_amz_date) && !cJSON_IsNull(x_amz_date))
    {
    goto end; //String
    }
    }

    // media_upload_all_of_upload_parameters->x_amz_signature
    cJSON *x_amz_signature = cJSON_GetObjectItemCaseSensitive(media_upload_all_of_upload_parametersJSON, "x-amz-signature");
    if (x_amz_signature) { 
    if(!cJSON_IsString(x_amz_signature) && !cJSON_IsNull(x_amz_signature))
    {
    goto end; //String
    }
    }

    // media_upload_all_of_upload_parameters->x_amz_security_token
    cJSON *x_amz_security_token = cJSON_GetObjectItemCaseSensitive(media_upload_all_of_upload_parametersJSON, "x-amz-security-token");
    if (x_amz_security_token) { 
    if(!cJSON_IsString(x_amz_security_token) && !cJSON_IsNull(x_amz_security_token))
    {
    goto end; //String
    }
    }

    // media_upload_all_of_upload_parameters->x_amz_algorithm
    cJSON *x_amz_algorithm = cJSON_GetObjectItemCaseSensitive(media_upload_all_of_upload_parametersJSON, "x-amz-algorithm");
    if (x_amz_algorithm) { 
    if(!cJSON_IsString(x_amz_algorithm) && !cJSON_IsNull(x_amz_algorithm))
    {
    goto end; //String
    }
    }

    // media_upload_all_of_upload_parameters->key
    cJSON *key = cJSON_GetObjectItemCaseSensitive(media_upload_all_of_upload_parametersJSON, "key");
    if (key) { 
    if(!cJSON_IsString(key) && !cJSON_IsNull(key))
    {
    goto end; //String
    }
    }

    // media_upload_all_of_upload_parameters->policy
    cJSON *policy = cJSON_GetObjectItemCaseSensitive(media_upload_all_of_upload_parametersJSON, "policy");
    if (policy) { 
    if(!cJSON_IsString(policy) && !cJSON_IsNull(policy))
    {
    goto end; //String
    }
    }

    // media_upload_all_of_upload_parameters->x_amz_credential
    cJSON *x_amz_credential = cJSON_GetObjectItemCaseSensitive(media_upload_all_of_upload_parametersJSON, "x-amz-credential");
    if (x_amz_credential) { 
    if(!cJSON_IsString(x_amz_credential) && !cJSON_IsNull(x_amz_credential))
    {
    goto end; //String
    }
    }

    // media_upload_all_of_upload_parameters->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(media_upload_all_of_upload_parametersJSON, "Content-Type");
    if (content_type) { 
    if(!cJSON_IsString(content_type) && !cJSON_IsNull(content_type))
    {
    goto end; //String
    }
    }


    media_upload_all_of_upload_parameters_local_var = media_upload_all_of_upload_parameters_create (
        x_amz_date && !cJSON_IsNull(x_amz_date) ? strdup(x_amz_date->valuestring) : NULL,
        x_amz_signature && !cJSON_IsNull(x_amz_signature) ? strdup(x_amz_signature->valuestring) : NULL,
        x_amz_security_token && !cJSON_IsNull(x_amz_security_token) ? strdup(x_amz_security_token->valuestring) : NULL,
        x_amz_algorithm && !cJSON_IsNull(x_amz_algorithm) ? strdup(x_amz_algorithm->valuestring) : NULL,
        key && !cJSON_IsNull(key) ? strdup(key->valuestring) : NULL,
        policy && !cJSON_IsNull(policy) ? strdup(policy->valuestring) : NULL,
        x_amz_credential && !cJSON_IsNull(x_amz_credential) ? strdup(x_amz_credential->valuestring) : NULL,
        content_type && !cJSON_IsNull(content_type) ? strdup(content_type->valuestring) : NULL
        );

    return media_upload_all_of_upload_parameters_local_var;
end:
    return NULL;

}
