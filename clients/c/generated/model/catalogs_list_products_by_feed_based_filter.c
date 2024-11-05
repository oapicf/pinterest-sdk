#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_list_products_by_feed_based_filter.h"



catalogs_list_products_by_feed_based_filter_t *catalogs_list_products_by_feed_based_filter_create(
    char *feed_id,
    catalogs_product_group_filters_t *filters
    ) {
    catalogs_list_products_by_feed_based_filter_t *catalogs_list_products_by_feed_based_filter_local_var = malloc(sizeof(catalogs_list_products_by_feed_based_filter_t));
    if (!catalogs_list_products_by_feed_based_filter_local_var) {
        return NULL;
    }
    catalogs_list_products_by_feed_based_filter_local_var->feed_id = feed_id;
    catalogs_list_products_by_feed_based_filter_local_var->filters = filters;

    return catalogs_list_products_by_feed_based_filter_local_var;
}


void catalogs_list_products_by_feed_based_filter_free(catalogs_list_products_by_feed_based_filter_t *catalogs_list_products_by_feed_based_filter) {
    if(NULL == catalogs_list_products_by_feed_based_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_list_products_by_feed_based_filter->feed_id) {
        free(catalogs_list_products_by_feed_based_filter->feed_id);
        catalogs_list_products_by_feed_based_filter->feed_id = NULL;
    }
    if (catalogs_list_products_by_feed_based_filter->filters) {
        catalogs_product_group_filters_free(catalogs_list_products_by_feed_based_filter->filters);
        catalogs_list_products_by_feed_based_filter->filters = NULL;
    }
    free(catalogs_list_products_by_feed_based_filter);
}

cJSON *catalogs_list_products_by_feed_based_filter_convertToJSON(catalogs_list_products_by_feed_based_filter_t *catalogs_list_products_by_feed_based_filter) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_list_products_by_feed_based_filter->feed_id
    if (!catalogs_list_products_by_feed_based_filter->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", catalogs_list_products_by_feed_based_filter->feed_id) == NULL) {
    goto fail; //String
    }


    // catalogs_list_products_by_feed_based_filter->filters
    if (!catalogs_list_products_by_feed_based_filter->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_product_group_filters_convertToJSON(catalogs_list_products_by_feed_based_filter->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_list_products_by_feed_based_filter_t *catalogs_list_products_by_feed_based_filter_parseFromJSON(cJSON *catalogs_list_products_by_feed_based_filterJSON){

    catalogs_list_products_by_feed_based_filter_t *catalogs_list_products_by_feed_based_filter_local_var = NULL;

    // define the local variable for catalogs_list_products_by_feed_based_filter->filters
    catalogs_product_group_filters_t *filters_local_nonprim = NULL;

    // catalogs_list_products_by_feed_based_filter->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(catalogs_list_products_by_feed_based_filterJSON, "feed_id");
    if (!feed_id) {
        goto end;
    }

    
    if(!cJSON_IsString(feed_id))
    {
    goto end; //String
    }

    // catalogs_list_products_by_feed_based_filter->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_list_products_by_feed_based_filterJSON, "filters");
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_product_group_filters_parseFromJSON(filters); //nonprimitive


    catalogs_list_products_by_feed_based_filter_local_var = catalogs_list_products_by_feed_based_filter_create (
        strdup(feed_id->valuestring),
        filters_local_nonprim
        );

    return catalogs_list_products_by_feed_based_filter_local_var;
end:
    if (filters_local_nonprim) {
        catalogs_product_group_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    return NULL;

}
