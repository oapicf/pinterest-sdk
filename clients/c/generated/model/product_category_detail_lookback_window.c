#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_category_detail_lookback_window.h"


char* product_category_detail_lookback_window_product_category_detail_lookback_window_ToString(pinterest_rest_api_product_category_detail_lookback_window__e product_category_detail_lookback_window) {
    char *product_category_detail_lookback_windowArray[] =  { "NULL", "90", "180", "365", "730" };
    return product_category_detail_lookback_windowArray[product_category_detail_lookback_window];
}

pinterest_rest_api_product_category_detail_lookback_window__e product_category_detail_lookback_window_product_category_detail_lookback_window_FromString(char* product_category_detail_lookback_window) {
    int stringToReturn = 0;
    char *product_category_detail_lookback_windowArray[] =  { "NULL", "90", "180", "365", "730" };
    size_t sizeofArray = sizeof(product_category_detail_lookback_windowArray) / sizeof(product_category_detail_lookback_windowArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(product_category_detail_lookback_window, product_category_detail_lookback_windowArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *product_category_detail_lookback_window_convertToJSON(pinterest_rest_api_product_category_detail_lookback_window__e product_category_detail_lookback_window) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddNumberToObject(item, "product_category_detail_lookback_window", product_category_detail_lookback_window) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_product_category_detail_lookback_window__e product_category_detail_lookback_window_parseFromJSON(cJSON *product_category_detail_lookback_windowJSON) {
    if(!cJSON_IsNumber(product_category_detail_lookback_windowJSON)) {
        return 0;
    }
    return product_category_detail_lookback_windowJSON->valueint;
}
