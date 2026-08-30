#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "retail_local_inventory_item_attributes.h"



static retail_local_inventory_item_attributes_t *retail_local_inventory_item_attributes_create_internal(
    char *ad_link,
    item_availability_t *availability,
    char *price,
    char *sale_price
    ) {
    retail_local_inventory_item_attributes_t *retail_local_inventory_item_attributes_local_var = malloc(sizeof(retail_local_inventory_item_attributes_t));
    if (!retail_local_inventory_item_attributes_local_var) {
        return NULL;
    }
    memset(retail_local_inventory_item_attributes_local_var, 0, sizeof(retail_local_inventory_item_attributes_t));
    retail_local_inventory_item_attributes_local_var->_library_owned = 1;
    retail_local_inventory_item_attributes_local_var->ad_link = ad_link;
    retail_local_inventory_item_attributes_local_var->availability = availability;
    retail_local_inventory_item_attributes_local_var->price = price;
    retail_local_inventory_item_attributes_local_var->sale_price = sale_price;
    return retail_local_inventory_item_attributes_local_var;
}

__attribute__((deprecated)) retail_local_inventory_item_attributes_t *retail_local_inventory_item_attributes_create(
    char *ad_link,
    item_availability_t *availability,
    char *price,
    char *sale_price
    ) {
    retail_local_inventory_item_attributes_t *result = retail_local_inventory_item_attributes_create_internal (
        ad_link,
        availability,
        price,
        sale_price
        );
    if (!result) {
    }
    return result;
}

void retail_local_inventory_item_attributes_free(retail_local_inventory_item_attributes_t *retail_local_inventory_item_attributes) {
    if(NULL == retail_local_inventory_item_attributes){
        return ;
    }
    if(retail_local_inventory_item_attributes->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "retail_local_inventory_item_attributes_free");
        return ;
    }
    listEntry_t *listEntry;
    if (retail_local_inventory_item_attributes->ad_link) {
        free(retail_local_inventory_item_attributes->ad_link);
        retail_local_inventory_item_attributes->ad_link = NULL;
    }
    if (retail_local_inventory_item_attributes->availability) {
        item_availability_free(retail_local_inventory_item_attributes->availability);
        retail_local_inventory_item_attributes->availability = NULL;
    }
    if (retail_local_inventory_item_attributes->price) {
        free(retail_local_inventory_item_attributes->price);
        retail_local_inventory_item_attributes->price = NULL;
    }
    if (retail_local_inventory_item_attributes->sale_price) {
        free(retail_local_inventory_item_attributes->sale_price);
        retail_local_inventory_item_attributes->sale_price = NULL;
    }
    free(retail_local_inventory_item_attributes);
}

cJSON *retail_local_inventory_item_attributes_convertToJSON(retail_local_inventory_item_attributes_t *retail_local_inventory_item_attributes) {
    cJSON *item = cJSON_CreateObject();

    // retail_local_inventory_item_attributes->ad_link
    if(retail_local_inventory_item_attributes->ad_link) {
    if(cJSON_AddStringToObject(item, "ad_link", retail_local_inventory_item_attributes->ad_link) == NULL) {
    goto fail; //String
    }
    }


    // retail_local_inventory_item_attributes->availability
    if (!retail_local_inventory_item_attributes->availability) {
        goto fail;
    }
    cJSON *availability_local_JSON = item_availability_convertToJSON(retail_local_inventory_item_attributes->availability);
    if(availability_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "availability", availability_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // retail_local_inventory_item_attributes->price
    if (!retail_local_inventory_item_attributes->price) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "price", retail_local_inventory_item_attributes->price) == NULL) {
    goto fail; //String
    }


    // retail_local_inventory_item_attributes->sale_price
    if(retail_local_inventory_item_attributes->sale_price) {
    if(cJSON_AddStringToObject(item, "sale_price", retail_local_inventory_item_attributes->sale_price) == NULL) {
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

retail_local_inventory_item_attributes_t *retail_local_inventory_item_attributes_parseFromJSON(cJSON *retail_local_inventory_item_attributesJSON){

    retail_local_inventory_item_attributes_t *retail_local_inventory_item_attributes_local_var = NULL;

    char *ad_link_local_str = NULL;

    // define the local variable for retail_local_inventory_item_attributes->availability
    item_availability_t *availability_local_nonprim = NULL;

    char *price_local_str = NULL;

    char *sale_price_local_str = NULL;

    // retail_local_inventory_item_attributes->ad_link
    cJSON *ad_link = cJSON_GetObjectItemCaseSensitive(retail_local_inventory_item_attributesJSON, "ad_link");
    if (cJSON_IsNull(ad_link)) {
        ad_link = NULL;
    }
    if (ad_link) { 
    if(!cJSON_IsString(ad_link) && !cJSON_IsNull(ad_link))
    {
    goto end; //String
    }
    }

    // retail_local_inventory_item_attributes->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(retail_local_inventory_item_attributesJSON, "availability");
    if (cJSON_IsNull(availability)) {
        availability = NULL;
    }
    if (!availability) {
        goto end;
    }

    
    availability_local_nonprim = item_availability_parseFromJSON(availability); //custom

    // retail_local_inventory_item_attributes->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(retail_local_inventory_item_attributesJSON, "price");
    if (cJSON_IsNull(price)) {
        price = NULL;
    }
    if (!price) {
        goto end;
    }

    
    if(!cJSON_IsString(price))
    {
    goto end; //String
    }

    // retail_local_inventory_item_attributes->sale_price
    cJSON *sale_price = cJSON_GetObjectItemCaseSensitive(retail_local_inventory_item_attributesJSON, "sale_price");
    if (cJSON_IsNull(sale_price)) {
        sale_price = NULL;
    }
    if (sale_price) { 
    if(!cJSON_IsString(sale_price) && !cJSON_IsNull(sale_price))
    {
    goto end; //String
    }
    }


    if (ad_link && !cJSON_IsNull(ad_link)) ad_link_local_str = strdup(ad_link->valuestring);
    if (price && !cJSON_IsNull(price)) price_local_str = strdup(price->valuestring);
    if (sale_price && !cJSON_IsNull(sale_price)) sale_price_local_str = strdup(sale_price->valuestring);

    retail_local_inventory_item_attributes_local_var = retail_local_inventory_item_attributes_create_internal (
        ad_link_local_str,
        availability_local_nonprim,
        price_local_str,
        sale_price_local_str
        );

    if (!retail_local_inventory_item_attributes_local_var) {
        goto end;
    }

    return retail_local_inventory_item_attributes_local_var;
end:
    if (ad_link_local_str) {
        free(ad_link_local_str);
        ad_link_local_str = NULL;
    }
    if (availability_local_nonprim) {
        item_availability_free(availability_local_nonprim);
        availability_local_nonprim = NULL;
    }
    if (price_local_str) {
        free(price_local_str);
        price_local_str = NULL;
    }
    if (sale_price_local_str) {
        free(sale_price_local_str);
        sale_price_local_str = NULL;
    }
    return NULL;

}
