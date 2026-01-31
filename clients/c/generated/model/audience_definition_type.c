#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_definition_type.h"


char* audience_definition_type_scope_ToString(pinterest_rest_api_audience_definition_type_SCOPE_e scope) {
    char* scopeArray[] =  { "NULL", "IMPRESSION_PLUS_ENGAGEMENT", "ENGAGEMENT" };
    return scopeArray[scope];
}

pinterest_rest_api_audience_definition_type_SCOPE_e audience_definition_type_scope_FromString(char* scope){
    int stringToReturn = 0;
    char *scopeArray[] =  { "NULL", "IMPRESSION_PLUS_ENGAGEMENT", "ENGAGEMENT" };
    size_t sizeofArray = sizeof(scopeArray) / sizeof(scopeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(scope, scopeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static audience_definition_type_t *audience_definition_type_create_internal(
    pinterest_rest_api_audience_definition_type_SCOPE_e scope
    ) {
    audience_definition_type_t *audience_definition_type_local_var = malloc(sizeof(audience_definition_type_t));
    if (!audience_definition_type_local_var) {
        return NULL;
    }
    audience_definition_type_local_var->scope = scope;

    audience_definition_type_local_var->_library_owned = 1;
    return audience_definition_type_local_var;
}

__attribute__((deprecated)) audience_definition_type_t *audience_definition_type_create(
    pinterest_rest_api_audience_definition_type_SCOPE_e scope
    ) {
    return audience_definition_type_create_internal (
        scope
        );
}

void audience_definition_type_free(audience_definition_type_t *audience_definition_type) {
    if(NULL == audience_definition_type){
        return ;
    }
    if(audience_definition_type->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audience_definition_type_free");
        return ;
    }
    listEntry_t *listEntry;
    free(audience_definition_type);
}

cJSON *audience_definition_type_convertToJSON(audience_definition_type_t *audience_definition_type) {
    cJSON *item = cJSON_CreateObject();

    // audience_definition_type->scope
    if(audience_definition_type->scope != pinterest_rest_api_audience_definition_type_SCOPE_NULL) {
    if(cJSON_AddStringToObject(item, "scope", audience_definition_type_scope_ToString(audience_definition_type->scope)) == NULL)
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

audience_definition_type_t *audience_definition_type_parseFromJSON(cJSON *audience_definition_typeJSON){

    audience_definition_type_t *audience_definition_type_local_var = NULL;

    // audience_definition_type->scope
    cJSON *scope = cJSON_GetObjectItemCaseSensitive(audience_definition_typeJSON, "scope");
    if (cJSON_IsNull(scope)) {
        scope = NULL;
    }
    pinterest_rest_api_audience_definition_type_SCOPE_e scopeVariable;
    if (scope) { 
    if(!cJSON_IsString(scope))
    {
    goto end; //Enum
    }
    scopeVariable = audience_definition_type_scope_FromString(scope->valuestring);
    }


    audience_definition_type_local_var = audience_definition_type_create_internal (
        scope ? scopeVariable : pinterest_rest_api_audience_definition_type_SCOPE_NULL
        );

    return audience_definition_type_local_var;
end:
    return NULL;

}
