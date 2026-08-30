#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_demographic_value.h"



static audience_demographic_value_t *audience_demographic_value_create_internal(
    char *key,
    char *name,
    double *ratio
    ) {
    audience_demographic_value_t *audience_demographic_value_local_var = malloc(sizeof(audience_demographic_value_t));
    if (!audience_demographic_value_local_var) {
        return NULL;
    }
    memset(audience_demographic_value_local_var, 0, sizeof(audience_demographic_value_t));
    audience_demographic_value_local_var->_library_owned = 1;
    audience_demographic_value_local_var->key = key;
    audience_demographic_value_local_var->name = name;
    audience_demographic_value_local_var->ratio = ratio;
    return audience_demographic_value_local_var;
}

__attribute__((deprecated)) audience_demographic_value_t *audience_demographic_value_create(
    char *key,
    char *name,
    double *ratio
    ) {
    double *ratio_copy = NULL;
    if (ratio) {
        ratio_copy = malloc(sizeof(double));
        if (ratio_copy) *ratio_copy = *ratio;
    }
    audience_demographic_value_t *result = audience_demographic_value_create_internal (
        key,
        name,
        ratio_copy
        );
    if (!result) {
        free(ratio_copy);
    }
    return result;
}

void audience_demographic_value_free(audience_demographic_value_t *audience_demographic_value) {
    if(NULL == audience_demographic_value){
        return ;
    }
    if(audience_demographic_value->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audience_demographic_value_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audience_demographic_value->key) {
        free(audience_demographic_value->key);
        audience_demographic_value->key = NULL;
    }
    if (audience_demographic_value->name) {
        free(audience_demographic_value->name);
        audience_demographic_value->name = NULL;
    }
    if (audience_demographic_value->ratio) {
        free(audience_demographic_value->ratio);
        audience_demographic_value->ratio = NULL;
    }
    free(audience_demographic_value);
}

cJSON *audience_demographic_value_convertToJSON(audience_demographic_value_t *audience_demographic_value) {
    cJSON *item = cJSON_CreateObject();

    // audience_demographic_value->key
    if(audience_demographic_value->key) {
    if(cJSON_AddStringToObject(item, "key", audience_demographic_value->key) == NULL) {
    goto fail; //String
    }
    }


    // audience_demographic_value->name
    if(audience_demographic_value->name) {
    if(cJSON_AddStringToObject(item, "name", audience_demographic_value->name) == NULL) {
    goto fail; //String
    }
    }


    // audience_demographic_value->ratio
    if(audience_demographic_value->ratio) {
    if(cJSON_AddNumberToObject(item, "ratio", *audience_demographic_value->ratio) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audience_demographic_value_t *audience_demographic_value_parseFromJSON(cJSON *audience_demographic_valueJSON){

    audience_demographic_value_t *audience_demographic_value_local_var = NULL;

    char *key_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for audience_demographic_value->ratio
    double *ratio_local_var = NULL;

    // audience_demographic_value->key
    cJSON *key = cJSON_GetObjectItemCaseSensitive(audience_demographic_valueJSON, "key");
    if (cJSON_IsNull(key)) {
        key = NULL;
    }
    if (key) { 
    if(!cJSON_IsString(key) && !cJSON_IsNull(key))
    {
    goto end; //String
    }
    }

    // audience_demographic_value->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audience_demographic_valueJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // audience_demographic_value->ratio
    cJSON *ratio = cJSON_GetObjectItemCaseSensitive(audience_demographic_valueJSON, "ratio");
    if (cJSON_IsNull(ratio)) {
        ratio = NULL;
    }
    if (ratio) { 
    if(!cJSON_IsNumber(ratio))
    {
    goto end; //Numeric
    }
    ratio_local_var = malloc(sizeof(double));
    if(!ratio_local_var)
    {
        goto end;
    }
    *ratio_local_var = ratio->valuedouble;
    }


    if (key && !cJSON_IsNull(key)) key_local_str = strdup(key->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    audience_demographic_value_local_var = audience_demographic_value_create_internal (
        key_local_str,
        name_local_str,
        ratio_local_var
        );

    if (!audience_demographic_value_local_var) {
        goto end;
    }

    return audience_demographic_value_local_var;
end:
    if (key_local_str) {
        free(key_local_str);
        key_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (ratio_local_var) {
        free(ratio_local_var);
        ratio_local_var = NULL;
    }
    return NULL;

}
