#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_product_metadata.h"



static catalogs_retail_product_metadata_t *catalogs_retail_product_metadata_create_internal(
    pinterest_rest_api_product_availability__e availability,
    pinterest_rest_api_non_nullable_catalogs_currency__e currency,
    char *item_group_id,
    char *item_id,
    double *price,
    double *sale_price
    ) {
    catalogs_retail_product_metadata_t *catalogs_retail_product_metadata_local_var = malloc(sizeof(catalogs_retail_product_metadata_t));
    if (!catalogs_retail_product_metadata_local_var) {
        return NULL;
    }
    memset(catalogs_retail_product_metadata_local_var, 0, sizeof(catalogs_retail_product_metadata_t));
    catalogs_retail_product_metadata_local_var->_library_owned = 1;
    catalogs_retail_product_metadata_local_var->availability = availability;
    catalogs_retail_product_metadata_local_var->currency = currency;
    catalogs_retail_product_metadata_local_var->item_group_id = item_group_id;
    catalogs_retail_product_metadata_local_var->item_id = item_id;
    catalogs_retail_product_metadata_local_var->price = price;
    catalogs_retail_product_metadata_local_var->sale_price = sale_price;
    return catalogs_retail_product_metadata_local_var;
}

__attribute__((deprecated)) catalogs_retail_product_metadata_t *catalogs_retail_product_metadata_create(
    pinterest_rest_api_product_availability__e availability,
    pinterest_rest_api_non_nullable_catalogs_currency__e currency,
    char *item_group_id,
    char *item_id,
    double *price,
    double *sale_price
    ) {
    double *price_copy = NULL;
    if (price) {
        price_copy = malloc(sizeof(double));
        if (price_copy) *price_copy = *price;
    }
    double *sale_price_copy = NULL;
    if (sale_price) {
        sale_price_copy = malloc(sizeof(double));
        if (sale_price_copy) *sale_price_copy = *sale_price;
    }
    catalogs_retail_product_metadata_t *result = catalogs_retail_product_metadata_create_internal (
        availability,
        currency,
        item_group_id,
        item_id,
        price_copy,
        sale_price_copy
        );
    if (!result) {
        free(price_copy);
        free(sale_price_copy);
    }
    return result;
}

void catalogs_retail_product_metadata_free(catalogs_retail_product_metadata_t *catalogs_retail_product_metadata) {
    if(NULL == catalogs_retail_product_metadata){
        return ;
    }
    if(catalogs_retail_product_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_retail_product_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_product_metadata->item_group_id) {
        free(catalogs_retail_product_metadata->item_group_id);
        catalogs_retail_product_metadata->item_group_id = NULL;
    }
    if (catalogs_retail_product_metadata->item_id) {
        free(catalogs_retail_product_metadata->item_id);
        catalogs_retail_product_metadata->item_id = NULL;
    }
    if (catalogs_retail_product_metadata->price) {
        free(catalogs_retail_product_metadata->price);
        catalogs_retail_product_metadata->price = NULL;
    }
    if (catalogs_retail_product_metadata->sale_price) {
        free(catalogs_retail_product_metadata->sale_price);
        catalogs_retail_product_metadata->sale_price = NULL;
    }
    free(catalogs_retail_product_metadata);
}

cJSON *catalogs_retail_product_metadata_convertToJSON(catalogs_retail_product_metadata_t *catalogs_retail_product_metadata) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_product_metadata->availability
    if (pinterest_rest_api_product_availability__NULL == catalogs_retail_product_metadata->availability) {
        goto fail;
    }
    cJSON *availability_local_JSON = product_availability_convertToJSON(catalogs_retail_product_metadata->availability);
    if(availability_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "availability", availability_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_retail_product_metadata->currency
    if (pinterest_rest_api_non_nullable_catalogs_currency__NULL == catalogs_retail_product_metadata->currency) {
        goto fail;
    }
    cJSON *currency_local_JSON = non_nullable_catalogs_currency_convertToJSON(catalogs_retail_product_metadata->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_retail_product_metadata->item_group_id
    if (!catalogs_retail_product_metadata->item_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_group_id", catalogs_retail_product_metadata->item_group_id) == NULL) {
    goto fail; //String
    }


    // catalogs_retail_product_metadata->item_id
    if (!catalogs_retail_product_metadata->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", catalogs_retail_product_metadata->item_id) == NULL) {
    goto fail; //String
    }


    // catalogs_retail_product_metadata->price
    if (!catalogs_retail_product_metadata->price) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "price", *catalogs_retail_product_metadata->price) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_retail_product_metadata->sale_price
    if (!catalogs_retail_product_metadata->sale_price) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "sale_price", *catalogs_retail_product_metadata->sale_price) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_retail_product_metadata_t *catalogs_retail_product_metadata_parseFromJSON(cJSON *catalogs_retail_product_metadataJSON){

    catalogs_retail_product_metadata_t *catalogs_retail_product_metadata_local_var = NULL;

    // define the local variable for catalogs_retail_product_metadata->availability
    pinterest_rest_api_product_availability__e availability_local_nonprim = 0;

    // define the local variable for catalogs_retail_product_metadata->currency
    pinterest_rest_api_non_nullable_catalogs_currency__e currency_local_nonprim = 0;

    char *item_group_id_local_str = NULL;

    char *item_id_local_str = NULL;

    // define the local variable for catalogs_retail_product_metadata->price
    double *price_local_var = NULL;

    // define the local variable for catalogs_retail_product_metadata->sale_price
    double *sale_price_local_var = NULL;

    // catalogs_retail_product_metadata->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_metadataJSON, "availability");
    if (cJSON_IsNull(availability)) {
        availability = NULL;
    }
    if (!availability) {
        goto end;
    }

    
    availability_local_nonprim = product_availability_parseFromJSON(availability); //custom

    // catalogs_retail_product_metadata->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_metadataJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (!currency) {
        goto end;
    }

    
    currency_local_nonprim = non_nullable_catalogs_currency_parseFromJSON(currency); //custom

    // catalogs_retail_product_metadata->item_group_id
    cJSON *item_group_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_metadataJSON, "item_group_id");
    if (cJSON_IsNull(item_group_id)) {
        item_group_id = NULL;
    }
    if (!item_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_group_id))
    {
    goto end; //String
    }

    // catalogs_retail_product_metadata->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_metadataJSON, "item_id");
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

    // catalogs_retail_product_metadata->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_metadataJSON, "price");
    if (cJSON_IsNull(price)) {
        price = NULL;
    }
    if (!price) {
        goto end;
    }

    
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }
    price_local_var = malloc(sizeof(double));
    if(!price_local_var)
    {
        goto end;
    }
    *price_local_var = price->valuedouble;

    // catalogs_retail_product_metadata->sale_price
    cJSON *sale_price = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_metadataJSON, "sale_price");
    if (cJSON_IsNull(sale_price)) {
        sale_price = NULL;
    }
    if (!sale_price) {
        goto end;
    }

    
    if(!cJSON_IsNumber(sale_price))
    {
    goto end; //Numeric
    }
    sale_price_local_var = malloc(sizeof(double));
    if(!sale_price_local_var)
    {
        goto end;
    }
    *sale_price_local_var = sale_price->valuedouble;


    if (item_group_id && !cJSON_IsNull(item_group_id)) item_group_id_local_str = strdup(item_group_id->valuestring);
    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);

    catalogs_retail_product_metadata_local_var = catalogs_retail_product_metadata_create_internal (
        availability_local_nonprim,
        currency_local_nonprim,
        item_group_id_local_str,
        item_id_local_str,
        price_local_var,
        sale_price_local_var
        );

    if (!catalogs_retail_product_metadata_local_var) {
        goto end;
    }

    return catalogs_retail_product_metadata_local_var;
end:
    if (availability_local_nonprim) {
        availability_local_nonprim = 0;
    }
    if (currency_local_nonprim) {
        currency_local_nonprim = 0;
    }
    if (item_group_id_local_str) {
        free(item_group_id_local_str);
        item_group_id_local_str = NULL;
    }
    if (item_id_local_str) {
        free(item_id_local_str);
        item_id_local_str = NULL;
    }
    if (price_local_var) {
        free(price_local_var);
        price_local_var = NULL;
    }
    if (sale_price_local_var) {
        free(sale_price_local_var);
        sale_price_local_var = NULL;
    }
    return NULL;

}
