#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_download_create.h"


char* bulk_download_create_entity_types_ToString(pinterest_rest_api_bulk_download_create__e entity_types) {
    char *entity_typesArray[] =  { "NULL", "CAMPAIGN", "AD_GROUP", "PRODUCT_GROUP", "AD", "KEYWORD", "LABEL", "SCHEDULE", "ENTITY_HISTORY" };
    return entity_typesArray[entity_types - 1];
}

pinterest_rest_api_bulk_download_create__e bulk_download_create_entity_types_FromString(char* entity_types) {
    int stringToReturn = 0;
    char *entity_typesArray[] =  { "NULL", "CAMPAIGN", "AD_GROUP", "PRODUCT_GROUP", "AD", "KEYWORD", "LABEL", "SCHEDULE", "ENTITY_HISTORY" };
    size_t sizeofArray = sizeof(entity_typesArray) / sizeof(entity_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(entity_types, entity_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static bulk_download_create_t *bulk_download_create_create_internal(
    bulk_download_campaign_filter_t *campaign_filter,
    list_t *entity_ids,
    list_t *entity_types,
    bulk_output_format_t *output_format,
    char *updated_since
    ) {
    bulk_download_create_t *bulk_download_create_local_var = malloc(sizeof(bulk_download_create_t));
    if (!bulk_download_create_local_var) {
        return NULL;
    }
    memset(bulk_download_create_local_var, 0, sizeof(bulk_download_create_t));
    bulk_download_create_local_var->_library_owned = 1;
    bulk_download_create_local_var->campaign_filter = campaign_filter;
    bulk_download_create_local_var->entity_ids = entity_ids;
    bulk_download_create_local_var->entity_types = entity_types;
    bulk_download_create_local_var->output_format = output_format;
    bulk_download_create_local_var->updated_since = updated_since;
    return bulk_download_create_local_var;
}

__attribute__((deprecated)) bulk_download_create_t *bulk_download_create_create(
    bulk_download_campaign_filter_t *campaign_filter,
    list_t *entity_ids,
    list_t *entity_types,
    bulk_output_format_t *output_format,
    char *updated_since
    ) {
    bulk_download_create_t *result = bulk_download_create_create_internal (
        campaign_filter,
        entity_ids,
        entity_types,
        output_format,
        updated_since
        );
    if (!result) {
    }
    return result;
}

void bulk_download_create_free(bulk_download_create_t *bulk_download_create) {
    if(NULL == bulk_download_create){
        return ;
    }
    if(bulk_download_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bulk_download_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_download_create->campaign_filter) {
        bulk_download_campaign_filter_free(bulk_download_create->campaign_filter);
        bulk_download_create->campaign_filter = NULL;
    }
    if (bulk_download_create->entity_ids) {
        list_ForEach(listEntry, bulk_download_create->entity_ids) {
            free(listEntry->data);
        }
        list_freeList(bulk_download_create->entity_ids);
        bulk_download_create->entity_ids = NULL;
    }
    if (bulk_download_create->entity_types) {
        list_ForEach(listEntry, bulk_download_create->entity_types) {
            bulk_entity_type_free(listEntry->data);
        }
        list_freeList(bulk_download_create->entity_types);
        bulk_download_create->entity_types = NULL;
    }
    if (bulk_download_create->output_format) {
        bulk_output_format_free(bulk_download_create->output_format);
        bulk_download_create->output_format = NULL;
    }
    if (bulk_download_create->updated_since) {
        free(bulk_download_create->updated_since);
        bulk_download_create->updated_since = NULL;
    }
    free(bulk_download_create);
}

cJSON *bulk_download_create_convertToJSON(bulk_download_create_t *bulk_download_create) {
    cJSON *item = cJSON_CreateObject();

    // bulk_download_create->campaign_filter
    if(bulk_download_create->campaign_filter) {
    cJSON *campaign_filter_local_JSON = bulk_download_campaign_filter_convertToJSON(bulk_download_create->campaign_filter);
    if(campaign_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "campaign_filter", campaign_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // bulk_download_create->entity_ids
    if(bulk_download_create->entity_ids) {
    cJSON *entity_ids = cJSON_AddArrayToObject(item, "entity_ids");
    if(entity_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *entity_idsListEntry;
    list_ForEach(entity_idsListEntry, bulk_download_create->entity_ids) {
    if(cJSON_AddStringToObject(entity_ids, "", entity_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // bulk_download_create->entity_types
    if(bulk_download_create->entity_types != pinterest_rest_api_list_ENTITYTYPES_NULL) {
    cJSON *entity_types = cJSON_AddArrayToObject(item, "entity_types");
    if(entity_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *entity_typesListEntry;
    if (bulk_download_create->entity_types) {
    list_ForEach(entity_typesListEntry, bulk_download_create->entity_types) {
    cJSON *itemLocal = bulk_entity_type_convertToJSON((pinterest_rest_api_bulk_download_create__e)entity_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(entity_types, itemLocal);
    }
    }
    }


    // bulk_download_create->output_format
    if(bulk_download_create->output_format) {
    cJSON *output_format_local_JSON = bulk_output_format_convertToJSON(bulk_download_create->output_format);
    if(output_format_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "output_format", output_format_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // bulk_download_create->updated_since
    if(bulk_download_create->updated_since) {
    if(cJSON_AddStringToObject(item, "updated_since", bulk_download_create->updated_since) == NULL) {
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

bulk_download_create_t *bulk_download_create_parseFromJSON(cJSON *bulk_download_createJSON){

    bulk_download_create_t *bulk_download_create_local_var = NULL;

    // define the local variable for bulk_download_create->campaign_filter
    bulk_download_campaign_filter_t *campaign_filter_local_nonprim = NULL;

    // define the local list for bulk_download_create->entity_ids
    list_t *entity_idsList = NULL;

    // define the local list for bulk_download_create->entity_types
    list_t *entity_typesList = NULL;

    // define the local variable for bulk_download_create->output_format
    bulk_output_format_t *output_format_local_nonprim = NULL;

    char *updated_since_local_str = NULL;

    // bulk_download_create->campaign_filter
    cJSON *campaign_filter = cJSON_GetObjectItemCaseSensitive(bulk_download_createJSON, "campaign_filter");
    if (cJSON_IsNull(campaign_filter)) {
        campaign_filter = NULL;
    }
    if (campaign_filter) { 
    campaign_filter_local_nonprim = bulk_download_campaign_filter_parseFromJSON(campaign_filter); //nonprimitive
    }

    // bulk_download_create->entity_ids
    cJSON *entity_ids = cJSON_GetObjectItemCaseSensitive(bulk_download_createJSON, "entity_ids");
    if (cJSON_IsNull(entity_ids)) {
        entity_ids = NULL;
    }
    if (entity_ids) { 
    cJSON *entity_ids_local = NULL;
    if(!cJSON_IsArray(entity_ids)) {
        goto end;//primitive container
    }
    entity_idsList = list_createList();

    cJSON_ArrayForEach(entity_ids_local, entity_ids)
    {
        if(!cJSON_IsString(entity_ids_local))
        {
            goto end;
        }
        list_addElement(entity_idsList , strdup(entity_ids_local->valuestring));
    }
    }

    // bulk_download_create->entity_types
    cJSON *entity_types = cJSON_GetObjectItemCaseSensitive(bulk_download_createJSON, "entity_types");
    if (cJSON_IsNull(entity_types)) {
        entity_types = NULL;
    }
    if (entity_types) { 
    cJSON *entity_types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(entity_types)){
        goto end; //nonprimitive container
    }

    entity_typesList = list_createList();

    cJSON_ArrayForEach(entity_types_local_nonprimitive,entity_types )
    {
        if(!cJSON_IsObject(entity_types_local_nonprimitive)){
            goto end;
        }
        bulk_download_create_bulk_entity_type_e entity_typesItem = bulk_entity_type_parseFromJSON(entity_types_local_nonprimitive);

        list_addElement(entity_typesList, (void *)entity_typesItem);
    }
    }

    // bulk_download_create->output_format
    cJSON *output_format = cJSON_GetObjectItemCaseSensitive(bulk_download_createJSON, "output_format");
    if (cJSON_IsNull(output_format)) {
        output_format = NULL;
    }
    if (output_format) { 
    output_format_local_nonprim = bulk_output_format_parseFromJSON(output_format); //custom
    }

    // bulk_download_create->updated_since
    cJSON *updated_since = cJSON_GetObjectItemCaseSensitive(bulk_download_createJSON, "updated_since");
    if (cJSON_IsNull(updated_since)) {
        updated_since = NULL;
    }
    if (updated_since) { 
    if(!cJSON_IsString(updated_since) && !cJSON_IsNull(updated_since))
    {
    goto end; //String
    }
    }


    if (updated_since && !cJSON_IsNull(updated_since)) updated_since_local_str = strdup(updated_since->valuestring);

    bulk_download_create_local_var = bulk_download_create_create_internal (
        campaign_filter ? campaign_filter_local_nonprim : NULL,
        entity_ids ? entity_idsList : NULL,
        entity_types ? entity_typesList : NULL,
        output_format ? output_format_local_nonprim : NULL,
        updated_since_local_str
        );

    if (!bulk_download_create_local_var) {
        goto end;
    }

    return bulk_download_create_local_var;
end:
    if (campaign_filter_local_nonprim) {
        bulk_download_campaign_filter_free(campaign_filter_local_nonprim);
        campaign_filter_local_nonprim = NULL;
    }
    if (entity_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, entity_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(entity_idsList);
        entity_idsList = NULL;
    }
    if (entity_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, entity_typesList) {
            bulk_entity_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(entity_typesList);
        entity_typesList = NULL;
    }
    if (output_format_local_nonprim) {
        bulk_output_format_free(output_format_local_nonprim);
        output_format_local_nonprim = NULL;
    }
    if (updated_since_local_str) {
        free(updated_since_local_str);
        updated_since_local_str = NULL;
    }
    return NULL;

}
