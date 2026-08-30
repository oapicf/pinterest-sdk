#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_definition.h"



static audience_definition_t *audience_definition_create_internal(
    char *date,
    char *scope,
    char *type
    ) {
    audience_definition_t *audience_definition_local_var = malloc(sizeof(audience_definition_t));
    if (!audience_definition_local_var) {
        return NULL;
    }
    memset(audience_definition_local_var, 0, sizeof(audience_definition_t));
    audience_definition_local_var->_library_owned = 1;
    audience_definition_local_var->date = date;
    audience_definition_local_var->scope = scope;
    audience_definition_local_var->type = type;
    return audience_definition_local_var;
}

__attribute__((deprecated)) audience_definition_t *audience_definition_create(
    char *date,
    char *scope,
    char *type
    ) {
    audience_definition_t *result = audience_definition_create_internal (
        date,
        scope,
        type
        );
    if (!result) {
    }
    return result;
}

void audience_definition_free(audience_definition_t *audience_definition) {
    if(NULL == audience_definition){
        return ;
    }
    if(audience_definition->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audience_definition_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audience_definition->date) {
        free(audience_definition->date);
        audience_definition->date = NULL;
    }
    if (audience_definition->scope) {
        free(audience_definition->scope);
        audience_definition->scope = NULL;
    }
    if (audience_definition->type) {
        free(audience_definition->type);
        audience_definition->type = NULL;
    }
    free(audience_definition);
}

cJSON *audience_definition_convertToJSON(audience_definition_t *audience_definition) {
    cJSON *item = cJSON_CreateObject();

    // audience_definition->date
    if(audience_definition->date) {
    if(cJSON_AddStringToObject(item, "date", audience_definition->date) == NULL) {
    goto fail; //String
    }
    }


    // audience_definition->scope
    if(audience_definition->scope) {
    if(cJSON_AddStringToObject(item, "scope", audience_definition->scope) == NULL) {
    goto fail; //String
    }
    }


    // audience_definition->type
    if(audience_definition->type) {
    if(cJSON_AddStringToObject(item, "type", audience_definition->type) == NULL) {
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

audience_definition_t *audience_definition_parseFromJSON(cJSON *audience_definitionJSON){

    audience_definition_t *audience_definition_local_var = NULL;

    char *date_local_str = NULL;

    char *scope_local_str = NULL;

    char *type_local_str = NULL;

    // audience_definition->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(audience_definitionJSON, "date");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date) && !cJSON_IsNull(date))
    {
    goto end; //String
    }
    }

    // audience_definition->scope
    cJSON *scope = cJSON_GetObjectItemCaseSensitive(audience_definitionJSON, "scope");
    if (cJSON_IsNull(scope)) {
        scope = NULL;
    }
    if (scope) { 
    if(!cJSON_IsString(scope) && !cJSON_IsNull(scope))
    {
    goto end; //String
    }
    }

    // audience_definition->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(audience_definitionJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }


    if (date && !cJSON_IsNull(date)) date_local_str = strdup(date->valuestring);
    if (scope && !cJSON_IsNull(scope)) scope_local_str = strdup(scope->valuestring);
    if (type && !cJSON_IsNull(type)) type_local_str = strdup(type->valuestring);

    audience_definition_local_var = audience_definition_create_internal (
        date_local_str,
        scope_local_str,
        type_local_str
        );

    if (!audience_definition_local_var) {
        goto end;
    }

    return audience_definition_local_var;
end:
    if (date_local_str) {
        free(date_local_str);
        date_local_str = NULL;
    }
    if (scope_local_str) {
        free(scope_local_str);
        scope_local_str = NULL;
    }
    if (type_local_str) {
        free(type_local_str);
        type_local_str = NULL;
    }
    return NULL;

}
