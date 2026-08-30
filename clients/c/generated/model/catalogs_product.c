#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product.h"


char* catalogs_product_catalog_type_ToString(pinterest_rest_api_catalogs_product_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_product_CATALOGTYPE_e catalogs_product_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_product_t *catalogs_product_create_internal(
    pinterest_rest_api_catalogs_product_CATALOGTYPE_e catalog_type,
    catalogs_creative_assets_product_metadata_t *metadata,
    pin_t *pin
    ) {
    catalogs_product_t *catalogs_product_local_var = malloc(sizeof(catalogs_product_t));
    if (!catalogs_product_local_var) {
        return NULL;
    }
    memset(catalogs_product_local_var, 0, sizeof(catalogs_product_t));
    catalogs_product_local_var->_library_owned = 1;
    catalogs_product_local_var->catalog_type = catalog_type;
    catalogs_product_local_var->metadata = metadata;
    catalogs_product_local_var->pin = pin;
    return catalogs_product_local_var;
}

__attribute__((deprecated)) catalogs_product_t *catalogs_product_create(
    pinterest_rest_api_catalogs_product_CATALOGTYPE_e catalog_type,
    catalogs_creative_assets_product_metadata_t *metadata,
    pin_t *pin
    ) {
    catalogs_product_t *result = catalogs_product_create_internal (
        catalog_type,
        metadata,
        pin
        );
    if (!result) {
    }
    return result;
}

void catalogs_product_free(catalogs_product_t *catalogs_product) {
    if(NULL == catalogs_product){
        return ;
    }
    if(catalogs_product->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product->metadata) {
        catalogs_creative_assets_product_metadata_free(catalogs_product->metadata);
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

    // catalogs_product->catalog_type
    if (pinterest_rest_api_catalogs_product_CATALOGTYPE_NULL == catalogs_product->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_product_catalog_type_ToString(catalogs_product->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_product->metadata
    if (!catalogs_product->metadata) {
        goto fail;
    }
    cJSON *metadata_local_JSON = catalogs_creative_assets_product_metadata_convertToJSON(catalogs_product->metadata);
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
    catalogs_creative_assets_product_metadata_t *metadata_local_nonprim = NULL;

    // define the local variable for catalogs_product->pin
    pin_t *pin_local_nonprim = NULL;

    // catalogs_product->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_productJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_product_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_product_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_product->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(catalogs_productJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    if (!metadata) {
        goto end;
    }

    
    metadata_local_nonprim = catalogs_creative_assets_product_metadata_parseFromJSON(metadata); //nonprimitive

    // catalogs_product->pin
    cJSON *pin = cJSON_GetObjectItemCaseSensitive(catalogs_productJSON, "pin");
    if (cJSON_IsNull(pin)) {
        pin = NULL;
    }
    if (!pin) {
        goto end;
    }

    
    pin_local_nonprim = pin_parseFromJSON(pin); //nonprimitive



    catalogs_product_local_var = catalogs_product_create_internal (
        catalog_typeVariable,
        metadata_local_nonprim,
        pin_local_nonprim
        );

    if (!catalogs_product_local_var) {
        goto end;
    }

    return catalogs_product_local_var;
end:
    if (metadata_local_nonprim) {
        catalogs_creative_assets_product_metadata_free(metadata_local_nonprim);
        metadata_local_nonprim = NULL;
    }
    if (pin_local_nonprim) {
        pin_free(pin_local_nonprim);
        pin_local_nonprim = NULL;
    }
    return NULL;

}
