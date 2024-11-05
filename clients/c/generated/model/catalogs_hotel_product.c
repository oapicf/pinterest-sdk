#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_product.h"


char* catalogs_hotel_product_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "HOTEL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_e catalogs_hotel_product_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "HOTEL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_hotel_product_t *catalogs_hotel_product_create(
    pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_e catalog_type,
    catalogs_hotel_product_metadata_t *metadata,
    pin_t *pin
    ) {
    catalogs_hotel_product_t *catalogs_hotel_product_local_var = malloc(sizeof(catalogs_hotel_product_t));
    if (!catalogs_hotel_product_local_var) {
        return NULL;
    }
    catalogs_hotel_product_local_var->catalog_type = catalog_type;
    catalogs_hotel_product_local_var->metadata = metadata;
    catalogs_hotel_product_local_var->pin = pin;

    return catalogs_hotel_product_local_var;
}


void catalogs_hotel_product_free(catalogs_hotel_product_t *catalogs_hotel_product) {
    if(NULL == catalogs_hotel_product){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_product->metadata) {
        catalogs_hotel_product_metadata_free(catalogs_hotel_product->metadata);
        catalogs_hotel_product->metadata = NULL;
    }
    if (catalogs_hotel_product->pin) {
        pin_free(catalogs_hotel_product->pin);
        catalogs_hotel_product->pin = NULL;
    }
    free(catalogs_hotel_product);
}

cJSON *catalogs_hotel_product_convertToJSON(catalogs_hotel_product_t *catalogs_hotel_product) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_product->catalog_type
    if (pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_NULL == catalogs_hotel_product->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_hotel_product_ToString(catalogs_hotel_product->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_hotel_product->metadata
    if (!catalogs_hotel_product->metadata) {
        goto fail;
    }
    cJSON *metadata_local_JSON = catalogs_hotel_product_metadata_convertToJSON(catalogs_hotel_product->metadata);
    if(metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_product->pin
    if (!catalogs_hotel_product->pin) {
        goto fail;
    }
    cJSON *pin_local_JSON = pin_convertToJSON(catalogs_hotel_product->pin);
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

catalogs_hotel_product_t *catalogs_hotel_product_parseFromJSON(cJSON *catalogs_hotel_productJSON){

    catalogs_hotel_product_t *catalogs_hotel_product_local_var = NULL;

    // define the local variable for catalogs_hotel_product->metadata
    catalogs_hotel_product_metadata_t *metadata_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_product->pin
    pin_t *pin_local_nonprim = NULL;

    // catalogs_hotel_product->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_productJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_hotel_product_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_hotel_product->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_productJSON, "metadata");
    if (!metadata) {
        goto end;
    }

    
    metadata_local_nonprim = catalogs_hotel_product_metadata_parseFromJSON(metadata); //nonprimitive

    // catalogs_hotel_product->pin
    cJSON *pin = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_productJSON, "pin");
    if (!pin) {
        goto end;
    }

    
    pin_local_nonprim = pin_parseFromJSON(pin); //nonprimitive


    catalogs_hotel_product_local_var = catalogs_hotel_product_create (
        catalog_typeVariable,
        metadata_local_nonprim,
        pin_local_nonprim
        );

    return catalogs_hotel_product_local_var;
end:
    if (metadata_local_nonprim) {
        catalogs_hotel_product_metadata_free(metadata_local_nonprim);
        metadata_local_nonprim = NULL;
    }
    if (pin_local_nonprim) {
        pin_free(pin_local_nonprim);
        pin_local_nonprim = NULL;
    }
    return NULL;

}
