#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_analytics_targeting_type.h"


char* ads_analytics_targeting_type_ads_analytics_targeting_type_ToString(pinterest_rest_api_ads_analytics_targeting_type__e ads_analytics_targeting_type) {
    char *ads_analytics_targeting_typeArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION" };
    return ads_analytics_targeting_typeArray[ads_analytics_targeting_type];
}

pinterest_rest_api_ads_analytics_targeting_type__e ads_analytics_targeting_type_ads_analytics_targeting_type_FromString(char* ads_analytics_targeting_type) {
    int stringToReturn = 0;
    char *ads_analytics_targeting_typeArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION" };
    size_t sizeofArray = sizeof(ads_analytics_targeting_typeArray) / sizeof(ads_analytics_targeting_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ads_analytics_targeting_type, ads_analytics_targeting_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ads_analytics_targeting_type_ads_analytics_targeting_type_convertToJSON(pinterest_rest_api_ads_analytics_targeting_type__e ads_analytics_targeting_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ads_analytics_targeting_type", ads_analytics_targeting_type_ads_analytics_targeting_type_ToString(ads_analytics_targeting_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ads_analytics_targeting_type__e ads_analytics_targeting_type_ads_analytics_targeting_type_parseFromJSON(cJSON *ads_analytics_targeting_typeJSON) {
    pinterest_rest_api_ads_analytics_targeting_type__e *ads_analytics_targeting_type = NULL;
    pinterest_rest_api_ads_analytics_targeting_type__e ads_analytics_targeting_typeVariable;
    cJSON *ads_analytics_targeting_typeVar = cJSON_GetObjectItemCaseSensitive(ads_analytics_targeting_typeJSON, "ads_analytics_targeting_type");
    if(!cJSON_IsString(ads_analytics_targeting_typeVar) || (ads_analytics_targeting_typeVar->valuestring == NULL)){
        goto end;
    }
    ads_analytics_targeting_typeVariable = ads_analytics_targeting_type_ads_analytics_targeting_type_FromString(ads_analytics_targeting_typeVar->valuestring);
    return ads_analytics_targeting_typeVariable;
end:
    return 0;
}
