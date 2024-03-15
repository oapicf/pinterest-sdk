#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "google_product_category2_filter.h"



google_product_category2_filter_t *google_product_category2_filter_create(
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_2
    ) {
    google_product_category2_filter_t *google_product_category2_filter_local_var = malloc(sizeof(google_product_category2_filter_t));
    if (!google_product_category2_filter_local_var) {
        return NULL;
    }
    google_product_category2_filter_local_var->google_product_category_2 = google_product_category_2;

    return google_product_category2_filter_local_var;
}


void google_product_category2_filter_free(google_product_category2_filter_t *google_product_category2_filter) {
    if(NULL == google_product_category2_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (google_product_category2_filter->google_product_category_2) {
        object_free(google_product_category2_filter->google_product_category_2);
        google_product_category2_filter->google_product_category_2 = NULL;
    }
    free(google_product_category2_filter);
}

cJSON *google_product_category2_filter_convertToJSON(google_product_category2_filter_t *google_product_category2_filter) {
    cJSON *item = cJSON_CreateObject();

    // google_product_category2_filter->google_product_category_2
    if (!google_product_category2_filter->google_product_category_2) {
        goto fail;
    }
    cJSON *google_product_category_2_object = object_convertToJSON(google_product_category2_filter->google_product_category_2);
    if(google_product_category_2_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_2", google_product_category_2_object);
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

google_product_category2_filter_t *google_product_category2_filter_parseFromJSON(cJSON *google_product_category2_filterJSON){

    google_product_category2_filter_t *google_product_category2_filter_local_var = NULL;

    // google_product_category2_filter->google_product_category_2
    cJSON *google_product_category_2 = cJSON_GetObjectItemCaseSensitive(google_product_category2_filterJSON, "GOOGLE_PRODUCT_CATEGORY_2");
    if (!google_product_category_2) {
        goto end;
    }

    object_t *google_product_category_2_local_object = NULL;
    
    google_product_category_2_local_object = object_parseFromJSON(google_product_category_2); //object


    google_product_category2_filter_local_var = google_product_category2_filter_create (
        google_product_category_2_local_object
        );

    return google_product_category2_filter_local_var;
end:
    return NULL;

}
