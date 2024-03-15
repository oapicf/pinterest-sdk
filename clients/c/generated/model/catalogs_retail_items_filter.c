#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_items_filter.h"


char* catalogs_retail_items_filter_catalog_type_ToString(pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_e catalogs_retail_items_filter_catalog_type_FromString(char* catalog_type){
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

catalogs_retail_items_filter_t *catalogs_retail_items_filter_create(
    pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_e catalog_type,
    list_t *item_ids,
    char *catalog_id
    ) {
    catalogs_retail_items_filter_t *catalogs_retail_items_filter_local_var = malloc(sizeof(catalogs_retail_items_filter_t));
    if (!catalogs_retail_items_filter_local_var) {
        return NULL;
    }
    catalogs_retail_items_filter_local_var->catalog_type = catalog_type;
    catalogs_retail_items_filter_local_var->item_ids = item_ids;
    catalogs_retail_items_filter_local_var->catalog_id = catalog_id;

    return catalogs_retail_items_filter_local_var;
}


void catalogs_retail_items_filter_free(catalogs_retail_items_filter_t *catalogs_retail_items_filter) {
    if(NULL == catalogs_retail_items_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_items_filter->item_ids) {
        list_ForEach(listEntry, catalogs_retail_items_filter->item_ids) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_items_filter->item_ids);
        catalogs_retail_items_filter->item_ids = NULL;
    }
    if (catalogs_retail_items_filter->catalog_id) {
        free(catalogs_retail_items_filter->catalog_id);
        catalogs_retail_items_filter->catalog_id = NULL;
    }
    free(catalogs_retail_items_filter);
}

cJSON *catalogs_retail_items_filter_convertToJSON(catalogs_retail_items_filter_t *catalogs_retail_items_filter) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_items_filter->catalog_type
    if (pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_NULL == catalogs_retail_items_filter->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_retail_items_filter_ToString(catalogs_retail_items_filter->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_retail_items_filter->item_ids
    if (!catalogs_retail_items_filter->item_ids) {
        goto fail;
    }
    cJSON *item_ids = cJSON_AddArrayToObject(item, "item_ids");
    if(item_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *item_idsListEntry;
    list_ForEach(item_idsListEntry, catalogs_retail_items_filter->item_ids) {
    if(cJSON_AddStringToObject(item_ids, "", (char*)item_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // catalogs_retail_items_filter->catalog_id
    if(catalogs_retail_items_filter->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_retail_items_filter->catalog_id) == NULL) {
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

catalogs_retail_items_filter_t *catalogs_retail_items_filter_parseFromJSON(cJSON *catalogs_retail_items_filterJSON){

    catalogs_retail_items_filter_t *catalogs_retail_items_filter_local_var = NULL;

    // define the local list for catalogs_retail_items_filter->item_ids
    list_t *item_idsList = NULL;

    // catalogs_retail_items_filter->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_items_filterJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_retail_items_filter_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_retail_items_filter->item_ids
    cJSON *item_ids = cJSON_GetObjectItemCaseSensitive(catalogs_retail_items_filterJSON, "item_ids");
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

    // catalogs_retail_items_filter->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_items_filterJSON, "catalog_id");
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }


    catalogs_retail_items_filter_local_var = catalogs_retail_items_filter_create (
        catalog_typeVariable,
        item_idsList,
        catalog_id && !cJSON_IsNull(catalog_id) ? strdup(catalog_id->valuestring) : NULL
        );

    return catalogs_retail_items_filter_local_var;
end:
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
