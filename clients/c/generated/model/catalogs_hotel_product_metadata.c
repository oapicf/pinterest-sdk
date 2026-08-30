#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_product_metadata.h"



static catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata_create_internal(
    char *hotel_id
    ) {
    catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata_local_var = malloc(sizeof(catalogs_hotel_product_metadata_t));
    if (!catalogs_hotel_product_metadata_local_var) {
        return NULL;
    }
    memset(catalogs_hotel_product_metadata_local_var, 0, sizeof(catalogs_hotel_product_metadata_t));
    catalogs_hotel_product_metadata_local_var->_library_owned = 1;
    catalogs_hotel_product_metadata_local_var->hotel_id = hotel_id;
    return catalogs_hotel_product_metadata_local_var;
}

__attribute__((deprecated)) catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata_create(
    char *hotel_id
    ) {
    catalogs_hotel_product_metadata_t *result = catalogs_hotel_product_metadata_create_internal (
        hotel_id
        );
    if (!result) {
    }
    return result;
}

void catalogs_hotel_product_metadata_free(catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata) {
    if(NULL == catalogs_hotel_product_metadata){
        return ;
    }
    if(catalogs_hotel_product_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_hotel_product_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_product_metadata->hotel_id) {
        free(catalogs_hotel_product_metadata->hotel_id);
        catalogs_hotel_product_metadata->hotel_id = NULL;
    }
    free(catalogs_hotel_product_metadata);
}

cJSON *catalogs_hotel_product_metadata_convertToJSON(catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_product_metadata->hotel_id
    if (!catalogs_hotel_product_metadata->hotel_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "hotel_id", catalogs_hotel_product_metadata->hotel_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata_parseFromJSON(cJSON *catalogs_hotel_product_metadataJSON){

    catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata_local_var = NULL;

    char *hotel_id_local_str = NULL;

    // catalogs_hotel_product_metadata->hotel_id
    cJSON *hotel_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_metadataJSON, "hotel_id");
    if (cJSON_IsNull(hotel_id)) {
        hotel_id = NULL;
    }
    if (!hotel_id) {
        goto end;
    }

    
    if(!cJSON_IsString(hotel_id))
    {
    goto end; //String
    }


    if (hotel_id && !cJSON_IsNull(hotel_id)) hotel_id_local_str = strdup(hotel_id->valuestring);

    catalogs_hotel_product_metadata_local_var = catalogs_hotel_product_metadata_create_internal (
        hotel_id_local_str
        );

    if (!catalogs_hotel_product_metadata_local_var) {
        goto end;
    }

    return catalogs_hotel_product_metadata_local_var;
end:
    if (hotel_id_local_str) {
        free(hotel_id_local_str);
        hotel_id_local_str = NULL;
    }
    return NULL;

}
