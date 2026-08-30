#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_categories_metrics_highlights.h"



static product_categories_metrics_highlights_t *product_categories_metrics_highlights_create_internal(
    inner_product_categories_metrics_highlights_t *engagement,
    inner_product_categories_metrics_highlights_t *outbound_clicks,
    inner_product_categories_metrics_highlights_t *pin_saves
    ) {
    product_categories_metrics_highlights_t *product_categories_metrics_highlights_local_var = malloc(sizeof(product_categories_metrics_highlights_t));
    if (!product_categories_metrics_highlights_local_var) {
        return NULL;
    }
    memset(product_categories_metrics_highlights_local_var, 0, sizeof(product_categories_metrics_highlights_t));
    product_categories_metrics_highlights_local_var->_library_owned = 1;
    product_categories_metrics_highlights_local_var->engagement = engagement;
    product_categories_metrics_highlights_local_var->outbound_clicks = outbound_clicks;
    product_categories_metrics_highlights_local_var->pin_saves = pin_saves;
    return product_categories_metrics_highlights_local_var;
}

__attribute__((deprecated)) product_categories_metrics_highlights_t *product_categories_metrics_highlights_create(
    inner_product_categories_metrics_highlights_t *engagement,
    inner_product_categories_metrics_highlights_t *outbound_clicks,
    inner_product_categories_metrics_highlights_t *pin_saves
    ) {
    product_categories_metrics_highlights_t *result = product_categories_metrics_highlights_create_internal (
        engagement,
        outbound_clicks,
        pin_saves
        );
    if (!result) {
    }
    return result;
}

void product_categories_metrics_highlights_free(product_categories_metrics_highlights_t *product_categories_metrics_highlights) {
    if(NULL == product_categories_metrics_highlights){
        return ;
    }
    if(product_categories_metrics_highlights->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_categories_metrics_highlights_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_categories_metrics_highlights->engagement) {
        inner_product_categories_metrics_highlights_free(product_categories_metrics_highlights->engagement);
        product_categories_metrics_highlights->engagement = NULL;
    }
    if (product_categories_metrics_highlights->outbound_clicks) {
        inner_product_categories_metrics_highlights_free(product_categories_metrics_highlights->outbound_clicks);
        product_categories_metrics_highlights->outbound_clicks = NULL;
    }
    if (product_categories_metrics_highlights->pin_saves) {
        inner_product_categories_metrics_highlights_free(product_categories_metrics_highlights->pin_saves);
        product_categories_metrics_highlights->pin_saves = NULL;
    }
    free(product_categories_metrics_highlights);
}

cJSON *product_categories_metrics_highlights_convertToJSON(product_categories_metrics_highlights_t *product_categories_metrics_highlights) {
    cJSON *item = cJSON_CreateObject();

    // product_categories_metrics_highlights->engagement
    if(product_categories_metrics_highlights->engagement) {
    cJSON *engagement_local_JSON = inner_product_categories_metrics_highlights_convertToJSON(product_categories_metrics_highlights->engagement);
    if(engagement_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "engagement", engagement_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // product_categories_metrics_highlights->outbound_clicks
    if(product_categories_metrics_highlights->outbound_clicks) {
    cJSON *outbound_clicks_local_JSON = inner_product_categories_metrics_highlights_convertToJSON(product_categories_metrics_highlights->outbound_clicks);
    if(outbound_clicks_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "outbound_clicks", outbound_clicks_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // product_categories_metrics_highlights->pin_saves
    if(product_categories_metrics_highlights->pin_saves) {
    cJSON *pin_saves_local_JSON = inner_product_categories_metrics_highlights_convertToJSON(product_categories_metrics_highlights->pin_saves);
    if(pin_saves_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pin_saves", pin_saves_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

product_categories_metrics_highlights_t *product_categories_metrics_highlights_parseFromJSON(cJSON *product_categories_metrics_highlightsJSON){

    product_categories_metrics_highlights_t *product_categories_metrics_highlights_local_var = NULL;

    // define the local variable for product_categories_metrics_highlights->engagement
    inner_product_categories_metrics_highlights_t *engagement_local_nonprim = NULL;

    // define the local variable for product_categories_metrics_highlights->outbound_clicks
    inner_product_categories_metrics_highlights_t *outbound_clicks_local_nonprim = NULL;

    // define the local variable for product_categories_metrics_highlights->pin_saves
    inner_product_categories_metrics_highlights_t *pin_saves_local_nonprim = NULL;

    // product_categories_metrics_highlights->engagement
    cJSON *engagement = cJSON_GetObjectItemCaseSensitive(product_categories_metrics_highlightsJSON, "engagement");
    if (cJSON_IsNull(engagement)) {
        engagement = NULL;
    }
    if (engagement) { 
    engagement_local_nonprim = inner_product_categories_metrics_highlights_parseFromJSON(engagement); //nonprimitive
    }

    // product_categories_metrics_highlights->outbound_clicks
    cJSON *outbound_clicks = cJSON_GetObjectItemCaseSensitive(product_categories_metrics_highlightsJSON, "outbound_clicks");
    if (cJSON_IsNull(outbound_clicks)) {
        outbound_clicks = NULL;
    }
    if (outbound_clicks) { 
    outbound_clicks_local_nonprim = inner_product_categories_metrics_highlights_parseFromJSON(outbound_clicks); //nonprimitive
    }

    // product_categories_metrics_highlights->pin_saves
    cJSON *pin_saves = cJSON_GetObjectItemCaseSensitive(product_categories_metrics_highlightsJSON, "pin_saves");
    if (cJSON_IsNull(pin_saves)) {
        pin_saves = NULL;
    }
    if (pin_saves) { 
    pin_saves_local_nonprim = inner_product_categories_metrics_highlights_parseFromJSON(pin_saves); //nonprimitive
    }



    product_categories_metrics_highlights_local_var = product_categories_metrics_highlights_create_internal (
        engagement ? engagement_local_nonprim : NULL,
        outbound_clicks ? outbound_clicks_local_nonprim : NULL,
        pin_saves ? pin_saves_local_nonprim : NULL
        );

    if (!product_categories_metrics_highlights_local_var) {
        goto end;
    }

    return product_categories_metrics_highlights_local_var;
end:
    if (engagement_local_nonprim) {
        inner_product_categories_metrics_highlights_free(engagement_local_nonprim);
        engagement_local_nonprim = NULL;
    }
    if (outbound_clicks_local_nonprim) {
        inner_product_categories_metrics_highlights_free(outbound_clicks_local_nonprim);
        outbound_clicks_local_nonprim = NULL;
    }
    if (pin_saves_local_nonprim) {
        inner_product_categories_metrics_highlights_free(pin_saves_local_nonprim);
        pin_saves_local_nonprim = NULL;
    }
    return NULL;

}
