#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "brand_filter.h"



brand_filter_t *brand_filter_create(
    catalogs_product_group_multiple_string_criteria_t *brand
    ) {
    brand_filter_t *brand_filter_local_var = malloc(sizeof(brand_filter_t));
    if (!brand_filter_local_var) {
        return NULL;
    }
    brand_filter_local_var->brand = brand;

    return brand_filter_local_var;
}


void brand_filter_free(brand_filter_t *brand_filter) {
    if(NULL == brand_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (brand_filter->brand) {
        object_free(brand_filter->brand);
        brand_filter->brand = NULL;
    }
    free(brand_filter);
}

cJSON *brand_filter_convertToJSON(brand_filter_t *brand_filter) {
    cJSON *item = cJSON_CreateObject();

    // brand_filter->brand
    if (!brand_filter->brand) {
        goto fail;
    }
    cJSON *brand_object = object_convertToJSON(brand_filter->brand);
    if(brand_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "BRAND", brand_object);
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

brand_filter_t *brand_filter_parseFromJSON(cJSON *brand_filterJSON){

    brand_filter_t *brand_filter_local_var = NULL;

    // brand_filter->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(brand_filterJSON, "BRAND");
    if (!brand) {
        goto end;
    }

    object_t *brand_local_object = NULL;
    
    brand_local_object = object_parseFromJSON(brand); //object


    brand_filter_local_var = brand_filter_create (
        brand_local_object
        );

    return brand_filter_local_var;
end:
    return NULL;

}
