#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_type.h"


char* catalogs_product_group_type_catalogs_product_group_type_ToString(pinterest_rest_api_catalogs_product_group_type__e catalogs_product_group_type) {
    char *catalogs_product_group_typeArray[] =  { "NULL", "MERCHANT_CREATED", "ALL_PRODUCTS", "BEST_DEALS", "PINNER_FAVORITES", "TOP_SELLERS", "BACK_IN_STOCK", "NEW_ARRIVALS", "SHOPIFY_COLLECTIONS", "I2PC" };
    return catalogs_product_group_typeArray[catalogs_product_group_type];
}

pinterest_rest_api_catalogs_product_group_type__e catalogs_product_group_type_catalogs_product_group_type_FromString(char* catalogs_product_group_type) {
    int stringToReturn = 0;
    char *catalogs_product_group_typeArray[] =  { "NULL", "MERCHANT_CREATED", "ALL_PRODUCTS", "BEST_DEALS", "PINNER_FAVORITES", "TOP_SELLERS", "BACK_IN_STOCK", "NEW_ARRIVALS", "SHOPIFY_COLLECTIONS", "I2PC" };
    size_t sizeofArray = sizeof(catalogs_product_group_typeArray) / sizeof(catalogs_product_group_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalogs_product_group_type, catalogs_product_group_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *catalogs_product_group_type_catalogs_product_group_type_convertToJSON(pinterest_rest_api_catalogs_product_group_type__e catalogs_product_group_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "catalogs_product_group_type", catalogs_product_group_type_catalogs_product_group_type_ToString(catalogs_product_group_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_catalogs_product_group_type__e catalogs_product_group_type_catalogs_product_group_type_parseFromJSON(cJSON *catalogs_product_group_typeJSON) {
    pinterest_rest_api_catalogs_product_group_type__e *catalogs_product_group_type = NULL;
    pinterest_rest_api_catalogs_product_group_type__e catalogs_product_group_typeVariable;
    cJSON *catalogs_product_group_typeVar = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_typeJSON, "catalogs_product_group_type");
    if(!cJSON_IsString(catalogs_product_group_typeVar) || (catalogs_product_group_typeVar->valuestring == NULL)){
        goto end;
    }
    catalogs_product_group_typeVariable = catalogs_product_group_type_catalogs_product_group_type_FromString(catalogs_product_group_typeVar->valuestring);
    return catalogs_product_group_typeVariable;
end:
    return 0;
}
