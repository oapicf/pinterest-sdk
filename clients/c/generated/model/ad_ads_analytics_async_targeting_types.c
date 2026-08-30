#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_ads_analytics_async_targeting_types.h"


char* ad_ads_analytics_async_targeting_types_ad_ads_analytics_async_targeting_types_ToString(pinterest_rest_api_ad_ads_analytics_async_targeting_types__e ad_ads_analytics_async_targeting_types) {
    char *ad_ads_analytics_async_targeting_typesArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION", "MEDIA_TYPE", "AGE_BUCKET_AND_GENDER", "AUDIENCE_MULTIPLIER", "CREATIVE_ENHANCEMENTS", "LOCAL_ADS_STORE_CODE" };
    return ad_ads_analytics_async_targeting_typesArray[ad_ads_analytics_async_targeting_types];
}

pinterest_rest_api_ad_ads_analytics_async_targeting_types__e ad_ads_analytics_async_targeting_types_ad_ads_analytics_async_targeting_types_FromString(char* ad_ads_analytics_async_targeting_types) {
    int stringToReturn = 0;
    char *ad_ads_analytics_async_targeting_typesArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION", "MEDIA_TYPE", "AGE_BUCKET_AND_GENDER", "AUDIENCE_MULTIPLIER", "CREATIVE_ENHANCEMENTS", "LOCAL_ADS_STORE_CODE" };
    size_t sizeofArray = sizeof(ad_ads_analytics_async_targeting_typesArray) / sizeof(ad_ads_analytics_async_targeting_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ad_ads_analytics_async_targeting_types, ad_ads_analytics_async_targeting_typesArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ad_ads_analytics_async_targeting_types_convertToJSON(pinterest_rest_api_ad_ads_analytics_async_targeting_types__e ad_ads_analytics_async_targeting_types) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ad_ads_analytics_async_targeting_types", ad_ads_analytics_async_targeting_types_ad_ads_analytics_async_targeting_types_ToString(ad_ads_analytics_async_targeting_types)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ad_ads_analytics_async_targeting_types__e ad_ads_analytics_async_targeting_types_parseFromJSON(cJSON *ad_ads_analytics_async_targeting_typesJSON) {
    if(!cJSON_IsString(ad_ads_analytics_async_targeting_typesJSON) || (ad_ads_analytics_async_targeting_typesJSON->valuestring == NULL)) {
        return 0;
    }
    return ad_ads_analytics_async_targeting_types_ad_ads_analytics_async_targeting_types_FromString(ad_ads_analytics_async_targeting_typesJSON->valuestring);
}
