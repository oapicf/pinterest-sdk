#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_tag_create.h"



static conversion_tag_create_t *conversion_tag_create_create_internal(
    int *aem_db_enabled,
    int *aem_enabled,
    int *aem_external_id_enabled,
    int *aem_fnln_enabled,
    int *aem_ge_enabled,
    int *aem_loc_enabled,
    int *aem_ph_enabled,
    double *md_frequency,
    char *name
    ) {
    conversion_tag_create_t *conversion_tag_create_local_var = malloc(sizeof(conversion_tag_create_t));
    if (!conversion_tag_create_local_var) {
        return NULL;
    }
    memset(conversion_tag_create_local_var, 0, sizeof(conversion_tag_create_t));
    conversion_tag_create_local_var->_library_owned = 1;
    conversion_tag_create_local_var->aem_db_enabled = aem_db_enabled;
    conversion_tag_create_local_var->aem_enabled = aem_enabled;
    conversion_tag_create_local_var->aem_external_id_enabled = aem_external_id_enabled;
    conversion_tag_create_local_var->aem_fnln_enabled = aem_fnln_enabled;
    conversion_tag_create_local_var->aem_ge_enabled = aem_ge_enabled;
    conversion_tag_create_local_var->aem_loc_enabled = aem_loc_enabled;
    conversion_tag_create_local_var->aem_ph_enabled = aem_ph_enabled;
    conversion_tag_create_local_var->md_frequency = md_frequency;
    conversion_tag_create_local_var->name = name;
    return conversion_tag_create_local_var;
}

__attribute__((deprecated)) conversion_tag_create_t *conversion_tag_create_create(
    int *aem_db_enabled,
    int *aem_enabled,
    int *aem_external_id_enabled,
    int *aem_fnln_enabled,
    int *aem_ge_enabled,
    int *aem_loc_enabled,
    int *aem_ph_enabled,
    double *md_frequency,
    char *name
    ) {
    int *aem_db_enabled_copy = NULL;
    if (aem_db_enabled) {
        aem_db_enabled_copy = malloc(sizeof(int));
        if (aem_db_enabled_copy) *aem_db_enabled_copy = *aem_db_enabled;
    }
    int *aem_enabled_copy = NULL;
    if (aem_enabled) {
        aem_enabled_copy = malloc(sizeof(int));
        if (aem_enabled_copy) *aem_enabled_copy = *aem_enabled;
    }
    int *aem_external_id_enabled_copy = NULL;
    if (aem_external_id_enabled) {
        aem_external_id_enabled_copy = malloc(sizeof(int));
        if (aem_external_id_enabled_copy) *aem_external_id_enabled_copy = *aem_external_id_enabled;
    }
    int *aem_fnln_enabled_copy = NULL;
    if (aem_fnln_enabled) {
        aem_fnln_enabled_copy = malloc(sizeof(int));
        if (aem_fnln_enabled_copy) *aem_fnln_enabled_copy = *aem_fnln_enabled;
    }
    int *aem_ge_enabled_copy = NULL;
    if (aem_ge_enabled) {
        aem_ge_enabled_copy = malloc(sizeof(int));
        if (aem_ge_enabled_copy) *aem_ge_enabled_copy = *aem_ge_enabled;
    }
    int *aem_loc_enabled_copy = NULL;
    if (aem_loc_enabled) {
        aem_loc_enabled_copy = malloc(sizeof(int));
        if (aem_loc_enabled_copy) *aem_loc_enabled_copy = *aem_loc_enabled;
    }
    int *aem_ph_enabled_copy = NULL;
    if (aem_ph_enabled) {
        aem_ph_enabled_copy = malloc(sizeof(int));
        if (aem_ph_enabled_copy) *aem_ph_enabled_copy = *aem_ph_enabled;
    }
    double *md_frequency_copy = NULL;
    if (md_frequency) {
        md_frequency_copy = malloc(sizeof(double));
        if (md_frequency_copy) *md_frequency_copy = *md_frequency;
    }
    conversion_tag_create_t *result = conversion_tag_create_create_internal (
        aem_db_enabled_copy,
        aem_enabled_copy,
        aem_external_id_enabled_copy,
        aem_fnln_enabled_copy,
        aem_ge_enabled_copy,
        aem_loc_enabled_copy,
        aem_ph_enabled_copy,
        md_frequency_copy,
        name
        );
    if (!result) {
        free(aem_db_enabled_copy);
        free(aem_enabled_copy);
        free(aem_external_id_enabled_copy);
        free(aem_fnln_enabled_copy);
        free(aem_ge_enabled_copy);
        free(aem_loc_enabled_copy);
        free(aem_ph_enabled_copy);
        free(md_frequency_copy);
    }
    return result;
}

void conversion_tag_create_free(conversion_tag_create_t *conversion_tag_create) {
    if(NULL == conversion_tag_create){
        return ;
    }
    if(conversion_tag_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_tag_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_tag_create->aem_db_enabled) {
        free(conversion_tag_create->aem_db_enabled);
        conversion_tag_create->aem_db_enabled = NULL;
    }
    if (conversion_tag_create->aem_enabled) {
        free(conversion_tag_create->aem_enabled);
        conversion_tag_create->aem_enabled = NULL;
    }
    if (conversion_tag_create->aem_external_id_enabled) {
        free(conversion_tag_create->aem_external_id_enabled);
        conversion_tag_create->aem_external_id_enabled = NULL;
    }
    if (conversion_tag_create->aem_fnln_enabled) {
        free(conversion_tag_create->aem_fnln_enabled);
        conversion_tag_create->aem_fnln_enabled = NULL;
    }
    if (conversion_tag_create->aem_ge_enabled) {
        free(conversion_tag_create->aem_ge_enabled);
        conversion_tag_create->aem_ge_enabled = NULL;
    }
    if (conversion_tag_create->aem_loc_enabled) {
        free(conversion_tag_create->aem_loc_enabled);
        conversion_tag_create->aem_loc_enabled = NULL;
    }
    if (conversion_tag_create->aem_ph_enabled) {
        free(conversion_tag_create->aem_ph_enabled);
        conversion_tag_create->aem_ph_enabled = NULL;
    }
    if (conversion_tag_create->md_frequency) {
        free(conversion_tag_create->md_frequency);
        conversion_tag_create->md_frequency = NULL;
    }
    if (conversion_tag_create->name) {
        free(conversion_tag_create->name);
        conversion_tag_create->name = NULL;
    }
    free(conversion_tag_create);
}

cJSON *conversion_tag_create_convertToJSON(conversion_tag_create_t *conversion_tag_create) {
    cJSON *item = cJSON_CreateObject();

    // conversion_tag_create->aem_db_enabled
    if(conversion_tag_create->aem_db_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_db_enabled", *conversion_tag_create->aem_db_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_create->aem_enabled
    if(conversion_tag_create->aem_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_enabled", *conversion_tag_create->aem_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_create->aem_external_id_enabled
    if(conversion_tag_create->aem_external_id_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_external_id_enabled", *conversion_tag_create->aem_external_id_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_create->aem_fnln_enabled
    if(conversion_tag_create->aem_fnln_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_fnln_enabled", *conversion_tag_create->aem_fnln_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_create->aem_ge_enabled
    if(conversion_tag_create->aem_ge_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_ge_enabled", *conversion_tag_create->aem_ge_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_create->aem_loc_enabled
    if(conversion_tag_create->aem_loc_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_loc_enabled", *conversion_tag_create->aem_loc_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_create->aem_ph_enabled
    if(conversion_tag_create->aem_ph_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_ph_enabled", *conversion_tag_create->aem_ph_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_create->md_frequency
    if(conversion_tag_create->md_frequency) {
    if(cJSON_AddNumberToObject(item, "md_frequency", *conversion_tag_create->md_frequency) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_tag_create->name
    if (!conversion_tag_create->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", conversion_tag_create->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_tag_create_t *conversion_tag_create_parseFromJSON(cJSON *conversion_tag_createJSON){

    conversion_tag_create_t *conversion_tag_create_local_var = NULL;

    // define the local variable for conversion_tag_create->aem_db_enabled
    int *aem_db_enabled_local_var = NULL;

    // define the local variable for conversion_tag_create->aem_enabled
    int *aem_enabled_local_var = NULL;

    // define the local variable for conversion_tag_create->aem_external_id_enabled
    int *aem_external_id_enabled_local_var = NULL;

    // define the local variable for conversion_tag_create->aem_fnln_enabled
    int *aem_fnln_enabled_local_var = NULL;

    // define the local variable for conversion_tag_create->aem_ge_enabled
    int *aem_ge_enabled_local_var = NULL;

    // define the local variable for conversion_tag_create->aem_loc_enabled
    int *aem_loc_enabled_local_var = NULL;

    // define the local variable for conversion_tag_create->aem_ph_enabled
    int *aem_ph_enabled_local_var = NULL;

    // define the local variable for conversion_tag_create->md_frequency
    double *md_frequency_local_var = NULL;

    char *name_local_str = NULL;

    // conversion_tag_create->aem_db_enabled
    cJSON *aem_db_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_db_enabled");
    if (cJSON_IsNull(aem_db_enabled)) {
        aem_db_enabled = NULL;
    }
    if (aem_db_enabled) { 
    if(!cJSON_IsBool(aem_db_enabled))
    {
    goto end; //Bool
    }
    aem_db_enabled_local_var = malloc(sizeof(int));
    if(!aem_db_enabled_local_var)
    {
        goto end;
    }
    *aem_db_enabled_local_var = aem_db_enabled->valueint;
    }

    // conversion_tag_create->aem_enabled
    cJSON *aem_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_enabled");
    if (cJSON_IsNull(aem_enabled)) {
        aem_enabled = NULL;
    }
    if (aem_enabled) { 
    if(!cJSON_IsBool(aem_enabled))
    {
    goto end; //Bool
    }
    aem_enabled_local_var = malloc(sizeof(int));
    if(!aem_enabled_local_var)
    {
        goto end;
    }
    *aem_enabled_local_var = aem_enabled->valueint;
    }

    // conversion_tag_create->aem_external_id_enabled
    cJSON *aem_external_id_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_external_id_enabled");
    if (cJSON_IsNull(aem_external_id_enabled)) {
        aem_external_id_enabled = NULL;
    }
    if (aem_external_id_enabled) { 
    if(!cJSON_IsBool(aem_external_id_enabled))
    {
    goto end; //Bool
    }
    aem_external_id_enabled_local_var = malloc(sizeof(int));
    if(!aem_external_id_enabled_local_var)
    {
        goto end;
    }
    *aem_external_id_enabled_local_var = aem_external_id_enabled->valueint;
    }

    // conversion_tag_create->aem_fnln_enabled
    cJSON *aem_fnln_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_fnln_enabled");
    if (cJSON_IsNull(aem_fnln_enabled)) {
        aem_fnln_enabled = NULL;
    }
    if (aem_fnln_enabled) { 
    if(!cJSON_IsBool(aem_fnln_enabled))
    {
    goto end; //Bool
    }
    aem_fnln_enabled_local_var = malloc(sizeof(int));
    if(!aem_fnln_enabled_local_var)
    {
        goto end;
    }
    *aem_fnln_enabled_local_var = aem_fnln_enabled->valueint;
    }

    // conversion_tag_create->aem_ge_enabled
    cJSON *aem_ge_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_ge_enabled");
    if (cJSON_IsNull(aem_ge_enabled)) {
        aem_ge_enabled = NULL;
    }
    if (aem_ge_enabled) { 
    if(!cJSON_IsBool(aem_ge_enabled))
    {
    goto end; //Bool
    }
    aem_ge_enabled_local_var = malloc(sizeof(int));
    if(!aem_ge_enabled_local_var)
    {
        goto end;
    }
    *aem_ge_enabled_local_var = aem_ge_enabled->valueint;
    }

    // conversion_tag_create->aem_loc_enabled
    cJSON *aem_loc_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_loc_enabled");
    if (cJSON_IsNull(aem_loc_enabled)) {
        aem_loc_enabled = NULL;
    }
    if (aem_loc_enabled) { 
    if(!cJSON_IsBool(aem_loc_enabled))
    {
    goto end; //Bool
    }
    aem_loc_enabled_local_var = malloc(sizeof(int));
    if(!aem_loc_enabled_local_var)
    {
        goto end;
    }
    *aem_loc_enabled_local_var = aem_loc_enabled->valueint;
    }

    // conversion_tag_create->aem_ph_enabled
    cJSON *aem_ph_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_ph_enabled");
    if (cJSON_IsNull(aem_ph_enabled)) {
        aem_ph_enabled = NULL;
    }
    if (aem_ph_enabled) { 
    if(!cJSON_IsBool(aem_ph_enabled))
    {
    goto end; //Bool
    }
    aem_ph_enabled_local_var = malloc(sizeof(int));
    if(!aem_ph_enabled_local_var)
    {
        goto end;
    }
    *aem_ph_enabled_local_var = aem_ph_enabled->valueint;
    }

    // conversion_tag_create->md_frequency
    cJSON *md_frequency = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "md_frequency");
    if (cJSON_IsNull(md_frequency)) {
        md_frequency = NULL;
    }
    if (md_frequency) { 
    if(!cJSON_IsNumber(md_frequency))
    {
    goto end; //Numeric
    }
    md_frequency_local_var = malloc(sizeof(double));
    if(!md_frequency_local_var)
    {
        goto end;
    }
    *md_frequency_local_var = md_frequency->valuedouble;
    }

    // conversion_tag_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    conversion_tag_create_local_var = conversion_tag_create_create_internal (
        aem_db_enabled_local_var,
        aem_enabled_local_var,
        aem_external_id_enabled_local_var,
        aem_fnln_enabled_local_var,
        aem_ge_enabled_local_var,
        aem_loc_enabled_local_var,
        aem_ph_enabled_local_var,
        md_frequency_local_var,
        name_local_str
        );

    if (!conversion_tag_create_local_var) {
        goto end;
    }

    return conversion_tag_create_local_var;
end:
    if (aem_db_enabled_local_var) {
        free(aem_db_enabled_local_var);
        aem_db_enabled_local_var = NULL;
    }
    if (aem_enabled_local_var) {
        free(aem_enabled_local_var);
        aem_enabled_local_var = NULL;
    }
    if (aem_external_id_enabled_local_var) {
        free(aem_external_id_enabled_local_var);
        aem_external_id_enabled_local_var = NULL;
    }
    if (aem_fnln_enabled_local_var) {
        free(aem_fnln_enabled_local_var);
        aem_fnln_enabled_local_var = NULL;
    }
    if (aem_ge_enabled_local_var) {
        free(aem_ge_enabled_local_var);
        aem_ge_enabled_local_var = NULL;
    }
    if (aem_loc_enabled_local_var) {
        free(aem_loc_enabled_local_var);
        aem_loc_enabled_local_var = NULL;
    }
    if (aem_ph_enabled_local_var) {
        free(aem_ph_enabled_local_var);
        aem_ph_enabled_local_var = NULL;
    }
    if (md_frequency_local_var) {
        free(md_frequency_local_var);
        md_frequency_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
