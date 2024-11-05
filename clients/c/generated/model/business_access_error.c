#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_access_error.h"



business_access_error_t *business_access_error_create(
    int code,
    char *message
    ) {
    business_access_error_t *business_access_error_local_var = malloc(sizeof(business_access_error_t));
    if (!business_access_error_local_var) {
        return NULL;
    }
    business_access_error_local_var->code = code;
    business_access_error_local_var->message = message;

    return business_access_error_local_var;
}


void business_access_error_free(business_access_error_t *business_access_error) {
    if(NULL == business_access_error){
        return ;
    }
    listEntry_t *listEntry;
    if (business_access_error->message) {
        free(business_access_error->message);
        business_access_error->message = NULL;
    }
    free(business_access_error);
}

cJSON *business_access_error_convertToJSON(business_access_error_t *business_access_error) {
    cJSON *item = cJSON_CreateObject();

    // business_access_error->code
    if (!business_access_error->code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "code", business_access_error->code) == NULL) {
    goto fail; //Numeric
    }


    // business_access_error->message
    if (!business_access_error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", business_access_error->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

business_access_error_t *business_access_error_parseFromJSON(cJSON *business_access_errorJSON){

    business_access_error_t *business_access_error_local_var = NULL;

    // business_access_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(business_access_errorJSON, "code");
    if (!code) {
        goto end;
    }

    
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }

    // business_access_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(business_access_errorJSON, "message");
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }


    business_access_error_local_var = business_access_error_create (
        code->valuedouble,
        strdup(message->valuestring)
        );

    return business_access_error_local_var;
end:
    return NULL;

}
