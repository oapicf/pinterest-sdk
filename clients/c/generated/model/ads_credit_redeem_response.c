#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_credit_redeem_response.h"



ads_credit_redeem_response_t *ads_credit_redeem_response_create(
    int success,
    int error_code,
    char *error_message
    ) {
    ads_credit_redeem_response_t *ads_credit_redeem_response_local_var = malloc(sizeof(ads_credit_redeem_response_t));
    if (!ads_credit_redeem_response_local_var) {
        return NULL;
    }
    ads_credit_redeem_response_local_var->success = success;
    ads_credit_redeem_response_local_var->error_code = error_code;
    ads_credit_redeem_response_local_var->error_message = error_message;

    return ads_credit_redeem_response_local_var;
}


void ads_credit_redeem_response_free(ads_credit_redeem_response_t *ads_credit_redeem_response) {
    if(NULL == ads_credit_redeem_response){
        return ;
    }
    listEntry_t *listEntry;
    if (ads_credit_redeem_response->error_message) {
        free(ads_credit_redeem_response->error_message);
        ads_credit_redeem_response->error_message = NULL;
    }
    free(ads_credit_redeem_response);
}

cJSON *ads_credit_redeem_response_convertToJSON(ads_credit_redeem_response_t *ads_credit_redeem_response) {
    cJSON *item = cJSON_CreateObject();

    // ads_credit_redeem_response->success
    if(ads_credit_redeem_response->success) {
    if(cJSON_AddBoolToObject(item, "success", ads_credit_redeem_response->success) == NULL) {
    goto fail; //Bool
    }
    }


    // ads_credit_redeem_response->error_code
    if(ads_credit_redeem_response->error_code) {
    if(cJSON_AddNumberToObject(item, "errorCode", ads_credit_redeem_response->error_code) == NULL) {
    goto fail; //Numeric
    }
    }


    // ads_credit_redeem_response->error_message
    if(ads_credit_redeem_response->error_message) {
    if(cJSON_AddStringToObject(item, "errorMessage", ads_credit_redeem_response->error_message) == NULL) {
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

ads_credit_redeem_response_t *ads_credit_redeem_response_parseFromJSON(cJSON *ads_credit_redeem_responseJSON){

    ads_credit_redeem_response_t *ads_credit_redeem_response_local_var = NULL;

    // ads_credit_redeem_response->success
    cJSON *success = cJSON_GetObjectItemCaseSensitive(ads_credit_redeem_responseJSON, "success");
    if (success) { 
    if(!cJSON_IsBool(success))
    {
    goto end; //Bool
    }
    }

    // ads_credit_redeem_response->error_code
    cJSON *error_code = cJSON_GetObjectItemCaseSensitive(ads_credit_redeem_responseJSON, "errorCode");
    if (error_code) { 
    if(!cJSON_IsNumber(error_code))
    {
    goto end; //Numeric
    }
    }

    // ads_credit_redeem_response->error_message
    cJSON *error_message = cJSON_GetObjectItemCaseSensitive(ads_credit_redeem_responseJSON, "errorMessage");
    if (error_message) { 
    if(!cJSON_IsString(error_message) && !cJSON_IsNull(error_message))
    {
    goto end; //String
    }
    }


    ads_credit_redeem_response_local_var = ads_credit_redeem_response_create (
        success ? success->valueint : 0,
        error_code ? error_code->valuedouble : 0,
        error_message && !cJSON_IsNull(error_message) ? strdup(error_message->valuestring) : NULL
        );

    return ads_credit_redeem_response_local_var;
end:
    return NULL;

}
