#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "country_filter.h"



country_filter_t *country_filter_create(
    catalogs_product_group_multiple_countries_criteria_t *country
    ) {
    country_filter_t *country_filter_local_var = malloc(sizeof(country_filter_t));
    if (!country_filter_local_var) {
        return NULL;
    }
    country_filter_local_var->country = country;

    return country_filter_local_var;
}


void country_filter_free(country_filter_t *country_filter) {
    if(NULL == country_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (country_filter->country) {
        object_free(country_filter->country);
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
    cJSON *country_object = object_convertToJSON(country_filter->country);
    if(country_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "COUNTRY", country_object);
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

    // country_filter->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(country_filterJSON, "COUNTRY");
    if (!country) {
        goto end;
    }

    object_t *country_local_object = NULL;
    
    country_local_object = object_parseFromJSON(country); //object


    country_filter_local_var = country_filter_create (
        country_local_object
        );

    return country_filter_local_var;
end:
    return NULL;

}
