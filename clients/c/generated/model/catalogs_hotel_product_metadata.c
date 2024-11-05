#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_product_metadata.h"



catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata_create(
    char *hotel_id
    ) {
    catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata_local_var = malloc(sizeof(catalogs_hotel_product_metadata_t));
    if (!catalogs_hotel_product_metadata_local_var) {
        return NULL;
    }
    catalogs_hotel_product_metadata_local_var->hotel_id = hotel_id;

    return catalogs_hotel_product_metadata_local_var;
}


void catalogs_hotel_product_metadata_free(catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata) {
    if(NULL == catalogs_hotel_product_metadata){
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

    // catalogs_hotel_product_metadata->hotel_id
    cJSON *hotel_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_product_metadataJSON, "hotel_id");
    if (!hotel_id) {
        goto end;
    }

    
    if(!cJSON_IsString(hotel_id))
    {
    goto end; //String
    }


    catalogs_hotel_product_metadata_local_var = catalogs_hotel_product_metadata_create (
        strdup(hotel_id->valuestring)
        );

    return catalogs_hotel_product_metadata_local_var;
end:
    return NULL;

}
