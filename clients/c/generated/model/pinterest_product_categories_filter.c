#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pinterest_product_categories_filter.h"



static pinterest_product_categories_filter_t *pinterest_product_categories_filter_create_internal(
    catalogs_product_group_multiple_pinterest_product_category_criteria_t *pinterest_product_categories
    ) {
    pinterest_product_categories_filter_t *pinterest_product_categories_filter_local_var = malloc(sizeof(pinterest_product_categories_filter_t));
    if (!pinterest_product_categories_filter_local_var) {
        return NULL;
    }
    memset(pinterest_product_categories_filter_local_var, 0, sizeof(pinterest_product_categories_filter_t));
    pinterest_product_categories_filter_local_var->_library_owned = 1;
    pinterest_product_categories_filter_local_var->pinterest_product_categories = pinterest_product_categories;
    return pinterest_product_categories_filter_local_var;
}

__attribute__((deprecated)) pinterest_product_categories_filter_t *pinterest_product_categories_filter_create(
    catalogs_product_group_multiple_pinterest_product_category_criteria_t *pinterest_product_categories
    ) {
    pinterest_product_categories_filter_t *result = pinterest_product_categories_filter_create_internal (
        pinterest_product_categories
        );
    if (!result) {
    }
    return result;
}

void pinterest_product_categories_filter_free(pinterest_product_categories_filter_t *pinterest_product_categories_filter) {
    if(NULL == pinterest_product_categories_filter){
        return ;
    }
    if(pinterest_product_categories_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pinterest_product_categories_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pinterest_product_categories_filter->pinterest_product_categories) {
        catalogs_product_group_multiple_pinterest_product_category_criteria_free(pinterest_product_categories_filter->pinterest_product_categories);
        pinterest_product_categories_filter->pinterest_product_categories = NULL;
    }
    free(pinterest_product_categories_filter);
}

cJSON *pinterest_product_categories_filter_convertToJSON(pinterest_product_categories_filter_t *pinterest_product_categories_filter) {
    cJSON *item = cJSON_CreateObject();

    // pinterest_product_categories_filter->pinterest_product_categories
    if (!pinterest_product_categories_filter->pinterest_product_categories) {
        goto fail;
    }
    cJSON *pinterest_product_categories_local_JSON = catalogs_product_group_multiple_pinterest_product_category_criteria_convertToJSON(pinterest_product_categories_filter->pinterest_product_categories);
    if(pinterest_product_categories_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PINTEREST_PRODUCT_CATEGORIES", pinterest_product_categories_local_JSON);
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

pinterest_product_categories_filter_t *pinterest_product_categories_filter_parseFromJSON(cJSON *pinterest_product_categories_filterJSON){

    pinterest_product_categories_filter_t *pinterest_product_categories_filter_local_var = NULL;

    // define the local variable for pinterest_product_categories_filter->pinterest_product_categories
    catalogs_product_group_multiple_pinterest_product_category_criteria_t *pinterest_product_categories_local_nonprim = NULL;

    // pinterest_product_categories_filter->pinterest_product_categories
    cJSON *pinterest_product_categories = cJSON_GetObjectItemCaseSensitive(pinterest_product_categories_filterJSON, "PINTEREST_PRODUCT_CATEGORIES");
    if (cJSON_IsNull(pinterest_product_categories)) {
        pinterest_product_categories = NULL;
    }
    if (!pinterest_product_categories) {
        goto end;
    }

    
    pinterest_product_categories_local_nonprim = catalogs_product_group_multiple_pinterest_product_category_criteria_parseFromJSON(pinterest_product_categories); //nonprimitive



    pinterest_product_categories_filter_local_var = pinterest_product_categories_filter_create_internal (
        pinterest_product_categories_local_nonprim
        );

    if (!pinterest_product_categories_filter_local_var) {
        goto end;
    }

    return pinterest_product_categories_filter_local_var;
end:
    if (pinterest_product_categories_local_nonprim) {
        catalogs_product_group_multiple_pinterest_product_category_criteria_free(pinterest_product_categories_local_nonprim);
        pinterest_product_categories_local_nonprim = NULL;
    }
    return NULL;

}
