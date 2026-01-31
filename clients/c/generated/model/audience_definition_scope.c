#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_definition_scope.h"


char* audience_definition_scope_scope_ToString(pinterest_rest_api_audience_definition_scope_SCOPE_e scope) {
    char* scopeArray[] =  { "NULL", "PARTNER", "PINTEREST" };
    return scopeArray[scope];
}

pinterest_rest_api_audience_definition_scope_SCOPE_e audience_definition_scope_scope_FromString(char* scope){
    int stringToReturn = 0;
    char *scopeArray[] =  { "NULL", "PARTNER", "PINTEREST" };
    size_t sizeofArray = sizeof(scopeArray) / sizeof(scopeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(scope, scopeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static audience_definition_scope_t *audience_definition_scope_create_internal(
    pinterest_rest_api_audience_definition_scope_SCOPE_e scope
    ) {
    audience_definition_scope_t *audience_definition_scope_local_var = malloc(sizeof(audience_definition_scope_t));
    if (!audience_definition_scope_local_var) {
        return NULL;
    }
    audience_definition_scope_local_var->scope = scope;

    audience_definition_scope_local_var->_library_owned = 1;
    return audience_definition_scope_local_var;
}

__attribute__((deprecated)) audience_definition_scope_t *audience_definition_scope_create(
    pinterest_rest_api_audience_definition_scope_SCOPE_e scope
    ) {
    return audience_definition_scope_create_internal (
        scope
        );
}

void audience_definition_scope_free(audience_definition_scope_t *audience_definition_scope) {
    if(NULL == audience_definition_scope){
        return ;
    }
    if(audience_definition_scope->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audience_definition_scope_free");
        return ;
    }
    listEntry_t *listEntry;
    free(audience_definition_scope);
}

cJSON *audience_definition_scope_convertToJSON(audience_definition_scope_t *audience_definition_scope) {
    cJSON *item = cJSON_CreateObject();

    // audience_definition_scope->scope
    if(audience_definition_scope->scope != pinterest_rest_api_audience_definition_scope_SCOPE_NULL) {
    if(cJSON_AddStringToObject(item, "scope", audience_definition_scope_scope_ToString(audience_definition_scope->scope)) == NULL)
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

audience_definition_scope_t *audience_definition_scope_parseFromJSON(cJSON *audience_definition_scopeJSON){

    audience_definition_scope_t *audience_definition_scope_local_var = NULL;

    // audience_definition_scope->scope
    cJSON *scope = cJSON_GetObjectItemCaseSensitive(audience_definition_scopeJSON, "scope");
    if (cJSON_IsNull(scope)) {
        scope = NULL;
    }
    pinterest_rest_api_audience_definition_scope_SCOPE_e scopeVariable;
    if (scope) { 
    if(!cJSON_IsString(scope))
    {
    goto end; //Enum
    }
    scopeVariable = audience_definition_scope_scope_FromString(scope->valuestring);
    }


    audience_definition_scope_local_var = audience_definition_scope_create_internal (
        scope ? scopeVariable : pinterest_rest_api_audience_definition_scope_SCOPE_NULL
        );

    return audience_definition_scope_local_var;
end:
    return NULL;

}
