#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_items_post_filter.h"


char* catalogs_retail_items_post_filter_catalog_type_ToString(pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_e catalogs_retail_items_post_filter_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_retail_items_post_filter_t *catalogs_retail_items_post_filter_create_internal(
    char *catalog_id,
    pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_e catalog_type,
    list_t *item_ids
    ) {
    catalogs_retail_items_post_filter_t *catalogs_retail_items_post_filter_local_var = malloc(sizeof(catalogs_retail_items_post_filter_t));
    if (!catalogs_retail_items_post_filter_local_var) {
        return NULL;
    }
    memset(catalogs_retail_items_post_filter_local_var, 0, sizeof(catalogs_retail_items_post_filter_t));
    catalogs_retail_items_post_filter_local_var->_library_owned = 1;
    catalogs_retail_items_post_filter_local_var->catalog_id = catalog_id;
    catalogs_retail_items_post_filter_local_var->catalog_type = catalog_type;
    catalogs_retail_items_post_filter_local_var->item_ids = item_ids;
    return catalogs_retail_items_post_filter_local_var;
}

__attribute__((deprecated)) catalogs_retail_items_post_filter_t *catalogs_retail_items_post_filter_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_e catalog_type,
    list_t *item_ids
    ) {
    catalogs_retail_items_post_filter_t *result = catalogs_retail_items_post_filter_create_internal (
        catalog_id,
        catalog_type,
        item_ids
        );
    if (!result) {
    }
    return result;
}

void catalogs_retail_items_post_filter_free(catalogs_retail_items_post_filter_t *catalogs_retail_items_post_filter) {
    if(NULL == catalogs_retail_items_post_filter){
        return ;
    }
    if(catalogs_retail_items_post_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_retail_items_post_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_items_post_filter->catalog_id) {
        free(catalogs_retail_items_post_filter->catalog_id);
        catalogs_retail_items_post_filter->catalog_id = NULL;
    }
    if (catalogs_retail_items_post_filter->item_ids) {
        list_ForEach(listEntry, catalogs_retail_items_post_filter->item_ids) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_items_post_filter->item_ids);
        catalogs_retail_items_post_filter->item_ids = NULL;
    }
    free(catalogs_retail_items_post_filter);
}

cJSON *catalogs_retail_items_post_filter_convertToJSON(catalogs_retail_items_post_filter_t *catalogs_retail_items_post_filter) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_items_post_filter->catalog_id
    if(catalogs_retail_items_post_filter->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_retail_items_post_filter->catalog_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_retail_items_post_filter->catalog_type
    if (pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_NULL == catalogs_retail_items_post_filter->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_retail_items_post_filter_catalog_type_ToString(catalogs_retail_items_post_filter->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_retail_items_post_filter->item_ids
    if (!catalogs_retail_items_post_filter->item_ids) {
        goto fail;
    }
    cJSON *item_ids = cJSON_AddArrayToObject(item, "item_ids");
    if(item_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *item_idsListEntry;
    list_ForEach(item_idsListEntry, catalogs_retail_items_post_filter->item_ids) {
    if(cJSON_AddStringToObject(item_ids, "", item_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_retail_items_post_filter_t *catalogs_retail_items_post_filter_parseFromJSON(cJSON *catalogs_retail_items_post_filterJSON){

    catalogs_retail_items_post_filter_t *catalogs_retail_items_post_filter_local_var = NULL;

    char *catalog_id_local_str = NULL;

    // define the local list for catalogs_retail_items_post_filter->item_ids
    list_t *item_idsList = NULL;

    // catalogs_retail_items_post_filter->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_items_post_filterJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }

    // catalogs_retail_items_post_filter->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_items_post_filterJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_retail_items_post_filter_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_retail_items_post_filter->item_ids
    cJSON *item_ids = cJSON_GetObjectItemCaseSensitive(catalogs_retail_items_post_filterJSON, "item_ids");
    if (cJSON_IsNull(item_ids)) {
        item_ids = NULL;
    }
    if (!item_ids) {
        goto end;
    }

    
    cJSON *item_ids_local = NULL;
    if(!cJSON_IsArray(item_ids)) {
        goto end;//primitive container
    }
    item_idsList = list_createList();

    cJSON_ArrayForEach(item_ids_local, item_ids)
    {
        if(!cJSON_IsString(item_ids_local))
        {
            goto end;
        }
        list_addElement(item_idsList , strdup(item_ids_local->valuestring));
    }


    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);

    catalogs_retail_items_post_filter_local_var = catalogs_retail_items_post_filter_create_internal (
        catalog_id_local_str,
        catalog_typeVariable,
        item_idsList
        );

    if (!catalogs_retail_items_post_filter_local_var) {
        goto end;
    }

    return catalogs_retail_items_post_filter_local_var;
end:
    if (catalog_id_local_str) {
        free(catalog_id_local_str);
        catalog_id_local_str = NULL;
    }
    if (item_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, item_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(item_idsList);
        item_idsList = NULL;
    }
    return NULL;

}
