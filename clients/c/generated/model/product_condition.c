#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_condition.h"


char* product_condition_product_condition_ToString(pinterest_rest_api_product_condition__e product_condition) {
    char *product_conditionArray[] =  { "NULL", "NEW", "USED", "REFURBISHED" };
    return product_conditionArray[product_condition];
}

pinterest_rest_api_product_condition__e product_condition_product_condition_FromString(char* product_condition) {
    int stringToReturn = 0;
    char *product_conditionArray[] =  { "NULL", "NEW", "USED", "REFURBISHED" };
    size_t sizeofArray = sizeof(product_conditionArray) / sizeof(product_conditionArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(product_condition, product_conditionArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *product_condition_convertToJSON(pinterest_rest_api_product_condition__e product_condition) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "product_condition", product_condition_product_condition_ToString(product_condition)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_product_condition__e product_condition_parseFromJSON(cJSON *product_conditionJSON) {
    if(!cJSON_IsString(product_conditionJSON) || (product_conditionJSON->valuestring == NULL)) {
        return 0;
    }
    return product_condition_product_condition_FromString(product_conditionJSON->valuestring);
}
