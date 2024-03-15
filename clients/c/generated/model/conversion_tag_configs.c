#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_tag_configs.h"



conversion_tag_configs_t *conversion_tag_configs_create(
    int aem_enabled,
    double md_frequency,
    int aem_fnln_enabled,
    int aem_ph_enabled,
    int aem_ge_enabled,
    int aem_db_enabled,
    int aem_loc_enabled
    ) {
    conversion_tag_configs_t *conversion_tag_configs_local_var = malloc(sizeof(conversion_tag_configs_t));
    if (!conversion_tag_configs_local_var) {
        return NULL;
    }
    conversion_tag_configs_local_var->aem_enabled = aem_enabled;
    conversion_tag_configs_local_var->md_frequency = md_frequency;
    conversion_tag_configs_local_var->aem_fnln_enabled = aem_fnln_enabled;
    conversion_tag_configs_local_var->aem_ph_enabled = aem_ph_enabled;
    conversion_tag_configs_local_var->aem_ge_enabled = aem_ge_enabled;
    conversion_tag_configs_local_var->aem_db_enabled = aem_db_enabled;
    conversion_tag_configs_local_var->aem_loc_enabled = aem_loc_enabled;

    return conversion_tag_configs_local_var;
}


void conversion_tag_configs_free(conversion_tag_configs_t *conversion_tag_configs) {
    if(NULL == conversion_tag_configs){
        return ;
    }
    listEntry_t *listEntry;
    free(conversion_tag_configs);
}

cJSON *conversion_tag_configs_convertToJSON(conversion_tag_configs_t *conversion_tag_configs) {
    cJSON *item = cJSON_CreateObject();

    // conversion_tag_configs->aem_enabled
    if(conversion_tag_configs->aem_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_enabled", conversion_tag_configs->aem_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_configs->md_frequency
    if(conversion_tag_configs->md_frequency) {
    if(cJSON_AddNumberToObject(item, "md_frequency", conversion_tag_configs->md_frequency) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_tag_configs->aem_fnln_enabled
    if(conversion_tag_configs->aem_fnln_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_fnln_enabled", conversion_tag_configs->aem_fnln_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_configs->aem_ph_enabled
    if(conversion_tag_configs->aem_ph_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_ph_enabled", conversion_tag_configs->aem_ph_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_configs->aem_ge_enabled
    if(conversion_tag_configs->aem_ge_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_ge_enabled", conversion_tag_configs->aem_ge_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_configs->aem_db_enabled
    if(conversion_tag_configs->aem_db_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_db_enabled", conversion_tag_configs->aem_db_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_configs->aem_loc_enabled
    if(conversion_tag_configs->aem_loc_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_loc_enabled", conversion_tag_configs->aem_loc_enabled) == NULL) {
    goto fail; //Bool
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

    // conversion_tag_configs->aem_enabled
    cJSON *aem_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_enabled");
    if (aem_enabled) { 
    if(!cJSON_IsBool(aem_enabled))
    {
    goto end; //Bool
    }
    }

    // conversion_tag_configs->md_frequency
    cJSON *md_frequency = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "md_frequency");
    if (md_frequency) { 
    if(!cJSON_IsNumber(md_frequency))
    {
    goto end; //Numeric
    }
    }

    // conversion_tag_configs->aem_fnln_enabled
    cJSON *aem_fnln_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_fnln_enabled");
    if (aem_fnln_enabled) { 
    if(!cJSON_IsBool(aem_fnln_enabled))
    {
    goto end; //Bool
    }
    }

    // conversion_tag_configs->aem_ph_enabled
    cJSON *aem_ph_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_ph_enabled");
    if (aem_ph_enabled) { 
    if(!cJSON_IsBool(aem_ph_enabled))
    {
    goto end; //Bool
    }
    }

    // conversion_tag_configs->aem_ge_enabled
    cJSON *aem_ge_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_ge_enabled");
    if (aem_ge_enabled) { 
    if(!cJSON_IsBool(aem_ge_enabled))
    {
    goto end; //Bool
    }
    }

    // conversion_tag_configs->aem_db_enabled
    cJSON *aem_db_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_db_enabled");
    if (aem_db_enabled) { 
    if(!cJSON_IsBool(aem_db_enabled))
    {
    goto end; //Bool
    }
    }

    // conversion_tag_configs->aem_loc_enabled
    cJSON *aem_loc_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_configsJSON, "aem_loc_enabled");
    if (aem_loc_enabled) { 
    if(!cJSON_IsBool(aem_loc_enabled))
    {
    goto end; //Bool
    }
    }


    conversion_tag_configs_local_var = conversion_tag_configs_create (
        aem_enabled ? aem_enabled->valueint : 0,
        md_frequency ? md_frequency->valuedouble : 0,
        aem_fnln_enabled ? aem_fnln_enabled->valueint : 0,
        aem_ph_enabled ? aem_ph_enabled->valueint : 0,
        aem_ge_enabled ? aem_ge_enabled->valueint : 0,
        aem_db_enabled ? aem_db_enabled->valueint : 0,
        aem_loc_enabled ? aem_loc_enabled->valueint : 0
        );

    return conversion_tag_configs_local_var;
end:
    return NULL;

}
