#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delivery_estimate_objective_type.h"


char* delivery_estimate_objective_type_delivery_estimate_objective_type_ToString(pinterest_rest_api_delivery_estimate_objective_type__e delivery_estimate_objective_type) {
    char *delivery_estimate_objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "CATALOG_SALES", "WEB_CONVERSION" };
    return delivery_estimate_objective_typeArray[delivery_estimate_objective_type];
}

pinterest_rest_api_delivery_estimate_objective_type__e delivery_estimate_objective_type_delivery_estimate_objective_type_FromString(char* delivery_estimate_objective_type) {
    int stringToReturn = 0;
    char *delivery_estimate_objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "CATALOG_SALES", "WEB_CONVERSION" };
    size_t sizeofArray = sizeof(delivery_estimate_objective_typeArray) / sizeof(delivery_estimate_objective_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(delivery_estimate_objective_type, delivery_estimate_objective_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *delivery_estimate_objective_type_convertToJSON(pinterest_rest_api_delivery_estimate_objective_type__e delivery_estimate_objective_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "delivery_estimate_objective_type", delivery_estimate_objective_type_delivery_estimate_objective_type_ToString(delivery_estimate_objective_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_delivery_estimate_objective_type__e delivery_estimate_objective_type_parseFromJSON(cJSON *delivery_estimate_objective_typeJSON) {
    if(!cJSON_IsString(delivery_estimate_objective_typeJSON) || (delivery_estimate_objective_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return delivery_estimate_objective_type_delivery_estimate_objective_type_FromString(delivery_estimate_objective_typeJSON->valuestring);
}
