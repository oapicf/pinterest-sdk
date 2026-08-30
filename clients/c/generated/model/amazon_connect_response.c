#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "amazon_connect_response.h"



static amazon_connect_response_t *amazon_connect_response_create_internal(
    char *message
    ) {
    amazon_connect_response_t *amazon_connect_response_local_var = malloc(sizeof(amazon_connect_response_t));
    if (!amazon_connect_response_local_var) {
        return NULL;
    }
    memset(amazon_connect_response_local_var, 0, sizeof(amazon_connect_response_t));
    amazon_connect_response_local_var->_library_owned = 1;
    amazon_connect_response_local_var->message = message;
    return amazon_connect_response_local_var;
}

__attribute__((deprecated)) amazon_connect_response_t *amazon_connect_response_create(
    char *message
    ) {
    amazon_connect_response_t *result = amazon_connect_response_create_internal (
        message
        );
    if (!result) {
    }
    return result;
}

void amazon_connect_response_free(amazon_connect_response_t *amazon_connect_response) {
    if(NULL == amazon_connect_response){
        return ;
    }
    if(amazon_connect_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "amazon_connect_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (amazon_connect_response->message) {
        free(amazon_connect_response->message);
        amazon_connect_response->message = NULL;
    }
    free(amazon_connect_response);
}

cJSON *amazon_connect_response_convertToJSON(amazon_connect_response_t *amazon_connect_response) {
    cJSON *item = cJSON_CreateObject();

    // amazon_connect_response->message
    if(amazon_connect_response->message) {
    if(cJSON_AddStringToObject(item, "message", amazon_connect_response->message) == NULL) {
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

amazon_connect_response_t *amazon_connect_response_parseFromJSON(cJSON *amazon_connect_responseJSON){

    amazon_connect_response_t *amazon_connect_response_local_var = NULL;

    char *message_local_str = NULL;

    // amazon_connect_response->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(amazon_connect_responseJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    amazon_connect_response_local_var = amazon_connect_response_create_internal (
        message_local_str
        );

    if (!amazon_connect_response_local_var) {
        goto end;
    }

    return amazon_connect_response_local_var;
end:
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    return NULL;

}
