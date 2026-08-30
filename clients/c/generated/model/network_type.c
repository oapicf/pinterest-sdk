#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "network_type.h"


char* network_type_network_type_ToString(pinterest_rest_api_network_type__e network_type) {
    char *network_typeArray[] =  { "NULL", "wifi", "cellular_2g", "cellular_3g", "cellular_4g", "cellular_5g", "cellular_6g", "ethernet", "unknown" };
    return network_typeArray[network_type];
}

pinterest_rest_api_network_type__e network_type_network_type_FromString(char* network_type) {
    int stringToReturn = 0;
    char *network_typeArray[] =  { "NULL", "wifi", "cellular_2g", "cellular_3g", "cellular_4g", "cellular_5g", "cellular_6g", "ethernet", "unknown" };
    size_t sizeofArray = sizeof(network_typeArray) / sizeof(network_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(network_type, network_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *network_type_convertToJSON(pinterest_rest_api_network_type__e network_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "network_type", network_type_network_type_ToString(network_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_network_type__e network_type_parseFromJSON(cJSON *network_typeJSON) {
    if(!cJSON_IsString(network_typeJSON) || (network_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return network_type_network_type_FromString(network_typeJSON->valuestring);
}
