#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_asset_group_body_asset_groups_to_update_inner.h"


char* update_asset_group_body_asset_groups_to_update_inner_asset_group_types_ToString(pinterest_rest_api_update_asset_group_body_asset_groups_to_update_inner__e asset_group_types) {
    char *asset_group_typesArray[] =  { "NULL", "BRAND", "LOCATION_OR_LANGUAGE", "PRODUCT_LINE", "OTHER" };
    return asset_group_typesArray[asset_group_types - 1];
}

pinterest_rest_api_update_asset_group_body_asset_groups_to_update_inner__e update_asset_group_body_asset_groups_to_update_inner_asset_group_types_FromString(char* asset_group_types) {
    int stringToReturn = 0;
    char *asset_group_typesArray[] =  { "NULL", "BRAND", "LOCATION_OR_LANGUAGE", "PRODUCT_LINE", "OTHER" };
    size_t sizeofArray = sizeof(asset_group_typesArray) / sizeof(asset_group_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(asset_group_types, asset_group_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

update_asset_group_body_asset_groups_to_update_inner_t *update_asset_group_body_asset_groups_to_update_inner_create(
    char *asset_group_id,
    char *name,
    char *description,
    list_t *asset_group_types,
    list_t *assets_to_add,
    list_t *assets_to_remove
    ) {
    update_asset_group_body_asset_groups_to_update_inner_t *update_asset_group_body_asset_groups_to_update_inner_local_var = malloc(sizeof(update_asset_group_body_asset_groups_to_update_inner_t));
    if (!update_asset_group_body_asset_groups_to_update_inner_local_var) {
        return NULL;
    }
    update_asset_group_body_asset_groups_to_update_inner_local_var->asset_group_id = asset_group_id;
    update_asset_group_body_asset_groups_to_update_inner_local_var->name = name;
    update_asset_group_body_asset_groups_to_update_inner_local_var->description = description;
    update_asset_group_body_asset_groups_to_update_inner_local_var->asset_group_types = asset_group_types;
    update_asset_group_body_asset_groups_to_update_inner_local_var->assets_to_add = assets_to_add;
    update_asset_group_body_asset_groups_to_update_inner_local_var->assets_to_remove = assets_to_remove;

    return update_asset_group_body_asset_groups_to_update_inner_local_var;
}


void update_asset_group_body_asset_groups_to_update_inner_free(update_asset_group_body_asset_groups_to_update_inner_t *update_asset_group_body_asset_groups_to_update_inner) {
    if(NULL == update_asset_group_body_asset_groups_to_update_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (update_asset_group_body_asset_groups_to_update_inner->asset_group_id) {
        free(update_asset_group_body_asset_groups_to_update_inner->asset_group_id);
        update_asset_group_body_asset_groups_to_update_inner->asset_group_id = NULL;
    }
    if (update_asset_group_body_asset_groups_to_update_inner->name) {
        free(update_asset_group_body_asset_groups_to_update_inner->name);
        update_asset_group_body_asset_groups_to_update_inner->name = NULL;
    }
    if (update_asset_group_body_asset_groups_to_update_inner->description) {
        free(update_asset_group_body_asset_groups_to_update_inner->description);
        update_asset_group_body_asset_groups_to_update_inner->description = NULL;
    }
    if (update_asset_group_body_asset_groups_to_update_inner->asset_group_types) {
        list_ForEach(listEntry, update_asset_group_body_asset_groups_to_update_inner->asset_group_types) {
            asset_group_type_free(listEntry->data);
        }
        list_freeList(update_asset_group_body_asset_groups_to_update_inner->asset_group_types);
        update_asset_group_body_asset_groups_to_update_inner->asset_group_types = NULL;
    }
    if (update_asset_group_body_asset_groups_to_update_inner->assets_to_add) {
        list_ForEach(listEntry, update_asset_group_body_asset_groups_to_update_inner->assets_to_add) {
            free(listEntry->data);
        }
        list_freeList(update_asset_group_body_asset_groups_to_update_inner->assets_to_add);
        update_asset_group_body_asset_groups_to_update_inner->assets_to_add = NULL;
    }
    if (update_asset_group_body_asset_groups_to_update_inner->assets_to_remove) {
        list_ForEach(listEntry, update_asset_group_body_asset_groups_to_update_inner->assets_to_remove) {
            free(listEntry->data);
        }
        list_freeList(update_asset_group_body_asset_groups_to_update_inner->assets_to_remove);
        update_asset_group_body_asset_groups_to_update_inner->assets_to_remove = NULL;
    }
    free(update_asset_group_body_asset_groups_to_update_inner);
}

cJSON *update_asset_group_body_asset_groups_to_update_inner_convertToJSON(update_asset_group_body_asset_groups_to_update_inner_t *update_asset_group_body_asset_groups_to_update_inner) {
    cJSON *item = cJSON_CreateObject();

    // update_asset_group_body_asset_groups_to_update_inner->asset_group_id
    if (!update_asset_group_body_asset_groups_to_update_inner->asset_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_group_id", update_asset_group_body_asset_groups_to_update_inner->asset_group_id) == NULL) {
    goto fail; //String
    }


    // update_asset_group_body_asset_groups_to_update_inner->name
    if(update_asset_group_body_asset_groups_to_update_inner->name) {
    if(cJSON_AddStringToObject(item, "name", update_asset_group_body_asset_groups_to_update_inner->name) == NULL) {
    goto fail; //String
    }
    }


    // update_asset_group_body_asset_groups_to_update_inner->description
    if(update_asset_group_body_asset_groups_to_update_inner->description) {
    if(cJSON_AddStringToObject(item, "description", update_asset_group_body_asset_groups_to_update_inner->description) == NULL) {
    goto fail; //String
    }
    }


    // update_asset_group_body_asset_groups_to_update_inner->asset_group_types
    if(update_asset_group_body_asset_groups_to_update_inner->asset_group_types != pinterest_rest_api_update_asset_group_body_asset_groups_to_update_inner_ASSETGROUPTYPES_NULL) {
    cJSON *asset_group_types = cJSON_AddArrayToObject(item, "asset_group_types");
    if(asset_group_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *asset_group_typesListEntry;
    if (update_asset_group_body_asset_groups_to_update_inner->asset_group_types) {
    list_ForEach(asset_group_typesListEntry, update_asset_group_body_asset_groups_to_update_inner->asset_group_types) {
    cJSON *itemLocal = asset_group_type_convertToJSON((pinterest_rest_api_update_asset_group_body_asset_groups_to_update_inner__e)asset_group_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(asset_group_types, itemLocal);
    }
    }
    }


    // update_asset_group_body_asset_groups_to_update_inner->assets_to_add
    if(update_asset_group_body_asset_groups_to_update_inner->assets_to_add) {
    cJSON *assets_to_add = cJSON_AddArrayToObject(item, "assets_to_add");
    if(assets_to_add == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *assets_to_addListEntry;
    list_ForEach(assets_to_addListEntry, update_asset_group_body_asset_groups_to_update_inner->assets_to_add) {
    if(cJSON_AddStringToObject(assets_to_add, "", (char*)assets_to_addListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // update_asset_group_body_asset_groups_to_update_inner->assets_to_remove
    if(update_asset_group_body_asset_groups_to_update_inner->assets_to_remove) {
    cJSON *assets_to_remove = cJSON_AddArrayToObject(item, "assets_to_remove");
    if(assets_to_remove == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *assets_to_removeListEntry;
    list_ForEach(assets_to_removeListEntry, update_asset_group_body_asset_groups_to_update_inner->assets_to_remove) {
    if(cJSON_AddStringToObject(assets_to_remove, "", (char*)assets_to_removeListEntry->data) == NULL)
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

update_asset_group_body_asset_groups_to_update_inner_t *update_asset_group_body_asset_groups_to_update_inner_parseFromJSON(cJSON *update_asset_group_body_asset_groups_to_update_innerJSON){

    update_asset_group_body_asset_groups_to_update_inner_t *update_asset_group_body_asset_groups_to_update_inner_local_var = NULL;

    // define the local list for update_asset_group_body_asset_groups_to_update_inner->asset_group_types
    list_t *asset_group_typesList = NULL;

    // define the local list for update_asset_group_body_asset_groups_to_update_inner->assets_to_add
    list_t *assets_to_addList = NULL;

    // define the local list for update_asset_group_body_asset_groups_to_update_inner->assets_to_remove
    list_t *assets_to_removeList = NULL;

    // update_asset_group_body_asset_groups_to_update_inner->asset_group_id
    cJSON *asset_group_id = cJSON_GetObjectItemCaseSensitive(update_asset_group_body_asset_groups_to_update_innerJSON, "asset_group_id");
    if (!asset_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(asset_group_id))
    {
    goto end; //String
    }

    // update_asset_group_body_asset_groups_to_update_inner->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(update_asset_group_body_asset_groups_to_update_innerJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // update_asset_group_body_asset_groups_to_update_inner->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(update_asset_group_body_asset_groups_to_update_innerJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // update_asset_group_body_asset_groups_to_update_inner->asset_group_types
    cJSON *asset_group_types = cJSON_GetObjectItemCaseSensitive(update_asset_group_body_asset_groups_to_update_innerJSON, "asset_group_types");
    if (asset_group_types) { 
    cJSON *asset_group_types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(asset_group_types)){
        goto end; //nonprimitive container
    }

    asset_group_typesList = list_createList();

    cJSON_ArrayForEach(asset_group_types_local_nonprimitive,asset_group_types )
    {
        if(!cJSON_IsObject(asset_group_types_local_nonprimitive)){
            goto end;
        }
        update_asset_group_body_asset_groups_to_update_inner_asset_group_type_e asset_group_typesItem = asset_group_type_parseFromJSON(asset_group_types_local_nonprimitive);

        list_addElement(asset_group_typesList, (void *)asset_group_typesItem);
    }
    }

    // update_asset_group_body_asset_groups_to_update_inner->assets_to_add
    cJSON *assets_to_add = cJSON_GetObjectItemCaseSensitive(update_asset_group_body_asset_groups_to_update_innerJSON, "assets_to_add");
    if (assets_to_add) { 
    cJSON *assets_to_add_local = NULL;
    if(!cJSON_IsArray(assets_to_add)) {
        goto end;//primitive container
    }
    assets_to_addList = list_createList();

    cJSON_ArrayForEach(assets_to_add_local, assets_to_add)
    {
        if(!cJSON_IsString(assets_to_add_local))
        {
            goto end;
        }
        list_addElement(assets_to_addList , strdup(assets_to_add_local->valuestring));
    }
    }

    // update_asset_group_body_asset_groups_to_update_inner->assets_to_remove
    cJSON *assets_to_remove = cJSON_GetObjectItemCaseSensitive(update_asset_group_body_asset_groups_to_update_innerJSON, "assets_to_remove");
    if (assets_to_remove) { 
    cJSON *assets_to_remove_local = NULL;
    if(!cJSON_IsArray(assets_to_remove)) {
        goto end;//primitive container
    }
    assets_to_removeList = list_createList();

    cJSON_ArrayForEach(assets_to_remove_local, assets_to_remove)
    {
        if(!cJSON_IsString(assets_to_remove_local))
        {
            goto end;
        }
        list_addElement(assets_to_removeList , strdup(assets_to_remove_local->valuestring));
    }
    }


    update_asset_group_body_asset_groups_to_update_inner_local_var = update_asset_group_body_asset_groups_to_update_inner_create (
        strdup(asset_group_id->valuestring),
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        asset_group_types ? asset_group_typesList : NULL,
        assets_to_add ? assets_to_addList : NULL,
        assets_to_remove ? assets_to_removeList : NULL
        );

    return update_asset_group_body_asset_groups_to_update_inner_local_var;
end:
    if (asset_group_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, asset_group_typesList) {
            asset_group_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(asset_group_typesList);
        asset_group_typesList = NULL;
    }
    if (assets_to_addList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, assets_to_addList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(assets_to_addList);
        assets_to_addList = NULL;
    }
    if (assets_to_removeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, assets_to_removeList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(assets_to_removeList);
        assets_to_removeList = NULL;
    }
    return NULL;

}
