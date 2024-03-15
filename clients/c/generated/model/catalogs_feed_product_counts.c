#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_product_counts.h"



catalogs_feed_product_counts_t *catalogs_feed_product_counts_create(
    int original,
    int ingested
    ) {
    catalogs_feed_product_counts_t *catalogs_feed_product_counts_local_var = malloc(sizeof(catalogs_feed_product_counts_t));
    if (!catalogs_feed_product_counts_local_var) {
        return NULL;
    }
    catalogs_feed_product_counts_local_var->original = original;
    catalogs_feed_product_counts_local_var->ingested = ingested;

    return catalogs_feed_product_counts_local_var;
}


void catalogs_feed_product_counts_free(catalogs_feed_product_counts_t *catalogs_feed_product_counts) {
    if(NULL == catalogs_feed_product_counts){
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_feed_product_counts);
}

cJSON *catalogs_feed_product_counts_convertToJSON(catalogs_feed_product_counts_t *catalogs_feed_product_counts) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_product_counts->original
    if(catalogs_feed_product_counts->original) {
    if(cJSON_AddNumberToObject(item, "original", catalogs_feed_product_counts->original) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_product_counts->ingested
    if(catalogs_feed_product_counts->ingested) {
    if(cJSON_AddNumberToObject(item, "ingested", catalogs_feed_product_counts->ingested) == NULL) {
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

catalogs_feed_product_counts_t *catalogs_feed_product_counts_parseFromJSON(cJSON *catalogs_feed_product_countsJSON){

    catalogs_feed_product_counts_t *catalogs_feed_product_counts_local_var = NULL;

    // catalogs_feed_product_counts->original
    cJSON *original = cJSON_GetObjectItemCaseSensitive(catalogs_feed_product_countsJSON, "original");
    if (original) { 
    if(!cJSON_IsNumber(original))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_product_counts->ingested
    cJSON *ingested = cJSON_GetObjectItemCaseSensitive(catalogs_feed_product_countsJSON, "ingested");
    if (ingested) { 
    if(!cJSON_IsNumber(ingested))
    {
    goto end; //Numeric
    }
    }


    catalogs_feed_product_counts_local_var = catalogs_feed_product_counts_create (
        original ? original->valuedouble : 0,
        ingested ? ingested->valuedouble : 0
        );

    return catalogs_feed_product_counts_local_var;
end:
    return NULL;

}
