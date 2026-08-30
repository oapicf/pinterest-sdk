#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_events_data_items_custom_data.h"



static conversion_events_data_items_custom_data_t *conversion_events_data_items_custom_data_create_internal(
    char *content_brand,
    char *content_category,
    list_t *content_ids,
    char *content_name,
    list_t *contents,
    char *currency,
    char *external_measurement_id,
    int *external_measurement_vendor_id,
    char *np,
    long *num_items,
    char *opt_out_type,
    char *order_id,
    char *predicted_ltv,
    char *search_string,
    char *value
    ) {
    conversion_events_data_items_custom_data_t *conversion_events_data_items_custom_data_local_var = malloc(sizeof(conversion_events_data_items_custom_data_t));
    if (!conversion_events_data_items_custom_data_local_var) {
        return NULL;
    }
    memset(conversion_events_data_items_custom_data_local_var, 0, sizeof(conversion_events_data_items_custom_data_t));
    conversion_events_data_items_custom_data_local_var->_library_owned = 1;
    conversion_events_data_items_custom_data_local_var->content_brand = content_brand;
    conversion_events_data_items_custom_data_local_var->content_category = content_category;
    conversion_events_data_items_custom_data_local_var->content_ids = content_ids;
    conversion_events_data_items_custom_data_local_var->content_name = content_name;
    conversion_events_data_items_custom_data_local_var->contents = contents;
    conversion_events_data_items_custom_data_local_var->currency = currency;
    conversion_events_data_items_custom_data_local_var->external_measurement_id = external_measurement_id;
    conversion_events_data_items_custom_data_local_var->external_measurement_vendor_id = external_measurement_vendor_id;
    conversion_events_data_items_custom_data_local_var->np = np;
    conversion_events_data_items_custom_data_local_var->num_items = num_items;
    conversion_events_data_items_custom_data_local_var->opt_out_type = opt_out_type;
    conversion_events_data_items_custom_data_local_var->order_id = order_id;
    conversion_events_data_items_custom_data_local_var->predicted_ltv = predicted_ltv;
    conversion_events_data_items_custom_data_local_var->search_string = search_string;
    conversion_events_data_items_custom_data_local_var->value = value;
    return conversion_events_data_items_custom_data_local_var;
}

__attribute__((deprecated)) conversion_events_data_items_custom_data_t *conversion_events_data_items_custom_data_create(
    char *content_brand,
    char *content_category,
    list_t *content_ids,
    char *content_name,
    list_t *contents,
    char *currency,
    char *external_measurement_id,
    int *external_measurement_vendor_id,
    char *np,
    long *num_items,
    char *opt_out_type,
    char *order_id,
    char *predicted_ltv,
    char *search_string,
    char *value
    ) {
    int *external_measurement_vendor_id_copy = NULL;
    if (external_measurement_vendor_id) {
        external_measurement_vendor_id_copy = malloc(sizeof(int));
        if (external_measurement_vendor_id_copy) *external_measurement_vendor_id_copy = *external_measurement_vendor_id;
    }
    long *num_items_copy = NULL;
    if (num_items) {
        num_items_copy = malloc(sizeof(long));
        if (num_items_copy) *num_items_copy = *num_items;
    }
    conversion_events_data_items_custom_data_t *result = conversion_events_data_items_custom_data_create_internal (
        content_brand,
        content_category,
        content_ids,
        content_name,
        contents,
        currency,
        external_measurement_id,
        external_measurement_vendor_id_copy,
        np,
        num_items_copy,
        opt_out_type,
        order_id,
        predicted_ltv,
        search_string,
        value
        );
    if (!result) {
        free(external_measurement_vendor_id_copy);
        free(num_items_copy);
    }
    return result;
}

void conversion_events_data_items_custom_data_free(conversion_events_data_items_custom_data_t *conversion_events_data_items_custom_data) {
    if(NULL == conversion_events_data_items_custom_data){
        return ;
    }
    if(conversion_events_data_items_custom_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_events_data_items_custom_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_events_data_items_custom_data->content_brand) {
        free(conversion_events_data_items_custom_data->content_brand);
        conversion_events_data_items_custom_data->content_brand = NULL;
    }
    if (conversion_events_data_items_custom_data->content_category) {
        free(conversion_events_data_items_custom_data->content_category);
        conversion_events_data_items_custom_data->content_category = NULL;
    }
    if (conversion_events_data_items_custom_data->content_ids) {
        list_ForEach(listEntry, conversion_events_data_items_custom_data->content_ids) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_data_items_custom_data->content_ids);
        conversion_events_data_items_custom_data->content_ids = NULL;
    }
    if (conversion_events_data_items_custom_data->content_name) {
        free(conversion_events_data_items_custom_data->content_name);
        conversion_events_data_items_custom_data->content_name = NULL;
    }
    if (conversion_events_data_items_custom_data->contents) {
        list_ForEach(listEntry, conversion_events_data_items_custom_data->contents) {
            conversion_events_data_items_custom_data_contents_items_free(listEntry->data);
        }
        list_freeList(conversion_events_data_items_custom_data->contents);
        conversion_events_data_items_custom_data->contents = NULL;
    }
    if (conversion_events_data_items_custom_data->currency) {
        free(conversion_events_data_items_custom_data->currency);
        conversion_events_data_items_custom_data->currency = NULL;
    }
    if (conversion_events_data_items_custom_data->external_measurement_id) {
        free(conversion_events_data_items_custom_data->external_measurement_id);
        conversion_events_data_items_custom_data->external_measurement_id = NULL;
    }
    if (conversion_events_data_items_custom_data->external_measurement_vendor_id) {
        free(conversion_events_data_items_custom_data->external_measurement_vendor_id);
        conversion_events_data_items_custom_data->external_measurement_vendor_id = NULL;
    }
    if (conversion_events_data_items_custom_data->np) {
        free(conversion_events_data_items_custom_data->np);
        conversion_events_data_items_custom_data->np = NULL;
    }
    if (conversion_events_data_items_custom_data->num_items) {
        free(conversion_events_data_items_custom_data->num_items);
        conversion_events_data_items_custom_data->num_items = NULL;
    }
    if (conversion_events_data_items_custom_data->opt_out_type) {
        free(conversion_events_data_items_custom_data->opt_out_type);
        conversion_events_data_items_custom_data->opt_out_type = NULL;
    }
    if (conversion_events_data_items_custom_data->order_id) {
        free(conversion_events_data_items_custom_data->order_id);
        conversion_events_data_items_custom_data->order_id = NULL;
    }
    if (conversion_events_data_items_custom_data->predicted_ltv) {
        free(conversion_events_data_items_custom_data->predicted_ltv);
        conversion_events_data_items_custom_data->predicted_ltv = NULL;
    }
    if (conversion_events_data_items_custom_data->search_string) {
        free(conversion_events_data_items_custom_data->search_string);
        conversion_events_data_items_custom_data->search_string = NULL;
    }
    if (conversion_events_data_items_custom_data->value) {
        free(conversion_events_data_items_custom_data->value);
        conversion_events_data_items_custom_data->value = NULL;
    }
    free(conversion_events_data_items_custom_data);
}

cJSON *conversion_events_data_items_custom_data_convertToJSON(conversion_events_data_items_custom_data_t *conversion_events_data_items_custom_data) {
    cJSON *item = cJSON_CreateObject();

    // conversion_events_data_items_custom_data->content_brand
    if(conversion_events_data_items_custom_data->content_brand) {
    if(cJSON_AddStringToObject(item, "content_brand", conversion_events_data_items_custom_data->content_brand) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data->content_category
    if(conversion_events_data_items_custom_data->content_category) {
    if(cJSON_AddStringToObject(item, "content_category", conversion_events_data_items_custom_data->content_category) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data->content_ids
    if(conversion_events_data_items_custom_data->content_ids) {
    cJSON *content_ids = cJSON_AddArrayToObject(item, "content_ids");
    if(content_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *content_idsListEntry;
    list_ForEach(content_idsListEntry, conversion_events_data_items_custom_data->content_ids) {
    if(cJSON_AddStringToObject(content_ids, "", content_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_data_items_custom_data->content_name
    if(conversion_events_data_items_custom_data->content_name) {
    if(cJSON_AddStringToObject(item, "content_name", conversion_events_data_items_custom_data->content_name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data->contents
    if(conversion_events_data_items_custom_data->contents) {
    cJSON *contents = cJSON_AddArrayToObject(item, "contents");
    if(contents == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *contentsListEntry;
    if (conversion_events_data_items_custom_data->contents) {
    list_ForEach(contentsListEntry, conversion_events_data_items_custom_data->contents) {
    cJSON *itemLocal = conversion_events_data_items_custom_data_contents_items_convertToJSON(contentsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(contents, itemLocal);
    }
    }
    }


    // conversion_events_data_items_custom_data->currency
    if(conversion_events_data_items_custom_data->currency) {
    if(cJSON_AddStringToObject(item, "currency", conversion_events_data_items_custom_data->currency) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data->external_measurement_id
    if(conversion_events_data_items_custom_data->external_measurement_id) {
    if(cJSON_AddStringToObject(item, "external_measurement_id", conversion_events_data_items_custom_data->external_measurement_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data->external_measurement_vendor_id
    if(conversion_events_data_items_custom_data->external_measurement_vendor_id) {
    if(cJSON_AddNumberToObject(item, "external_measurement_vendor_id", *conversion_events_data_items_custom_data->external_measurement_vendor_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_events_data_items_custom_data->np
    if(conversion_events_data_items_custom_data->np) {
    if(cJSON_AddStringToObject(item, "np", conversion_events_data_items_custom_data->np) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data->num_items
    if(conversion_events_data_items_custom_data->num_items) {
    if(cJSON_AddNumberToObject(item, "num_items", *conversion_events_data_items_custom_data->num_items) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_events_data_items_custom_data->opt_out_type
    if(conversion_events_data_items_custom_data->opt_out_type) {
    if(cJSON_AddStringToObject(item, "opt_out_type", conversion_events_data_items_custom_data->opt_out_type) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data->order_id
    if(conversion_events_data_items_custom_data->order_id) {
    if(cJSON_AddStringToObject(item, "order_id", conversion_events_data_items_custom_data->order_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data->predicted_ltv
    if(conversion_events_data_items_custom_data->predicted_ltv) {
    if(cJSON_AddStringToObject(item, "predicted_ltv", conversion_events_data_items_custom_data->predicted_ltv) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data->search_string
    if(conversion_events_data_items_custom_data->search_string) {
    if(cJSON_AddStringToObject(item, "search_string", conversion_events_data_items_custom_data->search_string) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data->value
    if(conversion_events_data_items_custom_data->value) {
    if(cJSON_AddStringToObject(item, "value", conversion_events_data_items_custom_data->value) == NULL) {
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

conversion_events_data_items_custom_data_t *conversion_events_data_items_custom_data_parseFromJSON(cJSON *conversion_events_data_items_custom_dataJSON){

    conversion_events_data_items_custom_data_t *conversion_events_data_items_custom_data_local_var = NULL;

    char *content_brand_local_str = NULL;

    char *content_category_local_str = NULL;

    // define the local list for conversion_events_data_items_custom_data->content_ids
    list_t *content_idsList = NULL;

    char *content_name_local_str = NULL;

    // define the local list for conversion_events_data_items_custom_data->contents
    list_t *contentsList = NULL;

    char *currency_local_str = NULL;

    char *external_measurement_id_local_str = NULL;

    // define the local variable for conversion_events_data_items_custom_data->external_measurement_vendor_id
    int *external_measurement_vendor_id_local_var = NULL;

    char *np_local_str = NULL;

    // define the local variable for conversion_events_data_items_custom_data->num_items
    long *num_items_local_var = NULL;

    char *opt_out_type_local_str = NULL;

    char *order_id_local_str = NULL;

    char *predicted_ltv_local_str = NULL;

    char *search_string_local_str = NULL;

    char *value_local_str = NULL;

    // conversion_events_data_items_custom_data->content_brand
    cJSON *content_brand = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "content_brand");
    if (cJSON_IsNull(content_brand)) {
        content_brand = NULL;
    }
    if (content_brand) { 
    if(!cJSON_IsString(content_brand) && !cJSON_IsNull(content_brand))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data->content_category
    cJSON *content_category = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "content_category");
    if (cJSON_IsNull(content_category)) {
        content_category = NULL;
    }
    if (content_category) { 
    if(!cJSON_IsString(content_category) && !cJSON_IsNull(content_category))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data->content_ids
    cJSON *content_ids = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "content_ids");
    if (cJSON_IsNull(content_ids)) {
        content_ids = NULL;
    }
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

    // conversion_events_data_items_custom_data->content_name
    cJSON *content_name = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "content_name");
    if (cJSON_IsNull(content_name)) {
        content_name = NULL;
    }
    if (content_name) { 
    if(!cJSON_IsString(content_name) && !cJSON_IsNull(content_name))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data->contents
    cJSON *contents = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "contents");
    if (cJSON_IsNull(contents)) {
        contents = NULL;
    }
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
        conversion_events_data_items_custom_data_contents_items_t *contentsItem = conversion_events_data_items_custom_data_contents_items_parseFromJSON(contents_local_nonprimitive);

        list_addElement(contentsList, contentsItem);
    }
    }

    // conversion_events_data_items_custom_data->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (currency) { 
    if(!cJSON_IsString(currency) && !cJSON_IsNull(currency))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data->external_measurement_id
    cJSON *external_measurement_id = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "external_measurement_id");
    if (cJSON_IsNull(external_measurement_id)) {
        external_measurement_id = NULL;
    }
    if (external_measurement_id) { 
    if(!cJSON_IsString(external_measurement_id) && !cJSON_IsNull(external_measurement_id))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data->external_measurement_vendor_id
    cJSON *external_measurement_vendor_id = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "external_measurement_vendor_id");
    if (cJSON_IsNull(external_measurement_vendor_id)) {
        external_measurement_vendor_id = NULL;
    }
    if (external_measurement_vendor_id) { 
    if(!cJSON_IsNumber(external_measurement_vendor_id))
    {
    goto end; //Numeric
    }
    external_measurement_vendor_id_local_var = malloc(sizeof(int));
    if(!external_measurement_vendor_id_local_var)
    {
        goto end;
    }
    *external_measurement_vendor_id_local_var = external_measurement_vendor_id->valuedouble;
    }

    // conversion_events_data_items_custom_data->np
    cJSON *np = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "np");
    if (cJSON_IsNull(np)) {
        np = NULL;
    }
    if (np) { 
    if(!cJSON_IsString(np) && !cJSON_IsNull(np))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data->num_items
    cJSON *num_items = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "num_items");
    if (cJSON_IsNull(num_items)) {
        num_items = NULL;
    }
    if (num_items) { 
    if(!cJSON_IsNumber(num_items))
    {
    goto end; //Numeric
    }
    num_items_local_var = malloc(sizeof(long));
    if(!num_items_local_var)
    {
        goto end;
    }
    *num_items_local_var = num_items->valuedouble;
    }

    // conversion_events_data_items_custom_data->opt_out_type
    cJSON *opt_out_type = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "opt_out_type");
    if (cJSON_IsNull(opt_out_type)) {
        opt_out_type = NULL;
    }
    if (opt_out_type) { 
    if(!cJSON_IsString(opt_out_type) && !cJSON_IsNull(opt_out_type))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "order_id");
    if (cJSON_IsNull(order_id)) {
        order_id = NULL;
    }
    if (order_id) { 
    if(!cJSON_IsString(order_id) && !cJSON_IsNull(order_id))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data->predicted_ltv
    cJSON *predicted_ltv = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "predicted_ltv");
    if (cJSON_IsNull(predicted_ltv)) {
        predicted_ltv = NULL;
    }
    if (predicted_ltv) { 
    if(!cJSON_IsString(predicted_ltv) && !cJSON_IsNull(predicted_ltv))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data->search_string
    cJSON *search_string = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "search_string");
    if (cJSON_IsNull(search_string)) {
        search_string = NULL;
    }
    if (search_string) { 
    if(!cJSON_IsString(search_string) && !cJSON_IsNull(search_string))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_dataJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }


    if (content_brand && !cJSON_IsNull(content_brand)) content_brand_local_str = strdup(content_brand->valuestring);
    if (content_category && !cJSON_IsNull(content_category)) content_category_local_str = strdup(content_category->valuestring);
    if (content_name && !cJSON_IsNull(content_name)) content_name_local_str = strdup(content_name->valuestring);
    if (currency && !cJSON_IsNull(currency)) currency_local_str = strdup(currency->valuestring);
    if (external_measurement_id && !cJSON_IsNull(external_measurement_id)) external_measurement_id_local_str = strdup(external_measurement_id->valuestring);
    if (np && !cJSON_IsNull(np)) np_local_str = strdup(np->valuestring);
    if (opt_out_type && !cJSON_IsNull(opt_out_type)) opt_out_type_local_str = strdup(opt_out_type->valuestring);
    if (order_id && !cJSON_IsNull(order_id)) order_id_local_str = strdup(order_id->valuestring);
    if (predicted_ltv && !cJSON_IsNull(predicted_ltv)) predicted_ltv_local_str = strdup(predicted_ltv->valuestring);
    if (search_string && !cJSON_IsNull(search_string)) search_string_local_str = strdup(search_string->valuestring);
    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);

    conversion_events_data_items_custom_data_local_var = conversion_events_data_items_custom_data_create_internal (
        content_brand_local_str,
        content_category_local_str,
        content_ids ? content_idsList : NULL,
        content_name_local_str,
        contents ? contentsList : NULL,
        currency_local_str,
        external_measurement_id_local_str,
        external_measurement_vendor_id_local_var,
        np_local_str,
        num_items_local_var,
        opt_out_type_local_str,
        order_id_local_str,
        predicted_ltv_local_str,
        search_string_local_str,
        value_local_str
        );

    if (!conversion_events_data_items_custom_data_local_var) {
        goto end;
    }

    return conversion_events_data_items_custom_data_local_var;
end:
    if (content_brand_local_str) {
        free(content_brand_local_str);
        content_brand_local_str = NULL;
    }
    if (content_category_local_str) {
        free(content_category_local_str);
        content_category_local_str = NULL;
    }
    if (content_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, content_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(content_idsList);
        content_idsList = NULL;
    }
    if (content_name_local_str) {
        free(content_name_local_str);
        content_name_local_str = NULL;
    }
    if (contentsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, contentsList) {
            conversion_events_data_items_custom_data_contents_items_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(contentsList);
        contentsList = NULL;
    }
    if (currency_local_str) {
        free(currency_local_str);
        currency_local_str = NULL;
    }
    if (external_measurement_id_local_str) {
        free(external_measurement_id_local_str);
        external_measurement_id_local_str = NULL;
    }
    if (external_measurement_vendor_id_local_var) {
        free(external_measurement_vendor_id_local_var);
        external_measurement_vendor_id_local_var = NULL;
    }
    if (np_local_str) {
        free(np_local_str);
        np_local_str = NULL;
    }
    if (num_items_local_var) {
        free(num_items_local_var);
        num_items_local_var = NULL;
    }
    if (opt_out_type_local_str) {
        free(opt_out_type_local_str);
        opt_out_type_local_str = NULL;
    }
    if (order_id_local_str) {
        free(order_id_local_str);
        order_id_local_str = NULL;
    }
    if (predicted_ltv_local_str) {
        free(predicted_ltv_local_str);
        predicted_ltv_local_str = NULL;
    }
    if (search_string_local_str) {
        free(search_string_local_str);
        search_string_local_str = NULL;
    }
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    return NULL;

}
