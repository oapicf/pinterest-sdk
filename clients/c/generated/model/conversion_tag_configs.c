#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_tag_configs.h"



static conversion_tag_configs_t *conversion_tag_configs_create_internal(
    int *aem_db_enabled,
    int *aem_enabled,
    int *aem_external_id_enabled,
    int *aem_fnln_enabled,
    int *aem_ge_enabled,
    int *aem_loc_enabled,
    int *aem_ph_enabled,
    double *md_frequency,
    list_t *no_code_capi_domains
    ) {
    conversion_tag_configs_t *conversion_tag_configs_local_var = malloc(sizeof(conversion_tag_configs_t));
    if (!conversion_tag_configs_local_var) {
        return NULL;
    }
    memset(conversion_tag_configs_local_var, 0, sizeof(conversion_tag_configs_t));
    conversion_tag_configs_local_var->_library_owned = 1;
    conversion_tag_configs_local_var->aem_db_enabled = aem_db_enabled;
    conversion_tag_configs_local_var->aem_enabled = aem_enabled;
    conversion_tag_configs_local_var->aem_external_id_enabled = aem_external_id_enabled;
    conversion_tag_configs_local_var->aem_fnln_enabled = aem_fnln_enabled;
    conversion_tag_configs_local_var->aem_ge_enabled = aem_ge_enabled;
    conversion_tag_configs_local_var->aem_loc_enabled = aem_loc_enabled;
    conversion_tag_configs_local_var->aem_ph_enabled = aem_ph_enabled;
    conversion_tag_configs_local_var->md_frequency = md_frequency;
    conversion_tag_configs_local_var->no_code_capi_domains = no_code_capi_domains;
    return conversion_tag_configs_local_var;
}

__attribute__((deprecated)) conversion_tag_configs_t *conversion_tag_configs_create(
    int *aem_db_enabled,
    int *aem_enabled,
    int *aem_external_id_enabled,
    int *aem_fnln_enabled,
    int *aem_ge_enabled,
    int *aem_loc_enabled,
    int *aem_ph_enabled,
    double *md_frequency,
    list_t *no_code_capi_domains
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
    conversion_tag_configs_t *result = conversion_tag_configs_create_internal (
        aem_db_enabled_copy,
        aem_enabled_copy,
        aem_external_id_enabled_copy,
        aem_fnln_enabled_copy,
        aem_ge_enabled_copy,
        aem_loc_enabled_copy,
        aem_ph_enabled_copy,
        md_frequency_copy,
        no_code_capi_domains
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

void conversion_tag_configs_free(conversion_tag_configs_t *conversion_tag_configs) {
    if(NULL == conversion_tag_configs){
        return ;
    }
    if(conversion_tag_configs->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_tag_configs_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_tag_configs->aem_db_enabled) {
        free(conversion_tag_configs->aem_db_enabled);
        conversion_tag_configs->aem_db_enabled = NULL;
    }
    if (conversion_tag_configs->aem_enabled) {
        free(conversion_tag_configs->aem_enabled);
        conversion_tag_configs->aem_enabled = NULL;
    }
    if (conversion_tag_configs->aem_external_id_enabled) {
        free(conversion_tag_configs->aem_external_id_enabled);
        conversion_tag_configs->aem_external_id_enabled = NULL;
    }
    if (conversion_tag_configs->aem_fnln_enabled) {
        free(conversion_tag_configs->aem_fnln_enabled);
        conversion_tag_configs->aem_fnln_enabled = NULL;
    }
    if (conversion_tag_configs->aem_ge_enabled) {
        free(conversion_tag_configs->aem_ge_enabled);
        conversion_tag_configs->aem_ge_enabled = NULL;
    }
    if (conversion_tag_configs->aem_loc_enabled) {
        free(conversion_tag_configs->aem_loc_enabled);
        conversion_tag_configs->aem_loc_enabled = NULL;
    }
    if (conversion_tag_configs->aem_ph_enabled) {
        free(conversion_tag_configs->aem_ph_enabled);
        conversion_tag_configs->aem_ph_enabled = NULL;
    }
    if (conversion_tag_configs->md_frequency) {
        free(conversion_tag_configs->md_frequency);
        conversion_tag_configs->md_frequency = NULL;
    }
    if (conversion_tag_configs->no_code_capi_domains) {
        list_ForEach(listEntry, conversion_tag_configs->no_code_capi_domains) {
            free(listEntry->data);
        }
        list_freeList(conversion_tag_configs->no_code_capi_domains);
        conversion_tag_configs->no_code_capi_domains = NULL;
    }
    free(conversion_tag_configs);
}

cJSON *conversion_tag_configs_convertToJSON(conversion_tag_configs_t *conversion_tag_configs) {
    cJSON *item = cJSON_CreateObject();

    // conversion_tag_configs->aem_db_enabled
    if(conversion_tag_configs->aem_db_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_db_enabled", *conversion_tag_configs->aem_db_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_configs->aem_enabled
    if(conversion_tag_configs->aem_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_enabled", *conversion_tag_configs->aem_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_configs->aem_external_id_enabled
    if(conversion_tag_configs->aem_external_id_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_external_id_enabled", *conversion_tag_configs->aem_external_id_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_configs->aem_fnln_enabled
    if(conversion_tag_configs->aem_fnln_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_fnln_enabled", *conversion_tag_configs->aem_fnln_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_configs->aem_ge_enabled
    if(conversion_tag_configs->aem_ge_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_ge_enabled", *conversion_tag_configs->aem_ge_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_configs->aem_loc_enabled
    if(conversion_tag_configs->aem_loc_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_loc_enabled", *conversion_tag_configs->aem_loc_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_configs->aem_ph_enabled
    if(conversion_tag_configs->aem_ph_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_ph_enabled", *conversion_tag_configs->aem_ph_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_configs->md_frequency
    if(conversion_tag_configs->md_frequency) {
    if(cJSON_AddNumberToObject(item, "md_frequency", *conversion_tag_configs->md_frequency) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_tag_configs->no_code_capi_domains
    if(conversion_tag_configs->no_code_capi_domains) {
    cJSON *no_code_capi_domains = cJSON_AddArrayToObject(item, "no_code_capi_domains");
    if(no_code_capi_domains == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *no_code_capi_domainsListEntry;
    list_ForEach(no_code_capi_domainsListEntry, conversion_tag_configs->no_code_capi_domains) {
    if(cJSON_AddStringToObject(no_code_capi_domains, "", no_code_capi_domainsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_tag_configs_t *conversion_tag_configs_parseFromJSON(cJSON *conversion_tag_configsJSON){

    conversion_tag_configs_t *conversion_tag_configs_local_var = NULL;

    // define the local variable for conversion_tag_configs->aem_db_enabled
    int *aem_db_enabled_local_var = NULL;

    // define the local variable for conversion_tag_configs->aem_enabled
    int *aem_enabled_local_var = NULL;

    // define the local variable for conversion_tag_configs->aem_external_id_enabled
    int *aem_external_id_enabled_local_var = NULL;

    // define the local variable for conversion_tag_configs->aem_fnln_enabled
    int *aem_fnln_enabled_local_var = NULL;

    // define the local variable for conversion_tag_configs->aem_ge_enabled
    int *aem_ge_enabled_local_var = NULL;

    // define the local variable for conversion_tag_configs->aem_loc_enabled
    int *aem_loc_enabled_local_var = NULL;

    // define the local variable for conversion_tag_configs->aem_ph_enabled
    int *aem_ph_enabled_local_var = NULL;

    // define the local variable for conversion_tag_configs->md_frequency
    double *md_frequency_local_var = NULL;

    // define the local list for conversion_tag_configs->no_code_capi_domains
    list_t *no_code_capi_domainsList = NULL;

    // conversion_tag_configs->aem_db_enabled
    cJSON *aem_db_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_db_enabled");
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

    // conversion_tag_configs->aem_enabled
    cJSON *aem_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_enabled");
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

    // conversion_tag_configs->aem_external_id_enabled
    cJSON *aem_external_id_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_external_id_enabled");
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

    // conversion_tag_configs->aem_fnln_enabled
    cJSON *aem_fnln_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_fnln_enabled");
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

    // conversion_tag_configs->aem_ge_enabled
    cJSON *aem_ge_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_ge_enabled");
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

    // conversion_tag_configs->aem_loc_enabled
    cJSON *aem_loc_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_loc_enabled");
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

    // conversion_tag_configs->aem_ph_enabled
    cJSON *aem_ph_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_ph_enabled");
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

    // conversion_tag_configs->md_frequency
    cJSON *md_frequency = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "md_frequency");
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

    // conversion_tag_configs->no_code_capi_domains
    cJSON *no_code_capi_domains = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "no_code_capi_domains");
    if (cJSON_IsNull(no_code_capi_domains)) {
        no_code_capi_domains = NULL;
    }
    if (no_code_capi_domains) { 
    cJSON *no_code_capi_domains_local = NULL;
    if(!cJSON_IsArray(no_code_capi_domains)) {
        goto end;//primitive container
    }
    no_code_capi_domainsList = list_createList();

    cJSON_ArrayForEach(no_code_capi_domains_local, no_code_capi_domains)
    {
        if(!cJSON_IsString(no_code_capi_domains_local))
        {
            goto end;
        }
        list_addElement(no_code_capi_domainsList , strdup(no_code_capi_domains_local->valuestring));
    }
    }



    conversion_tag_configs_local_var = conversion_tag_configs_create_internal (
        aem_db_enabled_local_var,
        aem_enabled_local_var,
        aem_external_id_enabled_local_var,
        aem_fnln_enabled_local_var,
        aem_ge_enabled_local_var,
        aem_loc_enabled_local_var,
        aem_ph_enabled_local_var,
        md_frequency_local_var,
        no_code_capi_domains ? no_code_capi_domainsList : NULL
        );

    if (!conversion_tag_configs_local_var) {
        goto end;
    }

    return conversion_tag_configs_local_var;
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
    if (no_code_capi_domainsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, no_code_capi_domainsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(no_code_capi_domainsList);
        no_code_capi_domainsList = NULL;
    }
    return NULL;

}
