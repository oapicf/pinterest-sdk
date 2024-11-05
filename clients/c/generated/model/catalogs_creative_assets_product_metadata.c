#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_product_metadata.h"


char* catalogs_creative_assets_product_metadata_visibility_ToString(pinterest_rest_api_catalogs_creative_assets_product_metadata__e visibility) {
    char* visibilityArray[] =  { "NULL", "VISIBLE", "HIDDEN" };
    return visibilityArray[visibility];
}

pinterest_rest_api_catalogs_creative_assets_product_metadata__e catalogs_creative_assets_product_metadata_visibility_FromString(char* visibility){
    int stringToReturn = 0;
    char *visibilityArray[] =  { "NULL", "VISIBLE", "HIDDEN" };
    size_t sizeofArray = sizeof(visibilityArray) / sizeof(visibilityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(visibility, visibilityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata_create(
    char *creative_assets_id,
    creative_assets_visibility_type_t *visibility
    ) {
    catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata_local_var = malloc(sizeof(catalogs_creative_assets_product_metadata_t));
    if (!catalogs_creative_assets_product_metadata_local_var) {
        return NULL;
    }
    catalogs_creative_assets_product_metadata_local_var->creative_assets_id = creative_assets_id;
    catalogs_creative_assets_product_metadata_local_var->visibility = visibility;

    return catalogs_creative_assets_product_metadata_local_var;
}


void catalogs_creative_assets_product_metadata_free(catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata) {
    if(NULL == catalogs_creative_assets_product_metadata){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_product_metadata->creative_assets_id) {
        free(catalogs_creative_assets_product_metadata->creative_assets_id);
        catalogs_creative_assets_product_metadata->creative_assets_id = NULL;
    }
    if (catalogs_creative_assets_product_metadata->visibility) {
        creative_assets_visibility_type_free(catalogs_creative_assets_product_metadata->visibility);
        catalogs_creative_assets_product_metadata->visibility = NULL;
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
    if (pinterest_rest_api_catalogs_creative_assets_product_metadata__NULL == catalogs_creative_assets_product_metadata->visibility) {
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

    // define the local variable for catalogs_creative_assets_product_metadata->visibility
    creative_assets_visibility_type_t *visibility_local_nonprim = NULL;

    // catalogs_creative_assets_product_metadata->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_metadataJSON, "creative_assets_id");
    if (!creative_assets_id) {
        goto end;
    }

    
    if(!cJSON_IsString(creative_assets_id))
    {
    goto end; //String
    }

    // catalogs_creative_assets_product_metadata->visibility
    cJSON *visibility = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_metadataJSON, "visibility");
    if (!visibility) {
        goto end;
    }

    
    visibility_local_nonprim = creative_assets_visibility_type_parseFromJSON(visibility); //custom


    catalogs_creative_assets_product_metadata_local_var = catalogs_creative_assets_product_metadata_create (
        strdup(creative_assets_id->valuestring),
        visibility_local_nonprim
        );

    return catalogs_creative_assets_product_metadata_local_var;
end:
    if (visibility_local_nonprim) {
        creative_assets_visibility_type_free(visibility_local_nonprim);
        visibility_local_nonprim = NULL;
    }
    return NULL;

}
