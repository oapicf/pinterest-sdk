#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_advertiser_country.h"


char* targeting_advertiser_country_targeting_advertiser_country_ToString(pinterest_rest_api_targeting_advertiser_country__e targeting_advertiser_country) {
    char *targeting_advertiser_countryArray[] =  { "NULL", "US", "GB", "CA", "IE", "AU", "NZ", "FR", "SE", "IL", "DE", "AT", "IT", "ES", "NL", "BE", "PT", "CH", "HK", "JP", "KR", "SG", "NO", "DK", "FI", "CY", "LU", "MT", "PL", "RO", "HU", "CZ", "GR", "SK", "BR", "MX", "AR", "CL", "CO" };
    return targeting_advertiser_countryArray[targeting_advertiser_country];
}

pinterest_rest_api_targeting_advertiser_country__e targeting_advertiser_country_targeting_advertiser_country_FromString(char* targeting_advertiser_country) {
    int stringToReturn = 0;
    char *targeting_advertiser_countryArray[] =  { "NULL", "US", "GB", "CA", "IE", "AU", "NZ", "FR", "SE", "IL", "DE", "AT", "IT", "ES", "NL", "BE", "PT", "CH", "HK", "JP", "KR", "SG", "NO", "DK", "FI", "CY", "LU", "MT", "PL", "RO", "HU", "CZ", "GR", "SK", "BR", "MX", "AR", "CL", "CO" };
    size_t sizeofArray = sizeof(targeting_advertiser_countryArray) / sizeof(targeting_advertiser_countryArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_advertiser_country, targeting_advertiser_countryArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *targeting_advertiser_country_targeting_advertiser_country_convertToJSON(pinterest_rest_api_targeting_advertiser_country__e targeting_advertiser_country) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "targeting_advertiser_country", targeting_advertiser_country_targeting_advertiser_country_ToString(targeting_advertiser_country)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_targeting_advertiser_country__e targeting_advertiser_country_targeting_advertiser_country_parseFromJSON(cJSON *targeting_advertiser_countryJSON) {
    pinterest_rest_api_targeting_advertiser_country__e *targeting_advertiser_country = NULL;
    pinterest_rest_api_targeting_advertiser_country__e targeting_advertiser_countryVariable;
    cJSON *targeting_advertiser_countryVar = cJSON_GetObjectItemCaseSensitive(targeting_advertiser_countryJSON, "targeting_advertiser_country");
    if(!cJSON_IsString(targeting_advertiser_countryVar) || (targeting_advertiser_countryVar->valuestring == NULL)){
        goto end;
    }
    targeting_advertiser_countryVariable = targeting_advertiser_country_targeting_advertiser_country_FromString(targeting_advertiser_countryVar->valuestring);
    return targeting_advertiser_countryVariable;
end:
    return 0;
}
