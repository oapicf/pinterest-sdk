#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_events_data_inner_custom_data_contents_inner.h"



static conversion_events_data_inner_custom_data_contents_inner_t *conversion_events_data_inner_custom_data_contents_inner_create_internal(
    char *id,
    char *item_brand,
    char *item_category,
    char *item_name,
    char *item_price,
    long quantity
    ) {
    conversion_events_data_inner_custom_data_contents_inner_t *conversion_events_data_inner_custom_data_contents_inner_local_var = malloc(sizeof(conversion_events_data_inner_custom_data_contents_inner_t));
    if (!conversion_events_data_inner_custom_data_contents_inner_local_var) {
        return NULL;
    }
    conversion_events_data_inner_custom_data_contents_inner_local_var->id = id;
    conversion_events_data_inner_custom_data_contents_inner_local_var->item_brand = item_brand;
    conversion_events_data_inner_custom_data_contents_inner_local_var->item_category = item_category;
    conversion_events_data_inner_custom_data_contents_inner_local_var->item_name = item_name;
    conversion_events_data_inner_custom_data_contents_inner_local_var->item_price = item_price;
    conversion_events_data_inner_custom_data_contents_inner_local_var->quantity = quantity;

    conversion_events_data_inner_custom_data_contents_inner_local_var->_library_owned = 1;
    return conversion_events_data_inner_custom_data_contents_inner_local_var;
}

__attribute__((deprecated)) conversion_events_data_inner_custom_data_contents_inner_t *conversion_events_data_inner_custom_data_contents_inner_create(
    char *id,
    char *item_brand,
    char *item_category,
    char *item_name,
    char *item_price,
    long quantity
    ) {
    return conversion_events_data_inner_custom_data_contents_inner_create_internal (
        id,
        item_brand,
        item_category,
        item_name,
        item_price,
        quantity
        );
}

void conversion_events_data_inner_custom_data_contents_inner_free(conversion_events_data_inner_custom_data_contents_inner_t *conversion_events_data_inner_custom_data_contents_inner) {
    if(NULL == conversion_events_data_inner_custom_data_contents_inner){
        return ;
    }
    if(conversion_events_data_inner_custom_data_contents_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_events_data_inner_custom_data_contents_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_events_data_inner_custom_data_contents_inner->id) {
        free(conversion_events_data_inner_custom_data_contents_inner->id);
        conversion_events_data_inner_custom_data_contents_inner->id = NULL;
    }
    if (conversion_events_data_inner_custom_data_contents_inner->item_brand) {
        free(conversion_events_data_inner_custom_data_contents_inner->item_brand);
        conversion_events_data_inner_custom_data_contents_inner->item_brand = NULL;
    }
    if (conversion_events_data_inner_custom_data_contents_inner->item_category) {
        free(conversion_events_data_inner_custom_data_contents_inner->item_category);
        conversion_events_data_inner_custom_data_contents_inner->item_category = NULL;
    }
    if (conversion_events_data_inner_custom_data_contents_inner->item_name) {
        free(conversion_events_data_inner_custom_data_contents_inner->item_name);
        conversion_events_data_inner_custom_data_contents_inner->item_name = NULL;
    }
    if (conversion_events_data_inner_custom_data_contents_inner->item_price) {
        free(conversion_events_data_inner_custom_data_contents_inner->item_price);
        conversion_events_data_inner_custom_data_contents_inner->item_price = NULL;
    }
    free(conversion_events_data_inner_custom_data_contents_inner);
}

cJSON *conversion_events_data_inner_custom_data_contents_inner_convertToJSON(conversion_events_data_inner_custom_data_contents_inner_t *conversion_events_data_inner_custom_data_contents_inner) {
    cJSON *item = cJSON_CreateObject();

    // conversion_events_data_inner_custom_data_contents_inner->id
    if(conversion_events_data_inner_custom_data_contents_inner->id) {
    if(cJSON_AddStringToObject(item, "id", conversion_events_data_inner_custom_data_contents_inner->id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data_contents_inner->item_brand
    if(conversion_events_data_inner_custom_data_contents_inner->item_brand) {
    if(cJSON_AddStringToObject(item, "item_brand", conversion_events_data_inner_custom_data_contents_inner->item_brand) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data_contents_inner->item_category
    if(conversion_events_data_inner_custom_data_contents_inner->item_category) {
    if(cJSON_AddStringToObject(item, "item_category", conversion_events_data_inner_custom_data_contents_inner->item_category) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data_contents_inner->item_name
    if(conversion_events_data_inner_custom_data_contents_inner->item_name) {
    if(cJSON_AddStringToObject(item, "item_name", conversion_events_data_inner_custom_data_contents_inner->item_name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data_contents_inner->item_price
    if(conversion_events_data_inner_custom_data_contents_inner->item_price) {
    if(cJSON_AddStringToObject(item, "item_price", conversion_events_data_inner_custom_data_contents_inner->item_price) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner_custom_data_contents_inner->quantity
    if(conversion_events_data_inner_custom_data_contents_inner->quantity) {
    if(cJSON_AddNumberToObject(item, "quantity", conversion_events_data_inner_custom_data_contents_inner->quantity) == NULL) {
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

conversion_events_data_inner_custom_data_contents_inner_t *conversion_events_data_inner_custom_data_contents_inner_parseFromJSON(cJSON *conversion_events_data_inner_custom_data_contents_innerJSON){

    conversion_events_data_inner_custom_data_contents_inner_t *conversion_events_data_inner_custom_data_contents_inner_local_var = NULL;

    // conversion_events_data_inner_custom_data_contents_inner->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_data_contents_innerJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data_contents_inner->item_brand
    cJSON *item_brand = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_data_contents_innerJSON, "item_brand");
    if (cJSON_IsNull(item_brand)) {
        item_brand = NULL;
    }
    if (item_brand) { 
    if(!cJSON_IsString(item_brand) && !cJSON_IsNull(item_brand))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data_contents_inner->item_category
    cJSON *item_category = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_data_contents_innerJSON, "item_category");
    if (cJSON_IsNull(item_category)) {
        item_category = NULL;
    }
    if (item_category) { 
    if(!cJSON_IsString(item_category) && !cJSON_IsNull(item_category))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data_contents_inner->item_name
    cJSON *item_name = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_data_contents_innerJSON, "item_name");
    if (cJSON_IsNull(item_name)) {
        item_name = NULL;
    }
    if (item_name) { 
    if(!cJSON_IsString(item_name) && !cJSON_IsNull(item_name))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data_contents_inner->item_price
    cJSON *item_price = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_data_contents_innerJSON, "item_price");
    if (cJSON_IsNull(item_price)) {
        item_price = NULL;
    }
    if (item_price) { 
    if(!cJSON_IsString(item_price) && !cJSON_IsNull(item_price))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner_custom_data_contents_inner->quantity
    cJSON *quantity = cJSON_GetObjectItemCaseSensitive(conversion_events_data_inner_custom_data_contents_innerJSON, "quantity");
    if (cJSON_IsNull(quantity)) {
        quantity = NULL;
    }
    if (quantity) { 
    if(!cJSON_IsNumber(quantity))
    {
    goto end; //Numeric
    }
    }


    conversion_events_data_inner_custom_data_contents_inner_local_var = conversion_events_data_inner_custom_data_contents_inner_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        item_brand && !cJSON_IsNull(item_brand) ? strdup(item_brand->valuestring) : NULL,
        item_category && !cJSON_IsNull(item_category) ? strdup(item_category->valuestring) : NULL,
        item_name && !cJSON_IsNull(item_name) ? strdup(item_name->valuestring) : NULL,
        item_price && !cJSON_IsNull(item_price) ? strdup(item_price->valuestring) : NULL,
        quantity ? quantity->valuedouble : 0
        );

    return conversion_events_data_inner_custom_data_contents_inner_local_var;
end:
    return NULL;

}
