#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "brand_filter.h"



static brand_filter_t *brand_filter_create_internal(
    catalogs_product_group_multiple_string_criteria_t *brand
    ) {
    brand_filter_t *brand_filter_local_var = malloc(sizeof(brand_filter_t));
    if (!brand_filter_local_var) {
        return NULL;
    }
    brand_filter_local_var->brand = brand;

    brand_filter_local_var->_library_owned = 1;
    return brand_filter_local_var;
}

__attribute__((deprecated)) brand_filter_t *brand_filter_create(
    catalogs_product_group_multiple_string_criteria_t *brand
    ) {
    return brand_filter_create_internal (
        brand
        );
}

void brand_filter_free(brand_filter_t *brand_filter) {
    if(NULL == brand_filter){
        return ;
    }
    if(brand_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "brand_filter_free");
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
    if (cJSON_IsNull(brand)) {
        brand = NULL;
    }
    if (!brand) {
        goto end;
    }

    object_t *brand_local_object = NULL;
    
    brand_local_object = object_parseFromJSON(brand); //object


    brand_filter_local_var = brand_filter_create_internal (
        brand_local_object
        );

    return brand_filter_local_var;
end:
    return NULL;

}
