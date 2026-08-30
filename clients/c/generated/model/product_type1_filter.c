#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_type1_filter.h"



static product_type1_filter_t *product_type1_filter_create_internal(
    catalogs_product_group_multiple_string_list_criteria_t *product_type_1
    ) {
    product_type1_filter_t *product_type1_filter_local_var = malloc(sizeof(product_type1_filter_t));
    if (!product_type1_filter_local_var) {
        return NULL;
    }
    memset(product_type1_filter_local_var, 0, sizeof(product_type1_filter_t));
    product_type1_filter_local_var->_library_owned = 1;
    product_type1_filter_local_var->product_type_1 = product_type_1;
    return product_type1_filter_local_var;
}

__attribute__((deprecated)) product_type1_filter_t *product_type1_filter_create(
    catalogs_product_group_multiple_string_list_criteria_t *product_type_1
    ) {
    product_type1_filter_t *result = product_type1_filter_create_internal (
        product_type_1
        );
    if (!result) {
    }
    return result;
}

void product_type1_filter_free(product_type1_filter_t *product_type1_filter) {
    if(NULL == product_type1_filter){
        return ;
    }
    if(product_type1_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_type1_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_type1_filter->product_type_1) {
        catalogs_product_group_multiple_string_list_criteria_free(product_type1_filter->product_type_1);
        product_type1_filter->product_type_1 = NULL;
    }
    free(product_type1_filter);
}

cJSON *product_type1_filter_convertToJSON(product_type1_filter_t *product_type1_filter) {
    cJSON *item = cJSON_CreateObject();

    // product_type1_filter->product_type_1
    if (!product_type1_filter->product_type_1) {
        goto fail;
    }
    cJSON *product_type_1_local_JSON = catalogs_product_group_multiple_string_list_criteria_convertToJSON(product_type1_filter->product_type_1);
    if(product_type_1_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_TYPE_1", product_type_1_local_JSON);
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

product_type1_filter_t *product_type1_filter_parseFromJSON(cJSON *product_type1_filterJSON){

    product_type1_filter_t *product_type1_filter_local_var = NULL;

    // define the local variable for product_type1_filter->product_type_1
    catalogs_product_group_multiple_string_list_criteria_t *product_type_1_local_nonprim = NULL;

    // product_type1_filter->product_type_1
    cJSON *product_type_1 = cJSON_GetObjectItemCaseSensitive(product_type1_filterJSON, "PRODUCT_TYPE_1");
    if (cJSON_IsNull(product_type_1)) {
        product_type_1 = NULL;
    }
    if (!product_type_1) {
        goto end;
    }

    
    product_type_1_local_nonprim = catalogs_product_group_multiple_string_list_criteria_parseFromJSON(product_type_1); //nonprimitive



    product_type1_filter_local_var = product_type1_filter_create_internal (
        product_type_1_local_nonprim
        );

    if (!product_type1_filter_local_var) {
        goto end;
    }

    return product_type1_filter_local_var;
end:
    if (product_type_1_local_nonprim) {
        catalogs_product_group_multiple_string_list_criteria_free(product_type_1_local_nonprim);
        product_type_1_local_nonprim = NULL;
    }
    return NULL;

}
