#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_template_update_request.h"


char* targeting_template_update_request_operation_type_ToString(pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_e operation_type) {
    char* operation_typeArray[] =  { "NULL", "REMOVE" };
    return operation_typeArray[operation_type];
}

pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_e targeting_template_update_request_operation_type_FromString(char* operation_type){
    int stringToReturn = 0;
    char *operation_typeArray[] =  { "NULL", "REMOVE" };
    size_t sizeofArray = sizeof(operation_typeArray) / sizeof(operation_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation_type, operation_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static targeting_template_update_request_t *targeting_template_update_request_create_internal(
    pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_e operation_type,
    char *id
    ) {
    targeting_template_update_request_t *targeting_template_update_request_local_var = malloc(sizeof(targeting_template_update_request_t));
    if (!targeting_template_update_request_local_var) {
        return NULL;
    }
    targeting_template_update_request_local_var->operation_type = operation_type;
    targeting_template_update_request_local_var->id = id;

    targeting_template_update_request_local_var->_library_owned = 1;
    return targeting_template_update_request_local_var;
}

__attribute__((deprecated)) targeting_template_update_request_t *targeting_template_update_request_create(
    pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_e operation_type,
    char *id
    ) {
    return targeting_template_update_request_create_internal (
        operation_type,
        id
        );
}

void targeting_template_update_request_free(targeting_template_update_request_t *targeting_template_update_request) {
    if(NULL == targeting_template_update_request){
        return ;
    }
    if(targeting_template_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_template_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_template_update_request->id) {
        free(targeting_template_update_request->id);
        targeting_template_update_request->id = NULL;
    }
    free(targeting_template_update_request);
}

cJSON *targeting_template_update_request_convertToJSON(targeting_template_update_request_t *targeting_template_update_request) {
    cJSON *item = cJSON_CreateObject();

    // targeting_template_update_request->operation_type
    if (pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_NULL == targeting_template_update_request->operation_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation_type", targeting_template_update_request_operation_type_ToString(targeting_template_update_request->operation_type)) == NULL)
    {
    goto fail; //Enum
    }


    // targeting_template_update_request->id
    if (!targeting_template_update_request->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", targeting_template_update_request->id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

targeting_template_update_request_t *targeting_template_update_request_parseFromJSON(cJSON *targeting_template_update_requestJSON){

    targeting_template_update_request_t *targeting_template_update_request_local_var = NULL;

    // targeting_template_update_request->operation_type
    cJSON *operation_type = cJSON_GetObjectItemCaseSensitive(targeting_template_update_requestJSON, "operation_type");
    if (cJSON_IsNull(operation_type)) {
        operation_type = NULL;
    }
    if (!operation_type) {
        goto end;
    }

    pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_e operation_typeVariable;
    
    if(!cJSON_IsString(operation_type))
    {
    goto end; //Enum
    }
    operation_typeVariable = targeting_template_update_request_operation_type_FromString(operation_type->valuestring);

    // targeting_template_update_request->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(targeting_template_update_requestJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }


    targeting_template_update_request_local_var = targeting_template_update_request_create_internal (
        operation_typeVariable,
        strdup(id->valuestring)
        );

    return targeting_template_update_request_local_var;
end:
    return NULL;

}
