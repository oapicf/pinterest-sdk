#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_items_post_filter.h"


char* catalogs_creative_assets_items_post_filter_catalog_type_ToString(pinterest_rest_api_catalogs_creative_assets_items_post_filter_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_creative_assets_items_post_filter_CATALOGTYPE_e catalogs_creative_assets_items_post_filter_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_creative_assets_items_post_filter_t *catalogs_creative_assets_items_post_filter_create(
    pinterest_rest_api_catalogs_creative_assets_items_post_filter_CATALOGTYPE_e catalog_type,
    list_t *creative_assets_ids,
    char *catalog_id
    ) {
    catalogs_creative_assets_items_post_filter_t *catalogs_creative_assets_items_post_filter_local_var = malloc(sizeof(catalogs_creative_assets_items_post_filter_t));
    if (!catalogs_creative_assets_items_post_filter_local_var) {
        return NULL;
    }
    catalogs_creative_assets_items_post_filter_local_var->catalog_type = catalog_type;
    catalogs_creative_assets_items_post_filter_local_var->creative_assets_ids = creative_assets_ids;
    catalogs_creative_assets_items_post_filter_local_var->catalog_id = catalog_id;

    return catalogs_creative_assets_items_post_filter_local_var;
}


void catalogs_creative_assets_items_post_filter_free(catalogs_creative_assets_items_post_filter_t *catalogs_creative_assets_items_post_filter) {
    if(NULL == catalogs_creative_assets_items_post_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_items_post_filter->creative_assets_ids) {
        list_ForEach(listEntry, catalogs_creative_assets_items_post_filter->creative_assets_ids) {
            free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_items_post_filter->creative_assets_ids);
        catalogs_creative_assets_items_post_filter->creative_assets_ids = NULL;
    }
    if (catalogs_creative_assets_items_post_filter->catalog_id) {
        free(catalogs_creative_assets_items_post_filter->catalog_id);
        catalogs_creative_assets_items_post_filter->catalog_id = NULL;
    }
    free(catalogs_creative_assets_items_post_filter);
}

cJSON *catalogs_creative_assets_items_post_filter_convertToJSON(catalogs_creative_assets_items_post_filter_t *catalogs_creative_assets_items_post_filter) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_items_post_filter->catalog_type
    if (pinterest_rest_api_catalogs_creative_assets_items_post_filter_CATALOGTYPE_NULL == catalogs_creative_assets_items_post_filter->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_creative_assets_items_post_filter_ToString(catalogs_creative_assets_items_post_filter->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_creative_assets_items_post_filter->creative_assets_ids
    if (!catalogs_creative_assets_items_post_filter->creative_assets_ids) {
        goto fail;
    }
    cJSON *creative_assets_ids = cJSON_AddArrayToObject(item, "creative_assets_ids");
    if(creative_assets_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *creative_assets_idsListEntry;
    list_ForEach(creative_assets_idsListEntry, catalogs_creative_assets_items_post_filter->creative_assets_ids) {
    if(cJSON_AddStringToObject(creative_assets_ids, "", (char*)creative_assets_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // catalogs_creative_assets_items_post_filter->catalog_id
    if(catalogs_creative_assets_items_post_filter->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_creative_assets_items_post_filter->catalog_id) == NULL) {
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

catalogs_creative_assets_items_post_filter_t *catalogs_creative_assets_items_post_filter_parseFromJSON(cJSON *catalogs_creative_assets_items_post_filterJSON){

    catalogs_creative_assets_items_post_filter_t *catalogs_creative_assets_items_post_filter_local_var = NULL;

    // define the local list for catalogs_creative_assets_items_post_filter->creative_assets_ids
    list_t *creative_assets_idsList = NULL;

    // catalogs_creative_assets_items_post_filter->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_items_post_filterJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_creative_assets_items_post_filter_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_creative_assets_items_post_filter_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_creative_assets_items_post_filter->creative_assets_ids
    cJSON *creative_assets_ids = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_items_post_filterJSON, "creative_assets_ids");
    if (!creative_assets_ids) {
        goto end;
    }

    
    cJSON *creative_assets_ids_local = NULL;
    if(!cJSON_IsArray(creative_assets_ids)) {
        goto end;//primitive container
    }
    creative_assets_idsList = list_createList();

    cJSON_ArrayForEach(creative_assets_ids_local, creative_assets_ids)
    {
        if(!cJSON_IsString(creative_assets_ids_local))
        {
            goto end;
        }
        list_addElement(creative_assets_idsList , strdup(creative_assets_ids_local->valuestring));
    }

    // catalogs_creative_assets_items_post_filter->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_items_post_filterJSON, "catalog_id");
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }


    catalogs_creative_assets_items_post_filter_local_var = catalogs_creative_assets_items_post_filter_create (
        catalog_typeVariable,
        creative_assets_idsList,
        catalog_id && !cJSON_IsNull(catalog_id) ? strdup(catalog_id->valuestring) : NULL
        );

    return catalogs_creative_assets_items_post_filter_local_var;
end:
    if (creative_assets_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, creative_assets_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(creative_assets_idsList);
        creative_assets_idsList = NULL;
    }
    return NULL;

}
