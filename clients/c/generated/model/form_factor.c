#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "form_factor.h"


char* form_factor_form_factor_ToString(pinterest_rest_api_form_factor__e form_factor) {
    char *form_factorArray[] =  { "NULL", "desktop", "laptop", "cellphone", "tablet", "smartwatch", "tv", "vr", "console", "other" };
    return form_factorArray[form_factor];
}

pinterest_rest_api_form_factor__e form_factor_form_factor_FromString(char* form_factor) {
    int stringToReturn = 0;
    char *form_factorArray[] =  { "NULL", "desktop", "laptop", "cellphone", "tablet", "smartwatch", "tv", "vr", "console", "other" };
    size_t sizeofArray = sizeof(form_factorArray) / sizeof(form_factorArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(form_factor, form_factorArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *form_factor_convertToJSON(pinterest_rest_api_form_factor__e form_factor) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "form_factor", form_factor_form_factor_ToString(form_factor)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_form_factor__e form_factor_parseFromJSON(cJSON *form_factorJSON) {
    if(!cJSON_IsString(form_factorJSON) || (form_factorJSON->valuestring == NULL)) {
        return 0;
    }
    return form_factor_form_factor_FromString(form_factorJSON->valuestring);
}
