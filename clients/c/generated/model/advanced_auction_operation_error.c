#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_operation_error.h"



advanced_auction_operation_error_t *advanced_auction_operation_error_create(
    int code,
    char *message
    ) {
    advanced_auction_operation_error_t *advanced_auction_operation_error_local_var = malloc(sizeof(advanced_auction_operation_error_t));
    if (!advanced_auction_operation_error_local_var) {
        return NULL;
    }
    advanced_auction_operation_error_local_var->code = code;
    advanced_auction_operation_error_local_var->message = message;

    return advanced_auction_operation_error_local_var;
}


void advanced_auction_operation_error_free(advanced_auction_operation_error_t *advanced_auction_operation_error) {
    if(NULL == advanced_auction_operation_error){
        return ;
    }
    listEntry_t *listEntry;
    if (advanced_auction_operation_error->message) {
        free(advanced_auction_operation_error->message);
        advanced_auction_operation_error->message = NULL;
    }
    free(advanced_auction_operation_error);
}

cJSON *advanced_auction_operation_error_convertToJSON(advanced_auction_operation_error_t *advanced_auction_operation_error) {
    cJSON *item = cJSON_CreateObject();

    // advanced_auction_operation_error->code
    if(advanced_auction_operation_error->code) {
    if(cJSON_AddNumberToObject(item, "code", advanced_auction_operation_error->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // advanced_auction_operation_error->message
    if(advanced_auction_operation_error->message) {
    if(cJSON_AddStringToObject(item, "message", advanced_auction_operation_error->message) == NULL) {
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

advanced_auction_operation_error_t *advanced_auction_operation_error_parseFromJSON(cJSON *advanced_auction_operation_errorJSON){

    advanced_auction_operation_error_t *advanced_auction_operation_error_local_var = NULL;

    // advanced_auction_operation_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(advanced_auction_operation_errorJSON, "code");
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    }

    // advanced_auction_operation_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(advanced_auction_operation_errorJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    advanced_auction_operation_error_local_var = advanced_auction_operation_error_create (
        code ? code->valuedouble : 0,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL
        );

    return advanced_auction_operation_error_local_var;
end:
    return NULL;

}
