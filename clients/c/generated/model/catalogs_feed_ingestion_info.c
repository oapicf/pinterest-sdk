#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_ingestion_info.h"



static catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info_create_internal(
    int in_stock,
    int out_of_stock,
    int preorder
    ) {
    catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info_local_var = malloc(sizeof(catalogs_feed_ingestion_info_t));
    if (!catalogs_feed_ingestion_info_local_var) {
        return NULL;
    }
    catalogs_feed_ingestion_info_local_var->in_stock = in_stock;
    catalogs_feed_ingestion_info_local_var->out_of_stock = out_of_stock;
    catalogs_feed_ingestion_info_local_var->preorder = preorder;

    catalogs_feed_ingestion_info_local_var->_library_owned = 1;
    return catalogs_feed_ingestion_info_local_var;
}

__attribute__((deprecated)) catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info_create(
    int in_stock,
    int out_of_stock,
    int preorder
    ) {
    return catalogs_feed_ingestion_info_create_internal (
        in_stock,
        out_of_stock,
        preorder
        );
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
    free(catalogs_feed_ingestion_info);
}

cJSON *catalogs_feed_ingestion_info_convertToJSON(catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_ingestion_info->in_stock
    if(catalogs_feed_ingestion_info->in_stock) {
    if(cJSON_AddNumberToObject(item, "IN_STOCK", catalogs_feed_ingestion_info->in_stock) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_info->out_of_stock
    if(catalogs_feed_ingestion_info->out_of_stock) {
    if(cJSON_AddNumberToObject(item, "OUT_OF_STOCK", catalogs_feed_ingestion_info->out_of_stock) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_ingestion_info->preorder
    if(catalogs_feed_ingestion_info->preorder) {
    if(cJSON_AddNumberToObject(item, "PREORDER", catalogs_feed_ingestion_info->preorder) == NULL) {
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
    }


    catalogs_feed_ingestion_info_local_var = catalogs_feed_ingestion_info_create_internal (
        in_stock ? in_stock->valuedouble : 0,
        out_of_stock ? out_of_stock->valuedouble : 0,
        preorder ? preorder->valuedouble : 0
        );

    return catalogs_feed_ingestion_info_local_var;
end:
    return NULL;

}
