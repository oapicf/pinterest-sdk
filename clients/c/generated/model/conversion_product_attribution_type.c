#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_product_attribution_type.h"


char* conversion_product_attribution_type_conversion_product_attribution_type_ToString(pinterest_rest_api_conversion_product_attribution_type__e conversion_product_attribution_type) {
    char *conversion_product_attribution_typeArray[] =  { "NULL", "DEFAULT", "BRAND_ATTRIBUTION" };
    return conversion_product_attribution_typeArray[conversion_product_attribution_type];
}

pinterest_rest_api_conversion_product_attribution_type__e conversion_product_attribution_type_conversion_product_attribution_type_FromString(char* conversion_product_attribution_type) {
    int stringToReturn = 0;
    char *conversion_product_attribution_typeArray[] =  { "NULL", "DEFAULT", "BRAND_ATTRIBUTION" };
    size_t sizeofArray = sizeof(conversion_product_attribution_typeArray) / sizeof(conversion_product_attribution_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_product_attribution_type, conversion_product_attribution_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_product_attribution_type_convertToJSON(pinterest_rest_api_conversion_product_attribution_type__e conversion_product_attribution_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_product_attribution_type", conversion_product_attribution_type_conversion_product_attribution_type_ToString(conversion_product_attribution_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_product_attribution_type__e conversion_product_attribution_type_parseFromJSON(cJSON *conversion_product_attribution_typeJSON) {
    if(!cJSON_IsString(conversion_product_attribution_typeJSON) || (conversion_product_attribution_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return conversion_product_attribution_type_conversion_product_attribution_type_FromString(conversion_product_attribution_typeJSON->valuestring);
}
