#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_list_products_by_filter_request_one_of.h"



catalogs_list_products_by_filter_request_one_of_t *catalogs_list_products_by_filter_request_one_of_create(
    char *feed_id,
    catalogs_product_group_filters_t *filters
    ) {
    catalogs_list_products_by_filter_request_one_of_t *catalogs_list_products_by_filter_request_one_of_local_var = malloc(sizeof(catalogs_list_products_by_filter_request_one_of_t));
    if (!catalogs_list_products_by_filter_request_one_of_local_var) {
        return NULL;
    }
    catalogs_list_products_by_filter_request_one_of_local_var->feed_id = feed_id;
    catalogs_list_products_by_filter_request_one_of_local_var->filters = filters;

    return catalogs_list_products_by_filter_request_one_of_local_var;
}


void catalogs_list_products_by_filter_request_one_of_free(catalogs_list_products_by_filter_request_one_of_t *catalogs_list_products_by_filter_request_one_of) {
    if(NULL == catalogs_list_products_by_filter_request_one_of){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_list_products_by_filter_request_one_of->feed_id) {
        free(catalogs_list_products_by_filter_request_one_of->feed_id);
        catalogs_list_products_by_filter_request_one_of->feed_id = NULL;
    }
    if (catalogs_list_products_by_filter_request_one_of->filters) {
        catalogs_product_group_filters_free(catalogs_list_products_by_filter_request_one_of->filters);
        catalogs_list_products_by_filter_request_one_of->filters = NULL;
    }
    free(catalogs_list_products_by_filter_request_one_of);
}

cJSON *catalogs_list_products_by_filter_request_one_of_convertToJSON(catalogs_list_products_by_filter_request_one_of_t *catalogs_list_products_by_filter_request_one_of) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_list_products_by_filter_request_one_of->feed_id
    if (!catalogs_list_products_by_filter_request_one_of->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", catalogs_list_products_by_filter_request_one_of->feed_id) == NULL) {
    goto fail; //String
    }


    // catalogs_list_products_by_filter_request_one_of->filters
    if (!catalogs_list_products_by_filter_request_one_of->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_product_group_filters_convertToJSON(catalogs_list_products_by_filter_request_one_of->filters);
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

catalogs_list_products_by_filter_request_one_of_t *catalogs_list_products_by_filter_request_one_of_parseFromJSON(cJSON *catalogs_list_products_by_filter_request_one_ofJSON){

    catalogs_list_products_by_filter_request_one_of_t *catalogs_list_products_by_filter_request_one_of_local_var = NULL;

    // define the local variable for catalogs_list_products_by_filter_request_one_of->filters
    catalogs_product_group_filters_t *filters_local_nonprim = NULL;

    // catalogs_list_products_by_filter_request_one_of->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(catalogs_list_products_by_filter_request_one_ofJSON, "feed_id");
    if (!feed_id) {
        goto end;
    }

    
    if(!cJSON_IsString(feed_id))
    {
    goto end; //String
    }

    // catalogs_list_products_by_filter_request_one_of->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_list_products_by_filter_request_one_ofJSON, "filters");
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_product_group_filters_parseFromJSON(filters); //nonprimitive


    catalogs_list_products_by_filter_request_one_of_local_var = catalogs_list_products_by_filter_request_one_of_create (
        strdup(feed_id->valuestring),
        filters_local_nonprim
        );

    return catalogs_list_products_by_filter_request_one_of_local_var;
end:
    if (filters_local_nonprim) {
        catalogs_product_group_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    return NULL;

}
