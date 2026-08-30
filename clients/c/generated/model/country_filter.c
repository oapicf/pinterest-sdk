#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "country_filter.h"



static country_filter_t *country_filter_create_internal(
    catalogs_product_group_multiple_countries_criteria_t *country
    ) {
    country_filter_t *country_filter_local_var = malloc(sizeof(country_filter_t));
    if (!country_filter_local_var) {
        return NULL;
    }
    memset(country_filter_local_var, 0, sizeof(country_filter_t));
    country_filter_local_var->_library_owned = 1;
    country_filter_local_var->country = country;
    return country_filter_local_var;
}

__attribute__((deprecated)) country_filter_t *country_filter_create(
    catalogs_product_group_multiple_countries_criteria_t *country
    ) {
    country_filter_t *result = country_filter_create_internal (
        country
        );
    if (!result) {
    }
    return result;
}

void country_filter_free(country_filter_t *country_filter) {
    if(NULL == country_filter){
        return ;
    }
    if(country_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "country_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (country_filter->country) {
        catalogs_product_group_multiple_countries_criteria_free(country_filter->country);
        country_filter->country = NULL;
    }
    free(country_filter);
}

cJSON *country_filter_convertToJSON(country_filter_t *country_filter) {
    cJSON *item = cJSON_CreateObject();

    // country_filter->country
    if (!country_filter->country) {
        goto fail;
    }
    cJSON *country_local_JSON = catalogs_product_group_multiple_countries_criteria_convertToJSON(country_filter->country);
    if(country_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "COUNTRY", country_local_JSON);
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

country_filter_t *country_filter_parseFromJSON(cJSON *country_filterJSON){

    country_filter_t *country_filter_local_var = NULL;

    // define the local variable for country_filter->country
    catalogs_product_group_multiple_countries_criteria_t *country_local_nonprim = NULL;

    // country_filter->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(country_filterJSON, "COUNTRY");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = catalogs_product_group_multiple_countries_criteria_parseFromJSON(country); //nonprimitive



    country_filter_local_var = country_filter_create_internal (
        country_local_nonprim
        );

    if (!country_filter_local_var) {
        goto end;
    }

    return country_filter_local_var;
end:
    if (country_local_nonprim) {
        catalogs_product_group_multiple_countries_criteria_free(country_local_nonprim);
        country_local_nonprim = NULL;
    }
    return NULL;

}
