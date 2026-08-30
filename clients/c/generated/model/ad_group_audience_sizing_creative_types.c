#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_audience_sizing_creative_types.h"


char* ad_group_audience_sizing_creative_types_ad_group_audience_sizing_creative_types_ToString(pinterest_rest_api_ad_group_audience_sizing_creative_types__e ad_group_audience_sizing_creative_types) {
    char *ad_group_audience_sizing_creative_typesArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA" };
    return ad_group_audience_sizing_creative_typesArray[ad_group_audience_sizing_creative_types];
}

pinterest_rest_api_ad_group_audience_sizing_creative_types__e ad_group_audience_sizing_creative_types_ad_group_audience_sizing_creative_types_FromString(char* ad_group_audience_sizing_creative_types) {
    int stringToReturn = 0;
    char *ad_group_audience_sizing_creative_typesArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA" };
    size_t sizeofArray = sizeof(ad_group_audience_sizing_creative_typesArray) / sizeof(ad_group_audience_sizing_creative_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ad_group_audience_sizing_creative_types, ad_group_audience_sizing_creative_typesArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ad_group_audience_sizing_creative_types_convertToJSON(pinterest_rest_api_ad_group_audience_sizing_creative_types__e ad_group_audience_sizing_creative_types) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ad_group_audience_sizing_creative_types", ad_group_audience_sizing_creative_types_ad_group_audience_sizing_creative_types_ToString(ad_group_audience_sizing_creative_types)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ad_group_audience_sizing_creative_types__e ad_group_audience_sizing_creative_types_parseFromJSON(cJSON *ad_group_audience_sizing_creative_typesJSON) {
    if(!cJSON_IsString(ad_group_audience_sizing_creative_typesJSON) || (ad_group_audience_sizing_creative_typesJSON->valuestring == NULL)) {
        return 0;
    }
    return ad_group_audience_sizing_creative_types_ad_group_audience_sizing_creative_types_FromString(ad_group_audience_sizing_creative_typesJSON->valuestring);
}
