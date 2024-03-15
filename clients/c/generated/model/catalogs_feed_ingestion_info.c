#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_ingestion_info.h"



catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info_create(
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

    return catalogs_feed_ingestion_info_local_var;
}


void catalogs_feed_ingestion_info_free(catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info) {
    if(NULL == catalogs_feed_ingestion_info){
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
    if (in_stock) { 
    if(!cJSON_IsNumber(in_stock))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_info->out_of_stock
    cJSON *out_of_stock = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_infoJSON, "OUT_OF_STOCK");
    if (out_of_stock) { 
    if(!cJSON_IsNumber(out_of_stock))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_ingestion_info->preorder
    cJSON *preorder = cJSON_GetObjectItemCaseSensitive(catalogs_feed_ingestion_infoJSON, "PREORDER");
    if (preorder) { 
    if(!cJSON_IsNumber(preorder))
    {
    goto end; //Numeric
    }
    }


    catalogs_feed_ingestion_info_local_var = catalogs_feed_ingestion_info_create (
        in_stock ? in_stock->valuedouble : 0,
        out_of_stock ? out_of_stock->valuedouble : 0,
        preorder ? preorder->valuedouble : 0
        );

    return catalogs_feed_ingestion_info_local_var;
end:
    return NULL;

}
