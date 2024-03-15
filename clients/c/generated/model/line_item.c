#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "line_item.h"



line_item_t *line_item_create(
    char *product_brand,
    char *product_category,
    int product_id,
    char *product_name,
    char *product_price,
    int product_quantity,
    char *product_variant,
    char *product_variant_id
    ) {
    line_item_t *line_item_local_var = malloc(sizeof(line_item_t));
    if (!line_item_local_var) {
        return NULL;
    }
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


void line_item_free(line_item_t *line_item) {
    if(NULL == line_item){
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
    if (line_item->product_name) {
        free(line_item->product_name);
        line_item->product_name = NULL;
    }
    if (line_item->product_price) {
        free(line_item->product_price);
        line_item->product_price = NULL;
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
    if(cJSON_AddNumberToObject(item, "product_id", line_item->product_id) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "product_quantity", line_item->product_quantity) == NULL) {
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

    // line_item->product_brand
    cJSON *product_brand = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_brand");
    if (product_brand) { 
    if(!cJSON_IsString(product_brand) && !cJSON_IsNull(product_brand))
    {
    goto end; //String
    }
    }

    // line_item->product_category
    cJSON *product_category = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_category");
    if (product_category) { 
    if(!cJSON_IsString(product_category) && !cJSON_IsNull(product_category))
    {
    goto end; //String
    }
    }

    // line_item->product_id
    cJSON *product_id = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_id");
    if (product_id) { 
    if(!cJSON_IsNumber(product_id))
    {
    goto end; //Numeric
    }
    }

    // line_item->product_name
    cJSON *product_name = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_name");
    if (product_name) { 
    if(!cJSON_IsString(product_name) && !cJSON_IsNull(product_name))
    {
    goto end; //String
    }
    }

    // line_item->product_price
    cJSON *product_price = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_price");
    if (product_price) { 
    if(!cJSON_IsString(product_price) && !cJSON_IsNull(product_price))
    {
    goto end; //String
    }
    }

    // line_item->product_quantity
    cJSON *product_quantity = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_quantity");
    if (product_quantity) { 
    if(!cJSON_IsNumber(product_quantity))
    {
    goto end; //Numeric
    }
    }

    // line_item->product_variant
    cJSON *product_variant = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_variant");
    if (product_variant) { 
    if(!cJSON_IsString(product_variant) && !cJSON_IsNull(product_variant))
    {
    goto end; //String
    }
    }

    // line_item->product_variant_id
    cJSON *product_variant_id = cJSON_GetObjectItemCaseSensitive(line_itemJSON, "product_variant_id");
    if (product_variant_id) { 
    if(!cJSON_IsString(product_variant_id) && !cJSON_IsNull(product_variant_id))
    {
    goto end; //String
    }
    }


    line_item_local_var = line_item_create (
        product_brand && !cJSON_IsNull(product_brand) ? strdup(product_brand->valuestring) : NULL,
        product_category && !cJSON_IsNull(product_category) ? strdup(product_category->valuestring) : NULL,
        product_id ? product_id->valuedouble : 0,
        product_name && !cJSON_IsNull(product_name) ? strdup(product_name->valuestring) : NULL,
        product_price && !cJSON_IsNull(product_price) ? strdup(product_price->valuestring) : NULL,
        product_quantity ? product_quantity->valuedouble : 0,
        product_variant && !cJSON_IsNull(product_variant) ? strdup(product_variant->valuestring) : NULL,
        product_variant_id && !cJSON_IsNull(product_variant_id) ? strdup(product_variant_id->valuestring) : NULL
        );

    return line_item_local_var;
end:
    return NULL;

}
