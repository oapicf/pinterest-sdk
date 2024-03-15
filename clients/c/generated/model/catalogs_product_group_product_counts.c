#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_product_counts.h"



catalogs_product_group_product_counts_t *catalogs_product_group_product_counts_create(
    double in_stock,
    double out_of_stock,
    double preorder,
    double total
    ) {
    catalogs_product_group_product_counts_t *catalogs_product_group_product_counts_local_var = malloc(sizeof(catalogs_product_group_product_counts_t));
    if (!catalogs_product_group_product_counts_local_var) {
        return NULL;
    }
    catalogs_product_group_product_counts_local_var->in_stock = in_stock;
    catalogs_product_group_product_counts_local_var->out_of_stock = out_of_stock;
    catalogs_product_group_product_counts_local_var->preorder = preorder;
    catalogs_product_group_product_counts_local_var->total = total;

    return catalogs_product_group_product_counts_local_var;
}


void catalogs_product_group_product_counts_free(catalogs_product_group_product_counts_t *catalogs_product_group_product_counts) {
    if(NULL == catalogs_product_group_product_counts){
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_product_group_product_counts);
}

cJSON *catalogs_product_group_product_counts_convertToJSON(catalogs_product_group_product_counts_t *catalogs_product_group_product_counts) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_product_counts->in_stock
    if (!catalogs_product_group_product_counts->in_stock) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "in_stock", catalogs_product_group_product_counts->in_stock) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts->out_of_stock
    if (!catalogs_product_group_product_counts->out_of_stock) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "out_of_stock", catalogs_product_group_product_counts->out_of_stock) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts->preorder
    if (!catalogs_product_group_product_counts->preorder) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "preorder", catalogs_product_group_product_counts->preorder) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_product_counts->total
    if (!catalogs_product_group_product_counts->total) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total", catalogs_product_group_product_counts->total) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_product_counts_t *catalogs_product_group_product_counts_parseFromJSON(cJSON *catalogs_product_group_product_countsJSON){

    catalogs_product_group_product_counts_t *catalogs_product_group_product_counts_local_var = NULL;

    // catalogs_product_group_product_counts->in_stock
    cJSON *in_stock = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_countsJSON, "in_stock");
    if (!in_stock) {
        goto end;
    }

    
    if(!cJSON_IsNumber(in_stock))
    {
    goto end; //Numeric
    }

    // catalogs_product_group_product_counts->out_of_stock
    cJSON *out_of_stock = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_countsJSON, "out_of_stock");
    if (!out_of_stock) {
        goto end;
    }

    
    if(!cJSON_IsNumber(out_of_stock))
    {
    goto end; //Numeric
    }

    // catalogs_product_group_product_counts->preorder
    cJSON *preorder = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_countsJSON, "preorder");
    if (!preorder) {
        goto end;
    }

    
    if(!cJSON_IsNumber(preorder))
    {
    goto end; //Numeric
    }

    // catalogs_product_group_product_counts->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_product_countsJSON, "total");
    if (!total) {
        goto end;
    }

    
    if(!cJSON_IsNumber(total))
    {
    goto end; //Numeric
    }


    catalogs_product_group_product_counts_local_var = catalogs_product_group_product_counts_create (
        in_stock->valuedouble,
        out_of_stock->valuedouble,
        preorder->valuedouble,
        total->valuedouble
        );

    return catalogs_product_group_product_counts_local_var;
end:
    return NULL;

}
