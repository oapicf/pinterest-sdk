#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pinterest_lib_pagination_order.h"


char* pinterest_lib_pagination_order_pinterest_lib_pagination_order_ToString(pinterest_rest_api_pinterest_lib_pagination_order__e pinterest_lib_pagination_order) {
    char *pinterest_lib_pagination_orderArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return pinterest_lib_pagination_orderArray[pinterest_lib_pagination_order];
}

pinterest_rest_api_pinterest_lib_pagination_order__e pinterest_lib_pagination_order_pinterest_lib_pagination_order_FromString(char* pinterest_lib_pagination_order) {
    int stringToReturn = 0;
    char *pinterest_lib_pagination_orderArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    size_t sizeofArray = sizeof(pinterest_lib_pagination_orderArray) / sizeof(pinterest_lib_pagination_orderArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(pinterest_lib_pagination_order, pinterest_lib_pagination_orderArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *pinterest_lib_pagination_order_convertToJSON(pinterest_rest_api_pinterest_lib_pagination_order__e pinterest_lib_pagination_order) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "pinterest_lib_pagination_order", pinterest_lib_pagination_order_pinterest_lib_pagination_order_ToString(pinterest_lib_pagination_order)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_pinterest_lib_pagination_order__e pinterest_lib_pagination_order_parseFromJSON(cJSON *pinterest_lib_pagination_orderJSON) {
    if(!cJSON_IsString(pinterest_lib_pagination_orderJSON) || (pinterest_lib_pagination_orderJSON->valuestring == NULL)) {
        return 0;
    }
    return pinterest_lib_pagination_order_pinterest_lib_pagination_order_FromString(pinterest_lib_pagination_orderJSON->valuestring);
}
