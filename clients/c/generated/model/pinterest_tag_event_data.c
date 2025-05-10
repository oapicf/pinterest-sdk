#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pinterest_tag_event_data.h"



static pinterest_tag_event_data_t *pinterest_tag_event_data_create_internal(
    pinterest_rest_api_currency__e currency,
    char *lead_type,
    line_item_t *line_items,
    char *order_id,
    int order_quantity,
    char *page_name,
    char *promo_code,
    char *property,
    char *search_query,
    char *value,
    char *video_title
    ) {
    pinterest_tag_event_data_t *pinterest_tag_event_data_local_var = malloc(sizeof(pinterest_tag_event_data_t));
    if (!pinterest_tag_event_data_local_var) {
        return NULL;
    }
    pinterest_tag_event_data_local_var->currency = currency;
    pinterest_tag_event_data_local_var->lead_type = lead_type;
    pinterest_tag_event_data_local_var->line_items = line_items;
    pinterest_tag_event_data_local_var->order_id = order_id;
    pinterest_tag_event_data_local_var->order_quantity = order_quantity;
    pinterest_tag_event_data_local_var->page_name = page_name;
    pinterest_tag_event_data_local_var->promo_code = promo_code;
    pinterest_tag_event_data_local_var->property = property;
    pinterest_tag_event_data_local_var->search_query = search_query;
    pinterest_tag_event_data_local_var->value = value;
    pinterest_tag_event_data_local_var->video_title = video_title;

    pinterest_tag_event_data_local_var->_library_owned = 1;
    return pinterest_tag_event_data_local_var;
}

__attribute__((deprecated)) pinterest_tag_event_data_t *pinterest_tag_event_data_create(
    pinterest_rest_api_currency__e currency,
    char *lead_type,
    line_item_t *line_items,
    char *order_id,
    int order_quantity,
    char *page_name,
    char *promo_code,
    char *property,
    char *search_query,
    char *value,
    char *video_title
    ) {
    return pinterest_tag_event_data_create_internal (
        currency,
        lead_type,
        line_items,
        order_id,
        order_quantity,
        page_name,
        promo_code,
        property,
        search_query,
        value,
        video_title
        );
}

void pinterest_tag_event_data_free(pinterest_tag_event_data_t *pinterest_tag_event_data) {
    if(NULL == pinterest_tag_event_data){
        return ;
    }
    if(pinterest_tag_event_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pinterest_tag_event_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pinterest_tag_event_data->lead_type) {
        free(pinterest_tag_event_data->lead_type);
        pinterest_tag_event_data->lead_type = NULL;
    }
    if (pinterest_tag_event_data->line_items) {
        line_item_free(pinterest_tag_event_data->line_items);
        pinterest_tag_event_data->line_items = NULL;
    }
    if (pinterest_tag_event_data->order_id) {
        free(pinterest_tag_event_data->order_id);
        pinterest_tag_event_data->order_id = NULL;
    }
    if (pinterest_tag_event_data->page_name) {
        free(pinterest_tag_event_data->page_name);
        pinterest_tag_event_data->page_name = NULL;
    }
    if (pinterest_tag_event_data->promo_code) {
        free(pinterest_tag_event_data->promo_code);
        pinterest_tag_event_data->promo_code = NULL;
    }
    if (pinterest_tag_event_data->property) {
        free(pinterest_tag_event_data->property);
        pinterest_tag_event_data->property = NULL;
    }
    if (pinterest_tag_event_data->search_query) {
        free(pinterest_tag_event_data->search_query);
        pinterest_tag_event_data->search_query = NULL;
    }
    if (pinterest_tag_event_data->value) {
        free(pinterest_tag_event_data->value);
        pinterest_tag_event_data->value = NULL;
    }
    if (pinterest_tag_event_data->video_title) {
        free(pinterest_tag_event_data->video_title);
        pinterest_tag_event_data->video_title = NULL;
    }
    free(pinterest_tag_event_data);
}

cJSON *pinterest_tag_event_data_convertToJSON(pinterest_tag_event_data_t *pinterest_tag_event_data) {
    cJSON *item = cJSON_CreateObject();

    // pinterest_tag_event_data->currency
    if(pinterest_tag_event_data->currency != pinterest_rest_api_currency__NULL) {
    cJSON *currency_local_JSON = currency_convertToJSON(pinterest_tag_event_data->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // pinterest_tag_event_data->lead_type
    if(pinterest_tag_event_data->lead_type) {
    if(cJSON_AddStringToObject(item, "lead_type", pinterest_tag_event_data->lead_type) == NULL) {
    goto fail; //String
    }
    }


    // pinterest_tag_event_data->line_items
    if(pinterest_tag_event_data->line_items) {
    cJSON *line_items_local_JSON = line_item_convertToJSON(pinterest_tag_event_data->line_items);
    if(line_items_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "line_items", line_items_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pinterest_tag_event_data->order_id
    if(pinterest_tag_event_data->order_id) {
    if(cJSON_AddStringToObject(item, "order_id", pinterest_tag_event_data->order_id) == NULL) {
    goto fail; //String
    }
    }


    // pinterest_tag_event_data->order_quantity
    if(pinterest_tag_event_data->order_quantity) {
    if(cJSON_AddNumberToObject(item, "order_quantity", pinterest_tag_event_data->order_quantity) == NULL) {
    goto fail; //Numeric
    }
    }


    // pinterest_tag_event_data->page_name
    if(pinterest_tag_event_data->page_name) {
    if(cJSON_AddStringToObject(item, "page_name", pinterest_tag_event_data->page_name) == NULL) {
    goto fail; //String
    }
    }


    // pinterest_tag_event_data->promo_code
    if(pinterest_tag_event_data->promo_code) {
    if(cJSON_AddStringToObject(item, "promo_code", pinterest_tag_event_data->promo_code) == NULL) {
    goto fail; //String
    }
    }


    // pinterest_tag_event_data->property
    if(pinterest_tag_event_data->property) {
    if(cJSON_AddStringToObject(item, "property", pinterest_tag_event_data->property) == NULL) {
    goto fail; //String
    }
    }


    // pinterest_tag_event_data->search_query
    if(pinterest_tag_event_data->search_query) {
    if(cJSON_AddStringToObject(item, "search_query", pinterest_tag_event_data->search_query) == NULL) {
    goto fail; //String
    }
    }


    // pinterest_tag_event_data->value
    if(pinterest_tag_event_data->value) {
    if(cJSON_AddStringToObject(item, "value", pinterest_tag_event_data->value) == NULL) {
    goto fail; //String
    }
    }


    // pinterest_tag_event_data->video_title
    if(pinterest_tag_event_data->video_title) {
    if(cJSON_AddStringToObject(item, "video_title", pinterest_tag_event_data->video_title) == NULL) {
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

pinterest_tag_event_data_t *pinterest_tag_event_data_parseFromJSON(cJSON *pinterest_tag_event_dataJSON){

    pinterest_tag_event_data_t *pinterest_tag_event_data_local_var = NULL;

    // define the local variable for pinterest_tag_event_data->currency
    pinterest_rest_api_currency__e currency_local_nonprim = 0;

    // define the local variable for pinterest_tag_event_data->line_items
    line_item_t *line_items_local_nonprim = NULL;

    // pinterest_tag_event_data->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (currency) { 
    currency_local_nonprim = currency_parseFromJSON(currency); //custom
    }

    // pinterest_tag_event_data->lead_type
    cJSON *lead_type = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "lead_type");
    if (cJSON_IsNull(lead_type)) {
        lead_type = NULL;
    }
    if (lead_type) { 
    if(!cJSON_IsString(lead_type) && !cJSON_IsNull(lead_type))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->line_items
    cJSON *line_items = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "line_items");
    if (cJSON_IsNull(line_items)) {
        line_items = NULL;
    }
    if (line_items) { 
    line_items_local_nonprim = line_item_parseFromJSON(line_items); //nonprimitive
    }

    // pinterest_tag_event_data->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "order_id");
    if (cJSON_IsNull(order_id)) {
        order_id = NULL;
    }
    if (order_id) { 
    if(!cJSON_IsString(order_id) && !cJSON_IsNull(order_id))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->order_quantity
    cJSON *order_quantity = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "order_quantity");
    if (cJSON_IsNull(order_quantity)) {
        order_quantity = NULL;
    }
    if (order_quantity) { 
    if(!cJSON_IsNumber(order_quantity))
    {
    goto end; //Numeric
    }
    }

    // pinterest_tag_event_data->page_name
    cJSON *page_name = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "page_name");
    if (cJSON_IsNull(page_name)) {
        page_name = NULL;
    }
    if (page_name) { 
    if(!cJSON_IsString(page_name) && !cJSON_IsNull(page_name))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->promo_code
    cJSON *promo_code = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "promo_code");
    if (cJSON_IsNull(promo_code)) {
        promo_code = NULL;
    }
    if (promo_code) { 
    if(!cJSON_IsString(promo_code) && !cJSON_IsNull(promo_code))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->property
    cJSON *property = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "property");
    if (cJSON_IsNull(property)) {
        property = NULL;
    }
    if (property) { 
    if(!cJSON_IsString(property) && !cJSON_IsNull(property))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->search_query
    cJSON *search_query = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "search_query");
    if (cJSON_IsNull(search_query)) {
        search_query = NULL;
    }
    if (search_query) { 
    if(!cJSON_IsString(search_query) && !cJSON_IsNull(search_query))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->video_title
    cJSON *video_title = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "video_title");
    if (cJSON_IsNull(video_title)) {
        video_title = NULL;
    }
    if (video_title) { 
    if(!cJSON_IsString(video_title) && !cJSON_IsNull(video_title))
    {
    goto end; //String
    }
    }


    pinterest_tag_event_data_local_var = pinterest_tag_event_data_create_internal (
        currency ? currency_local_nonprim : 0,
        lead_type && !cJSON_IsNull(lead_type) ? strdup(lead_type->valuestring) : NULL,
        line_items ? line_items_local_nonprim : NULL,
        order_id && !cJSON_IsNull(order_id) ? strdup(order_id->valuestring) : NULL,
        order_quantity ? order_quantity->valuedouble : 0,
        page_name && !cJSON_IsNull(page_name) ? strdup(page_name->valuestring) : NULL,
        promo_code && !cJSON_IsNull(promo_code) ? strdup(promo_code->valuestring) : NULL,
        property && !cJSON_IsNull(property) ? strdup(property->valuestring) : NULL,
        search_query && !cJSON_IsNull(search_query) ? strdup(search_query->valuestring) : NULL,
        value && !cJSON_IsNull(value) ? strdup(value->valuestring) : NULL,
        video_title && !cJSON_IsNull(video_title) ? strdup(video_title->valuestring) : NULL
        );

    return pinterest_tag_event_data_local_var;
end:
    if (currency_local_nonprim) {
        currency_local_nonprim = 0;
    }
    if (line_items_local_nonprim) {
        line_item_free(line_items_local_nonprim);
        line_items_local_nonprim = NULL;
    }
    return NULL;

}
