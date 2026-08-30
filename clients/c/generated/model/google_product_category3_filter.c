#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "google_product_category3_filter.h"



static google_product_category3_filter_t *google_product_category3_filter_create_internal(
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_3
    ) {
    google_product_category3_filter_t *google_product_category3_filter_local_var = malloc(sizeof(google_product_category3_filter_t));
    if (!google_product_category3_filter_local_var) {
        return NULL;
    }
    memset(google_product_category3_filter_local_var, 0, sizeof(google_product_category3_filter_t));
    google_product_category3_filter_local_var->_library_owned = 1;
    google_product_category3_filter_local_var->google_product_category_3 = google_product_category_3;
    return google_product_category3_filter_local_var;
}

__attribute__((deprecated)) google_product_category3_filter_t *google_product_category3_filter_create(
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_3
    ) {
    google_product_category3_filter_t *result = google_product_category3_filter_create_internal (
        google_product_category_3
        );
    if (!result) {
    }
    return result;
}

void google_product_category3_filter_free(google_product_category3_filter_t *google_product_category3_filter) {
    if(NULL == google_product_category3_filter){
        return ;
    }
    if(google_product_category3_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "google_product_category3_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (google_product_category3_filter->google_product_category_3) {
        catalogs_product_group_multiple_string_list_criteria_free(google_product_category3_filter->google_product_category_3);
        google_product_category3_filter->google_product_category_3 = NULL;
    }
    free(google_product_category3_filter);
}

cJSON *google_product_category3_filter_convertToJSON(google_product_category3_filter_t *google_product_category3_filter) {
    cJSON *item = cJSON_CreateObject();

    // google_product_category3_filter->google_product_category_3
    if (!google_product_category3_filter->google_product_category_3) {
        goto fail;
    }
    cJSON *google_product_category_3_local_JSON = catalogs_product_group_multiple_string_list_criteria_convertToJSON(google_product_category3_filter->google_product_category_3);
    if(google_product_category_3_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_3", google_product_category_3_local_JSON);
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

google_product_category3_filter_t *google_product_category3_filter_parseFromJSON(cJSON *google_product_category3_filterJSON){

    google_product_category3_filter_t *google_product_category3_filter_local_var = NULL;

    // define the local variable for google_product_category3_filter->google_product_category_3
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_3_local_nonprim = NULL;

    // google_product_category3_filter->google_product_category_3
    cJSON *google_product_category_3 = cJSON_GetObjectItemCaseSensitive(google_product_category3_filterJSON, "GOOGLE_PRODUCT_CATEGORY_3");
    if (cJSON_IsNull(google_product_category_3)) {
        google_product_category_3 = NULL;
    }
    if (!google_product_category_3) {
        goto end;
    }

    
    google_product_category_3_local_nonprim = catalogs_product_group_multiple_string_list_criteria_parseFromJSON(google_product_category_3); //nonprimitive



    google_product_category3_filter_local_var = google_product_category3_filter_create_internal (
        google_product_category_3_local_nonprim
        );

    if (!google_product_category3_filter_local_var) {
        goto end;
    }

    return google_product_category3_filter_local_var;
end:
    if (google_product_category_3_local_nonprim) {
        catalogs_product_group_multiple_string_list_criteria_free(google_product_category_3_local_nonprim);
        google_product_category_3_local_nonprim = NULL;
    }
    return NULL;

}
