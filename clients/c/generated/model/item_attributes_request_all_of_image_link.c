#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_attributes_request_all_of_image_link.h"



item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link_create(
    ) {
    item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link_local_var = malloc(sizeof(item_attributes_request_all_of_image_link_t));
    if (!item_attributes_request_all_of_image_link_local_var) {
        return NULL;
    }

    return item_attributes_request_all_of_image_link_local_var;
}


void item_attributes_request_all_of_image_link_free(item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link) {
    if(NULL == item_attributes_request_all_of_image_link){
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


    item_attributes_request_all_of_image_link_local_var = item_attributes_request_all_of_image_link_create (
        );

    return item_attributes_request_all_of_image_link_local_var;
end:
    return NULL;

}
