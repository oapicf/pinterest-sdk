#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pinterest_tag_event_data.h"


char* pinterest_tag_event_data_currency_ToString(pinterest_rest_api_pinterest_tag_event_data__e currency) {
    char* currencyArray[] =  { "NULL", "UNK", "USD", "GBP", "CAD", "EUR", "AUD", "NZD", "SEK", "ILS", "CHF", "HKD", "JPY", "SGD", "KRW", "NOK", "DKK", "PLN", "RON", "HUF", "CZK", "BRL", "MXN", "ARS", "CLP", "COP" };
    return currencyArray[currency];
}

pinterest_rest_api_pinterest_tag_event_data__e pinterest_tag_event_data_currency_FromString(char* currency){
    int stringToReturn = 0;
    char *currencyArray[] =  { "NULL", "UNK", "USD", "GBP", "CAD", "EUR", "AUD", "NZD", "SEK", "ILS", "CHF", "HKD", "JPY", "SGD", "KRW", "NOK", "DKK", "PLN", "RON", "HUF", "CZK", "BRL", "MXN", "ARS", "CLP", "COP" };
    size_t sizeofArray = sizeof(currencyArray) / sizeof(currencyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(currency, currencyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

pinterest_tag_event_data_t *pinterest_tag_event_data_create(
    currency_t *currency,
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

    return pinterest_tag_event_data_local_var;
}


void pinterest_tag_event_data_free(pinterest_tag_event_data_t *pinterest_tag_event_data) {
    if(NULL == pinterest_tag_event_data){
        return ;
    }
    listEntry_t *listEntry;
    if (pinterest_tag_event_data->currency) {
        currency_free(pinterest_tag_event_data->currency);
        pinterest_tag_event_data->currency = NULL;
    }
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
    if(pinterest_tag_event_data->currency != pinterest_rest_api_pinterest_tag_event_data__NULL) {
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
    currency_t *currency_local_nonprim = NULL;

    // define the local variable for pinterest_tag_event_data->line_items
    line_item_t *line_items_local_nonprim = NULL;

    // pinterest_tag_event_data->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "currency");
    if (currency) { 
    currency_local_nonprim = currency_parseFromJSON(currency); //custom
    }

    // pinterest_tag_event_data->lead_type
    cJSON *lead_type = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "lead_type");
    if (lead_type) { 
    if(!cJSON_IsString(lead_type) && !cJSON_IsNull(lead_type))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->line_items
    cJSON *line_items = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "line_items");
    if (line_items) { 
    line_items_local_nonprim = line_item_parseFromJSON(line_items); //nonprimitive
    }

    // pinterest_tag_event_data->order_id
    cJSON *order_id = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "order_id");
    if (order_id) { 
    if(!cJSON_IsString(order_id) && !cJSON_IsNull(order_id))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->order_quantity
    cJSON *order_quantity = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "order_quantity");
    if (order_quantity) { 
    if(!cJSON_IsNumber(order_quantity))
    {
    goto end; //Numeric
    }
    }

    // pinterest_tag_event_data->page_name
    cJSON *page_name = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "page_name");
    if (page_name) { 
    if(!cJSON_IsString(page_name) && !cJSON_IsNull(page_name))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->promo_code
    cJSON *promo_code = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "promo_code");
    if (promo_code) { 
    if(!cJSON_IsString(promo_code) && !cJSON_IsNull(promo_code))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->property
    cJSON *property = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "property");
    if (property) { 
    if(!cJSON_IsString(property) && !cJSON_IsNull(property))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->search_query
    cJSON *search_query = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "search_query");
    if (search_query) { 
    if(!cJSON_IsString(search_query) && !cJSON_IsNull(search_query))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "value");
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }

    // pinterest_tag_event_data->video_title
    cJSON *video_title = cJSON_GetObjectItemCaseSensitive(pinterest_tag_event_dataJSON, "video_title");
    if (video_title) { 
    if(!cJSON_IsString(video_title) && !cJSON_IsNull(video_title))
    {
    goto end; //String
    }
    }


    pinterest_tag_event_data_local_var = pinterest_tag_event_data_create (
        currency ? currency_local_nonprim : NULL,
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
        currency_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    if (line_items_local_nonprim) {
        line_item_free(line_items_local_nonprim);
        line_items_local_nonprim = NULL;
    }
    return NULL;

}
