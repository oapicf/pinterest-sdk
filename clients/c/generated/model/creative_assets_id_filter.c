#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "creative_assets_id_filter.h"



static creative_assets_id_filter_t *creative_assets_id_filter_create_internal(
    catalogs_product_group_multiple_string_criteria_t *creative_assets_id
    ) {
    creative_assets_id_filter_t *creative_assets_id_filter_local_var = malloc(sizeof(creative_assets_id_filter_t));
    if (!creative_assets_id_filter_local_var) {
        return NULL;
    }
    memset(creative_assets_id_filter_local_var, 0, sizeof(creative_assets_id_filter_t));
    creative_assets_id_filter_local_var->_library_owned = 1;
    creative_assets_id_filter_local_var->creative_assets_id = creative_assets_id;
    return creative_assets_id_filter_local_var;
}

__attribute__((deprecated)) creative_assets_id_filter_t *creative_assets_id_filter_create(
    catalogs_product_group_multiple_string_criteria_t *creative_assets_id
    ) {
    creative_assets_id_filter_t *result = creative_assets_id_filter_create_internal (
        creative_assets_id
        );
    if (!result) {
    }
    return result;
}

void creative_assets_id_filter_free(creative_assets_id_filter_t *creative_assets_id_filter) {
    if(NULL == creative_assets_id_filter){
        return ;
    }
    if(creative_assets_id_filter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "creative_assets_id_filter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (creative_assets_id_filter->creative_assets_id) {
        catalogs_product_group_multiple_string_criteria_free(creative_assets_id_filter->creative_assets_id);
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
    cJSON *creative_assets_id_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(creative_assets_id_filter->creative_assets_id);
    if(creative_assets_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CREATIVE_ASSETS_ID", creative_assets_id_local_JSON);
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

    // define the local variable for creative_assets_id_filter->creative_assets_id
    catalogs_product_group_multiple_string_criteria_t *creative_assets_id_local_nonprim = NULL;

    // creative_assets_id_filter->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(creative_assets_id_filterJSON, "CREATIVE_ASSETS_ID");
    if (cJSON_IsNull(creative_assets_id)) {
        creative_assets_id = NULL;
    }
    if (!creative_assets_id) {
        goto end;
    }

    
    creative_assets_id_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(creative_assets_id); //nonprimitive



    creative_assets_id_filter_local_var = creative_assets_id_filter_create_internal (
        creative_assets_id_local_nonprim
        );

    if (!creative_assets_id_filter_local_var) {
        goto end;
    }

    return creative_assets_id_filter_local_var;
end:
    if (creative_assets_id_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(creative_assets_id_local_nonprim);
        creative_assets_id_local_nonprim = NULL;
    }
    return NULL;

}
