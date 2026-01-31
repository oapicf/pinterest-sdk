#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_category_region.h"


char* product_category_region_product_category_region_ToString(pinterest_rest_api_product_category_region__e product_category_region) {
    char *product_category_regionArray[] =  { "NULL", "US", "GB+IE", "CA" };
    return product_category_regionArray[product_category_region];
}

pinterest_rest_api_product_category_region__e product_category_region_product_category_region_FromString(char* product_category_region) {
    int stringToReturn = 0;
    char *product_category_regionArray[] =  { "NULL", "US", "GB+IE", "CA" };
    size_t sizeofArray = sizeof(product_category_regionArray) / sizeof(product_category_regionArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(product_category_region, product_category_regionArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *product_category_region_convertToJSON(pinterest_rest_api_product_category_region__e product_category_region) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "product_category_region", product_category_region_product_category_region_ToString(product_category_region)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_product_category_region__e product_category_region_parseFromJSON(cJSON *product_category_regionJSON) {
    if(!cJSON_IsString(product_category_regionJSON) || (product_category_regionJSON->valuestring == NULL)) {
        return 0;
    }
    return product_category_region_product_category_region_FromString(product_category_regionJSON->valuestring);
}
