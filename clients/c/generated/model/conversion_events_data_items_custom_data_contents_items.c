#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_events_data_items_custom_data_contents_items.h"



static conversion_events_data_items_custom_data_contents_items_t *conversion_events_data_items_custom_data_contents_items_create_internal(
    char *id,
    char *item_brand,
    char *item_brand_id,
    char *item_category,
    char *item_name,
    char *item_price,
    long *quantity
    ) {
    conversion_events_data_items_custom_data_contents_items_t *conversion_events_data_items_custom_data_contents_items_local_var = malloc(sizeof(conversion_events_data_items_custom_data_contents_items_t));
    if (!conversion_events_data_items_custom_data_contents_items_local_var) {
        return NULL;
    }
    memset(conversion_events_data_items_custom_data_contents_items_local_var, 0, sizeof(conversion_events_data_items_custom_data_contents_items_t));
    conversion_events_data_items_custom_data_contents_items_local_var->_library_owned = 1;
    conversion_events_data_items_custom_data_contents_items_local_var->id = id;
    conversion_events_data_items_custom_data_contents_items_local_var->item_brand = item_brand;
    conversion_events_data_items_custom_data_contents_items_local_var->item_brand_id = item_brand_id;
    conversion_events_data_items_custom_data_contents_items_local_var->item_category = item_category;
    conversion_events_data_items_custom_data_contents_items_local_var->item_name = item_name;
    conversion_events_data_items_custom_data_contents_items_local_var->item_price = item_price;
    conversion_events_data_items_custom_data_contents_items_local_var->quantity = quantity;
    return conversion_events_data_items_custom_data_contents_items_local_var;
}

__attribute__((deprecated)) conversion_events_data_items_custom_data_contents_items_t *conversion_events_data_items_custom_data_contents_items_create(
    char *id,
    char *item_brand,
    char *item_brand_id,
    char *item_category,
    char *item_name,
    char *item_price,
    long *quantity
    ) {
    long *quantity_copy = NULL;
    if (quantity) {
        quantity_copy = malloc(sizeof(long));
        if (quantity_copy) *quantity_copy = *quantity;
    }
    conversion_events_data_items_custom_data_contents_items_t *result = conversion_events_data_items_custom_data_contents_items_create_internal (
        id,
        item_brand,
        item_brand_id,
        item_category,
        item_name,
        item_price,
        quantity_copy
        );
    if (!result) {
        free(quantity_copy);
    }
    return result;
}

void conversion_events_data_items_custom_data_contents_items_free(conversion_events_data_items_custom_data_contents_items_t *conversion_events_data_items_custom_data_contents_items) {
    if(NULL == conversion_events_data_items_custom_data_contents_items){
        return ;
    }
    if(conversion_events_data_items_custom_data_contents_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_events_data_items_custom_data_contents_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_events_data_items_custom_data_contents_items->id) {
        free(conversion_events_data_items_custom_data_contents_items->id);
        conversion_events_data_items_custom_data_contents_items->id = NULL;
    }
    if (conversion_events_data_items_custom_data_contents_items->item_brand) {
        free(conversion_events_data_items_custom_data_contents_items->item_brand);
        conversion_events_data_items_custom_data_contents_items->item_brand = NULL;
    }
    if (conversion_events_data_items_custom_data_contents_items->item_brand_id) {
        free(conversion_events_data_items_custom_data_contents_items->item_brand_id);
        conversion_events_data_items_custom_data_contents_items->item_brand_id = NULL;
    }
    if (conversion_events_data_items_custom_data_contents_items->item_category) {
        free(conversion_events_data_items_custom_data_contents_items->item_category);
        conversion_events_data_items_custom_data_contents_items->item_category = NULL;
    }
    if (conversion_events_data_items_custom_data_contents_items->item_name) {
        free(conversion_events_data_items_custom_data_contents_items->item_name);
        conversion_events_data_items_custom_data_contents_items->item_name = NULL;
    }
    if (conversion_events_data_items_custom_data_contents_items->item_price) {
        free(conversion_events_data_items_custom_data_contents_items->item_price);
        conversion_events_data_items_custom_data_contents_items->item_price = NULL;
    }
    if (conversion_events_data_items_custom_data_contents_items->quantity) {
        free(conversion_events_data_items_custom_data_contents_items->quantity);
        conversion_events_data_items_custom_data_contents_items->quantity = NULL;
    }
    free(conversion_events_data_items_custom_data_contents_items);
}

cJSON *conversion_events_data_items_custom_data_contents_items_convertToJSON(conversion_events_data_items_custom_data_contents_items_t *conversion_events_data_items_custom_data_contents_items) {
    cJSON *item = cJSON_CreateObject();

    // conversion_events_data_items_custom_data_contents_items->id
    if(conversion_events_data_items_custom_data_contents_items->id) {
    if(cJSON_AddStringToObject(item, "id", conversion_events_data_items_custom_data_contents_items->id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data_contents_items->item_brand
    if(conversion_events_data_items_custom_data_contents_items->item_brand) {
    if(cJSON_AddStringToObject(item, "item_brand", conversion_events_data_items_custom_data_contents_items->item_brand) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data_contents_items->item_brand_id
    if(conversion_events_data_items_custom_data_contents_items->item_brand_id) {
    if(cJSON_AddStringToObject(item, "item_brand_id", conversion_events_data_items_custom_data_contents_items->item_brand_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data_contents_items->item_category
    if(conversion_events_data_items_custom_data_contents_items->item_category) {
    if(cJSON_AddStringToObject(item, "item_category", conversion_events_data_items_custom_data_contents_items->item_category) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data_contents_items->item_name
    if(conversion_events_data_items_custom_data_contents_items->item_name) {
    if(cJSON_AddStringToObject(item, "item_name", conversion_events_data_items_custom_data_contents_items->item_name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data_contents_items->item_price
    if(conversion_events_data_items_custom_data_contents_items->item_price) {
    if(cJSON_AddStringToObject(item, "item_price", conversion_events_data_items_custom_data_contents_items->item_price) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items_custom_data_contents_items->quantity
    if(conversion_events_data_items_custom_data_contents_items->quantity) {
    if(cJSON_AddNumberToObject(item, "quantity", *conversion_events_data_items_custom_data_contents_items->quantity) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_events_data_items_custom_data_contents_items_t *conversion_events_data_items_custom_data_contents_items_parseFromJSON(cJSON *conversion_events_data_items_custom_data_contents_itemsJSON){

    conversion_events_data_items_custom_data_contents_items_t *conversion_events_data_items_custom_data_contents_items_local_var = NULL;

    char *id_local_str = NULL;

    char *item_brand_local_str = NULL;

    char *item_brand_id_local_str = NULL;

    char *item_category_local_str = NULL;

    char *item_name_local_str = NULL;

    char *item_price_local_str = NULL;

    // define the local variable for conversion_events_data_items_custom_data_contents_items->quantity
    long *quantity_local_var = NULL;

    // conversion_events_data_items_custom_data_contents_items->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_data_contents_itemsJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data_contents_items->item_brand
    cJSON *item_brand = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_data_contents_itemsJSON, "item_brand");
    if (cJSON_IsNull(item_brand)) {
        item_brand = NULL;
    }
    if (item_brand) { 
    if(!cJSON_IsString(item_brand) && !cJSON_IsNull(item_brand))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data_contents_items->item_brand_id
    cJSON *item_brand_id = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_data_contents_itemsJSON, "item_brand_id");
    if (cJSON_IsNull(item_brand_id)) {
        item_brand_id = NULL;
    }
    if (item_brand_id) { 
    if(!cJSON_IsString(item_brand_id) && !cJSON_IsNull(item_brand_id))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data_contents_items->item_category
    cJSON *item_category = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_data_contents_itemsJSON, "item_category");
    if (cJSON_IsNull(item_category)) {
        item_category = NULL;
    }
    if (item_category) { 
    if(!cJSON_IsString(item_category) && !cJSON_IsNull(item_category))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data_contents_items->item_name
    cJSON *item_name = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_data_contents_itemsJSON, "item_name");
    if (cJSON_IsNull(item_name)) {
        item_name = NULL;
    }
    if (item_name) { 
    if(!cJSON_IsString(item_name) && !cJSON_IsNull(item_name))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data_contents_items->item_price
    cJSON *item_price = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_data_contents_itemsJSON, "item_price");
    if (cJSON_IsNull(item_price)) {
        item_price = NULL;
    }
    if (item_price) { 
    if(!cJSON_IsString(item_price) && !cJSON_IsNull(item_price))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items_custom_data_contents_items->quantity
    cJSON *quantity = cJSON_GetObjectItemCaseSensitive(conversion_events_data_items_custom_data_contents_itemsJSON, "quantity");
    if (cJSON_IsNull(quantity)) {
        quantity = NULL;
    }
    if (quantity) { 
    if(!cJSON_IsNumber(quantity))
    {
    goto end; //Numeric
    }
    quantity_local_var = malloc(sizeof(long));
    if(!quantity_local_var)
    {
        goto end;
    }
    *quantity_local_var = quantity->valuedouble;
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (item_brand && !cJSON_IsNull(item_brand)) item_brand_local_str = strdup(item_brand->valuestring);
    if (item_brand_id && !cJSON_IsNull(item_brand_id)) item_brand_id_local_str = strdup(item_brand_id->valuestring);
    if (item_category && !cJSON_IsNull(item_category)) item_category_local_str = strdup(item_category->valuestring);
    if (item_name && !cJSON_IsNull(item_name)) item_name_local_str = strdup(item_name->valuestring);
    if (item_price && !cJSON_IsNull(item_price)) item_price_local_str = strdup(item_price->valuestring);

    conversion_events_data_items_custom_data_contents_items_local_var = conversion_events_data_items_custom_data_contents_items_create_internal (
        id_local_str,
        item_brand_local_str,
        item_brand_id_local_str,
        item_category_local_str,
        item_name_local_str,
        item_price_local_str,
        quantity_local_var
        );

    if (!conversion_events_data_items_custom_data_contents_items_local_var) {
        goto end;
    }

    return conversion_events_data_items_custom_data_contents_items_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (item_brand_local_str) {
        free(item_brand_local_str);
        item_brand_local_str = NULL;
    }
    if (item_brand_id_local_str) {
        free(item_brand_id_local_str);
        item_brand_id_local_str = NULL;
    }
    if (item_category_local_str) {
        free(item_category_local_str);
        item_category_local_str = NULL;
    }
    if (item_name_local_str) {
        free(item_name_local_str);
        item_name_local_str = NULL;
    }
    if (item_price_local_str) {
        free(item_price_local_str);
        item_price_local_str = NULL;
    }
    if (quantity_local_var) {
        free(quantity_local_var);
        quantity_local_var = NULL;
    }
    return NULL;

}
