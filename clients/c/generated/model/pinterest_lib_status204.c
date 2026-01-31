#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pinterest_lib_status204.h"


char* pinterest_lib_status204_status_code_ToString(pinterest_rest_api_pinterest_lib_status204_STATUSCODE_e status_code) {
    char* status_codeArray[] =  { "NULL", "204" };
    return status_codeArray[status_code];
}

pinterest_rest_api_pinterest_lib_status204_STATUSCODE_e pinterest_lib_status204_status_code_FromString(char* status_code){
    int stringToReturn = 0;
    char *status_codeArray[] =  { "NULL", "204" };
    size_t sizeofArray = sizeof(status_codeArray) / sizeof(status_codeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status_code, status_codeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static pinterest_lib_status204_t *pinterest_lib_status204_create_internal(
    double status_code
    ) {
    pinterest_lib_status204_t *pinterest_lib_status204_local_var = malloc(sizeof(pinterest_lib_status204_t));
    if (!pinterest_lib_status204_local_var) {
        return NULL;
    }
    pinterest_lib_status204_local_var->status_code = status_code;

    pinterest_lib_status204_local_var->_library_owned = 1;
    return pinterest_lib_status204_local_var;
}

__attribute__((deprecated)) pinterest_lib_status204_t *pinterest_lib_status204_create(
    double status_code
    ) {
    return pinterest_lib_status204_create_internal (
        status_code
        );
}

void pinterest_lib_status204_free(pinterest_lib_status204_t *pinterest_lib_status204) {
    if(NULL == pinterest_lib_status204){
        return ;
    }
    if(pinterest_lib_status204->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pinterest_lib_status204_free");
        return ;
    }
    listEntry_t *listEntry;
    free(pinterest_lib_status204);
}

cJSON *pinterest_lib_status204_convertToJSON(pinterest_lib_status204_t *pinterest_lib_status204) {
    cJSON *item = cJSON_CreateObject();

    // pinterest_lib_status204->status_code
    if (pinterest_rest_api_pinterest_lib_status204_STATUSCODE_NULL == pinterest_lib_status204->status_code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "statusCode", pinterest_lib_status204->status_code) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pinterest_lib_status204_t *pinterest_lib_status204_parseFromJSON(cJSON *pinterest_lib_status204JSON){

    pinterest_lib_status204_t *pinterest_lib_status204_local_var = NULL;

    // pinterest_lib_status204->status_code
    cJSON *status_code = cJSON_GetObjectItemCaseSensitive(pinterest_lib_status204JSON, "statusCode");
    if (cJSON_IsNull(status_code)) {
        status_code = NULL;
    }
    if (!status_code) {
        goto end;
    }

    
    if(!cJSON_IsNumber(status_code))
    {
    goto end; //Numeric
    }


    pinterest_lib_status204_local_var = pinterest_lib_status204_create_internal (
        status_code->valuedouble
        );

    return pinterest_lib_status204_local_var;
end:
    return NULL;

}
