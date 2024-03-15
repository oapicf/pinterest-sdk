#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "non_nullable_product_availability_type.h"


char* non_nullable_product_availability_type_non_nullable_product_availability_type_ToString(pinterest_rest_api_non_nullable_product_availability_type__e non_nullable_product_availability_type) {
    char *non_nullable_product_availability_typeArray[] =  { "NULL", "IN_STOCK", "OUT_OF_STOCK", "PREORDER" };
    return non_nullable_product_availability_typeArray[non_nullable_product_availability_type];
}

pinterest_rest_api_non_nullable_product_availability_type__e non_nullable_product_availability_type_non_nullable_product_availability_type_FromString(char* non_nullable_product_availability_type) {
    int stringToReturn = 0;
    char *non_nullable_product_availability_typeArray[] =  { "NULL", "IN_STOCK", "OUT_OF_STOCK", "PREORDER" };
    size_t sizeofArray = sizeof(non_nullable_product_availability_typeArray) / sizeof(non_nullable_product_availability_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(non_nullable_product_availability_type, non_nullable_product_availability_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *non_nullable_product_availability_type_non_nullable_product_availability_type_convertToJSON(pinterest_rest_api_non_nullable_product_availability_type__e non_nullable_product_availability_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "non_nullable_product_availability_type", non_nullable_product_availability_type_non_nullable_product_availability_type_ToString(non_nullable_product_availability_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_non_nullable_product_availability_type__e non_nullable_product_availability_type_non_nullable_product_availability_type_parseFromJSON(cJSON *non_nullable_product_availability_typeJSON) {
    pinterest_rest_api_non_nullable_product_availability_type__e *non_nullable_product_availability_type = NULL;
    pinterest_rest_api_non_nullable_product_availability_type__e non_nullable_product_availability_typeVariable;
    cJSON *non_nullable_product_availability_typeVar = cJSON_GetObjectItemCaseSensitive(non_nullable_product_availability_typeJSON, "non_nullable_product_availability_type");
    if(!cJSON_IsString(non_nullable_product_availability_typeVar) || (non_nullable_product_availability_typeVar->valuestring == NULL)){
        goto end;
    }
    non_nullable_product_availability_typeVariable = non_nullable_product_availability_type_non_nullable_product_availability_type_FromString(non_nullable_product_availability_typeVar->valuestring);
    return non_nullable_product_availability_typeVariable;
end:
    return 0;
}
