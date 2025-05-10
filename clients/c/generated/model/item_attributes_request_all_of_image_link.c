#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_attributes_request_all_of_image_link.h"



static item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link_create_internal(
    ) {
    item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link_local_var = malloc(sizeof(item_attributes_request_all_of_image_link_t));
    if (!item_attributes_request_all_of_image_link_local_var) {
        return NULL;
    }

    item_attributes_request_all_of_image_link_local_var->_library_owned = 1;
    return item_attributes_request_all_of_image_link_local_var;
}

__attribute__((deprecated)) item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link_create(
    ) {
    return item_attributes_request_all_of_image_link_create_internal (
        );
}

void item_attributes_request_all_of_image_link_free(item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link) {
    if(NULL == item_attributes_request_all_of_image_link){
        return ;
    }
    if(item_attributes_request_all_of_image_link->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_attributes_request_all_of_image_link_free");
        return ;
    }
    listEntry_t *listEntry;
    free(item_attributes_request_all_of_image_link);
}

cJSON *item_attributes_request_all_of_image_link_convertToJSON(item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link_parseFromJSON(cJSON *item_attributes_request_all_of_image_linkJSON){

    item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link_local_var = NULL;


    item_attributes_request_all_of_image_link_local_var = item_attributes_request_all_of_image_link_create_internal (
        );

    return item_attributes_request_all_of_image_link_local_var;
end:
    return NULL;

}
