#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_website_verify_request.h"


char* user_website_verify_request_verification_method_ToString(pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_e verification_method) {
    char* verification_methodArray[] =  { "NULL", "FILENAME", "METATAG", "DNSTXT" };
    return verification_methodArray[verification_method];
}

pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_e user_website_verify_request_verification_method_FromString(char* verification_method){
    int stringToReturn = 0;
    char *verification_methodArray[] =  { "NULL", "FILENAME", "METATAG", "DNSTXT" };
    size_t sizeofArray = sizeof(verification_methodArray) / sizeof(verification_methodArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(verification_method, verification_methodArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

user_website_verify_request_t *user_website_verify_request_create(
    char *website,
    pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_e verification_method
    ) {
    user_website_verify_request_t *user_website_verify_request_local_var = malloc(sizeof(user_website_verify_request_t));
    if (!user_website_verify_request_local_var) {
        return NULL;
    }
    user_website_verify_request_local_var->website = website;
    user_website_verify_request_local_var->verification_method = verification_method;

    return user_website_verify_request_local_var;
}


void user_website_verify_request_free(user_website_verify_request_t *user_website_verify_request) {
    if(NULL == user_website_verify_request){
        return ;
    }
    listEntry_t *listEntry;
    if (user_website_verify_request->website) {
        free(user_website_verify_request->website);
        user_website_verify_request->website = NULL;
    }
    free(user_website_verify_request);
}

cJSON *user_website_verify_request_convertToJSON(user_website_verify_request_t *user_website_verify_request) {
    cJSON *item = cJSON_CreateObject();

    // user_website_verify_request->website
    if(user_website_verify_request->website) {
    if(cJSON_AddStringToObject(item, "website", user_website_verify_request->website) == NULL) {
    goto fail; //String
    }
    }


    // user_website_verify_request->verification_method
    if(user_website_verify_request->verification_method != pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_NULL) {
    if(cJSON_AddStringToObject(item, "verification_method", verification_methoduser_website_verify_request_ToString(user_website_verify_request->verification_method)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

user_website_verify_request_t *user_website_verify_request_parseFromJSON(cJSON *user_website_verify_requestJSON){

    user_website_verify_request_t *user_website_verify_request_local_var = NULL;

    // user_website_verify_request->website
    cJSON *website = cJSON_GetObjectItemCaseSensitive(user_website_verify_requestJSON, "website");
    if (website) { 
    if(!cJSON_IsString(website) && !cJSON_IsNull(website))
    {
    goto end; //String
    }
    }

    // user_website_verify_request->verification_method
    cJSON *verification_method = cJSON_GetObjectItemCaseSensitive(user_website_verify_requestJSON, "verification_method");
    pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_e verification_methodVariable;
    if (verification_method) { 
    if(!cJSON_IsString(verification_method))
    {
    goto end; //Enum
    }
    verification_methodVariable = user_website_verify_request_verification_method_FromString(verification_method->valuestring);
    }


    user_website_verify_request_local_var = user_website_verify_request_create (
        website && !cJSON_IsNull(website) ? strdup(website->valuestring) : NULL,
        verification_method ? verification_methodVariable : pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_NULL
        );

    return user_website_verify_request_local_var;
end:
    return NULL;

}
