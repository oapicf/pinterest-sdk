#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "media_type_filter.h"



media_type_filter_t *media_type_filter_create(
    catalogs_product_group_multiple_media_types_criteria_t *media_type
    ) {
    media_type_filter_t *media_type_filter_local_var = malloc(sizeof(media_type_filter_t));
    if (!media_type_filter_local_var) {
        return NULL;
    }
    media_type_filter_local_var->media_type = media_type;

    return media_type_filter_local_var;
}


void media_type_filter_free(media_type_filter_t *media_type_filter) {
    if(NULL == media_type_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (media_type_filter->media_type) {
        object_free(media_type_filter->media_type);
        media_type_filter->media_type = NULL;
    }
    free(media_type_filter);
}

cJSON *media_type_filter_convertToJSON(media_type_filter_t *media_type_filter) {
    cJSON *item = cJSON_CreateObject();

    // media_type_filter->media_type
    if (!media_type_filter->media_type) {
        goto fail;
    }
    cJSON *media_type_object = object_convertToJSON(media_type_filter->media_type);
    if(media_type_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MEDIA_TYPE", media_type_object);
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

media_type_filter_t *media_type_filter_parseFromJSON(cJSON *media_type_filterJSON){

    media_type_filter_t *media_type_filter_local_var = NULL;

    // media_type_filter->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(media_type_filterJSON, "MEDIA_TYPE");
    if (!media_type) {
        goto end;
    }

    object_t *media_type_local_object = NULL;
    
    media_type_local_object = object_parseFromJSON(media_type); //object


    media_type_filter_local_var = media_type_filter_create (
        media_type_local_object
        );

    return media_type_filter_local_var;
end:
    return NULL;

}
