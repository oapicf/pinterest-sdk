#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_availability.h"


char* product_availability_product_availability_ToString(pinterest_rest_api_product_availability__e product_availability) {
    char *product_availabilityArray[] =  { "NULL", "IN_STOCK", "OUT_OF_STOCK", "PREORDER" };
    return product_availabilityArray[product_availability];
}

pinterest_rest_api_product_availability__e product_availability_product_availability_FromString(char* product_availability) {
    int stringToReturn = 0;
    char *product_availabilityArray[] =  { "NULL", "IN_STOCK", "OUT_OF_STOCK", "PREORDER" };
    size_t sizeofArray = sizeof(product_availabilityArray) / sizeof(product_availabilityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(product_availability, product_availabilityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *product_availability_convertToJSON(pinterest_rest_api_product_availability__e product_availability) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "product_availability", product_availability_product_availability_ToString(product_availability)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_product_availability__e product_availability_parseFromJSON(cJSON *product_availabilityJSON) {
    if(!cJSON_IsString(product_availabilityJSON) || (product_availabilityJSON->valuestring == NULL)) {
        return 0;
    }
    return product_availability_product_availability_FromString(product_availabilityJSON->valuestring);
}
