#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_ingestion_info.h"



static catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info_create_internal(
    int *in_stock,
    int *out_of_stock,
    int *preorder
    ) {
    catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info_local_var = malloc(sizeof(catalogs_feed_ingestion_info_t));
    if (!catalogs_feed_ingestion_info_local_var) {
        return NULL;
    }
    memset(catalogs_feed_ingestion_info_local_var, 0, sizeof(catalogs_feed_ingestion_info_t));
    catalogs_feed_ingestion_info_local_var->_library_owned = 1;
    catalogs_feed_ingestion_info_local_var->in_stock = in_stock;
    catalogs_feed_ingestion_info_local_var->out_of_stock = out_of_stock;
    catalogs_feed_ingestion_info_local_var->preorder = preorder;
    return catalogs_feed_ingestion_info_local_var;
}

__attribute__((deprecated)) catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info_create(
    int *in_stock,
    int *out_of_stock,
    int *preorder
    ) {
    int *in_stock_copy = NULL;
    if (in_stock) {
        in_stock_copy = malloc(sizeof(int));
        if (in_stock_copy) *in_stock_copy = *in_stock;
    }
    int *out_of_stock_copy = NULL;
    if (out_of_stock) {
        out_of_stock_copy = malloc(sizeof(int));
        if (out_of_stock_copy) *out_of_stock_copy = *out_of_stock;
    }
    int *preorder_copy = NULL;
    if (preorder) {
        preorder_copy = malloc(sizeof(int));
        if (preorder_copy) *preorder_copy = *preorder;
    }
    catalogs_feed_ingestion_info_t *result = catalogs_feed_ingestion_info_create_internal (
        in_stock_copy,
        out_of_stock_copy,
        preorder_copy
        );
    if (!result) {
        free(in_stock_copy);
        free(out_of_stock_copy);
        free(preorder_copy);
    }
    return result;
}

void catalogs_feed_ingestion_info_free(catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info) {
    if(NULL == catalogs_feed_ingestion_info){
        return ;
    }
    if(catalogs_feed_ingestion_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feed_ingestion_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_ingestion_info->in_stock) {
        free(catalogs_feed_ingestion_info->in_stock);
        catalogs_feed_ingestion_info->in_stock = NULL;
    }
    if (catalogs_feed_ingestion_info->out_of_stock) {
        free(catalogs_feed_ingestion_info->out_of_stock);
        catalogs_feed_ingestion_info->out_of_stock = NULL;
    }
    if (catalogs_feed_ingestion_info->preorder) {
        free(catalogs_feed_ingestion_info->preorder);
        catalogs_feed_ingestion_info->preorder = NULL;
    }
    free(catalogs_feed_ingestion_info);
}

cJSON *catalogs_feed_ingestion_info_convertToJSON(catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_ingestion_info->in_stock
    if(catalogs_feed_ingestion_info->in_stock) {
    if(cJSON_AddNumberToObject(item, "IN_STOCK", *catalogs_feed_ingestion_info->in_stock) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_info->out_of_stock
    if(catalogs_feed_ingestion_info->out_of_stock) {
    if(cJSON_AddNumberToObject(item, "OUT_OF_STOCK", *catalogs_feed_ingestion_info->out_of_stock) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_info->preorder
    if(catalogs_feed_ingestion_info->preorder) {
    if(cJSON_AddNumberToObject(item, "PREORDER", *catalogs_feed_ingestion_info->preorder) == NULL) {
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

catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info_parseFromJSON(cJSON *catalogs_feed_ingestion_infoJSON){

    catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_info->in_stock
    int *in_stock_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_info->out_of_stock
    int *out_of_stock_local_var = NULL;

    // define the local variable for catalogs_feed_ingestion_info->preorder
    int *preorder_local_var = NULL;

    // catalogs_feed_ingestion_info->in_stock
    cJSON *in_stock = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_infoJSON, "IN_STOCK");
    if (cJSON_IsNull(in_stock)) {
        in_stock = NULL;
    }
    if (in_stock) { 
    if(!cJSON_IsNumber(in_stock))
    {
    goto end; //Numeric
    }
    in_stock_local_var = malloc(sizeof(int));
    if(!in_stock_local_var)
    {
        goto end;
    }
    *in_stock_local_var = in_stock->valuedouble;
    }

    // catalogs_feed_ingestion_info->out_of_stock
    cJSON *out_of_stock = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_infoJSON, "OUT_OF_STOCK");
    if (cJSON_IsNull(out_of_stock)) {
        out_of_stock = NULL;
    }
    if (out_of_stock) { 
    if(!cJSON_IsNumber(out_of_stock))
    {
    goto end; //Numeric
    }
    out_of_stock_local_var = malloc(sizeof(int));
    if(!out_of_stock_local_var)
    {
        goto end;
    }
    *out_of_stock_local_var = out_of_stock->valuedouble;
    }

    // catalogs_feed_ingestion_info->preorder
    cJSON *preorder = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_infoJSON, "PREORDER");
    if (cJSON_IsNull(preorder)) {
        preorder = NULL;
    }
    if (preorder) { 
    if(!cJSON_IsNumber(preorder))
    {
    goto end; //Numeric
    }
    preorder_local_var = malloc(sizeof(int));
    if(!preorder_local_var)
    {
        goto end;
    }
    *preorder_local_var = preorder->valuedouble;
    }



    catalogs_feed_ingestion_info_local_var = catalogs_feed_ingestion_info_create_internal (
        in_stock_local_var,
        out_of_stock_local_var,
        preorder_local_var
        );

    if (!catalogs_feed_ingestion_info_local_var) {
        goto end;
    }

    return catalogs_feed_ingestion_info_local_var;
end:
    if (in_stock_local_var) {
        free(in_stock_local_var);
        in_stock_local_var = NULL;
    }
    if (out_of_stock_local_var) {
        free(out_of_stock_local_var);
        out_of_stock_local_var = NULL;
    }
    if (preorder_local_var) {
        free(preorder_local_var);
        preorder_local_var = NULL;
    }
    return NULL;

}
