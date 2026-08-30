#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order.h"


char* order_order_ToString(pinterest_rest_api_order__e order) {
    char *orderArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return orderArray[order];
}

pinterest_rest_api_order__e order_order_FromString(char* order) {
    int stringToReturn = 0;
    char *orderArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    size_t sizeofArray = sizeof(orderArray) / sizeof(orderArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order, orderArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_convertToJSON(pinterest_rest_api_order__e order) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", order_order_ToString(order)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_order__e order_parseFromJSON(cJSON *orderJSON) {
    if(!cJSON_IsString(orderJSON) || (orderJSON->valuestring == NULL)) {
        return 0;
    }
    return order_order_FromString(orderJSON->valuestring);
}
