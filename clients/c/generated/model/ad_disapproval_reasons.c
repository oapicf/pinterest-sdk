#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_disapproval_reasons.h"


char* ad_disapproval_reasons_ad_disapproval_reasons_ToString(pinterest_rest_api_ad_disapproval_reasons__e ad_disapproval_reasons) {
    char *ad_disapproval_reasonsArray[] =  { "NULL", "HASHTAGS", "PROMOTIONS_AND_PRICES", "TARGETING", "LANDING_PAGE", "CAPS_AND_SYMBOLS", "SHOCKING", "WEIGHT_LOSS", "PROHIBITED_PRODUCT", "AUTHENTICITY", "NUDITY", "CONFUSING_DESIGN", "URGENCY", "RATINGS", "APP", "ALCOHOL", "CONTESTS", "POLITICAL", "OTHER", "IMAGE", "NAR", "INCONSISTENT", "CLICKBAIT", "NO_DESCRIPTION", "LOW_QUALITY", "EXAGGERATED_CLAIMS", "PINTEREST_BRAND", "ALCOHOL_NO_SALE", "LANDING_PAGE_SPEED", "LANDING_PAGE_HARDWALL", "LANDING_PAGE_BROKEN", "LANDING_PAGE_QUALITY", "OUT_OF_STOCK", "IMAGE_LOW_QUALITY", "IMAGE_BUSY", "IMAGE_POORLY_EDITED", "IMAGE_BEFORE_AFTER", "UGC", "FAKE_BUTTONS", "WEAPONS", "SENSITIVE", "UNACCEPTABLE_BUSINESS", "SUSPICIOUS_CLAIMS", "PHARMA", "SUSPICIOUS_SUPPLEMENTS", "ILLEGAL_RECREATIONAL_DRUG", "LOW_QUALITY_LANDING_PAGE", "RESTRICTED_HEALTHCARE", "INCONSISTENT_LANG_FR" };
    return ad_disapproval_reasonsArray[ad_disapproval_reasons];
}

pinterest_rest_api_ad_disapproval_reasons__e ad_disapproval_reasons_ad_disapproval_reasons_FromString(char* ad_disapproval_reasons) {
    int stringToReturn = 0;
    char *ad_disapproval_reasonsArray[] =  { "NULL", "HASHTAGS", "PROMOTIONS_AND_PRICES", "TARGETING", "LANDING_PAGE", "CAPS_AND_SYMBOLS", "SHOCKING", "WEIGHT_LOSS", "PROHIBITED_PRODUCT", "AUTHENTICITY", "NUDITY", "CONFUSING_DESIGN", "URGENCY", "RATINGS", "APP", "ALCOHOL", "CONTESTS", "POLITICAL", "OTHER", "IMAGE", "NAR", "INCONSISTENT", "CLICKBAIT", "NO_DESCRIPTION", "LOW_QUALITY", "EXAGGERATED_CLAIMS", "PINTEREST_BRAND", "ALCOHOL_NO_SALE", "LANDING_PAGE_SPEED", "LANDING_PAGE_HARDWALL", "LANDING_PAGE_BROKEN", "LANDING_PAGE_QUALITY", "OUT_OF_STOCK", "IMAGE_LOW_QUALITY", "IMAGE_BUSY", "IMAGE_POORLY_EDITED", "IMAGE_BEFORE_AFTER", "UGC", "FAKE_BUTTONS", "WEAPONS", "SENSITIVE", "UNACCEPTABLE_BUSINESS", "SUSPICIOUS_CLAIMS", "PHARMA", "SUSPICIOUS_SUPPLEMENTS", "ILLEGAL_RECREATIONAL_DRUG", "LOW_QUALITY_LANDING_PAGE", "RESTRICTED_HEALTHCARE", "INCONSISTENT_LANG_FR" };
    size_t sizeofArray = sizeof(ad_disapproval_reasonsArray) / sizeof(ad_disapproval_reasonsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ad_disapproval_reasons, ad_disapproval_reasonsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ad_disapproval_reasons_convertToJSON(pinterest_rest_api_ad_disapproval_reasons__e ad_disapproval_reasons) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ad_disapproval_reasons", ad_disapproval_reasons_ad_disapproval_reasons_ToString(ad_disapproval_reasons)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ad_disapproval_reasons__e ad_disapproval_reasons_parseFromJSON(cJSON *ad_disapproval_reasonsJSON) {
    if(!cJSON_IsString(ad_disapproval_reasonsJSON) || (ad_disapproval_reasonsJSON->valuestring == NULL)) {
        return 0;
    }
    return ad_disapproval_reasons_ad_disapproval_reasons_FromString(ad_disapproval_reasonsJSON->valuestring);
}
