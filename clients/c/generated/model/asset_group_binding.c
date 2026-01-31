#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_group_binding.h"



static asset_group_binding_t *asset_group_binding_create_internal(
    list_t *ad_accounts_ids,
    char *asset_group_description,
    char *asset_group_name,
    list_t *asset_group_types,
    list_t *catalogs_ids,
    business_access_user_summary_t *created_by,
    int created_time,
    char *id,
    business_access_user_summary_t *owner,
    list_t *profiles_ids,
    int updated_time
    ) {
    asset_group_binding_t *asset_group_binding_local_var = malloc(sizeof(asset_group_binding_t));
    if (!asset_group_binding_local_var) {
        return NULL;
    }
    asset_group_binding_local_var->ad_accounts_ids = ad_accounts_ids;
    asset_group_binding_local_var->asset_group_description = asset_group_description;
    asset_group_binding_local_var->asset_group_name = asset_group_name;
    asset_group_binding_local_var->asset_group_types = asset_group_types;
    asset_group_binding_local_var->catalogs_ids = catalogs_ids;
    asset_group_binding_local_var->created_by = created_by;
    asset_group_binding_local_var->created_time = created_time;
    asset_group_binding_local_var->id = id;
    asset_group_binding_local_var->owner = owner;
    asset_group_binding_local_var->profiles_ids = profiles_ids;
    asset_group_binding_local_var->updated_time = updated_time;

    asset_group_binding_local_var->_library_owned = 1;
    return asset_group_binding_local_var;
}

__attribute__((deprecated)) asset_group_binding_t *asset_group_binding_create(
    list_t *ad_accounts_ids,
    char *asset_group_description,
    char *asset_group_name,
    list_t *asset_group_types,
    list_t *catalogs_ids,
    business_access_user_summary_t *created_by,
    int created_time,
    char *id,
    business_access_user_summary_t *owner,
    list_t *profiles_ids,
    int updated_time
    ) {
    return asset_group_binding_create_internal (
        ad_accounts_ids,
        asset_group_description,
        asset_group_name,
        asset_group_types,
        catalogs_ids,
        created_by,
        created_time,
        id,
        owner,
        profiles_ids,
        updated_time
        );
}

void asset_group_binding_free(asset_group_binding_t *asset_group_binding) {
    if(NULL == asset_group_binding){
        return ;
    }
    if(asset_group_binding->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "asset_group_binding_free");
        return ;
    }
    listEntry_t *listEntry;
    if (asset_group_binding->ad_accounts_ids) {
        list_ForEach(listEntry, asset_group_binding->ad_accounts_ids) {
            free(listEntry->data);
        }
        list_freeList(asset_group_binding->ad_accounts_ids);
        asset_group_binding->ad_accounts_ids = NULL;
    }
    if (asset_group_binding->asset_group_description) {
        free(asset_group_binding->asset_group_description);
        asset_group_binding->asset_group_description = NULL;
    }
    if (asset_group_binding->asset_group_name) {
        free(asset_group_binding->asset_group_name);
        asset_group_binding->asset_group_name = NULL;
    }
    if (asset_group_binding->asset_group_types) {
        list_ForEach(listEntry, asset_group_binding->asset_group_types) {
            free(listEntry->data);
        }
        list_freeList(asset_group_binding->asset_group_types);
        asset_group_binding->asset_group_types = NULL;
    }
    if (asset_group_binding->catalogs_ids) {
        list_ForEach(listEntry, asset_group_binding->catalogs_ids) {
            free(listEntry->data);
        }
        list_freeList(asset_group_binding->catalogs_ids);
        asset_group_binding->catalogs_ids = NULL;
    }
    if (asset_group_binding->created_by) {
        business_access_user_summary_free(asset_group_binding->created_by);
        asset_group_binding->created_by = NULL;
    }
    if (asset_group_binding->id) {
        free(asset_group_binding->id);
        asset_group_binding->id = NULL;
    }
    if (asset_group_binding->owner) {
        business_access_user_summary_free(asset_group_binding->owner);
        asset_group_binding->owner = NULL;
    }
    if (asset_group_binding->profiles_ids) {
        list_ForEach(listEntry, asset_group_binding->profiles_ids) {
            free(listEntry->data);
        }
        list_freeList(asset_group_binding->profiles_ids);
        asset_group_binding->profiles_ids = NULL;
    }
    free(asset_group_binding);
}

cJSON *asset_group_binding_convertToJSON(asset_group_binding_t *asset_group_binding) {
    cJSON *item = cJSON_CreateObject();

    // asset_group_binding->ad_accounts_ids
    if(asset_group_binding->ad_accounts_ids) {
    cJSON *ad_accounts_ids = cJSON_AddArrayToObject(item, "ad_accounts_ids");
    if(ad_accounts_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *ad_accounts_idsListEntry;
    list_ForEach(ad_accounts_idsListEntry, asset_group_binding->ad_accounts_ids) {
    if(cJSON_AddStringToObject(ad_accounts_ids, "", ad_accounts_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // asset_group_binding->asset_group_description
    if(asset_group_binding->asset_group_description) {
    if(cJSON_AddStringToObject(item, "asset_group_description", asset_group_binding->asset_group_description) == NULL) {
    goto fail; //String
    }
    }


    // asset_group_binding->asset_group_name
    if(asset_group_binding->asset_group_name) {
    if(cJSON_AddStringToObject(item, "asset_group_name", asset_group_binding->asset_group_name) == NULL) {
    goto fail; //String
    }
    }


    // asset_group_binding->asset_group_types
    if(asset_group_binding->asset_group_types) {
    cJSON *asset_group_types = cJSON_AddArrayToObject(item, "asset_group_types");
    if(asset_group_types == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *asset_group_typesListEntry;
    list_ForEach(asset_group_typesListEntry, asset_group_binding->asset_group_types) {
    if(cJSON_AddStringToObject(asset_group_types, "", asset_group_typesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // asset_group_binding->catalogs_ids
    if(asset_group_binding->catalogs_ids) {
    cJSON *catalogs_ids = cJSON_AddArrayToObject(item, "catalogs_ids");
    if(catalogs_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *catalogs_idsListEntry;
    list_ForEach(catalogs_idsListEntry, asset_group_binding->catalogs_ids) {
    if(cJSON_AddStringToObject(catalogs_ids, "", catalogs_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // asset_group_binding->created_by
    if(asset_group_binding->created_by) {
    cJSON *created_by_local_JSON = business_access_user_summary_convertToJSON(asset_group_binding->created_by);
    if(created_by_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "created_by", created_by_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // asset_group_binding->created_time
    if(asset_group_binding->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", asset_group_binding->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // asset_group_binding->id
    if(asset_group_binding->id) {
    if(cJSON_AddStringToObject(item, "id", asset_group_binding->id) == NULL) {
    goto fail; //String
    }
    }


    // asset_group_binding->owner
    if(asset_group_binding->owner) {
    cJSON *owner_local_JSON = business_access_user_summary_convertToJSON(asset_group_binding->owner);
    if(owner_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "owner", owner_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // asset_group_binding->profiles_ids
    if(asset_group_binding->profiles_ids) {
    cJSON *profiles_ids = cJSON_AddArrayToObject(item, "profiles_ids");
    if(profiles_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *profiles_idsListEntry;
    list_ForEach(profiles_idsListEntry, asset_group_binding->profiles_ids) {
    if(cJSON_AddStringToObject(profiles_ids, "", profiles_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // asset_group_binding->updated_time
    if(asset_group_binding->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", asset_group_binding->updated_time) == NULL) {
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

asset_group_binding_t *asset_group_binding_parseFromJSON(cJSON *asset_group_bindingJSON){

    asset_group_binding_t *asset_group_binding_local_var = NULL;

    // define the local list for asset_group_binding->ad_accounts_ids
    list_t *ad_accounts_idsList = NULL;

    // define the local list for asset_group_binding->asset_group_types
    list_t *asset_group_typesList = NULL;

    // define the local list for asset_group_binding->catalogs_ids
    list_t *catalogs_idsList = NULL;

    // define the local variable for asset_group_binding->created_by
    business_access_user_summary_t *created_by_local_nonprim = NULL;

    // define the local variable for asset_group_binding->owner
    business_access_user_summary_t *owner_local_nonprim = NULL;

    // define the local list for asset_group_binding->profiles_ids
    list_t *profiles_idsList = NULL;

    // asset_group_binding->ad_accounts_ids
    cJSON *ad_accounts_ids = cJSON_GetObjectItemCaseSensitive(asset_group_bindingJSON, "ad_accounts_ids");
    if (cJSON_IsNull(ad_accounts_ids)) {
        ad_accounts_ids = NULL;
    }
    if (ad_accounts_ids) { 
    cJSON *ad_accounts_ids_local = NULL;
    if(!cJSON_IsArray(ad_accounts_ids)) {
        goto end;//primitive container
    }
    ad_accounts_idsList = list_createList();

    cJSON_ArrayForEach(ad_accounts_ids_local, ad_accounts_ids)
    {
        if(!cJSON_IsString(ad_accounts_ids_local))
        {
            goto end;
        }
        list_addElement(ad_accounts_idsList , strdup(ad_accounts_ids_local->valuestring));
    }
    }

    // asset_group_binding->asset_group_description
    cJSON *asset_group_description = cJSON_GetObjectItemCaseSensitive(asset_group_bindingJSON, "asset_group_description");
    if (cJSON_IsNull(asset_group_description)) {
        asset_group_description = NULL;
    }
    if (asset_group_description) { 
    if(!cJSON_IsString(asset_group_description) && !cJSON_IsNull(asset_group_description))
    {
    goto end; //String
    }
    }

    // asset_group_binding->asset_group_name
    cJSON *asset_group_name = cJSON_GetObjectItemCaseSensitive(asset_group_bindingJSON, "asset_group_name");
    if (cJSON_IsNull(asset_group_name)) {
        asset_group_name = NULL;
    }
    if (asset_group_name) { 
    if(!cJSON_IsString(asset_group_name) && !cJSON_IsNull(asset_group_name))
    {
    goto end; //String
    }
    }

    // asset_group_binding->asset_group_types
    cJSON *asset_group_types = cJSON_GetObjectItemCaseSensitive(asset_group_bindingJSON, "asset_group_types");
    if (cJSON_IsNull(asset_group_types)) {
        asset_group_types = NULL;
    }
    if (asset_group_types) { 
    cJSON *asset_group_types_local = NULL;
    if(!cJSON_IsArray(asset_group_types)) {
        goto end;//primitive container
    }
    asset_group_typesList = list_createList();

    cJSON_ArrayForEach(asset_group_types_local, asset_group_types)
    {
        if(!cJSON_IsString(asset_group_types_local))
        {
            goto end;
        }
        list_addElement(asset_group_typesList , strdup(asset_group_types_local->valuestring));
    }
    }

    // asset_group_binding->catalogs_ids
    cJSON *catalogs_ids = cJSON_GetObjectItemCaseSensitive(asset_group_bindingJSON, "catalogs_ids");
    if (cJSON_IsNull(catalogs_ids)) {
        catalogs_ids = NULL;
    }
    if (catalogs_ids) { 
    cJSON *catalogs_ids_local = NULL;
    if(!cJSON_IsArray(catalogs_ids)) {
        goto end;//primitive container
    }
    catalogs_idsList = list_createList();

    cJSON_ArrayForEach(catalogs_ids_local, catalogs_ids)
    {
        if(!cJSON_IsString(catalogs_ids_local))
        {
            goto end;
        }
        list_addElement(catalogs_idsList , strdup(catalogs_ids_local->valuestring));
    }
    }

    // asset_group_binding->created_by
    cJSON *created_by = cJSON_GetObjectItemCaseSensitive(asset_group_bindingJSON, "created_by");
    if (cJSON_IsNull(created_by)) {
        created_by = NULL;
    }
    if (created_by) { 
    created_by_local_nonprim = business_access_user_summary_parseFromJSON(created_by); //nonprimitive
    }

    // asset_group_binding->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(asset_group_bindingJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // asset_group_binding->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(asset_group_bindingJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // asset_group_binding->owner
    cJSON *owner = cJSON_GetObjectItemCaseSensitive(asset_group_bindingJSON, "owner");
    if (cJSON_IsNull(owner)) {
        owner = NULL;
    }
    if (owner) { 
    owner_local_nonprim = business_access_user_summary_parseFromJSON(owner); //nonprimitive
    }

    // asset_group_binding->profiles_ids
    cJSON *profiles_ids = cJSON_GetObjectItemCaseSensitive(asset_group_bindingJSON, "profiles_ids");
    if (cJSON_IsNull(profiles_ids)) {
        profiles_ids = NULL;
    }
    if (profiles_ids) { 
    cJSON *profiles_ids_local = NULL;
    if(!cJSON_IsArray(profiles_ids)) {
        goto end;//primitive container
    }
    profiles_idsList = list_createList();

    cJSON_ArrayForEach(profiles_ids_local, profiles_ids)
    {
        if(!cJSON_IsString(profiles_ids_local))
        {
            goto end;
        }
        list_addElement(profiles_idsList , strdup(profiles_ids_local->valuestring));
    }
    }

    // asset_group_binding->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(asset_group_bindingJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    }


    asset_group_binding_local_var = asset_group_binding_create_internal (
        ad_accounts_ids ? ad_accounts_idsList : NULL,
        asset_group_description && !cJSON_IsNull(asset_group_description) ? strdup(asset_group_description->valuestring) : NULL,
        asset_group_name && !cJSON_IsNull(asset_group_name) ? strdup(asset_group_name->valuestring) : NULL,
        asset_group_types ? asset_group_typesList : NULL,
        catalogs_ids ? catalogs_idsList : NULL,
        created_by ? created_by_local_nonprim : NULL,
        created_time ? created_time->valuedouble : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        owner ? owner_local_nonprim : NULL,
        profiles_ids ? profiles_idsList : NULL,
        updated_time ? updated_time->valuedouble : 0
        );

    return asset_group_binding_local_var;
end:
    if (ad_accounts_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ad_accounts_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ad_accounts_idsList);
        ad_accounts_idsList = NULL;
    }
    if (asset_group_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, asset_group_typesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(asset_group_typesList);
        asset_group_typesList = NULL;
    }
    if (catalogs_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, catalogs_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(catalogs_idsList);
        catalogs_idsList = NULL;
    }
    if (created_by_local_nonprim) {
        business_access_user_summary_free(created_by_local_nonprim);
        created_by_local_nonprim = NULL;
    }
    if (owner_local_nonprim) {
        business_access_user_summary_free(owner_local_nonprim);
        owner_local_nonprim = NULL;
    }
    if (profiles_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, profiles_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(profiles_idsList);
        profiles_idsList = NULL;
    }
    return NULL;

}
