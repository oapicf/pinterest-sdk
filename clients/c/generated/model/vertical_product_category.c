#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vertical_product_category.h"


char* vertical_product_category_vertical_product_category_ToString(pinterest_rest_api_vertical_product_category__e vertical_product_category) {
    char *vertical_product_categoryArray[] =  { "NULL", "FASHION", "HOME_DECOR", "BEAUTY" };
    return vertical_product_categoryArray[vertical_product_category];
}

pinterest_rest_api_vertical_product_category__e vertical_product_category_vertical_product_category_FromString(char* vertical_product_category) {
    int stringToReturn = 0;
    char *vertical_product_categoryArray[] =  { "NULL", "FASHION", "HOME_DECOR", "BEAUTY" };
    size_t sizeofArray = sizeof(vertical_product_categoryArray) / sizeof(vertical_product_categoryArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(vertical_product_category, vertical_product_categoryArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *vertical_product_category_convertToJSON(pinterest_rest_api_vertical_product_category__e vertical_product_category) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "vertical_product_category", vertical_product_category_vertical_product_category_ToString(vertical_product_category)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_vertical_product_category__e vertical_product_category_parseFromJSON(cJSON *vertical_product_categoryJSON) {
    if(!cJSON_IsString(vertical_product_categoryJSON) || (vertical_product_categoryJSON->valuestring == NULL)) {
        return 0;
    }
    return vertical_product_category_vertical_product_category_FromString(vertical_product_categoryJSON->valuestring);
}
