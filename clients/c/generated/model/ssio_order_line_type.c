#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_order_line_type.h"


char* ssio_order_line_type_ssio_order_line_type_ToString(pinterest_rest_api_ssio_order_line_type__e ssio_order_line_type) {
    char *ssio_order_line_typeArray[] =  { "NULL", "BUDGET", "PERPETUALS" };
    return ssio_order_line_typeArray[ssio_order_line_type];
}

pinterest_rest_api_ssio_order_line_type__e ssio_order_line_type_ssio_order_line_type_FromString(char* ssio_order_line_type) {
    int stringToReturn = 0;
    char *ssio_order_line_typeArray[] =  { "NULL", "BUDGET", "PERPETUALS" };
    size_t sizeofArray = sizeof(ssio_order_line_typeArray) / sizeof(ssio_order_line_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ssio_order_line_type, ssio_order_line_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ssio_order_line_type_convertToJSON(pinterest_rest_api_ssio_order_line_type__e ssio_order_line_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ssio_order_line_type", ssio_order_line_type_ssio_order_line_type_ToString(ssio_order_line_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ssio_order_line_type__e ssio_order_line_type_parseFromJSON(cJSON *ssio_order_line_typeJSON) {
    if(!cJSON_IsString(ssio_order_line_typeJSON) || (ssio_order_line_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return ssio_order_line_type_ssio_order_line_type_FromString(ssio_order_line_typeJSON->valuestring);
}
