#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_group_id_filter.h"



item_group_id_filter_t *item_group_id_filter_create(
    catalogs_product_group_multiple_string_criteria_t *item_group_id
    ) {
    item_group_id_filter_t *item_group_id_filter_local_var = malloc(sizeof(item_group_id_filter_t));
    if (!item_group_id_filter_local_var) {
        return NULL;
    }
    item_group_id_filter_local_var->item_group_id = item_group_id;

    return item_group_id_filter_local_var;
}


void item_group_id_filter_free(item_group_id_filter_t *item_group_id_filter) {
    if(NULL == item_group_id_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (item_group_id_filter->item_group_id) {
        object_free(item_group_id_filter->item_group_id);
        item_group_id_filter->item_group_id = NULL;
    }
    free(item_group_id_filter);
}

cJSON *item_group_id_filter_convertToJSON(item_group_id_filter_t *item_group_id_filter) {
    cJSON *item = cJSON_CreateObject();

    // item_group_id_filter->item_group_id
    if (!item_group_id_filter->item_group_id) {
        goto fail;
    }
    cJSON *item_group_id_object = object_convertToJSON(item_group_id_filter->item_group_id);
    if(item_group_id_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ITEM_GROUP_ID", item_group_id_object);
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

item_group_id_filter_t *item_group_id_filter_parseFromJSON(cJSON *item_group_id_filterJSON){

    item_group_id_filter_t *item_group_id_filter_local_var = NULL;

    // item_group_id_filter->item_group_id
    cJSON *item_group_id = cJSON_GetObjectItemCaseSensitive(item_group_id_filterJSON, "ITEM_GROUP_ID");
    if (!item_group_id) {
        goto end;
    }

    object_t *item_group_id_local_object = NULL;
    
    item_group_id_local_object = object_parseFromJSON(item_group_id); //object


    item_group_id_filter_local_var = item_group_id_filter_create (
        item_group_id_local_object
        );

    return item_group_id_filter_local_var;
end:
    return NULL;

}
