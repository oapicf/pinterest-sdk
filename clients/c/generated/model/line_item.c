#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "line_item.h"



static line_item_t *line_item_create_internal(
    char *product_brand,
    char *product_category,
    int *product_id,
    char *product_name,
    char *product_price,
    int *product_quantity,
    char *product_variant,
    char *product_variant_id
    ) {
    line_item_t *line_item_local_var = malloc(sizeof(line_item_t));
    if (!line_item_local_var) {
        return NULL;
    }
    memset(line_item_local_var, 0, sizeof(line_item_t));
    line_item_local_var->_library_owned = 1;
    line_item_local_var->product_brand = product_brand;
    line_item_local_var->product_category = product_category;
    line_item_local_var->product_id = product_id;
    line_item_local_var->product_name = product_name;
    line_item_local_var->product_price = product_price;
    line_item_local_var->product_quantity = product_quantity;
    line_item_local_var->product_variant = product_variant;
    line_item_local_var->product_variant_id = product_variant_id;
    return line_item_local_var;
}

__attribute__((deprecated)) line_item_t *line_item_create(
    char *product_brand,
    char *product_category,
    int *product_id,
    char *product_name,
    char *product_price,
    int *product_quantity,
    char *product_variant,
    char *product_variant_id
    ) {
    int *product_id_copy = NULL;
    if (product_id) {
        product_id_copy = malloc(sizeof(int));
        if (product_id_copy) *product_id_copy = *product_id;
    }
    int *product_quantity_copy = NULL;
    if (product_quantity) {
        product_quantity_copy = malloc(sizeof(int));
        if (product_quantity_copy) *product_quantity_copy = *product_quantity;
    }
    line_item_t *result = line_item_create_internal (
        product_brand,
        product_category,
        product_id_copy,
        product_name,
        product_price,
        product_quantity_copy,
        product_variant,
        product_variant_id
        );
    if (!result) {
        free(product_id_copy);
        free(product_quantity_copy);
    }
    return result;
}

void line_item_free(line_item_t *line_item) {
    if(NULL == line_item){
        return ;
    }
    if(line_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "line_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (line_item->product_brand) {
        free(line_item->product_brand);
        line_item->product_brand = NULL;
    }
    if (line_item->product_category) {
        free(line_item->product_category);
        line_item->product_category = NULL;
    }
    if (line_item->product_id) {
        free(line_item->product_id);
        line_item->product_id = NULL;
    }
    if (line_item->product_name) {
        free(line_item->product_name);
        line_item->product_name = NULL;
    }
    if (line_item->product_price) {
        free(line_item->product_price);
        line_item->product_price = NULL;
    }
    if (line_item->product_quantity) {
        free(line_item->product_quantity);
        line_item->product_quantity = NULL;
    }
    if (line_item->product_variant) {
        free(line_item->product_variant);
        line_item->product_variant = NULL;
    }
    if (line_item->product_variant_id) {
        free(line_item->product_variant_id);
        line_item->product_variant_id = NULL;
    }
    free(line_item);
}

cJSON *line_item_convertToJSON(line_item_t *line_item) {
    cJSON *item = cJSON_CreateObject();

    // line_item->product_brand
    if(line_item->product_brand) {
    if(cJSON_AddStringToObject(item, "product_brand", line_item->product_brand) == NULL) {
    goto fail; //String
    }
    }


    // line_item->product_category
    if(line_item->product_category) {
    if(cJSON_AddStringToObject(item, "product_category", line_item->product_category) == NULL) {
    goto fail; //String
    }
    }


    // line_item->product_id
    if(line_item->product_id) {
    if(cJSON_AddNumberToObject(item, "product_id", *line_item->product_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // line_item->product_name
    if(line_item->product_name) {
    if(cJSON_AddStringToObject(item, "product_name", line_item->product_name) == NULL) {
    goto fail; //String
    }
    }


    // line_item->product_price
    if(line_item->product_price) {
    if(cJSON_AddStringToObject(item, "product_price", line_item->product_price) == NULL) {
    goto fail; //String
    }
    }


    // line_item->product_quantity
    if(line_item->product_quantity) {
    if(cJSON_AddNumberToObject(item, "product_quantity", *line_item->product_quantity) == NULL) {
    goto fail; //Numeric
    }
    }


    // line_item->product_variant
    if(line_item->product_variant) {
    if(cJSON_AddStringToObject(item, "product_variant", line_item->product_variant) == NULL) {
    goto fail; //String
    }
    }


    // line_item->product_variant_id
    if(line_item->product_variant_id) {
    if(cJSON_AddStringToObject(item, "product_variant_id", line_item->product_variant_id) == NULL) {
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

line_item_t *line_item_parseFromJSON(cJSON *line_itemJSON){

    line_item_t *line_item_local_var = NULL;

    char *product_brand_local_str = NULL;

    char *product_category_local_str = NULL;

    // define the local variable for line_item->product_id
    int *product_id_local_var = NULL;

    char *product_name_local_str = NULL;

    char *product_price_local_str = NULL;

    // define the local variable for line_item->product_quantity
    int *product_quantity_local_var = NULL;

    char *product_variant_local_str = NULL;

    char *product_variant_id_local_str = NULL;

    // line_item->product_brand
    cJSON *product_brand = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_brand");
    if (cJSON_IsNull(product_brand)) {
        product_brand = NULL;
    }
    if (product_brand) { 
    if(!cJSON_IsString(product_brand) && !cJSON_IsNull(product_brand))
    {
    goto end; //String
    }
    }

    // line_item->product_category
    cJSON *product_category = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_category");
    if (cJSON_IsNull(product_category)) {
        product_category = NULL;
    }
    if (product_category) { 
    if(!cJSON_IsString(product_category) && !cJSON_IsNull(product_category))
    {
    goto end; //String
    }
    }

    // line_item->product_id
    cJSON *product_id = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_id");
    if (cJSON_IsNull(product_id)) {
        product_id = NULL;
    }
    if (product_id) { 
    if(!cJSON_IsNumber(product_id))
    {
    goto end; //Numeric
    }
    product_id_local_var = malloc(sizeof(int));
    if(!product_id_local_var)
    {
        goto end;
    }
    *product_id_local_var = product_id->valuedouble;
    }

    // line_item->product_name
    cJSON *product_name = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_name");
    if (cJSON_IsNull(product_name)) {
        product_name = NULL;
    }
    if (product_name) { 
    if(!cJSON_IsString(product_name) && !cJSON_IsNull(product_name))
    {
    goto end; //String
    }
    }

    // line_item->product_price
    cJSON *product_price = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_price");
    if (cJSON_IsNull(product_price)) {
        product_price = NULL;
    }
    if (product_price) { 
    if(!cJSON_IsString(product_price) && !cJSON_IsNull(product_price))
    {
    goto end; //String
    }
    }

    // line_item->product_quantity
    cJSON *product_quantity = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_quantity");
    if (cJSON_IsNull(product_quantity)) {
        product_quantity = NULL;
    }
    if (product_quantity) { 
    if(!cJSON_IsNumber(product_quantity))
    {
    goto end; //Numeric
    }
    product_quantity_local_var = malloc(sizeof(int));
    if(!product_quantity_local_var)
    {
        goto end;
    }
    *product_quantity_local_var = product_quantity->valuedouble;
    }

    // line_item->product_variant
    cJSON *product_variant = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_variant");
    if (cJSON_IsNull(product_variant)) {
        product_variant = NULL;
    }
    if (product_variant) { 
    if(!cJSON_IsString(product_variant) && !cJSON_IsNull(product_variant))
    {
    goto end; //String
    }
    }

    // line_item->product_variant_id
    cJSON *product_variant_id = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_variant_id");
    if (cJSON_IsNull(product_variant_id)) {
        product_variant_id = NULL;
    }
    if (product_variant_id) { 
    if(!cJSON_IsString(product_variant_id) && !cJSON_IsNull(product_variant_id))
    {
    goto end; //String
    }
    }


    if (product_brand && !cJSON_IsNull(product_brand)) product_brand_local_str = strdup(product_brand->valuestring);
    if (product_category && !cJSON_IsNull(product_category)) product_category_local_str = strdup(product_category->valuestring);
    if (product_name && !cJSON_IsNull(product_name)) product_name_local_str = strdup(product_name->valuestring);
    if (product_price && !cJSON_IsNull(product_price)) product_price_local_str = strdup(product_price->valuestring);
    if (product_variant && !cJSON_IsNull(product_variant)) product_variant_local_str = strdup(product_variant->valuestring);
    if (product_variant_id && !cJSON_IsNull(product_variant_id)) product_variant_id_local_str = strdup(product_variant_id->valuestring);

    line_item_local_var = line_item_create_internal (
        product_brand_local_str,
        product_category_local_str,
        product_id_local_var,
        product_name_local_str,
        product_price_local_str,
        product_quantity_local_var,
        product_variant_local_str,
        product_variant_id_local_str
        );

    if (!line_item_local_var) {
        goto end;
    }

    return line_item_local_var;
end:
    if (product_brand_local_str) {
        free(product_brand_local_str);
        product_brand_local_str = NULL;
    }
    if (product_category_local_str) {
        free(product_category_local_str);
        product_category_local_str = NULL;
    }
    if (product_id_local_var) {
        free(product_id_local_var);
        product_id_local_var = NULL;
    }
    if (product_name_local_str) {
        free(product_name_local_str);
        product_name_local_str = NULL;
    }
    if (product_price_local_str) {
        free(product_price_local_str);
        product_price_local_str = NULL;
    }
    if (product_quantity_local_var) {
        free(product_quantity_local_var);
        product_quantity_local_var = NULL;
    }
    if (product_variant_local_str) {
        free(product_variant_local_str);
        product_variant_local_str = NULL;
    }
    if (product_variant_id_local_str) {
        free(product_variant_id_local_str);
        product_variant_id_local_str = NULL;
    }
    return NULL;

}
