#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "featured_trend.h"



static featured_trend_t *featured_trend_create_internal(
    interests_enum_t *interest,
    product_category_region_t *market,
    list_t *trends
    ) {
    featured_trend_t *featured_trend_local_var = malloc(sizeof(featured_trend_t));
    if (!featured_trend_local_var) {
        return NULL;
    }
    featured_trend_local_var->interest = interest;
    featured_trend_local_var->market = market;
    featured_trend_local_var->trends = trends;

    featured_trend_local_var->_library_owned = 1;
    return featured_trend_local_var;
}

__attribute__((deprecated)) featured_trend_t *featured_trend_create(
    interests_enum_t *interest,
    product_category_region_t *market,
    list_t *trends
    ) {
    return featured_trend_create_internal (
        interest,
        market,
        trends
        );
}

void featured_trend_free(featured_trend_t *featured_trend) {
    if(NULL == featured_trend){
        return ;
    }
    if(featured_trend->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "featured_trend_free");
        return ;
    }
    listEntry_t *listEntry;
    if (featured_trend->interest) {
        interests_enum_free(featured_trend->interest);
        featured_trend->interest = NULL;
    }
    if (featured_trend->market) {
        product_category_region_free(featured_trend->market);
        featured_trend->market = NULL;
    }
    if (featured_trend->trends) {
        list_ForEach(listEntry, featured_trend->trends) {
            trending_topic_free(listEntry->data);
        }
        list_freeList(featured_trend->trends);
        featured_trend->trends = NULL;
    }
    free(featured_trend);
}

cJSON *featured_trend_convertToJSON(featured_trend_t *featured_trend) {
    cJSON *item = cJSON_CreateObject();

    // featured_trend->interest
    if (!featured_trend->interest) {
        goto fail;
    }
    cJSON *interest_local_JSON = interests_enum_convertToJSON(featured_trend->interest);
    if(interest_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "interest", interest_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // featured_trend->market
    if(featured_trend->market) {
    cJSON *market_local_JSON = product_category_region_convertToJSON(featured_trend->market);
    if(market_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "market", market_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // featured_trend->trends
    if(featured_trend->trends) {
    cJSON *trends = cJSON_AddArrayToObject(item, "trends");
    if(trends == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *trendsListEntry;
    if (featured_trend->trends) {
    list_ForEach(trendsListEntry, featured_trend->trends) {
    cJSON *itemLocal = trending_topic_convertToJSON(trendsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(trends, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

featured_trend_t *featured_trend_parseFromJSON(cJSON *featured_trendJSON){

    featured_trend_t *featured_trend_local_var = NULL;

    // define the local variable for featured_trend->interest
    interests_enum_t *interest_local_nonprim = NULL;

    // define the local variable for featured_trend->market
    product_category_region_t *market_local_nonprim = NULL;

    // define the local list for featured_trend->trends
    list_t *trendsList = NULL;

    // featured_trend->interest
    cJSON *interest = cJSON_GetObjectItemCaseSensitive(featured_trendJSON, "interest");
    if (cJSON_IsNull(interest)) {
        interest = NULL;
    }
    if (!interest) {
        goto end;
    }

    
    interest_local_nonprim = interests_enum_parseFromJSON(interest); //custom

    // featured_trend->market
    cJSON *market = cJSON_GetObjectItemCaseSensitive(featured_trendJSON, "market");
    if (cJSON_IsNull(market)) {
        market = NULL;
    }
    if (market) { 
    market_local_nonprim = product_category_region_parseFromJSON(market); //custom
    }

    // featured_trend->trends
    cJSON *trends = cJSON_GetObjectItemCaseSensitive(featured_trendJSON, "trends");
    if (cJSON_IsNull(trends)) {
        trends = NULL;
    }
    if (trends) { 
    cJSON *trends_local_nonprimitive = NULL;
    if(!cJSON_IsArray(trends)){
        goto end; //nonprimitive container
    }

    trendsList = list_createList();

    cJSON_ArrayForEach(trends_local_nonprimitive,trends )
    {
        if(!cJSON_IsObject(trends_local_nonprimitive)){
            goto end;
        }
        trending_topic_t *trendsItem = trending_topic_parseFromJSON(trends_local_nonprimitive);

        list_addElement(trendsList, trendsItem);
    }
    }


    featured_trend_local_var = featured_trend_create_internal (
        interest_local_nonprim,
        market ? market_local_nonprim : NULL,
        trends ? trendsList : NULL
        );

    return featured_trend_local_var;
end:
    if (interest_local_nonprim) {
        interests_enum_free(interest_local_nonprim);
        interest_local_nonprim = NULL;
    }
    if (market_local_nonprim) {
        product_category_region_free(market_local_nonprim);
        market_local_nonprim = NULL;
    }
    if (trendsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, trendsList) {
            trending_topic_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(trendsList);
        trendsList = NULL;
    }
    return NULL;

}
