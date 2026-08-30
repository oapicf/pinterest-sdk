#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "media_type_filter.h"



static media_type_filter_t *media_type_filter_create_internal(
    catalogs_product_group_multiple_media_types_criteria_t *media_type
    ) {
    media_type_filter_t *media_type_filter_local_var = malloc(sizeof(media_type_filter_t));
    if (!media_type_filter_local_var) {
        return NULL;
    }
    memset(media_type_filter_local_var, 0, sizeof(media_type_filter_t));
    media_type_filter_local_var->_library_owned = 1;
    media_type_filter_local_var->media_type = media_type;
    return media_type_filter_local_var;
}

__attribute__((deprecated)) media_type_filter_t *media_type_filter_create(
    catalogs_product_group_multiple_media_types_criteria_t *media_type
    ) {
    media_type_filter_t *result = media_type_filter_create_internal (
        media_type
        );
    if (!result) {
    }
    return result;
}

void media_type_filter_free(media_type_filter_t *media_type_filter) {
    if(NULL == media_type_filter){
        return ;
    }
    if(media_type_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "media_type_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (media_type_filter->media_type) {
        catalogs_product_group_multiple_media_types_criteria_free(media_type_filter->media_type);
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
    cJSON *media_type_local_JSON = catalogs_product_group_multiple_media_types_criteria_convertToJSON(media_type_filter->media_type);
    if(media_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MEDIA_TYPE", media_type_local_JSON);
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

    // define the local variable for media_type_filter->media_type
    catalogs_product_group_multiple_media_types_criteria_t *media_type_local_nonprim = NULL;

    // media_type_filter->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(media_type_filterJSON, "MEDIA_TYPE");
    if (cJSON_IsNull(media_type)) {
        media_type = NULL;
    }
    if (!media_type) {
        goto end;
    }

    
    media_type_local_nonprim = catalogs_product_group_multiple_media_types_criteria_parseFromJSON(media_type); //nonprimitive



    media_type_filter_local_var = media_type_filter_create_internal (
        media_type_local_nonprim
        );

    if (!media_type_filter_local_var) {
        goto end;
    }

    return media_type_filter_local_var;
end:
    if (media_type_local_nonprim) {
        catalogs_product_group_multiple_media_types_criteria_free(media_type_local_nonprim);
        media_type_local_nonprim = NULL;
    }
    return NULL;

}
