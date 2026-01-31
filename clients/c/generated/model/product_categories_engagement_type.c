#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_categories_engagement_type.h"


char* product_categories_engagement_type_product_categories_engagement_type_ToString(pinterest_rest_api_product_categories_engagement_type__e product_categories_engagement_type) {
    char *product_categories_engagement_typeArray[] =  { "NULL", "ENGAGEMENT", "OUTBOUND_CLICK", "SAVE" };
    return product_categories_engagement_typeArray[product_categories_engagement_type];
}

pinterest_rest_api_product_categories_engagement_type__e product_categories_engagement_type_product_categories_engagement_type_FromString(char* product_categories_engagement_type) {
    int stringToReturn = 0;
    char *product_categories_engagement_typeArray[] =  { "NULL", "ENGAGEMENT", "OUTBOUND_CLICK", "SAVE" };
    size_t sizeofArray = sizeof(product_categories_engagement_typeArray) / sizeof(product_categories_engagement_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(product_categories_engagement_type, product_categories_engagement_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *product_categories_engagement_type_convertToJSON(pinterest_rest_api_product_categories_engagement_type__e product_categories_engagement_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "product_categories_engagement_type", product_categories_engagement_type_product_categories_engagement_type_ToString(product_categories_engagement_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_product_categories_engagement_type__e product_categories_engagement_type_parseFromJSON(cJSON *product_categories_engagement_typeJSON) {
    if(!cJSON_IsString(product_categories_engagement_typeJSON) || (product_categories_engagement_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return product_categories_engagement_type_product_categories_engagement_type_FromString(product_categories_engagement_typeJSON->valuestring);
}
