#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_tag_create.h"



conversion_tag_create_t *conversion_tag_create_create(
    char *name,
    int aem_enabled,
    double md_frequency,
    int aem_fnln_enabled,
    int aem_ph_enabled,
    int aem_ge_enabled,
    int aem_db_enabled,
    int aem_loc_enabled
    ) {
    conversion_tag_create_t *conversion_tag_create_local_var = malloc(sizeof(conversion_tag_create_t));
    if (!conversion_tag_create_local_var) {
        return NULL;
    }
    conversion_tag_create_local_var->name = name;
    conversion_tag_create_local_var->aem_enabled = aem_enabled;
    conversion_tag_create_local_var->md_frequency = md_frequency;
    conversion_tag_create_local_var->aem_fnln_enabled = aem_fnln_enabled;
    conversion_tag_create_local_var->aem_ph_enabled = aem_ph_enabled;
    conversion_tag_create_local_var->aem_ge_enabled = aem_ge_enabled;
    conversion_tag_create_local_var->aem_db_enabled = aem_db_enabled;
    conversion_tag_create_local_var->aem_loc_enabled = aem_loc_enabled;

    return conversion_tag_create_local_var;
}


void conversion_tag_create_free(conversion_tag_create_t *conversion_tag_create) {
    if(NULL == conversion_tag_create){
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_tag_create->name) {
        free(conversion_tag_create->name);
        conversion_tag_create->name = NULL;
    }
    free(conversion_tag_create);
}

cJSON *conversion_tag_create_convertToJSON(conversion_tag_create_t *conversion_tag_create) {
    cJSON *item = cJSON_CreateObject();

    // conversion_tag_create->name
    if (!conversion_tag_create->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", conversion_tag_create->name) == NULL) {
    goto fail; //String
    }


    // conversion_tag_create->aem_enabled
    if(conversion_tag_create->aem_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_enabled", conversion_tag_create->aem_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_create->md_frequency
    if(conversion_tag_create->md_frequency) {
    if(cJSON_AddNumberToObject(item, "md_frequency", conversion_tag_create->md_frequency) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_tag_create->aem_fnln_enabled
    if(conversion_tag_create->aem_fnln_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_fnln_enabled", conversion_tag_create->aem_fnln_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_create->aem_ph_enabled
    if(conversion_tag_create->aem_ph_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_ph_enabled", conversion_tag_create->aem_ph_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_create->aem_ge_enabled
    if(conversion_tag_create->aem_ge_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_ge_enabled", conversion_tag_create->aem_ge_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_create->aem_db_enabled
    if(conversion_tag_create->aem_db_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_db_enabled", conversion_tag_create->aem_db_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_create->aem_loc_enabled
    if(conversion_tag_create->aem_loc_enabled) {
    if(cJSON_AddBoolToObject(item, "aem_loc_enabled", conversion_tag_create->aem_loc_enabled) == NULL) {
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

conversion_tag_create_t *conversion_tag_create_parseFromJSON(cJSON *conversion_tag_createJSON){

    conversion_tag_create_t *conversion_tag_create_local_var = NULL;

    // conversion_tag_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // conversion_tag_create->aem_enabled
    cJSON *aem_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_enabled");
    if (aem_enabled) { 
    if(!cJSON_IsBool(aem_enabled))
    {
    goto end; //Bool
    }
    }

    // conversion_tag_create->md_frequency
    cJSON *md_frequency = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "md_frequency");
    if (md_frequency) { 
    if(!cJSON_IsNumber(md_frequency))
    {
    goto end; //Numeric
    }
    }

    // conversion_tag_create->aem_fnln_enabled
    cJSON *aem_fnln_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_fnln_enabled");
    if (aem_fnln_enabled) { 
    if(!cJSON_IsBool(aem_fnln_enabled))
    {
    goto end; //Bool
    }
    }

    // conversion_tag_create->aem_ph_enabled
    cJSON *aem_ph_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_ph_enabled");
    if (aem_ph_enabled) { 
    if(!cJSON_IsBool(aem_ph_enabled))
    {
    goto end; //Bool
    }
    }

    // conversion_tag_create->aem_ge_enabled
    cJSON *aem_ge_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_ge_enabled");
    if (aem_ge_enabled) { 
    if(!cJSON_IsBool(aem_ge_enabled))
    {
    goto end; //Bool
    }
    }

    // conversion_tag_create->aem_db_enabled
    cJSON *aem_db_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_db_enabled");
    if (aem_db_enabled) { 
    if(!cJSON_IsBool(aem_db_enabled))
    {
    goto end; //Bool
    }
    }

    // conversion_tag_create->aem_loc_enabled
    cJSON *aem_loc_enabled = cJSON_GetObjectItemCaseSensitive(conversion_tag_createJSON, "aem_loc_enabled");
    if (aem_loc_enabled) { 
    if(!cJSON_IsBool(aem_loc_enabled))
    {
    goto end; //Bool
    }
    }


    conversion_tag_create_local_var = conversion_tag_create_create (
        strdup(name->valuestring),
        aem_enabled ? aem_enabled->valueint : 0,
        md_frequency ? md_frequency->valuedouble : 0,
        aem_fnln_enabled ? aem_fnln_enabled->valueint : 0,
        aem_ph_enabled ? aem_ph_enabled->valueint : 0,
        aem_ge_enabled ? aem_ge_enabled->valueint : 0,
        aem_db_enabled ? aem_db_enabled->valueint : 0,
        aem_loc_enabled ? aem_loc_enabled->valueint : 0
        );

    return conversion_tag_create_local_var;
end:
    return NULL;

}
