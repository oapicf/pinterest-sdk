#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_product_counts.h"



static catalogs_feed_product_counts_t *catalogs_feed_product_counts_create_internal(
    int *ingested,
    int *original
    ) {
    catalogs_feed_product_counts_t *catalogs_feed_product_counts_local_var = malloc(sizeof(catalogs_feed_product_counts_t));
    if (!catalogs_feed_product_counts_local_var) {
        return NULL;
    }
    memset(catalogs_feed_product_counts_local_var, 0, sizeof(catalogs_feed_product_counts_t));
    catalogs_feed_product_counts_local_var->_library_owned = 1;
    catalogs_feed_product_counts_local_var->ingested = ingested;
    catalogs_feed_product_counts_local_var->original = original;
    return catalogs_feed_product_counts_local_var;
}

__attribute__((deprecated)) catalogs_feed_product_counts_t *catalogs_feed_product_counts_create(
    int *ingested,
    int *original
    ) {
    int *ingested_copy = NULL;
    if (ingested) {
        ingested_copy = malloc(sizeof(int));
        if (ingested_copy) *ingested_copy = *ingested;
    }
    int *original_copy = NULL;
    if (original) {
        original_copy = malloc(sizeof(int));
        if (original_copy) *original_copy = *original;
    }
    catalogs_feed_product_counts_t *result = catalogs_feed_product_counts_create_internal (
        ingested_copy,
        original_copy
        );
    if (!result) {
        free(ingested_copy);
        free(original_copy);
    }
    return result;
}

void catalogs_feed_product_counts_free(catalogs_feed_product_counts_t *catalogs_feed_product_counts) {
    if(NULL == catalogs_feed_product_counts){
        return ;
    }
    if(catalogs_feed_product_counts->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feed_product_counts_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_product_counts->ingested) {
        free(catalogs_feed_product_counts->ingested);
        catalogs_feed_product_counts->ingested = NULL;
    }
    if (catalogs_feed_product_counts->original) {
        free(catalogs_feed_product_counts->original);
        catalogs_feed_product_counts->original = NULL;
    }
    free(catalogs_feed_product_counts);
}

cJSON *catalogs_feed_product_counts_convertToJSON(catalogs_feed_product_counts_t *catalogs_feed_product_counts) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_product_counts->ingested
    if(catalogs_feed_product_counts->ingested) {
    if(cJSON_AddNumberToObject(item, "ingested", *catalogs_feed_product_counts->ingested) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_product_counts->original
    if(catalogs_feed_product_counts->original) {
    if(cJSON_AddNumberToObject(item, "original", *catalogs_feed_product_counts->original) == NULL) {
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

    // define the local variable for catalogs_feed_product_counts->ingested
    int *ingested_local_var = NULL;

    // define the local variable for catalogs_feed_product_counts->original
    int *original_local_var = NULL;

    // catalogs_feed_product_counts->ingested
    cJSON *ingested = cJSON_GetObjectItemCaseSensitive(catalogs_feed_product_countsJSON, "ingested");
    if (cJSON_IsNull(ingested)) {
        ingested = NULL;
    }
    if (ingested) { 
    if(!cJSON_IsNumber(ingested))
    {
    goto end; //Numeric
    }
    ingested_local_var = malloc(sizeof(int));
    if(!ingested_local_var)
    {
        goto end;
    }
    *ingested_local_var = ingested->valuedouble;
    }

    // catalogs_feed_product_counts->original
    cJSON *original = cJSON_GetObjectItemCaseSensitive(catalogs_feed_product_countsJSON, "original");
    if (cJSON_IsNull(original)) {
        original = NULL;
    }
    if (original) { 
    if(!cJSON_IsNumber(original))
    {
    goto end; //Numeric
    }
    original_local_var = malloc(sizeof(int));
    if(!original_local_var)
    {
        goto end;
    }
    *original_local_var = original->valuedouble;
    }



    catalogs_feed_product_counts_local_var = catalogs_feed_product_counts_create_internal (
        ingested_local_var,
        original_local_var
        );

    if (!catalogs_feed_product_counts_local_var) {
        goto end;
    }

    return catalogs_feed_product_counts_local_var;
end:
    if (ingested_local_var) {
        free(ingested_local_var);
        ingested_local_var = NULL;
    }
    if (original_local_var) {
        free(original_local_var);
        original_local_var = NULL;
    }
    return NULL;

}
