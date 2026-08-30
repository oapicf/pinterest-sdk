#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_credit_redeem.h"



static ads_credit_redeem_t *ads_credit_redeem_create_internal(
    int *error_code,
    char *error_message,
    int *success
    ) {
    ads_credit_redeem_t *ads_credit_redeem_local_var = malloc(sizeof(ads_credit_redeem_t));
    if (!ads_credit_redeem_local_var) {
        return NULL;
    }
    memset(ads_credit_redeem_local_var, 0, sizeof(ads_credit_redeem_t));
    ads_credit_redeem_local_var->_library_owned = 1;
    ads_credit_redeem_local_var->error_code = error_code;
    ads_credit_redeem_local_var->error_message = error_message;
    ads_credit_redeem_local_var->success = success;
    return ads_credit_redeem_local_var;
}

__attribute__((deprecated)) ads_credit_redeem_t *ads_credit_redeem_create(
    int *error_code,
    char *error_message,
    int *success
    ) {
    int *error_code_copy = NULL;
    if (error_code) {
        error_code_copy = malloc(sizeof(int));
        if (error_code_copy) *error_code_copy = *error_code;
    }
    int *success_copy = NULL;
    if (success) {
        success_copy = malloc(sizeof(int));
        if (success_copy) *success_copy = *success;
    }
    ads_credit_redeem_t *result = ads_credit_redeem_create_internal (
        error_code_copy,
        error_message,
        success_copy
        );
    if (!result) {
        free(error_code_copy);
        free(success_copy);
    }
    return result;
}

void ads_credit_redeem_free(ads_credit_redeem_t *ads_credit_redeem) {
    if(NULL == ads_credit_redeem){
        return ;
    }
    if(ads_credit_redeem->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ads_credit_redeem_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ads_credit_redeem->error_code) {
        free(ads_credit_redeem->error_code);
        ads_credit_redeem->error_code = NULL;
    }
    if (ads_credit_redeem->error_message) {
        free(ads_credit_redeem->error_message);
        ads_credit_redeem->error_message = NULL;
    }
    if (ads_credit_redeem->success) {
        free(ads_credit_redeem->success);
        ads_credit_redeem->success = NULL;
    }
    free(ads_credit_redeem);
}

cJSON *ads_credit_redeem_convertToJSON(ads_credit_redeem_t *ads_credit_redeem) {
    cJSON *item = cJSON_CreateObject();

    // ads_credit_redeem->error_code
    if(ads_credit_redeem->error_code) {
    if(cJSON_AddNumberToObject(item, "errorCode", *ads_credit_redeem->error_code) == NULL) {
    goto fail; //Numeric
    }
    }


    // ads_credit_redeem->error_message
    if(ads_credit_redeem->error_message) {
    if(cJSON_AddStringToObject(item, "errorMessage", ads_credit_redeem->error_message) == NULL) {
    goto fail; //String
    }
    }


    // ads_credit_redeem->success
    if(ads_credit_redeem->success) {
    if(cJSON_AddBoolToObject(item, "success", *ads_credit_redeem->success) == NULL) {
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

ads_credit_redeem_t *ads_credit_redeem_parseFromJSON(cJSON *ads_credit_redeemJSON){

    ads_credit_redeem_t *ads_credit_redeem_local_var = NULL;

    // define the local variable for ads_credit_redeem->error_code
    int *error_code_local_var = NULL;

    char *error_message_local_str = NULL;

    // define the local variable for ads_credit_redeem->success
    int *success_local_var = NULL;

    // ads_credit_redeem->error_code
    cJSON *error_code = cJSON_GetObjectItemCaseSensitive(ads_credit_redeemJSON, "errorCode");
    if (cJSON_IsNull(error_code)) {
        error_code = NULL;
    }
    if (error_code) { 
    if(!cJSON_IsNumber(error_code))
    {
    goto end; //Numeric
    }
    error_code_local_var = malloc(sizeof(int));
    if(!error_code_local_var)
    {
        goto end;
    }
    *error_code_local_var = error_code->valuedouble;
    }

    // ads_credit_redeem->error_message
    cJSON *error_message = cJSON_GetObjectItemCaseSensitive(ads_credit_redeemJSON, "errorMessage");
    if (cJSON_IsNull(error_message)) {
        error_message = NULL;
    }
    if (error_message) { 
    if(!cJSON_IsString(error_message) && !cJSON_IsNull(error_message))
    {
    goto end; //String
    }
    }

    // ads_credit_redeem->success
    cJSON *success = cJSON_GetObjectItemCaseSensitive(ads_credit_redeemJSON, "success");
    if (cJSON_IsNull(success)) {
        success = NULL;
    }
    if (success) { 
    if(!cJSON_IsBool(success))
    {
    goto end; //Bool
    }
    success_local_var = malloc(sizeof(int));
    if(!success_local_var)
    {
        goto end;
    }
    *success_local_var = success->valueint;
    }


    if (error_message && !cJSON_IsNull(error_message)) error_message_local_str = strdup(error_message->valuestring);

    ads_credit_redeem_local_var = ads_credit_redeem_create_internal (
        error_code_local_var,
        error_message_local_str,
        success_local_var
        );

    if (!ads_credit_redeem_local_var) {
        goto end;
    }

    return ads_credit_redeem_local_var;
end:
    if (error_code_local_var) {
        free(error_code_local_var);
        error_code_local_var = NULL;
    }
    if (error_message_local_str) {
        free(error_message_local_str);
        error_message_local_str = NULL;
    }
    if (success_local_var) {
        free(success_local_var);
        success_local_var = NULL;
    }
    return NULL;

}
