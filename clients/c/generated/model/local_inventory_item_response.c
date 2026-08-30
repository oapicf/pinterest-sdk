#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "local_inventory_item_response.h"



static local_inventory_item_response_t *local_inventory_item_response_create_internal(
    char *ad_link,
    item_availability_t *availability,
    long *created_at,
    char *item_id,
    long *last_updated_time,
    char *price,
    char *sale_price,
    store_metadata_t *store_metadata
    ) {
    local_inventory_item_response_t *local_inventory_item_response_local_var = malloc(sizeof(local_inventory_item_response_t));
    if (!local_inventory_item_response_local_var) {
        return NULL;
    }
    memset(local_inventory_item_response_local_var, 0, sizeof(local_inventory_item_response_t));
    local_inventory_item_response_local_var->_library_owned = 1;
    local_inventory_item_response_local_var->ad_link = ad_link;
    local_inventory_item_response_local_var->availability = availability;
    local_inventory_item_response_local_var->created_at = created_at;
    local_inventory_item_response_local_var->item_id = item_id;
    local_inventory_item_response_local_var->last_updated_time = last_updated_time;
    local_inventory_item_response_local_var->price = price;
    local_inventory_item_response_local_var->sale_price = sale_price;
    local_inventory_item_response_local_var->store_metadata = store_metadata;
    return local_inventory_item_response_local_var;
}

__attribute__((deprecated)) local_inventory_item_response_t *local_inventory_item_response_create(
    char *ad_link,
    item_availability_t *availability,
    long *created_at,
    char *item_id,
    long *last_updated_time,
    char *price,
    char *sale_price,
    store_metadata_t *store_metadata
    ) {
    long *created_at_copy = NULL;
    if (created_at) {
        created_at_copy = malloc(sizeof(long));
        if (created_at_copy) *created_at_copy = *created_at;
    }
    long *last_updated_time_copy = NULL;
    if (last_updated_time) {
        last_updated_time_copy = malloc(sizeof(long));
        if (last_updated_time_copy) *last_updated_time_copy = *last_updated_time;
    }
    local_inventory_item_response_t *result = local_inventory_item_response_create_internal (
        ad_link,
        availability,
        created_at_copy,
        item_id,
        last_updated_time_copy,
        price,
        sale_price,
        store_metadata
        );
    if (!result) {
        free(created_at_copy);
        free(last_updated_time_copy);
    }
    return result;
}

void local_inventory_item_response_free(local_inventory_item_response_t *local_inventory_item_response) {
    if(NULL == local_inventory_item_response){
        return ;
    }
    if(local_inventory_item_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "local_inventory_item_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (local_inventory_item_response->ad_link) {
        free(local_inventory_item_response->ad_link);
        local_inventory_item_response->ad_link = NULL;
    }
    if (local_inventory_item_response->availability) {
        item_availability_free(local_inventory_item_response->availability);
        local_inventory_item_response->availability = NULL;
    }
    if (local_inventory_item_response->created_at) {
        free(local_inventory_item_response->created_at);
        local_inventory_item_response->created_at = NULL;
    }
    if (local_inventory_item_response->item_id) {
        free(local_inventory_item_response->item_id);
        local_inventory_item_response->item_id = NULL;
    }
    if (local_inventory_item_response->last_updated_time) {
        free(local_inventory_item_response->last_updated_time);
        local_inventory_item_response->last_updated_time = NULL;
    }
    if (local_inventory_item_response->price) {
        free(local_inventory_item_response->price);
        local_inventory_item_response->price = NULL;
    }
    if (local_inventory_item_response->sale_price) {
        free(local_inventory_item_response->sale_price);
        local_inventory_item_response->sale_price = NULL;
    }
    if (local_inventory_item_response->store_metadata) {
        store_metadata_free(local_inventory_item_response->store_metadata);
        local_inventory_item_response->store_metadata = NULL;
    }
    free(local_inventory_item_response);
}

cJSON *local_inventory_item_response_convertToJSON(local_inventory_item_response_t *local_inventory_item_response) {
    cJSON *item = cJSON_CreateObject();

    // local_inventory_item_response->ad_link
    if(local_inventory_item_response->ad_link) {
    if(cJSON_AddStringToObject(item, "ad_link", local_inventory_item_response->ad_link) == NULL) {
    goto fail; //String
    }
    }


    // local_inventory_item_response->availability
    if(local_inventory_item_response->availability) {
    cJSON *availability_local_JSON = item_availability_convertToJSON(local_inventory_item_response->availability);
    if(availability_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "availability", availability_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // local_inventory_item_response->created_at
    if (!local_inventory_item_response->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", *local_inventory_item_response->created_at) == NULL) {
    goto fail; //Numeric
    }


    // local_inventory_item_response->item_id
    if (!local_inventory_item_response->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", local_inventory_item_response->item_id) == NULL) {
    goto fail; //String
    }


    // local_inventory_item_response->last_updated_time
    if (!local_inventory_item_response->last_updated_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "last_updated_time", *local_inventory_item_response->last_updated_time) == NULL) {
    goto fail; //Numeric
    }


    // local_inventory_item_response->price
    if(local_inventory_item_response->price) {
    if(cJSON_AddStringToObject(item, "price", local_inventory_item_response->price) == NULL) {
    goto fail; //String
    }
    }


    // local_inventory_item_response->sale_price
    if(local_inventory_item_response->sale_price) {
    if(cJSON_AddStringToObject(item, "sale_price", local_inventory_item_response->sale_price) == NULL) {
    goto fail; //String
    }
    }


    // local_inventory_item_response->store_metadata
    if (!local_inventory_item_response->store_metadata) {
        goto fail;
    }
    cJSON *store_metadata_local_JSON = store_metadata_convertToJSON(local_inventory_item_response->store_metadata);
    if(store_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "store_metadata", store_metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

local_inventory_item_response_t *local_inventory_item_response_parseFromJSON(cJSON *local_inventory_item_responseJSON){

    local_inventory_item_response_t *local_inventory_item_response_local_var = NULL;

    char *ad_link_local_str = NULL;

    // define the local variable for local_inventory_item_response->availability
    item_availability_t *availability_local_nonprim = NULL;

    // define the local variable for local_inventory_item_response->created_at
    long *created_at_local_var = NULL;

    char *item_id_local_str = NULL;

    // define the local variable for local_inventory_item_response->last_updated_time
    long *last_updated_time_local_var = NULL;

    char *price_local_str = NULL;

    char *sale_price_local_str = NULL;

    // define the local variable for local_inventory_item_response->store_metadata
    store_metadata_t *store_metadata_local_nonprim = NULL;

    // local_inventory_item_response->ad_link
    cJSON *ad_link = cJSON_GetObjectItemCaseSensitive(local_inventory_item_responseJSON, "ad_link");
    if (cJSON_IsNull(ad_link)) {
        ad_link = NULL;
    }
    if (ad_link) { 
    if(!cJSON_IsString(ad_link) && !cJSON_IsNull(ad_link))
    {
    goto end; //String
    }
    }

    // local_inventory_item_response->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(local_inventory_item_responseJSON, "availability");
    if (cJSON_IsNull(availability)) {
        availability = NULL;
    }
    if (availability) { 
    availability_local_nonprim = item_availability_parseFromJSON(availability); //custom
    }

    // local_inventory_item_response->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(local_inventory_item_responseJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }
    created_at_local_var = malloc(sizeof(long));
    if(!created_at_local_var)
    {
        goto end;
    }
    *created_at_local_var = created_at->valuedouble;

    // local_inventory_item_response->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(local_inventory_item_responseJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (!item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_id))
    {
    goto end; //String
    }

    // local_inventory_item_response->last_updated_time
    cJSON *last_updated_time = cJSON_GetObjectItemCaseSensitive(local_inventory_item_responseJSON, "last_updated_time");
    if (cJSON_IsNull(last_updated_time)) {
        last_updated_time = NULL;
    }
    if (!last_updated_time) {
        goto end;
    }

    
    if(!cJSON_IsNumber(last_updated_time))
    {
    goto end; //Numeric
    }
    last_updated_time_local_var = malloc(sizeof(long));
    if(!last_updated_time_local_var)
    {
        goto end;
    }
    *last_updated_time_local_var = last_updated_time->valuedouble;

    // local_inventory_item_response->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(local_inventory_item_responseJSON, "price");
    if (cJSON_IsNull(price)) {
        price = NULL;
    }
    if (price) { 
    if(!cJSON_IsString(price) && !cJSON_IsNull(price))
    {
    goto end; //String
    }
    }

    // local_inventory_item_response->sale_price
    cJSON *sale_price = cJSON_GetObjectItemCaseSensitive(local_inventory_item_responseJSON, "sale_price");
    if (cJSON_IsNull(sale_price)) {
        sale_price = NULL;
    }
    if (sale_price) { 
    if(!cJSON_IsString(sale_price) && !cJSON_IsNull(sale_price))
    {
    goto end; //String
    }
    }

    // local_inventory_item_response->store_metadata
    cJSON *store_metadata = cJSON_GetObjectItemCaseSensitive(local_inventory_item_responseJSON, "store_metadata");
    if (cJSON_IsNull(store_metadata)) {
        store_metadata = NULL;
    }
    if (!store_metadata) {
        goto end;
    }

    
    store_metadata_local_nonprim = store_metadata_parseFromJSON(store_metadata); //nonprimitive


    if (ad_link && !cJSON_IsNull(ad_link)) ad_link_local_str = strdup(ad_link->valuestring);
    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);
    if (price && !cJSON_IsNull(price)) price_local_str = strdup(price->valuestring);
    if (sale_price && !cJSON_IsNull(sale_price)) sale_price_local_str = strdup(sale_price->valuestring);

    local_inventory_item_response_local_var = local_inventory_item_response_create_internal (
        ad_link_local_str,
        availability ? availability_local_nonprim : NULL,
        created_at_local_var,
        item_id_local_str,
        last_updated_time_local_var,
        price_local_str,
        sale_price_local_str,
        store_metadata_local_nonprim
        );

    if (!local_inventory_item_response_local_var) {
        goto end;
    }

    return local_inventory_item_response_local_var;
end:
    if (ad_link_local_str) {
        free(ad_link_local_str);
        ad_link_local_str = NULL;
    }
    if (availability_local_nonprim) {
        item_availability_free(availability_local_nonprim);
        availability_local_nonprim = NULL;
    }
    if (created_at_local_var) {
        free(created_at_local_var);
        created_at_local_var = NULL;
    }
    if (item_id_local_str) {
        free(item_id_local_str);
        item_id_local_str = NULL;
    }
    if (last_updated_time_local_var) {
        free(last_updated_time_local_var);
        last_updated_time_local_var = NULL;
    }
    if (price_local_str) {
        free(price_local_str);
        price_local_str = NULL;
    }
    if (sale_price_local_str) {
        free(sale_price_local_str);
        sale_price_local_str = NULL;
    }
    if (store_metadata_local_nonprim) {
        store_metadata_free(store_metadata_local_nonprim);
        store_metadata_local_nonprim = NULL;
    }
    return NULL;

}
