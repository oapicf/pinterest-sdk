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
    memset(brand_filter_local_var, 0, sizeof(brand_filter_t));
    brand_filter_local_var->_library_owned = 1;
    brand_filter_local_var->brand = brand;
    return brand_filter_local_var;
}

__attribute__((deprecated)) brand_filter_t *brand_filter_create(
    catalogs_product_group_multiple_string_criteria_t *brand
    ) {
    brand_filter_t *result = brand_filter_create_internal (
        brand
        );
    if (!result) {
    }
    return result;
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
        catalogs_product_group_multiple_string_criteria_free(brand_filter->brand);
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
    cJSON *brand_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(brand_filter->brand);
    if(brand_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "BRAND", brand_local_JSON);
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

    // define the local variable for brand_filter->brand
    catalogs_product_group_multiple_string_criteria_t *brand_local_nonprim = NULL;

    // brand_filter->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(brand_filterJSON, "BRAND");
    if (cJSON_IsNull(brand)) {
        brand = NULL;
    }
    if (!brand) {
        goto end;
    }

    
    brand_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(brand); //nonprimitive



    brand_filter_local_var = brand_filter_create_internal (
        brand_local_nonprim
        );

    if (!brand_filter_local_var) {
        goto end;
    }

    return brand_filter_local_var;
end:
    if (brand_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(brand_local_nonprim);
        brand_local_nonprim = NULL;
    }
    return NULL;

}
