#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_product_metadata.h"



static catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata_create_internal(
    char *creative_assets_id,
    pinterest_rest_api_creative_assets_visibility_type__e visibility
    ) {
    catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata_local_var = malloc(sizeof(catalogs_creative_assets_product_metadata_t));
    if (!catalogs_creative_assets_product_metadata_local_var) {
        return NULL;
    }
    memset(catalogs_creative_assets_product_metadata_local_var, 0, sizeof(catalogs_creative_assets_product_metadata_t));
    catalogs_creative_assets_product_metadata_local_var->_library_owned = 1;
    catalogs_creative_assets_product_metadata_local_var->creative_assets_id = creative_assets_id;
    catalogs_creative_assets_product_metadata_local_var->visibility = visibility;
    return catalogs_creative_assets_product_metadata_local_var;
}

__attribute__((deprecated)) catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata_create(
    char *creative_assets_id,
    pinterest_rest_api_creative_assets_visibility_type__e visibility
    ) {
    catalogs_creative_assets_product_metadata_t *result = catalogs_creative_assets_product_metadata_create_internal (
        creative_assets_id,
        visibility
        );
    if (!result) {
    }
    return result;
}

void catalogs_creative_assets_product_metadata_free(catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata) {
    if(NULL == catalogs_creative_assets_product_metadata){
        return ;
    }
    if(catalogs_creative_assets_product_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_creative_assets_product_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_product_metadata->creative_assets_id) {
        free(catalogs_creative_assets_product_metadata->creative_assets_id);
        catalogs_creative_assets_product_metadata->creative_assets_id = NULL;
    }
    free(catalogs_creative_assets_product_metadata);
}

cJSON *catalogs_creative_assets_product_metadata_convertToJSON(catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_product_metadata->creative_assets_id
    if (!catalogs_creative_assets_product_metadata->creative_assets_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "creative_assets_id", catalogs_creative_assets_product_metadata->creative_assets_id) == NULL) {
    goto fail; //String
    }


    // catalogs_creative_assets_product_metadata->visibility
    if (pinterest_rest_api_creative_assets_visibility_type__NULL == catalogs_creative_assets_product_metadata->visibility) {
        goto fail;
    }
    cJSON *visibility_local_JSON = creative_assets_visibility_type_convertToJSON(catalogs_creative_assets_product_metadata->visibility);
    if(visibility_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "visibility", visibility_local_JSON);
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

catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata_parseFromJSON(cJSON *catalogs_creative_assets_product_metadataJSON){

    catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata_local_var = NULL;

    char *creative_assets_id_local_str = NULL;

    // define the local variable for catalogs_creative_assets_product_metadata->visibility
    pinterest_rest_api_creative_assets_visibility_type__e visibility_local_nonprim = 0;

    // catalogs_creative_assets_product_metadata->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_metadataJSON, "creative_assets_id");
    if (cJSON_IsNull(creative_assets_id)) {
        creative_assets_id = NULL;
    }
    if (!creative_assets_id) {
        goto end;
    }

    
    if(!cJSON_IsString(creative_assets_id))
    {
    goto end; //String
    }

    // catalogs_creative_assets_product_metadata->visibility
    cJSON *visibility = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_metadataJSON, "visibility");
    if (cJSON_IsNull(visibility)) {
        visibility = NULL;
    }
    if (!visibility) {
        goto end;
    }

    
    visibility_local_nonprim = creative_assets_visibility_type_parseFromJSON(visibility); //custom


    if (creative_assets_id && !cJSON_IsNull(creative_assets_id)) creative_assets_id_local_str = strdup(creative_assets_id->valuestring);

    catalogs_creative_assets_product_metadata_local_var = catalogs_creative_assets_product_metadata_create_internal (
        creative_assets_id_local_str,
        visibility_local_nonprim
        );

    if (!catalogs_creative_assets_product_metadata_local_var) {
        goto end;
    }

    return catalogs_creative_assets_product_metadata_local_var;
end:
    if (creative_assets_id_local_str) {
        free(creative_assets_id_local_str);
        creative_assets_id_local_str = NULL;
    }
    if (visibility_local_nonprim) {
        visibility_local_nonprim = 0;
    }
    return NULL;

}
