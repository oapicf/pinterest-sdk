#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "adgroup_tracking_feature_type.h"


char* adgroup_tracking_feature_type_adgroup_tracking_feature_type_ToString(pinterest_rest_api_adgroup_tracking_feature_type__e adgroup_tracking_feature_type) {
    char *adgroup_tracking_feature_typeArray[] =  { "NULL", "TRENDS", "CLONE_META", "BULK_EDITOR", "AD_ROTATION" };
    return adgroup_tracking_feature_typeArray[adgroup_tracking_feature_type];
}

pinterest_rest_api_adgroup_tracking_feature_type__e adgroup_tracking_feature_type_adgroup_tracking_feature_type_FromString(char* adgroup_tracking_feature_type) {
    int stringToReturn = 0;
    char *adgroup_tracking_feature_typeArray[] =  { "NULL", "TRENDS", "CLONE_META", "BULK_EDITOR", "AD_ROTATION" };
    size_t sizeofArray = sizeof(adgroup_tracking_feature_typeArray) / sizeof(adgroup_tracking_feature_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(adgroup_tracking_feature_type, adgroup_tracking_feature_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *adgroup_tracking_feature_type_convertToJSON(pinterest_rest_api_adgroup_tracking_feature_type__e adgroup_tracking_feature_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "adgroup_tracking_feature_type", adgroup_tracking_feature_type_adgroup_tracking_feature_type_ToString(adgroup_tracking_feature_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_adgroup_tracking_feature_type__e adgroup_tracking_feature_type_parseFromJSON(cJSON *adgroup_tracking_feature_typeJSON) {
    if(!cJSON_IsString(adgroup_tracking_feature_typeJSON) || (adgroup_tracking_feature_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return adgroup_tracking_feature_type_adgroup_tracking_feature_type_FromString(adgroup_tracking_feature_typeJSON->valuestring);
}
