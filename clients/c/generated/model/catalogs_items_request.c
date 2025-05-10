#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_items_request.h"



static catalogs_items_request_t *catalogs_items_request_create_internal(
    pinterest_rest_api_country__e country,
    catalogs_items_request_language_t *language,
    catalogs_items_post_filters_t *filters
    ) {
    catalogs_items_request_t *catalogs_items_request_local_var = malloc(sizeof(catalogs_items_request_t));
    if (!catalogs_items_request_local_var) {
        return NULL;
    }
    catalogs_items_request_local_var->country = country;
    catalogs_items_request_local_var->language = language;
    catalogs_items_request_local_var->filters = filters;

    catalogs_items_request_local_var->_library_owned = 1;
    return catalogs_items_request_local_var;
}

__attribute__((deprecated)) catalogs_items_request_t *catalogs_items_request_create(
    pinterest_rest_api_country__e country,
    catalogs_items_request_language_t *language,
    catalogs_items_post_filters_t *filters
    ) {
    return catalogs_items_request_create_internal (
        country,
        language,
        filters
        );
}

void catalogs_items_request_free(catalogs_items_request_t *catalogs_items_request) {
    if(NULL == catalogs_items_request){
        return ;
    }
    if(catalogs_items_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_items_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_items_request->language) {
        catalogs_items_request_language_free(catalogs_items_request->language);
        catalogs_items_request->language = NULL;
    }
    if (catalogs_items_request->filters) {
        catalogs_items_post_filters_free(catalogs_items_request->filters);
        catalogs_items_request->filters = NULL;
    }
    free(catalogs_items_request);
}

cJSON *catalogs_items_request_convertToJSON(catalogs_items_request_t *catalogs_items_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_items_request->country
    if (pinterest_rest_api_country__NULL == catalogs_items_request->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(catalogs_items_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_items_request->language
    if (!catalogs_items_request->language) {
        goto fail;
    }
    cJSON *language_local_JSON = catalogs_items_request_language_convertToJSON(catalogs_items_request->language);
    if(language_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_items_request->filters
    if (!catalogs_items_request->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_items_post_filters_convertToJSON(catalogs_items_request->filters);
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

catalogs_items_request_t *catalogs_items_request_parseFromJSON(cJSON *catalogs_items_requestJSON){

    catalogs_items_request_t *catalogs_items_request_local_var = NULL;

    // define the local variable for catalogs_items_request->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local variable for catalogs_items_request->language
    catalogs_items_request_language_t *language_local_nonprim = NULL;

    // define the local variable for catalogs_items_request->filters
    catalogs_items_post_filters_t *filters_local_nonprim = NULL;

    // catalogs_items_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_items_requestJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // catalogs_items_request->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(catalogs_items_requestJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = catalogs_items_request_language_parseFromJSON(language); //nonprimitive

    // catalogs_items_request->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_items_requestJSON, "filters");
    if (cJSON_IsNull(filters)) {
        filters = NULL;
    }
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_items_post_filters_parseFromJSON(filters); //nonprimitive


    catalogs_items_request_local_var = catalogs_items_request_create_internal (
        country_local_nonprim,
        language_local_nonprim,
        filters_local_nonprim
        );

    return catalogs_items_request_local_var;
end:
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (language_local_nonprim) {
        catalogs_items_request_language_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    if (filters_local_nonprim) {
        catalogs_items_post_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    return NULL;

}
