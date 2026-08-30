#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "adgroup_placement_group_type.h"


char* adgroup_placement_group_type_adgroup_placement_group_type_ToString(pinterest_rest_api_adgroup_placement_group_type__e adgroup_placement_group_type) {
    char *adgroup_placement_group_typeArray[] =  { "NULL", "ALL", "SEARCH", "BROWSE", "OTHER" };
    return adgroup_placement_group_typeArray[adgroup_placement_group_type];
}

pinterest_rest_api_adgroup_placement_group_type__e adgroup_placement_group_type_adgroup_placement_group_type_FromString(char* adgroup_placement_group_type) {
    int stringToReturn = 0;
    char *adgroup_placement_group_typeArray[] =  { "NULL", "ALL", "SEARCH", "BROWSE", "OTHER" };
    size_t sizeofArray = sizeof(adgroup_placement_group_typeArray) / sizeof(adgroup_placement_group_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(adgroup_placement_group_type, adgroup_placement_group_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *adgroup_placement_group_type_convertToJSON(pinterest_rest_api_adgroup_placement_group_type__e adgroup_placement_group_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "adgroup_placement_group_type", adgroup_placement_group_type_adgroup_placement_group_type_ToString(adgroup_placement_group_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_adgroup_placement_group_type__e adgroup_placement_group_type_parseFromJSON(cJSON *adgroup_placement_group_typeJSON) {
    if(!cJSON_IsString(adgroup_placement_group_typeJSON) || (adgroup_placement_group_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return adgroup_placement_group_type_adgroup_placement_group_type_FromString(adgroup_placement_group_typeJSON->valuestring);
}
