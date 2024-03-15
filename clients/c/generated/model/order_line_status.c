#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_line_status.h"


char* order_line_status_order_line_status_ToString(pinterest_rest_api_order_line_status__e order_line_status) {
    char *order_line_statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "DELETED" };
    return order_line_statusArray[order_line_status];
}

pinterest_rest_api_order_line_status__e order_line_status_order_line_status_FromString(char* order_line_status) {
    int stringToReturn = 0;
    char *order_line_statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "DELETED" };
    size_t sizeofArray = sizeof(order_line_statusArray) / sizeof(order_line_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_line_status, order_line_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_line_status_order_line_status_convertToJSON(pinterest_rest_api_order_line_status__e order_line_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_line_status", order_line_status_order_line_status_ToString(order_line_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_order_line_status__e order_line_status_order_line_status_parseFromJSON(cJSON *order_line_statusJSON) {
    pinterest_rest_api_order_line_status__e *order_line_status = NULL;
    pinterest_rest_api_order_line_status__e order_line_statusVariable;
    cJSON *order_line_statusVar = cJSON_GetObjectItemCaseSensitive(order_line_statusJSON, "order_line_status");
    if(!cJSON_IsString(order_line_statusVar) || (order_line_statusVar->valuestring == NULL)){
        goto end;
    }
    order_line_statusVariable = order_line_status_order_line_status_FromString(order_line_statusVar->valuestring);
    return order_line_statusVariable;
end:
    return 0;
}
