#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "retail_local_inventory_item_attributes_optional.h"



static retail_local_inventory_item_attributes_optional_t *retail_local_inventory_item_attributes_optional_create_internal(
    char *ad_link,
    item_availability_t *availability,
    char *price,
    char *sale_price
    ) {
    retail_local_inventory_item_attributes_optional_t *retail_local_inventory_item_attributes_optional_local_var = malloc(sizeof(retail_local_inventory_item_attributes_optional_t));
    if (!retail_local_inventory_item_attributes_optional_local_var) {
        return NULL;
    }
    memset(retail_local_inventory_item_attributes_optional_local_var, 0, sizeof(retail_local_inventory_item_attributes_optional_t));
    retail_local_inventory_item_attributes_optional_local_var->_library_owned = 1;
    retail_local_inventory_item_attributes_optional_local_var->ad_link = ad_link;
    retail_local_inventory_item_attributes_optional_local_var->availability = availability;
    retail_local_inventory_item_attributes_optional_local_var->price = price;
    retail_local_inventory_item_attributes_optional_local_var->sale_price = sale_price;
    return retail_local_inventory_item_attributes_optional_local_var;
}

__attribute__((deprecated)) retail_local_inventory_item_attributes_optional_t *retail_local_inventory_item_attributes_optional_create(
    char *ad_link,
    item_availability_t *availability,
    char *price,
    char *sale_price
    ) {
    retail_local_inventory_item_attributes_optional_t *result = retail_local_inventory_item_attributes_optional_create_internal (
        ad_link,
        availability,
        price,
        sale_price
        );
    if (!result) {
    }
    return result;
}

void retail_local_inventory_item_attributes_optional_free(retail_local_inventory_item_attributes_optional_t *retail_local_inventory_item_attributes_optional) {
    if(NULL == retail_local_inventory_item_attributes_optional){
        return ;
    }
    if(retail_local_inventory_item_attributes_optional->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "retail_local_inventory_item_attributes_optional_free");
        return ;
    }
    listEntry_t *listEntry;
    if (retail_local_inventory_item_attributes_optional->ad_link) {
        free(retail_local_inventory_item_attributes_optional->ad_link);
        retail_local_inventory_item_attributes_optional->ad_link = NULL;
    }
    if (retail_local_inventory_item_attributes_optional->availability) {
        item_availability_free(retail_local_inventory_item_attributes_optional->availability);
        retail_local_inventory_item_attributes_optional->availability = NULL;
    }
    if (retail_local_inventory_item_attributes_optional->price) {
        free(retail_local_inventory_item_attributes_optional->price);
        retail_local_inventory_item_attributes_optional->price = NULL;
    }
    if (retail_local_inventory_item_attributes_optional->sale_price) {
        free(retail_local_inventory_item_attributes_optional->sale_price);
        retail_local_inventory_item_attributes_optional->sale_price = NULL;
    }
    free(retail_local_inventory_item_attributes_optional);
}

cJSON *retail_local_inventory_item_attributes_optional_convertToJSON(retail_local_inventory_item_attributes_optional_t *retail_local_inventory_item_attributes_optional) {
    cJSON *item = cJSON_CreateObject();

    // retail_local_inventory_item_attributes_optional->ad_link
    if(retail_local_inventory_item_attributes_optional->ad_link) {
    if(cJSON_AddStringToObject(item, "ad_link", retail_local_inventory_item_attributes_optional->ad_link) == NULL) {
    goto fail; //String
    }
    }


    // retail_local_inventory_item_attributes_optional->availability
    if(retail_local_inventory_item_attributes_optional->availability) {
    cJSON *availability_local_JSON = item_availability_convertToJSON(retail_local_inventory_item_attributes_optional->availability);
    if(availability_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "availability", availability_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // retail_local_inventory_item_attributes_optional->price
    if(retail_local_inventory_item_attributes_optional->price) {
    if(cJSON_AddStringToObject(item, "price", retail_local_inventory_item_attributes_optional->price) == NULL) {
    goto fail; //String
    }
    }


    // retail_local_inventory_item_attributes_optional->sale_price
    if(retail_local_inventory_item_attributes_optional->sale_price) {
    if(cJSON_AddStringToObject(item, "sale_price", retail_local_inventory_item_attributes_optional->sale_price) == NULL) {
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

retail_local_inventory_item_attributes_optional_t *retail_local_inventory_item_attributes_optional_parseFromJSON(cJSON *retail_local_inventory_item_attributes_optionalJSON){

    retail_local_inventory_item_attributes_optional_t *retail_local_inventory_item_attributes_optional_local_var = NULL;

    char *ad_link_local_str = NULL;

    // define the local variable for retail_local_inventory_item_attributes_optional->availability
    item_availability_t *availability_local_nonprim = NULL;

    char *price_local_str = NULL;

    char *sale_price_local_str = NULL;

    // retail_local_inventory_item_attributes_optional->ad_link
    cJSON *ad_link = cJSON_GetObjectItemCaseSensitive(retail_local_inventory_item_attributes_optionalJSON, "ad_link");
    if (cJSON_IsNull(ad_link)) {
        ad_link = NULL;
    }
    if (ad_link) { 
    if(!cJSON_IsString(ad_link) && !cJSON_IsNull(ad_link))
    {
    goto end; //String
    }
    }

    // retail_local_inventory_item_attributes_optional->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(retail_local_inventory_item_attributes_optionalJSON, "availability");
    if (cJSON_IsNull(availability)) {
        availability = NULL;
    }
    if (availability) { 
    availability_local_nonprim = item_availability_parseFromJSON(availability); //custom
    }

    // retail_local_inventory_item_attributes_optional->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(retail_local_inventory_item_attributes_optionalJSON, "price");
    if (cJSON_IsNull(price)) {
        price = NULL;
    }
    if (price) { 
    if(!cJSON_IsString(price) && !cJSON_IsNull(price))
    {
    goto end; //String
    }
    }

    // retail_local_inventory_item_attributes_optional->sale_price
    cJSON *sale_price = cJSON_GetObjectItemCaseSensitive(retail_local_inventory_item_attributes_optionalJSON, "sale_price");
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

    retail_local_inventory_item_attributes_optional_local_var = retail_local_inventory_item_attributes_optional_create_internal (
        ad_link_local_str,
        availability ? availability_local_nonprim : NULL,
        price_local_str,
        sale_price_local_str
        );

    if (!retail_local_inventory_item_attributes_optional_local_var) {
        goto end;
    }

    return retail_local_inventory_item_attributes_optional_local_var;
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
