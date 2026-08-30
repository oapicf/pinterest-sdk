#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_entity_type.h"


char* ad_account_entity_type_ad_account_entity_type_ToString(pinterest_rest_api_ad_account_entity_type__e ad_account_entity_type) {
    char *ad_account_entity_typeArray[] =  { "NULL", "ADVERTISER", "CAMPAIGN", "AD_GROUP", "AD" };
    return ad_account_entity_typeArray[ad_account_entity_type];
}

pinterest_rest_api_ad_account_entity_type__e ad_account_entity_type_ad_account_entity_type_FromString(char* ad_account_entity_type) {
    int stringToReturn = 0;
    char *ad_account_entity_typeArray[] =  { "NULL", "ADVERTISER", "CAMPAIGN", "AD_GROUP", "AD" };
    size_t sizeofArray = sizeof(ad_account_entity_typeArray) / sizeof(ad_account_entity_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ad_account_entity_type, ad_account_entity_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ad_account_entity_type_convertToJSON(pinterest_rest_api_ad_account_entity_type__e ad_account_entity_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ad_account_entity_type", ad_account_entity_type_ad_account_entity_type_ToString(ad_account_entity_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ad_account_entity_type__e ad_account_entity_type_parseFromJSON(cJSON *ad_account_entity_typeJSON) {
    if(!cJSON_IsString(ad_account_entity_typeJSON) || (ad_account_entity_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return ad_account_entity_type_ad_account_entity_type_FromString(ad_account_entity_typeJSON->valuestring);
}
