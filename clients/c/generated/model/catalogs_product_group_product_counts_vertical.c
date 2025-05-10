#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_product_counts_vertical.h"



static catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_create_internal(
    pinterest_rest_api_catalogs_type__e catalog_type,
    double in_stock,
    double out_of_stock,
    double preorder,
    double total,
    double videos
    ) {
    catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_local_var = malloc(sizeof(catalogs_product_group_product_counts_vertical_t));
    if (!catalogs_product_group_product_counts_vertical_local_var) {
        return NULL;
    }
    catalogs_product_group_product_counts_vertical_local_var->catalog_type = catalog_type;
    catalogs_product_group_product_counts_vertical_local_var->in_stock = in_stock;
    catalogs_product_group_product_counts_vertical_local_var->out_of_stock = out_of_stock;
    catalogs_product_group_product_counts_vertical_local_var->preorder = preorder;
    catalogs_product_group_product_counts_vertical_local_var->total = total;
    catalogs_product_group_product_counts_vertical_local_var->videos = videos;

    catalogs_product_group_product_counts_vertical_local_var->_library_owned = 1;
    return catalogs_product_group_product_counts_vertical_local_var;
}

__attribute__((deprecated)) catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    double in_stock,
    double out_of_stock,
    double preorder,
    double total,
    double videos
    ) {
    return catalogs_product_group_product_counts_vertical_create_internal (
        catalog_type,
        in_stock,
        out_of_stock,
        preorder,
        total,
        videos
        );
}

void catalogs_product_group_product_counts_vertical_free(catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical) {
    if(NULL == catalogs_product_group_product_counts_vertical){
        return ;
    }
    if(catalogs_product_group_product_counts_vertical->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_product_counts_vertical_free");
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_product_group_product_counts_vertical);
}

cJSON *catalogs_product_group_product_counts_vertical_convertToJSON(catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_product_counts_vertical->catalog_type
    if (pinterest_rest_api_catalogs_type__NULL == catalogs_product_group_product_counts_vertical->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_product_group_product_counts_vertical->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_product_group_product_counts_vertical->in_stock
    if (!catalogs_product_group_product_counts_vertical->in_stock) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "in_stock", catalogs_product_group_product_counts_vertical->in_stock) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts_vertical->out_of_stock
    if (!catalogs_product_group_product_counts_vertical->out_of_stock) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "out_of_stock", catalogs_product_group_product_counts_vertical->out_of_stock) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts_vertical->preorder
    if (!catalogs_product_group_product_counts_vertical->preorder) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "preorder", catalogs_product_group_product_counts_vertical->preorder) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts_vertical->total
    if (!catalogs_product_group_product_counts_vertical->total) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total", catalogs_product_group_product_counts_vertical->total) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts_vertical->videos
    if (!catalogs_product_group_product_counts_vertical->videos) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "videos", catalogs_product_group_product_counts_vertical->videos) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_parseFromJSON(cJSON *catalogs_product_group_product_counts_verticalJSON){

    catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_local_var = NULL;

    // define the local variable for catalogs_product_group_product_counts_vertical->catalog_type
    pinterest_rest_api_catalogs_type__e catalog_type_local_nonprim = 0;

    // catalogs_product_group_product_counts_vertical->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_product_group_product_counts_vertical->in_stock
    cJSON *in_stock = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "in_stock");
    if (cJSON_IsNull(in_stock)) {
        in_stock = NULL;
    }
    if (!in_stock) {
        goto end;
    }

    
    if(!cJSON_IsNumber(in_stock))
    {
    goto end; //Numeric
    }

    // catalogs_product_group_product_counts_vertical->out_of_stock
    cJSON *out_of_stock = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "out_of_stock");
    if (cJSON_IsNull(out_of_stock)) {
        out_of_stock = NULL;
    }
    if (!out_of_stock) {
        goto end;
    }

    
    if(!cJSON_IsNumber(out_of_stock))
    {
    goto end; //Numeric
    }

    // catalogs_product_group_product_counts_vertical->preorder
    cJSON *preorder = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "preorder");
    if (cJSON_IsNull(preorder)) {
        preorder = NULL;
    }
    if (!preorder) {
        goto end;
    }

    
    if(!cJSON_IsNumber(preorder))
    {
    goto end; //Numeric
    }

    // catalogs_product_group_product_counts_vertical->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "total");
    if (cJSON_IsNull(total)) {
        total = NULL;
    }
    if (!total) {
        goto end;
    }

    
    if(!cJSON_IsNumber(total))
    {
    goto end; //Numeric
    }

    // catalogs_product_group_product_counts_vertical->videos
    cJSON *videos = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_counts_verticalJSON, "videos");
    if (cJSON_IsNull(videos)) {
        videos = NULL;
    }
    if (!videos) {
        goto end;
    }

    
    if(!cJSON_IsNumber(videos))
    {
    goto end; //Numeric
    }


    catalogs_product_group_product_counts_vertical_local_var = catalogs_product_group_product_counts_vertical_create_internal (
        catalog_type_local_nonprim,
        in_stock->valuedouble,
        out_of_stock->valuedouble,
        preorder->valuedouble,
        total->valuedouble,
        videos->valuedouble
        );

    return catalogs_product_group_product_counts_vertical_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalog_type_local_nonprim = 0;
    }
    return NULL;

}
