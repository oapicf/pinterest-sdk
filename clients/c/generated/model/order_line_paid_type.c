#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_line_paid_type.h"


char* order_line_paid_type_order_line_paid_type_ToString(pinterest_rest_api_order_line_paid_type__e order_line_paid_type) {
    char *order_line_paid_typeArray[] =  { "NULL", "PAID", "BONUS", "MAKE_GOOD", "TEST", "" };
    return order_line_paid_typeArray[order_line_paid_type];
}

pinterest_rest_api_order_line_paid_type__e order_line_paid_type_order_line_paid_type_FromString(char* order_line_paid_type) {
    int stringToReturn = 0;
    char *order_line_paid_typeArray[] =  { "NULL", "PAID", "BONUS", "MAKE_GOOD", "TEST", "" };
    size_t sizeofArray = sizeof(order_line_paid_typeArray) / sizeof(order_line_paid_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_line_paid_type, order_line_paid_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_line_paid_type_convertToJSON(pinterest_rest_api_order_line_paid_type__e order_line_paid_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_line_paid_type", order_line_paid_type_order_line_paid_type_ToString(order_line_paid_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_order_line_paid_type__e order_line_paid_type_parseFromJSON(cJSON *order_line_paid_typeJSON) {
    if(!cJSON_IsString(order_line_paid_typeJSON) || (order_line_paid_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return order_line_paid_type_order_line_paid_type_FromString(order_line_paid_typeJSON->valuestring);
}
