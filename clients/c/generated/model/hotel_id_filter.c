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
    hotel_id_filter_local_var->hotel_id = hotel_id;

    hotel_id_filter_local_var->_library_owned = 1;
    return hotel_id_filter_local_var;
}

__attribute__((deprecated)) hotel_id_filter_t *hotel_id_filter_create(
    catalogs_product_group_multiple_string_criteria_t *hotel_id
    ) {
    return hotel_id_filter_create_internal (
        hotel_id
        );
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
        object_free(hotel_id_filter->hotel_id);
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
    cJSON *hotel_id_object = object_convertToJSON(hotel_id_filter->hotel_id);
    if(hotel_id_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "HOTEL_ID", hotel_id_object);
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

    // hotel_id_filter->hotel_id
    cJSON *hotel_id = cJSON_GetObjectItemCaseSensitive(hotel_id_filterJSON, "HOTEL_ID");
    if (cJSON_IsNull(hotel_id)) {
        hotel_id = NULL;
    }
    if (!hotel_id) {
        goto end;
    }

    object_t *hotel_id_local_object = NULL;
    
    hotel_id_local_object = object_parseFromJSON(hotel_id); //object


    hotel_id_filter_local_var = hotel_id_filter_create_internal (
        hotel_id_local_object
        );

    return hotel_id_filter_local_var;
end:
    return NULL;

}
