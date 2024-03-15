#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_events_data_inner_custom_data.h"



conversion_events_data_inner_custom_data_t *conversion_events_data_inner_custom_data_create(
    char *currency,
    char *value,
    list_t *content_ids,
    char *content_name,
    char *content_category,
    char *content_brand,
    list_t *contents,
    long num_items,
    char *order_id,
    char *search_string,
    char *opt_out_type,
    char *np
    ) {
    conversion_events_data_inner_custom_data_t *conversion_events_data_inner_custom_data_local_var = malloc(sizeof(conversion_events_data_inner_custom_data_t));
    if (!conversion_events_data_inner_custom_data_local_var) {
        return NULL;
    }
    conversion_events_data_inner_custom_data_local_var->currency = currency;
    conversion_events_data_inner_custom_data_local_var->value = value;
    conversion_events_data_inner_custom_data_local_var->content_ids = content_ids;
    conversion_events_data_inner_custom_data_local_var->content_name = content_name;
    conversion_events_data_inner_custom_data_local_var->content_category = content_category;
    conversion_events_data_inner_custom_data_local_var->content_brand = content_brand;
    conversion_events_data_inner_custom_data_local_var->contents = contents;
    conversion_events_data_inner_custom_data_local_var->num_items = num_items;
    conversion_events_data_inner_custom_data_local_var->order_id = order_id;
    conversion_events_data_inner_custom_data_local_var->search_string = search_string;
    conversion_events_data_inner_custom_data_local_var->opt_out_type = opt_out_type;
    conversion_events_data_inner_custom_data_local_var->np = np;

    return conversion_events_data_inner_custom_data_local_var;
}


void conversion_events_data_inner_custom_data_free(conversion_events_data_inner_custom_data_t *conversion_events_data_inner_custom_data) {
    if(NULL == conversion_events_data_inner_custom_data){
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_events_data_inner_custom_data->currency) {
        free(conversion_events_data_inner_custom_data->currency);
        conversion_events_data_inner_custom_data->currency = NULL;
    }
    if (conversion_events_data_inner_custom_data->value) {
        free(conversion_events_data_inner_custom_data->value);
        conversion_events_data_inner_custom_data->value = NULL;
    }
    if (conversion_events_data_inner_custom_data->content_ids) {
        list_ForEach(listEntry, conversion_events_data_inner_custom_data->content_ids) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_data_inner_custom_data->content_ids);
        conversion_events_data_inner_custom_data->content_ids = NULL;
    }
    if (conversion_events_data_inner_custom_data->content_name) {
        free(conversion_events_data_inner_custom_data->content_name);
        conversion_events_data_inner_custom_data->content_name = NULL;
    }
    if (conversion_events_data_inner_custom_data->content_category) {
        free(conversion_events_data_inner_custom_data->content_category);
        conversion_events_data_inner_custom_data->content_category = NULL;
    }
    if (conversion_events_data_inner_custom_data->content_brand) {
        free(conversion_events_data_inner_custom_data->content_brand);
        conversion_events_data_inner_custom_data->content_brand = NULL;
    }
    if (conversion_events_data_inner_custom_data->contents) {
        list_ForEach(listEntry, conversion_events_data_inner_custom_data->contents) {
            conversion_events_data_inner_custom_data_contents_inner_free(listEntry->data);
        }
        list_freeList(conversion_events_data_inner_custom_data->contents);
        conversion_events_data_inner_custom_data->contents = NULL;
    }
    if (conversion_events_data_inner_custom_data->order_id) {
        free(conversion_events_data_inner_custom_data->order_id);
        conversion_events_data_inner_custom_data->order_id = NULL;
    }
    if (conversion_events_data_inner_custom_data->search_string) {
        free(conversion_events_data_inner_custom_data->search_string);
        conversion_events_data_inner_custom_data->search_string = NULL;
    }
    if (conversion_events_data_inner_custom_data->opt_out_type) {
        free(conversion_events_data_inner_custom_data->opt_out_type);
        conversion_events_data_inner_custom_data->opt_out_type = NULL;
    }
    if (conversion_events_data_inner_custom_data->np) {
        free(conversion_events_data_inner_custom_data->np);
        conversion_events_data_inner_custom_data->np = NULL;
    }
    free(conversion_events_data_inner_custom_data);
}

cJSON *conversion_events_data_inner_custom_data_convertToJSON(conversion_events_data_inner_custom_data_t *conversion_events_data_inner_custom_data) {
    cJSON *item = cJSON_CreateObject();

    // conversion_events_data_inner_custom_data->currency
    if(conversion_events_data_inner_custom_data->currency) {
    if(cJSON_AddStringToObject(item, "currency", conversion_events_data_inner_custom_data->currency) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data->value
    if(conversion_events_data_inner_custom_data->value) {
    if(cJSON_AddStringToObject(item, "value", conversion_events_data_inner_custom_data->value) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data->content_ids
    if(conversion_events_data_inner_custom_data->content_ids) {
    cJSON *content_ids = cJSON_AddArrayToObject(item, "content_ids");
    if(content_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *content_idsListEntry;
    list_ForEach(content_idsListEntry, conversion_events_data_inner_custom_data->content_ids) {
    if(cJSON_AddStringToObject(content_ids, "", (char*)content_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_data_inner_custom_data->content_name
    if(conversion_events_data_inner_custom_data->content_name) {
    if(cJSON_AddStringToObject(item, "content_name", conversion_events_data_inner_custom_data->content_name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data->content_category
    if(conversion_events_data_inner_custom_data->content_category) {
    if(cJSON_AddStringToObject(item, "content_category", conversion_events_data_inner_custom_data->content_category) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data->content_brand
    if(conversion_events_data_inner_custom_data->content_brand) {
    if(cJSON_AddStringToObject(item, "content_brand", conversion_events_data_inner_custom_data->content_brand) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data->contents
    if(conversion_events_data_inner_custom_data->contents) {
    cJSON *contents = cJSON_AddArrayToObject(item, "contents");
    if(contents == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *contentsListEntry;
    if (conversion_events_data_inner_custom_data->contents) {
    list_ForEach(contentsListEntry, conversion_events_data_inner_custom_data->contents) {
    cJSON *itemLocal = conversion_events_data_inner_custom_data_contents_inner_convertToJSON(contentsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(contents, itemLocal);
    }
    }
    }


    // conversion_events_data_inner_custom_data->num_items
    if(conversion_events_data_inner_custom_data->num_items) {
    if(cJSON_AddNumberToObject(item, "num_items", conversion_events_data_inner_custom_data->num_items) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_events_data_inner_custom_data->order_id
    if(conversion_events_data_inner_custom_data->order_id) {
    if(cJSON_AddStringToObject(item, "order_id", conversion_events_data_inner_custom_data->order_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data->search_string
    if(conversion_events_data_inner_custom_data->search_string) {
    if(cJSON_AddStringToObject(item, "search_string", conversion_events_data_inner_custom_data->search_string) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data->opt_out_type
    if(conversion_events_data_inner_custom_data->opt_out_type) {
    if(cJSON_AddStringToObject(item, "opt_out_type", conversion_events_data_inner_custom_data->opt_out_type) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data->np
    if(conversion_events_data_inner_custom_data->np) {
    if(cJSON_AddStringToObject(item, "np", conversion_events_data_inner_custom_data->np) == NULL) {
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

conversion_events_data_inner_custom_data_t *conversion_events_data_inner_custom_data_parseFromJSON(cJSON *conversion_events_data_inner_custom_dataJSON){

    conversion_events_data_inner_custom_data_t *conversion_events_data_inner_custom_data_local_var = NULL;

    // define the local list for conversion_events_data_inner_custom_data->content_ids
    list_t *content_idsList = NULL;

    // define the local list for conversion_events_data_inner_custom_data->contents
    list_t *contentsList = NULL;

    // conversion_events_data_inner_custom_data->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_dataJSON, "currency");
    if (currency) { 
    if(!cJSON_IsString(currency) && !cJSON_IsNull(currency))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_dataJSON, "value");
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data->content_ids
    cJSON *content_ids = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_dataJSON, "content_ids");
    if (content_ids) { 
    cJSON *content_ids_local = NULL;
    if(!cJSON_IsArray(content_ids)) {
        goto end;//primitive container
    }
    content_idsList = list_createList();

    cJSON_ArrayForEach(content_ids_local, content_ids)
    {
        if(!cJSON_IsString(content_ids_local))
        {
            goto end;
        }
        list_addElement(content_idsList , strdup(content_ids_local->valuestring));
    }
    }

    // conversion_events_data_inner_custom_data->content_name
    cJSON *content_name = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_dataJSON, "content_name");
    if (content_name) { 
    if(!cJSON_IsString(content_name) && !cJSON_IsNull(content_name))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data->content_category
    cJSON *content_category = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_dataJSON, "content_category");
    if (content_category) { 
    if(!cJSON_IsString(content_category) && !cJSON_IsNull(content_category))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data->content_brand
    cJSON *content_brand = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_dataJSON, "content_brand");
    if (content_brand) { 
    if(!cJSON_IsString(content_brand) && !cJSON_IsNull(content_brand))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data->contents
    cJSON *contents = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_dataJSON, "contents");
    if (contents) { 
    cJSON *contents_local_nonprimitive = NULL;
    if(!cJSON_IsArray(contents)){
        goto end; //nonprimitive container
    }

    contentsList = list_createList();

    cJSON_ArrayForEach(contents_local_nonprimitive,contents )
    {
        if(!cJSON_IsObject(contents_local_nonprimitive)){
            goto end;
        }
        conversion_events_data_inner_custom_data_contents_inner_t *contentsItem = conversion_events_data_inner_custom_data_contents_inner_parseFromJSON(contents_local_nonprimitive);

        list_addElement(contentsList, contentsItem);
    }
    }

    // conversion_events_data_inner_custom_data->num_items
    cJSON *num_items = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_dataJSON, "num_items");
    if (num_items) { 
    if(!cJSON_IsNumber(num_items))
    {
    goto end; //Numeric
    }
    }

    // conversion_events_data_inner_custom_data->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_dataJSON, "order_id");
    if (order_id) { 
    if(!cJSON_IsString(order_id) && !cJSON_IsNull(order_id))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data->search_string
    cJSON *search_string = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_dataJSON, "search_string");
    if (search_string) { 
    if(!cJSON_IsString(search_string) && !cJSON_IsNull(search_string))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data->opt_out_type
    cJSON *opt_out_type = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_dataJSON, "opt_out_type");
    if (opt_out_type) { 
    if(!cJSON_IsString(opt_out_type) && !cJSON_IsNull(opt_out_type))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data->np
    cJSON *np = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_dataJSON, "np");
    if (np) { 
    if(!cJSON_IsString(np) && !cJSON_IsNull(np))
    {
    goto end; //String
    }
    }


    conversion_events_data_inner_custom_data_local_var = conversion_events_data_inner_custom_data_create (
        currency && !cJSON_IsNull(currency) ? strdup(currency->valuestring) : NULL,
        value && !cJSON_IsNull(value) ? strdup(value->valuestring) : NULL,
        content_ids ? content_idsList : NULL,
        content_name && !cJSON_IsNull(content_name) ? strdup(content_name->valuestring) : NULL,
        content_category && !cJSON_IsNull(content_category) ? strdup(content_category->valuestring) : NULL,
        content_brand && !cJSON_IsNull(content_brand) ? strdup(content_brand->valuestring) : NULL,
        contents ? contentsList : NULL,
        num_items ? num_items->valuedouble : 0,
        order_id && !cJSON_IsNull(order_id) ? strdup(order_id->valuestring) : NULL,
        search_string && !cJSON_IsNull(search_string) ? strdup(search_string->valuestring) : NULL,
        opt_out_type && !cJSON_IsNull(opt_out_type) ? strdup(opt_out_type->valuestring) : NULL,
        np && !cJSON_IsNull(np) ? strdup(np->valuestring) : NULL
        );

    return conversion_events_data_inner_custom_data_local_var;
end:
    if (content_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, content_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(content_idsList);
        content_idsList = NULL;
    }
    if (contentsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, contentsList) {
            conversion_events_data_inner_custom_data_contents_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(contentsList);
        contentsList = NULL;
    }
    return NULL;

}
