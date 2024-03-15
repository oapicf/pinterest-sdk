#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product.h"



catalogs_product_t *catalogs_product_create(
    catalogs_product_metadata_t *metadata,
    pin_t *pin
    ) {
    catalogs_product_t *catalogs_product_local_var = malloc(sizeof(catalogs_product_t));
    if (!catalogs_product_local_var) {
        return NULL;
    }
    catalogs_product_local_var->metadata = metadata;
    catalogs_product_local_var->pin = pin;

    return catalogs_product_local_var;
}


void catalogs_product_free(catalogs_product_t *catalogs_product) {
    if(NULL == catalogs_product){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product->metadata) {
        catalogs_product_metadata_free(catalogs_product->metadata);
        catalogs_product->metadata = NULL;
    }
    if (catalogs_product->pin) {
        pin_free(catalogs_product->pin);
        catalogs_product->pin = NULL;
    }
    free(catalogs_product);
}

cJSON *catalogs_product_convertToJSON(catalogs_product_t *catalogs_product) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product->metadata
    if (!catalogs_product->metadata) {
        goto fail;
    }
    cJSON *metadata_local_JSON = catalogs_product_metadata_convertToJSON(catalogs_product->metadata);
    if(metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product->pin
    if (!catalogs_product->pin) {
        goto fail;
    }
    cJSON *pin_local_JSON = pin_convertToJSON(catalogs_product->pin);
    if(pin_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pin", pin_local_JSON);
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

catalogs_product_t *catalogs_product_parseFromJSON(cJSON *catalogs_productJSON){

    catalogs_product_t *catalogs_product_local_var = NULL;

    // define the local variable for catalogs_product->metadata
    catalogs_product_metadata_t *metadata_local_nonprim = NULL;

    // define the local variable for catalogs_product->pin
    pin_t *pin_local_nonprim = NULL;

    // catalogs_product->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(catalogs_productJSON, "metadata");
    if (!metadata) {
        goto end;
    }

    
    metadata_local_nonprim = catalogs_product_metadata_parseFromJSON(metadata); //nonprimitive

    // catalogs_product->pin
    cJSON *pin = cJSON_GetObjectItemCaseSensitive(catalogs_productJSON, "pin");
    if (!pin) {
        goto end;
    }

    
    pin_local_nonprim = pin_parseFromJSON(pin); //nonprimitive


    catalogs_product_local_var = catalogs_product_create (
        metadata_local_nonprim,
        pin_local_nonprim
        );

    return catalogs_product_local_var;
end:
    if (metadata_local_nonprim) {
        catalogs_product_metadata_free(metadata_local_nonprim);
        metadata_local_nonprim = NULL;
    }
    if (pin_local_nonprim) {
        pin_free(pin_local_nonprim);
        pin_local_nonprim = NULL;
    }
    return NULL;

}
