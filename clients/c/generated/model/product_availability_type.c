#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_availability_type.h"


char* product_availability_type_product_availability_type_ToString(pinterest_rest_api_product_availability_type__e product_availability_type) {
    char *product_availability_typeArray[] =  { "NULL", "IN_STOCK", "OUT_OF_STOCK", "PREORDER", "" };
    return product_availability_typeArray[product_availability_type];
}

pinterest_rest_api_product_availability_type__e product_availability_type_product_availability_type_FromString(char* product_availability_type) {
    int stringToReturn = 0;
    char *product_availability_typeArray[] =  { "NULL", "IN_STOCK", "OUT_OF_STOCK", "PREORDER", "" };
    size_t sizeofArray = sizeof(product_availability_typeArray) / sizeof(product_availability_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(product_availability_type, product_availability_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *product_availability_type_product_availability_type_convertToJSON(pinterest_rest_api_product_availability_type__e product_availability_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "product_availability_type", product_availability_type_product_availability_type_ToString(product_availability_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_product_availability_type__e product_availability_type_product_availability_type_parseFromJSON(cJSON *product_availability_typeJSON) {
    pinterest_rest_api_product_availability_type__e *product_availability_type = NULL;
    pinterest_rest_api_product_availability_type__e product_availability_typeVariable;
    cJSON *product_availability_typeVar = cJSON_GetObjectItemCaseSensitive(product_availability_typeJSON, "product_availability_type");
    if(!cJSON_IsString(product_availability_typeVar) || (product_availability_typeVar->valuestring == NULL)){
        goto end;
    }
    product_availability_typeVariable = product_availability_type_product_availability_type_FromString(product_availability_typeVar->valuestring);
    return product_availability_typeVariable;
end:
    return 0;
}
