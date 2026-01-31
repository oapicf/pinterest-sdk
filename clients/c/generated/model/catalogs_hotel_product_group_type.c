#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_product_group_type.h"


char* catalogs_hotel_product_group_type_catalogs_hotel_product_group_type_ToString(pinterest_rest_api_catalogs_hotel_product_group_type__e catalogs_hotel_product_group_type) {
    char *catalogs_hotel_product_group_typeArray[] =  { "NULL", "MERCHANT_CREATED", "ALL_LISTINGS" };
    return catalogs_hotel_product_group_typeArray[catalogs_hotel_product_group_type];
}

pinterest_rest_api_catalogs_hotel_product_group_type__e catalogs_hotel_product_group_type_catalogs_hotel_product_group_type_FromString(char* catalogs_hotel_product_group_type) {
    int stringToReturn = 0;
    char *catalogs_hotel_product_group_typeArray[] =  { "NULL", "MERCHANT_CREATED", "ALL_LISTINGS" };
    size_t sizeofArray = sizeof(catalogs_hotel_product_group_typeArray) / sizeof(catalogs_hotel_product_group_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalogs_hotel_product_group_type, catalogs_hotel_product_group_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *catalogs_hotel_product_group_type_convertToJSON(pinterest_rest_api_catalogs_hotel_product_group_type__e catalogs_hotel_product_group_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "catalogs_hotel_product_group_type", catalogs_hotel_product_group_type_catalogs_hotel_product_group_type_ToString(catalogs_hotel_product_group_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_catalogs_hotel_product_group_type__e catalogs_hotel_product_group_type_parseFromJSON(cJSON *catalogs_hotel_product_group_typeJSON) {
    if(!cJSON_IsString(catalogs_hotel_product_group_typeJSON) || (catalogs_hotel_product_group_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return catalogs_hotel_product_group_type_catalogs_hotel_product_group_type_FromString(catalogs_hotel_product_group_typeJSON->valuestring);
}
