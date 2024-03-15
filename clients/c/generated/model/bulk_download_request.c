#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_download_request.h"



bulk_download_request_t *bulk_download_request_create(
    list_t *entity_types,
    list_t *entity_ids,
    char *updated_since,
    bulk_download_request_campaign_filter_t *campaign_filter,
    bulk_output_format_t *output_format
    ) {
    bulk_download_request_t *bulk_download_request_local_var = malloc(sizeof(bulk_download_request_t));
    if (!bulk_download_request_local_var) {
        return NULL;
    }
    bulk_download_request_local_var->entity_types = entity_types;
    bulk_download_request_local_var->entity_ids = entity_ids;
    bulk_download_request_local_var->updated_since = updated_since;
    bulk_download_request_local_var->campaign_filter = campaign_filter;
    bulk_download_request_local_var->output_format = output_format;

    return bulk_download_request_local_var;
}


void bulk_download_request_free(bulk_download_request_t *bulk_download_request) {
    if(NULL == bulk_download_request){
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_download_request->entity_types) {
        list_ForEach(listEntry, bulk_download_request->entity_types) {
            bulk_entity_type_free(listEntry->data);
        }
        list_freeList(bulk_download_request->entity_types);
        bulk_download_request->entity_types = NULL;
    }
    if (bulk_download_request->entity_ids) {
        list_ForEach(listEntry, bulk_download_request->entity_ids) {
            free(listEntry->data);
        }
        list_freeList(bulk_download_request->entity_ids);
        bulk_download_request->entity_ids = NULL;
    }
    if (bulk_download_request->updated_since) {
        free(bulk_download_request->updated_since);
        bulk_download_request->updated_since = NULL;
    }
    if (bulk_download_request->campaign_filter) {
        bulk_download_request_campaign_filter_free(bulk_download_request->campaign_filter);
        bulk_download_request->campaign_filter = NULL;
    }
    if (bulk_download_request->output_format) {
        bulk_output_format_free(bulk_download_request->output_format);
        bulk_download_request->output_format = NULL;
    }
    free(bulk_download_request);
}

cJSON *bulk_download_request_convertToJSON(bulk_download_request_t *bulk_download_request) {
    cJSON *item = cJSON_CreateObject();

    // bulk_download_request->entity_types
    if(bulk_download_request->entity_types) {
    cJSON *entity_types = cJSON_AddArrayToObject(item, "entity_types");
    if(entity_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *entity_typesListEntry;
    if (bulk_download_request->entity_types) {
    list_ForEach(entity_typesListEntry, bulk_download_request->entity_types) {
    cJSON *itemLocal = bulk_entity_type_convertToJSON(entity_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(entity_types, itemLocal);
    }
    }
    }


    // bulk_download_request->entity_ids
    if(bulk_download_request->entity_ids) {
    cJSON *entity_ids = cJSON_AddArrayToObject(item, "entity_ids");
    if(entity_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *entity_idsListEntry;
    list_ForEach(entity_idsListEntry, bulk_download_request->entity_ids) {
    if(cJSON_AddStringToObject(entity_ids, "", (char*)entity_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // bulk_download_request->updated_since
    if(bulk_download_request->updated_since) {
    if(cJSON_AddStringToObject(item, "updated_since", bulk_download_request->updated_since) == NULL) {
    goto fail; //String
    }
    }


    // bulk_download_request->campaign_filter
    if(bulk_download_request->campaign_filter) {
    cJSON *campaign_filter_local_JSON = bulk_download_request_campaign_filter_convertToJSON(bulk_download_request->campaign_filter);
    if(campaign_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "campaign_filter", campaign_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // bulk_download_request->output_format
    if(bulk_download_request->output_format) {
    cJSON *output_format_local_JSON = bulk_output_format_convertToJSON(bulk_download_request->output_format);
    if(output_format_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "output_format", output_format_local_JSON);
    if(item->child == NULL) {
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

bulk_download_request_t *bulk_download_request_parseFromJSON(cJSON *bulk_download_requestJSON){

    bulk_download_request_t *bulk_download_request_local_var = NULL;

    // define the local list for bulk_download_request->entity_types
    list_t *entity_typesList = NULL;

    // define the local list for bulk_download_request->entity_ids
    list_t *entity_idsList = NULL;

    // define the local variable for bulk_download_request->campaign_filter
    bulk_download_request_campaign_filter_t *campaign_filter_local_nonprim = NULL;

    // define the local variable for bulk_download_request->output_format
    bulk_output_format_t *output_format_local_nonprim = NULL;

    // bulk_download_request->entity_types
    cJSON *entity_types = cJSON_GetObjectItemCaseSensitive(bulk_download_requestJSON, "entity_types");
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
        bulk_entity_type_t *entity_typesItem = bulk_entity_type_parseFromJSON(entity_types_local_nonprimitive);

        list_addElement(entity_typesList, entity_typesItem);
    }
    }

    // bulk_download_request->entity_ids
    cJSON *entity_ids = cJSON_GetObjectItemCaseSensitive(bulk_download_requestJSON, "entity_ids");
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

    // bulk_download_request->updated_since
    cJSON *updated_since = cJSON_GetObjectItemCaseSensitive(bulk_download_requestJSON, "updated_since");
    if (updated_since) { 
    if(!cJSON_IsString(updated_since) && !cJSON_IsNull(updated_since))
    {
    goto end; //String
    }
    }

    // bulk_download_request->campaign_filter
    cJSON *campaign_filter = cJSON_GetObjectItemCaseSensitive(bulk_download_requestJSON, "campaign_filter");
    if (campaign_filter) { 
    campaign_filter_local_nonprim = bulk_download_request_campaign_filter_parseFromJSON(campaign_filter); //nonprimitive
    }

    // bulk_download_request->output_format
    cJSON *output_format = cJSON_GetObjectItemCaseSensitive(bulk_download_requestJSON, "output_format");
    if (output_format) { 
    output_format_local_nonprim = bulk_output_format_parseFromJSON(output_format); //custom
    }


    bulk_download_request_local_var = bulk_download_request_create (
        entity_types ? entity_typesList : NULL,
        entity_ids ? entity_idsList : NULL,
        updated_since && !cJSON_IsNull(updated_since) ? strdup(updated_since->valuestring) : NULL,
        campaign_filter ? campaign_filter_local_nonprim : NULL,
        output_format ? output_format_local_nonprim : NULL
        );

    return bulk_download_request_local_var;
end:
    if (entity_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, entity_typesList) {
            bulk_entity_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(entity_typesList);
        entity_typesList = NULL;
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
    if (campaign_filter_local_nonprim) {
        bulk_download_request_campaign_filter_free(campaign_filter_local_nonprim);
        campaign_filter_local_nonprim = NULL;
    }
    if (output_format_local_nonprim) {
        bulk_output_format_free(output_format_local_nonprim);
        output_format_local_nonprim = NULL;
    }
    return NULL;

}
