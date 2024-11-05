#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "creative_assets_id_filter.h"



creative_assets_id_filter_t *creative_assets_id_filter_create(
    catalogs_product_group_multiple_string_criteria_t *creative_assets_id
    ) {
    creative_assets_id_filter_t *creative_assets_id_filter_local_var = malloc(sizeof(creative_assets_id_filter_t));
    if (!creative_assets_id_filter_local_var) {
        return NULL;
    }
    creative_assets_id_filter_local_var->creative_assets_id = creative_assets_id;

    return creative_assets_id_filter_local_var;
}


void creative_assets_id_filter_free(creative_assets_id_filter_t *creative_assets_id_filter) {
    if(NULL == creative_assets_id_filter){
        return ;
    }
    listEntry_t *listEntry;
    if (creative_assets_id_filter->creative_assets_id) {
        object_free(creative_assets_id_filter->creative_assets_id);
        creative_assets_id_filter->creative_assets_id = NULL;
    }
    free(creative_assets_id_filter);
}

cJSON *creative_assets_id_filter_convertToJSON(creative_assets_id_filter_t *creative_assets_id_filter) {
    cJSON *item = cJSON_CreateObject();

    // creative_assets_id_filter->creative_assets_id
    if (!creative_assets_id_filter->creative_assets_id) {
        goto fail;
    }
    cJSON *creative_assets_id_object = object_convertToJSON(creative_assets_id_filter->creative_assets_id);
    if(creative_assets_id_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CREATIVE_ASSETS_ID", creative_assets_id_object);
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

creative_assets_id_filter_t *creative_assets_id_filter_parseFromJSON(cJSON *creative_assets_id_filterJSON){

    creative_assets_id_filter_t *creative_assets_id_filter_local_var = NULL;

    // creative_assets_id_filter->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(creative_assets_id_filterJSON, "CREATIVE_ASSETS_ID");
    if (!creative_assets_id) {
        goto end;
    }

    object_t *creative_assets_id_local_object = NULL;
    
    creative_assets_id_local_object = object_parseFromJSON(creative_assets_id); //object


    creative_assets_id_filter_local_var = creative_assets_id_filter_create (
        creative_assets_id_local_object
        );

    return creative_assets_id_filter_local_var;
end:
    return NULL;

}
