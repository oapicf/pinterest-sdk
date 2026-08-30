#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "event_data.h"



static event_data_t *event_data_create_internal(
    currency_t *currency,
    char *lead_type,
    line_item_t *line_items,
    char *order_id,
    int *order_quantity,
    char *page_name,
    char *promo_code,
    char *property,
    char *search_query,
    char *value,
    char *video_title
    ) {
    event_data_t *event_data_local_var = malloc(sizeof(event_data_t));
    if (!event_data_local_var) {
        return NULL;
    }
    memset(event_data_local_var, 0, sizeof(event_data_t));
    event_data_local_var->_library_owned = 1;
    event_data_local_var->currency = currency;
    event_data_local_var->lead_type = lead_type;
    event_data_local_var->line_items = line_items;
    event_data_local_var->order_id = order_id;
    event_data_local_var->order_quantity = order_quantity;
    event_data_local_var->page_name = page_name;
    event_data_local_var->promo_code = promo_code;
    event_data_local_var->property = property;
    event_data_local_var->search_query = search_query;
    event_data_local_var->value = value;
    event_data_local_var->video_title = video_title;
    return event_data_local_var;
}

__attribute__((deprecated)) event_data_t *event_data_create(
    currency_t *currency,
    char *lead_type,
    line_item_t *line_items,
    char *order_id,
    int *order_quantity,
    char *page_name,
    char *promo_code,
    char *property,
    char *search_query,
    char *value,
    char *video_title
    ) {
    int *order_quantity_copy = NULL;
    if (order_quantity) {
        order_quantity_copy = malloc(sizeof(int));
        if (order_quantity_copy) *order_quantity_copy = *order_quantity;
    }
    event_data_t *result = event_data_create_internal (
        currency,
        lead_type,
        line_items,
        order_id,
        order_quantity_copy,
        page_name,
        promo_code,
        property,
        search_query,
        value,
        video_title
        );
    if (!result) {
        free(order_quantity_copy);
    }
    return result;
}

void event_data_free(event_data_t *event_data) {
    if(NULL == event_data){
        return ;
    }
    if(event_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "event_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (event_data->currency) {
        currency_free(event_data->currency);
        event_data->currency = NULL;
    }
    if (event_data->lead_type) {
        free(event_data->lead_type);
        event_data->lead_type = NULL;
    }
    if (event_data->line_items) {
        line_item_free(event_data->line_items);
        event_data->line_items = NULL;
    }
    if (event_data->order_id) {
        free(event_data->order_id);
        event_data->order_id = NULL;
    }
    if (event_data->order_quantity) {
        free(event_data->order_quantity);
        event_data->order_quantity = NULL;
    }
    if (event_data->page_name) {
        free(event_data->page_name);
        event_data->page_name = NULL;
    }
    if (event_data->promo_code) {
        free(event_data->promo_code);
        event_data->promo_code = NULL;
    }
    if (event_data->property) {
        free(event_data->property);
        event_data->property = NULL;
    }
    if (event_data->search_query) {
        free(event_data->search_query);
        event_data->search_query = NULL;
    }
    if (event_data->value) {
        free(event_data->value);
        event_data->value = NULL;
    }
    if (event_data->video_title) {
        free(event_data->video_title);
        event_data->video_title = NULL;
    }
    free(event_data);
}

cJSON *event_data_convertToJSON(event_data_t *event_data) {
    cJSON *item = cJSON_CreateObject();

    // event_data->currency
    if(event_data->currency) {
    cJSON *currency_local_JSON = currency_convertToJSON(event_data->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // event_data->lead_type
    if(event_data->lead_type) {
    if(cJSON_AddStringToObject(item, "lead_type", event_data->lead_type) == NULL) {
    goto fail; //String
    }
    }


    // event_data->line_items
    if(event_data->line_items) {
    cJSON *line_items_local_JSON = line_item_convertToJSON(event_data->line_items);
    if(line_items_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "line_items", line_items_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // event_data->order_id
    if(event_data->order_id) {
    if(cJSON_AddStringToObject(item, "order_id", event_data->order_id) == NULL) {
    goto fail; //String
    }
    }


    // event_data->order_quantity
    if(event_data->order_quantity) {
    if(cJSON_AddNumberToObject(item, "order_quantity", *event_data->order_quantity) == NULL) {
    goto fail; //Numeric
    }
    }


    // event_data->page_name
    if(event_data->page_name) {
    if(cJSON_AddStringToObject(item, "page_name", event_data->page_name) == NULL) {
    goto fail; //String
    }
    }


    // event_data->promo_code
    if(event_data->promo_code) {
    if(cJSON_AddStringToObject(item, "promo_code", event_data->promo_code) == NULL) {
    goto fail; //String
    }
    }


    // event_data->property
    if(event_data->property) {
    if(cJSON_AddStringToObject(item, "property", event_data->property) == NULL) {
    goto fail; //String
    }
    }


    // event_data->search_query
    if(event_data->search_query) {
    if(cJSON_AddStringToObject(item, "search_query", event_data->search_query) == NULL) {
    goto fail; //String
    }
    }


    // event_data->value
    if(event_data->value) {
    if(cJSON_AddStringToObject(item, "value", event_data->value) == NULL) {
    goto fail; //String
    }
    }


    // event_data->video_title
    if(event_data->video_title) {
    if(cJSON_AddStringToObject(item, "video_title", event_data->video_title) == NULL) {
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

event_data_t *event_data_parseFromJSON(cJSON *event_dataJSON){

    event_data_t *event_data_local_var = NULL;

    // define the local variable for event_data->currency
    currency_t *currency_local_nonprim = NULL;

    char *lead_type_local_str = NULL;

    // define the local variable for event_data->line_items
    line_item_t *line_items_local_nonprim = NULL;

    char *order_id_local_str = NULL;

    // define the local variable for event_data->order_quantity
    int *order_quantity_local_var = NULL;

    char *page_name_local_str = NULL;

    char *promo_code_local_str = NULL;

    char *property_local_str = NULL;

    char *search_query_local_str = NULL;

    char *value_local_str = NULL;

    char *video_title_local_str = NULL;

    // event_data->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(event_dataJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (currency) { 
    currency_local_nonprim = currency_parseFromJSON(currency); //custom
    }

    // event_data->lead_type
    cJSON *lead_type = cJSON_GetObjectItemCaseSensitive(event_dataJSON, "lead_type");
    if (cJSON_IsNull(lead_type)) {
        lead_type = NULL;
    }
    if (lead_type) { 
    if(!cJSON_IsString(lead_type) && !cJSON_IsNull(lead_type))
    {
    goto end; //String
    }
    }

    // event_data->line_items
    cJSON *line_items = cJSON_GetObjectItemCaseSensitive(event_dataJSON, "line_items");
    if (cJSON_IsNull(line_items)) {
        line_items = NULL;
    }
    if (line_items) { 
    line_items_local_nonprim = line_item_parseFromJSON(line_items); //nonprimitive
    }

    // event_data->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(event_dataJSON, "order_id");
    if (cJSON_IsNull(order_id)) {
        order_id = NULL;
    }
    if (order_id) { 
    if(!cJSON_IsString(order_id) && !cJSON_IsNull(order_id))
    {
    goto end; //String
    }
    }

    // event_data->order_quantity
    cJSON *order_quantity = cJSON_GetObjectItemCaseSensitive(event_dataJSON, "order_quantity");
    if (cJSON_IsNull(order_quantity)) {
        order_quantity = NULL;
    }
    if (order_quantity) { 
    if(!cJSON_IsNumber(order_quantity))
    {
    goto end; //Numeric
    }
    order_quantity_local_var = malloc(sizeof(int));
    if(!order_quantity_local_var)
    {
        goto end;
    }
    *order_quantity_local_var = order_quantity->valuedouble;
    }

    // event_data->page_name
    cJSON *page_name = cJSON_GetObjectItemCaseSensitive(event_dataJSON, "page_name");
    if (cJSON_IsNull(page_name)) {
        page_name = NULL;
    }
    if (page_name) { 
    if(!cJSON_IsString(page_name) && !cJSON_IsNull(page_name))
    {
    goto end; //String
    }
    }

    // event_data->promo_code
    cJSON *promo_code = cJSON_GetObjectItemCaseSensitive(event_dataJSON, "promo_code");
    if (cJSON_IsNull(promo_code)) {
        promo_code = NULL;
    }
    if (promo_code) { 
    if(!cJSON_IsString(promo_code) && !cJSON_IsNull(promo_code))
    {
    goto end; //String
    }
    }

    // event_data->property
    cJSON *property = cJSON_GetObjectItemCaseSensitive(event_dataJSON, "property");
    if (cJSON_IsNull(property)) {
        property = NULL;
    }
    if (property) { 
    if(!cJSON_IsString(property) && !cJSON_IsNull(property))
    {
    goto end; //String
    }
    }

    // event_data->search_query
    cJSON *search_query = cJSON_GetObjectItemCaseSensitive(event_dataJSON, "search_query");
    if (cJSON_IsNull(search_query)) {
        search_query = NULL;
    }
    if (search_query) { 
    if(!cJSON_IsString(search_query) && !cJSON_IsNull(search_query))
    {
    goto end; //String
    }
    }

    // event_data->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(event_dataJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }

    // event_data->video_title
    cJSON *video_title = cJSON_GetObjectItemCaseSensitive(event_dataJSON, "video_title");
    if (cJSON_IsNull(video_title)) {
        video_title = NULL;
    }
    if (video_title) { 
    if(!cJSON_IsString(video_title) && !cJSON_IsNull(video_title))
    {
    goto end; //String
    }
    }


    if (lead_type && !cJSON_IsNull(lead_type)) lead_type_local_str = strdup(lead_type->valuestring);
    if (order_id && !cJSON_IsNull(order_id)) order_id_local_str = strdup(order_id->valuestring);
    if (page_name && !cJSON_IsNull(page_name)) page_name_local_str = strdup(page_name->valuestring);
    if (promo_code && !cJSON_IsNull(promo_code)) promo_code_local_str = strdup(promo_code->valuestring);
    if (property && !cJSON_IsNull(property)) property_local_str = strdup(property->valuestring);
    if (search_query && !cJSON_IsNull(search_query)) search_query_local_str = strdup(search_query->valuestring);
    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);
    if (video_title && !cJSON_IsNull(video_title)) video_title_local_str = strdup(video_title->valuestring);

    event_data_local_var = event_data_create_internal (
        currency ? currency_local_nonprim : NULL,
        lead_type_local_str,
        line_items ? line_items_local_nonprim : NULL,
        order_id_local_str,
        order_quantity_local_var,
        page_name_local_str,
        promo_code_local_str,
        property_local_str,
        search_query_local_str,
        value_local_str,
        video_title_local_str
        );

    if (!event_data_local_var) {
        goto end;
    }

    return event_data_local_var;
end:
    if (currency_local_nonprim) {
        currency_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    if (lead_type_local_str) {
        free(lead_type_local_str);
        lead_type_local_str = NULL;
    }
    if (line_items_local_nonprim) {
        line_item_free(line_items_local_nonprim);
        line_items_local_nonprim = NULL;
    }
    if (order_id_local_str) {
        free(order_id_local_str);
        order_id_local_str = NULL;
    }
    if (order_quantity_local_var) {
        free(order_quantity_local_var);
        order_quantity_local_var = NULL;
    }
    if (page_name_local_str) {
        free(page_name_local_str);
        page_name_local_str = NULL;
    }
    if (promo_code_local_str) {
        free(promo_code_local_str);
        promo_code_local_str = NULL;
    }
    if (property_local_str) {
        free(property_local_str);
        property_local_str = NULL;
    }
    if (search_query_local_str) {
        free(search_query_local_str);
        search_query_local_str = NULL;
    }
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    if (video_title_local_str) {
        free(video_title_local_str);
        video_title_local_str = NULL;
    }
    return NULL;

}
