#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inner_product_categories_metrics_highlights.h"



static inner_product_categories_metrics_highlights_t *inner_product_categories_metrics_highlights_create_internal(
    double pct_change_mom
    ) {
    inner_product_categories_metrics_highlights_t *inner_product_categories_metrics_highlights_local_var = malloc(sizeof(inner_product_categories_metrics_highlights_t));
    if (!inner_product_categories_metrics_highlights_local_var) {
        return NULL;
    }
    inner_product_categories_metrics_highlights_local_var->pct_change_mom = pct_change_mom;

    inner_product_categories_metrics_highlights_local_var->_library_owned = 1;
    return inner_product_categories_metrics_highlights_local_var;
}

__attribute__((deprecated)) inner_product_categories_metrics_highlights_t *inner_product_categories_metrics_highlights_create(
    double pct_change_mom
    ) {
    return inner_product_categories_metrics_highlights_create_internal (
        pct_change_mom
        );
}

void inner_product_categories_metrics_highlights_free(inner_product_categories_metrics_highlights_t *inner_product_categories_metrics_highlights) {
    if(NULL == inner_product_categories_metrics_highlights){
        return ;
    }
    if(inner_product_categories_metrics_highlights->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "inner_product_categories_metrics_highlights_free");
        return ;
    }
    listEntry_t *listEntry;
    free(inner_product_categories_metrics_highlights);
}

cJSON *inner_product_categories_metrics_highlights_convertToJSON(inner_product_categories_metrics_highlights_t *inner_product_categories_metrics_highlights) {
    cJSON *item = cJSON_CreateObject();

    // inner_product_categories_metrics_highlights->pct_change_mom
    if (!inner_product_categories_metrics_highlights->pct_change_mom) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "pct_change_mom", inner_product_categories_metrics_highlights->pct_change_mom) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

inner_product_categories_metrics_highlights_t *inner_product_categories_metrics_highlights_parseFromJSON(cJSON *inner_product_categories_metrics_highlightsJSON){

    inner_product_categories_metrics_highlights_t *inner_product_categories_metrics_highlights_local_var = NULL;

    // inner_product_categories_metrics_highlights->pct_change_mom
    cJSON *pct_change_mom = cJSON_GetObjectItemCaseSensitive(inner_product_categories_metrics_highlightsJSON, "pct_change_mom");
    if (cJSON_IsNull(pct_change_mom)) {
        pct_change_mom = NULL;
    }
    if (!pct_change_mom) {
        goto end;
    }

    
    if(!cJSON_IsNumber(pct_change_mom))
    {
    goto end; //Numeric
    }


    inner_product_categories_metrics_highlights_local_var = inner_product_categories_metrics_highlights_create_internal (
        pct_change_mom->valuedouble
        );

    return inner_product_categories_metrics_highlights_local_var;
end:
    return NULL;

}
