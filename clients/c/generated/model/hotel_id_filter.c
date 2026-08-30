#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "hotel_id_filter.h"



static hotel_id_filter_t *hotel_id_filter_create_internal(
    catalogs_product_group_multiple_string_criteria_t *hotel_id
    ) {
    hotel_id_filter_t *hotel_id_filter_local_var = malloc(sizeof(hotel_id_filter_t));
    if (!hotel_id_filter_local_var) {
        return NULL;
    }
    memset(hotel_id_filter_local_var, 0, sizeof(hotel_id_filter_t));
    hotel_id_filter_local_var->_library_owned = 1;
    hotel_id_filter_local_var->hotel_id = hotel_id;
    return hotel_id_filter_local_var;
}

__attribute__((deprecated)) hotel_id_filter_t *hotel_id_filter_create(
    catalogs_product_group_multiple_string_criteria_t *hotel_id
    ) {
    hotel_id_filter_t *result = hotel_id_filter_create_internal (
        hotel_id
        );
    if (!result) {
    }
    return result;
}

void hotel_id_filter_free(hotel_id_filter_t *hotel_id_filter) {
    if(NULL == hotel_id_filter){
        return ;
    }
    if(hotel_id_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "hotel_id_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (hotel_id_filter->hotel_id) {
        catalogs_product_group_multiple_string_criteria_free(hotel_id_filter->hotel_id);
        hotel_id_filter->hotel_id = NULL;
    }
    free(hotel_id_filter);
}

cJSON *hotel_id_filter_convertToJSON(hotel_id_filter_t *hotel_id_filter) {
    cJSON *item = cJSON_CreateObject();

    // hotel_id_filter->hotel_id
    if (!hotel_id_filter->hotel_id) {
        goto fail;
    }
    cJSON *hotel_id_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(hotel_id_filter->hotel_id);
    if(hotel_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "HOTEL_ID", hotel_id_local_JSON);
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

hotel_id_filter_t *hotel_id_filter_parseFromJSON(cJSON *hotel_id_filterJSON){

    hotel_id_filter_t *hotel_id_filter_local_var = NULL;

    // define the local variable for hotel_id_filter->hotel_id
    catalogs_product_group_multiple_string_criteria_t *hotel_id_local_nonprim = NULL;

    // hotel_id_filter->hotel_id
    cJSON *hotel_id = cJSON_GetObjectItemCaseSensitive(hotel_id_filterJSON, "HOTEL_ID");
    if (cJSON_IsNull(hotel_id)) {
        hotel_id = NULL;
    }
    if (!hotel_id) {
        goto end;
    }

    
    hotel_id_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(hotel_id); //nonprimitive



    hotel_id_filter_local_var = hotel_id_filter_create_internal (
        hotel_id_local_nonprim
        );

    if (!hotel_id_filter_local_var) {
        goto end;
    }

    return hotel_id_filter_local_var;
end:
    if (hotel_id_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(hotel_id_local_nonprim);
        hotel_id_local_nonprim = NULL;
    }
    return NULL;

}
